package com.codeup.deimosspringblog.repositories;

import com.codeup.deimosspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.User;

public interface Users extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
