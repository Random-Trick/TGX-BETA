package bc;

import hc.g;
import org.thunderdog.challegram.Log;
import ra.k;
import ub.v;

public final class a {
    public static final C0058a f4088c = new C0058a(null);
    public long f4089a = (long) Log.TAG_PAINT;
    public final g f4090b;

    public static final class C0058a {
        public C0058a() {
        }

        public C0058a(ra.g gVar) {
            this();
        }
    }

    public a(g gVar) {
        k.e(gVar, "source");
        this.f4090b = gVar;
    }

    public final v a() {
        v.a aVar = new v.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.d();
            }
            aVar.b(b10);
        }
    }

    public final String b() {
        String I = this.f4090b.I(this.f4089a);
        this.f4089a -= I.length();
        return I;
    }
}
