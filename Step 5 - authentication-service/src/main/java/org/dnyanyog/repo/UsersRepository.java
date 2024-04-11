package org.dnyanyog.repo;

import java.util.List;
import org.dnyanyog.entity.StudentUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UsersRepository extends JpaRepository<StudentUser, Long> { // Query class


  List<StudentUser> findByUsernameAndPassword(String username, String password); // Declaration

}
