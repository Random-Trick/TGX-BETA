package p336y;

import android.util.Size;
import java.util.Objects;

public final class C10221f extends AbstractC10238h2 {
    public final Size f32992a;
    public final Size f32993b;
    public final Size f32994c;

    public C10221f(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f32992a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f32993b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f32994c = size3;
    }

    @Override
    public Size mo5672b() {
        return this.f32992a;
    }

    @Override
    public Size mo5671c() {
        return this.f32993b;
    }

    @Override
    public Size mo5670d() {
        return this.f32994c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10238h2)) {
            return false;
        }
        AbstractC10238h2 h2Var = (AbstractC10238h2) obj;
        return this.f32992a.equals(h2Var.mo5672b()) && this.f32993b.equals(h2Var.mo5671c()) && this.f32994c.equals(h2Var.mo5670d());
    }

    public int hashCode() {
        return ((((this.f32992a.hashCode() ^ 1000003) * 1000003) ^ this.f32993b.hashCode()) * 1000003) ^ this.f32994c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f32992a + ", previewSize=" + this.f32993b + ", recordSize=" + this.f32994c + "}";
    }
}
