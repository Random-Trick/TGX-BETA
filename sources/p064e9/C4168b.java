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

    public final C5033a m28633a(C5035c cVar, int i, boolean z) {
        C8298k.m12933e(cVar, "display");
        C5033a[] aVarArr = new C5033a[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(cVar.m24241a(), m28632b(i, z), 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eglChooseConfig) {
            Iterator<Integer> it = C5296i.m23390r(aVarArr).iterator();
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

    public final int[] m28632b(int i, boolean z) {
        int i2;
        if (i >= 3) {
            i2 = C5036d.m24232i() | C5036d.m24231j();
        } else {
            i2 = C5036d.m24232i();
        }
        int[] iArr = new int[15];
        iArr[0] = C5036d.m24229l();
        iArr[1] = 8;
        iArr[2] = C5036d.m24237d();
        iArr[3] = 8;
        iArr[4] = C5036d.m24239b();
        iArr[5] = 8;
        iArr[6] = C5036d.m24240a();
        iArr[7] = 8;
        iArr[8] = C5036d.m24226o();
        iArr[9] = C5036d.m24225p() | C5036d.m24230k();
        iArr[10] = C5036d.m24228m();
        iArr[11] = i2;
        iArr[12] = z ? 12610 : C5036d.m24236e();
        iArr[13] = z ? 1 : 0;
        iArr[14] = C5036d.m24236e();
        return iArr;
    }
}
