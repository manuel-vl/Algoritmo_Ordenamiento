public class AlgoritmoOrdenamiento {
    private int[] arreglo;

    // Constructor
    public AlgoritmoOrdenamiento(int[] arreglo) {
        this.arreglo = arreglo;
    }

    // Método de ordenamiento burbuja
    public int[] burbuja() {
        int n = arreglo.length;
        boolean isOrder;

        do {
            isOrder = true;

            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;

                    isOrder = false;
                }
            }

            n--;
        } while (!isOrder);

        return arreglo;
    }

    // Getters y setters
    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] array = {5, 2, 9, 1, 5, 6};

        // Crear objeto usando constructor
        AlgoritmoOrdenamiento ordenador = new AlgoritmoOrdenamiento(array);

        System.out.println("Arreglo original:");
        ordenador.imprimirArreglo();

        // Llamada al método de ordenamiento burbuja
        ordenador.burbuja();

        System.out.println("Arreglo ordenado:");
        ordenador.imprimirArreglo();
    }

    // Método auxiliar para imprimir el contenido de un arreglo
    private void imprimirArreglo() {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}