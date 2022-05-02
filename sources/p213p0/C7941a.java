package p213p0;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import p227q0.C8117a;

public class C7941a extends C8117a {
    public static AbstractC7943b f25836d;

    public class RunnableC7942a implements Runnable {
        public final Activity f25837a;

        public RunnableC7942a(Activity activity) {
            this.f25837a = activity;
        }

        @Override
        public void run() {
            if (!this.f25837a.isFinishing() && !C7944b.m14016i(this.f25837a)) {
                this.f25837a.recreate();
            }
        }
    }

    public interface AbstractC7943b {
        boolean m14025a(Activity activity, int i, int i2, Intent intent);
    }

    public static void m14028n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static AbstractC7943b m14027o() {
        return f25836d;
    }

    public static void m14026p(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new RunnableC7942a(activity));
        } else if (!C7944b.m14016i(activity)) {
            activity.recreate();
        }
    }
}
