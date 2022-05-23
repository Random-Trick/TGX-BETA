package gd;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import ce.j0;
import gd.j;
import hd.v2;
import ib.i;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import zd.ya;

@Deprecated
public class j implements MediaPlayer.OnCompletionListener {
    public static int[] f12263w = new int[3];
    public static j f12264x;
    public v2 f12269e;
    public int f12270f;
    public long f12272h;
    public long f12273i;
    public int f12275k;
    public m f12281q;
    public m f12282r;
    public int f12283s;
    public int f12284t;
    public boolean f12285u;
    public kb.b f12286v;
    public boolean f12265a = false;
    public MediaPlayer f12266b = null;
    public AudioTrack f12267c = null;
    public int f12268d = 0;
    public boolean f12271g = false;
    public int f12274j = 0;
    public ArrayList<c> f12276l = new ArrayList<>();
    public ArrayList<c> f12277m = new ArrayList<>();
    public final Object f12278n = new Object();
    public final Object f12279o = new Object();
    public final Object f12280p = new Object();

    public class a implements AudioTrack.OnPlaybackPositionUpdateListener {
        public a() {
        }

        public static void b() {
            ya.o1().w2().D0();
        }

        @Override
        public void onMarkerReached(AudioTrack audioTrack) {
            b0.k().q(i.f12251a);
        }

        @Override
        public void onPeriodicNotification(AudioTrack audioTrack) {
        }
    }

    public class b extends kb.b {
        public b() {
        }

        public void h(float f10, int i10) {
            float f11;
            if (j.this.f12269e == null) {
                return;
            }
            if (!(j.this.f12266b == null && j.this.f12267c == null) && !j.this.f12265a) {
                try {
                    if (j.this.f12274j != 0) {
                        j jVar = j.this;
                        jVar.f12274j--;
                        return;
                    }
                    if (j.this.f12266b != null) {
                        f11 = 0.0f;
                        if (f10 != 0.0f) {
                            f11 = j.this.f12268d / f10;
                        }
                        if (j.this.f12283s != j.this.f12284t) {
                            if (i10 < j.this.f12268d) {
                                j jVar2 = j.this;
                                jVar2.f12284t = jVar2.f12283s;
                                j.this.f12268d = 0;
                            } else {
                                return;
                            }
                        }
                        if (i10 <= j.this.f12268d) {
                            return;
                        }
                    } else {
                        f11 = ((float) j.this.f12273i) / ((float) j.this.f12272h);
                        if (i10 == j.this.f12268d) {
                            return;
                        }
                    }
                    synchronized (j.this.f12280p) {
                        if (d()) {
                            j.this.f12268d = i10;
                            j.this.f12269e.i(f11, j.this.f12268d / 1000);
                        }
                    }
                } catch (Throwable th) {
                    Log.e("Cannot set progress of an audio", th, new Object[0]);
                }
            }
        }

        @Override
        public void b() {
            final float f10;
            final int i10;
            synchronized (j.this.f12280p) {
                if (j.this.f12269e != null && (!(j.this.f12266b == null && j.this.f12267c == null) && !j.this.f12265a)) {
                    if (j.this.f12266b != null) {
                        i10 = j.this.f12266b.getCurrentPosition();
                        f10 = j.this.f12266b.getDuration();
                    } else {
                        i10 = (int) (((float) j.this.f12273i) / 48.0f);
                        f10 = 0.0f;
                    }
                    j0.d0(new Runnable() {
                        @Override
                        public final void run() {
                            j.b.this.h(f10, i10);
                        }
                    });
                }
                if (d()) {
                    b0.k().r(j.this.f12286v, 40);
                }
            }
        }
    }

    public static class c {
        public ByteBuffer f12288a;
        public byte[] f12289b;
        public int f12290c;
        public int f12291d;
        public long f12292e;

        public c(int i10) {
            this.f12288a = ByteBuffer.allocateDirect(i10);
            this.f12289b = new byte[i10];
        }
    }

    public j() {
        this.f12270f = 0;
        int minBufferSize = AudioTrack.getMinBufferSize(48000, 4, 2);
        this.f12270f = minBufferSize;
        if (minBufferSize <= 0) {
            this.f12270f = 3840;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            this.f12277m.add(new c(this.f12270f));
        }
        this.f12281q = new m("playerQueue");
        this.f12282r = new m("fileDecodingQueue");
    }

    public static j B() {
        if (f12264x == null) {
            f12264x = new j();
        }
        return f12264x;
    }

    public void C() {
        if (this.f12271g) {
            z();
            return;
        }
        boolean z10 = false;
        while (true) {
            c cVar = null;
            synchronized (this.f12278n) {
                if (!this.f12277m.isEmpty()) {
                    cVar = this.f12277m.get(0);
                    this.f12277m.remove(0);
                }
                if (!this.f12276l.isEmpty()) {
                    z10 = true;
                }
            }
            if (cVar == null) {
                break;
            }
            N.readOpusFile(cVar.f12288a, this.f12270f, f12263w);
            int[] iArr = f12263w;
            int i10 = iArr[0];
            cVar.f12290c = i10;
            cVar.f12292e = iArr[1];
            int i11 = iArr[2];
            cVar.f12291d = i11;
            if (i11 == 1) {
                this.f12271g = true;
            }
            if (i10 == 0) {
                synchronized (this.f12278n) {
                    this.f12277m.add(cVar);
                }
                break;
            }
            cVar.f12288a.rewind();
            cVar.f12288a.get(cVar.f12289b);
            synchronized (this.f12278n) {
                this.f12276l.add(cVar);
            }
            z10 = true;
        }
        if (z10) {
            z();
        }
    }

    public void D(long j10, int i10, int i11) {
        AudioTrack audioTrack;
        this.f12273i = j10;
        if (i10 != -1 && (audioTrack = this.f12267c) != null) {
            if (audioTrack != null) {
                try {
                    audioTrack.setNotificationMarkerPosition(1);
                } catch (Throwable th) {
                    Log.w(Log.TAG_VOICE, "setNotificationMarkerForPosition", th, new Object[0]);
                }
            }
            if (i11 == 1) {
                A();
            }
        }
    }

    public void E() {
        int i10;
        synchronized (this.f12279o) {
            AudioTrack audioTrack = this.f12267c;
            if (audioTrack != null && audioTrack.getPlayState() == 3) {
                c cVar = null;
                synchronized (this.f12278n) {
                    i10 = 0;
                    if (!this.f12276l.isEmpty()) {
                        cVar = this.f12276l.get(0);
                        this.f12276l.remove(0);
                    }
                }
                if (cVar != null) {
                    try {
                        i10 = this.f12267c.write(cVar.f12289b, 0, cVar.f12290c);
                    } catch (Throwable th) {
                        Log.e("Cannot write data to audio buffer", th, new Object[0]);
                    }
                    final int i11 = this.f12275k + 1;
                    this.f12275k = i11;
                    if (i10 > 0) {
                        final long j10 = cVar.f12292e;
                        final int i12 = cVar.f12291d == 1 ? cVar.f12290c : -1;
                        j0.d0(new Runnable() {
                            @Override
                            public final void run() {
                                j.this.D(j10, i12, i11);
                            }
                        });
                    }
                    if (cVar.f12291d != 1) {
                        z();
                    }
                }
                if (cVar == null || cVar.f12291d != 1) {
                    y();
                }
                if (cVar != null) {
                    synchronized (this.f12278n) {
                        this.f12277m.add(cVar);
                    }
                }
            }
        }
    }

    public static void F() {
        B().A();
        ya.o1().w2().D0();
    }

    public static void G(Boolean[] boolArr, File file, Semaphore semaphore) {
        boolArr[0] = Boolean.valueOf(N.openOpusFile(file.getAbsolutePath()) != 0);
        semaphore.release();
    }

    public void H(int i10) {
        long j10 = i10;
        try {
            if (j10 > 0) {
                this.f12273i = j10;
                N.seekOpusFile(((float) j10) / ((float) this.f12272h));
            } else {
                v2 v2Var = this.f12269e;
                if (!(v2Var == null || v2Var.e() == 0.0f)) {
                    this.f12273i = ((float) this.f12272h) * this.f12269e.e();
                    N.seekOpusFile(this.f12269e.e());
                }
            }
        } catch (Throwable th) {
            Log.e(th);
        }
        synchronized (this.f12278n) {
            this.f12277m.addAll(this.f12276l);
            this.f12276l.clear();
        }
        this.f12271g = false;
        z();
    }

    public void I(float f10) {
        if (!this.f12265a) {
            this.f12274j = 3;
            this.f12273i = ((float) this.f12272h) * f10;
            AudioTrack audioTrack = this.f12267c;
            if (audioTrack != null) {
                audioTrack.play();
            }
            this.f12268d = (int) ((((float) this.f12272h) / 48.0f) * f10);
            z();
        }
    }

    public void J(final float f10) {
        N.seekOpusFile(f10);
        synchronized (this.f12278n) {
            this.f12277m.addAll(this.f12276l);
            this.f12276l.clear();
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j.this.I(f10);
            }
        });
    }

    public void A() {
        MediaPlayer mediaPlayer = this.f12266b;
        if (mediaPlayer != null || this.f12267c != null) {
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.stop();
                } catch (Throwable th) {
                    Log.e("Cannot stop audio player", th, new Object[0]);
                }
                try {
                    this.f12266b.release();
                    this.f12266b = null;
                } catch (Throwable th2) {
                    Log.e("Cannot release audio player", th2, new Object[0]);
                }
            } else {
                synchronized (this.f12279o) {
                    try {
                        this.f12267c.pause();
                        this.f12267c.flush();
                        this.f12267c.release();
                        this.f12267c = null;
                    }
                }
            }
            T();
            this.f12283s = 0;
            this.f12284t = 0;
            this.f12268d = 0;
            this.f12275k = 0;
            this.f12265a = false;
            this.f12269e.h(false);
            this.f12269e.i(0.0f, 0);
            this.f12269e = null;
        }
    }

    public boolean K(v2 v2Var) {
        v2 v2Var2;
        if (!((this.f12267c == null && this.f12266b == null) || v2Var == null || (v2Var2 = this.f12269e) == null || !v2Var2.a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f12266b;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                } else {
                    AudioTrack audioTrack = this.f12267c;
                    if (audioTrack != null) {
                        audioTrack.pause();
                    }
                }
                this.f12265a = true;
                T();
                return true;
            } catch (Throwable th) {
                Log.e(th);
                this.f12265a = false;
            }
        }
        return false;
    }

    public boolean L(v2 v2Var) {
        return M(v2Var, 0, false);
    }

    public boolean M(v2 v2Var, final int i10, boolean z10) {
        v2 v2Var2;
        if (v2Var != null && !i.i(v2Var.d())) {
            if ((this.f12267c == null && this.f12266b == null) || (v2Var2 = this.f12269e) == null || !v2Var.a(v2Var2)) {
                A();
                final File file = new File(v2Var.d());
                this.f12285u = false;
                int i11 = 3;
                if (N.isOpusFile(file.getAbsolutePath()) == 1) {
                    synchronized (this.f12279o) {
                        this.f12274j = 3;
                        final Semaphore semaphore = new Semaphore(0);
                        final Boolean[] boolArr = new Boolean[1];
                        this.f12282r.e(new Runnable() {
                            @Override
                            public final void run() {
                                j.G(boolArr, file, semaphore);
                            }
                        }, 0L);
                        semaphore.acquire();
                        if (!boolArr[0].booleanValue()) {
                            return false;
                        }
                        this.f12272h = N.getTotalPcmDuration();
                        AudioTrack audioTrack = new AudioTrack(this.f12285u ? 0 : 3, 48000, 4, 2, this.f12270f, 1);
                        this.f12267c = audioTrack;
                        audioTrack.setStereoVolume(1.0f, 1.0f);
                        this.f12267c.setPlaybackPositionUpdateListener(new a());
                        this.f12267c.play();
                        R();
                    }
                } else {
                    try {
                        MediaPlayer mediaPlayer = new MediaPlayer();
                        this.f12266b = mediaPlayer;
                        if (this.f12285u) {
                            i11 = 0;
                        }
                        mediaPlayer.setAudioStreamType(i11);
                        this.f12266b.setDataSource(file.getAbsolutePath());
                        this.f12266b.prepare();
                        this.f12266b.start();
                        this.f12266b.setOnCompletionListener(this);
                        R();
                    } catch (Throwable th) {
                        Log.e(th);
                        MediaPlayer mediaPlayer2 = this.f12266b;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                            this.f12266b = null;
                            this.f12265a = false;
                            this.f12269e = null;
                        }
                    }
                }
                this.f12265a = false;
                this.f12268d = 0;
                this.f12273i = 0L;
                this.f12269e = v2Var;
                MediaPlayer mediaPlayer3 = this.f12266b;
                if (mediaPlayer3 != null) {
                    try {
                        if (i10 > 0) {
                            mediaPlayer3.seekTo(i10);
                        } else if (v2Var.e() != 0.0f) {
                            this.f12266b.seekTo((int) (this.f12266b.getDuration() * this.f12269e.e()));
                        }
                    } catch (Throwable th2) {
                        this.f12269e.i(0.0f, 0);
                        Log.e("Cannot seek audio", th2, new Object[0]);
                    }
                } else if (this.f12267c != null) {
                    if (v2Var.e() == 1.0f) {
                        this.f12269e.i(0.0f, 0);
                    }
                    this.f12282r.e(new Runnable() {
                        @Override
                        public final void run() {
                            j.this.H(i10);
                        }
                    }, 0L);
                }
                return true;
            }
            if (this.f12265a) {
                N(v2Var);
            }
            return true;
        }
        return false;
    }

    public boolean N(v2 v2Var) {
        v2 v2Var2;
        if (!((this.f12267c == null && this.f12266b == null) || v2Var == null || (v2Var2 = this.f12269e) == null || !v2Var2.a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f12266b;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                } else {
                    AudioTrack audioTrack = this.f12267c;
                    if (audioTrack != null) {
                        audioTrack.play();
                        z();
                    }
                }
                this.f12265a = false;
                R();
                return true;
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        return false;
    }

    public final void O(final float f10) {
        long j10 = this.f12272h;
        if (((float) j10) * f10 != ((float) j10)) {
            if (!this.f12265a) {
                this.f12267c.pause();
            }
            this.f12267c.flush();
            this.f12282r.e(new Runnable() {
                @Override
                public final void run() {
                    j.this.J(f10);
                }
            }, 0L);
        }
    }

    public boolean P(v2 v2Var, float f10) {
        v2 v2Var2;
        if (!((this.f12267c == null && this.f12266b == null) || v2Var == null || (v2Var2 = this.f12269e) == null || !v2Var2.a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f12266b;
                if (mediaPlayer != null) {
                    int duration = (int) (mediaPlayer.getDuration() * f10);
                    this.f12266b.seekTo(duration);
                    this.f12268d = duration;
                } else if (this.f12267c != null) {
                    O(f10);
                }
                if (this.f12265a) {
                    this.f12269e.i(f10, this.f12268d / 1000);
                    return true;
                }
                R();
                return true;
            } catch (Throwable th) {
                Log.e("Cannot seek audio player", th, new Object[0]);
            }
        }
        return false;
    }

    public void Q(v2 v2Var, boolean z10) {
        v2 v2Var2;
        if (this.f12266b != null && (v2Var2 = this.f12269e) != null && v2Var != null && v2Var2.a(v2Var)) {
            this.f12266b.setLooping(z10);
        }
    }

    public void R() {
        kb.b bVar = this.f12286v;
        if (bVar != null) {
            bVar.c();
            this.f12286v = null;
        }
        this.f12286v = new b();
        synchronized (this.f12280p) {
            if (this.f12286v.d()) {
                b0.k().r(this.f12286v, 40);
            }
        }
    }

    public void S() {
        AudioTrack audioTrack = this.f12267c;
        if ((audioTrack != null || this.f12266b != null) && this.f12269e != null) {
            try {
                MediaPlayer mediaPlayer = this.f12266b;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                } else {
                    audioTrack.pause();
                    this.f12267c.flush();
                }
            } catch (Throwable th) {
                Log.e(th);
            }
            try {
                MediaPlayer mediaPlayer2 = this.f12266b;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    this.f12266b = null;
                } else if (this.f12267c != null) {
                    synchronized (this.f12279o) {
                        this.f12267c.release();
                        this.f12267c = null;
                    }
                }
            } catch (Throwable th2) {
                Log.e(th2);
            }
            T();
            v2 v2Var = this.f12269e;
            if (v2Var != null) {
                try {
                    v2Var.h(false);
                    this.f12269e.i(0.0f, 0);
                } catch (Throwable th3) {
                    Log.e(th3);
                }
            }
            this.f12269e = null;
            this.f12265a = false;
        }
    }

    public void T() {
        synchronized (this.f12280p) {
            kb.b bVar = this.f12286v;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    public void U() {
        v2 v2Var = this.f12269e;
        if (v2Var != null && v2Var.f() && this.f12269e.b() != 0) {
            S();
        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (mediaPlayer.isLooping()) {
            this.f12283s++;
        } else {
            b0.k().q(h.f12249a);
        }
    }

    public void x(boolean z10) {
        v2 v2Var = this.f12269e;
        boolean z11 = this.f12265a;
        if (v2Var == null) {
            return;
        }
        if ((this.f12266b == null && this.f12267c == null) || !z10) {
            return;
        }
        if (!this.f12285u) {
            int i10 = this.f12268d;
            S();
            M(v2Var, i10, true);
            if (z11) {
                K(this.f12269e);
            }
        } else if (z11) {
            L(v2Var);
        }
    }

    public final void y() {
        this.f12282r.e(new Runnable() {
            @Override
            public final void run() {
                j.this.C();
            }
        }, 0L);
    }

    public final void z() {
        this.f12281q.e(new Runnable() {
            @Override
            public final void run() {
                j.this.E();
            }
        }, 0L);
    }
}
