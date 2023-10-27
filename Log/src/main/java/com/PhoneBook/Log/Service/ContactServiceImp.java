package com.PhoneBook.Log.Service;

import com.PhoneBook.Log.Entity.Contact;
import com.PhoneBook.Log.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class ContactServiceImp implements ContactService {
    @Autowired
    public ContactRepository repo;

    @Override
    public Contact saveContact ( Contact contact ) {


        return null;
    }

    @Override
    public Contact GetContactById ( Integer cid ) {
        return null;
    }

    @Override
    public Contact DeleteContactById ( Integer cId ) {
        return null;
    }

    @Override
    public List < Contact > allContact ( ) {
        return null;
    }

    @Override
    public Contact updateContactById ( Integer cId ) {
        return null;
    }
}
