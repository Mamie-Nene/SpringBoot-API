package com.yombalfay.API.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yombalfay.API.Models.User;

import com.yombalfay.API.Repository.UserRepository;

@Controller // This means that this class is a Controller
@CrossOrigin("*")
@RequestMapping("/api/user/") 

public class UserController {
    @Autowired // This means to get the bean called userRepository
    private UserRepository userRepository;

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }

  @PostMapping(path="/add") 

  public @ResponseBody String addNewUser (@RequestBody Map<String, String> payload) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User user = new User();
    user.setName(payload.get("user_name"));
    user.setNumber(payload.get("phone_number"));
    user.setEmail(payload.get("email"));
    //user.setProfil(payload.get("profil"));
   // user.setCode(payload.get("code"));
    userRepository.save(user);
    return "Saved";
  }
    @PostMapping("test")
    public User save(@RequestBody User user){
      return userRepository.save(user);
    }
}

// localhost:8080/API/addUser -d name=Mamie -d email=mnb@gainde.sn -d number=771234567
