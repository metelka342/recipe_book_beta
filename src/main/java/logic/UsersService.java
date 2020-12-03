package logic;

import data.entities.User;
import data.repositoryies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersService {
    private UserRepository repository;

    @Autowired
    public UsersService(UserRepository repository) {
        this.repository = repository;
    }


    public User findUserbyID(long id){
        return repository.getOne(id);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
    public User addNew(User user){
        return repository.save(user);
    }

    public void deleteUser(long id){
        repository.deleteById(id);
    }

}

