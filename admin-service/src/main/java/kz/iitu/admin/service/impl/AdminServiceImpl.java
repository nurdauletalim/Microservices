package kz.iitu.admin.service.impl;

import kz.iitu.admin.service.AdminService;
import kz.iitu.dbstructservice.model.Subjects;
import kz.iitu.dbstructservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public List<User> getAllUsers() {
        System.out.println("AdminServiceImpl.getAllUsers()");
        List<User> listOfUsers = new ArrayList<>();
        Subjects subjects = new Subjects();
        subjects.setTest("123");
        System.out.println(subjects.getTest());
        return listOfUsers;
    }

    @Override
    public User getUserById(Long id) {
        System.out.println("AdminServiceImpl.getUserById()");
        System.out.println("getUserById id = " + id);
        User user = new User();
        return user;
    }
}
