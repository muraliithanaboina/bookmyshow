package com.bookmyshow.repositories;

import com.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Long> {
}
