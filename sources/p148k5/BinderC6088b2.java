package p148k5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p118i5.C5217a;
import p133j5.AbstractC5867f;
import p133j5.C5850a;
import p134j6.AbstractC5891f;
import p134j6.C5886a;
import p134j6.C5890e;
import p149k6.BinderC6199d;
import p149k6.C6207l;
import p163l5.C6336e;
import p163l5.C6376q0;
import p163l5.C6378r;

public final class BinderC6088b2 extends BinderC6199d implements AbstractC5867f.AbstractC5869b, AbstractC5867f.AbstractC5870c {
    public static final C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f19313h = C5890e.f18775c;
    public final Context f19314a;
    public final Handler f19315b;
    public final C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> f19316c;
    public final Set<Scope> f19317d;
    public final C6336e f19318e;
    public AbstractC5891f f19319f;
    public AbstractC6083a2 f19320g;

    public BinderC6088b2(Context context, Handler handler, C6336e eVar) {
        C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar = f19313h;
        this.f19314a = context;
        this.f19315b = handler;
        this.f19318e = (C6336e) C6378r.m20505l(eVar, "ClientSettings must not be null");
        this.f19317d = eVar.m20604e();
        this.f19316c = aVar;
    }

    public static void m21382K1(BinderC6088b2 b2Var, C6207l lVar) {
        C5217a b = lVar.m21069b();
        if (b.m23611f()) {
            C6376q0 q0Var = (C6376q0) C6378r.m20506k(lVar.m21068c());
            b = q0Var.m20519c();
            if (!b.m23611f()) {
                String valueOf = String.valueOf(b);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 48);
                sb2.append("Sign-in succeeded with resolve account failure: ");
                sb2.append(valueOf);
                Log.wtf("SignInCoordinator", sb2.toString(), new Exception());
            } else {
                b2Var.f19320g.mo21281c(q0Var.m20520b(), b2Var.f19317d);
                b2Var.f19319f.mo905j();
            }
        }
        b2Var.f19320g.mo21282a(b);
        b2Var.f19319f.mo905j();
    }

    public final void m21385H1(AbstractC6083a2 a2Var) {
        AbstractC5891f fVar = this.f19319f;
        if (fVar != null) {
            fVar.mo905j();
        }
        this.f19318e.m20599j(Integer.valueOf(System.identityHashCode(this)));
        C5850a.AbstractC5851a<? extends AbstractC5891f, C5886a> aVar = this.f19316c;
        Context context = this.f19314a;
        Looper looper = this.f19315b.getLooper();
        C6336e eVar = this.f19318e;
        this.f19319f = aVar.mo21893c(context, looper, eVar, eVar.m20601h(), this, this);
        this.f19320g = a2Var;
        Set<Scope> set = this.f19317d;
        if (set == null || set.isEmpty()) {
            this.f19315b.post(new RunnableC6190y1(this));
        } else {
            this.f19319f.mo21078c();
        }
    }

    public final void m21384I1() {
        AbstractC5891f fVar = this.f19319f;
        if (fVar != null) {
            fVar.mo905j();
        }
    }

    @Override
    public final void mo21080q(int i) {
        this.f19319f.mo905j();
    }

    @Override
    public final void mo21073r0(C6207l lVar) {
        this.f19315b.post(new RunnableC6194z1(this, lVar));
    }

    @Override
    public final void mo11484s(C5217a aVar) {
        this.f19320g.mo21282a(aVar);
    }

    @Override
    public final void mo21079t(Bundle bundle) {
        this.f19319f.mo21077f(this);
    }
}
