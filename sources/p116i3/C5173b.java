package p116i3;

import java.util.Objects;
import p018b3.AbstractC1150h;
import p018b3.AbstractC1159m;

public final class C5173b extends AbstractC5196i {
    public final long f17294a;
    public final AbstractC1159m f17295b;
    public final AbstractC1150h f17296c;

    public C5173b(long j, AbstractC1159m mVar, AbstractC1150h hVar) {
        this.f17294a = j;
        Objects.requireNonNull(mVar, "Null transportContext");
        this.f17295b = mVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f17296c = hVar;
    }

    @Override
    public AbstractC1150h mo23624b() {
        return this.f17296c;
    }

    @Override
    public long mo23623c() {
        return this.f17294a;
    }

    @Override
    public AbstractC1159m mo23622d() {
        return this.f17295b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5196i)) {
            return false;
        }
        AbstractC5196i iVar = (AbstractC5196i) obj;
        return this.f17294a == iVar.mo23623c() && this.f17295b.equals(iVar.mo23622d()) && this.f17296c.equals(iVar.mo23624b());
    }

    public int hashCode() {
        long j = this.f17294a;
        return this.f17296c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17295b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17294a + ", transportContext=" + this.f17295b + ", event=" + this.f17296c + "}";
    }
}
