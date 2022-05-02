package p356z4;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
import p008a7.C0199c;
import p020b5.C1186a;
import p020b5.C1190c;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;
import p343y6.C10431g;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11404s;

public class C11278s implements AbstractC6609h {
    public static final C11278s f36142h0;
    @Deprecated
    public static final C11278s f36143i0;
    public static final AbstractC6609h.AbstractC6610a<C11278s> f36144j0 = C11277r.f36141a;
    public final int f36145M;
    public final int f36146N;
    public final int f36147O;
    public final int f36148P;
    public final int f36149Q;
    public final int f36150R;
    public final int f36151S;
    public final boolean f36152T;
    public final AbstractC11396q<String> f36153U;
    public final AbstractC11396q<String> f36154V;
    public final int f36155W;
    public final int f36156X;
    public final int f36157Y;
    public final AbstractC11396q<String> f36158Z;
    public final int f36159a;
    public final AbstractC11396q<String> f36160a0;
    public final int f36161b;
    public final int f36162b0;
    public final int f36163c;
    public final boolean f36164c0;
    public final boolean f36165d0;
    public final boolean f36166e0;
    public final C11275q f36167f0;
    public final AbstractC11404s<Integer> f36168g0;

    static {
        C11278s y = new C11279a().mo965y();
        f36142h0 = y;
        f36143i0 = y;
    }

    public C11278s(C11279a aVar) {
        this.f36159a = aVar.f36169a;
        this.f36161b = aVar.f36170b;
        this.f36163c = aVar.f36171c;
        this.f36145M = aVar.f36172d;
        this.f36146N = aVar.f36173e;
        this.f36147O = aVar.f36174f;
        this.f36148P = aVar.f36175g;
        this.f36149Q = aVar.f36176h;
        this.f36150R = aVar.f36177i;
        this.f36151S = aVar.f36178j;
        this.f36152T = aVar.f36179k;
        this.f36153U = aVar.f36180l;
        this.f36154V = aVar.f36181m;
        this.f36155W = aVar.f36182n;
        this.f36156X = aVar.f36183o;
        this.f36157Y = aVar.f36184p;
        this.f36158Z = aVar.f36185q;
        this.f36160a0 = aVar.f36186r;
        this.f36162b0 = aVar.f36187s;
        this.f36164c0 = aVar.f36188t;
        this.f36165d0 = aVar.f36189u;
        this.f36166e0 = aVar.f36190v;
        this.f36167f0 = aVar.f36191w;
        this.f36168g0 = aVar.f36192x;
    }

    public static String m995c(int i) {
        return Integer.toString(i, 36);
    }

    public static C11278s m994d(Bundle bundle) {
        return new C11279a(bundle).mo965y();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11278s sVar = (C11278s) obj;
        return this.f36159a == sVar.f36159a && this.f36161b == sVar.f36161b && this.f36163c == sVar.f36163c && this.f36145M == sVar.f36145M && this.f36146N == sVar.f36146N && this.f36147O == sVar.f36147O && this.f36148P == sVar.f36148P && this.f36149Q == sVar.f36149Q && this.f36152T == sVar.f36152T && this.f36150R == sVar.f36150R && this.f36151S == sVar.f36151S && this.f36153U.equals(sVar.f36153U) && this.f36154V.equals(sVar.f36154V) && this.f36155W == sVar.f36155W && this.f36156X == sVar.f36156X && this.f36157Y == sVar.f36157Y && this.f36158Z.equals(sVar.f36158Z) && this.f36160a0.equals(sVar.f36160a0) && this.f36162b0 == sVar.f36162b0 && this.f36164c0 == sVar.f36164c0 && this.f36165d0 == sVar.f36165d0 && this.f36166e0 == sVar.f36166e0 && this.f36167f0.equals(sVar.f36167f0) && this.f36168g0.equals(sVar.f36168g0);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((this.f36159a + 31) * 31) + this.f36161b) * 31) + this.f36163c) * 31) + this.f36145M) * 31) + this.f36146N) * 31) + this.f36147O) * 31) + this.f36148P) * 31) + this.f36149Q) * 31) + (this.f36152T ? 1 : 0)) * 31) + this.f36150R) * 31) + this.f36151S) * 31) + this.f36153U.hashCode()) * 31) + this.f36154V.hashCode()) * 31) + this.f36155W) * 31) + this.f36156X) * 31) + this.f36157Y) * 31) + this.f36158Z.hashCode()) * 31) + this.f36160a0.hashCode()) * 31) + this.f36162b0) * 31) + (this.f36164c0 ? 1 : 0)) * 31) + (this.f36165d0 ? 1 : 0)) * 31) + (this.f36166e0 ? 1 : 0)) * 31) + this.f36167f0.hashCode()) * 31) + this.f36168g0.hashCode();
    }

    public static class C11279a {
        public int f36169a;
        public int f36170b;
        public int f36171c;
        public int f36172d;
        public int f36173e;
        public int f36174f;
        public int f36175g;
        public int f36176h;
        public int f36177i;
        public int f36178j;
        public boolean f36179k;
        public AbstractC11396q<String> f36180l;
        public AbstractC11396q<String> f36181m;
        public int f36182n;
        public int f36183o;
        public int f36184p;
        public AbstractC11396q<String> f36185q;
        public AbstractC11396q<String> f36186r;
        public int f36187s;
        public boolean f36188t;
        public boolean f36189u;
        public boolean f36190v;
        public C11275q f36191w;
        public AbstractC11404s<Integer> f36192x;

        @Deprecated
        public C11279a() {
            this.f36169a = Integer.MAX_VALUE;
            this.f36170b = Integer.MAX_VALUE;
            this.f36171c = Integer.MAX_VALUE;
            this.f36172d = Integer.MAX_VALUE;
            this.f36177i = Integer.MAX_VALUE;
            this.f36178j = Integer.MAX_VALUE;
            this.f36179k = true;
            this.f36180l = AbstractC11396q.m768D();
            this.f36181m = AbstractC11396q.m768D();
            this.f36182n = 0;
            this.f36183o = Integer.MAX_VALUE;
            this.f36184p = Integer.MAX_VALUE;
            this.f36185q = AbstractC11396q.m768D();
            this.f36186r = AbstractC11396q.m768D();
            this.f36187s = 0;
            this.f36188t = false;
            this.f36189u = false;
            this.f36190v = false;
            this.f36191w = C11275q.f36135b;
            this.f36192x = AbstractC11404s.m731B();
        }

        public static AbstractC11396q<String> m964z(String[] strArr) {
            AbstractC11396q.C11397a x = AbstractC11396q.m760x();
            for (String str : (String[]) C1186a.m38188e(strArr)) {
                x.m757d(C1216l0.m37952s0((String) C1186a.m38188e(str)));
            }
            return x.m756e();
        }

        public C11279a mo993A(Context context) {
            if (C1216l0.f4526a >= 19) {
                m992B(context);
            }
            return this;
        }

        public final void m992B(Context context) {
            CaptioningManager captioningManager;
            if ((C1216l0.f4526a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f36187s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f36186r = AbstractC11396q.m767E(C1216l0.m37999Q(locale));
                }
            }
        }

        public C11279a mo991C(int i, int i2, boolean z) {
            this.f36177i = i;
            this.f36178j = i2;
            this.f36179k = z;
            return this;
        }

        public C11279a mo990D(Context context, boolean z) {
            Point H = C1216l0.m38010H(context);
            return mo991C(H.x, H.y, z);
        }

        public C11278s mo965y() {
            return new C11278s(this);
        }

        public C11279a(Context context) {
            this();
            mo993A(context);
            mo990D(context, true);
        }

        public C11279a(Bundle bundle) {
            String c = C11278s.m995c(6);
            C11278s sVar = C11278s.f36142h0;
            this.f36169a = bundle.getInt(c, sVar.f36159a);
            this.f36170b = bundle.getInt(C11278s.m995c(7), sVar.f36161b);
            this.f36171c = bundle.getInt(C11278s.m995c(8), sVar.f36163c);
            this.f36172d = bundle.getInt(C11278s.m995c(9), sVar.f36145M);
            this.f36173e = bundle.getInt(C11278s.m995c(10), sVar.f36146N);
            this.f36174f = bundle.getInt(C11278s.m995c(11), sVar.f36147O);
            this.f36175g = bundle.getInt(C11278s.m995c(12), sVar.f36148P);
            this.f36176h = bundle.getInt(C11278s.m995c(13), sVar.f36149Q);
            this.f36177i = bundle.getInt(C11278s.m995c(14), sVar.f36150R);
            this.f36178j = bundle.getInt(C11278s.m995c(15), sVar.f36151S);
            this.f36179k = bundle.getBoolean(C11278s.m995c(16), sVar.f36152T);
            this.f36180l = AbstractC11396q.m771A((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(17)), new String[0]));
            this.f36181m = m964z((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(1)), new String[0]));
            this.f36182n = bundle.getInt(C11278s.m995c(2), sVar.f36155W);
            this.f36183o = bundle.getInt(C11278s.m995c(18), sVar.f36156X);
            this.f36184p = bundle.getInt(C11278s.m995c(19), sVar.f36157Y);
            this.f36185q = AbstractC11396q.m771A((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(20)), new String[0]));
            this.f36186r = m964z((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(3)), new String[0]));
            this.f36187s = bundle.getInt(C11278s.m995c(4), sVar.f36162b0);
            this.f36188t = bundle.getBoolean(C11278s.m995c(5), sVar.f36164c0);
            this.f36189u = bundle.getBoolean(C11278s.m995c(21), sVar.f36165d0);
            this.f36190v = bundle.getBoolean(C11278s.m995c(22), sVar.f36166e0);
            this.f36191w = (C11275q) C1190c.m38114f(C11275q.f36136c, bundle.getBundle(C11278s.m995c(23)), C11275q.f36135b);
            this.f36192x = AbstractC11404s.m722x(C0199c.m42106c((int[]) C10431g.m5140a(bundle.getIntArray(C11278s.m995c(25)), new int[0])));
        }
    }
}
