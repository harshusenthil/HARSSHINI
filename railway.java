import java.util.*;

public class railway {
    static Scanner sc = new Scanner(System.in);
    static int count = 5;
    static String uname = "HAR";
    static int pass = 123;
    static int id = 1;
    static String o = "";
    static int id1 = 0;
    static int n = 0;
    static int tn = 0;
    static int b = 0;

    static List<String> l = new ArrayList<>();// starting
    static List<String> l1 = new ArrayList<>();// name
    static List<Integer> l4 = new ArrayList<>();// id

    
    static List<String> j = new ArrayList<>();// ending
    static List<String> j1 = new ArrayList<>();// booked ticket
    
    static List<String> j2 = new ArrayList<>();// uname &sign up name
    static List<Integer> j3 = new ArrayList<>();
    static List<Integer> j4 = new ArrayList<>();// pass

    static List<String> w = new ArrayList<>();
    static List<String> w1 = new ArrayList<>();
    static List<String> w2 = new ArrayList<>();
    static List<String> w3 = new ArrayList<>();
    static List<String> s = new ArrayList<>();
    static List<String> admin = new ArrayList<>();

    public static void main(String[] args) {
        j2.add(uname);
        j3.add(id);
        j4.add(pass);
        admin.add("HARSHU");
        admin.add("100");
        welcome();
    }

    public static void welcome() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(".....BOOK YOUR TICKET.....");
        System.out.println("1.ADMIN LOGIN");
        System.out.println("2.SIGN UP");
        System.out.println("3.LOGIN");
        System.out.println("4.EXIT");
        int a = sc.nextInt();
        if (a == 1) {
            admin();
        } else if (a == 2) {
            signup();
        } else if (a == 3) {
            login();
        } else {
            System.out.println("---PRESS ENTER TO CONTINUE----");
            sc.nextLine();
            String s = sc.nextLine();
            if (s.equals(""))
                ;
            welcome();
        }
    }

    public static void admin() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ENTER YOUR NAME : ");
        String a2 = sc.next();
        System.out.println("  ENTER YOUR PASSWORD : ");
        String a3 = sc.next();
        if (admin.contains(a2) && admin.contains(a3)) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("    WELCOME ADMIN ");
            System.out.println("1.VIEW THE SOLD OUT TICKETS");
            System.out.println("2.EXIT");
            int a = sc.nextInt();
            if (a == 1) {
                soldout();
            } else if (a == 2) {
                welcome();
            }

        } else {
            System.out.println("  INVALID NAME AND PASSWORD");
        }
        System.out.println("....PRESS ENTER TO CONTINUE....");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();
    }

    public static void soldout() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        if (l1.size() > 0) {
            for (int i = 0; i < l1.size(); i++) {

                System.out.println("PASSENGER NAME :" + l1.get(i));
                System.out.println("BOARDING POINT : " + l.get(i));
                System.out.println("ENDING POINT : " + j.get(i));
                System.out.println("TIKCKETS: " + j1.get(i));
            }
        } else {
            System.out.println("...NO TICKETS HAS SOLD OUT..");
        }

        System.out.println("..PRESS ENTER TO CONTINUE..");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();
    }

    public static void login() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("ENTER YOUR NAME : ");
        o = sc.next();
        System.out.println("ENTER YOUR PASSWORD : ");
        int s1 = sc.nextInt();
        if (j2.contains(o) && j4.contains(s1)) {
            home();
        } else {
            System.out.println("Invalid username and password");
            System.out.println("PRESS ENTER TO CONTINUE");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                welcome();
        }
    }

    public static void home() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("1.TICKET BOOKING");
        System.out.println("2.TICKET CANCELLATION");
        System.out.println("3.VIEW THE BOOKED TICKETS");
        System.out.println("4.EXIT");
        int a = sc.nextInt();
        if (a == 1) {
            book();
        } else if (a == 2) {
            cancel();
        } else if (a == 3) {
            view();
        } else if (a == 4) {
            System.out.println("PRESS ENTER TO CONTINUE");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                welcome();
        }
    }

    public static void book() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("-----COIMBATORE TO CHENNAI------");
        System.out.println("AVALAIBLE STATIONS");
        System.out.println("1.  COIMBATORE TO ERODE  ");

        System.out.println("2.  PALAKKAD TO TIRUPUR  ");

        System.out.println("3.  SALEM TO CHENNAI   ");
        int s1 = sc.nextInt();
        System.out.print(" ENTER THE NUMBER OF TICKETS : ");
        b = sc.nextInt();
        if (s1 == 1) {
            System.out.println("   COIMBATORE TO ERODE  ");
            l.add("coimbatore");
            j.add("erode");
            l4.add(id);
            l1.add(o);
            j1.add("00" + tn);
            id++;
            tn++;
            if (b == 1 && count > 0) {
                System.out.println("---------YOUR TICKET  BOOKED------");
                count -= b;
                System.out.println("AVAILABLE SEATS : " + count);

            } else if (b > 1) {
                multi();
            } else {
                System.out.println("--YOUR ARE IN THE WAITING LIST---");
                waiting();
            }

        } else if (s1 == 2) {
            System.out.println("   PALAKKAD TO TIRUPUR  ");

            l.add("palakkad");
            j.add("tirupur");
            l4.add(id);
            l1.add(o);
            j1.add("00" + tn);
            id++;
            tn++;
            if (b == 1 && count > 0) {
                System.out.println("------YOUR TICKET BOOKED------");
                count -= b;
                System.out.println("AVAILABLE SEATS :" + count);
            } else if (b > 1) {
                multi();
            } else {
                System.out.println("--YOUR ARE IN THE WAITING LIST----");
                waiting();
            }

        } else if (s1 == 3) {
            System.out.println(" SALEM TO CHENNAI ");
            l.add("salem");
            j.add("chennai");
            l1.add(o);
            j1.add("00" + tn);
            l4.add(id);
            id++;
            tn++;

            if (b == 1 && count > 0) {
                System.out.println("---------YOUR TICKET IS BOOKED------");
                count -= b;
                System.out.println("AVAILABLE SEATS : " + count);

            } else if (b > 1) {
                multi();
            } else {
                System.out.println("YOUR ARE IN THE WAITING LIST");
                waiting();
            }

        }

        System.out.println("PRESS ENTER TO CONTINUE");

        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();

    }

    public static void multi() {
        if (b < count) {
            int v = l4.indexOf(l4.get(l4.size() - 1));
            j1.set(v, "BULK" + b);
            count -= b;
            System.out.println(" YOUR TICKET IS BOOKED!!!");
        } else {
            System.out.println("  ONLY " + count + "  SEATS ARE AVAILABLE ");
        }
        System.out.println(" PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();

    }

    public static void waiting() {

        w.add(l1.get(l1.size() - 1));
        w1.add(l.get(l.size() - 1));
        w2.add(j.get(j.size() - 1));
        w3.add(j1.get(j1.size() - 1));
        /////
        l1.remove(l1.get(l1.size() - 1));
        l.remove(l.get(l.size() - 1));
        j.remove(j.get(j.size() - 1));
        j1.remove(j1.get(j1.size() - 1));
    }

    public static void view() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        if (l1.contains(o)) {
            int d1 = l1.indexOf(o);
            System.out.println(" PASSENGER NAME : " + l1.get(d1));
            System.out.println(" BOARDING POINT : " + l.get(d1));
            System.out.println(" ENDING PINT : " + j.get(d1));
            System.out.println(" ticket : " + j1.get(d1));

            System.out.println("PRESS ENTER TO RETURN TO HOME PAGE");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                home();
        } else {
            System.out.println("  TICKET IS NOT AVAILABLE ");
        }
        System.out.println("PRESS ENTER TO CONTINUE");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();
    }

    public static void cancel() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("   CANCELLATION OF TICKET ");
        System.out.println("  ENTER YOUR ID TO CANCEL THE TICKET : ");
        int s2 = sc.nextInt();
        int s1 = l4.indexOf(s2);
        l1.remove(s1);
        s.add(l.get(s1));
        l.remove(s1);
        s.add(j.get(s1));
        j.remove(s1);
        s.add(j1.get(s1));
        j1.remove(s1);
        l4.remove(s1);
        count++;
        if (w.size() > 0 && w1.contains(s.get(0)) && w2.contains(s.get(1))) {
            check();
        } else {
            s.clear();
        }

        System.out.println("TICKET CANCELLED SUCCESSFULLY");
        System.out.println("PRESS ENTER TO EXIT..");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();

    }

    public static void check() {

        String rr = w1.get(w1.size() - 1);
        String rrr = w2.get(w2.size() - 1);
        if (s.contains(rr) && s.contains(rrr)) {
            id1 = l4.get(l4.size() - 1); /// 1
            n = l4.indexOf(id1);// 0
            l1.add(w.get(n));
            l.add(w1.get(n));
            j.add(w2.get(n));
            j1.add(w3.get(n));

        }
    }

    public static void signup() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.print("  ENTER YOUR NAME : ");
        String s = sc.next();
        j2.add(s);
        System.out.print("  ENTER YOUR PASSWORD : ");
        int s1 = sc.nextInt();
        j4.add(s1);
        System.out.println("  YOUR ID IS  : " + id);
        System.out.println("PRESS ENTER TO EXIT..");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();

    }

}




