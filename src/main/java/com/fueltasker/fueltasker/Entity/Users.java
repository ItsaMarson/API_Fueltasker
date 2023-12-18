package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    
    private String fName;
    
    private String lName;
    
    private String eMail;
   
    private String pWord;

    private String phonenumber;

    private String dateofbirth;

    public Users(){super();}

    

    public Users(int userID, String fName, String lName, String eMail, String pWord, String phonenumber,
            String dateofbirth) {
        this.userID = userID;
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.pWord = pWord;
        this.phonenumber = phonenumber;
        this.dateofbirth = dateofbirth;
    }

    

    public String getPhonenumber() {
        return phonenumber;
    }



    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }



    public String getDateofbirth() {
        return dateofbirth;
    }



    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }



    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    
}
