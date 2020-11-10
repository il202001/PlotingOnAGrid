package ploting.on.a.grid;
import java.util.Scanner;
public class PlotingOnAGrid {
    public static void graph(String rows,int colloms){
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] cords = new String[10][10];
        for (int i = 0; i < cords.length; ++i) {
            for(int j = 0; j < cords[i].length; ++j) {
                cords[i][j] = " ";
            }
        }
        boolean x= true;
        String rows;
        int collom;
        while (x){
            try{
                System.out.println("give me a letter for the row");
                rows = input.next();
                System.out.println("give me a number for the collom");
                collom = input.nextInt();
                rows = rows.toUpperCase();
                if (rows.length()==1){
                    char rowsChar = rows.charAt(0);
                    int rowsInt = rowsChar-65;
                    cords[rowsInt][collom] = "x";
                    System.out.print("( )");
                    for (int i = 0;i<10;i++){
                        System.out.print("("+i+")");
                    }
                    System.out.println("");
                    for (int i = 0; i < cords.length; ++i) {
                        System.out.print("("+((char)(i+65))+")");
                        for(int j = 0; j < cords[i].length; ++j) {
                            System.out.print("("+cords[i][j]+")");
                        }
                        System.out.println("");
                    }
                }
            }catch(Exception e){
                System.out.println("ERROR"+e);
            }
        }
    }
    
}
