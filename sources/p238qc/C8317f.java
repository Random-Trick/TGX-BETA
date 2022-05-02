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
    public TextView f26817M;
    public TextView f26818N;
    public ImageView f26819O;
    public C7847s f26820P;
    public boolean f26824T;
    public boolean f26825U;
    public boolean f26826V;
    public boolean f26828a;
    public Drawable f26829a0;
    public LinearLayout f26830b;
    public Drawable f26831b0;
    public C8320c[] f26832c;
    public SimpleDateFormat f26821Q = new SimpleDateFormat("E, ");
    public SimpleDateFormat f26822R = new SimpleDateFormat("MMM dd");
    public SimpleDateFormat f26823S = new SimpleDateFormat(" HH:mm");
    public boolean f26827W = true;
    public Runnable f26833c0 = new RunnableC8318a();

    public class RunnableC8318a implements Runnable {
        public RunnableC8318a() {
        }

        @Override
        public void run() {
            C8317f.this.f26819O.animate().setDuration(120L).alpha(0.0f);
            C8317f.this.f26820P.animate().setListener(null).start();
            if (C8317f.this.f26820P.getVisibility() != 0) {
                C8317f.this.f26820P.setVisibility(0);
                C8317f.this.f26820P.setAlpha(0.0f);
            }
            C8317f.this.f26820P.animate().setDuration(120L).alpha(1.0f).start();
        }
    }

    public class C8319b extends AnimatorListenerAdapter {
        public C8319b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C8317f.this.f26820P.setVisibility(8);
        }
    }

    public class C8320c {
        public final TextView f26836a;
        public final TextView f26837b;
        public TextView f26838c;
        public final LinearLayout f26839d;

        public C8320c() {
            LinearLayout linearLayout = new LinearLayout(C8317f.this.getContext());
            this.f26839d = linearLayout;
            linearLayout.setPadding(C1357a0.m37544i(4.0f), C1357a0.m37544i(2.0f), C1357a0.m37544i(4.0f), C1357a0.m37544i(2.0f));
            if (C8317f.this.f26825U) {
                TextView textView = new TextView(C8317f.this.getContext());
                this.f26838c = textView;
                linearLayout.addView(textView);
                this.f26838c.getLayoutParams().width = C1357a0.m37544i(36.0f);
                this.f26838c.setVisibility(8);
                this.f26838c.setTypeface(C1389o.m37263i());
                this.f26838c.setTextSize(13.0f);
            }
            TextView textView2 = new TextView(C8317f.this.getContext());
            this.f26837b = textView2;
            linearLayout.addView(textView2);
            textView2.getLayoutParams().width = C1357a0.m37544i(C8317f.this.f26825U ? 80.0f : 96.0f);
            TextView textView3 = new TextView(C8317f.this.getContext());
            this.f26836a = textView3;
            linearLayout.addView(textView3, C7844p.m14880b(-1, -2));
            textView2.setGravity(8388611);
            textView3.setGravity(8388613);
            textView3.setTypeface(C1389o.m37263i());
            textView3.setTextSize(13.0f);
            textView3.setMinEms(4);
            textView3.setMaxEms(4);
            textView2.setTextSize(13.0f);
        }
    }

    public C8317f(Context context) {
        super(context);
        setPadding(C1357a0.m37544i(8.0f), C1357a0.m37544i(8.0f), C1357a0.m37544i(8.0f), C1357a0.m37544i(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f26830b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f26817M = textView;
        textView.setTextSize(14.0f);
        this.f26817M.setTypeface(C1389o.m37263i());
        TextView textView2 = new TextView(context);
        this.f26818N = textView2;
        textView2.setTextSize(14.0f);
        this.f26818N.setTypeface(C1389o.m37263i());
        ImageView imageView = new ImageView(context);
        this.f26819O = imageView;
        imageView.setImageResource(R.drawable.round_keyboard_arrow_right_18);
        C7847s sVar = new C7847s(context);
        this.f26820P = sVar;
        sVar.setSize(C1357a0.m37544i(12.0f));
        this.f26820P.setStrokeWidth(C1357a0.m37544i(0.5f));
        this.f26820P.setVisibility(8);
        addView(this.f26830b, C7844p.m14881a(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(this.f26817M, C7844p.m14881a(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.f26818N, C7844p.m14881a(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.f26819O, C7844p.m14881a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(this.f26820P, C7844p.m14881a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        m12886e();
    }

    public final String m12889b(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final String m12888c(Date date) {
        if (this.f26824T) {
            return m12889b(this.f26822R.format(date));
        }
        return m12889b(this.f26821Q.format(date)) + m12889b(this.f26822R.format(date));
    }

    public String m12887d(int i) {
        float f = i;
        if (i < 10000) {
            return String.format("%d", Integer.valueOf(i));
        }
        int i2 = 0;
        while (f >= 10000.0f && i2 < C8316e.f26811f.length - 1) {
            f /= 1000.0f;
            i2++;
        }
        return String.format("%.2f", Float.valueOf(f)) + C8316e.f26811f[i2];
    }

    public void m12886e() {
        this.f26817M.setTextColor(C11524j.m217S0());
        this.f26818N.setTextColor(C11524j.m217S0());
        this.f26819O.setColorFilter(C11524j.m159q0());
        this.f26820P.setProgressColor(C11524j.m159q0());
        this.f26829a0 = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        this.f26831b0 = C11524j.m158r(C1357a0.m37544i(4.0f), C11524j.m228N(R.id.theme_color_filling), C11524j.m228N(R.id.theme_color_fillingPressed), -16777216);
        C7841m mVar = new C7841m(this.f26829a0, this.f26831b0, C1357a0.m37544i(3.0f), C1357a0.m37544i(3.0f));
        mVar.m14889a(true);
        setBackground(mVar);
    }

    public void m12885f(int i, long j, ArrayList<C8321g> arrayList, boolean z) {
        TextView textView;
        int length = this.f26832c.length;
        boolean z2 = true;
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(100L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(100L));
            transitionSet.setOrdering(1);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        int i2 = 0;
        if (this.f26828a) {
            this.f26817M.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            this.f26817M.setText(m12888c(new Date(j)));
            if (this.f26824T) {
                this.f26818N.setText(this.f26823S.format(Long.valueOf(j)));
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (arrayList.get(i4).f26854n) {
                i3 += arrayList.get(i4).f26841a.f26332a[i];
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            C8320c cVar = this.f26832c[i5];
            if (!arrayList.get(i5).f26854n) {
                cVar.f26839d.setVisibility(8);
            } else {
                C8105a.C8106a aVar = arrayList.get(i5).f26841a;
                if (cVar.f26839d.getMeasuredHeight() == 0) {
                    cVar.f26839d.requestLayout();
                }
                cVar.f26839d.setVisibility(0);
                cVar.f26836a.setText(m12887d(aVar.f26332a[i]));
                cVar.f26837b.setText(aVar.f26335d);
                cVar.f26836a.setTextColor(C11524j.m141z0() ? aVar.f26340i : aVar.f26339h);
                cVar.f26837b.setTextColor(C11524j.m217S0());
                if (this.f26825U && (textView = cVar.f26838c) != null) {
                    textView.setVisibility(0);
                    cVar.f26838c.setTextColor(C11524j.m217S0());
                    float f = arrayList.get(i5).f26841a.f26332a[i] / i3;
                    if (f >= 0.1f || f == 0.0f) {
                        cVar.f26838c.setText(String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(Math.round(f * 100.0f)), "%"));
                    } else {
                        cVar.f26838c.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f * 100.0f), "%"));
                    }
                }
            }
        }
        if (this.f26826V) {
            if (i3 <= 0) {
                z2 = false;
            }
            this.f26827W = z2;
            ImageView imageView = this.f26819O;
            if (i3 <= 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            return;
        }
        this.f26827W = false;
        this.f26819O.setVisibility(8);
    }

    public void m12884g(boolean z, boolean z2) {
        if (z) {
            C1379j0.m37335e0(this.f26833c0, 300L);
            return;
        }
        C1379j0.m37336e(this.f26833c0);
        if (z2) {
            this.f26820P.setVisibility(8);
            return;
        }
        this.f26819O.animate().setDuration(80L).alpha(1.0f).start();
        if (this.f26820P.getVisibility() == 0) {
            this.f26820P.animate().setDuration(80L).alpha(0.0f).setListener(new C8319b()).start();
        }
    }

    public void setSize(int i) {
        this.f26830b.removeAllViews();
        this.f26832c = new C8320c[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f26832c[i2] = new C8320c();
            this.f26830b.addView(this.f26832c[i2].f26839d);
        }
    }
}
