package kz.iitu.schoolsubjectservice.service.impl;

import kz.iitu.dbstructservice.model.Subjects;
import kz.iitu.schoolsubjectservice.service.SubjectsService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectsService {
    @Override
    public Subjects getSubjectbyId(Long id) {
        System.out.println("SubjectServiceImpl.getSubjectbyId -> id = " + id);
        Subjects subjects = new Subjects();
        subjects.setId(id);
        System.out.println("subjects.getId() = " + subjects.getId());
        return subjects;
    }
}
