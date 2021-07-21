
/**
 * This class contains the constructor and a display method that is required by both the sub classes
 *
 *  
 *
 */
public class StaffHire
{
    //declaring the instance variables
    private String designation;
    private String jobType; 
    private int vacancyNumber;
    //creating the constructor
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.jobType = jobType;
        this.designation = designation;
    } 
    //getter method for return value to the correspoding variable
    public int getVacancyNumber(){
        return vacancyNumber;
    }  
    //setter method for initializing the instance variable 
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }
    //getter method for return value to the correspoding variable
    public String getDesignation(){
        return designation;
    }
    //setter method for initializing the instance variable
    public void setVesignation(String designation){
        this.designation = designation;
    }
    //getter method for return value to the correspoding variable
    public String getJobType(){
        return jobType;
    }
    //setter method for initializing the instance variable
    public void setJobType(String jobType){
        this.jobType = jobType;
    }
    //a display method that displays name, designation and jobtype
    public void displayStaffDetails(){
        System.out.println("Vacancy Number = "+ getVacancyNumber());
        System.out.println("Designation = "+ getDesignation());
        System.out.println("Job Type = "+ getJobType());
        
        
    }
    
}
