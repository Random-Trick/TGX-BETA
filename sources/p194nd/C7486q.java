package p194nd;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import be.C1389o;
import me.C6847b2;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C7486q extends FrameLayoutFix implements C3950k.AbstractC3952b {
    public final TextView f23955M;
    public final TextView f23956N;
    public int f23957O;
    public int f23958P;
    public boolean f23959Q;
    public boolean f23960R;
    public final C3940f f23961S = new C3940f(0, this, C2057b.f7280b, 180);

    public static class C7487a extends C6847b2 {
        public float f23962a = 1.0f;
        public float f23963b = 1.0f;
        public float f23964c = 1.0f;

        public C7487a(Context context) {
            super(context);
        }

        public final void m15832a() {
            Layout layout = getLayout();
            float lineWidth = (layout == null || layout.getLineCount() <= 0) ? 0.0f : layout.getLineWidth(0);
            float measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0.0f || lineWidth <= measuredWidth) {
                this.f23964c = 1.0f;
            } else {
                this.f23964c = Math.min(1.0f, measuredWidth / lineWidth);
                setMeasuredDimension((int) lineWidth, getMeasuredHeight());
            }
            super.setScaleX(this.f23962a * this.f23964c);
            super.setScaleY(this.f23963b * this.f23964c);
            setPivotX(getMeasuredWidth());
            setPivotY(getMeasuredHeight() / 2.0f);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            m15832a();
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            m15832a();
        }

        @Override
        public void setScaleX(float f) {
            this.f23962a = f;
            super.setScaleX(f * this.f23964c);
        }

        @Override
        public void setScaleY(float f) {
            this.f23963b = f;
            super.setScaleY(f * this.f23964c);
        }
    }

    public C7486q(Context context) {
        super(context);
        C7487a aVar = new C7487a(context);
        this.f23955M = aVar;
        aVar.setTextColor(-1);
        aVar.setTypeface(C1389o.m37261k());
        aVar.setGravity(5);
        aVar.setTextSize(1, 13.0f);
        aVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 21));
        aVar.setSingleLine(true);
        addView(aVar);
        C6847b2 b2Var = new C6847b2(context);
        this.f23956N = b2Var;
        b2Var.setTextColor(-10170627);
        b2Var.setTypeface(C1389o.m37261k());
        b2Var.setTextSize(1, 13.0f);
        b2Var.setAlpha(0.0f);
        b2Var.setGravity(17);
        b2Var.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 21));
        b2Var.setSingleLine(true);
        b2Var.setText("0");
        addView(b2Var);
    }

    public void m15836C1(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            int i = this.f23957O;
            if (i != 0) {
                v4Var.m9119z8(this.f23955M, i);
            }
            int i2 = this.f23958P;
            if (i2 != 0) {
                v4Var.m9119z8(this.f23956N, i2);
            }
        }
    }

    public void m15835D1(int i, int i2) {
        TextView textView = this.f23955M;
        this.f23957O = i;
        textView.setTextColor(C11524j.m228N(i));
        TextView textView2 = this.f23956N;
        this.f23958P = i2;
        textView2.setTextColor(C11524j.m228N(i2));
    }

    public void m15834E1(boolean z, boolean z2) {
        if (this.f23959Q != z) {
            this.f23959Q = z;
            if (z2) {
                this.f23961S.m29581l(this.f23955M.getText().length() == 0 ? 120L : 180L);
            }
            this.f23961S.m29577p(z || this.f23960R, z2);
        }
    }

    public final void m15833F1(View view, float f) {
        view.setAlpha(f);
        float f2 = (f * 0.19999999f) + 0.8f;
        view.setScaleX(f2);
        view.setScaleY(f2);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f23955M.getText().length() == 0) {
            m15833F1(this.f23956N, f);
            return;
        }
        float f3 = 0.0f;
        float f4 = f <= 0.5f ? 1.0f - (f / 0.5f) : 0.0f;
        if (f > 0.5f) {
            f3 = (f - 0.5f) / 0.5f;
        }
        m15833F1(this.f23955M, f4);
        m15833F1(this.f23956N, f3);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void setAlwaysDragging(boolean z) {
        if (this.f23960R != z) {
            this.f23960R = z;
            this.f23961S.m29577p(z || this.f23959Q, false);
        }
    }

    public void setName(CharSequence charSequence) {
        this.f23955M.setText(charSequence);
    }

    public void setSizes(float f) {
        this.f23955M.setTextSize(1, f);
        this.f23956N.setTextSize(1, f);
    }

    public void setValue(String str) {
        this.f23956N.setText(str);
    }

    public void setValueMaxWidth(float f) {
        this.f23956N.setMinimumWidth(Math.round(f));
    }
}
