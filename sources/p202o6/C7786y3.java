package p202o6;

import android.content.Context;
import p262s6.AbstractC8651c0;
import p262s6.AbstractC8689y;
import p262s6.C8647a0;
import p262s6.C8649b0;

public final class C7786y3 implements AbstractC8651c0 {
    public final AbstractC8651c0 f24921a;
    public final AbstractC8651c0 f24922b;
    public final AbstractC8651c0 f24923c;

    public C7786y3(AbstractC8651c0 c0Var, AbstractC8651c0 c0Var2, AbstractC8651c0 c0Var3) {
        this.f24921a = c0Var;
        this.f24922b = c0Var2;
        this.f24923c = c0Var3;
    }

    @Override
    public final Object zza() {
        AbstractC7680d4 d4Var;
        Context a = ((C7791z3) this.f24921a).m15080a();
        AbstractC8689y a2 = C8647a0.m11811a(this.f24922b);
        AbstractC8689y a3 = C8647a0.m11811a(this.f24923c);
        if (C7766u3.m15111b(a) == null) {
            d4Var = (AbstractC7680d4) a2.zza();
        } else {
            d4Var = (AbstractC7680d4) a3.zza();
        }
        C8649b0.m11807a(d4Var);
        return d4Var;
    }
}
