public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    public Name(String firstName,String middleName,String lastName)
    {
        this.firstName=firstName.toUpperCase();
        this.middleName=middleName.toUpperCase();
        this.lastName=lastName.toUpperCase();
    }
    public void setFirstName(String firstName){this.firstName=firstName.toUpperCase();}
    public void setLastName(String lastName){this.lastName=lastName.toUpperCase();}
    public void setMiddleName(String middleNameName){this.middleName=middleName.toUpperCase();}
    @Override
    public String toString()
    {
        return String.format("%s %s %s",this.firstName,this.middleName,this.lastName);
    }
    public String getFirstName(){return this.firstName.toUpperCase();}
    public String getMiddleName(){return this.middleName.toUpperCase();}
    public String getLastName(){return this.lastName.toUpperCase();}


}
