import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First Number");
        double a=sc.nextInt();
        System.out.println("Enter the Second Number");
        double b=sc.nextInt();

        System.out.println("Enter the type of Operation..Example Addition/Substraction/Multiplication/Division");
        String operation=sc.next().toLowerCase();

       double res=calc(a,b,operation);
       System.out.println(operation+" value is : "+res);

       



        
    }
     public static double calc( double a ,double b ,String opt){
        
            switch (opt) {
                case "addition":
                    return a+b;
            
                case "subtraction":
                    return a-b;
        
                case "multiplication":
                    return a*b;
                case "division":
                if(b==0)
                {
                    System.out.println(" we cant divide the number by zero enter the vallid number ");
                    return Double.NaN;
                }
                else{
                    return a/b;
                }
                default:System.out.println("enter the valid operation Example Addition/Substraction/Multiplication/Division");
                     return Double.NaN;
                    
            }



        }



}