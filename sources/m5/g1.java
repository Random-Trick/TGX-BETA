package m5;

import android.os.Bundle;
import j5.a;

public final class g1 extends v0 {
    public final c f17205g;

    public g1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f17205g = cVar;
    }

    @Override
    public final boolean f() {
        this.f17205g.Y.c(a.N);
        return true;
    }

    @Override
    public final void g(a aVar) {
        if (!this.f17205g.x() || !c.b0(this.f17205g)) {
            this.f17205g.Y.c(aVar);
            this.f17205g.O(aVar);
            return;
        }
        c.X(this.f17205g, 16);
    }
}
