insert into books
(name,price,publish_date,register_date,quantity,librarian_id)
values
('Anna Karenina', 202, '1877-01-01', '2024-10-11 12:13:14', 864, 1),
('War and Peace', 101, '1869-01-01', '2024-10-11 12:13:14', 1225, 1),
('1984', 105, '1949-06-08', '2024-10-11 12:13:14', 328, 2);

insert into librarians
(name, surname, phone, email, address, username, register_date)
values
('Ali', 'Mammadov', '0501234567', 'ali.mammadov@library.az', 'Baku', 'ali_mammadov', '2024-10-11 12:13:14'),
('Aysel', 'Aliyeva', '0516547890', 'aysel.aliyeva@library.az', 'Baku', 'aysel_aliyeva', '2024-10-11 12:13:14');

insert into students
(name, surname, phone, email, address, username, register_date)
values
('Elvin', 'Mammadov', '0501234567', 'elvin.mammadov@student.az', 'Baku', 'elvin_mammadov', '2024-10-11 12:13:14'),
('Narmin', 'Aliyeva', '0559876543', 'narmin.aliyeva@student.az', 'Baku', 'narmin_aliyeva', '2024-10-11 12:13:14');

insert into users
(username,password,enabled) 
values
('ali_mammadov','{noop}1234',1),
('aysel_aliyeva','{noop}1234',1),
('elvin_mammadov','{noop}1234',1),
('narmin_aliyeva','{noop}1234',1);

insert into authority_list
(authority,librarian,student)
values
('ROLE_ADD_BOOK',1,0),
('ROLE_GET_BOOK',1,1),
('ROLE_DELETE_BOOK',1,0),
('ROLE_UPDATE_BOOK',1,0),
('ROLE_ADD_ORDER',0,1);

insert into authorities
(username,authority)
select 'ali_mammadov',authority
from authority_list where librarian=1;

insert into authorities
(username,authority)
select 'aysel_aliyeva',authority
from authority_list where librarian=1;

insert into authorities
(username,authority)
select 'elvin_mammadov',authority
from authority_list where student=1;

insert into authorities
(username,authority)
select 'narmin_aliyeva',authority
from authority_list where student=1;

insert into orders
(register_date,total_price,student_id,librarian_id)
values
('2024-10-11 12:13:14',202,1,1),
('2024-10-11 12:13:14',101,2,2);

insert into order_details
(order_id,book_id,quantity)
values
(1,1,3),
(1,2,7),
(2,3,5);
