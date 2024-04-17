package day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int level = s.nextInt();

        if(level <= 0){
            System.out.println("Ошибка ввода");
            return;
        }
        else if (level > 0 && level <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (level > 4 && level <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else {
            System.out.println("Многоэтажный дом");
        }
    }
}
