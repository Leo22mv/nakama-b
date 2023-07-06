package app.web.nakama.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.web.nakama.model.User;
import app.web.nakama.service.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private IUserService iuserService;

    @PostMapping ("/registrarse")
    public void register(@RequestBody User user) {
        iuserService.saveUser(user);
    }
}
