package view;

import data.entities.User;
import logic.UsersService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {
    private final UsersService service;

    @Autowired
    public UserController(UsersService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return service.findAll();
    }
    @PutMapping("/users/{id}")
    public List<User> update(@PathVariable Long id, @RequestBody User user){
        if (service.findUserbyID(id) != null){
            service.addNew(user);
        }
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public List<User> getAnyUser(@PathVariable Long id) {
        Hibernate.initialize(service.findUserbyID(id));
        return service.findAll();
    }

    @PostMapping("/user/new")
    public List<User> addNewUser(@RequestBody User user) {
        service.addNew(user);
        return service.findAll();
    }

    @DeleteMapping("/user/delete/{id}")
    public List<User> getOut(@PathVariable Long id) {
        service.deleteUser(id);
        return service.findAll();
    }

}
