package me;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import ie.AbstractC5408k;
import ie.C5375a;
import ie.C5406j;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;

public class C6866e1 implements C3950k.AbstractC3952b {
    public final View f21586M;
    public float f21587N;
    public final Path f21588a;
    public final C3940f f21589b = new C3940f(0, this, C2057b.f7280b, 180);
    public C5375a f21590c;

    public class C6867a implements AbstractC5408k {
        public C6867a() {
        }

        @Override
        public int mo7858Q() {
            return C5406j.m22808d(this);
        }

        @Override
        public long mo7857X0(boolean z) {
            return C5406j.m22809c(this, z);
        }

        @Override
        public int mo7856b1() {
            return C5406j.m22806f(this);
        }

        @Override
        public int mo7855c() {
            return C5064d.m24129d(-16777216, 2130706432, C6866e1.this.f21590c.m23037i());
        }

        @Override
        public int mo7854e(boolean z) {
            return C5406j.m22810b(this, z);
        }

        @Override
        public int mo7853g(boolean z) {
            return C5406j.m22804h(this, z);
        }

        @Override
        public int mo7852o0(boolean z) {
            return C5406j.m22807e(this, z);
        }

        @Override
        public int mo7851p0(boolean z) {
            return C5064d.m24129d(-1, Integer.MAX_VALUE, C6866e1.this.f21590c.m23037i());
        }

        @Override
        public int mo7850r0(boolean z) {
            return C5406j.m22805g(this, z);
        }
    }

    public C6866e1(View view) {
        this.f21586M = view;
        Path path = new Path();
        this.f21588a = path;
        int i = C1357a0.m37544i(10.0f);
        int i2 = C1357a0.m37544i(5.0f);
        path.setFillType(Path.FillType.EVEN_ODD);
        float f = (-i) / 2.0f;
        float f2 = -i2;
        path.moveTo(f, f2 / 2.0f);
        path.rLineTo(i, 0.0f);
        path.rLineTo(f, i2);
        path.rLineTo(f, f2);
        path.close();
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f21587N != f) {
            this.f21587N = f;
            this.f21586M.invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m18731b(Canvas canvas, int i, int i2, int i3) {
        canvas.save();
        float f = i2;
        canvas.translate(i, f);
        float f2 = this.f21587N * 180.0f;
        if (f2 != 0.0f) {
            canvas.rotate(f2);
        }
        canvas.drawPath(this.f21588a, C1410y.m37042g(i3));
        canvas.restore();
        if (this.f21590c != null && this.f21587N < 1.0f) {
            boolean G2 = C4403w.m27986G2();
            int i4 = C1357a0.m37544i(24.0f);
            int i5 = G2 ? 1 : -1;
            canvas.save();
            float f3 = i + (i4 * i5);
            canvas.scale(0.85f, 0.85f, f3, f);
            this.f21590c.m23040d(canvas, f3, f, G2 ? 3 : 5, 1.0f - this.f21587N);
            canvas.restore();
        }
    }

    public void m18730c(boolean z, boolean z2) {
        this.f21589b.m29577p(z, z2);
    }

    public void m18729d(int i, boolean z, boolean z2) {
        if (i > 0 || this.f21590c != null) {
            if (this.f21590c == null) {
                this.f21590c = new C5375a.C5377b().m23021c(this.f21586M).m23019e(new C6867a()).m23022b();
            }
            this.f21590c.m23027u(i, z, z2);
        }
    }

    public boolean m18728e() {
        boolean z = !this.f21589b.m29585h();
        m18730c(z, true);
        return z;
    }
}
