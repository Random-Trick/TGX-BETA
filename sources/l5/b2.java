package l5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import k5.a;
import k5.f;
import k6.e;
import l6.d;
import l6.l;
import m5.q0;
import m5.r;

public final class b2 extends d implements f.b, f.c {
    public static final a.AbstractC0141a<? extends k6.f, k6.a> f16027h = e.f15711c;
    public final Context f16028a;
    public final Handler f16029b;
    public final a.AbstractC0141a<? extends k6.f, k6.a> f16030c;
    public final Set<Scope> f16031d;
    public final m5.e f16032e;
    public k6.f f16033f;
    public a2 f16034g;

    public b2(Context context, Handler handler, m5.e eVar) {
        a.AbstractC0141a<? extends k6.f, k6.a> aVar = f16027h;
        this.f16028a = context;
        this.f16029b = handler;
        this.f16032e = (m5.e) r.l(eVar, "ClientSettings must not be null");
        this.f16031d = eVar.e();
        this.f16030c = aVar;
    }

    public static void I1(b2 b2Var, l lVar) {
        j5.a b10 = lVar.b();
        if (b10.f()) {
            q0 q0Var = (q0) r.k(lVar.c());
            b10 = q0Var.c();
            if (!b10.f()) {
                String valueOf = String.valueOf(b10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
                sb2.append("Sign-in succeeded with resolve account failure: ");
                sb2.append(valueOf);
                Log.wtf("SignInCoordinator", sb2.toString(), new Exception());
            } else {
                b2Var.f16034g.a(q0Var.b(), b2Var.f16031d);
                b2Var.f16033f.k();
            }
        }
        b2Var.f16034g.b(b10);
        b2Var.f16033f.k();
    }

    public final void F1(a2 a2Var) {
        k6.f fVar = this.f16033f;
        if (fVar != null) {
            fVar.k();
        }
        this.f16032e.j(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0141a<? extends k6.f, k6.a> aVar = this.f16030c;
        Context context = this.f16028a;
        Looper looper = this.f16029b.getLooper();
        m5.e eVar = this.f16032e;
        this.f16033f = aVar.c(context, looper, eVar, eVar.h(), this, this);
        this.f16034g = a2Var;
        Set<Scope> set = this.f16031d;
        if (set == null || set.isEmpty()) {
            this.f16029b.post(new y1(this));
        } else {
            this.f16033f.c();
        }
    }

    public final void G1() {
        k6.f fVar = this.f16033f;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override
    public final void q(int i10) {
        this.f16033f.k();
    }

    @Override
    public final void r(j5.a aVar) {
        this.f16034g.b(aVar);
    }

    @Override
    public final void t(Bundle bundle) {
        this.f16033f.j(this);
    }

    @Override
    public final void u(l lVar) {
        this.f16029b.post(new z1(this, lVar));
    }
}
