package a5;

import a5.r;
import a7.b0;
import a7.q;
import a7.z;
import b5.e;
import c5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m3.o3;
import o4.p0;
import o4.s;

public class a extends c {
    public final e f400h;
    public final long f401i;
    public final long f402j;
    public final long f403k;
    public final int f404l;
    public final int f405m;
    public final float f406n;
    public final float f407o;
    public final q<C0013a> f408p;
    public final d f409q;
    public float f410r;
    public int f411s;
    public int f412t;
    public long f413u;

    public static final class C0013a {
        public final long f414a;
        public final long f415b;

        public C0013a(long j10, long j11) {
            this.f414a = j10;
            this.f415b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0013a)) {
                return false;
            }
            C0013a aVar = (C0013a) obj;
            return this.f414a == aVar.f414a && this.f415b == aVar.f415b;
        }

        public int hashCode() {
            return (((int) this.f414a) * 31) + ((int) this.f415b);
        }
    }

    public static class b implements r.b {
        public final int f416a;
        public final int f417b;
        public final int f418c;
        public final int f419d;
        public final int f420e;
        public final float f421f;
        public final float f422g;
        public final d f423h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override
        public final r[] a(r.a[] aVarArr, e eVar, s.b bVar, o3 o3Var) {
            r rVar;
            q q10 = a.q(aVarArr);
            r[] rVarArr = new r[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f528b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            rVar = new s(aVar.f527a, iArr[0], aVar.f529c);
                        } else {
                            rVar = b(aVar.f527a, iArr, aVar.f529c, eVar, (q) q10.get(i10));
                        }
                        rVarArr[i10] = rVar;
                    }
                }
            }
            return rVarArr;
        }

        public a b(p0 p0Var, int[] iArr, int i10, e eVar, q<C0013a> qVar) {
            return new a(p0Var, iArr, i10, eVar, this.f416a, this.f417b, this.f418c, this.f419d, this.f420e, this.f421f, this.f422g, qVar, this.f423h);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, d.f4804a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, d dVar) {
            this.f416a = i10;
            this.f417b = i11;
            this.f418c = i12;
            this.f419d = i13;
            this.f420e = i14;
            this.f421f = f10;
            this.f422g = f11;
            this.f423h = dVar;
        }
    }

    public a(p0 p0Var, int[] iArr, int i10, e eVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0013a> list, d dVar) {
        super(p0Var, iArr, i10);
        e eVar2;
        long j13;
        if (j12 < j10) {
            c5.s.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            eVar2 = eVar;
            j13 = j10;
        } else {
            eVar2 = eVar;
            j13 = j12;
        }
        this.f400h = eVar2;
        this.f401i = j10 * 1000;
        this.f402j = j11 * 1000;
        this.f403k = j13 * 1000;
        this.f404l = i11;
        this.f405m = i12;
        this.f406n = f10;
        this.f407o = f11;
        this.f408p = q.z(list);
        this.f409q = dVar;
        this.f410r = 1.0f;
        this.f412t = 0;
        this.f413u = -9223372036854775807L;
    }

    public static void p(List<q.a<C0013a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            q.a<C0013a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0013a(j10, jArr[i10]));
            }
        }
    }

    public static q<q<C0013a>> q(r.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f528b.length <= 1) {
                arrayList.add(null);
            } else {
                q.a x10 = q.x();
                x10.a(new C0013a(0L, 0L));
                arrayList.add(x10);
            }
        }
        long[][] r10 = r(aVarArr);
        int[] iArr = new int[r10.length];
        long[] jArr = new long[r10.length];
        for (int i11 = 0; i11 < r10.length; i11++) {
            jArr[i11] = r10[i11].length == 0 ? 0L : r10[i11][0];
        }
        p(arrayList, jArr);
        q<Integer> s10 = s(r10);
        for (int i12 = 0; i12 < s10.size(); i12++) {
            int intValue = s10.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = r10[intValue][i13];
            p(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        p(arrayList, jArr);
        q.a x11 = q.x();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            q.a aVar = (q.a) arrayList.get(i15);
            x11.a(aVar == null ? q.D() : aVar.h());
        }
        return x11.h();
    }

    public static long[][] r(r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f528b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f528b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = aVar.f527a.b(iArr[i11]).Q;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public static q<Integer> s(long[][] jArr) {
        z c10 = b0.a().a().c();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    c10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return q.z(c10.values());
    }

    @Override
    public void h() {
    }

    @Override
    public int i() {
        return this.f411s;
    }

    @Override
    public void k() {
        this.f413u = -9223372036854775807L;
    }

    @Override
    public void m(float f10) {
        this.f410r = f10;
    }
}
