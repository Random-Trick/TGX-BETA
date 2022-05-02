package p111he;

import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;

public abstract class AbstractC5123k implements Client.AbstractC7865g {
    public volatile boolean f17185a;

    public final void m23882a() {
        synchronized (this) {
            this.f17185a = true;
        }
    }

    public final boolean m23881b() {
        boolean z;
        synchronized (this) {
            z = this.f17185a;
        }
        return z;
    }

    public abstract void mo7438c(TdApi.Object object);

    @Override
    public final void mo255t2(TdApi.Object object) {
        synchronized (this) {
            if (!this.f17185a) {
                mo7438c(object);
            }
        }
    }
}
