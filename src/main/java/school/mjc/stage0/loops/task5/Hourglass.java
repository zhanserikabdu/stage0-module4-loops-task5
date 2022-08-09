package school.mjc.stage0.loops.task5;

import java.util.Scanner;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int rows, i, j, k;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.print("Output: \n\n");
        //upper half
        for (i = 1; i <= height; i++)
        {
            for (k = 1; k <= i - 2; k++)
            {
                System.out.print("" + " ");
            }
            for (j = 1; j <= height - i + 1; j++)
            {
                System.out.print("8");
            }
            System.out.println();
        }

        //lower half
        for (i = height - 2; i >= 1; i--)
        {
            for (k = 1; k <= i - 2; k++)
            {
                System.out.print(" ");
            }
            for (j = i; j <= height; j++)
            {
                System.out.print("8" + " ");
            }
            System.out.println();
        }
    }
}
