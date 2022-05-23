package ne;

import ae.j;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import ce.p0;
import eb.f;
import eb.k;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;

public class o3 extends RelativeLayout {
    public b M;
    public TextView f18303a;
    public TextView f18304b;
    public final f f18305c = new f(0, new a(), db.b.f7287b, 180);

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            o3.this.o();
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            o3.this.o();
            if (f10 == 0.0f && !o3.this.f18305c.h() && o3.this.M != null) {
                o3.this.M.b(o3.this);
            }
        }
    }

    public interface b {
        void a(o3 o3Var, float f10);

        void b(o3 o3Var);
    }

    public o3(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(0, R.id.text_title);
        int i10 = a0.i(2.0f);
        layoutParams.bottomMargin = i10;
        layoutParams.topMargin = i10;
        TextView textView = new TextView(context);
        this.f18303a = textView;
        textView.setTextColor(j.L(R.id.theme_color_snackbarUpdateText));
        this.f18303a.setTextSize(2, 15.0f);
        this.f18303a.setPadding(a0.i(12.0f), a0.i(12.0f), 0, a0.i(12.0f));
        this.f18303a.setLayoutParams(layoutParams);
        addView(this.f18303a);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        int i11 = a0.i(2.0f);
        layoutParams2.bottomMargin = i11;
        layoutParams2.topMargin = i11;
        layoutParams2.rightMargin = i11;
        layoutParams2.leftMargin = i11;
        layoutParams2.addRule(11);
        TextView textView2 = new TextView(context);
        this.f18304b = textView2;
        textView2.setPadding(a0.i(12.0f), a0.i(12.0f), a0.i(12.0f), a0.i(12.0f));
        this.f18304b.setTextColor(j.L(R.id.theme_color_snackbarUpdateAction));
        this.f18304b.setTextSize(2, 15.0f);
        this.f18304b.setLayoutParams(layoutParams2);
        p0.T(this.f18304b);
        addView(this.f18304b);
        g.j(this, R.id.theme_color_snackbarUpdate);
        setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
        setOnTouchListener(n3.f18274a);
    }

    public static boolean h(View view, MotionEvent motionEvent) {
        return true;
    }

    public void i(Runnable runnable, boolean z10, View view) {
        runnable.run();
        if (z10) {
            g(true);
        }
    }

    public o3 f(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.z8(this.f18304b, R.id.theme_color_snackbarUpdateAction);
            v4Var.z8(this.f18303a, R.id.theme_color_snackbarUpdateText);
            v4Var.t8(this);
        }
        return this;
    }

    public o3 g(boolean z10) {
        this.f18305c.p(false, z10);
        return this;
    }

    public o3 j(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.qd(this.f18303a);
            v4Var.qd(this.f18304b);
            v4Var.qd(this);
        }
        return this;
    }

    public o3 k(String str, final Runnable runnable, final boolean z10) {
        p0.c0(this.f18304b, str.toUpperCase());
        this.f18304b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                o3.this.i(runnable, z10, view);
            }
        });
        return this;
    }

    public o3 l(b bVar) {
        this.M = bVar;
        return this;
    }

    public o3 m(String str) {
        this.f18303a.setText(str);
        return this;
    }

    public o3 n(boolean z10) {
        this.f18305c.p(true, z10);
        return this;
    }

    public final void o() {
        float measuredHeight = getMeasuredHeight() * (1.0f - this.f18305c.g());
        if (getTranslationY() != measuredHeight || measuredHeight == 0.0f) {
            b bVar = this.M;
            if (bVar != null) {
                bVar.a(this, this.f18305c.g());
            }
            setTranslationY(measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o();
    }
}
