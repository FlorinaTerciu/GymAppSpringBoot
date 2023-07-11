package com.example.GymAppSpringBoot.model;

import java.time.LocalDate;

public class User {
    /** the user's unique ID from the database */
    private int userID;
    /** the user's forename */
    private String forename;
    /** the user's family name */
    private String surname;
    /** the user's address */
    private String address;
    /** the user's birthday */
    private LocalDate birthday;
    /**
     * the user's role ID, which shows if the user is only a gym member, an
     * employee, a trainer or an administrator
     */
    private int roleID;
    /** the user's username, credential used for login */
    private String username;
    /** the user's encrypted password, credential used for login */
    private String password;
    /** the user's email address */
    private String email;
    /** the user's bank account IBAN */
    private String IBAN;
    /** the user's initial weight */
    private double weight;
    /** the user's height */
    private int height;

    /**
     * User Constructor using fields, the primary keys userID and roleID will be set
     * up via setter method. This Constructor it is used for the clients
     */
    public User(int userID, String forename, String surname, String address, LocalDate birthday,
                int roleID, String username, String password, String email, String IBAN,
                double weight, int height) {
        this.userID = userID;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.birthday = birthday;
        this.roleID = roleID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.IBAN = IBAN;
        this.weight = weight;
        this.height = height;
    }

    /**
     * User Constructor used for the employees and trainers.
     */
    public User(String forename, String surname, String address, LocalDate birthday, String username, String password,
                String email, String iBAN) {
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
        this.email = email;
        this.IBAN = iBAN;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @return the forename
     */
    public String getForename() {
        return forename;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @return the roleID
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the iBAN
     */
    public String getIBAN() {
        return IBAN;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @param forename the forename to set
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @param roleID the roleID to set
     */
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param iBAN the iBAN to set
     */
    public void setIBAN(String iBAN) {
        this.IBAN = iBAN;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }


}
