package p202o6;

import android.content.Context;
import java.io.File;
import p262s6.AbstractC8651c0;
import p262s6.AbstractC8689y;
import p262s6.C8647a0;

public final class C7705i2 implements AbstractC8651c0 {
    public final AbstractC8651c0 f24700a;
    public final AbstractC8651c0 f24701b;
    public final AbstractC8651c0 f24702c;
    public final AbstractC8651c0 f24703d;
    public final AbstractC8651c0 f24704e;
    public final AbstractC8651c0 f24705f;
    public final AbstractC8651c0 f24706g;

    public C7705i2(AbstractC8651c0 c0Var, AbstractC8651c0 c0Var2, AbstractC8651c0 c0Var3, AbstractC8651c0 c0Var4, AbstractC8651c0 c0Var5, AbstractC8651c0 c0Var6, AbstractC8651c0 c0Var7) {
        this.f24700a = c0Var;
        this.f24701b = c0Var2;
        this.f24702c = c0Var3;
        this.f24703d = c0Var4;
        this.f24704e = c0Var5;
        this.f24705f = c0Var6;
        this.f24706g = c0Var7;
    }

    @Override
    public final Object zza() {
        File file;
        String str = (String) this.f24700a.zza();
        Object zza = this.f24701b.zza();
        Object zza2 = this.f24702c.zza();
        Context a = ((C7791z3) this.f24703d).m15080a();
        Object zza3 = this.f24704e.zza();
        AbstractC8689y a2 = C8647a0.m11811a(this.f24705f);
        C7787z zVar = (C7787z) zza;
        C7714k1 k1Var = (C7714k1) zza2;
        C7775w2 w2Var = (C7775w2) zza3;
        C7765u2 u2Var = (C7765u2) this.f24706g.zza();
        if (str != null) {
            file = new File(a.getExternalFilesDir(null), str);
        } else {
            file = a.getExternalFilesDir(null);
        }
        return new C7700h2(file, zVar, k1Var, a, w2Var, a2, u2Var);
    }
}
