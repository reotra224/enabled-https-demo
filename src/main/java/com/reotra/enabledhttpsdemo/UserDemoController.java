package com.reotra.enabledhttpsdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserDemoController {

    private final UserDemoRepository repository;

    public UserDemoController(UserDemoRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/user-demo")
    public ResponseEntity<List<UserDemo>> getUserDemoList() {
        return ResponseEntity.ok(repository.findAll());
    }
}
