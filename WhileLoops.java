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
    public static void q10() {
        Scanner scanner = new Scanner(System.in);
        double max1=0,max2=0,num;
        System.out.println("grams?");
        num = scanner.nextDouble();
        while (num>=0) {
            System.out.println("grams?");
            num = scanner.nextDouble();
            if(num>=max1){
                max1=max2;
                num=max1;
            }
            else if(num>=max2){
                max2=num;
            }
        }
        System.out.println(max2);
        System.out.println(max1);
    }
    public static void q11() {
        Scanner scanner = new Scanner(System.in);
        int count=0,num1,num2;
        int diff = Math.abs(num1 - num2);
        System.out.println("two nums");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        while((count<=20)&& (num1>=0||num2>=0 )&&(diff!=1)){
            System.out.println("two nums");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
    public static void q14() {
       Scanner scanner = new Scanner(System.in);
       double nums,bigger=0,sum=0;
       while(true){
        System.out.println("num?");
        nums=scanner.nextDouble();
        sum++;
        if(nums>bigger){
            bigger=nums;
        }
        
        else if(bigger>nums){
            break;
        }
       } 
    }
    public static void q15() {
        Scanner scanner = new Scanner(System.in);
        int kidNum,sumFirst=0,sumSecond=0;;
        boolean firstWork;
        boolean secondWork;
        while(kidNum!=0){
            System.out.println("stundent num?");
            kidNum=scanner.nextInt();
            System.out.println("first work?");
            String y = scanner.nextLine();
            if(y=="true"){
                firstWork = true;
                sumFirst++;
            }
            else{
                firstWork=false;
            }
            System.out.println("second work?");
             String x = scanner.nextLine();
            if(x=="true"){
                secondWork = true;
                sumSecond++;
            }
            else{
                secondWork=false;
            }

        }
        System.out.println(sumFirst);
        System.out.println(sumSecond);

    }
    public static void q16() {
        Scanner scanner = new Scanner(System.in);
        int sum=0,num,sumPipol=0;
        boolean continiu=true;
        while (continiu==true){
            System.out.println("enter grade");
            num = scanner.nextInt();
            if(num>=50&& num<=90){
                sum=sum+num;
                sumPipol++;
            }
            System.out.println("continu?");
            int yn = scanner.nextInt();
            if(yn==1){
                continiu=true;
            }
            else{
                continiu=false;
            }
        }
        System.out.println(sum/sumPipol);
    }
    public static void q17() {
         Scanner scanner = new Scanner(System.in);
         double num;
         int numnump=0;
         
         while (num!=0){
            System.out.println("eneter num");
            num = scanner.nextDouble();
            if (num%1==0){
                num = numnump;
                System.out.println(Math.abs(numnump));
            }
            else{
           System.out.println(Math.abs(num)); 
            }
         }
    }
    public static void q18() {
         int a=1,b=1,c;
         System.out.print(a+" ");
         while( b<1000){
            System.out.print(b+" ");
            c=a+b;
            a=b;
            b=c;
         }
         

    }
}
