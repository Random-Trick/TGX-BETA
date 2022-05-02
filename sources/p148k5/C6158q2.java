package p148k5;

import android.util.Log;
import p118i5.C5217a;
import p133j5.AbstractC5867f;

public final class C6158q2 implements AbstractC5867f.AbstractC5870c {
    public final int f19523a;
    public final AbstractC5867f f19524b;
    public final AbstractC5867f.AbstractC5870c f19525c;
    public final C6163r2 f19526d;

    public C6158q2(C6163r2 r2Var, int i, AbstractC5867f fVar, AbstractC5867f.AbstractC5870c cVar) {
        this.f19526d = r2Var;
        this.f19523a = i;
        this.f19524b = fVar;
        this.f19525c = cVar;
    }

    @Override
    public final void mo11483s(C5217a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
        sb2.append("beginFailureResolution for ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f19526d.m21093h(aVar, this.f19523a);
    }
}
