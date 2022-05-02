package p359z7;

import androidx.annotation.RecentlyNonNull;
import java.util.EnumMap;
import java.util.Map;
import p009a8.EnumC0221l;
import p021b6.C1277o0;
import p021b6.C1279p0;
import p023b8.EnumC1292a;
import p163l5.C6374q;

public abstract class AbstractC11425b {
    public static final Map<EnumC1292a, String> f36378d = new EnumMap(EnumC1292a.class);
    @RecentlyNonNull
    public static final Map<EnumC1292a, String> f36379e = new EnumMap(EnumC1292a.class);
    public final String f36380a;
    public final EnumC1292a f36381b;
    public final EnumC0221l f36382c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11425b)) {
            return false;
        }
        AbstractC11425b bVar = (AbstractC11425b) obj;
        return C6374q.m20524a(this.f36380a, bVar.f36380a) && C6374q.m20524a(this.f36381b, bVar.f36381b) && C6374q.m20524a(this.f36382c, bVar.f36382c);
    }

    public int hashCode() {
        return C6374q.m20523b(this.f36380a, this.f36381b, this.f36382c);
    }

    @RecentlyNonNull
    public String toString() {
        C1277o0 a = C1279p0.m37800a("RemoteModel");
        a.m37802a("modelName", this.f36380a);
        a.m37802a("baseModel", this.f36381b);
        a.m37802a("modelType", this.f36382c);
        return a.toString();
    }
}
