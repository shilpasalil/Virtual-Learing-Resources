package org.launchcode.VirtualLearningResources.models.data;

import org.launchcode.VirtualLearningResources.models.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {
}
