import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz : ");
        int a=tara.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz : ");
        int b=tara.nextInt();
        MineSweeper mayin = new MineSweeper(a, b);
        mayin.run();
        System.out.println("");
    }
}