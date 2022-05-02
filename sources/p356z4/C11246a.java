package p356z4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006a5.AbstractC0134e;
import p020b5.AbstractC1192d;
import p020b5.C1230s;
import p174m3.AbstractC6604g3;
import p187n4.AbstractC7230t;
import p187n4.C7227r0;
import p356z4.AbstractC11265j;
import p358z6.AbstractC11329b0;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11423z;

public class C11246a extends AbstractC11250c {
    public final AbstractC0134e f36007h;
    public final long f36008i;
    public final long f36009j;
    public final long f36010k;
    public final int f36011l;
    public final int f36012m;
    public final float f36013n;
    public final float f36014o;
    public final AbstractC11396q<C11247a> f36015p;
    public final AbstractC1192d f36016q;
    public float f36017r;
    public int f36018s;
    public int f36019t;
    public long f36020u;

    public static final class C11247a {
        public final long f36021a;
        public final long f36022b;

        public C11247a(long j, long j2) {
            this.f36021a = j;
            this.f36022b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11247a)) {
                return false;
            }
            C11247a aVar = (C11247a) obj;
            return this.f36021a == aVar.f36021a && this.f36022b == aVar.f36022b;
        }

        public int hashCode() {
            return (((int) this.f36021a) * 31) + ((int) this.f36022b);
        }
    }

    public static class C11248b implements AbstractC11265j.AbstractC11267b {
        public final int f36023a;
        public final int f36024b;
        public final int f36025c;
        public final int f36026d;
        public final int f36027e;
        public final float f36028f;
        public final float f36029g;
        public final AbstractC1192d f36030h;

        public C11248b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override
        public final AbstractC11265j[] mo1022a(AbstractC11265j.C11266a[] aVarArr, AbstractC0134e eVar, AbstractC7230t.C7231a aVar, AbstractC6604g3 g3Var) {
            AbstractC11265j jVar;
            AbstractC11396q q = C11246a.m1120q(aVarArr);
            AbstractC11265j[] jVarArr = new AbstractC11265j[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                AbstractC11265j.C11266a aVar2 = aVarArr[i];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f36115b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            jVar = new C11268k(aVar2.f36114a, iArr[0], aVar2.f36116c);
                        } else {
                            jVar = m1117b(aVar2.f36114a, iArr, aVar2.f36116c, eVar, (AbstractC11396q) q.get(i));
                        }
                        jVarArr[i] = jVar;
                    }
                }
            }
            return jVarArr;
        }

        public C11246a m1117b(C7227r0 r0Var, int[] iArr, int i, AbstractC0134e eVar, AbstractC11396q<C11247a> qVar) {
            return new C11246a(r0Var, iArr, i, eVar, this.f36023a, this.f36024b, this.f36025c, this.f36026d, this.f36027e, this.f36028f, this.f36029g, qVar, this.f36030h);
        }

        public C11248b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, AbstractC1192d.f4481a);
        }

        public C11248b(int i, int i2, int i3, int i4, int i5, float f, float f2, AbstractC1192d dVar) {
            this.f36023a = i;
            this.f36024b = i2;
            this.f36025c = i3;
            this.f36026d = i4;
            this.f36027e = i5;
            this.f36028f = f;
            this.f36029g = f2;
            this.f36030h = dVar;
        }
    }

    public C11246a(C7227r0 r0Var, int[] iArr, int i, AbstractC0134e eVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C11247a> list, AbstractC1192d dVar) {
        super(r0Var, iArr, i);
        AbstractC0134e eVar2;
        long j4;
        if (j3 < j) {
            C1230s.m37881i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j4 = j;
        } else {
            eVar2 = eVar;
            j4 = j3;
        }
        this.f36007h = eVar2;
        this.f36008i = j * 1000;
        this.f36009j = j2 * 1000;
        this.f36010k = j4 * 1000;
        this.f36011l = i2;
        this.f36012m = i3;
        this.f36013n = f;
        this.f36014o = f2;
        this.f36015p = AbstractC11396q.m758z(list);
        this.f36016q = dVar;
        this.f36017r = 1.0f;
        this.f36019t = 0;
        this.f36020u = -9223372036854775807L;
    }

    public static void m1121p(List<AbstractC11396q.C11397a<C11247a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC11396q.C11397a<C11247a> aVar = list.get(i);
            if (aVar != null) {
                aVar.m757d(new C11247a(j, jArr[i]));
            }
        }
    }

    public static AbstractC11396q<AbstractC11396q<C11247a>> m1120q(AbstractC11265j.C11266a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i] == null || aVarArr[i].f36115b.length <= 1) {
                arrayList.add(null);
            } else {
                AbstractC11396q.C11397a x = AbstractC11396q.m760x();
                x.m757d(new C11247a(0L, 0L));
                arrayList.add(x);
            }
        }
        long[][] r = m1119r(aVarArr);
        int[] iArr = new int[r.length];
        long[] jArr = new long[r.length];
        for (int i2 = 0; i2 < r.length; i2++) {
            jArr[i2] = r[i2].length == 0 ? 0L : r[i2][0];
        }
        m1121p(arrayList, jArr);
        AbstractC11396q<Integer> s = m1118s(r);
        for (int i3 = 0; i3 < s.size(); i3++) {
            int intValue = s.get(i3).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = r[intValue][i4];
            m1121p(arrayList, jArr);
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        m1121p(arrayList, jArr);
        AbstractC11396q.C11397a x2 = AbstractC11396q.m760x();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            AbstractC11396q.C11397a aVar = (AbstractC11396q.C11397a) arrayList.get(i6);
            x2.m757d(aVar == null ? AbstractC11396q.m768D() : aVar.m756e());
        }
        return x2.m756e();
    }

    public static long[][] m1119r(AbstractC11265j.C11266a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            AbstractC11265j.C11266a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f36115b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.f36115b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = aVar.f36114a.m17272b(iArr[i2]).f20571Q;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static AbstractC11396q<Integer> m1118s(long[][] jArr) {
        AbstractC11423z c = AbstractC11329b0.m891a().m888a().mo885c();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                int length = jArr[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double d = 0.0d;
                    if (i2 >= jArr[i].length) {
                        break;
                    }
                    if (jArr[i][i2] != -1) {
                        d = Math.log(jArr[i][i2]);
                    }
                    dArr[i2] = d;
                    i2++;
                }
                int i3 = length - 1;
                double d2 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d3 = dArr[i4];
                    i4++;
                    c.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i4]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i));
                }
            }
        }
        return AbstractC11396q.m758z(c.values());
    }

    @Override
    public int mo1021b() {
        return this.f36018s;
    }

    @Override
    public void mo1028e() {
        this.f36020u = -9223372036854775807L;
    }

    @Override
    public void mo1026h() {
    }

    @Override
    public void mo1025i(float f) {
        this.f36017r = f;
    }
}
