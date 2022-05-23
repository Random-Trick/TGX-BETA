package p6;

import android.content.Context;
import java.io.File;
import t6.a0;
import t6.c0;
import t6.y;

public final class i2 implements c0 {
    public final c0 f20662a;
    public final c0 f20663b;
    public final c0 f20664c;
    public final c0 f20665d;
    public final c0 f20666e;
    public final c0 f20667f;
    public final c0 f20668g;

    public i2(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5, c0 c0Var6, c0 c0Var7) {
        this.f20662a = c0Var;
        this.f20663b = c0Var2;
        this.f20664c = c0Var3;
        this.f20665d = c0Var4;
        this.f20666e = c0Var5;
        this.f20667f = c0Var6;
        this.f20668g = c0Var7;
    }

    @Override
    public final Object zza() {
        File file;
        String str = (String) this.f20662a.zza();
        Object zza = this.f20663b.zza();
        Object zza2 = this.f20664c.zza();
        Context a10 = ((z3) this.f20665d).a();
        Object zza3 = this.f20666e.zza();
        y a11 = a0.a(this.f20667f);
        z zVar = (z) zza;
        k1 k1Var = (k1) zza2;
        w2 w2Var = (w2) zza3;
        u2 u2Var = (u2) this.f20668g.zza();
        if (str != null) {
            file = new File(a10.getExternalFilesDir(null), str);
        } else {
            file = a10.getExternalFilesDir(null);
        }
        return new h2(file, zVar, k1Var, a10, w2Var, a11, u2Var);
    }
}
