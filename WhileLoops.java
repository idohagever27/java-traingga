import java.util.Scanner;

public class WhileLoops {
    
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
    public static void q8() {
        Scanner scanner = new Scanner(System.in);
        int numP,count6=0,countF=0,sum=0;
        System.out.println("how muck numP?");
        numP = scanner.nextInt();
        while(numP!=0){
             System.out.println("how muck numP?");
            numP = scanner.nextInt();
            sum+=numP;
            countF++;
            if(numP>=6){
                count6++;
            }
        }
        System.out.println(sum/countF);
        System.out.println(count6);

    }
    public static void q9() {
        Scanner scanner = new Scanner(System.in);
        int min,max;
        System.out.println("price? enter positive num");
        int  num= scanner.nextInt();
        min=num;max=num;
        while(num>=0){
            System.out.println("price?");
            num= scanner.nextInt();
            if(num>=0){
                min = Math.min(num,min);
            }
            max = Math.max(num,max);
            
        }
        if(min<0){
            System.out.println("no valid number");
        }
        else{
            System.out.println("min = "+ min+" max = "+max);
        }
    }
}
