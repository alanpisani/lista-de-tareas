/*package com.lista.app.rest.servicies;

import com.lista.app.rest.entities.Task;
import com.lista.app.rest.entities.User;
import com.lista.app.rest.entities.dto.UserDto;
import com.lista.app.rest.mappers.UserMapper;
import com.lista.app.rest.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserDto> getUsers(){
        return repository.findAll().stream()
                .map(UserMapper::userToDto)
                .collect(Collectors.toList());
    }
    public List<Task> getUserTasks(Long userId){
        User user = repository.findById(userId).get();
        return user.getTasks();
    }
    public UserDto getUserById(Long id){
        return UserMapper.userToDto(repository.findById(id).get());
    }
    public UserDto saveUser(UserDto dto){
        repository.save(UserMapper.dtoToUser(dto));
        return dto;
    }
    public UserDto putUser(UserDto dto, Long id){
        User userToModify = repository.findById(id).get();
        if(dto.getPassword() != null){
            userToModify.setPassword(dto.getPassword());
        }
        if (dto.getName() != null){
            userToModify.setName(dto.getName());
        }
        if(dto.getSurname() != null){
            userToModify.setSurname(dto.getSurname());
        }
        if(dto.getEmail() != null){
            userToModify.setEmail(dto.getEmail());
        }
        userToModify.setModified_at(LocalDateTime.now());
        User userModified = repository.save(userToModify);
        return UserMapper.userToDto(userModified);
    }
    public String deleteUserById(Long id){
        repository.deleteById(id);
        return "User deleted";
    }
}*/
