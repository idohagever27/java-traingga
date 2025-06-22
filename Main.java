// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

    }


    
    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("enter a");
        a = scanner.nextDouble();
        System.out.println("enter b");
         b= scanner.nextDouble();
        System.out.println("enter c");
        c = scanner.nextDouble();
        
        
        if(a + b>c || a+c>b || c+b>a ){
            System.out.print("yea");
            if(a==b && a==c){
                System.out.print("thats sum spiceal tringel");
            }
       else if(a==b||a==c||c==b){
            System.out.print("");
        }
            
        }
else{
    System.out.print("no");
}
        
}
public static void q2() {
    Scanner scanner = new Scanner(System.in);
    int age =scanner.nextInt();
    if(age<=120 && age>=0){
        System.out.print("yea");
    }
    else{
        System.out.print("nuh");
    }
}
public static void q3() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("how mush grls u hav in ur class?");
    int girls = scanner.nextInt();
    System.out.println("how mush boys u hav in ur class?");
    int boys = scanner.nextInt();
    
    if(girls==boys){
        System.out.print("");

    }
    else if(girls>boys) {
        System.out.print("");
        
    }
        else if(girls<boys) {
        System.out.print("");
        
    }
    scanner.close();
        

    }
    public static void q4() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("enter positive num that undrer a 100");
    int num = scanner.nextInt();
    if(num>=0 && num<100){
        if(num >=1 && num<=50 || num>=90 && num <=99){
            System.out.print("bom");
        }
        else{
            System.out.print("opps");
        }
    }
    scanner.close();
}
    public static void q5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a");
        int a = scanner.nextInt();
        System.out.print("b");
        int b = scanner.nextInt();
        System.out.println("c");
        int c = scanner.nextInt();
        int x=(a+b+c)/3;
        System.out.println(x);
        if(x>100){
            System.out.println(a+c);
        }
        else{
            System.out.println(b/2);
        }
        scanner.close();
    }
    public static void q6() {
        Scanner scanner = new Scanner(System.in);
    System.out.print("hours");
    int a = scanner.nextInt();
    if(a<=40){
        System.out.print(a*12);
    }
    else if(a>40){
    int x=a-40;
        System.out.print(x*15+40*12);
    }
    scanner.close();

}
    public static void q4wile() {
        Scanner scanner = new Scanner(System.in);
        boolean luv = true;
        while (luv == true) {
            System.out.println("i luv u ");
            System.out.println("continiu?");
            String e = scanner.nextLine();
            if ( e.equals("true")){
                luv = true;
            }
            else if(e.equals("false")){
                luv=false;
            }
        }
        scanner.close();
    }
    public static void q5wile() {
        Scanner input = new Scanner(System.in);
        int num, count;
        System.out.println("enter natural number");

        num = input.nextInt();
        count = 1;           

        while (count <= num) {
            System.out.println(count);
            count = count + 1;
        }
        input.close();
    }
    public static void q6wile() {
        Scanner scanner = new Scanner(System.in);
        int sum,flat;
        System.out.println("enter num of flats");
        flat = scanner.nextInt();
        sum = 0;
        while (flat>=0){
            sum = sum + flat;
            System.out.println ("enter number of flats or negative number to finish");
            flat= scanner.nextInt();

        }
        System.out.println(sum + "flats were sold");
        scanner.close();

    }
    public static void q7wile() {
        Scanner scanner = new Scanner(System.in);
        int hours,nerds;
        nerds = 0;
        
        System.out.println("enter hw hours");
        hours=scanner.nextInt();
        while(hours<=70){
            System.out.println("enter hw hours. enter a num above 70 to finidh");
            hours=scanner.nextInt();
            if(hours>=15){
                nerds++;
            }

        }
        System.out.println(nerds);
        scanner.close();
    }
}   