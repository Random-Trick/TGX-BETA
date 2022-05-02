package p194nd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import be.C1359b;
import be.C1410y;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class C7462l1 {
    public int f23771a;
    public int f23772b;
    public int f23773c;
    public int f23774d;
    public int f23775e;
    public int f23776f;
    public int f23777g;
    public int f23778h;
    public int f23779i;
    public int f23780j;
    public int f23781k;
    public int f23782l;
    public int f23783m;
    public int f23784n = R.id.theme_color_filling;
    public Path f23785o;
    public int f23786p;
    public int f23787q;
    public int f23788r;
    public int f23789s;
    public int f23790t;
    public int f23791u;
    public int f23792v;
    public int f23793w;

    public C7462l1() {
    }

    public int m15999a() {
        return (this.f23771a + this.f23773c) / 2;
    }

    public int m15998b() {
        return (this.f23772b + this.f23774d) / 2;
    }

    public void m15997c(Canvas canvas) {
        if (!m15993g()) {
            int i = this.f23771a + this.f23775e;
            int i2 = this.f23772b + this.f23776f;
            int i3 = this.f23773c - this.f23777g;
            int i4 = this.f23774d - this.f23778h;
            Paint g = C1410y.m37039g(C11524j.m228N(this.f23784n));
            int i5 = this.f23779i;
            if (i5 != this.f23780j || i5 != this.f23781k || i5 != this.f23782l) {
                m15992h(i, i2, i3, i4);
                canvas.drawPath(this.f23785o, g);
            } else if (i5 == 0) {
                canvas.drawRect(i, i2, i3, i4, g);
            } else {
                RectF a0 = C1410y.m37050a0();
                a0.set(i, i2, i3, i4);
                int i6 = this.f23779i;
                canvas.drawRoundRect(a0, i6, i6, g);
            }
        }
    }

    public int m15996d() {
        int i = this.f23782l;
        if (i == this.f23781k && i == this.f23779i && i == this.f23780j) {
            return i;
        }
        return 0;
    }

    public int m15995e() {
        return (this.f23774d - this.f23778h) - (this.f23772b + this.f23776f);
    }

    public boolean m15994f() {
        return (this.f23783m & 1) != 0;
    }

    public boolean m15993g() {
        return (this.f23783m & 2) != 0;
    }

    public final void m15992h(int i, int i2, int i3, int i4) {
        Path path = this.f23785o;
        if (path == null || this.f23786p != i || this.f23787q != i2 || this.f23788r != i3 || this.f23789s != i4 || this.f23790t != this.f23779i || this.f23791u != this.f23780j || this.f23792v != this.f23781k || this.f23793w != this.f23782l) {
            this.f23786p = i;
            this.f23787q = i2;
            this.f23788r = i3;
            this.f23789s = i4;
            this.f23790t = this.f23779i;
            this.f23791u = this.f23780j;
            this.f23792v = this.f23781k;
            this.f23793w = this.f23782l;
            if (path == null) {
                this.f23785o = new Path();
            } else {
                path.reset();
            }
            RectF a0 = C1410y.m37050a0();
            a0.set(i, i2, i3, i4);
            C1359b.m37518a(this.f23785o, a0, this.f23779i, this.f23780j, this.f23781k, this.f23782l);
        }
    }

    public void m15991i(int i, int i2, int i3, int i4) {
        this.f23771a = i;
        this.f23772b = i2;
        this.f23773c = i3;
        this.f23774d = i4;
    }

    public void m15990j(int i) {
        this.f23782l = i;
    }

    public void m15989k(int i) {
        this.f23781k = i;
    }

    public void m15988l(int i, int i2, int i3, int i4) {
        this.f23775e = i;
        this.f23776f = i2;
        this.f23777g = i3;
        this.f23778h = i4;
    }

    public void m15987m(int i) {
        this.f23784n = i;
    }

    public void m15986n() {
        this.f23783m |= 1;
    }

    public void m15985o() {
        this.f23783m |= 2;
    }

    public void m15984p(int i) {
        m15983q(i, i, i, i);
    }

    public void m15983q(int i, int i2, int i3, int i4) {
        if (this.f23779i != i || this.f23780j != i2 || this.f23781k != i3 || this.f23782l != i4) {
            this.f23779i = i;
            this.f23780j = i2;
            this.f23781k = i3;
            this.f23782l = i4;
        }
    }

    public void m15982r(int i) {
        this.f23779i = i;
    }

    public void m15981s(int i) {
        this.f23780j = i;
    }

    public int m15980t() {
        return (this.f23773c - this.f23777g) - (this.f23771a + this.f23775e);
    }

    public C7462l1(int i, int i2, int i3, int i4) {
        this.f23771a = i;
        this.f23772b = i2;
        this.f23773c = i3;
        this.f23774d = i4;
    }
}
