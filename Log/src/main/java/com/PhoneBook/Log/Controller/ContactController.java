package com.PhoneBook.Log.Controller;

import com.PhoneBook.Log.Service.ContactServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    public ContactServiceImp service;


}
