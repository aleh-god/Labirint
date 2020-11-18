package Java.albogush;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int poleHeight = 20;
        int poleLength = 20;

        //Random.nextInt(26)
        char[][] pole = new char[poleLength][poleHeight];

        //Рисуем пустое поле
        for (int i = 0; i < poleLength; i++){
            for(int j=0; j < poleHeight; j++){
                // Рисуем 0 если (i не равно 0 или 49) или (j не равно 0 или 49)
                // Общее выражение true - рисуем 0
                if (( (i == 0) | (i == (poleLength-1) ) | ( (j == 0) | (j == (poleHeight-1)) ))){
                   pole[i][j] = '*';}
                else{
                   pole[i][j] = ' ';
                };
            }
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
