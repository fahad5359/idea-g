package com.example.idea.g.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Iservice {
    private final Idao idao;

    @Autowired
    public Iservice(Idao idao) {
        this.idao = idao;
    }

    public List<Ischema> geALLIdeeas(){
        return idao.findAll();
    }

    public void addNewIdeea(Ischema ischema) {
//        bellow we can print the  requisted schema  coming from the user(he wants to add)
        System.out.println(ischema);

    }
}
