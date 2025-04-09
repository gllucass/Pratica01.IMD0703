public class Main {
    final static int LINHAS = 5;
    final static int COLUNAS = 6;
    public static void main(String[] args) {
        String fraseCifrada = "Ad0holae7ml.ui0ue.lm3ig.adeta.";

        System.out.println("\nO tamanho do texto é de " + fraseCifrada.length() + " caracteres\n");
        // Decifrar
        char[][] matriz = preencherMatrizLinhaPorLinha(fraseCifrada, LINHAS, COLUNAS);
        System.out.println("Matriz preenchida (linha por linha):");
        exibirMatriz(matriz, LINHAS, COLUNAS);

        String fraseDecodificada = lerColunaPorColuna(matriz, LINHAS, COLUNAS);
        System.out.println("\nFrase decodificada:");
        System.out.println(fraseDecodificada);

        // Engenharia reversa - Criptografar novamente
        char[][] matrizCripto = preencherMatrizColunaPorColuna(fraseDecodificada, LINHAS, COLUNAS);
        System.out.println("\nMatriz reconstituída (coluna por coluna):");
        exibirMatriz(matrizCripto, LINHAS, COLUNAS);

        String fraseRecriptografada = lerLinhaPorLinha(matrizCripto, LINHAS, COLUNAS);
        System.out.println("\nFrase recriptografada:");
        System.out.println(fraseRecriptografada);
    }

    public static char[][] preencherMatrizLinhaPorLinha(String frase, int LINHAS, int COLUNAS) {
        char[][] matriz = new char[LINHAS][COLUNAS];
        int idx = 0;
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = frase.charAt(idx++);
            }
        }
        return matriz;
    }

    public static char[][] preencherMatrizColunaPorColuna(String frase, int LINHAS, int COLUNAS) {
        char[][] matriz = new char[LINHAS][COLUNAS];
        int idx = 0;
        for (int j = 0; j < COLUNAS; j++) {
            for (int i = 0; i < LINHAS; i++) {
                matriz[i][j] = frase.charAt(idx++);
            }
        }
        return matriz;
    }

    public static String lerColunaPorColuna(char[][] matriz, int LINHAS, int COLUNAS) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < COLUNAS; j++) {
            for (int i = 0; i < LINHAS; i++) {
                sb.append(matriz[i][j]);
            }
        }
        return sb.toString();
    }

    public static String lerLinhaPorLinha(char[][] matriz, int LINHAS, int COLUNAS) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                sb.append(matriz[i][j]);
            }
        }
        return sb.toString();
    }

    public static void exibirMatriz(char[][] matriz, int LINHAS, int COLUNAS) {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
