package ua.com.hrv;

public class Main {

    public static void main(String[] args) {

        byte a = 1;
        short b = 2;
        int c = 3;
        double d = 4.1;
        float e = 5.5F;
        long f = 6L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        int[] arr = {1, 33, 4, 78, 6, 7, 22, 7, 65, 11};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Максимальне значення масиву - " + " " + max);

        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            min = Math.min(min, arr[j]);
            System.out.print(arr[j] + ", ");
        }
        System.out.println(" ");
        System.out.println("Мінімальне значення масиву - " + " " + min);

        System.out.println("Hello world");
    }
}
