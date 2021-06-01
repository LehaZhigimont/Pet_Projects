package by.test.springboottest.repo;

import by.test.springboottest.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
