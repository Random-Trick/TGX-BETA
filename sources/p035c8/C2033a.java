package p035c8;

import android.graphics.Rect;
import androidx.annotation.RecentlyNullable;
import p048d8.AbstractC3910k;
import p163l5.C6378r;

public class C2033a {
    public final AbstractC3910k f7222a;

    public C2033a(AbstractC3910k kVar) {
        this.f7222a = (AbstractC3910k) C6378r.m20507k(kVar);
    }

    @RecentlyNullable
    public Rect m35793a() {
        return this.f7222a.mo29604h();
    }

    public int m35792b() {
        int zza = this.f7222a.zza();
        if (zza > 4096 || zza == 0) {
            return -1;
        }
        return zza;
    }

    @RecentlyNullable
    public String m35791c() {
        return this.f7222a.mo29605a();
    }

    public int m35790d() {
        return this.f7222a.zzb();
    }
}
