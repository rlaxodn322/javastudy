package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        int[] i = new int[3];
        System.out.println(i[0]);
        double[] d = new double[3];
        System.out.println(d[0]);
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] camera = new Camera[3];
        System.out.println(camera[0]==null);
    }
}
