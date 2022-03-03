package sg.edu.nus.iss.workshop13.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.workshop13.Model.User;
import sg.edu.nus.iss.workshop13.repo.UserRepository;

@Service
public class UserImplementation implements UserInterface {

    @Autowired
    UserRepository urepo;

    @Transactional
    public User saveUser(User user){
        return urepo.save(user);
    }

    @Transactional
    public List<User> findAll(){

        return urepo.findAll();

    }

    @Transactional
    public User findByUniqueId(String uniqueId){
        return urepo.findByUniqueId(uniqueId);
    }
    
}
