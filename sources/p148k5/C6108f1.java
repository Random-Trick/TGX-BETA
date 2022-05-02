package p148k5;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import p118i5.C5217a;
import p133j5.C5850a;
import p163l5.AbstractC6325c;
import p163l5.AbstractC6355k;

public final class C6108f1 implements AbstractC6325c.AbstractC6328c, AbstractC6083a2 {
    public final C5850a.AbstractC5859f f19389a;
    public final C6085b<?> f19390b;
    public AbstractC6355k f19391c = null;
    public Set<Scope> f19392d = null;
    public boolean f19393e = false;
    public final C6106f f19394f;

    public C6108f1(C6106f fVar, C5850a.AbstractC5859f fVar2, C6085b<?> bVar) {
        this.f19394f = fVar;
        this.f19389a = fVar2;
        this.f19390b = bVar;
    }

    @Override
    public final void mo21283a(C5217a aVar) {
        Map map;
        map = this.f19394f.f19378U;
        C6093c1 c1Var = (C6093c1) map.get(this.f19390b);
        if (c1Var != null) {
            c1Var.m21345o(aVar);
        }
    }

    @Override
    public final void mo20623b(C5217a aVar) {
        Handler handler;
        handler = this.f19394f.f19382Y;
        handler.post(new RunnableC6103e1(this, aVar));
    }

    @Override
    public final void mo21282c(AbstractC6355k kVar, Set<Scope> set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo21283a(new C5217a(4));
            return;
        }
        this.f19391c = kVar;
        this.f19392d = set;
        m21277h();
    }

    public final void m21277h() {
        AbstractC6355k kVar;
        if (this.f19393e && (kVar = this.f19391c) != null) {
            this.f19389a.mo21243n(kVar, this.f19392d);
        }
    }
}
