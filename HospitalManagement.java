import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text; // Import Text
import javafx.stage.Stage;

public class HospitalManagement extends Application {
	
	private Staff[] s = new Staff[100];
	private Doctor[] d = new Doctor[25];
	private Patient[] p = new Patient[100];
	private Medical[] m = new Medical[100];
	private Lab[] l = new Lab[20];
	private Facility[] f = new Facility[20];
	
    private Stage primaryStage;
    private Scene mainScene;

    public static void main(String[] args) 
    {
        launch(args);
    }
 
    public void initializeData()
    {
    	initializeStaff();
     	initializeDoc();
     	initializePat();
     	initializeMedical();
     	initializeLab();
     	intializeFacility();
    }  
    public void initializeStaff()
    {
    	s[0] = new Staff();
        s[0].staff_id = "832";
        s[0].staff_name = "Darren";
        s[0].designation = "Worker";
        s[0].sex = "Male ";
        s[0].salary = 5000; 
        
        s[1] = new Staff();
        s[1].staff_id = "23";
        s[1].staff_name = "Calvin";
        s[1].designation = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        
        s[2] = new Staff();
        s[2].staff_id = "24";
        s[2].staff_name = "Vanness";
        s[2].designation = "Worker";
        s[2].sex = "Male ";
        s[2].salary = 5000;
        
        s[3] = new Staff();
        s[3].staff_id = "25";
        s[3].staff_name = "Jasmine";
        s[3].designation = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 4500;
    }
    public void initializeDoc(){
    	d[0] = new Doctor();
        d[0].doc_id = "832";
        d[0].doc_name = "Dr.Darren";
        d[0].specialist = "Surgeon";
        d[0].workTime = "8-11 AM";
        d[0].qualification = "MBBS,MD";
        d[0].doc_room = 11;
        
    	d[1] = new Doctor();
        d[1].doc_id = "203";
        d[1].doc_name = "Dr.Calvin";
        d[1].specialist = "Physician";
        d[1].workTime = "10-3 AM";
        d[1].qualification = "MBBS,MS ";
        d[1].doc_room = 45;
        
        d[2] = new Doctor();
        d[2].doc_id = "784";
        d[2].doc_name = "Dr.Vann";
        d[2].specialist = "Pediatrics";
        d[2].workTime = "7-11 AM";
        d[2].qualification = "MBBS,MD";
        d[2].doc_room = 8;
    }
    public void initializePat()
    {
    	 p[0] = new Patient();
    	 p[0].pat_id = "832";
         p[0].pat_name = "Darren";
         p[0].disease = "Covid";
         p[0].sex = "Male";
         p[0].admitStatus = "y";
         p[0].age = 30;
         
         p[1] = new Patient();
         p[1].pat_id = "203";
         p[1].pat_name = "Calvin";
         p[1].disease = "Fever";
         p[1].sex = "Male";
         p[1].admitStatus = "y";
         p[1].age = 23;
         
         p[2] = new Patient();
         p[2].pat_id = "412";
         p[2].pat_name = "Vanness";
         p[2].disease = "Malaria";
         p[2].sex = "Male";
         p[2].admitStatus = "y";
         p[2].age = 45;
         
         p[3] = new Patient();
         p[3].pat_id = "934";
         p[3].pat_name = "Jie Yew";
         p[3].disease = "Diabetes";
         p[3].sex = "Male";
         p[3].admitStatus = "y";
         p[3].age = 25;
    }
    public void initializeMedical()
    {
    	m[0] = new Medical();
    	m[0].med_name = "Corex";
        m[0].manufacturer = "Cino pvt";
        m[0].expiryDate = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        
        m[1] = new Medical();
        m[1].med_name = "Nytra";
        m[1].manufacturer = "Ace pvt";
        m[1].expiryDate = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        
        m[2] = new Medical();
        m[2].med_name = "Brufa";
        m[2].manufacturer = "Reckitt";
        m[2].expiryDate = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        
        m[3] = new Medical();
        m[3].med_name = "Pride";
        m[3].manufacturer = "DDF pvt";
        m[3].expiryDate = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;
    }
    public void initializeLab()
    {
    	l[0] = new Lab();
        l[0].lab_name = "X - ray";
        l[0].lab_cost = 800;

        l[1] = new Lab();
        l[1].lab_name = "CT Scan";
        l[1].lab_cost = 1200;

        l[2] = new Lab();
        l[2].lab_name = "OR Scan";
        l[2].lab_cost = 500;

        l[3] = new Lab();
        l[3].lab_name = "Lab 001";
        l[3].lab_cost = 50;
    }
    public void intializeFacility()
    {
    	f[0] = new Facility();
    	f[0].fac_name = "Ambulance";
    	
    	f[1] = new Facility();
        f[1].fac_name = "Admit Facility ";
        
    	f[2] = new Facility();
        f[2].fac_name = "Canteen";
        
    	f[3] = new Facility();
        f[3].fac_name = "Emergency";
    }

    @Override
    public void start(Stage primaryStage) 
    {
        this.primaryStage = primaryStage;
        initializeData();      // load the data 
        showMainScene();      // display the main scene 
    }
    
    public void showMainScene(){

    	// Main Layout 
        BorderPane mainPane = new BorderPane();
        VBox vb = new VBox();

        Text WelcomeMsg = new Text("*** Welcome to Hospital Management System  ***");
        Text Date_and_Time = new Text();
        Text Dash = new Text("-------------------------------------------------------------------------");
        Text mainMenu = new Text("Main Menu");
        
        Button btStaff = new Button("Staff");
        Button btDoc = new Button("Doctor");
        Button btPat = new Button("Patient");
        Button btMed = new Button("Medical");
        Button btLab = new Button("Lab");
        Button btFac = new Button("Facility");
        
        // Styling 
        WelcomeMsg.setFill(Color.DARKBLUE);
        WelcomeMsg.setFont(Font.font("Times New Roman",FontWeight.BOLD, 35));
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        WelcomeMsg.setEffect(r);
        WelcomeMsg.setTranslateY(-50);
        Date_and_Time.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 18));
        mainMenu.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 18));
        Dash.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 28));
        mainPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
        btStaff.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
        btDoc.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
        btPat.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
        btMed.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
        btLab.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
        btFac.setStyle("-fx-text-fill:red; -fx-background-color:beige; -fx-border-color: #ff0000; -fx-border-width: 2px; -fx-font-size: 18px; -fx-font-weight: bold;");
      
        
        // Format Button
        btStaff.setPrefSize(120,40);
        btDoc.setPrefSize(120,40);
        btPat.setPrefSize(120,40);
        btMed.setPrefSize(120,40);
        btLab.setPrefSize(120,40);
        btFac.setPrefSize(120,40);
        
       // Positioning
        Calendar(Date_and_Time);	// Call the calendar method to display the date and time on the screen
        vb.getChildren().addAll(WelcomeMsg,Date_and_Time,Dash,mainMenu,btStaff,btDoc,btPat,btMed,btLab,btFac);
        vb.setAlignment(Pos.CENTER);
        vb.setSpacing(20);
        mainPane.setCenter(vb);
        
        // Lambda event handler 
        btStaff.setOnAction(e-> {
        	StaffScene();
        });
        
        btDoc.setOnAction(e-> {
        	DoctorScene();
        });
        
        btPat.setOnAction(e-> {
        	PatientScene();
        });
        
        btMed.setOnAction(e-> {
        	MedicalScene();
        });
        
        btLab.setOnAction(e-> {
        	LabScene();
        });
        
        btFac.setOnAction(e-> {
        	FacilityScene();
        });
        
        mainScene = new Scene(mainPane,900,800);
        primaryStage.setTitle("Hospital Management");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    // Method to update the date and time in the Text node
    private void Calendar(Text text) 
    {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        
        String formattedDate = "Date: " + dateFormat.format(calendar.getTime());
        String formattedTime = "Time: " + timeFormat.format(calendar.getTime());
        String combinedText = formattedDate + "        " + formattedTime;
        text.setText(combinedText);
    }
    
    // Button return  main scene 
    private Button backButton(Stage primaryStage, Scene mainScene) 
    {
        Button btBack = new Button("Back");
        
        btBack.setOnAction(backEvent -> {
            primaryStage.setScene(mainScene); // Switch to the main scene
        });
        btBack.setPrefSize(160, 60);
        return btBack;
    }    
    
    private void StaffScene()
    {
        BorderPane Staffpane = new BorderPane();
        HBox hb = new HBox();
        Text StaffHeader = new Text(265,300,"*** Staff Section ***");
        Button btAdd = new Button("Add New Entry");
        Button btShow = new Button("Show Staff List");
        Button btBack = backButton(primaryStage, mainScene);
        
        // Styling
        StaffHeader.setFill(Color.DARKOLIVEGREEN);
        StaffHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));  
        Staffpane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
        
        // Formatting button
        btAdd.setPrefSize(160,60);
        btShow.setPrefSize(160,60);
        btBack.setPrefSize(160,60);
        
        // Positioning 
        Staffpane.getChildren().add(StaffHeader);
        hb.getChildren().addAll(btAdd,btShow,btBack);
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(40);
        Staffpane.setCenter(hb);
        
        // Button Add Staff Entry 
        btAdd.setOnAction(e -> 
        {
            Staff newStaff = new Staff();
            newStaff.newStaff(); // Call the input function to gather staff's information

            // Find an empty slot in the staff array and add the new staff's info
            for (int i = 0; i < s.length; i++) 
            {
                if (s[i] == null) 
                {
                    s[i] = newStaff;
                    break;
                }
            }
            // Display a message indicating the successful addition
            System.out.println("New staff's entry added.");
            System.out.println("Back to the scene to further display.\n");
        });
        
        btShow.setOnAction(e-> {

          	BorderPane sBorderPane = new BorderPane();
          	VBox sVBox = new VBox();
          	HBox sHBox = new HBox();
        	Button sBtReturn = new Button("Back");
          	Button sBtMain  = new Button("Main Menu");
          	Text sHeader = new Text("Staff ID\t\tStaff Name\t\t\tDesignation\t\t\tGender\t\t\t\tSalary");
        
          	// Styling
          	sHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
          	sBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
          
          	for(int i = 0; i < s.length; i++) {
              	
          		if (s[i] != null) {
          			
          			Text StaffShow = new Text(s[i].showStaffInfo());
          	
          			sVBox.getChildren().add(StaffShow);
          			StaffShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
          			
          		}
          	}
          	// Positioning 
          	sHBox.getChildren().addAll(sBtReturn, sBtMain);
         	sHBox.setPadding(new Insets(40, 0, 0, 0));
         	sHBox.setSpacing(450);
         	
         	sVBox.setSpacing(15);
         	sVBox.setPadding(new Insets(30, 0, 0, 5));
         	sVBox.getChildren().add(sHBox);
         	
         	sBorderPane.setTop(sHeader);
         	sBorderPane.setPadding(new Insets(80, 0, 0, 120));
         	sBorderPane.setCenter(sVBox);
         	
         	sBtReturn.setOnAction(backEvent-> {
         		StaffScene();
         	});
         	
         	sBtMain.setOnAction(backEvent-> {
         		showMainScene();
         	});
         	
         	Scene dShowScene = new Scene(sBorderPane, 900, 800);
         	primaryStage.setTitle("Staff Details");
         	primaryStage.setScene(dShowScene);
         	
          	});
         
         Scene nextScene = new Scene(Staffpane,900,800);
         primaryStage.setTitle("Staff");
         primaryStage.setScene(nextScene);
    }
        
    private void DoctorScene()
    {
         BorderPane DocPane = new BorderPane();
         HBox hb = new HBox();
         Text DocHeader = new Text(245,300,"*** Doctor Section ***");
         Button btAdd = new Button("Add New Entry");
         Button btShow = new Button("Show Doctor List");
         Button btBack = backButton(primaryStage, mainScene);
   
         // Styling
         DocHeader.setFill(Color.DARKOLIVEGREEN);
         DocHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));  
         DocPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
         // Formatting button
         btAdd.setPrefSize(160,60);
         btShow.setPrefSize(160,60);
         btBack.setPrefSize(160,60);
         
         // Positioning 
         DocPane.getChildren().add(DocHeader);
         hb.getChildren().addAll(btAdd,btShow,btBack);
         hb.setAlignment(Pos.CENTER);
         hb.setSpacing(40);
         DocPane.setCenter(hb);
         
         // Button Add Doc Entry 
         btAdd.setOnAction(event -> 
         {
             Doctor newDoctor = new Doctor();
             newDoctor.newDoctor(); // Call the input function to gather doctor's information
             
             // Find an empty slot in the doctor array and add the new doctor's info
             for (int i = 0; i < d.length; i++) 
             {
                 if (d[i] == null) {
                     d[i] = newDoctor;
                     break;
                 }
             }
             // Display a message indicating the successful addition
             System.out.println("New doctor's entry added.");
             System.out.println("Back to the scene to further display.\n");
          
         });
         
         // Show Doctor Content 
         btShow.setOnAction(e-> {

          	BorderPane dBorderPane = new BorderPane();
          	VBox dVBox = new VBox();
          	HBox dHBox = new HBox();
        	Button dBtReturn = new Button("Back");
          	Button dBtMain  = new Button("Main Menu");
          	Text dHeader = new Text("Doctor ID\t\tDoctor Name\t\t\tSpecialist\t\t\tConsult_hour\t\t\tQualifications\t\t\tDoc Room");
          	dBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
          
          	dHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
          	
          	for(int i = 0; i < d.length; i++) {
          	
          		if (d[i] != null) {
          			
          			Text DocShow = new Text(d[i].showDoctorInfo());
          			
          			dVBox.getChildren().add(DocShow);
          			DocShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
          			
          		}
          	}
          	
          	dHBox.getChildren().addAll(dBtReturn, dBtMain);
         	dHBox.setPadding(new Insets(40, 0, 0, 50));
         	dHBox.setSpacing(500);
         	
         	dVBox.setSpacing(15);
         	dVBox.setPadding(new Insets(30, 0, 0, 5));
         	dVBox.getChildren().add(dHBox);
         	
         	dBorderPane.setTop(dHeader);
         	dBorderPane.setPadding(new Insets(80, 0, 0, 40));
         	dBorderPane.setCenter(dVBox);
         	
         	dBtReturn.setOnAction(backEvent-> {
         		DoctorScene();
         	});
         	
         	dBtMain.setOnAction(backEvent-> {
         		showMainScene();
         	});
         	Scene dShowScene = new Scene(dBorderPane, 900, 800);
         	primaryStage.setTitle("Doctor Details");
         	primaryStage.setScene(dShowScene);

          	});
         
         Scene nextScene = new Scene(DocPane,900,800);
         primaryStage.setTitle("Doctor");
         primaryStage.setScene(nextScene);
    }

    private void PatientScene() 
    {
         BorderPane Patpane = new BorderPane();
         HBox hb = new HBox();
         Text PatHeader = new Text(245,300,"*** Patient Section ***");
         Button btAdd = new Button("Add New Entry");
         Button btShow = new Button("Show Patient List");
         Button btBack = backButton(primaryStage, mainScene);
         
         // Styling
         PatHeader.setFill(Color.DARKOLIVEGREEN);
         PatHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));
         Patpane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
        
         // Formatting button
         btAdd.setPrefSize(160,60);
         btShow.setPrefSize(160,60);
         btBack.setPrefSize(160,60);
         
         // Positioning 	
         Patpane.getChildren().add(PatHeader);
         hb.getChildren().addAll(btAdd,btShow,btBack);
         hb.setAlignment(Pos.CENTER);
         hb.setSpacing(40);
         Patpane.setCenter(hb);
         
         // Button Add Patient Entry 
         btAdd.setOnAction(e -> 
         {
             Patient newPatient = new Patient();
             newPatient.newPatient(); // Call the input function to gather patient's information

             // Find an empty slot in the patient array and add the new patient's info
             for (int i = 0; i < p.length; i++)
             {
                 if (p[i]  == null) 
                 {
                     p[i] = newPatient;
                     break;
                 }
             }
             // Display a message indicating the successful addition
             System.out.println("New patient's entry added.");
             System.out.println("Back to the scene to further display.\n");
         });
         
         // Show Patient Details
         btShow.setOnAction(e-> {

         	BorderPane pBorderPane = new BorderPane();
         	VBox pVBox = new VBox();
         	HBox pHBox = new HBox();
          	Button pBtReturn = new Button("Back");
         	Button pBtMain  = new Button("Main Menu");
         	Text pHeader = new Text("Patient ID\t\tPatient Name\t\t\tDisease\t\t\t\tGender\t\t\tAdmin Status\t\t\tAge");
         	
         	pHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
         	pBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
         	
         	for(int i = 0; i < p.length; i++) {
         	
         		if (p[i] != null) {
         			
         			Text PatShow = new Text(p[i].showPatientInfo());
         			
         			pVBox.getChildren().add(PatShow);
         			PatShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
         			
         		}
         	}
         	
         	pHBox.getChildren().addAll(pBtReturn, pBtMain);
        	pHBox.setPadding(new Insets(40, 0, 0, 40));
        	pHBox.setSpacing(500);
        	
        	pVBox.setSpacing(15);
        	pVBox.setPadding(new Insets(30, 0, 0, 5));
        	pVBox.getChildren().add(pHBox);
        	
        	pBorderPane.setTop(pHeader);
        	pBorderPane.setPadding(new Insets(80, 0, 0, 60));
        	pBorderPane.setCenter(pVBox);
        	
        	pBtReturn.setOnAction(backEvent-> {
        		PatientScene();
        	});
        	
        	pBtMain.setOnAction(backEvent-> {
        		showMainScene();
        	});
        	
        	Scene pShowScene = new Scene(pBorderPane, 900, 800);
        	primaryStage.setTitle("Patient Details");
        	primaryStage.setScene(pShowScene);

         	});
         
         Scene Nextscene = new Scene(Patpane,900,800);
         primaryStage.setTitle("Patient");
         primaryStage.setScene(Nextscene);
         
    }
    
    public void MedicalScene()
    {
    	BorderPane Medpane = new BorderPane();
        HBox hb = new HBox();
        Text MedHeader = new Text(240,300,"*** Medical Section ***");
        Button btAdd = new Button("Add New Entry");
        Button btShow = new Button("Show Medical List");
        Button btBack = backButton(primaryStage, mainScene);
        
        // Styling
        MedHeader.setFill(Color.DARKOLIVEGREEN);
        MedHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));  
        Medpane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
       
        // Formatting button
        btAdd.setPrefSize(160,60);
        btShow.setPrefSize(160,60);
        btBack.setPrefSize(160,60);
        
        // Positioning 
        Medpane.getChildren().add(MedHeader);
        hb.getChildren().addAll(btAdd,btShow,btBack);
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(40);
        Medpane.setCenter(hb);
        
        // Button Add Medical Entry 
        btAdd.setOnAction(e-> {
        	Medical newMedical = new Medical();
            newMedical.newMedical(); // Call the input function to gather medical's information

            // Find an empty slot in the medical array and add the new medical's info
            for (int i = 0; i < m.length; i++) 
            {
                if (m[i] == null) 
                {
                    m[i] = newMedical;
                    break;
                }
            }
            // Display a message indicating the successful addition
            System.out.println("New medical's entry added.");
            System.out.println("Back to the scene to further display.\n");
        });
        
        // show Medical Details 
        btShow.setOnAction(e-> {
            
        	BorderPane mBorderPane = new BorderPane();
        	VBox mVBox = new VBox();
        	HBox mHBox = new HBox();
        	
        	Text mHeader = new Text("Medicine name\t\t\tManufacturer\t\t\t\tExpired Date\t\t\t\tCost");
        	mHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
        	mBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
        	
        	Button mBtReturn = new Button("Back");
        	Button mBtMain  = new Button("Main Menu");
        	
        	
        	for(int i = 0; i < m.length; i++) {
        	
        		if (m[i] != null) {
        			
        			Text MedShow = new Text(m[i].findMedical());
        			
        			mVBox.getChildren().add(MedShow);
        			MedShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
   
        		}
        	}
        	
        	mHBox.getChildren().addAll(mBtReturn, mBtMain);
        	mHBox.setPadding(new Insets(40, 0, 0, 0));
        	mHBox.setSpacing(470);
        	
        	mVBox.setSpacing(15);
        	mVBox.setPadding(new Insets(30, 0, 0, 5));
        	mVBox.getChildren().add(mHBox);
        	
        	mBorderPane.setTop(mHeader);
        	mBorderPane.setPadding(new Insets(80, 0, 0, 120));
        	mBorderPane.setCenter(mVBox);
        	
        	mBtReturn.setOnAction(backEvent-> {
        		MedicalScene();
        	});
        	
        	mBtMain.setOnAction(backEvent-> {
        		showMainScene();
        	});
            
        	Scene mShowScene = new Scene(mBorderPane, 900, 800);
        	primaryStage.setTitle("Medical Details");
        	primaryStage.setScene(mShowScene);
        	
        	
        });
        
        Scene nextScene = new Scene(Medpane,900,800);
        primaryStage.setTitle("Medical");
        primaryStage.setScene(nextScene);
    
    
    }
    public void LabScene()
    {
    	BorderPane Labpane = new BorderPane();
        HBox hb = new HBox();
        Text LabHeader = new Text(275,300,"*** Lab Section ***");
        Button btAdd = new Button("Add New Entry");
        Button btShow = new Button("Show Lab List");
        Button btBack = backButton(primaryStage, mainScene);
        
        // Styling
        LabHeader.setFill(Color.DARKOLIVEGREEN);
        LabHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));  
        Labpane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
       
        // Formatting button
        btAdd.setPrefSize(160,60);
        btShow.setPrefSize(160,60);
        btBack.setPrefSize(160,60);

        // Positioning 
        Labpane.getChildren().add(LabHeader);
        hb.getChildren().addAll(btAdd,btShow,btBack);
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(40);
        Labpane.setCenter(hb);
        
        // Button Add Lab Entry 
        btAdd.setOnAction(e-> {
        	
        	 Lab newlab = new Lab();
             newlab.newLab(); // Call the input function to gather lab's information
             
             // Find an empty slot in the lab array and add the new lab's info
             for (int i = 0; i < l.length; i++) 
             {
                 if (l[i] == null) {
                     l[i] = newlab;
                     break;
                 }
             }
             // Display a message indicating the successful addition
             System.out.println("New lab's entry added.");
             System.out.println("Back to the scene to further display.\n");
             
        });
        
        // show Lab details 
        btShow.setOnAction(e-> {
        	
        	BorderPane lBorderPane = new BorderPane();
            VBox lVBox = new VBox();
            HBox lHBox = new HBox();
            Button lBtReturn = new Button("Back");
            Button lBtMain  = new Button("Main Menu");
            Text lHeader = new Text("Lab name\t\t\t\tCost");
            
            lHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
            lBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;

            for(int i = 0; i < l.length; i++) {
            	
                if(l[i] != null) {
                	
                    Text LabShow = new Text(l[i].labList());
                    
                    lVBox.getChildren().addAll(LabShow);
                    LabShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
                    
                }
            }
        	
        	lHBox.getChildren().addAll(lBtReturn, lBtMain);
        	lHBox.setPadding(new Insets(40, 0, 0, 0));
        	lHBox.setSpacing(120);
        	
        	lVBox.setSpacing(15);
        	lVBox.setPadding(new Insets(30, 0, 0, 5));
        	lVBox.getChildren().add(lHBox);
        	
        	lBorderPane.setTop(lHeader);
        	lBorderPane.setPadding(new Insets(100, 0, 0, 310));
        	lBorderPane.setCenter(lVBox);
            
        	lBtReturn.setOnAction(backEvent-> {
        		LabScene();
        	});
        	
        	lBtMain.setOnAction(backEvent-> {
        		showMainScene();
        	});
            
        	Scene lShowScene = new Scene(lBorderPane, 900, 800);
        	primaryStage.setTitle("Show Medical");
        	primaryStage.setScene(lShowScene);
        	
        });
        
        Scene nextScene = new Scene(Labpane,900,800);
        primaryStage.setTitle("Medical");
        primaryStage.setScene(nextScene);
    }
    
    public void FacilityScene()
    {
    	BorderPane Facpane = new BorderPane();
        HBox hb = new HBox();
        Text FacHeader = new Text(250,300,"*** Facility Section ***");
        Button btAdd = new Button("Add New Entry");
        Button btShow = new Button("Show Facility List");
        Button btBack = backButton(primaryStage, mainScene);

        // Styling
        FacHeader.setFill(Color.DARKOLIVEGREEN);
        FacHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 40));  
        Facpane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
       
        // Formatting button
        btAdd.setPrefSize(160,60);
        btShow.setPrefSize(160,60);
        btBack.setPrefSize(160,60);

        // Positioning 
        Facpane.getChildren().add(FacHeader);
        hb.getChildren().addAll(btAdd,btShow,btBack);
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(40);
        Facpane.setCenter(hb);
        
        // Add Facility Entry 
        btAdd.setOnAction(e-> {
        	
        	Facility newFacility = new Facility();
            newFacility.newFacility(); // Call the input function to gather facility's information
            
            // Find an empty slot in the facility array and add the new facility's info
            for (int i = 0; i < f.length; i++) 
            {
                if (f[i] == null) {
                    f[i] = newFacility;
                    break;
                }
            }
            // Display a message indicating the successful addition
            System.out.println("New facility's entry added.");
            System.out.println("Back to the scene to further display.\n");
        });
        
        // show Facility Details 
        btShow.setOnAction(e-> {
        	
        	BorderPane fBorderPane = new BorderPane();
        	VBox fVBox = new VBox();
        	HBox fHBox = new HBox();
          	Button fBtReturn = new Button("Back");
        	Button fBtMain  = new Button("Main Menu");
        	Text fHeader = new Text("Facility name");
        	
        	fHeader.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR, 14));
        	fBorderPane.setBackground(new Background(new BackgroundFill(Color.LAVENDER, null, null)));;
        	
        	for(int i = 0; i < f.length; i++) {
        		
        		if(f[i] != null) {
        			
        			Text FacShow = new Text(f[i].showFacility());
        			
        			fVBox.getChildren().addAll(FacShow);
        			FacShow.setFont(Font.font("Courier",FontWeight.NORMAL,FontPosture.REGULAR, 14));
        			
        		}
        	}
        	
        	fHBox.getChildren().addAll(fBtReturn, fBtMain);
        	fHBox.setPadding(new Insets(20, 0, 0, -70));
        	fHBox.setSpacing(120);
        	
        	fVBox.setSpacing(15);
        	fVBox.setPadding(new Insets(30, 0, 0, 5));
        	fVBox.getChildren().add(fHBox);
        	
        	fBorderPane.setTop(fHeader);
        	fBorderPane.setPadding(new Insets(120, 0, 0, 380));
        	fBorderPane.setCenter(fVBox);
            
        	fBtReturn.setOnAction(backEvent-> {
        		FacilityScene();
        	});
        	
        	fBtMain.setOnAction(backEvent-> {
        		showMainScene();
        	});
            
        	Scene lShowScene = new Scene(fBorderPane, 900, 800);
        	primaryStage.setTitle("Show Medical");
        	primaryStage.setScene(lShowScene);
        	
        });
        
        Scene nextScene = new Scene(Facpane,900,800);
        primaryStage.setTitle("Medical");
        primaryStage.setScene(nextScene);
    }
}