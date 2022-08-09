package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

            for(int i=1; i<=height; i++)
            {
                for(int k=1; k<=i-2; k++)
                {
                    System.out.println(" ");
                }
                for(int j=1; j<=height-i+1; j++)
                {
                    System.out.println("8 ");
                }
                System.out.println();
            }
            for(int i=height-1; i>=1; i--)
            {
                for(int k=1; k<=i-2; k++)
                {
                    System.out.println(" ");
                }
                for(int j=i; j<=height; j++)
                {
                    System.out.println("8 ");
                }
                System.out.println();
            }
        }
    }

