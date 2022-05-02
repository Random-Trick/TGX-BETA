package p048d8;

import android.graphics.Point;
import android.graphics.Rect;
import p033c6.C1702dc;

public final class C3911l implements AbstractC3910k {
    public final C1702dc f13205a;

    public C3911l(C1702dc dcVar) {
        this.f13205a = dcVar;
    }

    @Override
    public final String mo29605a() {
        return this.f13205a.m36071d();
    }

    @Override
    public final Rect mo29604h() {
        Point[] e = this.f13205a.m36070e();
        if (e == null) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (Point point : e) {
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    @Override
    public final int zza() {
        return this.f13205a.m36073b();
    }

    @Override
    public final int zzb() {
        return this.f13205a.m36072c();
    }
}
