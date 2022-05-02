package p187n4;

import android.net.Uri;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;

public final class C7220o0 extends AbstractC6604g3 {
    public static final Object f22994Y = new Object();
    public static final C6660o1 f22995Z = new C6660o1.C6663c().m19636c("SinglePeriodTimeline").m19634e(Uri.EMPTY).m19638a();
    public final long f22996M;
    public final long f22997N;
    public final long f22998O;
    public final long f22999P;
    public final long f23000Q;
    public final long f23001R;
    public final boolean f23002S;
    public final boolean f23003T;
    public final boolean f23004U;
    public final Object f23005V;
    public final C6660o1 f23006W;
    public final C6660o1.C6669g f23007X;
    public final long f23008c;

    public C7220o0(long j, boolean z, boolean z2, boolean z3, Object obj, C6660o1 o1Var) {
        this(j, j, 0L, 0L, z, z2, z3, obj, o1Var);
    }

    @Override
    public int mo17302f(Object obj) {
        return f22994Y.equals(obj) ? 0 : -1;
    }

    @Override
    public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
        C1186a.m38190c(i, 0, 1);
        return bVar.m19800r(null, z ? f22994Y : null, 0, this.f22998O, -this.f23000Q);
    }

    @Override
    public int mo17300m() {
        return 1;
    }

    @Override
    public Object mo17299s(int i) {
        C1186a.m38190c(i, 0, 1);
        return f22994Y;
    }

    @Override
    public p174m3.AbstractC6604g3.C6608d mo17298u(int r25, p174m3.AbstractC6604g3.C6608d r26, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7220o0.mo17298u(int, m3.g3$d, long):m3.g3$d");
    }

    @Override
    public int mo17297v() {
        return 1;
    }

    public C7220o0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C6660o1 o1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, o1Var, z3 ? o1Var.f20811M : null);
    }

    public C7220o0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C6660o1 o1Var, C6660o1.C6669g gVar) {
        this.f23008c = j;
        this.f22996M = j2;
        this.f22997N = j3;
        this.f22998O = j4;
        this.f22999P = j5;
        this.f23000Q = j6;
        this.f23001R = j7;
        this.f23002S = z;
        this.f23003T = z2;
        this.f23004U = z3;
        this.f23005V = obj;
        this.f23006W = (C6660o1) C1186a.m38188e(o1Var);
        this.f23007X = gVar;
    }
}
