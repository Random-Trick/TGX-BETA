package p255s;

import android.util.Size;
import java.util.Objects;
import p255s.C8474g0;
import p336y.C10200b2;

public final class C8442b extends C8474g0.AbstractC8484h {
    public final String f27411a;
    public final Class<?> f27412b;
    public final C10200b2 f27413c;
    public final Size f27414d;

    public C8442b(String str, Class<?> cls, C10200b2 b2Var, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f27411a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f27412b = cls;
        Objects.requireNonNull(b2Var, "Null sessionConfig");
        this.f27413c = b2Var;
        this.f27414d = size;
    }

    @Override
    public C10200b2 mo12327c() {
        return this.f27413c;
    }

    @Override
    public Size mo12326d() {
        return this.f27414d;
    }

    @Override
    public String mo12325e() {
        return this.f27411a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8474g0.AbstractC8484h)) {
            return false;
        }
        C8474g0.AbstractC8484h hVar = (C8474g0.AbstractC8484h) obj;
        if (this.f27411a.equals(hVar.mo12325e()) && this.f27412b.equals(hVar.mo12324f()) && this.f27413c.equals(hVar.mo12327c())) {
            Size size = this.f27414d;
            if (size == null) {
                if (hVar.mo12326d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.mo12326d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class<?> mo12324f() {
        return this.f27412b;
    }

    public int hashCode() {
        int hashCode = (((((this.f27411a.hashCode() ^ 1000003) * 1000003) ^ this.f27412b.hashCode()) * 1000003) ^ this.f27413c.hashCode()) * 1000003;
        Size size = this.f27414d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f27411a + ", useCaseType=" + this.f27412b + ", sessionConfig=" + this.f27413c + ", surfaceResolution=" + this.f27414d + "}";
    }
}
