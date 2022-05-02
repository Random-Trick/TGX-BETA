package org.thunderdog.challegram.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import be.C1357a0;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.List;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import org.thunderdog.challegram.receiver.AudioMediaReceiver;
import org.thunderdog.challegram.service.AudioService;
import p067ed.C4183a;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p147k4.C6053a;
import p292ud.C9726c;
import p292ud.C9773p0;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class AudioService extends Service implements C9773p0.AbstractC9778e, C9773p0.AbstractC9779f, C9726c.AbstractC9728b, AudioManager.OnAudioFocusChangeListener {
    public int f25624M;
    public boolean f25625N;
    public int f25628Q;
    public boolean f25629R;
    public boolean f25630S;
    public C10930q6 f25631T;
    public TdApi.Message f25632U;
    public Bitmap f25633V;
    public Bitmap f25634W;
    public Bitmap f25635X;
    public Object f25636Y;
    public boolean f25637Z;
    public Handler f25638a;
    public int f25639a0;
    public long f25641b0;
    public boolean f25644d0;
    public int f25640b = -1;
    public final ArrayList<TdApi.Message> f25642c = new ArrayList<>();
    public long f25626O = -1;
    public long f25627P = -1;
    public int f25643c0 = 1;

    public class C7912a extends MediaSession.Callback {
        public C7912a() {
        }

        @Override
        public boolean onMediaButtonEvent(Intent intent) {
            if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                return super.onMediaButtonEvent(intent);
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 79) {
                return super.onMediaButtonEvent(intent);
            }
            AudioService.this.m14328A();
            return true;
        }

        @Override
        public void onPause() {
            C10536ab.m4667o1().m4636w2().m7107G0(false);
        }

        @Override
        public void onPlay() {
            C10536ab.m4667o1().m4636w2().m7107G0(true);
        }

        @Override
        public void onSeekTo(long j) {
            C10536ab.m4667o1().m4729Y().m7382v0(j, -1L);
        }

        @Override
        public void onSkipToNext() {
            C10536ab.m4667o1().m4636w2().m7063c1(true);
        }

        @Override
        public void onSkipToPrevious() {
            C10536ab.m4667o1().m4636w2().m7063c1(false);
        }

        @Override
        public void onStop() {
            C10536ab.m4667o1().m4636w2().m7061d1(true);
        }
    }

    public static class HandlerC7913b extends Handler {
        public final AudioService f25646a;

        public HandlerC7913b(AudioService audioService) {
            super(Looper.getMainLooper());
            this.f25646a = audioService;
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f25646a.m14288y();
            } else if (i == 1) {
                if (message.arg1 == 1) {
                    this.f25646a.m14322G();
                } else {
                    this.f25646a.m14304i();
                }
            }
        }
    }

    public static Bitmap m14327B(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.recycle();
        return null;
    }

    public static boolean m14326C(int i) {
        return i == 3;
    }

    public static Bitmap m14315N() {
        try {
            int n = m14299n(true);
            return Bitmap.createBitmap(n, n, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int m14299n(boolean z) {
        return (Build.VERSION.SDK_INT < 21 || z) ? C1357a0.m37544i(64.0f) : Math.max((int) Log.TAG_CAMERA, C1357a0.m37556B());
    }

    public static boolean m14297p(int i) {
        return i == 1 || i == 3;
    }

    public static boolean m14291v(TdApi.Message message) {
        return message != null && message.content.getConstructor() == 276722716;
    }

    public void m14289x(C6053a aVar, final C10930q6 q6Var, final TdApi.Message message) {
        final Bitmap m = C7907b.m14359m(aVar.f19261N, m14299n(false), false, false);
        if (m != null) {
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AudioService.this.m14290w(q6Var, message, m);
                }
            });
        }
    }

    public final void m14328A() {
        if (this.f25641b0 != 0 && SystemClock.uptimeMillis() - this.f25641b0 < 500) {
            this.f25641b0 = 0L;
        } else if (!this.f25637Z) {
            this.f25637Z = true;
            this.f25639a0 = 1;
            Handler handler = this.f25638a;
            handler.sendMessageDelayed(Message.obtain(handler, 0), 370L);
        } else if (this.f25639a0 != 3) {
            this.f25638a.removeMessages(0);
            int i = this.f25639a0 + 1;
            this.f25639a0 = i;
            if (i == 3) {
                m14288y();
                return;
            }
            Handler handler2 = this.f25638a;
            handler2.sendMessageDelayed(Message.obtain(handler2, 0), 420L);
        }
    }

    @Override
    public void mo6982B3(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3) {
        if (!m14291v(message)) {
            m14301l();
            return;
        }
        this.f25642c.clear();
        this.f25642c.addAll(list);
        this.f25640b = i;
        this.f25628Q = i2;
        this.f25624M = i3;
        m14316M(q6Var, message);
    }

    public final void m14325D() {
        this.f25629R = m14295r();
        this.f25630S = m14296q();
    }

    public final void m14324E() {
        this.f25644d0 = true;
        this.f25638a.removeMessages(1);
        Handler handler = this.f25638a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 1, 0), 180L);
    }

    @Override
    public void mo6981E4(int i) {
        if (m14292u() && this.f25628Q != i) {
            m14325D();
            this.f25628Q = i;
            m14302k();
        }
    }

    public final void m14323F() {
        if (!m14298o() || !this.f25644d0) {
            m14324E();
        }
    }

    public final void m14322G() {
        AudioManager audioManager;
        if (this.f25644d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(this, 3, 1);
            m14320I(1);
        }
    }

    @Override
    public void mo6980G3(C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        if (m14292u()) {
            m14325D();
            int i3 = this.f25640b;
            if (i3 == i) {
                this.f25640b = i2;
            } else {
                if (i < i3) {
                    this.f25640b = i3 - 1;
                }
                int i4 = this.f25640b;
                if (i2 <= i4) {
                    this.f25640b = i4 + 1;
                }
            }
            C5062b.m24150w(this.f25642c, i, i2);
            m14302k();
        }
    }

    public final void m14290w(C10930q6 q6Var, TdApi.Message message, Bitmap bitmap) {
        TdApi.Message message2 = this.f25632U;
        if (message2 != null && C9773p0.m7112E(this.f25631T, q6Var, message, message2)) {
            this.f25633V = bitmap;
            this.f25634W = null;
            m14314O();
            m14318K();
        } else if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final void m14320I(int i) {
        if (this.f25643c0 != i) {
            boolean C = m14326C(i);
            this.f25643c0 = i;
            boolean p = m14297p(i);
            boolean C2 = m14326C(i);
            C10536ab.m4667o1().m4636w2().m7075W0(64, !p);
            if (C != C2) {
                C10536ab.m4667o1().m4636w2().m7065b1(C2);
            }
        }
    }

    public final void m14319J(int i) {
        if (this.f25624M != i) {
            this.f25624M = i;
            if (i == 3) {
                m14323F();
            }
            if (this.f25632U != null) {
                m14314O();
                m14317L();
            }
        }
    }

    @TargetApi(21)
    public final void m14318K() {
        Object obj;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25636Y) != null) {
            TdApi.Audio audio = ((TdApi.MessageAudio) this.f25632U.content).audio;
            MediaSession mediaSession = (MediaSession) obj;
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            builder.putString("android.media.metadata.TITLE", C4779t2.m25473m2(audio));
            builder.putString("android.media.metadata.ARTIST", C4779t2.m25522f2(audio));
            long j = this.f25627P;
            if (j != -9223372036854775807L && j > 0) {
                builder.putLong("android.media.metadata.DURATION", j);
            }
            Bitmap bitmap2 = this.f25633V;
            if (bitmap2 != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap2);
            } else if (C4183a.f14103u && (bitmap = this.f25634W) != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
            }
            mediaSession.setMetadata(builder.build());
        }
    }

    @TargetApi(21)
    public final void m14317L() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25636Y) != null) {
            MediaSession mediaSession = (MediaSession) obj;
            PlaybackState.Builder builder = new PlaybackState.Builder();
            long j = 775;
            if (m14296q()) {
                j = 807;
            }
            if (m14295r()) {
                j |= 16;
            }
            builder.setActions(j);
            int i = 3;
            if (this.f25624M != 3) {
                i = 2;
            } else if (this.f25625N) {
                i = 6;
            }
            builder.setState(i, this.f25626O, 1.0f);
            mediaSession.setPlaybackState(builder.build());
            mediaSession.setActive(true);
        }
    }

    public final void m14316M(C10930q6 q6Var, TdApi.Message message) {
        if (message != null || this.f25632U != null) {
            C10930q6 q6Var2 = this.f25631T;
            if (q6Var2 != q6Var || !C9773p0.m7112E(q6Var2, q6Var, this.f25632U, message)) {
                boolean z = this.f25632U != null;
                boolean z2 = message != null;
                if (z) {
                    C10536ab.m4667o1().m4636w2().m7081T0(this.f25631T, this.f25632U, this);
                    C10536ab.m4667o1().m4729Y().m7404O(this.f25631T, this.f25632U, this);
                }
                this.f25631T = q6Var;
                this.f25632U = message;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f25633V != null) {
                        this.f25634W = m14327B(this.f25634W);
                        this.f25634W = this.f25633V;
                    }
                    this.f25633V = null;
                } else {
                    this.f25633V = m14327B(this.f25633V);
                }
                this.f25626O = -1L;
                this.f25627P = -1L;
                if (!z2) {
                    C7389v0.m16699O2(this, true, Integer.MAX_VALUE);
                    m14300m();
                    stopSelf();
                    return;
                }
                C6053a t0 = C10536ab.m4667o1().m4729Y().m7384t0(q6Var, message, this);
                if (t0 != null) {
                    m14287z(q6Var, message, t0);
                }
                if (!z) {
                    m14293t();
                } else {
                    m14323F();
                }
                m14318K();
                m14317L();
                C10536ab.m4667o1().m4636w2().m7026r(q6Var, message, this);
                if (!z) {
                    C7389v0.m16703N2(this, Integer.MAX_VALUE, m14303j());
                } else {
                    m14314O();
                }
            }
        }
    }

    @Override
    public void mo6979M4(C10930q6 q6Var, TdApi.Message message, int i, boolean z) {
        if (m14292u()) {
            m14325D();
            int i2 = this.f25640b;
            if (i < i2) {
                this.f25640b = i2 - 1;
            }
            this.f25642c.remove(i);
            m14302k();
        }
    }

    public final void m14314O() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            try {
                notificationManager.notify(Integer.MAX_VALUE, m14303j());
            } catch (Throwable th) {
                Log.m14725e("Unable to update music notification", th, new Object[0]);
                Tracer.m14772h(th);
                throw th;
            }
        }
    }

    public final Intent m14313P(String str) {
        Intent intent = new Intent(this, AudioMediaReceiver.class);
        intent.setAction(str);
        return intent;
    }

    public final PendingIntent m14312Q(int i) {
        return PendingIntent.getActivity(this, 0, C1405v.m37124V(i), 134217728);
    }

    @Override
    public void mo6978R0(C10930q6 q6Var, List<TdApi.Message> list, boolean z) {
        if (m14292u()) {
            m14325D();
            if (!z) {
                this.f25640b += list.size();
            }
            if (z) {
                this.f25642c.addAll(list);
            } else {
                this.f25642c.addAll(0, list);
            }
            m14302k();
        }
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        TdApi.Message message;
        if (this.f25631T == q6Var && (message = this.f25632U) != null && C9773p0.m7116C(message, j, j2, i)) {
            boolean z2 = false;
            boolean z3 = this.f25627P != j4;
            long j5 = this.f25626O;
            boolean z4 = ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) <= 0) != ((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) <= 0) || Math.abs(j3 - j5) >= 2000;
            long j6 = this.f25627P;
            int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            boolean z5 = ((j6 > 0L ? 1 : (j6 == 0L ? 0 : -1)) <= 0) != (i2 <= 0) || (j6 > 0 && i2 > 0 && j6 != j4);
            if (this.f25625N != z) {
                z2 = true;
            }
            if (z3 || this.f25626O != j3 || z2) {
                this.f25627P = j4;
                this.f25626O = j3;
                this.f25625N = z;
                if (z3 || z4 || (z2 && this.f25624M == 3)) {
                    m14314O();
                }
                if (z5) {
                    m14318K();
                }
                if (z5 || z3 || z4 || z2) {
                    m14317L();
                }
            }
        }
    }

    @Override
    public void mo6977W3(C10930q6 q6Var, TdApi.Message message, int i) {
        if (m14292u()) {
            m14325D();
            int i2 = this.f25640b;
            if (i <= i2) {
                this.f25640b = i2 + 1;
            }
            this.f25642c.add(i, message);
            m14302k();
        }
    }

    @Override
    public void mo7376a(C10930q6 q6Var, TdApi.Message message, C6053a aVar) {
        m14287z(q6Var, message, aVar);
    }

    @Override
    public void mo6976d7(C10930q6 q6Var, long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list) {
        if (m14292u()) {
            m14301l();
        }
    }

    public final void m14305h() {
        this.f25644d0 = false;
        this.f25638a.removeMessages(1);
        Handler handler = this.f25638a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 0, 0), 50L);
    }

    @Override
    public void mo6975h6() {
    }

    public final void m14304i() {
        AudioManager audioManager;
        if (!this.f25644d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    public final Notification m14303j() {
        Notification.Builder builder;
        Bitmap bitmap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            builder = new Notification.Builder(this, C1405v.m37112l("playback", R.string.NotificationChannelPlayback));
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentIntent(m14312Q(this.f25631T.m2188w6()));
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, m14313P("org.thunderdog.challegram.ACTION_PLAY_SKIP_PREVIOUS"), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 100, m14313P("org.thunderdog.challegram.ACTION_PLAY_PAUSE"), 134217728);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 100, m14313P("org.thunderdog.challegram.ACTION_PLAY_SKIP_NEXT"), 134217728);
        builder.addAction(R.drawable.baseline_skip_previous_24_white, C4403w.m27871i1(R.string.PlaySkipPrev), broadcast);
        if (this.f25624M == 3) {
            builder.addAction(R.drawable.baseline_pause_36_white, C4403w.m27871i1(R.string.PlayPause), broadcast2);
        } else {
            builder.addAction(R.drawable.baseline_play_arrow_36_white, C4403w.m27871i1(this.f25626O > 0 ? R.string.PlayResume : R.string.PlayPlay), broadcast2);
        }
        builder.addAction(R.drawable.baseline_skip_next_24_white, C4403w.m27871i1(R.string.PlaySkipNext), broadcast3);
        if (this.f25624M != 3) {
            builder.addAction(R.drawable.baseline_stop_24_white, C4403w.m27871i1(R.string.PlayStop), PendingIntent.getBroadcast(this, 100, m14313P("org.thunderdog.challegram.ACTION_PLAY_STOP"), 134217728));
        }
        if (i >= 21) {
            builder.setColor(this.f25631T.m2869F1());
            builder.setStyle(new Notification.MediaStyle().setShowActionsInCompactView(0, 1, 2).setMediaSession(((MediaSession) this.f25636Y).getSessionToken()));
        }
        builder.setSmallIcon(R.drawable.baseline_play_circle_filled_24_white);
        boolean z = true;
        if (i >= 21) {
            builder.setVisibility(1);
        }
        if (i >= 19) {
            boolean z2 = (this.f25624M != 3 || this.f25625N || this.f25627P == -9223372036854775807L || this.f25626O == -9223372036854775807L || this.f25640b == -1) ? false : true;
            if (z2) {
                builder.setUsesChronometer(true).setWhen(System.currentTimeMillis() - this.f25626O);
            } else {
                builder.setUsesChronometer(false).setWhen(0L);
            }
            builder.setShowWhen(z2);
        }
        TdApi.Audio audio = ((TdApi.MessageAudio) this.f25632U.content).audio;
        builder.setContentTitle(C4779t2.m25473m2(audio));
        builder.setContentText(C4779t2.m25522f2(audio));
        if (this.f25624M != 3) {
            z = false;
        }
        builder.setOngoing(z);
        Bitmap bitmap2 = this.f25633V;
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else if (!C4183a.f14103u || (bitmap = this.f25634W) == null) {
            Bitmap bitmap3 = this.f25635X;
            if (bitmap3 != null) {
                builder.setLargeIcon(bitmap3);
            }
        } else {
            builder.setLargeIcon(bitmap);
        }
        return builder.build();
    }

    public final void m14302k() {
        if (this.f25632U == null) {
            return;
        }
        if (this.f25629R != m14295r() || this.f25630S != m14296q()) {
            m14314O();
            m14317L();
        }
    }

    public final void m14301l() {
        if (this.f25632U != null) {
            this.f25627P = -1L;
            this.f25626O = -1L;
            this.f25624M = 0;
            this.f25625N = false;
            this.f25628Q = 0;
            this.f25642c.clear();
            this.f25640b = -1;
            m14316M(null, null);
        }
    }

    public final void m14300m() {
        Object obj;
        C10536ab.m4667o1().m4636w2().m7065b1(false);
        this.f25635X = m14327B(this.f25635X);
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25636Y) != null) {
            MediaSession mediaSession = (MediaSession) obj;
            mediaSession.setActive(false);
            mediaSession.release();
            this.f25636Y = null;
        }
        this.f25634W = m14327B(this.f25634W);
        this.f25633V = m14327B(this.f25633V);
        m14305h();
    }

    public final boolean m14298o() {
        return m14297p(this.f25643c0);
    }

    @Override
    public void mo6974o0(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2) {
        if (m14292u()) {
            this.f25640b = i;
            this.f25624M = i2;
            m14316M(q6Var, message);
        }
    }

    @Override
    public void onAudioFocusChange(int i) {
        m14320I(i);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        C1379j0.m37359L(getApplicationContext());
        this.f25638a = new HandlerC7913b(this);
        Log.m14721i((int) Log.TAG_PLAYER, "[service] onCreate", new Object[0]);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.m14721i((int) Log.TAG_PLAYER, "[service] onDestroy", new Object[0]);
        C7389v0.m16699O2(this, true, Integer.MAX_VALUE);
        C10536ab.m4667o1().m4636w2().m7083S0(this);
    }

    @Override
    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m14721i((int) Log.TAG_PLAYER, "[service] onStartCommand", new Object[0]);
        C10536ab.m4667o1().m4636w2().m7028q(this, true);
        return 1;
    }

    public final boolean m14296q() {
        if (this.f25640b != -1) {
            if (m14294s()) {
                if (this.f25640b > 0) {
                    return true;
                }
            } else if (this.f25640b + 1 < this.f25642c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m14295r() {
        if (this.f25640b != -1) {
            if (!m14294s()) {
                if (this.f25640b > 0) {
                    return true;
                }
            } else if (this.f25640b + 1 < this.f25642c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m14294s() {
        return (this.f25628Q & Log.TAG_ROUND) != 0;
    }

    public final void m14293t() {
        if (Build.VERSION.SDK_INT >= 21) {
            MediaSession mediaSession = new MediaSession(this, "MusicService");
            mediaSession.setCallback(new C7912a());
            mediaSession.setFlags(3);
            mediaSession.setActive(true);
            mediaSession.setSessionActivity(m14312Q(this.f25631T.m2188w6()));
            mediaSession.setExtras(new Bundle());
            this.f25636Y = mediaSession;
        }
        m14324E();
        this.f25635X = m14315N();
    }

    public final boolean m14292u() {
        return this.f25632U != null;
    }

    public final void m14288y() {
        if (this.f25637Z) {
            this.f25637Z = false;
            int i = this.f25639a0;
            this.f25639a0 = 0;
            if (i >= 0) {
                this.f25641b0 = SystemClock.uptimeMillis();
            }
            if (i <= 1) {
                C10536ab.m4667o1().m4636w2().m7111E0();
            } else if (i == 2) {
                C10536ab.m4667o1().m4636w2().m7063c1(true);
            } else {
                C10536ab.m4667o1().m4636w2().m7063c1(false);
            }
        }
    }

    public final void m14287z(final C10930q6 q6Var, final TdApi.Message message, final C6053a aVar) {
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                AudioService.this.m14289x(aVar, q6Var, message);
            }
        });
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        TdApi.Message message;
        if (this.f25631T == q6Var && (message = this.f25632U) != null && C9773p0.m7116C(message, j, j2, i)) {
            if (i2 == 3 || i2 == 2) {
                m14319J(i2);
            }
        }
    }
}
