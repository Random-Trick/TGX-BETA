package ne;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import ce.a0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import gd.w;
import ib.d;
import je.a;
import je.j;

public class e1 implements k.b {
    public final View M;
    public float N;
    public final Path f17963a;
    public final f f17964b = new f(0, this, b.f7287b, 180);
    public je.a f17965c;

    public class a implements je.k {
        public a() {
        }

        @Override
        public int R() {
            return j.d(this);
        }

        @Override
        public long W0(boolean z10) {
            return j.c(this, z10);
        }

        @Override
        public int a1() {
            return j.f(this);
        }

        @Override
        public int c() {
            return d.d(-16777216, 2130706432, e1.this.f17965c.i());
        }

        @Override
        public int d(boolean z10) {
            return j.b(this, z10);
        }

        @Override
        public int g(boolean z10) {
            return j.h(this, z10);
        }

        @Override
        public int o0(boolean z10) {
            return j.e(this, z10);
        }

        @Override
        public int r0(boolean z10) {
            return d.d(-1, Integer.MAX_VALUE, e1.this.f17965c.i());
        }

        @Override
        public int t0(boolean z10) {
            return j.g(this, z10);
        }
    }

    public e1(View view) {
        this.M = view;
        Path path = new Path();
        this.f17963a = path;
        int i10 = a0.i(10.0f);
        int i11 = a0.i(5.0f);
        path.setFillType(Path.FillType.EVEN_ODD);
        float f10 = (-i10) / 2.0f;
        float f11 = -i11;
        path.moveTo(f10, f11 / 2.0f);
        path.rLineTo(i10, 0.0f);
        path.rLineTo(f10, i11);
        path.rLineTo(f10, f11);
        path.close();
    }

    public final void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        float f10 = i11;
        canvas.translate(i10, f10);
        float f11 = this.N * 180.0f;
        if (f11 != 0.0f) {
            canvas.rotate(f11);
        }
        canvas.drawPath(this.f17963a, y.g(i12));
        canvas.restore();
        if (this.f17965c != null && this.N < 1.0f) {
            boolean G2 = w.G2();
            int i13 = a0.i(24.0f);
            int i14 = G2 ? 1 : -1;
            canvas.save();
            float f12 = i10 + (i13 * i14);
            canvas.scale(0.85f, 0.85f, f12, f10);
            this.f17965c.e(canvas, f12, f10, G2 ? 3 : 5, 1.0f - this.N);
            canvas.restore();
        }
    }

    public void c(boolean z10, boolean z11) {
        this.f17964b.p(z10, z11);
    }

    public void d(int i10, boolean z10, boolean z11) {
        if (i10 > 0 || this.f17965c != null) {
            if (this.f17965c == null) {
                this.f17965c = new a.b().c(this.M).e(new a()).b();
            }
            this.f17965c.v(i10, z10, z11);
        }
    }

    public boolean e() {
        boolean z10 = !this.f17964b.h();
        c(z10, true);
        return z10;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.N != f10) {
            this.N = f10;
            this.M.invalidate();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }
}
