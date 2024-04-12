package com.lista.app.rest.controllers;

import com.lista.app.rest.entities.dto.TaskDto;
import com.lista.app.rest.servicies.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://127.0.0.1:8080")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) { this.service = service; }
    @GetMapping
    public ResponseEntity<List<TaskDto>> getTasks(){
        if (!service.getTasks().isEmpty() && service.getTasks() != null){
            return ResponseEntity.ok(service.getTasks());
        }
        return ResponseEntity.noContent().build();
    }
    @GetMapping("{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable Long id){
        return ResponseEntity.ok(service.getTaskById(id));
    }
    @PostMapping
    public ResponseEntity<TaskDto> saveTask(@RequestBody TaskDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveTask(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTaskById(@PathVariable Long id, @RequestBody TaskDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(service.updateTaskById(id, dto));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteTaskById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.deleteTaskById(id));
    }
}
