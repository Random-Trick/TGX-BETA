package n3;

import a5.v;
import android.util.SparseArray;
import c5.l;
import d5.b0;
import java.io.IOException;
import java.util.List;
import m3.c2;
import m3.o;
import m3.o2;
import m3.o3;
import m3.q1;
import m3.r2;
import m3.s2;
import m3.t3;
import m3.y1;
import o4.k;
import o4.r0;
import o4.s;
import p3.e;
import p3.h;
import z6.i;

public interface c {

    public static final class a {
        public final long f17543a;
        public final o3 f17544b;
        public final int f17545c;
        public final s.b f17546d;
        public final long f17547e;
        public final o3 f17548f;
        public final int f17549g;
        public final s.b f17550h;
        public final long f17551i;
        public final long f17552j;

        public a(long j10, o3 o3Var, int i10, s.b bVar, long j11, o3 o3Var2, int i11, s.b bVar2, long j12, long j13) {
            this.f17543a = j10;
            this.f17544b = o3Var;
            this.f17545c = i10;
            this.f17546d = bVar;
            this.f17547e = j11;
            this.f17548f = o3Var2;
            this.f17549g = i11;
            this.f17550h = bVar2;
            this.f17551i = j12;
            this.f17552j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17543a == aVar.f17543a && this.f17545c == aVar.f17545c && this.f17547e == aVar.f17547e && this.f17549g == aVar.f17549g && this.f17551i == aVar.f17551i && this.f17552j == aVar.f17552j && i.a(this.f17544b, aVar.f17544b) && i.a(this.f17546d, aVar.f17546d) && i.a(this.f17548f, aVar.f17548f) && i.a(this.f17550h, aVar.f17550h);
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f17543a), this.f17544b, Integer.valueOf(this.f17545c), this.f17546d, Long.valueOf(this.f17547e), this.f17548f, Integer.valueOf(this.f17549g), this.f17550h, Long.valueOf(this.f17551i), Long.valueOf(this.f17552j));
        }
    }

    public static final class b {
        public final l f17553a;
        public final SparseArray<a> f17554b;

        public b(l lVar, SparseArray<a> sparseArray) {
            this.f17553a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.b());
            for (int i10 = 0; i10 < lVar.b(); i10++) {
                int a10 = lVar.a(i10);
                sparseArray2.append(a10, (a) c5.a.e(sparseArray.get(a10)));
            }
            this.f17554b = sparseArray2;
        }
    }

    void A(a aVar, boolean z10);

    void B(a aVar, int i10, int i11);

    void C(a aVar, t3 t3Var);

    void D(a aVar, e eVar);

    void E(a aVar, List<q4.b> list);

    void F(a aVar, long j10, int i10);

    void G(a aVar, Exception exc);

    @Deprecated
    void H(a aVar);

    @Deprecated
    void I(a aVar, int i10, int i11, int i12, float f10);

    void J(a aVar, int i10, long j10, long j11);

    void K(a aVar, y1 y1Var, int i10);

    void L(a aVar, q1 q1Var, h hVar);

    void M(a aVar, int i10);

    @Deprecated
    void N(a aVar, int i10, e eVar);

    void O(a aVar, s2.e eVar, s2.e eVar2, int i10);

    void P(a aVar, c2 c2Var);

    void Q(a aVar);

    void R(a aVar, f4.a aVar2);

    void S(a aVar, int i10);

    void T(a aVar, boolean z10);

    void U(a aVar, e eVar);

    void V(a aVar, o oVar);

    void W(a aVar);

    void X(a aVar, o4.o oVar);

    void Y(a aVar, String str, long j10, long j11);

    @Deprecated
    void Z(a aVar);

    void a(a aVar, o2 o2Var);

    void a0(a aVar, Exception exc);

    @Deprecated
    void b(a aVar, int i10);

    void b0(a aVar, k kVar, o4.o oVar);

    void c(a aVar, e eVar);

    void c0(a aVar, int i10);

    @Deprecated
    void d(a aVar, boolean z10);

    void d0(a aVar, Exception exc);

    void e(a aVar, k kVar, o4.o oVar);

    @Deprecated
    void e0(a aVar);

    @Deprecated
    void f(a aVar, boolean z10, int i10);

    void f0(a aVar, int i10);

    void g(a aVar, int i10);

    void g0(a aVar, int i10, boolean z10);

    void h(a aVar, String str);

    void h0(a aVar, Exception exc);

    void i(a aVar, boolean z10);

    void i0(a aVar, k kVar, o4.o oVar, IOException iOException, boolean z10);

    void j(a aVar);

    void j0(a aVar, String str);

    @Deprecated
    void k(a aVar, int i10, String str, long j10);

    void k0(a aVar, e eVar);

    void l(a aVar, Object obj, long j10);

    void l0(a aVar, k kVar, o4.o oVar);

    @Deprecated
    void m(a aVar, int i10, e eVar);

    void m0(a aVar, boolean z10);

    @Deprecated
    void n(a aVar, String str, long j10);

    void n0(a aVar);

    void o(a aVar, s2.b bVar);

    @Deprecated
    void o0(a aVar, q1 q1Var);

    void p(a aVar, String str, long j10, long j11);

    void p0(a aVar, long j10);

    void q(s2 s2Var, b bVar);

    void q0(a aVar, float f10);

    void r(a aVar);

    void r0(a aVar, int i10, long j10, long j11);

    void s(a aVar, o2 o2Var);

    @Deprecated
    void s0(a aVar, q1 q1Var);

    @Deprecated
    void t(a aVar, String str, long j10);

    void t0(a aVar, q1 q1Var, h hVar);

    void u(a aVar, boolean z10, int i10);

    void u0(a aVar, o3.e eVar);

    @Deprecated
    void v(a aVar, int i10, q1 q1Var);

    void w(a aVar, b0 b0Var);

    void x(a aVar, int i10, long j10);

    void y(a aVar, r2 r2Var);

    @Deprecated
    void z(a aVar, r0 r0Var, v vVar);
}
