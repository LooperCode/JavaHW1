package JavaHW1;
/**
 * Ex2 - Вывести все простые числа до 1000(n)
 */
public class Ex2 {

    private static void  getPrime(int n) {

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) { 
                if ((i % j) == 0) { 
                 isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
        }
    }
}
public static void main(String[] args) {
    int n = 1000;
    getPrime(n);
}
}
