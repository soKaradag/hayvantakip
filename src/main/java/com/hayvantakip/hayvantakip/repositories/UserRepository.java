package com.hayvantakip.hayvantakip.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hayvantakip.hayvantakip.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
