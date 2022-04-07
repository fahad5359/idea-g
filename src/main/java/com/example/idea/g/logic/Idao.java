package com.example.idea.g.logic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Idao extends JpaRepository<Ischema, Long> {
//    we can find a User By Email by writng this Function

}
