/**
 * This application is an GUI aplication is designed to 
 *  add vacancy and hire staff which may be a Full-time Staff or a Part-time Staff 
 * @version 0.1
 * @author Pratik
 */

// Importing essential java packages
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class INGNepal implements ActionListener{

    /**
     * MainFrame
     */
    
    private JFrame mainFrame;
    private JLabel INGnepalMainFrameLabel;
    private JLabel mainFrameInfoLabel;
    private JButton fullTimeStaffHireButton;
    private JButton partTimeStaffHireButton;
    private JButton displayMainFrameButton;

    /**
     *  For Part Time Staff Hire
     * */ 

    // JFrame
    private JFrame framePartTimeStaffHire;

    // JLabel
    private JLabel titlePartTimeLabel;
    private JLabel addVacancyPartTimeLabel;
    private JLabel vacancyNumberPartTimeLabel;
    private JLabel jobTypePartTimeLabel;
    private JLabel designationPartTimeLabel;
    private JLabel wagesPerHourPartTimeLabel;
    private JLabel workingHoursPerDayPartTimeLabel;
    private JLabel shiftPartTimeLabel;
    private JLabel appointPartTimeStaffHireLabel;
    private JLabel vacancyNumberAppointPartTimeLabel;
    private JLabel staffNameAppointPartTimeLabel;
    private JLabel joiningDateAppointPartTimeLabel;
    private JLabel appointedByAppointPartTimeLabel;
    private JLabel qualificationAppointPartTimeLabel;

   
    // JButton
    private JButton savePartTimeButton;
    private JButton clearPartTimeButton;
    private JButton displayPartTimeButton;
    private JButton terminatePartTimeButton;
    private JButton appointPartTimeButton;

    // JComboBox
    private JComboBox<String> jobTypePartTimeComboBox;
    private JComboBox<String> shiftPartTimeComboBox;
    private JComboBox<String> joiningDateYearAppointPartTimeComboBox;
    private JComboBox<String> joiningDateMonthAppointPartTimeComboBox;
    private JComboBox<String> joiningDateDayAppointPartTimeComboBox;
 

    // JTextField
    private JTextField vacancyNumberPartTimeTextField;
    private JTextField designationPartTimeTextField;
    private JTextField wagesPerHourPartTimeTextField;
    private JTextField workingHoursPerDayPartTimeTextField;
    private JTextField vacancyNumberAppointPartTimeTextField;
    private JTextField staffNameAppointPartTimeTextField;
    private JTextField qualificationAppointPartTimeTextField;
    private JTextField appointedByAppointPartTimeTextField;

    // JSeperator
    private JSeparator lineA;

    /**
     * Terminate Frame
    */
    private JFrame frameTerminate;
    private JLabel terminateLabel;
    private JTextField terminateVacancyNumberTextField;
    private JButton terminateCancelButton;
    private JButton terminateConfirmButton;


    /**
     *  For Full Time Staff Hire
     * */ 

    // JFrame
    private JFrame frameFullTimeStaffHire;

    // JLabel
    private JLabel titleFullTimeLabel;
    private JLabel addVacancyFullTimeLabel;
    private JLabel vacancyNumberFullTimeLabel;
    private JLabel jobTypeFullTimeLabel;
    private JLabel designationFullTimeLabel;
    private JLabel salaryFullTimeLabel;
    private JLabel workingHoursFullTimeLabel;
    private JLabel appointFullTimeStaffHireLabel;
    private JLabel vacancyNumberAppointFullTImeLabel;
    private JLabel staffNameAppointFullTimeLabel;
    private JLabel joiningDateAppointFullTimeLabel;
    private JLabel qualificationAppointFullTimeLabel;
    private JLabel appointedByAppointFullTimeLabel; 
    
     // JButton
    private JButton saveFullTimeButton;
    private JButton clearFullTimeButton;
    private JButton displayFullTimeButton;
    private JButton appointFullTimeButton;
 
     // JComboBox
    private JComboBox<String> jobTypeFullTimeComboBox;
    private JComboBox<String> joiningDateYearAppointFullTimeComboBox;
    private JComboBox<String> joiningDateMonthAppointFullTimeComboBox;
    private JComboBox<String> joiningDateDayAppointFullTimeComboBox;
  
    // JTextField
    private JTextField vacancyNumberFullTimeTextField;
    private JTextField designationFullTimeTextField;
    private JTextField salaryFullTimeTextField;
    private JTextField workingHoursFullTimeTextField;
    private JTextField vacancyNumberAppointFullTimeTextField;
    private JTextField staffNameAppointFullTimeTextField;
    private JTextField qualificationAppointFullTimeTextField;
    private JTextField appointedByAppointFullTimeTextField;

    // JSeperator
    private JSeparator lineB;
    
    // Declaring arraylist
    private ArrayList<StaffHire> staffList=new ArrayList<StaffHire>();
 
    PartTimeStaffHire partTimeStaff_obj;
    FullTimeStaffHire fullTimeStaff_obj;
    
    // Constructor of the class
    public INGNepal(){
        mainWindowGUI();
    }
    
    // Method containing GUI for the main window
    public void mainWindowGUI(){
        // Initializing JFrame 
        mainFrame = new JFrame("ING NEPAL");
        // Setting size of JFrame
        mainFrame.setSize(615,220);
        // Setting layout manager as null
        mainFrame.setLayout(null);
        // Setting frame as non resizable
        mainFrame.setResizable(false);

        // Initializing JLabel
        INGnepalMainFrameLabel = new JLabel("ING NEPAL");
        // Setting font for JLabel
        INGnepalMainFrameLabel.setFont(INGnepalMainFrameLabel.getFont().deriveFont(22f));
        // Setting bounds for JLabel
        INGnepalMainFrameLabel.setBounds(250,0,200,42);

        // Initializing JLabel
        mainFrameInfoLabel = new JLabel("Please click one of the buttons below :");
        // Setting bounds for JLabel
        mainFrameInfoLabel.setBounds(200,50,400,30);

        partTimeStaffHireButton = new JButton("Part Time Staff");
        partTimeStaffHireButton.setBounds(15,110,180,50);
        partTimeStaffHireButton.addActionListener(this);

        fullTimeStaffHireButton = new JButton("Full Time Staff");
        fullTimeStaffHireButton.setBounds(210,110,180,50);
        fullTimeStaffHireButton.addActionListener(this);
        
        displayMainFrameButton = new JButton("Display");
        displayMainFrameButton.setBounds(405,110,180,50);
        displayMainFrameButton.addActionListener(this);

        // Adding elements to the Frame
        mainFrame.add(INGnepalMainFrameLabel);
        mainFrame.add(mainFrameInfoLabel);
        mainFrame.add(partTimeStaffHireButton);
        mainFrame.add(fullTimeStaffHireButton);
        mainFrame.add(displayMainFrameButton);

        // Setting frame as visible
        mainFrame.setVisible(true);
    }

    // Method containing GUI for Part Time Staff
    public void PartTimeStaffHireGUI(){
        // Initializing JFrame
        framePartTimeStaffHire = new JFrame();
        framePartTimeStaffHire.setSize(610,630);
        framePartTimeStaffHire.setResizable(false);
        framePartTimeStaffHire.setLayout(null);
        framePartTimeStaffHire.setTitle("Part Time Staff");

        titlePartTimeLabel = new JLabel("For Part Time Staff");
        titlePartTimeLabel.setFont(titlePartTimeLabel.getFont().deriveFont(18f));
        titlePartTimeLabel.setBounds(215,0,400,30);

        addVacancyPartTimeLabel = new JLabel("Add Vacancy :");
        addVacancyPartTimeLabel.setFont(titlePartTimeLabel.getFont().deriveFont(17f));
        addVacancyPartTimeLabel.setBounds(40,40,400,30);

        vacancyNumberPartTimeLabel = new JLabel("Vacancy Number:");
        vacancyNumberPartTimeLabel.setBounds(40,90,120,30);

        vacancyNumberPartTimeTextField = new JTextField();
        vacancyNumberPartTimeTextField.setBounds(150,90,90,30);

        jobTypePartTimeLabel = new JLabel("Job Type:");
        jobTypePartTimeLabel.setBounds(370,90,60,30);

        String jobTypeArray[] = {"Part Time","Full Time"} ;
        jobTypePartTimeComboBox = new JComboBox<String>(jobTypeArray);
        jobTypePartTimeComboBox.setBounds(440,90,120,30);

        designationPartTimeLabel = new JLabel("Designation:");
        designationPartTimeLabel.setBounds(40,140,75,30);

        designationPartTimeTextField = new JTextField();
        designationPartTimeTextField.setBounds(120,140,120,30);

        wagesPerHourPartTimeLabel = new JLabel("Wages Per Hour:");
        wagesPerHourPartTimeLabel.setBounds(370,140,100,30);

        wagesPerHourPartTimeTextField = new JTextField();
        wagesPerHourPartTimeTextField.setBounds(480,140,80,30);

        workingHoursPerDayPartTimeLabel = new JLabel("Working Hours Per Day:");
        workingHoursPerDayPartTimeLabel.setBounds(40,190,150,30);

        workingHoursPerDayPartTimeTextField = new JTextField();
        workingHoursPerDayPartTimeTextField.setBounds(180,190,60,30);

        shiftPartTimeLabel = new JLabel("Shift:");
        shiftPartTimeLabel.setBounds(370,190,60,30);

        String shiftArray[] = {"Morning","Afternoon","Evening","Midnight"} ;
        shiftPartTimeComboBox = new JComboBox<String>(shiftArray);
        shiftPartTimeComboBox.setBounds(440,90,120,30);
        shiftPartTimeComboBox.setBounds(440,190,120,30);

        savePartTimeButton = new JButton("Save");
        savePartTimeButton.setBounds(440,240,120,40);
        savePartTimeButton.addActionListener(this);

        // A horizontal line separating add vacancy and  appointing staff textfields
        lineA = new JSeparator();
        lineA.setOrientation(SwingConstants.HORIZONTAL);
        lineA.setBounds(0,300,650,1);

        appointPartTimeStaffHireLabel = new JLabel("Appoint Part Time Staff Hire :");
        appointPartTimeStaffHireLabel.setBounds(40,320,300,30);
        appointPartTimeStaffHireLabel.setFont(appointPartTimeStaffHireLabel.getFont().deriveFont(17f));

        vacancyNumberAppointPartTimeLabel = new JLabel("Vacancy Number:");
        vacancyNumberAppointPartTimeLabel.setBounds(40,370,120,30);

        vacancyNumberAppointPartTimeTextField = new JTextField();
        vacancyNumberAppointPartTimeTextField.setBounds(150,370,90,30);

        staffNameAppointPartTimeLabel = new JLabel("Staff Name:");
        staffNameAppointPartTimeLabel.setBounds(370,370,90,30);

        staffNameAppointPartTimeTextField = new JTextField();
        staffNameAppointPartTimeTextField.setBounds(445,370,115,30);

        joiningDateAppointPartTimeLabel = new JLabel("Joining Date:");
        joiningDateAppointPartTimeLabel.setBounds(40,420,100,30);

        String joiningDateYearArray[] = {"YYYY","2020","2021","2022","2023","2024","2025"};
        joiningDateYearAppointPartTimeComboBox = new JComboBox<String>(joiningDateYearArray);
        joiningDateYearAppointPartTimeComboBox.setBounds(125, 420, 60, 30);

        String joiningDateMonthArray[]={"MM","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        joiningDateMonthAppointPartTimeComboBox = new JComboBox<String>(joiningDateMonthArray);
        joiningDateMonthAppointPartTimeComboBox.setBounds(190,420,52,30);


        String[] joiningDateDayArray = {"DD","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        joiningDateDayAppointPartTimeComboBox = new JComboBox<String>(joiningDateDayArray);
        joiningDateDayAppointPartTimeComboBox.setBounds(247,420,46,30);

        qualificationAppointPartTimeLabel = new JLabel("Qualification:");
        qualificationAppointPartTimeLabel.setBounds(370,420,90,30);

        qualificationAppointPartTimeTextField = new JTextField();
        qualificationAppointPartTimeTextField.setBounds(450,420,110,30);

        appointedByAppointPartTimeLabel = new JLabel("Appointed By:");
        appointedByAppointPartTimeLabel.setBounds(40,470,100,30);

        appointedByAppointPartTimeTextField = new JTextField();
        appointedByAppointPartTimeTextField.setBounds(150,470,90,30);

        clearPartTimeButton = new JButton("Clear");
        clearPartTimeButton.setBounds(40,530,126,40);
        clearPartTimeButton.addActionListener(this);

        displayPartTimeButton = new JButton("Display");
        displayPartTimeButton.setBounds(176,530,126,40);
        displayPartTimeButton.addActionListener(this);

        terminatePartTimeButton = new JButton("Terminate");
        terminatePartTimeButton.setBounds(312,530,126,40);
        terminatePartTimeButton.addActionListener(this);

        appointPartTimeButton = new JButton("Appoint");
        appointPartTimeButton.setBounds(448,530,126,40);
        appointPartTimeButton.addActionListener(this);

        // Adding components to the frame
        framePartTimeStaffHire.add(titlePartTimeLabel);
        framePartTimeStaffHire.add(addVacancyPartTimeLabel);
        framePartTimeStaffHire.add(vacancyNumberPartTimeLabel);
        framePartTimeStaffHire.add(vacancyNumberPartTimeTextField);
        framePartTimeStaffHire.add(jobTypePartTimeLabel);
        framePartTimeStaffHire.add(jobTypePartTimeComboBox);
        framePartTimeStaffHire.add(designationPartTimeLabel);
        framePartTimeStaffHire.add(designationPartTimeTextField);
        framePartTimeStaffHire.add(wagesPerHourPartTimeLabel);
        framePartTimeStaffHire.add(wagesPerHourPartTimeTextField);
        framePartTimeStaffHire.add(workingHoursPerDayPartTimeLabel);
        framePartTimeStaffHire.add(workingHoursPerDayPartTimeTextField);
        framePartTimeStaffHire.add(shiftPartTimeLabel);
        framePartTimeStaffHire.add(shiftPartTimeComboBox);
        framePartTimeStaffHire.add(savePartTimeButton);
        framePartTimeStaffHire.add(lineA);
        framePartTimeStaffHire.add(appointPartTimeStaffHireLabel);
        framePartTimeStaffHire.add(vacancyNumberAppointPartTimeLabel);
        framePartTimeStaffHire.add(vacancyNumberAppointPartTimeTextField);
        framePartTimeStaffHire.add(staffNameAppointPartTimeLabel);
        framePartTimeStaffHire.add(staffNameAppointPartTimeTextField);
        framePartTimeStaffHire.add(joiningDateAppointPartTimeLabel);
        framePartTimeStaffHire.add(joiningDateYearAppointPartTimeComboBox);
        framePartTimeStaffHire.add(joiningDateMonthAppointPartTimeComboBox);
        framePartTimeStaffHire.add(joiningDateDayAppointPartTimeComboBox);
        framePartTimeStaffHire.add(qualificationAppointPartTimeLabel);
        framePartTimeStaffHire.add(qualificationAppointPartTimeTextField);
        framePartTimeStaffHire.add(appointedByAppointPartTimeLabel);
        framePartTimeStaffHire.add(appointedByAppointPartTimeTextField);
        framePartTimeStaffHire.add(clearPartTimeButton);
        framePartTimeStaffHire.add(displayPartTimeButton);
        framePartTimeStaffHire.add(terminatePartTimeButton);
        framePartTimeStaffHire.add(appointPartTimeButton);

        // Setting frame as visible
        framePartTimeStaffHire.setVisible(true);
    }

    // method containing GUI for Full Time Staff
    public void FullTimeStaffHireGUI(){
        frameFullTimeStaffHire = new JFrame();
        frameFullTimeStaffHire.setSize(610,630);
        frameFullTimeStaffHire.setResizable(false);
        frameFullTimeStaffHire.setLayout(null);
        frameFullTimeStaffHire.setTitle("Full Time Staff");

        titleFullTimeLabel = new JLabel("For Full Time Staff");
        titleFullTimeLabel.setFont(titleFullTimeLabel.getFont().deriveFont(18f));
        titleFullTimeLabel.setBounds(215,0,400,30);

        addVacancyFullTimeLabel = new JLabel("Add Vacancy :");
        addVacancyFullTimeLabel.setFont(titleFullTimeLabel.getFont().deriveFont(17f));
        addVacancyFullTimeLabel.setBounds(40,40,400,30);

        vacancyNumberFullTimeLabel = new JLabel("Vacancy Number:");
        vacancyNumberFullTimeLabel.setBounds(40,90,120,30);

        vacancyNumberFullTimeTextField = new JTextField();
        vacancyNumberFullTimeTextField.setBounds(150,90,90,30);

        jobTypeFullTimeLabel = new JLabel("Job Type:");
        jobTypeFullTimeLabel.setBounds(370,90,60,30);

        String jobTypeArray[] = {"Full Time","Part Time"} ;
        jobTypeFullTimeComboBox = new JComboBox<String>(jobTypeArray);
        jobTypeFullTimeComboBox.setBounds(440,90,120,30);

        designationFullTimeLabel = new JLabel("Designation:");
        designationFullTimeLabel.setBounds(40,140,90,30);

        designationFullTimeTextField = new JTextField();
        designationFullTimeTextField.setBounds(120,140,120,30);
        
        salaryFullTimeLabel = new JLabel("Salary:");
        salaryFullTimeLabel.setBounds(370,140,50,30);

        salaryFullTimeTextField = new JTextField();
        salaryFullTimeTextField.setBounds(430,140,130,30);

        workingHoursFullTimeLabel = new JLabel("Working Hours:");
        workingHoursFullTimeLabel.setBounds(40,190,120,30);

        workingHoursFullTimeTextField = new JTextField();
        workingHoursFullTimeTextField.setBounds(170,190,70,30);

        saveFullTimeButton = new JButton("Save");
        saveFullTimeButton.setBounds(440,240,120,40);
        saveFullTimeButton.addActionListener(this);

        // Horizontal line
        lineB = new JSeparator();
        lineB.setOrientation(SwingConstants.HORIZONTAL);
        lineB.setBounds(0,300,650,1);

        appointFullTimeStaffHireLabel = new JLabel("Appoint Full Time Staff Hire :");
        appointFullTimeStaffHireLabel.setBounds(40,320,300,30);
        appointFullTimeStaffHireLabel.setFont(appointFullTimeStaffHireLabel.getFont().deriveFont(17f));

        vacancyNumberAppointFullTImeLabel = new JLabel("Vacancy Number:");
        vacancyNumberAppointFullTImeLabel.setBounds(40,370,120,30);

        vacancyNumberAppointFullTimeTextField = new JTextField();
        vacancyNumberAppointFullTimeTextField.setBounds(150,370,90,30);

        staffNameAppointFullTimeLabel = new JLabel("Staff Name:");
        staffNameAppointFullTimeLabel.setBounds(370,370,90,30);

        staffNameAppointFullTimeTextField = new JTextField();
        staffNameAppointFullTimeTextField.setBounds(445,370,115,30);

        joiningDateAppointFullTimeLabel = new JLabel("Joining Date:");
        joiningDateAppointFullTimeLabel.setBounds(40,420,100,30);

        String joiningDateYearArray[] = {"YYYY","2020","2021","2022","2023","2024","2025"};
        joiningDateYearAppointFullTimeComboBox = new JComboBox<String>(joiningDateYearArray);
        joiningDateYearAppointFullTimeComboBox.setBounds(125, 420, 60, 30);

        String joiningDateMonthArray[]={"MM","Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        joiningDateMonthAppointFullTimeComboBox = new JComboBox<String>(joiningDateMonthArray);
        joiningDateMonthAppointFullTimeComboBox.setBounds(190,420,52,30);


        String[] joiningDateDayArray = {"DD","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        joiningDateDayAppointFullTimeComboBox = new JComboBox<String>(joiningDateDayArray);
        joiningDateDayAppointFullTimeComboBox.setBounds(247,420,46,30);

        qualificationAppointFullTimeLabel = new JLabel("Qualification:");
        qualificationAppointFullTimeLabel.setBounds(370,420,90,30);

        qualificationAppointFullTimeTextField = new JTextField();
        qualificationAppointFullTimeTextField.setBounds(450,420,110,30);

        appointedByAppointFullTimeLabel = new JLabel("Appointed By:");
        appointedByAppointFullTimeLabel.setBounds(40,470,90,30);

        appointedByAppointFullTimeTextField = new JTextField();
        appointedByAppointFullTimeTextField.setBounds(130,470,110,30);

        clearFullTimeButton = new JButton("Clear");
        clearFullTimeButton.setBounds(40,530,160,40);
        clearFullTimeButton.addActionListener(this);

        displayFullTimeButton = new JButton("Display");
        displayFullTimeButton.setBounds(220,530,160,40);
        displayFullTimeButton.addActionListener(this);

        appointFullTimeButton = new JButton("Appoint");
        appointFullTimeButton.setBounds(400,530,160,40);
        appointFullTimeButton.addActionListener(this);

        // Adding components to the frame
        frameFullTimeStaffHire.add(titleFullTimeLabel);
        frameFullTimeStaffHire.add(addVacancyFullTimeLabel);
        frameFullTimeStaffHire.add(vacancyNumberFullTimeLabel);
        frameFullTimeStaffHire.add(vacancyNumberFullTimeTextField);
        frameFullTimeStaffHire.add(jobTypeFullTimeLabel);
        frameFullTimeStaffHire.add(jobTypeFullTimeComboBox);
        frameFullTimeStaffHire.add(designationFullTimeLabel);
        frameFullTimeStaffHire.add(designationFullTimeTextField);
        frameFullTimeStaffHire.add(salaryFullTimeLabel);
        frameFullTimeStaffHire.add(salaryFullTimeTextField);
        frameFullTimeStaffHire.add(workingHoursFullTimeLabel);
        frameFullTimeStaffHire.add(workingHoursFullTimeTextField);
        frameFullTimeStaffHire.add(saveFullTimeButton);
        frameFullTimeStaffHire.add(lineB);
        frameFullTimeStaffHire.add(appointFullTimeStaffHireLabel);
        frameFullTimeStaffHire.add(vacancyNumberAppointFullTImeLabel);
        frameFullTimeStaffHire.add(vacancyNumberAppointFullTimeTextField);
        frameFullTimeStaffHire.add(staffNameAppointFullTimeLabel);
        frameFullTimeStaffHire.add(staffNameAppointFullTimeTextField);
        frameFullTimeStaffHire.add(joiningDateAppointFullTimeLabel);
        frameFullTimeStaffHire.add(joiningDateYearAppointFullTimeComboBox);
        frameFullTimeStaffHire.add(joiningDateMonthAppointFullTimeComboBox);
        frameFullTimeStaffHire.add(joiningDateDayAppointFullTimeComboBox);
        frameFullTimeStaffHire.add(qualificationAppointFullTimeLabel);
        frameFullTimeStaffHire.add(qualificationAppointFullTimeTextField);
        frameFullTimeStaffHire.add(appointedByAppointFullTimeLabel);
        frameFullTimeStaffHire.add(appointedByAppointFullTimeTextField);
        frameFullTimeStaffHire.add(clearFullTimeButton);
        frameFullTimeStaffHire.add(displayFullTimeButton);
        frameFullTimeStaffHire.add(appointFullTimeButton);

        // frameFullTimeStaffHire.add();
        frameFullTimeStaffHire.setVisible(true);
    }

    // GUI for terminating Staff
    public void terminateGUI(){
        frameTerminate = new JFrame("Terminate Part Time Staff");
        frameTerminate.setSize(530,230);
        frameTerminate.setLayout(null);
        frameTerminate.setResizable(false);

        terminateLabel = new JLabel("Enter the vacancy number of the part time staff you want to terminate :");
        terminateLabel.setFont(terminateLabel.getFont().deriveFont(14f));
        terminateLabel.setBounds(15,0,600,50);

        terminateVacancyNumberTextField = new JTextField();
        terminateVacancyNumberTextField.setBounds(15,60,480,40);

        terminateConfirmButton = new JButton("Terminate");
        terminateConfirmButton.setBounds(272,120,200,50);
        terminateConfirmButton.addActionListener(this);

        terminateCancelButton = new JButton("Cancel");
        terminateCancelButton.setBounds(57,120,200,50);
        terminateCancelButton.addActionListener(this);

        // Adding components to the frame
        frameTerminate.add(terminateLabel);
        frameTerminate.add(terminateVacancyNumberTextField);
        frameTerminate.add(terminateConfirmButton);
        frameTerminate.add(terminateCancelButton);
        
        // Setting frame as visible
        frameTerminate.setVisible(true);
    }

    // Method for clearing textfields  and resetting combobox for Part time GUI
    public void resettingFieldsPartTime(){
        // Clearing JTextField
        vacancyNumberPartTimeTextField.setText("");
        designationPartTimeTextField.setText("");
        wagesPerHourPartTimeTextField.setText("");
        workingHoursPerDayPartTimeTextField.setText("");
        vacancyNumberAppointPartTimeTextField.setText("");
        staffNameAppointPartTimeTextField.setText("");
        qualificationAppointPartTimeTextField.setText("");
        appointedByAppointPartTimeTextField.setText("");

        // Resetting the JComboBox
        jobTypePartTimeComboBox.setSelectedIndex(0);
        shiftPartTimeComboBox.setSelectedIndex(0);
        joiningDateYearAppointPartTimeComboBox.setSelectedIndex(0);
        joiningDateMonthAppointPartTimeComboBox.setSelectedIndex(0);
        joiningDateDayAppointPartTimeComboBox.setSelectedIndex(0);
    }

    // Method for clearing textfields  and resetting combobox for Full time GUI
    public void resettingFieldsFullTime(){
        // Clearing JTextField
        vacancyNumberFullTimeTextField.setText("");
        designationFullTimeTextField.setText("");
        workingHoursFullTimeTextField.setText("");
        salaryFullTimeTextField.setText("");
        vacancyNumberAppointFullTimeTextField.setText("");
        staffNameAppointFullTimeTextField.setText("");
        qualificationAppointFullTimeTextField.setText("");
        appointedByAppointFullTimeTextField.setText("");

        // Resetting JComboBox
        jobTypeFullTimeComboBox.setSelectedIndex(0);
        joiningDateYearAppointFullTimeComboBox.setSelectedIndex(0);
        joiningDateMonthAppointFullTimeComboBox.setSelectedIndex(0);
        joiningDateDayAppointFullTimeComboBox.setSelectedIndex(0);
    }

    // Exception Handling for Part Time

    /**
     * @return the vacancyNumberPartTimeTextField
     *  it takes value from the textfield and returns an int vacancy number.
     */
    public int getVacancyNumberPartTimeTextField() {
        int vacancyNumPartTime=0;
        if (vacancyNumberPartTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Vacancy Number Text Field" );
        }else{
            try{
                vacancyNumPartTime = Integer.parseInt(vacancyNumberPartTimeTextField.getText());
                if (vacancyNumPartTime == 0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Vacancy Number cannot be 0" );
                }
                else if(vacancyNumPartTime <0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Vacancy Number cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter whole numbers only in Vacancy Number Text Field" );
            }
        }
        return vacancyNumPartTime;
    }

    /**
     * @return the designationPartTimeTextField
     * it takes value from the textfield and returns a string designation.
     */
    public String getDesignationPartTimeTextField() {
        String designationPartTime=designationPartTimeTextField.getText();
        if (designationPartTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Designation Text Field");
        }
        return designationPartTime;
    }

    /**
     * @return the wagesPerHourPartTimeTextField
     * it takes value from the textfield and returns an int wages per hour.
     */
    public int getWagesPerHourPartTimeTextField() {
        int wagesPerHourPartTime = 0;
        if (wagesPerHourPartTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Wages Per Hour Text Field" );
        }else{
            try{
                wagesPerHourPartTime  = Integer.parseInt(wagesPerHourPartTimeTextField.getText());
                if (wagesPerHourPartTime == 0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Wages Per Hour cannot be 0" );
                }
                else if(wagesPerHourPartTime <0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Wages Per Hour cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter whole numbers only in Wages Per Hour Text Field" );
            }
        }
        return wagesPerHourPartTime;
    }

    /**
     * @return the workingHoursPerDayPartTimeTextField
     * it takes value from the textfield and returns an int working hours.
     */
    public int getWorkingHoursPerDayPartTimeTextField() {
        int workingHoursPerDayPartTime = 0;
        if (workingHoursPerDayPartTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Working Hours Per Day Text Field" );
        }else{
            try{
                workingHoursPerDayPartTime  = Integer.parseInt(workingHoursPerDayPartTimeTextField.getText());
                if (workingHoursPerDayPartTime == 0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Working Hours Per Day cannot be 0" );
                }
                else if(workingHoursPerDayPartTime <0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Working Hours Per Day cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter whole numbers only in Working Hours Per Day Text Field" );
            }
        }
        return workingHoursPerDayPartTime;
    }

    /**
     * @return the vacancyNumberAppointPartTimeTextField
     * it takes value from the textfield and returns an int vacancy number.
     */
    public int getVacancyNumberAppointPartTimeTextField() {
        int vacancyNumAppointPartTime=0;
        if (vacancyNumberAppointPartTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Vacancy Number Text Field" );
        }else{
            try{
                vacancyNumAppointPartTime = Integer.parseInt(vacancyNumberAppointPartTimeTextField.getText());
                if (vacancyNumAppointPartTime == 0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Vacancy Number cannot be 0" );
                }
                else if(vacancyNumAppointPartTime <0){
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"The value of Vacancy Number cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter whole numbers only in Vacancy Number Text Field" );
            }
        }
        return vacancyNumAppointPartTime;
    }

    /**
     * @return the staffNameAppointPartTimeTextField
     * it takes value from the textfield and returns a string staff name.
     */
    public String getStaffNameAppointPartTimeTextField() {
        String StaffNamePartTime=staffNameAppointPartTimeTextField.getText();
        if (StaffNamePartTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Staff Name Text Field");
        }
        return StaffNamePartTime;
    }

    /**
     * @return the qualificationAppointPartTimeTextField
     * it takes value from the textfield and returns a string qualification.
     */
    public String getQualificationAppointPartTimeTextField() {
        String QualicationPartTime=qualificationAppointPartTimeTextField.getText();
        if (QualicationPartTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Qualification Text Field");
        }
        return QualicationPartTime;
    }

    /**
     * @return the appointedByAppointPartTimeTextField
     * it takes value from the textfield and returns a string appointed by.
     */
    public String getAppointedByAppointPartTimeTextField() {
        String appointedByPartTime= appointedByAppointPartTimeTextField.getText();
        if (appointedByPartTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please enter value in Appointed By Text Field");
        }
        return appointedByPartTime;
    }

    /**
     * @return the jobTypePartTimeComboBox
     * it takes value from the combobox and returns a string job type.
     */
    public String getJobTypePartTimeComboBox() {
        String jobTypePartTime =(String)jobTypePartTimeComboBox.getSelectedItem();
        if (jobTypePartTime=="Full Time"){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please use the Full Time Staff application to add vacancy for Full Time Staff");
        }
        return jobTypePartTime;
    }

    /**
     * @return the shiftPartTimeComboBox
     * it takes value from the combobox and returns a string shift.
     */
    public String getShiftPartTimeComboBox() {
        String shiftPartTime = (String) shiftPartTimeComboBox.getSelectedItem();
        return shiftPartTime;
    }

    /**
     * @return the joiningDateAppointPartTimeLabel  
     * It joins the values from comboboxes and returns a string date.
     */
    public String getJoiningDateAppointPartTime() {
        String joiningDateYearAppointPartTime=(String) joiningDateYearAppointPartTimeComboBox.getSelectedItem();
        String joiningDateMonthAppointPartTime=(String) joiningDateMonthAppointPartTimeComboBox.getSelectedItem();
        String joiningDateDayAppointPartTime= (String) joiningDateDayAppointPartTimeComboBox.getSelectedItem();

        String joiningDate="";

        if (joiningDateYearAppointPartTime == ("YYYY") || joiningDateMonthAppointPartTime == ("MM") || joiningDateDayAppointPartTime == ("DD") ){
            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Please choose the Year, Month and Day of the joining date");
        }else{
            joiningDate = joiningDateYearAppointPartTime + " " + joiningDateMonthAppointPartTime + " " + joiningDateDayAppointPartTime; 
        }
        
        return joiningDate;
    }

    // Exception Handling For Full Time Staff
 
    /**
     * @return the vacancyNumberFullTimeTextField
     * It takes the value from the textfield and returns an int vacancy number.
     */
    public int getVacancyNumberFullTimeTextField() {
        int vacancyNumFullTime=0;
        if (vacancyNumberFullTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Vacancy Number Text Field" );
        }else{
            try{
                vacancyNumFullTime = Integer.parseInt(vacancyNumberFullTimeTextField.getText());
                if (vacancyNumFullTime == 0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Vacancy Number cannot be 0" );
                }
                else if(vacancyNumFullTime <0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Vacancy Number cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter whole numbers only in Vacancy Number Text Field" );
            }
        }
        return vacancyNumFullTime;
    }

    /**
     * @return the designationFullTimeTextField
     * It takes the value from the textfield and returns a string designation.
     */
    public String getDesignationFullTimeTextField() {
        String DesignationFullTime=designationFullTimeTextField.getText();
        if (DesignationFullTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Designation Text Field");
        }
        return DesignationFullTime;
    }

    /**
     * @return the workingHoursFullTimeTextField
     * It takes the value from textfield and returns an int working hour.
     */
    public int getWorkingHoursFullTimeTextField() {
        int workingHoursFullTime = 0;
        if (workingHoursFullTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Working Hours Text Field" );
        }else{
            try{
                workingHoursFullTime  = Integer.parseInt(workingHoursFullTimeTextField.getText());
                if (workingHoursFullTime == 0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Working Hours cannot be 0" );
                }
                else if(workingHoursFullTime <0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Working Hours cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter whole numbers only in Working Hours Text Field" );
            }
        }
        return workingHoursFullTime;
    }

    /**
     * @return the salaryFullTimeTextField
     * It takes the value from salary and returns an int salary.
     */
    public int getSalaryFullTimeTextField() {
        int salaryFullTime = 0;
        if (salaryFullTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Salary Text Field" );
        }else{
            try{
                salaryFullTime  = Integer.parseInt(salaryFullTimeTextField.getText());
                if (salaryFullTime == 0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Salary cannot be 0" );
                }
                else if(salaryFullTime <0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Salary cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter whole numbers only in Salary Text Field" );
            }
        }
        return salaryFullTime;
    }

     /**
     * @return the jobTypeFullTimeComboBox
     * It takes the value from combobox and returns a string job type.
     */
    public String getJobTypeFullTimeComboBox(){
        String jobTypeFullTime =(String)jobTypeFullTimeComboBox.getSelectedItem();
        if (jobTypeFullTime=="Part Time"){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire, "Please use the Part Time Staff application to add vacancy for Part Time Staff");
        }
        return jobTypeFullTime;
    }

    /**
     * @return the vacancyNumberAppointFullTimeTextField
     * It takes the value from textfield and returns an int vacancy number.
     */
    public int getVacancyNumberAppointFullTimeTextField() {
        int vacancyNumAppointFullTime=0;
        if (vacancyNumberAppointFullTimeTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Vacancy Number Text Field" );
        }else{
            try{
                vacancyNumAppointFullTime = Integer.parseInt(vacancyNumberAppointFullTimeTextField.getText());
                if (vacancyNumAppointFullTime == 0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Vacancy Number cannot be 0" );
                }
                else if(vacancyNumAppointFullTime <0){
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"The value of Vacancy Number cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter whole numbers only in Vacancy Number Text Field" );
            }
        }
        return vacancyNumAppointFullTime;
    }

    /**
     * @return the staffNameAppointFullTimeTextField
     * It takes the value from the textfield and returns a string staff name.
     */
    public String getStaffNameAppointFullTimeTextField() {
        String StaffNameFullTime=staffNameAppointFullTimeTextField.getText();
        if (StaffNameFullTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Staff Name Text Field");
        }
        return StaffNameFullTime;
    }

    /**
     * @return the qualificationAppointFullTimeTextField
     * It takes the value from textfield and returns a string qualification.
     */
    public String getQualificationAppointFullTimeTextField() {
        String QualicationFullTime=qualificationAppointFullTimeTextField.getText();
        if (QualicationFullTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Qualification Text Field");
        }
        return QualicationFullTime;
    }

    /**
     * @return the appointedbyAppointFullTimeTextField
     * It takes the value from textfield and returns a string appointed by.
     */
    public String getAppointedbyAppointFullTimeTextField() {
        String AppointedByFullTime= appointedByAppointFullTimeTextField.getText();
        if (AppointedByFullTime.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please enter value in Appointed By Text Field");
        }
        return AppointedByFullTime;
    }

    /**
     * @return the joiningDateAppointFullTimeLabel
     * It joins the values from comboboxes and returns a string date.
     */
    public String getJoiningDateAppointFullTime() {
        String joiningDateYearAppointFullTime=(String) joiningDateYearAppointFullTimeComboBox.getSelectedItem();
        String joiningDateMonthAppointFullTime=(String) joiningDateMonthAppointFullTimeComboBox.getSelectedItem();
        String joiningDateDayAppointFullTime= (String) joiningDateDayAppointFullTimeComboBox.getSelectedItem();

        String joiningDate="";

        if (joiningDateYearAppointFullTime == ("YYYY") || joiningDateMonthAppointFullTime == ("MM") || joiningDateDayAppointFullTime == ("DD") ){
            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Please choose the Year, Month and Day of the joining date");
        }else{
            joiningDate = joiningDateYearAppointFullTime + " " +joiningDateMonthAppointFullTime + " " + joiningDateDayAppointFullTime; 
        }
        return joiningDate;
    }

    /**
     * Exception Handling for Terminate GUI
     */

     /*
      * @return the terminateVacancyNumberTextField
      * It takes the value from the textfield and returns an int vacancy number. 
      */
     public int getTerminateVacancyNumberTextField() {
        int terminateVacancyNumberPartTime=0;
        if (terminateVacancyNumberTextField.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(frameTerminate,"Please enter value in Vacancy Number Text Field" );
        }else{
            try{
                terminateVacancyNumberPartTime = Integer.parseInt(terminateVacancyNumberTextField.getText());
                if (terminateVacancyNumberPartTime == 0){
                    JOptionPane.showMessageDialog(frameTerminate,"The value of Vacancy Number cannot be 0" );
                }
                else if(terminateVacancyNumberPartTime <0){
                    JOptionPane.showMessageDialog(frameTerminate,"The value of Vacancy Number cannot be negative" );
                }
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(frameTerminate,"Please enter whole numbers only in Vacancy Number Text Field" );
            }
        }
        return terminateVacancyNumberPartTime;
     }


    //An actionPerformed method performs certain action when a certain button is clicked
    @Override
    public void actionPerformed(ActionEvent e){
         // Adding functionality to the clear button of Part Time Staff Hire GUI
        if (e.getSource() == clearPartTimeButton){
            resettingFieldsPartTime();
        }

         // Adding functionality to the clear button of Full Time Staff Hire GUI
        if (e.getSource() == clearFullTimeButton){
            resettingFieldsFullTime();
        }

        // Calling the method containing the Part Time Staff Hire GUI when the Part Time Staff Button is clicked 
        if (e.getSource() == partTimeStaffHireButton){
            PartTimeStaffHireGUI();
        }

        // Calling the method containing the Full Time Staff Hire GUI when the Full Time Staff Button is clicked 
        if (e.getSource() == fullTimeStaffHireButton){
            FullTimeStaffHireGUI();
        }
        // Calling the method containing the Terminate Staff GUI when the Terminate Button is clicked 
        if (e.getSource() == terminatePartTimeButton){
            terminateGUI();
        }

        // Closes the frame when cancel button is clicked
        if (e.getSource() == terminateCancelButton){
            frameTerminate.dispose();// Closes the frame
        }

        // Adding functionality to the display button of the main frame
        if (e.getSource() == displayMainFrameButton){
            boolean recordFound=false;
            // Iterates wthin the arraylist
            for (StaffHire obj:staffList){
                if (obj instanceof PartTimeStaffHire){// Checks whether the object is an instance of PartTimeStaffHire subclass.
                    partTimeStaff_obj= (PartTimeStaffHire)obj;
                    // Calling the display method from the PartTimeStaffHire class
                    partTimeStaff_obj.display();
                    recordFound=true;
                }else{
                    fullTimeStaff_obj= (FullTimeStaffHire)obj;
                    // Calling the display method from the FullTimeStaffHire class
                    fullTimeStaff_obj.display();
                    recordFound=true;
                }
            }
            if (recordFound==false){//If no records are found
                JOptionPane.showMessageDialog(mainFrame,"No records found");
            }
        }
           
        // Adding functionality to the display button of the Part Time Staff Frame
        if (e.getSource() == displayPartTimeButton){
            boolean recordFound=false;
            // Iterates wthin the arraylist
            for (StaffHire obj:staffList){
                if (obj instanceof PartTimeStaffHire){// Checks whether the object is an instance of PartTimeStaffHire subclass.
                    partTimeStaff_obj= (PartTimeStaffHire)obj;
                    // Calling the display method from the PartTimeStaffHire subclass
                    partTimeStaff_obj.display();
                    recordFound=true;
                }
            }
            if (recordFound==false){// If no records are found
                JOptionPane.showMessageDialog(framePartTimeStaffHire,"No records found of Part Time Staffs");
            }
        }
    
        // Adding functionality to the display button of the Full Time Staff Frame
        if (e.getSource() == displayFullTimeButton){
            boolean recordFound=false;
            // Iterates wthin the arraylist
            for (StaffHire obj:staffList){
                if (obj instanceof FullTimeStaffHire){// Checks whether the object is an instance of FullTimeStaffHire subclass.
                    // Calling the display method from the FullTimeStaffHire class
                    fullTimeStaff_obj = (FullTimeStaffHire)obj;
                    fullTimeStaff_obj.display();
                    recordFound=true;
                }
            }
            if (recordFound==false){// If no records are found
                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"No records found of Full Time Staffs");
            }
        }

        // Adding functionality to the confirm button of the Terminate GUI
        if (e.getSource() == terminateConfirmButton){
            int terminateVacancyNumberpt=getTerminateVacancyNumberTextField();
            boolean vacancyNumFound=false;
            if (terminateVacancyNumberpt > 0){
                // Iterates wthin the arraylist
                for (StaffHire obj:staffList){
                    if(obj.getVacancyNumber() == terminateVacancyNumberpt){
                        vacancyNumFound=true;
                        if (obj instanceof PartTimeStaffHire){// Checks whether the object is an instance of PartTimeStaffHire subclass.
                            partTimeStaff_obj = (PartTimeStaffHire)obj;
                            if (partTimeStaff_obj.getTerminated()==false && partTimeStaff_obj.getJoined()==true){
                                partTimeStaff_obj.terminate();
                                JOptionPane.showMessageDialog(frameTerminate, "The Staff has been Terminated");
                                break;
                            }else if(partTimeStaff_obj.getTerminated()==true && partTimeStaff_obj.getJoined()==false){
                                JOptionPane.showMessageDialog(frameTerminate,"The staff has already been terminated");
                                break;
                            }else{
                                JOptionPane.showMessageDialog(frameTerminate,"The Staff hasn't been hired. Hence, there is no staff to terminate.");
                                break;
                            }  
                        }else{
                            JOptionPane.showMessageDialog(frameTerminate,"Vacancy no." +terminateVacancyNumberpt+" does not belong to anybody of the Part Time Staffs");
                        }
                    }
                }
                if (vacancyNumFound==false){// If no records are found
                        JOptionPane.showMessageDialog(frameTerminate, "The inserted vacancy number is invalid");
                }
            }
        }

        // Adding functionality to the save button of the Part Time Staff GUI
        if (e.getSource() == savePartTimeButton){
            String jobTypept=getJobTypePartTimeComboBox();
            int vacancyNumberpt=getVacancyNumberPartTimeTextField();
            String designationpt=getDesignationPartTimeTextField();
            int wagesPerHourpt=getWagesPerHourPartTimeTextField();
            int workingHoursPerDaypt=getWorkingHoursPerDayPartTimeTextField();
            String shiftpt=getShiftPartTimeComboBox();
              
            boolean duplicateVacancyNum=false;
            if (vacancyNumberpt >0 && designationpt != "" && wagesPerHourpt >0 && workingHoursPerDaypt >0 && jobTypept=="Part Time") {
                // Iterates wthin the arraylist
                for (StaffHire obj:staffList){
                    if(obj.getVacancyNumber() == vacancyNumberpt){
                        duplicateVacancyNum=true;
                        break;
                    }
                }
                if (duplicateVacancyNum==false){
                    partTimeStaff_obj= new PartTimeStaffHire(designationpt,jobTypept,vacancyNumberpt,workingHoursPerDaypt,wagesPerHourpt,shiftpt);
                    staffList.add(partTimeStaff_obj);
                    JOptionPane.showMessageDialog(framePartTimeStaffHire,"Vacancy has been added");
                    
                }else{// If the entered vacancy number is already in the arraylist
                    JOptionPane.showMessageDialog(framePartTimeStaffHire, "The entered vacancy number is already in the list");
                }
            }
        }
        
        // Adding functionality to the Appoint button of the Part Time Staff GUI
        if (e.getSource() == appointPartTimeButton){
            boolean vacancyNumFound=false;
            
            int vacancyNumberAppointpt=getVacancyNumberAppointPartTimeTextField();
            String staffNamept=getStaffNameAppointPartTimeTextField();
            String joiningDatept=getJoiningDateAppointPartTime();
            String qualificationpt=getQualificationAppointPartTimeTextField();
            String appointedBypt=getAppointedByAppointPartTimeTextField();

            if (vacancyNumberAppointpt >0 && staffNamept!="" && qualificationpt !="" && appointedBypt !="" && joiningDatept !="" ){
                // Iterates wthin the arraylist
                for (StaffHire obj:staffList){
                    if(obj.getVacancyNumber() == vacancyNumberAppointpt){
                        vacancyNumFound=true;
                        if (obj instanceof PartTimeStaffHire){// Checks whether the object is an instance of PartTimeStaffHire subclass.
                            partTimeStaff_obj = (PartTimeStaffHire)obj;
                            if (partTimeStaff_obj.getJoined()==false){
                                partTimeStaff_obj.hiring(staffNamept, joiningDatept, qualificationpt, appointedBypt);
                                JOptionPane.showMessageDialog(framePartTimeStaffHire, "Staff Hired");
                                break;
                            }else if(partTimeStaff_obj.getJoined()==true){
                                JOptionPane.showMessageDialog(framePartTimeStaffHire,"A staff has already been hired to fill this vacancy no.");
                                break;
                            }   
                        }else{//If the entered vacancy number is for the vacancy number for Full Time Staff
                            JOptionPane.showMessageDialog(framePartTimeStaffHire,"Vacancy no. "+vacancyNumberAppointpt+" is not for Part Time Staff Hire");
                        }
                    }
                }
                if (vacancyNumFound==false){// If no records are found
                    JOptionPane.showMessageDialog(framePartTimeStaffHire, "The inserted vacancy number is invalid");
                }
            }
        }
        
        // Adding functionality to the save button of the Full Time Staff GUI
        if (e.getSource() == saveFullTimeButton){
            boolean duplicateVacancyNum=false;
            
            String jobTypeft=getJobTypeFullTimeComboBox();
            int vacancyNumberft=getVacancyNumberFullTimeTextField();
            String designationft=getDesignationFullTimeTextField();
            int salaryft=getSalaryFullTimeTextField();
            int workingHoursft=getWorkingHoursFullTimeTextField();
            
            if (vacancyNumberft >0 && salaryft > 0 && workingHoursft >0 && jobTypeft=="Full Time" && designationft != "") {
                // Iterates wthin the arraylist
                for (StaffHire obj:staffList){
                    if(obj.getVacancyNumber() == vacancyNumberft){
                        duplicateVacancyNum=true;
                        break;
                    }
                }
                if (duplicateVacancyNum==false){
                    fullTimeStaff_obj= new FullTimeStaffHire(designationft,jobTypeft,vacancyNumberft , salaryft,workingHoursft);
                    staffList.add(fullTimeStaff_obj);
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Vacancy has been added");  
                }else{// If the vacancy number is already in the list
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire, "The entered vacancy number is already in the list");        
                } 
            }
        }
        
        // Adding functionality to the Appoint button of the Full Time Staff GUI
        if (e.getSource() == appointFullTimeButton){
            boolean vacancyNumFound=false;
            
            int vacancyNumberAppointft = getVacancyNumberAppointFullTimeTextField();
            String staffNameft=getStaffNameAppointFullTimeTextField();
            String joiningDateft= getJoiningDateAppointFullTime();
            String qualificationft= getQualificationAppointFullTimeTextField();
            String appointedByft= getAppointedbyAppointFullTimeTextField();
            if (vacancyNumberAppointft >0 && staffNameft!="" && joiningDateft !="" && qualificationft !="" && appointedByft !=""){
                // Iterates wthin the arraylist
                for (StaffHire obj:staffList){
                    if(obj.getVacancyNumber() == vacancyNumberAppointft){
                        vacancyNumFound=true;
                        if (obj instanceof FullTimeStaffHire){// Checks whether the object is an instance of FullTimeStaffHire subclass.
                            fullTimeStaff_obj = (FullTimeStaffHire)obj;
                            if (fullTimeStaff_obj.getJoined()==false){
                                fullTimeStaff_obj.hiring(staffNameft, joiningDateft, qualificationft, appointedByft);
                                JOptionPane.showMessageDialog(frameFullTimeStaffHire, "Staff Hired");
                                break;
                            }
                            else if (fullTimeStaff_obj.getJoined()==true){
                                JOptionPane.showMessageDialog(frameFullTimeStaffHire,"A staff has already been hired to fill this vacancy no.");
                                break;
                            } 
                        }else{// If the vacancy number entered is not the vacancy number for Full Time Staff
                            JOptionPane.showMessageDialog(frameFullTimeStaffHire,"Vacancy no. "+vacancyNumberAppointft+" is not for Full Time Staff Hire");
                        }
                    }
                }
                if (vacancyNumFound==false){ // If the vacancy number entered is not in the arraylist
                    JOptionPane.showMessageDialog(frameFullTimeStaffHire, "The inserted vacancy number is invalid");
                }
            }
        }
    }

    // The Main method
    public static void main(String[] args){
        new INGNepal();
    }
}