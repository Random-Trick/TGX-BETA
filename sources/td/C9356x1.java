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
    public int f30311M;
    public Window f30312N;
    public float f30313O;
    public float f30314P;
    public C6812c f30315Q;
    public boolean f30316R;
    public AbstractC5155y0 f30317a;
    public boolean f30318b;
    public boolean f30319c;

    public C9356x1(Context context) {
        super(context);
    }

    public void m8993a(int i, int i2) {
        int i3;
        boolean z = true;
        this.f30314P = i2 == 1 ? C11524j.m204Z() : 0.6f;
        this.f30311M = i;
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC9323v4<?> s = C1379j0.m37305s();
            if (s == null || s.mo9386Me() || (i3 = this.f30311M) == 0 || i3 == -1) {
                z = false;
            }
            this.f30319c = z;
            if (z) {
                Window G = C1379j0.m37362G();
                this.f30312N = G;
                this.f30313O = 1.0f;
                int Aa = i2 == 2 ? s.m9479Aa() : G.getStatusBarColor();
                int c = C5064d.m24129c(Aa, C5064d.m24130b((int) (this.f30314P * this.f30313O * 255.0f), this.f30311M));
                C6812c cVar = this.f30315Q;
                if (cVar == null) {
                    this.f30315Q = new C6812c(Aa, c);
                } else {
                    cVar.m18908b(Aa, c);
                }
            }
        }
    }

    public final void m8992b() {
    }

    public int getCurrentStatusBarColor() {
        C6812c cVar = this.f30315Q;
        if (cVar == null) {
            return 0;
        }
        return cVar.m18909a((getAlpha() / this.f30314P) * this.f30313O);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (Color.alpha(this.f30311M) > 0) {
            canvas.drawColor(this.f30311M);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC5155y0 y0Var;
        if (motionEvent.getAction() == 0 && (y0Var = this.f30317a) != null) {
            y0Var.mo23795O4();
        }
        return this.f30317a != null || this.f30318b;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (Build.VERSION.SDK_INT >= 21 && this.f30312N != null && this.f30319c && !this.f30316R) {
            m8992b();
        }
    }

    public void setIgnoreChanges(boolean z) {
        if (this.f30316R != z) {
            this.f30316R = z;
            if (!z && this.f30312N != null && this.f30319c) {
                m8992b();
            }
        }
    }

    public void setUnlockable(AbstractC5155y0 y0Var) {
        this.f30317a = y0Var;
    }
}
