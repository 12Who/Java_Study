package test;

public class test3_7_3 {
    public static void main(String[] args) {
        int x = 40, y = 50, z = 60;
        int max = x >= y ? x : y;
        max = max >= z ? max : z;
        System.out.println(max);
    }
}
