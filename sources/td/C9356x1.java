package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import be.C1379j0;
import p108hb.C5064d;
import p111he.AbstractC5155y0;
import p181mb.C6812c;
import p364zd.C11524j;

public class C9356x1 extends View {
    public int f30314M;
    public Window f30315N;
    public float f30316O;
    public float f30317P;
    public C6812c f30318Q;
    public boolean f30319R;
    public AbstractC5155y0 f30320a;
    public boolean f30321b;
    public boolean f30322c;

    public C9356x1(Context context) {
        super(context);
    }

    public void m8993a(int i, int i2) {
        int i3;
        boolean z = true;
        this.f30317P = i2 == 1 ? C11524j.m204Z() : 0.6f;
        this.f30314M = i;
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC9323v4<?> s = C1379j0.m37308s();
            if (s == null || s.mo9386Me() || (i3 = this.f30314M) == 0 || i3 == -1) {
                z = false;
            }
            this.f30322c = z;
            if (z) {
                Window G = C1379j0.m37365G();
                this.f30315N = G;
                this.f30316O = 1.0f;
                int Aa = i2 == 2 ? s.m9479Aa() : G.getStatusBarColor();
                int c = C5064d.m24130c(Aa, C5064d.m24131b((int) (this.f30317P * this.f30316O * 255.0f), this.f30314M));
                C6812c cVar = this.f30318Q;
                if (cVar == null) {
                    this.f30318Q = new C6812c(Aa, c);
                } else {
                    cVar.m18909b(Aa, c);
                }
            }
        }
    }

    public final void m8992b() {
    }

    public int getCurrentStatusBarColor() {
        C6812c cVar = this.f30318Q;
        if (cVar == null) {
            return 0;
        }
        return cVar.m18910a((getAlpha() / this.f30317P) * this.f30316O);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (Color.alpha(this.f30314M) > 0) {
            canvas.drawColor(this.f30314M);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC5155y0 y0Var;
        if (motionEvent.getAction() == 0 && (y0Var = this.f30320a) != null) {
            y0Var.mo23796O4();
        }
        return this.f30320a != null || this.f30321b;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (Build.VERSION.SDK_INT >= 21 && this.f30315N != null && this.f30322c && !this.f30319R) {
            m8992b();
        }
    }

    public void setIgnoreChanges(boolean z) {
        if (this.f30319R != z) {
            this.f30319R = z;
            if (!z && this.f30315N != null && this.f30322c) {
                m8992b();
            }
        }
    }

    public void setUnlockable(AbstractC5155y0 y0Var) {
        this.f30320a = y0Var;
    }
}
