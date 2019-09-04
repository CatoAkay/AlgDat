public class metoder {

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

    public static int min (int[] a){
        int m = 0;
        int minsteVerdi = a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] < minsteVerdi){
                minsteVerdi = a[i];
                m = i;
            }
        }
        return m;
    }

    public static int sissteMaks(int[] a){   // versjon 2 av maks-metoden
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi
    } // maks

    public static int [] minMaks(int [] a){
        int min = min(a);
        int max = maks(a);
        int[] b = {min, max};
        return b;
    }

    //Laget av Cato H. Akay
    public static long fakultet (int n){
        if (n == 1){
            return (long)n;
        }
        int runder = n;
        long sum = 0;
        for (int i = 0; i < runder; i++){
            if (n == 1){
                return sum;
            }
            else if (sum != 0){
                sum = sum * (n-1);
                n--;
            }else {
                sum = n * (n-1);
                n--;
            }
        }
        return sum;
    }

    //Fasit
    //Det skjer n-1 operasjoner
    public static long fakultetEffektiv(int n)
    {
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long fak = 1;

        for (int i = 2; i <= n; i++) fak *= i;

        return fak;
    }

    public static int maks3(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
}
