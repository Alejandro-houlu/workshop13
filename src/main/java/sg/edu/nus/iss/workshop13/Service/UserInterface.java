package sg.edu.nus.iss.workshop13.Service;

import java.util.List;

import sg.edu.nus.iss.workshop13.Model.User;

public interface UserInterface {
    User saveUser(User user);

    List<User> findAll();

    User findByUniqueId(String uniqueId);
}
