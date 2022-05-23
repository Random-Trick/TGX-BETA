package a6;

import com.google.android.gms.common.api.Status;
import g6.g;
import g6.g0;
import g6.i;
import k5.f;
import k5.k;

public final class a0 extends g0<i> {
    public final g f554t;

    public a0(b0 b0Var, f fVar, g gVar, String str) {
        super(fVar);
        this.f554t = gVar;
    }

    @Override
    public final k e(Status status) {
        return new i(status, null);
    }

    @Override
    public final void q(t tVar) {
        tVar.s0(this.f554t, this, null);
    }
}
