package cc;

import hc.h;
import ra.g;
import ra.k;

public final class c {
    public static final h f5031d;
    public static final h f5032e;
    public static final h f5033f;
    public static final h f5034g;
    public static final h f5035h;
    public static final h f5036i;
    public static final a f5037j = new a(null);
    public final int f5038a;
    public final h f5039b;
    public final h f5040c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    static {
        h.a aVar = h.N;
        f5031d = aVar.c(":");
        f5032e = aVar.c(":status");
        f5033f = aVar.c(":method");
        f5034g = aVar.c(":path");
        f5035h = aVar.c(":scheme");
        f5036i = aVar.c(":authority");
    }

    public c(h hVar, h hVar2) {
        k.e(hVar, "name");
        k.e(hVar2, "value");
        this.f5039b = hVar;
        this.f5040c = hVar2;
        this.f5038a = hVar.r() + 32 + hVar2.r();
    }

    public final h a() {
        return this.f5039b;
    }

    public final h b() {
        return this.f5040c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.f5039b, cVar.f5039b) && k.b(this.f5040c, cVar.f5040c);
    }

    public int hashCode() {
        h hVar = this.f5039b;
        int i10 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        h hVar2 = this.f5040c;
        if (hVar2 != null) {
            i10 = hVar2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f5039b.u() + ": " + this.f5040c.u();
    }

    public c(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: cc.c.<init>(java.lang.String, java.lang.String):void");
    }

    public c(h hVar, String str) {
        this(hVar, h.N.c(str));
        k.e(hVar, "name");
        k.e(str, "value");
    }
}
