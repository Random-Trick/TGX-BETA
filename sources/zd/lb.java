package zd;

import android.net.Uri;
import android.os.Build;
import p0.h;

public class lb {
    public final int f27920a;
    public final int f27921b;
    public final int f27922c;
    public final String f27923d;

    public lb(o6 o6Var, long j10, fb fbVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27922c = 0;
            this.f27921b = 0;
            this.f27920a = 0;
            this.f27923d = null;
            return;
        }
        this.f27920a = o6Var.ka().D0(j10);
        this.f27923d = o6Var.ka().C0(j10);
        this.f27921b = o6Var.ka().A0(j10);
        this.f27922c = o6Var.ka().B0(j10);
    }

    public static void b(h.e eVar, o6 o6Var, fb fbVar, boolean z10) {
        long v10 = fbVar.v();
        if (fbVar.D()) {
            long e10 = fbVar.J().e();
            if (e10 != 0) {
                v10 = e10;
            }
        }
        eVar.C(o6Var.ka().B0(v10));
    }

    public void a(h.e eVar, boolean z10) {
        eVar.C(this.f27922c);
        if (Build.VERSION.SDK_INT < 26) {
            int i10 = 0;
            int i11 = this.f27921b;
            if (i11 != 0) {
                eVar.y(i11, 1000, 1000);
            }
            int i12 = this.f27920a;
            if (i12 == 0) {
                i10 = 2;
            } else if (i12 == 1) {
                eVar.L(jb.f27798q0);
            } else if (i12 == 2) {
                eVar.L(jb.f27799r0);
            }
            String str = this.f27923d;
            if (str == null) {
                i10 |= 1;
            } else if (!str.isEmpty()) {
                eVar.H(Uri.parse(this.f27923d));
            }
            if (i10 != 0) {
                eVar.r(i10);
            }
        }
    }
}
