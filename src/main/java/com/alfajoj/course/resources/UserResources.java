package com.alfajoj.course.resources;

import com.alfajoj.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"maria","maria@","99999","123");
        return ResponseEntity.ok().body(u);
    }
}
