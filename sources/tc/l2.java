package tc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.c;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import ne.m2;
import org.thunderdog.challegram.R;

public class l2 extends View implements k.b {
    public final f M;
    public final m2 N;
    public final f f23250b;
    public final f f23251c;
    public long f23249a = SystemClock.uptimeMillis();
    public final Drawable O = c.g(getResources(), R.drawable.baseline_location_on_24);
    public final Drawable P = c.g(getResources(), R.drawable.deproko_baseline_send_24);

    public l2(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = b.f7287b;
        this.f23250b = new f(0, this, decelerateInterpolator, 180L);
        this.f23251c = new f(1, this, decelerateInterpolator, 180L);
        this.M = new f(2, this, decelerateInterpolator, 180L);
        m2 F = m2.F(this, 5.0f, a0.i(20.0f), a0.i(8.0f), a0.i(40.0f), a0.i(40.0f));
        this.N = F;
        F.o(1.0f);
    }

    public final boolean a() {
        if (this.f23249a == 0) {
            return true;
        }
        if (SystemClock.uptimeMillis() - this.f23249a < 100) {
            return false;
        }
        this.f23249a = 0L;
        return true;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        this.N.o(1.0f - Math.max(this.f23250b.g(), Math.max(this.f23251c.g(), this.M.g())));
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
        float paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        float g10 = this.f23250b.g();
        float g11 = this.f23251c.g();
        float g12 = this.M.g();
        float max = Math.max(g10, g11);
        canvas.drawCircle(paddingLeft, paddingTop, a0.i(20.0f), y.g(j.L(R.id.theme_color_file)));
        this.N.c(canvas);
        if (max > 0.0f && g12 < 1.0f) {
            Paint W = y.W(-1);
            W.setAlpha((int) (max * 255.0f * (1.0f - g12)));
            c.b(canvas, this.O, paddingLeft - (drawable.getMinimumWidth() / 2), paddingTop - (this.O.getMinimumHeight() / 2), W);
            W.setAlpha(255);
        }
        if (g12 > 0.0f) {
            Paint W2 = y.W(-1);
            W2.setAlpha((int) (g12 * 255.0f));
            canvas.save();
            canvas.scale(0.7f, 0.7f, paddingLeft, paddingTop);
            c.b(canvas, this.P, (paddingLeft + a0.i(2.0f)) - (this.P.getMinimumWidth() / 2), paddingTop - (this.P.getMinimumHeight() / 2), W2);
            canvas.restore();
            W2.setAlpha(255);
        }
    }

    public void setIsCustom(boolean z10) {
        this.f23251c.p(z10, a());
    }

    public void setIsPlace(boolean z10) {
        this.M.p(z10, true);
    }

    public void setShowProgress(boolean z10) {
        this.f23250b.p(!z10, a());
    }
}
