public class Main {
    public static void main(String[] args) {
        // Creazione e popolamento della matrice
        int[][] m = new int[3][3];

        // Popola la matrice con numeri casuali tra 1 e 10
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int)(Math.random() * 10 + 1);
            }
        }

        // Stampa della matrice
        System.out.println("Matrice:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        // Calcolo della somma degli elementi
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += m[i][j];
            }
        }
        System.out.println("Somma degli elementi: " + sum);

        // Ricerca del valore massimo
        int max = 0;
        int col = 0;
        int row = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                    col = i;
                    row = j;
                }
            }
        }
        System.out.println("Valore massimo: " + max + " alle coordinate: (" + col + " , " + row + ")");

        // Ricerca numero di pari e dispari
        int pari = 0;
        int dispari = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] % 2 == 0) {
                    pari++;
                } else {
                    dispari++;
                }
            }
        }
        System.out.println("Nella matrice ci sono: " + pari + " numeri pari");
        System.out.println("Nella matrice ci sono: " + dispari + " numeri dispari");
    }
}
