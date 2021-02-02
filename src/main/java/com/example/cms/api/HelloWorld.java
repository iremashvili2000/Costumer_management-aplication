package com.example.cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorld
{


    @RequestMapping(value="/hello")
    public Client hello(@RequestParam(name="name", required=false)String name, @RequestParam(name="lastname", required=false)String lastname, @RequestParam(name="id")int id){

        int sum=0;
        for(int i=0;i<CustomCollection.get().getAllClients().size();i++){
            if(CustomCollection.get().get(i)==id){
                sum++;
                return CustomCollection.get().get(i);
            }
        }
        if(sum==0){
            CustomCollection.get().add(new Client(name,lastname,id));

        }else{
            return null;

        }



    }


}
