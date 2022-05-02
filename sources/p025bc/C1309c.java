package p025bc;

import p095gc.C4552h;
import qa.C8294g;
import qa.C8298k;

public final class C1309c {
    public static final C4552h f4722d;
    public static final C4552h f4723e;
    public static final C4552h f4724f;
    public static final C4552h f4725g;
    public static final C4552h f4726h;
    public static final C4552h f4727i;
    public static final C1310a f4728j = new C1310a(null);
    public final int f4729a;
    public final C4552h f4730b;
    public final C4552h f4731c;

    public static final class C1310a {
        public C1310a() {
        }

        public C1310a(C8294g gVar) {
            this();
        }
    }

    static {
        C4552h.C4553a aVar = C4552h.f14973N;
        f4722d = aVar.m27399c(":");
        f4723e = aVar.m27399c(":status");
        f4724f = aVar.m27399c(":method");
        f4725g = aVar.m27399c(":path");
        f4726h = aVar.m27399c(":scheme");
        f4727i = aVar.m27399c(":authority");
    }

    public C1309c(C4552h hVar, C4552h hVar2) {
        C8298k.m12934e(hVar, "name");
        C8298k.m12934e(hVar2, "value");
        this.f4730b = hVar;
        this.f4731c = hVar2;
        this.f4729a = hVar.m27404r() + 32 + hVar2.m27404r();
    }

    public final C4552h m37778a() {
        return this.f4730b;
    }

    public final C4552h m37777b() {
        return this.f4731c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1309c)) {
            return false;
        }
        C1309c cVar = (C1309c) obj;
        return C8298k.m12937b(this.f4730b, cVar.f4730b) && C8298k.m12937b(this.f4731c, cVar.f4731c);
    }

    public int hashCode() {
        C4552h hVar = this.f4730b;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C4552h hVar2 = this.f4731c;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f4730b.m27402u() + ": " + this.f4731c.m27402u();
    }

    public C1309c(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: p025bc.C1309c.<init>(java.lang.String, java.lang.String):void");
    }

    public C1309c(C4552h hVar, String str) {
        this(hVar, C4552h.f14973N.m27399c(str));
        C8298k.m12934e(hVar, "name");
        C8298k.m12934e(str, "value");
    }
}
