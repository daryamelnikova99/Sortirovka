package Sortirovka;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Sortirovka {

    public static void main(String[] args) {
        int size = 0, A = 0, B = 0, С = 0; 

        System.out.println("Размер массива: ");
        boolean x = false;
        while (x == false) {
            size = Vvod();
            if (size > 0) {
                x = true;
            } else {
                x = false;
            }
        }
        
        x = false;
        while (x == false) {
            System.out.println("Левая граница A: ");
            A = Vvod(); 
            System.out.println("Правая граница B: ");
            B = Vvod();
            if (A == B | A > B) {
                System.out.println("Левая граница и правая совпадают или левая граница больше правой ");
                x = false;
            } 
            else {
                x = true;
            }
        }
        int[] ff = GenerationArray(size, A, B);  
        for (int i = 0; i < size; i++) {
            System.out.print(ff[i] + " ");
        }
        
        System.out.print("Сортировка по возрасстанию или по убыванию?(введите 0 или 1)");
        x = false;
        while (x == false) {
            С = Vvod();
            if (С == 1 | С == 0) {
                x = true;
                if (С == 0) {
                    System.out.println("Массив отсортирован по возростанию ");
                    SortingMore(ff);
                } 
                else if (С == 1) {
                    System.out.println("Массив отсортирован по убыванию ");
                    SortingLess(ff);
                }
            } 
            else {
                x = false;
            }

        }
    }        
        
    public static int[] GenerationArray(int s, int a, int b) {
        int[] spisok;
        spisok = new int[s]; 

        Random r = new Random();
        for (int i = 0; i < s; i++) {
            spisok[i] = r.nextInt(b - a + 1) + a;
        }
        return spisok;  
    }
    
    
    public static int Vvod() {
        int range = 0;
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IS);
        String Sx;
        String Sy;
        boolean x = false;
        while (x == false) {
            try {
                S = BR.readLine();
                range = Integer.parseInt(S);
                x = true;
            } 
            catch (Exception e) { 
                System.out.println("Вы ввели не число ");
            }
        }
        return range;

    }
    
    public static void SortingMore(int[] array) {
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int s = array[j];
                    array[j] = array[j+1];
                    array[j+1] = s; 
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }  
        
    }
    
    
    public static void SortingLess(int[] array) {
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] < array[j+1] ){
                    int s = array[j];
                    array[j] = array[j+1];
                    array[j+1] = s;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } 
  
        
    }

   
}
    
        
