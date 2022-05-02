package p301v7;

import java.util.Objects;
import javax.annotation.Nonnull;

public final class C9873a extends AbstractC9878f {
    public final String f32158a;
    public final String f32159b;

    public C9873a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f32158a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f32159b = str2;
    }

    @Override
    @Nonnull
    public String mo6702b() {
        return this.f32158a;
    }

    @Override
    @Nonnull
    public String mo6701c() {
        return this.f32159b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9878f)) {
            return false;
        }
        AbstractC9878f fVar = (AbstractC9878f) obj;
        return this.f32158a.equals(fVar.mo6702b()) && this.f32159b.equals(fVar.mo6701c());
    }

    public int hashCode() {
        return ((this.f32158a.hashCode() ^ 1000003) * 1000003) ^ this.f32159b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f32158a + ", version=" + this.f32159b + "}";
    }
}
