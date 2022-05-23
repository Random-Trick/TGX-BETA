package s;

import android.util.Size;
import java.util.Objects;
import s.g0;
import y.b2;

public final class b extends g0.h {
    public final String f21954a;
    public final Class<?> f21955b;
    public final b2 f21956c;
    public final Size f21957d;

    public b(String str, Class<?> cls, b2 b2Var, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f21954a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f21955b = cls;
        Objects.requireNonNull(b2Var, "Null sessionConfig");
        this.f21956c = b2Var;
        this.f21957d = size;
    }

    @Override
    public b2 c() {
        return this.f21956c;
    }

    @Override
    public Size d() {
        return this.f21957d;
    }

    @Override
    public String e() {
        return this.f21954a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.h)) {
            return false;
        }
        g0.h hVar = (g0.h) obj;
        if (this.f21954a.equals(hVar.e()) && this.f21955b.equals(hVar.f()) && this.f21956c.equals(hVar.c())) {
            Size size = this.f21957d;
            if (size == null) {
                if (hVar.d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class<?> f() {
        return this.f21955b;
    }

    public int hashCode() {
        int hashCode = (((((this.f21954a.hashCode() ^ 1000003) * 1000003) ^ this.f21955b.hashCode()) * 1000003) ^ this.f21956c.hashCode()) * 1000003;
        Size size = this.f21957d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f21954a + ", useCaseType=" + this.f21955b + ", sessionConfig=" + this.f21956c + ", surfaceResolution=" + this.f21957d + "}";
    }
}
