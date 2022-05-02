package td;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import be.C1357a0;
import p364zd.C11524j;

public class C9203h3 {
    public Paint f29711a;
    public Path f29712b;
    public float f29713c;
    public float f29714d;

    public C9203h3() {
        this(0.0f, 0.0f);
    }

    public void m9975a(Canvas canvas) {
        canvas.drawPath(this.f29712b, this.f29711a);
    }

    public float m9974b() {
        return this.f29713c * 0.5f;
    }

    public float m9973c() {
        return this.f29713c;
    }

    public void m9972d(int i) {
        this.f29711a.setColor(i);
    }

    public C9203h3(float f, float f2) {
        Paint paint = new Paint(5);
        this.f29711a = paint;
        paint.setColor(C11524j.m169l0());
        this.f29711a.setStrokeWidth(1.0f);
        this.f29711a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f29713c = C1357a0.m37542k(10.0f);
        this.f29714d = C1357a0.m37542k(5.0f);
        Path path = new Path();
        this.f29712b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f29712b.moveTo(f, f2);
        this.f29712b.lineTo(this.f29713c + f, f2);
        this.f29712b.lineTo(f + (this.f29713c * 0.5f), f2 + this.f29714d);
        this.f29712b.close();
    }
}
