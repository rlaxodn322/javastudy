package chap_07;


public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 100000;
        //b1.resolution = "UHD";
        b1.color = "블랙";

        b1.price = -5000;
        System.out.println(b1.price);
        System.out.println(b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setColor("빨간색");
        b2.setPrice(511000);
       // b2.setResolution("");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution() );
        System.out.println("이름 : " + b2.getModelName() );
        System.out.println("색상 : " + b2.getColor());
    }
}
