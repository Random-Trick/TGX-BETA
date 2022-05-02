package p349yc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class C10511h extends View {
    public float f33712M;
    public float f33713N;
    public float f33714O;
    public int f33715a;
    public Drawable f33716b;
    public float f33717c;

    public C10511h(Context context) {
        super(context);
        C1399s0.m37193a0(this);
    }

    public final void m4869a() {
        float measuredWidth = getMeasuredWidth() * 0.5f;
        float measuredHeight = getMeasuredHeight() * 0.5f;
        if (this.f33715a == -1) {
            if (this.f33716b == null) {
                this.f33716b = C1362c.m37482g(getResources(), R.drawable.baseline_backspace_24);
            }
            this.f33713N = measuredWidth - (this.f33716b.getMinimumWidth() * 0.5f);
            this.f33714O = (measuredHeight - (this.f33716b.getMinimumHeight() * 0.5f)) - C1357a0.m37541i(10.0f);
            return;
        }
        this.f33717c = measuredWidth - (C7389v0.m16680T1(getCodes(), C1410y.m37048b0(11.0f)) * 0.5f);
        this.f33713N = measuredWidth - (C7389v0.m16680T1(getNumber(), C1410y.m37048b0(34.0f)) * 0.5f);
        this.f33714O = measuredHeight - C1357a0.m37541i(-2.0f);
        this.f33712M = measuredHeight - C1357a0.m37541i(-22.0f);
    }

    public String getCodes() {
        switch (this.f33715a) {
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
        return String.valueOf(this.f33715a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f33715a == -1) {
            C1362c.m37487b(canvas, this.f33716b, this.f33713N, this.f33714O, C1410y.m37055W(C11524j.m228N(R.id.theme_color_passcodeText)));
            return;
        }
        canvas.drawText(getNumber(), this.f33713N, this.f33714O, C1410y.m37046c0(34.0f, C11524j.m228N(R.id.theme_color_passcodeText)));
        canvas.drawText(getCodes(), this.f33717c, this.f33712M, C1410y.m37046c0(11.0f, C11524j.m243F0()));
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4869a();
        }
    }

    public void setHasFeedback(boolean z) {
        setBackgroundResource(z ? R.drawable.bg_btn_pin : R.drawable.transparent);
    }

    public void setNumber(int i) {
        this.f33715a = i;
    }
}
