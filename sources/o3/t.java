package o3;

import java.nio.ByteBuffer;
import m3.q1;
import m3.r2;
import n3.p1;

public interface t {

    public static final class b extends Exception {
        public final int f18895a;
        public final boolean f18896b;
        public final q1 f18897c;

        public b(int r4, int r5, int r6, int r7, m3.q1 r8, boolean r9, java.lang.Exception r10) {
            throw new UnsupportedOperationException("Method not decompiled: o3.t.b.<init>(int, int, int, int, m3.q1, boolean, java.lang.Exception):void");
        }
    }

    public interface c {
        void a(long j10);

        void b(boolean z10);

        void c(Exception exc);

        void d(int i10, long j10, long j11);

        void e(long j10);

        void f();

        void g();
    }

    public static final class d extends Exception {
        public final long f18898a;
        public final long f18899b;

        public d(long r3, long r5) {
            throw new UnsupportedOperationException("Method not decompiled: o3.t.d.<init>(long, long):void");
        }
    }

    public static final class e extends Exception {
        public final int f18900a;
        public final boolean f18901b;
        public final q1 f18902c;

        public e(int r3, m3.q1 r4, boolean r5) {
            throw new UnsupportedOperationException("Method not decompiled: o3.t.e.<init>(int, m3.q1, boolean):void");
        }
    }

    boolean a(q1 q1Var);

    void b();

    void c();

    void d(r2 r2Var);

    boolean e();

    void f(float f10);

    void flush();

    void g();

    void h();

    boolean i();

    r2 j();

    int k(q1 q1Var);

    void l(c cVar);

    void m(int i10);

    long n(boolean z10);

    void o();

    void p();

    void q(o3.e eVar);

    void r(x xVar);

    void s();

    void t(p1 p1Var);

    boolean u(ByteBuffer byteBuffer, long j10, int i10);

    void v(q1 q1Var, int i10, int[] iArr);

    void w();

    void x(boolean z10);

    public static final class a extends Exception {
        public final q1 f18894a;

        public a(Throwable th, q1 q1Var) {
            super(th);
            this.f18894a = q1Var;
        }

        public a(String str, q1 q1Var) {
            super(str);
            this.f18894a = q1Var;
        }
    }
}
