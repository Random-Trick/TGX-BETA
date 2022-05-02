package p359z7;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p178m7.AbstractC6794b;

public class C11426c {
    public final Map<Class<? extends AbstractC11425b>, AbstractC6794b<Object>> f36383a = new HashMap();

    public static class C11427a {
        public final Class<? extends AbstractC11425b> f36384a;
        public final AbstractC6794b<Object> f36385b;

        public <RemoteT extends AbstractC11425b> C11427a(@RecentlyNonNull Class<RemoteT> cls, @RecentlyNonNull AbstractC6794b<Object> bVar) {
            this.f36384a = cls;
            this.f36385b = bVar;
        }

        public final AbstractC6794b<Object> m668a() {
            return this.f36385b;
        }

        public final Class<? extends AbstractC11425b> m667b() {
            return this.f36384a;
        }
    }

    public C11426c(@RecentlyNonNull Set<C11427a> set) {
        for (C11427a aVar : set) {
            this.f36383a.put(aVar.m667b(), aVar.m668a());
        }
    }
}
