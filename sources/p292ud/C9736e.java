package p292ud;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import be.C1379j0;
import ge.C4868i;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import p174m3.AbstractC6689s;
import p199o3.C7602e;

public class C9736e implements C4868i.AbstractC4882n, SensorEventListener, C1379j0.AbstractC1380a {
    public boolean f31676M;
    public boolean f31678O;
    public boolean f31679P;
    public boolean f31680Q;
    public Sensor f31681R;
    public PowerManager.WakeLock f31682S;
    public boolean f31683T;
    public boolean f31685V;
    public boolean f31686W;
    public boolean f31687X;
    public boolean f31688Y;
    public boolean f31689Z;
    public final C9773p0 f31690a;
    public final AbstractC9738b f31691b;
    public TdApi.Message f31692c;
    public int f31677N = 0;
    public BroadcastReceiver f31684U = new C9737a();

    public class C9737a extends BroadcastReceiver {
        public C9737a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            C9736e.this.m7311f();
        }
    }

    public interface AbstractC9738b {
        void mo7060e();
    }

    public C9736e(C9773p0 p0Var, AbstractC9738b bVar) {
        this.f31690a = p0Var;
        this.f31691b = bVar;
    }

    @Override
    public void mo7316a(boolean z, int i) {
        if (this.f31676M == z) {
            m7306l(i);
        }
    }

    public final void m7314c() {
        boolean z = this.f31692c != null && (this.f31685V || this.f31686W);
        if (this.f31688Y != z) {
            this.f31688Y = z;
            AudioManager audioManager = (AudioManager) C1379j0.m37318n().getSystemService("audio");
            if (audioManager != null) {
                if (z) {
                    audioManager.setSpeakerphoneOn(false);
                    audioManager.setMode(3);
                } else {
                    audioManager.setMode(0);
                }
            }
            this.f31691b.mo7060e();
        }
    }

    public final void m7313d() {
        boolean z = this.f31678O && (!this.f31680Q || this.f31687X) && !this.f31683T;
        if (this.f31679P != z) {
            if (z) {
                if (!m7307k()) {
                    return;
                }
            } else if (!m7303o()) {
                return;
            }
            this.f31679P = z;
        }
    }

    public final void m7312e() {
        boolean z = this.f31692c != null && this.f31686W && !this.f31683T;
        if (this.f31687X != z) {
            this.f31687X = z;
            AbstractView$OnTouchListenerC7889a E = C1379j0.m37369E();
            if (E != null) {
                E.m14463m3(Log.TAG_YOUTUBE, z);
            }
            if (z) {
                m7314c();
                this.f31690a.m7117B0(this.f31692c);
            } else {
                this.f31690a.m7119A0(Log.TAG_GIF_LOADER);
                if (!m7306l(C4868i.m24727c2().m24892F0(this.f31676M))) {
                    m7314c();
                }
            }
            m7304n(z);
        }
    }

    public final void m7311f() {
        AudioManager audioManager = (AudioManager) C1379j0.m37312q().getSystemService("audio");
        boolean z = audioManager != null && C7389v0.m16752B1(audioManager);
        if (this.f31683T != z) {
            this.f31683T = z;
            m7312e();
            m7313d();
        }
    }

    public final boolean m7310g() {
        TdApi.Message message = this.f31692c;
        return message != null && message.content.getConstructor() == 963323014;
    }

    @Override
    public void mo1641h(int i) {
        boolean z = i != 0;
        if (this.f31680Q != z) {
            this.f31680Q = z;
            m7313d();
        }
    }

    public void m7309i(AbstractC6689s sVar, int i) {
        if (m7308j()) {
            sVar.mo19392B(new C7602e.C7604b().m15530c(1).m15528e(2).m15532a(), false);
        } else {
            sVar.mo19392B(new C7602e.C7604b().m15530c(i).m15528e(1).m15532a(), false);
        }
    }

    public boolean m7308j() {
        return this.f31688Y;
    }

    public final boolean m7307k() {
        PowerManager powerManager;
        SensorManager sensorManager = (SensorManager) C1379j0.m37312q().getSystemService("sensor");
        if (sensorManager == null) {
            return false;
        }
        if (this.f31681R == null) {
            this.f31681R = sensorManager.getDefaultSensor(8);
        }
        if (this.f31681R == null) {
            return false;
        }
        if (this.f31682S == null && (powerManager = (PowerManager) C1379j0.m37312q().getSystemService("power")) != null) {
            try {
                this.f31682S = powerManager.newWakeLock(32, "tgx:proximity");
            } catch (Throwable th) {
                Log.m14725e("Unable to create proximity wake lock", th, new Object[0]);
            }
        }
        try {
            sensorManager.registerListener(this, this.f31681R, 3);
            AudioManager audioManager = (AudioManager) C1379j0.m37312q().getSystemService("audio");
            if (audioManager != null) {
                this.f31683T = C7389v0.m16752B1(audioManager);
                BluetoothAdapter defaultAdapter = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT >= 21) {
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                } else {
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                }
                if (defaultAdapter != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                try {
                    C1379j0.m37318n().registerReceiver(this.f31684U, intentFilter);
                    return true;
                } catch (Throwable th2) {
                    Log.m14725e("Unable to register headset broadcast receiver", th2, new Object[0]);
                    return true;
                }
            } else {
                this.f31683T = false;
                return true;
            }
        } catch (Throwable th3) {
            Log.m14725e("Unable to register proximity sensor listener", th3, new Object[0]);
            return false;
        }
    }

    public final boolean m7306l(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f31677N == i) {
            return false;
        }
        this.f31677N = i;
        if (i == 1) {
            z = true;
        } else if (i != 2) {
            z = false;
        } else {
            z = true;
            z2 = true;
        }
        this.f31685V = z2;
        m7314c();
        this.f31678O = z;
        m7313d();
        return true;
    }

    public void m7305m(TdApi.Message message) {
        boolean z = true;
        boolean z2 = this.f31692c != null;
        boolean z3 = message != null;
        this.f31692c = message;
        if (z2 != z3) {
            if (z3) {
                C4868i.m24727c2().m24602s(this);
                if (C1379j0.m37367F() == 0) {
                    z = false;
                }
                this.f31680Q = z;
                C1379j0.m37338d(this);
                this.f31676M = m7310g();
                m7306l(C4868i.m24727c2().m24892F0(this.f31676M));
            } else {
                C4868i.m24727c2().m24826O3(this);
                C1379j0.m37331g0(this);
                m7306l(0);
            }
            m7312e();
        } else if (z3) {
            this.f31676M = m7310g();
            int F0 = C4868i.m24727c2().m24892F0(this.f31676M);
            if (!this.f31687X || F0 != 0) {
                m7306l(F0);
            }
        }
    }

    public final void m7304n(boolean z) {
        PowerManager.WakeLock wakeLock = this.f31682S;
        if (wakeLock != null && this.f31689Z != z) {
            boolean z2 = true;
            try {
                if (z) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            } catch (Throwable th) {
                Log.m14725e("Unable to acquire/release wake lock, wakeLockHeld:%b", th, Boolean.valueOf(z));
                z2 = false;
            }
            if (z2) {
                this.f31689Z = z;
            }
        }
    }

    public final boolean m7303o() {
        SensorManager sensorManager = (SensorManager) C1379j0.m37312q().getSystemService("sensor");
        if (sensorManager == null || this.f31681R == null) {
            return false;
        }
        m7304n(false);
        try {
            sensorManager.unregisterListener(this, this.f31681R);
            try {
                C1379j0.m37318n().unregisterReceiver(this.f31684U);
                return true;
            } catch (Throwable unused) {
                Log.m14724e("Unable to unregister receiver", new Object[0]);
                return true;
            }
        } catch (Throwable th) {
            Log.m14725e("Unable to unregister proximity sensor listener", th, new Object[0]);
            return false;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        Sensor sensor2 = sensorEvent.sensor;
        if (sensor2 != null && sensor2 == (sensor = this.f31681R)) {
            boolean z = false;
            float f = sensorEvent.values[0];
            if (this.f31692c != null && f < 5.0f && f < sensor.getMaximumRange()) {
                z = true;
            }
            if (this.f31686W != z) {
                this.f31686W = z;
                m7312e();
            }
        }
    }
}
