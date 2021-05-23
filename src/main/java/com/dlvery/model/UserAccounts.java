package com.dlvery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserAccounts")
public class UserAccounts {

    private String name;
    private String pwd;
    private String email;
    @Id
    private String contact;
    private String roleType;

    @Override
    public String toString() {
        return "UserAccounts{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", roleType='" + roleType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }


    public UserAccounts() {
    }

    public UserAccounts(String name, String pwd, String email, String contact, String roleType) {
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.contact = contact;
        this.roleType = roleType;
    }
}
