package p306w;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import p240r.C8333a;
import p293v.C9814i;
import p293v.C9819n;

public class C9928f {
    @SuppressLint({"NewApi"})
    public void m6472a(int i, C8333a.C8334a aVar) {
        if (((C9819n) C9814i.m6817a(C9819n.class)) != null) {
            if (i == 0) {
                aVar.m12790e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i == 1) {
                aVar.m12790e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }
}
