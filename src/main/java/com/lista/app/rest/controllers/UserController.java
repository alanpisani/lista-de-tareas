/*package com.lista.app.rest.controllers;

import com.lista.app.rest.entities.Task;
import com.lista.app.rest.entities.dto.UserDto;
import com.lista.app.rest.servicies.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service){
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(){
        if (!service.getUsers().isEmpty() && service.getUsers() != null){
            return ResponseEntity.status(HttpStatus.OK).body(service.getUsers());
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserById(id));
    }
    @GetMapping("/{id}/tasks")
    public ResponseEntity <List<Task>> getUserTasks(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getUserTasks(id));
    }
    @PostMapping
    public ResponseEntity<UserDto> postUser(@RequestBody UserDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(service.saveUser(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> putUser(@RequestBody UserDto dto, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.putUser(dto, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteUserById(id));
    }
}*/
