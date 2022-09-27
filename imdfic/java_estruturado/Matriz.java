public class Matriz{
    public static void main(String[] Args){
        int matriz[][] = new int[5][5];
        for (int i=0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i==j)
                    matriz[i][j] = ++i;
                else
                    matriz[i][j] = 0;
            }
        }
        for (int i=0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}