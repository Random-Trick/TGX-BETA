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
import ce.a0;
import ce.j0;
import ce.v;
import gd.l;
import gd.w;
import hd.t2;
import java.util.ArrayList;
import java.util.List;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.receiver.AudioMediaReceiver;
import org.thunderdog.challegram.service.AudioService;
import vd.c;
import vd.o0;
import zd.o6;
import zd.ya;

public class AudioService extends Service implements o0.e, o0.f, c.b, AudioManager.OnAudioFocusChangeListener {
    public int M;
    public boolean N;
    public int Q;
    public boolean R;
    public boolean S;
    public o6 T;
    public TdApi.Message U;
    public Bitmap V;
    public Bitmap W;
    public Bitmap X;
    public Object Y;
    public boolean Z;
    public Handler f20100a;
    public int f20101a0;
    public long f20103b0;
    public boolean f20106d0;
    public int f20102b = -1;
    public final ArrayList<TdApi.Message> f20104c = new ArrayList<>();
    public long O = -1;
    public long P = -1;
    public int f20105c0 = 1;

    public class a extends MediaSession.Callback {
        public a() {
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
            AudioService.this.B();
            return true;
        }

        @Override
        public void onPause() {
            ya.o1().w2().G0(false);
        }

        @Override
        public void onPlay() {
            ya.o1().w2().G0(true);
        }

        @Override
        public void onSeekTo(long j10) {
            ya.o1().Y().T0(j10, -1L);
        }

        @Override
        public void onSkipToNext() {
            ya.o1().w2().c1(true);
        }

        @Override
        public void onSkipToPrevious() {
            ya.o1().w2().c1(false);
        }

        @Override
        public void onStop() {
            ya.o1().w2().d1(true);
        }
    }

    public static class b extends Handler {
        public final AudioService f20108a;

        public b(AudioService audioService) {
            super(Looper.getMainLooper());
            this.f20108a = audioService;
        }

        @Override
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f20108a.z();
            } else if (i10 == 1) {
                if (message.arg1 == 1) {
                    this.f20108a.H();
                } else {
                    this.f20108a.j();
                }
            }
        }
    }

    public static Bitmap C(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.recycle();
        return null;
    }

    public static boolean D(int i10) {
        return i10 == 3;
    }

    public static Bitmap O() {
        try {
            int o10 = o(true);
            return Bitmap.createBitmap(o10, o10, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int o(boolean z10) {
        return !z10 ? Math.max((int) Log.TAG_CAMERA, a0.B()) : a0.i(64.0f);
    }

    public static boolean q(int i10) {
        return i10 == 1 || i10 == 3;
    }

    public static boolean w(TdApi.Message message) {
        return message != null && message.content.getConstructor() == 276722716;
    }

    public void y(k4.a aVar, final o6 o6Var, final TdApi.Message message) {
        final Bitmap m10 = org.thunderdog.challegram.loader.b.m(aVar.N, o(false), false, false);
        if (m10 != null) {
            o6Var.hd().post(new Runnable() {
                @Override
                public final void run() {
                    AudioService.this.x(o6Var, message, m10);
                }
            });
        }
    }

    public final void A(final o6 o6Var, final TdApi.Message message, final k4.a aVar) {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                AudioService.this.y(aVar, o6Var, message);
            }
        });
    }

    public final void B() {
        if (this.f20103b0 != 0 && SystemClock.uptimeMillis() - this.f20103b0 < 500) {
            this.f20103b0 = 0L;
        } else if (!this.Z) {
            this.Z = true;
            this.f20101a0 = 1;
            Handler handler = this.f20100a;
            handler.sendMessageDelayed(Message.obtain(handler, 0), 370L);
        } else if (this.f20101a0 != 3) {
            this.f20100a.removeMessages(0);
            int i10 = this.f20101a0 + 1;
            this.f20101a0 = i10;
            if (i10 == 3) {
                z();
                return;
            }
            Handler handler2 = this.f20100a;
            handler2.sendMessageDelayed(Message.obtain(handler2, 0), 420L);
        }
    }

    public final void E() {
        this.R = s();
        this.S = r();
    }

    public final void F() {
        this.f20106d0 = true;
        this.f20100a.removeMessages(1);
        Handler handler = this.f20100a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 1, 0), 180L);
    }

    public final void G() {
        if (!p() || !this.f20106d0) {
            F();
        }
    }

    public final void H() {
        AudioManager audioManager;
        if (this.f20106d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(this, 3, 1);
            J(1);
        }
    }

    public final void x(o6 o6Var, TdApi.Message message, Bitmap bitmap) {
        TdApi.Message message2 = this.U;
        if (message2 != null && o0.E(this.T, o6Var, message, message2)) {
            this.V = bitmap;
            this.W = null;
            P();
            L();
        } else if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final void J(int i10) {
        if (this.f20105c0 != i10) {
            boolean D = D(i10);
            this.f20105c0 = i10;
            boolean q10 = q(i10);
            boolean D2 = D(i10);
            ya.o1().w2().W0(64, !q10);
            if (D != D2) {
                ya.o1().w2().b1(D2);
            }
        }
    }

    public final void K(int i10) {
        if (this.M != i10) {
            this.M = i10;
            if (i10 == 3) {
                G();
            }
            if (this.U != null) {
                P();
                M();
            }
        }
    }

    @Override
    public void K1(o6 o6Var, TdApi.Message message, int i10, boolean z10) {
        if (v()) {
            E();
            int i11 = this.f20102b;
            if (i10 < i11) {
                this.f20102b = i11 - 1;
            }
            this.f20104c.remove(i10);
            l();
        }
    }

    @Override
    public void K6(o6 o6Var, TdApi.Message message, int i10) {
        if (v()) {
            E();
            int i11 = this.f20102b;
            if (i10 <= i11) {
                this.f20102b = i11 + 1;
            }
            this.f20104c.add(i10, message);
            l();
        }
    }

    @TargetApi(21)
    public final void L() {
        Bitmap bitmap;
        Object obj = this.Y;
        if (obj != null) {
            TdApi.Audio audio = ((TdApi.MessageAudio) this.U.content).audio;
            MediaSession mediaSession = (MediaSession) obj;
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            builder.putString("android.media.metadata.TITLE", t2.m2(audio));
            builder.putString("android.media.metadata.ARTIST", t2.f2(audio));
            long j10 = this.P;
            if (j10 != -9223372036854775807L && j10 > 0) {
                builder.putLong("android.media.metadata.DURATION", j10);
            }
            Bitmap bitmap2 = this.V;
            if (bitmap2 != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap2);
            } else if (fd.a.f11899u && (bitmap = this.W) != null) {
                builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
            }
            mediaSession.setMetadata(builder.build());
        }
    }

    @Override
    public void L6(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, boolean z10, int i11) {
        if (v()) {
            this.f20102b = i10;
            this.M = i11;
            N(o6Var, message);
        }
    }

    @TargetApi(21)
    public final void M() {
        Object obj = this.Y;
        if (obj != null) {
            MediaSession mediaSession = (MediaSession) obj;
            PlaybackState.Builder builder = new PlaybackState.Builder();
            long j10 = 775;
            if (r()) {
                j10 = 807;
            }
            if (s()) {
                j10 |= 16;
            }
            builder.setActions(j10);
            int i10 = 3;
            if (this.M != 3) {
                i10 = 2;
            } else if (this.N) {
                i10 = 6;
            }
            builder.setState(i10, this.O, 1.0f);
            mediaSession.setPlaybackState(builder.build());
            mediaSession.setActive(true);
        }
    }

    public final void N(o6 o6Var, TdApi.Message message) {
        if (message != null || this.U != null) {
            o6 o6Var2 = this.T;
            if (o6Var2 != o6Var || !o0.E(o6Var2, o6Var, this.U, message)) {
                boolean z10 = this.U != null;
                boolean z11 = message != null;
                if (z10) {
                    ya.o1().w2().T0(this.T, this.U, this);
                    ya.o1().Y().x0(this.T, this.U, this);
                }
                this.T = o6Var;
                this.U = message;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.V != null) {
                        C(this.W);
                        this.W = this.V;
                    }
                    this.V = null;
                } else {
                    this.V = C(this.V);
                }
                this.O = -1L;
                this.P = -1L;
                if (!z11) {
                    v0.O2(this, true, Integer.MAX_VALUE);
                    n();
                    stopSelf();
                    return;
                }
                k4.a R0 = ya.o1().Y().R0(o6Var, message, this);
                if (R0 != null) {
                    A(o6Var, message, R0);
                }
                if (!z10) {
                    u();
                } else {
                    G();
                }
                L();
                M();
                ya.o1().w2().r(o6Var, message, this);
                if (!z10) {
                    v0.N2(this, Integer.MAX_VALUE, k());
                } else {
                    P();
                }
            }
        }
    }

    public final void P() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            try {
                notificationManager.notify(Integer.MAX_VALUE, k());
            } catch (Throwable th) {
                Log.e("Unable to update music notification", th, new Object[0]);
                Tracer.h(th);
                throw th;
            }
        }
    }

    @Override
    public void P1(o6 o6Var, List<TdApi.Message> list, boolean z10) {
        if (v()) {
            E();
            if (!z10) {
                this.f20102b += list.size();
            }
            if (z10) {
                this.f20104c.addAll(list);
            } else {
                this.f20104c.addAll(0, list);
            }
            l();
        }
    }

    public final Intent Q(String str) {
        Intent intent = new Intent(this, AudioMediaReceiver.class);
        intent.setAction(str);
        return intent;
    }

    public final PendingIntent R(int i10) {
        return PendingIntent.getActivity(this, 0, v.U(i10), 134217728);
    }

    @Override
    public void a(o6 o6Var, TdApi.Message message, k4.a aVar) {
        A(o6Var, message, aVar);
    }

    @Override
    public void g6() {
    }

    public final void h() {
        this.f20106d0 = false;
        this.f20100a.removeMessages(1);
        Handler handler = this.f20100a;
        handler.sendMessageDelayed(Message.obtain(handler, 1, 0, 0), 50L);
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
        TdApi.Message message;
        if (this.T == o6Var && (message = this.U) != null && o0.C(message, j10, j11, i10)) {
            if (i11 == 3 || i11 == 2) {
                K(i11);
            }
        }
    }

    public final void j() {
        AudioManager audioManager;
        if (!this.f20106d0 && (audioManager = (AudioManager) getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this);
        }
    }

    @Override
    public void j1(o6 o6Var, TdApi.Message message, int i10, int i11) {
        if (v()) {
            E();
            int i12 = this.f20102b;
            if (i12 == i10) {
                this.f20102b = i11;
            } else {
                if (i10 < i12) {
                    this.f20102b = i12 - 1;
                }
                int i13 = this.f20102b;
                if (i11 <= i13) {
                    this.f20102b = i13 + 1;
                }
            }
            ib.b.w(this.f20104c, i10, i11);
            l();
        }
    }

    public final Notification k() {
        Notification.Builder builder;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(this, v.l("playback", R.string.NotificationChannelPlayback));
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentIntent(R(this.T.A6()));
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, Q("org.thunderdog.challegram.ACTION_PLAY_SKIP_PREVIOUS"), 134217728);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 100, Q("org.thunderdog.challegram.ACTION_PLAY_PAUSE"), 134217728);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 100, Q("org.thunderdog.challegram.ACTION_PLAY_SKIP_NEXT"), 134217728);
        builder.addAction(R.drawable.baseline_skip_previous_24_white, w.i1(R.string.PlaySkipPrev), broadcast);
        if (this.M == 3) {
            builder.addAction(R.drawable.baseline_pause_36_white, w.i1(R.string.PlayPause), broadcast2);
        } else {
            builder.addAction(R.drawable.baseline_play_arrow_36_white, w.i1(this.O > 0 ? R.string.PlayResume : R.string.PlayPlay), broadcast2);
        }
        builder.addAction(R.drawable.baseline_skip_next_24_white, w.i1(R.string.PlaySkipNext), broadcast3);
        if (this.M != 3) {
            builder.addAction(R.drawable.baseline_stop_24_white, w.i1(R.string.PlayStop), PendingIntent.getBroadcast(this, 100, Q("org.thunderdog.challegram.ACTION_PLAY_STOP"), 134217728));
        }
        builder.setColor(this.T.F1());
        builder.setStyle(new Notification.MediaStyle().setShowActionsInCompactView(0, 1, 2).setMediaSession(((MediaSession) this.Y).getSessionToken()));
        builder.setSmallIcon(R.drawable.baseline_play_circle_filled_24_white);
        boolean z10 = true;
        builder.setVisibility(1);
        boolean z11 = (this.M != 3 || this.N || this.P == -9223372036854775807L || this.O == -9223372036854775807L || this.f20102b == -1) ? false : true;
        if (z11) {
            builder.setUsesChronometer(true).setWhen(System.currentTimeMillis() - this.O);
        } else {
            builder.setUsesChronometer(false).setWhen(0L);
        }
        builder.setShowWhen(z11);
        TdApi.Audio audio = ((TdApi.MessageAudio) this.U.content).audio;
        builder.setContentTitle(t2.m2(audio));
        builder.setContentText(t2.f2(audio));
        if (this.M != 3) {
            z10 = false;
        }
        builder.setOngoing(z10);
        Bitmap bitmap2 = this.V;
        if (bitmap2 != null) {
            builder.setLargeIcon(bitmap2);
        } else if (!fd.a.f11899u || (bitmap = this.W) == null) {
            Bitmap bitmap3 = this.X;
            if (bitmap3 != null) {
                builder.setLargeIcon(bitmap3);
            }
        } else {
            builder.setLargeIcon(bitmap);
        }
        return builder.build();
    }

    public final void l() {
        if (this.U == null) {
            return;
        }
        if (this.R != s() || this.S != r()) {
            P();
            M();
        }
    }

    public final void m() {
        if (this.U != null) {
            this.P = -1L;
            this.O = -1L;
            this.M = 0;
            this.N = false;
            this.Q = 0;
            this.f20104c.clear();
            this.f20102b = -1;
            N(null, null);
        }
    }

    @Override
    public void m7(o6 o6Var, long j10, long j11, long j12, boolean z10, boolean z11, List<TdApi.Message> list) {
        if (v()) {
            m();
        }
    }

    public final void n() {
        ya.o1().w2().b1(false);
        this.X = C(this.X);
        Object obj = this.Y;
        if (obj != null) {
            MediaSession mediaSession = (MediaSession) obj;
            mediaSession.setActive(false);
            mediaSession.release();
            this.Y = null;
        }
        this.W = C(this.W);
        this.V = C(this.V);
        h();
    }

    @Override
    public void onAudioFocusChange(int i10) {
        J(i10);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        j0.L(getApplicationContext());
        this.f20100a = new b(this);
        Log.i((int) Log.TAG_PLAYER, "[service] onCreate", new Object[0]);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i((int) Log.TAG_PLAYER, "[service] onDestroy", new Object[0]);
        v0.O2(this, true, Integer.MAX_VALUE);
        ya.o1().w2().S0(this);
    }

    @Override
    public int onStartCommand(Intent intent, int i10, int i11) {
        Log.i((int) Log.TAG_PLAYER, "[service] onStartCommand", new Object[0]);
        ya.o1().w2().q(this, true);
        return 1;
    }

    public final boolean p() {
        return q(this.f20105c0);
    }

    public final boolean r() {
        if (this.f20102b != -1) {
            if (t()) {
                if (this.f20102b > 0) {
                    return true;
                }
            } else if (this.f20102b + 1 < this.f20104c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        if (this.f20102b != -1) {
            if (!t()) {
                if (this.f20102b > 0) {
                    return true;
                }
            } else if (this.f20102b + 1 < this.f20104c.size()) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        return (this.Q & Log.TAG_ROUND) != 0;
    }

    public final void u() {
        MediaSession mediaSession = new MediaSession(this, "MusicService");
        mediaSession.setCallback(new a());
        mediaSession.setFlags(3);
        mediaSession.setActive(true);
        mediaSession.setSessionActivity(R(this.T.A6()));
        mediaSession.setExtras(new Bundle());
        this.Y = mediaSession;
        F();
        this.X = O();
    }

    @Override
    public void u4(o6 o6Var, TdApi.Message message, int i10, List<TdApi.Message> list, long j10, int i11, int i12) {
        if (!w(message)) {
            m();
            return;
        }
        this.f20104c.clear();
        this.f20104c.addAll(list);
        this.f20102b = i10;
        this.Q = i11;
        this.M = i12;
        N(o6Var, message);
    }

    public final boolean v() {
        return this.U != null;
    }

    @Override
    public void v4(int i10) {
        if (v() && this.Q != i10) {
            E();
            this.Q = i10;
            l();
        }
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        TdApi.Message message;
        if (this.T == o6Var && (message = this.U) != null && o0.C(message, j10, j11, i10)) {
            boolean z11 = false;
            boolean z12 = this.P != j13;
            long j14 = this.O;
            boolean z13 = ((j14 > 0L ? 1 : (j14 == 0L ? 0 : -1)) <= 0) != ((j12 > 0L ? 1 : (j12 == 0L ? 0 : -1)) <= 0) || Math.abs(j12 - j14) >= 2000;
            long j15 = this.P;
            int i11 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
            boolean z14 = ((j15 > 0L ? 1 : (j15 == 0L ? 0 : -1)) <= 0) != (i11 <= 0) || (j15 > 0 && i11 > 0 && j15 != j13);
            if (this.N != z10) {
                z11 = true;
            }
            if (z12 || this.O != j12 || z11) {
                this.P = j13;
                this.O = j12;
                this.N = z10;
                if (z12 || z13 || (z11 && this.M == 3)) {
                    P();
                }
                if (z14) {
                    L();
                }
                if (z14 || z12 || z13 || z11) {
                    M();
                }
            }
        }
    }

    public final void z() {
        if (this.Z) {
            this.Z = false;
            int i10 = this.f20101a0;
            this.f20101a0 = 0;
            if (i10 >= 0) {
                this.f20103b0 = SystemClock.uptimeMillis();
            }
            if (i10 <= 1) {
                ya.o1().w2().E0();
            } else if (i10 == 2) {
                ya.o1().w2().c1(true);
            } else {
                ya.o1().w2().c1(false);
            }
        }
    }
}
