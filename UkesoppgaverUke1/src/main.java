public class main {

    public int [] i = new int [] {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
    public int [] ii = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public int [] a = new int [] {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7,19};
    public int [] tom = new int[]{5};

    public int biggestNumberIndex = metoder.maks(i);
    public int biggestNumberIndex2 = metoder.maks(ii);
    public int smallesNumberIndex = metoder.min(i);
    public int smallesNumberIndex2 = metoder.min(ii);
    public int lastBiggestIndex = metoder.sissteMaks(i);
    public int lastBiggestIndex2 = metoder.sissteMaks(ii);
    public int [] biggestAndSmallestIndex = metoder.minMaks(a);



    public String printBiggest(){
        return "Største tall sin posisjon fra første tabell: " + biggestNumberIndex +
                "\nStørste tall sin posisjon" + " fra andre tabell: " + biggestNumberIndex2;
    }

    public String printSmallest(){
        return "Minste tall sin posisjon fra første tabell: " + smallesNumberIndex +
                "\nmMinste tall sin posisjon fra andre tabell: " + smallesNumberIndex2;
    }

    public String printLastBiggest(){
        return "Sisste funnet største tall sin posisjon fra første tabell: " + lastBiggestIndex +
                "\nSisste funnet største tall sin posisjon" + " fra andre tabell: " + lastBiggestIndex2;
    }

    public String printBiggestAndSmallest(){
        return "\nDen største og minste posisjonen fra tabell a \nminst: " + biggestAndSmallestIndex[0] +
                "\nmax: " + biggestAndSmallestIndex[1] + "\n";
    }

    public String printMaks3(){
        return "Maks3 indeks: " + metoder.maks3(tom);
    }

    public static void main(String[] args) {
        System.out.println("Hei AlgDat!");
        main m = new main();
        System.out.println(m.printBiggest());
        System.out.println(m.printSmallest());
        System.out.println(m.printLastBiggest());
        System.out.println(m.printBiggestAndSmallest());
        System.out.println(metoder.fakultet(5));
        System.out.println(metoder.fakultetEffektiv(5));
        System.out.println(m.printMaks3());
    }
}
