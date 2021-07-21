        
        /**
         * Write a description of class INGNepalRedo here.
         *
         * @author (your name)
         * @version (a version number or a date)
         */
        
        import javax.swing.*;
        import java.awt.Font;
        import java.awt.event.*;
        import java.util.ArrayList;
        
        /* INGNepal class
         * This class contains GUI components for the Other three classes
         * StaffHire, FullTimeStaffHire and PartTimeStaffHire
         * This class allows the user to use the program with a proper GUI
         * 
         */
        public class INGNepal implements ActionListener 
        {
            //Initializing all the Varibales that are to be used in the program
            private JFrame mainFrame, fullTimeFrame, partTimeFrame;
            private JPanel mainPanel,partPanel, fullPanel;
            
            private JLabel title, subTitle1, subTitle2, lines1, lines2, lines3,lines4;
            
            private JLabel addFTVacancyNumberLbl, addFTDesignationLbl, addFTSalaryLbl, addFTWorkingHoursLbl, appointFTVacancyNumberLbl, appointFTStaffNameLbl, appointFTJoiningDateLbl, appointFTQualificationLbl,
            addPTVacancyNumberLbl, addPTDesignationLbl, addPTWagesLbl, addPTWorkingHourLbl,addPTShiftLbl, appointPTVacancyNumberLbl, appointPTStaffNameLbl, appointPTJoiningDateLbl,appointPTQualificationLbl, appointPTAppointedByLbl, terminatePTLbl, appointFTAppointedByLbl;
            
            private JTextField addFTVacancyNumber, addFTDesignation, addFTSalary, addFTWorkingHours, appointFTVacancyNumber,
            appointFTName, appointFTQualification, appointFTAppointedBy, addPTVacancyNumber, addPTDesignation,
            addPTWages, appointPTVacancyNumber,addPTWorkingHours, appointPTName,appointPTQualification, appointPTAppointedBy, 
            terminateVacancyNumber;
            
            private JButton btnAddFullTime, btnAppointFullTime, btnAddPartTime, btnAppointPartTime, btnTerminate, btnClearFullTime,btnClearPartTime, btnDisplay,btnFT,btnPT;
            
          
            
            private JComboBox boxShifts, cmbMonthFA,cmbDayFA,cmbYearFA,cmbMonthPA,cmbDayPA,cmbYearPA;
            
            ArrayList<StaffHire> arr = new ArrayList();
            String year,month,day,joiningDate;
            
            FullTimeStaffHire full;
            PartTimeStaffHire part;
            
            
            
           public void StaffHireForm(){
                //This method contains the main GUI Components of this program, the main frame opens throught this method.
                mainFrame = new JFrame("Staff Hire");
                
                mainFrame.setBounds(250,100,600,500);
                mainFrame.setResizable(false);
                
                mainPanel = new JPanel();
                mainPanel. setLayout(null);
                
                title = new JLabel ("INGNepal Form");
                title.setBounds(180,10,400,100);
                mainPanel.add(title);
                Font titleFont = new Font ("Berlin Sans FB",Font.PLAIN, 40);
                title.setFont(titleFont);
                
                
                Font buttonFont = new Font("Arial",Font.BOLD,18);
                
                btnFT = new JButton("Full Time Staff");
                btnFT.setBounds(200,150,200,40);
                mainPanel.add(btnFT);
                btnFT.setFont(buttonFont);
                btnFT.addActionListener(this);
                
                
                btnPT = new JButton("Part Time Staff");
                btnPT.setBounds(200,240,200,40);
                mainPanel.add(btnPT);
                btnPT.setFont(buttonFont);
                btnPT.addActionListener(this);
                
                
                btnDisplay= new JButton("Display");
                btnDisplay.setBounds(200,330,200,40);
                mainPanel.add(btnDisplay);
                btnDisplay.setFont(buttonFont);
                btnDisplay.addActionListener(this);
                
                
                
                
                
                
                
                
                
                
                mainFrame.setVisible(true);
                mainFrame.add(mainPanel);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        
        
            public static void main (String[]args){
                //main method of the class
                
                INGNepal object = new INGNepal();
                object.StaffHireForm();
            }
            
            public void actionPerformed(ActionEvent e){
               //This method contains all the button actions in the program
              if(e.getSource()==btnFT){
                 // Then the btnFT button is pressed, a new GUI frame opens.
                fullTimeFrame = new JFrame();
                fullTimeFrame.setTitle("Full Time Staff Hire");
                fullTimeFrame.setBounds(250,100,800,650);
                       
                fullPanel = new JPanel();
                fullPanel.setLayout(null);
                fullTimeFrame.add(fullPanel);
                        
                Font subTitleFont = new Font("Arial",Font.BOLD,45);
                subTitle1 = new JLabel("Full Time Staff Hire");
                subTitle1.setBounds (200,2,800,50);
                fullPanel.add(subTitle1);
                subTitle1.setFont(subTitleFont);
                        
                        
                lines1 = new JLabel("-----------------------------------------------------------------------------------------------------------");
                lines1.setBounds(190,20,800,50);
                fullPanel.add(lines1);
                
                
                lines2 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines2.setBounds(0,65,1000,50);
                fullPanel.add(lines2);
                
                
                
                
                addFTVacancyNumberLbl = new JLabel("Vacancy Number: ");
                addFTVacancyNumberLbl.setBounds(50,120,150,20);
                fullPanel.add(addFTVacancyNumberLbl);
                
                addFTVacancyNumber = new JTextField();
                addFTVacancyNumber.setBounds(160,120,90,20);
                fullPanel.add(addFTVacancyNumber);
               
                
                
                addFTDesignationLbl = new JLabel("Designation: ");
                addFTDesignationLbl.setBounds(380,120,150,20);
                fullPanel.add(addFTDesignationLbl);
                
                addFTDesignation = new JTextField();
                addFTDesignation.setBounds(490,120,90,20);
                fullPanel.add(addFTDesignation);
                
                
                addFTSalaryLbl = new JLabel("Salary: ");
                addFTSalaryLbl.setBounds(50,180,150,20);
                fullPanel.add(addFTSalaryLbl);
                
                addFTSalary = new JTextField();
                addFTSalary.setBounds(160,180,90,20);
                fullPanel.add(addFTSalary);
                
                
                addFTWorkingHoursLbl = new JLabel("Working Hours: ");
                addFTWorkingHoursLbl.setBounds(380,180,150,20);
                fullPanel.add(addFTWorkingHoursLbl);
                
                addFTWorkingHours = new JTextField();
                addFTWorkingHours.setBounds(490,180,90,20);
                fullPanel.add(addFTWorkingHours);
               
                
                btnAddFullTime  = new JButton("Add Full Time Vacancy");
                btnAddFullTime.setBounds(250,230,250,30);
                fullPanel.add(btnAddFullTime);
                btnAddFullTime.addActionListener(this);
                
                lines3 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines3.setBounds(0,260,1000,50);
                fullPanel.add(lines3);
                
                
                
                
                
                
                appointFTVacancyNumberLbl = new JLabel("Vacancy Number: ");
                appointFTVacancyNumberLbl.setBounds(50,320,150,20);
                fullPanel.add(appointFTVacancyNumberLbl);
                
                appointFTVacancyNumber = new JTextField();
                appointFTVacancyNumber.setBounds(160,320,90,20);
                fullPanel.add(appointFTVacancyNumber);
                
                
                
                appointFTStaffNameLbl = new JLabel("Staff Name: ");
                appointFTStaffNameLbl.setBounds(380,320,150,20);
                fullPanel.add(appointFTStaffNameLbl);
                
                appointFTName = new JTextField();
                appointFTName.setBounds(490,320,90,20);
                fullPanel.add(appointFTName);
                
                
                appointFTQualificationLbl = new JLabel("Qualification: ");
                appointFTQualificationLbl.setBounds(50,440,150,20);
                fullPanel.add(appointFTQualificationLbl);
                
                appointFTQualification = new JTextField();
                appointFTQualification.setBounds(160,440,90,20);
                fullPanel.add(appointFTQualification);
                
                
                appointFTAppointedByLbl = new JLabel("Appointed By: ");
                appointFTAppointedByLbl.setBounds(380,440,150,20);
                fullPanel.add(appointFTAppointedByLbl);
                
                appointFTAppointedBy = new JTextField();
                appointFTAppointedBy.setBounds(490,440,90,20);
                fullPanel.add(appointFTAppointedBy);
                
                appointFTJoiningDateLbl = new JLabel("Joining Date (M/D/Y) ");
                appointFTJoiningDateLbl.setBounds(50,380,150,20);
                fullPanel.add(appointFTJoiningDateLbl);
                
                
                
                String year[] = {"2015","2016","2017","2018","2019","2020","2021"};
                String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
                String day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
                
                cmbMonthFA = new JComboBox(month);
                cmbMonthFA.setBounds(200,380,50,20);
                fullPanel.add(cmbMonthFA);
                cmbDayFA = new JComboBox(day);
                cmbDayFA.setBounds(270,380,50,20);
                fullPanel.add(cmbDayFA);
                cmbYearFA = new JComboBox(year);
                cmbYearFA.setBounds(340,380,90,20);
                fullPanel.add(cmbYearFA);
                cmbYearFA.setSelectedIndex(0);cmbMonthFA.setSelectedIndex(0);cmbDayFA.setSelectedIndex(3);
                
                
                btnAppointFullTime  = new JButton("Appoint Full Time Staff");
                btnAppointFullTime.setBounds(250,500,250,30);
                fullPanel.add(btnAppointFullTime);
                btnAppointFullTime.addActionListener(this);
                
                lines4 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines4.setBounds(0,530,1000,50);
                fullPanel.add(lines4);
                    
                
                btnClearFullTime= new JButton("Clear");
                btnClearFullTime.setBounds(250,570,250,30);
                fullPanel.add(btnClearFullTime);
                btnClearFullTime.addActionListener(this);
               
                    
                
                fullTimeFrame.setResizable(false);
                fullTimeFrame.setVisible(true);
                
        }   
        
        if(e.getSource()==btnPT){
                //When the btnPT button is pressed, a new Part Time Staff Hire Frame opens up. 
                partTimeFrame = new JFrame("Part Time Staff Hire");
                partTimeFrame.setBounds(250,100,800,650);
                       
                partPanel = new JPanel();
                partPanel.setLayout(null);
                partTimeFrame.add(partPanel);
                        
                Font subTitleFont = new Font("Arial",Font.BOLD,45);
                subTitle2 = new JLabel("Part Time Staff Hire");
                subTitle2.setBounds (200,2,800,50);
                partPanel.add(subTitle2);
                subTitle2.setFont(subTitleFont);
                        
                        
                lines1 = new JLabel("-----------------------------------------------------------------------------------------------------------");
                lines1.setBounds(190,20,800,50);
                partPanel.add(lines1);
                
                
                lines2 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines2.setBounds(0,65,1000,50);
                partPanel.add(lines2);
                
                addPTVacancyNumberLbl = new JLabel("Vacancy Number: ");
                addPTVacancyNumberLbl.setBounds(20,120,150,20);
                partPanel.add(addPTVacancyNumberLbl);
                
                addPTVacancyNumber = new JTextField();
                addPTVacancyNumber.setBounds(130,120,90,20);
                partPanel.add(addPTVacancyNumber);
               
                
                
                addPTDesignationLbl = new JLabel("Designation: ");
                addPTDesignationLbl.setBounds(250,120,150,20);
                partPanel.add(addPTDesignationLbl);
                
                 addPTDesignation = new JTextField();
                addPTDesignation.setBounds(360,120,90,20);
                partPanel.add(addPTDesignation);
                
                
                addPTWagesLbl = new JLabel("Wages: ");
                addPTWagesLbl.setBounds(50,180,150,20);
                partPanel.add(addPTWagesLbl);
                
                addPTWages = new JTextField();
                addPTWages.setBounds(160,180,90,20);
                partPanel.add(addPTWages);
                
                
                addPTWorkingHourLbl = new JLabel("Working Hours: ");
                addPTWorkingHourLbl.setBounds(380,180,150,20);
                partPanel.add(addPTWorkingHourLbl);
                
                addPTWorkingHours = new JTextField();
                addPTWorkingHours.setBounds(490,180,90,20);
                partPanel.add(addPTWorkingHours);
                
                
                addPTShiftLbl = new JLabel("Shift: ");
                addPTShiftLbl.setBounds(500,120,90,20);
                partPanel.add(addPTShiftLbl);
                
                String[] shift = {"Morning", "Day",  "Evening"};
                boxShifts = new JComboBox(shift);
                boxShifts.setBounds (610,120,150,25);
                partPanel.add(boxShifts);
                
                
                
                btnAddPartTime  = new JButton("Add Part Time Vacancy");
                btnAddPartTime.setBounds(250,230,250,30);
                partPanel.add(btnAddPartTime);
                btnAddPartTime.addActionListener(this);
                
                 lines3 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines3.setBounds(0,260,1000,50);
                partPanel.add(lines3);
                
                appointPTVacancyNumberLbl = new JLabel("Vacancy Number: ");
                appointPTVacancyNumberLbl.setBounds(50,320,150,20);
                partPanel.add(appointPTVacancyNumberLbl);
                
                appointPTVacancyNumber = new JTextField();
                appointPTVacancyNumber.setBounds(160,320,90,20);
                partPanel.add(appointPTVacancyNumber);
                
                
                
                appointPTStaffNameLbl = new JLabel("Staff Name: ");
                appointPTStaffNameLbl.setBounds(380,320,150,20);
                partPanel.add(appointPTStaffNameLbl);
                
                appointPTName = new JTextField();
                appointPTName.setBounds(490,320,90,20);
                partPanel.add(appointPTName);
                
                
                appointPTQualificationLbl = new JLabel("Qualification: ");
                appointPTQualificationLbl.setBounds(50,440,150,20);
                partPanel.add(appointPTQualificationLbl);
                
                appointPTQualification = new JTextField();
                appointPTQualification.setBounds(160,440,90,20);
                partPanel.add(appointPTQualification);
                
                
                appointPTAppointedByLbl = new JLabel("Appointed By: ");
                appointPTAppointedByLbl.setBounds(380,440,150,20);
                partPanel.add(appointPTAppointedByLbl);
                
                appointPTAppointedBy = new JTextField();
                appointPTAppointedBy.setBounds(490,440,90,20);
                partPanel.add(appointPTAppointedBy);
                
                appointPTJoiningDateLbl = new JLabel("Joining Date (M/D/A) ");
                appointPTJoiningDateLbl.setBounds(50,380,150,20);
                partPanel.add(appointPTJoiningDateLbl);
                
                String year[] = {"2015","2016","2017","2018","2019","2020","2021"};
                String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
                String day[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
                
                cmbMonthPA = new JComboBox(month);
                cmbMonthPA.setBounds(200,380,50,20);
                partPanel.add(cmbMonthPA);
                cmbDayPA = new JComboBox(day);
                cmbDayPA.setBounds(270,380,50,20);
                partPanel.add(cmbDayPA);
                cmbYearPA = new JComboBox(year);
                cmbYearPA.setBounds(340,380,90,20);
                partPanel.add(cmbYearPA);
                cmbYearPA.setSelectedIndex(0);cmbMonthPA.setSelectedIndex(0);cmbDayPA.setSelectedIndex(3);
                
                btnAppointPartTime  = new JButton("Appoint Part Time Staff");
                btnAppointPartTime.setBounds(250,500,250,30);
                partPanel.add(btnAppointPartTime);
                btnAppointPartTime.addActionListener(this);
                
                
                lines4 = new JLabel("********************************************************************************************************************************************************************************************************************");
                lines4.setBounds(0,530,1000,50);
                partPanel.add(lines4);
                
                
                
                terminatePTLbl = new JLabel("Vacancy Number: ");
                terminatePTLbl.setBounds(20,570,150,20);
                partPanel.add(terminatePTLbl);
                
                terminateVacancyNumber = new JTextField();
                terminateVacancyNumber.setBounds(130,570,90,25);
                partPanel.add(terminateVacancyNumber);
                
                
                btnTerminate = new JButton("Terminate");
                btnTerminate.setBounds(260,570,200,25);
                partPanel.add(btnTerminate);
                btnTerminate.addActionListener(this);
                
                btnClearPartTime= new JButton("Clear");
                btnClearPartTime.setBounds(520,570,250,30);
                partPanel.add(btnClearPartTime);
                btnClearPartTime.addActionListener(this);
                
                
                
                
                partTimeFrame.setResizable(false);
                partTimeFrame.setVisible(true);
                
        }
        
        if(e.getSource()==btnAddFullTime){
            
            /* When btnAddFullTime button is pressed, a full time vacancy is added
             * new local variables to store the values from the text field is creates
             * then try catch block is used in order to filter the exceptions
             * 
             */     
            int vacancyNumber=0,salary=0,workingHour=0;
            String designation="",jobType="";
            boolean isDuplicateVNo=false;
            try{
                vacancyNumber = Integer.parseInt(addFTVacancyNumber.getText());
                designation = addFTDesignation.getText();
                salary = Integer.parseInt(addFTSalary.getText());
                jobType= "Full Time";
                workingHour = Integer.parseInt(addFTWorkingHours.getText());
                
                
                    for(StaffHire var:arr){
                        if(var.getVacancyNumber()==vacancyNumber){
                        isDuplicateVNo=true;
                        break;
                        }
                    }
                
                    if(isDuplicateVNo==false){
                        if((addFTVacancyNumber.getText()).equals("")||addFTDesignation.getText().equals("")||(addFTSalary.getText()).equals(""
                        )||(addFTWorkingHours.getText()).equals("")){
                            JOptionPane.showMessageDialog(fullPanel,"Fill up all the fields");
                        }
                        else{
                        full = new FullTimeStaffHire(vacancyNumber, designation,jobType, workingHour, salary);
                        arr.add(full);
                        JOptionPane.showMessageDialog(fullPanel,"Vacancy for full-time staff is added."+" Total vacancies: "+arr.size());
                    }
                    }
                    else{
                        JOptionPane.showMessageDialog(fullPanel,"Vacancy number is repeated.");
                    }
                
           }catch(Exception a){
                JOptionPane.showMessageDialog(fullPanel,"Please enter the appropriate value.");
            
            }   
        }
        
        
        if(e.getSource()==btnAppointFullTime){
            
            /* When btnAppointFullTime button is pressed, a full time staff is appointed
             * new local variables to store the values from the text field is creates
             * then try catch block is used in order to filter the exceptions
             * 
             */  
            year=(cmbYearFA.getSelectedItem()).toString();
            month=(cmbMonthFA.getSelectedItem()).toString();
            day=(cmbDayFA.getSelectedItem()).toString();
            
            int vacancyNumber;
            String staffName,joiningDate,qualification,appointedBy;
            boolean vNoFound=false;
            
            try{
                vacancyNumber = Integer.parseInt(appointFTVacancyNumber.getText());
                staffName = appointFTName.getText();
                qualification = appointFTQualification.getText();
                appointedBy = appointFTAppointedBy.getText();
                joiningDate = year+"/"+month+"/"+day; 
                
                for(StaffHire obj:arr){
                    if(obj.getVacancyNumber()==vacancyNumber){
                        vNoFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            full = (FullTimeStaffHire)obj;
                            if(full.getJoined()==true){
                                JOptionPane.showMessageDialog(fullPanel,"Full-time staff already hired!");
                            }
                            else{
                                if((appointFTName.getText()).equals("")||appointFTQualification.getText().equals("")||appointFTAppointedBy.getText().equals("")
                                    ||appointFTVacancyNumber.getText().equals("")){
                                            JOptionPane.showMessageDialog(fullPanel,"Fill up all the fields");
                        }
                                else{
                                full.hireFullTimeStaff(staffName,joiningDate,qualification,appointedBy);
                                JOptionPane.showMessageDialog(fullPanel,"Full-time staff has been hired!");
                                break;
                            }
                            
                            }
                        }else{
                            JOptionPane.showMessageDialog(fullPanel,"This vacancy number is not for full-time staff hire.");
                            break;
                        }
                    }
                }
                if(!vNoFound){
                    JOptionPane.showMessageDialog(fullPanel,"Invalid vacancy number.");
                }
            }catch(Exception a){
                JOptionPane.showMessageDialog(fullPanel,"Please enter the appropriate value.");
            }
        }
        
       
        if(e.getSource()==btnAddPartTime){
            
            /* When btnAddPartTime button is pressed, a part time vacancy is added
             * new local variables to store the values from the text field is creates
             * then try catch block is used in order to filter the exceptions
             * 
             */
            int vacancyNumber=0,wagesPerHour=0,workingHour=0;
            String designation="",jobType="",shifts="";
            boolean isDuplicateVNo=false;
            try{
                vacancyNumber = Integer.parseInt(addPTVacancyNumber.getText());
                designation = addPTDesignation.getText();
                wagesPerHour = Integer.parseInt(addPTWages.getText());
                jobType = "Part Time";
                shifts = (boxShifts.getSelectedItem()).toString();
                workingHour = Integer.parseInt(addPTWorkingHours.getText());
                
                
                    for(StaffHire var:arr){
                        if(var.getVacancyNumber()==vacancyNumber){
                            isDuplicateVNo=true;
                            break;
                        }
                    }
                
                    if(isDuplicateVNo==false){
                        if((addPTVacancyNumber.getText()).equals("")||addPTDesignation.getText().equals("")||addPTWages.getText().equals("")
                        ||addPTWorkingHours.getText().equals("")){
                                    JOptionPane.showMessageDialog(partPanel,"Fill up all the fields");
                        }
                        
                        else{
                            part = new PartTimeStaffHire(vacancyNumber, designation, jobType, workingHour,wagesPerHour,  shifts);
                            arr.add(part);
                            JOptionPane.showMessageDialog(partPanel,"Vacancy for part-time staff is added."+" Total vacancies: "+arr.size());
                    }
                    }
                    else{
                        JOptionPane.showMessageDialog(partPanel,"Vacancy number is repeated.");
                    }
                 
            }catch(Exception a){
                JOptionPane.showMessageDialog(partPanel,"Please enter the appropriate value.");
            
            }   
        }
        

        if(e.getSource()==btnAppointPartTime){
            
            /* When btnAppointPartTime button is pressed, a part time staff is appointed
             * new local variables to store the values from the text field is creates
             * then try catch block is used in order to filter the exceptions
             * 
             */
            year=(cmbYearPA.getSelectedItem()).toString();
            month=(cmbMonthPA.getSelectedItem()).toString();
            day=(cmbDayPA.getSelectedItem()).toString();
        
            int vacancyNumber;
            String staffName,joiningDate,qualification,appointedBy;
            boolean vNoFound=false;
            
            try{
                vacancyNumber = Integer.parseInt(appointPTVacancyNumber.getText());
                staffName = appointPTName.getText();
                qualification = appointPTQualification.getText();
                appointedBy = appointPTAppointedBy.getText();
                joiningDate = year+"/"+month+"/"+day;
                
                for(StaffHire obj:arr){
                    if(obj.getVacancyNumber()==vacancyNumber){
                        vNoFound=true;
                        if(obj instanceof PartTimeStaffHire){
                            part = (PartTimeStaffHire)obj;
                            if(part.getJoined()==true){
                                JOptionPane.showMessageDialog(partPanel,"Part-time staff is already hired!");
                            }else{
                                if((appointPTVacancyNumber.getText()).equals("")||appointPTName.getText().equals("")||appointPTQualification.getText().equals("")
                                    ||appointPTAppointedBy.getText().equals("")){
                                    JOptionPane.showMessageDialog(partPanel,"Fill up all the fields");
                                }
                                else{
                        
                                part.hirePartTimeStaff(staffName, joiningDate,  qualification, appointedBy);
                                JOptionPane.showMessageDialog(partPanel,"Part-time staff has been hired!");
                                break;
                            }
                            
                            }
                        }else{
                            JOptionPane.showMessageDialog(partPanel,"This vacancy number is not for part time staff Hire");
                            break;
                        }
                    }
                }
                if(!vNoFound){
                    JOptionPane.showMessageDialog(partPanel,"Invalid vacancy number.");
                }
            }catch(Exception a){
                JOptionPane.showMessageDialog(partPanel,"Please enter the appropriate value.");
            }
        }        
        
        
        if(e.getSource()==btnTerminate){
            /* When the btnTerminate button is pressed, the appointed staff is terminated
             * If the entered vacancy number is already appointed
             * The staff is terminated
             * 
             */
            int vacancyNumber; 
            boolean vNoFound = false;
            try{
                vacancyNumber = Integer.parseInt(terminateVacancyNumber.getText());
                int index = 0;
                for(StaffHire obj:arr){
                    if(obj.getVacancyNumber()==vacancyNumber){
                        vNoFound=true;
                        if(obj instanceof PartTimeStaffHire){
                            part = (PartTimeStaffHire)obj;
                            if(part.getTerminated()==false && part.getJoined()==true){ 
                                
                                part.setTerminated();
                                JOptionPane.showMessageDialog(partPanel,"Part-time staff has been terminated!");
                               
                                break;
                                
                            }else{
                                JOptionPane.showMessageDialog(partPanel,"Part-time staff has not joined yet.");
                            }
                        
                    }else{
                        JOptionPane.showMessageDialog(partPanel,"This vacancy number is not of part time staff.");
                        break;
                    }
                }
                
                }if(!vNoFound){
                    JOptionPane.showMessageDialog(partPanel,"Invalid vacancy number.");
                }
            }catch(Exception a){
                JOptionPane.showMessageDialog(partPanel,"Please enter the appropriate value.");
            }
        }
        if(e.getSource()==btnDisplay){
            /* When the btnDisplay button is pressed
             * all intstances of FullTimeStaffHire 
             * and all instances of PartTimeStaffHire are displayed
             */
            for(StaffHire obj:arr){
                if(obj instanceof FullTimeStaffHire){
                    System.out.println("-----------------------------------");
                    System.out.println("Full Time Staff Hire information: ");
                    System.out.println("-----------------------------------");
                    ((FullTimeStaffHire)obj).displayStaffDetails();
                }
                else{
                    System.out.println("-----------------------------------");
                    System.out.println("Part Time Staff Hire information: ");
                    System.out.println("-----------------------------------");
                    ((PartTimeStaffHire)obj).displayStaffDetails();
                }
            }
        
        
        }
        if(e.getSource()==btnClearFullTime){
            /* When btnClearFullTime button is pressed
             * All the text fields of the fullPanel are set to ("") 
             */
            addFTVacancyNumber.setText("");addFTSalary.setText("");addFTDesignation.setText("");addFTWorkingHours.setText("");
            appointFTVacancyNumber.setText("");appointFTQualification.setText("");appointFTName.setText("");appointFTAppointedBy.setText("");
            
            cmbYearFA.setSelectedIndex(1);cmbMonthFA.setSelectedIndex(1);cmbDayFA.setSelectedIndex(1);
            
        }
        if(e.getSource()==btnClearPartTime){
            /* When btnClearPartTime button is pressed
             * All the text fields of the partPanel are set to ("") 
             */
            addPTVacancyNumber.setText("");addPTWages.setText("");addPTDesignation.setText("");addPTWorkingHours.setText("");
            appointPTVacancyNumber.setText("");appointPTQualification.setText("");appointPTName.setText("");appointPTAppointedBy.setText("");
            terminateVacancyNumber.setText("");
            
            cmbYearPA.setSelectedIndex(1);cmbMonthPA.setSelectedIndex(1);cmbDayPA.setSelectedIndex(1);
        }
    }
}
