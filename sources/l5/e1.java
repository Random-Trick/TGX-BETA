package l5;

import android.util.Log;
import j5.a;
import java.util.Map;
import k5.a;

public final class e1 implements Runnable {
    public final a f16062a;
    public final f1 f16063b;

    public e1(f1 f1Var, a aVar) {
        this.f16063b = f1Var;
        this.f16062a = aVar;
    }

    @Override
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        map = this.f16063b.f16091f.U;
        bVar = this.f16063b.f16087b;
        c1 c1Var = (c1) map.get(bVar);
        if (c1Var != null) {
            if (this.f16062a.f()) {
                this.f16063b.f16090e = true;
                fVar = this.f16063b.f16086a;
                if (fVar.u()) {
                    this.f16063b.h();
                    return;
                }
                try {
                    fVar3 = this.f16063b.f16086a;
                    fVar4 = this.f16063b.f16086a;
                    fVar3.g(null, fVar4.d());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    fVar2 = this.f16063b.f16086a;
                    fVar2.f("Failed to get service from broker.");
                    c1Var.p(new j5.a(10), null);
                }
            } else {
                c1Var.p(this.f16062a, null);
            }
        }
    }
}
