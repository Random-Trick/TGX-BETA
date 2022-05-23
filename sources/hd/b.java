package hd;

import ae.j;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ce.a0;
import ce.c;
import ce.c0;
import ce.p;
import ce.p0;
import ce.y;
import ce.z;
import ib.d;
import ib.i;
import ie.t;
import je.e;
import je.g;
import je.t;
import org.thunderdog.challegram.R;

public class b {
    public final float f12760a;
    public final g f12761b;
    public final Drawable f12762c;
    public final a f12763d;

    public static class a {
        public final int f12764a;
        public final String f12765b;
        public final int f12766c;
        public final int f12767d;

        public a(int i10, e eVar, int i11, int i12) {
            this(i10, eVar != null ? eVar.f15363a : null, i11, i12);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.f12764a == this.f12764a && i.c(aVar.f12765b, this.f12765b) && aVar.f12764a == this.f12764a) {
                    return true;
                }
            }
            return false;
        }

        public a() {
            this(R.id.theme_color_avatarInactive);
        }

        public a(int i10) {
            this(i10, c0.f5243b, 0, 0);
        }

        public a(int i10, int i11) {
            this(i10, (e) null, i11, 0);
        }

        public a(int i10, e eVar) {
            this(i10, eVar, 0, 0);
        }

        public a(int i10, String str) {
            this(i10, str, 0, 0);
        }

        public a(int i10, String str, int i11, int i12) {
            this.f12764a = i10;
            this.f12765b = str;
            this.f12766c = i11;
            this.f12767d = i12;
        }
    }

    public b(float f10, a aVar, t tVar) {
        aVar = aVar == null ? new a() : aVar;
        this.f12763d = aVar;
        this.f12760a = f10;
        this.f12761b = i.i(aVar.f12765b) ? null : new g.b(aVar.f12765b, a0.i(f10) * 3, y.A0((int) (f10 * 0.75f)), t.d.K).b().v().f();
        if (tVar != null) {
            this.f12762c = tVar.Z(aVar.f12766c, R.id.theme_color_avatar_content);
            return;
        }
        int i10 = aVar.f12766c;
        if (i10 != R.drawable.baseline_bookmark_24) {
            this.f12762c = c.f(i10);
        } else {
            this.f12762c = p.c();
        }
    }

    public void a(Canvas canvas, float f10, float f11) {
        d(canvas, f10, f11, 1.0f, f(), true);
    }

    public void b(Canvas canvas, float f10, float f11, float f12) {
        d(canvas, f10, f11, f12, f(), true);
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        d(canvas, f10, f11, f12, f13, true);
    }

    public void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10) {
        Drawable drawable;
        g gVar;
        int i10;
        if (f12 > 0.0f) {
            if (z10 && (i10 = this.f12763d.f12764a) != 0) {
                canvas.drawCircle(f10, f11, f13, y.g(d.a(f12, j.L(i10))));
            }
            int i11 = -1;
            boolean z11 = true;
            if (this.f12761b != null) {
                float i12 = a0.i(this.f12760a);
                float min = (f13 < i12 ? f13 / i12 : 1.0f) * Math.min(1.0f, (f13 * 2.0f) / Math.max(this.f12761b.getWidth(), this.f12761b.getHeight()));
                if (min == 1.0f) {
                    z11 = false;
                }
                if (z11) {
                    i11 = p0.O(canvas);
                    canvas.scale(min, min, f10, f11);
                }
                this.f12761b.z(canvas, (int) (f10 - (gVar.getWidth() / 2)), (int) (f11 - (this.f12761b.getHeight() / 2)), null, f12);
                if (z11) {
                    p0.N(canvas, i11);
                }
            } else if (this.f12762c != null) {
                float i13 = a0.i(this.f12760a);
                float min2 = (f13 < i13 ? f13 / i13 : 1.0f) * Math.min(1.0f, (f13 * 2.0f) / Math.max(this.f12762c.getMinimumWidth(), this.f12762c.getMinimumHeight()));
                if (min2 == 1.0f) {
                    z11 = false;
                }
                if (z11) {
                    i11 = p0.O(canvas);
                    canvas.scale(min2, min2, f10, f11);
                }
                c.b(canvas, this.f12762c, f10 - (drawable.getMinimumWidth() / 2.0f), f11 - (this.f12762c.getMinimumHeight() / 2.0f), z.c(R.id.theme_color_avatar_content, f12));
                if (z11) {
                    p0.N(canvas, i11);
                }
            }
        }
    }

    public int e() {
        return j.L(this.f12763d.f12764a);
    }

    public int f() {
        return a0.i(this.f12760a);
    }
}
