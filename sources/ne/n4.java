package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ce.a0;
import ce.y;
import kb.c;
import org.thunderdog.challegram.R;

public class n4 extends View implements c {
    public Drawable M;
    public Drawable f18275a;
    public Drawable f18276b;
    public Drawable f18277c;

    public n4(Context context) {
        super(context);
        b();
    }

    public static void a(Canvas canvas, RectF rectF, Drawable drawable, Paint paint) {
        ce.c.b(canvas, drawable, rectF.centerX() - (drawable.getMinimumWidth() / 2), rectF.centerY() - (drawable.getMinimumHeight() / 2), paint);
    }

    @Override
    public void Q2() {
        if (this.f18275a != null) {
            this.f18275a = null;
            this.f18277c = null;
            this.M = null;
            this.f18276b = null;
        }
    }

    public final void b() {
        if (this.f18275a == null) {
            this.f18275a = ce.c.g(getResources(), R.drawable.baseline_star_24);
            this.f18277c = ce.c.g(getResources(), R.drawable.baseline_account_balance_wallet_24);
            this.M = ce.c.g(getResources(), R.drawable.baseline_location_on_24);
            this.f18276b = ce.c.g(getResources(), R.drawable.baseline_favorite_20);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        b();
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i10 = a0.i(36.0f);
        int i11 = a0.i(2.0f);
        int i12 = a0.i(3.0f);
        int c10 = j.c();
        int i13 = a0.i(2.0f);
        Paint i14 = y.i();
        RectF a02 = y.a0();
        int i15 = measuredWidth - i11;
        int i16 = i13 / 2;
        a02.left = (i15 - i10) + i16;
        a02.right = i15 - i16;
        int i17 = measuredHeight - i11;
        float f10 = (i17 - i10) + i16;
        a02.top = f10;
        float f11 = i17 - i16;
        a02.bottom = f11;
        float f12 = i12;
        float f13 = i13;
        canvas.drawRoundRect(a02, f12, f12, y.Y(c10, f13));
        a(canvas, a02, this.f18275a, i14);
        int i18 = measuredHeight + i11;
        a02.top = i18 + i16;
        a02.bottom = (i18 + i10) - i16;
        canvas.drawRoundRect(a02, f12, f12, y.Y(c10, f13));
        a(canvas, a02, this.f18277c, i14);
        int i19 = measuredWidth + i11;
        a02.left = i19 + i16;
        a02.right = (i19 + i10) - i16;
        canvas.drawRoundRect(a02, f12, f12, y.Y(c10, f13));
        a(canvas, a02, this.M, i14);
        a02.top = f10;
        a02.bottom = f11;
        canvas.drawRoundRect(a02, f12, f12, y.Y(c10, f13));
        a(canvas, a02, this.f18276b, i14);
    }
}
