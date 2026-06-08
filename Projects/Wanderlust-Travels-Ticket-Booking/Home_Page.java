package Wanderlust_Travels_Ticket_Booking;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Home_Page {
	static Scanner obj = new Scanner(System.in);
	int ErrorCount = 0;

	void view() throws IOException {
	    File Ticket=new File("D:\\JAVA\\Mini project\\flightticket.txt");           //File to print the remaining part of the ticket 
		FileReader fw=new FileReader(Ticket);
		BufferedReader bfw=new BufferedReader(fw);
		Scanner scanbfw=new Scanner(bfw);
		while(scanbfw.hasNextLine()) {
			String line=scanbfw.nextLine();                    //Reads a full line
			System.out.println(line);                          //Prints line
		}
		scanbfw.close();
	}
	
	void cancel() {
	    File ticketFile = new File("D:\\JAVA\\Mini project\\flightticket.txt");

	    // Check if file exists and is not empty
	    if (!ticketFile.exists() || ticketFile.length() == 0) {
	        System.out.println("No active ticket found to cancel.");
	        return;
	    }

	    try {
	        FileWriter fw = new FileWriter(ticketFile); // Overwrite mode (not append)
	        BufferedWriter bw = new BufferedWriter(fw);

	        bw.write(""); // Clear the content
	        bw.write("Ticket cancelled succesfully");
	        bw.close();

	        System.out.println("Your flight ticket has been cancelled successfully.");
	    } catch (IOException e) {
	        System.out.println("An error occurred while cancelling the ticket: " + e.getMessage());
	    }
	}

	
	void bookflight() throws IOException {
        String[] FlightData = {
        	    "AI101 | Chennai | Delhi | 10:30 AM",
        	    "SG202 | Chennai | Mumbai | 11:45 AM",
        	    "6E303 | Delhi | Kolkata | 06:50 AM",
        	    "AI304 | Mumbai | Ahmedabad | 09:15 AM",
        	    "6E401 | Bangalore | Hyderabad | 07:30 AM",
        	    "SG509 | Lucknow | Bhopal | 10:00 AM",
        	    "AI402 | Pune | Jaipur | 06:45 PM",
        	    "6E605 | Guwahati | Kolkata | 08:00 AM",
        	    "SG606 | Ranchi | Patna | 02:10 PM",
        	    "AI707 | Srinagar | Delhi | 09:00 AM",
        	    "6E708 | Kochi | Chennai | 05:00 PM",
        	    "SG809 | Trivandrum | Bangalore | 06:30 AM",
        	    "AI910 | Indore | Mumbai | 12:15 PM",
        	    "6E911 | Jaipur | Chandigarh | 08:45 AM",
        	    "SG1012 | Dehradun | Delhi | 04:30 PM",
        	    "AI1113 | Nagpur | Hyderabad | 01:50 PM",
        	    "6E1214 | Bhubaneswar | Vizag | 07:00 AM",
        	    "SG1315 | Ahmedabad | Goa | 06:00 PM",
        	    "AI1416 | Delhi | Leh | 05:30 AM",
        	    "6E1517 | Kolkata | Port Blair | 09:20 AM",
        	    "SG1618 | Mumbai | Udaipur | 03:00 PM"
            };
        
		File flight=new File("D:\\JAVA\\Mini project\\flightdetails.txt");
		FileWriter w = new FileWriter(flight);            // FileWriter for writing
		BufferedWriter bw = new BufferedWriter(w);         // BufferedWriter for efficient writing
		for(String a:FlightData) {
			bw.write(a+"\n");
		}
		bw.flush();
		bw.close();
		
		 System.out.println("=== Available Flight Routes ===\n");
         System.out.println("We have flight service from Chennai to Delhi");
	     System.out.println("We have flight service from Chennai to Mumbai");
	     System.out.println("We have flight service from Delhi to Kolkata");
         System.out.println("We have flight service from Mumbai to Ahmedabad");
         System.out.println("We have flight service from Bangalore to Hyderabad");
	     System.out.println("We have flight service from Lucknow to Bhopal");
         System.out.println("We have flight service from Pune to Jaipur");
         System.out.println("We have flight service from Guwahati to Kolkata");
         System.out.println("We have flight service from Ranchi to Patna");
	     System.out.println("We have flight service from Srinagar to Delhi");
         System.out.println("We have flight service from Kochi to Chennai");
         System.out.println("We have flight service from Trivandrum to Bangalore");
         System.out.println("We have flight service from Indore to Mumbai");
	     System.out.println("We have flight service from Jaipur to Chandigarh");
         System.out.println("We have flight service from Dehradun to Delhi");
         System.out.println("We have flight service from Nagpur to Hyderabad");
	     System.out.println("We have flight service from Bhubaneswar to Vizag");
         System.out.println("We have flight service from Ahmedabad to Goa");
         System.out.println("We have flight service from Delhi to Leh");
	     System.out.println("We have flight service from Kolkata to Port Blair");
         System.out.println("We have flight service from Mumbai to Udaipur");

	    obj.nextLine();    
		System.out.println("Enter From:");
		String from=obj.nextLine();
		System.out.print("Enter To: ");
	    String to = obj.nextLine();
		
	    File Ticket=new File("D:\\JAVA\\Mini project\\flightticket.txt");           //File to print the remaining part of the ticket 
		FileWriter fw=new FileWriter(Ticket);
		BufferedWriter bfw=new BufferedWriter(fw);
		
		FileReader r = new FileReader(flight);            // FileReader for reading
		BufferedReader br = new BufferedReader(r);         // BufferedReader for efficient reading
		Scanner fr=new Scanner(br);
		boolean matchfound=false;
		while(fr.hasNextLine()) {
			String line=fr.nextLine();                    //Reads a full line
			String parts[]=line.split("\\|");               //Splits a line into sub parts wherever | symbol occurs and then store it in an array
			String fromcity=parts[1].trim();                     //Stores from part after removing trailing spaces
			String tocity=parts[2].trim();                       //Stores to part after removing trailing spaces
			if(fromcity.equalsIgnoreCase(from.trim()) && tocity.equalsIgnoreCase(to.trim())) {
				System.out.println("Flight details are:");
				System.out.println("Flight ID:"+ parts[0].trim());
				System.out.println("Flight departing from:"+fromcity);
				System.out.println("Flight landing at:"+tocity);
				System.out.println("Flight departing time:"+parts[3].trim());
				bfw.write("Flight ID: "+parts[0].trim()+"\n");
				bfw.write("Flight departing from: "+fromcity+"\n");
				bfw.write("Flight landing at: "+tocity+"\n");
				bfw.write("Flight departing time: "+parts[3].trim()+"\n");
				matchfound=true;
			}
		}
		fr.close();
		if(!matchfound){
			System.out.println("Flight not found for the desired route.");
		}
		
		System.out.println("Select class:");
		System.out.println("1.Economy class\n2.Premium Economy class\n3.Business Class\n4.First Class");
		double baseprice=3000;
		double classgst=0;
		int Class=obj.nextInt();
		
		if(Class==1) {
			System.out.println("Cost is "+baseprice);
			classgst+=baseprice*0.05;                            //economy class gst is 5%
		}
		else if(Class==2) {
			baseprice*=1.5;
			System.out.println("Cost is "+baseprice);
			classgst+=baseprice*0.10;                          //Premium economy class gst is 10%
		}
		else if(Class==3) {
			baseprice*=3;
			System.out.println("Cost is "+baseprice);
			classgst+=baseprice*0.12;                          //Business class gst is 12%
		}
		else if(Class==4){
			baseprice*=5;
			System.out.println("Cost is "+baseprice);
			classgst+=baseprice*0.15;                          //Premium economy class gst is 15%
		}
		else {
			System.out.println("invalid option.");
		}
		
		System.out.println("Choose your meal course:");
		System.out.println("1.Veg meal\n2.Non Veg meal\n3.Snacks and Drinks\n4.No food");
		int mealoption=obj.nextInt();
		double mealcost=0;
		double foodgst=0;
		if(mealoption==1) {
			System.out.println("Veg meal selected. Cost:200");
			mealcost+=200;
			foodgst+=mealcost*0.05;                                 //5% food gst          
		}
		else if(mealoption==2) {
			System.out.println("Non Veg meal selected. Cost:400");
			mealcost+=400;
			foodgst+=mealcost*0.05;                                
		}
        else if(mealoption==3) {
        	System.out.println("Snacks and Drinks. Cost:150");
        	mealcost+=150;
        	foodgst+=mealcost*0.05;                                 
		}
        else if(mealoption==4) {
        	System.out.println("No food. Cost:0");
        	foodgst+=mealcost*0.05;                                 
		}
        else {
        	System.out.println("Invalid option.Re enter:");
        }
		double totalfare=baseprice+mealcost+classgst+foodgst;
		System.out.println("Total ticket fare:"+totalfare);
		bfw.write("Total Fare:"+totalfare);
		bfw.flush();
		bfw.close();
		
		view();
	}
		
	void logout() {
		System.out.println("----------------------------------\nThank you for using Wanderlust\nSuccesfully logged out:))\n----------------------------------");
	}
	
	void Login() {
		System.out.println("Enter the username:");
		String loginusername=obj.nextLine();                     //enter username for login if u remember
		
	    try {
	    	File details = new File("D:\\JAVA\\Mini project\\details.txt");
	    	FileReader r=new FileReader(details);
	    	BufferedReader br=new BufferedReader(r);
	        
	    	Scanner filereading=new Scanner(br);
	    	
	    	String actualusername=" ";
	    	String actualpassword=" ";
	    	if(!(filereading.hasNextLine())) {
	    		System.out.println("No user exists. Register first");
	    		Register();
	    		return;
	    	}
	    	else {
		    	 actualusername=filereading.nextLine();
		         int UserNameErrorCount=0;
		         while(!loginusername.equals(actualusername)) {                    //checks if actual username and entered username are equal
		        	 ErrorCount++;
		        	 System.out.println("Invalid Username. Enter again");            
		        	 loginusername=obj.nextLine();
		        	 
		        	 if(ErrorCount==2) {                                           
		        		 System.out.println("Forgotten the username(1/0)?\nChoose Yes for 1 and 0 for no:");       
		        		 int option=obj.nextInt();
		        		 obj.nextLine(); 
		        		 
		        		 if(option==1) {
		        			 Register();                                           //if forgotten username jumps to re register 
		        			 return;
		        		 }
		        		 else {
			        		 RegisterError();                                      //print error message if no attempts reached
			        		 return;
		        		 }
		        	 }
		         }
		 		
		         ErrorCount=0;
		 		 System.out.println("Enter your password:");              //enter password for login if u remember
		 		 String loginpassword=obj.nextLine();
		 		 actualpassword=filereading.nextLine();
		    	 
		 		while(!loginpassword.equals(actualpassword)) {
		        	 ErrorCount++;
		        	 System.out.println("Invalid password. Enter again");         //checks if actual password and entered password are equal
		        	 loginpassword=obj.nextLine();
		        	 
		        	 if(ErrorCount==2) {
		        		 System.out.println("Forgotten the password(1/0)?\nChoose Yes for 1 and 0 for no:");
		        		 int option=obj.nextInt();
		        		 obj.nextLine(); 
		        		 
		        		 if(option==1) {
		        			 Register();                 //If forgotten password re register 
		        			 return;
		        		 }
		        		 else {
			        		 RegisterError();           //print error message if no attempts reached
			        		 return;
		        		 }
		        	 }
		         }
		 		 br.close();
		 		 System.out.println("Succesfully logined\n");
		 		 System.out.println("----------------------------------\nWelcome to your dashboard\n----------------------------------");
		 		 System.out.println("1.Search and book flight");
		 		 System.out.println("2.View my booking");
		 		 System.out.println("3.Cancel flight");
		 		 System.out.println("4.Logout\n");
		 		 System.out.println("Choose your option:");
		 		 int option=obj.nextInt();
		    	 if(option==1) {
		    		 bookflight();
		    	 }
		    	 else if(option==2) {
		    		 view();
		    	 }
		    	 else if(option==3) {
		    		 cancel();
		    	 }
		    	 else if(option==4) {
		    		 logout();
		    	 }
		    	 else {
		    		 System.out.println("Invalid option.");
		    	 }
	    	}

	    }
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

	void RegisterError() {
		System.out.println("Error, Crossed limit to input.");                  //printing this if three times for each individual feature the input is invalid
	}

	void Register() throws IOException{
		System.out.println("\nEnter your details to register.");

		// 1. Full Name in CAPITAL letters
		System.out.println("\n1. Full Name (Capital only):");
		String name = obj.nextLine();

		while (true) {
			boolean allCaps = true;
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (!((int) ch >= 65 && (int) ch <= 90) && ch != ' ') {       //capital letters and space
					allCaps = false;
					break;
				}
			}
			if (allCaps) {
				ErrorCount = 0;
				break;
			} 
			else {
				System.out.println("Error! Re-enter the name in CAPITAL letters:");
				ErrorCount++;
				name = obj.nextLine();

				if (ErrorCount == 2) {
					RegisterError();
					return;
				}
			}
		}

		// 2. Age
		System.out.println("\n2. Age:");
		String age = obj.nextLine();

		while (true) {
			try {
				int number = Integer.parseInt(age);
				if (age.length() <= 3 && number <= 122 && number > 0) {                 //0 to 122
					ErrorCount = 0;
					break;
				} 
				else {
					System.out.println("Invalid age. Please enter once again:");
					age = obj.nextLine();
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter numeric age only:");
				age = obj.nextLine();
				ErrorCount++;

				if (ErrorCount == 2) {
					RegisterError();
					return;
				}
			}
		}

		// 3. Gender
		System.out.println("\n3. Gender (M/F):");
		String gender = obj.nextLine();

		while (!((int) gender.charAt(0) == 77 || (int) gender.charAt(0) == 70)) {          //M or F
			System.out.println("Error! Enter only M/F:");
			ErrorCount++;
			gender = obj.nextLine();

			if (ErrorCount == 2) {
				RegisterError();
				return;
			}
		}
		ErrorCount = 0;

		// 4. Email
		System.out.println("\n4. Email:");
		String Email = obj.nextLine();

		while (true) {
			int atcount = 0;
			for (int i = 0; i < Email.length(); i++) {
				if ((int) Email.charAt(i) == 64) atcount++; // @ ASCII = 64
			}
			if ((atcount == 1) && (Email.endsWith("@gmail.com"))) {
				ErrorCount = 0;
				break;
			}
			else {
				System.out.println("Format Error. Re-enter email:");
				ErrorCount++;
				Email = obj.nextLine();

				if (ErrorCount == 2) {
					RegisterError();
					return;
				}
			}
		}

		// 5. Phone Number
		System.out.println("\n5. Phone Number (10 digits):");
		String num = obj.nextLine();

		while (true) {
			boolean allchar = false;
			for (int i = 0; i < num.length(); i++) {
				char ch = num.charAt(i);
				if (!((int) ch >= 48 && (int) ch <= 57)) {
					allchar = true;
					break;
				}
			}
			if (num.length() != 10 || allchar || num.charAt(0) == '0') {             //fist no and length check 
				System.out.println("Error! Re-enter:");
				ErrorCount++;
				num = obj.nextLine();

				if (ErrorCount == 2) {
					RegisterError();
					return;
				}
			} 
			else {
				ErrorCount = 0;
				break;
			}
		}

		// 6. Username
		System.out.println("\n6. Username (unique):");
		String username = obj.nextLine();

		// 7. Password
		if (username.length() > 0) {
			System.out.println("\n7. Password (with basic validation):");
			System.out.println("Min:12 length\nUse upper case and special characters.");
			String password = obj.nextLine();

			while (true) {
				int passwordlength = 0;
				int uppercasecount = 0;
				int specialcharactercount = 0;

				for (int i = 0; i < password.length(); i++) {
					char ch = password.charAt(i);
					passwordlength++;

					if (((int) ch >= 32 && (int) ch <= 47) ||
						((int) ch >= 58 && (int) ch <= 64) ||
						((int) ch >= 91 && (int) ch <= 96) ||
						((int) ch >= 123 && (int) ch <= 126)) {                //special characters check
						specialcharactercount++;
					}

					if ((int) ch >= 65 && (int) ch <= 90) {
						uppercasecount++;                                     //uppercase letters check
					}
				}

				if (passwordlength >= 12 && uppercasecount != 0 && specialcharactercount != 0) {
					ErrorCount = 0;
					break;
				} 
				else {
					System.out.println("Warning: Enter a stronger password:");
					ErrorCount++;
					password = obj.nextLine();
					if (ErrorCount == 3) {
						RegisterError();
						return;
					}
				}
			}
             
			File details = new File("D:\\JAVA\\Mini project\\details.txt"); // Creating a File object
			FileWriter w = new FileWriter(details);            // FileWriter for writing
			BufferedWriter bw = new BufferedWriter(w);         // BufferedWriter for efficient writing
            bw.write(username+"\n");                           //writing username
            bw.write(password+"\n");                           //writing password
			bw.write(Email+"\n");                                //writing email
			bw.write(age+"\n");                                  //writing age
			bw.write(gender+"\n");                             //writing gender
            bw.write(num+"\n");                                //writing num
            
            
            bw.flush();
			bw.close();
			
			// Registration Success
			System.out.println("\nRegistration Successful! Welcome, " + name+" Ready to login.");
			Login();
		}
	}

	void Exit() {
		System.out.println("----------------------------------\n----------------------------------");
		System.out.println("Thank you for visiting Wanderlust!");
		System.out.println("Safe Travels :)");
		System.out.println("----------------------------------\n----------------------------------");
	}

	public static void main(String[] arg) {
		System.out.println("..........WELCOME TO WANDERLUST TRAVELS..........");
		System.out.println("1. Login \n2. Register \n3. Exit");
		System.out.println("\nChoose your option:");

		int num = obj.nextInt();
		obj.nextLine(); // Consume leftover newline

		Home_Page object = new Home_Page();

		if (num == 1) {
			object.Login();
		} 
		else if (num == 2) {
			try {
				object.Register();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		} 
		else if (num == 3) {
			object.Exit();
		} 
		else {
			System.out.println("Invalid option");
		}
	}
}
