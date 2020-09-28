package org.launchcode.VirtualLearningResources.models.data;

import org.launchcode.VirtualLearningResources.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
