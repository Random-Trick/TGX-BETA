package a5;

import a7.q;
import android.util.Pair;
import c5.l0;
import c5.w;
import java.util.Arrays;
import m3.c3;
import m3.d3;
import m3.e3;
import m3.o3;
import m3.t3;
import o4.p0;
import o4.r0;
import o4.s;

public abstract class t extends b0 {
    public a f532c;

    public static final class a {
        public final int f533a;
        public final String[] f534b;
        public final int[] f535c;
        public final r0[] f536d;
        public final int[] f537e;
        public final int[][][] f538f;
        public final r0 f539g;

        public a(String[] strArr, int[] iArr, r0[] r0VarArr, int[] iArr2, int[][][] iArr3, r0 r0Var) {
            this.f534b = strArr;
            this.f535c = iArr;
            this.f536d = r0VarArr;
            this.f538f = iArr3;
            this.f537e = iArr2;
            this.f539g = r0Var;
            this.f533a = iArr.length;
        }

        public int a(int i10, int i11, int i12) {
            return this.f538f[i10][i11][i12];
        }

        public int b() {
            return this.f533a;
        }

        public int c(int i10) {
            return this.f535c[i10];
        }

        public r0 d(int i10) {
            return this.f536d[i10];
        }

        public int e(int i10, int i11, int i12) {
            return c3.e(a(i10, i11, i12));
        }

        public r0 f() {
            return this.f539g;
        }
    }

    public static t3 f(u[] uVarArr, a aVar) {
        q.a aVar2 = new q.a();
        for (int i10 = 0; i10 < aVar.b(); i10++) {
            r0 d10 = aVar.d(i10);
            u uVar = uVarArr[i10];
            for (int i11 = 0; i11 < d10.f19175a; i11++) {
                p0 b10 = d10.b(i11);
                int i12 = b10.f19166a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f19166a; i13++) {
                    iArr[i13] = aVar.e(i10, i11, i13);
                    zArr[i13] = (uVar == null || !uVar.a().equals(b10) || uVar.d(i13) == -1) ? false : true;
                }
                aVar2.a(new t3.a(b10, iArr, aVar.c(i10), zArr));
            }
        }
        r0 f10 = aVar.f();
        for (int i14 = 0; i14 < f10.f19175a; i14++) {
            p0 b11 = f10.b(i14);
            int[] iArr2 = new int[b11.f19166a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new t3.a(b11, iArr2, w.f(b11.b(0).U), new boolean[b11.f19166a]));
        }
        return new t3(aVar2.h());
    }

    public static int g(d3[] d3VarArr, p0 p0Var, int[] iArr, boolean z10) {
        int length = d3VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < d3VarArr.length; i11++) {
            d3 d3Var = d3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < p0Var.f19166a; i13++) {
                i12 = Math.max(i12, c3.e(d3Var.a(p0Var.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    public static int[] h(d3 d3Var, p0 p0Var) {
        int[] iArr = new int[p0Var.f19166a];
        for (int i10 = 0; i10 < p0Var.f19166a; i10++) {
            iArr[i10] = d3Var.a(p0Var.b(i10));
        }
        return iArr;
    }

    public static int[] i(d3[] d3VarArr) {
        int length = d3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = d3VarArr[i10].q();
        }
        return iArr;
    }

    @Override
    public final void d(Object obj) {
        this.f532c = (a) obj;
    }

    @Override
    public final c0 e(d3[] d3VarArr, r0 r0Var, s.b bVar, o3 o3Var) {
        int[] iArr;
        int[] iArr2 = new int[d3VarArr.length + 1];
        int length = d3VarArr.length + 1;
        p0[][] p0VarArr = new p0[length];
        int[][][] iArr3 = new int[d3VarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = r0Var.f19175a;
            p0VarArr[i10] = new p0[i11];
            iArr3[i10] = new int[i11];
        }
        int[] i12 = i(d3VarArr);
        for (int i13 = 0; i13 < r0Var.f19175a; i13++) {
            p0 b10 = r0Var.b(i13);
            int g10 = g(d3VarArr, b10, iArr2, w.f(b10.b(0).U) == 5);
            if (g10 == d3VarArr.length) {
                iArr = new int[b10.f19166a];
            } else {
                iArr = h(d3VarArr[g10], b10);
            }
            int i14 = iArr2[g10];
            p0VarArr[g10][i14] = b10;
            iArr3[g10][i14] = iArr;
            iArr2[g10] = iArr2[g10] + 1;
        }
        r0[] r0VarArr = new r0[d3VarArr.length];
        String[] strArr = new String[d3VarArr.length];
        int[] iArr4 = new int[d3VarArr.length];
        for (int i15 = 0; i15 < d3VarArr.length; i15++) {
            int i16 = iArr2[i15];
            r0VarArr[i15] = new r0((p0[]) l0.v0(p0VarArr[i15], i16));
            iArr3[i15] = (int[][]) l0.v0(iArr3[i15], i16);
            strArr[i15] = d3VarArr[i15].b();
            iArr4[i15] = d3VarArr[i15].k();
        }
        a aVar = new a(strArr, iArr4, r0VarArr, i12, iArr3, new r0((p0[]) l0.v0(p0VarArr[d3VarArr.length], iArr2[d3VarArr.length])));
        Pair<e3[], r[]> j10 = j(aVar, iArr3, i12, bVar, o3Var);
        return new c0((e3[]) j10.first, (r[]) j10.second, f((u[]) j10.second, aVar), aVar);
    }

    public abstract Pair<e3[], r[]> j(a aVar, int[][][] iArr, int[] iArr2, s.b bVar, o3 o3Var);
}
