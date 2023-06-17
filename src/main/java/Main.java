import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int max = Short.MAX_VALUE;
        int min = Short.MIN_VALUE;

        Random random = new Random();
        int i = random.nextInt(2001);

        System.out.println(i);

// Находим номер старшего бита числа i
        int n = (Integer.SIZE - Integer.numberOfLeadingZeros(i)) - 1;

        System.out.println("Сгенерированное число: " + i);
        System.out.println("Номер старшего бита числа " + i + " равен " + n);


        ArrayList<Integer> m1 = new ArrayList<>();


        for (int j = i; j < max; j++) {
            if (j % n == 0) {
                m1.add(j);
            }
        }
        System.out.println("Кратные n числа:" + m1);

        ArrayList<Integer> m2 = new ArrayList<>();


        for (int j = min; j < i; j++) {
            if (j % n != 0) {
                m2.add(j);
            }
        }
        System.out.println("Некратные n числа:" + m2);
    }
}





