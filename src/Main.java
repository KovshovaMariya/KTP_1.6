import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введите номер задания (для завершения выберите 0):");
            int number = in.nextInt();
            switch (number) {
                case 0: {
                    isExit = true;
                    break;
                }
                case 1: {
                    System.out.println("Первое число:");
                    int a = in.nextInt();
                    System.out.println("Второе число:");
                    int b = in.nextInt();
                    One(a, b);
                    break;
                }
                case 2: {
                    System.out.println("Основание треугольника:");
                    int b = in.nextInt();
                    System.out.println("Высота треугольника:");
                    int h = in.nextInt();
                    Two(b, h);
                    break;
                }
                case 3: {
                    System.out.println("Количество куриц:");
                    int ch = in.nextInt();
                    System.out.println("Количество коров:");
                    int cow = in.nextInt();
                    System.out.println("Количество свинок:");
                    int pig = in.nextInt();
                    Three(ch, cow, pig);
                    break;
                }
                case 4: {
                    System.out.println("prob:");
                    double prob = in.nextDouble();
                    System.out.println("prize:");
                    double prize = in.nextDouble();
                    System.out.println("pay:");
                    double pay = in.nextDouble();
                    Four(prob, prize, pay);
                    break;
                }
                case 5: {
                    System.out.println("Введите a:");
                    int a = in.nextInt();
                    System.out.println("Введите b:");
                    int b = in.nextInt();
                    System.out.println("Введите n:");
                    int n = in.nextInt();
                    Five(a, b, n);
                    break;
                }
                case 6: {
                    System.out.println("Введите символ:");
                    char c = 0;
                    try {
                        c = (char) isr.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Six(c);
                    break;
                }
                case 7: {
                    System.out.println("Введите n:");
                    int n = in.nextInt();
                    System.out.println(Seven(n));
                    break;
                }
                case 8: {
                    System.out.println("Первая сторона треугольника:");
                    int a = in.nextInt();
                    System.out.println("Вторая сторона треугольника:");
                    int b = in.nextInt();
                    Eight(a, b);
                    break;
                }
                case 9: {
                    System.out.println("Введите длинну массива:");
                    int n = in.nextInt();
                    int[] array = new int [n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++){
                        array[i] = in.nextInt();
                    }
                    System.out.println(Nine(array));
                    break;
                }
                case 10: {
                    System.out.println("Введите a:");
                    int a = in.nextInt();
                    System.out.println("Введите b:");
                    int b = in.nextInt();
                    System.out.println("Введите c:");
                    int c = in.nextInt();
                    Ten(a, b, c);
                    break;
                }
            }
        }
    }
    public static void One(int a, int b){
        System.out.println("reminder (" + a + ", " + b + ") = " + a % b);
    }
    public static void Two(int b, int h){
        System.out.println("triArea(" + b + ", " + h + ") = " + 0.5*b*h);
    }
    public static void Three(int ch, int cow, int pig){
        System.out.println("animals(" + ch +", " + cow + ", " + pig + ") = " + (ch*2 + cow*4 + pig*4));
    }
    public static void Four(double prob, double prize, double pay){
        if (prob*prize > pay) System.out.println("profitableGamble(" + prob + ", " + prize + ", " + pay + ") = true");
        else if (prob*prize <= pay) System.out.println("profitableGamble(" + prob + ", " + prize + ", " + pay + ") = false");
    }
    public static void Five(int n, int b, int a){
        if (a + b == n) System.out.println("profitableGamble(" + n + ", " + b + ", " + a + ") = added");
        else if (a - b == n) System.out.println("profitableGamble(" + n + ", " + b + ", " + a + ") = subtracted");
        else  if (a/b == n) System.out.println("profitableGamble(" + n + ", " + b + ", " + a + ") = divided");
        else  if (a*b == n) System.out.println("profitableGamble(" + n + ", " + b + ", " + a + ") = multiplied");
        else System.out.println("profitableGamble(" + n + ", " + b + ", " + a + ") = none");
    }
    public static void Six(char c){
        System.out.println("ctoa('" + c + "') = " + (int) c);
    }
    public static int Seven(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void Eight(int a, int b){
        System.out.println("nextEdge(" + a +", " + b + ") = " + (a + b - 1));
    }
    public static int Nine(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i]*array[i]*array[i];
        }
        return sum;
    }
    public static void Ten(int a, int b, int c){
        int d = 0;
        for (int i = 1; i <= b; i++){
            d = a+a;
        }
        if (d % c == 0)  System.out.println("reminder (" + a + ", " + b + ", " + c + ") = true");
        else System.out.println("reminder (" + a + ", " + b + ", " + c + ") = false");
    }
}
