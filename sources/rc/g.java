package rc;

import ae.j;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import ce.a0;
import pc.f;
import qc.a;

public class g {
    public final a.C0200a f21852a;
    public final Paint f21853b;
    public final Paint f21854c;
    public final Paint f21855d;
    public ValueAnimator f21859h;
    public ValueAnimator f21860i;
    public int f21861j;
    public float[] f21862k;
    public float[] f21863l;
    public int f21864m;
    public final Path f21856e = new Path();
    public final Path f21857f = new Path();
    public final Path f21858g = new Path();
    public boolean f21865n = true;
    public float f21866o = 1.0f;

    public g(a.C0200a aVar) {
        Paint paint = new Paint(1);
        this.f21853b = paint;
        Paint paint2 = new Paint(1);
        this.f21854c = paint2;
        Paint paint3 = new Paint(1);
        this.f21855d = paint3;
        this.f21852a = aVar;
        paint2.setStrokeWidth(a0.k(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        if (!f.H1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.f21522h);
        paint.setStrokeWidth(a0.k(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(aVar.f21522h);
        paint3.setStrokeWidth(a0.k(10.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.f21522h);
        int[] iArr = aVar.f21515a;
        this.f21862k = new float[iArr.length << 2];
        this.f21863l = new float[iArr.length << 2];
    }

    public void a() {
        int i10 = (t0.a.f(j.u()) > 0.5d ? 1 : (t0.a.f(j.u()) == 0.5d ? 0 : -1)) < 0 ? this.f21852a.f21523i : this.f21852a.f21522h;
        this.f21864m = i10;
        this.f21854c.setColor(i10);
        this.f21853b.setColor(this.f21864m);
        this.f21855d.setColor(this.f21864m);
    }
}
