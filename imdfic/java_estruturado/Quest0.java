public class Quest0 {

    private static final char PAREDE_VERTICAL = '|';

    private static final char PAREDE_HORIZONTAL = '-';

    private static final char VAZIO = ' ';

    private static final char TAMANHO = 10;

    private static final char PAREDE_INTERNA = '@';

    private static final double PROBABILIDADE = 0.5;

    private static char[][] tabuleiro;

    private static final char INICIO = 'I';

    private static final char DESTINO = 'D';

    private static int linhaInicio;

    private static int colunaInicio;

    private static int linhaDestino;

    private static int colunaDestino;

    public static int gerarNumero(int minimo, int maximo) {

        int valor = (int) Math.round(Math.random() * (maximo - minimo));

        return minimo + valor;

    }

    public static void inicializarMatriz() {

        int i, j;

        for (i = 0; i < TAMANHO; i++) {

            tabuleiro[i][0] = PAREDE_VERTICAL;

            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;

            tabuleiro[0][i] = PAREDE_HORIZONTAL;

            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;

        }

        for (i = 1; i < TAMANHO - 1; i++) {

            for (j = 1; j < TAMANHO - 1; j++) {

                if (Math.random() > PROBABILIDADE) {

                    tabuleiro[i][j] = PAREDE_INTERNA;

                } else

                    tabuleiro[i][j] = VAZIO;

            }

        }

        linhaInicio = gerarNumero(TAMANHO / 2, TAMANHO - 4);

        colunaInicio = gerarNumero(1, TAMANHO / 2 - 3);

        tabuleiro[linhaInicio][colunaInicio] = INICIO;

        linhaDestino = gerarNumero(TAMANHO / 2, TAMANHO - 4);

        colunaDestino = gerarNumero(1, TAMANHO / 2 - 3);

        tabuleiro[linhaDestino][colunaDestino] = DESTINO;

    }

    public static void imprimir() {

        for (int i = 0; i < TAMANHO; i++) {

            for (int j = 0; j < TAMANHO; j++) {

                System.out.print(tabuleiro[i][j]);

            }

            System.out.println();

        }

    }

    public static void main(String Arg[]) {

        tabuleiro = new char[10][10];

        inicializarMatriz();

        imprimir();

    }

}
