package p6;

import t6.a0;
import t6.c0;

public final class a2 implements c0 {
    public final c0 f20539a;
    public final c0 f20540b;
    public final c0 f20541c;
    public final c0 f20542d;

    public a2(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        this.f20539a = c0Var;
        this.f20540b = c0Var2;
        this.f20541c = c0Var3;
        this.f20542d = c0Var4;
    }

    @Override
    public final Object zza() {
        Object zza = this.f20539a.zza();
        return new z1((f0) zza, a0.a(this.f20540b), (k1) this.f20541c.zza(), a0.a(this.f20542d));
    }
}
