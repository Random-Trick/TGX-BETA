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
    public int f25621M;
    public boolean f25622N;
    public int f25625Q;
    public boolean f25626R;
    public boolean f25627S;
    public C10930q6 f25628T;
    public TdApi.Message f25629U;
    public Bitmap f25630V;
    public Bitmap f25631W;
    public Bitmap f25632X;
    public Object f25633Y;
    public boolean f25634Z;
    public Handler f25635a;
    public int f25636a0;
    public long f25638b0;
    public boolean f25641d0;
    public int f25637b = -1;
    public final ArrayList<TdApi.Message> f25639c = new ArrayList<>();
    public long f25623O = -1;
    public long f25624P = -1;
    public int f25640c0 = 1;

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
            AudioService.this.m14329A();
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
        public final AudioService f25643a;

        public HandlerC7913b(AudioService audioService) {
            super(Looper.getMainLooper());
            this.f25643a = audioService;
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f25643a.m14289y();
            } else if (i == 1) {
                if (message.arg1 == 1) {
                    this.f25643a.m14323G();
                } else {
                    this.f25643a.m14305i();
                }
            }
        }
    }

    public static Bitmap m14328B(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.recycle();
        return null;
    }

    public static boolean m14327C(int i) {
        return i == 3;
    }

    public static Bitmap m14316N() {
        try {
            int n = m14300n(true);
            return Bitmap.createBitmap(n, n, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int m14300n(boolean z) {
        return (Build.VERSION.SDK_INT < 21 || z) ? C1357a0.m37541i(64.0f) : Math.max((int) Log.TAG_CAMERA, C1357a0.m37553B());
    }

    public static boolean m14298p(int i) {
        return i == 1 || i == 3;
    }

    public static boolean m14292v(TdApi.Message message) {
        return message != null && message.content.getConstructor() == 276722716;
    }

    public void m14290x(C6053a aVar, final C10930q6 q6Var, final TdApi.Message message) {
        final Bitmap m = C7907b.m14360m(aVar.f19261N, m14300n(false), false, false);
        if (m != null) {
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    AudioService.this.m14291w(q6Var, message, m);
                }
            });
        }
    }

    public final void m14329A() {
        if (this.f25638b0 != 0 && SystemClock.uptimeMillis() - this.f25638b0 < 500) {
            this.f25638b0 = 0L;
        } else if (!this.f25634Z) {
            this.f25634Z = true;
            this.f25636a0 = 1;
            Handler handler = this.f25635a;
            handler.sendMessageDelayed(Message.obtain(handler, 0), 370L);
        } else if (this.f25636a0 != 3) {
            this.f25635a.removeMessages(0);
            int i = this.f25636a0 + 1;
            this.f25636a0 = i;
            if (i == 3) {
                m14289y();
                return;
            }
            Handler handler2 = this.f25635a;
            handler2.sendMessageDelayed(Message.obtain(handler2, 0), 420L);
        }
    }

    @Override
    public void mo6982B3(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, long j, int i2, int i3) {
        if (!m14292v(message)) {
            m14302l();
            return;
        }
        this.f25639c.clear();
        this.f25639c.addAll(list);
        this.f25637b = i;
        this.f25625Q = i2;
        this.f25621M = i3;
        m14317M(q6Var, message);
    }

    public final void m14326D() {
        this.f25626R = m14296r();
        this.f25627S = m14297q();
    }

    public final void m14325E() {
        this.f25641d0 = true;
        this.f25635a.removeMessages(1);
        Handler handler = this.f25635a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 1, 0), 180L);
    }

    @Override
    public void mo6981E4(int i) {
        if (m14293u() && this.f25625Q != i) {
            m14326D();
            this.f25625Q = i;
            m14303k();
        }
    }

    public final void m14324F() {
        if (!m14299o() || !this.f25641d0) {
            m14325E();
        }
    }

    public final void m14323G() {
        AudioManager audioManager;
        if (this.f25641d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(this, 3, 1);
            m14321I(1);
        }
    }

    @Override
    public void mo6980G3(C10930q6 q6Var, TdApi.Message message, int i, int i2) {
        if (m14293u()) {
            m14326D();
            int i3 = this.f25637b;
            if (i3 == i) {
                this.f25637b = i2;
            } else {
                if (i < i3) {
                    this.f25637b = i3 - 1;
                }
                int i4 = this.f25637b;
                if (i2 <= i4) {
                    this.f25637b = i4 + 1;
                }
            }
            C5062b.m24149w(this.f25639c, i, i2);
            m14303k();
        }
    }

    public final void m14291w(C10930q6 q6Var, TdApi.Message message, Bitmap bitmap) {
        TdApi.Message message2 = this.f25629U;
        if (message2 != null && C9773p0.m7112E(this.f25628T, q6Var, message, message2)) {
            this.f25630V = bitmap;
            this.f25631W = null;
            m14315O();
            m14319K();
        } else if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final void m14321I(int i) {
        if (this.f25640c0 != i) {
            boolean C = m14327C(i);
            this.f25640c0 = i;
            boolean p = m14298p(i);
            boolean C2 = m14327C(i);
            C10536ab.m4667o1().m4636w2().m7075W0(64, !p);
            if (C != C2) {
                C10536ab.m4667o1().m4636w2().m7065b1(C2);
            }
        }
    }

    public final void m14320J(int i) {
        if (this.f25621M != i) {
            this.f25621M = i;
            if (i == 3) {
                m14324F();
            }
            if (this.f25629U != null) {
                m14315O();
                m14318L();
            }
        }
    }

    @TargetApi(21)
    public final void m14319K() {
        Object obj;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25633Y) != null) {
            TdApi.Audio audio = ((TdApi.MessageAudio) this.f25629U.content).audio;
            MediaSession mediaSession = (MediaSession) obj;
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            builder.putString("android.media.metadata.TITLE", C4779t2.m25472m2(audio));
            builder.putString("android.media.metadata.ARTIST", C4779t2.m25521f2(audio));
            long j = this.f25624P;
            if (j != -9223372036854775807L && j > 0) {
                builder.putLong("android.media.metadata.DURATION", j);
            }
            Bitmap bitmap2 = this.f25630V;
            if (bitmap2 != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap2);
            } else if (C4183a.f14103u && (bitmap = this.f25631W) != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
            }
            mediaSession.setMetadata(builder.build());
        }
    }

    @TargetApi(21)
    public final void m14318L() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25633Y) != null) {
            MediaSession mediaSession = (MediaSession) obj;
            PlaybackState.Builder builder = new PlaybackState.Builder();
            long j = 775;
            if (m14297q()) {
                j = 807;
            }
            if (m14296r()) {
                j |= 16;
            }
            builder.setActions(j);
            int i = 3;
            if (this.f25621M != 3) {
                i = 2;
            } else if (this.f25622N) {
                i = 6;
            }
            builder.setState(i, this.f25623O, 1.0f);
            mediaSession.setPlaybackState(builder.build());
            mediaSession.setActive(true);
        }
    }

    public final void m14317M(C10930q6 q6Var, TdApi.Message message) {
        if (message != null || this.f25629U != null) {
            C10930q6 q6Var2 = this.f25628T;
            if (q6Var2 != q6Var || !C9773p0.m7112E(q6Var2, q6Var, this.f25629U, message)) {
                boolean z = this.f25629U != null;
                boolean z2 = message != null;
                if (z) {
                    C10536ab.m4667o1().m4636w2().m7081T0(this.f25628T, this.f25629U, this);
                    C10536ab.m4667o1().m4729Y().m7404O(this.f25628T, this.f25629U, this);
                }
                this.f25628T = q6Var;
                this.f25629U = message;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f25630V != null) {
                        this.f25631W = m14328B(this.f25631W);
                        this.f25631W = this.f25630V;
                    }
                    this.f25630V = null;
                } else {
                    this.f25630V = m14328B(this.f25630V);
                }
                this.f25623O = -1L;
                this.f25624P = -1L;
                if (!z2) {
                    C7389v0.m16699O2(this, true, Integer.MAX_VALUE);
                    m14301m();
                    stopSelf();
                    return;
                }
                C6053a t0 = C10536ab.m4667o1().m4729Y().m7384t0(q6Var, message, this);
                if (t0 != null) {
                    m14288z(q6Var, message, t0);
                }
                if (!z) {
                    m14294t();
                } else {
                    m14324F();
                }
                m14319K();
                m14318L();
                C10536ab.m4667o1().m4636w2().m7026r(q6Var, message, this);
                if (!z) {
                    C7389v0.m16703N2(this, Integer.MAX_VALUE, m14304j());
                } else {
                    m14315O();
                }
            }
        }
    }

    @Override
    public void mo6979M4(C10930q6 q6Var, TdApi.Message message, int i, boolean z) {
        if (m14293u()) {
            m14326D();
            int i2 = this.f25637b;
            if (i < i2) {
                this.f25637b = i2 - 1;
            }
            this.f25639c.remove(i);
            m14303k();
        }
    }

    public final void m14315O() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            try {
                notificationManager.notify(Integer.MAX_VALUE, m14304j());
            } catch (Throwable th) {
                Log.m14725e("Unable to update music notification", th, new Object[0]);
                Tracer.m14772h(th);
                throw th;
            }
        }
    }

    public final Intent m14314P(String str) {
        Intent intent = new Intent(this, AudioMediaReceiver.class);
        intent.setAction(str);
        return intent;
    }

    public final PendingIntent m14313Q(int i) {
        return PendingIntent.getActivity(this, 0, C1405v.m37121V(i), 134217728);
    }

    @Override
    public void mo6978R0(C10930q6 q6Var, List<TdApi.Message> list, boolean z) {
        if (m14293u()) {
            m14326D();
            if (!z) {
                this.f25637b += list.size();
            }
            if (z) {
                this.f25639c.addAll(list);
            } else {
                this.f25639c.addAll(0, list);
            }
            m14303k();
        }
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        TdApi.Message message;
        if (this.f25628T == q6Var && (message = this.f25629U) != null && C9773p0.m7116C(message, j, j2, i)) {
            boolean z2 = false;
            boolean z3 = this.f25624P != j4;
            long j5 = this.f25623O;
            boolean z4 = ((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) <= 0) != ((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) <= 0) || Math.abs(j3 - j5) >= 2000;
            long j6 = this.f25624P;
            int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            boolean z5 = ((j6 > 0L ? 1 : (j6 == 0L ? 0 : -1)) <= 0) != (i2 <= 0) || (j6 > 0 && i2 > 0 && j6 != j4);
            if (this.f25622N != z) {
                z2 = true;
            }
            if (z3 || this.f25623O != j3 || z2) {
                this.f25624P = j4;
                this.f25623O = j3;
                this.f25622N = z;
                if (z3 || z4 || (z2 && this.f25621M == 3)) {
                    m14315O();
                }
                if (z5) {
                    m14319K();
                }
                if (z5 || z3 || z4 || z2) {
                    m14318L();
                }
            }
        }
    }

    @Override
    public void mo6977W3(C10930q6 q6Var, TdApi.Message message, int i) {
        if (m14293u()) {
            m14326D();
            int i2 = this.f25637b;
            if (i <= i2) {
                this.f25637b = i2 + 1;
            }
            this.f25639c.add(i, message);
            m14303k();
        }
    }

    @Override
    public void mo7376a(C10930q6 q6Var, TdApi.Message message, C6053a aVar) {
        m14288z(q6Var, message, aVar);
    }

    @Override
    public void mo6976d7(C10930q6 q6Var, long j, long j2, long j3, boolean z, boolean z2, List<TdApi.Message> list) {
        if (m14293u()) {
            m14302l();
        }
    }

    public final void m14306h() {
        this.f25641d0 = false;
        this.f25635a.removeMessages(1);
        Handler handler = this.f25635a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 0, 0), 50L);
    }

    @Override
    public void mo6975h6() {
    }

    public final void m14305i() {
        AudioManager audioManager;
        if (!this.f25641d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    public final Notification m14304j() {
        Notification.Builder builder;
        Bitmap bitmap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            builder = new Notification.Builder(this, C1405v.m37109l("playback", R.string.NotificationChannelPlayback));
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentIntent(m14313Q(this.f25628T.m2188w6()));
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, m14314P("org.thunderdog.challegram.ACTION_PLAY_SKIP_PREVIOUS"), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 100, m14314P("org.thunderdog.challegram.ACTION_PLAY_PAUSE"), 134217728);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 100, m14314P("org.thunderdog.challegram.ACTION_PLAY_SKIP_NEXT"), 134217728);
        builder.addAction(R.drawable.baseline_skip_previous_24_white, C4403w.m27869i1(R.string.PlaySkipPrev), broadcast);
        if (this.f25621M == 3) {
            builder.addAction(R.drawable.baseline_pause_36_white, C4403w.m27869i1(R.string.PlayPause), broadcast2);
        } else {
            builder.addAction(R.drawable.baseline_play_arrow_36_white, C4403w.m27869i1(this.f25623O > 0 ? R.string.PlayResume : R.string.PlayPlay), broadcast2);
        }
        builder.addAction(R.drawable.baseline_skip_next_24_white, C4403w.m27869i1(R.string.PlaySkipNext), broadcast3);
        if (this.f25621M != 3) {
            builder.addAction(R.drawable.baseline_stop_24_white, C4403w.m27869i1(R.string.PlayStop), PendingIntent.getBroadcast(this, 100, m14314P("org.thunderdog.challegram.ACTION_PLAY_STOP"), 134217728));
        }
        if (i >= 21) {
            builder.setColor(this.f25628T.m2869F1());
            builder.setStyle(new Notification.MediaStyle().setShowActionsInCompactView(0, 1, 2).setMediaSession(((MediaSession) this.f25633Y).getSessionToken()));
        }
        builder.setSmallIcon(R.drawable.baseline_play_circle_filled_24_white);
        boolean z = true;
        if (i >= 21) {
            builder.setVisibility(1);
        }
        if (i >= 19) {
            boolean z2 = (this.f25621M != 3 || this.f25622N || this.f25624P == -9223372036854775807L || this.f25623O == -9223372036854775807L || this.f25637b == -1) ? false : true;
            if (z2) {
                builder.setUsesChronometer(true).setWhen(System.currentTimeMillis() - this.f25623O);
            } else {
                builder.setUsesChronometer(false).setWhen(0L);
            }
            builder.setShowWhen(z2);
        }
        TdApi.Audio audio = ((TdApi.MessageAudio) this.f25629U.content).audio;
        builder.setContentTitle(C4779t2.m25472m2(audio));
        builder.setContentText(C4779t2.m25521f2(audio));
        if (this.f25621M != 3) {
            z = false;
        }
        builder.setOngoing(z);
        Bitmap bitmap2 = this.f25630V;
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else if (!C4183a.f14103u || (bitmap = this.f25631W) == null) {
            Bitmap bitmap3 = this.f25632X;
            if (bitmap3 != null) {
                builder.setLargeIcon(bitmap3);
            }
        } else {
            builder.setLargeIcon(bitmap);
        }
        return builder.build();
    }

    public final void m14303k() {
        if (this.f25629U == null) {
            return;
        }
        if (this.f25626R != m14296r() || this.f25627S != m14297q()) {
            m14315O();
            m14318L();
        }
    }

    public final void m14302l() {
        if (this.f25629U != null) {
            this.f25624P = -1L;
            this.f25623O = -1L;
            this.f25621M = 0;
            this.f25622N = false;
            this.f25625Q = 0;
            this.f25639c.clear();
            this.f25637b = -1;
            m14317M(null, null);
        }
    }

    public final void m14301m() {
        Object obj;
        C10536ab.m4667o1().m4636w2().m7065b1(false);
        this.f25632X = m14328B(this.f25632X);
        if (Build.VERSION.SDK_INT >= 21 && (obj = this.f25633Y) != null) {
            MediaSession mediaSession = (MediaSession) obj;
            mediaSession.setActive(false);
            mediaSession.release();
            this.f25633Y = null;
        }
        this.f25631W = m14328B(this.f25631W);
        this.f25630V = m14328B(this.f25630V);
        m14306h();
    }

    public final boolean m14299o() {
        return m14298p(this.f25640c0);
    }

    @Override
    public void mo6974o0(C10930q6 q6Var, TdApi.Message message, int i, List<TdApi.Message> list, boolean z, int i2) {
        if (m14293u()) {
            this.f25637b = i;
            this.f25621M = i2;
            m14317M(q6Var, message);
        }
    }

    @Override
    public void onAudioFocusChange(int i) {
        m14321I(i);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        C1379j0.m37356L(getApplicationContext());
        this.f25635a = new HandlerC7913b(this);
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

    public final boolean m14297q() {
        if (this.f25637b != -1) {
            if (m14295s()) {
                if (this.f25637b > 0) {
                    return true;
                }
            } else if (this.f25637b + 1 < this.f25639c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m14296r() {
        if (this.f25637b != -1) {
            if (!m14295s()) {
                if (this.f25637b > 0) {
                    return true;
                }
            } else if (this.f25637b + 1 < this.f25639c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m14295s() {
        return (this.f25625Q & Log.TAG_ROUND) != 0;
    }

    public final void m14294t() {
        if (Build.VERSION.SDK_INT >= 21) {
            MediaSession mediaSession = new MediaSession(this, "MusicService");
            mediaSession.setCallback(new C7912a());
            mediaSession.setFlags(3);
            mediaSession.setActive(true);
            mediaSession.setSessionActivity(m14313Q(this.f25628T.m2188w6()));
            mediaSession.setExtras(new Bundle());
            this.f25633Y = mediaSession;
        }
        m14325E();
        this.f25632X = m14316N();
    }

    public final boolean m14293u() {
        return this.f25629U != null;
    }

    public final void m14289y() {
        if (this.f25634Z) {
            this.f25634Z = false;
            int i = this.f25636a0;
            this.f25636a0 = 0;
            if (i >= 0) {
                this.f25638b0 = SystemClock.uptimeMillis();
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

    public final void m14288z(final C10930q6 q6Var, final TdApi.Message message, final C6053a aVar) {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                AudioService.this.m14290x(aVar, q6Var, message);
            }
        });
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
        TdApi.Message message;
        if (this.f25628T == q6Var && (message = this.f25629U) != null && C9773p0.m7116C(message, j, j2, i)) {
            if (i2 == 3 || i2 == 2) {
                m14320J(i2);
            }
        }
    }
}
