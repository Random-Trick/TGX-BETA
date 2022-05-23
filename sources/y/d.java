package y;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;

public final class d extends u1 {
    public final Surface f26277a;
    public final Size f26278b;
    public final int f26279c;

    public d(Surface surface, Size size, int i10) {
        Objects.requireNonNull(surface, "Null surface");
        this.f26277a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f26278b = size;
        this.f26279c = i10;
    }

    @Override
    public int b() {
        return this.f26279c;
    }

    @Override
    public Size c() {
        return this.f26278b;
    }

    @Override
    public Surface d() {
        return this.f26277a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f26277a.equals(u1Var.d()) && this.f26278b.equals(u1Var.c()) && this.f26279c == u1Var.b();
    }

    public int hashCode() {
        return ((((this.f26277a.hashCode() ^ 1000003) * 1000003) ^ this.f26278b.hashCode()) * 1000003) ^ this.f26279c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f26277a + ", size=" + this.f26278b + ", imageFormat=" + this.f26279c + "}";
    }
}
