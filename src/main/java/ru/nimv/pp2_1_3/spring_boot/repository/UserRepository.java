package ru.nimv.pp2_1_3.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nimv.pp2_1_3.spring_boot.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {
}
