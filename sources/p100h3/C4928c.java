package p100h3;

import java.util.Map;
import java.util.Objects;
import p100h3.AbstractC4934g;
import p146k3.AbstractC6045a;
import p339y2.EnumC10354d;

public final class C4928c extends AbstractC4934g {
    public final AbstractC6045a f16805a;
    public final Map<EnumC10354d, AbstractC4934g.AbstractC4936b> f16806b;

    public C4928c(AbstractC6045a aVar, Map<EnumC10354d, AbstractC4934g.AbstractC4936b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f16805a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f16806b = map;
    }

    @Override
    public AbstractC6045a mo24432e() {
        return this.f16805a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4934g)) {
            return false;
        }
        AbstractC4934g gVar = (AbstractC4934g) obj;
        return this.f16805a.equals(gVar.mo24432e()) && this.f16806b.equals(gVar.mo24429h());
    }

    @Override
    public Map<EnumC10354d, AbstractC4934g.AbstractC4936b> mo24429h() {
        return this.f16806b;
    }

    public int hashCode() {
        return ((this.f16805a.hashCode() ^ 1000003) * 1000003) ^ this.f16806b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f16805a + ", values=" + this.f16806b + "}";
    }
}
