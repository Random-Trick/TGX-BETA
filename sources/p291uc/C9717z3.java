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
    public final ImageView f31595M;
    public final LinearLayout f31596N;
    public boolean f31597O;
    public AbstractC9719b f31598P;
    public AbstractC9323v4<?> f31599Q;

    public class C9718a extends ImageView {
        public C9718a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public interface AbstractC9719b {
        void mo7432a(C9717z3 z3Var);
    }

    public static class C9720c {
        public final int f31601a;
        public final int f31602b;
        public final View.OnClickListener f31603c;
        public boolean f31604d;
        public boolean f31605e;

        public C9720c(int i, int i2, View.OnClickListener onClickListener) {
            this.f31601a = i;
            this.f31602b = i2;
            this.f31603c = onClickListener;
        }

        public C9720c m7431a() {
            this.f31604d = true;
            return this;
        }

        public C9720c m7430b() {
            this.f31605e = true;
            return this;
        }
    }

    public C9717z3(Context context) {
        super(context);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37541i(36.0f)));
        C10192g.m5782i(this, R.id.theme_color_filling, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31596N = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, C4403w.m27989F1() | 48));
        addView(linearLayout);
        C9718a aVar = new C9718a(context);
        this.f31595M = aVar;
        aVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C9717z3.this.m7433E1(view);
            }
        });
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        aVar.setColorFilter(C11524j.m159q0());
        aVar.setImageResource(R.drawable.baseline_close_18);
        aVar.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(40.0f), -1, C4403w.m27989F1() | 48));
        aVar.setBackgroundResource(R.drawable.bg_btn_header);
        C1399s0.m37193a0(aVar);
        aVar.setVisibility(4);
        addView(aVar);
    }

    public void m7433E1(View view) {
        AbstractC9719b bVar = this.f31598P;
        if (bVar != null) {
            bVar.mo7432a(this);
        }
    }

    public void m7434D1(AbstractC9323v4<?> v4Var) {
        this.f31599Q = v4Var;
        if (v4Var != null) {
            v4Var.m9184q8(this.f31595M, R.id.theme_color_icon);
            v4Var.m9163t8(this);
        }
    }

    public void setCanDismiss(boolean z) {
        if (this.f31597O != z) {
            this.f31597O = z;
            this.f31595M.setVisibility(z ? 0 : 8);
        }
    }

    public void setDismissListener(AbstractC9719b bVar) {
        this.f31598P = bVar;
    }

    public void setItems(C9720c... cVarArr) {
        AbstractC9323v4<?> v4Var;
        for (int i = 0; i < this.f31596N.getChildCount(); i++) {
            View childAt = this.f31596N.getChildAt(i);
            if (!(childAt == null || (v4Var = this.f31599Q) == null)) {
                v4Var.m9180qd(childAt);
            }
        }
        this.f31596N.removeAllViews();
        if (cVarArr.length > 1) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.f31596N.addView(view);
        }
        boolean z = false;
        for (C9720c cVar : cVarArr) {
            if (!cVar.f31605e) {
                z = true;
            }
            int i2 = cVar.f31604d ? R.id.theme_color_textNegative : R.id.theme_color_textNeutral;
            TextView O = C1399s0.m37206O(getContext(), 15.0f, C11524j.m228N(i2), 17, 5);
            O.setId(cVar.f31601a);
            AbstractC9323v4<?> v4Var2 = this.f31599Q;
            if (v4Var2 != null) {
                v4Var2.m9119z8(O, i2);
            }
            O.setEllipsize(TextUtils.TruncateAt.END);
            O.setSingleLine(true);
            O.setBackgroundResource(R.drawable.bg_btn_header);
            O.setOnClickListener(cVar.f31603c);
            C1399s0.m37175j0(O, C4403w.m27869i1(cVar.f31602b).toUpperCase());
            C1399s0.m37193a0(O);
            O.setLayoutParams(new LinearLayout.LayoutParams(-2, -1, 2.0f));
            this.f31596N.addView(O);
        }
        if (cVarArr.length > 1) {
            View view2 = new View(getContext());
            view2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.75f));
            this.f31596N.addView(view2);
        }
        setCanDismiss(z);
    }
}
