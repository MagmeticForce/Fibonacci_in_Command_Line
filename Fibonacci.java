public class Fibonacci {

    public static void main (String[] args) {
    
        String user_input_string = args[0];
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

    }
        
        /*
        for (String s: args) {
            System.out.println(s);
        }
        */
}
