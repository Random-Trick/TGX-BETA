package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import c5.l0;
import c5.s;

public final class j3 {
    public final Context f16739a;
    public final Handler f16740b;
    public final b f16741c;
    public final AudioManager f16742d;
    public c f16743e;
    public int f16744f = 3;
    public int f16745g;
    public boolean f16746h;

    public interface b {
        void F(int i10, boolean z10);

        void a(int i10);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            Handler handler = j3.this.f16740b;
            final j3 j3Var = j3.this;
            handler.post(new Runnable() {
                @Override
                public final void run() {
                    j3.b(j3.this);
                }
            });
        }
    }

    public j3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16739a = applicationContext;
        this.f16740b = handler;
        this.f16741c = bVar;
        AudioManager audioManager = (AudioManager) c5.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f16742d = audioManager;
        this.f16745g = f(audioManager, 3);
        this.f16746h = e(audioManager, this.f16744f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f16743e = cVar;
        } catch (RuntimeException e10) {
            s.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static void b(j3 j3Var) {
        j3Var.i();
    }

    public static boolean e(AudioManager audioManager, int i10) {
        if (l0.f4841a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            s.j("StreamVolumeManager", sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public int c() {
        return this.f16742d.getStreamMaxVolume(this.f16744f);
    }

    public int d() {
        if (l0.f4841a >= 28) {
            return this.f16742d.getStreamMinVolume(this.f16744f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f16743e;
        if (cVar != null) {
            try {
                this.f16739a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                s.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f16743e = null;
        }
    }

    public void h(int i10) {
        if (this.f16744f != i10) {
            this.f16744f = i10;
            i();
            this.f16741c.a(i10);
        }
    }

    public final void i() {
        int f10 = f(this.f16742d, this.f16744f);
        boolean e10 = e(this.f16742d, this.f16744f);
        if (this.f16745g != f10 || this.f16746h != e10) {
            this.f16745g = f10;
            this.f16746h = e10;
            this.f16741c.F(f10, e10);
        }
    }
}
