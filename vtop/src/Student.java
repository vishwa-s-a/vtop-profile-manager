import java.time.LocalDate;

public class Student extends AbstractPerson{
    private String regNumber;
    private String program;
    public Student(){}
    public Student(String gender,String bloodGroup,String mobileNumber,String department,LocalDate dob,LocalDate doj,String regNumber,String program)
    {
        super(gender,bloodGroup,mobileNumber,department,dob,doj);
        this.regNumber=regNumber;
        this.program=program;
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
    public void setRegNumber(String regNumber)
    {
        this.regNumber=regNumber;
    }
    public void setProgram(String Program)
    {
        this.program=program;
    }
    public String getRegNumber(){return this.regNumber;}
    public String getProgram(){return this.program;}
}
