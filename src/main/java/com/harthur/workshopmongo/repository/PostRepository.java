package com.harthur.workshopmongo.repository;

import com.harthur.workshopmongo.domain.Post;
import com.harthur.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
