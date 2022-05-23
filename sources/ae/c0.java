package ae;

import be.a;
import be.c;
import be.d;
import be.e;
import be.f;
import be.g;
import be.h;
import be.j;
import be.k;
import be.l;
import he.i;
import org.thunderdog.challegram.R;

public class c0 {
    public static p[] f826a;

    public static p a(int i10) {
        if (i10 > 0) {
            if (f826a == null) {
                synchronized (c0.class) {
                    if (f826a == null) {
                        f826a = new p[11];
                    }
                }
            }
            int i11 = i10 - 1;
            p pVar = f826a[i11];
            if (pVar != null) {
                return pVar;
            }
            p h10 = h(null, i10);
            f826a[i11] = h10;
            return h10;
        }
        throw new IllegalArgumentException("themeId == " + i10);
    }

    public static int b(int i10, int i11) {
        if (i10 > -2) {
            return d(i10, true).e(i11);
        }
        return i.c2().y0(z.V(i10), i11);
    }

    public static String c(int i10) {
        if (i10 > -2) {
            return d(i10, true).b();
        }
        String C0 = i.c2().C0(z.V(i10));
        return C0 != null ? C0 : h.l((int) f(i10, R.id.theme_property_wallpaperId));
    }

    public static p d(int i10, boolean z10) {
        return e(i.c2(), i10, z10);
    }

    public static p e(i iVar, int i10, boolean z10) {
        return i10 > -2 ? a(i10) : h(iVar, i10);
    }

    public static float f(int i10, int i11) {
        return g(i.c2(), i10, i11);
    }

    public static float g(i iVar, int i10, int i11) {
        if (i10 > -2) {
            return e(iVar, i10, true).d(i11);
        }
        return iVar.B0(z.V(i10), i11);
    }

    public static p h(i iVar, int i10) {
        switch (i10) {
            case -1:
            case 0:
                break;
            case 1:
                return new e();
            case 2:
                return new g();
            case 3:
                return new a();
            case 4:
                return new l();
            case 5:
                return new k();
            case 6:
                return new be.i();
            case 7:
                return new f();
            case 8:
                return new j();
            case 9:
                return new d();
            case 10:
                return new h();
            case 11:
                return new c();
            default:
                int V = z.V(i10);
                if (V > 0) {
                    return iVar.m2(V);
                }
                break;
        }
        throw new IllegalArgumentException("themeId == " + i10);
    }
}
