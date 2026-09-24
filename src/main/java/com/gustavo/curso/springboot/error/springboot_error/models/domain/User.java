package com.gustavo.curso.springboot.error.springboot_error.models.domain;


public class User {

    private Long id;
    private  String name;
    private String lastaname;

    private  Role role;

    

    public User(Long id, String name, String lastaname) {
        this.id = id;
        this.name = name;
        this.lastaname = lastaname;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastaname() {
        return lastaname;
    }
    public void setLastaname(String lastaname) {
        this.lastaname = lastaname;
    }
    public String getRole() {
        return role.getName();
    }
    public void setRole(Role role) {
        this.role = role;
    }

}
