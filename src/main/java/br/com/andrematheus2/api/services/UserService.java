package br.com.andrematheus2.api.services;

import br.com.andrematheus2.api.domain. User;
import br.com.andrematheus2.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User upDate(UserDTO obj);
    void delete(Integer id);

}