package ie;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import ce.y;
import db.b;
import ib.d;
import ib.h;
import java.util.ArrayList;
import java.util.List;

public class w0 {
    public long f14297a;
    public List<a> f14298b = new ArrayList();
    public List<a> f14299c = new ArrayList();

    public static class a {
        public float f14300a;
        public float f14301b;
        public float f14302c;
        public float f14303d;
        public float f14304e;
        public float f14305f;
        public float f14306g;
        public float f14307h;

        public a() {
        }
    }

    public w0() {
        for (int i10 = 0; i10 < 40; i10++) {
            this.f14299c.add(new a());
        }
    }

    public void a(Canvas canvas, int i10, float f10, RectF rectF, float f11, float f12) {
        a aVar;
        int size = this.f14298b.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar2 = this.f14298b.get(i11);
            canvas.drawPoint(aVar2.f14300a, aVar2.f14301b, y.Y(d.a(aVar2.f14305f * f12, i10), f10));
        }
        double d10 = (f11 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d10);
        double d11 = -Math.cos(d10);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d11) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        for (int i12 = 0; i12 < 1; i12++) {
            if (!this.f14299c.isEmpty()) {
                aVar = this.f14299c.get(0);
                this.f14299c.remove(0);
            } else {
                aVar = new a();
            }
            aVar.f14300a = centerX;
            aVar.f14301b = centerY;
            double n10 = (h.n(0, 140) - 70) * 0.017453292519943295d;
            if (n10 < 0.0d) {
                n10 += 6.283185307179586d;
            }
            aVar.f14302c = (float) ((Math.cos(n10) * sin) - (Math.sin(n10) * d11));
            aVar.f14303d = (float) ((Math.sin(n10) * sin) + (Math.cos(n10) * d11));
            aVar.f14305f = 1.0f;
            aVar.f14307h = 0.0f;
            aVar.f14306g = h.n(0, 100) + 400;
            aVar.f14304e = (((float) Math.random()) * 4.0f) + 20.0f;
            this.f14298b.add(aVar);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b(Math.min(20L, elapsedRealtime - this.f14297a));
        this.f14297a = elapsedRealtime;
    }

    public final void b(long j10) {
        int size = this.f14298b.size();
        int i10 = 0;
        while (i10 < size) {
            a aVar = this.f14298b.get(i10);
            float f10 = aVar.f14307h;
            float f11 = aVar.f14306g;
            if (f10 >= f11) {
                if (this.f14299c.size() < 40) {
                    this.f14299c.add(aVar);
                }
                this.f14298b.remove(i10);
                i10--;
                size--;
            } else {
                aVar.f14305f = 1.0f - b.f7287b.getInterpolation(f10 / f11);
                float f12 = aVar.f14300a;
                float f13 = aVar.f14302c;
                float f14 = aVar.f14304e;
                float f15 = (float) j10;
                aVar.f14300a = f12 + (((f13 * f14) * f15) / 500.0f);
                aVar.f14301b += ((aVar.f14303d * f14) * f15) / 500.0f;
                aVar.f14307h += f15;
            }
            i10++;
        }
    }
}
