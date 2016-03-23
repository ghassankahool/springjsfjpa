package org.demo.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.demo.bean.jpa.ClassroomEntity;

/**
 * Repository : Classroom.
 */
public interface ClassroomJpaRepository extends PagingAndSortingRepository<ClassroomEntity, Integer> {

}
