package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class b {
    public final Context f16486a;
    public final a f16487b;
    public boolean f16488c;

    public final class a extends BroadcastReceiver implements Runnable {
        public final AbstractC0152b f16489a;
        public final Handler f16490b;

        public a(Handler handler, AbstractC0152b bVar) {
            this.f16490b = handler;
            this.f16489a = bVar;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16490b.post(this);
            }
        }

        @Override
        public void run() {
            if (b.this.f16488c) {
                this.f16489a.g();
            }
        }
    }

    public interface AbstractC0152b {
        void g();
    }

    public b(Context context, Handler handler, AbstractC0152b bVar) {
        this.f16486a = context.getApplicationContext();
        this.f16487b = new a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f16488c) {
            this.f16486a.registerReceiver(this.f16487b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f16488c = true;
        } else if (!z10 && this.f16488c) {
            this.f16486a.unregisterReceiver(this.f16487b);
            this.f16488c = false;
        }
    }
}
