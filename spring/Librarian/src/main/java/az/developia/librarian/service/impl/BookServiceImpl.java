package az.developia.librarian.service.impl;

import az.developia.librarian.dto.request.BookRequest;
import az.developia.librarian.dto.response.BookResponse;
import az.developia.librarian.dto.response.LibrarianResponse;
import az.developia.librarian.entity.Book;
import az.developia.librarian.exeption.CustomException;
import az.developia.librarian.mapper.BookMapper;
import az.developia.librarian.repository.BookRepository;
import az.developia.librarian.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final ModelMapper modelMapper;
    @Autowired
    private BookRepository bookRepository;

    private BookMapper mapper;

    // Register a new book
    public ResponseEntity<BookResponse> registerBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setAuthor(bookRequest.getAuthor());
        book.setIsbn(bookRequest.getIsbn());
        book.setQuantity(bookRequest.getQuantity());
        book.setTitle(bookRequest.getTitle());
        book.setPublicationYear(bookRequest.getPublicationYear());

//        modelMapper.map(bookRequest,book);
        book.setCreatedAt(LocalDateTime.now());
        // Validate the book details (e.g., title, author, ISBN)
        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            throw new CustomException("Title cannot be empty");
        }
        if (book.getAuthor() == null || book.getAuthor().isEmpty()) {
            throw new CustomException("Author cannot be empty");
        }
        if (book.getIsbn() == null || book.getIsbn().isEmpty()) {
            throw new CustomException("ISBN cannot be empty");
        }

        Book savedBook = bookRepository.save(book);
        BookResponse bookResponse=new BookResponse();
//        bookResponse = mapper.mapBookEntityToBookResponseDTO(savedBook);
        modelMapper.map(savedBook,bookResponse);
        // Save the book to the database
        return ResponseEntity.status(HttpStatus.CREATED).body(bookResponse);
    }


    // Delete a book by ID
    public void deleteBook(Integer bookId) {
        // Check if the book exists
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        if (bookOptional.isEmpty()) {
            throw new CustomException("Book not found with ID: " + bookId);
        }

        // Delete the book
        bookRepository.deleteById(bookId);
    }


    // Edit a book
    public Book editBook(Integer bookId, BookRequest updatedBook) {
        // Check if the book exists
        Optional<Book> bookOptional = bookRepository.findById(bookId);
        if (bookOptional.isEmpty()) {
            throw new IllegalArgumentException("Book not found with ID: " + bookId);
        }

        // Get the existing book
        Book existingBook = bookOptional.get();

        // Update the fields (only non-null fields)
        if (updatedBook.getTitle() != null) {
            existingBook.setTitle(updatedBook.getTitle());
        }
        if (updatedBook.getAuthor() != null) {
            existingBook.setAuthor(updatedBook.getAuthor());
        }
        if (updatedBook.getIsbn() != null) {
            existingBook.setIsbn(updatedBook.getIsbn());
        }
        if (updatedBook.getPublicationYear() != 0) {
            existingBook.setPublicationYear(updatedBook.getPublicationYear());
        }
        if (updatedBook.getQuantity() != 0) {
            existingBook.setQuantity(updatedBook.getQuantity());
        }

        existingBook.setUpdatedAt(LocalDateTime.now());
        // Save the updated book
        return bookRepository.save(existingBook);
    }

    // Search for books by title, author, or ISBN
    public List<Book> searchBooks(String title, String author, String isbn) {
        if (title != null && !title.isEmpty()) {
            return bookRepository.findByTitleContainingIgnoreCase(title);
        } else if (author != null && !author.isEmpty()) {
            return bookRepository.findByAuthorContainingIgnoreCase(author);
        } else if (isbn != null && !isbn.isEmpty()) {
            return bookRepository.findByIsbnContainingIgnoreCase(isbn);
        } else {
            // If no search criteria are provided, return all books
            return bookRepository.findAll();
        }
    }
}
