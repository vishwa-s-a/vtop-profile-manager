import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    static String firstName,middleName,lastName,doorNumber,area,landmark,district,state,gender,bloodGroup,mobileNumber,department,dob,doj;
    static Integer pincode,i=0,j=0,k=0,v=0;
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        firstName=sc.next();
        System.out.print("Enter the Middle Name: ");
        middleName=sc.next();
        System.out.print("Enter the Last Name: ");
        lastName=sc.next();
        System.out.println("Enter Address: ");
        System.out.println("Enter Door Number and Building details: ");
        sc.nextLine();
        doorNumber=sc.nextLine();
        System.out.print("Area: ");
        area= sc.nextLine();
        System.out.print("Landmark: ");
        landmark=sc.nextLine();
        System.out.print("District: ");
        district= sc.next();
        System.out.print("State: ");
        state=sc.next();
        System.out.print("Pincode: ");
        pincode=sc.nextInt();
        System.out.print("Gender: ");
        gender=sc.next();
        System.out.print("blood group: ");
        bloodGroup=sc.next();
        System.out.print("Mobile Number: ");
        mobileNumber=sc.next();
        System.out.print("Department: ");
        department=sc.next();
        System.out.print("Date of Birth(yyyy-mm-dd): ");
        dob=sc.next();
        System.out.print("Date of joining(yyyy-mm-dd): ");
        doj=sc.next();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student[]=new Student[10];
        Faculty faculty[]=new Faculty[10];
        Alumni alumni[]=new Alumni[10];
        Staff staff[]=new Staff[10];
        while(true)
        {
            System.out.println("*****************************************************************************************");
            System.out.println("                             Welcome to VTOP Profile Manager                                     ");
            System.out.println("           Press 1 for Student section");
            System.out.println("           Press 2 for Staff section");
            System.out.println("           Press 3 for Faculty section");
            System.out.println("           Press 4 for Alumni section");
            System.out.println("           Press 0 to exit the Manager");
            System.out.print("Choice: ");
            Integer choice=sc.nextInt();
            if(choice==0)
                System.exit(0);
            else if(choice==1)
            {
                while(true)
                {
                    System.out.println("press 1 to set new profile ");
                    System.out.println("Press 2 to get information of a particular student ");
                    System.out.println("press 0 to go back to main page");
                    System.out.print("Choice: ");
                    Integer choice1=sc.nextInt();
                    if(choice1==1)
                    {
                        input();
                        System.out.print("Enter register number: ");
                        String regNumber=sc.next();
                        System.out.print("Enter Program currently enrolled: ");
                        String program=sc.next();
                        student[i]=new Student(gender,bloodGroup,mobileNumber,department, LocalDate.parse(dob),LocalDate.parse(doj),regNumber,program);
                        student[i].setName(firstName,middleName,lastName);
                        student[i].setAddress(doorNumber,area,landmark,district,state,pincode);
                        i++;
                    }
                    else if(choice1==0)
                    {
                        System.out.println("Going to main page.");
                        break;
                    }
                    else
                    {
                        if(i==0)
                        {
                            System.out.println("No records stored to display, going back to main page");
                            break;
                        }
                        System.out.print("Enter the first name of the student: ");
                        String testName=sc.next();
                        int z;
                        for(z=0;z<i;z++)
                        {
                            if(testName.equalsIgnoreCase(student[z].name.getFirstName()))
                                break;
                        }
                        System.out.println("full name of the student is: "+student[z].getName());
                        System.out.println("Reg Number: "+student[z].getRegNumber());
                        System.out.println("address:\n"+student[z].getAddress());

                    }
                }


            }
            else if(choice==2)
            {
                while(true)
                {
                    System.out.println("press 1 to set new profile ");
                    System.out.println("Press 2 to get information of a particular staff ");
                    System.out.println("press 0 to go back to main page");
                    System.out.print("Choice: ");
                    Integer choice2=sc.nextInt();
                    if(choice2==1)
                    {
                        input();
                        System.out.print("Enter your salary: ");
                        String salary=sc.next();
                        System.out.print("Enter your Employee Id: ");
                        String empId=sc.next();
                        staff[k]=new Staff(gender,bloodGroup,mobileNumber,department, LocalDate.parse(dob),LocalDate.parse(doj),salary,empId);
                        staff[k].setName(firstName,middleName,lastName);
                        staff[k].setAddress(doorNumber,area,landmark,district,state,pincode);
                        k++;
                    }
                    else if(choice2==0)
                    {
                        System.out.println("Going to main page.");
                        break;
                    }
                    else
                    {
                        if(k==0)
                        {
                            System.out.println("No records stored to display, going back to main page");
                            break;
                        }
                        System.out.print("Enter the first name of the staff: ");
                        String testName=sc.next();
                        int z;
                        for(z=0;z<k;z++)
                        {
                            if(testName.equalsIgnoreCase(staff[z].name.getFirstName()))
                                break;
                        }
                        System.out.println("full name of the staff is: "+staff[z].getName());
                        System.out.println("Employee Id: "+staff[z].getEmpId());
                        System.out.println("address:\n"+staff[z].getAddress());
                    }
                }

            }
            else if(choice==3)
            {
                while(true)
                {
                    System.out.println("press 1 to set new profile ");
                    System.out.println("Press 2 to get information of a particular faculty");
                    System.out.println("press 0 to go back to main page");
                    System.out.print("Choice: ");
                    Integer choice3=sc.nextInt();
                    if(choice3==1)
                    {
                        input();
                        System.out.print("Enter your salary: ");
                        String salary=sc.next();
                        System.out.print("Enter your Employee Id: ");
                        String empId=sc.next();
                        faculty[j]=new Faculty(gender,bloodGroup,mobileNumber,department, LocalDate.parse(dob),LocalDate.parse(doj),salary,empId);
                        faculty[j].setName(firstName,middleName,lastName);
                        faculty[j].setAddress(doorNumber,area,landmark,district,state,pincode);
                        j++;
                    }
                    else if(choice3==0)
                    {
                        System.out.println("Going to main page.");
                        break;
                    }
                    else
                    {
                        if(j==0)
                        {
                            System.out.println("No records stored to display, going back to main page");
                            break;
                        }
                        System.out.print("Enter the first name of the faculty: ");
                        String testName=sc.next();
                        int z;
                        for(z=0;z<j;z++)
                        {
                            if(testName.equalsIgnoreCase(faculty[z].name.getFirstName()))
                                break;
                        }
                        System.out.println("full name of the staff is: "+faculty[z].getName());
                        System.out.println("Employee Id: "+faculty[z].getEmpId());
                        System.out.println("address:\n"+faculty[z].getAddress());
                    }
                }

            }
            else
            {
                while(true)
                {
                    System.out.println("press 1 to set new profile ");
                    System.out.println("Press 2 to get information of a particular alumni ");
                    System.out.println("press 0 to go back to main page");
                    System.out.print("Choice: ");
                    Integer choice4=sc.nextInt();
                    if(choice4==1)
                    {
                        input();
                        System.out.print("Enter your Year of graduation: ");
                        String yearOfGraduation=sc.next();
                        System.out.print("Enter your Company's name: ");
                        String company=sc.next();
                        alumni[v]=new Alumni(gender,bloodGroup,mobileNumber,department, LocalDate.parse(dob),LocalDate.parse(doj),yearOfGraduation,company);
                        alumni[v].setName(firstName,middleName,lastName);
                        alumni[v].setAddress(doorNumber,area,landmark,district,state,pincode);
                        v++;
                    }
                    else if(choice4==0)
                    {
                        System.out.println("Going to main page.");
                        break;
                    }
                    else
                    {
                        if(v==0)
                        {
                            System.out.println("No records stored to display, going back to main page");
                            break;
                        }
                        System.out.print("Enter the first name of the alumni: ");
                        String testName=sc.next();
                        int z;
                        for(z=0;z<v;z++)
                        {
                            if(testName.equalsIgnoreCase(alumni[z].name.getFirstName()))
                                break;
                        }
                        System.out.println("full name of the alumni is: "+alumni[z].getName());
                        System.out.println("Year of graduation: "+alumni[z].getYearOfGraduation());
                        System.out.println("address:\n"+alumni[z].getAddress());
                    }
                }

            }
        }


    }
}