package m3;

import android.os.Bundle;
import c5.l0;
import d5.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m3.h;
import q3.m;

public final class q1 implements h {
    public static final q1 f16896p0 = new b().E();
    public static final h.a<q1> f16897q0 = p1.f16873a;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final String R;
    public final f4.a S;
    public final String T;
    public final String U;
    public final int V;
    public final List<byte[]> W;
    public final m X;
    public final long Y;
    public final int Z;
    public final String f16898a;
    public final int f16899a0;
    public final String f16900b;
    public final float f16901b0;
    public final String f16902c;
    public final int f16903c0;
    public final float f16904d0;
    public final byte[] f16905e0;
    public final int f16906f0;
    public final c f16907g0;
    public final int f16908h0;
    public final int f16909i0;
    public final int f16910j0;
    public final int f16911k0;
    public final int f16912l0;
    public final int f16913m0;
    public final int f16914n0;
    public int f16915o0;

    public static final class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public String f16916a;
        public String f16917b;
        public String f16918c;
        public int f16919d;
        public int f16920e;
        public int f16921f;
        public int f16922g;
        public String f16923h;
        public f4.a f16924i;
        public String f16925j;
        public String f16926k;
        public int f16927l;
        public List<byte[]> f16928m;
        public m f16929n;
        public long f16930o;
        public int f16931p;
        public int f16932q;
        public float f16933r;
        public int f16934s;
        public float f16935t;
        public byte[] f16936u;
        public int f16937v;
        public c f16938w;
        public int f16939x;
        public int f16940y;
        public int f16941z;

        public q1 E() {
            return new q1(this);
        }

        public b F(int i10) {
            this.C = i10;
            return this;
        }

        public b G(int i10) {
            this.f16921f = i10;
            return this;
        }

        public b H(int i10) {
            this.f16939x = i10;
            return this;
        }

        public b I(String str) {
            this.f16923h = str;
            return this;
        }

        public b J(c cVar) {
            this.f16938w = cVar;
            return this;
        }

        public b K(String str) {
            this.f16925j = str;
            return this;
        }

        public b L(int i10) {
            this.D = i10;
            return this;
        }

        public b M(m mVar) {
            this.f16929n = mVar;
            return this;
        }

        public b N(int i10) {
            this.A = i10;
            return this;
        }

        public b O(int i10) {
            this.B = i10;
            return this;
        }

        public b P(float f10) {
            this.f16933r = f10;
            return this;
        }

        public b Q(int i10) {
            this.f16932q = i10;
            return this;
        }

        public b R(int i10) {
            this.f16916a = Integer.toString(i10);
            return this;
        }

        public b S(String str) {
            this.f16916a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f16928m = list;
            return this;
        }

        public b U(String str) {
            this.f16917b = str;
            return this;
        }

        public b V(String str) {
            this.f16918c = str;
            return this;
        }

        public b W(int i10) {
            this.f16927l = i10;
            return this;
        }

        public b X(f4.a aVar) {
            this.f16924i = aVar;
            return this;
        }

        public b Y(int i10) {
            this.f16941z = i10;
            return this;
        }

        public b Z(int i10) {
            this.f16922g = i10;
            return this;
        }

        public b a0(float f10) {
            this.f16935t = f10;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f16936u = bArr;
            return this;
        }

        public b c0(int i10) {
            this.f16920e = i10;
            return this;
        }

        public b d0(int i10) {
            this.f16934s = i10;
            return this;
        }

        public b e0(String str) {
            this.f16926k = str;
            return this;
        }

        public b f0(int i10) {
            this.f16940y = i10;
            return this;
        }

        public b g0(int i10) {
            this.f16919d = i10;
            return this;
        }

        public b h0(int i10) {
            this.f16937v = i10;
            return this;
        }

        public b i0(long j10) {
            this.f16930o = j10;
            return this;
        }

        public b j0(int i10) {
            this.f16931p = i10;
            return this;
        }

        public b() {
            this.f16921f = -1;
            this.f16922g = -1;
            this.f16927l = -1;
            this.f16930o = Long.MAX_VALUE;
            this.f16931p = -1;
            this.f16932q = -1;
            this.f16933r = -1.0f;
            this.f16935t = 1.0f;
            this.f16937v = -1;
            this.f16939x = -1;
            this.f16940y = -1;
            this.f16941z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b(q1 q1Var) {
            this.f16916a = q1Var.f16898a;
            this.f16917b = q1Var.f16900b;
            this.f16918c = q1Var.f16902c;
            this.f16919d = q1Var.M;
            this.f16920e = q1Var.N;
            this.f16921f = q1Var.O;
            this.f16922g = q1Var.P;
            this.f16923h = q1Var.R;
            this.f16924i = q1Var.S;
            this.f16925j = q1Var.T;
            this.f16926k = q1Var.U;
            this.f16927l = q1Var.V;
            this.f16928m = q1Var.W;
            this.f16929n = q1Var.X;
            this.f16930o = q1Var.Y;
            this.f16931p = q1Var.Z;
            this.f16932q = q1Var.f16899a0;
            this.f16933r = q1Var.f16901b0;
            this.f16934s = q1Var.f16903c0;
            this.f16935t = q1Var.f16904d0;
            this.f16936u = q1Var.f16905e0;
            this.f16937v = q1Var.f16906f0;
            this.f16938w = q1Var.f16907g0;
            this.f16939x = q1Var.f16908h0;
            this.f16940y = q1Var.f16909i0;
            this.f16941z = q1Var.f16910j0;
            this.A = q1Var.f16911k0;
            this.B = q1Var.f16912l0;
            this.C = q1Var.f16913m0;
            this.D = q1Var.f16914n0;
        }
    }

    public static <T> T d(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static q1 e(Bundle bundle) {
        b bVar = new b();
        c5.c.a(bundle);
        int i10 = 0;
        String string = bundle.getString(h(0));
        q1 q1Var = f16896p0;
        bVar.S((String) d(string, q1Var.f16898a)).U((String) d(bundle.getString(h(1)), q1Var.f16900b)).V((String) d(bundle.getString(h(2)), q1Var.f16902c)).g0(bundle.getInt(h(3), q1Var.M)).c0(bundle.getInt(h(4), q1Var.N)).G(bundle.getInt(h(5), q1Var.O)).Z(bundle.getInt(h(6), q1Var.P)).I((String) d(bundle.getString(h(7)), q1Var.R)).X((f4.a) d((f4.a) bundle.getParcelable(h(8)), q1Var.S)).K((String) d(bundle.getString(h(9)), q1Var.T)).e0((String) d(bundle.getString(h(10)), q1Var.U)).W(bundle.getInt(h(11), q1Var.V));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i10));
            if (byteArray == null) {
                b M = bVar.T(arrayList).M((m) bundle.getParcelable(h(13)));
                String h10 = h(14);
                q1 q1Var2 = f16896p0;
                M.i0(bundle.getLong(h10, q1Var2.Y)).j0(bundle.getInt(h(15), q1Var2.Z)).Q(bundle.getInt(h(16), q1Var2.f16899a0)).P(bundle.getFloat(h(17), q1Var2.f16901b0)).d0(bundle.getInt(h(18), q1Var2.f16903c0)).a0(bundle.getFloat(h(19), q1Var2.f16904d0)).b0(bundle.getByteArray(h(20))).h0(bundle.getInt(h(21), q1Var2.f16906f0)).J((c) c5.c.e(c.O, bundle.getBundle(h(22)))).H(bundle.getInt(h(23), q1Var2.f16908h0)).f0(bundle.getInt(h(24), q1Var2.f16909i0)).Y(bundle.getInt(h(25), q1Var2.f16910j0)).N(bundle.getInt(h(26), q1Var2.f16911k0)).O(bundle.getInt(h(27), q1Var2.f16912l0)).F(bundle.getInt(h(28), q1Var2.f16913m0)).L(bundle.getInt(h(29), q1Var2.f16914n0));
                return bVar.E();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }

    public static String h(int i10) {
        return Integer.toString(i10, 36);
    }

    public static String i(int i10) {
        String h10 = h(12);
        String num = Integer.toString(i10, 36);
        StringBuilder sb2 = new StringBuilder(String.valueOf(h10).length() + 1 + String.valueOf(num).length());
        sb2.append(h10);
        sb2.append("_");
        sb2.append(num);
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public q1 c(int i10) {
        return b().L(i10).E();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        int i11 = this.f16915o0;
        return (i11 == 0 || (i10 = q1Var.f16915o0) == 0 || i11 == i10) && this.M == q1Var.M && this.N == q1Var.N && this.O == q1Var.O && this.P == q1Var.P && this.V == q1Var.V && this.Y == q1Var.Y && this.Z == q1Var.Z && this.f16899a0 == q1Var.f16899a0 && this.f16903c0 == q1Var.f16903c0 && this.f16906f0 == q1Var.f16906f0 && this.f16908h0 == q1Var.f16908h0 && this.f16909i0 == q1Var.f16909i0 && this.f16910j0 == q1Var.f16910j0 && this.f16911k0 == q1Var.f16911k0 && this.f16912l0 == q1Var.f16912l0 && this.f16913m0 == q1Var.f16913m0 && this.f16914n0 == q1Var.f16914n0 && Float.compare(this.f16901b0, q1Var.f16901b0) == 0 && Float.compare(this.f16904d0, q1Var.f16904d0) == 0 && l0.c(this.f16898a, q1Var.f16898a) && l0.c(this.f16900b, q1Var.f16900b) && l0.c(this.R, q1Var.R) && l0.c(this.T, q1Var.T) && l0.c(this.U, q1Var.U) && l0.c(this.f16902c, q1Var.f16902c) && Arrays.equals(this.f16905e0, q1Var.f16905e0) && l0.c(this.S, q1Var.S) && l0.c(this.f16907g0, q1Var.f16907g0) && l0.c(this.X, q1Var.X) && g(q1Var);
    }

    public int f() {
        int i10;
        int i11 = this.Z;
        if (i11 == -1 || (i10 = this.f16899a0) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean g(q1 q1Var) {
        if (this.W.size() != q1Var.W.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            if (!Arrays.equals(this.W.get(i10), q1Var.W.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f16915o0 == 0) {
            String str = this.f16898a;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16900b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f16902c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31;
            String str4 = this.R;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            f4.a aVar = this.S;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.T;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.U;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.f16915o0 = ((((((((((((((((((((((((((((((hashCode6 + i10) * 31) + this.V) * 31) + ((int) this.Y)) * 31) + this.Z) * 31) + this.f16899a0) * 31) + Float.floatToIntBits(this.f16901b0)) * 31) + this.f16903c0) * 31) + Float.floatToIntBits(this.f16904d0)) * 31) + this.f16906f0) * 31) + this.f16908h0) * 31) + this.f16909i0) * 31) + this.f16910j0) * 31) + this.f16911k0) * 31) + this.f16912l0) * 31) + this.f16913m0) * 31) + this.f16914n0;
        }
        return this.f16915o0;
    }

    public String toString() {
        String str = this.f16898a;
        String str2 = this.f16900b;
        String str3 = this.T;
        String str4 = this.U;
        String str5 = this.R;
        int i10 = this.Q;
        String str6 = this.f16902c;
        int i11 = this.Z;
        int i12 = this.f16899a0;
        float f10 = this.f16901b0;
        int i13 = this.f16908h0;
        int i14 = this.f16909i0;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }

    public q1(b bVar) {
        this.f16898a = bVar.f16916a;
        this.f16900b = bVar.f16917b;
        this.f16902c = l0.t0(bVar.f16918c);
        this.M = bVar.f16919d;
        this.N = bVar.f16920e;
        int i10 = bVar.f16921f;
        this.O = i10;
        int i11 = bVar.f16922g;
        this.P = i11;
        this.Q = i11 != -1 ? i11 : i10;
        this.R = bVar.f16923h;
        this.S = bVar.f16924i;
        this.T = bVar.f16925j;
        this.U = bVar.f16926k;
        this.V = bVar.f16927l;
        this.W = bVar.f16928m == null ? Collections.emptyList() : bVar.f16928m;
        m mVar = bVar.f16929n;
        this.X = mVar;
        this.Y = bVar.f16930o;
        this.Z = bVar.f16931p;
        this.f16899a0 = bVar.f16932q;
        this.f16901b0 = bVar.f16933r;
        int i12 = 0;
        this.f16903c0 = bVar.f16934s == -1 ? 0 : bVar.f16934s;
        this.f16904d0 = bVar.f16935t == -1.0f ? 1.0f : bVar.f16935t;
        this.f16905e0 = bVar.f16936u;
        this.f16906f0 = bVar.f16937v;
        this.f16907g0 = bVar.f16938w;
        this.f16908h0 = bVar.f16939x;
        this.f16909i0 = bVar.f16940y;
        this.f16910j0 = bVar.f16941z;
        this.f16911k0 = bVar.A == -1 ? 0 : bVar.A;
        this.f16912l0 = bVar.B != -1 ? bVar.B : i12;
        this.f16913m0 = bVar.C;
        if (bVar.D != 0 || mVar == null) {
            this.f16914n0 = bVar.D;
        } else {
            this.f16914n0 = 1;
        }
    }
}
