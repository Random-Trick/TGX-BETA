package j5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.GoogleApiActivity;
import h5.b;
import h5.c;
import l5.h;
import l5.h1;
import l5.i1;
import m5.d0;
import m5.g0;
import m5.r;
import p0.h;
import r5.k;

public class d extends e {
    public String f15073c;
    public static final Object f15071e = new Object();
    public static final d f15072f = new d();
    public static final int f15070d = e.f15074a;

    public static d p() {
        return f15072f;
    }

    @Override
    @RecentlyNullable
    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    @Override
    @RecentlyNullable
    public PendingIntent e(@RecentlyNonNull Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    @Override
    public final String g(int i10) {
        return super.g(i10);
    }

    @Override
    public int i(@RecentlyNonNull Context context) {
        return super.i(context);
    }

    @Override
    public int j(@RecentlyNonNull Context context, int i10) {
        return super.j(context, i10);
    }

    @Override
    public final boolean m(int i10) {
        return super.m(i10);
    }

    @RecentlyNullable
    public Dialog n(@RecentlyNonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return x(activity, i10, g0.b(activity, d(activity, i10, "d"), i11), onCancelListener);
    }

    @RecentlyNullable
    public PendingIntent o(@RecentlyNonNull Context context, @RecentlyNonNull a aVar) {
        if (aVar.e()) {
            return aVar.d();
        }
        return e(context, aVar.b(), 0);
    }

    public boolean q(@RecentlyNonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n10 = n(activity, i10, i11, onCancelListener);
        if (n10 == null) {
            return false;
        }
        y(activity, n10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void r(@RecentlyNonNull Context context, int i10) {
        t(context, i10, null, f(context, i10, 0, "n"));
    }

    public final boolean s(@RecentlyNonNull Activity activity, @RecentlyNonNull h hVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog x10 = x(activity, i10, g0.c(hVar, d(activity, i10, "d"), 2), onCancelListener);
        if (x10 == null) {
            return false;
        }
        y(activity, x10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @TargetApi(20)
    public final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            z(context);
        } else if (pendingIntent != null) {
            String b10 = d0.b(context, i10);
            String d10 = d0.d(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) r.k(context.getSystemService("notification"));
            h.e I = new h.e(context).z(true).k(true).q(b10).I(new h.c().h(d10));
            if (r5.h.c(context)) {
                r.m(k.d());
                I.F(context.getApplicationInfo().icon).C(2);
                if (r5.h.e(context)) {
                    I.a(b.a_res_0x7f0601a0, resources.getString(c.f12524o), pendingIntent);
                } else {
                    I.o(pendingIntent);
                }
            } else {
                I.F(17301642).K(resources.getString(c.h_res_0x7f0e1209)).N(System.currentTimeMillis()).o(pendingIntent).p(d10);
            }
            if (k.g()) {
                r.m(k.g());
                synchronized (f15071e) {
                    str2 = this.f15073c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String g10 = d0.g(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, g10, 4));
                    } else if (!g10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(g10);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                I.m(str2);
            }
            Notification d11 = I.d();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                h.f15079b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, d11);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean u(@RecentlyNonNull Context context, @RecentlyNonNull a aVar, int i10) {
        PendingIntent o10 = o(context, aVar);
        if (o10 == null) {
            return false;
        }
        t(context, aVar.b(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, o10, i10, true), 134217728));
        return true;
    }

    @RecentlyNonNull
    public final Dialog v(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(d0.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        y(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final i1 w(Context context, h1 h1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        i1 i1Var = new i1(h1Var);
        context.registerReceiver(i1Var, intentFilter);
        i1Var.a(context);
        if (l(context, "com.google.android.gms")) {
            return i1Var;
        }
        h1Var.a();
        i1Var.b();
        return null;
    }

    public final Dialog x(Context context, int i10, g0 g0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(d0.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e10 = d0.e(context, i10);
        if (e10 != null) {
            builder.setPositiveButton(e10, g0Var);
        }
        String a10 = d0.a(context, i10);
        if (a10 != null) {
            builder.setTitle(a10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final void y(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                k.q1(dialog, onCancelListener).p1(((androidx.fragment.app.d) activity).x(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void z(Context context) {
        new l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
