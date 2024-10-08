package chap_07.camera;

public class ActionCam extends Camera{
    public final String lens = "광곽렌즈";
    public ActionCam() {
        super("액션 카메라");
    }
    public void makeVideo(){
        System.out.println(this.name +" : "+ this.lens + " : 멋진 비디오 제작");
    }
}
