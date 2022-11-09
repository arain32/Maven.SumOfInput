import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int userinput= scanner.nextInt();
        //System.out.println("your number is " + userinput);
         int sum = sumOfNumbers(userinput);
        System.out.println("sum of your input is " + sum);
    }
    
    static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i= 0; i <= n; i++){
            //System.out.println("the number i is "+ i);
         sum = sum + i;
            //System.out.println("sum is " + sum);


        }

        return sum;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
