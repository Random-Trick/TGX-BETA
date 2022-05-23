package p0;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;

public class a extends q0.a {
    public static b f20238c;

    public class RunnableC0175a implements Runnable {
        public final Activity f20239a;

        public RunnableC0175a(Activity activity) {
            this.f20239a = activity;
        }

        @Override
        public void run() {
            if (!this.f20239a.isFinishing() && !p0.b.i(this.f20239a)) {
                this.f20239a.recreate();
            }
        }
    }

    public interface b {
        boolean a(Activity activity, int i10, int i11, Intent intent);
    }

    public static void l(Activity activity) {
        activity.finishAffinity();
    }

    public static b m() {
        return f20238c;
    }

    public static void n(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            activity.recreate();
        } else if (i10 <= 23) {
            new Handler(activity.getMainLooper()).post(new RunnableC0175a(activity));
        } else if (!p0.b.i(activity)) {
            activity.recreate();
        }
    }
}
