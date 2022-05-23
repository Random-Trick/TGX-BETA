package e8;

import android.graphics.Point;
import android.graphics.Rect;
import d6.bd;

public final class n implements k {
    public final bd f11386a;

    public n(bd bdVar) {
        this.f11386a = bdVar;
    }

    @Override
    public final String a() {
        return this.f11386a.f6392b;
    }

    @Override
    public final Rect h() {
        bd bdVar = this.f11386a;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        while (true) {
            Point[] pointArr = bdVar.N;
            if (i14 >= pointArr.length) {
                return new Rect(i12, i13, i10, i11);
            }
            Point point = pointArr[i14];
            i12 = Math.min(i12, point.x);
            i10 = Math.max(i10, point.x);
            i13 = Math.min(i13, point.y);
            i11 = Math.max(i11, point.y);
            i14++;
        }
    }

    @Override
    public final int zza() {
        return this.f11386a.f6391a;
    }

    @Override
    public final int zzb() {
        return this.f11386a.M;
    }
}
