package model;

class User{

    private String role;
    private String registrationNumber;
    private String title;
    private String firstName;
    private String lastName;
    
    public User(String role,String registrationNumber,String title,String firstName,String lastName){
        this.role=role;
        this.registrationNumber=registrationNumber;
        this.title=title;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    /*setters*/
    public String getRole(){
        return role;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getTitle(){
        return title;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    /*Setters let you update or set variables individually, without recreating the object. after object creation*/
    /*setters*/

    public void setRole(String role){
        this.role=role;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}