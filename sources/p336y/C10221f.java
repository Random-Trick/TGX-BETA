package p336y;

import android.util.Size;
import java.util.Objects;

public final class C10221f extends AbstractC10238h2 {
    public final Size f32995a;
    public final Size f32996b;
    public final Size f32997c;

    public C10221f(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f32995a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f32996b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f32997c = size3;
    }

    @Override
    public Size mo5672b() {
        return this.f32995a;
    }

    @Override
    public Size mo5671c() {
        return this.f32996b;
    }

    @Override
    public Size mo5670d() {
        return this.f32997c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10238h2)) {
            return false;
        }
        AbstractC10238h2 h2Var = (AbstractC10238h2) obj;
        return this.f32995a.equals(h2Var.mo5672b()) && this.f32996b.equals(h2Var.mo5671c()) && this.f32997c.equals(h2Var.mo5670d());
    }

    public int hashCode() {
        return ((((this.f32995a.hashCode() ^ 1000003) * 1000003) ^ this.f32996b.hashCode()) * 1000003) ^ this.f32997c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f32995a + ", previewSize=" + this.f32996b + ", recordSize=" + this.f32997c + "}";
    }
}
