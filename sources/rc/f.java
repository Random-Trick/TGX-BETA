package rc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.thunderdog.challegram.R;
import pc.m;
import pc.p;
import pc.s;
import qc.a;

public class f extends FrameLayout {
    public TextView M;
    public TextView N;
    public ImageView O;
    public s P;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean f21839a;
    public Drawable f21840a0;
    public LinearLayout f21841b;
    public Drawable f21842b0;
    public c[] f21843c;
    public SimpleDateFormat Q = new SimpleDateFormat("E, ");
    public SimpleDateFormat R = new SimpleDateFormat("MMM dd");
    public SimpleDateFormat S = new SimpleDateFormat(" HH:mm");
    public boolean W = true;
    public Runnable f21844c0 = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            f.this.O.animate().setDuration(120L).alpha(0.0f);
            f.this.P.animate().setListener(null).start();
            if (f.this.P.getVisibility() != 0) {
                f.this.P.setVisibility(0);
                f.this.P.setAlpha(0.0f);
            }
            f.this.P.animate().setDuration(120L).alpha(1.0f).start();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            f.this.P.setVisibility(8);
        }
    }

    public class c {
        public final TextView f21847a;
        public final TextView f21848b;
        public TextView f21849c;
        public final LinearLayout f21850d;

        public c() {
            LinearLayout linearLayout = new LinearLayout(f.this.getContext());
            this.f21850d = linearLayout;
            linearLayout.setPadding(a0.i(4.0f), a0.i(2.0f), a0.i(4.0f), a0.i(2.0f));
            if (f.this.U) {
                TextView textView = new TextView(f.this.getContext());
                this.f21849c = textView;
                linearLayout.addView(textView);
                this.f21849c.getLayoutParams().width = a0.i(36.0f);
                this.f21849c.setVisibility(8);
                this.f21849c.setTypeface(o.i());
                this.f21849c.setTextSize(13.0f);
            }
            TextView textView2 = new TextView(f.this.getContext());
            this.f21848b = textView2;
            linearLayout.addView(textView2);
            textView2.getLayoutParams().width = a0.i(f.this.U ? 80.0f : 96.0f);
            TextView textView3 = new TextView(f.this.getContext());
            this.f21847a = textView3;
            linearLayout.addView(textView3, p.b(-1, -2));
            textView2.setGravity(8388611);
            textView3.setGravity(8388613);
            textView3.setTypeface(o.i());
            textView3.setTextSize(13.0f);
            textView3.setMinEms(4);
            textView3.setMaxEms(4);
            textView2.setTextSize(13.0f);
        }
    }

    public f(Context context) {
        super(context);
        setPadding(a0.i(8.0f), a0.i(8.0f), a0.i(8.0f), a0.i(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f21841b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.M = textView;
        textView.setTextSize(14.0f);
        this.M.setTypeface(o.i());
        TextView textView2 = new TextView(context);
        this.N = textView2;
        textView2.setTextSize(14.0f);
        this.N.setTypeface(o.i());
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        imageView.setImageResource(R.drawable.round_keyboard_arrow_right_18);
        s sVar = new s(context);
        this.P = sVar;
        sVar.setSize(a0.i(12.0f));
        this.P.setStrokeWidth(a0.i(0.5f));
        this.P.setVisibility(8);
        addView(this.f21841b, p.a(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(this.M, p.a(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.N, p.a(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.O, p.a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(this.P, p.a(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        e();
    }

    public final String b(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final String c(Date date) {
        if (this.T) {
            return b(this.R.format(date));
        }
        return b(this.Q.format(date)) + b(this.R.format(date));
    }

    public String d(int i10) {
        float f10 = i10;
        if (i10 < 10000) {
            return String.format("%d", Integer.valueOf(i10));
        }
        int i11 = 0;
        while (f10 >= 10000.0f && i11 < e.f21833f.length - 1) {
            f10 /= 1000.0f;
            i11++;
        }
        return String.format("%.2f", Float.valueOf(f10)) + e.f21833f[i11];
    }

    public void e() {
        this.M.setTextColor(j.P0());
        this.N.setTextColor(j.P0());
        this.O.setColorFilter(j.o0());
        this.P.setProgressColor(j.o0());
        this.f21840a0 = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        this.f21842b0 = j.q(a0.i(4.0f), j.L(R.id.theme_color_filling), j.L(R.id.theme_color_fillingPressed), -16777216);
        m mVar = new m(this.f21840a0, this.f21842b0, a0.i(3.0f), a0.i(3.0f));
        mVar.a(true);
        setBackground(mVar);
    }

    public void f(int i10, long j10, ArrayList<g> arrayList, boolean z10) {
        TextView textView;
        int length = this.f21843c.length;
        boolean z11 = true;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(100L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(100L));
            transitionSet.setOrdering(1);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        int i11 = 0;
        if (this.f21839a) {
            this.M.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            this.M.setText(c(new Date(j10)));
            if (this.T) {
                this.N.setText(this.S.format(Long.valueOf(j10)));
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (arrayList.get(i13).f21865n) {
                i12 += arrayList.get(i13).f21852a.f21515a[i10];
            }
        }
        for (int i14 = 0; i14 < length; i14++) {
            c cVar = this.f21843c[i14];
            if (!arrayList.get(i14).f21865n) {
                cVar.f21850d.setVisibility(8);
            } else {
                a.C0200a aVar = arrayList.get(i14).f21852a;
                if (cVar.f21850d.getMeasuredHeight() == 0) {
                    cVar.f21850d.requestLayout();
                }
                cVar.f21850d.setVisibility(0);
                cVar.f21847a.setText(d(aVar.f21515a[i10]));
                cVar.f21848b.setText(aVar.f21518d);
                cVar.f21847a.setTextColor(j.x0() ? aVar.f21523i : aVar.f21522h);
                cVar.f21848b.setTextColor(j.P0());
                if (this.U && (textView = cVar.f21849c) != null) {
                    textView.setVisibility(0);
                    cVar.f21849c.setTextColor(j.P0());
                    float f10 = arrayList.get(i14).f21852a.f21515a[i10] / i12;
                    if (f10 >= 0.1f || f10 == 0.0f) {
                        cVar.f21849c.setText(String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(Math.round(f10 * 100.0f)), "%"));
                    } else {
                        cVar.f21849c.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f10 * 100.0f), "%"));
                    }
                }
            }
        }
        if (this.V) {
            if (i12 <= 0) {
                z11 = false;
            }
            this.W = z11;
            ImageView imageView = this.O;
            if (i12 <= 0) {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            return;
        }
        this.W = false;
        this.O.setVisibility(8);
    }

    public void g(boolean z10, boolean z11) {
        if (z10) {
            j0.e0(this.f21844c0, 300L);
            return;
        }
        j0.e(this.f21844c0);
        if (z11) {
            this.P.setVisibility(8);
            return;
        }
        this.O.animate().setDuration(80L).alpha(1.0f).start();
        if (this.P.getVisibility() == 0) {
            this.P.animate().setDuration(80L).alpha(0.0f).setListener(new b()).start();
        }
    }

    public void setSize(int i10) {
        this.f21841b.removeAllViews();
        this.f21843c = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21843c[i11] = new c();
            this.f21841b.addView(this.f21843c[i11].f21850d);
        }
    }
}
