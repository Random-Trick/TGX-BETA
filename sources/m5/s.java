package m5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public final class s {
    public static s f17256b;
    public static final t f17257c = new t(0, false, false, 0, 0);
    public t f17258a;

    @RecentlyNonNull
    public static synchronized s b() {
        s sVar;
        synchronized (s.class) {
            if (f17256b == null) {
                f17256b = new s();
            }
            sVar = f17256b;
        }
        return sVar;
    }

    @RecentlyNullable
    public t a() {
        return this.f17258a;
    }

    public final synchronized void c(t tVar) {
        if (tVar == null) {
            this.f17258a = f17257c;
            return;
        }
        t tVar2 = this.f17258a;
        if (tVar2 == null || tVar2.f() < tVar.f()) {
            this.f17258a = tVar;
        }
    }
}
