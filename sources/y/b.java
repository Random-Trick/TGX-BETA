package y;

import java.util.Objects;
import y.n0;

public final class b<T> extends n0.a<T> {
    public final String f26250a;
    public final Class<T> f26251b;
    public final Object f26252c;

    public b(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f26250a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f26251b = cls;
        this.f26252c = obj;
    }

    @Override
    public String c() {
        return this.f26250a;
    }

    @Override
    public Object d() {
        return this.f26252c;
    }

    @Override
    public Class<T> e() {
        return this.f26251b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0.a)) {
            return false;
        }
        n0.a aVar = (n0.a) obj;
        if (this.f26250a.equals(aVar.c()) && this.f26251b.equals(aVar.e())) {
            Object obj2 = this.f26252c;
            if (obj2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f26250a.hashCode() ^ 1000003) * 1000003) ^ this.f26251b.hashCode()) * 1000003;
        Object obj = this.f26252c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f26250a + ", valueClass=" + this.f26251b + ", token=" + this.f26252c + "}";
    }
}
