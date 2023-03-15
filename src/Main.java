import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Beräkna befolkningen år X
        //   - Befolkningen år 2020 = 26000
        //   - Födda = 0.7% av befolkningen vid årets start
        //   - Avlidna = 0.6%  av befolkningen vid årets start
        //   - Inflyttade = 300 varje år
        //   - Utflyttade = 325 varje år

        Scanner input = new Scanner(System.in);
        System.out.print("Ange året: ");
        int year = input.nextInt();

        int count = 26000;
        for (int i=2020; i < year;i++) {
            int moveIn = 300;
            int moveOut = 325;
            double born = count * 0.007;
            double dead = count * 0.006;

            count += moveIn + (int)born;
            count -= moveOut + (int)dead;
        }
        System.out.println("Befolkning: " + count);
    }
}