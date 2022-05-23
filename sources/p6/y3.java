package p6;

import android.content.Context;
import t6.a0;
import t6.b0;
import t6.c0;
import t6.y;

public final class y3 implements c0 {
    public final c0 f20873a;
    public final c0 f20874b;
    public final c0 f20875c;

    public y3(c0 c0Var, c0 c0Var2, c0 c0Var3) {
        this.f20873a = c0Var;
        this.f20874b = c0Var2;
        this.f20875c = c0Var3;
    }

    @Override
    public final Object zza() {
        d4 d4Var;
        Context a10 = ((z3) this.f20873a).a();
        y a11 = a0.a(this.f20874b);
        y a12 = a0.a(this.f20875c);
        if (u3.b(a10) == null) {
            d4Var = (d4) a11.zza();
        } else {
            d4Var = (d4) a12.zza();
        }
        b0.a(d4Var);
        return d4Var;
    }
}
