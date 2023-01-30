package com.yombalfay.API.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yombalfay.API.Models.Biller;
import com.yombalfay.API.Repository.BillerRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/api/biller") 


public class BillerController {
    @Autowired // This means to get the bean called userRepository
    private BillerRepository billerRepository;

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Biller> getAllUsers() {
    // This returns a JSON or XML with the users
    return billerRepository.findAll();
  }

  @PostMapping(path="/add") 

  public @ResponseBody String addNewUser (@RequestBody Map<String, String> payload) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Biller biller = new Biller();

    biller.setName(payload.get("billers_name;"));
    biller.setContact(payload.get("contact"));
   
    billerRepository.save(biller);
    return "Saved";
  }
}
