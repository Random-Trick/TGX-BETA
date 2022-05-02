package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import org.thunderdog.challegram.R;
import p139jb.AbstractC5911c;
import p364zd.C11524j;

public class C6989o4 extends View implements AbstractC5911c {
    public Drawable f22152M;
    public Drawable f22153a;
    public Drawable f22154b;
    public Drawable f22155c;

    public C6989o4(Context context) {
        super(context);
        m18156b();
    }

    public static void m18157a(Canvas canvas, RectF rectF, Drawable drawable, Paint paint) {
        C1362c.m37487b(canvas, drawable, rectF.centerX() - (drawable.getMinimumWidth() / 2), rectF.centerY() - (drawable.getMinimumHeight() / 2), paint);
    }

    @Override
    public void mo4501a3() {
        if (this.f22153a != null) {
            this.f22153a = null;
            this.f22155c = null;
            this.f22152M = null;
            this.f22154b = null;
        }
    }

    public final void m18156b() {
        if (this.f22153a == null) {
            this.f22153a = C1362c.m37482g(getResources(), R.drawable.baseline_star_24);
            this.f22155c = C1362c.m37482g(getResources(), R.drawable.baseline_account_balance_wallet_24);
            this.f22152M = C1362c.m37482g(getResources(), R.drawable.baseline_location_on_24);
            this.f22154b = C1362c.m37482g(getResources(), R.drawable.baseline_favorite_20);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        m18156b();
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i = C1357a0.m37541i(36.0f);
        int i2 = C1357a0.m37541i(2.0f);
        int i3 = C1357a0.m37541i(3.0f);
        int c = C11524j.m196c();
        int i4 = C1357a0.m37541i(2.0f);
        Paint i5 = C1410y.m37035i();
        RectF a0 = C1410y.m37050a0();
        int i6 = measuredWidth - i2;
        int i7 = i4 / 2;
        a0.left = (i6 - i) + i7;
        a0.right = i6 - i7;
        int i8 = measuredHeight - i2;
        float f = (i8 - i) + i7;
        a0.top = f;
        float f2 = i8 - i7;
        a0.bottom = f2;
        float f3 = i3;
        float f4 = i4;
        canvas.drawRoundRect(a0, f3, f3, C1410y.m37053Y(c, f4));
        m18157a(canvas, a0, this.f22153a, i5);
        int i9 = measuredHeight + i2;
        a0.top = i9 + i7;
        a0.bottom = (i9 + i) - i7;
        canvas.drawRoundRect(a0, f3, f3, C1410y.m37053Y(c, f4));
        m18157a(canvas, a0, this.f22155c, i5);
        int i10 = measuredWidth + i2;
        a0.left = i10 + i7;
        a0.right = (i10 + i) - i7;
        canvas.drawRoundRect(a0, f3, f3, C1410y.m37053Y(c, f4));
        m18157a(canvas, a0, this.f22152M, i5);
        a0.top = f;
        a0.bottom = f2;
        canvas.drawRoundRect(a0, f3, f3, C1410y.m37053Y(c, f4));
        m18157a(canvas, a0, this.f22154b, i5);
    }
}
