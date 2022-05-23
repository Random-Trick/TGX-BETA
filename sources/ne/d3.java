package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import gd.w;
import org.thunderdog.challegram.R;

public class d3 extends View {
    public float M;
    public int O;
    public int P;
    public boolean R;
    public boolean S;
    public boolean T;
    public final Paint f17949a;
    public float f17950b;
    public float f17951c;
    public int Q = R.id.theme_color_separator;
    public int N = Math.max(a0.i(0.5f), 1);

    public d3(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f17949a = paint;
        paint.setColor(j.L(this.Q));
        paint.setStyle(Paint.Style.FILL);
    }

    public static d3 e(Context context, ViewGroup.LayoutParams layoutParams, boolean z10) {
        d3 d3Var = new d3(context);
        d3Var.setSeparatorHeight(Math.max(1, a0.i(0.5f)));
        if (z10) {
            d3Var.b();
            d3Var.d();
        }
        layoutParams.width = -1;
        layoutParams.height = a0.i(1.0f);
        d3Var.setLayoutParams(layoutParams);
        return d3Var;
    }

    public void a() {
        this.T = true;
    }

    public void b() {
        this.R = true;
    }

    public void c(float f10, float f11) {
        this.f17950b = f10;
        this.f17951c = f11;
    }

    public void d() {
        this.S = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        if (this.S) {
            int i10 = this.O;
            if (i10 == 0) {
                i10 = j.u();
            }
            canvas.drawColor(i10);
        }
        int i11 = this.P;
        if (i11 == 0) {
            this.f17949a.setColor(j.L(this.Q));
        } else {
            this.f17949a.setColor(i11);
        }
        if (this.f17950b == 0.0f && this.f17951c == 0.0f) {
            float f10 = this.M;
            canvas.drawRect(0.0f, f10, measuredWidth, f10 + this.N, this.f17949a);
        } else if (w.G2()) {
            float f11 = this.f17951c;
            float f12 = this.M;
            canvas.drawRect(f11, f12, measuredWidth - this.f17950b, f12 + this.N, this.f17949a);
        } else {
            float f13 = this.f17950b;
            float f14 = this.M;
            canvas.drawRect(f13, f14, measuredWidth - this.f17951c, f14 + this.N, this.f17949a);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M = this.T ? getMeasuredHeight() - this.N : this.R ? 0.0f : getMeasuredHeight() / 2.0f;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setColorId(int i10) {
        if (this.Q != i10) {
            this.Q = i10;
            this.f17949a.setColor(j.L(i10));
        }
    }

    public void setSeparatorHeight(int i10) {
        this.N = i10;
    }
}
