package p209od;

import org.thunderdog.challegram.Log;
import p108hb.C5069h;
import p108hb.C5070i;

public class C7856c {
    public double f25319a;
    public double f25320b;
    public double f25321c;
    public double f25322d;
    public int f25323e;
    public float f25324f;

    public C7856c() {
        this.f25319a = 0.0d;
        this.f25320b = 0.0d;
        this.f25321c = 1.0d;
        this.f25322d = 1.0d;
        this.f25323e = 0;
        this.f25324f = 0.0f;
    }

    public static C7856c m14816n(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        try {
            String[] split = str.split(":");
            if (split.length == 6) {
                return new C7856c(Double.parseDouble(split[0]), Double.parseDouble(split[1]), Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]), Float.parseFloat(split[5]));
            }
            throw new IllegalArgumentException("data.length != 6 (" + split.length + ", " + str + ")");
        } catch (Throwable th) {
            Log.m14723e(th);
            return null;
        }
    }

    public boolean m14829a(C7856c cVar) {
        if (cVar == null) {
            return m14818l();
        }
        return this.f25319a == cVar.f25319a && this.f25320b == cVar.f25320b && this.f25321c == cVar.f25321c && this.f25322d == cVar.f25322d && this.f25323e == cVar.f25323e && this.f25324f == cVar.f25324f;
    }

    public double m14828b() {
        return this.f25322d;
    }

    public float m14827c() {
        return this.f25324f;
    }

    public double m14826d() {
        return this.f25319a;
    }

    public double m14825e() {
        return this.f25322d - this.f25320b;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C7856c) && m14829a((C7856c) obj));
    }

    public double m14824f() {
        return this.f25321c - this.f25319a;
    }

    public double m14823g() {
        return this.f25321c;
    }

    public int m14822h() {
        return this.f25323e;
    }

    public double m14821i() {
        return this.f25320b;
    }

    public boolean m14820j() {
        return (this.f25323e == 0 && this.f25324f == 0.0f) ? false : true;
    }

    public final void m14819k(boolean z) {
    }

    public boolean m14818l() {
        return this.f25319a == 0.0d && this.f25321c == 1.0d && this.f25320b == 0.0d && this.f25322d == 1.0d && this.f25323e == 0 && this.f25324f == 0.0f;
    }

    public boolean m14817m() {
        return this.f25319a == 0.0d && this.f25321c == 1.0d && this.f25320b == 0.0d && this.f25322d == 1.0d;
    }

    public int m14815o(int i) {
        int l = C5069h.m24081l(this.f25323e + i, 360);
        if (this.f25323e != l) {
            this.f25323e = l;
            m14819k(this.f25321c - this.f25319a != this.f25322d - this.f25320b);
        }
        return l;
    }

    public void m14814p(C7856c cVar) {
        if (cVar != null) {
            this.f25319a = cVar.f25319a;
            this.f25320b = cVar.f25320b;
            this.f25321c = cVar.f25321c;
            this.f25322d = cVar.f25322d;
            this.f25323e = cVar.f25323e;
            this.f25324f = cVar.f25324f;
            return;
        }
        this.f25319a = 0.0d;
        this.f25320b = 0.0d;
        this.f25321c = 1.0d;
        this.f25322d = 1.0d;
        this.f25323e = 0;
        this.f25324f = 0.0f;
    }

    public void m14813q(float f) {
        if (this.f25324f != f) {
            this.f25324f = f;
            m14819k(false);
        }
    }

    public void m14812r(double d, double d2, double d3, double d4) {
        if (this.f25319a != d || this.f25320b != d2 || this.f25321c != d3 || this.f25322d != d4) {
            this.f25319a = d;
            this.f25320b = d2;
            this.f25321c = d3;
            this.f25322d = d4;
            m14819k(true);
        }
    }

    public String toString() {
        return String.valueOf(this.f25319a) + ':' + this.f25320b + ':' + this.f25321c + ':' + this.f25322d + ':' + this.f25323e + ':' + this.f25324f;
    }

    public C7856c(double d, double d2, double d3, double d4, int i, float f) {
        this.f25319a = 0.0d;
        this.f25320b = 0.0d;
        this.f25321c = 1.0d;
        this.f25322d = 1.0d;
        this.f25323e = 0;
        this.f25324f = 0.0f;
        this.f25319a = d;
        this.f25320b = d2;
        this.f25321c = d3;
        this.f25322d = d4;
        this.f25323e = i;
        this.f25324f = f;
    }

    public C7856c(C7856c cVar) {
        this.f25319a = 0.0d;
        this.f25320b = 0.0d;
        this.f25321c = 1.0d;
        this.f25322d = 1.0d;
        this.f25323e = 0;
        this.f25324f = 0.0f;
        m14814p(cVar);
    }
}
