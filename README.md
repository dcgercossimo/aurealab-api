# Aurea-LAB API

## Arquitetura de pastas

```
📦 br.com.aurealab_api
|_ 📂 api
|    |_ 📂 v[#] (# api version)
|         |_ 📂 controller
|         |    |_ ☕ HomeController.java
|         |    |_ ☕ UserController.java
|         |_ 📂 service
|         |    |_ ☕ UserService.java
|         |_ 📂 mapper
|             |_ ☕ UserMapper.java
|_ 📂 core
|    |_ 📂 handle
|    |    |_ ☕ HandleException.java
|    |    |_ ☕ BusinessException.java
|    |    |_ ☕ CustomException.java
|    |_ 📂 config
|    |_ 📂 security
|_ 📂 model
     |_ 📂 entity
     |    |_ ☕ User.java
     |_ 📂 dto
     |    |_ 📂 request
     |    |    |_ ☕ UserRequest.java
     |    |    |_ ☕ UserLoginRequest.java
     |    |    |_ ☕ UserChangePasswordRequest.java
     |    |_ 📂 response
     |    |    |_ ☕ UserResponse.java
     |    |_ 📂 filter
     |         |_ ☕ UserFilter.java
     |_ 📂 repository
          |_ 📂 spec
          |    |_ ☕ UserSpec.java
          |_ ☕ UserRepository.java
```
