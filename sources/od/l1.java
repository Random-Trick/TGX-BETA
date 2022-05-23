package od;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ce.b;
import ce.y;
import org.thunderdog.challegram.R;

public class l1 {
    public int f19715a;
    public int f19716b;
    public int f19717c;
    public int f19718d;
    public int f19719e;
    public int f19720f;
    public int f19721g;
    public int f19722h;
    public int f19723i;
    public int f19724j;
    public int f19725k;
    public int f19726l;
    public int f19727m;
    public int f19728n = R.id.theme_color_filling;
    public Path f19729o;
    public int f19730p;
    public int f19731q;
    public int f19732r;
    public int f19733s;
    public int f19734t;
    public int f19735u;
    public int f19736v;
    public int f19737w;

    public l1() {
    }

    public int a() {
        return (this.f19715a + this.f19717c) / 2;
    }

    public int b() {
        return (this.f19716b + this.f19718d) / 2;
    }

    public void c(Canvas canvas) {
        if (!g()) {
            int i10 = this.f19715a + this.f19719e;
            int i11 = this.f19716b + this.f19720f;
            int i12 = this.f19717c - this.f19721g;
            int i13 = this.f19718d - this.f19722h;
            Paint g10 = y.g(j.L(this.f19728n));
            int i14 = this.f19723i;
            if (i14 != this.f19724j || i14 != this.f19725k || i14 != this.f19726l) {
                h(i10, i11, i12, i13);
                canvas.drawPath(this.f19729o, g10);
            } else if (i14 == 0) {
                canvas.drawRect(i10, i11, i12, i13, g10);
            } else {
                RectF a02 = y.a0();
                a02.set(i10, i11, i12, i13);
                int i15 = this.f19723i;
                canvas.drawRoundRect(a02, i15, i15, g10);
            }
        }
    }

    public int d() {
        int i10 = this.f19726l;
        if (i10 == this.f19725k && i10 == this.f19723i && i10 == this.f19724j) {
            return i10;
        }
        return 0;
    }

    public int e() {
        return (this.f19718d - this.f19722h) - (this.f19716b + this.f19720f);
    }

    public boolean f() {
        return (this.f19727m & 1) != 0;
    }

    public boolean g() {
        return (this.f19727m & 2) != 0;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        Path path = this.f19729o;
        if (path == null || this.f19730p != i10 || this.f19731q != i11 || this.f19732r != i12 || this.f19733s != i13 || this.f19734t != this.f19723i || this.f19735u != this.f19724j || this.f19736v != this.f19725k || this.f19737w != this.f19726l) {
            this.f19730p = i10;
            this.f19731q = i11;
            this.f19732r = i12;
            this.f19733s = i13;
            this.f19734t = this.f19723i;
            this.f19735u = this.f19724j;
            this.f19736v = this.f19725k;
            this.f19737w = this.f19726l;
            if (path == null) {
                this.f19729o = new Path();
            } else {
                path.reset();
            }
            RectF a02 = y.a0();
            a02.set(i10, i11, i12, i13);
            b.a(this.f19729o, a02, this.f19723i, this.f19724j, this.f19725k, this.f19726l);
        }
    }

    public void i(int i10, int i11, int i12, int i13) {
        this.f19715a = i10;
        this.f19716b = i11;
        this.f19717c = i12;
        this.f19718d = i13;
    }

    public void j(int i10) {
        this.f19726l = i10;
    }

    public void k(int i10) {
        this.f19725k = i10;
    }

    public void l(int i10, int i11, int i12, int i13) {
        this.f19719e = i10;
        this.f19720f = i11;
        this.f19721g = i12;
        this.f19722h = i13;
    }

    public void m(int i10) {
        this.f19728n = i10;
    }

    public void n() {
        this.f19727m |= 1;
    }

    public void o() {
        this.f19727m |= 2;
    }

    public void p(int i10) {
        q(i10, i10, i10, i10);
    }

    public void q(int i10, int i11, int i12, int i13) {
        if (this.f19723i != i10 || this.f19724j != i11 || this.f19725k != i12 || this.f19726l != i13) {
            this.f19723i = i10;
            this.f19724j = i11;
            this.f19725k = i12;
            this.f19726l = i13;
        }
    }

    public void r(int i10) {
        this.f19723i = i10;
    }

    public void s(int i10) {
        this.f19724j = i10;
    }

    public int t() {
        return (this.f19717c - this.f19721g) - (this.f19715a + this.f19719e);
    }

    public l1(int i10, int i11, int i12, int i13) {
        this.f19715a = i10;
        this.f19716b = i11;
        this.f19717c = i12;
        this.f19718d = i13;
    }
}
