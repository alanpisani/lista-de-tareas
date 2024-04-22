package com.lista.app.rest;

import com.lista.app.rest.entities.PermissionEntity;
import com.lista.app.rest.entities.RoleEntity;
import com.lista.app.rest.entities.RoleEnum;
import com.lista.app.rest.entities.UserEntity;
import com.lista.app.rest.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class RestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {

			//CREATE PERMISSIONS
			PermissionEntity createPermission = PermissionEntity.builder()
					.name("CREATE")
					.build();
			PermissionEntity readPermission = PermissionEntity.builder()
					.name("READ")
					.build();
			PermissionEntity updatePermission = PermissionEntity.builder()
					.name("UPDATE")
					.build();
			PermissionEntity deletePermission = PermissionEntity.builder()
					.name("DELETE")
					.build();
			PermissionEntity refactorPermission = PermissionEntity.builder()
					.name("REFACTOR")
					.build();

			//CREAR ROLES

			RoleEntity roleAdmin = RoleEntity.builder()
					.roleEnum(RoleEnum.ADMIN)
					.permissionsList(Set.of(createPermission, readPermission, updatePermission, deletePermission))
					.build();
			RoleEntity roleUser = RoleEntity.builder()
					.roleEnum(RoleEnum.USER)
					.permissionsList(Set.of(createPermission, readPermission, deletePermission))
					.build();


			UserEntity userAlan = UserEntity.builder()
					.username("Alan")
					.password("1234")
					.isEnable(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleAdmin))
					.build();
			UserEntity userDay = UserEntity.builder()
					.username("Daiana")
					.password("1234")
					.isEnable(true)
					.accountNoExpired(true)
					.accountNoLocked(true)
					.credentialNoExpired(true)
					.roles(Set.of(roleAdmin))
					.build();
			userRepository.saveAll(List.of(userAlan, userDay));
		};
	}
}
