package chap_06;

public class _02_Parameter {
    public static void power(int number, int two){
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
        int result2 = number + two;
        System.out.println(number +"와 two를 더하면 " + result2);
    }
    public static void powerByExp(int number, int number2){
        int result =1;
        for (int i = 0; i < number2; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + number2 + " 승은" + result);
    }
    public static void main(String[] args) {
    power(2, 5);
    powerByExp(2,4);
    }
}
