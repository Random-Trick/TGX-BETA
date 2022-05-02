package p202o6;

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
import p262s6.AbstractBinderC8679q0;
import p262s6.C8646a;
import p262s6.C8680r;
import p262s6.C8683s0;

public final class BinderC7777x extends AbstractBinderC8679q0 {
    public final C8646a f24892a = new C8646a("AssetPackExtractionService");
    public final Context f24893b;
    public final C7688f0 f24894c;
    public final C7746q3 f24895d;
    public final ServiceConnectionC7683e1 f24896e;
    public final NotificationManager f24897f;

    public BinderC7777x(Context context, C7688f0 f0Var, C7746q3 q3Var, ServiceConnectionC7683e1 e1Var) {
        this.f24893b = context;
        this.f24894c = f0Var;
        this.f24895d = q3Var;
        this.f24896e = e1Var;
        this.f24897f = (NotificationManager) context.getSystemService("notification");
    }

    @Override
    public final void mo11746B(Bundle bundle, C8683s0 s0Var) {
        m15107t(bundle, s0Var);
    }

    @Override
    public final void mo11745S(Bundle bundle, C8683s0 s0Var) {
        this.f24892a.m11818a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C8680r.m11747b(this.f24893b) || !C8680r.m11748a(this.f24893b)) {
            s0Var.m11741p0(new Bundle());
            return;
        }
        this.f24894c.m15252J();
        s0Var.m11742n(new Bundle());
    }

    @TargetApi(26)
    public final synchronized void m15108s(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f24897f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final synchronized void m15107t(Bundle bundle, C8683s0 s0Var) {
        Notification.Builder builder;
        int i;
        this.f24892a.m11818a("updateServiceState AIDL call", new Object[0]);
        if (C8680r.m11747b(this.f24893b) && C8680r.m11748a(this.f24893b)) {
            int i2 = bundle.getInt("action_type");
            this.f24896e.m15263c(s0Var);
            if (i2 == 1) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    m15108s(bundle.getString("notification_channel_name"));
                }
                this.f24895d.m15152c(true);
                ServiceConnectionC7683e1 e1Var = this.f24896e;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                if (i3 >= 26) {
                    builder = new Notification.Builder(this.f24893b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                } else {
                    builder = new Notification.Builder(this.f24893b).setPriority(-2);
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
                if (i3 >= 21 && (i = bundle.getInt("notification_color")) != 0) {
                    builder.setColor(i).setVisibility(-1);
                }
                e1Var.m15265a(builder.build());
                this.f24893b.bindService(new Intent(this.f24893b, ExtractionForegroundService.class), this.f24896e, 1);
                return;
            } else if (i2 == 2) {
                this.f24895d.m15152c(false);
                this.f24896e.m15264b();
                return;
            } else {
                this.f24892a.m11817b("Unknown action type received: %d", Integer.valueOf(i2));
                s0Var.m11741p0(new Bundle());
                return;
            }
        }
        s0Var.m11741p0(new Bundle());
    }
}
