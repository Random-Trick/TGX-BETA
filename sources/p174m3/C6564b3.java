package p174m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;

public final class C6564b3 {
    public final Context f20417a;
    public final Handler f20418b;
    public final AbstractC6566b f20419c;
    public final AudioManager f20420d;
    public C6567c f20421e;
    public int f20422f = 3;
    public int f20423g;
    public boolean f20424h;

    public interface AbstractC6566b {
        void mo19332O(int i, boolean z);

        void mo19328i(int i);
    }

    public final class C6567c extends BroadcastReceiver {
        public C6567c() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            Handler handler = C6564b3.this.f20418b;
            final C6564b3 b3Var = C6564b3.this;
            handler.post(new Runnable() {
                @Override
                public final void run() {
                    C6564b3.m20104b(C6564b3.this);
                }
            });
        }
    }

    public C6564b3(Context context, Handler handler, AbstractC6566b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20417a = applicationContext;
        this.f20418b = handler;
        this.f20419c = bVar;
        AudioManager audioManager = (AudioManager) C1186a.m38185h((AudioManager) applicationContext.getSystemService("audio"));
        this.f20420d = audioManager;
        this.f20423g = m20100f(audioManager, 3);
        this.f20424h = m20101e(audioManager, this.f20422f);
        C6567c cVar = new C6567c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f20421e = cVar;
        } catch (RuntimeException e) {
            C1230s.m37883j("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static void m20104b(C6564b3 b3Var) {
        b3Var.m20097i();
    }

    public static boolean m20101e(AudioManager audioManager, int i) {
        if (C1216l0.f4526a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m20100f(audioManager, i) == 0;
    }

    public static int m20100f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i);
            C1230s.m37883j("StreamVolumeManager", sb2.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public int m20103c() {
        return this.f20420d.getStreamMaxVolume(this.f20422f);
    }

    public int m20102d() {
        if (C1216l0.f4526a >= 28) {
            return this.f20420d.getStreamMinVolume(this.f20422f);
        }
        return 0;
    }

    public void m20099g() {
        C6567c cVar = this.f20421e;
        if (cVar != null) {
            try {
                this.f20417a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                C1230s.m37883j("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f20421e = null;
        }
    }

    public void m20098h(int i) {
        if (this.f20422f != i) {
            this.f20422f = i;
            m20097i();
            this.f20419c.mo19328i(i);
        }
    }

    public final void m20097i() {
        int f = m20100f(this.f20420d, this.f20422f);
        boolean e = m20101e(this.f20420d, this.f20422f);
        if (this.f20423g != f || this.f20424h != e) {
            this.f20423g = f;
            this.f20424h = e;
            this.f20419c.mo19332O(f, e);
        }
    }
}
