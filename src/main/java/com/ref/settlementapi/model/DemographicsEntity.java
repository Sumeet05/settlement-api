package com.ref.settlementapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "demographics")
public class DemographicsEntity {

    @Id
    private String id;
    private String familySize;
    private String dateOfArrival;
    private String familyName;
    private String firstName;
    private String gender;
    private String dob;
    private String ages;
    private String cOO;
    private String maritalStatus;
    private String relationship;
    private String temporaryLocations;
    private String room;
    private String moveoutDate;
    private String age6AndUnder;
    private String employment;
    private String yearsExp;
    private String sector;
    private String publicGR;
    private String postSecondary;

    public DemographicsEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamilySize() {
        return familySize;
    }

    public void setFamilySize(String familySize) {
        this.familySize = familySize;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAges() {
        return ages;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public String getcOO() {
        return cOO;
    }

    public void setcOO(String cOO) {
        this.cOO = cOO;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getTemporaryLocations() {
        return temporaryLocations;
    }

    public void setTemporaryLocations(String temporaryLocations) {
        this.temporaryLocations = temporaryLocations;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getMoveoutDate() {
        return moveoutDate;
    }

    public void setMoveoutDate(String moveoutDate) {
        this.moveoutDate = moveoutDate;
    }

    public String getAge6AndUnder() {
        return age6AndUnder;
    }

    public void setAge6AndUnder(String age6AndUnder) {
        this.age6AndUnder = age6AndUnder;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getPublicGR() {
        return publicGR;
    }

    public void setPublicGR(String publicGR) {
        this.publicGR = publicGR;
    }

    public String getPostSecondary() {
        return postSecondary;
    }

    public void setPostSecondary(String postSecondary) {
        this.postSecondary = postSecondary;
    }
}
