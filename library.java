import java.util.*;
import java.time.*;

public class library {

    static Scanner sc = new Scanner(System.in);
    static int us = 100;// userid value
    static List<String> b = new ArrayList<>();// book
    static List<String> b1 = new ArrayList<>();// author name
    static List<Integer> b2 = new ArrayList<>();// count
    static List<Integer> b3 = new ArrayList<>();// book id
    static List<Integer> b4 = new ArrayList<>();// book price
    static List<String> ad = new ArrayList<>();// admin name and pasword
    static List<String> un = new ArrayList<>();// user name and password
    static List<Integer> usid = new ArrayList<>();// user id
    static List<Integer> ac = new ArrayList<>();// user account balance
    /////////////////////////////////
    static List<String> c = new ArrayList<>();// add to cart
    ///////////////////////////////////////////
    static List<String> bo = new ArrayList<>();// borrow date
    static List<String> du = new ArrayList<>(); // due date

    public static void main(String[] args) {
        ad.add("harshu");
        ad.add("1234");
        b.add("wings of fire");
        b1.add("APJ abdul kalam");
        b2.add(10);
        b3.add(100);
        b4.add(1500);
        b.add("julier ceiser");
        b1.add("ceiser");
        b2.add(12);
        b3.add(222);
        b4.add(2000);
        un.add("har");
        un.add("123");
        usid.add(100);
        ac.add(3000);
        welcome();
    }

    public static void welcome() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("            WELCOME TO THE LIBRARY       ");
        System.out.println("     ");
        System.out.println(" 1. ADMIN LOGIN ");
        System.out.println(" 2. USER LOGIN ");
        System.out.println(" 3. EXIT ");
        int a = sc.nextInt();
        if (a == 1) {
            admin();
        } else if (a == 2) {
            user();
        } else if (a == 3) {
            System.out.println(" THANK YOU FOR VISITING ");
        }
        System.out.println("  ");
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();
    }

    public static void admin() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("...WELCOME ADMIN...");
        System.out.print("   ENTER YOUR NAME : ");
        String a = sc.next();
        System.out.print("  ENTER YOUR PASSWORD : ");
        String a1 = sc.next();
        if (ad.contains(a) && ad.contains(a1)) {
            home();

        } else {
            System.out.println(" INVALID USERNAME AND PASSWORD ");
            System.out.println("  ");
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                welcome();
        }
    }

    public static void home() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" 1. ADD NEW BOOKS ");
        System.out.println(" 2. ADD ADDITONAL COUNT TO THE BOOKS  ");
        System.out.println(" 3. REMOVE THE BOOKS  ");
        System.out.println(" 4. MODIFY THE BOOKS");
        System.out.println(" 5. VIEW ALL THE BOOKS ");
        System.out.println(" 6. EXIT ");

        int a = sc.nextInt();
        if (a == 1) {
            add();
        } else if (a == 2) {
            additional();
        } else if (a == 3) {
            remove();
        } else if (a == 4) {
            modify();
        } else if (a == 5) {
            view();
        } else if (a == 6) {
            welcome();
        } else {
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                welcome();

        }
    }

    public static void add() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ENTER THE NAME OF THE BOOK :");
        String a = sc.next();
        b.add(a);
        System.out.println(" ENTER THE AUTHOR NAME : ");
        String a1 = sc.next();
        b1.add(a1);
        System.out.println(" ENTER THE NUMBER OF BOOKS : ");
        int a2 = sc.nextInt();
        b2.add(a2);
        System.out.println(" ENTER THE BOOK ID : ");
        int a3 = sc.nextInt();
        b3.add(a3);
        System.out.println(" ENTER THE PRICE OF BOOK : ");
        int a4 = sc.nextInt();
        b4.add(a4);
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();

    }

    public static void additional() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ADD THE BOOK COUNT");
        System.out.println("ENTER THE BOOk ID : ");
        int a = sc.nextInt();
        if (b3.contains(a)) {
            int v = b3.indexOf(a);
            System.out.print("Enter the number of books to be added : ");
            int a1 = sc.nextInt();
            b2.set(v, (b2.get(v) + a1));
            System.out.println(" successfully book count added");
        } else {
            System.out.println(" INVALID BOOK ID!!!");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();

    }

    public static void remove() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" REMOVE THE BOOK FROM THE LIST");
        System.out.println(" ENTER YOUR BOOK ID : ");
        int a = sc.nextInt();
        if (b3.contains(a)) {
            int v = b3.indexOf(a);
            b.remove(v);
            b1.remove(v);
            b2.remove(v);
            b3.remove(v);
            b4.remove(v);

            System.out.println(" BOOK REMOVED SUCCESSFULLY!!!");
        } else {
            System.out.println(" BOOK ID IS NOT AVAILABLE ");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();

    }

    public static void modify() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println();
        System.out.println(" 1. CHANGE BOOK NAME ");
        System.out.println(" 2. CHANGE AUTHOR NAME ");
        System.out.println(" 3. CHANGE BOOK ID ");
        System.out.println(" 4. CHANGE BOOK PRICE ");
        System.out.println(" 5. EXIT ");
        int a = sc.nextInt();
        System.out.println(" ENTER THE BOOK ID ");
        int c = sc.nextInt();
        int v = b3.indexOf(c);
        if (a == 1) {
            System.out.println(" ENTER THE  NEW BOOK NAME : ");
            String d = sc.next();
            b.set(v, d);
            System.out.println(" THE BOOK NAME  HAS BEEN CHANGED SUCCESSFULLY !!!!");
        } else if (a == 2) {
            System.out.println(" ENTER THE  NEW AUTHOR  NAME : ");
            String d = sc.next();
            b1.set(v, d);
            System.out.println(" THE AUTHOR  NAME  HAS BEEN CHANGED SUCCESSFULLY !!!!");

        } else if (a == 3) {
            System.out.println(" ENTER THE  NEW BOOK  ID : ");
            int d = sc.nextInt();
            b3.set(v, d);
            System.out.println(" THE BOOK ID HAS CHANGED BEEN SUCCESSFULLY !!!!");

        } else if (a == 4) {
            System.out.println(" ENTER THE  NEW BOOK PRICE : ");
            int d = sc.nextInt();
            b4.set(v, d);
            System.out.println(" THE BOOK PRICE HAS BEEN CHANGED SUCCESSFULLY !!!!");

        } else if (a == 5) {
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                home();

        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();

    }

    public static void view() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        if (b.size() > 0) {
            for (int i = 0; i < b.size(); i++) {
                System.out.println(" Name of the book : " + b.get(i));
                System.out.println(" Name of the author : " + b1.get(i));
                System.out.println(" Book id  : " + b3.get(i));
                System.out.println(" Number of books available : " + b2.get(i));

                System.out.println("....................");
            }
        } else {
            System.out.println("  NO MORE BOOKS AVAILABLE ");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();
    }

    public static void user() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" 1. SIGNUP ");
        System.out.println(" 2. LOGIN ");
        int a = sc.nextInt();
        if (a == 1) {
            signup();
        } else if (a == 2) {
            user2();
        } else if (a == 3) {
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                home();
        }
    }

    public static void signup() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" SIGN UP AND GET STARTED !!");
        System.out.println();
        System.out.println(" ENTER YOUR NAME :");
        String s = sc.next();
        un.add(s);
        System.out.println(" CREATE YOUR PASSWORD : ");
        String s1 = sc.next();
        un.add(s1);
        us++;
        usid.add(us);
        ac.add(2000);
        if (un.contains(s) && un.contains(s1)) {
            System.out.println(" LOGIN TO CONTINUE ");
            user2();
        } else {
            System.out.println(" INVALID USERNAME AND PASSWORD ");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            home();
    }

    public static void user2() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("!!!! WELCOME USER  !!!!");
        System.out.println(" ENTER YOUR NAME : ");
        String s = sc.next();
        System.out.println(" ENTER YOUR PASSWORD : ");
        String s1 = sc.next();
        if (un.contains(s) && un.contains(s1)) {
            user1();
        } else {
            System.out.println("  INVALID USERNAME AND PASSWORD!!");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            welcome();

    }

    public static void user1() {
        System.out.println("  WELCOME BACK USER ");
        for (int i = 0; i < b.size(); i++) {
            System.out.println(" Name of the book : " + b.get(i));
            System.out.println(" Name of the author : " + b1.get(i));
            System.out.println(" Book id  : " + b3.get(i));
            System.out.println(" Number of books available : " + b2.get(i));

            System.out.println("....................");
        }
        user3();
    }

    public static void user3() {

        System.out.println(" 1. ADD TO CART");
        System.out.println(" 2. REMOVE FROM CART");
        System.out.println(" 3. VIEW CART");
        System.out.println(" 4. BOOK RETURN");
        System.out.println(" 5. BOOK LOST");
        System.out.println(" 6. VIEW BALANCE");
        System.out.println(" 7. EXIT ");
        int a = sc.nextInt();
        if (a == 1) {
            addcart();
        } else if (a == 2) {
            removecart();
        } else if (a == 3) {
            viewcart();
        } else if (a == 4) {
            bookreturn();
        } else if (a == 5) {
            booklost();
        } else if (a == 6) {
            balance();
        } else if (a == 7) {
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                welcome();
        }

    }

    public static void addcart() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ENTER THE BOOK ID TO  BORROW : ");
        int a = sc.nextInt();
        int v = b3.indexOf(a);
        if (c.contains(b.get(v))) {
            System.out.println(" CANNOT BORROW THE SAME BOOK ");
        } else {
            System.out.println(" ENTER THE BOOK NAME : ");
            String s = sc.next();
            c.add(s);
            int v1 = b2.get(v);
            v1--;
            b2.set(v, v1);
            LocalDate borrow = LocalDate.now();
            System.out.println(" BOOK ADDED TO CART SUCCESSFULLY !!!");
            System.out.println();
            System.out.println(" BOOK BORROWED ON : " + borrow);
            bo.add(String.valueOf(borrow));
            LocalDate due = borrow.plusDays(15);
            du.add(String.valueOf(due));

        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            System.out.println("\033[H\033[2J");
        System.out.flush();
        user3();

    }

    public static void removecart() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println(" ENTER THE BOOK NAME THE BOOK FROM CART :");
        String a = sc.next();
        int v = c.indexOf(String.valueOf(a));
        int c2 = b2.get(v);
        c2++;
        b2.set(v, c2);
        c.remove(v);

        System.out.println("  BOOK REMOVED SUCCESSFULLY");

        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user3();
    }

    public static void viewcart() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("  BOOKS IN YOUR CART WILL BE DISPLAYED HERE !!!");
        System.out.println();
        if (c.size() > 0) {
            for (int i = 0; i < c.size(); i++) {
                System.out.println(" NAME OF THE BOOK : " + c.get(i));
            }
        } else {
            System.out.println(" NO MORE BOOKS ARE AVAILABLE");
        }
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user3();
    }

    public static void bookreturn() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        if (c.size() > 0) {
            System.out.println("  RETURN YOUR BOOK!!!!");
            System.out.println(" ");
            System.out.println(" ENTER THE RETURN DATE : ");
            String s = sc.next();
            int k = usid.indexOf(us);
            LocalDate d = LocalDate.parse(s);
            String s2 = bo.get(k);
            LocalDate d1 = LocalDate.parse(s2);
            int j = b2.indexOf(usid.size() - 1);
            j--;
            b2.set(k, j);
            if (d.compareTo(d1) > 0) {
                int f = d.compareTo(d1);
                System.out.println();
                System.out.println("  YOU HAVE TO PAY FINE AMOUNT ");

                System.out.println("  YOUR DUE DATE WAS ENDED  : " + du.get(k));
                System.out.println();
                System.out.println("....AMOUNT WILL BE REDUCED FROM YOUR  DEPOSIT ACCOUNT...");
                int f1 = ac.get(k);
                int f2 = f1 - (f * 2);
                ac.set(k, f2);

            } else {
                System.out.println("THANKS FOR RETURNING THE BOOK");
            }
            bo.remove(k);
            du.remove(k);
            c.remove(k);

            System.out.println();
            System.out.println(" PRESS ENTER TO CONTINUE  ");
            sc.nextLine();
            String u = sc.nextLine();
            if (u.equals(""))
                System.out.println("\033[H\033[2J");
            System.out.flush();
            user3();
        }
    }

    public static void booklost() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        if (c.size() > 0) {
            System.out.println("ENTER THE BOOK ID ");
            int s = sc.nextInt();
            int s1 = b3.indexOf(s);
            System.out.println("REASON ");
            String pp = sc.next();
            System.out.println();
            System.out.println("YOUR BALANCE WILL BE REDUCED IN DEPOSIT");
            int p = b4.get(s1);
            int sum = (p * 80) / 100;
            int a = ac.get(s1);
            int total = a - sum;
            ac.set(s1, total);
            bo.remove(s1);
            du.remove(s1);
            b.remove(s1);
            c.remove(s1);
        } else {
            System.out.println("NO BOOK TO LOSE");
        }
        System.out.println();
        System.out.println(" PRESS ENTER TO CONTINUE  ");
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user3();
    }

    public static void balance() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("ENTER YOUR USERNAME : ");
        String s = sc.next();
        int a = un.indexOf(s);
        int v = ac.get(a);

        System.out.println(v);
        sc.nextLine();
        String u = sc.nextLine();
        if (u.equals(""))
            user3();
    }

}
