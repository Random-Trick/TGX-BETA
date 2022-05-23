package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.F;
import java.util.Objects;

final class M3 extends AbstractC0335i3 {
    M3(E0 e02, H h10, boolean z10) {
        super(e02, h10, z10);
    }

    public M3(E0 e02, F f10, boolean z10) {
        super(e02, f10, z10);
    }

    @Override
    public final boolean a(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean b10 = b();
        if (b10) {
            C0300b3 b3Var = (C0300b3) this.f14782h;
            long j10 = this.f14781g;
            if (b3Var.f14734c == 0) {
                if (j10 < b3Var.f14733b) {
                    obj = b3Var.f14706e[(int) j10];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
            } else if (j10 < b3Var.count()) {
                for (int i10 = 0; i10 <= b3Var.f14734c; i10++) {
                    long[] jArr = b3Var.f14735d;
                    long j11 = jArr[i10];
                    Object[][] objArr = b3Var.f14707f;
                    if (j10 < j11 + objArr[i10].length) {
                        obj = objArr[i10][(int) (j10 - jArr[i10])];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            consumer.l(obj);
        }
        return b10;
    }

    @Override
    final void e() {
        C0300b3 b3Var = new C0300b3();
        this.f14782h = b3Var;
        this.f14779e = this.f14776b.v0(new L3(b3Var, 1));
        this.f14780f = new C0296b(this, 7);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (this.f14782h != null || this.f14783i) {
            do {
            } while (a(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        d();
        this.f14776b.u0(new L3(consumer, 0), this.f14778d);
        this.f14783i = true;
    }

    @Override
    final AbstractC0335i3 h(H h10) {
        return new M3(this.f14776b, h10, this.f14775a);
    }
}
