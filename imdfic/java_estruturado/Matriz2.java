public class Matriz2{
    public static void main(String[] Args){
        int matriz[][] = new int[10][10];
        for (int i=0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i==j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }
    
        System.out.print(matriz[3][3]+matriz[4][5]);
    
    }
}