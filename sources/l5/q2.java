package l5;

import android.util.Log;
import j5.a;
import k5.f;

public final class q2 implements f.c {
    public final int f16210a;
    public final f f16211b;
    public final f.c f16212c;
    public final r2 f16213d;

    public q2(r2 r2Var, int i10, f fVar, f.c cVar) {
        this.f16213d = r2Var;
        this.f16210a = i10;
        this.f16211b = fVar;
        this.f16212c = cVar;
    }

    @Override
    public final void r(a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("beginFailureResolution for ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f16213d.h(aVar, this.f16210a);
    }
}
