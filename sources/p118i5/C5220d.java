package p118i5;

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
import androidx.fragment.app.ActivityC0761d;
import com.google.android.gms.common.api.GoogleApiActivity;
import p090g5.C4476b;
import p090g5.C4477c;
import p148k5.AbstractC6116h;
import p148k5.AbstractC6118h1;
import p148k5.C6124i1;
import p163l5.AbstractDialogInterface$OnClickListenerC6344g0;
import p163l5.C6334d0;
import p163l5.C6378r;
import p213p0.C7956h;
import p232q5.C8248h;
import p232q5.C8251k;

public class C5220d extends C5221e {
    public String f17367c;
    public static final Object f17365e = new Object();
    public static final C5220d f17366f = new C5220d();
    public static final int f17364d = C5221e.f17368a;

    public static C5220d m23604p() {
        return f17366f;
    }

    @Override
    @RecentlyNullable
    public Intent mo23590d(Context context, int i, String str) {
        return super.mo23590d(context, i, str);
    }

    @Override
    @RecentlyNullable
    public PendingIntent mo23589e(@RecentlyNonNull Context context, int i, int i2) {
        return super.mo23589e(context, i, i2);
    }

    @Override
    public final String mo23587g(int i) {
        return super.mo23587g(i);
    }

    @Override
    public int mo23585i(@RecentlyNonNull Context context) {
        return super.mo23585i(context);
    }

    @Override
    public int mo23584j(@RecentlyNonNull Context context, int i) {
        return super.mo23584j(context, i);
    }

    @Override
    public final boolean mo23581m(int i) {
        return super.mo23581m(i);
    }

    @RecentlyNullable
    public Dialog m23606n(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m23596x(activity, i, AbstractDialogInterface$OnClickListenerC6344g0.m20585b(activity, mo23590d(activity, i, "d"), i2), onCancelListener);
    }

    @RecentlyNullable
    public PendingIntent m23605o(@RecentlyNonNull Context context, @RecentlyNonNull C5217a aVar) {
        if (aVar.m23612e()) {
            return aVar.m23613d();
        }
        return mo23589e(context, aVar.m23615b(), 0);
    }

    public boolean m23603q(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n = m23606n(activity, i, i2, onCancelListener);
        if (n == null) {
            return false;
        }
        m23595y(activity, n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void m23602r(@RecentlyNonNull Context context, int i) {
        m23600t(context, i, null, m23588f(context, i, 0, "n"));
    }

    public final boolean m23601s(@RecentlyNonNull Activity activity, @RecentlyNonNull AbstractC6116h hVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog x = m23596x(activity, i, AbstractDialogInterface$OnClickListenerC6344g0.m20584c(hVar, mo23590d(activity, i, "d"), 2), onCancelListener);
        if (x == null) {
            return false;
        }
        m23595y(activity, x, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @TargetApi(20)
    public final void m23600t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            m23594z(context);
        } else if (pendingIntent != null) {
            String b = C6334d0.m20616b(context, i);
            String d = C6334d0.m20614d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C6378r.m20506k(context.getSystemService("notification"));
            C7956h.C7965e I = new C7956h.C7965e(context).m13937z(true).m13952k(true).m13946q(b).m13968I(new C7956h.C7963c().m13978h(d));
            if (C8248h.m13048c(context)) {
                C6378r.m20504m(C8251k.m13035d());
                I.m13971F(context.getApplicationInfo().icon).m13974C(2);
                if (C8248h.m13046e(context)) {
                    I.m13962a(C4476b.a_res_0x7f06019d, resources.getString(C4477c.o), pendingIntent);
                } else {
                    I.m13948o(pendingIntent);
                }
            } else {
                I.m13971F(17301642).m13966K(resources.getString(C4477c.h_res_0x7f0e11fd)).m13963N(System.currentTimeMillis()).m13948o(pendingIntent).m13947p(d);
            }
            if (C8251k.m13032g()) {
                C6378r.m20504m(C8251k.m13032g());
                synchronized (f17365e) {
                    str2 = this.f17367c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String g = C6334d0.m20611g(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, g, 4));
                    } else if (!g.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(g);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                I.m13950m(str2);
            }
            Notification d2 = I.m13959d();
            if (i == 1 || i == 2 || i == 3) {
                C5224h.f17373b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, d2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final boolean m23599u(@RecentlyNonNull Context context, @RecentlyNonNull C5217a aVar, int i) {
        PendingIntent o = m23605o(context, aVar);
        if (o == null) {
            return false;
        }
        m23600t(context, aVar.m23615b(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m30400a(context, o, i, true), 134217728));
        return true;
    }

    @RecentlyNonNull
    public final Dialog m23598v(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C6334d0.m20615c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m23595y(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final C6124i1 m23597w(Context context, AbstractC6118h1 h1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C6124i1 i1Var = new C6124i1(h1Var);
        context.registerReceiver(i1Var, intentFilter);
        i1Var.m21257a(context);
        if (m23582l(context, "com.google.android.gms")) {
            return i1Var;
        }
        h1Var.mo21104a();
        i1Var.m21256b();
        return null;
    }

    public final Dialog m23596x(Context context, int i, AbstractDialogInterface$OnClickListenerC6344g0 g0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
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
        builder.setMessage(C6334d0.m20615c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C6334d0.m20613e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, g0Var);
        }
        String a = C6334d0.m20617a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void m23595y(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0761d) {
                C5227k.m23562q1(dialog, onCancelListener).mo23563p1(((ActivityC0761d) activity).m40059w(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC5218b.m23609a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void m23594z(Context context) {
        new HandlerC5228l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
