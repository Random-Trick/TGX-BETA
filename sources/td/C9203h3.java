package td;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import be.C1357a0;
import p364zd.C11524j;

public class C9203h3 {
    public Paint f29708a;
    public Path f29709b;
    public float f29710c;
    public float f29711d;

    public C9203h3() {
        this(0.0f, 0.0f);
    }

    public void m9976a(Canvas canvas) {
        canvas.drawPath(this.f29709b, this.f29708a);
    }

    public float m9975b() {
        return this.f29710c * 0.5f;
    }

    public float m9974c() {
        return this.f29710c;
    }

    public void m9973d(int i) {
        this.f29708a.setColor(i);
    }

    public C9203h3(float f, float f2) {
        Paint paint = new Paint(5);
        this.f29708a = paint;
        paint.setColor(C11524j.m169l0());
        this.f29708a.setStrokeWidth(1.0f);
        this.f29708a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f29710c = C1357a0.m37539k(10.0f);
        this.f29711d = C1357a0.m37539k(5.0f);
        Path path = new Path();
        this.f29709b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f29709b.moveTo(f, f2);
        this.f29709b.lineTo(this.f29710c + f, f2);
        this.f29709b.lineTo(f + (this.f29710c * 0.5f), f2 + this.f29711d);
        this.f29709b.close();
    }
}
