package p233q6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C8260d {
    public final Map f26717a = new HashMap();
    public final AtomicBoolean f26718b = new AtomicBoolean(false);

    public final synchronized boolean m13018a(String str) {
        if (!this.f26718b.get()) {
            m13017b();
        }
        Object obj = this.f26717a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final synchronized void m13017b() {
        this.f26717a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
