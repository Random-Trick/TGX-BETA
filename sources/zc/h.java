package zc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import ce.a0;
import ce.c;
import ce.p0;
import ce.y;
import oc.v0;
import org.thunderdog.challegram.R;

public class h extends View {
    public float M;
    public float N;
    public float O;
    public int f27187a;
    public Drawable f27188b;
    public float f27189c;

    public h(Context context) {
        super(context);
        p0.T(this);
    }

    public final void a() {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        if (this.f27187a == -1) {
            if (this.f27188b == null) {
                this.f27188b = c.g(getResources(), R.drawable.baseline_backspace_24);
            }
            this.N = measuredWidth - (this.f27188b.getMinimumWidth() * 0.5f);
            this.O = (measuredHeight - (this.f27188b.getMinimumHeight() * 0.5f)) - a0.i(10.0f);
            return;
        }
        this.f27189c = measuredWidth - (v0.T1(getCodes(), y.b0(11.0f)) * 0.5f);
        this.N = measuredWidth - (v0.T1(getNumber(), y.b0(34.0f)) * 0.5f);
        this.O = measuredHeight - a0.i(-2.0f);
        this.M = measuredHeight - a0.i(-22.0f);
    }

    public String getCodes() {
        switch (this.f27187a) {
            case 0:
                return "+";
            case 1:
                return "";
            case 2:
                return "ABC";
            case 3:
                return "DEF";
            case 4:
                return "GHI";
            case 5:
                return "JKL";
            case 6:
                return "MNO";
            case 7:
                return "PQRS";
            case 8:
                return "TUV";
            case 9:
                return "WXYZ";
            default:
                return null;
        }
    }

    public String getNumber() {
        return String.valueOf(this.f27187a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f27187a == -1) {
            c.b(canvas, this.f27188b, this.N, this.O, y.W(j.L(R.id.theme_color_passcodeText)));
            return;
        }
        canvas.drawText(getNumber(), this.N, this.O, y.c0(34.0f, j.L(R.id.theme_color_passcodeText)));
        canvas.drawText(getCodes(), this.f27189c, this.M, y.c0(11.0f, j.D0()));
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a();
        }
    }

    public void setHasFeedback(boolean z10) {
        setBackgroundResource(z10 ? R.drawable.bg_btn_pin : R.drawable.transparent);
    }

    public void setNumber(int i10) {
        this.f27187a = i10;
    }
}
