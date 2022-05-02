package p350yd;

import android.net.Uri;
import android.os.Build;
import p213p0.C7956h;

public class C10872nb {
    public final int f34823a;
    public final int f34824b;
    public final int f34825c;
    public final String f34826d;

    public C10872nb(C10930q6 q6Var, long j, C10711hb hbVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f34825c = 0;
            this.f34824b = 0;
            this.f34823a = 0;
            this.f34826d = null;
            return;
        }
        this.f34823a = q6Var.m2440ga().m3231D0(j);
        this.f34826d = q6Var.m2440ga().m3235C0(j);
        this.f34824b = q6Var.m2440ga().m3243A0(j);
        this.f34825c = q6Var.m2440ga().m3239B0(j);
    }

    public static void m2967b(C7956h.C7965e eVar, C10930q6 q6Var, C10711hb hbVar, boolean z) {
        long v = hbVar.m4220v();
        if (hbVar.m4247D()) {
            long e = hbVar.m4241J().m4467e();
            if (e != 0) {
                v = e;
            }
        }
        eVar.m13973C(q6Var.m2440ga().m3239B0(v));
    }

    public void m2968a(C7956h.C7965e eVar, boolean z) {
        eVar.m13973C(this.f34825c);
        if (Build.VERSION.SDK_INT < 26) {
            int i = 0;
            int i2 = this.f34824b;
            if (i2 != 0) {
                eVar.m13937y(i2, 1000, 1000);
            }
            int i3 = this.f34823a;
            if (i3 == 0) {
                i = 2;
            } else if (i3 == 1) {
                eVar.m13964L(C10827lb.f34666q0);
            } else if (i3 == 2) {
                eVar.m13964L(C10827lb.f34667r0);
            }
            String str = this.f34826d;
            if (str == null) {
                i |= 1;
            } else if (!str.isEmpty()) {
                eVar.m13968H(Uri.parse(this.f34826d));
            }
            if (i != 0) {
                eVar.m13944r(i);
            }
        }
    }
}
