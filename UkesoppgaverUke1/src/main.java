public class main {

    public int [] i = new int [] {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
    public int [] ii = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static int maks(int[] a){   // versjon 2 av maks-metoden
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi
    } // maks

    public int firstNumber = maks(i);
    public int secondNumber = maks(ii);


    public String print(){
        return "Største tall fra første tabell: " + firstNumber + "\nStørste tall fra andre tabell: " + secondNumber;
    }


    public static void main(String[] args) {
        System.out.println("Hei AlgDat!");
        main m = new main();
        System.out.println(m.print());
    }
}
