package p336y;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;

public final class C10213d extends AbstractC10303u1 {
    public final Surface f32977a;
    public final Size f32978b;
    public final int f32979c;

    public C10213d(Surface surface, Size size, int i) {
        Objects.requireNonNull(surface, "Null surface");
        this.f32977a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f32978b = size;
        this.f32979c = i;
    }

    @Override
    public int mo5518b() {
        return this.f32979c;
    }

    @Override
    public Size mo5517c() {
        return this.f32978b;
    }

    @Override
    public Surface mo5516d() {
        return this.f32977a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10303u1)) {
            return false;
        }
        AbstractC10303u1 u1Var = (AbstractC10303u1) obj;
        return this.f32977a.equals(u1Var.mo5516d()) && this.f32978b.equals(u1Var.mo5517c()) && this.f32979c == u1Var.mo5518b();
    }

    public int hashCode() {
        return ((((this.f32977a.hashCode() ^ 1000003) * 1000003) ^ this.f32978b.hashCode()) * 1000003) ^ this.f32979c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f32977a + ", size=" + this.f32978b + ", imageFormat=" + this.f32979c + "}";
    }
}
