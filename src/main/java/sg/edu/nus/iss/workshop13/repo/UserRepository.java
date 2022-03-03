package sg.edu.nus.iss.workshop13.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.iss.workshop13.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

    @Query("SELECT u FROM User u Where u.uniqueId = :uniqueId")
    public User findByUniqueId(@Param("uniqueId")String uniqueId);
    
}
