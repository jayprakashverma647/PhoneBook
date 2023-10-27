package com.PhoneBook.Log.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Contact{
    @Id
    @GeneratedValue
    Integer cId;
    String name;
    Long mobile;

    LocalDate dateOfBirth;

}
