package h7;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {
    public final String f12587a;
    public final Map<Class<?>, Object> f12588b;

    public static final class b {
        public final String f12589a;
        public Map<Class<?>, Object> f12590b = null;

        public b(String str) {
            this.f12589a = str;
        }

        public d a() {
            Map map;
            String str = this.f12589a;
            if (this.f12590b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f12590b));
            }
            return new d(str, map);
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f12590b == null) {
                this.f12590b = new HashMap();
            }
            this.f12590b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.emptyMap());
    }

    public String b() {
        return this.f12587a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f12588b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12587a.equals(dVar.f12587a) && this.f12588b.equals(dVar.f12588b);
    }

    public int hashCode() {
        return (this.f12587a.hashCode() * 31) + this.f12588b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f12587a + ", properties=" + this.f12588b.values() + "}";
    }

    public d(String str, Map<Class<?>, Object> map) {
        this.f12587a = str;
        this.f12588b = map;
    }
}
