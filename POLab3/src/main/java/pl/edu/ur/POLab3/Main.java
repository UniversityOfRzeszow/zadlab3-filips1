/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Filip Szpunar
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int rekurencja(int x, int n) {
        if (n == 0) {
            System.out.println(1);
        } else if (n % 2 == 1) {
            System.out.println(x * Math.pow(Math.pow(x, (n - 1) / 2), 2));
        } else {
            System.out.println(Math.pow(Math.pow(x, (n/2)), 2));
        }
        return 0;
    }

    public static int iteracja(int x, int n) {
        int c = 1;
        if (x == 1 || n == 0) {
            System.out.println(1);
        } else {
            for (; Math.abs(n) > 0;) {
                c = c * x;
                if (n < 0) {
                    n++;
                } else {
                    n--;
                }
            }
            System.out.println(c);
        }
        return 0;
    }

    public static int Fibbonacci(int n) {
        int fi, f, m;
        if (n == 0) {
            System.out.println (0);
        }
        if (n == 1) {
            System.out.println (1);
        }
        fi = 0;
        f = 1;
        for (int i = 2; i <= n;i++) {
            m = f + fi;
            fi = f;
            f = m;
            
        }
        System.out.println(f);
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        //ZADANIE 1.4
        System.out.println("n>>s służy do przesunięcia  w n o s bitów w prawo np: ");
        System.out.println("-10 w systemie bitowym przesuniemy o 2 znaki w prawo komendą -10>>2");
        System.out.println(Integer.toBinaryString(-10) + "(-10");
        System.out.println(Integer.toBinaryString(-10 >> 2) + "(-10>>2)");
        System.out.println("wynik tego działania w liczbach dziesiętnych to" + (-10 >> 2));

        System.out.println("n<<s służy do przesunięcia  w n o s bitów w lewo np: ");
        System.out.println("-10 w systemie bitowym przesuniemy o 2 znaki w lewo komendą -5<<3");
        System.out.println(Integer.toBinaryString(-10) + "(-10");
        System.out.println(Integer.toBinaryString(-10 << 2) + "(-10<<2)");
        System.out.println("wynik tego działania w liczbach dziesiętnych to" + (-10 << 2));

        System.out.println("n>>>s służy do przesunięcia  w n o s bitów w prawo wliczając bit znaku który zostaje traktowany jako normalny bit np: ");
        System.out.println("-10 w systemie bitowym przesuniemy o 2 znaki w prawo wliczając bit znaku komendą -10>>>2");
        System.out.println(Integer.toBinaryString(-10) + "(10");
        System.out.println(Integer.toBinaryString(-10 >>> 2) + "(10>>>2)");
        System.out.println("wynik tego działania w liczbach dziesiętnych to " + (-10 >>> 2));
        //ZADANIE 1.7
        System.out.println("NOR w javie nie ma swojego operatora dlatego trzeba użyć komendy  !(a || b)");
        System.out.println("XOR w javie  ma operator ^");
        Boolean a, b;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj warotść logiczną a");
        a = odczyt.nextBoolean();
        System.out.println("Podaj wartość logiczną b ");
        b = odczyt.nextBoolean();
        System.out.println("Wartość logiczna a NOR b wynosi " + (!(a || b)));
        System.out.println("Wartość logiczna a XOR b wynosi" + (a ^ b));
        //ZADANIE 2.2
        int i;
        System.out.println("char[] ToCharArray()  umożliwia skopiowanie każdego znaku w ciągu do tablicy znaków.");
        String s1 = "witam";
        char[] ch = s1.toCharArray();
        for (i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("byte[] getBytes() zamienia String w sekwencję bitów np 'ABCDEFG'");
        String s2 = "ABCDEFG";
        byte[] barr = s2.getBytes();
        for (i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
        System.out.println("boolean equals(String str) służy do sprawdzenia dwóch Stringów czy są takie same");
        String Str1 = "Test";
        String Str2 = "TEST";
        String Str3 = "Test";
        boolean Wartość;

        Wartość = Str1.equals(Str2);
        System.out.println("Zwrócona warotść porównania Test i TEST = " + Wartość);

        Wartość = Str1.equals(Str3);
        System.out.println("Zwrócona wartość porównania Test i Test  = " + Wartość);
        System.out.println("boolean equalsIgnoreCase(String str) robi to samo co powyższe tylko że ignoruje rozmiar liter");
        Wartość = Str1.equalsIgnoreCase(Str2);
        System.out.println("Zwrócona wartość porównania Test z TEST = " + Wartość);

        System.out.println("int compareTo(String str)służy do porównywania Stringu do innego stringu oraz wypisuje na wyjściu o ile porównywane stringi mają wieksza wartość leksykograficzną");
        Str1 = "ten obiekt";
        Str2 = ("obiekt");
        Str3 = ("ten obiekt z tą wielkościa");

        int rezultat = Str1.compareTo(Str2);
        System.out.println("porównująć'ten obiekt z 'obiekt' wychodzi =  "+(rezultat));

        rezultat = Str1.compareTo(Str3);
        System.out.println("porównując 'ten obiekt' z 'ten obiekt z wielkością' wychodzi =    "+(rezultat));

        System.out.println("int campareToIgnoreCase(String str) robi to samo co powyższe tylko że ignoruje rozmiar liter");
        Str1 = "OBIEKT";
        rezultat = Str1.compareToIgnoreCase(Str2);

        System.out.println("porównywanie 'OBIEKT' i 'obiekt'  =   " + rezultat);

        String Str = "test";
        System.out.println("indexOf(int i) oraz indexOf(String str) służy do wypisywania pierwszego indeksu szukanej frazy lub znaku");
        System.out.println("szukany pierwszy indeks 't' w 'test' wynosi = " + Str.indexOf("t"));

        System.out.println("int lastIndexOf(int i) oraz int lastIndexOf(String str) służy do wypisywania ostatniego indeksu szukanej frazy lub znaku");
        System.out.println("szukany ostatni indeks 't' w 'test' wynosi = " + Str.lastIndexOf("t"));

        System.out.println("String substring(int startString),String substring(int startString, int stopString) służą do wypisywania substringów danych stringów pierwszy od danego indeksu a drugi w przedziale od do danego indeksu");
        StringBuilder str = new StringBuilder("zadanie");
        System.out.println("string = " + str);
        System.out.println("substringiem od indeksu 2 jest = " + str.substring(2));
        System.out.println("substringiem od 1 indeksu do 4 jest = " + str.substring(1, 4));

        System.out.println("String replace(char orginal, char zamiennik) zastępuje wszystkie wystąpienia jednego znaku na inny znak i zwraca zmieniony ciąg znaków. ");
        Str = "  test Zamiany liter  ";
        System.out.print(Str);
        System.out.println("po zamianie" + Str.replace('a', 'i'));

        System.out.println("String trim() Metoda usuwa początkowe i końcowe białe znaki i zwraca poprawiony ciąg znaków. ");
        System.out.println(Str.trim());

        System.out.println("String toLowerCase() Zmienia wszystkie duże litery tekstu na małe a String toUpperCase()  na duże  ");
        System.out.println(Str.toLowerCase());
        System.out.println(Str.toUpperCase());
        System.out.println("String[] split(String regex, int limit) String[] split(String regex służą do rozdzielania stringu względem podanego znaku lub wyrazu ");
        System.out.println(Arrays.toString(Str.split(" ")));
        //ZADANIE 3.3
        System.out.println("Wybierz liczbę");
        int liczba, potęga, w;
        liczba = odczyt.nextInt();
        System.out.println("Wybierz potęgę");
        potęga = odczyt.nextInt();
        System.out.println("Wybierz 1 żeby rekurencja,2 żeby iteracja");
        w = odczyt.nextInt();
        if (w == 1) {
            rekurencja(liczba, potęga);
        } else if (w == 2) {
            iteracja(liczba, potęga);

        }
        //ZADANIE 3.4
        System.out.println("Podaj liczbe");
        w = odczyt.nextInt();
        Fibbonacci(w);
       

    }
}

