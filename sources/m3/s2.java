package m3;

import a5.v;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import c5.l;
import d5.b0;
import java.util.ArrayList;
import java.util.List;
import m3.h;
import o4.r0;
import z6.i;

public interface s2 {

    public static final class b implements h {
        public static final b f16980b = new a().e();
        public static final h.a<b> f16981c = t2.f16995a;
        public final l f16982a;

        public static final class a {
            public static final int[] f16983b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            public final l.b f16984a = new l.b();

            public a a(int i10) {
                this.f16984a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f16984a.b(bVar.f16982a);
                return this;
            }

            public a c(int... iArr) {
                this.f16984a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f16984a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f16984a.e());
            }
        }

        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(d(0));
            if (integerArrayList == null) {
                return f16980b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        public static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f16982a.equals(((b) obj).f16982a);
        }

        public int hashCode() {
            return this.f16982a.hashCode();
        }

        public b(l lVar) {
            this.f16982a = lVar;
        }
    }

    public static final class c {
        public final l f16985a;

        public c(l lVar) {
            this.f16985a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f16985a.equals(((c) obj).f16985a);
        }

        public int hashCode() {
            return this.f16985a.hashCode();
        }
    }

    public interface d {
        @Deprecated
        void B(boolean z10);

        @Deprecated
        void D(int i10);

        void H(boolean z10);

        @Deprecated
        void I();

        void K(t3 t3Var);

        void L(e eVar, e eVar2, int i10);

        void M(float f10);

        void N(int i10);

        void Q(boolean z10);

        void S(o3 o3Var, int i10);

        void T(int i10, boolean z10);

        @Deprecated
        void U(boolean z10, int i10);

        void V(c2 c2Var);

        void X(int i10);

        void Y(o3.e eVar);

        void b(boolean z10);

        void c0(boolean z10, int i10);

        void d0(y1 y1Var, int i10);

        void e0(s2 s2Var, c cVar);

        void g(r2 r2Var);

        void h0(o2 o2Var);

        void i0(int i10, int i11);

        @Deprecated
        void j0(r0 r0Var, v vVar);

        void m0(b bVar);

        void n0(o oVar);

        void o(f4.a aVar);

        void o0(o2 o2Var);

        void p0(boolean z10);

        void q();

        void r(List<q4.b> list);

        void x(b0 b0Var);

        void z(int i10);
    }

    public static final class e implements h {
        public static final h.a<e> T = v2.f17015a;
        public final y1 M;
        public final Object N;
        public final int O;
        public final long P;
        public final long Q;
        public final int R;
        public final int S;
        public final Object f16986a;
        @Deprecated
        public final int f16987b;
        public final int f16988c;

        public e(Object obj, int i10, y1 y1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f16986a = obj;
            this.f16987b = i10;
            this.f16988c = i10;
            this.M = y1Var;
            this.N = obj2;
            this.O = i11;
            this.P = j10;
            this.Q = j11;
            this.R = i12;
            this.S = i13;
        }

        public static e b(Bundle bundle) {
            return new e(null, bundle.getInt(c(0), -1), (y1) c5.c.e(y1.R, bundle.getBundle(c(1))), null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f16988c == eVar.f16988c && this.O == eVar.O && this.P == eVar.P && this.Q == eVar.Q && this.R == eVar.R && this.S == eVar.S && i.a(this.f16986a, eVar.f16986a) && i.a(this.N, eVar.N) && i.a(this.M, eVar.M);
        }

        public int hashCode() {
            return i.b(this.f16986a, Integer.valueOf(this.f16988c), this.M, this.N, Integer.valueOf(this.O), Long.valueOf(this.P), Long.valueOf(this.Q), Integer.valueOf(this.R), Integer.valueOf(this.S));
        }
    }

    long B();

    @Deprecated
    int C();

    boolean D();

    int E();

    boolean F();

    int H();

    int I();

    void J(int i10);

    @Deprecated
    int K();

    void L(int i10, int i11);

    void M(int i10, int i11, int i12);

    boolean N();

    void O(d dVar);

    @Deprecated
    r0 P();

    int Q();

    o3 R();

    boolean S();

    void T(TextureView textureView);

    void U(d dVar);

    long V();

    boolean W();

    void a();

    void b();

    void c(long j10);

    void d(r2 r2Var);

    void f(float f10);

    long g();

    boolean h();

    long i();

    void j(int i10, long j10);

    boolean k();

    void l(boolean z10);

    int m();

    boolean n();

    int o();

    void p(SurfaceView surfaceView);

    void r(int i10);

    int s();

    void u(int i10, int i11);

    @Deprecated
    int v();

    void x(boolean z10);

    void y(int i10);
}
