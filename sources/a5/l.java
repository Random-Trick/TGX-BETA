package a5;

import a5.a;
import a5.a0;
import a5.l;
import a5.r;
import a5.t;
import a5.y;
import a7.h0;
import a7.k;
import a7.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c5.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m3.c3;
import m3.e3;
import m3.h;
import m3.o3;
import m3.q1;
import o4.p0;
import o4.r0;
import o4.s;
import org.thunderdog.challegram.Log;

public class l extends t {
    public static final h0<Integer> f489f = h0.a(a5.h.f485a);
    public static final h0<Integer> f490g = h0.a(a5.g.f484a);
    public final r.b f491d;
    public final AtomicReference<d> f492e;

    public static final class b extends h<b> implements Comparable<b> {
        public final int N;
        public final boolean O;
        public final String P = l.M(this.M.f16902c);
        public final d Q;
        public final boolean R;
        public final int S;
        public final int T;
        public final int U;
        public final boolean V;
        public final int W;
        public final int X;
        public final boolean Y;
        public final int Z;
        public final int f493a0;
        public final int f494b0;
        public final int f495c0;
        public final boolean f496d0;
        public final boolean f497e0;

        public b(int i10, p0 p0Var, int i11, d dVar, int i12, boolean z10) {
            super(i10, p0Var, i11);
            int i13;
            int i14;
            int i15;
            this.Q = dVar;
            boolean z11 = false;
            this.R = l.E(i12, false);
            int i16 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i16 >= dVar.W.size()) {
                    i16 = Integer.MAX_VALUE;
                    i14 = 0;
                    break;
                }
                i14 = l.w(this.M, dVar.W.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.T = i16;
            this.S = i14;
            this.U = l.A(this.M.N, dVar.X);
            q1 q1Var = this.M;
            int i17 = q1Var.N;
            this.V = i17 == 0 || (i17 & 1) != 0;
            this.Y = (q1Var.M & 1) != 0;
            int i18 = q1Var.f16908h0;
            this.Z = i18;
            this.f493a0 = q1Var.f16909i0;
            int i19 = q1Var.Q;
            this.f494b0 = i19;
            this.O = (i19 == -1 || i19 <= dVar.Z) && (i18 == -1 || i18 <= dVar.Y);
            String[] a02 = l0.a0();
            int i20 = 0;
            while (true) {
                if (i20 >= a02.length) {
                    i20 = Integer.MAX_VALUE;
                    i15 = 0;
                    break;
                }
                i15 = l.w(this.M, a02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.W = i20;
            this.X = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f428a0.size()) {
                    String str = this.M.U;
                    if (str != null && str.equals(dVar.f428a0.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f495c0 = i13;
            this.f496d0 = c3.d(i12) == 128;
            this.f497e0 = c3.f(i12) == 64 ? true : z11;
            this.N = f(i12, z10);
        }

        public static int c(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static q<b> e(int i10, p0 p0Var, d dVar, int[] iArr, boolean z10) {
            q.a x10 = q.x();
            for (int i11 = 0; i11 < p0Var.f19166a; i11++) {
                x10.a(new b(i10, p0Var, i11, dVar, iArr[i11], z10));
            }
            return x10.h();
        }

        @Override
        public int a() {
            return this.N;
        }

        public int compareTo(b bVar) {
            h0 h0Var;
            if (!this.O || !this.R) {
                h0Var = l.f489f.d();
            } else {
                h0Var = l.f489f;
            }
            k f10 = k.j().g(this.R, bVar.R).f(Integer.valueOf(this.T), Integer.valueOf(bVar.T), h0.b().d()).d(this.S, bVar.S).d(this.U, bVar.U).g(this.Y, bVar.Y).g(this.V, bVar.V).f(Integer.valueOf(this.W), Integer.valueOf(bVar.W), h0.b().d()).d(this.X, bVar.X).g(this.O, bVar.O).f(Integer.valueOf(this.f495c0), Integer.valueOf(bVar.f495c0), h0.b().d()).f(Integer.valueOf(this.f494b0), Integer.valueOf(bVar.f494b0), this.Q.f434e0 ? l.f489f.d() : l.f490g).g(this.f496d0, bVar.f496d0).g(this.f497e0, bVar.f497e0).f(Integer.valueOf(this.Z), Integer.valueOf(bVar.Z), h0Var).f(Integer.valueOf(this.f493a0), Integer.valueOf(bVar.f493a0), h0Var);
            Integer valueOf = Integer.valueOf(this.f494b0);
            Integer valueOf2 = Integer.valueOf(bVar.f494b0);
            if (!l0.c(this.P, bVar.P)) {
                h0Var = l.f490g;
            }
            return f10.f(valueOf, valueOf2, h0Var).i();
        }

        public final int f(int i10, boolean z10) {
            if (!l.E(i10, this.Q.f510v0)) {
                return 0;
            }
            if (!this.O && !this.Q.f505q0) {
                return 0;
            }
            if (l.E(i10, false) && this.O && this.M.Q != -1) {
                d dVar = this.Q;
                if (!dVar.f435f0 && !dVar.f434e0 && (dVar.f512x0 || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.Q;
            if ((dVar.f508t0 || ((i11 = this.M.f16908h0) != -1 && i11 == bVar.M.f16908h0)) && (dVar.f506r0 || ((str = this.M.U) != null && TextUtils.equals(str, bVar.M.U)))) {
                d dVar2 = this.Q;
                if ((dVar2.f507s0 || ((i10 = this.M.f16909i0) != -1 && i10 == bVar.M.f16909i0)) && (dVar2.f509u0 || (this.f496d0 == bVar.f496d0 && this.f497e0 == bVar.f497e0))) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c implements Comparable<c> {
        public final boolean f498a;
        public final boolean f499b;

        public c(q1 q1Var, int i10) {
            this.f498a = (q1Var.M & 1) == 0 ? false : true;
            this.f499b = l.E(i10, false);
        }

        public int compareTo(c cVar) {
            return k.j().g(this.f499b, cVar.f499b).g(this.f498a, cVar.f498a).i();
        }
    }

    public static final class d extends a0 {
        public static final d A0;
        @Deprecated
        public static final d B0;
        public static final h.a<d> C0 = m.f523a;
        public final int f500l0;
        public final boolean f501m0;
        public final boolean f502n0;
        public final boolean f503o0;
        public final boolean f504p0;
        public final boolean f505q0;
        public final boolean f506r0;
        public final boolean f507s0;
        public final boolean f508t0;
        public final boolean f509u0;
        public final boolean f510v0;
        public final boolean f511w0;
        public final boolean f512x0;
        public final SparseArray<Map<r0, f>> f513y0;
        public final SparseBooleanArray f514z0;

        static {
            d U = new e().z();
            A0 = U;
            B0 = U;
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static boolean g(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean h(SparseArray<Map<r0, f>> sparseArray, SparseArray<Map<r0, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !i(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean i(java.util.Map<o4.r0, a5.l.f> r4, java.util.Map<o4.r0, a5.l.f> r5) {
            throw new UnsupportedOperationException("Method not decompiled: a5.l.d.i(java.util.Map, java.util.Map):boolean");
        }

        public static d j(Context context) {
            return new e(context).z();
        }

        public static d n(Bundle bundle) {
            return new e(bundle).z();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f501m0 == dVar.f501m0 && this.f502n0 == dVar.f502n0 && this.f503o0 == dVar.f503o0 && this.f504p0 == dVar.f504p0 && this.f505q0 == dVar.f505q0 && this.f506r0 == dVar.f506r0 && this.f507s0 == dVar.f507s0 && this.f508t0 == dVar.f508t0 && this.f509u0 == dVar.f509u0 && this.f500l0 == dVar.f500l0 && this.f510v0 == dVar.f510v0 && this.f511w0 == dVar.f511w0 && this.f512x0 == dVar.f512x0 && g(this.f514z0, dVar.f514z0) && h(this.f513y0, dVar.f513y0);
        }

        @Override
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f501m0 ? 1 : 0)) * 31) + (this.f502n0 ? 1 : 0)) * 31) + (this.f503o0 ? 1 : 0)) * 31) + (this.f504p0 ? 1 : 0)) * 31) + (this.f505q0 ? 1 : 0)) * 31) + (this.f506r0 ? 1 : 0)) * 31) + (this.f507s0 ? 1 : 0)) * 31) + (this.f508t0 ? 1 : 0)) * 31) + (this.f509u0 ? 1 : 0)) * 31) + this.f500l0) * 31) + (this.f510v0 ? 1 : 0)) * 31) + (this.f511w0 ? 1 : 0)) * 31) + (this.f512x0 ? 1 : 0);
        }

        public final boolean k(int i10) {
            return this.f514z0.get(i10);
        }

        @Deprecated
        public final f l(int i10, r0 r0Var) {
            Map<r0, f> map = this.f513y0.get(i10);
            if (map != null) {
                return map.get(r0Var);
            }
            return null;
        }

        @Deprecated
        public final boolean m(int i10, r0 r0Var) {
            Map<r0, f> map = this.f513y0.get(i10);
            return map != null && map.containsKey(r0Var);
        }

        public d(e eVar) {
            super(eVar);
            this.f501m0 = eVar.f515z;
            this.f502n0 = eVar.A;
            this.f503o0 = eVar.B;
            this.f504p0 = eVar.C;
            this.f505q0 = eVar.D;
            this.f506r0 = eVar.E;
            this.f507s0 = eVar.F;
            this.f508t0 = eVar.G;
            this.f509u0 = eVar.H;
            this.f500l0 = eVar.I;
            this.f510v0 = eVar.J;
            this.f511w0 = eVar.K;
            this.f512x0 = eVar.L;
            this.f513y0 = eVar.M;
            this.f514z0 = eVar.N;
        }
    }

    public static final class e extends a0.a {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public int I;
        public boolean J;
        public boolean K;
        public boolean L;
        public final SparseArray<Map<r0, f>> M;
        public final SparseBooleanArray N;
        public boolean f515z;

        public d z() {
            return new d(this);
        }

        public final void V() {
            this.f515z = true;
            this.A = false;
            this.B = true;
            this.C = false;
            this.D = true;
            this.E = false;
            this.F = false;
            this.G = false;
            this.H = false;
            this.I = 0;
            this.J = true;
            this.K = false;
            this.L = true;
        }

        public final SparseBooleanArray W(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }

        public e X(boolean z10) {
            this.G = z10;
            return this;
        }

        public e Y(boolean z10) {
            this.H = z10;
            return this;
        }

        public e Z(boolean z10) {
            this.E = z10;
            return this;
        }

        public e a0(boolean z10) {
            this.F = z10;
            return this;
        }

        public e b0(boolean z10) {
            this.L = z10;
            return this;
        }

        public e c0(boolean z10) {
            this.C = z10;
            return this;
        }

        public e d0(boolean z10) {
            this.A = z10;
            return this;
        }

        public e e0(boolean z10) {
            this.B = z10;
            return this;
        }

        public e f0(int i10) {
            this.I = i10;
            return this;
        }

        public e g0(boolean z10) {
            this.D = z10;
            return this;
        }

        public e h0(boolean z10) {
            this.J = z10;
            return this;
        }

        public e i0(boolean z10) {
            this.f515z = z10;
            return this;
        }

        public e B(Context context) {
            super.B(context);
            return this;
        }

        @Deprecated
        public final e k0(int i10, r0 r0Var, f fVar) {
            Map<r0, f> map = this.M.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.M.put(i10, map);
            }
            if (map.containsKey(r0Var) && l0.c(map.get(r0Var), fVar)) {
                return this;
            }
            map.put(r0Var, fVar);
            return this;
        }

        public final void l0(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.c(1011));
            List c10 = c5.c.c(r0.N, bundle.getParcelableArrayList(d.c(1012)), q.D());
            SparseArray d10 = c5.c.d(f.N, bundle.getSparseParcelableArray(d.c(1013)), new SparseArray());
            if (intArray != null && intArray.length == c10.size()) {
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    k0(intArray[i10], (r0) c10.get(i10), (f) d10.get(i10));
                }
            }
        }

        public e m0(boolean z10) {
            this.K = z10;
            return this;
        }

        public e D(int i10, int i11, boolean z10) {
            super.D(i10, i11, z10);
            return this;
        }

        public e E(Context context, boolean z10) {
            super.E(context, z10);
            return this;
        }

        @Deprecated
        public e() {
            this.M = new SparseArray<>();
            this.N = new SparseBooleanArray();
            V();
        }

        public e(Context context) {
            super(context);
            this.M = new SparseArray<>();
            this.N = new SparseBooleanArray();
            V();
        }

        public e(Bundle bundle) {
            super(bundle);
            d dVar = d.A0;
            i0(bundle.getBoolean(d.c(1000), dVar.f501m0));
            d0(bundle.getBoolean(d.c(1001), dVar.f502n0));
            e0(bundle.getBoolean(d.c(1002), dVar.f503o0));
            c0(bundle.getBoolean(d.c(1015), dVar.f504p0));
            g0(bundle.getBoolean(d.c(1003), dVar.f505q0));
            Z(bundle.getBoolean(d.c(1004), dVar.f506r0));
            a0(bundle.getBoolean(d.c(1005), dVar.f507s0));
            X(bundle.getBoolean(d.c(1006), dVar.f508t0));
            Y(bundle.getBoolean(d.c(1016), dVar.f509u0));
            f0(bundle.getInt(d.c(1007), dVar.f500l0));
            h0(bundle.getBoolean(d.c(1008), dVar.f510v0));
            m0(bundle.getBoolean(d.c(1009), dVar.f511w0));
            b0(bundle.getBoolean(d.c(1010), dVar.f512x0));
            this.M = new SparseArray<>();
            l0(bundle);
            this.N = W(bundle.getIntArray(d.c(1014)));
        }
    }

    public static final class f implements m3.h {
        public static final h.a<f> N = n.f524a;
        public final int M;
        public final int f516a;
        public final int[] f517b;
        public final int f518c;

        public f(int i10, int[] iArr, int i11) {
            this.f516a = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f517b = copyOf;
            this.f518c = iArr.length;
            this.M = i11;
            Arrays.sort(copyOf);
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static f c(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(b(0), -1);
            int[] intArray = bundle.getIntArray(b(1));
            int i11 = bundle.getInt(b(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            c5.a.a(z10);
            c5.a.e(intArray);
            return new f(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f516a == fVar.f516a && Arrays.equals(this.f517b, fVar.f517b) && this.M == fVar.M;
        }

        public int hashCode() {
            return (((this.f516a * 31) + Arrays.hashCode(this.f517b)) * 31) + this.M;
        }
    }

    public static final class g extends h<g> implements Comparable<g> {
        public final int N;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        public final int R;
        public final int S;
        public final int T;
        public final int U;
        public final boolean V;

        public g(int i10, p0 p0Var, int i11, d dVar, int i12, String str) {
            super(i10, p0Var, i11);
            q<String> qVar;
            int i13;
            int i14 = 0;
            this.O = l.E(i12, false);
            int i15 = this.M.M & (~dVar.f500l0);
            this.P = (i15 & 1) != 0;
            this.Q = (i15 & 2) != 0;
            int i16 = Integer.MAX_VALUE;
            if (dVar.f430b0.isEmpty()) {
                qVar = q.E("");
            } else {
                qVar = dVar.f430b0;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= qVar.size()) {
                    i13 = 0;
                    break;
                }
                i13 = l.w(this.M, qVar.get(i17), dVar.f433d0);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.R = i16;
            this.S = i13;
            int A = l.A(this.M.N, dVar.f432c0);
            this.T = A;
            this.V = (this.M.N & 1088) != 0;
            int w10 = l.w(this.M, str, l.M(str) == null);
            this.U = w10;
            boolean z10 = i13 > 0 || (dVar.f430b0.isEmpty() && A > 0) || this.P || (this.Q && w10 > 0);
            if (l.E(i12, dVar.f510v0) && z10) {
                i14 = 1;
            }
            this.N = i14;
        }

        public static int c(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static q<g> e(int i10, p0 p0Var, d dVar, int[] iArr, String str) {
            q.a x10 = q.x();
            for (int i11 = 0; i11 < p0Var.f19166a; i11++) {
                x10.a(new g(i10, p0Var, i11, dVar, iArr[i11], str));
            }
            return x10.h();
        }

        @Override
        public int a() {
            return this.N;
        }

        public int compareTo(g gVar) {
            k d10 = k.j().g(this.O, gVar.O).f(Integer.valueOf(this.R), Integer.valueOf(gVar.R), h0.b().d()).d(this.S, gVar.S).d(this.T, gVar.T).g(this.P, gVar.P).f(Boolean.valueOf(this.Q), Boolean.valueOf(gVar.Q), this.S == 0 ? h0.b() : h0.b().d()).d(this.U, gVar.U);
            if (this.T == 0) {
                d10 = d10.h(this.V, gVar.V);
            }
            return d10.i();
        }

        public boolean b(g gVar) {
            return false;
        }
    }

    public static abstract class h<T extends h<T>> {
        public final q1 M;
        public final int f519a;
        public final p0 f520b;
        public final int f521c;

        public interface a<T extends h<T>> {
            List<T> a(int i10, p0 p0Var, int[] iArr);
        }

        public h(int i10, p0 p0Var, int i11) {
            this.f519a = i10;
            this.f520b = p0Var;
            this.f521c = i11;
            this.M = p0Var.b(i11);
        }

        public abstract int a();

        public abstract boolean b(T t10);
    }

    public static final class i extends h<i> {
        public final boolean N;
        public final d O;
        public final boolean P;
        public final boolean Q;
        public final int R;
        public final int S;
        public final int T;
        public final int U;
        public final boolean V;
        public final boolean W;
        public final int X;
        public final boolean Y;
        public final boolean Z;
        public final int f522a0;

        public i(int r5, o4.p0 r6, int r7, a5.l.d r8, int r9, int r10, boolean r11) {
            throw new UnsupportedOperationException("Method not decompiled: a5.l.i.<init>(int, o4.p0, int, a5.l$d, int, int, boolean):void");
        }

        public static int e(i iVar, i iVar2) {
            k g10 = k.j().g(iVar.Q, iVar2.Q).d(iVar.U, iVar2.U).g(iVar.V, iVar2.V).g(iVar.N, iVar2.N).g(iVar.P, iVar2.P).f(Integer.valueOf(iVar.T), Integer.valueOf(iVar2.T), h0.b().d()).g(iVar.Y, iVar2.Y).g(iVar.Z, iVar2.Z);
            if (iVar.Y && iVar.Z) {
                g10 = g10.d(iVar.f522a0, iVar2.f522a0);
            }
            return g10.i();
        }

        public static int f(i iVar, i iVar2) {
            h0 h0Var;
            if (!iVar.N || !iVar.Q) {
                h0Var = l.f489f.d();
            } else {
                h0Var = l.f489f;
            }
            return k.j().f(Integer.valueOf(iVar.R), Integer.valueOf(iVar2.R), iVar.O.f434e0 ? l.f489f.d() : l.f490g).f(Integer.valueOf(iVar.S), Integer.valueOf(iVar2.S), h0Var).f(Integer.valueOf(iVar.R), Integer.valueOf(iVar2.R), h0Var).i();
        }

        public static int g(List<i> list, List<i> list2) {
            return k.j().f((i) Collections.max(list, o.f525a), (i) Collections.max(list2, o.f525a), o.f525a).d(list.size(), list2.size()).f((i) Collections.max(list, p.f526a), (i) Collections.max(list2, p.f526a), p.f526a).i();
        }

        public static q<i> h(int i10, p0 p0Var, d dVar, int[] iArr, int i11) {
            int y10 = l.y(p0Var, dVar.R, dVar.S, dVar.T);
            q.a x10 = q.x();
            for (int i12 = 0; i12 < p0Var.f19166a; i12++) {
                int f10 = p0Var.b(i12).f();
                x10.a(new i(i10, p0Var, i12, dVar, iArr[i12], i11, y10 == Integer.MAX_VALUE || (f10 != -1 && f10 <= y10)));
            }
            return x10.h();
        }

        @Override
        public int a() {
            return this.X;
        }

        public final int i(int i10, int i11) {
            if ((this.M.N & Log.TAG_VIDEO) != 0 || !l.E(i10, this.O.f510v0)) {
                return 0;
            }
            if (!this.N && !this.O.f501m0) {
                return 0;
            }
            if (l.E(i10, false) && this.P && this.N && this.M.Q != -1) {
                d dVar = this.O;
                if (!dVar.f435f0 && !dVar.f434e0 && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        public boolean b(i iVar) {
            return (this.W || l0.c(this.M.U, iVar.M.U)) && (this.O.f504p0 || (this.Y == iVar.Y && this.Z == iVar.Z));
        }
    }

    public l(Context context) {
        this(context, new a.b());
    }

    public static int A(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int B(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean E(int i10, boolean z10) {
        int e10 = c3.e(i10);
        return e10 == 4 || (z10 && e10 == 3);
    }

    public static List H(d dVar, int[] iArr, int i10, p0 p0Var, int[] iArr2) {
        return i.h(i10, p0Var, dVar, iArr2, iArr[i10]);
    }

    public static int I(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static int J(Integer num, Integer num2) {
        return 0;
    }

    public static void K(t.a aVar, int[][][] iArr, e3[] e3VarArr, r[] rVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.b(); i12++) {
            int c10 = aVar.c(i12);
            r rVar = rVarArr[i12];
            if ((c10 == 1 || c10 == 2) && rVar != null && N(iArr[i12], aVar.d(i12), rVar)) {
                if (c10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (!(i11 == -1 || i10 == -1)) {
            z11 = true;
        }
        if (z10 && z11) {
            e3 e3Var = new e3(true);
            e3VarArr[i11] = e3Var;
            e3VarArr[i10] = e3Var;
        }
    }

    public static String M(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean N(int[][] iArr, r0 r0Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int c10 = r0Var.c(rVar.a());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (c3.g(iArr[c10][rVar.c(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static int w(q1 q1Var, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(q1Var.f16902c)) {
            return 4;
        }
        String M = M(str);
        String M2 = M(q1Var.f16902c);
        if (M2 == null || M == null) {
            return (!z10 || M2 != null) ? 0 : 1;
        }
        if (M2.startsWith(M) || M.startsWith(M2)) {
            return 3;
        }
        return l0.C0(M2, "-")[0].equals(l0.C0(M, "-")[0]) ? 2 : 0;
    }

    public static int y(p0 p0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            for (int i14 = 0; i14 < p0Var.f19166a; i14++) {
                q1 b10 = p0Var.b(i14);
                int i15 = b10.Z;
                if (i15 > 0 && (i12 = b10.f16899a0) > 0) {
                    Point z11 = z(z10, i10, i11, i15, i12);
                    int i16 = b10.Z;
                    int i17 = b10.f16899a0;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (z11.x * 0.98f)) && i17 >= ((int) (z11.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    public static android.graphics.Point z(boolean r3, int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: a5.l.z(boolean, int, int, int, int):android.graphics.Point");
    }

    public final boolean C(t.a aVar, d dVar, int i10) {
        return dVar.m(i10, aVar.d(i10));
    }

    public final boolean D(t.a aVar, d dVar, int i10) {
        return dVar.k(i10) || dVar.f437h0.contains(Integer.valueOf(aVar.c(i10)));
    }

    public final void L(SparseArray<Pair<y.a, Integer>> sparseArray, y.a aVar, int i10) {
        if (aVar != null) {
            int b10 = aVar.b();
            Pair<y.a, Integer> pair = sparseArray.get(b10);
            if (pair == null || ((y.a) pair.first).f550b.isEmpty()) {
                sparseArray.put(b10, Pair.create(aVar, Integer.valueOf(i10)));
            }
        }
    }

    public r.a[] O(t.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int b10 = aVar.b();
        r.a[] aVarArr = new r.a[b10];
        Pair<r.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (r.a) T.first;
        }
        Pair<r.a, Integer> P = P(aVar, iArr, iArr2, dVar);
        if (P != null) {
            aVarArr[((Integer) P.second).intValue()] = (r.a) P.first;
        }
        if (P == null) {
            str = null;
        } else {
            Object obj = P.first;
            str = ((r.a) obj).f527a.b(((r.a) obj).f528b[0]).f16902c;
        }
        Pair<r.a, Integer> R = R(aVar, iArr, dVar, str);
        if (R != null) {
            aVarArr[((Integer) R.second).intValue()] = (r.a) R.first;
        }
        for (int i10 = 0; i10 < b10; i10++) {
            int c10 = aVar.c(i10);
            if (!(c10 == 2 || c10 == 1 || c10 == 3)) {
                aVarArr[i10] = Q(c10, aVar.d(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    @SuppressLint({"WrongConstant"})
    public Pair<r.a, Integer> P(t.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.b()) {
                if (2 == aVar.c(i10) && aVar.d(i10).f19175a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return S(1, aVar, iArr, new h.a() {
            @Override
            public final List a(int i11, p0 p0Var, int[] iArr3) {
                List e10;
                e10 = l.b.e(i11, p0Var, l.d.this, iArr3, z10);
                return e10;
            }
        }, a5.i.f486a);
    }

    public r.a Q(int i10, r0 r0Var, int[][] iArr, d dVar) {
        p0 p0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < r0Var.f19175a; i12++) {
            p0 b10 = r0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f19166a; i13++) {
                if (E(iArr2[i13], dVar.f510v0)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        p0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (p0Var == null) {
            return null;
        }
        return new r.a(p0Var, i11);
    }

    @SuppressLint({"WrongConstant"})
    public Pair<r.a, Integer> R(t.a aVar, int[][][] iArr, final d dVar, final String str) {
        return S(3, aVar, iArr, new h.a() {
            @Override
            public final List a(int i10, p0 p0Var, int[] iArr2) {
                List e10;
                e10 = l.g.e(i10, p0Var, l.d.this, iArr2, str);
                return e10;
            }
        }, j.f487a);
    }

    public final <T extends h<T>> Pair<r.a, Integer> S(int i10, t.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        Object obj;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int b10 = aVar.b();
        int i12 = 0;
        while (i12 < b10) {
            if (i10 == aVar3.c(i12)) {
                r0 d10 = aVar3.d(i12);
                for (int i13 = 0; i13 < d10.f19175a; i13++) {
                    p0 b11 = d10.b(i13);
                    List<T> a10 = aVar2.a(i12, b11, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b11.f19166a];
                    int i14 = 0;
                    while (i14 < b11.f19166a) {
                        T t10 = a10.get(i14);
                        int a11 = t10.a();
                        if (zArr[i14] || a11 == 0) {
                            i11 = b10;
                        } else {
                            if (a11 == 1) {
                                obj = q.E(t10);
                                i11 = b10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                for (int i15 = i14 + 1; i15 < b11.f19166a; i15++) {
                                    T t11 = a10.get(i15);
                                    b10 = b10;
                                    if (t11.a() == 2 && t10.b(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                }
                                i11 = b10;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i14++;
                        b10 = i11;
                    }
                }
            }
            b10 = b10;
            i12++;
            aVar3 = aVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((h) list.get(i16)).f521c;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new r.a(hVar.f520b, iArr2), Integer.valueOf(hVar.f519a));
    }

    @SuppressLint({"WrongConstant"})
    public Pair<r.a, Integer> T(t.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return S(2, aVar, iArr, new h.a() {
            @Override
            public final List a(int i10, p0 p0Var, int[] iArr3) {
                List H;
                H = l.H(l.d.this, iArr2, i10, p0Var, iArr3);
                return H;
            }
        }, k.f488a);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public final Pair<e3[], r[]> j(t.a aVar, int[][][] iArr, int[] iArr2, s.b bVar, o3 o3Var) {
        d dVar = this.f492e.get();
        int b10 = aVar.b();
        r.a[] O = O(aVar, iArr, iArr2, dVar);
        SparseArray<Pair<y.a, Integer>> v10 = v(aVar, dVar);
        for (int i10 = 0; i10 < v10.size(); i10++) {
            Pair<y.a, Integer> valueAt = v10.valueAt(i10);
            u(aVar, O, v10.keyAt(i10), (y.a) valueAt.first, ((Integer) valueAt.second).intValue());
        }
        for (int i11 = 0; i11 < b10; i11++) {
            if (C(aVar, dVar, i11)) {
                O[i11] = x(aVar, dVar, i11);
            }
        }
        for (int i12 = 0; i12 < b10; i12++) {
            if (D(aVar, dVar, i12)) {
                O[i12] = null;
            }
        }
        r[] a10 = this.f491d.a(O, a(), bVar, o3Var);
        e3[] e3VarArr = new e3[b10];
        for (int i13 = 0; i13 < b10; i13++) {
            boolean z10 = true;
            if ((dVar.k(i13) || dVar.f437h0.contains(Integer.valueOf(aVar.c(i13)))) || (aVar.c(i13) != -2 && a10[i13] == null)) {
                z10 = false;
            }
            e3VarArr[i13] = z10 ? e3.f16640b : null;
        }
        if (dVar.f511w0) {
            K(aVar, iArr, e3VarArr, a10);
        }
        return Pair.create(e3VarArr, a10);
    }

    public final void u(t.a aVar, r.a[] aVarArr, int i10, y.a aVar2, int i11) {
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (i11 == i12) {
                aVarArr[i12] = new r.a(aVar2.f549a, b7.d.i(aVar2.f550b));
            } else if (aVar.c(i12) == i10) {
                aVarArr[i12] = null;
            }
        }
    }

    public final SparseArray<Pair<y.a, Integer>> v(t.a aVar, d dVar) {
        SparseArray<Pair<y.a, Integer>> sparseArray = new SparseArray<>();
        int b10 = aVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            r0 d10 = aVar.d(i10);
            for (int i11 = 0; i11 < d10.f19175a; i11++) {
                L(sparseArray, dVar.f436g0.b(d10.b(i11)), i10);
            }
        }
        r0 f10 = aVar.f();
        for (int i12 = 0; i12 < f10.f19175a; i12++) {
            L(sparseArray, dVar.f436g0.b(f10.b(i12)), -1);
        }
        return sparseArray;
    }

    public final r.a x(t.a aVar, d dVar, int i10) {
        r0 d10 = aVar.d(i10);
        f l10 = dVar.l(i10, d10);
        if (l10 == null) {
            return null;
        }
        return new r.a(d10.b(l10.f516a), l10.f517b, l10.M);
    }

    public l(Context context, r.b bVar) {
        this(d.j(context), bVar);
    }

    public l(d dVar, r.b bVar) {
        this.f491d = bVar;
        this.f492e = new AtomicReference<>(dVar);
    }
}
