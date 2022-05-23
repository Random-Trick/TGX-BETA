package pd;

import ib.h;
import ib.i;
import org.thunderdog.challegram.Log;

public class c {
    public double f21184a;
    public double f21185b;
    public double f21186c;
    public double f21187d;
    public int f21188e;
    public float f21189f;

    public c() {
        this.f21184a = 0.0d;
        this.f21185b = 0.0d;
        this.f21186c = 1.0d;
        this.f21187d = 1.0d;
        this.f21188e = 0;
        this.f21189f = 0.0f;
    }

    public static c n(String str) {
        if (i.i(str)) {
            return null;
        }
        try {
            String[] split = str.split(":");
            if (split.length == 6) {
                return new c(Double.parseDouble(split[0]), Double.parseDouble(split[1]), Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]), Float.parseFloat(split[5]));
            }
            throw new IllegalArgumentException("data.length != 6 (" + split.length + ", " + str + ")");
        } catch (Throwable th) {
            Log.e(th);
            return null;
        }
    }

    public boolean a(c cVar) {
        if (cVar == null) {
            return l();
        }
        return this.f21184a == cVar.f21184a && this.f21185b == cVar.f21185b && this.f21186c == cVar.f21186c && this.f21187d == cVar.f21187d && this.f21188e == cVar.f21188e && this.f21189f == cVar.f21189f;
    }

    public double b() {
        return this.f21187d;
    }

    public float c() {
        return this.f21189f;
    }

    public double d() {
        return this.f21184a;
    }

    public double e() {
        return this.f21187d - this.f21185b;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof c) && a((c) obj));
    }

    public double f() {
        return this.f21186c - this.f21184a;
    }

    public double g() {
        return this.f21186c;
    }

    public int h() {
        return this.f21188e;
    }

    public double i() {
        return this.f21185b;
    }

    public boolean j() {
        return (this.f21188e == 0 && this.f21189f == 0.0f) ? false : true;
    }

    public final void k(boolean z10) {
    }

    public boolean l() {
        return this.f21184a == 0.0d && this.f21186c == 1.0d && this.f21185b == 0.0d && this.f21187d == 1.0d && this.f21188e == 0 && this.f21189f == 0.0f;
    }

    public boolean m() {
        return this.f21184a == 0.0d && this.f21186c == 1.0d && this.f21185b == 0.0d && this.f21187d == 1.0d;
    }

    public int o(int i10) {
        int l10 = h.l(this.f21188e + i10, 360);
        if (this.f21188e != l10) {
            this.f21188e = l10;
            k(this.f21186c - this.f21184a != this.f21187d - this.f21185b);
        }
        return l10;
    }

    public void p(c cVar) {
        if (cVar != null) {
            this.f21184a = cVar.f21184a;
            this.f21185b = cVar.f21185b;
            this.f21186c = cVar.f21186c;
            this.f21187d = cVar.f21187d;
            this.f21188e = cVar.f21188e;
            this.f21189f = cVar.f21189f;
            return;
        }
        this.f21184a = 0.0d;
        this.f21185b = 0.0d;
        this.f21186c = 1.0d;
        this.f21187d = 1.0d;
        this.f21188e = 0;
        this.f21189f = 0.0f;
    }

    public void q(float f10) {
        if (this.f21189f != f10) {
            this.f21189f = f10;
            k(false);
        }
    }

    public void r(double d10, double d11, double d12, double d13) {
        if (this.f21184a != d10 || this.f21185b != d11 || this.f21186c != d12 || this.f21187d != d13) {
            this.f21184a = d10;
            this.f21185b = d11;
            this.f21186c = d12;
            this.f21187d = d13;
            k(true);
        }
    }

    public String toString() {
        return String.valueOf(this.f21184a) + ':' + this.f21185b + ':' + this.f21186c + ':' + this.f21187d + ':' + this.f21188e + ':' + this.f21189f;
    }

    public c(double d10, double d11, double d12, double d13, int i10, float f10) {
        this.f21184a = d10;
        this.f21185b = d11;
        this.f21186c = d12;
        this.f21187d = d13;
        this.f21188e = i10;
        this.f21189f = f10;
    }

    public c(c cVar) {
        this.f21184a = 0.0d;
        this.f21185b = 0.0d;
        this.f21186c = 1.0d;
        this.f21187d = 1.0d;
        this.f21188e = 0;
        this.f21189f = 0.0f;
        p(cVar);
    }
}
