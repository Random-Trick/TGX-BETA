package ac;

import org.thunderdog.challegram.Log;
import p095gc.AbstractC4551g;
import p278tb.C9122v;
import qa.C8294g;
import qa.C8298k;

public final class C0246a {
    public static final C0247a f750c = new C0247a(null);
    public long f751a = (long) Log.TAG_PAINT;
    public final AbstractC4551g f752b;

    public static final class C0247a {
        public C0247a() {
        }

        public C0247a(C8294g gVar) {
            this();
        }
    }

    public C0246a(AbstractC4551g gVar) {
        C8298k.m12934e(gVar, "source");
        this.f752b = gVar;
    }

    public final C9122v m42019a() {
        C9122v.C9123a aVar = new C9122v.C9123a();
        while (true) {
            String b = m42018b();
            if (b.length() == 0) {
                return aVar.m10365d();
            }
            aVar.m10367b(b);
        }
    }

    public final String m42018b() {
        String H = this.f752b.mo27338H(this.f751a);
        this.f751a -= H.length();
        return H;
    }
}
