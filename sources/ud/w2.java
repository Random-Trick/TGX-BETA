package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ce.a0;
import ce.y;
import gd.w;
import ib.i;
import je.e;
import oc.v0;

public class w2 extends View {
    public float M;
    public int N;
    public int O;
    public float Q;
    public e f24553a;
    public String f24554b;
    public float f24555c;
    public int R = j.n0();
    public h3 P = new h3();

    public w2(Context context) {
        super(context);
    }

    public final TextPaint a(boolean z10, boolean z11) {
        if (z11) {
            return y.O(19.0f, this.R, z10);
        }
        return y.P(19.0f, z10);
    }

    public final void b() {
        int measuredWidth = (getMeasuredWidth() - this.N) - a0.i(12.0f);
        if (!(this.f24553a == null || getLayoutParams().width == -2)) {
            float f10 = measuredWidth;
            if (this.M > f10) {
                TextPaint a10 = a(this.f24553a.f15364b, false);
                String charSequence = TextUtils.ellipsize(this.f24553a.f15363a, a10, f10, TextUtils.TruncateAt.END).toString();
                this.f24554b = charSequence;
                this.f24555c = v0.T1(charSequence, a10);
                return;
            }
        }
        this.f24554b = null;
        this.f24555c = 0.0f;
    }

    public float getTriangleCenterX() {
        return this.P.b();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10 = this.f24554b != null ? this.f24555c : this.M;
        if (w.G2()) {
            int measuredWidth = getMeasuredWidth();
            e eVar = this.f24553a;
            if (eVar != null) {
                String str = this.f24554b;
                if (str == null) {
                    str = eVar.f15363a;
                }
                canvas.drawText(str, measuredWidth - f10, this.O, a(eVar.f15364b, true));
            }
            canvas.save();
            canvas.translate(((measuredWidth - f10) - this.N) - this.P.c(), this.Q);
            this.P.a(canvas);
            canvas.restore();
            return;
        }
        e eVar2 = this.f24553a;
        if (eVar2 != null) {
            String str2 = this.f24554b;
            if (str2 == null) {
                str2 = eVar2.f15363a;
            }
            canvas.drawText(str2, 0.0f, this.O, a(eVar2.f15364b, true));
        }
        canvas.save();
        canvas.translate(f10 + this.N, this.Q);
        this.P.a(canvas);
        canvas.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (getLayoutParams().width == -2) {
            setMeasuredDimension((int) (this.M + this.P.c() + this.N), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
            return;
        }
        super.onMeasure(i10, i11);
        b();
    }

    public void setText(CharSequence charSequence) {
        e eVar = !i.i(charSequence) ? new e(charSequence.toString()) : null;
        this.f24553a = eVar;
        this.M = eVar != null ? v0.T1(eVar.f15363a, a(eVar.f15364b, false)) : 0.0f;
        this.Q = a0.i(12.0f);
        this.O = a0.i(20.0f);
        this.N = a0.i(10.0f);
        b();
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i10) {
        if (this.R != i10) {
            this.R = i10;
            invalidate();
        }
    }

    public void setTriangleColor(int i10) {
        this.P.d(i10);
    }
}
