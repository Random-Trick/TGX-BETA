package ad;

import ae.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ce.y;
import gd.w;
import ie.g0;
import ie.h0;
import ne.j2;
import oc.v0;
import org.thunderdog.challegram.R;
import ud.v1;
import ud.v4;
import zd.hj;

public class a0 {

    public class a implements h0 {
        public final Runnable f746a;
        public final Runnable f747b;
        public final v4 f748c;

        public a(Runnable runnable, Runnable runnable2, v4 v4Var) {
            this.f746a = runnable;
            this.f747b = runnable2;
            this.f748c = v4Var;
        }

        @Override
        public boolean P() {
            return true;
        }

        @Override
        public Object a2(int i10) {
            return g0.b(this, i10);
        }

        @Override
        public boolean r3(View view, int i10) {
            int id2 = view.getId();
            if (id2 == R.id.btn_cancel) {
                this.f747b.run();
                return true;
            } else if (id2 == R.id.btn_done) {
                this.f746a.run();
                return true;
            } else if (id2 != R.id.btn_privacyPolicy) {
                return true;
            } else {
                this.f747b.run();
                this.f748c.c().hd().E7(this.f748c, w.u1(R.string.url_privacyPolicy, new Object[0]), new hj.q().i());
                return true;
            }
        }
    }

    public static void c(j2 j2Var, int i10) {
        if (j2Var.getChildAt(1) instanceof v1) {
            ImageView imageView = new ImageView(j2Var.getContext());
            imageView.setBackgroundColor(j.L(R.id.theme_color_fillingPositive));
            imageView.setImageResource(i10);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(y.z(j.L(R.id.theme_color_fillingPositiveContent)));
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, ce.a0.i(132.0f)));
            ((v1) j2Var.getChildAt(1)).addView(imageView, 1);
        }
    }

    public static void d() {
    }

    public static Object e(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 1) {
            return w.f2(z10);
        }
        return null;
    }

    public static void f(org.thunderdog.challegram.a aVar, CharSequence charSequence, CharSequence charSequence2, Runnable runnable, Runnable runnable2) {
        CharSequence h12 = w.h1(R.string.format_doubleLines, y.f790a, charSequence, charSequence2);
        v4<?> F = aVar.Q1().F();
        if (F == null) {
            runnable2.run();
        } else {
            c(F.ee(h12, new int[]{R.id.btn_done, R.id.btn_privacyPolicy, R.id.btn_cancel}, new String[]{w.i1(R.string.Continue), w.i1(R.string.PrivacyPolicy), w.i1(R.string.Cancel)}, new int[]{3, 1, 1}, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_policy_24, R.drawable.baseline_cancel_24}, new a(runnable2, runnable, F)), R.drawable.baseline_location_on_48);
        }
    }

    public static void g(org.thunderdog.challegram.a aVar, String str, Runnable runnable, Runnable runnable2) {
        String str2 = "@" + str;
        f(aVar, w.m1(R.string.LocationAlertBot, str2), w.m1(R.string.LocationAlertBotDisclaimer, str2), runnable, runnable2);
    }

    public static void h(org.thunderdog.challegram.a aVar, boolean z10, Runnable runnable, Runnable runnable2) {
        boolean z11 = true;
        boolean z12 = aVar.o0(z10) != 0;
        if (!z10 || !fd.a.f11897s ? !(v0.L2("android.permission.ACCESS_FINE_LOCATION") || z12) : !((v0.L2("android.permission.ACCESS_BACKGROUND_LOCATION") || v0.L2("android.permission.ACCESS_FINE_LOCATION")) && z12)) {
            z11 = false;
        }
        if (z11) {
            String i12 = w.i1(z10 ? R.string.LocationAlertLiveLocation : R.string.LocationAlertLocation);
            String i13 = w.i1(R.string.LocationAlertLocationDisclaimer);
            if (!z10) {
                runnable = z.f791a;
            }
            f(aVar, i12, i13, runnable, runnable2);
            return;
        }
        runnable2.run();
    }
}
