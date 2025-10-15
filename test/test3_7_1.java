package test;

public class test3_7_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (i >= 100) {
                int x = i % 10;
                int y = i / 10 % 10;
                int z = i / 100;
                if (i == x*x*x + y*y*y + z*z*z) {
                    System.out.println(i);
                }
            }
        }
    }
}
