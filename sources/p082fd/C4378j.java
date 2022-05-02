package p082fd;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import be.C1379j0;
import gd.C4812v2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import p082fd.C4378j;
import p108hb.C5070i;
import p139jb.AbstractRunnableC5910b;
import p350yd.C10536ab;

@Deprecated
public class C4378j implements MediaPlayer.OnCompletionListener {
    public static int[] f14496w = new int[3];
    public static C4378j f14497x;
    public C4812v2 f14502e;
    public int f14503f;
    public long f14505h;
    public long f14506i;
    public int f14508k;
    public C4384m f14514q;
    public C4384m f14515r;
    public int f14516s;
    public int f14517t;
    public boolean f14518u;
    public AbstractRunnableC5910b f14519v;
    public boolean f14498a = false;
    public MediaPlayer f14499b = null;
    public AudioTrack f14500c = null;
    public int f14501d = 0;
    public boolean f14504g = false;
    public int f14507j = 0;
    public ArrayList<C4381c> f14509l = new ArrayList<>();
    public ArrayList<C4381c> f14510m = new ArrayList<>();
    public final Object f14511n = new Object();
    public final Object f14512o = new Object();
    public final Object f14513p = new Object();

    public class C4379a implements AudioTrack.OnPlaybackPositionUpdateListener {
        public C4379a() {
        }

        public static void m28062b() {
            C10536ab.m4667o1().m4636w2().m7113D0();
        }

        @Override
        public void onMarkerReached(AudioTrack audioTrack) {
            C4356b0.m28201k().m28195q(RunnableC4374i.f14484a);
        }

        @Override
        public void onPeriodicNotification(AudioTrack audioTrack) {
        }
    }

    public class C4380b extends AbstractRunnableC5910b {
        public C4380b() {
        }

        public void m28060h(float f, int i) {
            float f2;
            if (C4378j.this.f14502e == null) {
                return;
            }
            if (!(C4378j.this.f14499b == null && C4378j.this.f14500c == null) && !C4378j.this.f14498a) {
                try {
                    if (C4378j.this.f14507j != 0) {
                        C4378j jVar = C4378j.this;
                        jVar.f14507j--;
                        return;
                    }
                    if (C4378j.this.f14499b != null) {
                        f2 = 0.0f;
                        if (f != 0.0f) {
                            f2 = C4378j.this.f14501d / f;
                        }
                        if (C4378j.this.f14516s != C4378j.this.f14517t) {
                            if (i < C4378j.this.f14501d) {
                                C4378j jVar2 = C4378j.this;
                                jVar2.f14517t = jVar2.f14516s;
                                C4378j.this.f14501d = 0;
                            } else {
                                return;
                            }
                        }
                        if (i <= C4378j.this.f14501d) {
                            return;
                        }
                    } else {
                        f2 = ((float) C4378j.this.f14506i) / ((float) C4378j.this.f14505h);
                        if (i == C4378j.this.f14501d) {
                            return;
                        }
                    }
                    synchronized (C4378j.this.f14513p) {
                        if (m21856d()) {
                            C4378j.this.f14501d = i;
                            C4378j.this.f14502e.m25197i(f2, C4378j.this.f14501d / 1000);
                        }
                    }
                } catch (Throwable th) {
                    Log.m14725e("Cannot set progress of an audio", th, new Object[0]);
                }
            }
        }

        @Override
        public void mo1364b() {
            final float f;
            final int i;
            synchronized (C4378j.this.f14513p) {
                if (C4378j.this.f14502e != null && (!(C4378j.this.f14499b == null && C4378j.this.f14500c == null) && !C4378j.this.f14498a)) {
                    if (C4378j.this.f14499b != null) {
                        i = C4378j.this.f14499b.getCurrentPosition();
                        f = C4378j.this.f14499b.getDuration();
                    } else {
                        i = (int) (((float) C4378j.this.f14506i) / 48.0f);
                        f = 0.0f;
                    }
                    C1379j0.m37334d0(new Runnable() {
                        @Override
                        public final void run() {
                            C4378j.C4380b.this.m28060h(f, i);
                        }
                    });
                }
                if (m21856d()) {
                    C4356b0.m28201k().m28194r(C4378j.this.f14519v, 40);
                }
            }
        }
    }

    public static class C4381c {
        public ByteBuffer f14522a;
        public byte[] f14523b;
        public int f14524c;
        public int f14525d;
        public long f14526e;

        public C4381c(int i) {
            this.f14522a = ByteBuffer.allocateDirect(i);
            this.f14523b = new byte[i];
        }
    }

    public C4378j() {
        this.f14503f = 0;
        int minBufferSize = AudioTrack.getMinBufferSize(48000, 4, 2);
        this.f14503f = minBufferSize;
        if (minBufferSize <= 0) {
            this.f14503f = 3840;
        }
        for (int i = 0; i < 3; i++) {
            this.f14510m.add(new C4381c(this.f14503f));
        }
        this.f14514q = new C4384m("playerQueue");
        this.f14515r = new C4384m("fileDecodingQueue");
    }

    public static C4378j m28109B() {
        if (f14497x == null) {
            f14497x = new C4378j();
        }
        return f14497x;
    }

    public void m28108C() {
        if (this.f14504g) {
            m28064z();
            return;
        }
        boolean z = false;
        while (true) {
            C4381c cVar = null;
            synchronized (this.f14511n) {
                if (!this.f14510m.isEmpty()) {
                    cVar = this.f14510m.get(0);
                    this.f14510m.remove(0);
                }
                if (!this.f14509l.isEmpty()) {
                    z = true;
                }
            }
            if (cVar == null) {
                break;
            }
            C7888N.readOpusFile(cVar.f14522a, this.f14503f, f14496w);
            int[] iArr = f14496w;
            int i = iArr[0];
            cVar.f14524c = i;
            cVar.f14526e = iArr[1];
            int i2 = iArr[2];
            cVar.f14525d = i2;
            if (i2 == 1) {
                this.f14504g = true;
            }
            if (i == 0) {
                synchronized (this.f14511n) {
                    this.f14510m.add(cVar);
                }
                break;
            }
            cVar.f14522a.rewind();
            cVar.f14522a.get(cVar.f14523b);
            synchronized (this.f14511n) {
                this.f14509l.add(cVar);
            }
            z = true;
        }
        if (z) {
            m28064z();
        }
    }

    public void m28107D(long j, int i, int i2) {
        AudioTrack audioTrack;
        this.f14506i = j;
        if (i != -1 && (audioTrack = this.f14500c) != null) {
            if (audioTrack != null) {
                try {
                    audioTrack.setNotificationMarkerPosition(1);
                } catch (Throwable th) {
                    Log.m14712w(Log.TAG_VOICE, "setNotificationMarkerForPosition", th, new Object[0]);
                }
            }
            if (i2 == 1) {
                m28110A();
            }
        }
    }

    public void m28106E() {
        int i;
        synchronized (this.f14512o) {
            AudioTrack audioTrack = this.f14500c;
            if (audioTrack != null && audioTrack.getPlayState() == 3) {
                C4381c cVar = null;
                synchronized (this.f14511n) {
                    i = 0;
                    if (!this.f14509l.isEmpty()) {
                        cVar = this.f14509l.get(0);
                        this.f14509l.remove(0);
                    }
                }
                if (cVar != null) {
                    try {
                        i = this.f14500c.write(cVar.f14523b, 0, cVar.f14524c);
                    } catch (Throwable th) {
                        Log.m14725e("Cannot write data to audio buffer", th, new Object[0]);
                    }
                    final int i2 = this.f14508k + 1;
                    this.f14508k = i2;
                    if (i > 0) {
                        final long j = cVar.f14526e;
                        final int i3 = cVar.f14525d == 1 ? cVar.f14524c : -1;
                        C1379j0.m37334d0(new Runnable() {
                            @Override
                            public final void run() {
                                C4378j.this.m28107D(j, i3, i2);
                            }
                        });
                    }
                    if (cVar.f14525d != 1) {
                        m28064z();
                    }
                }
                if (cVar == null || cVar.f14525d != 1) {
                    m28065y();
                }
                if (cVar != null) {
                    synchronized (this.f14511n) {
                        this.f14510m.add(cVar);
                    }
                }
            }
        }
    }

    public static void m28105F() {
        m28109B().m28110A();
        C10536ab.m4667o1().m4636w2().m7113D0();
    }

    public static void m28104G(Boolean[] boolArr, File file, Semaphore semaphore) {
        boolArr[0] = Boolean.valueOf(C7888N.openOpusFile(file.getAbsolutePath()) != 0);
        semaphore.release();
    }

    public void m28103H(int i) {
        long j = i;
        try {
            if (j > 0) {
                this.f14506i = j;
                C7888N.seekOpusFile(((float) j) / ((float) this.f14505h));
            } else {
                C4812v2 v2Var = this.f14502e;
                if (!(v2Var == null || v2Var.m25201e() == 0.0f)) {
                    this.f14506i = ((float) this.f14505h) * this.f14502e.m25201e();
                    C7888N.seekOpusFile(this.f14502e.m25201e());
                }
            }
        } catch (Throwable th) {
            Log.m14723e(th);
        }
        synchronized (this.f14511n) {
            this.f14510m.addAll(this.f14509l);
            this.f14509l.clear();
        }
        this.f14504g = false;
        m28064z();
    }

    public void m28102I(float f) {
        if (!this.f14498a) {
            this.f14507j = 3;
            this.f14506i = ((float) this.f14505h) * f;
            AudioTrack audioTrack = this.f14500c;
            if (audioTrack != null) {
                audioTrack.play();
            }
            this.f14501d = (int) ((((float) this.f14505h) / 48.0f) * f);
            m28064z();
        }
    }

    public void m28101J(final float f) {
        C7888N.seekOpusFile(f);
        synchronized (this.f14511n) {
            this.f14510m.addAll(this.f14509l);
            this.f14509l.clear();
        }
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C4378j.this.m28102I(f);
            }
        });
    }

    public void m28110A() {
        MediaPlayer mediaPlayer = this.f14499b;
        if (mediaPlayer != null || this.f14500c != null) {
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.stop();
                } catch (Throwable th) {
                    Log.m14725e("Cannot stop audio player", th, new Object[0]);
                }
                try {
                    this.f14499b.release();
                    this.f14499b = null;
                } catch (Throwable th2) {
                    Log.m14725e("Cannot release audio player", th2, new Object[0]);
                }
            } else {
                synchronized (this.f14512o) {
                    try {
                        this.f14500c.pause();
                        this.f14500c.flush();
                        this.f14500c.release();
                        this.f14500c = null;
                    }
                }
            }
            m28091T();
            this.f14516s = 0;
            this.f14517t = 0;
            this.f14501d = 0;
            this.f14508k = 0;
            this.f14498a = false;
            this.f14502e.m25198h(false);
            this.f14502e.m25197i(0.0f, 0);
            this.f14502e = null;
        }
    }

    public boolean m28100K(C4812v2 v2Var) {
        C4812v2 v2Var2;
        if (!((this.f14500c == null && this.f14499b == null) || v2Var == null || (v2Var2 = this.f14502e) == null || !v2Var2.m25205a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f14499b;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                } else {
                    AudioTrack audioTrack = this.f14500c;
                    if (audioTrack != null) {
                        audioTrack.pause();
                    }
                }
                this.f14498a = true;
                m28091T();
                return true;
            } catch (Throwable th) {
                Log.m14723e(th);
                this.f14498a = false;
            }
        }
        return false;
    }

    public boolean m28099L(C4812v2 v2Var) {
        return m28098M(v2Var, 0, false);
    }

    public boolean m28098M(C4812v2 v2Var, final int i, boolean z) {
        C4812v2 v2Var2;
        if (v2Var != null && !C5070i.m24061i(v2Var.m25202d())) {
            if ((this.f14500c == null && this.f14499b == null) || (v2Var2 = this.f14502e) == null || !v2Var.m25205a(v2Var2)) {
                m28110A();
                final File file = new File(v2Var.m25202d());
                this.f14518u = false;
                int i2 = 3;
                if (C7888N.isOpusFile(file.getAbsolutePath()) == 1) {
                    synchronized (this.f14512o) {
                        this.f14507j = 3;
                        final Semaphore semaphore = new Semaphore(0);
                        final Boolean[] boolArr = new Boolean[1];
                        this.f14515r.m28052e(new Runnable() {
                            @Override
                            public final void run() {
                                C4378j.m28104G(boolArr, file, semaphore);
                            }
                        }, 0L);
                        semaphore.acquire();
                        if (!boolArr[0].booleanValue()) {
                            return false;
                        }
                        this.f14505h = C7888N.getTotalPcmDuration();
                        AudioTrack audioTrack = new AudioTrack(this.f14518u ? 0 : 3, 48000, 4, 2, this.f14503f, 1);
                        this.f14500c = audioTrack;
                        audioTrack.setStereoVolume(1.0f, 1.0f);
                        this.f14500c.setPlaybackPositionUpdateListener(new C4379a());
                        this.f14500c.play();
                        m28093R();
                    }
                } else {
                    try {
                        MediaPlayer mediaPlayer = new MediaPlayer();
                        this.f14499b = mediaPlayer;
                        if (this.f14518u) {
                            i2 = 0;
                        }
                        mediaPlayer.setAudioStreamType(i2);
                        this.f14499b.setDataSource(file.getAbsolutePath());
                        this.f14499b.prepare();
                        this.f14499b.start();
                        this.f14499b.setOnCompletionListener(this);
                        m28093R();
                    } catch (Throwable th) {
                        Log.m14723e(th);
                        MediaPlayer mediaPlayer2 = this.f14499b;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                            this.f14499b = null;
                            this.f14498a = false;
                            this.f14502e = null;
                        }
                    }
                }
                this.f14498a = false;
                this.f14501d = 0;
                this.f14506i = 0L;
                this.f14502e = v2Var;
                MediaPlayer mediaPlayer3 = this.f14499b;
                if (mediaPlayer3 != null) {
                    try {
                        if (i > 0) {
                            mediaPlayer3.seekTo(i);
                        } else if (v2Var.m25201e() != 0.0f) {
                            this.f14499b.seekTo((int) (this.f14499b.getDuration() * this.f14502e.m25201e()));
                        }
                    } catch (Throwable th2) {
                        this.f14502e.m25197i(0.0f, 0);
                        Log.m14725e("Cannot seek audio", th2, new Object[0]);
                    }
                } else if (this.f14500c != null) {
                    if (v2Var.m25201e() == 1.0f) {
                        this.f14502e.m25197i(0.0f, 0);
                    }
                    this.f14515r.m28052e(new Runnable() {
                        @Override
                        public final void run() {
                            C4378j.this.m28103H(i);
                        }
                    }, 0L);
                }
                return true;
            }
            if (this.f14498a) {
                m28097N(v2Var);
            }
            return true;
        }
        return false;
    }

    public boolean m28097N(C4812v2 v2Var) {
        C4812v2 v2Var2;
        if (!((this.f14500c == null && this.f14499b == null) || v2Var == null || (v2Var2 = this.f14502e) == null || !v2Var2.m25205a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f14499b;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                } else {
                    AudioTrack audioTrack = this.f14500c;
                    if (audioTrack != null) {
                        audioTrack.play();
                        m28064z();
                    }
                }
                this.f14498a = false;
                m28093R();
                return true;
            } catch (Throwable th) {
                Log.m14723e(th);
            }
        }
        return false;
    }

    public final void m28096O(final float f) {
        long j = this.f14505h;
        if (((float) j) * f != ((float) j)) {
            if (!this.f14498a) {
                this.f14500c.pause();
            }
            this.f14500c.flush();
            this.f14515r.m28052e(new Runnable() {
                @Override
                public final void run() {
                    C4378j.this.m28101J(f);
                }
            }, 0L);
        }
    }

    public boolean m28095P(C4812v2 v2Var, float f) {
        C4812v2 v2Var2;
        if (!((this.f14500c == null && this.f14499b == null) || v2Var == null || (v2Var2 = this.f14502e) == null || !v2Var2.m25205a(v2Var))) {
            try {
                MediaPlayer mediaPlayer = this.f14499b;
                if (mediaPlayer != null) {
                    int duration = (int) (mediaPlayer.getDuration() * f);
                    this.f14499b.seekTo(duration);
                    this.f14501d = duration;
                } else if (this.f14500c != null) {
                    m28096O(f);
                }
                if (this.f14498a) {
                    this.f14502e.m25197i(f, this.f14501d / 1000);
                    return true;
                }
                m28093R();
                return true;
            } catch (Throwable th) {
                Log.m14725e("Cannot seek audio player", th, new Object[0]);
            }
        }
        return false;
    }

    public void m28094Q(C4812v2 v2Var, boolean z) {
        C4812v2 v2Var2;
        if (this.f14499b != null && (v2Var2 = this.f14502e) != null && v2Var != null && v2Var2.m25205a(v2Var)) {
            this.f14499b.setLooping(z);
        }
    }

    public void m28093R() {
        AbstractRunnableC5910b bVar = this.f14519v;
        if (bVar != null) {
            bVar.m21857c();
            this.f14519v = null;
        }
        this.f14519v = new C4380b();
        synchronized (this.f14513p) {
            if (this.f14519v.m21856d()) {
                C4356b0.m28201k().m28194r(this.f14519v, 40);
            }
        }
    }

    public void m28092S() {
        AudioTrack audioTrack = this.f14500c;
        if ((audioTrack != null || this.f14499b != null) && this.f14502e != null) {
            try {
                MediaPlayer mediaPlayer = this.f14499b;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                } else {
                    audioTrack.pause();
                    this.f14500c.flush();
                }
            } catch (Throwable th) {
                Log.m14723e(th);
            }
            try {
                MediaPlayer mediaPlayer2 = this.f14499b;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    this.f14499b = null;
                } else if (this.f14500c != null) {
                    synchronized (this.f14512o) {
                        this.f14500c.release();
                        this.f14500c = null;
                    }
                }
            } catch (Throwable th2) {
                Log.m14723e(th2);
            }
            m28091T();
            C4812v2 v2Var = this.f14502e;
            if (v2Var != null) {
                try {
                    v2Var.m25198h(false);
                    this.f14502e.m25197i(0.0f, 0);
                } catch (Throwable th3) {
                    Log.m14723e(th3);
                }
            }
            this.f14502e = null;
            this.f14498a = false;
        }
    }

    public void m28091T() {
        synchronized (this.f14513p) {
            AbstractRunnableC5910b bVar = this.f14519v;
            if (bVar != null) {
                bVar.m21857c();
            }
        }
    }

    public void m28090U() {
        C4812v2 v2Var = this.f14502e;
        if (v2Var != null && v2Var.m25200f() && this.f14502e.m25204b() != 0) {
            m28092S();
        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (mediaPlayer.isLooping()) {
            this.f14516s++;
        } else {
            C4356b0.m28201k().m28195q(RunnableC4372h.f14482a);
        }
    }

    public void m28066x(boolean z) {
        C4812v2 v2Var = this.f14502e;
        boolean z2 = this.f14498a;
        if (v2Var == null) {
            return;
        }
        if ((this.f14499b == null && this.f14500c == null) || !z) {
            return;
        }
        if (!this.f14518u) {
            int i = this.f14501d;
            m28092S();
            m28098M(v2Var, i, true);
            if (z2) {
                m28100K(this.f14502e);
            }
        } else if (z2) {
            m28099L(v2Var);
        }
    }

    public final void m28065y() {
        this.f14515r.m28052e(new Runnable() {
            @Override
            public final void run() {
                C4378j.this.m28108C();
            }
        }, 0L);
    }

    public final void m28064z() {
        this.f14514q.m28052e(new Runnable() {
            @Override
            public final void run() {
                C4378j.this.m28106E();
            }
        }, 0L);
    }
}
