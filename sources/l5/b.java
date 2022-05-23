package l5;

import androidx.annotation.RecentlyNonNull;
import k5.a;
import k5.a.d;
import m5.q;

public final class b<O extends a.d> {
    public final int f16021a;
    public final a<O> f16022b;
    public final O f16023c;
    public final String f16024d;

    public b(a<O> aVar, O o10, String str) {
        this.f16022b = aVar;
        this.f16023c = o10;
        this.f16024d = str;
        this.f16021a = q.b(aVar, o10, str);
    }

    @RecentlyNonNull
    public static <O extends a.d> b<O> a(@RecentlyNonNull a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    @RecentlyNonNull
    public final String b() {
        return this.f16022b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q.a(this.f16022b, bVar.f16022b) && q.a(this.f16023c, bVar.f16023c) && q.a(this.f16024d, bVar.f16024d);
    }

    public final int hashCode() {
        return this.f16021a;
    }
}
