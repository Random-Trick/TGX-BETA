package f9;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.util.Log;
import i9.c;
import i9.d;
import ja.d0;
import ja.i;
import java.util.Iterator;
import ra.g;
import ra.k;

public class b {
    public static final a f11865a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public final i9.a a(c cVar, int i10, boolean z10) {
        k.e(cVar, "display");
        i9.a[] aVarArr = new i9.a[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(cVar.a(), b(i10, z10), 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eglChooseConfig) {
            Iterator<Integer> it = i.r(aVarArr).iterator();
            while (it.hasNext()) {
                int d10 = ((d0) it).d();
                EGLConfig eGLConfig = eGLConfigArr[d10];
                aVarArr[d10] = eGLConfig != null ? new i9.a(eGLConfig) : null;
            }
        }
        if (eglChooseConfig) {
            return aVarArr[0];
        }
        Log.w("EglConfigChooser", "Unable to find RGB8888 / " + i10 + " EGLConfig");
        return null;
    }

    public final int[] b(int i10, boolean z10) {
        int i11;
        if (i10 >= 3) {
            i11 = d.i() | d.j();
        } else {
            i11 = d.i();
        }
        int[] iArr = new int[15];
        iArr[0] = d.l();
        iArr[1] = 8;
        iArr[2] = d.d();
        iArr[3] = 8;
        iArr[4] = d.b();
        iArr[5] = 8;
        iArr[6] = d.a();
        iArr[7] = 8;
        iArr[8] = d.o();
        iArr[9] = d.p() | d.k();
        iArr[10] = d.m();
        iArr[11] = i11;
        iArr[12] = z10 ? 12610 : d.e();
        iArr[13] = z10 ? 1 : 0;
        iArr[14] = d.e();
        return iArr;
    }
}
