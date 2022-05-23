package ie;

import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;

public abstract class k implements Client.g {
    public volatile boolean f14255a;

    public final void a() {
        synchronized (this) {
            this.f14255a = true;
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f14255a;
        }
        return z10;
    }

    public abstract void c(TdApi.Object object);

    @Override
    public final void r2(TdApi.Object object) {
        synchronized (this) {
            if (!this.f14255a) {
                c(object);
            }
        }
    }
}
