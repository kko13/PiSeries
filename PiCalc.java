import java.util.Scanner;

public class PiCalc {
    public static void main(String[] args)
    {
        // Scanner input handling
        Scanner in = new Scanner(System.in);
        System.out.println("Pi Series Approximation");
        System.out.println("Enter number of series iterations to calculate...");
        int termTotal;
        termTotal = in.nextInt();

        // Format basis of table for output
        System.out.println("Terms        PI Approximation");

        // Computation
        float term = 0;
        float denomVal = -1;
        for(int cnt = 1; cnt <= termTotal; cnt++)
        {
            denomVal += 2;
            if (cnt % 2 == 0)               // Even numbered iterations are negative
            {
                term -= (float)4 / denomVal;
            }
            else                            // Odd numbered iterations are positive
            {
                term += (float)4 / denomVal;
            }
            System.out.printf("%d            %f\n", cnt, term);
        }
    }
}
