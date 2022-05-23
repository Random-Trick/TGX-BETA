package e8;

import android.graphics.Point;
import android.graphics.Rect;
import d6.dc;

public final class l implements k {
    public final dc f11378a;

    public l(dc dcVar) {
        this.f11378a = dcVar;
    }

    @Override
    public final String a() {
        return this.f11378a.d();
    }

    @Override
    public final Rect h() {
        Point[] e10 = this.f11378a.e();
        if (e10 == null) {
            return null;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        for (Point point : e10) {
            i12 = Math.min(i12, point.x);
            i10 = Math.max(i10, point.x);
            i13 = Math.min(i13, point.y);
            i11 = Math.max(i11, point.y);
        }
        return new Rect(i12, i13, i10, i11);
    }

    @Override
    public final int zza() {
        return this.f11378a.b();
    }

    @Override
    public final int zzb() {
        return this.f11378a.c();
    }
}
