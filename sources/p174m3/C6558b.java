package p174m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class C6558b {
    public final Context f20408a;
    public final RunnableC6559a f20409b;
    public boolean f20410c;

    public final class RunnableC6559a extends BroadcastReceiver implements Runnable {
        public final AbstractC6560b f20411a;
        public final Handler f20412b;

        public RunnableC6559a(Handler handler, AbstractC6560b bVar) {
            this.f20412b = handler;
            this.f20411a = bVar;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20412b.post(this);
            }
        }

        @Override
        public void run() {
            if (C6558b.this.f20410c) {
                this.f20411a.mo19327v();
            }
        }
    }

    public interface AbstractC6560b {
        void mo19327v();
    }

    public C6558b(Context context, Handler handler, AbstractC6560b bVar) {
        this.f20408a = context.getApplicationContext();
        this.f20409b = new RunnableC6559a(handler, bVar);
    }

    public void m20106b(boolean z) {
        if (z && !this.f20410c) {
            this.f20408a.registerReceiver(this.f20409b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f20410c = true;
        } else if (!z && this.f20410c) {
            this.f20408a.unregisterReceiver(this.f20409b);
            this.f20410c = false;
        }
    }
}
