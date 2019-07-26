
import java.util.Scanner;
import mainMenu.*;

class server{
	private String table [][]= new String[1][25];
	
//fillTble is used to auto fill all the tables with open
	public void fillTble(){
		
	  for(int i=0; i<1; i++){
	    for(int j=0; j<25; j++){
		table[i][j] = "OPEN";
	     }	
          }
	}
//editTable is used to edit the table that the server entered
	public void editTble(int x){
	  checkTble(x);
	  prntTable(); 
	  
	}

//prntTable prints the table of its current version 	
	public void prntTable(){
		
	  for(int i=0; i<1; i++){
	    for(int j=0; j<25; j++){
		System.out.println("Table: " + (j+1) + " is " + table[i][j]);
	     }	
          }
	
	}

//checkTble checks to see if the input is within the range of the two dimensional array
	private void checkTble(int x){
	  if((x <=25) && (x>=1)){
	      if(table[0][x-1]=="OPEN"){
	        table[0][x-1] = "OCCUPIED";
	      }else{
	        table[0][x-1] = "OPEN";
	      }
	  }else{
	    System.out.println("Table not within range");
	  }
	
	}

//Displays the menu for instructions on editing a table
	void editMenu(){

	System.out.println();
	System.out.println("Enter the table number that will be changed");
	System.out.println("OPEN will change to OCCUPIED");
	System.out.println("OCCUPIED will change to OPEN");

	System.out.print("Input: ");	
	

	}

}



class employee extends server{
	
//constructor that auto fills the constructor 
	employee(){
	  fillTble();
	}


//main menu for the program 
	void menu(){

	System.out.println();
	System.out.println("Enter 1-9 for the following options else type 0 to exit");
	System.out.println("1. View Tables available");
	System.out.println("2. Edit Tables");
	System.out.print("Input: ");	
	

	}
	

}




class Project_1 {
	//A Java Program begins with a call to main()
	public static void main(String args[])
	throws java.io.IOException { //Handles any errors 

	champ b = new champ();          //Creates an object champ from the package
	employee all = new employee();	//Creates an employee object
	int option;			//Creates an int option for the switch
	
	String error = "";		//String that holds the error
	
	System.out.println();		
	b.menu2();			//Displays the menu
	

     do{ //Loop that keeps on looping until the user decides to quit

	
	
		
	option = (char) System.in.read();  //Reads in the user input
	
	
	
	switch (option) { 
        case 49: 
	     all.prntTable(); 
	     all.menu();
            break; 
        case 50:  
	     
	     all.editMenu();
	     Scanner answer = new Scanner(System.in);
	     int a = answer.nextInt();
	     all.editTble(a);
	     all.menu();
            break; 

        case 51: 
	     all.menu();
            break; 

        case 52:  
	     all.menu();
            break; 

        case 53:  
	     all.menu();
            break; 

        case 54:  
	     all.menu();
            break; 

        case 55:  
	     all.menu();
            break; 

        default: 
            error = "Goodbye"; 
	     System.out.println(error); 
            break; 

        } 
	
     }while(option != '0');
        
	
      


}
}