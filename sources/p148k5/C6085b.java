package p148k5;

import androidx.annotation.RecentlyNonNull;
import p133j5.C5850a;
import p133j5.C5850a.AbstractC5854d;
import p163l5.C6374q;

public final class C6085b<O extends C5850a.AbstractC5854d> {
    public final int f19307a;
    public final C5850a<O> f19308b;
    public final O f19309c;
    public final String f19310d;

    public C6085b(C5850a<O> aVar, O o, String str) {
        this.f19308b = aVar;
        this.f19309c = o;
        this.f19310d = str;
        this.f19307a = C6374q.m20523b(aVar, o, str);
    }

    @RecentlyNonNull
    public static <O extends C5850a.AbstractC5854d> C6085b<O> m21387a(@RecentlyNonNull C5850a<O> aVar, O o, String str) {
        return new C6085b<>(aVar, o, str);
    }

    @RecentlyNonNull
    public final String m21386b() {
        return this.f19308b.m21934d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6085b)) {
            return false;
        }
        C6085b bVar = (C6085b) obj;
        return C6374q.m20524a(this.f19308b, bVar.f19308b) && C6374q.m20524a(this.f19309c, bVar.f19309c) && C6374q.m20524a(this.f19310d, bVar.f19310d);
    }

    public final int hashCode() {
        return this.f19307a;
    }
}
