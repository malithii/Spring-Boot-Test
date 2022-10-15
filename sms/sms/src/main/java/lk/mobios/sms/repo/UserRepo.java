package lk.mobios.sms.repo;

import lk.mobios.sms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
