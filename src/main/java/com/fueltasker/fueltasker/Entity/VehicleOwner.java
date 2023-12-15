package com.fueltasker.fueltasker.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicleowners")
public class VehicleOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vo_id;
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String username;
    private String password;
    private String e_add;
    private String phonenumber;
    private String vehicle_type;
    public VehicleOwner(){super();}
    public VehicleOwner(String firstname, String lastname){super();
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    public VehicleOwner(int vo_id, String firstname, String lastname, String username, String password, String e_add,
            String phonenumber, String vehicle_type) {
        this.vo_id = vo_id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.username = username;
        this.password = password;
        this.e_add = e_add;
        this.phonenumber = phonenumber;
        this.vehicle_type = vehicle_type;
    }
    public int getVo_id() {
        return vo_id;
    }
    public void setVo_id(int vo_id) {
        this.vo_id = vo_id;
    }
    
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getE_add() {
        return e_add;
    }
    public void setE_add(String e_add) {
        this.e_add = e_add;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getVehicle_type() {
        return vehicle_type;
    }
    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
    
    
}
