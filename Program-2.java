import java.util.Scanner;
class OddNumberProgram{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        int x=1;
        while (count<n) {
          
            if(isOdd(x))
            {
              count++;
                 
              if(count==n)
              {
                System.out.println(x);
              }
              else{
                System.out.print(x+",");
              }
            
            }
        x++;
        }
    }
        static boolean isOdd(int n)
        {
            if(n%2!=0){
                return true;
            }
            else{
                return false;
            }
}
}
