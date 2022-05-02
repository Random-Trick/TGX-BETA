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
    public final TextView f23952M;
    public final TextView f23953N;
    public int f23954O;
    public int f23955P;
    public boolean f23956Q;
    public boolean f23957R;
    public final C3940f f23958S = new C3940f(0, this, C2057b.f7280b, 180);

    public static class C7487a extends C6847b2 {
        public float f23959a = 1.0f;
        public float f23960b = 1.0f;
        public float f23961c = 1.0f;

        public C7487a(Context context) {
            super(context);
        }

        public final void m15832a() {
            Layout layout = getLayout();
            float lineWidth = (layout == null || layout.getLineCount() <= 0) ? 0.0f : layout.getLineWidth(0);
            float measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0.0f || lineWidth <= measuredWidth) {
                this.f23961c = 1.0f;
            } else {
                this.f23961c = Math.min(1.0f, measuredWidth / lineWidth);
                setMeasuredDimension((int) lineWidth, getMeasuredHeight());
            }
            super.setScaleX(this.f23959a * this.f23961c);
            super.setScaleY(this.f23960b * this.f23961c);
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
            this.f23959a = f;
            super.setScaleX(f * this.f23961c);
        }

        @Override
        public void setScaleY(float f) {
            this.f23960b = f;
            super.setScaleY(f * this.f23961c);
        }
    }

    public C7486q(Context context) {
        super(context);
        C7487a aVar = new C7487a(context);
        this.f23952M = aVar;
        aVar.setTextColor(-1);
        aVar.setTypeface(C1389o.m37258k());
        aVar.setGravity(5);
        aVar.setTextSize(1, 13.0f);
        aVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 21));
        aVar.setSingleLine(true);
        addView(aVar);
        C6847b2 b2Var = new C6847b2(context);
        this.f23953N = b2Var;
        b2Var.setTextColor(-10170627);
        b2Var.setTypeface(C1389o.m37258k());
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
            int i = this.f23954O;
            if (i != 0) {
                v4Var.m9119z8(this.f23952M, i);
            }
            int i2 = this.f23955P;
            if (i2 != 0) {
                v4Var.m9119z8(this.f23953N, i2);
            }
        }
    }

    public void m15835D1(int i, int i2) {
        TextView textView = this.f23952M;
        this.f23954O = i;
        textView.setTextColor(C11524j.m228N(i));
        TextView textView2 = this.f23953N;
        this.f23955P = i2;
        textView2.setTextColor(C11524j.m228N(i2));
    }

    public void m15834E1(boolean z, boolean z2) {
        if (this.f23956Q != z) {
            this.f23956Q = z;
            if (z2) {
                this.f23958S.m29579l(this.f23952M.getText().length() == 0 ? 120L : 180L);
            }
            this.f23958S.m29575p(z || this.f23957R, z2);
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
        if (this.f23952M.getText().length() == 0) {
            m15833F1(this.f23953N, f);
            return;
        }
        float f3 = 0.0f;
        float f4 = f <= 0.5f ? 1.0f - (f / 0.5f) : 0.0f;
        if (f > 0.5f) {
            f3 = (f - 0.5f) / 0.5f;
        }
        m15833F1(this.f23952M, f4);
        m15833F1(this.f23953N, f3);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void setAlwaysDragging(boolean z) {
        if (this.f23957R != z) {
            this.f23957R = z;
            this.f23958S.m29575p(z || this.f23956Q, false);
        }
    }

    public void setName(CharSequence charSequence) {
        this.f23952M.setText(charSequence);
    }

    public void setSizes(float f) {
        this.f23952M.setTextSize(1, f);
        this.f23953N.setTextSize(1, f);
    }

    public void setValue(String str) {
        this.f23953N.setText(str);
    }

    public void setValueMaxWidth(float f) {
        this.f23953N.setMinimumWidth(Math.round(f));
    }
}
