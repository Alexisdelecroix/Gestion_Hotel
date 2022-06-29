


public class Main {

    public static void main(String args[]) {

        // déclarer et initialiser un tableau 2D
        int[][] names = {
                {100, 120, 130, 150, 0, 0},
                {130, 160, 170, 190, 0, 0},
                {170, 200, 210 ,230 ,270 , 350},
                {200, 230, 240, 260,300,400},
        };

        // afficher le tableau 2D
        for (int[] tab: names) {
            for (int s: tab) {
                System.out.print(s + "\t");
            }
            System.out.println("\n");
        }

        int j, i = 1;
        for (int[] tab1D : names) {
            j = 1;
            for (int val : tab1D) {
                System.out.println("[" + i + "][" + j + "] = " + val);
                j++;
            }
            i++;
        }
    }
}




