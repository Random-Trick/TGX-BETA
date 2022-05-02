package sc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import me.RunnableC6969m2;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p364zd.C11524j;

public class C8799l2 extends View implements C3950k.AbstractC3952b {
    public final C3940f f28409M;
    public final RunnableC6969m2 f28410N;
    public final C3940f f28414b;
    public final C3940f f28415c;
    public long f28413a = SystemClock.uptimeMillis();
    public final Drawable f28411O = C1362c.m37482g(getResources(), R.drawable.baseline_location_on_24);
    public final Drawable f28412P = C1362c.m37482g(getResources(), R.drawable.deproko_baseline_send_24);

    public C8799l2(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f28414b = new C3940f(0, this, decelerateInterpolator, 180L);
        this.f28415c = new C3940f(1, this, decelerateInterpolator, 180L);
        this.f28409M = new C3940f(2, this, decelerateInterpolator, 180L);
        RunnableC6969m2 F = RunnableC6969m2.m18290F(this, 5.0f, C1357a0.m37541i(20.0f), C1357a0.m37541i(8.0f), C1357a0.m37541i(40.0f), C1357a0.m37541i(40.0f));
        this.f28410N = F;
        F.m18275o(1.0f);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        this.f28410N.m18275o(1.0f - Math.max(this.f28414b.m29584g(), Math.max(this.f28415c.m29584g(), this.f28409M.m29584g())));
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final boolean m11336a() {
        if (this.f28413a == 0) {
            return true;
        }
        if (SystemClock.uptimeMillis() - this.f28413a < 100) {
            return false;
        }
        this.f28413a = 0L;
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
        float paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        float g = this.f28414b.m29584g();
        float g2 = this.f28415c.m29584g();
        float g3 = this.f28409M.m29584g();
        float max = Math.max(g, g2);
        canvas.drawCircle(paddingLeft, paddingTop, C1357a0.m37541i(20.0f), C1410y.m37039g(C11524j.m228N(R.id.theme_color_file)));
        this.f28410N.m18287c(canvas);
        if (max > 0.0f && g3 < 1.0f) {
            Paint W = C1410y.m37055W(-1);
            W.setAlpha((int) (max * 255.0f * (1.0f - g3)));
            C1362c.m37487b(canvas, this.f28411O, paddingLeft - (drawable.getMinimumWidth() / 2), paddingTop - (this.f28411O.getMinimumHeight() / 2), W);
            W.setAlpha(255);
        }
        if (g3 > 0.0f) {
            Paint W2 = C1410y.m37055W(-1);
            W2.setAlpha((int) (g3 * 255.0f));
            canvas.save();
            canvas.scale(0.7f, 0.7f, paddingLeft, paddingTop);
            C1362c.m37487b(canvas, this.f28412P, (paddingLeft + C1357a0.m37541i(2.0f)) - (this.f28412P.getMinimumWidth() / 2), paddingTop - (this.f28412P.getMinimumHeight() / 2), W2);
            canvas.restore();
            W2.setAlpha(255);
        }
    }

    public void setIsCustom(boolean z) {
        this.f28415c.m29575p(z, m11336a());
    }

    public void setIsPlace(boolean z) {
        this.f28409M.m29575p(z, true);
    }

    public void setShowProgress(boolean z) {
        this.f28414b.m29575p(!z, m11336a());
    }
}
