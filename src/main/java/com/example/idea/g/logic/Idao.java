package com.example.idea.g.logic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Idao extends JpaRepository<Ischema, Long> {
//    we can find a User By Email by writng this Function
    @Query("SELECT s FROM Ischema s  where s.email =?1")
    Optional<Ischema> findIschemaByEmail(String email);
}
