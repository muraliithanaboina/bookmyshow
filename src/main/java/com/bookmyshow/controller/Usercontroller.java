package com.bookmyshow.controller;

import com.bookmyshow.dto.createuserrequestdto;
import com.bookmyshow.dto.createuserresponsedto;
import com.bookmyshow.service.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Usercontroller {

   private Userservices userservices;
    @Autowired
 public Usercontroller(Userservices userservices){
     this.userservices=userservices;

 }

    public createuserresponsedto createuser(createuserrequestdto x){
 return  null;
    }
}
