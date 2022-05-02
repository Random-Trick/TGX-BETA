package gd;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import be.C1357a0;
import be.C1362c;
import be.C1363c0;
import be.C1392p;
import be.C1399s0;
import be.C1410y;
import be.C1411z;
import ie.C5386e;
import ie.C5428t;
import ie.RunnableC5390g;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5143t;
import p364zd.C11524j;

public class C4587b {
    public final float f15116a;
    public final RunnableC5390g f15117b;
    public final Drawable f15118c;
    public final C4588a f15119d;

    public static class C4588a {
        public final int f15120a;
        public final String f15121b;
        public final int f15122c;
        public final int f15123d;

        public C4588a(int i, C5386e eVar, int i2, int i3) {
            this(i, eVar != null ? eVar.f17711a : null, i2, i3);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4588a) {
                C4588a aVar = (C4588a) obj;
                if (aVar.f15120a == this.f15120a && C5070i.m24067c(aVar.f15121b, this.f15121b) && aVar.f15120a == this.f15120a) {
                    return true;
                }
            }
            return false;
        }

        public C4588a() {
            this(R.id.theme_color_avatarInactive);
        }

        public C4588a(int i) {
            this(i, C1363c0.f4976b, 0, 0);
        }

        public C4588a(int i, int i2) {
            this(i, (C5386e) null, i2, 0);
        }

        public C4588a(int i, C5386e eVar) {
            this(i, eVar, 0, 0);
        }

        public C4588a(int i, String str) {
            this(i, str, 0, 0);
        }

        public C4588a(int i, String str, int i2, int i3) {
            this.f15120a = i;
            this.f15121b = str;
            this.f15122c = i2;
            this.f15123d = i3;
        }
    }

    public C4587b(float f, C4588a aVar, AbstractC5143t tVar) {
        aVar = aVar == null ? new C4588a() : aVar;
        this.f15119d = aVar;
        this.f15116a = f;
        this.f15117b = C5070i.m24061i(aVar.f15121b) ? null : new RunnableC5390g.C5392b(aVar.f15121b, C1357a0.m37541i(f) * 3, C1410y.m37083A0((int) (f * 0.75f)), C5428t.AbstractC5441d.f17880K).m22888b().m22868v().m22884f();
        if (tVar != null) {
            this.f15118c = tVar.mo14042X(aVar.f15122c, R.id.theme_color_avatar_content);
            return;
        }
        int i = aVar.f15122c;
        if (i != R.drawable.baseline_bookmark_24) {
            this.f15118c = C1362c.m37483f(i);
        } else {
            this.f15118c = C1392p.m37233c();
        }
    }

    public void m27215a(Canvas canvas, float f, float f2) {
        m27212d(canvas, f, f2, 1.0f, m27210f(), true);
    }

    public void m27214b(Canvas canvas, float f, float f2, float f3) {
        m27212d(canvas, f, f2, f3, m27210f(), true);
    }

    public void m27213c(Canvas canvas, float f, float f2, float f3, float f4) {
        m27212d(canvas, f, f2, f3, f4, true);
    }

    public void m27212d(Canvas canvas, float f, float f2, float f3, float f4, boolean z) {
        Drawable drawable;
        RunnableC5390g gVar;
        int i;
        if (f3 > 0.0f) {
            if (z && (i = this.f15119d.f15120a) != 0) {
                canvas.drawCircle(f, f2, f4, C1410y.m37039g(C5064d.m24131a(f3, C11524j.m228N(i))));
            }
            int i2 = -1;
            boolean z2 = true;
            if (this.f15117b != null) {
                float i3 = C1357a0.m37541i(this.f15116a);
                float min = (f4 < i3 ? f4 / i3 : 1.0f) * Math.min(1.0f, (f4 * 2.0f) / Math.max(this.f15117b.getWidth(), this.f15117b.getHeight()));
                if (min == 1.0f) {
                    z2 = false;
                }
                if (z2) {
                    i2 = C1399s0.m37199V(canvas);
                    canvas.scale(min, min, f, f2);
                }
                this.f15117b.m22891z(canvas, (int) (f - (gVar.getWidth() / 2)), (int) (f2 - (this.f15117b.getHeight() / 2)), null, f3);
                if (z2) {
                    C1399s0.m37201T(canvas, i2);
                }
            } else if (this.f15118c != null) {
                float i4 = C1357a0.m37541i(this.f15116a);
                float min2 = (f4 < i4 ? f4 / i4 : 1.0f) * Math.min(1.0f, (f4 * 2.0f) / Math.max(this.f15118c.getMinimumWidth(), this.f15118c.getMinimumHeight()));
                if (min2 == 1.0f) {
                    z2 = false;
                }
                if (z2) {
                    i2 = C1399s0.m37199V(canvas);
                    canvas.scale(min2, min2, f, f2);
                }
                C1362c.m37487b(canvas, this.f15118c, f - (drawable.getMinimumWidth() / 2.0f), f2 - (this.f15118c.getMinimumHeight() / 2.0f), C1411z.m36997c(R.id.theme_color_avatar_content, f3));
                if (z2) {
                    C1399s0.m37201T(canvas, i2);
                }
            }
        }
    }

    public int m27211e() {
        return C11524j.m228N(this.f15119d.f15120a);
    }

    public int m27210f() {
        return C1357a0.m37541i(this.f15116a);
    }
}
