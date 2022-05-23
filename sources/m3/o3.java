package m3;

import a7.q;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import c5.l0;
import m3.h;
import m3.y1;
import p4.c;

public abstract class o3 implements h {
    public static final o3 f16858a = new a();
    public static final h.a<o3> f16859b = n3.f16849a;

    public class a extends o3 {
        @Override
        public int f(Object obj) {
            return -1;
        }

        @Override
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int m() {
            return 0;
        }

        @Override
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int t() {
            return 0;
        }
    }

    public static final class b implements h {
        public static final h.a<b> Q = p3.f16894a;
        public long M;
        public long N;
        public boolean O;
        public p4.c P = p4.c.P;
        public Object f16860a;
        public Object f16861b;
        public int f16862c;

        public static b c(Bundle bundle) {
            p4.c cVar;
            int i10 = bundle.getInt(u(0), 0);
            long j10 = bundle.getLong(u(1), -9223372036854775807L);
            long j11 = bundle.getLong(u(2), 0L);
            boolean z10 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            if (bundle2 != null) {
                cVar = p4.c.R.a(bundle2);
            } else {
                cVar = p4.c.P;
            }
            p4.c cVar2 = cVar;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, cVar2, z10);
            return bVar;
        }

        public static String u(int i10) {
            return Integer.toString(i10, 36);
        }

        public int d(int i10) {
            return this.P.c(i10).f20516b;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.P.c(i10);
            if (c10.f20516b != -1) {
                return c10.N[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return l0.c(this.f16860a, bVar.f16860a) && l0.c(this.f16861b, bVar.f16861b) && this.f16862c == bVar.f16862c && this.M == bVar.M && this.N == bVar.N && this.O == bVar.O && l0.c(this.P, bVar.P);
        }

        public int f() {
            return this.P.f20513b;
        }

        public int g(long j10) {
            return this.P.d(j10, this.M);
        }

        public int h(long j10) {
            return this.P.e(j10, this.M);
        }

        public int hashCode() {
            Object obj = this.f16860a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f16861b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.M;
            long j11 = this.N;
            return ((((((((((hashCode + i10) * 31) + this.f16862c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.O ? 1 : 0)) * 31) + this.P.hashCode();
        }

        public long i(int i10) {
            return this.P.c(i10).f20515a;
        }

        public long j() {
            return this.P.f20514c;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.P.c(i10);
            if (c10.f20516b != -1) {
                return c10.M[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.P.c(i10).O;
        }

        public long m() {
            return this.M;
        }

        public int n(int i10) {
            return this.P.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.P.c(i10).f(i11);
        }

        public long p() {
            return l0.I0(this.N);
        }

        public long q() {
            return this.N;
        }

        public int r() {
            return this.P.N;
        }

        public boolean s(int i10) {
            return !this.P.c(i10).g();
        }

        public boolean t(int i10) {
            return this.P.c(i10).P;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, p4.c.P, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, p4.c cVar, boolean z10) {
            this.f16860a = obj;
            this.f16861b = obj2;
            this.f16862c = i10;
            this.M = j10;
            this.N = j11;
            this.P = cVar;
            this.O = z10;
            return this;
        }
    }

    public static final class c extends o3 {
        public final q<b> M;
        public final int[] N;
        public final int[] O;
        public final q<d> f16863c;

        public c(q<d> qVar, q<b> qVar2, int[] iArr) {
            c5.a.a(qVar.size() == iArr.length);
            this.f16863c = qVar;
            this.M = qVar2;
            this.N = iArr;
            this.O = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.O[iArr[i10]] = i10;
            }
        }

        @Override
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.N[0];
            }
            return 0;
        }

        @Override
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.N[t() - 1];
            }
            return t() - 1;
        }

        @Override
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.N[this.O[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.M.get(i10);
            bVar.w(bVar2.f16860a, bVar2.f16861b, bVar2.f16862c, bVar2.M, bVar2.N, bVar2.P, bVar2.O);
            return bVar;
        }

        @Override
        public int m() {
            return this.M.size();
        }

        @Override
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.N[this.O[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override
        public d s(int i10, d dVar, long j10) {
            d dVar2 = this.f16863c.get(i10);
            dVar.j(dVar2.f16868a, dVar2.f16870c, dVar2.M, dVar2.N, dVar2.O, dVar2.P, dVar2.Q, dVar2.R, dVar2.T, dVar2.V, dVar2.W, dVar2.X, dVar2.Y, dVar2.Z);
            dVar.U = dVar2.U;
            return dVar;
        }

        @Override
        public int t() {
            return this.f16863c.size();
        }
    }

    public static final class d implements h {
        public static final Object f16864a0 = new Object();
        public static final Object f16865b0 = new Object();
        public static final y1 f16866c0 = new y1.c().c("com.google.android.exoplayer2.Timeline").e(Uri.EMPTY).a();
        public static final h.a<d> f16867d0 = q3.f16943a;
        public Object M;
        public long N;
        public long O;
        public long P;
        public boolean Q;
        public boolean R;
        @Deprecated
        public boolean S;
        public y1.g T;
        public boolean U;
        public long V;
        public long W;
        public int X;
        public int Y;
        public long Z;
        @Deprecated
        public Object f16869b;
        public Object f16868a = f16864a0;
        public y1 f16870c = f16866c0;

        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(i(1));
            y1.g gVar = null;
            y1 a10 = bundle2 != null ? y1.R.a(bundle2) : null;
            long j10 = bundle.getLong(i(2), -9223372036854775807L);
            long j11 = bundle.getLong(i(3), -9223372036854775807L);
            long j12 = bundle.getLong(i(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(i(5), false);
            boolean z11 = bundle.getBoolean(i(6), false);
            Bundle bundle3 = bundle.getBundle(i(7));
            if (bundle3 != null) {
                gVar = y1.g.P.a(bundle3);
            }
            boolean z12 = bundle.getBoolean(i(8), false);
            long j13 = bundle.getLong(i(9), 0L);
            long j14 = bundle.getLong(i(10), -9223372036854775807L);
            int i10 = bundle.getInt(i(11), 0);
            int i11 = bundle.getInt(i(12), 0);
            long j15 = bundle.getLong(i(13), 0L);
            d dVar = new d();
            dVar.j(f16865b0, a10, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.U = z12;
            return dVar;
        }

        public static String i(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return l0.U(this.P);
        }

        public long d() {
            return l0.I0(this.V);
        }

        public long e() {
            return this.V;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return l0.c(this.f16868a, dVar.f16868a) && l0.c(this.f16870c, dVar.f16870c) && l0.c(this.M, dVar.M) && l0.c(this.T, dVar.T) && this.N == dVar.N && this.O == dVar.O && this.P == dVar.P && this.Q == dVar.Q && this.R == dVar.R && this.U == dVar.U && this.V == dVar.V && this.W == dVar.W && this.X == dVar.X && this.Y == dVar.Y && this.Z == dVar.Z;
        }

        public long f() {
            return l0.I0(this.W);
        }

        public long g() {
            return this.Z;
        }

        public boolean h() {
            c5.a.f(this.S == (this.T != null));
            return this.T != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f16868a.hashCode()) * 31) + this.f16870c.hashCode()) * 31;
            Object obj = this.M;
            int i10 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            y1.g gVar = this.T;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            long j10 = this.N;
            long j11 = this.O;
            long j12 = this.P;
            long j13 = this.V;
            long j14 = this.W;
            long j15 = this.Z;
            return ((((((((((((((((((((((hashCode2 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.X) * 31) + this.Y) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public d j(Object obj, y1 y1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, y1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            y1.h hVar;
            this.f16868a = obj;
            this.f16870c = y1Var != null ? y1Var : f16866c0;
            this.f16869b = (y1Var == null || (hVar = y1Var.f17043b) == null) ? null : hVar.f17098h;
            this.M = obj2;
            this.N = j10;
            this.O = j11;
            this.P = j12;
            this.Q = z10;
            this.R = z11;
            this.S = gVar != null;
            this.T = gVar;
            this.V = j13;
            this.W = j14;
            this.X = i10;
            this.Y = i11;
            this.Z = j15;
            this.U = false;
            return this;
        }
    }

    public static o3 b(Bundle bundle) {
        q c10 = c(d.f16867d0, c5.b.a(bundle, w(0)));
        q c11 = c(b.Q, c5.b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    public static <T extends h> q<T> c(h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return q.D();
        }
        q.a aVar2 = new q.a();
        q<Bundle> a10 = g.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.h();
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public static String w(int i10) {
        return Integer.toString(i10, 36);
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        if (!(o3Var.t() == t() && o3Var.m() == m())) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(o3Var.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(o3Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f16862c;
        if (r(i12, dVar).Y != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).X;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        for (int i10 = 0; i10 < t(); i10++) {
            t10 = (t10 * 31) + r(i10, dVar).hashCode();
        }
        int m10 = (t10 * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            m10 = (m10 * 31) + k(i11, bVar, true).hashCode();
        }
        return m10;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == g(z10)) {
                return e(z10);
            } else {
                return i10 + 1;
            }
        } else if (i10 == g(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) c5.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        c5.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.X;
        j(i11, bVar);
        while (i11 < dVar.Y && bVar.N != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).N > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.N;
        long j13 = bVar.M;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(c5.a.e(bVar.f16861b), Long.valueOf(Math.max(0L, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == e(z10)) {
                return g(z10);
            } else {
                return i10 - 1;
            }
        } else if (i10 == e(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}
