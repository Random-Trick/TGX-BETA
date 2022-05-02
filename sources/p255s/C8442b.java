package p255s;

import android.util.Size;
import java.util.Objects;
import p255s.C8474g0;
import p336y.C10200b2;

public final class C8442b extends C8474g0.AbstractC8484h {
    public final String f27408a;
    public final Class<?> f27409b;
    public final C10200b2 f27410c;
    public final Size f27411d;

    public C8442b(String str, Class<?> cls, C10200b2 b2Var, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f27408a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f27409b = cls;
        Objects.requireNonNull(b2Var, "Null sessionConfig");
        this.f27410c = b2Var;
        this.f27411d = size;
    }

    @Override
    public C10200b2 mo12328c() {
        return this.f27410c;
    }

    @Override
    public Size mo12327d() {
        return this.f27411d;
    }

    @Override
    public String mo12326e() {
        return this.f27408a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8474g0.AbstractC8484h)) {
            return false;
        }
        C8474g0.AbstractC8484h hVar = (C8474g0.AbstractC8484h) obj;
        if (this.f27408a.equals(hVar.mo12326e()) && this.f27409b.equals(hVar.mo12325f()) && this.f27410c.equals(hVar.mo12328c())) {
            Size size = this.f27411d;
            if (size == null) {
                if (hVar.mo12327d() == null) {
                    return true;
                }
            } else if (size.equals(hVar.mo12327d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class<?> mo12325f() {
        return this.f27409b;
    }

    public int hashCode() {
        int hashCode = (((((this.f27408a.hashCode() ^ 1000003) * 1000003) ^ this.f27409b.hashCode()) * 1000003) ^ this.f27410c.hashCode()) * 1000003;
        Size size = this.f27411d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f27408a + ", useCaseType=" + this.f27409b + ", sessionConfig=" + this.f27410c + ", surfaceResolution=" + this.f27411d + "}";
    }
}
