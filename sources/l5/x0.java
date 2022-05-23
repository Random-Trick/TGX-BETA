package l5;

import android.os.Handler;
import l5.c;

public final class x0 implements c.a {
    public final f f16268a;

    public x0(f fVar) {
        this.f16268a = fVar;
    }

    @Override
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        handler = this.f16268a.X;
        handler2 = this.f16268a.X;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
