package chap_07.camera;

public class SlowActionCam extends ActionCam{
    public SlowActionCam() {
        this.name =  "슬로우 액션 카메라";
    }

    public void makeVideo(){
        System.out.println(this.name +" : "+ this.lens + " : 멋진 슬로우 모드 비디오 제작");
    }
}
