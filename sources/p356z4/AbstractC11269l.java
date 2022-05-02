package p356z4;

import android.util.Pair;
import java.util.Arrays;
import p020b5.C1216l0;
import p020b5.C1234w;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6705u2;
import p174m3.C6644l3;
import p174m3.C6701t2;
import p174m3.C6709v2;
import p187n4.AbstractC7230t;
import p187n4.C7227r0;
import p187n4.C7233t0;
import p358z6.AbstractC11396q;

public abstract class AbstractC11269l extends AbstractC11280t {
    public C11270a f36122c;

    public static final class C11270a {
        public final int f36123a;
        public final String[] f36124b;
        public final int[] f36125c;
        public final C7233t0[] f36126d;
        public final int[] f36127e;
        public final int[][][] f36128f;
        public final C7233t0 f36129g;

        public C11270a(String[] strArr, int[] iArr, C7233t0[] t0VarArr, int[] iArr2, int[][][] iArr3, C7233t0 t0Var) {
            this.f36124b = strArr;
            this.f36125c = iArr;
            this.f36126d = t0VarArr;
            this.f36128f = iArr3;
            this.f36127e = iArr2;
            this.f36129g = t0Var;
            this.f36123a = iArr.length;
        }

        public int m1015a() {
            return this.f36123a;
        }

        public int m1014b(int i) {
            return this.f36125c[i];
        }

        public C7233t0 m1013c(int i) {
            return this.f36126d[i];
        }

        public int m1012d(int i, int i2, int i3) {
            return C6701t2.m19436c(this.f36128f[i][i2][i3]);
        }

        public C7233t0 m1011e() {
            return this.f36129g;
        }
    }

    public static C6644l3 m1020f(AbstractC11271m[] mVarArr, C11270a aVar) {
        AbstractC11396q.C11397a aVar2 = new AbstractC11396q.C11397a();
        for (int i = 0; i < aVar.m1015a(); i++) {
            C7233t0 c = aVar.m1013c(i);
            AbstractC11271m mVar = mVarArr[i];
            for (int i2 = 0; i2 < c.f23032a; i2++) {
                C7227r0 b = c.m17245b(i2);
                int i3 = b.f23026a;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < b.f23026a; i4++) {
                    iArr[i4] = aVar.m1012d(i, i2, i4);
                    zArr[i4] = (mVar == null || mVar.mo1010a() != b || mVar.mo1007l(i4) == -1) ? false : true;
                }
                aVar2.m757d(new C6644l3.C6645a(b, iArr, aVar.m1014b(i), zArr));
            }
        }
        C7233t0 e = aVar.m1011e();
        for (int i5 = 0; i5 < e.f23032a; i5++) {
            C7227r0 b2 = e.m17245b(i5);
            int[] iArr2 = new int[b2.f23026a];
            Arrays.fill(iArr2, 0);
            aVar2.m757d(new C6644l3.C6645a(b2, iArr2, C1234w.m37866h(b2.m17272b(0).f20575U), new boolean[b2.f23026a]));
        }
        return new C6644l3(aVar2.m756e());
    }

    public static int m1019g(AbstractC6705u2[] u2VarArr, C7227r0 r0Var, int[] iArr, boolean z) {
        int length = u2VarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < u2VarArr.length; i2++) {
            AbstractC6705u2 u2Var = u2VarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < r0Var.f23026a; i4++) {
                i3 = Math.max(i3, C6701t2.m19436c(u2Var.mo11838a(r0Var.m17272b(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    public static int[] m1018h(AbstractC6705u2 u2Var, C7227r0 r0Var) {
        int[] iArr = new int[r0Var.f23026a];
        for (int i = 0; i < r0Var.f23026a; i++) {
            iArr[i] = u2Var.mo11838a(r0Var.m17272b(i));
        }
        return iArr;
    }

    public static int[] m1017i(AbstractC6705u2[] u2VarArr) {
        int length = u2VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = u2VarArr[i].mo19431s();
        }
        return iArr;
    }

    @Override
    public final void mo960d(Object obj) {
        this.f36122c = (C11270a) obj;
    }

    @Override
    public final C11282u mo959e(AbstractC6705u2[] u2VarArr, C7233t0 t0Var, AbstractC7230t.C7231a aVar, AbstractC6604g3 g3Var) {
        int[] iArr;
        int[] iArr2 = new int[u2VarArr.length + 1];
        int length = u2VarArr.length + 1;
        C7227r0[][] r0VarArr = new C7227r0[length];
        int[][][] iArr3 = new int[u2VarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = t0Var.f23032a;
            r0VarArr[i] = new C7227r0[i2];
            iArr3[i] = new int[i2];
        }
        int[] i3 = m1017i(u2VarArr);
        for (int i4 = 0; i4 < t0Var.f23032a; i4++) {
            C7227r0 b = t0Var.m17245b(i4);
            int g = m1019g(u2VarArr, b, iArr2, C1234w.m37866h(b.m17272b(0).f20575U) == 5);
            if (g == u2VarArr.length) {
                iArr = new int[b.f23026a];
            } else {
                iArr = m1018h(u2VarArr[g], b);
            }
            int i5 = iArr2[g];
            r0VarArr[g][i5] = b;
            iArr3[g][i5] = iArr;
            iArr2[g] = iArr2[g] + 1;
        }
        C7233t0[] t0VarArr = new C7233t0[u2VarArr.length];
        String[] strArr = new String[u2VarArr.length];
        int[] iArr4 = new int[u2VarArr.length];
        for (int i6 = 0; i6 < u2VarArr.length; i6++) {
            int i7 = iArr2[i6];
            t0VarArr[i6] = new C7233t0((C7227r0[]) C1216l0.m37948u0(r0VarArr[i6], i7));
            iArr3[i6] = (int[][]) C1216l0.m37948u0(iArr3[i6], i7);
            strArr[i6] = u2VarArr[i6].mo11837b();
            iArr4[i6] = u2VarArr[i6].mo19432k();
        }
        C11270a aVar2 = new C11270a(strArr, iArr4, t0VarArr, i3, iArr3, new C7233t0((C7227r0[]) C1216l0.m37948u0(r0VarArr[u2VarArr.length], iArr2[u2VarArr.length])));
        Pair<C6709v2[], AbstractC11265j[]> j = mo1016j(aVar2, iArr3, i3, aVar, g3Var);
        return new C11282u((C6709v2[]) j.first, (AbstractC11265j[]) j.second, m1020f((AbstractC11271m[]) j.second, aVar2), aVar2);
    }

    public abstract Pair<C6709v2[], AbstractC11265j[]> mo1016j(C11270a aVar, int[][][] iArr, int[] iArr2, AbstractC7230t.C7231a aVar2, AbstractC6604g3 g3Var);
}
