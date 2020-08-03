/**
 * This application is designed to 
 * represent Staff Hire,together with two subclasses to represent a Full-time Staff and a Part-time Staff respectively
 * @version 0.1
 * @author Pratik
 */
//declaring the attributes name
public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;   
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //the constructor class of the class PartTimeStaffHire
    public PartTimeStaffHire(String designation,String jobType,int vacancyNumber,int workingHour,int wagesPerHour,String shifts){
        super(designation,jobType,vacancyNumber);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName="";
        joiningDate="";
        qualification=""; 
        appointedBy="";
        this.joined=false;
        this.terminated=false;
    }
    //declaring getter method for all attributes
    public float getWorkingHour() {
        return workingHour ;//The getWorkingHour() method returns the value of working hour as int datatype.  
    }
    public float getWagesPerHour() {
        return wagesPerHour;//The getWagesPerHour() method returns the value of wages per hour as int datatype.
    }
    public String getStaffName() {
        return staffName;//The getStaffName() method returns the value of staff Name as String datatype.
    }
    public String getJoiningDate() {
     return joiningDate; //The getWorkingHour() method returns the value of working hour as int datatype.
    }
    public String getQualification() {
     return qualification;//The getQualification() method returns the value of qualification as string datatype.
    }
    public String getAppointedBy() {
     return appointedBy;//The getAppointed() method returns the value of appointed by  as string datatype.
    }
    public String getShifts() {
     return shifts;//The getShifts() method returns the value of shifts as string datatype.
    }
    public boolean getJoined() {
     return joined;//The getJoined() method returns the value of joined as boolean datatype.
    }
    public boolean getTerminated() {
     return terminated;//The getTerminated() method returns the value of terminated as boolean datatype.
    }
    //declaring setter method for shifts
    public void setShifts(String shifts){
        if (joined==false){
        this.shifts=shifts;//sets the new value to shifts if joined is false
        }else{
        System.out.println("Staff has already been hired.Shift cannot be changed.");
        }
    }
      //method to appoint the staff if the staff has not joined 
    public void hiring(String staffName,String joiningDate,String qualification,String appointedBy){
           if (this.joined==false){
                  this.staffName=staffName;
                  this.joiningDate=joiningDate;
                  this.qualification=qualification;
                  this.appointedBy=appointedBy; 
                  this.joined=true;
           }else{
                 System.out.print(this.staffName+" has already joined on "+this.joiningDate+"having"+this.qualification+"who was appointed by"+this.appointedBy); 
           }
    }
    //method to terminate the staff name if terminated is false
    public void terminate(){
        if (terminated==false){
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            this.joined=false; 
            this.terminated=true;
        }
    }
    // displaying the designation,jobtype and the vacancy number from the superclass StaffHire and staff name, wagesperhour,workingHour,joiningDate,qualification,appointedBy and total income from above if joined is true
    public void display(){
        System.out.println("------------------Part-Time-Staff------------------");
        super.display();
        if (this.joined==true){
            int totalincome;
            totalincome=wagesPerHour*workingHour;
            System.out.println("Staff Name: "+staffName);
            System.out.println("Wages Per Hour: "+wagesPerHour);
            System.out.println("Working Hours Per Day: "+workingHour);
            System.out.println("Joined Date: "+joiningDate);
            System.out.println("Qualification: "+qualification);
            System.out.println("Appointed By: "+appointedBy);
            System.out.println("Shift: "+shifts);
            System.out.println("Income per day: "+totalincome);
            System.out.println("---------------------------------------------------");
        }
    }
}