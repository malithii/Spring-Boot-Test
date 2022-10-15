package lk.mobios.sms.service;

import lk.mobios.sms.dto.UserDTO;
import lk.mobios.sms.entity.User;
import lk.mobios.sms.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
            userRepo.save(modelMapper.map(userDTO, User.class));
            return userDTO;
    }
}
