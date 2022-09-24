import java.time.LocalDate;

public class Alumni extends AbstractPerson{
    private String yearOfGraduation;
    private String company;
    public Alumni(){}
    public Alumni(String gender, String bloodGroup, String mobileNumber, String department, LocalDate dob, LocalDate doj, String yearOfGraduation, String company)
    {
        super(gender,bloodGroup,mobileNumber,department,dob,doj);
        this.yearOfGraduation=yearOfGraduation;
        this.company=company;
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
    public void setYearOfGraduation(String yearOfGraduation)
    {
        this.yearOfGraduation=yearOfGraduation;
    }
    public void setCompany(String company)
    {
        this.company=company;
    }
    public String getYearOfGraduation(){return this.yearOfGraduation;}
    public String getCompany(){return this.company;}
}
