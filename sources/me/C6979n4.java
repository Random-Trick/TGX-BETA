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
    public final RectF f22104M = new RectF();
    public final C4336c f22105N = new C4336c(this);
    public final C3940f f22106O;
    public final C3940f f22107P;
    public AbstractC6980a f22108a;
    public boolean f22109b;
    public final Paint f22110c;

    public interface AbstractC6980a {
        void mo18212a(float f);

        void mo18211b(boolean z);

        void mo18210c(float f);
    }

    public C6979n4(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(5);
        this.f22110c = textPaint;
        C3950k.AbstractC3952b k4Var = new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6979n4.this.m18215h(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29528a(this, i, f, kVar);
            }
        };
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f22106O = new C3940f(0, k4Var, decelerateInterpolator, 180L);
        C3940f fVar = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6979n4.this.m18214i(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29528a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.f22107P = fVar;
        textPaint.setColor(C11524j.m217S0());
        textPaint.setTypeface(C1389o.m37261k());
        textPaint.setTextSize(C1357a0.m37555C(14.0f));
        fVar.m29577p(true, false);
        C11541z.m7t().m26d(this);
        setWillNotDraw(false);
    }

    public void m18215h(int i, float f, float f2, C3950k kVar) {
        AbstractC6980a aVar = this.f22108a;
        if (aVar != null) {
            if (this.f22109b) {
                f = 1.0f - f;
            }
            aVar.mo18212a(f);
        }
        invalidate();
    }

    public void m18214i(int i, float f, float f2, C3950k kVar) {
        AbstractC6980a aVar = this.f22108a;
        if (aVar != null) {
            aVar.mo18210c(f);
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (this.f22104M.contains(f, f2)) {
            this.f22106O.m29575r(true);
            AbstractC6980a aVar = this.f22108a;
            if (aVar != null) {
                aVar.mo18211b(m18216g());
            }
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    @Override
    public void mo4501a3() {
        C11541z.m7t().m44Q(this);
    }

    @Override
    public void mo378b(C10930q6 q6Var, int i) {
    }

    public final void m18219d(Canvas canvas, int i, int i2, RectF rectF, String str, C3940f fVar) {
        float measureText = this.f22110c.measureText(str);
        float l = C6918i3.m18456l() * 0.75f;
        float f = (measureText / 2.0f) - l;
        int i3 = (((i - (((int) l) / 2)) - C1357a0.m37544i(8.0f)) + ((int) (C1357a0.m37544i(2.0f) * 0.75f))) - ((int) f);
        int i4 = i2 - ((int) (C1357a0.m37544i(2.0f) * 0.75f));
        float f2 = i4;
        rectF.top = f2 - l;
        rectF.bottom = f2 + l;
        float f3 = i3;
        rectF.left = f3 - l;
        float f4 = i;
        rectF.right = ((measureText + f4) + ((int) (l / 1.5d))) - f;
        canvas.drawRoundRect(rectF, C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1410y.m37042g(C11524j.m228N(R.id.theme_color_previewBackground)));
        canvas.drawText(str, f4 - f, C1357a0.m37555C(4.0f) + i2, this.f22110c);
        canvas.save();
        canvas.scale(0.75f, 0.75f, f3, i2);
        canvas.drawCircle(f3, f2, l / 2.0f, C1410y.m37056Y(C11524j.m228N(R.id.theme_color_text), C1357a0.m37544i(2.0f)));
        C6918i3.m18466b(canvas, i3, i4, fVar.m29586g(), null);
        canvas.restore();
    }

    public void m18218e(TdApi.Background background, AbstractC6980a aVar) {
        this.f22106O.m29577p(((TdApi.BackgroundTypeWallpaper) background.type).isBlurred, false);
        this.f22109b = this.f22106O.m29585h();
        this.f22108a = aVar;
    }

    public void m18217f(C11520h hVar, AbstractC6980a aVar) {
        this.f22106O.m29577p(hVar != null && hVar.m325L(), false);
        this.f22109b = this.f22106O.m29585h();
        this.f22108a = aVar;
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public boolean m18216g() {
        return this.f22106O.m29585h();
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public void m18213j(boolean z, boolean z2) {
        this.f22107P.m29577p(z, z2);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f22104M.contains(f, f2);
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        m18219d(canvas, getWidth() / 2, getHeight() / 2, this.f22104M, C4403w.m27871i1(R.string.ChatBackgroundBlur), this.f22106O);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22105N.m28248e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    @Override
    public void mo377q(C10930q6 q6Var, C11520h hVar, int i) {
        m18213j(hVar != null && hVar.m309a0(), true);
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
