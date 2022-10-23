package com.zzw.repository;

import com.zzw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
@Component(value = "userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

}
