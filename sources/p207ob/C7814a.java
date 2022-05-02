package p207ob;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.thunderdog.challegram.Log;
import p252rb.AbstractC8418b;
import p252rb.C8422c;
import p252rb.C8423d;
import p317wa.C10030l;
import qa.C8294g;
import qa.C8298k;
import ua.AbstractC9486c;

public final class C7814a {
    public final float f25029a;
    public float f25030b;
    public final Paint f25031c;
    public float f25032d;
    public float f25033e;
    public float f25034f;
    public float f25035g;
    public int f25036h;
    public C8423d f25037i;
    public final int f25038j;
    public final C8422c f25039k;
    public final AbstractC8418b f25040l;
    public long f25041m;
    public final boolean f25042n;
    public C8423d f25043o;
    public C8423d f25044p;
    public final boolean f25045q;
    public final boolean f25046r;
    public final float f25047s;
    public final float f25048t;

    public C7814a(C8423d dVar, int i, C8422c cVar, AbstractC8418b bVar, long j, boolean z, C8423d dVar2, C8423d dVar3, boolean z2, boolean z3, float f, float f2) {
        C8298k.m12933e(dVar, "location");
        C8298k.m12933e(cVar, "size");
        C8298k.m12933e(bVar, "shape");
        C8298k.m12933e(dVar2, "acceleration");
        C8298k.m12933e(dVar3, "velocity");
        this.f25037i = dVar;
        this.f25038j = i;
        this.f25039k = cVar;
        this.f25040l = bVar;
        this.f25041m = j;
        this.f25042n = z;
        this.f25043o = dVar2;
        this.f25044p = dVar3;
        this.f25045q = z2;
        this.f25046r = z3;
        this.f25047s = f;
        this.f25048t = f2;
        this.f25029a = cVar.m12530a();
        this.f25030b = cVar.m12529b();
        Paint paint = new Paint();
        this.f25031c = paint;
        this.f25034f = this.f25030b;
        this.f25035g = 60.0f;
        this.f25036h = 255;
        Resources system = Resources.getSystem();
        C8298k.m12934d(system, "Resources.getSystem()");
        float f3 = system.getDisplayMetrics().density * 0.29f;
        float f4 = 3 * f3;
        if (z2) {
            this.f25032d = ((f4 * AbstractC9486c.f30720a.mo8551c()) + f3) * f2;
        }
        paint.setColor(i);
    }

    public final void m14983a(C8423d dVar) {
        C8298k.m12933e(dVar, "force");
        this.f25043o.m12527b(dVar, 1.0f / this.f25029a);
    }

    public final void m14982b(Canvas canvas) {
        if (this.f25037i.m12525d() > canvas.getHeight()) {
            this.f25041m = 0L;
        } else if (this.f25037i.m12526c() <= canvas.getWidth()) {
            float f = 0;
            if (this.f25037i.m12526c() + m14981c() >= f && this.f25037i.m12525d() + m14981c() >= f) {
                this.f25031c.setColor((this.f25036h << 24) | (this.f25038j & 16777215));
                float f2 = 2;
                float abs = Math.abs((this.f25034f / this.f25030b) - 0.5f) * f2;
                float f3 = (this.f25030b * abs) / f2;
                int save = canvas.save();
                canvas.translate(this.f25037i.m12526c() - f3, this.f25037i.m12525d());
                canvas.rotate(this.f25033e, f3, this.f25030b / f2);
                canvas.scale(abs, 1.0f);
                this.f25040l.mo12531a(canvas, this.f25031c, this.f25030b);
                canvas.restoreToCount(save);
            }
        }
    }

    public final float m14981c() {
        return this.f25030b;
    }

    public final boolean m14980d() {
        return this.f25036h <= 0;
    }

    public final void m14979e(Canvas canvas, float f) {
        C8298k.m12933e(canvas, "canvas");
        m14978f(f);
        m14982b(canvas);
    }

    public final void m14978f(float f) {
        if (this.f25046r) {
            float d = this.f25043o.m12525d();
            float f2 = this.f25047s;
            if (d < f2 || f2 == -1.0f) {
                this.f25044p.m12528a(this.f25043o);
            }
        }
        this.f25037i.m12527b(this.f25044p, this.f25035g * f);
        long j = this.f25041m;
        if (j <= 0) {
            m14977g(f);
        } else {
            this.f25041m = j - (1000 * f);
        }
        float f3 = this.f25032d * f * this.f25035g;
        float f4 = this.f25033e + f3;
        this.f25033e = f4;
        if (f4 >= 360) {
            this.f25033e = 0.0f;
        }
        float f5 = this.f25034f - f3;
        this.f25034f = f5;
        if (f5 < 0) {
            this.f25034f = this.f25030b;
        }
    }

    public final void m14977g(float f) {
        int i = 0;
        if (this.f25042n) {
            i = C10030l.m6193d(this.f25036h - ((int) ((5 * f) * this.f25035g)), 0);
        }
        this.f25036h = i;
    }

    public C7814a(C8423d dVar, int i, C8422c cVar, AbstractC8418b bVar, long j, boolean z, C8423d dVar2, C8423d dVar3, boolean z2, boolean z3, float f, float f2, int i2, C8294g gVar) {
        this(dVar, i, cVar, bVar, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? new C8423d(0.0f, 0.0f) : dVar2, (i2 & Log.TAG_YOUTUBE) != 0 ? new C8423d(0.0f, 0.0f, 3, null) : dVar3, (i2 & Log.TAG_CRASH) != 0 ? true : z2, (i2 & Log.TAG_GIF_LOADER) != 0 ? true : z3, (i2 & Log.TAG_CAMERA) != 0 ? -1.0f : f, (i2 & Log.TAG_VOICE) != 0 ? 1.0f : f2);
    }
}
