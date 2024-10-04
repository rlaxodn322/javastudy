package chap_01;

public class _07_TypeCastring {
    public static void main(String[] args) {
        //형변환
        //정수형에서 실수
        //실수형에서 정수
        int score = 93;
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d =  98.3;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        String s1 = String.valueOf(93);
        s1 = Integer.toString(931);
        String s2 = String.valueOf(93.3);
        s2 = Double.toString(93.333);
        System.out.println(s1);
        System.out.println(s2);
    }
}
