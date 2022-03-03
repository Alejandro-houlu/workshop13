package sg.edu.nus.iss.workshop13.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sg.edu.nus.iss.workshop13.Model.User;
import sg.edu.nus.iss.workshop13.Service.UserInterface;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
	UserInterface userService;
    

@RequestMapping("/")
public String signup(Model model){
    User user = new User();
    model.addAttribute("user", user);
    return "index";
}

@RequestMapping("/save")
public String saveUser(@ModelAttribute("user") User user, Model model){

    User user1 = new User(user.getName(),user.getEmail(),user.getPhoneNumber());
    userService.saveUser(user1);

    model.addAttribute("users" , userService.findAll());

    return "listAllUsers";

}

@RequestMapping("/search")
public String searchUser(@RequestParam(value = "uniqueId", required = false ) String uniqueId, Model model){

    User user = userService.findByUniqueId(uniqueId);
    String error = "";

    if(user == null){

        error = "User not found";

    }

    model.addAttribute("user", user);
    model.addAttribute("error", error);

    return "searchResult";



}

}
