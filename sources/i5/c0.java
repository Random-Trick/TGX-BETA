package i5;

import android.os.Looper;
import android.os.Message;
import x5.e;

public final class c0 extends e {
    public final d f13996a;

    public c0(d dVar, Looper looper) {
        super(looper);
        this.f13996a = dVar;
    }

    @Override
    public final void handleMessage(Message message) {
        this.f13996a.g(message);
    }
}
