package com.example.idea.g.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Iservice {
    private final Idao idao;

    @Autowired
    public Iservice(Idao idao) {
        this.idao = idao;
    }
//

    public List<Ischema> geALLIdeeas(){
        return idao.findAll();
    }
// in here we
    public void addNewIdeea(Ischema ischema) {
//        bellow we can print the  requisted schema  coming from the user(he wants to add)
        Optional<Ischema> ischemaByEmail = idao.
                findIschemaByEmail(ischema.getEmail());
        if(ischemaByEmail.isPresent()){
           throw new IllegalStateException("Dog Email Is Taken");
        }
        idao.save(ischema);
        System.out.println(ischema);
    }
}
