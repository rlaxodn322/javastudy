package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
