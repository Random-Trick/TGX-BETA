package s;

import androidx.camera.core.t1;
import t.z;
import v.e;
import w.c;
import y.g;

public class d implements g {
    public final boolean f21983a;
    public final int f21984b;
    public final c f21985c;

    public d(String str, z zVar) {
        boolean z10;
        int i10;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            t1.k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z10 = false;
            i10 = -1;
        }
        this.f21983a = z10;
        this.f21984b = i10;
        this.f21985c = new c((e) v.g.a(str, zVar).b(e.class));
    }
}
