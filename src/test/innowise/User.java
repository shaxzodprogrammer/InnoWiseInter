package test.innowise;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String firstLevelRole;
    private String secondLevelRole;
    private String thirdLeveRole;
    private String firstPhoneNumber;
    private String secondPhoneNumber;
    private String thirdPhoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstLevelRole() {
        return firstLevelRole;
    }

    public void setFirstLevelRole(String firstLevelRole) {
        this.firstLevelRole = firstLevelRole;
    }

    public String getSecondLevelRole() {
        return secondLevelRole;
    }

    public void setSecondLevelRole(String secondLevelRole) {
        this.secondLevelRole = secondLevelRole;
    }

    public String getThirdLeveRole() {
        return thirdLeveRole;
    }

    public void setThirdLeveRole(String thirdLeveRole) {
        this.thirdLeveRole = thirdLeveRole;
    }

    public String getFirstPhoneNumber() {
        return firstPhoneNumber;
    }

    public void setFirstPhoneNumber(String firstPhoneNumber) {
        this.firstPhoneNumber = firstPhoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getThirdPhoneNumber() {
        return thirdPhoneNumber;
    }

    public void setThirdPhoneNumber(String thirdPhoneNumber) {
        this.thirdPhoneNumber = thirdPhoneNumber;
    }

    public void printUserInfo(){
        System.out.println(this.getFirstName());
        System.out.println(this.getLastName());
        System.out.println(this.getEmail());

        if (this.firstLevelRole != null){
            System.out.println(this.firstLevelRole);
        }else {
            System.out.println("test.inniwise.User have no first level role");
        }

        if (this.secondLevelRole != null){
            System.out.println(this.getSecondLevelRole());
        }else {
            System.out.println("test.inniwise.User have no second level role");
        }

        if (this.thirdLeveRole != null){
            System.out.println(this.getThirdLeveRole());
        }else {
            System.out.println("test.inniwise.User have no third level role");
        }

        System.out.println(this.getFirstPhoneNumber());

        if (this.getSecondPhoneNumber() != null) {
            System.out.println(this.getSecondPhoneNumber());
        } else {
            System.out.println("test.inniwise.User have no second number");
        }
        if (this.getThirdPhoneNumber() != null) {
            System.out.println(this.getThirdPhoneNumber());
        } else {
            System.out.println("test.inniwise.User have no third number");
        }
    }
}
