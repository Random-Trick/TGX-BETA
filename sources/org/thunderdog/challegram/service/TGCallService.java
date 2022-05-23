package org.thunderdog.challegram.service;

import ae.j;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import ce.j0;
import ce.v;
import gd.w;
import hd.t2;
import he.i;
import ib.i;
import ie.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.receiver.VoIPMediaButtonReceiver;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.gui.CallSettings;
import org.thunderdog.challegram.voip.gui.VoIPFeedbackActivity;
import p0.k;
import zd.jb;
import zd.o6;
import zd.qb;
import zd.t7;
import zd.ya;

public class TGCallService extends Service implements t7.c, AudioManager.OnAudioFocusChangeListener, SensorEventListener, VoIPController.ConnectionStateListener, j0.a {
    public static final String f20121r0 = "android.intent.action.HEADSET_PLUG";
    public static volatile WeakReference<TGCallService> f20122s0;
    public static int f20123t0;
    public TdApi.User M;
    public t0 N;
    public VoIPController O;
    public PowerManager.WakeLock P;
    public BluetoothAdapter Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public boolean V;
    public boolean W;
    public int Y;
    public PowerManager.WakeLock Z;
    public o6 f20124a;
    public boolean f20125a0;
    public TdApi.Call f20126b;
    public boolean f20127b0;
    public String f20128c;
    public Notification f20129c0;
    public boolean f20130d0;
    public MediaPlayer f20131e0;
    public Vibrator f20132f0;
    public Notification f20133g0;
    public boolean f20134h0;
    public boolean f20136j0;
    public NetworkInfo f20137k0;
    public long f20140n0;
    public boolean f20141o0;
    public String f20142p0;
    public boolean f20143q0;
    public final BroadcastReceiver T = new a();
    public int X = -1;
    public Boolean f20135i0 = null;
    public VoIPController.Stats f20138l0 = new VoIPController.Stats();
    public VoIPController.Stats f20139m0 = new VoIPController.Stats();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean z10 = true;
            if (TGCallService.f20121r0.equals(action)) {
                TGCallService tGCallService = TGCallService.this;
                if (intent.getIntExtra("state", 0) != 1) {
                    z10 = false;
                }
                tGCallService.S = z10;
                if (TGCallService.this.S && TGCallService.this.Z != null && TGCallService.this.Z.isHeld()) {
                    TGCallService.this.Z.release();
                }
                TGCallService.this.R = false;
                TGCallService.this.c0();
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                TGCallService.this.b0(true);
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                TGCallService tGCallService2 = TGCallService.this;
                if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 2) {
                    z10 = false;
                }
                tGCallService2.X(z10);
            } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
                TGCallService.this.K();
            } else if ("android.intent.action.PHONE_STATE".equals(action)) {
                if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                    TGCallService.this.D();
                }
            } else if ("org.thunderdog.challegram.DECLINE_CALL".equals(action)) {
                TGCallService.this.x();
            } else if ("org.thunderdog.challegram.END_CALL".equals(action)) {
                TGCallService.this.D();
            } else if ("org.thunderdog.challegram.ANSWER_CALL".equals(action)) {
                TGCallService.this.o();
            }
        }
    }

    public static String C() {
        VoIPController voIPController;
        TGCallService w10 = w();
        return (w10 == null || (voIPController = w10.O) == null) ? "instance not found" : voIPController.getDebugString();
    }

    public static void H(int i10, AudioManager audioManager) {
        if (i10 == f20123t0) {
            try {
                Log.d(2, "AudioManager.setMode(AudioManager.MODE_NORMAL) (in onDestroy, delayed)", new Object[0]);
                audioManager.setMode(0);
            } catch (Throwable unused) {
            }
        }
    }

    public void I(MediaPlayer mediaPlayer) {
        this.f20131e0.start();
    }

    public static void J() {
        TGCallService w10 = w();
        if (w10 != null) {
            w10.f20143q0 = true;
        }
    }

    public static TGCallService w() {
        if (f20122s0 != null) {
            return f20122s0.get();
        }
        return null;
    }

    public final CallSettings A() {
        if (this.f20126b == null) {
            return null;
        }
        CallSettings h02 = this.f20124a.e2().h0(this.f20126b.f19905id);
        return h02 == null ? new CallSettings(this.f20124a, this.f20126b.f19905id) : h02;
    }

    public long B() {
        VoIPController voIPController = this.O;
        if (voIPController == null || !this.f20141o0) {
            return 0L;
        }
        return voIPController.getPreferredRelayID();
    }

    public final void D() {
        if (this.f20126b != null) {
            this.f20124a.F4().c0().P(this.f20124a, this.f20126b.f19905id, false, B());
        }
    }

    public boolean E() {
        if (((TelephonyManager) getSystemService("phone")).getPhoneType() != 0) {
            return true;
        }
        Boolean bool = this.f20135i0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
            int i10 = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
            if ((((Integer) method.invoke((AudioManager) getSystemService("audio"), 0)).intValue() & i10) == i10) {
                this.f20135i0 = Boolean.TRUE;
            } else {
                this.f20135i0 = Boolean.FALSE;
            }
        } catch (Throwable th) {
            Log.e(2, "Error while checking earpiece! ", th, new Object[0]);
            this.f20135i0 = Boolean.TRUE;
        }
        return this.f20135i0.booleanValue();
    }

    public final void F(o6 o6Var, TdApi.Call call) {
        if (this.O == null) {
            Log.v(2, "TGCallService.onCreate", new Object[0]);
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            try {
                VoIPController voIPController = new VoIPController();
                this.O = voIPController;
                voIPController.setConnectionStateListener(this);
                this.O.setConfig(o6Var.h2(), o6Var.g2(), o6Var.m5().O(), call.f19905id);
                if (this.P == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "tgx:voip");
                    this.P = newWakeLock;
                    newWakeLock.acquire();
                }
                this.Q = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                if (this.Q != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                registerReceiver(this.T, intentFilter);
                audioManager.registerMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
                BluetoothAdapter bluetoothAdapter = this.Q;
                if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                    int profileConnectionState = this.Q.getProfileConnectionState(1);
                    X(profileConnectionState == 2);
                    if (profileConnectionState == 2) {
                        audioManager.setBluetoothScoOn(true);
                    }
                    K();
                }
            } catch (Throwable th) {
                Log.e(2, "Error initializing call", th, new Object[0]);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean G() {
        return this.f20136j0;
    }

    public final void K() {
        CallSettings A;
        int i10 = 0;
        Log.d(2, "notifyAudioSettingsChanged", new Object[0]);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (G() && audioManager.isBluetoothScoOn()) {
            i10 = 2;
        } else if (audioManager.isSpeakerphoneOn()) {
            i10 = 3;
        }
        if (this.Y != i10 && (A = A()) != null) {
            this.Y = i10;
            A.setSpeakerMode(i10);
        }
    }

    public void L(KeyEvent keyEvent) {
    }

    public void M(Context context, Intent intent) {
        this.T.onReceive(context, intent);
    }

    public final void N() {
        PowerManager.WakeLock wakeLock = this.P;
        if (wakeLock != null) {
            wakeLock.release();
            final AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (this.f20136j0 && !this.N.e()) {
                audioManager.stopBluetoothSco();
                Log.d(2, "AudioManager.stopBluetoothSco (in onDestroy)", new Object[0]);
                audioManager.setSpeakerphoneOn(false);
                Log.d(2, "AudioManager.setSpeakerphoneOn(false) (in onDestroy)", new Object[0]);
            }
            try {
                if (!this.N.e()) {
                    audioManager.setMode(0);
                    Log.d(2, "AudioManager.setMode(AudioManager.MODE_NORMAL) (in onDestroy)", new Object[0]);
                } else {
                    final int i10 = f20123t0;
                    j0.e0(new Runnable() {
                        @Override
                        public final void run() {
                            TGCallService.H(i10, audioManager);
                        }
                    }, 5000L);
                }
            } catch (Throwable unused) {
            }
            if (this.f20125a0) {
                audioManager.abandonAudioFocus(this);
            }
            audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            if (this.f20125a0) {
                audioManager.abandonAudioFocus(this);
            }
        }
    }

    public final void O(int i10) {
        String str;
        Object[] objArr = new Object[1];
        if (i10 == 2) {
            str = "SPEAKER_MODE_BLUETOOTH";
        } else if (i10 == 0) {
            str = "SPEAKER_MODE_NONE";
        } else {
            str = i10 == 1 ? "SPEAKER_MODE_SPEAKER_DEFAULT" : Integer.toString(i10);
        }
        objArr[0] = str;
        Log.d(2, "setAudioMode: %s", objArr);
        this.Y = i10;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (i10 == 0) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
        } else if (i10 != 1) {
            if (i10 == 2) {
                audioManager.setBluetoothScoOn(true);
                audioManager.setSpeakerphoneOn(false);
            } else if (i10 == 3) {
                audioManager.setBluetoothScoOn(false);
                audioManager.setSpeakerphoneOn(true);
            }
        } else if (E()) {
            audioManager.setSpeakerphoneOn(true);
        } else {
            audioManager.setBluetoothScoOn(true);
        }
    }

    public final void P(TdApi.Call call) {
        String str;
        TdApi.Call call2 = this.f20126b;
        boolean z10 = (call2 == null || call == null || call2.f19905id != call.f19905id) ? false : true;
        this.f20126b = call;
        if (!z10 || (str = this.f20128c) == null) {
            if (call != null) {
                str = "call_" + this.f20126b.f19905id + "_" + System.currentTimeMillis();
            } else {
                str = null;
            }
        }
        this.f20128c = str;
        if (Build.VERSION.SDK_INT >= 26) {
            t((NotificationManager) getSystemService("notification"));
        }
    }

    public final void Q(o6 o6Var, int i10) {
        if (this.f20124a != o6Var || i10 != q()) {
            if (this.f20126b != null) {
                this.f20124a.e2().m2(this.f20126b.f19905id, this);
                j0.g0(this);
            }
            this.f20124a = o6Var;
            TdApi.User user = null;
            P(o6Var != null ? o6Var.e2().g0(i10) : null);
            this.X = -1;
            if (this.f20126b != null) {
                user = o6Var.e2().u2(this.f20126b.userId);
            }
            this.M = user;
            if (this.f20126b != null) {
                o6Var.e2().Y1(this.f20126b.f19905id, this);
                j0.d(this);
            }
        }
    }

    @Override
    public void Q4(int i10, int i11) {
        TdApi.Call call = this.f20126b;
        if (call != null && call.f19905id == i10) {
            this.X = i11;
        }
    }

    public final void R(boolean z10) {
        if (this.f20130d0 != z10) {
            this.f20130d0 = z10;
            if (z10) {
                V();
            } else {
                W();
            }
        }
    }

    public final boolean S() {
        Notification.Builder builder;
        String G1;
        TdApi.Call call = this.f20126b;
        boolean z10 = call != null && !call.isOutgoing && call.state.getConstructor() == 1073048620;
        if (!z10 && this.f20133g0 == null) {
            return false;
        }
        boolean z11 = z10 && k.d(this).a();
        if (z11 == (this.f20133g0 != null)) {
            return z11;
        }
        if (j0.F() == 0) {
            this.f20134h0 = true;
            Log.i("No need to show incoming notification right now, but may in future.", new Object[0]);
            return true;
        }
        Log.i("Showing incoming notification", new Object[0]);
        int i10 = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        TdApi.File file = null;
        if (i10 >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            t(notificationManager);
            NotificationChannel notificationChannel = new NotificationChannel(this.f20128c, w.i1(R.string.NotificationChannelCall), 4);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
            builder = new Notification.Builder(this, this.f20128c);
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentTitle(w.i1(R.string.CallBrandingIncoming)).setContentText(t2.r2(this.M)).setSmallIcon(R.drawable.baseline_phone_24_white).setContentIntent(PendingIntent.getActivity(j0.q(), 0, v.P(), Log.TAG_TDLIB_OPTIONS));
        if (this.f20124a.F4().q1() && (G1 = this.f20124a.G1()) != null) {
            builder.setSubText(G1);
        }
        Intent intent = new Intent();
        v.I(intent, false);
        intent.setAction("org.thunderdog.challegram.DECLINE_CALL");
        String i12 = w.i1(R.string.DeclineCall);
        if (i10 >= 24) {
            SpannableString spannableString = new SpannableString(i12);
            spannableString.setSpan(new ForegroundColorSpan(j.L(R.id.theme_color_circleButtonNegative)), 0, spannableString.length(), 0);
            i12 = spannableString;
        }
        builder.addAction(R.drawable.round_call_end_24_white, i12, PendingIntent.getBroadcast(this, 0, intent, Log.TAG_TDLIB_OPTIONS));
        Intent intent2 = new Intent();
        v.I(intent2, false);
        intent2.setAction("org.thunderdog.challegram.ANSWER_CALL");
        String i13 = w.i1(R.string.AnswerCall);
        if (i10 >= 24) {
            SpannableString spannableString2 = new SpannableString(i13);
            spannableString2.setSpan(new ForegroundColorSpan(j.L(R.id.theme_color_circleButtonPositive)), 0, spannableString2.length(), 0);
            i13 = spannableString2;
        }
        builder.addAction(R.drawable.round_call_24_white, i13, PendingIntent.getBroadcast(this, 0, intent2, Log.TAG_TDLIB_OPTIONS));
        builder.setPriority(2);
        builder.setShowWhen(false);
        builder.setColor(this.f20124a.B1());
        builder.setVibrate(new long[0]);
        builder.setCategory("call");
        builder.setFullScreenIntent(PendingIntent.getActivity(this, Log.TAG_TDLIB_OPTIONS, v.P(), 0), true);
        TdApi.User user = this.M;
        if (user != null) {
            o6 o6Var = this.f20124a;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            bitmap = qb.b(o6Var, file, t2.I0(user, o6Var.fa()), t2.E1(this.M), false, true);
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        Notification build = builder.build();
        this.f20133g0 = build;
        v0.N2(this, 2147483644, build);
        return true;
    }

    public final void T() {
        Notification.Builder builder;
        String G1;
        TdApi.Call call = this.f20126b;
        boolean z10 = call != null && (call.isOutgoing || call.state.getConstructor() == -1848149403 || this.f20126b.state.getConstructor() == -2000107571) && !t2.Z2(this.f20126b) && j0.F() != 0;
        if (z10 != (this.f20129c0 != null)) {
            TdApi.File file = null;
            if (!z10) {
                t((NotificationManager) getSystemService("notification"));
                v0.O2(this, true, 2147483645, 2147483644);
                this.f20129c0 = null;
                this.f20133g0 = null;
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                t(notificationManager);
                NotificationChannel notificationChannel = new NotificationChannel(this.f20128c, w.i1(R.string.NotificationChannelOutgoingCall), 2);
                notificationChannel.enableVibration(false);
                notificationChannel.enableLights(false);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
                builder = new Notification.Builder(this, this.f20128c);
            } else {
                builder = new Notification.Builder(this);
            }
            builder.setContentTitle(w.i1(R.string.OutgoingCall)).setContentText(t2.r2(this.M)).setSmallIcon(R.drawable.baseline_phone_24_white).setContentIntent(PendingIntent.getActivity(j0.q(), 0, v.P(), Log.TAG_TDLIB_OPTIONS));
            if (this.f20124a.F4().q1() && (G1 = this.f20124a.G1()) != null) {
                builder.setSubText(G1);
            }
            Intent intent = new Intent();
            v.I(intent, false);
            intent.setAction("org.thunderdog.challegram.END_CALL");
            builder.addAction(R.drawable.round_call_end_24_white, w.i1(R.string.VoipEndCall), PendingIntent.getBroadcast(this, 0, intent, 134217728));
            builder.setPriority(2);
            builder.setShowWhen(false);
            builder.setColor(this.f20124a.B1());
            o6 o6Var = this.f20124a;
            TdApi.User user = this.M;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            Bitmap b10 = qb.b(o6Var, file, t2.I0(user, o6Var.fa()), t2.E1(this.M), false, true);
            if (b10 != null) {
                builder.setLargeIcon(b10);
            }
            Notification build = builder.build();
            this.f20129c0 = build;
            v0.N2(this, 2147483645, build);
        }
    }

    public final void U() {
        if (this.f20124a != null && this.f20126b != null) {
            try {
                Intent intent = new Intent(this, VoIPFeedbackActivity.class);
                PendingIntent.getActivity(this, 0, intent.setAction("RATE_CALL_" + this.f20126b.f19905id).putExtra("account_id", this.f20124a.A6()).putExtra("call_id", this.f20126b.f19905id).addFlags(805306368), 0).send();
            } catch (Throwable th) {
                Log.e(2, "Error starting rate activity", th, new Object[0]);
            }
        }
    }

    public final void V() {
        Log.i(2, "startRinging", new Object[0]);
        ya.o1().w2().A0(32);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f20131e0 = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                TGCallService.this.I(mediaPlayer2);
            }
        });
        this.f20131e0.setLooping(true);
        this.f20131e0.setAudioStreamType(2);
        try {
            this.f20131e0.setDataSource(this, Uri.parse(this.f20124a.ka().T(ob.a.c(this.M.f19979id))));
            this.f20131e0.prepareAsync();
        } catch (Throwable th) {
            Log.e(2, "Failed to start ringing", th, new Object[0]);
            MediaPlayer mediaPlayer2 = this.f20131e0;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                this.f20131e0 = null;
            }
        }
        int X = this.f20124a.ka().X(ob.a.c(this.M.f19979id));
        if (X != 3) {
            Vibrator vibrator = (Vibrator) getSystemService("vibrator");
            this.f20132f0 = vibrator;
            if (vibrator != null) {
                if (X == 1) {
                    vibrator.vibrate(jb.f27800s0, 0);
                } else if (X == 2) {
                    vibrator.vibrate(jb.f27801t0, 0);
                } else if (this.f20124a.ka().r1()) {
                    this.f20132f0.vibrate(jb.f27801t0, 0);
                }
            }
        }
        if (!S()) {
            Log.v(2, "Starting incall activity for incoming call", new Object[0]);
            if (j0.F() != 0) {
                p();
            }
        }
    }

    public final void W() {
        t((NotificationManager) getSystemService("notification"));
        v0.O2(this, true, 2147483645, 2147483644);
        this.f20129c0 = null;
        this.f20133g0 = null;
        MediaPlayer mediaPlayer = this.f20131e0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f20131e0.release();
            this.f20131e0 = null;
        }
        Vibrator vibrator = this.f20132f0;
        if (vibrator != null) {
            vibrator.cancel();
            this.f20132f0 = null;
        }
    }

    public final void X(boolean z10) {
        if (this.f20136j0 != z10) {
            this.f20136j0 = z10;
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (z10) {
                Log.d(2, "AudioManager.startBluetoothSco()", new Object[0]);
                audioManager.startBluetoothSco();
            } else {
                Log.d(2, "AudioManager.stopBluetoothSco()", new Object[0]);
                audioManager.stopBluetoothSco();
            }
            K();
        }
    }

    public final void Y(TdApi.Call call) {
        P(call);
        a0();
    }

    public final void Z() {
        int i10;
        TdApi.Call call = this.f20126b;
        if (call == null || call.state.getConstructor() != 1073048620 || this.f20126b.isOutgoing) {
            TdApi.Call call2 = this.f20126b;
            int O0 = call2 != null ? t2.O0(call2) : 0;
            R(false);
            i10 = O0;
        } else {
            R(true);
            i10 = 0;
        }
        if (i10 != 0) {
            switch (i10) {
                case R.raw.voip_busy:
                    this.N.j(i10, 1.0f, 1.0f, 0, 2, 1.0f);
                    return;
                case R.raw.voip_connecting:
                default:
                    this.N.j(i10, 1.0f, 1.0f, 0, this.f20126b.state.getConstructor() == -1848149403 ? 0 : -1, 1.0f);
                    return;
                case R.raw.voip_end:
                case R.raw.voip_fail:
                    this.N.j(i10, 1.0f, 1.0f, 0, 0, 1.0f);
                    return;
            }
        } else {
            this.N.n();
        }
    }

    public final void a0() {
        TdApi.Call call = this.f20126b;
        if (call != null && call.state.getConstructor() == 1394310213 && this.f20141o0) {
            d0();
            if (!this.V && ((TdApi.CallStateDiscarded) this.f20126b.state).needDebugInformation && !i.i(this.f20142p0)) {
                this.V = true;
                this.f20124a.v4().o(new TdApi.SendCallDebugInformation(this.f20126b.f19905id, this.f20142p0), this.f20124a.na());
            }
            if (!this.W && ((TdApi.CallStateDiscarded) this.f20126b.state).needRating) {
                this.W = true;
                U();
            }
        }
        v();
        Z();
        T();
        d0();
        s();
    }

    public final void b0(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.service.TGCallService.b0(boolean):void");
    }

    @Override
    public void b7(int i10, CallSettings callSettings) {
        VoIPController voIPController = this.O;
        int i11 = 0;
        if (voIPController != null) {
            voIPController.setMicMute(callSettings != null && callSettings.isMicMuted());
        }
        if (callSettings != null) {
            i11 = callSettings.getSpeakerMode();
        }
        O(i11);
    }

    public void c0() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        VoIPController voIPController = this.O;
        if (voIPController != null) {
            int i10 = 1;
            voIPController.setAudioOutputGainControlEnabled(E() && audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !this.S);
            VoIPController voIPController2 = this.O;
            if (this.S || (E() && audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !this.S)) {
                i10 = 0;
            }
            voIPController2.setEchoCancellationStrength(i10);
        }
    }

    @Override
    public void d(TdApi.Call call) {
        if (!this.U) {
            Y(call);
        }
    }

    public final void d0() {
        VoIPController voIPController = this.O;
        if (voIPController != null) {
            voIPController.getStats(this.f20138l0);
            long z10 = z();
            VoIPController.Stats stats = this.f20138l0;
            long j10 = stats.bytesSentWifi;
            VoIPController.Stats stats2 = this.f20139m0;
            long j11 = j10 - stats2.bytesSentWifi;
            long j12 = stats.bytesRecvdWifi - stats2.bytesRecvdWifi;
            long j13 = stats.bytesSentMobile - stats2.bytesSentMobile;
            long j14 = stats.bytesRecvdMobile - stats2.bytesRecvdMobile;
            double max = Math.max(0L, z10 - this.f20140n0) / 1000.0d;
            VoIPController.Stats stats3 = this.f20138l0;
            this.f20138l0 = this.f20139m0;
            this.f20139m0 = stats3;
            this.f20140n0 = z10;
            if (j11 > 0 || j12 > 0 || max > 0.0d) {
                this.f20124a.v4().o(new TdApi.AddNetworkStatistics(new TdApi.NetworkStatisticsEntryCall(new TdApi.NetworkTypeWiFi(), j11, j12, max)), this.f20124a.na());
            }
            if (j13 > 0 || j14 > 0 || max > 0.0d) {
                NetworkInfo networkInfo = this.f20137k0;
                this.f20124a.v4().o(new TdApi.AddNetworkStatistics(new TdApi.NetworkStatisticsEntryCall((networkInfo == null || !networkInfo.isRoaming()) ? new TdApi.NetworkTypeMobile() : new TdApi.NetworkTypeMobileRoaming(), j13, j14, max)), this.f20124a.na());
            }
        }
    }

    @Override
    public void f(int i10) {
        a0();
        TdApi.Call call = this.f20126b;
        if (!(call != null && !call.isOutgoing && call.state.getConstructor() == 1073048620)) {
            return;
        }
        if (i10 != 0 && this.f20134h0) {
            this.f20134h0 = false;
            S();
        } else if (i10 == 0) {
            this.f20134h0 = true;
            t((NotificationManager) getSystemService("notification"));
            v0.O2(this, true, 2147483644);
            this.f20133g0 = null;
        }
    }

    public final void o() {
        if (this.f20126b != null) {
            this.f20124a.F4().c0().y(this, this.f20124a, this.f20126b.f19905id);
            if (j0.F() != 0) {
                p();
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override
    public void onAudioFocusChange(int i10) {
        this.f20125a0 = i10 == 1;
        Log.i(2, "onAudioFocusChange, focusChange: %d, haveAudioFocus: %b", Integer.valueOf(i10), Boolean.valueOf(this.f20125a0));
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCallUpgradeRequestReceived() {
    }

    @Override
    public void onConnectionStateChanged(int i10) {
        TdApi.Call call;
        try {
            o6 o6Var = this.f20124a;
            if (!(o6Var == null || (call = this.f20126b) == null)) {
                if (i10 == 3) {
                    o6Var.U4(call.f19905id, i10);
                } else if (i10 == 4) {
                    o6Var.F4().c0().P(this.f20124a, this.f20126b.f19905id, true, B());
                }
            }
        } catch (Throwable th) {
            Log.e(2, "Error", th, new Object[0]);
        }
    }

    @Override
    public void onCreate() {
        int s10;
        super.onCreate();
        j0.L(getApplicationContext());
        f20122s0 = new WeakReference<>(this);
        boolean z10 = false;
        t0 t0Var = new t0(0);
        this.N = t0Var;
        t0Var.k(R.raw.voip_connecting, R.raw.voip_ringback, R.raw.voip_fail, R.raw.voip_end, R.raw.voip_busy);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER") == null || (s10 = i.s(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"))) == 0)) {
            VoIPController.setNativeBufferSize(s10);
            z10 = true;
        }
        if (!z10) {
            VoIPController.setNativeBufferSize(AudioTrack.getMinBufferSize(48000, 4, 2) / 2);
        }
    }

    @Override
    public void onDestroy() {
        this.U = true;
        Log.v(2, "TGCallService.onDestroy", new Object[0]);
        P(null);
        a0();
        try {
            unregisterReceiver(this.T);
        } catch (Throwable th) {
            Log.w(2, "Cannot unregister receiver", th, new Object[0]);
        }
        if (f20122s0 != null && f20122s0.get() == this) {
            f20122s0 = null;
        }
        super.onDestroy();
        N();
        if (!this.N.e()) {
            this.N.l();
        }
        Q(null, 0);
    }

    @Override
    public void onGroupCallKeyReceived(byte[] bArr) {
    }

    @Override
    public void onGroupCallKeySent() {
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 8) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (!this.S && !audioManager.isSpeakerphoneOn()) {
                if (!this.f20136j0 || !audioManager.isBluetoothScoOn()) {
                    boolean z10 = sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f);
                    if (z10 != this.R) {
                        if (Log.isEnabled(2)) {
                            Log.v(2, "Proximity state changed, isNear: %b", Boolean.valueOf(z10));
                        }
                        this.R = z10;
                        try {
                            if (z10) {
                                this.Z.acquire();
                            } else {
                                this.Z.release(1);
                            }
                        } catch (Throwable th) {
                            Log.e(2, "Failed to acquire/release proximity wakelock, isNear: %b", th, Boolean.valueOf(z10));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onSignalBarCountChanged(int i10) {
        TdApi.Call call;
        try {
            o6 o6Var = this.f20124a;
            if (o6Var != null && (call = this.f20126b) != null) {
                o6Var.T4(call.f19905id, i10);
            }
        } catch (Throwable th) {
            Log.e(2, "Error", th, new Object[0]);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        int i12;
        int i13;
        if (Log.isEnabled(2)) {
            Log.i(2, "TGCallService.onStartCommand received, intent: %s", intent);
        }
        int q10 = q();
        if (intent != null) {
            i13 = intent.getIntExtra("account_id", -1);
            i12 = intent.getIntExtra("call_id", 0);
        } else {
            i12 = 0;
            i13 = -1;
        }
        if (i13 == -1 || i12 == 0) {
            Q(null, 0);
        } else {
            Q(ya.R0(i13), i12);
        }
        TdApi.Call call = this.f20126b;
        if (call == null || this.M == null) {
            Log.w(2, "TGCallService.onStartCommand: failed because call or other party not found, call: %s, user: %s", call, this.M);
            stopSelf();
            return 2;
        }
        if (this.O == null) {
            F(this.f20124a, call);
        } else if (!(q10 == 0 || q10 == i12)) {
            throw new IllegalStateException();
        }
        Y(this.f20126b);
        return 2;
    }

    public final void p() {
    }

    public int q() {
        TdApi.Call call = this.f20126b;
        if (call != null) {
            return call.f19905id;
        }
        return 0;
    }

    public int r() {
        o6 o6Var = this.f20124a;
        if (o6Var != null) {
            return o6Var.A6();
        }
        return -1;
    }

    public final void s() {
        VoIPController voIPController;
        i.l A1;
        if (!this.f20141o0 && !t2.Z2(this.f20126b)) {
            TdApi.Call call = this.f20126b;
            if (call != null && call.state.getConstructor() == -2000107571 && !this.f20141o0 && (voIPController = this.O) != null) {
                TdApi.Call call2 = this.f20126b;
                TdApi.CallStateReady callStateReady = (TdApi.CallStateReady) call2.state;
                voIPController.setEncryptionKey(callStateReady.encryptionKey, call2.isOutgoing);
                try {
                    this.O.setRemoteEndpoints(callStateReady.servers, callStateReady.protocol.udpP2p && callStateReady.allowP2p, he.i.c2().c0(), callStateReady.protocol.maxLayer);
                    int G0 = he.i.c2().G0();
                    if (!(G0 == 0 || (A1 = he.i.c2().A1(G0)) == null || !A1.b())) {
                        if (A1.M.getConstructor() != -890027341) {
                            Log.e("Unsupported proxy type for calls: %s", A1.M);
                        } else {
                            TdApi.ProxyTypeSocks5 proxyTypeSocks5 = (TdApi.ProxyTypeSocks5) A1.M;
                            this.O.setProxy(A1.f13864b, A1.f13865c, proxyTypeSocks5.username, proxyTypeSocks5.password);
                        }
                    }
                    this.O.start();
                    b0(false);
                    this.O.connect();
                    this.f20141o0 = true;
                } catch (IllegalArgumentException unused) {
                    D();
                }
            }
        } else if (t2.Z2(this.f20126b)) {
            VoIPController voIPController2 = this.O;
            if (voIPController2 != null) {
                this.f20142p0 = voIPController2.getDebugLog();
                this.O.release();
                this.O = null;
            }
            t((NotificationManager) getSystemService("notification"));
            v0.O2(this, true, 2147483645, 2147483644);
            this.f20129c0 = null;
            this.f20133g0 = null;
            stopSelf();
        }
    }

    public final void t(NotificationManager notificationManager) {
        String str;
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                String id2 = notificationChannel.getId();
                if (id2.startsWith("call_") && ((str = this.f20128c) == null || !str.equals(id2))) {
                    try {
                        notificationManager.deleteNotificationChannel(notificationChannel.getId());
                    } catch (Throwable th) {
                        Log.e("Unable to delete notification channel", th, new Object[0]);
                    }
                }
            }
        }
    }

    public boolean u(o6 o6Var, int i10) {
        return this.f20126b != null && r() == o6Var.A6() && i10 == this.f20126b.f19905id;
    }

    public final void v() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (t2.G2(this.f20126b) && !this.f20127b0) {
            this.f20127b0 = true;
            Log.i(2, "Configuring device for call...", new Object[0]);
            audioManager.setMode(3);
            f20123t0++;
            audioManager.setSpeakerphoneOn(false);
            audioManager.requestAudioFocus(this, 0, 1);
            c0();
            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(8);
            if (defaultSensor != null) {
                try {
                    this.Z = ((PowerManager) getSystemService("power")).newWakeLock(32, "tgx:voip-proximity");
                    sensorManager.registerListener(this, defaultSensor, 3);
                } catch (Throwable th) {
                    Log.e(2, "Error initializing proximity sensor", th, new Object[0]);
                }
            }
        } else if (!t2.G2(this.f20126b) && this.f20127b0) {
            this.f20127b0 = false;
            Log.i(2, "Unconfiguring device from call...", new Object[0]);
            audioManager.setMode(0);
            SensorManager sensorManager2 = (SensorManager) getSystemService("sensor");
            if (sensorManager2.getDefaultSensor(8) != null) {
                sensorManager2.unregisterListener(this);
            }
            PowerManager.WakeLock wakeLock = this.Z;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.Z.release();
            }
        }
    }

    public final void x() {
        if (this.f20126b != null) {
            this.f20124a.F4().c0().P(this.f20124a, this.f20126b.f19905id, false, 0L);
        }
    }

    @Override
    public void x0(int i10, int i11) {
    }

    public int y() {
        return this.X;
    }

    public long z() {
        VoIPController voIPController = this.O;
        if (voIPController != null) {
            return voIPController.getCallDuration();
        }
        return -1L;
    }
}
