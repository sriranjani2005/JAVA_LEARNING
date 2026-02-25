import java.util.Scanner;
public class Basics {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is Your rating 0 to 5 ? ");
    int a = sc.nextInt();
    System.out.println("You Rated us : "+ a);
    System.out.println("Double:");
    double b = sc.nextDouble();
    System.out.println("Your Double Value is : "+ b);
    System.out.println("Short : ");
    short c = sc.nextShort();
    System.out.println("Your short value is : "+ c);
    System.out.println("Enter long Number ");
    long d = sc.nextLong();
    System.out.println("Your Long Number is : "+ d);
    System.out.println("Enter a Float Number : ");
    float f = sc.nextFloat();
    System.out.println("You Entered : "+ f);
    System.out.println("Enter byte Number : ");
    byte e = sc.nextByte();
    System.out.println("You Entered : "+ e);
    sc.nextLine();
    System.out.println("Enter a Character a-z ");
    char k = sc.next().charAt(0);
    System.out.println("Your Entered Character is : "+k);
    sc.nextLine();
    System.out.println("What is your name ?");
    String name = sc.nextLine();
    System.out.println("Hello "+ name +" !");
    System.out.println("Enter a boolean value");
    boolean l =  sc.nextBoolean();
    System.out.println("You Entered : "+ l);
    sc.close();
}
}
