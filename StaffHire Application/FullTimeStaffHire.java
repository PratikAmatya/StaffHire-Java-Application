/**
 * This application is designed to 
 * represent Staff Hire,together with two subclasses to represent a Full-time Staff and a Part-time Staff respectively
 * @version 0.1
 * @author Pratik
 */
//declaring the attributes name
public class FullTimeStaffHire extends StaffHire{
        private int salary;
        private int workingHour;
        private String staffName;
        private String joiningDate;
        private String qualification;
        private String appointedBy;
        private boolean joined;
        //the constructor class of the class FullTimeStaffHire
        public FullTimeStaffHire(String designation,String jobType,int vacancyNumber,int salary,int workingHour){
                super(designation,jobType,vacancyNumber);
                this.salary=salary;
                this.workingHour=workingHour;
                this.staffName="";    
                this.joiningDate="";
                this.qualification="";
                this.appointedBy="";   
                this.joined=false;
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
                System.out.println("The staff has already been hired whose name is "+this.staffName+ " and the date that they joined is"+this.joiningDate);
                }
         }
         //declaring setter method for salary
        public void setSalary(int salary){
                if (this.joined==false){
                    this.salary=salary;
                }else{
                    System.out.println("The staff has already joined. Therefore,you cannot salary change.");  
                }
        }
        //declaring setter method for workingHour
        public void setWorkingHour(int workingHour){
                this.workingHour=workingHour;
        }
        // displaying the designation,jobtype and the vacancy number from the superclass StaffHire and staffName, salary,working hour,,joining date, qualification and appointed by from above if joined is true
        public void display(){
                System.out.println("------------------Full-Time-Staff------------------");
                super.display();
                if (this.joined==true){
                    System.out.println("Staffname: "+this.staffName);
                    System.out.println("Salary: "+this.salary);
                    System.out.println("Working Hours: "+this.workingHour);
                    System.out.println("Joining date: "+this.joiningDate);
                    System.out.println("Qualification: "+this.qualification);
                    System.out.println("Appointed by: "+this.appointedBy);
                    System.out.println("---------------------------------------------------");
            }   
        }
        //declaring getter method for all attributes
        public int getSalary() {
            return salary; //The getSalary() method returns the value of salary as float datatype. 
        }
        public int getWorkingHour() {
            return workingHour;//The getWorkingHour() method returns the value of working hour as float datatype.  
        }
        public String getStaffName() {
            return staffName; //The getStaffName() method returns the value of staff name as string datatype. 
        }
        public String getJoiningDate() {
            return joiningDate; //The getJoiningDate() method returns the value of joining date as string datatype. 
        }
        public String getQualification() {
            return qualification;//The getQualification() method returns the value of qualification as string datatype. 
        }
        public String getAppointedBy() {
            return appointedBy;//The getAppointedBy() method returns the value of Appointed By as string datatype. 
        }
        public boolean getJoined() {
            return joined;//The getJoined() method returns the value of joined as boolean datatype. 
        }
} 

  
         
    
 




 
