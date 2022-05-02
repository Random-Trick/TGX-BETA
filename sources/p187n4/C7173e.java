package p187n4;

import java.io.IOException;
import java.util.ArrayList;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0150i0;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6604g3;
import p174m3.C6660o1;
import p187n4.AbstractC7230t;

public final class C7173e extends AbstractC7184g<Void> {
    public final AbstractC7230t f22768j;
    public final long f22769k;
    public final long f22770l;
    public final boolean f22771m;
    public final boolean f22772n;
    public final boolean f22773o;
    public final ArrayList<C7170d> f22774p;
    public final AbstractC6604g3.C6608d f22775q;
    public C7174a f22776r;
    public C7175b f22777s;
    public long f22778t;
    public long f22779u;

    public static final class C7174a extends AbstractC7196j {
        public final long f22780M;
        public final long f22781N;
        public final long f22782O;
        public final boolean f22783P;

        public C7174a(AbstractC6604g3 g3Var, long j, long j2) {
            super(g3Var);
            boolean z = false;
            if (g3Var.mo17300m() == 1) {
                AbstractC6604g3.C6608d t = g3Var.m19821t(0, new AbstractC6604g3.C6608d());
                long max = Math.max(0L, j);
                if (t.f20656U || max == 0 || t.f20652Q) {
                    long max2 = j2 == Long.MIN_VALUE ? t.f20658W : Math.max(0L, j2);
                    long j3 = t.f20658W;
                    if (j3 != -9223372036854775807L) {
                        max2 = max2 > j3 ? j3 : max2;
                        if (max > max2) {
                            throw new C7175b(2);
                        }
                    }
                    this.f22780M = max;
                    this.f22781N = max2;
                    int i = (max2 > (-9223372036854775807L) ? 1 : (max2 == (-9223372036854775807L) ? 0 : -1));
                    this.f22782O = i == 0 ? -9223372036854775807L : max2 - max;
                    if (t.f20653R && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                        z = true;
                    }
                    this.f22783P = z;
                    return;
                }
                throw new C7175b(1);
            }
            throw new C7175b(0);
        }

        @Override
        public AbstractC6604g3.C6606b mo17301k(int i, AbstractC6604g3.C6606b bVar, boolean z) {
            this.f22906c.mo17301k(0, bVar, z);
            long o = bVar.m19803o() - this.f22780M;
            long j = this.f22782O;
            return bVar.m19800r(bVar.f20637a, bVar.f20638b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - o, o);
        }

        @Override
        public AbstractC6604g3.C6608d mo17298u(int i, AbstractC6604g3.C6608d dVar, long j) {
            this.f22906c.mo17298u(0, dVar, 0L);
            long j2 = dVar.f20661Z;
            long j3 = this.f22780M;
            dVar.f20661Z = j2 + j3;
            dVar.f20658W = this.f22782O;
            dVar.f20653R = this.f22783P;
            long j4 = dVar.f20657V;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                dVar.f20657V = max;
                long j5 = this.f22781N;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                dVar.f20657V = max;
                dVar.f20657V = max - this.f22780M;
            }
            long H0 = C1216l0.m38009H0(this.f22780M);
            long j6 = dVar.f20649N;
            if (j6 != -9223372036854775807L) {
                dVar.f20649N = j6 + H0;
            }
            long j7 = dVar.f20650O;
            if (j7 != -9223372036854775807L) {
                dVar.f20650O = j7 + H0;
            }
            return dVar;
        }
    }

    public static final class C7175b extends IOException {
        public final int f22784a;

        public C7175b(int r4) {
            throw new UnsupportedOperationException("Method not decompiled: p187n4.C7173e.C7175b.<init>(int):void");
        }

        public static String m17490a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C7173e(AbstractC7230t tVar, long j, long j2) {
        this(tVar, j, j2, true, false, false);
    }

    public void mo17316E(Void r1, AbstractC7230t tVar, AbstractC6604g3 g3Var) {
        if (this.f22777s == null) {
            m17491H(g3Var);
        }
    }

    public final void m17491H(AbstractC6604g3 g3Var) {
        long j;
        g3Var.m19821t(0, this.f22775q);
        long g = this.f22775q.m19792g();
        long j2 = Long.MIN_VALUE;
        if (this.f22776r == null || this.f22774p.isEmpty() || this.f22772n) {
            long j3 = this.f22769k;
            long j4 = this.f22770l;
            if (this.f22773o) {
                long e = this.f22775q.m19794e();
                j3 += e;
                j4 += e;
            }
            this.f22778t = g + j3;
            if (this.f22770l != Long.MIN_VALUE) {
                j2 = g + j4;
            }
            this.f22779u = j2;
            int size = this.f22774p.size();
            for (int i = 0; i < size; i++) {
                this.f22774p.get(i).m17494r(this.f22778t, this.f22779u);
            }
            j = j3;
            j2 = j4;
        } else {
            j = this.f22778t - g;
            if (this.f22770l != Long.MIN_VALUE) {
                j2 = this.f22779u - g;
            }
        }
        try {
            C7174a aVar = new C7174a(g3Var, j, j2);
            this.f22776r = aVar;
            m17506x(aVar);
        } catch (C7175b e2) {
            this.f22777s = e2;
            for (int i2 = 0; i2 < this.f22774p.size(); i2++) {
                this.f22774p.get(i2).m17496m(this.f22777s);
            }
        }
    }

    @Override
    public AbstractC7223q mo17260c(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        C7170d dVar = new C7170d(this.f22768j.mo17260c(aVar, bVar, j), this.f22771m, this.f22778t, this.f22779u);
        this.f22774p.add(dVar);
        return dVar;
    }

    @Override
    public void mo17259d(AbstractC7223q qVar) {
        C1186a.m38187f(this.f22774p.remove(qVar));
        this.f22768j.mo17259d(((C7170d) qVar).f22761a);
        if (this.f22774p.isEmpty() && !this.f22772n) {
            m17491H(((C7174a) C1186a.m38188e(this.f22776r)).f22906c);
        }
    }

    @Override
    public C6660o1 mo17257g() {
        return this.f22768j.mo17257g();
    }

    @Override
    public void mo17253k() {
        C7175b bVar = this.f22777s;
        if (bVar == null) {
            super.mo17253k();
            return;
        }
        throw bVar;
    }

    @Override
    public void mo17308w(AbstractC0150i0 i0Var) {
        super.mo17308w(i0Var);
        m17432F(null, this.f22768j);
    }

    @Override
    public void mo17307y() {
        super.mo17307y();
        this.f22777s = null;
        this.f22776r = null;
    }

    public C7173e(AbstractC7230t tVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        C1186a.m38192a(j >= 0);
        this.f22768j = (AbstractC7230t) C1186a.m38188e(tVar);
        this.f22769k = j;
        this.f22770l = j2;
        this.f22771m = z;
        this.f22772n = z2;
        this.f22773o = z3;
        this.f22774p = new ArrayList<>();
        this.f22775q = new AbstractC6604g3.C6608d();
    }
}
