package p092g7;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class C4511d {
    public final String f14879a;
    public final Map<Class<?>, Object> f14880b;

    public static final class C4513b {
        public final String f14881a;
        public Map<Class<?>, Object> f14882b = null;

        public C4513b(String str) {
            this.f14881a = str;
        }

        public C4511d m27506a() {
            Map map;
            String str = this.f14881a;
            if (this.f14882b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f14882b));
            }
            return new C4511d(str, map);
        }

        public <T extends Annotation> C4513b m27505b(T t) {
            if (this.f14882b == null) {
                this.f14882b = new HashMap();
            }
            this.f14882b.put(t.annotationType(), t);
            return this;
        }
    }

    public static C4513b m27510a(String str) {
        return new C4513b(str);
    }

    public static C4511d m27507d(String str) {
        return new C4511d(str, Collections.emptyMap());
    }

    public String m27509b() {
        return this.f14879a;
    }

    public <T extends Annotation> T m27508c(Class<T> cls) {
        return (T) this.f14880b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4511d)) {
            return false;
        }
        C4511d dVar = (C4511d) obj;
        return this.f14879a.equals(dVar.f14879a) && this.f14880b.equals(dVar.f14880b);
    }

    public int hashCode() {
        return (this.f14879a.hashCode() * 31) + this.f14880b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f14879a + ", properties=" + this.f14880b.values() + "}";
    }

    public C4511d(String str, Map<Class<?>, Object> map) {
        this.f14879a = str;
        this.f14880b = map;
    }
}
