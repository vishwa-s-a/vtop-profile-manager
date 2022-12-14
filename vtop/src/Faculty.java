/**
 * @author vishwa shivanand appaji
 * @since  24-09-2022
 * This class inherits from AbstractPerson class and also has its own other private properties and public methods
 * This class is meant for storing and accessing the faculty's details.
 * It has constructors and toString() methods for accessing the faculty's details
 * getters and setters are there to accessing and modifying the properties
 */
import java.time.LocalDate;

public class Faculty extends AbstractPerson {
    private String salary;
    private String empId;
    public Faculty(){}
    public Faculty(String gender,String bloodGroup,String mobileNumber,String department,LocalDate dob,LocalDate doj,String salary,String empId)
    {
        super(gender,bloodGroup,mobileNumber,department,dob,doj);
        this.salary=salary;
        this.empId=empId;
    }
    @Override
    public  void setName(String a,String b,String c)
    {
        name=new Name(a,b,c);
    }
    @Override
    public  void setAddress(String doorNumber,String area,String landmark,String district,String state,Integer pincode)
    {
        address =new Address(doorNumber,area,landmark,district,state,pincode);
    }
    public  void setMobileNumber(String mobileNumber)
    {
        super.mobileNumber=mobileNumber;
    }
    public  void setDepartment(String department)
    {
        super.department=department;
    }
    public  void setDob(LocalDate dob)
    {
        super.dob=dob;
    }
    public  void setGender(String gender)
    {
        super.gender=gender;
    }
    public  void setBloodGroup(String bloodGroup){
        super.bloodGroup=bloodGroup;
    }
    public void setEmpId(String empId)
    {
        this.empId=empId;
    }
    public void setSalary(String salary)
    {
        this.salary=salary;
    }
    public String getEmpId(){return this.empId;}
    public String getSalary(){return this.salary;}
}
