package m3;

import a5.b0;
import a5.l;
import android.content.Context;
import android.os.Looper;
import b5.e;
import b5.r;
import c5.d;
import c5.d0;
import c5.l0;
import java.util.List;
import m3.j;
import m3.s;
import n3.c;
import o4.s;
import z6.f;
import z6.o;

public interface s extends s2 {

    public interface a {
        void G(boolean z10);

        void q(boolean z10);
    }

    public static final class b {
        public boolean A;
        public final Context f16952a;
        public d f16953b;
        public long f16954c;
        public o<f3> f16955d;
        public o<s.a> f16956e;
        public o<b0> f16957f;
        public o<w1> f16958g;
        public o<e> f16959h;
        public f<d, n3.a> f16960i;
        public Looper f16961j;
        public d0 f16962k;
        public o3.e f16963l;
        public boolean f16964m;
        public int f16965n;
        public boolean f16966o;
        public boolean f16967p;
        public int f16968q;
        public int f16969r;
        public boolean f16970s;
        public g3 f16971t;
        public long f16972u;
        public long f16973v;
        public v1 f16974w;
        public long f16975x;
        public long f16976y;
        public boolean f16977z;

        public b(Context context, final f3 f3Var, final s.a aVar) {
            this(context, new o() {
                @Override
                public final Object get() {
                    f3 j10;
                    j10 = s.b.j(f3.this);
                    return j10;
                }
            }, new o() {
                @Override
                public final Object get() {
                    s.a k10;
                    k10 = s.b.k(s.a.this);
                    return k10;
                }
            });
        }

        public static b0 h(Context context) {
            return new l(context);
        }

        public static f3 j(f3 f3Var) {
            return f3Var;
        }

        public static s.a k(s.a aVar) {
            return aVar;
        }

        public static w1 l(w1 w1Var) {
            return w1Var;
        }

        public static b0 m(b0 b0Var) {
            return b0Var;
        }

        public s g() {
            c5.a.f(!this.A);
            this.A = true;
            return new b1(this, null);
        }

        public b n(final w1 w1Var) {
            c5.a.f(!this.A);
            this.f16958g = new o() {
                @Override
                public final Object get() {
                    w1 l10;
                    l10 = s.b.l(w1.this);
                    return l10;
                }
            };
            return this;
        }

        public b o(final b0 b0Var) {
            c5.a.f(!this.A);
            this.f16957f = new o() {
                @Override
                public final Object get() {
                    b0 m10;
                    m10 = s.b.m(b0.this);
                    return m10;
                }
            };
            return this;
        }

        public b(final Context context, o<f3> oVar, o<s.a> oVar2) {
            this(context, oVar, oVar2, new o() {
                @Override
                public final Object get() {
                    b0 h10;
                    h10 = s.b.h(context);
                    return h10;
                }
            }, a0.f16483a, new o() {
                @Override
                public final Object get() {
                    e l10;
                    l10 = r.l(context);
                    return l10;
                }
            }, t.f16990a);
        }

        public b(Context context, o<f3> oVar, o<s.a> oVar2, o<b0> oVar3, o<w1> oVar4, o<e> oVar5, f<d, n3.a> fVar) {
            this.f16952a = context;
            this.f16955d = oVar;
            this.f16956e = oVar2;
            this.f16957f = oVar3;
            this.f16958g = oVar4;
            this.f16959h = oVar5;
            this.f16960i = fVar;
            this.f16961j = l0.K();
            this.f16963l = o3.e.P;
            this.f16965n = 0;
            this.f16968q = 1;
            this.f16969r = 0;
            this.f16970s = true;
            this.f16971t = g3.f16670g;
            this.f16972u = 5000L;
            this.f16973v = 15000L;
            this.f16974w = new j.b().a();
            this.f16953b = d.f4804a;
            this.f16975x = 500L;
            this.f16976y = 2000L;
        }
    }

    void A(int i10, o4.s sVar);

    void G(o3.e eVar, boolean z10);

    void e(int i10, List<o4.s> list);

    void q(List<o4.s> list);

    void t(List<o4.s> list);

    void w(o4.s sVar);

    void z(c cVar);
}
