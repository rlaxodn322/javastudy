package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        //접근제어자
        //private : 해당클래스 내에서만 접근 가능
        //public : 모든 클래스에서 접근 가능
        //default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        //protected : 같은 패키지 내에서, 다른 패키지 인 경우 자식 클래스에서 접근 가능
        //모두 바꾸기 => Ctrl + c     Ctrl + r
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";

        //b1.resolution = "UHD";
        b1.color = "블랙";
        b1.setPrice(200000);

        System.out.println(b1.resolution);
        System.out.println(b1.getPrice());
        System.out.println("---------------------");
        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setColor("빨간색");
        b2.setPrice(-5000);
        // b2.setResolution("");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution() );
        System.out.println("이름 : " + b2.getModelName() );
        System.out.println("색상 : " + b2.getColor());
    }
}
