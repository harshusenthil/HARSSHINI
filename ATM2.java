import java.util.*;
public class ATM2 {

	    static Scanner sc = new Scanner(System.in);
	    static int x,p=10;
	    static int balance1=1000000000;
	    static int balance=100000;
	    static int ar[]={10,10,10,10};
	    public static void main(String[] args){
	        System.out.flush();
	        welcome();
	        hello();
	    }
	        public static void hello() {
	        if(x>3 || x<1)
	        	welcome();
	        switch(x){
	            case 1:{
	                admin();
	            }
	            case 2:{
	                customer();
	            }
	            case 3:{
	                System.out.flush();
	                System.out.print("Thank you for visting!!! Stay Safe");
	            }
	        }
	    }
	    public static void welcome(){
	        System.out.println("\t\tWelcome to ATM");
	        System.out.println("1.Admin");
	        System.out.println("2.Customer");
	        System.out.println("3.Exit");
	        x=sc.nextInt();
	        System.out.flush();
	        hello();
	    }
	    public static void admin(){
	        System.out.print("Enter UserName : ");
	        sc.nextLine();
	        String s = sc.nextLine();
	        System.out.print("Enter Password : "); 
	        int a = sc.nextInt();
	        if((s.equals("HARSHU") && a==6) || ((s.equals("SENTHIL") && a==7))){
	        System.out.flush();
	            trueAdmin();
	        }
	    }
	    public static void trueAdmin(){
	        System.out.println("\t\tWelcome admin");
	            System.out.println("1. Add Money");
	            System.out.println("2. Show Balance");
	            System.out.println("3. Exit");
	            int l=sc.nextInt();
	            if(l==1){
	             
	        System.out.flush();
	        add();
		}
	            else if(l==2) {
	        System.out.flush();
	                show();
	            }
	            else{
	        System.out.flush();
	                 welcome();
	            }
	    }
	    public static void add(){
	        System.out.println("Enter number of notes to be added");
	        System.out.println("Enter number of 100");
	        ar[0]+=sc.nextInt(); 
	        System.out.println("Enter number of 200");
	        ar[1]+=sc.nextInt();
	        System.out.println("Enter number of 500");
	        ar[2]+=sc.nextInt();
	        System.out.println("Enter number of 2000");
	        ar[3]+=sc.nextInt();
	        System.out.println("press ENTER to continue !!!");
	        
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals("")){
	        System.out.flush();      
	            addbalance();
	        } 
	    }
        public static void addbalance()
        {
            balance1+=ar[0]*2000+ar[1]*500+ar[2]*200+ar[3]*100;
            trueAdmin();
        }
	    public static void show(){
			System.out.println("No.of notes Available:");
	        System.out.println("100-->  "+ar[0]);
	        System.out.println("200 --> "+ar[1]);
	        System.out.println("500 --> "+ar[2]);
	        System.out.println("2000 --> "+ar[3]);
	        System.out.println("ATM BALANCE IS:"+balance1);
	        System.out.println("press ENTER to continue !!!");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals("")){

	        System.out.flush();
	            trueAdmin();
	        } 
	    }
	    public static void customer(){

	  
	        System.out.flush();
	        sc.nextLine();
	        System.out.print("Enter  Username: ");
	        String n=sc.nextLine();
	        System.out.print("Enter  password: ");
	         p=sc.nextInt();
	        if(n.equals("HARSHU") && p==10){
	            
	            customerid();
	            }
	        else
	        {
	        	System.out.println("ENTER THE CORRECT USERNAME OR PASSWORD");
	        	 System.out.println("PRESS ENTER TO CONTINUE");
	    		   sc.nextLine();
		    	   String hh=sc.nextLine();
		    	   if(hh.equals(""))
		    		   customer();
	        }
	       
	       
	    } 
	    public static void customerid(){
	        System.out.flush();
	        System.out.println("1. Withdraw");
	        System.out.println("2. PIN change");
	        System.out.println("3. Check balance");
	        System.out.println("4. deposit");
	        System.out.println("5. Exit");
	        int g=sc.nextInt();
	        if(g==1)
	            withdraw();
			if(g==2)
	        	pin();
			if(g==3)
	        	balance();
	        if(g==4)
	        	deposit();
	        if(g==5){
	            System.out.flush();
	            welcome();}

	    }
	    
	    public static void withdraw(){
	        System.out.flush();
	        
	        System.out.println("Enter the amount: ");
	        int amount=sc.nextInt();
	        
	       if(amount<=balance){
	       balance-=amount;
	       System.out.println("Availabe balance : "+balance);
	       System.out.println();
	       while(amount>0){
	           if(ar[3]>0 && amount>=2000){
	               amount-=2000;
	               ar[3]--;
	           }
	           else if(ar[2]>0 && amount>=500){
	            amount-=500;
	            ar[2]--;
	        }
	        else if(ar[1]>0 && amount>=200){
	            amount-=200;
	            ar[1]--;
	        }
	        else if(ar[0]>0 && amount>=100){
	            amount-=100;
	            ar[0]--;
	        }
	           balance1-=amount;
	       }
	       
	       System.out.println("Press enter to continue");
	       sc.nextLine();
	       String back=sc.nextLine();
	       if(back.equals(""))
	            customerid();
	       }
	  
	    
	    
	   
	       else{
	           System.out.println("Sorry, Insufficient balance");
	       }
	       System.out.println();
	       System.out.println("Press enter to continue");
	       sc.nextLine();
	       String back=sc.nextLine();
	       if(back.equals(""))
	            customerid();
	    }
	       public static void  deposit()
	       {
	    	   System.out.println("ENTER THE AMOUNT");
	    	   int a3=sc.nextInt();
	    	   balance+=a3;
	    	   System.out.println("PRESS ENTER TO CONTINUE");
	    	   sc.nextLine();
	    	   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	       }
	       public static void balance()
	       {
	    	   System.out.println(balance);
	       
	       System.out.println("PRESS ENTER TO CONTINUE");
		   sc.nextLine();
    	   String hh=sc.nextLine();
    	   if(hh.equals(""))
    		   customerid();
	       }
	       public static void pin() {
	    	   System.out.println("ENTER A OLD PIN");
	    	   int y1=sc.nextInt();
	    	   if(y1==p)
	    	   {
	    		   System.out.println("ENTER A NEW PIN");
	    		   int y2=sc.nextInt();
	    		   p=y2;
	    		   System.out.println("PIN UPDATED SUCCESSFULLY");
	    		   
	    	   
	    	   System.out.println("PRESS ENTER TO CONTINUE");
    		   sc.nextLine();
	    	   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	    	   }
	    	   else
	    	   {
	    		   System.out.println("PIN IS INCORRECT");
	    	   }
	    	      System.out.println("PRESS ENTER TO CONTINUE");
	    	      sc.nextLine();
    		   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	    	   
	       }
	      
}