package p126j$.util.stream;

import java.util.Comparator;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5522d;
import p126j$.util.function.AbstractC5542x;

public abstract class AbstractC5715h3 implements AbstractC5468G {
    final boolean f18380a;
    final AbstractC5572D0 f18381b;
    private AbstractC5542x f18382c;
    AbstractC5468G f18383d;
    AbstractC5759q2 f18384e;
    AbstractC5522d f18385f;
    long f18386g;
    AbstractC5696e f18387h;
    boolean f18388i;

    public AbstractC5715h3(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        this.f18381b = d0;
        this.f18382c = null;
        this.f18383d = g;
        this.f18380a = z;
    }

    public AbstractC5715h3(AbstractC5572D0 d0, AbstractC5542x xVar, boolean z) {
        this.f18381b = d0;
        this.f18382c = xVar;
        this.f18383d = null;
        this.f18380a = z;
    }

    private boolean m22254c() {
        boolean z;
        while (this.f18387h.count() == 0) {
            if (!this.f18384e.mo22131t()) {
                C5681b bVar = (C5681b) this.f18385f;
                switch (bVar.f18311a) {
                    case 4:
                        C5760q3 q3Var = (C5760q3) bVar.f18312b;
                        z = q3Var.f18383d.mo22125a(q3Var.f18384e);
                        break;
                    case 5:
                        C5770s3 s3Var = (C5770s3) bVar.f18312b;
                        z = s3Var.f18383d.mo22125a(s3Var.f18384e);
                        break;
                    case 6:
                        C5780u3 u3Var = (C5780u3) bVar.f18312b;
                        z = u3Var.f18383d.mo22125a(u3Var.f18384e);
                        break;
                    default:
                        C5615L3 l3 = (C5615L3) bVar.f18312b;
                        z = l3.f18383d.mo22125a(l3.f18384e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.f18388i) {
                return false;
            }
            this.f18384e.mo22133h();
            this.f18388i = true;
        }
        return true;
    }

    public final boolean m22255b() {
        AbstractC5696e eVar = this.f18387h;
        boolean z = false;
        if (eVar != null) {
            long j = this.f18386g + 1;
            this.f18386g = j;
            if (j < eVar.count()) {
                z = true;
            }
            if (z) {
                return z;
            }
            this.f18386g = 0L;
            this.f18387h.clear();
            return m22254c();
        } else if (this.f18388i) {
            return false;
        } else {
            m22253d();
            mo22168e();
            this.f18386g = 0L;
            this.f18384e.mo22132j(this.f18383d.getExactSizeIfKnown());
            return m22254c();
        }
    }

    @Override
    public final int characteristics() {
        m22253d();
        int g = EnumC5705f3.m22263g(this.f18381b.mo22302Z()) & EnumC5705f3.f18356f;
        return (g & 64) != 0 ? (g & (-16449)) | (this.f18383d.characteristics() & 16448) : g;
    }

    public final void m22253d() {
        if (this.f18383d == null) {
            this.f18383d = (AbstractC5468G) this.f18382c.get();
            this.f18382c = null;
        }
    }

    abstract void mo22168e();

    @Override
    public final long estimateSize() {
        m22253d();
        return this.f18383d.estimateSize();
    }

    @Override
    public Comparator getComparator() {
        if (AbstractC5485a.m22569j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        m22253d();
        if (EnumC5705f3.SIZED.m22266d(this.f18381b.mo22302Z())) {
            return this.f18383d.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract AbstractC5715h3 mo22165h(AbstractC5468G g);

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f18383d);
    }

    @Override
    public AbstractC5468G trySplit() {
        if (!this.f18380a || this.f18388i) {
            return null;
        }
        m22253d();
        AbstractC5468G trySplit = this.f18383d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo22165h(trySplit);
    }
}
