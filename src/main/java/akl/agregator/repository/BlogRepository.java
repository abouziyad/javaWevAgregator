package akl.agregator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import akl.agregator.entity.Blog;
import akl.agregator.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	List<Blog> findByUser(User user);
}
