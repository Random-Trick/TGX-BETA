package pb;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;
import sb.b;
import sb.c;
import sb.d;
import xa.l;

public final class a {
    public final float f20976a;
    public float f20977b;
    public final Paint f20978c;
    public float f20979d;
    public float f20980e;
    public float f20981f;
    public float f20982g;
    public int f20983h;
    public d f20984i;
    public final int f20985j;
    public final c f20986k;
    public final b f20987l;
    public long f20988m;
    public final boolean f20989n;
    public d f20990o;
    public d f20991p;
    public final boolean f20992q;
    public final boolean f20993r;
    public final float f20994s;
    public final float f20995t;

    public a(d dVar, int i10, c cVar, b bVar, long j10, boolean z10, d dVar2, d dVar3, boolean z11, boolean z12, float f10, float f11) {
        k.e(dVar, "location");
        k.e(cVar, "size");
        k.e(bVar, "shape");
        k.e(dVar2, "acceleration");
        k.e(dVar3, "velocity");
        this.f20984i = dVar;
        this.f20985j = i10;
        this.f20986k = cVar;
        this.f20987l = bVar;
        this.f20988m = j10;
        this.f20989n = z10;
        this.f20990o = dVar2;
        this.f20991p = dVar3;
        this.f20992q = z11;
        this.f20993r = z12;
        this.f20994s = f10;
        this.f20995t = f11;
        this.f20976a = cVar.a();
        this.f20977b = cVar.b();
        Paint paint = new Paint();
        this.f20978c = paint;
        this.f20981f = this.f20977b;
        this.f20982g = 60.0f;
        this.f20983h = 255;
        Resources system = Resources.getSystem();
        k.d(system, "Resources.getSystem()");
        float f12 = system.getDisplayMetrics().density * 0.29f;
        float f13 = 3 * f12;
        if (z11) {
            this.f20979d = ((f13 * va.c.f24807a.c()) + f12) * f11;
        }
        paint.setColor(i10);
    }

    public final void a(d dVar) {
        k.e(dVar, "force");
        this.f20990o.b(dVar, 1.0f / this.f20976a);
    }

    public final void b(Canvas canvas) {
        if (this.f20984i.d() > canvas.getHeight()) {
            this.f20988m = 0L;
        } else if (this.f20984i.c() <= canvas.getWidth()) {
            float f10 = 0;
            if (this.f20984i.c() + c() >= f10 && this.f20984i.d() + c() >= f10) {
                this.f20978c.setColor((this.f20983h << 24) | (this.f20985j & 16777215));
                float f11 = 2;
                float abs = Math.abs((this.f20981f / this.f20977b) - 0.5f) * f11;
                float f12 = (this.f20977b * abs) / f11;
                int save = canvas.save();
                canvas.translate(this.f20984i.c() - f12, this.f20984i.d());
                canvas.rotate(this.f20980e, f12, this.f20977b / f11);
                canvas.scale(abs, 1.0f);
                this.f20987l.a(canvas, this.f20978c, this.f20977b);
                canvas.restoreToCount(save);
            }
        }
    }

    public final float c() {
        return this.f20977b;
    }

    public final boolean d() {
        return this.f20983h <= 0;
    }

    public final void e(Canvas canvas, float f10) {
        k.e(canvas, "canvas");
        f(f10);
        b(canvas);
    }

    public final void f(float f10) {
        if (this.f20993r) {
            float d10 = this.f20990o.d();
            float f11 = this.f20994s;
            if (d10 < f11 || f11 == -1.0f) {
                this.f20991p.a(this.f20990o);
            }
        }
        this.f20984i.b(this.f20991p, this.f20982g * f10);
        long j10 = this.f20988m;
        if (j10 <= 0) {
            g(f10);
        } else {
            this.f20988m = j10 - (1000 * f10);
        }
        float f12 = this.f20979d * f10 * this.f20982g;
        float f13 = this.f20980e + f12;
        this.f20980e = f13;
        if (f13 >= 360) {
            this.f20980e = 0.0f;
        }
        float f14 = this.f20981f - f12;
        this.f20981f = f14;
        if (f14 < 0) {
            this.f20981f = this.f20977b;
        }
    }

    public final void g(float f10) {
        int i10 = 0;
        if (this.f20989n) {
            i10 = l.d(this.f20983h - ((int) ((5 * f10) * this.f20982g)), 0);
        }
        this.f20983h = i10;
    }

    public a(d dVar, int i10, c cVar, b bVar, long j10, boolean z10, d dVar2, d dVar3, boolean z11, boolean z12, float f10, float f11, int i11, g gVar) {
        this(dVar, i10, cVar, bVar, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? true : z10, (i11 & 64) != 0 ? new d(0.0f, 0.0f) : dVar2, (i11 & Log.TAG_YOUTUBE) != 0 ? new d(0.0f, 0.0f, 3, null) : dVar3, (i11 & Log.TAG_CRASH) != 0 ? true : z11, (i11 & Log.TAG_GIF_LOADER) != 0 ? true : z12, (i11 & Log.TAG_CAMERA) != 0 ? -1.0f : f10, (i11 & Log.TAG_VOICE) != 0 ? 1.0f : f11);
    }
}
