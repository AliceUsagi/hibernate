package com.wildcodeschool.example.challengeHibernateExample.repositories;

import com.wildcodeschool.example.challengeHibernateExample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
