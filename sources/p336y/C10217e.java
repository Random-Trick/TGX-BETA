package p336y;

import java.util.Objects;
import p336y.AbstractC10231g2;

public final class C10217e extends AbstractC10231g2 {
    public final AbstractC10231g2.EnumC10233b f32981a;
    public final AbstractC10231g2.EnumC10232a f32982b;

    public C10217e(AbstractC10231g2.EnumC10233b bVar, AbstractC10231g2.EnumC10232a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f32981a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f32982b = aVar;
    }

    @Override
    public AbstractC10231g2.EnumC10232a mo5678b() {
        return this.f32982b;
    }

    @Override
    public AbstractC10231g2.EnumC10233b mo5677c() {
        return this.f32981a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10231g2)) {
            return false;
        }
        AbstractC10231g2 g2Var = (AbstractC10231g2) obj;
        return this.f32981a.equals(g2Var.mo5677c()) && this.f32982b.equals(g2Var.mo5678b());
    }

    public int hashCode() {
        return ((this.f32981a.hashCode() ^ 1000003) * 1000003) ^ this.f32982b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f32981a + ", configSize=" + this.f32982b + "}";
    }
}
