package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
//        for (String a : args){
//            System.out.println(a);
//        }
        if(args.length==1){
            switch (args[0]){
                case "1" :
                    System.out.println("도서 메뉴 조회");
                    break;
                case "2":
                    System.out.println("도서 대출 조회");
                    break;
                case "3":
                    System.out.println("도서 반납 조회");
                     break;
                default:
                    System.out.println("잘못입력");
            }
        }else{
            System.out.println("사용법은 1~3 입력");
        }
    }
}
