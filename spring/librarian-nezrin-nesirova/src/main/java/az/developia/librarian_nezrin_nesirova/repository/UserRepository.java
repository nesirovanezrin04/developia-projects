package az.developia.librarian_nezrin_nesirova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarian_nezrin_nesirova.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
