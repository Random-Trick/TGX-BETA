package p356z4;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.thunderdog.challegram.Log;
import p008a7.C0199c;
import p020b5.C1186a;
import p020b5.C1190c;
import p020b5.C1216l0;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6609h;
import p174m3.C6600g1;
import p174m3.C6701t2;
import p174m3.C6709v2;
import p187n4.AbstractC7230t;
import p187n4.C7227r0;
import p187n4.C7233t0;
import p356z4.AbstractC11265j;
import p356z4.AbstractC11269l;
import p356z4.C11246a;
import p356z4.C11275q;
import p356z4.C11278s;
import p358z6.AbstractC11362g0;
import p358z6.AbstractC11374k;
import p358z6.AbstractC11396q;

public class C11253f extends AbstractC11269l {
    public static final int[] f36041f = new int[0];
    public static final AbstractC11362g0<Integer> f36042g = AbstractC11362g0.m823a(C11252e.f36040a);
    public static final AbstractC11362g0<Integer> f36043h = AbstractC11362g0.m823a(C11251d.f36039a);
    public final AbstractC11265j.AbstractC11267b f36044d;
    public final AtomicReference<C11257d> f36045e;

    public static final class C11255b implements Comparable<C11255b> {
        public final boolean f36046M;
        public final int f36047N;
        public final int f36048O;
        public final int f36049P;
        public final int f36050Q;
        public final int f36051R;
        public final boolean f36052S;
        public final int f36053T;
        public final int f36054U;
        public final int f36055V;
        public final int f36056W;
        public final boolean f36057a;
        public final String f36058b;
        public final C11257d f36059c;

        public C11255b(C6600g1 g1Var, C11257d dVar, int i) {
            int i2;
            int i3;
            int i4;
            this.f36059c = dVar;
            this.f36058b = C11253f.m1107H(g1Var.f20585c);
            int i5 = 0;
            this.f36046M = C11253f.m1114A(i, false);
            int i6 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i6 >= dVar.f36151V.size()) {
                    i6 = Integer.MAX_VALUE;
                    i3 = 0;
                    break;
                }
                i3 = C11253f.m1088u(g1Var, dVar.f36151V.get(i6), false);
                if (i3 > 0) {
                    break;
                }
                i6++;
            }
            this.f36048O = i6;
            this.f36047N = i3;
            this.f36049P = Integer.bitCount(g1Var.f20568N & dVar.f36152W);
            boolean z = true;
            this.f36052S = (g1Var.f20567M & 1) != 0;
            int i7 = g1Var.f20591h0;
            this.f36053T = i7;
            this.f36054U = g1Var.f20592i0;
            int i8 = g1Var.f20571Q;
            this.f36055V = i8;
            if ((i8 != -1 && i8 > dVar.f36154Y) || (i7 != -1 && i7 > dVar.f36153X)) {
                z = false;
            }
            this.f36057a = z;
            String[] Z = C1216l0.m37987Z();
            int i9 = 0;
            while (true) {
                if (i9 >= Z.length) {
                    i9 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
                i4 = C11253f.m1088u(g1Var, Z[i9], false);
                if (i4 > 0) {
                    break;
                }
                i9++;
            }
            this.f36050Q = i9;
            this.f36051R = i4;
            while (true) {
                if (i5 < dVar.f36155Z.size()) {
                    String str = g1Var.f20575U;
                    if (str != null && str.equals(dVar.f36155Z.get(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            this.f36056W = i2;
        }

        public int compareTo(C11255b bVar) {
            AbstractC11362g0 d = (!this.f36057a || !this.f36046M) ? C11253f.f36042g.mo788d() : C11253f.f36042g;
            AbstractC11374k f = AbstractC11374k.m802j().mo797g(this.f36046M, bVar.f36046M).mo798f(Integer.valueOf(this.f36048O), Integer.valueOf(bVar.f36048O), AbstractC11362g0.m822b().mo788d()).mo800d(this.f36047N, bVar.f36047N).mo800d(this.f36049P, bVar.f36049P).mo797g(this.f36057a, bVar.f36057a).mo798f(Integer.valueOf(this.f36056W), Integer.valueOf(bVar.f36056W), AbstractC11362g0.m822b().mo788d()).mo798f(Integer.valueOf(this.f36055V), Integer.valueOf(bVar.f36055V), this.f36059c.f36162d0 ? C11253f.f36042g.mo788d() : C11253f.f36043h).mo797g(this.f36052S, bVar.f36052S).mo798f(Integer.valueOf(this.f36050Q), Integer.valueOf(bVar.f36050Q), AbstractC11362g0.m822b().mo788d()).mo800d(this.f36051R, bVar.f36051R).mo798f(Integer.valueOf(this.f36053T), Integer.valueOf(bVar.f36053T), d).mo798f(Integer.valueOf(this.f36054U), Integer.valueOf(bVar.f36054U), d);
            Integer valueOf = Integer.valueOf(this.f36055V);
            Integer valueOf2 = Integer.valueOf(bVar.f36055V);
            if (!C1216l0.m37982c(this.f36058b, bVar.f36058b)) {
                d = C11253f.f36043h;
            }
            return f.mo798f(valueOf, valueOf2, d).mo795i();
        }
    }

    public static final class C11256c implements Comparable<C11256c> {
        public final boolean f36060a;
        public final boolean f36061b;

        public C11256c(C6600g1 g1Var, int i) {
            this.f36060a = (g1Var.f20567M & 1) == 0 ? false : true;
            this.f36061b = C11253f.m1114A(i, false);
        }

        public int compareTo(C11256c cVar) {
            return AbstractC11374k.m802j().mo797g(this.f36061b, cVar.f36061b).mo797g(this.f36060a, cVar.f36060a).mo795i();
        }
    }

    public static final class C11257d extends C11278s {
        public static final C11257d f36062x0;
        @Deprecated
        public static final C11257d f36063y0;
        public static final AbstractC6609h.AbstractC6610a<C11257d> f36064z0 = C11262g.f36112a;
        public final int f36065k0;
        public final boolean f36066l0;
        public final boolean f36067m0;
        public final boolean f36068n0;
        public final boolean f36069o0;
        public final boolean f36070p0;
        public final boolean f36071q0;
        public final boolean f36072r0;
        public final boolean f36073s0;
        public final boolean f36074t0;
        public final boolean f36075u0;
        public final SparseArray<Map<C7233t0, C11259f>> f36076v0;
        public final SparseBooleanArray f36077w0;

        static {
            C11257d R = new C11258e().mo965y();
            f36062x0 = R;
            f36063y0 = R;
        }

        public static String m1080c(int i) {
            return Integer.toString(i, 36);
        }

        public static boolean m1077g(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean m1076h(SparseArray<Map<C7233t0, C11259f>> sparseArray, SparseArray<Map<C7233t0, C11259f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m1075i(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean m1075i(java.util.Map<p187n4.C7233t0, p356z4.C11253f.C11259f> r4, java.util.Map<p187n4.C7233t0, p356z4.C11253f.C11259f> r5) {
            throw new UnsupportedOperationException("Method not decompiled: p356z4.C11253f.C11257d.m1075i(java.util.Map, java.util.Map):boolean");
        }

        public static C11257d m1074j(Context context) {
            return new C11258e(context).mo965y();
        }

        public static C11257d m1070n(Bundle bundle) {
            return new C11258e(bundle).mo965y();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11257d.class != obj.getClass()) {
                return false;
            }
            C11257d dVar = (C11257d) obj;
            return super.equals(dVar) && this.f36066l0 == dVar.f36066l0 && this.f36067m0 == dVar.f36067m0 && this.f36068n0 == dVar.f36068n0 && this.f36069o0 == dVar.f36069o0 && this.f36070p0 == dVar.f36070p0 && this.f36071q0 == dVar.f36071q0 && this.f36072r0 == dVar.f36072r0 && this.f36065k0 == dVar.f36065k0 && this.f36073s0 == dVar.f36073s0 && this.f36074t0 == dVar.f36074t0 && this.f36075u0 == dVar.f36075u0 && m1077g(this.f36077w0, dVar.f36077w0) && m1076h(this.f36076v0, dVar.f36076v0);
        }

        @Override
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f36066l0 ? 1 : 0)) * 31) + (this.f36067m0 ? 1 : 0)) * 31) + (this.f36068n0 ? 1 : 0)) * 31) + (this.f36069o0 ? 1 : 0)) * 31) + (this.f36070p0 ? 1 : 0)) * 31) + (this.f36071q0 ? 1 : 0)) * 31) + (this.f36072r0 ? 1 : 0)) * 31) + this.f36065k0) * 31) + (this.f36073s0 ? 1 : 0)) * 31) + (this.f36074t0 ? 1 : 0)) * 31) + (this.f36075u0 ? 1 : 0);
        }

        public final boolean m1073k(int i) {
            return this.f36077w0.get(i);
        }

        @Deprecated
        public final C11259f m1072l(int i, C7233t0 t0Var) {
            Map<C7233t0, C11259f> map = this.f36076v0.get(i);
            if (map != null) {
                return map.get(t0Var);
            }
            return null;
        }

        @Deprecated
        public final boolean m1071m(int i, C7233t0 t0Var) {
            Map<C7233t0, C11259f> map = this.f36076v0.get(i);
            return map != null && map.containsKey(t0Var);
        }

        public C11257d(C11258e eVar) {
            super(eVar);
            this.f36066l0 = eVar.f36089y;
            this.f36067m0 = eVar.f36090z;
            this.f36068n0 = eVar.f36078A;
            this.f36069o0 = eVar.f36079B;
            this.f36070p0 = eVar.f36080C;
            this.f36071q0 = eVar.f36081D;
            this.f36072r0 = eVar.f36082E;
            this.f36065k0 = eVar.f36083F;
            this.f36073s0 = eVar.f36084G;
            this.f36074t0 = eVar.f36085H;
            this.f36075u0 = eVar.f36086I;
            this.f36076v0 = eVar.f36087J;
            this.f36077w0 = eVar.f36088K;
        }
    }

    public static final class C11258e extends C11278s.C11279a {
        public boolean f36078A;
        public boolean f36079B;
        public boolean f36080C;
        public boolean f36081D;
        public boolean f36082E;
        public int f36083F;
        public boolean f36084G;
        public boolean f36085H;
        public boolean f36086I;
        public final SparseArray<Map<C7233t0, C11259f>> f36087J;
        public final SparseBooleanArray f36088K;
        public boolean f36089y;
        public boolean f36090z;

        public C11257d mo965y() {
            return new C11257d(this);
        }

        public final void m1055S() {
            this.f36089y = true;
            this.f36090z = false;
            this.f36078A = true;
            this.f36079B = true;
            this.f36080C = false;
            this.f36081D = false;
            this.f36082E = false;
            this.f36083F = 0;
            this.f36084G = true;
            this.f36085H = false;
            this.f36086I = true;
        }

        public final SparseBooleanArray m1054T(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i : iArr) {
                sparseBooleanArray.append(i, true);
            }
            return sparseBooleanArray;
        }

        public C11258e m1053U(boolean z) {
            this.f36082E = z;
            return this;
        }

        public C11258e m1052V(boolean z) {
            this.f36080C = z;
            return this;
        }

        public C11258e m1051W(boolean z) {
            this.f36081D = z;
            return this;
        }

        public C11258e m1050X(boolean z) {
            this.f36086I = z;
            return this;
        }

        public C11258e m1049Y(boolean z) {
            this.f36090z = z;
            return this;
        }

        public C11258e m1048Z(boolean z) {
            this.f36078A = z;
            return this;
        }

        public C11258e m1047a0(int i) {
            this.f36083F = i;
            return this;
        }

        public C11258e m1046b0(boolean z) {
            this.f36079B = z;
            return this;
        }

        public C11258e m1045c0(boolean z) {
            this.f36084G = z;
            return this;
        }

        public C11258e m1044d0(boolean z) {
            this.f36089y = z;
            return this;
        }

        public C11258e mo993A(Context context) {
            super.mo993A(context);
            return this;
        }

        @Deprecated
        public final C11258e m1042f0(int i, C7233t0 t0Var, C11259f fVar) {
            Map<C7233t0, C11259f> map = this.f36087J.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f36087J.put(i, map);
            }
            if (map.containsKey(t0Var) && C1216l0.m37982c(map.get(t0Var), fVar)) {
                return this;
            }
            map.put(t0Var, fVar);
            return this;
        }

        public final void m1041g0(Bundle bundle) {
            int[] intArray = bundle.getIntArray(C11257d.m1080c(1011));
            List c = C1190c.m38114c(C7233t0.f23028N, bundle.getParcelableArrayList(C11257d.m1080c(1012)), AbstractC11396q.m768D());
            SparseArray d = C1190c.m38113d(C11259f.f36091N, bundle.getSparseParcelableArray(C11257d.m1080c(1013)), new SparseArray());
            if (intArray != null && intArray.length == c.size()) {
                for (int i = 0; i < intArray.length; i++) {
                    m1042f0(intArray[i], (C7233t0) c.get(i), (C11259f) d.get(i));
                }
            }
        }

        public C11258e m1040h0(boolean z) {
            this.f36085H = z;
            return this;
        }

        public C11258e mo991C(int i, int i2, boolean z) {
            super.mo991C(i, i2, z);
            return this;
        }

        public C11258e mo990D(Context context, boolean z) {
            super.mo990D(context, z);
            return this;
        }

        @Deprecated
        public C11258e() {
            this.f36087J = new SparseArray<>();
            this.f36088K = new SparseBooleanArray();
            m1055S();
        }

        public C11258e(Context context) {
            super(context);
            this.f36087J = new SparseArray<>();
            this.f36088K = new SparseBooleanArray();
            m1055S();
        }

        public C11258e(Bundle bundle) {
            super(bundle);
            C11257d dVar = C11257d.f36062x0;
            m1044d0(bundle.getBoolean(C11257d.m1080c(1000), dVar.f36066l0));
            m1049Y(bundle.getBoolean(C11257d.m1080c(1001), dVar.f36067m0));
            m1048Z(bundle.getBoolean(C11257d.m1080c(1002), dVar.f36068n0));
            m1046b0(bundle.getBoolean(C11257d.m1080c(1003), dVar.f36069o0));
            m1052V(bundle.getBoolean(C11257d.m1080c(1004), dVar.f36070p0));
            m1051W(bundle.getBoolean(C11257d.m1080c(1005), dVar.f36071q0));
            m1053U(bundle.getBoolean(C11257d.m1080c(1006), dVar.f36072r0));
            m1047a0(bundle.getInt(C11257d.m1080c(1007), dVar.f36065k0));
            m1045c0(bundle.getBoolean(C11257d.m1080c(1008), dVar.f36073s0));
            m1040h0(bundle.getBoolean(C11257d.m1080c(1009), dVar.f36074t0));
            m1050X(bundle.getBoolean(C11257d.m1080c(1010), dVar.f36075u0));
            this.f36087J = new SparseArray<>();
            m1041g0(bundle);
            this.f36088K = m1054T(bundle.getIntArray(C11257d.m1080c(1014)));
        }
    }

    public static final class C11259f implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C11259f> f36091N = C11263h.f36113a;
        public final int f36092M;
        public final int f36093a;
        public final int[] f36094b;
        public final int f36095c;

        public C11259f(int i, int[] iArr, int i2) {
            this.f36093a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f36094b = copyOf;
            this.f36095c = iArr.length;
            this.f36092M = i2;
            Arrays.sort(copyOf);
        }

        public static String m1036b(int i) {
            return Integer.toString(i, 36);
        }

        public static C11259f m1035c(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(m1036b(0), -1);
            int[] intArray = bundle.getIntArray(m1036b(1));
            int i2 = bundle.getInt(m1036b(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            C1186a.m38189a(z);
            C1186a.m38185e(intArray);
            return new C11259f(i, intArray, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11259f.class != obj.getClass()) {
                return false;
            }
            C11259f fVar = (C11259f) obj;
            return this.f36093a == fVar.f36093a && Arrays.equals(this.f36094b, fVar.f36094b) && this.f36092M == fVar.f36092M;
        }

        public int hashCode() {
            return (((this.f36093a * 31) + Arrays.hashCode(this.f36094b)) * 31) + this.f36092M;
        }
    }

    public static final class C11260g implements Comparable<C11260g> {
        public final boolean f36096M;
        public final int f36097N;
        public final int f36098O;
        public final int f36099P;
        public final int f36100Q;
        public final boolean f36101R;
        public final boolean f36102a;
        public final boolean f36103b;
        public final boolean f36104c;

        public C11260g(C6600g1 g1Var, C11257d dVar, int i, String str) {
            AbstractC11396q<String> qVar;
            int i2;
            boolean z = false;
            this.f36103b = C11253f.m1114A(i, false);
            int i3 = g1Var.f20567M & (~dVar.f36065k0);
            this.f36104c = (i3 & 1) != 0;
            this.f36096M = (i3 & 2) != 0;
            int i4 = Integer.MAX_VALUE;
            if (dVar.f36157a0.isEmpty()) {
                qVar = AbstractC11396q.m767E("");
            } else {
                qVar = dVar.f36157a0;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= qVar.size()) {
                    i2 = 0;
                    break;
                }
                i2 = C11253f.m1088u(g1Var, qVar.get(i5), dVar.f36161c0);
                if (i2 > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f36097N = i4;
            this.f36098O = i2;
            int bitCount = Integer.bitCount(g1Var.f20568N & dVar.f36159b0);
            this.f36099P = bitCount;
            this.f36101R = (g1Var.f20568N & 1088) != 0;
            int u = C11253f.m1088u(g1Var, str, C11253f.m1107H(str) == null);
            this.f36100Q = u;
            if (i2 > 0 || ((dVar.f36157a0.isEmpty() && bitCount > 0) || this.f36104c || (this.f36096M && u > 0))) {
                z = true;
            }
            this.f36102a = z;
        }

        public int compareTo(C11260g gVar) {
            AbstractC11374k d = AbstractC11374k.m802j().mo797g(this.f36103b, gVar.f36103b).mo798f(Integer.valueOf(this.f36097N), Integer.valueOf(gVar.f36097N), AbstractC11362g0.m822b().mo788d()).mo800d(this.f36098O, gVar.f36098O).mo800d(this.f36099P, gVar.f36099P).mo797g(this.f36104c, gVar.f36104c).mo798f(Boolean.valueOf(this.f36096M), Boolean.valueOf(gVar.f36096M), this.f36098O == 0 ? AbstractC11362g0.m822b() : AbstractC11362g0.m822b().mo788d()).mo800d(this.f36100Q, gVar.f36100Q);
            if (this.f36099P == 0) {
                d = d.mo796h(this.f36101R, gVar.f36101R);
            }
            return d.mo795i();
        }
    }

    public static final class C11261h implements Comparable<C11261h> {
        public final boolean f36105M;
        public final int f36106N;
        public final int f36107O;
        public final int f36108P;
        public final boolean f36109a;
        public final C11257d f36110b;
        public final boolean f36111c;

        public C11261h(p174m3.C6600g1 r7, p356z4.C11253f.C11257d r8, int r9, boolean r10) {
            throw new UnsupportedOperationException("Method not decompiled: p356z4.C11253f.C11261h.<init>(m3.g1, z4.f$d, int, boolean):void");
        }

        public int compareTo(C11261h hVar) {
            AbstractC11362g0 d = (!this.f36109a || !this.f36105M) ? C11253f.f36042g.mo788d() : C11253f.f36042g;
            return AbstractC11374k.m802j().mo797g(this.f36105M, hVar.f36105M).mo797g(this.f36109a, hVar.f36109a).mo797g(this.f36111c, hVar.f36111c).mo798f(Integer.valueOf(this.f36108P), Integer.valueOf(hVar.f36108P), AbstractC11362g0.m822b().mo788d()).mo798f(Integer.valueOf(this.f36106N), Integer.valueOf(hVar.f36106N), this.f36110b.f36162d0 ? C11253f.f36042g.mo788d() : C11253f.f36043h).mo798f(Integer.valueOf(this.f36107O), Integer.valueOf(hVar.f36107O), d).mo798f(Integer.valueOf(this.f36106N), Integer.valueOf(hVar.f36106N), d).mo795i();
        }
    }

    public C11253f(Context context) {
        this(context, new C11246a.C11248b());
    }

    public static boolean m1114A(int i, boolean z) {
        int c = C6701t2.m19435c(i);
        return c == 4 || (z && c == 3);
    }

    public static boolean m1113B(C6600g1 g1Var, int i, C6600g1 g1Var2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        String str;
        int i5;
        if (!m1114A(i, false) || (i3 = g1Var.f20571Q) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = g1Var.f20591h0) == -1 || i5 != g1Var2.f20591h0)) {
            return false;
        }
        if (z || ((str = g1Var.f20575U) != null && TextUtils.equals(str, g1Var2.f20575U))) {
            return z2 || ((i4 = g1Var.f20592i0) != -1 && i4 == g1Var2.f20592i0);
        }
        return false;
    }

    public static boolean m1112C(C6600g1 g1Var, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if ((g1Var.f20568N & Log.TAG_VIDEO) != 0 || !m1114A(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C1216l0.m37982c(g1Var.f20575U, str)) {
            return false;
        }
        int i12 = g1Var.f20580Z;
        if (i12 != -1 && (i7 > i12 || i12 > i3)) {
            return false;
        }
        int i13 = g1Var.f20582a0;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        float f = g1Var.f20584b0;
        return (f == -1.0f || (((float) i9) <= f && f <= ((float) i5))) && (i11 = g1Var.f20571Q) != -1 && i10 <= i11 && i11 <= i6;
    }

    public static int m1111D(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static int m1110E(Integer num, Integer num2) {
        return 0;
    }

    public static void m1109F(AbstractC11269l.C11270a aVar, int[][][] iArr, C6709v2[] v2VarArr, AbstractC11265j[] jVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < aVar.m1015a(); i3++) {
            int b = aVar.m1014b(i3);
            AbstractC11265j jVar = jVarArr[i3];
            if ((b == 1 || b == 2) && jVar != null && m1106I(iArr[i3], aVar.m1013c(i3), jVar)) {
                if (b == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else if (i != -1) {
                    z = false;
                    break;
                } else {
                    i = i3;
                }
            }
        }
        z = true;
        if (!(i2 == -1 || i == -1)) {
            z2 = true;
        }
        if (z && z2) {
            C6709v2 v2Var = new C6709v2(true);
            v2VarArr[i2] = v2Var;
            v2VarArr[i] = v2Var;
        }
    }

    public static String m1107H(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean m1106I(int[][] iArr, C7233t0 t0Var, AbstractC11265j jVar) {
        if (jVar == null) {
            return false;
        }
        int c = t0Var.m17244c(jVar.mo1010a());
        for (int i = 0; i < jVar.length(); i++) {
            if (C6701t2.m19434d(iArr[c][jVar.mo1008f(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static AbstractC11265j.C11266a m1105J(C7233t0 t0Var, int[][] iArr, int i, C11257d dVar) {
        C7233t0 t0Var2 = t0Var;
        C11257d dVar2 = dVar;
        int i2 = dVar2.f36068n0 ? 24 : 16;
        boolean z = dVar2.f36067m0 && (i & i2) != 0;
        int i3 = 0;
        while (i3 < t0Var2.f23029a) {
            C7227r0 b = t0Var2.m17245b(i3);
            int i4 = i3;
            int[] s = m1090s(b, iArr[i3], z, i2, dVar2.f36156a, dVar2.f36158b, dVar2.f36160c, dVar2.f36142M, dVar2.f36143N, dVar2.f36144O, dVar2.f36145P, dVar2.f36146Q, dVar2.f36147R, dVar2.f36148S, dVar2.f36149T);
            if (s.length > 0) {
                return new AbstractC11265j.C11266a(b, s);
            }
            i3 = i4 + 1;
            t0Var2 = t0Var;
            dVar2 = dVar;
        }
        return null;
    }

    public static AbstractC11265j.C11266a m1102M(C7233t0 t0Var, int[][] iArr, C11257d dVar) {
        int i = -1;
        C7227r0 r0Var = null;
        C11261h hVar = null;
        for (int i2 = 0; i2 < t0Var.f23029a; i2++) {
            C7227r0 b = t0Var.m17245b(i2);
            List<Integer> x = m1085x(b, dVar.f36147R, dVar.f36148S, dVar.f36149T);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < b.f23023a; i3++) {
                C6600g1 b2 = b.m17272b(i3);
                if ((b2.f20568N & Log.TAG_VIDEO) == 0 && m1114A(iArr2[i3], dVar.f36073s0)) {
                    C11261h hVar2 = new C11261h(b2, dVar, iArr2[i3], x.contains(Integer.valueOf(i3)));
                    if ((hVar2.f36109a || dVar.f36066l0) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        r0Var = b;
                        i = i3;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (r0Var == null) {
            return null;
        }
        return new AbstractC11265j.C11266a(r0Var, i);
    }

    public static void m1093p(C7227r0 r0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m1112C(r0Var.m17272b(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    public static int[] m1092q(C7227r0 r0Var, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        C6600g1 b = r0Var.m17272b(i);
        int[] iArr2 = new int[r0Var.f23023a];
        int i3 = 0;
        for (int i4 = 0; i4 < r0Var.f23023a; i4++) {
            if (i4 == i || m1113B(r0Var.m17272b(i4), iArr[i4], b, i2, z, z2, z3)) {
                i3++;
                iArr2[i3] = i4;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    public static int m1091r(C7227r0 r0Var, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (m1112C(r0Var.m17272b(intValue), str, iArr[intValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    public static int[] m1090s(C7227r0 r0Var, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        HashSet hashSet;
        int i12;
        int i13;
        if (r0Var.f23023a < 2) {
            return f36041f;
        }
        List<Integer> x = m1085x(r0Var, i10, i11, z2);
        if (x.size() < 2) {
            return f36041f;
        }
        if (!z) {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < x.size()) {
                String str3 = r0Var.m17272b(x.get(i15).intValue()).f20575U;
                if (hashSet2.add(str3)) {
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                    int r = m1091r(r0Var, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, x);
                    if (r > i13) {
                        i14 = r;
                        str2 = str3;
                        i15 = i12 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i13 = i14;
                    i12 = i15;
                    hashSet = hashSet2;
                }
                i14 = i13;
                i15 = i12 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        } else {
            str = null;
        }
        m1093p(r0Var, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, x);
        return x.size() < 2 ? f36041f : C0199c.m42097i(x);
    }

    public static int m1088u(C6600g1 g1Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(g1Var.f20585c)) {
            return 4;
        }
        String H = m1107H(str);
        String H2 = m1107H(g1Var.f20585c);
        if (H2 == null || H == null) {
            return (!z || H2 != null) ? 0 : 1;
        }
        if (H2.startsWith(H) || H.startsWith(H2)) {
            return 3;
        }
        return C1216l0.m38018B0(H2, "-")[0].equals(C1216l0.m38018B0(H, "-")[0]) ? 2 : 0;
    }

    public static android.graphics.Point m1086w(boolean r3, int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: p356z4.C11253f.m1086w(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List<Integer> m1085x(C7227r0 r0Var, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(r0Var.f23023a);
        for (int i4 = 0; i4 < r0Var.f23023a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < r0Var.f23023a; i6++) {
                C6600g1 b = r0Var.m17272b(i6);
                int i7 = b.f20580Z;
                if (i7 > 0 && (i3 = b.f20582a0) > 0) {
                    Point w = m1086w(z, i, i2, i7, i3);
                    int i8 = b.f20580Z;
                    int i9 = b.f20582a0;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (w.x * 0.98f)) && i9 >= ((int) (w.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int f = r0Var.m17272b(((Integer) arrayList.get(size)).intValue()).m19897f();
                    if (f == -1 || f > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void m1108G(SparseArray<Pair<C11275q.C11276a, Integer>> sparseArray, C11275q.C11276a aVar, int i) {
        if (aVar != null) {
            int b = aVar.m1001b();
            Pair<C11275q.C11276a, Integer> pair = sparseArray.get(b);
            if (pair == null || ((C11275q.C11276a) pair.first).f36137b.isEmpty()) {
                sparseArray.put(b, Pair.create(aVar, Integer.valueOf(i)));
            }
        }
    }

    public AbstractC11265j.C11266a[] m1104K(AbstractC11269l.C11270a aVar, int[][][] iArr, int[] iArr2, C11257d dVar) {
        int i;
        String str;
        int i2;
        String str2;
        C11255b bVar;
        int i3;
        int a = aVar.m1015a();
        AbstractC11265j.C11266a[] aVarArr = new AbstractC11265j.C11266a[a];
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i5 >= a) {
                break;
            }
            if (2 == aVar.m1014b(i5)) {
                if (!z) {
                    aVarArr[i5] = m1099P(aVar.m1013c(i5), iArr[i5], iArr2[i5], dVar, true);
                    z = aVarArr[i5] != null;
                }
                if (aVar.m1013c(i5).f23029a <= 0) {
                    i = 0;
                }
                i6 |= i;
            }
            i5++;
        }
        C11255b bVar2 = null;
        String str3 = null;
        int i7 = -1;
        int i8 = 0;
        while (i8 < a) {
            if (i == aVar.m1014b(i8)) {
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i8;
                Pair<AbstractC11265j.C11266a, C11255b> L = m1103L(aVar.m1013c(i8), iArr[i8], iArr2[i8], dVar, dVar.f36075u0 || i6 == 0);
                if (L != null && (bVar == null || ((C11255b) L.second).compareTo(bVar) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    AbstractC11265j.C11266a aVar2 = (AbstractC11265j.C11266a) L.first;
                    aVarArr[i2] = aVar2;
                    str3 = aVar2.f36114a.m17272b(aVar2.f36115b[0]).f20585c;
                    bVar2 = (C11255b) L.second;
                    i7 = i2;
                    i8 = i2 + 1;
                    i = 1;
                }
            } else {
                i3 = i7;
                bVar = bVar2;
                str2 = str3;
                i2 = i8;
            }
            i7 = i3;
            bVar2 = bVar;
            str3 = str2;
            i8 = i2 + 1;
            i = 1;
        }
        String str4 = str3;
        C11260g gVar = null;
        int i9 = -1;
        while (i4 < a) {
            int b = aVar.m1014b(i4);
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        aVarArr[i4] = m1101N(b, aVar.m1013c(i4), iArr[i4], dVar);
                    } else {
                        str = str4;
                        Pair<AbstractC11265j.C11266a, C11260g> O = m1100O(aVar.m1013c(i4), iArr[i4], dVar, str);
                        if (O != null && (gVar == null || ((C11260g) O.second).compareTo(gVar) > 0)) {
                            if (i9 != -1) {
                                aVarArr[i9] = null;
                            }
                            aVarArr[i4] = (AbstractC11265j.C11266a) O.first;
                            gVar = (C11260g) O.second;
                            i9 = i4;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i4++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair<AbstractC11265j.C11266a, C11255b> m1103L(C7233t0 t0Var, int[][] iArr, int i, C11257d dVar, boolean z) {
        AbstractC11265j.C11266a aVar = null;
        C11255b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < t0Var.f23029a; i4++) {
            C7227r0 b = t0Var.m17245b(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < b.f23023a; i5++) {
                if (m1114A(iArr2[i5], dVar.f36073s0)) {
                    C11255b bVar2 = new C11255b(b.m17272b(i5), dVar, iArr2[i5]);
                    if ((bVar2.f36057a || dVar.f36069o0) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        C7227r0 b2 = t0Var.m17245b(i2);
        if (!dVar.f36163e0 && !dVar.f36162d0 && z) {
            int[] q = m1092q(b2, iArr[i2], i3, dVar.f36154Y, dVar.f36070p0, dVar.f36071q0, dVar.f36072r0);
            if (q.length > 1) {
                aVar = new AbstractC11265j.C11266a(b2, q);
            }
        }
        if (aVar == null) {
            aVar = new AbstractC11265j.C11266a(b2, i3);
        }
        return Pair.create(aVar, (C11255b) C1186a.m38185e(bVar));
    }

    public AbstractC11265j.C11266a m1101N(int i, C7233t0 t0Var, int[][] iArr, C11257d dVar) {
        C7227r0 r0Var = null;
        C11256c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < t0Var.f23029a; i3++) {
            C7227r0 b = t0Var.m17245b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < b.f23023a; i4++) {
                if (m1114A(iArr2[i4], dVar.f36073s0)) {
                    C11256c cVar2 = new C11256c(b.m17272b(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        r0Var = b;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (r0Var == null) {
            return null;
        }
        return new AbstractC11265j.C11266a(r0Var, i2);
    }

    public Pair<AbstractC11265j.C11266a, C11260g> m1100O(C7233t0 t0Var, int[][] iArr, C11257d dVar, String str) {
        int i = -1;
        C7227r0 r0Var = null;
        C11260g gVar = null;
        for (int i2 = 0; i2 < t0Var.f23029a; i2++) {
            C7227r0 b = t0Var.m17245b(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < b.f23023a; i3++) {
                if (m1114A(iArr2[i3], dVar.f36073s0)) {
                    C11260g gVar2 = new C11260g(b.m17272b(i3), dVar, iArr2[i3], str);
                    if (gVar2.f36102a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        r0Var = b;
                        i = i3;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (r0Var == null) {
            return null;
        }
        return Pair.create(new AbstractC11265j.C11266a(r0Var, i), (C11260g) C1186a.m38185e(gVar));
    }

    public AbstractC11265j.C11266a m1099P(C7233t0 t0Var, int[][] iArr, int i, C11257d dVar, boolean z) {
        AbstractC11265j.C11266a J = (dVar.f36163e0 || dVar.f36162d0 || !z) ? null : m1105J(t0Var, iArr, i, dVar);
        return J == null ? m1102M(t0Var, iArr, dVar) : J;
    }

    @Override
    public boolean mo961c() {
        return true;
    }

    @Override
    public final Pair<C6709v2[], AbstractC11265j[]> mo1016j(AbstractC11269l.C11270a aVar, int[][][] iArr, int[] iArr2, AbstractC7230t.C7231a aVar2, AbstractC6604g3 g3Var) {
        C11257d dVar = this.f36045e.get();
        int a = aVar.m1015a();
        AbstractC11265j.C11266a[] K = m1104K(aVar, iArr, iArr2, dVar);
        SparseArray<Pair<C11275q.C11276a, Integer>> t = m1089t(aVar, dVar);
        for (int i = 0; i < t.size(); i++) {
            Pair<C11275q.C11276a, Integer> valueAt = t.valueAt(i);
            m1094o(aVar, K, t.keyAt(i), (C11275q.C11276a) valueAt.first, ((Integer) valueAt.second).intValue());
        }
        for (int i2 = 0; i2 < a; i2++) {
            if (m1084y(aVar, dVar, i2)) {
                K[i2] = m1087v(aVar, dVar, i2);
            }
        }
        for (int i3 = 0; i3 < a; i3++) {
            if (m1083z(aVar, dVar, i3)) {
                K[i3] = null;
            }
        }
        AbstractC11265j[] a2 = this.f36044d.mo1022a(K, m963a(), aVar2, g3Var);
        C6709v2[] v2VarArr = new C6709v2[a];
        for (int i4 = 0; i4 < a; i4++) {
            boolean z = true;
            if ((dVar.m1073k(i4) || dVar.f36165g0.contains(Integer.valueOf(aVar.m1014b(i4)))) || (aVar.m1014b(i4) != -2 && a2[i4] == null)) {
                z = false;
            }
            v2VarArr[i4] = z ? C6709v2.f21049b : null;
        }
        if (dVar.f36074t0) {
            m1109F(aVar, iArr, v2VarArr, a2);
        }
        return Pair.create(v2VarArr, a2);
    }

    public final void m1094o(AbstractC11269l.C11270a aVar, AbstractC11265j.C11266a[] aVarArr, int i, C11275q.C11276a aVar2, int i2) {
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            if (i2 == i3) {
                aVarArr[i3] = new AbstractC11265j.C11266a(aVar2.f36136a, C0199c.m42097i(aVar2.f36137b));
            } else if (aVar.m1014b(i3) == i) {
                aVarArr[i3] = null;
            }
        }
    }

    public final SparseArray<Pair<C11275q.C11276a, Integer>> m1089t(AbstractC11269l.C11270a aVar, C11257d dVar) {
        SparseArray<Pair<C11275q.C11276a, Integer>> sparseArray = new SparseArray<>();
        int a = aVar.m1015a();
        for (int i = 0; i < a; i++) {
            C7233t0 c = aVar.m1013c(i);
            for (int i2 = 0; i2 < c.f23029a; i2++) {
                m1108G(sparseArray, dVar.f36164f0.m1005b(c.m17245b(i2)), i);
            }
        }
        C7233t0 e = aVar.m1011e();
        for (int i3 = 0; i3 < e.f23029a; i3++) {
            m1108G(sparseArray, dVar.f36164f0.m1005b(e.m17245b(i3)), -1);
        }
        return sparseArray;
    }

    public final AbstractC11265j.C11266a m1087v(AbstractC11269l.C11270a aVar, C11257d dVar, int i) {
        C7233t0 c = aVar.m1013c(i);
        C11259f l = dVar.m1072l(i, c);
        if (l == null) {
            return null;
        }
        return new AbstractC11265j.C11266a(c.m17245b(l.f36093a), l.f36094b, l.f36092M);
    }

    public final boolean m1084y(AbstractC11269l.C11270a aVar, C11257d dVar, int i) {
        return dVar.m1071m(i, aVar.m1013c(i));
    }

    public final boolean m1083z(AbstractC11269l.C11270a aVar, C11257d dVar, int i) {
        return dVar.m1073k(i) || dVar.f36165g0.contains(Integer.valueOf(aVar.m1014b(i)));
    }

    public C11253f(Context context, AbstractC11265j.AbstractC11267b bVar) {
        this(C11257d.m1074j(context), bVar);
    }

    public C11253f(C11257d dVar, AbstractC11265j.AbstractC11267b bVar) {
        this.f36044d = bVar;
        this.f36045e = new AtomicReference<>(dVar);
    }
}
