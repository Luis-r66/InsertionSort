public class InserccionString {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Carlos", "María", "José", "Paula", "Andrés", "Laura", "Felipe", "Camila"};

        int[] edades = {20, 18, 22, 19, 21, 20, 23, 18, 22, 19};

        //Ordenamiento por inserción (insertion sort)
        for (int i = 1; i < edades.length; i++) {
            int edadActual = edades[i];
            String nombreActual = nombres[i];
            int j = i - 1;

            //Se desplaza hacia la derecha mientras la edad anterior sea mayor
            while (j >= 0 && edades[j] > edadActual) {
                edades[j + 1] = edades[j];
                nombres[j + 1] = nombres[j];
                j--;
            }

            //Insertar el valor actual en la posición correcta
            edades[j + 1] = edadActual;
            nombres[j + 1] = nombreActual;
        }

        //Imprimir
        System.out.println("Estudiantes ordenados por edad:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + edades[i] + " años");
        }
    }
}
