package p126j$.util.stream;

import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;
import p126j$.util.function.C5520b;
import p126j$.util.function.Consumer;

public abstract class AbstractC5572D0 {
    private static final AbstractC5632P0 f18116a = new C5713h1(null);
    private static final AbstractC5612L0 f18117b = new C5703f1();
    private static final AbstractC5622N0 f18118c = new C5708g1();
    private static final AbstractC5602J0 f18119d = new C5698e1();
    private static final int[] f18120e = new int[0];
    private static final long[] f18121f = new long[0];
    private static final double[] f18122g = new double[0];

    public static AbstractC5468G m22449A(int i, AbstractC5468G g, long j, long j2) {
        long G = m22443G(j, j2);
        int[] iArr = AbstractC5804z2.f18525a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return new C5570C3(g, j, G);
            }
            if (i2 == 2) {
                return new C5800y3((AbstractC5462A) g, j, G);
            }
            if (i2 == 3) {
                return new C5560A3((AbstractC5464C) g, j, G);
            }
            if (i2 == 4) {
                return new C5790w3((AbstractC5811y) g, j, G);
            }
            throw new IllegalStateException("Unknown shape " + AbstractC5710g3.m22256c(i));
        }
        throw null;
    }

    public static long m22448B(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static AbstractC5592H0 m22444F(long j, AbstractC5531m mVar) {
        return (j < 0 || j >= 2147483639) ? new C5563B1() : new C5723j1(j, mVar);
    }

    public static long m22443G(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static AbstractC5632P0 m22442H(AbstractC5572D0 d0, AbstractC5468G g, boolean z, AbstractC5531m mVar) {
        long S = d0.mo22303S(g);
        if (S < 0 || !g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5632P0 p0 = (AbstractC5632P0) new C5653U0(d0, mVar, g).invoke();
            return z ? m22433U(p0, mVar) : p0;
        } else if (S < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22178w((int) S);
            new C5803z1(g, d0, objArr).invoke();
            return new C5645S0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static AbstractC5602J0 m22441I(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        long S = d0.mo22303S(g);
        if (S < 0 || !g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5602J0 j0 = (AbstractC5602J0) new C5653U0(d0, g, 0).invoke();
            return z ? m22432V(j0) : j0;
        } else if (S < 2147483639) {
            double[] dArr = new double[(int) S];
            new C5788w1(g, d0, dArr).invoke();
            return new C5683b1(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static AbstractC5612L0 m22440J(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        long S = d0.mo22303S(g);
        if (S < 0 || !g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5612L0 l0 = (AbstractC5612L0) new C5653U0(d0, g, 1).invoke();
            return z ? m22431W(l0) : l0;
        } else if (S < 2147483639) {
            int[] iArr = new int[(int) S];
            new C5793x1(g, d0, iArr).invoke();
            return new C5728k1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static AbstractC5622N0 m22439K(AbstractC5572D0 d0, AbstractC5468G g, boolean z) {
        long S = d0.mo22303S(g);
        if (S < 0 || !g.hasCharacteristics(Log.TAG_VIDEO)) {
            AbstractC5622N0 n0 = (AbstractC5622N0) new C5653U0(d0, g, 2).invoke();
            return z ? m22430X(n0) : n0;
        } else if (S < 2147483639) {
            long[] jArr = new long[(int) S];
            new C5798y1(g, d0, jArr).invoke();
            return new C5773t1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static AbstractC5632P0 m22438L(int i, AbstractC5632P0 p0, AbstractC5632P0 p02) {
        int[] iArr = AbstractC5637Q0.f18214a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return new C5678a1(p0, p02);
            }
            if (i2 == 2) {
                return new C5665X0((AbstractC5612L0) p0, (AbstractC5612L0) p02);
            }
            if (i2 == 3) {
                return new C5669Y0((AbstractC5622N0) p0, (AbstractC5622N0) p02);
            }
            if (i2 == 4) {
                return new C5661W0((AbstractC5602J0) p0, (AbstractC5602J0) p02);
            }
            throw new IllegalStateException("Unknown shape " + AbstractC5710g3.m22256c(i));
        }
        throw null;
    }

    public static AbstractC5577E0 m22437O(long j) {
        return (j < 0 || j >= 2147483639) ? new C5693d1() : new C5688c1(j);
    }

    public static AbstractC5591H m22436P(AbstractC5811y yVar, boolean z) {
        return new C5566C(yVar, EnumC5705f3.m22266c(yVar), z);
    }

    public static AbstractC5632P0 m22435Q(int i) {
        int[] iArr = AbstractC5637Q0.f18214a;
        if (i != 0) {
            int i2 = iArr[i - 1];
            if (i2 == 1) {
                return f18116a;
            }
            if (i2 == 2) {
                return f18117b;
            }
            if (i2 == 3) {
                return f18118c;
            }
            if (i2 == 4) {
                return f18119d;
            }
            throw new IllegalStateException("Unknown shape " + AbstractC5710g3.m22256c(i));
        }
        throw null;
    }

    private static int m22434T(long j) {
        return (j != -1 ? EnumC5705f3.f18371u : 0) | EnumC5705f3.f18370t;
    }

    public static AbstractC5632P0 m22433U(AbstractC5632P0 p0, AbstractC5531m mVar) {
        if (p0.mo22153o() <= 0) {
            return p0;
        }
        long count = p0.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22178w((int) count);
            new C5573D1(p0, objArr, 0, (AbstractC5637Q0) null).invoke();
            return new C5645S0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static AbstractC5602J0 m22432V(AbstractC5602J0 j0) {
        if (j0.mo22153o() <= 0) {
            return j0;
        }
        long count = j0.count();
        if (count < 2147483639) {
            double[] dArr = new double[(int) count];
            new C5568C1(j0, dArr, 0, (AbstractC5637Q0) null).invoke();
            return new C5683b1(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static AbstractC5612L0 m22431W(AbstractC5612L0 l0) {
        if (l0.mo22153o() <= 0) {
            return l0;
        }
        long count = l0.count();
        if (count < 2147483639) {
            int[] iArr = new int[(int) count];
            new C5568C1(l0, iArr, 0, (AbstractC5637Q0) null).invoke();
            return new C5728k1(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static AbstractC5622N0 m22430X(AbstractC5622N0 n0) {
        if (n0.mo22153o() <= 0) {
            return n0;
        }
        long count = n0.count();
        if (count < 2147483639) {
            long[] jArr = new long[(int) count];
            new C5568C1(n0, jArr, 0, (AbstractC5637Q0) null).invoke();
            return new C5773t1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public static AbstractC5582F0 m22429a0(long j) {
        return (j < 0 || j >= 2147483639) ? new C5738m1() : new C5733l1(j);
    }

    public static AbstractC5732l0 m22428b0(AbstractC5462A a, boolean z) {
        return new C5707g0(a, EnumC5705f3.m22266c(a), z);
    }

    public static AbstractC5587G0 m22427c0(long j) {
        return (j < 0 || j >= 2147483639) ? new C5783v1() : new C5778u1(j);
    }

    public static AbstractC5777u0 m22426d0(AbstractC5464C c, boolean z) {
        return new C5752p0(c, EnumC5705f3.m22266c(c), z);
    }

    public static AbstractC5591H m22425e0(AbstractC5686c cVar, long j, long j2) {
        if (j >= 0) {
            return new C5799y2(cVar, 4, m22434T(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static AbstractC5625N3 m22424f0(C5520b bVar, EnumC5557A0 a0) {
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(a0);
        return new C5562B0(4, a0, new C5741n(a0, bVar, 1));
    }

    public static AbstractC5732l0 m22423g0(AbstractC5686c cVar, long j, long j2) {
        if (j >= 0) {
            return new C5779u2(cVar, 2, m22434T(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static AbstractC5625N3 m22422h0(C5520b bVar, EnumC5557A0 a0) {
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(a0);
        return new C5562B0(2, a0, new C5741n(a0, bVar, 2));
    }

    public static void m22421i() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC5777u0 m22420i0(AbstractC5686c cVar, long j, long j2) {
        if (j >= 0) {
            return new C5789w2(cVar, 3, m22434T(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void m22419j(AbstractC5744n2 n2Var, Double d) {
        if (!AbstractC5640Q3.f18220a) {
            n2Var.mo22135c(d.doubleValue());
        } else {
            AbstractC5640Q3.m22369a(n2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public static AbstractC5625N3 m22418j0(C5520b bVar, EnumC5557A0 a0) {
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(a0);
        return new C5562B0(3, a0, new C5741n(a0, bVar, 3));
    }

    public static void m22417k(AbstractC5749o2 o2Var, Integer num) {
        if (!AbstractC5640Q3.f18220a) {
            o2Var.mo22134d(num.intValue());
        } else {
            AbstractC5640Q3.m22369a(o2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    public static void m22416l(AbstractC5754p2 p2Var, Long l) {
        if (!AbstractC5640Q3.f18220a) {
            p2Var.mo22133e(l.longValue());
        } else {
            AbstractC5640Q3.m22369a(p2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public static AbstractC5690c3 m22415l0(AbstractC5686c cVar, long j, long j2) {
        if (j >= 0) {
            return new C5769s2(cVar, 1, m22434T(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void m22414m() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC5625N3 m22413m0(AbstractC5541w wVar, EnumC5557A0 a0) {
        Objects.requireNonNull(wVar);
        Objects.requireNonNull(a0);
        return new C5562B0(1, a0, new C5741n(a0, wVar, 4));
    }

    public static void m22412n() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static AbstractC5625N3 m22411n0(AbstractC5542x xVar, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(xVar);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return new C5583F1(1, biConsumer2, biConsumer, xVar, 3);
    }

    public static Object[] m22410o(AbstractC5627O0 o0, AbstractC5531m mVar) {
        if (AbstractC5640Q3.f18220a) {
            AbstractC5640Q3.m22369a(o0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (o0.count() < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22178w((int) o0.count());
            o0.mo22154n(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static AbstractC5625N3 m22409o0(Object obj, BiFunction biFunction, AbstractC5521c cVar) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(cVar);
        return new C5583F1(1, cVar, biFunction, obj, 2);
    }

    public static void m22408p(AbstractC5602J0 j0, Double[] dArr, int i) {
        if (!AbstractC5640Q3.f18220a) {
            double[] dArr2 = (double[]) j0.mo22156l();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        AbstractC5640Q3.m22369a(j0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    public static AbstractC5690c3 m22407p0(AbstractC5468G g, boolean z) {
        Objects.requireNonNull(g);
        return new C5704f2(g, EnumC5705f3.m22266c(g), z);
    }

    public static void m22406q(AbstractC5612L0 l0, Integer[] numArr, int i) {
        if (!AbstractC5640Q3.f18220a) {
            int[] iArr = (int[]) l0.mo22156l();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        AbstractC5640Q3.m22369a(l0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    public static void m22405r(AbstractC5622N0 n0, Long[] lArr, int i) {
        if (!AbstractC5640Q3.f18220a) {
            long[] jArr = (long[]) n0.mo22156l();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        AbstractC5640Q3.m22369a(n0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    public static void m22404s(AbstractC5602J0 j0, Consumer consumer) {
        if (consumer instanceof AbstractC5525g) {
            j0.mo22155m((AbstractC5525g) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            ((AbstractC5811y) j0.mo42629spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(j0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void m22403t(AbstractC5612L0 l0, Consumer consumer) {
        if (consumer instanceof AbstractC5530l) {
            l0.mo22155m((AbstractC5530l) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            ((AbstractC5462A) l0.mo42629spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(l0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static void m22402u(AbstractC5622N0 n0, Consumer consumer) {
        if (consumer instanceof AbstractC5535q) {
            n0.mo22155m((AbstractC5535q) consumer);
        } else if (!AbstractC5640Q3.f18220a) {
            ((AbstractC5464C) n0.mo42629spliterator()).forEachRemaining(consumer);
        } else {
            AbstractC5640Q3.m22369a(n0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    public static AbstractC5602J0 m22401v(AbstractC5602J0 j0, long j, long j2) {
        if (j == 0 && j2 == j0.count()) {
            return j0;
        }
        long j3 = j2 - j;
        AbstractC5811y yVar = (AbstractC5811y) j0.mo42629spliterator();
        AbstractC5577E0 O = m22437O(j3);
        O.mo22131j(j3);
        for (int i = 0; i < j && yVar.mo22123l(C5597I0.f18155a); i++) {
        }
        for (int i2 = 0; i2 < j3 && yVar.mo22123l(O); i2++) {
        }
        O.mo22132h();
        return O.mo42630b();
    }

    public static AbstractC5612L0 m22400w(AbstractC5612L0 l0, long j, long j2) {
        if (j == 0 && j2 == l0.count()) {
            return l0;
        }
        long j3 = j2 - j;
        AbstractC5462A a = (AbstractC5462A) l0.mo42629spliterator();
        AbstractC5582F0 a0 = m22429a0(j3);
        a0.mo22131j(j3);
        for (int i = 0; i < j && a.mo22181i(C5607K0.f18172a); i++) {
        }
        for (int i2 = 0; i2 < j3 && a.mo22181i(a0); i2++) {
        }
        a0.mo22132h();
        return a0.mo42630b();
    }

    public static AbstractC5622N0 m22399x(AbstractC5622N0 n0, long j, long j2) {
        if (j == 0 && j2 == n0.count()) {
            return n0;
        }
        long j3 = j2 - j;
        AbstractC5464C c = (AbstractC5464C) n0.mo42629spliterator();
        AbstractC5587G0 c0 = m22427c0(j3);
        c0.mo22131j(j3);
        for (int i = 0; i < j && c.mo22165g(C5617M0.f18190a); i++) {
        }
        for (int i2 = 0; i2 < j3 && c.mo22165g(c0); i2++) {
        }
        c0.mo22132h();
        return c0.mo42630b();
    }

    public static AbstractC5632P0 m22398y(AbstractC5632P0 p0, long j, long j2, AbstractC5531m mVar) {
        if (j == 0 && j2 == p0.count()) {
            return p0;
        }
        AbstractC5468G spliterator = p0.mo42629spliterator();
        long j3 = j2 - j;
        AbstractC5592H0 F = m22444F(j3, mVar);
        F.mo22131j(j3);
        for (int i = 0; i < j && spliterator.mo22124a(C5676a.f18302s); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.mo22124a(F); i2++) {
        }
        F.mo22132h();
        return F.mo42630b();
    }

    public abstract void mo22306M(AbstractC5759q2 q2Var, AbstractC5468G g);

    public abstract void mo22305N(AbstractC5759q2 q2Var, AbstractC5468G g);

    public abstract AbstractC5632P0 mo22304R(AbstractC5468G g, boolean z, AbstractC5531m mVar);

    public abstract long mo22303S(AbstractC5468G g);

    public abstract int mo22302Y();

    public abstract int mo22301Z();

    public abstract AbstractC5592H0 mo22189k0(long j, AbstractC5531m mVar);

    public abstract AbstractC5759q2 mo22300q0(AbstractC5759q2 q2Var, AbstractC5468G g);

    public abstract AbstractC5759q2 mo22299r0(AbstractC5759q2 q2Var);

    public abstract AbstractC5468G mo22298s0(AbstractC5468G g);
}
