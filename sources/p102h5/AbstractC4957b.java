package p102h5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p177m6.AbstractC6775l;
import p177m6.C6781o;
import p246r5.ThreadFactoryC8371a;
import p312w5.C9979a;
import p312w5.C9984f;

public abstract class AbstractC4957b extends BroadcastReceiver {
    public final ExecutorService f16875a = C9979a.m6312a().mo6310b(new ThreadFactoryC8371a("firebase-iid-executor"), C9984f.f32464a);

    public Executor m24384a() {
        return this.f16875a;
    }

    public abstract int mo24383b(Context context, C4955a aVar);

    public void mo24382c(Context context, Bundle bundle) {
    }

    public void m24381d(Context context, Bundle bundle) {
    }

    public final int m24380e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            m24381d(context, extras);
            return -1;
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo24382c(context, extras);
            return -1;
        } else {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
    }

    public final void m24379f(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = m24380e(context, intent2);
            } else {
                i = m24378g(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final int m24378g(Context context, Intent intent) {
        AbstractC6775l<Void> lVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            lVar = C6781o.m19049f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            lVar = C4969i.m24359c(context).m24358d(2, bundle);
        }
        int b = mo24383b(context, new C4955a(intent));
        try {
            C6781o.m19053b(lVar, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return b;
    }

    @Override
    public final void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            final boolean isOrderedBroadcast = isOrderedBroadcast();
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            m24384a().execute(new Runnable(this, intent, context, isOrderedBroadcast, goAsync) {
                public final boolean f16894M;
                public final BroadcastReceiver.PendingResult f16895N;
                public final AbstractC4957b f16896a;
                public final Intent f16897b;
                public final Context f16898c;

                {
                    this.f16896a = this;
                    this.f16897b = intent;
                    this.f16898c = context;
                    this.f16894M = isOrderedBroadcast;
                    this.f16895N = goAsync;
                }

                @Override
                public final void run() {
                    this.f16896a.m24379f(this.f16897b, this.f16898c, this.f16894M, this.f16895N);
                }
            });
        }
    }
}
