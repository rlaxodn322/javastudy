package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        int a= 20;
        int b = 10;
        int c;

        c= a +b;
        System.out.println(c);
        c= a- b;
        System.out.println(c);
        c = a* b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);

        int val;
        val = 10;
        System.out.println(val);
        val++;
        System.out.println(val);
        ++val;
        System.out.println(++val);
        System.out.println(val);
        val = 10;
        System.out.println(++val); //11
        System.out.println(val++); // 11
        System.out.println(val); //12

        int watting = 0;
        System.out.println(watting++); //0
        System.out.println(watting++); //1
        System.out.println(watting); //2
    }
}
