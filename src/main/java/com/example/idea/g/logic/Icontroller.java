package com.example.idea.g.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/ideea")
public class Icontroller {

    private final Iservice iservice;
    @Autowired
    public Icontroller(Iservice iservice) {
        this.iservice = iservice;
    }

//    ------------------------------------------------till here we established our constructor

    @GetMapping
    public List<Ischema> getideea(){
        return iservice.geALLIdeeas();
    }
//    we can add new  recourcies by usnig post, and  checking by post man
    @PostMapping
    public void addIdeeas(@RequestBody Ischema ischema){
//        the @requistbody will take the values coming from the rerquist  coming from the user and add
//        to the  schema
        System.out.println("awsdiuhk");
        iservice.addNewIdeea(ischema);
    }
}
