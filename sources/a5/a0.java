package a5;

import a7.q;
import a7.s;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import b7.d;
import c5.c;
import c5.l0;
import java.util.Locale;
import m3.h;
import z6.g;

public class a0 implements h {
    public static final a0 f424i0;
    @Deprecated
    public static final a0 f425j0;
    public static final h.a<a0> f426k0 = z.f551a;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final q<String> U;
    public final int V;
    public final q<String> W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int f427a;
    public final q<String> f428a0;
    public final int f429b;
    public final q<String> f430b0;
    public final int f431c;
    public final int f432c0;
    public final boolean f433d0;
    public final boolean f434e0;
    public final boolean f435f0;
    public final y f436g0;
    public final s<Integer> f437h0;

    static {
        a0 z10 = new a().z();
        f424i0 = z10;
        f425j0 = z10;
    }

    public a0(a aVar) {
        this.f427a = aVar.f438a;
        this.f429b = aVar.f439b;
        this.f431c = aVar.f440c;
        this.M = aVar.f441d;
        this.N = aVar.f442e;
        this.O = aVar.f443f;
        this.P = aVar.f444g;
        this.Q = aVar.f445h;
        this.R = aVar.f446i;
        this.S = aVar.f447j;
        this.T = aVar.f448k;
        this.U = aVar.f449l;
        this.V = aVar.f450m;
        this.W = aVar.f451n;
        this.X = aVar.f452o;
        this.Y = aVar.f453p;
        this.Z = aVar.f454q;
        this.f428a0 = aVar.f455r;
        this.f430b0 = aVar.f456s;
        this.f432c0 = aVar.f457t;
        this.f433d0 = aVar.f458u;
        this.f434e0 = aVar.f459v;
        this.f435f0 = aVar.f460w;
        this.f436g0 = aVar.f461x;
        this.f437h0 = aVar.f462y;
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static a0 d(Bundle bundle) {
        return new a(bundle).z();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f427a == a0Var.f427a && this.f429b == a0Var.f429b && this.f431c == a0Var.f431c && this.M == a0Var.M && this.N == a0Var.N && this.O == a0Var.O && this.P == a0Var.P && this.Q == a0Var.Q && this.T == a0Var.T && this.R == a0Var.R && this.S == a0Var.S && this.U.equals(a0Var.U) && this.V == a0Var.V && this.W.equals(a0Var.W) && this.X == a0Var.X && this.Y == a0Var.Y && this.Z == a0Var.Z && this.f428a0.equals(a0Var.f428a0) && this.f430b0.equals(a0Var.f430b0) && this.f432c0 == a0Var.f432c0 && this.f433d0 == a0Var.f433d0 && this.f434e0 == a0Var.f434e0 && this.f435f0 == a0Var.f435f0 && this.f436g0.equals(a0Var.f436g0) && this.f437h0.equals(a0Var.f437h0);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.f427a + 31) * 31) + this.f429b) * 31) + this.f431c) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + (this.T ? 1 : 0)) * 31) + this.R) * 31) + this.S) * 31) + this.U.hashCode()) * 31) + this.V) * 31) + this.W.hashCode()) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.f428a0.hashCode()) * 31) + this.f430b0.hashCode()) * 31) + this.f432c0) * 31) + (this.f433d0 ? 1 : 0)) * 31) + (this.f434e0 ? 1 : 0)) * 31) + (this.f435f0 ? 1 : 0)) * 31) + this.f436g0.hashCode()) * 31) + this.f437h0.hashCode();
    }

    public static class a {
        public int f438a;
        public int f439b;
        public int f440c;
        public int f441d;
        public int f442e;
        public int f443f;
        public int f444g;
        public int f445h;
        public int f446i;
        public int f447j;
        public boolean f448k;
        public q<String> f449l;
        public int f450m;
        public q<String> f451n;
        public int f452o;
        public int f453p;
        public int f454q;
        public q<String> f455r;
        public q<String> f456s;
        public int f457t;
        public boolean f458u;
        public boolean f459v;
        public boolean f460w;
        public y f461x;
        public s<Integer> f462y;

        @Deprecated
        public a() {
            this.f438a = Integer.MAX_VALUE;
            this.f439b = Integer.MAX_VALUE;
            this.f440c = Integer.MAX_VALUE;
            this.f441d = Integer.MAX_VALUE;
            this.f446i = Integer.MAX_VALUE;
            this.f447j = Integer.MAX_VALUE;
            this.f448k = true;
            this.f449l = q.D();
            this.f450m = 0;
            this.f451n = q.D();
            this.f452o = 0;
            this.f453p = Integer.MAX_VALUE;
            this.f454q = Integer.MAX_VALUE;
            this.f455r = q.D();
            this.f456s = q.D();
            this.f457t = 0;
            this.f458u = false;
            this.f459v = false;
            this.f460w = false;
            this.f461x = y.f545b;
            this.f462y = s.B();
        }

        public static q<String> A(String[] strArr) {
            q.a x10 = q.x();
            for (String str : (String[]) c5.a.e(strArr)) {
                x10.a(l0.t0((String) c5.a.e(str)));
            }
            return x10.h();
        }

        public a B(Context context) {
            if (l0.f4841a >= 19) {
                C(context);
            }
            return this;
        }

        public final void C(Context context) {
            CaptioningManager captioningManager;
            if ((l0.f4841a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f457t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f456s = q.E(l0.R(locale));
                }
            }
        }

        public a D(int i10, int i11, boolean z10) {
            this.f446i = i10;
            this.f447j = i11;
            this.f448k = z10;
            return this;
        }

        public a E(Context context, boolean z10) {
            Point I = l0.I(context);
            return D(I.x, I.y, z10);
        }

        public a0 z() {
            return new a0(this);
        }

        public a(Context context) {
            this();
            B(context);
            E(context, true);
        }

        public a(Bundle bundle) {
            String c10 = a0.c(6);
            a0 a0Var = a0.f424i0;
            this.f438a = bundle.getInt(c10, a0Var.f427a);
            this.f439b = bundle.getInt(a0.c(7), a0Var.f429b);
            this.f440c = bundle.getInt(a0.c(8), a0Var.f431c);
            this.f441d = bundle.getInt(a0.c(9), a0Var.M);
            this.f442e = bundle.getInt(a0.c(10), a0Var.N);
            this.f443f = bundle.getInt(a0.c(11), a0Var.O);
            this.f444g = bundle.getInt(a0.c(12), a0Var.P);
            this.f445h = bundle.getInt(a0.c(13), a0Var.Q);
            this.f446i = bundle.getInt(a0.c(14), a0Var.R);
            this.f447j = bundle.getInt(a0.c(15), a0Var.S);
            this.f448k = bundle.getBoolean(a0.c(16), a0Var.T);
            this.f449l = q.A((String[]) g.a(bundle.getStringArray(a0.c(17)), new String[0]));
            this.f450m = bundle.getInt(a0.c(26), a0Var.V);
            this.f451n = A((String[]) g.a(bundle.getStringArray(a0.c(1)), new String[0]));
            this.f452o = bundle.getInt(a0.c(2), a0Var.X);
            this.f453p = bundle.getInt(a0.c(18), a0Var.Y);
            this.f454q = bundle.getInt(a0.c(19), a0Var.Z);
            this.f455r = q.A((String[]) g.a(bundle.getStringArray(a0.c(20)), new String[0]));
            this.f456s = A((String[]) g.a(bundle.getStringArray(a0.c(3)), new String[0]));
            this.f457t = bundle.getInt(a0.c(4), a0Var.f432c0);
            this.f458u = bundle.getBoolean(a0.c(5), a0Var.f433d0);
            this.f459v = bundle.getBoolean(a0.c(21), a0Var.f434e0);
            this.f460w = bundle.getBoolean(a0.c(22), a0Var.f435f0);
            this.f461x = (y) c.f(y.f546c, bundle.getBundle(a0.c(23)), y.f545b);
            this.f462y = s.x(d.c((int[]) g.a(bundle.getIntArray(a0.c(25)), new int[0])));
        }
    }
}
