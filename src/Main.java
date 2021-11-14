public class Main {
    public static void main (String[] arg){
//        int [] tabelka = new int [8];
//        for (int i = 0; i < 8; ++i)
//        tabelka[i] = i + 1;
//
//        for (int i = 0; i < 7; ++i)
//        System.out.println("Kolejna tabelka to: " + tabelka[i]);
//        int suma = 0;
//        for (int i = 0; i < 7; ++i)
//        suma = suma + tabelka[i];

     int [][] tabelka1 = new int [5][6];
     for(int i = 0; i < 5; ++i)
         for(int j = 0; j < 6; ++j)
         tabelka1[i][j] = j + 1;

    for(int i = 0; i < 5; ++i)
        for(int j = 0; j < 6; ++j)
         System.out.println("Kolumna:" + i + ", wiersz: " + j + " ma wartosc: " + tabelka1[i][j]);

    }
}