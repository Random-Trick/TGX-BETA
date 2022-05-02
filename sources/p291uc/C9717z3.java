package p291uc;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1399s0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p335xd.C10192g;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9717z3 extends FrameLayoutFix {
    public final ImageView f31598M;
    public final LinearLayout f31599N;
    public boolean f31600O;
    public AbstractC9719b f31601P;
    public AbstractC9323v4<?> f31602Q;

    public class C9718a extends ImageView {
        public C9718a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37221C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public interface AbstractC9719b {
        void mo7432a(C9717z3 z3Var);
    }

    public static class C9720c {
        public final int f31604a;
        public final int f31605b;
        public final View.OnClickListener f31606c;
        public boolean f31607d;
        public boolean f31608e;

        public C9720c(int i, int i2, View.OnClickListener onClickListener) {
            this.f31604a = i;
            this.f31605b = i2;
            this.f31606c = onClickListener;
        }

        public C9720c m7431a() {
            this.f31607d = true;
            return this;
        }

        public C9720c m7430b() {
            this.f31608e = true;
            return this;
        }
    }

    public C9717z3(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37544i(36.0f)));
        C10192g.m5782i(this, R.id.theme_color_filling, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31599N = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, C4403w.m27991F1() | 48));
        addView(linearLayout);
        C9718a aVar = new C9718a(context);
        this.f31598M = aVar;
        aVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C9717z3.this.m7433E1(view);
            }
        });
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        aVar.setColorFilter(C11524j.m159q0());
        aVar.setImageResource(R.drawable.baseline_close_18);
        aVar.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(40.0f), -1, C4403w.m27991F1() | 48));
        aVar.setBackgroundResource(R.drawable.bg_btn_header);
        C1399s0.m37196a0(aVar);
        aVar.setVisibility(4);
        addView(aVar);
    }

    public void m7433E1(View view) {
        AbstractC9719b bVar = this.f31601P;
        if (bVar != null) {
            bVar.mo7432a(this);
        }
    }

    public void m7434D1(AbstractC9323v4<?> v4Var) {
        this.f31602Q = v4Var;
        if (v4Var != null) {
            v4Var.m9184q8(this.f31598M, R.id.theme_color_icon);
            v4Var.m9163t8(this);
        }
    }

    public void setCanDismiss(boolean z) {
        if (this.f31600O != z) {
            this.f31600O = z;
            this.f31598M.setVisibility(z ? 0 : 8);
        }
    }

    public void setDismissListener(AbstractC9719b bVar) {
        this.f31601P = bVar;
    }

    public void setItems(C9720c... cVarArr) {
        AbstractC9323v4<?> v4Var;
        for (int i = 0; i < this.f31599N.getChildCount(); i++) {
            View childAt = this.f31599N.getChildAt(i);
            if (!(childAt == null || (v4Var = this.f31602Q) == null)) {
                v4Var.m9180qd(childAt);
            }
        }
        this.f31599N.removeAllViews();
        if (cVarArr.length > 1) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.f31599N.addView(view);
        }
        boolean z = false;
        for (C9720c cVar : cVarArr) {
            if (!cVar.f31608e) {
                z = true;
            }
            int i2 = cVar.f31607d ? R.id.theme_color_textNegative : R.id.theme_color_textNeutral;
            TextView O = C1399s0.m37209O(getContext(), 15.0f, C11524j.m228N(i2), 17, 5);
            O.setId(cVar.f31604a);
            AbstractC9323v4<?> v4Var2 = this.f31602Q;
            if (v4Var2 != null) {
                v4Var2.m9119z8(O, i2);
            }
            O.setEllipsize(TextUtils.TruncateAt.END);
            O.setSingleLine(true);
            O.setBackgroundResource(R.drawable.bg_btn_header);
            O.setOnClickListener(cVar.f31606c);
            C1399s0.m37178j0(O, C4403w.m27871i1(cVar.f31605b).toUpperCase());
            C1399s0.m37196a0(O);
            O.setLayoutParams(new LinearLayout.LayoutParams(-2, -1, 2.0f));
            this.f31599N.addView(O);
        }
        if (cVarArr.length > 1) {
            View view2 = new View(getContext());
            view2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.f31599N.addView(view2);
        }
        setCanDismiss(z);
    }
}
