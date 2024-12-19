# Aurea-LAB API

## Arquitetura de pastas

```
:package: br.com.aurealab_api
|_ :open_file_folder: api
|    |_ :open_file_folder: v[#] (# api version)
|         |_ :open_file_folder: controller
|         |    |_ :coffee: HomeController.java
|         |    |_ :coffee: UserController.java
|         |_ :open_file_folder: service
|         |    |_ :coffee: UserService.java
|         |_ :open_file_folder: mapper
|             |_ :coffee: UserMapper.java
|_ :open_file_folder: core
|    |_ :open_file_folder: handle
|    |    |_ :coffee: HandleException.java
|    |    |_ :coffee: BusinessException.java
|    |    |_ :coffee: CustomException.java
|    |_ :open_file_folder: config
|    |_ :open_file_folder: security
|_ :open_file_folder: model
     |_ :open_file_folder: entity
     |    |_ :coffee: User.java
     |_ :open_file_folder: dto
     |    |_ :open_file_folder: request
     |    |    |_ :coffee: UserRequest.java
     |    |    |_ :coffee: UserLoginRequest.java
     |    |    |_ :coffee: UserChangePasswordRequest.java
     |    |_ :open_file_folder: response
     |    |    |_ :coffee: UserResponse.java
     |    |_ :open_file_folder: filter
     |         |_ :coffee: UserFilter.java
     |_ :open_file_folder: repository
          |_ :open_file_folder: spec
          |    |_ :coffee: UserSpec.java
          |_ :coffee: UserRepository.java
```
