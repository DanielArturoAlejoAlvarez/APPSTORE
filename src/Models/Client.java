/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author daniel
 */
public class Client {
    int id;
    String dni;
    String fullnane;
    String address;
    Boolean state;

    public Client() {
    }

    public Client(int id, String dni, String fullnane, String address, Boolean state) {
        this.id = id;
        this.dni = dni;
        this.fullnane = fullnane;
        this.address = address;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullnane() {
        return fullnane;
    }

    public void setFullnane(String fullnane) {
        this.fullnane = fullnane;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    } 
    
}
