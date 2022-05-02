package p335xd;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p108hb.C5064d;
import p111he.AbstractC5128m;
import p364zd.C11524j;

public abstract class AbstractC10190e extends Drawable implements AbstractC5128m {
    public static final boolean f32935O;
    public final float f32936M;
    public final boolean f32937N;
    public int f32938a;
    public float f32939b;
    public int f32940c;

    static {
        f32935O = Build.VERSION.SDK_INT < 21;
    }

    public AbstractC10190e(int i, float f, boolean z) {
        this.f32938a = i;
        this.f32936M = f;
        this.f32937N = z;
    }

    @Override
    public void mo5792a(int i, int i2, float f) {
        if (this.f32938a != i || this.f32939b != f || (this.f32940c != i2 && f > 0.0f)) {
            this.f32938a = i;
            this.f32939b = f;
            this.f32940c = i2;
        }
    }

    @Override
    public final int mo5791b() {
        float f = this.f32939b;
        int i = 0;
        if (f == 0.0f) {
            int i2 = this.f32938a;
            if (i2 != 0) {
                i = C11524j.m228N(i2);
            }
        } else if (f == 1.0f) {
            int i3 = this.f32940c;
            if (i3 != 0) {
                i = C11524j.m228N(i3);
            }
        } else {
            int i4 = this.f32938a;
            int N = i4 != 0 ? C11524j.m228N(i4) : 0;
            int i5 = this.f32940c;
            if (i5 != 0) {
                i = C11524j.m228N(i5);
            }
            i = C5064d.m24129d(N, i, this.f32939b);
        }
        return this.f32937N ? C5064d.m24130c(i, 1084268704) : i;
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
