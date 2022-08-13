package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i = 0; i < height/2; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        if(height % 2 != 0) {
            for(int i = 0; i < height/2; i++) {
                System.out.print(" ");
            }
            System.out.print("8");
            for(int i = 0; i < height/2; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = height/2; i > 0; i--) {
            for(int k = i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= height - 2 * i + 1; j++) {
                System.out.print("8");
            }
            for(int k = i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}






