package chap_07;



public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    static int counter = 0;
    static boolean canAutoReport = false;
    
    BlackBox(){
//        this.serialNumber = ++counter;
//        System.out.println("생성자 호출" + serialNumber);
    }
    BlackBox(String modelName, String resolution, int price, String color){
//        this();
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;

    }
    void autoReport(){
         if(canAutoReport){
             System.out.println("충돌 감지되어 신고합니다.");
         }else{
             System.out.println("자동 신고 지원 x");
         }
    }
    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity +"GB입니다.");
    }
    int getVideoFileCount (int type){
        if(type ==1){
            return 9;
        }else if(type==2){
            return 1;
        }
        return 10;
    }
    void record (boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화 시작");
        if(showDateTime){
            System.out.println("영상에 날짜정보 표시");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보 표시");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record(){
        record(true, true, 20);
    }
    static void callServiceCenter(){
        System.out.println("서비스 센터(1577-1999)로 연결합니다.");
        canAutoReport = true;

        String s = String.valueOf(123);
    }


     void appendModelName() {
         this.modelName += "(최신형)";
    }

    String getModelName(){
        return modelName;
    }
    void setModelName(String modelName){
        this.modelName = modelName;
    }
    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요.";
        }
        return resolution;

    }
    void setResolution(String resolution){
        this.resolution = resolution;
    }

    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }

    int getPrice(){
        return price;
    }
    void setPrice(int price){
        if(price<100000){
            this.price = 100000;
        }else{
            this.price = price;
        }
    }


}
