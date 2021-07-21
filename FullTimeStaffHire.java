
/**
 * This class is the subclass of StaffHire class and is used to hire Full Time staffs.
 *
 */
public class FullTimeStaffHire extends StaffHire
{
    //declaring the instance variables
   private int salary;
   private int workingHour;
   private String staffName;
   private String joiningDate;
   private String qualification;
   private String appointedBy;
   private boolean joined;
   //constructor to set the default values
   public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int salary){
      super(vacancyNumber, designation, jobType); //calling the parent class to use their constructor.
      this.salary = salary;
      this.workingHour = workingHour;
      staffName = "";
      joiningDate = "";
      qualification = "";
      appointedBy = "";
      joined = false;
    }
   //getter method for return value to the correspoding variable
   public int getSalary (){
       return salary;
    }
   //getter method for return value to the correspoding variable
   public int getWorkingHour(){
       return workingHour;
    }
    //getter method for return value to the correspoding variable
   public String getStaffName(){
       return staffName;
    }
    //getter method for return value to the correspoding variable
   public String getJoiningDate(){
       return joiningDate;
    }
    //getter method for return value to the correspoding variable
   public String getQualification(){
       return qualification;
    }
    //getter method for return value to the correspoding variable
   public String getAppointedBy(){
       return appointedBy;
    }
    //getter method for return value to the correspoding variable
   public boolean getJoined(){
       return joined;
    }
    //setter method that sets a new salary if a staff is already hired. 
   public void setSalary(int newSalary){
       if (getJoined() == false){
           setSalary(newSalary);
        }
       else{
           System.out.println("The staff details have already been assigned, the salary won't change.");  //message to be displayed if staff is already hired
        }
    }
    //setter method that sets a new workingHour
   public void setWorkingHour(int workingHour){
       this.workingHour=workingHour;
    }
    
    public void setJoined(boolean joined){
       this.joined = joined;
    }
    //a method used to hire new Full time staff
   public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
       if (getJoined() == true){
           System.out.println("The staff is already appointed");//message to be displayed if staff is already hired.
           System.out.println("Staff name = "+ staffName);
           System.out.println("Joined Date = "+ joiningDate);
        }
       else{
           this.staffName = staffName;   
           this.joiningDate = joiningDate;
           this.qualification = qualification;
           this.appointedBy = appointedBy;
           joined = true;
        }
    }
    //a method used to display details of a staff if hired
   public void displayStaffDetails(){
       if(getJoined() == true){
           super.displayStaffDetails();//calling the parent class to use their constructor.
           System.out.println("Staff name = "+ getStaffName());
           System.out.println("Joined Date = "+ getJoiningDate());
           System.out.println("Salary = "+ getSalary());
           System.out.println("Working hour = "+getWorkingHour());
           System.out.println("Qualification = "+ getQualification());
           System.out.println("Appointed by = "+ getAppointedBy());     
        }
        
        else{
            super.displayStaffDetails();//calling the parent class to use their constructor.
            System.out.println("No Staffs have been appointed");//message to be displayed when staff is not hired.
        }
    }
    
    
   
   
}
