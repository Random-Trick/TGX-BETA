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
    public int f23774a;
    public int f23775b;
    public int f23776c;
    public int f23777d;
    public int f23778e;
    public int f23779f;
    public int f23780g;
    public int f23781h;
    public int f23782i;
    public int f23783j;
    public int f23784k;
    public int f23785l;
    public int f23786m;
    public int f23787n = R.id.theme_color_filling;
    public Path f23788o;
    public int f23789p;
    public int f23790q;
    public int f23791r;
    public int f23792s;
    public int f23793t;
    public int f23794u;
    public int f23795v;
    public int f23796w;

    public C7462l1() {
    }

    public int m15999a() {
        return (this.f23774a + this.f23776c) / 2;
    }

    public int m15998b() {
        return (this.f23775b + this.f23777d) / 2;
    }

    public void m15997c(Canvas canvas) {
        if (!m15993g()) {
            int i = this.f23774a + this.f23778e;
            int i2 = this.f23775b + this.f23779f;
            int i3 = this.f23776c - this.f23780g;
            int i4 = this.f23777d - this.f23781h;
            Paint g = C1410y.m37042g(C11524j.m228N(this.f23787n));
            int i5 = this.f23782i;
            if (i5 != this.f23783j || i5 != this.f23784k || i5 != this.f23785l) {
                m15992h(i, i2, i3, i4);
                canvas.drawPath(this.f23788o, g);
            } else if (i5 == 0) {
                canvas.drawRect(i, i2, i3, i4, g);
            } else {
                RectF a0 = C1410y.m37053a0();
                a0.set(i, i2, i3, i4);
                int i6 = this.f23782i;
                canvas.drawRoundRect(a0, i6, i6, g);
            }
        }
    }

    public int m15996d() {
        int i = this.f23785l;
        if (i == this.f23784k && i == this.f23782i && i == this.f23783j) {
            return i;
        }
        return 0;
    }

    public int m15995e() {
        return (this.f23777d - this.f23781h) - (this.f23775b + this.f23779f);
    }

    public boolean m15994f() {
        return (this.f23786m & 1) != 0;
    }

    public boolean m15993g() {
        return (this.f23786m & 2) != 0;
    }

    public final void m15992h(int i, int i2, int i3, int i4) {
        Path path = this.f23788o;
        if (path == null || this.f23789p != i || this.f23790q != i2 || this.f23791r != i3 || this.f23792s != i4 || this.f23793t != this.f23782i || this.f23794u != this.f23783j || this.f23795v != this.f23784k || this.f23796w != this.f23785l) {
            this.f23789p = i;
            this.f23790q = i2;
            this.f23791r = i3;
            this.f23792s = i4;
            this.f23793t = this.f23782i;
            this.f23794u = this.f23783j;
            this.f23795v = this.f23784k;
            this.f23796w = this.f23785l;
            if (path == null) {
                this.f23788o = new Path();
            } else {
                path.reset();
            }
            RectF a0 = C1410y.m37053a0();
            a0.set(i, i2, i3, i4);
            C1359b.m37521a(this.f23788o, a0, this.f23782i, this.f23783j, this.f23784k, this.f23785l);
        }
    }

    public void m15991i(int i, int i2, int i3, int i4) {
        this.f23774a = i;
        this.f23775b = i2;
        this.f23776c = i3;
        this.f23777d = i4;
    }

    public void m15990j(int i) {
        this.f23785l = i;
    }

    public void m15989k(int i) {
        this.f23784k = i;
    }

    public void m15988l(int i, int i2, int i3, int i4) {
        this.f23778e = i;
        this.f23779f = i2;
        this.f23780g = i3;
        this.f23781h = i4;
    }

    public void m15987m(int i) {
        this.f23787n = i;
    }

    public void m15986n() {
        this.f23786m |= 1;
    }

    public void m15985o() {
        this.f23786m |= 2;
    }

    public void m15984p(int i) {
        m15983q(i, i, i, i);
    }

    public void m15983q(int i, int i2, int i3, int i4) {
        if (this.f23782i != i || this.f23783j != i2 || this.f23784k != i3 || this.f23785l != i4) {
            this.f23782i = i;
            this.f23783j = i2;
            this.f23784k = i3;
            this.f23785l = i4;
        }
    }

    public void m15982r(int i) {
        this.f23782i = i;
    }

    public void m15981s(int i) {
        this.f23783j = i;
    }

    public int m15980t() {
        return (this.f23776c - this.f23780g) - (this.f23774a + this.f23778e);
    }

    public C7462l1(int i, int i2, int i3, int i4) {
        this.f23774a = i;
        this.f23775b = i2;
        this.f23776c = i3;
        this.f23777d = i4;
    }
}
