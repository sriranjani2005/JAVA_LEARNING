public class ArithmeticOperator {
        public static void main(String args[]){
            //+ - * / %
            int a = 10,b=2,c;
            c=a+b;
            System.out.println("Add:"+c);
            int d=a-b;
            System.out.println("Sub : "+d);
            int e= a*b;
            System.out.println("Multiplication: "+e);
            int f=a/b;
            System.out.println("Division(quotient): "+f);
            int g=a%b;
            System.out.println("Modulo(Remainder): "+g);
            //compound Assignment
            a+=3;
            System.out.println(a);
            //Increment and Decrement
            a++; //post increment
            ++a; //pre increment
            a--; //post decrement
            --a; //pre decrement


}
}
