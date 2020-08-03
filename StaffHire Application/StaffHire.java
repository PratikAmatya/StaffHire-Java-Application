/**
 * This application is designed to 
 * represent Staff Hire,together with two subclasses to represent a Full-time Staff and a Part-time Staff respectively
 * @version 0.1
 * @author Pratik
 */
//declaring the attributes name
public class StaffHire{
        private int vacancyNumber;//the unique number given to each vacancy
        private String designation;//string that contains the post 
        private String jobType;//string containing whether the job type is fulltime or parttime
        //the constructor class of the class StaffHire 
            public StaffHire(String designation,String jobType,int vacancyNumber){
                this.designation=designation;
                this.jobType=jobType;
                this.vacancyNumber=vacancyNumber;
            }
            //declaring getter method for all attributes
            public int getVacancyNumber(){  
                return this.vacancyNumber;//The getvacancyNumber() method returns the value of vacancy number as int datatype.
            }  
            public String getDesignation(){  
                return this.designation;//The getdesignation() method returns the value of designation as string datatype.
            }  
            public String getJobType(){  
                return this.jobType;//The getjobType() method designation returns the value of job type as string datatype.
            }
            //declaring setter method for all attributes
            public void setVacancyNumber(int vacancyNumber){  
                this.vacancyNumber=vacancyNumber;
            }  
            public void setDesignation(String designation){  
                this.designation=designation;
            }  
            public void setJobType(String jobType){  
                this.jobType=jobType;
            }
            // displaying the designation,jobtype and the vacancy number
            public void display(){
                    System.out.println("---------------------------------------------------");
                    System.out.println("Designation: "+designation);
                    System.out.println("Job Type: "+jobType);
                    System.out.println("Vacancy Number: "+vacancyNumber);
                    System.out.println("---------------------------------------------------");
            }
}

 
