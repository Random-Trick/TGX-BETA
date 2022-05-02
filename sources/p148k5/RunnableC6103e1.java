package p148k5;

import android.util.Log;
import java.util.Map;
import p118i5.C5217a;
import p133j5.C5850a;

public final class RunnableC6103e1 implements Runnable {
    public final C5217a f19350a;
    public final C6108f1 f19351b;

    public RunnableC6103e1(C6108f1 f1Var, C5217a aVar) {
        this.f19351b = f1Var;
        this.f19350a = aVar;
    }

    @Override
    public final void run() {
        Map map;
        C6085b bVar;
        C5850a.AbstractC5859f fVar;
        C5850a.AbstractC5859f fVar2;
        C5850a.AbstractC5859f fVar3;
        C5850a.AbstractC5859f fVar4;
        map = this.f19351b.f19394f.f19378U;
        bVar = this.f19351b.f19390b;
        C6093c1 c1Var = (C6093c1) map.get(bVar);
        if (c1Var != null) {
            if (this.f19350a.m23612f()) {
                this.f19351b.f19393e = true;
                fVar = this.f19351b.f19389a;
                if (fVar.mo20627t()) {
                    this.f19351b.m21277h();
                    return;
                }
                try {
                    fVar3 = this.f19351b.f19389a;
                    fVar4 = this.f19351b.f19389a;
                    fVar3.mo21243n(null, fVar4.mo20583d());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    fVar2 = this.f19351b.f19389a;
                    fVar2.mo21248e("Failed to get service from broker.");
                    c1Var.m21344p(new C5217a(10), null);
                }
            } else {
                c1Var.m21344p(this.f19350a, null);
            }
        }
    }
}
