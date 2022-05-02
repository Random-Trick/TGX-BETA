package p238qc;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import be.C1357a0;
import p208oc.AbstractC7821f;
import p224pc.C8105a;
import p267t0.C8929a;
import p364zd.C11524j;

public class C8321g {
    public final C8105a.C8106a f26838a;
    public final Paint f26839b;
    public final Paint f26840c;
    public final Paint f26841d;
    public ValueAnimator f26845h;
    public ValueAnimator f26846i;
    public int f26847j;
    public float[] f26848k;
    public float[] f26849l;
    public int f26850m;
    public final Path f26842e = new Path();
    public final Path f26843f = new Path();
    public final Path f26844g = new Path();
    public boolean f26851n = true;
    public float f26852o = 1.0f;

    public C8321g(C8105a.C8106a aVar) {
        Paint paint = new Paint(1);
        this.f26839b = paint;
        Paint paint2 = new Paint(1);
        this.f26840c = paint2;
        Paint paint3 = new Paint(1);
        this.f26841d = paint3;
        this.f26838a = aVar;
        paint2.setStrokeWidth(C1357a0.m37539k(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        if (!AbstractC7821f.f25062H1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.f26336h);
        paint.setStrokeWidth(C1357a0.m37539k(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(aVar.f26336h);
        paint3.setStrokeWidth(C1357a0.m37539k(10.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.f26336h);
        int[] iArr = aVar.f26329a;
        this.f26848k = new float[iArr.length << 2];
        this.f26849l = new float[iArr.length << 2];
    }

    public void mo12884a() {
        int i = (C8929a.m10943f(C11524j.m148w()) > 0.5d ? 1 : (C8929a.m10943f(C11524j.m148w()) == 0.5d ? 0 : -1)) < 0 ? this.f26838a.f26337i : this.f26838a.f26336h;
        this.f26850m = i;
        this.f26840c.setColor(i);
        this.f26839b.setColor(this.f26850m);
        this.f26841d.setColor(this.f26850m);
    }
}
