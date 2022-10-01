import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ширину: ");
        int w = scan.nextInt();

        printFigure(w);
    }

    private static void printFigure(int width){

        if(width % 2 == 0)
            return;

        int height = (width / 2) + 1;
        int m_width = width;

        int m_spaces = 0;

        for(int h = 0; h < height; h++){

            if (h < 2){
                m_width -= h;
                m_spaces += h;
            }else{
                m_width -= 2;
                m_spaces += 2;
            }

            for (int w = 0; w < m_width; w++){
                if (w == m_width / 2){
                    for (int i = 0; i < m_spaces; i++){
                        System.out.print("\s");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}