package kz.iitu.admin.service;

import kz.iitu.dbstructservice.model.User;

import java.util.List;

public interface AdminService {
    List<User> getAllUsers();

    User getUserById(Long id);
}
