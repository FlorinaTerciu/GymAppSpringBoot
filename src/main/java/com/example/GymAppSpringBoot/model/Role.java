package com.example.GymAppSpringBoot.model;

public class Role {
    /** Role's unique ID from the database */
    private int role_id;
    /** Role's name */
    private String roleName;

    /**
     * Role's constructor
     * @param roleName
     */
    public Role(int role_id,String roleName){
        this.role_id = role_id;
        this.roleName = roleName;
    }

    /**
     * @return the role_id
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param role_id the role_id to set
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
