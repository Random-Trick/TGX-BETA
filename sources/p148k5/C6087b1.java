package p148k5;

import android.os.Handler;
import p163l5.AbstractC6325c;

public final class C6087b1 implements AbstractC6325c.AbstractC6330e {
    public final C6093c1 f19312a;

    public C6087b1(C6093c1 c1Var) {
        this.f19312a = c1Var;
    }

    @Override
    public final void mo20621a() {
        Handler handler;
        handler = this.f19312a.f19341m.f19382Y;
        handler.post(new RunnableC6082a1(this));
    }
}
