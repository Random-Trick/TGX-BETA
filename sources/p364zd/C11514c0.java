package p364zd;

import ae.C0284a;
import ae.C0286c;
import ae.C0287d;
import ae.C0288e;
import ae.C0289f;
import ae.C0290g;
import ae.C0291h;
import ae.C0292i;
import ae.C0293j;
import ae.C0294k;
import ae.C0295l;
import ge.C4868i;
import org.thunderdog.challegram.R;

public class C11514c0 {
    public static AbstractC11531p[] f36558a;

    public static AbstractC11531p m348a(int i) {
        if (i > 0) {
            if (f36558a == null) {
                synchronized (C11514c0.class) {
                    if (f36558a == null) {
                        f36558a = new AbstractC11531p[11];
                    }
                }
            }
            int i2 = i - 1;
            AbstractC11531p pVar = f36558a[i2];
            if (pVar != null) {
                return pVar;
            }
            AbstractC11531p h = m341h(null, i);
            f36558a[i2] = h;
            return h;
        }
        throw new IllegalArgumentException("themeId == " + i);
    }

    public static int m347b(int i, int i2) {
        if (i > -2) {
            return m345d(i, true).mo92e(i2);
        }
        return C4868i.m24726c2().m24555y0(C11541z.m41T(i), i2);
    }

    public static String m346c(int i) {
        if (i > -2) {
            return m345d(i, true).mo95b();
        }
        String C0 = C4868i.m24726c2().m24912C0(C11541z.m41T(i));
        return C0 != null ? C0 : C11520h.m288l((int) m343f(i, R.id.theme_property_wallpaperId));
    }

    public static AbstractC11531p m345d(int i, boolean z) {
        return m344e(C4868i.m24726c2(), i, z);
    }

    public static AbstractC11531p m344e(C4868i iVar, int i, boolean z) {
        return i > -2 ? m348a(i) : m341h(iVar, i);
    }

    public static float m343f(int i, int i2) {
        return m342g(C4868i.m24726c2(), i, i2);
    }

    public static float m342g(C4868i iVar, int i, int i2) {
        if (i > -2) {
            return m344e(iVar, i, true).mo93d(i2);
        }
        return iVar.m24919B0(C11541z.m41T(i), i2);
    }

    public static AbstractC11531p m341h(C4868i iVar, int i) {
        switch (i) {
            case -1:
            case 0:
                break;
            case 1:
                return new C0288e();
            case 2:
                return new C0290g();
            case 3:
                return new C0284a();
            case 4:
                return new C0295l();
            case 5:
                return new C0294k();
            case 6:
                return new C0292i();
            case 7:
                return new C0289f();
            case 8:
                return new C0293j();
            case 9:
                return new C0287d();
            case 10:
                return new C0291h();
            case 11:
                return new C0286c();
            default:
                int T = C11541z.m41T(i);
                if (T > 0) {
                    return iVar.m24646m2(T);
                }
                break;
        }
        throw new IllegalArgumentException("themeId == " + i);
    }
}
