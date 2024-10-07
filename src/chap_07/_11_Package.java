package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        System.out.println(random.nextDouble());
        //5.0 ~ 10.0
        double min = 5.0;
        double max = 10.0;

        System.out.println(min + (max - min) * random.nextDouble());

    }
}
