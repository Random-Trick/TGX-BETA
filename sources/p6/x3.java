package p6;

import android.content.ComponentName;
import android.content.Context;
import t6.b0;
import t6.c0;
import t6.o;

public final class x3 implements c0 {
    public final c0 f20861a;
    public final c0 f20862b;

    public x3(c0 c0Var, c0 c0Var2) {
        this.f20861a = c0Var;
        this.f20862b = c0Var2;
    }

    @Override
    public final Object zza() {
        Object zza = this.f20861a.zza();
        Context a10 = ((z3) this.f20862b).a();
        q3 q3Var = (q3) zza;
        o.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        o.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        b0.a(q3Var);
        return q3Var;
    }
}
