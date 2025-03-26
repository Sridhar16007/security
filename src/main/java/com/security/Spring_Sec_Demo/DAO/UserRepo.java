package com.security.Spring_Sec_Demo.DAO;

import com.security.Spring_Sec_Demo.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
