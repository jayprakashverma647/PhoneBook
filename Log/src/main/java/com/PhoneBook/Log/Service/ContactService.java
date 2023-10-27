package com.PhoneBook.Log.Service;

import com.PhoneBook.Log.Entity.Contact;

import java.util.List;
public interface ContactService{
    public Contact saveContact(Contact contact);
    public Contact GetContactById(Integer cid);
    public Contact DeleteContactById(Integer cId);
    public List<Contact> allContact();
    public Contact updateContactById(Integer cId);
}
