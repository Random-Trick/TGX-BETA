package p233q6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C8260d {
    public final Map f26720a = new HashMap();
    public final AtomicBoolean f26721b = new AtomicBoolean(false);

    public final synchronized boolean m13017a(String str) {
        if (!this.f26721b.get()) {
            m13016b();
        }
        Object obj = this.f26720a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final synchronized void m13016b() {
        this.f26720a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
