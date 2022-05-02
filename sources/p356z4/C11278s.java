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
    public static final C11278s f36139h0;
    @Deprecated
    public static final C11278s f36140i0;
    public static final AbstractC6609h.AbstractC6610a<C11278s> f36141j0 = C11277r.f36138a;
    public final int f36142M;
    public final int f36143N;
    public final int f36144O;
    public final int f36145P;
    public final int f36146Q;
    public final int f36147R;
    public final int f36148S;
    public final boolean f36149T;
    public final AbstractC11396q<String> f36150U;
    public final AbstractC11396q<String> f36151V;
    public final int f36152W;
    public final int f36153X;
    public final int f36154Y;
    public final AbstractC11396q<String> f36155Z;
    public final int f36156a;
    public final AbstractC11396q<String> f36157a0;
    public final int f36158b;
    public final int f36159b0;
    public final int f36160c;
    public final boolean f36161c0;
    public final boolean f36162d0;
    public final boolean f36163e0;
    public final C11275q f36164f0;
    public final AbstractC11404s<Integer> f36165g0;

    static {
        C11278s y = new C11279a().mo965y();
        f36139h0 = y;
        f36140i0 = y;
    }

    public C11278s(C11279a aVar) {
        this.f36156a = aVar.f36166a;
        this.f36158b = aVar.f36167b;
        this.f36160c = aVar.f36168c;
        this.f36142M = aVar.f36169d;
        this.f36143N = aVar.f36170e;
        this.f36144O = aVar.f36171f;
        this.f36145P = aVar.f36172g;
        this.f36146Q = aVar.f36173h;
        this.f36147R = aVar.f36174i;
        this.f36148S = aVar.f36175j;
        this.f36149T = aVar.f36176k;
        this.f36150U = aVar.f36177l;
        this.f36151V = aVar.f36178m;
        this.f36152W = aVar.f36179n;
        this.f36153X = aVar.f36180o;
        this.f36154Y = aVar.f36181p;
        this.f36155Z = aVar.f36182q;
        this.f36157a0 = aVar.f36183r;
        this.f36159b0 = aVar.f36184s;
        this.f36161c0 = aVar.f36185t;
        this.f36162d0 = aVar.f36186u;
        this.f36163e0 = aVar.f36187v;
        this.f36164f0 = aVar.f36188w;
        this.f36165g0 = aVar.f36189x;
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
        return this.f36156a == sVar.f36156a && this.f36158b == sVar.f36158b && this.f36160c == sVar.f36160c && this.f36142M == sVar.f36142M && this.f36143N == sVar.f36143N && this.f36144O == sVar.f36144O && this.f36145P == sVar.f36145P && this.f36146Q == sVar.f36146Q && this.f36149T == sVar.f36149T && this.f36147R == sVar.f36147R && this.f36148S == sVar.f36148S && this.f36150U.equals(sVar.f36150U) && this.f36151V.equals(sVar.f36151V) && this.f36152W == sVar.f36152W && this.f36153X == sVar.f36153X && this.f36154Y == sVar.f36154Y && this.f36155Z.equals(sVar.f36155Z) && this.f36157a0.equals(sVar.f36157a0) && this.f36159b0 == sVar.f36159b0 && this.f36161c0 == sVar.f36161c0 && this.f36162d0 == sVar.f36162d0 && this.f36163e0 == sVar.f36163e0 && this.f36164f0.equals(sVar.f36164f0) && this.f36165g0.equals(sVar.f36165g0);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((this.f36156a + 31) * 31) + this.f36158b) * 31) + this.f36160c) * 31) + this.f36142M) * 31) + this.f36143N) * 31) + this.f36144O) * 31) + this.f36145P) * 31) + this.f36146Q) * 31) + (this.f36149T ? 1 : 0)) * 31) + this.f36147R) * 31) + this.f36148S) * 31) + this.f36150U.hashCode()) * 31) + this.f36151V.hashCode()) * 31) + this.f36152W) * 31) + this.f36153X) * 31) + this.f36154Y) * 31) + this.f36155Z.hashCode()) * 31) + this.f36157a0.hashCode()) * 31) + this.f36159b0) * 31) + (this.f36161c0 ? 1 : 0)) * 31) + (this.f36162d0 ? 1 : 0)) * 31) + (this.f36163e0 ? 1 : 0)) * 31) + this.f36164f0.hashCode()) * 31) + this.f36165g0.hashCode();
    }

    public static class C11279a {
        public int f36166a;
        public int f36167b;
        public int f36168c;
        public int f36169d;
        public int f36170e;
        public int f36171f;
        public int f36172g;
        public int f36173h;
        public int f36174i;
        public int f36175j;
        public boolean f36176k;
        public AbstractC11396q<String> f36177l;
        public AbstractC11396q<String> f36178m;
        public int f36179n;
        public int f36180o;
        public int f36181p;
        public AbstractC11396q<String> f36182q;
        public AbstractC11396q<String> f36183r;
        public int f36184s;
        public boolean f36185t;
        public boolean f36186u;
        public boolean f36187v;
        public C11275q f36188w;
        public AbstractC11404s<Integer> f36189x;

        @Deprecated
        public C11279a() {
            this.f36166a = Integer.MAX_VALUE;
            this.f36167b = Integer.MAX_VALUE;
            this.f36168c = Integer.MAX_VALUE;
            this.f36169d = Integer.MAX_VALUE;
            this.f36174i = Integer.MAX_VALUE;
            this.f36175j = Integer.MAX_VALUE;
            this.f36176k = true;
            this.f36177l = AbstractC11396q.m768D();
            this.f36178m = AbstractC11396q.m768D();
            this.f36179n = 0;
            this.f36180o = Integer.MAX_VALUE;
            this.f36181p = Integer.MAX_VALUE;
            this.f36182q = AbstractC11396q.m768D();
            this.f36183r = AbstractC11396q.m768D();
            this.f36184s = 0;
            this.f36185t = false;
            this.f36186u = false;
            this.f36187v = false;
            this.f36188w = C11275q.f36132b;
            this.f36189x = AbstractC11404s.m731B();
        }

        public static AbstractC11396q<String> m964z(String[] strArr) {
            AbstractC11396q.C11397a x = AbstractC11396q.m760x();
            for (String str : (String[]) C1186a.m38185e(strArr)) {
                x.m757d(C1216l0.m37949s0((String) C1186a.m38185e(str)));
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
                this.f36184s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f36183r = AbstractC11396q.m767E(C1216l0.m37996Q(locale));
                }
            }
        }

        public C11279a mo991C(int i, int i2, boolean z) {
            this.f36174i = i;
            this.f36175j = i2;
            this.f36176k = z;
            return this;
        }

        public C11279a mo990D(Context context, boolean z) {
            Point H = C1216l0.m38007H(context);
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
            C11278s sVar = C11278s.f36139h0;
            this.f36166a = bundle.getInt(c, sVar.f36156a);
            this.f36167b = bundle.getInt(C11278s.m995c(7), sVar.f36158b);
            this.f36168c = bundle.getInt(C11278s.m995c(8), sVar.f36160c);
            this.f36169d = bundle.getInt(C11278s.m995c(9), sVar.f36142M);
            this.f36170e = bundle.getInt(C11278s.m995c(10), sVar.f36143N);
            this.f36171f = bundle.getInt(C11278s.m995c(11), sVar.f36144O);
            this.f36172g = bundle.getInt(C11278s.m995c(12), sVar.f36145P);
            this.f36173h = bundle.getInt(C11278s.m995c(13), sVar.f36146Q);
            this.f36174i = bundle.getInt(C11278s.m995c(14), sVar.f36147R);
            this.f36175j = bundle.getInt(C11278s.m995c(15), sVar.f36148S);
            this.f36176k = bundle.getBoolean(C11278s.m995c(16), sVar.f36149T);
            this.f36177l = AbstractC11396q.m771A((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(17)), new String[0]));
            this.f36178m = m964z((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(1)), new String[0]));
            this.f36179n = bundle.getInt(C11278s.m995c(2), sVar.f36152W);
            this.f36180o = bundle.getInt(C11278s.m995c(18), sVar.f36153X);
            this.f36181p = bundle.getInt(C11278s.m995c(19), sVar.f36154Y);
            this.f36182q = AbstractC11396q.m771A((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(20)), new String[0]));
            this.f36183r = m964z((String[]) C10431g.m5140a(bundle.getStringArray(C11278s.m995c(3)), new String[0]));
            this.f36184s = bundle.getInt(C11278s.m995c(4), sVar.f36159b0);
            this.f36185t = bundle.getBoolean(C11278s.m995c(5), sVar.f36161c0);
            this.f36186u = bundle.getBoolean(C11278s.m995c(21), sVar.f36162d0);
            this.f36187v = bundle.getBoolean(C11278s.m995c(22), sVar.f36163e0);
            this.f36188w = (C11275q) C1190c.m38111f(C11275q.f36133c, bundle.getBundle(C11278s.m995c(23)), C11275q.f36132b);
            this.f36189x = AbstractC11404s.m722x(C0199c.m42103c((int[]) C10431g.m5140a(bundle.getIntArray(C11278s.m995c(25)), new int[0])));
        }
    }
}
