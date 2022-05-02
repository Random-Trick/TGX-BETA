package p111he;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import be.C1410y;
import java.util.ArrayList;
import java.util.List;
import p037cb.C2057b;
import p108hb.C5064d;
import p108hb.C5069h;

public class C5150w0 {
    public long f17239a;
    public List<C5151a> f17240b = new ArrayList();
    public List<C5151a> f17241c = new ArrayList();

    public static class C5151a {
        public float f17242a;
        public float f17243b;
        public float f17244c;
        public float f17245d;
        public float f17246e;
        public float f17247f;
        public float f17248g;
        public float f17249h;

        public C5151a() {
        }
    }

    public C5150w0() {
        for (int i = 0; i < 40; i++) {
            this.f17241c.add(new C5151a());
        }
    }

    public void m23801a(Canvas canvas, int i, float f, RectF rectF, float f2, float f3) {
        C5151a aVar;
        int size = this.f17240b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5151a aVar2 = this.f17240b.get(i2);
            canvas.drawPoint(aVar2.f17242a, aVar2.f17243b, C1410y.m37053Y(C5064d.m24131a(aVar2.f17247f * f3, i), f));
        }
        double d = (f2 - 90.0f) * 0.017453292519943295d;
        double sin = Math.sin(d);
        double d2 = -Math.cos(d);
        double width = rectF.width() / 2.0f;
        float centerX = (float) (((-d2) * width) + rectF.centerX());
        float centerY = (float) ((width * sin) + rectF.centerY());
        for (int i3 = 0; i3 < 1; i3++) {
            if (!this.f17241c.isEmpty()) {
                aVar = this.f17241c.get(0);
                this.f17241c.remove(0);
            } else {
                aVar = new C5151a();
            }
            aVar.f17242a = centerX;
            aVar.f17243b = centerY;
            double n = (C5069h.m24079n(0, 140) - 70) * 0.017453292519943295d;
            if (n < 0.0d) {
                n += 6.283185307179586d;
            }
            aVar.f17244c = (float) ((Math.cos(n) * sin) - (Math.sin(n) * d2));
            aVar.f17245d = (float) ((Math.sin(n) * sin) + (Math.cos(n) * d2));
            aVar.f17247f = 1.0f;
            aVar.f17249h = 0.0f;
            aVar.f17248g = C5069h.m24079n(0, 100) + 400;
            aVar.f17246e = (((float) Math.random()) * 4.0f) + 20.0f;
            this.f17240b.add(aVar);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m23800b(Math.min(20L, elapsedRealtime - this.f17239a));
        this.f17239a = elapsedRealtime;
    }

    public final void m23800b(long j) {
        int size = this.f17240b.size();
        int i = 0;
        while (i < size) {
            C5151a aVar = this.f17240b.get(i);
            float f = aVar.f17249h;
            float f2 = aVar.f17248g;
            if (f >= f2) {
                if (this.f17241c.size() < 40) {
                    this.f17241c.add(aVar);
                }
                this.f17240b.remove(i);
                i--;
                size--;
            } else {
                aVar.f17247f = 1.0f - C2057b.f7280b.getInterpolation(f / f2);
                float f3 = aVar.f17242a;
                float f4 = aVar.f17244c;
                float f5 = aVar.f17246e;
                float f6 = (float) j;
                aVar.f17242a = f3 + (((f4 * f5) * f6) / 500.0f);
                aVar.f17243b += ((aVar.f17245d * f5) * f6) / 500.0f;
                aVar.f17249h += f6;
            }
            i++;
        }
    }
}
