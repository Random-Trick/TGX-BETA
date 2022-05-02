package org.thunderdog.challegram.service;

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
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ge.C4868i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.receiver.VoIPMediaButtonReceiver;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.gui.CallSettings;
import org.thunderdog.challegram.voip.gui.VoIPFeedbackActivity;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.C5144t0;
import p193nb.C7316a;
import p213p0.C7976k;
import p350yd.C10536ab;
import p350yd.C10827lb;
import p350yd.C10930q6;
import p350yd.C10996sb;
import p350yd.C11059v7;
import p364zd.C11524j;

public class TGCallService extends Service implements C11059v7.AbstractC11062c, AudioManager.OnAudioFocusChangeListener, SensorEventListener, VoIPController.ConnectionStateListener, C1379j0.AbstractC1380a {
    public static final String f25668r0;
    public static volatile WeakReference<TGCallService> f25669s0;
    public static int f25670t0;
    public TdApi.User f25671M;
    public C5144t0 f25672N;
    public VoIPController f25673O;
    public PowerManager.WakeLock f25674P;
    public BluetoothAdapter f25675Q;
    public boolean f25676R;
    public boolean f25677S;
    public boolean f25679U;
    public boolean f25680V;
    public boolean f25681W;
    public int f25683Y;
    public PowerManager.WakeLock f25684Z;
    public C10930q6 f25685a;
    public boolean f25686a0;
    public TdApi.Call f25687b;
    public boolean f25688b0;
    public String f25689c;
    public Notification f25690c0;
    public boolean f25691d0;
    public MediaPlayer f25692e0;
    public Vibrator f25693f0;
    public Notification f25694g0;
    public boolean f25695h0;
    public boolean f25697j0;
    public NetworkInfo f25698k0;
    public long f25701n0;
    public boolean f25702o0;
    public String f25703p0;
    public boolean f25704q0;
    public final BroadcastReceiver f25678T = new C7916a();
    public int f25682X = -1;
    public Boolean f25696i0 = null;
    public VoIPController.Stats f25699l0 = new VoIPController.Stats();
    public VoIPController.Stats f25700m0 = new VoIPController.Stats();

    public class C7916a extends BroadcastReceiver {
        public C7916a() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean z = true;
            if (TGCallService.f25668r0.equals(action)) {
                TGCallService tGCallService = TGCallService.this;
                if (intent.getIntExtra("state", 0) != 1) {
                    z = false;
                }
                tGCallService.f25677S = z;
                if (TGCallService.this.f25677S && TGCallService.this.f25684Z != null && TGCallService.this.f25684Z.isHeld()) {
                    TGCallService.this.f25684Z.release();
                }
                TGCallService.this.f25676R = false;
                TGCallService.this.m14230c0();
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                TGCallService.this.m14232b0(true);
            } else if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                TGCallService tGCallService2 = TGCallService.this;
                if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 2) {
                    z = false;
                }
                tGCallService2.m14238X(z);
            } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
                TGCallService.this.m14251K();
            } else if ("android.intent.action.PHONE_STATE".equals(action)) {
                if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                    TGCallService.this.m14258D();
                }
            } else if ("org.thunderdog.challegram.DECLINE_CALL".equals(action)) {
                TGCallService.this.m14210x();
            } else if ("org.thunderdog.challegram.END_CALL".equals(action)) {
                TGCallService.this.m14258D();
            } else if ("org.thunderdog.challegram.ANSWER_CALL".equals(action)) {
                TGCallService.this.m14219o();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f25668r0 = "android.intent.action.HEADSET_PLUG";
        } else {
            f25668r0 = "android.intent.action.HEADSET_PLUG";
        }
    }

    public static String m14259C() {
        VoIPController voIPController;
        TGCallService w = m14211w();
        return (w == null || (voIPController = w.f25673O) == null) ? "instance not found" : voIPController.getDebugString();
    }

    public static void m14254H(int i, AudioManager audioManager) {
        if (i == f25670t0) {
            try {
                Log.m14733d(2, "AudioManager.setMode(AudioManager.MODE_NORMAL) (in onDestroy, delayed)", new Object[0]);
                audioManager.setMode(0);
            } catch (Throwable unused) {
            }
        }
    }

    public void m14253I(MediaPlayer mediaPlayer) {
        this.f25692e0.start();
    }

    public static void m14252J() {
        TGCallService w = m14211w();
        if (w != null) {
            w.f25704q0 = true;
        }
    }

    public static TGCallService m14211w() {
        if (f25669s0 != null) {
            return f25669s0.get();
        }
        return null;
    }

    public final CallSettings m14261A() {
        if (this.f25687b == null) {
            return null;
        }
        CallSettings h0 = this.f25685a.m2480e2().m1640h0(this.f25687b.f25364id);
        return h0 == null ? new CallSettings(this.f25685a, this.f25687b.f25364id) : h0;
    }

    public long m14260B() {
        VoIPController voIPController = this.f25673O;
        if (voIPController == null || !this.f25702o0) {
            return 0L;
        }
        return voIPController.getPreferredRelayID();
    }

    public final void m14258D() {
        if (this.f25687b != null) {
            this.f25685a.m2930B4().m4713c0().m4595R(this.f25685a, this.f25687b.f25364id, false, m14260B());
        }
    }

    public boolean m14257E() {
        if (((TelephonyManager) getSystemService("phone")).getPhoneType() != 0) {
            return true;
        }
        Boolean bool = this.f25696i0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
            int i = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
            if ((((Integer) method.invoke((AudioManager) getSystemService("audio"), 0)).intValue() & i) == i) {
                this.f25696i0 = Boolean.TRUE;
            } else {
                this.f25696i0 = Boolean.FALSE;
            }
        } catch (Throwable th) {
            Log.m14728e(2, "Error while checking earpiece! ", th, new Object[0]);
            this.f25696i0 = Boolean.TRUE;
        }
        return this.f25696i0.booleanValue();
    }

    public final void m14256F(C10930q6 q6Var, TdApi.Call call) {
        if (this.f25673O == null) {
            Log.m14716v(2, "TGCallService.onCreate", new Object[0]);
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            try {
                VoIPController voIPController = new VoIPController();
                this.f25673O = voIPController;
                voIPController.setConnectionStateListener(this);
                this.f25673O.setConfig(q6Var.m2432h2(), q6Var.m2448g2(), q6Var.m2413i5().m4017O(), call.f25364id);
                if (this.f25674P == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "tgx:voip");
                    this.f25674P = newWakeLock;
                    newWakeLock.acquire();
                }
                this.f25675Q = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT >= 21) {
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                } else {
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                }
                if (this.f25675Q != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                registerReceiver(this.f25678T, intentFilter);
                audioManager.registerMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
                BluetoothAdapter bluetoothAdapter = this.f25675Q;
                if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
                    int profileConnectionState = this.f25675Q.getProfileConnectionState(1);
                    m14238X(profileConnectionState == 2);
                    if (profileConnectionState == 2) {
                        audioManager.setBluetoothScoOn(true);
                    }
                    m14251K();
                }
            } catch (Throwable th) {
                Log.m14728e(2, "Error initializing call", th, new Object[0]);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean m14255G() {
        return this.f25697j0;
    }

    public final void m14251K() {
        CallSettings A;
        int i = 0;
        Log.m14733d(2, "notifyAudioSettingsChanged", new Object[0]);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (m14255G() && audioManager.isBluetoothScoOn()) {
            i = 2;
        } else if (audioManager.isSpeakerphoneOn()) {
            i = 3;
        }
        if (this.f25683Y != i && (A = m14261A()) != null) {
            this.f25683Y = i;
            A.setSpeakerMode(i);
        }
    }

    public void m14250L(KeyEvent keyEvent) {
    }

    public void m14249M(Context context, Intent intent) {
        this.f25678T.onReceive(context, intent);
    }

    public final void m14248N() {
        PowerManager.WakeLock wakeLock = this.f25674P;
        if (wakeLock != null) {
            wakeLock.release();
            final AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (this.f25697j0 && !this.f25672N.m23828e()) {
                audioManager.stopBluetoothSco();
                Log.m14733d(2, "AudioManager.stopBluetoothSco (in onDestroy)", new Object[0]);
                audioManager.setSpeakerphoneOn(false);
                Log.m14733d(2, "AudioManager.setSpeakerphoneOn(false) (in onDestroy)", new Object[0]);
            }
            try {
                if (!this.f25672N.m23828e()) {
                    audioManager.setMode(0);
                    Log.m14733d(2, "AudioManager.setMode(AudioManager.MODE_NORMAL) (in onDestroy)", new Object[0]);
                } else {
                    final int i = f25670t0;
                    C1379j0.m37332e0(new Runnable() {
                        @Override
                        public final void run() {
                            TGCallService.m14254H(i, audioManager);
                        }
                    }, 5000L);
                }
            } catch (Throwable unused) {
            }
            if (this.f25686a0) {
                audioManager.abandonAudioFocus(this);
            }
            audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, VoIPMediaButtonReceiver.class));
            if (this.f25686a0) {
                audioManager.abandonAudioFocus(this);
            }
        }
    }

    public final void m14247O(int i) {
        String str;
        Object[] objArr = new Object[1];
        if (i == 2) {
            str = "SPEAKER_MODE_BLUETOOTH";
        } else if (i == 0) {
            str = "SPEAKER_MODE_NONE";
        } else {
            str = i == 1 ? "SPEAKER_MODE_SPEAKER_DEFAULT" : Integer.toString(i);
        }
        objArr[0] = str;
        Log.m14733d(2, "setAudioMode: %s", objArr);
        this.f25683Y = i;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (i == 0) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
        } else if (i != 1) {
            if (i == 2) {
                audioManager.setBluetoothScoOn(true);
                audioManager.setSpeakerphoneOn(false);
            } else if (i == 3) {
                audioManager.setBluetoothScoOn(false);
                audioManager.setSpeakerphoneOn(true);
            }
        } else if (m14257E()) {
            audioManager.setSpeakerphoneOn(true);
        } else {
            audioManager.setBluetoothScoOn(true);
        }
    }

    public final void m14246P(TdApi.Call call) {
        String str;
        TdApi.Call call2 = this.f25687b;
        boolean z = (call2 == null || call == null || call2.f25364id != call.f25364id) ? false : true;
        this.f25687b = call;
        if (!z || (str = this.f25689c) == null) {
            if (call != null) {
                str = "call_" + this.f25687b.f25364id + "_" + System.currentTimeMillis();
            } else {
                str = null;
            }
        }
        this.f25689c = str;
        if (Build.VERSION.SDK_INT >= 26) {
            m14214t((NotificationManager) getSystemService("notification"));
        }
    }

    public final void m14245Q(C10930q6 q6Var, int i) {
        if (this.f25685a != q6Var || i != m14217q()) {
            if (this.f25687b != null) {
                this.f25685a.m2480e2().m1615n2(this.f25687b.f25364id, this);
                C1379j0.m37328g0(this);
            }
            this.f25685a = q6Var;
            TdApi.User user = null;
            m14246P(q6Var != null ? q6Var.m2480e2().m1644g0(i) : null);
            this.f25682X = -1;
            if (this.f25687b != null) {
                user = q6Var.m2480e2().m1583v2(this.f25687b.userId);
            }
            this.f25671M = user;
            if (this.f25687b != null) {
                q6Var.m2480e2().m1665a2(this.f25687b.f25364id, this);
                C1379j0.m37335d(this);
            }
        }
    }

    public final void m14244R(boolean z) {
        if (this.f25691d0 != z) {
            this.f25691d0 = z;
            if (z) {
                m14240V();
            } else {
                m14239W();
            }
        }
    }

    public final boolean m14243S() {
        Notification.Builder builder;
        String G1;
        TdApi.Call call = this.f25687b;
        boolean z = call != null && !call.isOutgoing && call.state.getConstructor() == 1073048620;
        if (!z && this.f25694g0 == null) {
            return false;
        }
        boolean z2 = z && C7976k.m13878d(this).m13881a();
        if (z2 == (this.f25694g0 != null)) {
            return z2;
        }
        if (C1379j0.m37364F() == 0) {
            this.f25695h0 = true;
            Log.m14719i("No need to show incoming notification right now, but may in future.", new Object[0]);
            return true;
        }
        Log.m14719i("Showing incoming notification", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        TdApi.File file = null;
        if (i >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            m14214t(notificationManager);
            NotificationChannel notificationChannel = new NotificationChannel(this.f25689c, C4403w.m27869i1(R.string.NotificationChannelCall), 4);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
            builder = new Notification.Builder(this, this.f25689c);
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentTitle(C4403w.m27869i1(R.string.CallBrandingIncoming)).setContentText(C4779t2.m25437r2(this.f25671M)).setSmallIcon(R.drawable.baseline_phone_24_white).setContentIntent(PendingIntent.getActivity(C1379j0.m37309q(), 0, C1405v.m37126Q(), Log.TAG_TDLIB_OPTIONS));
        if (this.f25685a.m2930B4().m4661q1() && (G1 = this.f25685a.m2853G1()) != null) {
            builder.setSubText(G1);
        }
        if (i >= 16) {
            Intent intent = new Intent();
            C1405v.m37133J(intent, false);
            intent.setAction("org.thunderdog.challegram.DECLINE_CALL");
            String i1 = C4403w.m27869i1(R.string.DeclineCall);
            if (i >= 24) {
                SpannableString spannableString = new SpannableString(i1);
                spannableString.setSpan(new ForegroundColorSpan(C11524j.m228N(R.id.theme_color_circleButtonNegative)), 0, spannableString.length(), 0);
                i1 = spannableString;
            }
            builder.addAction(R.drawable.round_call_end_24_white, i1, PendingIntent.getBroadcast(this, 0, intent, Log.TAG_TDLIB_OPTIONS));
            Intent intent2 = new Intent();
            C1405v.m37133J(intent2, false);
            intent2.setAction("org.thunderdog.challegram.ANSWER_CALL");
            String i12 = C4403w.m27869i1(R.string.AnswerCall);
            if (i >= 24) {
                SpannableString spannableString2 = new SpannableString(i12);
                spannableString2.setSpan(new ForegroundColorSpan(C11524j.m228N(R.id.theme_color_circleButtonPositive)), 0, spannableString2.length(), 0);
                i12 = spannableString2;
            }
            builder.addAction(R.drawable.round_call_24_white, i12, PendingIntent.getBroadcast(this, 0, intent2, Log.TAG_TDLIB_OPTIONS));
            builder.setPriority(2);
        }
        if (i >= 17) {
            builder.setShowWhen(false);
        }
        if (i >= 21) {
            builder.setColor(this.f25685a.m2933B1());
            builder.setVibrate(new long[0]);
            builder.setCategory("call");
            builder.setFullScreenIntent(PendingIntent.getActivity(this, Log.TAG_TDLIB_OPTIONS, C1405v.m37126Q(), 0), true);
        }
        TdApi.User user = this.f25671M;
        if (user != null) {
            C10930q6 q6Var = this.f25685a;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            bitmap = C10996sb.m2029b(q6Var, file, C4779t2.m25674I0(user, q6Var.m2519ba()), C4779t2.m25701E1(this.f25671M), false, true);
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        if (i >= 16) {
            this.f25694g0 = builder.build();
        } else {
            this.f25694g0 = builder.getNotification();
        }
        C7389v0.m16703N2(this, 2147483644, this.f25694g0);
        return true;
    }

    public final void m14242T() {
        Notification.Builder builder;
        String G1;
        TdApi.Call call = this.f25687b;
        boolean z = call != null && (call.isOutgoing || call.state.getConstructor() == -1848149403 || this.f25687b.state.getConstructor() == -2000107571) && !C4779t2.m25562Z2(this.f25687b) && C1379j0.m37364F() != 0;
        if (z != (this.f25690c0 != null)) {
            TdApi.File file = null;
            if (!z) {
                m14214t((NotificationManager) getSystemService("notification"));
                C7389v0.m16699O2(this, true, 2147483645, 2147483644);
                this.f25690c0 = null;
                this.f25694g0 = null;
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                m14214t(notificationManager);
                NotificationChannel notificationChannel = new NotificationChannel(this.f25689c, C4403w.m27869i1(R.string.NotificationChannelOutgoingCall), 2);
                notificationChannel.enableVibration(false);
                notificationChannel.enableLights(false);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
                builder = new Notification.Builder(this, this.f25689c);
            } else {
                builder = new Notification.Builder(this);
            }
            builder.setContentTitle(C4403w.m27869i1(R.string.OutgoingCall)).setContentText(C4779t2.m25437r2(this.f25671M)).setSmallIcon(R.drawable.baseline_phone_24_white).setContentIntent(PendingIntent.getActivity(C1379j0.m37309q(), 0, C1405v.m37126Q(), Log.TAG_TDLIB_OPTIONS));
            if (this.f25685a.m2930B4().m4661q1() && (G1 = this.f25685a.m2853G1()) != null) {
                builder.setSubText(G1);
            }
            if (i >= 16) {
                Intent intent = new Intent();
                C1405v.m37133J(intent, false);
                intent.setAction("org.thunderdog.challegram.END_CALL");
                builder.addAction(R.drawable.round_call_end_24_white, C4403w.m27869i1(R.string.VoipEndCall), PendingIntent.getBroadcast(this, 0, intent, 134217728));
                builder.setPriority(2);
            }
            if (i >= 17) {
                builder.setShowWhen(false);
            }
            if (i >= 21) {
                builder.setColor(this.f25685a.m2933B1());
            }
            C10930q6 q6Var = this.f25685a;
            TdApi.User user = this.f25671M;
            TdApi.ProfilePhoto profilePhoto = user.profilePhoto;
            if (profilePhoto != null) {
                file = profilePhoto.small;
            }
            Bitmap b = C10996sb.m2029b(q6Var, file, C4779t2.m25674I0(user, q6Var.m2519ba()), C4779t2.m25701E1(this.f25671M), false, true);
            if (b != null) {
                builder.setLargeIcon(b);
            }
            if (i >= 16) {
                this.f25690c0 = builder.build();
            } else {
                this.f25690c0 = builder.getNotification();
            }
            C7389v0.m16703N2(this, 2147483645, this.f25690c0);
        }
    }

    public final void m14241U() {
        if (this.f25685a != null && this.f25687b != null) {
            try {
                Intent intent = new Intent(this, VoIPFeedbackActivity.class);
                PendingIntent.getActivity(this, 0, intent.setAction("RATE_CALL_" + this.f25687b.f25364id).putExtra("account_id", this.f25685a.m2188w6()).putExtra("call_id", this.f25687b.f25364id).addFlags(805306368), 0).send();
            } catch (Throwable th) {
                Log.m14728e(2, "Error starting rate activity", th, new Object[0]);
            }
        }
    }

    public final void m14240V() {
        Log.m14721i(2, "startRinging", new Object[0]);
        C10536ab.m4667o1().m4636w2().m7119A0(32);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f25692e0 = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                TGCallService.this.m14253I(mediaPlayer2);
            }
        });
        this.f25692e0.setLooping(true);
        this.f25692e0.setAudioStreamType(2);
        try {
            this.f25692e0.setDataSource(this, Uri.parse(this.f25685a.m2440ga().m3173T(C7316a.m17058c(this.f25671M.f25439id))));
            this.f25692e0.prepareAsync();
        } catch (Throwable th) {
            Log.m14728e(2, "Failed to start ringing", th, new Object[0]);
            MediaPlayer mediaPlayer2 = this.f25692e0;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                this.f25692e0 = null;
            }
        }
        int X = this.f25685a.m2440ga().m3161X(C7316a.m17058c(this.f25671M.f25439id));
        if (X != 3) {
            Vibrator vibrator = (Vibrator) getSystemService("vibrator");
            this.f25693f0 = vibrator;
            if (vibrator != null) {
                if (X == 1) {
                    vibrator.vibrate(C10827lb.f34665s0, 0);
                } else if (X == 2) {
                    vibrator.vibrate(C10827lb.f34666t0, 0);
                } else if (this.f25685a.m2440ga().m3086r1()) {
                    this.f25693f0.vibrate(C10827lb.f34666t0, 0);
                }
            }
        }
        if (!m14243S()) {
            Log.m14716v(2, "Starting incall activity for incoming call", new Object[0]);
            if (C1379j0.m37364F() != 0) {
                m14218p();
            }
        }
    }

    public final void m14239W() {
        m14214t((NotificationManager) getSystemService("notification"));
        C7389v0.m16699O2(this, true, 2147483645, 2147483644);
        this.f25690c0 = null;
        this.f25694g0 = null;
        MediaPlayer mediaPlayer = this.f25692e0;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f25692e0.release();
            this.f25692e0 = null;
        }
        Vibrator vibrator = this.f25693f0;
        if (vibrator != null) {
            vibrator.cancel();
            this.f25693f0 = null;
        }
    }

    public final void m14238X(boolean z) {
        if (this.f25697j0 != z) {
            this.f25697j0 = z;
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (z) {
                Log.m14733d(2, "AudioManager.startBluetoothSco()", new Object[0]);
                audioManager.startBluetoothSco();
            } else {
                Log.m14733d(2, "AudioManager.stopBluetoothSco()", new Object[0]);
                audioManager.stopBluetoothSco();
            }
            m14251K();
        }
    }

    @Override
    public void mo1564X4(int i, int i2) {
        TdApi.Call call = this.f25687b;
        if (call != null && call.f25364id == i) {
            this.f25682X = i2;
        }
    }

    public final void m14237Y(TdApi.Call call) {
        m14246P(call);
        m14234a0();
    }

    public final void m14236Z() {
        int i;
        TdApi.Call call = this.f25687b;
        if (call == null || call.state.getConstructor() != 1073048620 || this.f25687b.isOutgoing) {
            TdApi.Call call2 = this.f25687b;
            int O0 = call2 != null ? C4779t2.m25632O0(call2) : 0;
            m14244R(false);
            i = O0;
        } else {
            m14244R(true);
            i = 0;
        }
        if (i != 0) {
            switch (i) {
                case R.raw.voip_busy:
                    this.f25672N.m23823j(i, 1.0f, 1.0f, 0, 2, 1.0f);
                    return;
                case R.raw.voip_connecting:
                default:
                    this.f25672N.m23823j(i, 1.0f, 1.0f, 0, this.f25687b.state.getConstructor() == -1848149403 ? 0 : -1, 1.0f);
                    return;
                case R.raw.voip_end:
                case R.raw.voip_fail:
                    this.f25672N.m23823j(i, 1.0f, 1.0f, 0, 0, 1.0f);
                    return;
            }
        } else {
            this.f25672N.m23819n();
        }
    }

    public final void m14234a0() {
        TdApi.Call call = this.f25687b;
        if (call != null && call.state.getConstructor() == -190853167 && this.f25702o0) {
            m14228d0();
            if (!this.f25680V && ((TdApi.CallStateDiscarded) this.f25687b.state).needDebugInformation && !C5070i.m24061i(this.f25703p0)) {
                this.f25680V = true;
                this.f25685a.m2270r4().m14783o(new TdApi.SendCallDebugInformation(this.f25687b.f25364id, this.f25703p0), this.f25685a.m2392ja());
            }
            if (!this.f25681W && ((TdApi.CallStateDiscarded) this.f25687b.state).needRating) {
                this.f25681W = true;
                m14241U();
            }
        }
        m14212v();
        m14236Z();
        m14242T();
        m14228d0();
        m14215s();
    }

    public final void m14232b0(boolean r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.service.TGCallService.m14232b0(boolean):void");
    }

    @Override
    public void mo1563b7(int i, CallSettings callSettings) {
        VoIPController voIPController = this.f25673O;
        int i2 = 0;
        if (voIPController != null) {
            voIPController.setMicMute(callSettings != null && callSettings.isMicMuted());
        }
        if (callSettings != null) {
            i2 = callSettings.getSpeakerMode();
        }
        m14247O(i2);
    }

    public void m14230c0() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        VoIPController voIPController = this.f25673O;
        if (voIPController != null) {
            int i = 1;
            voIPController.setAudioOutputGainControlEnabled(m14257E() && audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !this.f25677S);
            VoIPController voIPController2 = this.f25673O;
            if (this.f25677S || (m14257E() && audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !this.f25677S)) {
                i = 0;
            }
            voIPController2.setEchoCancellationStrength(i);
        }
    }

    public final void m14228d0() {
        VoIPController voIPController = this.f25673O;
        if (voIPController != null) {
            voIPController.getStats(this.f25699l0);
            long z = m14208z();
            VoIPController.Stats stats = this.f25699l0;
            long j = stats.bytesSentWifi;
            VoIPController.Stats stats2 = this.f25700m0;
            long j2 = j - stats2.bytesSentWifi;
            long j3 = stats.bytesRecvdWifi - stats2.bytesRecvdWifi;
            long j4 = stats.bytesSentMobile - stats2.bytesSentMobile;
            long j5 = stats.bytesRecvdMobile - stats2.bytesRecvdMobile;
            double max = Math.max(0L, z - this.f25701n0) / 1000.0d;
            VoIPController.Stats stats3 = this.f25699l0;
            this.f25699l0 = this.f25700m0;
            this.f25700m0 = stats3;
            this.f25701n0 = z;
            if (j2 > 0 || j3 > 0 || max > 0.0d) {
                this.f25685a.m2270r4().m14783o(new TdApi.AddNetworkStatistics(new TdApi.NetworkStatisticsEntryCall(new TdApi.NetworkTypeWiFi(), j2, j3, max)), this.f25685a.m2392ja());
            }
            if (j4 > 0 || j5 > 0 || max > 0.0d) {
                NetworkInfo networkInfo = this.f25698k0;
                this.f25685a.m2270r4().m14783o(new TdApi.AddNetworkStatistics(new TdApi.NetworkStatisticsEntryCall((networkInfo == null || !networkInfo.isRoaming()) ? new TdApi.NetworkTypeMobile() : new TdApi.NetworkTypeMobileRoaming(), j4, j5, max)), this.f25685a.m2392ja());
            }
        }
    }

    @Override
    public void mo1562f(TdApi.Call call) {
        if (!this.f25679U) {
            m14237Y(call);
        }
    }

    @Override
    public void mo1641h(int i) {
        m14234a0();
        TdApi.Call call = this.f25687b;
        if (!(call != null && !call.isOutgoing && call.state.getConstructor() == 1073048620)) {
            return;
        }
        if (i != 0 && this.f25695h0) {
            this.f25695h0 = false;
            m14243S();
        } else if (i == 0) {
            this.f25695h0 = true;
            m14214t((NotificationManager) getSystemService("notification"));
            C7389v0.m16699O2(this, true, 2147483644);
            this.f25694g0 = null;
        }
    }

    public final void m14219o() {
        if (this.f25687b != null) {
            this.f25685a.m2930B4().m4713c0().m4615A(this, this.f25685a, this.f25687b.f25364id);
            if (C1379j0.m37364F() != 0) {
                m14218p();
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public void onAudioFocusChange(int i) {
        this.f25686a0 = i == 1;
        Log.m14721i(2, "onAudioFocusChange, focusChange: %d, haveAudioFocus: %b", Integer.valueOf(i), Boolean.valueOf(this.f25686a0));
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCallUpgradeRequestReceived() {
    }

    @Override
    public void onConnectionStateChanged(int i) {
        TdApi.Call call;
        try {
            C10930q6 q6Var = this.f25685a;
            if (!(q6Var == null || (call = this.f25687b) == null)) {
                if (i == 3) {
                    q6Var.m2690Q4(call.f25364id, i);
                } else if (i == 4) {
                    q6Var.m2930B4().m4713c0().m4595R(this.f25685a, this.f25687b.f25364id, true, m14260B());
                }
            }
        } catch (Throwable th) {
            Log.m14728e(2, "Error", th, new Object[0]);
        }
    }

    @Override
    public void onCreate() {
        int s;
        super.onCreate();
        C1379j0.m37356L(getApplicationContext());
        f25669s0 = new WeakReference<>(this);
        boolean z = false;
        C5144t0 t0Var = new C5144t0(0);
        this.f25672N = t0Var;
        t0Var.m23822k(R.raw.voip_connecting, R.raw.voip_ringback, R.raw.voip_fail, R.raw.voip_end, R.raw.voip_busy);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (!(Build.VERSION.SDK_INT < 17 || audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER") == null || (s = C5070i.m24051s(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"))) == 0)) {
            VoIPController.setNativeBufferSize(s);
            z = true;
        }
        if (!z) {
            VoIPController.setNativeBufferSize(AudioTrack.getMinBufferSize(48000, 4, 2) / 2);
        }
    }

    @Override
    public void onDestroy() {
        this.f25679U = true;
        Log.m14716v(2, "TGCallService.onDestroy", new Object[0]);
        m14246P(null);
        m14234a0();
        try {
            unregisterReceiver(this.f25678T);
        } catch (Throwable th) {
            Log.m14712w(2, "Cannot unregister receiver", th, new Object[0]);
        }
        if (f25669s0 != null && f25669s0.get() == this) {
            f25669s0 = null;
        }
        super.onDestroy();
        m14248N();
        if (!this.f25672N.m23828e()) {
            this.f25672N.m23821l();
        }
        m14245Q(null, 0);
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
            if (!this.f25677S && !audioManager.isSpeakerphoneOn()) {
                if (!this.f25697j0 || !audioManager.isBluetoothScoOn()) {
                    boolean z = sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f);
                    if (z != this.f25676R) {
                        if (Log.isEnabled(2)) {
                            Log.m14716v(2, "Proximity state changed, isNear: %b", Boolean.valueOf(z));
                        }
                        this.f25676R = z;
                        try {
                            if (z) {
                                this.f25684Z.acquire();
                            } else {
                                this.f25684Z.release(1);
                            }
                        } catch (Throwable th) {
                            Log.m14728e(2, "Failed to acquire/release proximity wakelock, isNear: %b", th, Boolean.valueOf(z));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onSignalBarCountChanged(int i) {
        TdApi.Call call;
        try {
            C10930q6 q6Var = this.f25685a;
            if (q6Var != null && (call = this.f25687b) != null) {
                q6Var.m2706P4(call.f25364id, i);
            }
        } catch (Throwable th) {
            Log.m14728e(2, "Error", th, new Object[0]);
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4;
        if (Log.isEnabled(2)) {
            Log.m14721i(2, "TGCallService.onStartCommand received, intent: %s", intent);
        }
        int q = m14217q();
        if (intent != null) {
            i4 = intent.getIntExtra("account_id", -1);
            i3 = intent.getIntExtra("call_id", 0);
        } else {
            i3 = 0;
            i4 = -1;
        }
        if (i4 == -1 || i3 == 0) {
            m14245Q(null, 0);
        } else {
            m14245Q(C10536ab.m4756R0(i4), i3);
        }
        TdApi.Call call = this.f25687b;
        if (call == null || this.f25671M == null) {
            Log.m14711w(2, "TGCallService.onStartCommand: failed because call or other party not found, call: %s, user: %s", call, this.f25671M);
            stopSelf();
            return 2;
        }
        if (this.f25673O == null) {
            m14256F(this.f25685a, call);
        } else if (!(q == 0 || q == i3)) {
            throw new IllegalStateException();
        }
        m14237Y(this.f25687b);
        return 2;
    }

    public final void m14218p() {
    }

    public int m14217q() {
        TdApi.Call call = this.f25687b;
        if (call != null) {
            return call.f25364id;
        }
        return 0;
    }

    public int m14216r() {
        C10930q6 q6Var = this.f25685a;
        if (q6Var != null) {
            return q6Var.m2188w6();
        }
        return -1;
    }

    public final void m14215s() {
        VoIPController voIPController;
        C4868i.C4880l A1;
        if (!this.f25702o0 && !C4779t2.m25562Z2(this.f25687b)) {
            TdApi.Call call = this.f25687b;
            if (call != null && call.state.getConstructor() == -2000107571 && !this.f25702o0 && (voIPController = this.f25673O) != null) {
                TdApi.Call call2 = this.f25687b;
                TdApi.CallStateReady callStateReady = (TdApi.CallStateReady) call2.state;
                voIPController.setEncryptionKey(callStateReady.encryptionKey, call2.isOutgoing);
                this.f25673O.setRemoteEndpoints(callStateReady.servers, callStateReady.protocol.udpP2p && callStateReady.allowP2p, C4868i.m24726c2().m24728c0(), callStateReady.protocol.maxLayer);
                int G0 = C4868i.m24726c2().m24884G0();
                if (!(G0 == 0 || (A1 = C4868i.m24726c2().m24925A1(G0)) == null || !A1.m24525b())) {
                    if (A1.f16681M.getConstructor() != -890027341) {
                        Log.m14724e("Unsupported proxy type for calls: %s", A1.f16681M);
                    } else {
                        TdApi.ProxyTypeSocks5 proxyTypeSocks5 = (TdApi.ProxyTypeSocks5) A1.f16681M;
                        this.f25673O.setProxy(A1.f16690b, A1.f16691c, proxyTypeSocks5.username, proxyTypeSocks5.password);
                    }
                }
                this.f25673O.start();
                m14232b0(false);
                this.f25673O.connect();
                this.f25702o0 = true;
            }
        } else if (C4779t2.m25562Z2(this.f25687b)) {
            VoIPController voIPController2 = this.f25673O;
            if (voIPController2 != null) {
                this.f25703p0 = voIPController2.getDebugLog();
                this.f25673O.release();
                this.f25673O = null;
            }
            m14214t((NotificationManager) getSystemService("notification"));
            C7389v0.m16699O2(this, true, 2147483645, 2147483644);
            this.f25690c0 = null;
            this.f25694g0 = null;
            stopSelf();
        }
    }

    public final void m14214t(NotificationManager notificationManager) {
        String str;
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                String id2 = notificationChannel.getId();
                if (id2.startsWith("call_") && ((str = this.f25689c) == null || !str.equals(id2))) {
                    try {
                        notificationManager.deleteNotificationChannel(notificationChannel.getId());
                    } catch (Throwable th) {
                        Log.m14725e("Unable to delete notification channel", th, new Object[0]);
                    }
                }
            }
        }
    }

    public boolean m14213u(C10930q6 q6Var, int i) {
        return this.f25687b != null && m14216r() == q6Var.m2188w6() && i == this.f25687b.f25364id;
    }

    public final void m14212v() {
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (C4779t2.m25686G2(this.f25687b) && !this.f25688b0) {
            this.f25688b0 = true;
            Log.m14721i(2, "Configuring device for call...", new Object[0]);
            audioManager.setMode(3);
            f25670t0++;
            audioManager.setSpeakerphoneOn(false);
            audioManager.requestAudioFocus(this, 0, 1);
            m14230c0();
            SensorManager sensorManager = (SensorManager) getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(8);
            if (defaultSensor != null) {
                try {
                    this.f25684Z = ((PowerManager) getSystemService("power")).newWakeLock(32, "tgx:voip-proximity");
                    sensorManager.registerListener(this, defaultSensor, 3);
                } catch (Throwable th) {
                    Log.m14728e(2, "Error initializing proximity sensor", th, new Object[0]);
                }
            }
        } else if (!C4779t2.m25686G2(this.f25687b) && this.f25688b0) {
            this.f25688b0 = false;
            Log.m14721i(2, "Unconfiguring device from call...", new Object[0]);
            audioManager.setMode(0);
            SensorManager sensorManager2 = (SensorManager) getSystemService("sensor");
            if (sensorManager2.getDefaultSensor(8) != null) {
                sensorManager2.unregisterListener(this);
            }
            PowerManager.WakeLock wakeLock = this.f25684Z;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.f25684Z.release();
            }
        }
    }

    public final void m14210x() {
        if (this.f25687b != null) {
            this.f25685a.m2930B4().m4713c0().m4595R(this.f25685a, this.f25687b.f25364id, false, 0L);
        }
    }

    @Override
    public void mo1561x0(int i, int i2) {
    }

    public int m14209y() {
        return this.f25682X;
    }

    public long m14208z() {
        VoIPController voIPController = this.f25673O;
        if (voIPController != null) {
            return voIPController.getCallDuration();
        }
        return -1L;
    }
}
