import java.time.LocalDate;

public class Staff extends AbstractPerson{
    private String salary;
    private String empId;
    public Staff(){}
    public Staff(String gender,String bloodGroup,String mobileNumber,String department,LocalDate dob,LocalDate doj,String salary,String empId)
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
