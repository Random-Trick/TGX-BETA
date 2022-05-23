package a8;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n7.b;

public class c {
    public final Map<Class<? extends b>, b<Object>> f682a = new HashMap();

    public static class a {
        public final Class<? extends b> f683a;
        public final b<Object> f684b;

        public <RemoteT extends b> a(@RecentlyNonNull Class<RemoteT> cls, @RecentlyNonNull b<Object> bVar) {
            this.f683a = cls;
            this.f684b = bVar;
        }

        public final b<Object> a() {
            return this.f684b;
        }

        public final Class<? extends b> b() {
            return this.f683a;
        }
    }

    public c(@RecentlyNonNull Set<a> set) {
        for (a aVar : set) {
            this.f682a.put(aVar.b(), aVar.a());
        }
    }
}
