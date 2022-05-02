package td;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import ie.C5386e;
import nc.C7389v0;
import p082fd.C4403w;
import p108hb.C5070i;
import p364zd.C11524j;

public class C9351w2 extends View {
    public float f30239M;
    public int f30240N;
    public int f30241O;
    public float f30243Q;
    public C5386e f30245a;
    public String f30246b;
    public float f30247c;
    public int f30244R = C11524j.m161p0();
    public C9203h3 f30242P = new C9203h3();

    public C9351w2(Context context) {
        super(context);
    }

    public final TextPaint m9069a(boolean z, boolean z2) {
        if (z2) {
            return C1410y.m37066O(19.0f, this.f30244R, z);
        }
        return C1410y.m37065P(19.0f, z);
    }

    public final void m9068b() {
        int measuredWidth = (getMeasuredWidth() - this.f30240N) - C1357a0.m37544i(12.0f);
        if (!(this.f30245a == null || getLayoutParams().width == -2)) {
            float f = measuredWidth;
            if (this.f30239M > f) {
                TextPaint a = m9069a(this.f30245a.f17712b, false);
                String charSequence = TextUtils.ellipsize(this.f30245a.f17711a, a, f, TextUtils.TruncateAt.END).toString();
                this.f30246b = charSequence;
                this.f30247c = C7389v0.m16680T1(charSequence, a);
                return;
            }
        }
        this.f30246b = null;
        this.f30247c = 0.0f;
    }

    public float getTriangleCenterX() {
        return this.f30242P.m9974b();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f = this.f30246b != null ? this.f30247c : this.f30239M;
        if (C4403w.m27986G2()) {
            int measuredWidth = getMeasuredWidth();
            C5386e eVar = this.f30245a;
            if (eVar != null) {
                String str = this.f30246b;
                if (str == null) {
                    str = eVar.f17711a;
                }
                canvas.drawText(str, measuredWidth - f, this.f30241O, m9069a(eVar.f17712b, true));
            }
            canvas.save();
            canvas.translate(((measuredWidth - f) - this.f30240N) - this.f30242P.m9973c(), this.f30243Q);
            this.f30242P.m9975a(canvas);
            canvas.restore();
            return;
        }
        C5386e eVar2 = this.f30245a;
        if (eVar2 != null) {
            String str2 = this.f30246b;
            if (str2 == null) {
                str2 = eVar2.f17711a;
            }
            canvas.drawText(str2, 0.0f, this.f30241O, m9069a(eVar2.f17712b, true));
        }
        canvas.save();
        canvas.translate(f + this.f30240N, this.f30243Q);
        this.f30242P.m9975a(canvas);
        canvas.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().width == -2) {
            setMeasuredDimension((int) (this.f30239M + this.f30242P.m9973c() + this.f30240N), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            return;
        }
        super.onMeasure(i, i2);
        m9068b();
    }

    public void setText(CharSequence charSequence) {
        C5386e eVar = !C5070i.m24062i(charSequence) ? new C5386e(charSequence.toString()) : null;
        this.f30245a = eVar;
        this.f30239M = eVar != null ? C7389v0.m16680T1(eVar.f17711a, m9069a(eVar.f17712b, false)) : 0.0f;
        this.f30243Q = C1357a0.m37544i(12.0f);
        this.f30241O = C1357a0.m37544i(20.0f);
        this.f30240N = C1357a0.m37544i(10.0f);
        m9068b();
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        if (this.f30244R != i) {
            this.f30244R = i;
            invalidate();
        }
    }

    public void setTriangleColor(int i) {
        this.f30242P.m9972d(i);
    }
}
