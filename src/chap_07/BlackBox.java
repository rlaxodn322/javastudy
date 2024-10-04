package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false;

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


}
