package i5;

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
import n6.l;
import n6.o;
import x5.a;
import x5.f;

public abstract class b extends BroadcastReceiver {
    public final ExecutorService f13992a = a.a().b(new s5.a("firebase-iid-executor"), f.f26057a);

    public Executor a() {
        return this.f13992a;
    }

    public abstract int b(Context context, a aVar);

    public void c(Context context, Bundle bundle) {
    }

    public void d(Context context, Bundle bundle) {
    }

    public final int e(Context context, Intent intent) {
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
            d(context, extras);
            return -1;
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(context, extras);
            return -1;
        } else {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
    }

    public final void f(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        int i10;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i10 = e(context, intent2);
            } else {
                i10 = g(context, intent);
            }
            if (z10) {
                pendingResult.setResultCode(i10);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final int g(Context context, Intent intent) {
        l<Void> lVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            lVar = o.f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            lVar = i.c(context).d(2, bundle);
        }
        int b10 = b(context, new a(intent));
        try {
            o.b(lVar, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return b10;
    }

    @Override
    public final void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            final boolean isOrderedBroadcast = isOrderedBroadcast();
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            a().execute(new Runnable(this, intent, context, isOrderedBroadcast, goAsync) {
                public final boolean M;
                public final BroadcastReceiver.PendingResult N;
                public final b f14010a;
                public final Intent f14011b;
                public final Context f14012c;

                {
                    this.f14010a = this;
                    this.f14011b = intent;
                    this.f14012c = context;
                    this.M = isOrderedBroadcast;
                    this.N = goAsync;
                }

                @Override
                public final void run() {
                    this.f14010a.f(this.f14011b, this.f14012c, this.M, this.N);
                }
            });
        }
    }
}
