package p254rd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1410y;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import p108hb.C5069h;
import p181mb.C6810a;
import p181mb.C6815f;

public class C8434g {
    public static C6815f<Paint> f27371y;
    public final int f27372a;
    public final int f27373b;
    public final int f27374c;
    public final float f27375d;
    public final float f27376e;
    public int f27377f;
    public float f27378g;
    public float f27379h;
    public float f27380i;
    public float f27381j;
    public float f27382k;
    public C8427b f27383l;
    public ArrayList<AbstractC8435a> f27384m;
    public int f27385n;
    public float f27386o;
    public float f27387p;
    public float f27388q;
    public float f27389r;
    public float f27390s;
    public float f27391t;
    public float f27392u;
    public float f27393v;
    public float f27394w;
    public float f27395x;

    public interface AbstractC8435a {
        void mo12447o(C8434g gVar, boolean z);
    }

    public C8434g(int i) {
        this(i, 0, 0, 0.0f, 0.0f);
    }

    public static boolean m12461m(int i) {
        return i == 2;
    }

    public static boolean m12460n(int i) {
        return i != 3;
    }

    public static Paint m12459o() {
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public static C8434g m12457q(RandomAccessFile randomAccessFile) {
        int read = randomAccessFile.read();
        int t = C6810a.m18920t(randomAccessFile);
        int t2 = C6810a.m18920t(randomAccessFile);
        float readFloat = randomAccessFile.readFloat();
        float readFloat2 = m12461m(read) ? randomAccessFile.readFloat() : 0.0f;
        int readInt = randomAccessFile.readInt();
        float readFloat3 = m12460n(read) ? randomAccessFile.readFloat() : 0.0f;
        C8434g gVar = new C8434g(read, t, t2, readFloat, readFloat2);
        gVar.m12449y(readInt, readFloat3);
        m12455s(randomAccessFile, gVar);
        return gVar;
    }

    public static C8434g m12456r(C6810a aVar) {
        byte e = aVar.m18935e();
        int s = aVar.m18921s();
        int s2 = aVar.m18921s();
        float k = aVar.m18929k();
        float k2 = m12461m(e) ? aVar.m18929k() : 0.0f;
        int m = aVar.m18927m();
        float k3 = m12460n(e) ? aVar.m18929k() : 0.0f;
        C8434g gVar = new C8434g(e, s, s2, k, k2);
        gVar.m12449y(m, k3);
        m12454t(aVar, gVar);
        return gVar;
    }

    public static void m12455s(RandomAccessFile randomAccessFile, C8434g gVar) {
        int i = gVar.f27372a;
        if (i == 0) {
            gVar.f27383l = new C8427b(gVar, randomAccessFile);
        } else if (i == 1 || i == 2) {
            gVar.f27379h = randomAccessFile.readFloat();
            gVar.f27380i = randomAccessFile.readFloat();
            gVar.f27381j = randomAccessFile.readFloat();
            gVar.f27382k = randomAccessFile.readFloat();
        }
    }

    public static void m12454t(C6810a aVar, C8434g gVar) {
        int i = gVar.f27372a;
        if (i == 0) {
            gVar.f27383l = new C8427b(gVar, aVar);
        } else if (i == 1 || i == 2) {
            gVar.f27379h = aVar.m18929k();
            gVar.f27380i = aVar.m18929k();
            gVar.f27381j = aVar.m18929k();
            gVar.f27382k = aVar.m18929k();
        }
    }

    public final void m12474A(MotionEvent motionEvent, boolean z, boolean z2) {
        m12472b(motionEvent, z, z2);
        m12463k(!z);
    }

    public void m12473a(AbstractC8435a aVar) {
        if (this.f27384m == null) {
            this.f27384m = new ArrayList<>();
        }
        this.f27384m.add(aVar);
    }

    public final void m12472b(MotionEvent motionEvent, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        float f3;
        MotionEvent motionEvent2 = motionEvent;
        int i2 = 0;
        int i3 = 1;
        boolean z3 = z2 && motionEvent.getAction() == 2;
        if (z3) {
            i3 = motionEvent.getHistorySize();
        }
        while (i2 < i3) {
            if (z3) {
                f2 = motionEvent2.getHistoricalX(i2);
                f = motionEvent2.getHistoricalY(i2);
            } else {
                f2 = motionEvent.getX();
                f = motionEvent.getY();
            }
            if (z) {
                if (this.f27385n == 0) {
                    C8427b bVar = this.f27383l;
                    this.f27394w = f2;
                    this.f27395x = f;
                    bVar.m12510j(f2, f);
                }
                float f4 = this.f27394w;
                if (f4 == f2 && this.f27395x == f) {
                    this.f27383l.m12511i(f2 + 1.0f, f);
                    return;
                } else {
                    this.f27383l.m12509k(f4, this.f27395x, f2, f);
                    return;
                }
            } else {
                if (this.f27394w == f2 && this.f27395x == f && this.f27385n > 0) {
                    i = i3;
                } else {
                    this.f27394w = f2;
                    this.f27395x = f;
                    int i4 = this.f27385n;
                    this.f27385n = i4 + 1;
                    float f5 = 0.0f;
                    if (i4 == 0) {
                        this.f27383l.m12510j(f2, f);
                        f3 = 0.0f;
                    } else {
                        f5 = (f2 - this.f27390s) / 3.0f;
                        f3 = (f - this.f27391t) / 3.0f;
                    }
                    if (i4 > 3) {
                        float f6 = this.f27390s;
                        float f7 = this.f27391t;
                        float f8 = this.f27392u;
                        float f9 = this.f27393v;
                        i = i3;
                        this.f27383l.m12515e(this.f27386o + this.f27388q, this.f27389r + this.f27387p, f6 - f8, f7 - f9, f6, f7);
                    } else {
                        i = i3;
                    }
                    this.f27386o = this.f27390s;
                    this.f27387p = this.f27391t;
                    this.f27388q = this.f27392u;
                    this.f27389r = this.f27393v;
                    this.f27390s = f2;
                    this.f27391t = f;
                    this.f27392u = f5;
                    this.f27393v = f3;
                }
                i2++;
                motionEvent2 = motionEvent;
                i3 = i;
            }
        }
    }

    public boolean m12471c(C8434g gVar) {
        int i;
        int i2;
        int i3;
        if (gVar != null) {
            int i4 = gVar.f27372a;
            int i5 = this.f27372a;
            if (i4 == i5 && gVar.f27377f == this.f27377f && ((!m12460n(i5) || gVar.f27378g == this.f27378g) && (((i = this.f27372a) == 3 || (((i2 = gVar.f27373b) == (i3 = this.f27373b) && gVar.f27374c == this.f27374c) || i2 / gVar.f27374c == i3 / this.f27374c)) && ((!m12461m(i) || gVar.f27376e == this.f27376e) && gVar.f27379h == this.f27379h && gVar.f27380i == this.f27380i && gVar.f27381j == this.f27381j && gVar.f27382k == this.f27382k && (this.f27372a != 0 || gVar.f27383l.m12516d(this.f27383l)))))) {
                return true;
            }
        }
        return false;
    }

    public boolean m12470d(MotionEvent motionEvent, boolean z) {
        int i = this.f27372a;
        if (i != 0) {
            return !(i == 1 || i == 2) || !z || (this.f27379h == this.f27380i && this.f27381j == this.f27382k);
        }
        if (z && this.f27383l.m12514f() <= 3) {
            return false;
        }
        m12474A(motionEvent, true, true);
        this.f27383l.m12505o();
        return true;
    }

    public final int m12469e(float f, float f2, float f3) {
        return (int) (C1357a0.m37542k(f) * (f2 / this.f27373b) * this.f27375d);
    }

    public void m12468f(Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        Paint paint;
        float f;
        float f2;
        Canvas canvas2;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        float f3 = i;
        double d = f3;
        double d2 = i6;
        float ceil = (float) (Math.ceil(this.f27379h * d2) + d);
        float floor = (float) (d + Math.floor(d2 * this.f27380i));
        if (ceil == floor) {
            if (floor >= i6) {
                ceil -= 1.0f;
            } else {
                floor -= 1.0f;
            }
        }
        float f4 = i2;
        double d3 = f4;
        double d4 = i7;
        float ceil2 = (float) (Math.ceil(this.f27381j * d4) + d3);
        float floor2 = (float) (d3 + Math.floor(d4 * this.f27382k));
        if (ceil2 == floor2) {
            if (floor2 >= i7) {
                ceil2 -= 1.0f;
            } else {
                floor2 -= 1.0f;
            }
        }
        float f5 = ceil2;
        float f6 = floor2;
        float min = Math.min(ceil, floor);
        float min2 = Math.min(f5, f6);
        float max = Math.max(ceil, floor);
        float max2 = Math.max(f5, f6);
        float f7 = i6;
        float f8 = i7;
        float e = m12469e(this.f27378g, f7, f8);
        Paint a = f27371y.m18902a();
        if (a == null) {
            C6815f<Paint> fVar = f27371y;
            i5 = i7;
            paint = m12459o();
            fVar.m18901b(paint);
        } else {
            i5 = i7;
            paint = a;
        }
        paint.setStrokeWidth(e);
        paint.setColor(this.f27377f);
        int i8 = this.f27372a;
        if (i8 != 0) {
            boolean z = true;
            if (i8 == 1) {
                Paint paint2 = paint;
                canvas.drawLine(ceil, f5, floor, f6, paint);
                paint2.setStyle(Paint.Style.FILL);
                float f9 = e / 2.0f;
                canvas.drawCircle(ceil, f5, f9, paint2);
                canvas.drawCircle(floor, f6, f9, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                float f10 = (ceil - floor) / 2.0f;
                float f11 = (f5 - f6) / 2.0f;
                float e2 = m12469e(24.0f, f7, f8);
                float abs = Math.abs(C5069h.m24086h(0.0f, 0.0f, f10, f11));
                if (abs > e2) {
                    float f12 = e2 / abs;
                    f10 *= f12;
                    f11 *= f12;
                } else if (abs < e2) {
                    f = 15.0f + ((20.0f * abs) / e2);
                    f2 = f11;
                    canvas.save();
                    canvas.rotate(-f, floor, f6);
                    float f13 = f10 + floor;
                    float f14 = f6 + f2;
                    float f15 = floor;
                    canvas.drawLine(f15, f6, f13, f14, paint2);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f13, f14, f9, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    canvas.rotate(f * 2.0f, floor, f6);
                    canvas.drawLine(f15, f6, f13, f14, paint2);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f13, f14, f9, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    canvas.restore();
                }
                f2 = f11;
                f = 35.0f;
                canvas.save();
                canvas.rotate(-f, floor, f6);
                float f132 = f10 + floor;
                float f142 = f6 + f2;
                float f152 = floor;
                canvas.drawLine(f152, f6, f132, f142, paint2);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f132, f142, f9, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                canvas.rotate(f * 2.0f, floor, f6);
                canvas.drawLine(f152, f6, f132, f142, paint2);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f132, f142, f9, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                canvas.restore();
            } else if (i8 == 2) {
                Paint paint3 = paint;
                RectF a0 = C1410y.m37053a0();
                a0.set(min, min2, max, max2);
                if (this.f27376e == 0.0f) {
                    z = false;
                }
                if (z) {
                    canvas.save();
                    canvas2 = canvas;
                    canvas2.rotate(-this.f27376e, min, min2);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawRect(a0, paint3);
                if (z) {
                    canvas.restore();
                }
            } else if (i8 == 3) {
                paint.setStyle(Paint.Style.FILL);
                canvas.drawRect(f3, f4, i3, i4, paint);
                paint.setStyle(Paint.Style.STROKE);
            }
        } else {
            canvas.save();
            canvas.clipRect(i, i2, i3, i4);
            if (!(i == 0 && i2 == 0)) {
                canvas.translate(f3, f4);
            }
            canvas.drawPath(this.f27383l.m12512h(i6, i5), paint);
            canvas.restore();
        }
    }

    public int m12467g() {
        int i = 4;
        int w = C6810a.m18917w(this.f27373b) + 1 + C6810a.m18917w(this.f27374c) + 4 + (m12461m(this.f27372a) ? 4 : 0) + 4;
        if (!m12460n(this.f27372a)) {
            i = 0;
        }
        return w + i + m12466h();
    }

    public final int m12466h() {
        int i = this.f27372a;
        if (i != 0) {
            return (i == 1 || i == 2) ? 32 : 0;
        }
        return this.f27383l.m12513g();
    }

    public float m12465i(float f) {
        return f / this.f27373b;
    }

    public float m12464j(float f) {
        return f / this.f27374c;
    }

    public final void m12463k(boolean z) {
        ArrayList<AbstractC8435a> arrayList = this.f27384m;
        if (arrayList != null) {
            Iterator<AbstractC8435a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12447o(this, z);
            }
        }
    }

    public void m12462l(MotionEvent motionEvent, boolean z) {
        float i = m12465i(motionEvent.getX());
        float j = m12464j(motionEvent.getY());
        int i2 = this.f27372a;
        if (i2 == 0) {
            m12474A(motionEvent, false, z);
        } else if (i2 != 1 && i2 != 2) {
        } else {
            if (this.f27380i != i || this.f27382k != j) {
                this.f27380i = i;
                this.f27382k = j;
                m12463k(true);
            }
        }
    }

    public void m12458p(AbstractC8435a aVar) {
        ArrayList<AbstractC8435a> arrayList = this.f27384m;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    public void m12453u(RandomAccessFile randomAccessFile) {
        randomAccessFile.writeByte((byte) this.f27372a);
        C6810a.m18940N(randomAccessFile, this.f27373b);
        C6810a.m18940N(randomAccessFile, this.f27374c);
        randomAccessFile.writeFloat(this.f27375d);
        if (m12461m(this.f27372a)) {
            randomAccessFile.writeFloat(this.f27376e);
        }
        randomAccessFile.writeInt(this.f27377f);
        if (m12460n(this.f27372a)) {
            randomAccessFile.writeFloat(this.f27378g);
        }
        m12451w(randomAccessFile);
    }

    public void m12452v(C6810a aVar) {
        aVar.m18952B((byte) this.f27372a);
        aVar.m18941M(this.f27373b);
        aVar.m18941M(this.f27374c);
        aVar.m18948F(this.f27375d);
        if (m12461m(this.f27372a)) {
            aVar.m18948F(this.f27376e);
        }
        aVar.m18946H(this.f27377f);
        if (m12460n(this.f27372a)) {
            aVar.m18948F(this.f27378g);
        }
        m12450x(aVar);
    }

    public final void m12451w(RandomAccessFile randomAccessFile) {
        int i = this.f27372a;
        if (i == 0) {
            this.f27383l.m12507m(randomAccessFile);
        } else if (i == 1 || i == 2) {
            randomAccessFile.writeFloat(this.f27379h);
            randomAccessFile.writeFloat(this.f27380i);
            randomAccessFile.writeFloat(this.f27381j);
            randomAccessFile.writeFloat(this.f27382k);
        }
    }

    public final void m12450x(C6810a aVar) {
        int i = this.f27372a;
        if (i == 0) {
            this.f27383l.m12506n(aVar);
        } else if (i == 1 || i == 2) {
            aVar.m18948F(this.f27379h);
            aVar.m18948F(this.f27380i);
            aVar.m18948F(this.f27381j);
            aVar.m18948F(this.f27382k);
        }
    }

    public void m12449y(int i, float f) {
        if (this.f27377f != i || this.f27378g != f) {
            this.f27377f = i;
            this.f27378g = f;
            m12463k(false);
        }
    }

    public void m12448z(MotionEvent motionEvent) {
        float i = m12465i(motionEvent.getX());
        float j = m12464j(motionEvent.getY());
        this.f27380i = i;
        this.f27379h = i;
        this.f27382k = j;
        this.f27381j = j;
        if (this.f27372a == 0) {
            m12474A(motionEvent, false, true);
        }
    }

    public C8434g(int i, int i2, int i3, float f, float f2) {
        this.f27372a = i;
        this.f27373b = i2;
        this.f27374c = i3;
        this.f27375d = f;
        float f3 = this.f27379h;
        this.f27380i = f3;
        this.f27379h = f3;
        float f4 = this.f27381j;
        this.f27382k = f4;
        this.f27381j = f4;
        this.f27376e = f2;
        this.f27383l = i == 0 ? new C8427b(this) : null;
        if (f27371y == null) {
            C6815f<Paint> fVar = new C6815f<>();
            f27371y = fVar;
            fVar.m18901b(m12459o());
        }
    }
}
