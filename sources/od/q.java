package od;

import ae.j;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ce.o;
import db.b;
import eb.f;
import eb.k;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ud.v4;

public class q extends FrameLayoutFix implements k.b {
    public final TextView M;
    public final TextView N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public final f S = new f(0, this, b.f7287b, 180);

    public static class a extends b2 {
        public float f19836a = 1.0f;
        public float f19837b = 1.0f;
        public float f19838c = 1.0f;

        public a(Context context) {
            super(context);
        }

        public final void a() {
            Layout layout = getLayout();
            float lineWidth = (layout == null || layout.getLineCount() <= 0) ? 0.0f : layout.getLineWidth(0);
            float measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0.0f || lineWidth <= measuredWidth) {
                this.f19838c = 1.0f;
            } else {
                this.f19838c = Math.min(1.0f, measuredWidth / lineWidth);
                setMeasuredDimension((int) lineWidth, getMeasuredHeight());
            }
            super.setScaleX(this.f19836a * this.f19838c);
            super.setScaleY(this.f19837b * this.f19838c);
            setPivotX(getMeasuredWidth());
            setPivotY(getMeasuredHeight() / 2.0f);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            a();
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            super.onTextChanged(charSequence, i10, i11, i12);
            a();
        }

        @Override
        public void setScaleX(float f10) {
            this.f19836a = f10;
            super.setScaleX(f10 * this.f19838c);
        }

        @Override
        public void setScaleY(float f10) {
            this.f19837b = f10;
            super.setScaleY(f10 * this.f19838c);
        }
    }

    public q(Context context) {
        super(context);
        a aVar = new a(context);
        this.M = aVar;
        aVar.setTextColor(-1);
        aVar.setTypeface(o.k());
        aVar.setGravity(5);
        aVar.setTextSize(1, 13.0f);
        aVar.setLayoutParams(FrameLayoutFix.r1(-1, -2, 21));
        aVar.setSingleLine(true);
        addView(aVar);
        b2 b2Var = new b2(context);
        this.N = b2Var;
        b2Var.setTextColor(-10170627);
        b2Var.setTypeface(o.k());
        b2Var.setTextSize(1, 13.0f);
        b2Var.setAlpha(0.0f);
        b2Var.setGravity(17);
        b2Var.setLayoutParams(FrameLayoutFix.r1(-2, -2, 21));
        b2Var.setSingleLine(true);
        b2Var.setText("0");
        addView(b2Var);
    }

    public void A1(int i10, int i11) {
        TextView textView = this.M;
        this.O = i10;
        textView.setTextColor(j.L(i10));
        TextView textView2 = this.N;
        this.P = i11;
        textView2.setTextColor(j.L(i11));
    }

    public void B1(boolean z10, boolean z11) {
        if (this.Q != z10) {
            this.Q = z10;
            if (z11) {
                this.S.l(this.M.getText().length() == 0 ? 120L : 180L);
            }
            this.S.p(z10 || this.R, z11);
        }
    }

    public final void C1(View view, float f10) {
        view.setAlpha(f10);
        float f11 = (f10 * 0.19999999f) + 0.8f;
        view.setScaleX(f11);
        view.setScaleY(f11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.M.getText().length() == 0) {
            C1(this.N, f10);
            return;
        }
        float f12 = 0.0f;
        float f13 = f10 <= 0.5f ? 1.0f - (f10 / 0.5f) : 0.0f;
        if (f10 > 0.5f) {
            f12 = (f10 - 0.5f) / 0.5f;
        }
        C1(this.M, f13);
        C1(this.N, f12);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    public void setAlwaysDragging(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            this.S.p(z10 || this.Q, false);
        }
    }

    public void setName(CharSequence charSequence) {
        this.M.setText(charSequence);
    }

    public void setSizes(float f10) {
        this.M.setTextSize(1, f10);
        this.N.setTextSize(1, f10);
    }

    public void setValue(String str) {
        this.N.setText(str);
    }

    public void setValueMaxWidth(float f10) {
        this.N.setMinimumWidth(Math.round(f10));
    }

    public void z1(v4<?> v4Var) {
        if (v4Var != null) {
            int i10 = this.O;
            if (i10 != 0) {
                v4Var.z8(this.M, i10);
            }
            int i11 = this.P;
            if (i11 != 0) {
                v4Var.z8(this.N, i11);
            }
        }
    }
}
