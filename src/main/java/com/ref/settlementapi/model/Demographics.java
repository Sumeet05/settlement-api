package com.ref.settlementapi.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "familySize",
        "dateOfArrival",
        "familyName",
        "firstName",
        "gender",
        "dob",
        "ages",
        "cOO",
        "maritalStatus",
        "relationship",
        "temporaryLocations",
        "room",
        "moveoutDate",
        "age6AndUnder",
        "employment",
        "yearsExp",
        "sector",
        "publicGR",
        "postSecondary"
})
public class Demographics {
    @JsonProperty("familySize")
    private String familySize;
    @JsonProperty("dateOfArrival")
    private String dateOfArrival;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("dob")
    private String dob;
    @JsonProperty("ages")
    private String ages;
    @JsonProperty("cOO")
    private String cOO;
    @JsonProperty("maritalStatus")
    private String maritalStatus;
    @JsonProperty("relationship")
    private String relationship;
    @JsonProperty("temporaryLocations")
    private String temporaryLocations;
    @JsonProperty("room")
    private String room;
    @JsonProperty("moveoutDate")
    private String moveoutDate;
    @JsonProperty("age6AndUnder")
    private String age6AndUnder;
    @JsonProperty("employment")
    private String employment;
    @JsonProperty("yearsExp")
    private String yearsExp;
    @JsonProperty("sector")
    private String sector;
    @JsonProperty("publicGR")
    private String publicGR;
    @JsonProperty("postSecondary")
    private String postSecondary;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("familySize")
    public String getFamilySize() {
        return familySize;
    }

    @JsonProperty("familySize")
    public void setFamilySize(String familySize) {
        this.familySize = familySize;
    }

    @JsonProperty("dateOfArrival")
    public String getDateOfArrival() {
        return dateOfArrival;
    }

    @JsonProperty("dateOfArrival")
    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(String dob) {
        this.dob = dob;
    }

    @JsonProperty("ages")
    public String getAges() {
        return ages;
    }

    @JsonProperty("ages")
    public void setAges(String ages) {
        this.ages = ages;
    }

    @JsonProperty("cOO")
    public String getcOO() {
        return cOO;
    }

    @JsonProperty("cOO")
    public void setcOO(String cOO) {
        this.cOO = cOO;
    }

    @JsonProperty("maritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    @JsonProperty("maritalStatus")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @JsonProperty("temporaryLocations")
    public String getTemporaryLocations() {
        return temporaryLocations;
    }

    @JsonProperty("temporaryLocations")
    public void setTemporaryLocations(String temporaryLocations) {
        this.temporaryLocations = temporaryLocations;
    }

    @JsonProperty("room")
    public String getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @JsonProperty("moveoutDate")
    public String getMoveoutDate() {
        return moveoutDate;
    }

    @JsonProperty("moveoutDate")
    public void setMoveoutDate(String moveoutDate) {
        this.moveoutDate = moveoutDate;
    }

    @JsonProperty("age6AndUnder")
    public String getAge6AndUnder() {
        return age6AndUnder;
    }

    @JsonProperty("age6AndUnder")
    public void setAge6AndUnder(String age6AndUnder) {
        this.age6AndUnder = age6AndUnder;
    }

    @JsonProperty("employment")
    public String getEmployment() {
        return employment;
    }

    @JsonProperty("employment")
    public void setEmployment(String employment) {
        this.employment = employment;
    }

    @JsonProperty("yearsExp")
    public String getYearsExp() {
        return yearsExp;
    }

    @JsonProperty("yearsExp")
    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    @JsonProperty("sector")
    public String getSector() {
        return sector;
    }

    @JsonProperty("sector")
    public void setSector(String sector) {
        this.sector = sector;
    }

    @JsonProperty("publicGR")
    public String getPublicGR() {
        return publicGR;
    }

    @JsonProperty("publicGR")
    public void setPublicGR(String publicGR) {
        this.publicGR = publicGR;
    }

    @JsonProperty("postSecondary")
    public String getPostSecondary() {
        return postSecondary;
    }

    @JsonProperty("postSecondary")
    public void setPostSecondary(String postSecondary) {
        this.postSecondary = postSecondary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Demographics{" +
                "familySize='" + familySize + '\'' +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", familyName='" + familyName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", ages='" + ages + '\'' +
                ", cOO='" + cOO + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}
