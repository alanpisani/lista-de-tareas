/*package com.lista.app.rest.mappers;

import com.lista.app.rest.entities.User;
import com.lista.app.rest.entities.dto.UserDto;

import java.time.LocalDateTime;

public class UserMapper {
    public static User dtoToUser(UserDto dto){
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .name(dto.getName())
                .surname(dto.getSurname())
                .email(dto.getEmail())
                .created_at(LocalDateTime.now())
                .modified_at(LocalDateTime.now())
                //.tasks(dto.getTasks())
                .build();
    }
    public static UserDto userToDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .name(user.getName())
                .surname(user.getSurname())
                .email(user.getEmail())
                .created_at(user.getCreated_at())
                .modified_at(user.getModified_at())
                //.tasks(user.getTasks())
                .build();
    }
}*/
