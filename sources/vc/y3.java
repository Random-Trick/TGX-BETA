package vc;

import ae.j;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.p0;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;

public class y3 extends FrameLayoutFix {
    public final ImageView M;
    public final LinearLayout N;
    public boolean O;
    public b P;
    public v4<?> Q;

    public class a extends ImageView {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public interface b {
        void a(y3 y3Var);
    }

    public static class c {
        public final int f25381a;
        public final int f25382b;
        public final View.OnClickListener f25383c;
        public boolean f25384d;
        public boolean f25385e;

        public c(int i10, int i11, View.OnClickListener onClickListener) {
            this.f25381a = i10;
            this.f25382b = i11;
            this.f25383c = onClickListener;
        }

        public c a() {
            this.f25384d = true;
            return this;
        }

        public c b() {
            this.f25385e = true;
            return this;
        }
    }

    public y3(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.q1(-1, a0.i(36.0f)));
        g.i(this, R.id.theme_color_filling, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(FrameLayoutFix.r1(-1, -1, w.F1() | 48));
        addView(linearLayout);
        a aVar = new a(context);
        this.M = aVar;
        aVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                y3.this.B1(view);
            }
        });
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        aVar.setColorFilter(j.o0());
        aVar.setImageResource(R.drawable.baseline_close_18);
        aVar.setLayoutParams(FrameLayoutFix.r1(a0.i(40.0f), -1, w.F1() | 48));
        aVar.setBackgroundResource(R.drawable.bg_btn_header);
        p0.T(aVar);
        aVar.setVisibility(4);
        addView(aVar);
    }

    public void B1(View view) {
        b bVar = this.P;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void A1(v4<?> v4Var) {
        this.Q = v4Var;
        if (v4Var != null) {
            v4Var.q8(this.M, R.id.theme_color_icon);
            v4Var.t8(this);
        }
    }

    public void setCanDismiss(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            this.M.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setDismissListener(b bVar) {
        this.P = bVar;
    }

    public void setItems(c... cVarArr) {
        v4<?> v4Var;
        for (int i10 = 0; i10 < this.N.getChildCount(); i10++) {
            View childAt = this.N.getChildAt(i10);
            if (!(childAt == null || (v4Var = this.Q) == null)) {
                v4Var.qd(childAt);
            }
        }
        this.N.removeAllViews();
        if (cVarArr.length > 1) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.N.addView(view);
        }
        boolean z10 = false;
        for (c cVar : cVarArr) {
            if (!cVar.f25385e) {
                z10 = true;
            }
            int i11 = cVar.f25384d ? R.id.theme_color_textNegative : R.id.theme_color_textNeutral;
            TextView I = p0.I(getContext(), 15.0f, j.L(i11), 17, 5);
            I.setId(cVar.f25381a);
            v4<?> v4Var2 = this.Q;
            if (v4Var2 != null) {
                v4Var2.z8(I, i11);
            }
            I.setEllipsize(TextUtils.TruncateAt.END);
            I.setSingleLine(true);
            I.setBackgroundResource(R.drawable.bg_btn_header);
            I.setOnClickListener(cVar.f25383c);
            p0.c0(I, w.i1(cVar.f25382b).toUpperCase());
            p0.T(I);
            I.setLayoutParams(new LinearLayout.LayoutParams(-2, -1, 2.0f));
            this.N.addView(I);
        }
        if (cVarArr.length > 1) {
            View view2 = new View(getContext());
            view2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.N.addView(view2);
        }
        setCanDismiss(z10);
    }
}
