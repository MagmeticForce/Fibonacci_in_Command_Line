import java.util.Scanner;

public class Fibonacci_Input_Within_the_Program {

    public static void main (String[] args) {


        System.out.println ("Enter a Fibonacci number:");
        
        Scanner input_detector = new Scanner(System.in);
        String user_input_string = input_detector.nextLine();
        int user_input_int = Integer.parseInt(user_input_string);

        int new_sum = 0;
        int current_sum = 1;
        int previous_sum = 0;
        System.out.println("0");
        System.out.println("1");

        while (current_sum < user_input_int) {
            new_sum = current_sum + previous_sum;
            previous_sum = current_sum;
            current_sum =  new_sum;
            System.out.println(new_sum);
        }

        input_detector.close();

    }
        
        /*
        for (String s: args) {
            System.out.println(s);
        }
        */
}
