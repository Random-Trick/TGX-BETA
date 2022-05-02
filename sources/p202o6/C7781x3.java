package p202o6;

import android.content.ComponentName;
import android.content.Context;
import p262s6.AbstractC8651c0;
import p262s6.C8649b0;
import p262s6.C8674o;

public final class C7781x3 implements AbstractC8651c0 {
    public final AbstractC8651c0 f24909a;
    public final AbstractC8651c0 f24910b;

    public C7781x3(AbstractC8651c0 c0Var, AbstractC8651c0 c0Var2) {
        this.f24909a = c0Var;
        this.f24910b = c0Var2;
    }

    @Override
    public final Object zza() {
        Object zza = this.f24909a.zza();
        Context a = ((C7791z3) this.f24910b).m15080a();
        C7746q3 q3Var = (C7746q3) zza;
        C8674o.m11764a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C8674o.m11764a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        C8649b0.m11807a(q3Var);
        return q3Var;
    }
}
