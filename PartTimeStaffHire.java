

/**
 * This class is the subclass of Staffhire class that is used to hire Part Time staffs
 *
 */
public class PartTimeStaffHire extends StaffHire
{
    //declaring instance variables 
    private int wagesPerHour;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
   
    //creating a constructor for setting the default values
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
      super(vacancyNumber, designation, jobType);//calling the parent class to use their constructor. 
      this.wagesPerHour = wagesPerHour;
      this.workingHour = workingHour;
      this.shifts = shifts;
      staffName = "";
      joiningDate = "";
      qualification = "";
      joined = false;
      appointedBy = "";
      joined = false;
      terminated = false;
    }
    //getter method for return value to the correspoding variable
    public int getWagesPerHour (){
       return wagesPerHour;
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
     //getter method for return value to the correspoding variable
    public boolean getTerminated(){
        return terminated;
     }
     //getter method for return value to the correspoding variable
    public String getShifts(){
        return shifts;
     }
     
     public void setJoined(boolean joined){
       this.joined = joined;
    }
    //setter method that changes the shift, if the staff is not hired yet
    public void setShifts (String shifts){
        if (getJoined() == false){
            this.shifts = shifts;
         }
        else{
            System.out.println("The staff has already been appointed to a shift, the shift cannot be changed.");  //message to be displayed if the staff is already hired.
         }
     }
    //a method that is used to hire full time staff 
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (getJoined() == true){
            System.out.println("The staff is already appointed");//message to be displayed if the staff is already hired
            System.out.println("Staff name = "+ getStaffName());
            System.out.println("Joined Date = "+ getJoiningDate());
         }
        else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
         }
     }
    //a setter method that is used to terminate a hired staff
    public void setTerminated(){
        if (getTerminated() == true){
            System.out.println("This Staff has already been terminated");//message to be displayed if the staff is already terminated
         }
        else{
            staffName = "";
            joiningDate = "";
            qualification = "";
            appointedBy = "";
            joined = false;
            terminated = true;
         }
      }
      //a method that displays all the details of a staff if a staff is hired
    public void displayStaffDetails(){
        if(getJoined() == true){
            super.displayStaffDetails();//calling the parent class to use their constructor.
            System.out.println("Staff name = "+ getStaffName());
            System.out.println("Wages per hour = "+ getWagesPerHour());
            System.out.println("Joined Date = "+ getJoiningDate());
            System.out.println("Working Hour = "+ getWorkingHour());
            System.out.println("Qualification = "+ getQualification());
            System.out.println("Appointed by = "+ getAppointedBy());
            System.out.println("Income per Day = "+ getWagesPerHour()*getWorkingHour());
       }
       else{
           super.displayStaffDetails();//calling the parent class to use their constructor.
           System.out.println("No Staffs have been appointed");//message to be displayed if staff is not hired yet.
        }
    }    
    
    
} 
     
   
    
   
   
   
    
    
