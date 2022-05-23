package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import ce.j0;
import ib.d;
import ie.y0;
import nb.c;

public class x1 extends View {
    public int M;
    public Window N;
    public float O;
    public float P;
    public c Q;
    public boolean R;
    public y0 f24589a;
    public boolean f24590b;
    public boolean f24591c;

    public x1(Context context) {
        super(context);
    }

    public void a(int i10, int i11) {
        int i12;
        boolean z10 = true;
        this.P = i11 == 1 ? j.X() : 0.6f;
        this.M = i10;
        v4<?> s10 = j0.s();
        if (s10 == null || s10.Me() || (i12 = this.M) == 0 || i12 == -1) {
            z10 = false;
        }
        this.f24591c = z10;
        if (z10) {
            Window G = j0.G();
            this.N = G;
            this.O = 1.0f;
            int Aa = i11 == 2 ? s10.Aa() : G.getStatusBarColor();
            int c10 = d.c(Aa, d.b((int) (this.P * this.O * 255.0f), this.M));
            c cVar = this.Q;
            if (cVar == null) {
                this.Q = new c(Aa, c10);
            } else {
                cVar.b(Aa, c10);
            }
        }
    }

    public final void b() {
    }

    public int getCurrentStatusBarColor() {
        c cVar = this.Q;
        if (cVar == null) {
            return 0;
        }
        return cVar.a((getAlpha() / this.P) * this.O);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (Color.alpha(this.M) > 0) {
            canvas.drawColor(this.M);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y0 y0Var;
        if (motionEvent.getAction() == 0 && (y0Var = this.f24589a) != null) {
            y0Var.H4();
        }
        return this.f24589a != null || this.f24590b;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.N != null && this.f24591c && !this.R) {
            b();
        }
    }

    public void setIgnoreChanges(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10 && this.N != null && this.f24591c) {
                b();
            }
        }
    }

    public void setUnlockable(y0 y0Var) {
        this.f24589a = y0Var;
    }
}
