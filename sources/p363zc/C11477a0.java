package p363zc;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1410y;
import me.C6924j2;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p067ed.C4183a;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9319v1;

public class C11477a0 {

    public class C11478a implements AbstractC5117h0 {
        public final Runnable f36460a;
        public final Runnable f36461b;
        public final AbstractC9323v4 f36462c;

        public C11478a(Runnable runnable, Runnable runnable2, AbstractC9323v4 v4Var) {
            this.f36460a = runnable;
            this.f36461b = runnable2;
            this.f36462c = v4Var;
        }

        @Override
        public boolean mo493A3(View view, int i) {
            int id2 = view.getId();
            if (id2 == R.id.btn_cancel) {
                this.f36461b.run();
                return true;
            } else if (id2 == R.id.btn_done) {
                this.f36460a.run();
                return true;
            } else if (id2 != R.id.btn_privacyPolicy) {
                return true;
            } else {
                this.f36461b.run();
                this.f36462c.mo4348c().m2485dd().m3858E7(this.f36462c, C4403w.m27823u1(R.string.url_privacyPolicy, new Object[0]), new HandlerC10770jj.C10788q().m3322i());
                return true;
            }
        }

        @Override
        public boolean mo492Q() {
            return true;
        }

        @Override
        public Object mo491b2(int i) {
            return C5115g0.m23935b(this, i);
        }
    }

    public static void m499c(C6924j2 j2Var, int i) {
        if (j2Var.getChildAt(1) instanceof C9319v1) {
            ImageView imageView = new ImageView(j2Var.getContext());
            imageView.setBackgroundColor(C11524j.m228N(R.id.theme_color_fillingPositive));
            imageView.setImageResource(i);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(C1410y.m37004z(C11524j.m228N(R.id.theme_color_fillingPositiveContent)));
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37544i(132.0f)));
            ((C9319v1) j2Var.getChildAt(1)).addView(imageView, 1);
        }
    }

    public static void m498d() {
    }

    public static Object m497e(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 1) {
            return C4403w.m27882f2(z);
        }
        return null;
    }

    public static void m496f(AbstractView$OnTouchListenerC7889a aVar, CharSequence charSequence, CharSequence charSequence2, Runnable runnable, Runnable runnable2) {
        CharSequence h1 = C4403w.m27875h1(R.string.format_doubleLines, C11506y.f36524a, charSequence, charSequence2);
        AbstractC9323v4<?> F = aVar.m14551P1().m9762F();
        if (F == null) {
            runnable2.run();
        } else {
            m499c(F.m9261ee(h1, new int[]{R.id.btn_done, R.id.btn_privacyPolicy, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Continue), C4403w.m27871i1(R.string.PrivacyPolicy), C4403w.m27871i1(R.string.Cancel)}, new int[]{3, 1, 1}, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_policy_24, R.drawable.baseline_cancel_24}, new C11478a(runnable2, runnable, F)), R.drawable.baseline_location_on_48);
        }
    }

    public static void m495g(AbstractView$OnTouchListenerC7889a aVar, String str, Runnable runnable, Runnable runnable2) {
        String str2 = "@" + str;
        m496f(aVar, C4403w.m27855m1(R.string.LocationAlertBot, str2), C4403w.m27855m1(R.string.LocationAlertBotDisclaimer, str2), runnable, runnable2);
    }

    public static void m494h(AbstractView$OnTouchListenerC7889a aVar, boolean z, Runnable runnable, Runnable runnable2) {
        boolean z2 = true;
        boolean z3 = aVar.m14466m0(z) != 0;
        if (!z || !C4183a.f14101s ? !(C7389v0.m16711L2("android.permission.ACCESS_FINE_LOCATION") || z3) : !((C7389v0.m16711L2("android.permission.ACCESS_BACKGROUND_LOCATION") || C7389v0.m16711L2("android.permission.ACCESS_FINE_LOCATION")) && z3)) {
            z2 = false;
        }
        if (z2) {
            String i1 = C4403w.m27871i1(z ? R.string.LocationAlertLiveLocation : R.string.LocationAlertLocation);
            String i12 = C4403w.m27871i1(R.string.LocationAlertLocationDisclaimer);
            if (!z) {
                runnable = RunnableC11507z.f36525a;
            }
            m496f(aVar, i1, i12, runnable, runnable2);
            return;
        }
        runnable2.run();
    }
}
