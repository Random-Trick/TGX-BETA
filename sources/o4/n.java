package o4;

import b5.i0;
import c5.l0;
import m3.o3;
import m3.y1;
import o4.s;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p4.c;

public final class n extends f<Void> {
    public final s f19145k;
    public final boolean f19146l;
    public final o3.d f19147m;
    public final o3.b f19148n;
    public a f19149o;
    public m f19150p;
    public boolean f19151q;
    public boolean f19152r;
    public boolean f19153s;

    public static final class a extends i {
        public static final Object O = new Object();
        public final Object M;
        public final Object N;

        public a(o3 o3Var, Object obj, Object obj2) {
            super(o3Var);
            this.M = obj;
            this.N = obj2;
        }

        public static a A(o3 o3Var, Object obj, Object obj2) {
            return new a(o3Var, obj, obj2);
        }

        public static a z(y1 y1Var) {
            return new a(new b(y1Var), o3.d.f16864a0, O);
        }

        @Override
        public int f(Object obj) {
            Object obj2;
            o3 o3Var = this.f19088c;
            if (O.equals(obj) && (obj2 = this.N) != null) {
                obj = obj2;
            }
            return o3Var.f(obj);
        }

        @Override
        public o3.b k(int i10, o3.b bVar, boolean z10) {
            this.f19088c.k(i10, bVar, z10);
            if (l0.c(bVar.f16861b, this.N) && z10) {
                bVar.f16861b = O;
            }
            return bVar;
        }

        @Override
        public Object q(int i10) {
            Object q10 = this.f19088c.q(i10);
            return l0.c(q10, this.N) ? O : q10;
        }

        @Override
        public o3.d s(int i10, o3.d dVar, long j10) {
            this.f19088c.s(i10, dVar, j10);
            if (l0.c(dVar.f16868a, this.M)) {
                dVar.f16868a = o3.d.f16864a0;
            }
            return dVar;
        }

        public a y(o3 o3Var) {
            return new a(o3Var, this.M, this.N);
        }
    }

    public static final class b extends o3 {
        public final y1 f19154c;

        public b(y1 y1Var) {
            this.f19154c = y1Var;
        }

        @Override
        public int f(Object obj) {
            return obj == a.O ? 0 : -1;
        }

        @Override
        public o3.b k(int i10, o3.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.O;
            }
            bVar.w(num, obj, 0, -9223372036854775807L, 0L, c.P, true);
            return bVar;
        }

        @Override
        public int m() {
            return 1;
        }

        @Override
        public Object q(int i10) {
            return a.O;
        }

        @Override
        public o3.d s(int i10, o3.d dVar, long j10) {
            dVar.j(o3.d.f16864a0, this.f19154c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.U = true;
            return dVar;
        }

        @Override
        public int t() {
            return 1;
        }
    }

    public n(s sVar, boolean z10) {
        this.f19145k = sVar;
        this.f19146l = z10 && sVar.l();
        this.f19147m = new o3.d();
        this.f19148n = new o3.b();
        o3 n10 = sVar.n();
        if (n10 != null) {
            this.f19149o = a.A(n10, null, null);
            this.f19153s = true;
            return;
        }
        this.f19149o = a.z(sVar.h());
    }

    public m a(s.b bVar, b5.b bVar2, long j10) {
        m mVar = new m(bVar, bVar2, j10);
        mVar.w(this.f19145k);
        if (this.f19152r) {
            mVar.a(bVar.c(J(bVar.f19169a)));
        } else {
            this.f19150p = mVar;
            if (!this.f19151q) {
                this.f19151q = true;
                G(null, this.f19145k);
            }
        }
        return mVar;
    }

    public final Object I(Object obj) {
        return (this.f19149o.N == null || !this.f19149o.N.equals(obj)) ? obj : a.O;
    }

    public final Object J(Object obj) {
        return (this.f19149o.N == null || !obj.equals(a.O)) ? obj : this.f19149o.N;
    }

    public s.b B(Void r12, s.b bVar) {
        return bVar.c(I(bVar.f19169a));
    }

    public o3 L() {
        return this.f19149o;
    }

    public void F(java.lang.Void r13, o4.s r14, m3.o3 r15) {
        throw new UnsupportedOperationException("Method not decompiled: o4.n.F(java.lang.Void, o4.s, m3.o3):void");
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void N(long j10) {
        m mVar = this.f19150p;
        int f10 = this.f19149o.f(mVar.f19141a.f19169a);
        if (f10 != -1) {
            long j11 = this.f19149o.j(f10, this.f19148n).M;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            mVar.t(j10);
        }
    }

    @Override
    public void d(p pVar) {
        ((m) pVar).v();
        if (pVar == this.f19150p) {
            this.f19150p = null;
        }
    }

    @Override
    public y1 h() {
        return this.f19145k.h();
    }

    @Override
    public void j() {
    }

    @Override
    public void x(i0 i0Var) {
        super.x(i0Var);
        if (!this.f19146l) {
            this.f19151q = true;
            G(null, this.f19145k);
        }
    }

    @Override
    public void z() {
        this.f19152r = false;
        this.f19151q = false;
        super.z();
    }
}
