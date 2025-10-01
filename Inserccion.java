import java.util.Random;

public class Inserccion {
    public static void main(String[] args) {
        Random r = new Random();
        int temp = 0, j = 0;
        int[] a = new int[20];
        //inicializo el arreglo

        System.out.println("Ingreso los numero aleatorios al arreglo");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
        System.out.println("el metodo ordenado es: ");
        //ordenamiento por inserccion
        for (int i = 0; i < a.length; i++) {
            //temp es el numero de elemento que se va a ir comparando
            temp = a[i];
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }
        System.out.println("");
    }
}
