package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1389o;
import be.C1410y;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p139jb.AbstractC5911c;
import p350yd.C10930q6;
import p364zd.AbstractC11508a;
import p364zd.C11520h;
import p364zd.C11524j;
import p364zd.C11541z;

public class C6979n4 extends View implements C4336c.AbstractC4337a, AbstractC5911c, AbstractC11508a {
    public final RectF f22101M = new RectF();
    public final C4336c f22102N = new C4336c(this);
    public final C3940f f22103O;
    public final C3940f f22104P;
    public AbstractC6980a f22105a;
    public boolean f22106b;
    public final Paint f22107c;

    public interface AbstractC6980a {
        void mo18212a(float f);

        void mo18211b(boolean z);

        void mo18210c(float f);
    }

    public C6979n4(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(5);
        this.f22107c = textPaint;
        C3950k.AbstractC3952b k4Var = new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6979n4.this.m18215h(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        };
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f22103O = new C3940f(0, k4Var, decelerateInterpolator, 180L);
        C3940f fVar = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6979n4.this.m18214i(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.f22104P = fVar;
        textPaint.setColor(C11524j.m217S0());
        textPaint.setTypeface(C1389o.m37258k());
        textPaint.setTextSize(C1357a0.m37552C(14.0f));
        fVar.m29575p(true, false);
        C11541z.m7t().m26d(this);
        setWillNotDraw(false);
    }

    public void m18215h(int i, float f, float f2, C3950k kVar) {
        AbstractC6980a aVar = this.f22105a;
        if (aVar != null) {
            if (this.f22106b) {
                f = 1.0f - f;
            }
            aVar.mo18212a(f);
        }
        invalidate();
    }

    public void m18214i(int i, float f, float f2, C3950k kVar) {
        AbstractC6980a aVar = this.f22105a;
        if (aVar != null) {
            aVar.mo18210c(f);
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28258d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (this.f22101M.contains(f, f2)) {
            this.f22103O.m29573r(true);
            AbstractC6980a aVar = this.f22105a;
            if (aVar != null) {
                aVar.mo18211b(m18216g());
            }
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    @Override
    public void mo4501a3() {
        C11541z.m7t().m44Q(this);
    }

    @Override
    public void mo378b(C10930q6 q6Var, int i) {
    }

    public final void m18219d(Canvas canvas, int i, int i2, RectF rectF, String str, C3940f fVar) {
        float measureText = this.f22107c.measureText(str);
        float l = C6918i3.m18456l() * 0.75f;
        float f = (measureText / 2.0f) - l;
        int i3 = (((i - (((int) l) / 2)) - C1357a0.m37541i(8.0f)) + ((int) (C1357a0.m37541i(2.0f) * 0.75f))) - ((int) f);
        int i4 = i2 - ((int) (C1357a0.m37541i(2.0f) * 0.75f));
        float f2 = i4;
        rectF.top = f2 - l;
        rectF.bottom = f2 + l;
        float f3 = i3;
        rectF.left = f3 - l;
        float f4 = i;
        rectF.right = ((measureText + f4) + ((int) (l / 1.5d))) - f;
        canvas.drawRoundRect(rectF, C1357a0.m37541i(16.0f), C1357a0.m37541i(16.0f), C1410y.m37039g(C11524j.m228N(R.id.theme_color_previewBackground)));
        canvas.drawText(str, f4 - f, C1357a0.m37552C(4.0f) + i2, this.f22107c);
        canvas.save();
        canvas.scale(0.75f, 0.75f, f3, i2);
        canvas.drawCircle(f3, f2, l / 2.0f, C1410y.m37053Y(C11524j.m228N(R.id.theme_color_text), C1357a0.m37541i(2.0f)));
        C6918i3.m18466b(canvas, i3, i4, fVar.m29584g(), null);
        canvas.restore();
    }

    public void m18218e(TdApi.Background background, AbstractC6980a aVar) {
        this.f22103O.m29575p(((TdApi.BackgroundTypeWallpaper) background.type).isBlurred, false);
        this.f22106b = this.f22103O.m29583h();
        this.f22105a = aVar;
    }

    public void m18217f(C11520h hVar, AbstractC6980a aVar) {
        this.f22103O.m29575p(hVar != null && hVar.m325L(), false);
        this.f22106b = this.f22103O.m29583h();
        this.f22105a = aVar;
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public boolean m18216g() {
        return this.f22103O.m29583h();
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public void m18213j(boolean z, boolean z2) {
        this.f22104P.m29575p(z, z2);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f22101M.contains(f, f2);
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        m18219d(canvas, getWidth() / 2, getHeight() / 2, this.f22101M, C4403w.m27869i1(R.string.ChatBackgroundBlur), this.f22103O);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22102N.m28246e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    @Override
    public void mo377q(C10930q6 q6Var, C11520h hVar, int i) {
        m18213j(hVar != null && hVar.m309a0(), true);
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28251k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
