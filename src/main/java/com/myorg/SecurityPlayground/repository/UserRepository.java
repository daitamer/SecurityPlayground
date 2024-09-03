package com.myorg.SecurityPlayground.repository;

import com.myorg.SecurityPlayground.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByGithubUsername(User user);
}
