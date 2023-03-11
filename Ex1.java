package JavaHW1; import java.util.Scanner; 

/**
 * Сумма и факториал чисел от 1 до n.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int insert = scan.nextInt();
        int sum = 0; int fact = 1;
        for (int i = 1; i <= insert; i++) {
            sum = sum + i;
            fact = fact * i;
        }
        scan.close();
        System.out.printf("Треугольная сумма [%d] = %d\n",insert, sum);
        System.out.printf("!%d = %d\n",insert, fact);
    }
}