package p187n4;

import android.net.Uri;
import p020b5.C1186a;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;

public final class C7220o0 extends AbstractC6604g3 {
    public static final Object f22991Y = new Object();
    public static final C6660o1 f22992Z = new C6660o1.C6663c().m19635c("SinglePeriodTimeline").m19633e(Uri.EMPTY).m19637a();
    public final long f22993M;
    public final long f22994N;
    public final long f22995O;
    public final long f22996P;
    public final long f22997Q;
    public final long f22998R;
    public final boolean f22999S;
    public final boolean f23000T;
    public final boolean f23001U;
    public final Object f23002V;
    public final C6660o1 f23003W;
    public final C6660o1.C6669g f23004X;
    public final long f23005c;

    public C7220o0(long j, boolean z, boolean z2, boolean z3, Object obj, C6660o1 o1Var) {
        this(j, j, 0L, 0L, z, z2, z3, obj, o1Var);
    }

    @Override
    public int mo17302f(Object obj) {
        return f22991Y.equals(obj) ? 0 : -1;
    }

    @Override
    public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
        C1186a.m38187c(i, 0, 1);
        return bVar.m19799r(null, z ? f22991Y : null, 0, this.f22995O, -this.f22997Q);
    }

    @Override
    public int mo17300m() {
        return 1;
    }

    @Override
    public Object mo17299s(int i) {
        C1186a.m38187c(i, 0, 1);
        return f22991Y;
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
        this.f23005c = j;
        this.f22993M = j2;
        this.f22994N = j3;
        this.f22995O = j4;
        this.f22996P = j5;
        this.f22997Q = j6;
        this.f22998R = j7;
        this.f22999S = z;
        this.f23000T = z2;
        this.f23001U = z3;
        this.f23002V = obj;
        this.f23003W = (C6660o1) C1186a.m38185e(o1Var);
        this.f23004X = gVar;
    }
}
