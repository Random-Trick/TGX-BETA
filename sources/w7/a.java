package w7;

import java.util.Objects;
import javax.annotation.Nonnull;

public final class a extends f {
    public final String f25803a;
    public final String f25804b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f25803a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f25804b = str2;
    }

    @Override
    @Nonnull
    public String b() {
        return this.f25803a;
    }

    @Override
    @Nonnull
    public String c() {
        return this.f25804b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f25803a.equals(fVar.b()) && this.f25804b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f25803a.hashCode() ^ 1000003) * 1000003) ^ this.f25804b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f25803a + ", version=" + this.f25804b + "}";
    }
}
