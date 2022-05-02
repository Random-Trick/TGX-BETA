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
    public final C8105a.C8106a f26841a;
    public final Paint f26842b;
    public final Paint f26843c;
    public final Paint f26844d;
    public ValueAnimator f26848h;
    public ValueAnimator f26849i;
    public int f26850j;
    public float[] f26851k;
    public float[] f26852l;
    public int f26853m;
    public final Path f26845e = new Path();
    public final Path f26846f = new Path();
    public final Path f26847g = new Path();
    public boolean f26854n = true;
    public float f26855o = 1.0f;

    public C8321g(C8105a.C8106a aVar) {
        Paint paint = new Paint(1);
        this.f26842b = paint;
        Paint paint2 = new Paint(1);
        this.f26843c = paint2;
        Paint paint3 = new Paint(1);
        this.f26844d = paint3;
        this.f26841a = aVar;
        paint2.setStrokeWidth(C1357a0.m37542k(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        if (!AbstractC7821f.f25065H1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.f26339h);
        paint.setStrokeWidth(C1357a0.m37542k(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(aVar.f26339h);
        paint3.setStrokeWidth(C1357a0.m37542k(10.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.f26339h);
        int[] iArr = aVar.f26332a;
        this.f26851k = new float[iArr.length << 2];
        this.f26852l = new float[iArr.length << 2];
    }

    public void mo12883a() {
        int i = (C8929a.m10942f(C11524j.m148w()) > 0.5d ? 1 : (C8929a.m10942f(C11524j.m148w()) == 0.5d ? 0 : -1)) < 0 ? this.f26841a.f26340i : this.f26841a.f26339h;
        this.f26853m = i;
        this.f26843c.setColor(i);
        this.f26842b.setColor(this.f26853m);
        this.f26844d.setColor(this.f26853m);
    }
}
