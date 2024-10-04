package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent){
        int result =1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getPower(2));
        System.out.println(getPower(4));

        System.out.println(getPowerByExp(2, 6));
        System.out.println(getPowerByExp(1,2));
    }
}
