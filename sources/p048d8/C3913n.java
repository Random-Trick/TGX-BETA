package p048d8;

import android.graphics.Point;
import android.graphics.Rect;
import p033c6.C1673bd;

public final class C3913n implements AbstractC3910k {
    public final C1673bd f13213a;

    public C3913n(C1673bd bdVar) {
        this.f13213a = bdVar;
    }

    @Override
    public final String mo29603a() {
        return this.f13213a.f6144b;
    }

    @Override
    public final Rect mo29602h() {
        C1673bd bdVar = this.f13213a;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (true) {
            Point[] pointArr = bdVar.f6130N;
            if (i5 >= pointArr.length) {
                return new Rect(i3, i4, i, i2);
            }
            Point point = pointArr[i5];
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
            i5++;
        }
    }

    @Override
    public final int zza() {
        return this.f13213a.f6143a;
    }

    @Override
    public final int zzb() {
        return this.f13213a.f6129M;
    }
}
