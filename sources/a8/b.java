package a8;

import androidx.annotation.RecentlyNonNull;
import b8.l;
import c6.o0;
import c6.p0;
import c8.a;
import java.util.EnumMap;
import java.util.Map;
import m5.q;

public abstract class b {
    public static final Map<a, String> f677d = new EnumMap(a.class);
    @RecentlyNonNull
    public static final Map<a, String> f678e = new EnumMap(a.class);
    public final String f679a;
    public final a f680b;
    public final l f681c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return q.a(this.f679a, bVar.f679a) && q.a(this.f680b, bVar.f680b) && q.a(this.f681c, bVar.f681c);
    }

    public int hashCode() {
        return q.b(this.f679a, this.f680b, this.f681c);
    }

    @RecentlyNonNull
    public String toString() {
        o0 a10 = p0.a("RemoteModel");
        a10.a("modelName", this.f679a);
        a10.a("baseModel", this.f680b);
        a10.a("modelType", this.f681c);
        return a10.toString();
    }
}
