import java.lang.System;
public class ContarTiempo
{
    public static long ti, tf ,tt;
    public static int[] a = new int[100]; // 
    
    public static void main(String[] args) {
        rellenarArray(a); //Del 1 al 100 (a[99] = 100)
        ti = System.nanoTime(); // Tiempo inicial
        linearSearch(a, 100); // LLamada al algoritmo (Busco en a[] el nº 100)
        tf = System.nanoTime(); // Tiempo final
        tt = tf - ti; // Calculo de el tiempo total
        System.out.printf("Tiempo Inicial: %1s ms \nTiempo Final: %1s ms \nEl Tiempo Total: %1s ms",
                                            ti         ,        tf         ,            tt);
    }
    
    /**
     * Algoritmo busca el elemento e, en el array a
     */
    private static int linearSearch(int[] a, int e) {
        int i = 0;
        while (i < a.length && a[i] != e) {i++;}
        if (i < a.length) {
            return i;
        }else {
            return -1;
        }
    }
    
    /** 
     * Rellena el array segun su tamaño 
     */
    private static int[] rellenarArray(int[] array) {
        for(int i = 0; i < array.length;i++) {
            array[i] = i + 1;
        }
        return array;
    }
}