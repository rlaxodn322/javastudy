package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.color = "black";
        b1.price = 200000;
        b1.resolution="FHD";

        System.out.println(b1.modelName);
        System.out.println(b1.color);
        System.out.println(b1.price);
        System.out.println(b1.resolution);

        System.out.println();

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.color = "white";
        b2.price = 300000;
        b2.resolution="UHD";

        System.out.println(b2.modelName);
        System.out.println(b2.color);
        System.out.println(b2.price);
        System.out.println(b2.resolution);
    }
}
