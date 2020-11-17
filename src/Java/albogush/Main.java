package Java.albogush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int poleHeight = 50;
        int poleLength = 50;
        Integer PL = new Integer(poleHeight);
        //Random.nextInt(26)
        char[][] pole = new char[poleLength][poleHeight];

        //Рисуем пустое поле
        for (int i = 0; i < poleLength; i++){
            for(int j=0; j < poleHeight; j++){
               if (i != poleLength && i != 0){
                   pole[i][j] = '*';}
               else{
                   pole[i][j] = '0';
               };

                switch(j){
                    case 0:
                    case PL:
                        pole[i][j] = '*';
                        break;
                    default:
                        pole[i][j] = ' ';
                }
            }
        }
        // Рисуем рамку
        for (int i = 0; i < pole.length; i++){
            pole[i][0] = '*';
            pole[i][49] = '*';
            pole[0][i] = '*';
            pole[49][i] = '*';
        }

        drawPole(pole);
    }

    private static void drawPole(char[][] pole) {
        for (int i = 0; i < pole.length; i++){
            for(int j=0; j < pole[i].length; j++){
                System.out.printf("%c ", pole[i][j]);
            }
            System.out.println();
        }
    }
}
