package com.example.diplom.controllers;


import com.example.diplom.entity.User;
import com.example.diplom.services.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String login () {
        return "page-login";
    }

    @GetMapping("/registration")
    public String registration (){
        return "page-registration";
    }

    @PostMapping("/registration")
    public String createUser (User user, Model model){
        if (!userService.createUser(user)){
            model.addAttribute("error", "Такая почта зарегистрирована ранее: " + user.getLogin());
            return "page-registration";
        }
        return "redirect:/login";
    }


}
