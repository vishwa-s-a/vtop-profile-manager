/**
 * @author vishwa shivanand appaji
 * @since 24-09-2022
 * This class is used by other classes for storing user defined custom data type
 * This class is meant for storing students first name, middle name, last name.
 * Using constructors we capitalize and set the properties.
 * toString() method returns name of the student in required pattern as: firstName middleName lastName
 * We also have getters and setters to modify the properties of this class
 */
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
