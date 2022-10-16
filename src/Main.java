import java.util.Random;
import static java.lang.Math.*;

public class Main {
    private static final Random rand = new Random();
    static public void main(String[] ars){
        // Завдання 1:
        short s1 = 99;
        short s2 = 99;
        float f1;
        float f2;
        byte b = -10;
        boolean q = true;

        // Завдання 2:
        s1 = (short) (b * b);
        s2 = (short) rand.nextInt(10);
        f2 = rand.nextFloat();
        float min= 0;
        float max =9999;
        f2 = min + rand.nextFloat() * (max - min);
        f1 = f2 - (s1 * s2);

        System.out.printf("Зведення у другій степінь змінної s1: %d%n", s1);
        System.out.printf("Випадкове значенн від 0 до 10 : %d%n", s2);
        System.out.printf("Випадкове значення від 0 до 9999 : %.2f%n", f2);
        System.out.printf("f2 - (s1 * s2) = %.2f%n", f1);

        // Завдання 3
        double function = 1/f1-2/f2+(sin(s1)/log(s2));

        System.out.printf("Вирішення виразу: %.2f%n", function);
    }
}