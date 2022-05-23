package d8;

import android.graphics.Rect;
import androidx.annotation.RecentlyNullable;
import e8.k;
import m5.r;

public class a {
    public final k f7229a;

    public a(k kVar) {
        this.f7229a = (k) r.k(kVar);
    }

    @RecentlyNullable
    public Rect a() {
        return this.f7229a.h();
    }

    public int b() {
        int zza = this.f7229a.zza();
        if (zza > 4096 || zza == 0) {
            return -1;
        }
        return zza;
    }

    @RecentlyNullable
    public String c() {
        return this.f7229a.a();
    }

    public int d() {
        return this.f7229a.zzb();
    }
}
