package com.booleanuk.core;

public class UserAccount {
    private String email;
    private String password;
    private boolean enabled;

    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
        this.enabled=false;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email="anything@gmail.com";
    }
}
