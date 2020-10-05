package org.launchcode.VirtualLearningResources.models.data;

import org.launchcode.VirtualLearningResources.models.Parent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends CrudRepository<Parent, Integer> {
}
