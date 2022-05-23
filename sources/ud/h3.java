package ud;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import ce.a0;

public class h3 {
    public Paint f24198a;
    public Path f24199b;
    public float f24200c;
    public float f24201d;

    public h3() {
        this(0.0f, 0.0f);
    }

    public void a(Canvas canvas) {
        canvas.drawPath(this.f24199b, this.f24198a);
    }

    public float b() {
        return this.f24200c * 0.5f;
    }

    public float c() {
        return this.f24200c;
    }

    public void d(int i10) {
        this.f24198a.setColor(i10);
    }

    public h3(float f10, float f11) {
        Paint paint = new Paint(5);
        this.f24198a = paint;
        paint.setColor(j.j0());
        this.f24198a.setStrokeWidth(1.0f);
        this.f24198a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f24200c = a0.k(10.0f);
        this.f24201d = a0.k(5.0f);
        Path path = new Path();
        this.f24199b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f24199b.moveTo(f10, f11);
        this.f24199b.lineTo(this.f24200c + f10, f11);
        this.f24199b.lineTo(f10 + (this.f24200c * 0.5f), f11 + this.f24201d);
        this.f24199b.close();
    }
}
