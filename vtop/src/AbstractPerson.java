import java.time.LocalDate;
abstract class AbstractPerson {
    protected Name name;
    protected Address address;
    protected String gender;
    protected String bloodGroup;
    protected String mobileNumber;
    protected String department;
    protected LocalDate dob;
    protected LocalDate doj;
    public AbstractPerson(){}
    public AbstractPerson(String gender,String bloodGroup,String mobileNumber,String department,LocalDate dob,LocalDate doj)
    {
        this.doj=doj;
        this.bloodGroup=bloodGroup;
        this.gender=gender;
        this.dob=dob;
        this.mobileNumber=mobileNumber;
        this.department=department;
    }
    public abstract void setName(String a,String b,String c);
    public abstract void setAddress(String doorNumber,String area,String landmark,String district,String state,Integer pincode);
    public abstract  void setMobileNumber(String mobileNumber);
    public abstract void setDepartment(String department);
    public abstract void setDob(LocalDate dob);
    public abstract void setGender(String gender);
    public abstract void setBloodGroup(String bloodGroup);
    public void setDoj(LocalDate doj){this.doj=doj;}
    public String getName(){return this.name.toString();}
    public String getAddress(){return  this.address.toString();}
    public String getMobileNumber(){return this.mobileNumber;}
    public String getDepartment(){return this.department;}
    public String getGender(){return this.gender;}
    public String getBloodGroup(){return this.bloodGroup;}
    public String getDoj(){return doj.toString();}
    public String getDob(){return dob.toString();}
}
