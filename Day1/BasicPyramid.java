import java.util.Scanner;

public class BasicPyramid {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int a = sc.nextInt();
    System.out.println("   "+a);
    System.out.println("  "+a+a+a);
    System.out.println(" "+a+a+a+a+a);
    System.out.println(""+a+a+a+a+a+a+a);
    sc.close();
}
}
