package sd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import ce.a0;
import ce.y;
import ib.h;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import nb.f;

public class g {
    public static f<Paint> f22727y;
    public final int f22728a;
    public final int f22729b;
    public final int f22730c;
    public final float f22731d;
    public final float f22732e;
    public int f22733f;
    public float f22734g;
    public float f22735h;
    public float f22736i;
    public float f22737j;
    public float f22738k;
    public b f22739l;
    public ArrayList<a> f22740m;
    public int f22741n;
    public float f22742o;
    public float f22743p;
    public float f22744q;
    public float f22745r;
    public float f22746s;
    public float f22747t;
    public float f22748u;
    public float f22749v;
    public float f22750w;
    public float f22751x;

    public interface a {
        void h0(g gVar, boolean z10);
    }

    public g(int i10) {
        this(i10, 0, 0, 0.0f, 0.0f);
    }

    public static boolean m(int i10) {
        return i10 == 2;
    }

    public static boolean n(int i10) {
        return i10 != 3;
    }

    public static Paint o() {
        Paint paint = new Paint(5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public static g q(RandomAccessFile randomAccessFile) {
        int read = randomAccessFile.read();
        int t10 = nb.a.t(randomAccessFile);
        int t11 = nb.a.t(randomAccessFile);
        float readFloat = randomAccessFile.readFloat();
        float readFloat2 = m(read) ? randomAccessFile.readFloat() : 0.0f;
        int readInt = randomAccessFile.readInt();
        float readFloat3 = n(read) ? randomAccessFile.readFloat() : 0.0f;
        g gVar = new g(read, t10, t11, readFloat, readFloat2);
        gVar.y(readInt, readFloat3);
        s(randomAccessFile, gVar);
        return gVar;
    }

    public static g r(nb.a aVar) {
        byte e10 = aVar.e();
        int s10 = aVar.s();
        int s11 = aVar.s();
        float k10 = aVar.k();
        float k11 = m(e10) ? aVar.k() : 0.0f;
        int m10 = aVar.m();
        float k12 = n(e10) ? aVar.k() : 0.0f;
        g gVar = new g(e10, s10, s11, k10, k11);
        gVar.y(m10, k12);
        t(aVar, gVar);
        return gVar;
    }

    public static void s(RandomAccessFile randomAccessFile, g gVar) {
        int i10 = gVar.f22728a;
        if (i10 == 0) {
            gVar.f22739l = new b(gVar, randomAccessFile);
        } else if (i10 == 1 || i10 == 2) {
            gVar.f22735h = randomAccessFile.readFloat();
            gVar.f22736i = randomAccessFile.readFloat();
            gVar.f22737j = randomAccessFile.readFloat();
            gVar.f22738k = randomAccessFile.readFloat();
        }
    }

    public static void t(nb.a aVar, g gVar) {
        int i10 = gVar.f22728a;
        if (i10 == 0) {
            gVar.f22739l = new b(gVar, aVar);
        } else if (i10 == 1 || i10 == 2) {
            gVar.f22735h = aVar.k();
            gVar.f22736i = aVar.k();
            gVar.f22737j = aVar.k();
            gVar.f22738k = aVar.k();
        }
    }

    public final void A(MotionEvent motionEvent, boolean z10, boolean z11) {
        b(motionEvent, z10, z11);
        k(!z10);
    }

    public void a(a aVar) {
        if (this.f22740m == null) {
            this.f22740m = new ArrayList<>();
        }
        this.f22740m.add(aVar);
    }

    public final void b(MotionEvent motionEvent, boolean z10, boolean z11) {
        float f10;
        float f11;
        int i10;
        float f12;
        MotionEvent motionEvent2 = motionEvent;
        int i11 = 0;
        int i12 = 1;
        boolean z12 = z11 && motionEvent.getAction() == 2;
        if (z12) {
            i12 = motionEvent.getHistorySize();
        }
        while (i11 < i12) {
            if (z12) {
                f11 = motionEvent2.getHistoricalX(i11);
                f10 = motionEvent2.getHistoricalY(i11);
            } else {
                f11 = motionEvent.getX();
                f10 = motionEvent.getY();
            }
            if (z10) {
                if (this.f22741n == 0) {
                    b bVar = this.f22739l;
                    this.f22750w = f11;
                    this.f22751x = f10;
                    bVar.j(f11, f10);
                }
                float f13 = this.f22750w;
                if (f13 == f11 && this.f22751x == f10) {
                    this.f22739l.i(f11 + 1.0f, f10);
                    return;
                } else {
                    this.f22739l.k(f13, this.f22751x, f11, f10);
                    return;
                }
            } else {
                if (this.f22750w == f11 && this.f22751x == f10 && this.f22741n > 0) {
                    i10 = i12;
                } else {
                    this.f22750w = f11;
                    this.f22751x = f10;
                    int i13 = this.f22741n;
                    this.f22741n = i13 + 1;
                    float f14 = 0.0f;
                    if (i13 == 0) {
                        this.f22739l.j(f11, f10);
                        f12 = 0.0f;
                    } else {
                        f14 = (f11 - this.f22746s) / 3.0f;
                        f12 = (f10 - this.f22747t) / 3.0f;
                    }
                    if (i13 > 3) {
                        float f15 = this.f22746s;
                        float f16 = this.f22747t;
                        float f17 = this.f22748u;
                        float f18 = this.f22749v;
                        i10 = i12;
                        this.f22739l.e(this.f22742o + this.f22744q, this.f22745r + this.f22743p, f15 - f17, f16 - f18, f15, f16);
                    } else {
                        i10 = i12;
                    }
                    this.f22742o = this.f22746s;
                    this.f22743p = this.f22747t;
                    this.f22744q = this.f22748u;
                    this.f22745r = this.f22749v;
                    this.f22746s = f11;
                    this.f22747t = f10;
                    this.f22748u = f14;
                    this.f22749v = f12;
                }
                i11++;
                motionEvent2 = motionEvent;
                i12 = i10;
            }
        }
    }

    public boolean c(g gVar) {
        int i10;
        int i11;
        int i12;
        if (gVar != null) {
            int i13 = gVar.f22728a;
            int i14 = this.f22728a;
            if (i13 == i14 && gVar.f22733f == this.f22733f && ((!n(i14) || gVar.f22734g == this.f22734g) && (((i10 = this.f22728a) == 3 || (((i11 = gVar.f22729b) == (i12 = this.f22729b) && gVar.f22730c == this.f22730c) || i11 / gVar.f22730c == i12 / this.f22730c)) && ((!m(i10) || gVar.f22732e == this.f22732e) && gVar.f22735h == this.f22735h && gVar.f22736i == this.f22736i && gVar.f22737j == this.f22737j && gVar.f22738k == this.f22738k && (this.f22728a != 0 || gVar.f22739l.d(this.f22739l)))))) {
                return true;
            }
        }
        return false;
    }

    public boolean d(MotionEvent motionEvent, boolean z10) {
        int i10 = this.f22728a;
        if (i10 != 0) {
            return !(i10 == 1 || i10 == 2) || !z10 || (this.f22735h == this.f22736i && this.f22737j == this.f22738k);
        }
        if (z10 && this.f22739l.f() <= 3) {
            return false;
        }
        A(motionEvent, true, true);
        this.f22739l.o();
        return true;
    }

    public final int e(float f10, float f11, float f12) {
        return (int) (a0.k(f10) * (f11 / this.f22729b) * this.f22731d);
    }

    public void f(Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        Paint paint;
        float f10;
        float f11;
        Canvas canvas2;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        float f12 = i10;
        double d10 = f12;
        double d11 = i15;
        float ceil = (float) (Math.ceil(this.f22735h * d11) + d10);
        float floor = (float) (d10 + Math.floor(d11 * this.f22736i));
        if (ceil == floor) {
            if (floor >= i15) {
                ceil -= 1.0f;
            } else {
                floor -= 1.0f;
            }
        }
        float f13 = i11;
        double d12 = f13;
        double d13 = i16;
        float ceil2 = (float) (Math.ceil(this.f22737j * d13) + d12);
        float floor2 = (float) (d12 + Math.floor(d13 * this.f22738k));
        if (ceil2 == floor2) {
            if (floor2 >= i16) {
                ceil2 -= 1.0f;
            } else {
                floor2 -= 1.0f;
            }
        }
        float f14 = ceil2;
        float f15 = floor2;
        float min = Math.min(ceil, floor);
        float min2 = Math.min(f14, f15);
        float max = Math.max(ceil, floor);
        float max2 = Math.max(f14, f15);
        float f16 = i15;
        float f17 = i16;
        float e10 = e(this.f22734g, f16, f17);
        Paint a10 = f22727y.a();
        if (a10 == null) {
            f<Paint> fVar = f22727y;
            i14 = i16;
            paint = o();
            fVar.b(paint);
        } else {
            i14 = i16;
            paint = a10;
        }
        paint.setStrokeWidth(e10);
        paint.setColor(this.f22733f);
        int i17 = this.f22728a;
        if (i17 != 0) {
            boolean z10 = true;
            if (i17 == 1) {
                Paint paint2 = paint;
                canvas.drawLine(ceil, f14, floor, f15, paint);
                paint2.setStyle(Paint.Style.FILL);
                float f18 = e10 / 2.0f;
                canvas.drawCircle(ceil, f14, f18, paint2);
                canvas.drawCircle(floor, f15, f18, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                float f19 = (ceil - floor) / 2.0f;
                float f20 = (f14 - f15) / 2.0f;
                float e11 = e(24.0f, f16, f17);
                float abs = Math.abs(h.h(0.0f, 0.0f, f19, f20));
                if (abs > e11) {
                    float f21 = e11 / abs;
                    f19 *= f21;
                    f20 *= f21;
                } else if (abs < e11) {
                    f10 = 15.0f + ((20.0f * abs) / e11);
                    f11 = f20;
                    canvas.save();
                    canvas.rotate(-f10, floor, f15);
                    float f22 = f19 + floor;
                    float f23 = f15 + f11;
                    float f24 = floor;
                    canvas.drawLine(f24, f15, f22, f23, paint2);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f22, f23, f18, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    canvas.rotate(f10 * 2.0f, floor, f15);
                    canvas.drawLine(f24, f15, f22, f23, paint2);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f22, f23, f18, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    canvas.restore();
                }
                f11 = f20;
                f10 = 35.0f;
                canvas.save();
                canvas.rotate(-f10, floor, f15);
                float f222 = f19 + floor;
                float f232 = f15 + f11;
                float f242 = floor;
                canvas.drawLine(f242, f15, f222, f232, paint2);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f222, f232, f18, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                canvas.rotate(f10 * 2.0f, floor, f15);
                canvas.drawLine(f242, f15, f222, f232, paint2);
                paint2.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f222, f232, f18, paint2);
                paint2.setStyle(Paint.Style.STROKE);
                canvas.restore();
            } else if (i17 == 2) {
                Paint paint3 = paint;
                RectF a02 = y.a0();
                a02.set(min, min2, max, max2);
                if (this.f22732e == 0.0f) {
                    z10 = false;
                }
                if (z10) {
                    canvas.save();
                    canvas2 = canvas;
                    canvas2.rotate(-this.f22732e, min, min2);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawRect(a02, paint3);
                if (z10) {
                    canvas.restore();
                }
            } else if (i17 == 3) {
                paint.setStyle(Paint.Style.FILL);
                canvas.drawRect(f12, f13, i12, i13, paint);
                paint.setStyle(Paint.Style.STROKE);
            }
        } else {
            canvas.save();
            canvas.clipRect(i10, i11, i12, i13);
            if (!(i10 == 0 && i11 == 0)) {
                canvas.translate(f12, f13);
            }
            canvas.drawPath(this.f22739l.h(i15, i14), paint);
            canvas.restore();
        }
    }

    public int g() {
        int i10 = 4;
        int w10 = nb.a.w(this.f22729b) + 1 + nb.a.w(this.f22730c) + 4 + (m(this.f22728a) ? 4 : 0) + 4;
        if (!n(this.f22728a)) {
            i10 = 0;
        }
        return w10 + i10 + h();
    }

    public final int h() {
        int i10 = this.f22728a;
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 32 : 0;
        }
        return this.f22739l.g();
    }

    public float i(float f10) {
        return f10 / this.f22729b;
    }

    public float j(float f10) {
        return f10 / this.f22730c;
    }

    public final void k(boolean z10) {
        ArrayList<a> arrayList = this.f22740m;
        if (arrayList != null) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().h0(this, z10);
            }
        }
    }

    public void l(MotionEvent motionEvent, boolean z10) {
        float i10 = i(motionEvent.getX());
        float j10 = j(motionEvent.getY());
        int i11 = this.f22728a;
        if (i11 == 0) {
            A(motionEvent, false, z10);
        } else if (i11 != 1 && i11 != 2) {
        } else {
            if (this.f22736i != i10 || this.f22738k != j10) {
                this.f22736i = i10;
                this.f22738k = j10;
                k(true);
            }
        }
    }

    public void p(a aVar) {
        ArrayList<a> arrayList = this.f22740m;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    public void u(RandomAccessFile randomAccessFile) {
        randomAccessFile.writeByte((byte) this.f22728a);
        nb.a.N(randomAccessFile, this.f22729b);
        nb.a.N(randomAccessFile, this.f22730c);
        randomAccessFile.writeFloat(this.f22731d);
        if (m(this.f22728a)) {
            randomAccessFile.writeFloat(this.f22732e);
        }
        randomAccessFile.writeInt(this.f22733f);
        if (n(this.f22728a)) {
            randomAccessFile.writeFloat(this.f22734g);
        }
        w(randomAccessFile);
    }

    public void v(nb.a aVar) {
        aVar.B((byte) this.f22728a);
        aVar.M(this.f22729b);
        aVar.M(this.f22730c);
        aVar.F(this.f22731d);
        if (m(this.f22728a)) {
            aVar.F(this.f22732e);
        }
        aVar.H(this.f22733f);
        if (n(this.f22728a)) {
            aVar.F(this.f22734g);
        }
        x(aVar);
    }

    public final void w(RandomAccessFile randomAccessFile) {
        int i10 = this.f22728a;
        if (i10 == 0) {
            this.f22739l.m(randomAccessFile);
        } else if (i10 == 1 || i10 == 2) {
            randomAccessFile.writeFloat(this.f22735h);
            randomAccessFile.writeFloat(this.f22736i);
            randomAccessFile.writeFloat(this.f22737j);
            randomAccessFile.writeFloat(this.f22738k);
        }
    }

    public final void x(nb.a aVar) {
        int i10 = this.f22728a;
        if (i10 == 0) {
            this.f22739l.n(aVar);
        } else if (i10 == 1 || i10 == 2) {
            aVar.F(this.f22735h);
            aVar.F(this.f22736i);
            aVar.F(this.f22737j);
            aVar.F(this.f22738k);
        }
    }

    public void y(int i10, float f10) {
        if (this.f22733f != i10 || this.f22734g != f10) {
            this.f22733f = i10;
            this.f22734g = f10;
            k(false);
        }
    }

    public void z(MotionEvent motionEvent) {
        float i10 = i(motionEvent.getX());
        float j10 = j(motionEvent.getY());
        this.f22736i = i10;
        this.f22735h = i10;
        this.f22738k = j10;
        this.f22737j = j10;
        if (this.f22728a == 0) {
            A(motionEvent, false, true);
        }
    }

    public g(int i10, int i11, int i12, float f10, float f11) {
        this.f22728a = i10;
        this.f22729b = i11;
        this.f22730c = i12;
        this.f22731d = f10;
        float f12 = this.f22735h;
        this.f22736i = f12;
        this.f22735h = f12;
        float f13 = this.f22737j;
        this.f22738k = f13;
        this.f22737j = f13;
        this.f22732e = f11;
        this.f22739l = i10 == 0 ? new b(this) : null;
        if (f22727y == null) {
            f<Paint> fVar = new f<>();
            f22727y = fVar;
            fVar.b(o());
        }
    }
}
