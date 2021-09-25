package kz.iitu.schoolsubjectservice.controller;

import kz.iitu.schoolsubjectservice.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subject")
public class SubjectsController {

    @Autowired
    SubjectsService subjectsService;

    public ResponseEntity<?> getSubjectById(@PathVariable Long id) {
        System.out.println("SubjectsController.getSubjectById");
        return ResponseEntity.ok(subjectsService.getSubjectbyId(id));
    }
}
