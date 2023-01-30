package com.yombalfay.API.Models;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "User")
public class User {
    enum Profil {
        user_simple,
        admin,
      }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private BigInteger user_id;

    private String user_name;

    private String phone_number;

    private String profil;

    private String email;

    private Integer access_code;

    //public User() {  }

    /*  public User(String name, String email, String number ) {
          this.setName(name);
          this.setEmail(email);
          this.setNumber(number);
    }
  
      public User(BigInteger id, String user_name, String email, String phone_number) {
          this.setId(id);
          this.setName(user_name);
          this.setEmail(email);
          this.setNumber(phone_number);
      }
  */  
    public BigInteger getId() {
        return user_id;
      }
    
      public void setId(BigInteger user_id) {
        this.user_id = user_id;
      }
    
      public String getName() {
        return user_name;
      }
    
      public void setName(String user_name) {
        this.user_name = user_name;
      }

      public String getNumber() {
        return phone_number;
      }
    
      public void setNumber(String phone_number) {
        this.phone_number = phone_number;
      }
    
      public String getProfil() {
        return profil;
      }
    
      public void setProfil(Profil profil) {
        this.profil = profil.toString();
      }

      public String getEmail() {
        return email;
      }
    
      public void setEmail(String email) {
        this.email = email;
      }

      public Integer getCode() {
        return access_code;
      }
    
      public void setCode(Integer access_code) {
        this.access_code = access_code;
      }
}

