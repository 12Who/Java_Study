package test;

public class test3_7_6 {
    public static void main(String[] args) {
        int i = 13, sum = 0, count = 0;
        while (i <= 1003) {
            if (count % 2 == 0) {
                sum += i;
                i += 10;
                count++;
            }
            else {
                sum -= i;
                i += 10;
                count++;
            }
        }
        System.out.println(sum);
    }
}
