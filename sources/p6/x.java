package p6;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import t6.a;
import t6.q0;
import t6.r;
import t6.s0;

public final class x extends q0 {
    public final a f20847a = new a("AssetPackExtractionService");
    public final Context f20848b;
    public final f0 f20849c;
    public final q3 f20850d;
    public final e1 f20851e;
    public final NotificationManager f20852f;

    public x(Context context, f0 f0Var, q3 q3Var, e1 e1Var) {
        this.f20848b = context;
        this.f20849c = f0Var;
        this.f20850d = q3Var;
        this.f20851e = e1Var;
        this.f20852f = (NotificationManager) context.getSystemService("notification");
    }

    @Override
    public final void d1(Bundle bundle, s0 s0Var) {
        t(bundle, s0Var);
    }

    @TargetApi(26)
    public final synchronized void r(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f20852f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final synchronized void t(Bundle bundle, s0 s0Var) {
        Notification.Builder builder;
        this.f20847a.a("updateServiceState AIDL call", new Object[0]);
        if (r.b(this.f20848b) && r.a(this.f20848b)) {
            int i10 = bundle.getInt("action_type");
            this.f20851e.c(s0Var);
            if (i10 == 1) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 26) {
                    r(bundle.getString("notification_channel_name"));
                }
                this.f20850d.c(true);
                e1 e1Var = this.f20851e;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j10 = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                if (i11 >= 26) {
                    builder = new Notification.Builder(this.f20848b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10);
                } else {
                    builder = new Notification.Builder(this.f20848b).setPriority(-2);
                }
                if (parcelable instanceof PendingIntent) {
                    builder.setContentIntent((PendingIntent) parcelable);
                }
                Notification.Builder ongoing = builder.setSmallIcon(17301633).setOngoing(false);
                if (string == null) {
                    string = "Downloading additional file";
                }
                Notification.Builder contentTitle = ongoing.setContentTitle(string);
                if (string2 == null) {
                    string2 = "Transferring";
                }
                contentTitle.setSubText(string2);
                int i12 = bundle.getInt("notification_color");
                if (i12 != 0) {
                    builder.setColor(i12).setVisibility(-1);
                }
                e1Var.a(builder.build());
                this.f20848b.bindService(new Intent(this.f20848b, ExtractionForegroundService.class), this.f20851e, 1);
                return;
            } else if (i10 == 2) {
                this.f20850d.c(false);
                this.f20851e.b();
                return;
            } else {
                this.f20847a.b("Unknown action type received: %d", Integer.valueOf(i10));
                s0Var.r0(new Bundle());
                return;
            }
        }
        s0Var.r0(new Bundle());
    }

    @Override
    public final void u1(Bundle bundle, s0 s0Var) {
        this.f20847a.a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!r.b(this.f20848b) || !r.a(this.f20848b)) {
            s0Var.r0(new Bundle());
            return;
        }
        this.f20849c.J();
        s0Var.n(new Bundle());
    }
}
