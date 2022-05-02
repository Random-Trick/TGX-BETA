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
    public static C6815f<Paint> f27368y;
    public final int f27369a;
    public final int f27370b;
    public final int f27371c;
    public final float f27372d;
    public final float f27373e;
    public int f27374f;
    public float f27375g;
    public float f27376h;
    public float f27377i;
    public float f27378j;
    public float f27379k;
    public C8427b f27380l;
    public ArrayList<AbstractC8435a> f27381m;
    public int f27382n;
    public float f27383o;
    public float f27384p;
    public float f27385q;
    public float f27386r;
    public float f27387s;
    public float f27388t;
    public float f27389u;
    public float f27390v;
    public float f27391w;
    public float f27392x;

    public interface AbstractC8435a {
        void mo12448o(C8434g gVar, boolean z);
    }

    public C8434g(int i) {
        this(i, 0, 0, 0.0f, 0.0f);
    }

    public static boolean m12462m(int i) {
        return i == 2;
    }

    public static boolean m12461n(int i) {
        return i != 3;
    }

    public static Paint m12460o() {
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public static C8434g m12458q(RandomAccessFile randomAccessFile) {
        int read = randomAccessFile.read();
        int t = C6810a.m18919t(randomAccessFile);
        int t2 = C6810a.m18919t(randomAccessFile);
        float readFloat = randomAccessFile.readFloat();
        float readFloat2 = m12462m(read) ? randomAccessFile.readFloat() : 0.0f;
        int readInt = randomAccessFile.readInt();
        float readFloat3 = m12461n(read) ? randomAccessFile.readFloat() : 0.0f;
        C8434g gVar = new C8434g(read, t, t2, readFloat, readFloat2);
        gVar.m12450y(readInt, readFloat3);
        m12456s(randomAccessFile, gVar);
        return gVar;
    }

    public static C8434g m12457r(C6810a aVar) {
        byte e = aVar.m18934e();
        int s = aVar.m18920s();
        int s2 = aVar.m18920s();
        float k = aVar.m18928k();
        float k2 = m12462m(e) ? aVar.m18928k() : 0.0f;
        int m = aVar.m18926m();
        float k3 = m12461n(e) ? aVar.m18928k() : 0.0f;
        C8434g gVar = new C8434g(e, s, s2, k, k2);
        gVar.m12450y(m, k3);
        m12455t(aVar, gVar);
        return gVar;
    }

    public static void m12456s(RandomAccessFile randomAccessFile, C8434g gVar) {
        int i = gVar.f27369a;
        if (i == 0) {
            gVar.f27380l = new C8427b(gVar, randomAccessFile);
        } else if (i == 1 || i == 2) {
            gVar.f27376h = randomAccessFile.readFloat();
            gVar.f27377i = randomAccessFile.readFloat();
            gVar.f27378j = randomAccessFile.readFloat();
            gVar.f27379k = randomAccessFile.readFloat();
        }
    }

    public static void m12455t(C6810a aVar, C8434g gVar) {
        int i = gVar.f27369a;
        if (i == 0) {
            gVar.f27380l = new C8427b(gVar, aVar);
        } else if (i == 1 || i == 2) {
            gVar.f27376h = aVar.m18928k();
            gVar.f27377i = aVar.m18928k();
            gVar.f27378j = aVar.m18928k();
            gVar.f27379k = aVar.m18928k();
        }
    }

    public final void m12475A(MotionEvent motionEvent, boolean z, boolean z2) {
        m12473b(motionEvent, z, z2);
        m12464k(!z);
    }

    public void m12474a(AbstractC8435a aVar) {
        if (this.f27381m == null) {
            this.f27381m = new ArrayList<>();
        }
        this.f27381m.add(aVar);
    }

    public final void m12473b(MotionEvent motionEvent, boolean z, boolean z2) {
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
                if (this.f27382n == 0) {
                    C8427b bVar = this.f27380l;
                    this.f27391w = f2;
                    this.f27392x = f;
                    bVar.m12511j(f2, f);
                }
                float f4 = this.f27391w;
                if (f4 == f2 && this.f27392x == f) {
                    this.f27380l.m12512i(f2 + 1.0f, f);
                    return;
                } else {
                    this.f27380l.m12510k(f4, this.f27392x, f2, f);
                    return;
                }
            } else {
                if (this.f27391w == f2 && this.f27392x == f && this.f27382n > 0) {
                    i = i3;
                } else {
                    this.f27391w = f2;
                    this.f27392x = f;
                    int i4 = this.f27382n;
                    this.f27382n = i4 + 1;
                    float f5 = 0.0f;
                    if (i4 == 0) {
                        this.f27380l.m12511j(f2, f);
                        f3 = 0.0f;
                    } else {
                        f5 = (f2 - this.f27387s) / 3.0f;
                        f3 = (f - this.f27388t) / 3.0f;
                    }
                    if (i4 > 3) {
                        float f6 = this.f27387s;
                        float f7 = this.f27388t;
                        float f8 = this.f27389u;
                        float f9 = this.f27390v;
                        i = i3;
                        this.f27380l.m12516e(this.f27383o + this.f27385q, this.f27386r + this.f27384p, f6 - f8, f7 - f9, f6, f7);
                    } else {
                        i = i3;
                    }
                    this.f27383o = this.f27387s;
                    this.f27384p = this.f27388t;
                    this.f27385q = this.f27389u;
                    this.f27386r = this.f27390v;
                    this.f27387s = f2;
                    this.f27388t = f;
                    this.f27389u = f5;
                    this.f27390v = f3;
                }
                i2++;
                motionEvent2 = motionEvent;
                i3 = i;
            }
        }
    }

    public boolean m12472c(C8434g gVar) {
        int i;
        int i2;
        int i3;
        if (gVar != null) {
            int i4 = gVar.f27369a;
            int i5 = this.f27369a;
            if (i4 == i5 && gVar.f27374f == this.f27374f && ((!m12461n(i5) || gVar.f27375g == this.f27375g) && (((i = this.f27369a) == 3 || (((i2 = gVar.f27370b) == (i3 = this.f27370b) && gVar.f27371c == this.f27371c) || i2 / gVar.f27371c == i3 / this.f27371c)) && ((!m12462m(i) || gVar.f27373e == this.f27373e) && gVar.f27376h == this.f27376h && gVar.f27377i == this.f27377i && gVar.f27378j == this.f27378j && gVar.f27379k == this.f27379k && (this.f27369a != 0 || gVar.f27380l.m12517d(this.f27380l)))))) {
                return true;
            }
        }
        return false;
    }

    public boolean m12471d(MotionEvent motionEvent, boolean z) {
        int i = this.f27369a;
        if (i != 0) {
            return !(i == 1 || i == 2) || !z || (this.f27376h == this.f27377i && this.f27378j == this.f27379k);
        }
        if (z && this.f27380l.m12515f() <= 3) {
            return false;
        }
        m12475A(motionEvent, true, true);
        this.f27380l.m12506o();
        return true;
    }

    public final int m12470e(float f, float f2, float f3) {
        return (int) (C1357a0.m37539k(f) * (f2 / this.f27370b) * this.f27372d);
    }

    public void m12469f(Canvas canvas, int i, int i2, int i3, int i4) {
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
        float ceil = (float) (Math.ceil(this.f27376h * d2) + d);
        float floor = (float) (d + Math.floor(d2 * this.f27377i));
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
        float ceil2 = (float) (Math.ceil(this.f27378j * d4) + d3);
        float floor2 = (float) (d3 + Math.floor(d4 * this.f27379k));
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
        float e = m12470e(this.f27375g, f7, f8);
        Paint a = f27368y.m18901a();
        if (a == null) {
            C6815f<Paint> fVar = f27368y;
            i5 = i7;
            paint = m12460o();
            fVar.m18900b(paint);
        } else {
            i5 = i7;
            paint = a;
        }
        paint.setStrokeWidth(e);
        paint.setColor(this.f27374f);
        int i8 = this.f27369a;
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
                float e2 = m12470e(24.0f, f7, f8);
                float abs = Math.abs(C5069h.m24085h(0.0f, 0.0f, f10, f11));
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
                RectF a0 = C1410y.m37050a0();
                a0.set(min, min2, max, max2);
                if (this.f27373e == 0.0f) {
                    z = false;
                }
                if (z) {
                    canvas.save();
                    canvas2 = canvas;
                    canvas2.rotate(-this.f27373e, min, min2);
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
            canvas.drawPath(this.f27380l.m12513h(i6, i5), paint);
            canvas.restore();
        }
    }

    public int m12468g() {
        int i = 4;
        int w = C6810a.m18916w(this.f27370b) + 1 + C6810a.m18916w(this.f27371c) + 4 + (m12462m(this.f27369a) ? 4 : 0) + 4;
        if (!m12461n(this.f27369a)) {
            i = 0;
        }
        return w + i + m12467h();
    }

    public final int m12467h() {
        int i = this.f27369a;
        if (i != 0) {
            return (i == 1 || i == 2) ? 32 : 0;
        }
        return this.f27380l.m12514g();
    }

    public float m12466i(float f) {
        return f / this.f27370b;
    }

    public float m12465j(float f) {
        return f / this.f27371c;
    }

    public final void m12464k(boolean z) {
        ArrayList<AbstractC8435a> arrayList = this.f27381m;
        if (arrayList != null) {
            Iterator<AbstractC8435a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo12448o(this, z);
            }
        }
    }

    public void m12463l(MotionEvent motionEvent, boolean z) {
        float i = m12466i(motionEvent.getX());
        float j = m12465j(motionEvent.getY());
        int i2 = this.f27369a;
        if (i2 == 0) {
            m12475A(motionEvent, false, z);
        } else if (i2 != 1 && i2 != 2) {
        } else {
            if (this.f27377i != i || this.f27379k != j) {
                this.f27377i = i;
                this.f27379k = j;
                m12464k(true);
            }
        }
    }

    public void m12459p(AbstractC8435a aVar) {
        ArrayList<AbstractC8435a> arrayList = this.f27381m;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    public void m12454u(RandomAccessFile randomAccessFile) {
        randomAccessFile.writeByte((byte) this.f27369a);
        C6810a.m18939N(randomAccessFile, this.f27370b);
        C6810a.m18939N(randomAccessFile, this.f27371c);
        randomAccessFile.writeFloat(this.f27372d);
        if (m12462m(this.f27369a)) {
            randomAccessFile.writeFloat(this.f27373e);
        }
        randomAccessFile.writeInt(this.f27374f);
        if (m12461n(this.f27369a)) {
            randomAccessFile.writeFloat(this.f27375g);
        }
        m12452w(randomAccessFile);
    }

    public void m12453v(C6810a aVar) {
        aVar.m18951B((byte) this.f27369a);
        aVar.m18940M(this.f27370b);
        aVar.m18940M(this.f27371c);
        aVar.m18947F(this.f27372d);
        if (m12462m(this.f27369a)) {
            aVar.m18947F(this.f27373e);
        }
        aVar.m18945H(this.f27374f);
        if (m12461n(this.f27369a)) {
            aVar.m18947F(this.f27375g);
        }
        m12451x(aVar);
    }

    public final void m12452w(RandomAccessFile randomAccessFile) {
        int i = this.f27369a;
        if (i == 0) {
            this.f27380l.m12508m(randomAccessFile);
        } else if (i == 1 || i == 2) {
            randomAccessFile.writeFloat(this.f27376h);
            randomAccessFile.writeFloat(this.f27377i);
            randomAccessFile.writeFloat(this.f27378j);
            randomAccessFile.writeFloat(this.f27379k);
        }
    }

    public final void m12451x(C6810a aVar) {
        int i = this.f27369a;
        if (i == 0) {
            this.f27380l.m12507n(aVar);
        } else if (i == 1 || i == 2) {
            aVar.m18947F(this.f27376h);
            aVar.m18947F(this.f27377i);
            aVar.m18947F(this.f27378j);
            aVar.m18947F(this.f27379k);
        }
    }

    public void m12450y(int i, float f) {
        if (this.f27374f != i || this.f27375g != f) {
            this.f27374f = i;
            this.f27375g = f;
            m12464k(false);
        }
    }

    public void m12449z(MotionEvent motionEvent) {
        float i = m12466i(motionEvent.getX());
        float j = m12465j(motionEvent.getY());
        this.f27377i = i;
        this.f27376h = i;
        this.f27379k = j;
        this.f27378j = j;
        if (this.f27369a == 0) {
            m12475A(motionEvent, false, true);
        }
    }

    public C8434g(int i, int i2, int i3, float f, float f2) {
        this.f27369a = i;
        this.f27370b = i2;
        this.f27371c = i3;
        this.f27372d = f;
        float f3 = this.f27376h;
        this.f27377i = f3;
        this.f27376h = f3;
        float f4 = this.f27378j;
        this.f27379k = f4;
        this.f27378j = f4;
        this.f27373e = f2;
        this.f27380l = i == 0 ? new C8427b(this) : null;
        if (f27368y == null) {
            C6815f<Paint> fVar = new C6815f<>();
            f27368y = fVar;
            fVar.m18900b(m12460o());
        }
    }
}
