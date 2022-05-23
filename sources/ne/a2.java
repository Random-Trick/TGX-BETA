package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.lang.reflect.Field;

public class a2 extends t0 {
    public static Field O;
    public int M;
    public int N;
    public int f17857c;

    public a2(Context context) {
        super(context);
        if (O == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mScrollY");
                O = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i10 = this.M;
        if (i10 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.M = i10 - 1;
        int i11 = this.N;
        if (i11 != Integer.MAX_VALUE) {
            return -i11;
        }
        return 0;
    }

    @Override
    public int getExtendedPaddingTop() {
        int i10 = this.f17857c;
        if (i10 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.f17857c = i10 - 1;
        return 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (O == null) {
            super.onDraw(canvas);
            return;
        }
        int extendedPaddingTop = getExtendedPaddingTop();
        this.N = Integer.MAX_VALUE;
        try {
            int i10 = O.getInt(this);
            this.N = i10;
            if (i10 != 0) {
                O.set(this, 0);
            }
        } catch (Throwable unused) {
        }
        this.f17857c = 1;
        this.M = 1;
        canvas.save();
        canvas.translate(0.0f, extendedPaddingTop);
        try {
            super.onDraw(canvas);
        } catch (Throwable unused2) {
        }
        int i11 = this.N;
        if (!(i11 == Integer.MAX_VALUE || i11 == 0)) {
            try {
                O.set(this, Integer.valueOf(i11));
            } catch (Throwable unused3) {
            }
        }
        canvas.restore();
    }
}
