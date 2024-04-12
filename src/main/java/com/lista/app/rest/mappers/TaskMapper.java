package com.lista.app.rest.mappers;

import com.lista.app.rest.entities.Task;
import com.lista.app.rest.entities.dto.TaskDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TaskMapper {
    public static Task dtoToTask(TaskDto dto){
        return Task.builder()
                .id(dto.getId())
                .description(dto.getDescription())
                .complete(dto.isComplete())
                //.user(dto.getUser())
                .build();
    }
    public static TaskDto taskToDto(Task task){
        return TaskDto.builder()
                .id(task.getId())
                .description(task.getDescription())
                .complete(task.isComplete())
                //.user(task.getUser())
                .build();
    }

}
