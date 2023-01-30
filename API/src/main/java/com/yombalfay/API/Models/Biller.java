package com.yombalfay.API.Models;

import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Biller {
    enum Statut {
        activé,
        désactivé,
      }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private BigInteger billers_reference;

    private String billers_name;

    private String contact;

    private BigInteger transactions;

    private Timestamp dateAjout;

    private String statut;
     
    //private Blob logo ;

    public BigInteger getReference() {
        return billers_reference;
      }
    
      public void setReference(BigInteger billers_reference) {
        this.billers_reference = billers_reference;
      }
    
      public String getName() {
        return billers_name;
      }
    
      public void setName(String billers_name) {
        this.billers_name = billers_name;
      }

      public String getContact() {
        return contact;
      }
    
      public void setContact(String contact) {
        this.contact = contact;
      }

      public BigInteger getTransaction() {
        return transactions;
      }
    
      public void setTransaction(BigInteger transaction) {
        this.transactions = transaction;
      }

      public Timestamp getDateAjout() {
        return dateAjout;
      }
    
      public void setDateAjout(Timestamp dateAjout) {
        this.dateAjout = dateAjout;
      }

      public String getStatut() {
        return statut;
      }
    
      public void setStatut(Statut statut) {
        this.statut = statut.toString();
      }

     // public Blob getLogo() {return logo;}

    // public void setLogo(Blob logo) {this.logo = logo;}
}
