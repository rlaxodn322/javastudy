package chap_07;


public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 =  new BlackBox();
        b1.modelName = "바둑이";
        b1.color = "black";
        b1.resolution = "FHD";
        b1.price = 300000;
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        BlackBox b2 = new BlackBox("하양이", "white", 2000000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);

    }
}
