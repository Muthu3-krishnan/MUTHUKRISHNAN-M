
import java.util.Scanner;
class MultipleCounter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input series =>ex 1,2,3,56,7,8.....");
        String str=sc.nextLine();// this line used for getting the input in string 
        String [] ele=str.split(",");//convert the string  into string array
        int[] arr=new int[ele.length];


          System.out.print("{");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(ele[i]); // covert the string type value into integer type and stored into the integer type array
        }
       
        for(int l=1;l<=9;l++)
         {
            int count =0;
             for(int k=0;k<arr.length;k++)
             {
                if(arr[k]%l==0)
                {
                    count++;
                }
                
            }
            System.out.print(l+":"+count);
            if(l<9){System.out.print(",");}
           

        }
        System.out.print("}");
    }

    
    
}
