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
    public static final Map<EnumC1292a, String> f36381d = new EnumMap(EnumC1292a.class);
    @RecentlyNonNull
    public static final Map<EnumC1292a, String> f36382e = new EnumMap(EnumC1292a.class);
    public final String f36383a;
    public final EnumC1292a f36384b;
    public final EnumC0221l f36385c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11425b)) {
            return false;
        }
        AbstractC11425b bVar = (AbstractC11425b) obj;
        return C6374q.m20525a(this.f36383a, bVar.f36383a) && C6374q.m20525a(this.f36384b, bVar.f36384b) && C6374q.m20525a(this.f36385c, bVar.f36385c);
    }

    public int hashCode() {
        return C6374q.m20524b(this.f36383a, this.f36384b, this.f36385c);
    }

    @RecentlyNonNull
    public String toString() {
        C1277o0 a = C1279p0.m37803a("RemoteModel");
        a.m37805a("modelName", this.f36383a);
        a.m37805a("baseModel", this.f36384b);
        a.m37805a("modelType", this.f36385c);
        return a.toString();
    }
}
