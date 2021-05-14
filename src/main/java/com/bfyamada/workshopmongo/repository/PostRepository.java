package com.bfyamada.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bfyamada.workshopmongo.domain.Post;
import com.bfyamada.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
