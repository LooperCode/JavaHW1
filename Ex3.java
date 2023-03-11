package JavaHW1; import java.util.Scanner;
public class Ex3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = getCalc(num1, num2, operation);
        System.out.println("Результат: "+result);
    }
           


    public static int getInt() {
        System.out.println("Введите число: ");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Введите число!");
            scan.next();
            num = getInt();    
        }
        return num;
    }


    public static char getOperation(){
        System.out.println("Введите оператор: ");
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Введите оператор +-*/: ");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }


    public static int getCalc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректная операция.");
                result = getCalc(num1, num2, getOperation());
        }
        return result;
}



        }
