package p148k5;

import java.util.Map;
import java.util.Set;
import p118i5.C5217a;
import p133j5.C5862c;
import p143k0.C6024a;
import p177m6.C6777m;

public final class C6167s2 {
    public final C6024a<C6085b<?>, C5217a> f19542a;
    public final C6024a<C6085b<?>, String> f19543b;
    public final C6777m<Map<C6085b<?>, String>> f19544c;
    public int f19545d;
    public boolean f19546e;

    public final Set<C6085b<?>> m21133a() {
        return this.f19542a.keySet();
    }

    public final void m21132b(C6085b<?> bVar, C5217a aVar, String str) {
        this.f19542a.put(bVar, aVar);
        this.f19543b.put(bVar, str);
        this.f19545d--;
        if (!aVar.m23612f()) {
            this.f19546e = true;
        }
        if (this.f19545d != 0) {
            return;
        }
        if (this.f19546e) {
            this.f19544c.m19086b(new C5862c(this.f19542a));
            return;
        }
        this.f19544c.m19085c(this.f19543b);
    }
}
