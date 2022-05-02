package me;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1399s0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p335xd.C10192g;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6986o3 extends RelativeLayout {
    public AbstractC6988b f22150M;
    public TextView f22151a;
    public TextView f22152b;
    public final C3940f f22153c = new C3940f(0, new C6987a(), C2057b.f7280b, 180);

    public class C6987a implements C3950k.AbstractC3952b {
        public C6987a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            C6986o3.this.m18160o();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C6986o3.this.m18160o();
            if (f == 0.0f && !C6986o3.this.f22153c.m29585h() && C6986o3.this.f22150M != null) {
                C6986o3.this.f22150M.mo18159a(C6986o3.this);
            }
        }
    }

    public interface AbstractC6988b {
        void mo18159a(C6986o3 o3Var);

        void mo18158b(C6986o3 o3Var, float f);
    }

    public C6986o3(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(0, R.id.text_title);
        int i = C1357a0.m37544i(2.0f);
        layoutParams.bottomMargin = i;
        layoutParams.topMargin = i;
        TextView textView = new TextView(context);
        this.f22151a = textView;
        textView.setTextColor(C11524j.m228N(R.id.theme_color_snackbarUpdateText));
        this.f22151a.setTextSize(2, 15.0f);
        this.f22151a.setPadding(C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f), 0, C1357a0.m37544i(12.0f));
        this.f22151a.setLayoutParams(layoutParams);
        addView(this.f22151a);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = C1357a0.m37544i(2.0f);
        layoutParams2.bottomMargin = i2;
        layoutParams2.topMargin = i2;
        layoutParams2.rightMargin = i2;
        layoutParams2.leftMargin = i2;
        layoutParams2.addRule(11);
        TextView textView2 = new TextView(context);
        this.f22152b = textView2;
        textView2.setPadding(C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f));
        this.f22152b.setTextColor(C11524j.m228N(R.id.theme_color_snackbarUpdateAction));
        this.f22152b.setTextSize(2, 15.0f);
        this.f22152b.setLayoutParams(layoutParams2);
        C1399s0.m37196a0(this.f22152b);
        addView(this.f22152b);
        C10192g.m5781j(this, R.id.theme_color_snackbarUpdate);
        setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
        setOnTouchListener(View$OnTouchListenerC6978n3.f22103a);
    }

    public static boolean m18167h(View view, MotionEvent motionEvent) {
        return true;
    }

    public void m18166i(Runnable runnable, boolean z, View view) {
        runnable.run();
        if (z) {
            m18168g(true);
        }
    }

    public C6986o3 m18169f(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9119z8(this.f22152b, R.id.theme_color_snackbarUpdateAction);
            v4Var.m9119z8(this.f22151a, R.id.theme_color_snackbarUpdateText);
            v4Var.m9163t8(this);
        }
        return this;
    }

    public C6986o3 m18168g(boolean z) {
        this.f22153c.m29577p(false, z);
        return this;
    }

    public C6986o3 m18165j(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9180qd(this.f22151a);
            v4Var.m9180qd(this.f22152b);
            v4Var.m9180qd(this);
        }
        return this;
    }

    public C6986o3 m18164k(String str, final Runnable runnable, final boolean z) {
        C1399s0.m37178j0(this.f22152b, str.toUpperCase());
        this.f22152b.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C6986o3.this.m18166i(runnable, z, view);
            }
        });
        return this;
    }

    public C6986o3 m18163l(AbstractC6988b bVar) {
        this.f22150M = bVar;
        return this;
    }

    public C6986o3 m18162m(String str) {
        this.f22151a.setText(str);
        return this;
    }

    public C6986o3 m18161n(boolean z) {
        this.f22153c.m29577p(true, z);
        return this;
    }

    public final void m18160o() {
        float measuredHeight = getMeasuredHeight() * (1.0f - this.f22153c.m29586g());
        if (getTranslationY() != measuredHeight || measuredHeight == 0.0f) {
            AbstractC6988b bVar = this.f22150M;
            if (bVar != null) {
                bVar.mo18158b(this, this.f22153c.m29586g());
            }
            setTranslationY(measuredHeight);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m18160o();
    }
}
