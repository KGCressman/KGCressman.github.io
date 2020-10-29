package picker;

import java.util.*;
import java.io.*;
import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<character> temp = new ArrayList<character>();
		
        Lists l = new Lists();
		ArrayList<character> userClassOptions = new ArrayList<character>();
		
		int[] topVal = {0,0,0};
		int[] topCharVals = {-1, -1, -1};
		
		l.createNewCharacterArrayList();
		
		printMenu1();
		userClassOptions = menu1Selection();
		
		printMenu2();
		temp.add(menu2Selection());
		temp.add(menu2Selection());
		printMenu3();
		temp.add(menu3Selection());
		temp.add(menu3Selection());
		printMenu4();
		temp.add(menu4Selection());
		temp.add(menu4Selection());
		
		
		temp.forEach((c) -> System.out.println(c.getName()+ ": "+c.getType()));
		
		
		
		for (character c :userClassOptions) {
			int tempInt = 0;
			
			tempInt = tempInt + temp.get(0).evaluate(c.getName());
			tempInt = tempInt + temp.get(1).evaluate(c.getName());
			tempInt = tempInt + temp.get(2).evaluate(c.getName());
			tempInt = tempInt + temp.get(3).evaluate(c.getName());
			tempInt = tempInt + temp.get(4).evaluate(c.getName());
			tempInt = tempInt + temp.get(5).evaluate(c.getName());
			
			if (tempInt >topVal[0]) {
				topVal[2] = topVal[1];
				topVal[1] = topVal[0];
				topVal[0] = tempInt;
				topCharVals[2] = topCharVals[1];
				topCharVals[1] = topCharVals[0];
				topCharVals[0] = c.getNumber();
			}
			else if (tempInt == topVal[0] && tempInt > topVal[1]) {

				topVal[2] = topVal[1];
				topVal[1] = tempInt;
				topCharVals[2] = topCharVals[1];
				topCharVals[1] = c.getNumber();
			}
			else if (tempInt < topVal[0] && tempInt > topVal[1]) {

				topVal[2] = topVal[1];
				topVal[1] = tempInt;
				topCharVals[2] = topCharVals[1];
				topCharVals[1] = c.getNumber();
			}
			else if (tempInt == topVal[1] && tempInt > topVal[2]) {

				topVal[2] = tempInt;
				topCharVals[2] = c.getNumber();
			}
			else if (tempInt < topVal[1] && tempInt > topVal[2]) {

				topVal[2] = tempInt;
				topCharVals[2] = c.getNumber();
			}
			
		}
		
		System.out.println("evaluation successful");
		System.out.println("");
		System.out.println("System recommends you play: "+ l.search(topCharVals[0]).getName());
		System.out.println("");
		System.out.println("Other options: "+ l.search(topCharVals[1]).getName());
		System.out.println("Other options: "+ l.search(topCharVals[2]).getName());
		//launch(args);		//dosnt work idk why
		//javaFxGui.launch(args);		//dosnt work because main does not extend Application 
		

	}
		
		
	    static void printMenu1() { 
	        System.out.println("       Enter your class"); 
	        System.out.println("---------------------------------------------"); 
	        System.out.println("       Enter  1  for Tank              "); 
	        System.out.println("       Enter  2  for DPS     "); 
	        System.out.println("       Enter  3  for support           "); 
	        System.out.println("                                             "); 
	        System.out.println("       Please make a selection.              "); 
	    }
	    static void printMenu2() { 
	        System.out.println("       Enter their Tanks"); 
	        System.out.println("---------------------------------------------"); 
	        System.out.println("       Enter  1  for DVa              "); 
	        System.out.println("       Enter  2  for Orisa     "); 
	        System.out.println("       Enter  3  for Rein           "); 
	        System.out.println("       Enter  4  for Roadhog              "); 
	        System.out.println("       Enter  5  for Sigma     "); 
	        System.out.println("       Enter  6  for Winston           "); 
	        System.out.println("       Enter  7  for Wrecking Ball           ");
	        System.out.println("       Enter  8  for Zarya           ");
	        System.out.println("                                             "); 
	        System.out.println("       Enter 9 to Exit                       "); 
	        System.out.println("       Please make a selection.              "); 
	    }
	    static void printMenu3() { 
	        System.out.println("       Enter their DPS"); 
	        System.out.println("---------------------------------------------"); 
	        System.out.println("       Enter  1  for Ashe              "); 
	        System.out.println("       Enter  2  for Bastion     "); 
	        System.out.println("       Enter  3  for Doomfist           "); 
	        System.out.println("       Enter  4  for Echo              "); 
	        System.out.println("       Enter  5  for Genji     "); 
	        System.out.println("       Enter  6  for Hanzo           "); 
	        System.out.println("       Enter  7  for Junkrat           ");
	        System.out.println("       Enter  8  for McCree              "); 
	        System.out.println("       Enter  9  for Mei     "); 
	        System.out.println("       Enter  10  for Pharah           "); 
	        System.out.println("       Enter  11  for Reaper           "); 
	        System.out.println("       Enter  12  for Soldier 76              "); 
	        System.out.println("       Enter  13  for Sombra     "); 
	        System.out.println("       Enter  14  for Symmetra           "); 
	        System.out.println("       Enter  15  for Torbjorn           ");
	        System.out.println("       Enter  16  for Tracer           "); 
	        System.out.println("       Enter  17  for Widowmaker           ");
	        System.out.println("                                             "); 
	        System.out.println("       Please make a selection.              "); 
	    }
	    static void printMenu4() { 
	        System.out.println("       Enter their Supports"); 
	        System.out.println("---------------------------------------------"); 
	        System.out.println("       Enter  1  for Ana              "); 
	        System.out.println("       Enter  2  for Baptiste     "); 
	        System.out.println("       Enter  3  for Brigitte           "); 
	        System.out.println("       Enter  4  for Lucio              "); 
	        System.out.println("       Enter  5  for Mercy     "); 
	        System.out.println("       Enter  6  for Moira           "); 
	        System.out.println("       Enter  7  for Zenyatta           ");
	        System.out.println("                                             "); 
	        System.out.println("       Please make a selection.              "); 
	        
	    }
	    static ArrayList<character> menu1Selection() { 
	         
	        Scanner intscanner = new Scanner(System.in); 
	        int userEntry =-1; 
	        Lists l = new Lists();
	        l.createNewCharacterArrayList();
			ArrayList<character> userClass = new ArrayList<character>();
	        try{ 
	            userEntry = intscanner.nextInt(); 
	            String throwaway = intscanner.nextLine();
	        } 
	        catch(InputMismatchException e) { 
	            System.out.println("User entered something entirely unexpected. "); 
	        } 
	        switch(userEntry) {        
		    case 1: 
		        userClass = l.getTanks(); 
	            System.out.println("User entered 1 for TANK. "); 
	            l.chooseCharacterList("tanks");
		        return userClass;
		    case 2: 
		        userClass = l.getDps();
	            System.out.println("User entered 2 for DPS. "); 
	            l.chooseCharacterList("dps");
		        return userClass;
		    case 3: 
		        userClass = l.getSupports();
	            System.out.println("User entered 3 for Support. ");
	            l.chooseCharacterList("supports");
		        return userClass;
		    case 4: 
		        System.out.println("You entered  4 . You will now Exit the Menu."); 
		        break; 
		    default:  
		        printMenu1(); 
		        menu1Selection(); 
		        }
			return userClass;       
	    }
	    
/*	    
	    static void printUserOptions(ArrayList<character> options) {
	    	options.forEach((c) -> System.out.println(c.getName()+ ": "+c.getType()));
	    	for(int a = 0 ; a < menu1Selection().size() ;a++ ) {
				character testChar = options.get(a);
				String charName = testChar.getName();
	    	}
	    	
	        
	    }*/
	    
	    
	    	 static character menu2Selection() { 
		         
	 	        Scanner intscanner = new Scanner(System.in); 
	 	        int userEntry =-1; 
	 	        Lists l = new Lists();
	 	        l.createNewCharacterArrayList();
	 	        character enemyTank = l.getTanks().get(0);
	 	        try{ 
	 	            userEntry = intscanner.nextInt(); 
	 	            String throwaway = intscanner.nextLine();

	 	        } 
	 	        catch(InputMismatchException e) { 
	 	            System.out.println("User entered something entirely unexpected. "); 
	 	        } 
	 	        switch(userEntry) {        
	 		    case 1: 
	 		        enemyTank = l.getTanks().get(0); 
	 	            System.out.println("User entered 1 for DVa. "); 
	 		        return enemyTank;
	 		    case 2: 
	 		        enemyTank = l.getTanks().get(1); 
	 	            System.out.println("User entered 2 for Orisa. "); 
	 		        return enemyTank;
	 		    case 3: 
	 		        enemyTank = l.getTanks().get(2); 
	 	            System.out.println("User entered 3 for Reinhardt. "); 
	 		        return enemyTank;
	 		    case 4: 
	 		        enemyTank = l.getTanks().get(3); 
	 	            System.out.println("User entered 4 for Roadhog. "); 
	 		        return enemyTank;
	 		    case 5: 
	 		        enemyTank = l.getTanks().get(4); 
	 	            System.out.println("User entered 5 for Sigma. "); 
	 		        return enemyTank;
	 		    case 6: 
	 		        enemyTank = l.getTanks().get(5); 
	 	            System.out.println("User entered 6 for Winston. "); 
	 		        return enemyTank;
	 		    case 7: 
	 		        enemyTank = l.getTanks().get(6); 
	 	            System.out.println("User entered 7 for Wrecking Ball. "); 
	 		        return enemyTank;
	 		    case 8: 
	 		        enemyTank = l.getTanks().get(7); 
	 	            System.out.println("User entered 8 for Zarya. "); 
	 		        return enemyTank;
	 		    case 9: 
	 		        System.out.println("You entered  9 . You will now Exit the Menu."); 
	 		        break; 
	 		    default:  
	 		        printMenu2(); 
	 		        menu2Selection(); 
	 		        }
	 			return enemyTank;  
	    	 }

	    	 
	    	 static character menu3Selection() { 
		         
		 	        Scanner intscanner = new Scanner(System.in); 
		 	        int userEntry =-1; 
		 	        Lists l = new Lists();
		 	        l.createNewCharacterArrayList();
		 	        character enemyDps = l.getDps().get(0);
		 	        try{ 
		 	            userEntry = intscanner.nextInt(); 
		 	            String throwaway = intscanner.nextLine();
		 	        } 
		 	        catch(InputMismatchException e) { 
		 	            System.out.println("User entered something entirely unexpected. "); 
		 	        } 
		 	        switch(userEntry) {        
		 		    case 1: 
		 		        enemyDps = l.getDps().get(0); 
		 	            System.out.println("User entered 1 for Ashe. "); 
		 		        return enemyDps;
		 		    case 2: 
		 		    	enemyDps = l.getDps().get(1); 
		 	            System.out.println("User entered 2 for Bastion. "); 
		 		        return enemyDps;
		 		    case 3: 
		 		    	enemyDps = l.getDps().get(2); 
		 	            System.out.println("User entered 3 for Doomfist. "); 
		 		        return enemyDps;
		 		    case 4: 
		 		    	enemyDps = l.getDps().get(3); 
		 	            System.out.println("User entered 4 for Echo. "); 
		 		        return enemyDps;
		 		    case 5: 
		 		    	enemyDps = l.getDps().get(4); 
		 	            System.out.println("User entered 5 for Genji. "); 
		 		        return enemyDps;
		 		    case 6: 
		 		    	enemyDps = l.getDps().get(5); 
		 	            System.out.println("User entered 6 for Hanzo. "); 
		 		        return enemyDps;
		 		    case 7: 
		 		        enemyDps = l.getDps().get(6); 
		 	            System.out.println("User entered 7 for Junkrat. "); 
		 		        return enemyDps;
		 		    case 8: 
		 		        enemyDps = l.getDps().get(7); 
		 	            System.out.println("User entered 8 for McCree. "); 
		 		        return enemyDps;
		 		    case 9: 
		 		    	enemyDps = l.getDps().get(8); 
		 	            System.out.println("User entered 9 for Mei. "); 
		 		        return enemyDps;
		 		    case 10: 
		 		    	enemyDps = l.getDps().get(9); 
		 	            System.out.println("User entered 10 for Pharah. "); 
		 		        return enemyDps;
		 		    case 11: 
		 		    	enemyDps = l.getDps().get(10); 
		 	            System.out.println("User entered 11 for Reaper. "); 
		 		        return enemyDps;
		 		    case 12: 
		 		    	enemyDps = l.getDps().get(11); 
		 	            System.out.println("User entered 12 for Soldier 76. "); 
		 		        return enemyDps;
		 		    case 13: 
		 		    	enemyDps = l.getDps().get(12); 
		 	            System.out.println("User entered 13 for Sombra. "); 
		 		        return enemyDps;
		 		    case 14: 
		 		    	enemyDps = l.getDps().get(13); 
		 	            System.out.println("User entered 14 for Symmetra. "); 
		 		        return enemyDps;
		 		    case 15: 
		 		        enemyDps = l.getDps().get(14); 
		 	            System.out.println("User entered 15 for Torbjorn. "); 
		 		        return enemyDps;
		 		    case 16: 
		 		    	enemyDps = l.getDps().get(15); 
		 	            System.out.println("User entered 16 for Tracer. "); 
		 		        return enemyDps;
		 		    case 17: 
		 		        enemyDps = l.getDps().get(16); 
		 	            System.out.println("User entered 17 for Widowmaker. "); 
		 		        return enemyDps;
		 		    case 18: 
		 		        System.out.println("You entered  18 . You will now Exit the Menu."); 
		 		        break; 
		 		    default:  
		 		        printMenu2(); 
		 		        menu2Selection(); 
		 		        }
		 			return enemyDps;  
		    	 }


	 	    
	    	 static character menu4Selection() { 
		         
	 	        Scanner intscanner = new Scanner(System.in); 
	 	        int userEntry =-1; 
	 	        Lists l = new Lists();
	 	        l.createNewCharacterArrayList();
	 	        character enemySupport = l.getSupports().get(0);
	 	        try{ 
	 	            userEntry = intscanner.nextInt(); 
	 	            String throwaway = intscanner.nextLine();
	 	        } 
	 	        catch(InputMismatchException e) { 
	 	            System.out.println("User entered something entirely unexpected. "); 
	 	        } 
	 	        switch(userEntry) {        
	 		    case 1: 
	 		        enemySupport = l.getSupports().get(0); 
	 	            System.out.println("User entered 1 for Ana. "); 
	 		        return enemySupport;
	 		    case 2: 
	 		        enemySupport = l.getSupports().get(1); 
	 	            System.out.println("User entered 2 for Baptiste. "); 
	 		        return enemySupport;
	 		    case 3: 
	 		        enemySupport = l.getSupports().get(2); 
	 	            System.out.println("User entered 1 for Brigitte. "); 
	 		        return enemySupport;
	 		    case 4: 
	 		        enemySupport = l.getSupports().get(3); 
	 	            System.out.println("User entered 4 for Lucio. "); 
	 		        return enemySupport;
	 		    case 5: 
	 		        enemySupport = l.getSupports().get(4); 
	 	            System.out.println("User entered 5 for Mercy. "); 
	 		        return enemySupport;
	 		    case 6: 
	 		        enemySupport = l.getSupports().get(5); 
	 	            System.out.println("User entered 6 for Moira. "); 
	 		        return enemySupport;
	 		    case 7: 
	 		        enemySupport = l.getSupports().get(6); 
	 	            System.out.println("User entered 7 for Zenyatta. "); 
	 		        return enemySupport;
	 		    case 8: 
	 		        System.out.println("You entered  8 . You will now Exit the Menu."); 
	 		        break; 
	 		    default:  
	 		        printMenu2(); 
	 		        menu2Selection(); 
	 		        }
	 			return enemySupport;  
	    	 }
	    	 
	    	 
	    	 public class javaFxGui extends Application {
	    		 public javaFxGui() {
	    		 }
	    		 @Override
	    		 public void init() {
	    		 }
	    		 @Override
	    		 public void start(Stage initialStage) throws Exception{
	    			 
	    			 /*
	    			  Lists l = new Lists();
	    		        l.createNewCharacterArrayList();
	    				ArrayList<character> userClass = new ArrayList<character>();


	    			        userClass = l.getDps();
	    		            System.out.println("User entered 2 for DPS. "); 
	    		            l.chooseCharacterList("dps");
	    			        return userClass;

	    			        userClass = l.getSupports();
	    		            System.out.println("User entered 3 for Support. ");
	    		            l.chooseCharacterList("supports");
	    			        return userClass;

	    			        System.out.println("You entered  4 . You will now Exit the Menu."); 
	    			        break; 

	    			        printMenu1(); 
	    			        menu1Selection(); 
	    			        }
	    				return userClass;       
	    			 */
	    			 
	    			 Group root = new Group();
	    			 Scene scene1 = new Scene(root,900,900);
	    			 initialStage.setTitle("Choose your class");
	    			 initialStage.setScene(scene1);
	    			 initialStage.show();
	    			 
	    			 final Button m1c1 = new Button();
	    			 m1c1.setText("I'M PLAYING TANK");
	    			 m1c1.setOnAction((ActionEvent event) -> {
	    				 
	    			        //userClass = l.getTanks(); 
	    		            System.out.println("User entered 1 for TANK. "); 
	    		            //l.chooseCharacterList("tanks");
	    		            //perhaps instead send the tanks decision some other way?
	    		            //goto next menu
	    			       // return userClass;
	    				 
	    			 });
	    			 final Button m1c2 = new Button();
	    			 m1c2.setText("I'M PLAYING D P S");
	    			 m1c2.setOnAction((ActionEvent event) -> {
	    		            System.out.println("User entered 2 for DPS. "); 
	    			 });
	    			 
	    			 
	    			 final Button m1c3 = new Button();
	    			 m1c3.setText("I'M PLAYING SUPPORT");
	    			 m1c3.setOnAction((ActionEvent event) -> {
	    		            System.out.println("User entered 3 for Support. "); 
	    			 });
	    		 }
	    		 
	    	 }
			


}
