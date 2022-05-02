package p238qc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.thunderdog.challegram.R;
import p208oc.C7841m;
import p208oc.C7844p;
import p208oc.C7847s;
import p224pc.C8105a;
import p364zd.C11524j;

public class C8317f extends FrameLayout {
    public TextView f26814M;
    public TextView f26815N;
    public ImageView f26816O;
    public C7847s f26817P;
    public boolean f26821T;
    public boolean f26822U;
    public boolean f26823V;
    public boolean f26825a;
    public Drawable f26826a0;
    public LinearLayout f26827b;
    public Drawable f26828b0;
    public C8320c[] f26829c;
    public SimpleDateFormat f26818Q = new SimpleDateFormat("E, ");
    public SimpleDateFormat f26819R = new SimpleDateFormat("MMM dd");
    public SimpleDateFormat f26820S = new SimpleDateFormat(" HH:mm");
    public boolean f26824W = true;
    public Runnable f26830c0 = new RunnableC8318a();

    public class RunnableC8318a implements Runnable {
        public RunnableC8318a() {
        }

        @Override
        public void run() {
            C8317f.this.f26816O.animate().setDuration(120L).alpha(0.0f);
            C8317f.this.f26817P.animate().setListener(null).start();
            if (C8317f.this.f26817P.getVisibility() != 0) {
                C8317f.this.f26817P.setVisibility(0);
                C8317f.this.f26817P.setAlpha(0.0f);
            }
            C8317f.this.f26817P.animate().setDuration(120L).alpha(1.0f).start();
        }
    }

    public class C8319b extends AnimatorListenerAdapter {
        public C8319b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C8317f.this.f26817P.setVisibility(8);
        }
    }

    public class C8320c {
        public final TextView f26833a;
        public final TextView f26834b;
        public TextView f26835c;
        public final LinearLayout f26836d;

        public C8320c() {
            LinearLayout linearLayout = new LinearLayout(C8317f.this.getContext());
            this.f26836d = linearLayout;
            linearLayout.setPadding(C1357a0.m37541i(4.0f), C1357a0.m37541i(2.0f), C1357a0.m37541i(4.0f), C1357a0.m37541i(2.0f));
            if (C8317f.this.f26822U) {
                TextView textView = new TextView(C8317f.this.getContext());
                this.f26835c = textView;
                linearLayout.addView(textView);
                this.f26835c.getLayoutParams().width = C1357a0.m37541i(36.0f);
                this.f26835c.setVisibility(8);
                this.f26835c.setTypeface(C1389o.m37260i());
                this.f26835c.setTextSize(13.0f);
            }
            TextView textView2 = new TextView(C8317f.this.getContext());
            this.f26834b = textView2;
            linearLayout.addView(textView2);
            textView2.getLayoutParams().width = C1357a0.m37541i(C8317f.this.f26822U ? 80.0f : 96.0f);
            TextView textView3 = new TextView(C8317f.this.getContext());
            this.f26833a = textView3;
            linearLayout.addView(textView3, C7844p.m14880b(-1, -2));
            textView2.setGravity(8388611);
            textView3.setGravity(8388613);
            textView3.setTypeface(C1389o.m37260i());
            textView3.setTextSize(13.0f);
            textView3.setMinEms(4);
            textView3.setMaxEms(4);
            textView2.setTextSize(13.0f);
        }
    }

    public C8317f(Context context) {
        super(context);
        setPadding(C1357a0.m37541i(8.0f), C1357a0.m37541i(8.0f), C1357a0.m37541i(8.0f), C1357a0.m37541i(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f26827b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f26814M = textView;
        textView.setTextSize(14.0f);
        this.f26814M.setTypeface(C1389o.m37260i());
        TextView textView2 = new TextView(context);
        this.f26815N = textView2;
        textView2.setTextSize(14.0f);
        this.f26815N.setTypeface(C1389o.m37260i());
        ImageView imageView = new ImageView(context);
        this.f26816O = imageView;
        imageView.setImageResource(R.drawable.round_keyboard_arrow_right_18);
        C7847s sVar = new C7847s(context);
        this.f26817P = sVar;
        sVar.setSize(C1357a0.m37541i(12.0f));
        this.f26817P.setStrokeWidth(C1357a0.m37541i(0.5f));
        this.f26817P.setVisibility(8);
        addView(this.f26827b, C7844p.m14881a(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(this.f26814M, C7844p.m14881a(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.f26815N, C7844p.m14881a(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.f26816O, C7844p.m14881a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(this.f26817P, C7844p.m14881a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        m12887e();
    }

    public final String m12890b(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final String m12889c(Date date) {
        if (this.f26821T) {
            return m12890b(this.f26819R.format(date));
        }
        return m12890b(this.f26818Q.format(date)) + m12890b(this.f26819R.format(date));
    }

    public String m12888d(int i) {
        float f = i;
        if (i < 10000) {
            return String.format("%d", Integer.valueOf(i));
        }
        int i2 = 0;
        while (f >= 10000.0f && i2 < C8316e.f26808f.length - 1) {
            f /= 1000.0f;
            i2++;
        }
        return String.format("%.2f", Float.valueOf(f)) + C8316e.f26808f[i2];
    }

    public void m12887e() {
        this.f26814M.setTextColor(C11524j.m217S0());
        this.f26815N.setTextColor(C11524j.m217S0());
        this.f26816O.setColorFilter(C11524j.m159q0());
        this.f26817P.setProgressColor(C11524j.m159q0());
        this.f26826a0 = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        this.f26828b0 = C11524j.m158r(C1357a0.m37541i(4.0f), C11524j.m228N(R.id.theme_color_filling), C11524j.m228N(R.id.theme_color_fillingPressed), -16777216);
        C7841m mVar = new C7841m(this.f26826a0, this.f26828b0, C1357a0.m37541i(3.0f), C1357a0.m37541i(3.0f));
        mVar.m14889a(true);
        setBackground(mVar);
    }

    public void m12886f(int i, long j, ArrayList<C8321g> arrayList, boolean z) {
        TextView textView;
        int length = this.f26829c.length;
        boolean z2 = true;
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(100L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(100L));
            transitionSet.setOrdering(1);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        int i2 = 0;
        if (this.f26825a) {
            this.f26814M.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            this.f26814M.setText(m12889c(new Date(j)));
            if (this.f26821T) {
                this.f26815N.setText(this.f26820S.format(Long.valueOf(j)));
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (arrayList.get(i4).f26851n) {
                i3 += arrayList.get(i4).f26838a.f26329a[i];
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            C8320c cVar = this.f26829c[i5];
            if (!arrayList.get(i5).f26851n) {
                cVar.f26836d.setVisibility(8);
            } else {
                C8105a.C8106a aVar = arrayList.get(i5).f26838a;
                if (cVar.f26836d.getMeasuredHeight() == 0) {
                    cVar.f26836d.requestLayout();
                }
                cVar.f26836d.setVisibility(0);
                cVar.f26833a.setText(m12888d(aVar.f26329a[i]));
                cVar.f26834b.setText(aVar.f26332d);
                cVar.f26833a.setTextColor(C11524j.m141z0() ? aVar.f26337i : aVar.f26336h);
                cVar.f26834b.setTextColor(C11524j.m217S0());
                if (this.f26822U && (textView = cVar.f26835c) != null) {
                    textView.setVisibility(0);
                    cVar.f26835c.setTextColor(C11524j.m217S0());
                    float f = arrayList.get(i5).f26838a.f26329a[i] / i3;
                    if (f >= 0.1f || f == 0.0f) {
                        cVar.f26835c.setText(String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(Math.round(f * 100.0f)), "%"));
                    } else {
                        cVar.f26835c.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f * 100.0f), "%"));
                    }
                }
            }
        }
        if (this.f26823V) {
            if (i3 <= 0) {
                z2 = false;
            }
            this.f26824W = z2;
            ImageView imageView = this.f26816O;
            if (i3 <= 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            return;
        }
        this.f26824W = false;
        this.f26816O.setVisibility(8);
    }

    public void m12885g(boolean z, boolean z2) {
        if (z) {
            C1379j0.m37332e0(this.f26830c0, 300L);
            return;
        }
        C1379j0.m37333e(this.f26830c0);
        if (z2) {
            this.f26817P.setVisibility(8);
            return;
        }
        this.f26816O.animate().setDuration(80L).alpha(1.0f).start();
        if (this.f26817P.getVisibility() == 0) {
            this.f26817P.animate().setDuration(80L).alpha(0.0f).setListener(new C8319b()).start();
        }
    }

    public void setSize(int i) {
        this.f26827b.removeAllViews();
        this.f26829c = new C8320c[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f26829c[i2] = new C8320c();
            this.f26827b.addView(this.f26829c[i2].f26836d);
        }
    }
}
