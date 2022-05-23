package ne;

import ae.h;
import ae.j;
import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.o;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import eb.l;
import gb.c;
import gd.w;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class m4 extends View implements c.a, kb.c, ae.a {
    public final RectF M = new RectF();
    public final c N = new c(this);
    public final f O;
    public final f P;
    public a f18258a;
    public boolean f18259b;
    public final Paint f18260c;

    public interface a {
        void a(float f10);

        void b(boolean z10);

        void c(float f10);
    }

    public m4(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(5);
        this.f18260c = textPaint;
        k.b j4Var = new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                m4.this.i(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        };
        DecelerateInterpolator decelerateInterpolator = b.f7287b;
        this.O = new f(0, j4Var, decelerateInterpolator, 180L);
        f fVar = new f(1, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                m4.this.j(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.P = fVar;
        textPaint.setColor(j.P0());
        textPaint.setTypeface(o.k());
        textPaint.setTextSize(a0.C(14.0f));
        fVar.p(true, false);
        z.u().d(this);
        setWillNotDraw(false);
    }

    public void i(int i10, float f10, float f11, k kVar) {
        a aVar = this.f18258a;
        if (aVar != null) {
            if (this.f18259b) {
                f10 = 1.0f - f10;
            }
            aVar.a(f10);
        }
        invalidate();
    }

    public void j(int i10, float f10, float f11, k kVar) {
        a aVar = this.f18258a;
        if (aVar != null) {
            aVar.c(f10);
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return gb.b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (this.M.contains(f10, f11)) {
            this.O.r(true);
            a aVar = this.f18258a;
            if (aVar != null) {
                aVar.b(h());
            }
        }
    }

    @Override
    public boolean E4() {
        return gb.b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    @Override
    public void Q2() {
        z.u().R(this);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return gb.b.c(this, f10, f11);
    }

    @Override
    public void a(o6 o6Var, h hVar, int i10) {
        k(hVar != null && hVar.a0(), true);
    }

    @Override
    public void c(o6 o6Var, int i10) {
    }

    public final void e(Canvas canvas, int i10, int i11, RectF rectF, String str, f fVar) {
        float measureText = this.f18260c.measureText(str);
        float l10 = i3.l() * 0.75f;
        float f10 = (measureText / 2.0f) - l10;
        int i12 = (((i10 - (((int) l10) / 2)) - a0.i(8.0f)) + ((int) (a0.i(2.0f) * 0.75f))) - ((int) f10);
        int i13 = i11 - ((int) (a0.i(2.0f) * 0.75f));
        float f11 = i13;
        rectF.top = f11 - l10;
        rectF.bottom = f11 + l10;
        float f12 = i12;
        rectF.left = f12 - l10;
        float f13 = i10;
        rectF.right = ((measureText + f13) + ((int) (l10 / 1.5d))) - f10;
        canvas.drawRoundRect(rectF, a0.i(16.0f), a0.i(16.0f), y.g(j.L(R.id.theme_color_previewBackground)));
        canvas.drawText(str, f13 - f10, a0.C(4.0f) + i11, this.f18260c);
        canvas.save();
        canvas.scale(0.75f, 0.75f, f12, i11);
        canvas.drawCircle(f12, f11, l10 / 2.0f, y.Y(j.L(R.id.theme_color_text), a0.i(2.0f)));
        i3.b(canvas, i12, i13, fVar.g(), null);
        canvas.restore();
    }

    public void f(h hVar, a aVar) {
        this.O.p(hVar != null && hVar.L(), false);
        this.f18259b = this.O.h();
        this.f18258a = aVar;
    }

    public void g(TdApi.Background background, a aVar) {
        this.O.p(((TdApi.BackgroundTypeWallpaper) background.type).isBlurred, false);
        this.f18259b = this.O.h();
        this.f18258a = aVar;
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    public boolean h() {
        return this.O.h();
    }

    public void k(boolean z10, boolean z11) {
        this.P.p(z10, z11);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.M.contains(f10, f11);
    }

    @Override
    public void o(View view, float f10, float f11) {
        gb.b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void onDraw(Canvas canvas) {
        e(canvas, getWidth() / 2, getHeight() / 2, this.M, w.i1(R.string.ChatBackgroundBlur), this.O);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return gb.b.k(this, view, f10, f11);
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
