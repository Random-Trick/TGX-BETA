package vd;

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
import android.os.PowerManager;
import ce.j0;
import he.i;
import m3.s;
import o3.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class e implements i.n, SensorEventListener, j0.a {
    public boolean M;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Sensor R;
    public PowerManager.WakeLock S;
    public boolean T;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final o0 f25446a;
    public final b f25447b;
    public TdApi.Message f25448c;
    public int N = 0;
    public BroadcastReceiver U = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            e.this.g();
        }
    }

    public interface b {
        void e();
    }

    public e(o0 o0Var, b bVar) {
        this.f25446a = o0Var;
        this.f25447b = bVar;
    }

    @Override
    public void a(boolean z10, int i10) {
        if (this.M == z10) {
            l(i10);
        }
    }

    public final void c() {
        boolean z10 = this.f25448c != null && (this.V || this.W);
        if (this.Y != z10) {
            this.Y = z10;
            AudioManager audioManager = (AudioManager) j0.n().getSystemService("audio");
            if (audioManager != null) {
                if (z10) {
                    audioManager.setSpeakerphoneOn(false);
                    audioManager.setMode(3);
                } else {
                    audioManager.setMode(0);
                }
            }
            this.f25447b.e();
        }
    }

    public final void d() {
        boolean z10 = this.O && (!this.Q || this.X) && !this.T;
        if (this.P != z10) {
            if (z10) {
                if (!k()) {
                    return;
                }
            } else if (!o()) {
                return;
            }
            this.P = z10;
        }
    }

    public final void e() {
        boolean z10 = this.f25448c != null && this.W && !this.T;
        if (this.X != z10) {
            this.X = z10;
            org.thunderdog.challegram.a E = j0.E();
            if (E != null) {
                E.n3(Log.TAG_YOUTUBE, z10);
            }
            if (z10) {
                c();
                this.f25446a.B0(this.f25448c);
            } else {
                this.f25446a.A0(Log.TAG_GIF_LOADER);
                if (!l(i.c2().F0(this.M))) {
                    c();
                }
            }
            n(z10);
        }
    }

    @Override
    public void f(int i10) {
        boolean z10 = i10 != 0;
        if (this.Q != z10) {
            this.Q = z10;
            d();
        }
    }

    public final void g() {
        AudioManager audioManager = (AudioManager) j0.q().getSystemService("audio");
        boolean z10 = audioManager != null && v0.B1(audioManager);
        if (this.T != z10) {
            this.T = z10;
            e();
            d();
        }
    }

    public final boolean h() {
        TdApi.Message message = this.f25448c;
        return message != null && message.content.getConstructor() == 963323014;
    }

    public void i(s sVar, int i10) {
        if (j()) {
            sVar.G(new e.d().c(1).f(2).a(), false);
        } else {
            sVar.G(new e.d().c(i10).f(1).a(), false);
        }
    }

    public boolean j() {
        return this.Y;
    }

    public final boolean k() {
        PowerManager powerManager;
        SensorManager sensorManager = (SensorManager) j0.q().getSystemService("sensor");
        if (sensorManager == null) {
            return false;
        }
        if (this.R == null) {
            this.R = sensorManager.getDefaultSensor(8);
        }
        if (this.R == null) {
            return false;
        }
        if (this.S == null && (powerManager = (PowerManager) j0.q().getSystemService("power")) != null) {
            try {
                this.S = powerManager.newWakeLock(32, "tgx:proximity");
            } catch (Throwable th) {
                Log.e("Unable to create proximity wake lock", th, new Object[0]);
            }
        }
        try {
            sensorManager.registerListener(this, this.R, 3);
            AudioManager audioManager = (AudioManager) j0.q().getSystemService("audio");
            if (audioManager != null) {
                this.T = v0.B1(audioManager);
                BluetoothAdapter defaultAdapter = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                if (defaultAdapter != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                try {
                    j0.n().registerReceiver(this.U, intentFilter);
                    return true;
                } catch (Throwable th2) {
                    Log.e("Unable to register headset broadcast receiver", th2, new Object[0]);
                    return true;
                }
            } else {
                this.T = false;
                return true;
            }
        } catch (Throwable th3) {
            Log.e("Unable to register proximity sensor listener", th3, new Object[0]);
            return false;
        }
    }

    public final boolean l(int i10) {
        boolean z10;
        boolean z11 = false;
        if (this.N == i10) {
            return false;
        }
        this.N = i10;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        this.V = z11;
        c();
        this.O = z10;
        d();
        return true;
    }

    public void m(TdApi.Message message) {
        boolean z10 = true;
        boolean z11 = this.f25448c != null;
        boolean z12 = message != null;
        this.f25448c = message;
        if (z11 != z12) {
            if (z12) {
                i.c2().s(this);
                if (j0.F() == 0) {
                    z10 = false;
                }
                this.Q = z10;
                j0.d(this);
                this.M = h();
                l(i.c2().F0(this.M));
            } else {
                i.c2().O3(this);
                j0.g0(this);
                l(0);
            }
            e();
        } else if (z12) {
            this.M = h();
            int F0 = i.c2().F0(this.M);
            if (!this.X || F0 != 0) {
                l(F0);
            }
        }
    }

    public final void n(boolean z10) {
        PowerManager.WakeLock wakeLock = this.S;
        if (wakeLock != null && this.Z != z10) {
            boolean z11 = true;
            try {
                if (z10) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release();
                }
            } catch (Throwable th) {
                Log.e("Unable to acquire/release wake lock, wakeLockHeld:%b", th, Boolean.valueOf(z10));
                z11 = false;
            }
            if (z11) {
                this.Z = z10;
            }
        }
    }

    public final boolean o() {
        SensorManager sensorManager = (SensorManager) j0.q().getSystemService("sensor");
        if (sensorManager == null || this.R == null) {
            return false;
        }
        n(false);
        try {
            sensorManager.unregisterListener(this, this.R);
            try {
                j0.n().unregisterReceiver(this.U);
                return true;
            } catch (Throwable unused) {
                Log.e("Unable to unregister receiver", new Object[0]);
                return true;
            }
        } catch (Throwable th) {
            Log.e("Unable to unregister proximity sensor listener", th, new Object[0]);
            return false;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        Sensor sensor2 = sensorEvent.sensor;
        if (sensor2 != null && sensor2 == (sensor = this.R)) {
            boolean z10 = false;
            float f10 = sensorEvent.values[0];
            if (this.f25448c != null && f10 < 5.0f && f10 < sensor.getMaximumRange()) {
                z10 = true;
            }
            if (this.W != z10) {
                this.W = z10;
                e();
            }
        }
    }
}
