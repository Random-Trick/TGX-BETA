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
    public final C8646a f24895a = new C8646a("AssetPackExtractionService");
    public final Context f24896b;
    public final C7688f0 f24897c;
    public final C7746q3 f24898d;
    public final ServiceConnectionC7683e1 f24899e;
    public final NotificationManager f24900f;

    public BinderC7777x(Context context, C7688f0 f0Var, C7746q3 q3Var, ServiceConnectionC7683e1 e1Var) {
        this.f24896b = context;
        this.f24897c = f0Var;
        this.f24898d = q3Var;
        this.f24899e = e1Var;
        this.f24900f = (NotificationManager) context.getSystemService("notification");
    }

    @Override
    public final void mo11745B(Bundle bundle, C8683s0 s0Var) {
        m15107t(bundle, s0Var);
    }

    @Override
    public final void mo11744S(Bundle bundle, C8683s0 s0Var) {
        this.f24895a.m11817a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C8680r.m11746b(this.f24896b) || !C8680r.m11747a(this.f24896b)) {
            s0Var.m11740p0(new Bundle());
            return;
        }
        this.f24897c.m15252J();
        s0Var.m11741n(new Bundle());
    }

    @TargetApi(26)
    public final synchronized void m15108s(String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        this.f24900f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final synchronized void m15107t(Bundle bundle, C8683s0 s0Var) {
        Notification.Builder builder;
        int i;
        this.f24895a.m11817a("updateServiceState AIDL call", new Object[0]);
        if (C8680r.m11746b(this.f24896b) && C8680r.m11747a(this.f24896b)) {
            int i2 = bundle.getInt("action_type");
            this.f24899e.m15263c(s0Var);
            if (i2 == 1) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    m15108s(bundle.getString("notification_channel_name"));
                }
                this.f24898d.m15152c(true);
                ServiceConnectionC7683e1 e1Var = this.f24899e;
                String string = bundle.getString("notification_title");
                String string2 = bundle.getString("notification_subtext");
                long j = bundle.getLong("notification_timeout", 600000L);
                Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                if (i3 >= 26) {
                    builder = new Notification.Builder(this.f24896b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                } else {
                    builder = new Notification.Builder(this.f24896b).setPriority(-2);
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
                this.f24896b.bindService(new Intent(this.f24896b, ExtractionForegroundService.class), this.f24899e, 1);
                return;
            } else if (i2 == 2) {
                this.f24898d.m15152c(false);
                this.f24899e.m15264b();
                return;
            } else {
                this.f24895a.m11816b("Unknown action type received: %d", Integer.valueOf(i2));
                s0Var.m11740p0(new Bundle());
                return;
            }
        }
        s0Var.m11740p0(new Bundle());
    }
}
