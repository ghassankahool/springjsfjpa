package org.demo.data.repository.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.demo.bean.jpa.StudentEntity;

/**
 * Repository : Student.
 */
public interface StudentJpaRepository extends PagingAndSortingRepository<StudentEntity, Integer> {

}
