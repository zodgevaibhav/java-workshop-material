package org.dnyanyog.service;

import java.util.List;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.entity.StudentUser;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired UsersRepository userRepo;

  public LoginResponse validateUser(LoginRequest loginRequest) {

    LoginResponse response = new LoginResponse();

    List<StudentUser> liUser =
        userRepo.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());

    if (liUser.size() == 1) {
      response.setStatus("Success");
      response.setMessage("Login successful");
    } else {
      response.setStatus("Fail");
      response.setMessage("Login failed");
    }
    return response;
  }
}
