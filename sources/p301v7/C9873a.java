package p301v7;

import java.util.Objects;
import javax.annotation.Nonnull;

public final class C9873a extends AbstractC9878f {
    public final String f32155a;
    public final String f32156b;

    public C9873a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f32155a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f32156b = str2;
    }

    @Override
    @Nonnull
    public String mo6702b() {
        return this.f32155a;
    }

    @Override
    @Nonnull
    public String mo6701c() {
        return this.f32156b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9878f)) {
            return false;
        }
        AbstractC9878f fVar = (AbstractC9878f) obj;
        return this.f32155a.equals(fVar.mo6702b()) && this.f32156b.equals(fVar.mo6701c());
    }

    public int hashCode() {
        return ((this.f32155a.hashCode() ^ 1000003) * 1000003) ^ this.f32156b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f32155a + ", version=" + this.f32156b + "}";
    }
}
