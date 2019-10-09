package com.ridezum;

public class User {


    private String fullName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private String linkedInURL;
    private String portfolioURL;
    private String additionalInformation;

    public User(String fullName, String firstName, String lastName, String email, String phone,
                String company, String linkedInURL, String portfolioURL, String additionalInformation) {
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.linkedInURL = linkedInURL;
        this.portfolioURL = portfolioURL;
        this.additionalInformation = additionalInformation;
    }

    public String getFullName() {
        return this.fullName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getCompany() {
        return this.company;
    }
    public String getLinkedInURL() {
        return this.linkedInURL;
    }

    public String getPortfolioURL() {
        return this.portfolioURL;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
}


