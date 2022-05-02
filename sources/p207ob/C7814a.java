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
    public final float f25026a;
    public float f25027b;
    public final Paint f25028c;
    public float f25029d;
    public float f25030e;
    public float f25031f;
    public float f25032g;
    public int f25033h;
    public C8423d f25034i;
    public final int f25035j;
    public final C8422c f25036k;
    public final AbstractC8418b f25037l;
    public long f25038m;
    public final boolean f25039n;
    public C8423d f25040o;
    public C8423d f25041p;
    public final boolean f25042q;
    public final boolean f25043r;
    public final float f25044s;
    public final float f25045t;

    public C7814a(C8423d dVar, int i, C8422c cVar, AbstractC8418b bVar, long j, boolean z, C8423d dVar2, C8423d dVar3, boolean z2, boolean z3, float f, float f2) {
        C8298k.m12934e(dVar, "location");
        C8298k.m12934e(cVar, "size");
        C8298k.m12934e(bVar, "shape");
        C8298k.m12934e(dVar2, "acceleration");
        C8298k.m12934e(dVar3, "velocity");
        this.f25034i = dVar;
        this.f25035j = i;
        this.f25036k = cVar;
        this.f25037l = bVar;
        this.f25038m = j;
        this.f25039n = z;
        this.f25040o = dVar2;
        this.f25041p = dVar3;
        this.f25042q = z2;
        this.f25043r = z3;
        this.f25044s = f;
        this.f25045t = f2;
        this.f25026a = cVar.m12531a();
        this.f25027b = cVar.m12530b();
        Paint paint = new Paint();
        this.f25028c = paint;
        this.f25031f = this.f25027b;
        this.f25032g = 60.0f;
        this.f25033h = 255;
        Resources system = Resources.getSystem();
        C8298k.m12935d(system, "Resources.getSystem()");
        float f3 = system.getDisplayMetrics().density * 0.29f;
        float f4 = 3 * f3;
        if (z2) {
            this.f25029d = ((f4 * AbstractC9486c.f30717a.mo8551c()) + f3) * f2;
        }
        paint.setColor(i);
    }

    public final void m14983a(C8423d dVar) {
        C8298k.m12934e(dVar, "force");
        this.f25040o.m12528b(dVar, 1.0f / this.f25026a);
    }

    public final void m14982b(Canvas canvas) {
        if (this.f25034i.m12526d() > canvas.getHeight()) {
            this.f25038m = 0L;
        } else if (this.f25034i.m12527c() <= canvas.getWidth()) {
            float f = 0;
            if (this.f25034i.m12527c() + m14981c() >= f && this.f25034i.m12526d() + m14981c() >= f) {
                this.f25028c.setColor((this.f25033h << 24) | (this.f25035j & 16777215));
                float f2 = 2;
                float abs = Math.abs((this.f25031f / this.f25027b) - 0.5f) * f2;
                float f3 = (this.f25027b * abs) / f2;
                int save = canvas.save();
                canvas.translate(this.f25034i.m12527c() - f3, this.f25034i.m12526d());
                canvas.rotate(this.f25030e, f3, this.f25027b / f2);
                canvas.scale(abs, 1.0f);
                this.f25037l.mo12532a(canvas, this.f25028c, this.f25027b);
                canvas.restoreToCount(save);
            }
        }
    }

    public final float m14981c() {
        return this.f25027b;
    }

    public final boolean m14980d() {
        return this.f25033h <= 0;
    }

    public final void m14979e(Canvas canvas, float f) {
        C8298k.m12934e(canvas, "canvas");
        m14978f(f);
        m14982b(canvas);
    }

    public final void m14978f(float f) {
        if (this.f25043r) {
            float d = this.f25040o.m12526d();
            float f2 = this.f25044s;
            if (d < f2 || f2 == -1.0f) {
                this.f25041p.m12529a(this.f25040o);
            }
        }
        this.f25034i.m12528b(this.f25041p, this.f25032g * f);
        long j = this.f25038m;
        if (j <= 0) {
            m14977g(f);
        } else {
            this.f25038m = j - (1000 * f);
        }
        float f3 = this.f25029d * f * this.f25032g;
        float f4 = this.f25030e + f3;
        this.f25030e = f4;
        if (f4 >= 360) {
            this.f25030e = 0.0f;
        }
        float f5 = this.f25031f - f3;
        this.f25031f = f5;
        if (f5 < 0) {
            this.f25031f = this.f25027b;
        }
    }

    public final void m14977g(float f) {
        int i = 0;
        if (this.f25039n) {
            i = C10030l.m6193d(this.f25033h - ((int) ((5 * f) * this.f25032g)), 0);
        }
        this.f25033h = i;
    }

    public C7814a(C8423d dVar, int i, C8422c cVar, AbstractC8418b bVar, long j, boolean z, C8423d dVar2, C8423d dVar3, boolean z2, boolean z3, float f, float f2, int i2, C8294g gVar) {
        this(dVar, i, cVar, bVar, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? new C8423d(0.0f, 0.0f) : dVar2, (i2 & Log.TAG_YOUTUBE) != 0 ? new C8423d(0.0f, 0.0f, 3, null) : dVar3, (i2 & Log.TAG_CRASH) != 0 ? true : z2, (i2 & Log.TAG_GIF_LOADER) != 0 ? true : z3, (i2 & Log.TAG_CAMERA) != 0 ? -1.0f : f, (i2 & Log.TAG_VOICE) != 0 ? 1.0f : f2);
    }
}
