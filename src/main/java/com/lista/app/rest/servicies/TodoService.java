package com.lista.app.rest.servicies;


import com.lista.app.rest.entities.Task;
import com.lista.app.rest.entities.dto.TaskDto;
import com.lista.app.rest.mappers.TaskMapper;
import com.lista.app.rest.repositories.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    //private final UserRepository userRepository;

    public List<TaskDto> getTasks(){
        return todoRepository.findAll().stream()
                .map(TaskMapper::taskToDto)
                .collect(Collectors.toList());
    }
    public TaskDto getTaskById(Long id){
        return TaskMapper.taskToDto(todoRepository.findById(id).get());
    }

    public TaskDto saveTask(TaskDto dto){
        todoRepository.save(TaskMapper.dtoToTask(dto));
        return dto;
    }

    public String updateTaskById(Long id, TaskDto dto){
        Task taskToModify = todoRepository.findById(id).get();
        if (dto.getDescription() != null){
            taskToModify.setDescription(dto.getDescription());
        }
        taskToModify.setComplete(dto.isComplete());
        todoRepository.save(taskToModify);
        return "Task updated";
    }

    public String deleteTaskById(Long id){
        todoRepository.deleteById(id);
        return "Task deleted";
    }

}
