package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.record(false, true, 5);
        System.out.println();
        b1.record(true, true, 10);
        System.out.println();
        b1.record(false, false, 20);
        System.out.println();
        b1.record();
    }
}
