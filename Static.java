import java.util.*;

public class Static{
    public static double kphToMph(double km){
        return km / 1.609344;
    }
    public static double mphToKph(double mph){
        return mph * 1.609344; 
    }
    public static boolean inputCheck(int option){
        int validOptions[] = {1, 2};
        for(int n : validOptions){
            if(n == option)
                return true;
        }
        System.out.println("Invalid Input");
        
        return false;
    }

    public static void main(String args[]){
        double result = 0; 
        double n = 0;
        Scanner input = new Scanner(System.in);
        int options;
        do{
            System.out.print("Press 1 for km to mph conversion, 2 for mph to km: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Press 1 for km to mph conversion, 2 for mph to km: ");
                input.next();
            }
            options = input.nextInt();
        }while(!inputCheck(options));
        
        do{
            System.out.print("Enter value wished to be converted: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Please enter an double.");
                System.out.print("Enter value wished to be converted: ");
                input.next();
            }
            n = input.nextDouble();
        }while(n < 0);
        
        if(options == 1){
           result = kphToMph(n);
            String trunc = String.format("%.2f", result);
            System.out.println(n + " kph is " + trunc + " mph");
        }else{
            result = mphToKph(n);
            String trunc = String.format("%.2f", result);
            System.out.println(n + " mph is " + trunc + " kph");
        }
    }
}
