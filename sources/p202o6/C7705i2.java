package p202o6;

import android.content.Context;
import java.io.File;
import p262s6.AbstractC8651c0;
import p262s6.AbstractC8689y;
import p262s6.C8647a0;

public final class C7705i2 implements AbstractC8651c0 {
    public final AbstractC8651c0 f24697a;
    public final AbstractC8651c0 f24698b;
    public final AbstractC8651c0 f24699c;
    public final AbstractC8651c0 f24700d;
    public final AbstractC8651c0 f24701e;
    public final AbstractC8651c0 f24702f;
    public final AbstractC8651c0 f24703g;

    public C7705i2(AbstractC8651c0 c0Var, AbstractC8651c0 c0Var2, AbstractC8651c0 c0Var3, AbstractC8651c0 c0Var4, AbstractC8651c0 c0Var5, AbstractC8651c0 c0Var6, AbstractC8651c0 c0Var7) {
        this.f24697a = c0Var;
        this.f24698b = c0Var2;
        this.f24699c = c0Var3;
        this.f24700d = c0Var4;
        this.f24701e = c0Var5;
        this.f24702f = c0Var6;
        this.f24703g = c0Var7;
    }

    @Override
    public final Object zza() {
        File file;
        String str = (String) this.f24697a.zza();
        Object zza = this.f24698b.zza();
        Object zza2 = this.f24699c.zza();
        Context a = ((C7791z3) this.f24700d).m15080a();
        Object zza3 = this.f24701e.zza();
        AbstractC8689y a2 = C8647a0.m11812a(this.f24702f);
        C7787z zVar = (C7787z) zza;
        C7714k1 k1Var = (C7714k1) zza2;
        C7775w2 w2Var = (C7775w2) zza3;
        C7765u2 u2Var = (C7765u2) this.f24703g.zza();
        if (str != null) {
            file = new File(a.getExternalFilesDir(null), str);
        } else {
            file = a.getExternalFilesDir(null);
        }
        return new C7700h2(file, zVar, k1Var, a, w2Var, a2, u2Var);
    }
}
