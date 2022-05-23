package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.F;
import java.util.Comparator;

public abstract class AbstractC0335i3 implements H {
    final boolean f14775a;
    final E0 f14776b;
    private F f14777c;
    H f14778d;
    AbstractC0378r2 f14779e;
    C0296b f14780f;
    long f14781g;
    AbstractC0311e f14782h;
    boolean f14783i;

    public AbstractC0335i3(E0 e02, H h10, boolean z10) {
        this.f14776b = e02;
        this.f14777c = null;
        this.f14778d = h10;
        this.f14775a = z10;
    }

    public AbstractC0335i3(E0 e02, F f10, boolean z10) {
        this.f14776b = e02;
        this.f14777c = f10;
        this.f14778d = null;
        this.f14775a = z10;
    }

    private boolean c() {
        boolean z10;
        while (this.f14782h.count() == 0) {
            if (!this.f14779e.u()) {
                C0296b bVar = this.f14780f;
                switch (bVar.f14699a) {
                    case 4:
                        C0379r3 r3Var = (C0379r3) bVar.f14700b;
                        z10 = r3Var.f14778d.a(r3Var.f14779e);
                        break;
                    case 5:
                        t3 t3Var = (t3) bVar.f14700b;
                        z10 = t3Var.f14778d.a(t3Var.f14779e);
                        break;
                    case 6:
                        v3 v3Var = (v3) bVar.f14700b;
                        z10 = v3Var.f14778d.a(v3Var.f14779e);
                        break;
                    default:
                        M3 m32 = (M3) bVar.f14700b;
                        z10 = m32.f14778d.a(m32.f14779e);
                        break;
                }
                if (z10) {
                    continue;
                }
            }
            if (this.f14783i) {
                return false;
            }
            this.f14779e.h();
            this.f14783i = true;
        }
        return true;
    }

    public final boolean b() {
        AbstractC0311e eVar = this.f14782h;
        boolean z10 = false;
        if (eVar != null) {
            long j10 = this.f14781g + 1;
            this.f14781g = j10;
            if (j10 < eVar.count()) {
                z10 = true;
            }
            if (z10) {
                return z10;
            }
            this.f14781g = 0L;
            this.f14782h.clear();
            return c();
        } else if (this.f14783i) {
            return false;
        } else {
            d();
            e();
            this.f14781g = 0L;
            this.f14779e.k(this.f14778d.getExactSizeIfKnown());
            return c();
        }
    }

    @Override
    public final int characteristics() {
        d();
        int g10 = EnumC0325g3.g(this.f14776b.e0()) & EnumC0325g3.f14751f;
        return (g10 & 64) != 0 ? (g10 & (-16449)) | (this.f14778d.characteristics() & 16448) : g10;
    }

    public final void d() {
        if (this.f14778d == null) {
            this.f14778d = (H) this.f14777c.get();
            this.f14777c = null;
        }
    }

    abstract void e();

    @Override
    public final long estimateSize() {
        d();
        return this.f14778d.estimateSize();
    }

    @Override
    public final Comparator getComparator() {
        if (AbstractC0264a.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        d();
        if (EnumC0325g3.SIZED.d(this.f14776b.e0())) {
            return this.f14778d.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract AbstractC0335i3 h(H h10);

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f14778d);
    }

    @Override
    public H trySplit() {
        if (!this.f14775a || this.f14783i) {
            return null;
        }
        d();
        H trySplit = this.f14778d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return h(trySplit);
    }
}
