package p186n3;

import android.util.SparseArray;
import java.io.IOException;
import p020b5.C1186a;
import p020b5.C1213l;
import p032c5.C1607b0;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.C6591e2;
import p174m3.C6600g1;
import p174m3.C6613h2;
import p174m3.C6644l3;
import p174m3.C6660o1;
import p174m3.C6693s1;
import p187n4.AbstractC7230t;
import p187n4.C7205l;
import p187n4.C7221p;
import p187n4.C7233t0;
import p199o3.C7602e;
import p216p3.C8024e;
import p216p3.C8028h;
import p343y6.C10432h;
import p356z4.C11272n;

public interface AbstractC7126i1 {

    public static final class C7127a {
        public final long f22652a;
        public final AbstractC6604g3 f22653b;
        public final int f22654c;
        public final AbstractC7230t.C7231a f22655d;
        public final long f22656e;
        public final AbstractC6604g3 f22657f;
        public final int f22658g;
        public final AbstractC7230t.C7231a f22659h;
        public final long f22660i;
        public final long f22661j;

        public C7127a(long j, AbstractC6604g3 g3Var, int i, AbstractC7230t.C7231a aVar, long j2, AbstractC6604g3 g3Var2, int i2, AbstractC7230t.C7231a aVar2, long j3, long j4) {
            this.f22652a = j;
            this.f22653b = g3Var;
            this.f22654c = i;
            this.f22655d = aVar;
            this.f22656e = j2;
            this.f22657f = g3Var2;
            this.f22658g = i2;
            this.f22659h = aVar2;
            this.f22660i = j3;
            this.f22661j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7127a.class != obj.getClass()) {
                return false;
            }
            C7127a aVar = (C7127a) obj;
            return this.f22652a == aVar.f22652a && this.f22654c == aVar.f22654c && this.f22656e == aVar.f22656e && this.f22658g == aVar.f22658g && this.f22660i == aVar.f22660i && this.f22661j == aVar.f22661j && C10432h.m5139a(this.f22653b, aVar.f22653b) && C10432h.m5139a(this.f22655d, aVar.f22655d) && C10432h.m5139a(this.f22657f, aVar.f22657f) && C10432h.m5139a(this.f22659h, aVar.f22659h);
        }

        public int hashCode() {
            return C10432h.m5138b(Long.valueOf(this.f22652a), this.f22653b, Integer.valueOf(this.f22654c), this.f22655d, Long.valueOf(this.f22656e), this.f22657f, Integer.valueOf(this.f22658g), this.f22659h, Long.valueOf(this.f22660i), Long.valueOf(this.f22661j));
        }
    }

    public static final class C7128b {
        public final C1213l f22662a;
        public final SparseArray<C7127a> f22663b;

        public C7128b(C1213l lVar, SparseArray<C7127a> sparseArray) {
            this.f22662a = lVar;
            SparseArray<C7127a> sparseArray2 = new SparseArray<>(lVar.m38027b());
            for (int i = 0; i < lVar.m38027b(); i++) {
                int a = lVar.m38028a(i);
                sparseArray2.append(a, (C7127a) C1186a.m38185e(sparseArray.get(a)));
            }
            this.f22663b = sparseArray2;
        }
    }

    void m17582A(C7127a aVar, boolean z);

    void m17581B(C7127a aVar, int i, int i2);

    void m17580C(C7127a aVar, C6644l3 l3Var);

    void m17579D(C7127a aVar, C8024e eVar);

    void m17578E(C7127a aVar, long j, int i);

    void m17577F(C7127a aVar, Exception exc);

    @Deprecated
    void m17576G(C7127a aVar);

    @Deprecated
    void m17575H(C7127a aVar, int i, int i2, int i3, float f);

    void m17574I(C7127a aVar, int i, long j, long j2);

    void m17573J(C7127a aVar, C6660o1 o1Var, int i);

    void m17572K(C7127a aVar, C6600g1 g1Var, C8028h hVar);

    void m17571L(C7127a aVar, int i);

    @Deprecated
    void m17570M(C7127a aVar, int i, C8024e eVar);

    void m17569N(C7127a aVar, C7205l lVar, C7221p pVar);

    void m17568O(C7127a aVar, AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i);

    void m17567P(C7127a aVar, C6693s1 s1Var);

    void m17566Q(C7127a aVar);

    void m17565R(C7127a aVar, C4260a aVar2);

    void m17564S(C7127a aVar, int i);

    void m17563T(C7127a aVar, boolean z);

    void m17562U(C7127a aVar, C8024e eVar);

    void m17561V(C7127a aVar);

    void m17560W(C7127a aVar, String str, long j, long j2);

    @Deprecated
    void m17559X(C7127a aVar, C7233t0 t0Var, C11272n nVar);

    @Deprecated
    void m17558Y(C7127a aVar);

    void m17557Z(C7127a aVar, Exception exc);

    @Deprecated
    void m17556a(C7127a aVar, int i);

    void m17555a0(C7127a aVar, int i);

    void m17554b(C7127a aVar, C8024e eVar);

    void m17553b0(C7127a aVar, Exception exc);

    @Deprecated
    void m17552c(C7127a aVar, boolean z);

    @Deprecated
    void m17551c0(C7127a aVar);

    @Deprecated
    void m17550d(C7127a aVar, boolean z, int i);

    void m17549d0(C7127a aVar, int i);

    void m17548e(C7127a aVar, int i);

    void m17547e0(C7127a aVar, Exception exc);

    void m17546f(C7127a aVar, String str);

    void m17545f0(C7127a aVar, String str);

    void m17544g(C7127a aVar, boolean z);

    void m17543g0(C7127a aVar, C8024e eVar);

    void m17542h(C7127a aVar, C1607b0 b0Var);

    void m17541h0(C7127a aVar, boolean z);

    void m17540i(C7127a aVar);

    void m17539i0(C7127a aVar);

    @Deprecated
    void m17538j(C7127a aVar, int i, String str, long j);

    @Deprecated
    void m17537j0(C7127a aVar, C6600g1 g1Var);

    void m17536k(C7127a aVar, C7205l lVar, C7221p pVar, IOException iOException, boolean z);

    void m17535k0(C7127a aVar, long j);

    void m17534l(C7127a aVar, Object obj, long j);

    void m17533l0(C7127a aVar, float f);

    @Deprecated
    void m17532m(C7127a aVar, int i, C8024e eVar);

    void m17531m0(C7127a aVar, int i, long j, long j2);

    @Deprecated
    void m17530n(C7127a aVar, String str, long j);

    @Deprecated
    void m17529n0(C7127a aVar, C6600g1 g1Var);

    void m17528o(C7127a aVar, AbstractC6618i2.C6620b bVar);

    void m17527o0(C7127a aVar, C7205l lVar, C7221p pVar);

    void m17526p(C7127a aVar, String str, long j, long j2);

    void m17525p0(C7127a aVar, C6600g1 g1Var, C8028h hVar);

    void m17524q(AbstractC6618i2 i2Var, C7128b bVar);

    void m17523q0(C7127a aVar, C7602e eVar);

    void m17522r(C7127a aVar);

    void m17521s(C7127a aVar, C6591e2 e2Var);

    @Deprecated
    void m17520t(C7127a aVar, String str, long j);

    void m17519u(C7127a aVar, boolean z, int i);

    @Deprecated
    void m17518v(C7127a aVar, int i, C6600g1 g1Var);

    void m17517w(C7127a aVar, int i, long j);

    void m17516x(C7127a aVar, C7221p pVar);

    void m17515y(C7127a aVar, C6613h2 h2Var);

    void m17514z(C7127a aVar, C7205l lVar, C7221p pVar);
}
