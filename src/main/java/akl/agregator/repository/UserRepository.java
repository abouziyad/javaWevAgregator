package akl.agregator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import akl.agregator.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);

}
