package r6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {
    public final Map f21760a = new HashMap();
    public final AtomicBoolean f21761b = new AtomicBoolean(false);

    public final synchronized boolean a(String str) {
        if (!this.f21761b.get()) {
            b();
        }
        Object obj = this.f21760a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final synchronized void b() {
        this.f21760a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
