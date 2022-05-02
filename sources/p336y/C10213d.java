package p336y;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;

public final class C10213d extends AbstractC10303u1 {
    public final Surface f32974a;
    public final Size f32975b;
    public final int f32976c;

    public C10213d(Surface surface, Size size, int i) {
        Objects.requireNonNull(surface, "Null surface");
        this.f32974a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f32975b = size;
        this.f32976c = i;
    }

    @Override
    public int mo5518b() {
        return this.f32976c;
    }

    @Override
    public Size mo5517c() {
        return this.f32975b;
    }

    @Override
    public Surface mo5516d() {
        return this.f32974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10303u1)) {
            return false;
        }
        AbstractC10303u1 u1Var = (AbstractC10303u1) obj;
        return this.f32974a.equals(u1Var.mo5516d()) && this.f32975b.equals(u1Var.mo5517c()) && this.f32976c == u1Var.mo5518b();
    }

    public int hashCode() {
        return ((((this.f32974a.hashCode() ^ 1000003) * 1000003) ^ this.f32975b.hashCode()) * 1000003) ^ this.f32976c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f32974a + ", size=" + this.f32975b + ", imageFormat=" + this.f32976c + "}";
    }
}
