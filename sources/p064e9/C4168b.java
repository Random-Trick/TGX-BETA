package p064e9;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Log;
import java.util.Iterator;
import p106h9.C5033a;
import p106h9.C5035c;
import p106h9.C5036d;
import p123ia.AbstractC5286d0;
import p123ia.C5296i;
import qa.C8294g;
import qa.C8298k;

public class C4168b {
    public static final C4169a f14069a = new C4169a(null);

    public static final class C4169a {
        public C4169a() {
        }

        public C4169a(C8294g gVar) {
            this();
        }
    }

    public final C5033a m28631a(C5035c cVar, int i, boolean z) {
        C8298k.m12934e(cVar, "display");
        C5033a[] aVarArr = new C5033a[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(cVar.m24240a(), m28630b(i, z), 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eglChooseConfig) {
            Iterator<Integer> it = C5296i.m23389r(aVarArr).iterator();
            while (it.hasNext()) {
                int e = ((AbstractC5286d0) it).mo6206e();
                EGLConfig eGLConfig = eGLConfigArr[e];
                aVarArr[e] = eGLConfig != null ? new C5033a(eGLConfig) : null;
            }
        }
        if (eglChooseConfig) {
            return aVarArr[0];
        }
        Log.w("EglConfigChooser", "Unable to find RGB8888 / " + i + " EGLConfig");
        return null;
    }

    public final int[] m28630b(int i, boolean z) {
        int i2;
        if (i >= 3) {
            i2 = C5036d.m24231i() | C5036d.m24230j();
        } else {
            i2 = C5036d.m24231i();
        }
        int[] iArr = new int[15];
        iArr[0] = C5036d.m24228l();
        iArr[1] = 8;
        iArr[2] = C5036d.m24236d();
        iArr[3] = 8;
        iArr[4] = C5036d.m24238b();
        iArr[5] = 8;
        iArr[6] = C5036d.m24239a();
        iArr[7] = 8;
        iArr[8] = C5036d.m24225o();
        iArr[9] = C5036d.m24224p() | C5036d.m24229k();
        iArr[10] = C5036d.m24227m();
        iArr[11] = i2;
        iArr[12] = z ? 12610 : C5036d.m24235e();
        iArr[13] = z ? 1 : 0;
        iArr[14] = C5036d.m24235e();
        return iArr;
    }
}
