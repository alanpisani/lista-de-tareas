package com.lista.app.rest.entities.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDto {
    private Long id;
    private String description;
    private boolean complete;
    //private User user;
}
