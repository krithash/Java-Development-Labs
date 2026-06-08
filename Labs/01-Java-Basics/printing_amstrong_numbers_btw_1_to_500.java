package looping_statements;

public class printing_amstrong_numbers_btw_1_to_500 {
    public static void main(String[] arg) {
        int num = 1;

        while (num <= 500) {
            int original = num;
            int sum = 0;

            int temp = original;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit); // cube of digit
                temp = temp / 10;
            }

            if (sum == original) {
                System.out.println(original + " is an Armstrong number");
            }

            num++; // increment outside the if block
        }
    }
}
