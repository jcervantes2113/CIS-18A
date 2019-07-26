
import java.util.Scanner;
import mainMenu.*;

class server{
	private String table [][]= new String[1][25];
	
	public void fillTble(){
		
	  
	  
	  for(int i=0; i<1; i++){
	    for(int j=0; j<25; j++){
		table[i][j] = "OPEN";
	     }	
          }
	}

	public void editTble(int x){
	  checkTble(x);
	  prntTable(); 
	  
	}
	
	public void prntTable(){
		
	  for(int i=0; i<1; i++){
	    for(int j=0; j<25; j++){
		System.out.println("Table: " + (j+1) + " is " + table[i][j]);
	     }	
          }
	
	}
	
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

	void editMenu(){

	System.out.println();
	System.out.println("Enter the table number that will be changed");
	System.out.println("OPEN will change to OCCUPIED");
	System.out.println("OCCUPIED will change to OPEN");

	System.out.print("Input: ");	
	

	}

}



class employee extends server{
	
	employee(){
	  fillTble();
	}


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
	throws java.io.IOException {

	champ b = new champ();
	employee all = new employee();	
	int option;
	
	String error = "";
	
	System.out.println();
	b.menu2();
	
     do{

	
	
		
	option = (char) System.in.read();
	
	
	
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
	     
            break; 

        } 
	
     }while(option != '0');
        System.out.println(error); 
	System.out.println(option); 
      


}
}