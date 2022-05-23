package y;

import android.util.Size;
import java.util.Objects;

public final class f extends h2 {
    public final Size f26295a;
    public final Size f26296b;
    public final Size f26297c;

    public f(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f26295a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f26296b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f26297c = size3;
    }

    @Override
    public Size b() {
        return this.f26295a;
    }

    @Override
    public Size c() {
        return this.f26296b;
    }

    @Override
    public Size d() {
        return this.f26297c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f26295a.equals(h2Var.b()) && this.f26296b.equals(h2Var.c()) && this.f26297c.equals(h2Var.d());
    }

    public int hashCode() {
        return ((((this.f26295a.hashCode() ^ 1000003) * 1000003) ^ this.f26296b.hashCode()) * 1000003) ^ this.f26297c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f26295a + ", previewSize=" + this.f26296b + ", recordSize=" + this.f26297c + "}";
    }
}
