package PaqueteMatriz;

public class Matriz {
    private int[][] matriz;

    protected Matriz(int[][] matriz) {
        this.matriz = matriz;
    }

    protected void imprimir() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected Matriz transpuesta() {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return new Matriz(transpuesta);
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}};
        System.out.println("PaqueteMatriz.Matriz: ");
        Matriz m = new Matriz(matriz);
        m.imprimir();
        System.out.println("Transpuesta: ");
        m.transpuesta().imprimir();
    }
}

