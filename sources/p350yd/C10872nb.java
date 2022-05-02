package p350yd;

import android.net.Uri;
import android.os.Build;
import p213p0.C7956h;

public class C10872nb {
    public final int f34820a;
    public final int f34821b;
    public final int f34822c;
    public final String f34823d;

    public C10872nb(C10930q6 q6Var, long j, C10711hb hbVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f34822c = 0;
            this.f34821b = 0;
            this.f34820a = 0;
            this.f34823d = null;
            return;
        }
        this.f34820a = q6Var.m2440ga().m3231D0(j);
        this.f34823d = q6Var.m2440ga().m3235C0(j);
        this.f34821b = q6Var.m2440ga().m3243A0(j);
        this.f34822c = q6Var.m2440ga().m3239B0(j);
    }

    public static void m2967b(C7956h.C7965e eVar, C10930q6 q6Var, C10711hb hbVar, boolean z) {
        long v = hbVar.m4220v();
        if (hbVar.m4247D()) {
            long e = hbVar.m4241J().m4467e();
            if (e != 0) {
                v = e;
            }
        }
        eVar.m13974C(q6Var.m2440ga().m3239B0(v));
    }

    public void m2968a(C7956h.C7965e eVar, boolean z) {
        eVar.m13974C(this.f34822c);
        if (Build.VERSION.SDK_INT < 26) {
            int i = 0;
            int i2 = this.f34821b;
            if (i2 != 0) {
                eVar.m13938y(i2, 1000, 1000);
            }
            int i3 = this.f34820a;
            if (i3 == 0) {
                i = 2;
            } else if (i3 == 1) {
                eVar.m13965L(C10827lb.f34663q0);
            } else if (i3 == 2) {
                eVar.m13965L(C10827lb.f34664r0);
            }
            String str = this.f34823d;
            if (str == null) {
                i |= 1;
            } else if (!str.isEmpty()) {
                eVar.m13969H(Uri.parse(this.f34823d));
            }
            if (i != 0) {
                eVar.m13945r(i);
            }
        }
    }
}
