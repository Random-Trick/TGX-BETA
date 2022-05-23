package l5;

import com.google.android.gms.common.api.Status;
import j5.a;
import m5.c;
import m5.p;
import m5.s;
import m5.t;
import n6.f;
import n6.l;
import r5.b;

public final class m1<T> implements f<T> {
    public final f f16156a;
    public final int f16157b;
    public final b<?> f16158c;
    public final long f16159d;

    public m1(f fVar, int i10, b<?> bVar, long j10, String str, String str2) {
        this.f16156a = fVar;
        this.f16157b = i10;
        this.f16158c = bVar;
        this.f16159d = j10;
    }

    public static <T> m1<T> b(f fVar, int i10, b<?> bVar) {
        boolean z10;
        if (!fVar.t()) {
            return null;
        }
        t a10 = s.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.d()) {
            return null;
        } else {
            z10 = a10.e();
            c1 p10 = fVar.p(bVar);
            if (p10 != null) {
                if (!(p10.v() instanceof c)) {
                    return null;
                }
                c cVar = (c) p10.v();
                if (cVar.M() && !cVar.h()) {
                    m5.f c10 = c(p10, cVar, i10);
                    if (c10 == null) {
                        return null;
                    }
                    p10.I();
                    z10 = c10.f();
                }
            }
        }
        return new m1<>(fVar, i10, bVar, z10 ? System.currentTimeMillis() : 0L, null, null);
    }

    public static m5.f c(c1<?> c1Var, c<?> cVar, int i10) {
        int[] c10;
        int[] d10;
        m5.f K = cVar.K();
        if (K == null || !K.e() || ((c10 = K.c()) != null ? !b.a(c10, i10) : !((d10 = K.d()) == null || !b.a(d10, i10))) || c1Var.H() >= K.b()) {
            return null;
        }
        return K;
    }

    @Override
    public final void a(l<T> lVar) {
        c1 p10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        if (this.f16156a.t()) {
            t a10 = s.b().a();
            if ((a10 == null || a10.d()) && (p10 = this.f16156a.p(this.f16158c)) != null && (p10.v() instanceof c)) {
                c cVar = (c) p10.v();
                boolean z10 = true;
                boolean z11 = this.f16159d > 0;
                int C = cVar.C();
                if (a10 != null) {
                    z11 &= a10.e();
                    int b10 = a10.b();
                    int c10 = a10.c();
                    i12 = a10.f();
                    if (cVar.M() && !cVar.h()) {
                        m5.f c11 = c(p10, cVar, this.f16157b);
                        if (c11 != null) {
                            if (!c11.f() || this.f16159d <= 0) {
                                z10 = false;
                            }
                            c10 = c11.b();
                            z11 = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = b10;
                    i10 = c10;
                } else {
                    i12 = 0;
                    i11 = 5000;
                    i10 = 100;
                }
                f fVar = this.f16156a;
                if (lVar.p()) {
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (lVar.n()) {
                        i14 = 100;
                    } else {
                        Exception k10 = lVar.k();
                        if (k10 instanceof k5.b) {
                            Status a11 = ((k5.b) k10).a();
                            int c12 = a11.c();
                            a b11 = a11.b();
                            i13 = b11 == null ? -1 : b11.b();
                            i14 = c12;
                        } else {
                            i14 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f16159d;
                    j10 = System.currentTimeMillis();
                    j11 = j12;
                } else {
                    j11 = 0;
                    j10 = 0;
                }
                fVar.y(new p(this.f16157b, i14, i13, j11, j10, null, null, C), i12, i11, i10);
            }
        }
    }
}
