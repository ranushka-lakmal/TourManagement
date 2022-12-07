
package final2021;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) throws InterruptedException {
           
       Scanner cin = new Scanner(System.in);
       boolean isExit = false; 
       
       do {
			System.out.println("\n\n######################### WELCOME TO TOURIST APP ###################################");Thread.sleep(500);
			System.out.println("\n\t\tPlease select the action you want to perform\n");Thread.sleep(500);
			System.out.println("Press 1 for: Museum");Thread.sleep(500);
			System.out.println("Press 2 for: Theater");Thread.sleep(500);
            System.out.println("Press 3 for: Park");Thread.sleep(500);
			System.out.println("Press 4 for: Exit");Thread.sleep(500);
			System.out.println("\n##################################################################################\n\n");Thread.sleep(500);

			int choosenCase = cin.nextInt(); 
                        
            switch (choosenCase) {
			case 1:
                                /*Museum*/
                                System.out.println("\n##################### VIEW ALL MUSEUMS #####################\n");Thread.sleep(500);
                                 
                                Museum m1 = new Museum(1, "test description", "Miitary", "Army Museum", 830, 1730, 450, "London");
                                m1.addMuseum1();
                                
                                Museum m2 = new Museum(2, "test description", "Type 2", "City Museum", 2030, 1900, 10, "Bristol");
                                
                                if(m2.cost < 5){
                                  if(m2.oTime > 1900){     
                                System.out.println("ID          : " + m2.getMuseumId());
                                System.out.println("Name        : " + m2.getName());
                                System.out.println("Location    : " + m2.getLocation());
                                System.out.println("Meseum Type : " + m2.getMeseumType());
                                System.out.println("Open Time   : " + m2.getoTime()+ " A.M");
                                System.out.println("close Time   : " + m2.getcTime()+ " P.M");
                                System.out.println("Ticket Cost : " + m2.getCost()+ "£ (Sterling Pound)");
                                System.out.println("Description : " + m2.getDescription());
                                System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
                                  }
                                }  
                                
                                Museum m3 = new Museum(3, "test description for 3", "Civil", "London Museum", 1930, 2230, 4, "Ripon1");
                                if(m3.cost < 5){
                                  if(m3.oTime > 1900){   
                 
                                        System.out.println("ID " + m3.getMuseumId());
                                        System.out.println("Name " + m3.getName());
                                        System.out.println("Location " + m3.getLocation());
                                        System.out.println("Open Time " + m3.getoTime()+ " A.M");
                                        System.out.println("close Time " + m3.getcTime()+ " P.M");
                                        System.out.println("Ticket Cost " + m3.getCost()+ "£ (Sterling Pound)");
                                        System.out.println("Description " + m3.getDescription());
                                        System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
                                  }
                                }
                               
                                Museum m4 = new Museum(4, "test description for 3", "Civil", "London Museum", 1930, 2400, 2, "Ripon1");
                                 if(m3.cost < 5){
                                  if(m3.oTime > 1900){ 
                 
                                        System.out.println("ID " + m4.getMuseumId());
                                        System.out.println("Name " + m4.getName());
                                        System.out.println("Location " + m4.getLocation());
                                        System.out.println("Open Time " + m4.getoTime()+ " A.M");
                                        System.out.println("close Time " + m4.getcTime()+ " P.M");
                                        System.out.println("Ticket Cost " + m4.getCost()+ "£ (Sterling Pound)");
                                        System.out.println("Description " + m4.getDescription());
                                        System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
                                  }
                                 }

				break;

			case 2:
                                /*Theater*/
				System.out.println("\n##################### VIEW ALL THEATERS #####################\n");Thread.sleep(500);
                                
                                Theater t1 = new Theater(100, (float) 2.30, "Theater type 1", "Movie List 1", "Abc Cinema", 800, 2230, (float) 4.20, "London");
                                System.out.println("ID          : " + t1.getTheaterID());
                                System.out.println("Name        : " + t1.getName());
                                System.out.println("Type        : " + t1.getTheaterType());
                                System.out.println("Location    : " + t1.getLocation());
                                                                
                            {
                                ArrayList<String> movieList = new ArrayList<String>();
                                movieList.add("Batman");
                                movieList.add("Supereman");
                                movieList.add("Sprideman");
                                                           
                                for (String str : movieList) {
                                 System.out.println("Movie list  : "+str);
                                }
                          
                            }
                                System.out.println("Open Time   : " + t1.getoTime()+ " A.M");
                                System.out.println("close Time   : " + t1.getcTime()+ " P.M");
                                System.out.println("Ticket Cost : " + t1.getCost()+ "£ (Sterling Pound)");
                                System.out.println("Duration    : " + t1.getDuration());
                                System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
                            
                                                            
                                Theater t2 = new Theater(100, (float) 2.30, "Theater type 2", "Movie List 2", "City Cinema", 800, 2230, (float) 2.20, "Sheffield");
                                System.out.println("ID          : " + t2.getTheaterID());
                                System.out.println("Name        : " + t2.getName());
                                System.out.println("Type        : " + t2.getTheaterType());
                                System.out.println("Location    : " + t2.getLocation());
                                                      
                                String[] movieList = {"The Wicher","Red notice", "Doctor", "The nations"};
                                for (String i : movieList) {
                                    System.out.println("Movie list  : "+i);
                                }
                               
                                System.out.println("Open Time   : " + t2.getoTime()+ " A.M");
                                System.out.println("Close Time   : " + t2.getcTime()+ " P.M");
                                System.out.println("Ticket Cost : " + t2.getCost()+ "£ (Sterling Pound)");
                                System.out.println("Duration    : " + t2.getDuration());
                                System.out.println("--------------------------------------------------------\n");Thread.sleep(500);
         
                               
				break;

			case 3:

				
                                System.out.println("\n##################### VIEW ALL PARKS #####################\n");Thread.sleep(500);
    
                                Park p1 = new Park(01, 18, "park type 1", "City park", 930, 2230, (float)1.50, "Winchester1");
                                System.out.println("ID          : " + p1.getParkId());
                                System.out.println("Name        : " + p1.getName());
                                System.out.println("Type        : " + p1.getParkType());
                                System.out.println("Location    : " + p1.getLocation());
                                System.out.println("Age limit  : " +p1.getAgeLimit());
                                System.out.println("Open Time   : " + p1.getoTime()+ " A.M");
                                System.out.println("close Time   : " + p1.getcTime()+ " P.M");
                                System.out.println("Ticket Cost : " + p1.getCost()+ "£ (Sterling Pound)");
                                System.out.println("--------------------------------------------------------\n");Thread.sleep(500);  

                                Park p2 = new Park(02, 15, "park type 2", "children park", 930, 1830, (float)1.20, "St Albans");
                                System.out.println("ID          : " + p2.getParkId());
                                System.out.println("Name        : " + p2.getName());
                                System.out.println("Type        : " + p2.getParkType());
                                System.out.println("Location    : " + p2.getLocation());
                                System.out.println("Age limit  : " +p2.getAgeLimit());
                                System.out.println("Open Time   : " + p2.getoTime()+ " A.M");
                                System.out.println("close Time   : " + p2.getcTime()+ " P.M");
                                System.out.println("Ticket Cost : " + p2.getCost()+ "£ (Sterling Pound)");
                                System.out.println("--------------------------------------------------------\n");Thread.sleep(500);  

                                break;

			

			case 4:

				isExit = true;
				System.out.println("THANK YOU!!");
				break;

			default:
            }

	} while (!isExit);
        
        
        
 
                
	
        
       
    }
    
}
