import java.util.*;
class splitwise {
    public static Scanner sc=new Scanner(System.in);
   
    static List<String> username = new ArrayList<>();//username name
    static List<String> usermail = new ArrayList<>();//user email
    static List<String> userpass = new ArrayList<>();//userpassword
    static List<Integer> userbal = new ArrayList<>();//userbalance
    static List<Integer> userdebt = new ArrayList<>();//userdebt
   

    static List<String> friend = new ArrayList<>();// Friends
    static List<String> friendmail = new ArrayList<>();// Friends mail id
    static List<String> userfriend = new ArrayList<>();//user friend

    public static void main(String[] args){
        add();
        while(true){
          clearscreen();
          System.out.println("\tWelcome");
        
          System.out.println("1.User login");
          System.out.println("2.Exit");
          System.out.println("Enter your choice");
          int input = sc.nextInt();
          if(input==1){
           
         
            while(true){
                clearscreen();
                System.out.println("\tWelcome");
                System.out.println("1.Create account");
                System.out.println("2.login ");
                System.out.println("3.Exit");
                System.out.println("Enter your choice");
                int userchoie = sc.nextInt();
                if(userchoie==1){
                    newuser();
                }else if(userchoie==2){
                    user();
                }else if(userchoie==3){
                    break;
                }else{
                    System.out.println("Invalid choice");
                    delay();
                }
    
            }
          }else if(input==2){

          }else{
              System.out.println("Please choose valid number..");
              delay();
          }
        }
    }

    public static void add(){
        username.add("harshu");
        usermail.add("harshusenthil@gmail.com");
        userpass.add("123");
        userdebt.add(0);
        userbal.add(1000);
       
      
    }
    public static void delay(){
        System.out.println("Press 1 to continue");
        int one =sc.nextInt();
        if(one==1){

        }
    } 
    public static void clearscreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void wallet(int a){
        while(true){
        clearscreen();
        System.out.println("\tWallet");
        System.out.println("Your current balance:"+userbal.get(a));
        System.out.println("1.Add money\n2.Back\nEnter choice:");
        int wallet=sc.nextInt();
        if(wallet==1){
            System.out.println("Enter Amount:");
            int amount =sc.nextInt();
            userbal.set(a,(userbal.get(a)+amount));
            System.out.println("Amount Added");
            System.out.println();
            System.out.println("Your current balance:"+userbal.get(a));
            System.out.println();
            delay();
        }else if(wallet==2){
            break;
        }else{
           System.out.println("Invalid input...");
        }
    }
    }
    public static void newuser(){
        clearscreen();
        System.out.println("ADD new User");
        a1:while(true){
        System.out.println("Enter User name:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<username.size();i++){                    
           if(check.equals(username.get(i)) ){
               System.out.println("name is already in use.... Try another name");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             username.add(check);
             break a1;
            }
                              
        }
        a1:while(true){
            System.out.println("Enter User mail:");
            String check=sc.next();
            sc.nextLine();
            int check1=0;
            for(int i=0;i<usermail.size();i++){                    
               if(check.equals(usermail.get(i)) ){
                   System.out.println("Mail already exists..");
                      check1=1;
                       break ;
                }
            }
            if(check1==0){
                 usermail.add(check);
                 break a1;
                }
                                  
            }
        a1:while(true){
        System.out.println("Enter password:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<userpass.size();i++){                    
           if(check.equals(userpass.get(i)) ){
               System.out.println("password is already in use try another password");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             userpass.add(check);
             break a1;
            }
                              
        }
        System.out.println("Enter User balance:");
        int check=sc.nextInt();
        userbal.add(check);
        userdebt.add(0);    
        System.out.println("User Created..");
    }
    public static void user(){
        System.out.println("Enter username :");
        String usrname1=sc.next();
        sc.nextLine();
        System.out.println("Enter user password:");
        String usrpass=sc.next();
        sc.nextLine();   
        int check=0;
        a:while(true){
            for(int i =0;i<username.size();++i){
                if(username.get(i).equals(usrname1) && userpass.get(i).equals(usrpass) ){
                    check=1;
                    while(true){
                        clearscreen();
                        System.out.println("Welcome "+username.get(i));
                        System.out.println("1.Expences");
                        System.out.println("2.Add friend");
                        System.out.println("3.Remove friend");
                        System.out.println("4.Pay the Debt");
                        System.out.println("5.Friends list");
                        System.out.println("6.Wallet");
                        System.out.println("7.Exit");
                        System.out.println("Enter your choice:");
                        int userchoice=sc.nextInt(); 

                        if(userchoice==1){
                          System.out.println("Enter the amount to be paid:");
                          int amount =sc.nextInt();
                          if(userbal.get(i)>=amount){
                              int balance=userbal.get(i);
                              userbal.set(i,balance-amount);
                          int count=1;
                          for(int j=0;j<userfriend.size();j++){
                              if(username.get(i).equals(userfriend.get(j))){
                                count++;
                              }
                            }
                          
                          int count1=amount/count;
                          for(int j=0;j<userfriend.size();j++){
                            if(username.get(i).equals(userfriend.get(j))){
                                for(int h=0;h<username.size();h++){
                                    if(friend.get(j).equals(username.get(h))){
                                       
                                        int ud=userdebt.get(h);
                                        userdebt.set(h,ud+count1);
                                    }
                                }
                              
                            }
                        }

                        }else{
                            System.out.println("Insufficient balance...");
                        }
                             

                        }else if(userchoice==2){
                           addfriend(i);
                        }else if(userchoice==3){
                           removefriend(i);
                        }else if(userchoice==4){
                            System.out.println("Amount to be paid:"+userdebt.get(i));
                        }else if(userchoice==5){
                            friendlist(i);
                        }else if(userchoice==6){
                           wallet(i);
                        }else if(userchoice==7){
                               break a;
                        }else{
                            System.out.println("Invalid Input...");
                        }
                        delay();
                       
                        
                    }
                }}if(check==0){
                    System.out.println("Invalid username or password");
                    delay();
                    break a;
                   
                }

            
        }
    }
    public static void addfriend(int a){
     System.out.println("Welcome"+username.get(a));
     System.out.println("Enter Friend Mail-id:");
     String mail=sc.next();
     sc.nextLine();
     int id=0;

     for(int i=0;i<usermail.size();i++){
         if(mail.equals(usermail.get(i))){
             id=1;
             friendmail.add(usermail.get(i));
            friend.add(username.get(i));
            userfriend.add(username.get(a));
            System.out.println("Friend Added..");

         }
     }
     if(id==0){
         System.out.println("Ask friend to create account ..");

     }
    }
    public static void removefriend(int a){
        System.out.println("Welcome"+username.get(a));
        System.out.println("Enter Friend Mail-id:");
        String mail=sc.next();
        sc.nextLine();
        int id=0;
   
        for(int i=0;i<friendmail.size();i++){
            if(mail.equals(friendmail.get(i))){
                id=1;
               friend.remove(i);
               userfriend.remove(i);
               friendmail.remove(i);
               System.out.println("Friend Added..");
   
            }
        }
        if(id==0){
            System.out.println("Mail id not found");
   
        }
       }
    public static void friendlist(int a){
        clearscreen();
        System.out.println("Welcome"+username.get(a));
        System.out.println("Friends List");
        for(int i =0;i<friendmail.size();i++){
            if(username.get(a).equals(userfriend.get(i))){
                
                        System.out.println("Friends Number    :"+(i+1));
                        System.out.println("Friend Name       :"+friend.get(i));
                        System.out.println("Friend mail id    :"+friendmail.get(i));
                       
                        System.out.println();
                    
            }
        }
    }
    
}