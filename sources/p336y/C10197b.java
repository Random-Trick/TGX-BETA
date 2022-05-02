package p336y;

import java.util.Objects;
import p336y.AbstractC10268n0;

public final class C10197b<T> extends AbstractC10268n0.AbstractC10269a<T> {
    public final String f32941a;
    public final Class<T> f32942b;
    public final Object f32943c;

    public C10197b(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f32941a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f32942b = cls;
        this.f32943c = obj;
    }

    @Override
    public String mo5580c() {
        return this.f32941a;
    }

    @Override
    public Object mo5579d() {
        return this.f32943c;
    }

    @Override
    public Class<T> mo5578e() {
        return this.f32942b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10268n0.AbstractC10269a)) {
            return false;
        }
        AbstractC10268n0.AbstractC10269a aVar = (AbstractC10268n0.AbstractC10269a) obj;
        if (this.f32941a.equals(aVar.mo5580c()) && this.f32942b.equals(aVar.mo5578e())) {
            Object obj2 = this.f32943c;
            if (obj2 == null) {
                if (aVar.mo5579d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo5579d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f32941a.hashCode() ^ 1000003) * 1000003) ^ this.f32942b.hashCode()) * 1000003;
        Object obj = this.f32943c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f32941a + ", valueClass=" + this.f32942b + ", token=" + this.f32943c + "}";
    }
}
