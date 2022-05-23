package j$.util.stream;

import j$.util.B;
import j$.util.D;
import j$.util.H;
import j$.util.function.AbstractC0278f;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.h;
import j$.util.function.n;
import j$.util.function.o;
import j$.util.function.p;
import j$.util.function.v;
import j$.util.function.x;
import j$.util.z;
import java.util.Objects;
import org.thunderdog.challegram.Log;

public abstract class E0 {
    private static final C0333i1 f14511a = new C0333i1();
    private static final M0 f14512b = new C0323g1();
    private static final O0 f14513c = new C0328h1();
    private static final K0 f14514d = new C0318f1();
    private static final int[] f14515e = new int[0];
    private static final long[] f14516f = new long[0];
    private static final double[] f14517g = new double[0];

    public static void A(O0 o02, Consumer consumer) {
        if (consumer instanceof v) {
            o02.n((v) consumer);
        } else if (!R3.f14615a) {
            ((D) o02.mo31spliterator()).forEachRemaining(consumer);
        } else {
            R3.a(o02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static K0 B(K0 k02, long j10, long j11) {
        if (j10 == 0 && j11 == k02.count()) {
            return k02;
        }
        long j12 = j11 - j10;
        z zVar = (z) k02.mo31spliterator();
        F0 T = T(j12);
        T.k(j12);
        for (int i10 = 0; i10 < j10 && zVar.j(J0.f14550a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && zVar.j(T); i11++) {
        }
        T.h();
        return T.mo32b();
    }

    public static M0 C(M0 m02, long j10, long j11) {
        if (j10 == 0 && j11 == m02.count()) {
            return m02;
        }
        long j12 = j11 - j10;
        B b10 = (B) m02.mo31spliterator();
        G0 f02 = f0(j12);
        f02.k(j12);
        for (int i10 = 0; i10 < j10 && b10.i(L0.f14567a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && b10.i(f02); i11++) {
        }
        f02.h();
        return f02.mo32b();
    }

    public static O0 D(O0 o02, long j10, long j11) {
        if (j10 == 0 && j11 == o02.count()) {
            return o02;
        }
        long j12 = j11 - j10;
        D d10 = (D) o02.mo31spliterator();
        H0 h02 = h0(j12);
        h02.k(j12);
        for (int i10 = 0; i10 < j10 && d10.g(N0.f14585a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && d10.g(h02); i11++) {
        }
        h02.h();
        return h02.mo32b();
    }

    public static Q0 E(Q0 q02, long j10, long j11, o oVar) {
        if (j10 == 0 && j11 == q02.count()) {
            return q02;
        }
        H spliterator = q02.mo31spliterator();
        long j12 = j11 - j10;
        I0 L = L(j12, oVar);
        L.k(j12);
        for (int i10 = 0; i10 < j10 && spliterator.a(C0291a.f14686s); i10++) {
        }
        for (int i11 = 0; i11 < j12 && spliterator.a(L); i11++) {
        }
        L.h();
        return L.mo32b();
    }

    public static long F(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static H G(int i10, H h10, long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        int[] iArr = A2.f14484a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new D3(h10, j10, j13);
            }
            if (i11 == 2) {
                return new z3((B) h10, j10, j13);
            }
            if (i11 == 3) {
                return new B3((D) h10, j10, j13);
            }
            if (i11 == 4) {
                return new x3((z) h10, j10, j13);
            }
            throw new IllegalStateException("Unknown shape " + AbstractC0330h3.b(i10));
        }
        throw null;
    }

    public static long H(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    public static I0 L(long j10, o oVar) {
        return (j10 < 0 || j10 >= 2147483639) ? new C1() : new C0343k1(j10, oVar);
    }

    public static Q0 M(E0 e02, H h10, boolean z10, o oVar) {
        long X = e02.X(h10);
        if (X < 0 || !h10.hasCharacteristics(Log.TAG_VIDEO)) {
            Q0 q02 = (Q0) new V0(e02, oVar, h10).invoke();
            return z10 ? Z(q02, oVar) : q02;
        } else if (X < 2147483639) {
            Object[] objArr = (Object[]) oVar.z((int) X);
            new A1(h10, e02, objArr).invoke();
            return new T0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static K0 N(E0 e02, H h10, boolean z10) {
        long X = e02.X(h10);
        if (X < 0 || !h10.hasCharacteristics(Log.TAG_VIDEO)) {
            K0 k02 = (K0) new V0(e02, h10, 0).invoke();
            return z10 ? a0(k02) : k02;
        } else if (X < 2147483639) {
            double[] dArr = new double[(int) X];
            new C0402x1(h10, e02, dArr).invoke();
            return new C0303c1(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static M0 O(E0 e02, H h10, boolean z10) {
        long X = e02.X(h10);
        if (X < 0 || !h10.hasCharacteristics(Log.TAG_VIDEO)) {
            M0 m02 = (M0) new V0(e02, h10, 1).invoke();
            return z10 ? b0(m02) : m02;
        } else if (X < 2147483639) {
            int[] iArr = new int[(int) X];
            new C0406y1(h10, e02, iArr).invoke();
            return new C0348l1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static O0 P(E0 e02, H h10, boolean z10) {
        long X = e02.X(h10);
        if (X < 0 || !h10.hasCharacteristics(Log.TAG_VIDEO)) {
            O0 o02 = (O0) new V0(e02, h10, 2).invoke();
            return z10 ? c0(o02) : o02;
        } else if (X < 2147483639) {
            long[] jArr = new long[(int) X];
            new C0410z1(h10, e02, jArr).invoke();
            return new C0390u1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static Q0 Q(int i10, Q0 q02, Q0 q03) {
        int[] iArr = R0.f14609a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return new C0298b1(q02, q03);
            }
            if (i11 == 2) {
                return new Y0((M0) q02, (M0) q03);
            }
            if (i11 == 3) {
                return new Z0((O0) q02, (O0) q03);
            }
            if (i11 == 4) {
                return new X0((K0) q02, (K0) q03);
            }
            throw new IllegalStateException("Unknown shape " + AbstractC0330h3.b(i10));
        }
        throw null;
    }

    public static F0 T(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0313e1() : new C0308d1(j10);
    }

    public static I U(z zVar) {
        return new D(zVar, EnumC0325g3.c(zVar));
    }

    public static Q0 V(int i10) {
        int[] iArr = R0.f14609a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 == 1) {
                return f14511a;
            }
            if (i11 == 2) {
                return f14512b;
            }
            if (i11 == 3) {
                return f14513c;
            }
            if (i11 == 4) {
                return f14514d;
            }
            throw new IllegalStateException("Unknown shape " + AbstractC0330h3.b(i10));
        }
        throw null;
    }

    private static int Y(long j10) {
        return (j10 != -1 ? EnumC0325g3.f14766u : 0) | EnumC0325g3.f14765t;
    }

    public static Q0 Z(Q0 q02, o oVar) {
        if (q02.s() <= 0) {
            return q02;
        }
        long count = q02.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) oVar.z((int) count);
            new E1(q02, objArr).invoke();
            return new T0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static K0 a0(K0 k02) {
        if (k02.s() <= 0) {
            return k02;
        }
        long count = k02.count();
        if (count < 2147483639) {
            double[] dArr = new double[(int) count];
            new D1(k02, dArr).invoke();
            return new C0303c1(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static M0 b0(M0 m02) {
        if (m02.s() <= 0) {
            return m02;
        }
        long count = m02.count();
        if (count < 2147483639) {
            int[] iArr = new int[(int) count];
            new D1(m02, iArr).invoke();
            return new C0348l1(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static O0 c0(O0 o02) {
        if (o02.s() <= 0) {
            return o02;
        }
        long count = o02.count();
        if (count < 2147483639) {
            long[] jArr = new long[(int) count];
            new D1(o02, jArr).invoke();
            return new C0390u1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static G0 f0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0358n1() : new C0353m1(j10);
    }

    public static AbstractC0352m0 g0(B b10) {
        return new C0327h0(b10, EnumC0325g3.c(b10));
    }

    public static H0 h0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0398w1() : new C0394v1(j10);
    }

    public static void i() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC0393v0 i0(D d10) {
        return new C0372q0(d10, EnumC0325g3.c(d10));
    }

    public static void j(AbstractC0364o2 o2Var, Double d10) {
        if (!R3.f14615a) {
            o2Var.c(d10.doubleValue());
        } else {
            R3.a(o2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static I j0(AbstractC0301c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0411z2(cVar, 4, Y(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static O3 k0(h hVar, B0 b02) {
        Objects.requireNonNull(hVar);
        Objects.requireNonNull(b02);
        return new C0(4, b02, new C0361o(b02, hVar, 1));
    }

    public static void l(AbstractC0369p2 p2Var, Integer num) {
        if (!R3.f14615a) {
            p2Var.d(num.intValue());
        } else {
            R3.a(p2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static AbstractC0352m0 l0(AbstractC0301c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0395v2(cVar, 2, Y(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static O3 m0(p pVar, B0 b02) {
        Objects.requireNonNull(pVar);
        Objects.requireNonNull(b02);
        return new C0(2, b02, new C0361o(b02, pVar, 2));
    }

    public static void n(AbstractC0374q2 q2Var, Long l10) {
        if (!R3.f14615a) {
            q2Var.e(l10.longValue());
        } else {
            R3.a(q2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static AbstractC0393v0 n0(AbstractC0301c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0403x2(cVar, 3, Y(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static O3 o0(x xVar, B0 b02) {
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(b02);
        return new C0(3, b02, new C0361o(b02, xVar, 3));
    }

    public static void p() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void q() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC0310d3 q0(AbstractC0301c cVar, long j10, long j11) {
        if (j10 >= 0) {
            return new C0387t2(cVar, 1, Y(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static Object[] r(P0 p02, o oVar) {
        if (R3.f14615a) {
            R3.a(p02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (p02.count() < 2147483639) {
            Object[] objArr = (Object[]) oVar.z((int) p02.count());
            p02.q(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static O3 r0(E e10, B0 b02) {
        Objects.requireNonNull(e10);
        Objects.requireNonNull(b02);
        return new C0(1, b02, new C0361o(b02, e10, 4));
    }

    public static void s(K0 k02, Double[] dArr, int i10) {
        if (!R3.f14615a) {
            double[] dArr2 = (double[]) k02.m();
            for (int i11 = 0; i11 < dArr2.length; i11++) {
                dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
            }
            return;
        }
        R3.a(k02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    public static O3 s0(F f10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(f10);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return new G1(1, biConsumer2, biConsumer, f10, 3);
    }

    public static AbstractC0310d3 t0(H h10, boolean z10) {
        Objects.requireNonNull(h10);
        return new C0324g2(h10, EnumC0325g3.c(h10), z10);
    }

    public static void u(M0 m02, Integer[] numArr, int i10) {
        if (!R3.f14615a) {
            int[] iArr = (int[]) m02.m();
            for (int i11 = 0; i11 < iArr.length; i11++) {
                numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
            }
            return;
        }
        R3.a(m02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void w(O0 o02, Long[] lArr, int i10) {
        if (!R3.f14615a) {
            long[] jArr = (long[]) o02.m();
            for (int i11 = 0; i11 < jArr.length; i11++) {
                lArr[i10 + i11] = Long.valueOf(jArr[i11]);
            }
            return;
        }
        R3.a(o02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    public static void y(K0 k02, Consumer consumer) {
        if (consumer instanceof AbstractC0278f) {
            k02.n((AbstractC0278f) consumer);
        } else if (!R3.f14615a) {
            ((z) k02.mo31spliterator()).forEachRemaining(consumer);
        } else {
            R3.a(k02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void z(M0 m02, Consumer consumer) {
        if (consumer instanceof n) {
            m02.n((n) consumer);
        } else if (!R3.f14615a) {
            ((B) m02.mo31spliterator()).forEachRemaining(consumer);
        } else {
            R3.a(m02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public abstract void R(AbstractC0378r2 r2Var, H h10);

    public abstract void S(AbstractC0378r2 r2Var, H h10);

    public abstract Q0 W(H h10, boolean z10, o oVar);

    public abstract long X(H h10);

    public abstract int d0();

    public abstract int e0();

    public abstract I0 p0(long j10, o oVar);

    public abstract AbstractC0378r2 u0(AbstractC0378r2 r2Var, H h10);

    public abstract AbstractC0378r2 v0(AbstractC0378r2 r2Var);

    public abstract H w0(H h10);
}
