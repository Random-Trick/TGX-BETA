package l5;

import java.util.Map;
import java.util.Set;
import k0.a;
import k5.c;
import n6.m;

public final class s2 {
    public final a<b<?>, j5.a> f16228a;
    public final a<b<?>, String> f16229b;
    public final m<Map<b<?>, String>> f16230c;
    public int f16231d;
    public boolean f16232e;

    public final Set<b<?>> a() {
        return this.f16228a.keySet();
    }

    public final void b(b<?> bVar, j5.a aVar, String str) {
        this.f16228a.put(bVar, aVar);
        this.f16229b.put(bVar, str);
        this.f16231d--;
        if (!aVar.f()) {
            this.f16232e = true;
        }
        if (this.f16231d != 0) {
            return;
        }
        if (this.f16232e) {
            this.f16230c.b(new c(this.f16228a));
            return;
        }
        this.f16230c.c(this.f16229b);
    }
}
