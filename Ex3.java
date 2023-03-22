package JavaHW1;

import java.util.Scanner;
/* Написать пройстейший калькулятор. */
/*UPD:// Добавить в него функцию отмены действия */
public class Ex3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char tmp = 0; int count = 1;
        int num1 = getInt();
        System.out.println("Введите оператор: ");
        char operation = scan.next().charAt(0);
        tmp = operation;
        int num2 = getInt();
        int result = getCalc(num1, num2, operation, tmp);
        System.out.println("Результат: " + result);
        while (true) {
            num1 = result;
            operation = getOperation(tmp);
            if (operation == 'c' && count == 1) {
                count--;
                result = StepBack(num1, num2, tmp);
                System.out.println("Результат: " + result);
            }else if (operation == 'q'){
                System.exit(0);

            }
            else {
                count = 1;
                tmp = operation;
                num2 = getInt();
                result = getCalc(num1, num2, operation, tmp);
                System.out.println("Результат: " + result);
            }
        }
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


    public static char getOperation(char tmp) {
        System.out.println("1) Введите оператор " +
                            "\n2) введите 'c' для отмены предыдущей операции: " +
                            "\n3) введите 'q' для выхода: ");
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
            tmp = operation;
        }

         else {
            System.out.println("Введите оператор +-*/: ");
            scan.next();
            operation = getOperation(tmp);
        }
         if (operation == 'q'){
            System.exit(0);
        }
        return operation;
    }


    public static int getCalc(int num1, int num2, char operation, char tmp) {
        int result = 0;

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
                result = getCalc(num1, num2, getOperation(tmp), tmp);
        }
        return result;
    }


    public static int StepBack(int num1, int num2, char tmp) {
        int result = 0;
        switch (tmp) {
            case '+':
                result = num1 - num2;
                break;
            case '-':
                result = num1 + num2;
                break;
            case '*':
                result = num1 / num2;
                break;
            case '/':
                result = num1 * num2;
                break;
        }
        return result;
    }
}


