package p148k5;

import android.os.Handler;
import p148k5.ComponentCallbacks2C6090c;

public final class C6185x0 implements ComponentCallbacks2C6090c.AbstractC6091a {
    public final C6106f f19584a;

    public C6185x0(C6106f fVar) {
        this.f19584a = fVar;
    }

    @Override
    public final void mo21086a(boolean z) {
        Handler handler;
        Handler handler2;
        handler = this.f19584a.f19382Y;
        handler2 = this.f19584a.f19382Y;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
