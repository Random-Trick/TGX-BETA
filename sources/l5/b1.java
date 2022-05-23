package l5;

import android.os.Handler;
import m5.c;

public final class b1 implements c.e {
    public final c1 f16026a;

    public b1(c1 c1Var) {
        this.f16026a = c1Var;
    }

    @Override
    public final void a() {
        Handler handler;
        handler = this.f16026a.f16053m.X;
        handler.post(new a1(this));
    }
}
