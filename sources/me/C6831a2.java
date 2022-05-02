package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.lang.reflect.Field;

public class C6831a2 extends C7029t0 {
    public static Field f21380O;
    public int f21381M;
    public int f21382N;
    public int f21383c;

    public C6831a2(Context context) {
        super(context);
        if (f21380O == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mScrollY");
                f21380O = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i = this.f21381M;
        if (i == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.f21381M = i - 1;
        int i2 = this.f21382N;
        if (i2 != Integer.MAX_VALUE) {
            return -i2;
        }
        return 0;
    }

    @Override
    public int getExtendedPaddingTop() {
        int i = this.f21383c;
        if (i == 0) {
            return super.getExtendedPaddingTop();
        }
        this.f21383c = i - 1;
        return 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (f21380O == null) {
            super.onDraw(canvas);
            return;
        }
        int extendedPaddingTop = getExtendedPaddingTop();
        this.f21382N = Integer.MAX_VALUE;
        try {
            int i = f21380O.getInt(this);
            this.f21382N = i;
            if (i != 0) {
                f21380O.set(this, 0);
            }
        } catch (Throwable unused) {
        }
        this.f21383c = 1;
        this.f21381M = 1;
        canvas.save();
        canvas.translate(0.0f, extendedPaddingTop);
        try {
            super.onDraw(canvas);
        } catch (Throwable unused2) {
        }
        int i2 = this.f21382N;
        if (!(i2 == Integer.MAX_VALUE || i2 == 0)) {
            try {
                f21380O.set(this, Integer.valueOf(i2));
            } catch (Throwable unused3) {
            }
        }
        canvas.restore();
    }
}
