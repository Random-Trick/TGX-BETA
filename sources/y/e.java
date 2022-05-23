package y;

import java.util.Objects;
import y.g2;

public final class e extends g2 {
    public final g2.b f26284a;
    public final g2.a f26285b;

    public e(g2.b bVar, g2.a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f26284a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f26285b = aVar;
    }

    @Override
    public g2.a b() {
        return this.f26285b;
    }

    @Override
    public g2.b c() {
        return this.f26284a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f26284a.equals(g2Var.c()) && this.f26285b.equals(g2Var.b());
    }

    public int hashCode() {
        return ((this.f26284a.hashCode() ^ 1000003) * 1000003) ^ this.f26285b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f26284a + ", configSize=" + this.f26285b + "}";
    }
}
