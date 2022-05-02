package p199o3;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1234w;
import p174m3.C6600g1;
import p174m3.C6613h2;
import p199o3.AbstractC7611g;
import p199o3.AbstractC7636t;
import p199o3.C7645w;

public final class C7585b0 implements AbstractC7636t {
    public static boolean f24235a0 = false;
    public long f24236A;
    public long f24237B;
    public long f24238C;
    public int f24239D;
    public boolean f24240E;
    public boolean f24241F;
    public long f24242G;
    public float f24243H;
    public AbstractC7611g[] f24244I;
    public ByteBuffer[] f24245J;
    public ByteBuffer f24246K;
    public int f24247L;
    public ByteBuffer f24248M;
    public byte[] f24249N;
    public int f24250O;
    public int f24251P;
    public boolean f24252Q;
    public boolean f24253R;
    public boolean f24254S;
    public boolean f24255T;
    public int f24256U;
    public C7647x f24257V;
    public boolean f24258W;
    public long f24259X;
    public boolean f24260Y;
    public boolean f24261Z;
    public final C7606f f24262a;
    public final AbstractC7587b f24263b;
    public final boolean f24264c;
    public final C7649z f24265d;
    public final C7627m0 f24266e;
    public final AbstractC7611g[] f24267f;
    public final AbstractC7611g[] f24268g;
    public final ConditionVariable f24269h;
    public final C7645w f24270i;
    public final ArrayDeque<C7591f> f24271j;
    public final boolean f24272k;
    public final int f24273l;
    public C7594i f24274m;
    public final C7592g<AbstractC7636t.C7638b> f24275n;
    public final C7592g<AbstractC7636t.C7641e> f24276o;
    public AbstractC7636t.AbstractC7639c f24277p;
    public C7588c f24278q;
    public C7588c f24279r;
    public AudioTrack f24280s;
    public C7602e f24281t;
    public C7591f f24282u;
    public C7591f f24283v;
    public C6613h2 f24284w;
    public ByteBuffer f24285x;
    public int f24286y;
    public long f24287z;

    public class C7586a extends Thread {
        public final AudioTrack f24288a;

        public C7586a(String str, AudioTrack audioTrack) {
            super(str);
            this.f24288a = audioTrack;
        }

        @Override
        public void run() {
            try {
                this.f24288a.flush();
                this.f24288a.release();
            } finally {
                C7585b0.this.f24269h.open();
            }
        }
    }

    public interface AbstractC7587b {
        C6613h2 mo15558a(C6613h2 h2Var);

        long mo15557b(long j);

        long mo15556c();

        boolean mo15555d(boolean z);

        AbstractC7611g[] mo15554e();
    }

    public static final class C7588c {
        public final C6600g1 f24290a;
        public final int f24291b;
        public final int f24292c;
        public final int f24293d;
        public final int f24294e;
        public final int f24295f;
        public final int f24296g;
        public final int f24297h;
        public final AbstractC7611g[] f24298i;

        public C7588c(C6600g1 g1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, AbstractC7611g[] gVarArr) {
            this.f24290a = g1Var;
            this.f24291b = i;
            this.f24292c = i2;
            this.f24293d = i3;
            this.f24294e = i4;
            this.f24295f = i5;
            this.f24296g = i6;
            this.f24298i = gVarArr;
            this.f24297h = m15571c(i7, z);
        }

        public static AudioAttributes m15564j(C7602e eVar, boolean z) {
            if (z) {
                return m15563k();
            }
            return eVar.m15535b();
        }

        public static AudioAttributes m15563k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack m15573a(boolean z, C7602e eVar, int i) {
            try {
                AudioTrack d = m15570d(z, eVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new AbstractC7636t.C7638b(state, this.f24294e, this.f24295f, this.f24297h, this.f24290a, m15559o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AbstractC7636t.C7638b(0, this.f24294e, this.f24295f, this.f24297h, this.f24290a, m15559o(), e);
            }
        }

        public boolean m15572b(C7588c cVar) {
            return cVar.f24292c == this.f24292c && cVar.f24296g == this.f24296g && cVar.f24294e == this.f24294e && cVar.f24295f == this.f24295f && cVar.f24293d == this.f24293d;
        }

        public final int m15571c(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.f24292c;
            if (i2 == 0) {
                return m15561m(z ? 8.0f : 1.0f);
            } else if (i2 == 1) {
                return m15562l(50000000L);
            } else {
                if (i2 == 2) {
                    return m15562l(250000L);
                }
                throw new IllegalStateException();
            }
        }

        public final AudioTrack m15570d(boolean z, C7602e eVar, int i) {
            int i2 = C1216l0.f4526a;
            if (i2 >= 29) {
                return m15568f(z, eVar, i);
            }
            if (i2 >= 21) {
                return m15569e(z, eVar, i);
            }
            return m15567g(eVar, i);
        }

        public final AudioTrack m15569e(boolean z, C7602e eVar, int i) {
            return new AudioTrack(m15564j(eVar, z), C7585b0.m15610M(this.f24294e, this.f24295f, this.f24296g), this.f24297h, 1, i);
        }

        public final AudioTrack m15568f(boolean z, C7602e eVar, int i) {
            AudioFormat M = C7585b0.m15610M(this.f24294e, this.f24295f, this.f24296g);
            AudioAttributes j = m15564j(eVar, z);
            boolean z2 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(j).setAudioFormat(M).setTransferMode(1).setBufferSizeInBytes(this.f24297h).setSessionId(i);
            if (this.f24292c != 1) {
                z2 = false;
            }
            return sessionId.setOffloadedPlayback(z2).build();
        }

        public final AudioTrack m15567g(C7602e eVar, int i) {
            int Y = C1216l0.m37988Y(eVar.f24332c);
            if (i == 0) {
                return new AudioTrack(Y, this.f24294e, this.f24295f, this.f24296g, this.f24297h, 1);
            }
            return new AudioTrack(Y, this.f24294e, this.f24295f, this.f24296g, this.f24297h, 1, i);
        }

        public long m15566h(long j) {
            return (j * this.f24294e) / 1000000;
        }

        public long m15565i(long j) {
            return (j * 1000000) / this.f24294e;
        }

        public final int m15562l(long j) {
            int S = C7585b0.m15604S(this.f24296g);
            if (this.f24296g == 5) {
                S *= 2;
            }
            return (int) ((j * S) / 1000000);
        }

        public final int m15561m(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f24294e, this.f24295f, this.f24296g);
            C1186a.m38184f(minBufferSize != -2);
            int p = C1216l0.m37956p(minBufferSize * 4, ((int) m15566h(250000L)) * this.f24293d, Math.max(minBufferSize, ((int) m15566h(750000L)) * this.f24293d));
            return f != 1.0f ? Math.round(p * f) : p;
        }

        public long m15560n(long j) {
            return (j * 1000000) / this.f24290a.f20592i0;
        }

        public boolean m15559o() {
            return this.f24292c == 1;
        }
    }

    public static class C7589d implements AbstractC7587b {
        public final AbstractC7611g[] f24299a;
        public final C7621j0 f24300b;
        public final C7625l0 f24301c;

        public C7589d(AbstractC7611g... gVarArr) {
            this(gVarArr, new C7621j0(), new C7625l0());
        }

        @Override
        public C6613h2 mo15558a(C6613h2 h2Var) {
            this.f24301c.m15430j(h2Var.f20671a);
            this.f24301c.m15431i(h2Var.f20672b);
            return h2Var;
        }

        @Override
        public long mo15557b(long j) {
            return this.f24301c.m15432h(j);
        }

        @Override
        public long mo15556c() {
            return this.f24300b.m15463q();
        }

        @Override
        public boolean mo15555d(boolean z) {
            this.f24300b.m15457w(z);
            return z;
        }

        @Override
        public AbstractC7611g[] mo15554e() {
            return this.f24299a;
        }

        public C7589d(AbstractC7611g[] gVarArr, C7621j0 j0Var, C7625l0 l0Var) {
            AbstractC7611g[] gVarArr2 = new AbstractC7611g[gVarArr.length + 2];
            this.f24299a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f24300b = j0Var;
            this.f24301c = l0Var;
            gVarArr2[gVarArr.length] = j0Var;
            gVarArr2[gVarArr.length + 1] = l0Var;
        }
    }

    public static final class C7590e extends RuntimeException {
        public C7590e(String str, C7586a aVar) {
            this(str);
        }

        public C7590e(String str) {
            super(str);
        }
    }

    public static final class C7591f {
        public final C6613h2 f24302a;
        public final boolean f24303b;
        public final long f24304c;
        public final long f24305d;

        public C7591f(C6613h2 h2Var, boolean z, long j, long j2, C7586a aVar) {
            this(h2Var, z, j, j2);
        }

        public C7591f(C6613h2 h2Var, boolean z, long j, long j2) {
            this.f24302a = h2Var;
            this.f24303b = z;
            this.f24304c = j;
            this.f24305d = j2;
        }
    }

    public static final class C7592g<T extends Exception> {
        public final long f24306a;
        public T f24307b;
        public long f24308c;

        public C7592g(long j) {
            this.f24306a = j;
        }

        public void m15553a() {
            this.f24307b = null;
        }

        public void m15552b(T t) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f24307b == null) {
                this.f24307b = t;
                this.f24308c = this.f24306a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f24308c) {
                T t2 = this.f24307b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f24307b;
                m15553a();
                throw t3;
            }
        }
    }

    public final class C7593h implements C7645w.AbstractC7646a {
        public C7593h() {
        }

        @Override
        public void mo15319a(int i, long j) {
            if (C7585b0.this.f24277p != null) {
                C7585b0.this.f24277p.mo15359c(i, j, SystemClock.elapsedRealtime() - C7585b0.this.f24259X);
            }
        }

        @Override
        public void mo15318b(long j) {
            if (C7585b0.this.f24277p != null) {
                C7585b0.this.f24277p.mo15360b(j);
            }
        }

        @Override
        public void mo15317c(long j) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j);
            C1230s.m37881i("DefaultAudioSink", sb2.toString());
        }

        @Override
        public void mo15316d(long j, long j2, long j3, long j4) {
            long W = C7585b0.this.m15600W();
            long X = C7585b0.this.m15599X();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(j2);
            sb2.append(", ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(j4);
            sb2.append(", ");
            sb2.append(W);
            sb2.append(", ");
            sb2.append(X);
            String sb3 = sb2.toString();
            if (!C7585b0.f24235a0) {
                C1230s.m37881i("DefaultAudioSink", sb3);
                return;
            }
            throw new C7590e(sb3, null);
        }

        @Override
        public void mo15315e(long j, long j2, long j3, long j4) {
            long W = C7585b0.this.m15600W();
            long X = C7585b0.this.m15599X();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(j2);
            sb2.append(", ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(j4);
            sb2.append(", ");
            sb2.append(W);
            sb2.append(", ");
            sb2.append(X);
            String sb3 = sb2.toString();
            if (!C7585b0.f24235a0) {
                C1230s.m37881i("DefaultAudioSink", sb3);
                return;
            }
            throw new C7590e(sb3, null);
        }

        public C7593h(C7585b0 b0Var, C7586a aVar) {
            this();
        }
    }

    public final class C7594i {
        public final Handler f24310a = new Handler();
        public final AudioTrack.StreamEventCallback f24311b;

        public class C7595a extends AudioTrack.StreamEventCallback {
            public final C7585b0 f24313a;

            public C7595a(C7585b0 b0Var) {
                this.f24313a = b0Var;
            }

            @Override
            public void onDataRequest(AudioTrack audioTrack, int i) {
                C1186a.m38184f(audioTrack == C7585b0.this.f24280s);
                if (C7585b0.this.f24277p != null && C7585b0.this.f24254S) {
                    C7585b0.this.f24277p.mo15355g();
                }
            }

            @Override
            public void onTearDown(AudioTrack audioTrack) {
                C1186a.m38184f(audioTrack == C7585b0.this.f24280s);
                if (C7585b0.this.f24277p != null && C7585b0.this.f24254S) {
                    C7585b0.this.f24277p.mo15355g();
                }
            }
        }

        public C7594i() {
            this.f24311b = new C7595a(C7585b0.this);
        }

        public void m15551a(AudioTrack audioTrack) {
            final Handler handler = this.f24310a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() {
                @Override
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f24311b);
        }

        public void m15550b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f24311b);
            this.f24310a.removeCallbacksAndMessages(null);
        }
    }

    public C7585b0(C7606f fVar, AbstractC7611g[] gVarArr) {
        this(fVar, gVarArr, false);
    }

    public static AudioFormat m15610M(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int m15608O(int i) {
        int i2 = C1216l0.f4526a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(C1216l0.f4527b) && i == 1) {
            i = 2;
        }
        return C1216l0.m38015D(i);
    }

    public static Pair<Integer, Integer> m15607P(C6600g1 g1Var, C7606f fVar) {
        if (fVar == null) {
            return null;
        }
        int c = C1234w.m37868c((String) C1186a.m38185e(g1Var.f20575U), g1Var.f20572R);
        int i = 6;
        if (!(c == 5 || c == 6 || c == 18 || c == 17 || c == 7 || c == 8 || c == 14)) {
            return null;
        }
        if (c == 18 && !fVar.m15521f(18)) {
            c = 6;
        } else if (c == 8 && !fVar.m15521f(8)) {
            c = 7;
        }
        if (!fVar.m15521f(c)) {
            return null;
        }
        if (c != 18) {
            i = g1Var.f20591h0;
            if (i > fVar.m15522e()) {
                return null;
            }
        } else if (C1216l0.f4526a >= 29 && (i = m15605R(18, g1Var.f20592i0)) == 0) {
            C1230s.m37881i("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int O = m15608O(i);
        if (O == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(c), Integer.valueOf(O));
    }

    public static int m15606Q(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C7582b.m15628d(byteBuffer);
            case 7:
            case 8:
                return C7601d0.m15539e(byteBuffer);
            case 9:
                int m = C7614g0.m15474m(C1216l0.m38013E(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return Log.TAG_CAMERA;
            case 11:
            case 12:
                return Log.TAG_VOICE;
            case 13:
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unexpected audio encoding: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            case 14:
                int a = C7582b.m15631a(byteBuffer);
                if (a == -1) {
                    return 0;
                }
                return C7582b.m15624h(byteBuffer, a) * 16;
            case 15:
                return Log.TAG_GIF_LOADER;
            case 16:
                return Log.TAG_CAMERA;
            case 17:
                return C7596c.m15547c(byteBuffer);
        }
    }

    public static int m15605R(int i, int i2) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(C1216l0.m38015D(i3)).build(), build)) {
                return i3;
            }
        }
        return 0;
    }

    public static int m15604S(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    public static boolean m15597Z(int i) {
        return (C1216l0.f4526a >= 24 && i == -6) || i == -32;
    }

    public static boolean m15595b0(AudioTrack audioTrack) {
        return C1216l0.f4526a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean m15594c0(C6600g1 g1Var, C7606f fVar) {
        return m15607P(g1Var, fVar) != null;
    }

    public static void m15585l0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void m15584m0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    public static int m15578s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    public final void m15616G(long j) {
        C6613h2 h2Var;
        if (m15582o0()) {
            h2Var = this.f24263b.mo15558a(m15609N());
        } else {
            h2Var = C6613h2.f20669M;
        }
        C6613h2 h2Var2 = h2Var;
        boolean d = m15582o0() ? this.f24263b.mo15555d(m15601V()) : false;
        this.f24271j.add(new C7591f(h2Var2, d, Math.max(0L, j), this.f24279r.m15565i(m15599X()), null));
        m15583n0();
        AbstractC7636t.AbstractC7639c cVar = this.f24277p;
        if (cVar != null) {
            cVar.mo15361a(d);
        }
    }

    public final long m15615H(long j) {
        while (!this.f24271j.isEmpty() && j >= this.f24271j.getFirst().f24305d) {
            this.f24283v = this.f24271j.remove();
        }
        C7591f fVar = this.f24283v;
        long j2 = j - fVar.f24305d;
        if (fVar.f24302a.equals(C6613h2.f20669M)) {
            return this.f24283v.f24304c + j2;
        }
        if (this.f24271j.isEmpty()) {
            return this.f24283v.f24304c + this.f24263b.mo15557b(j2);
        }
        C7591f first = this.f24271j.getFirst();
        return first.f24304c - C1216l0.m37994S(first.f24305d - j, this.f24283v.f24302a.f20671a);
    }

    public final long m15614I(long j) {
        return j + this.f24279r.m15565i(this.f24263b.mo15556c());
    }

    public final AudioTrack m15613J() {
        try {
            return ((C7588c) C1186a.m38185e(this.f24279r)).m15573a(this.f24258W, this.f24281t, this.f24256U);
        } catch (AbstractC7636t.C7638b e) {
            m15593d0();
            AbstractC7636t.AbstractC7639c cVar = this.f24277p;
            if (cVar != null) {
                cVar.mo15356f(e);
            }
            throw e;
        }
    }

    public final boolean m15612K() {
        throw new UnsupportedOperationException("Method not decompiled: p199o3.C7585b0.m15612K():boolean");
    }

    public final void m15611L() {
        int i = 0;
        while (true) {
            AbstractC7611g[] gVarArr = this.f24244I;
            if (i < gVarArr.length) {
                AbstractC7611g gVar = gVarArr[i];
                gVar.flush();
                this.f24245J[i] = gVar.mo15314a();
                i++;
            } else {
                return;
            }
        }
    }

    public final C6613h2 m15609N() {
        return m15603T().f24302a;
    }

    public final C7591f m15603T() {
        C7591f fVar = this.f24282u;
        if (fVar != null) {
            return fVar;
        }
        if (!this.f24271j.isEmpty()) {
            return this.f24271j.getLast();
        }
        return this.f24283v;
    }

    @SuppressLint({"WrongConstant"})
    public final int m15602U(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = C1216l0.f4526a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (i != 30 || !C1216l0.f4529d.startsWith("Pixel")) ? 1 : 2;
    }

    public boolean m15601V() {
        return m15603T().f24303b;
    }

    public final long m15600W() {
        C7588c cVar = this.f24279r;
        if (cVar.f24292c == 0) {
            return this.f24287z / cVar.f24291b;
        }
        return this.f24236A;
    }

    public final long m15599X() {
        C7588c cVar = this.f24279r;
        if (cVar.f24292c == 0) {
            return this.f24237B / cVar.f24293d;
        }
        return this.f24238C;
    }

    public final void m15598Y() {
        this.f24269h.block();
        AudioTrack J = m15613J();
        this.f24280s = J;
        if (m15595b0(J)) {
            m15590g0(this.f24280s);
            if (this.f24273l != 3) {
                AudioTrack audioTrack = this.f24280s;
                C6600g1 g1Var = this.f24279r.f24290a;
                audioTrack.setOffloadDelayPadding(g1Var.f20594k0, g1Var.f20595l0);
            }
        }
        this.f24256U = this.f24280s.getAudioSessionId();
        C7645w wVar = this.f24270i;
        AudioTrack audioTrack2 = this.f24280s;
        C7588c cVar = this.f24279r;
        wVar.m15322t(audioTrack2, cVar.f24292c == 2, cVar.f24296g, cVar.f24293d, cVar.f24297h);
        m15586k0();
        int i = this.f24257V.f24511a;
        if (i != 0) {
            this.f24280s.attachAuxEffect(i);
            this.f24280s.setAuxEffectSendLevel(this.f24257V.f24512b);
        }
        this.f24241F = true;
    }

    @Override
    public boolean mo15384a(C6600g1 g1Var) {
        return mo15374k(g1Var) != 0;
    }

    public final boolean m15596a0() {
        return this.f24280s != null;
    }

    @Override
    public void mo15383b() {
        this.f24254S = false;
        if (m15596a0() && this.f24270i.m15325q()) {
            this.f24280s.pause();
        }
    }

    @Override
    public void mo15382c() {
        flush();
        for (AbstractC7611g gVar : this.f24267f) {
            gVar.mo15313c();
        }
        for (AbstractC7611g gVar2 : this.f24268g) {
            gVar2.mo15313c();
        }
        this.f24254S = false;
        this.f24260Y = false;
    }

    @Override
    public void mo15381d(C6613h2 h2Var) {
        C6613h2 h2Var2 = new C6613h2(C1216l0.m37958o(h2Var.f20671a, 0.1f, 8.0f), C1216l0.m37958o(h2Var.f20672b, 0.1f, 8.0f));
        if (!this.f24272k || C1216l0.f4526a < 23) {
            m15588i0(h2Var2, m15601V());
        } else {
            m15587j0(h2Var2);
        }
    }

    public final void m15593d0() {
        if (this.f24279r.m15559o()) {
            this.f24260Y = true;
        }
    }

    @Override
    public boolean mo15380e() {
        return !m15596a0() || (this.f24252Q && !mo15376i());
    }

    public final void m15592e0() {
        if (!this.f24253R) {
            this.f24253R = true;
            this.f24270i.m15334h(m15599X());
            this.f24280s.stop();
            this.f24286y = 0;
        }
    }

    @Override
    public void mo15379f(float f) {
        if (this.f24243H != f) {
            this.f24243H = f;
            m15586k0();
        }
    }

    public final void m15591f0(long j) {
        ByteBuffer byteBuffer;
        int length = this.f24244I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f24245J[i - 1];
            } else {
                byteBuffer = this.f24246K;
                if (byteBuffer == null) {
                    byteBuffer = AbstractC7611g.f24356a;
                }
            }
            if (i == length) {
                m15579r0(byteBuffer, j);
            } else {
                AbstractC7611g gVar = this.f24244I[i];
                if (i > this.f24251P) {
                    gVar.mo15305b(byteBuffer);
                }
                ByteBuffer a = gVar.mo15314a();
                this.f24245J[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    @Override
    public void flush() {
        if (m15596a0()) {
            m15589h0();
            if (this.f24270i.m15332j()) {
                this.f24280s.pause();
            }
            if (m15595b0(this.f24280s)) {
                ((C7594i) C1186a.m38185e(this.f24274m)).m15550b(this.f24280s);
            }
            AudioTrack audioTrack = this.f24280s;
            this.f24280s = null;
            if (C1216l0.f4526a < 21 && !this.f24255T) {
                this.f24256U = 0;
            }
            C7588c cVar = this.f24278q;
            if (cVar != null) {
                this.f24279r = cVar;
                this.f24278q = null;
            }
            this.f24270i.m15324r();
            this.f24269h.close();
            new C7586a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f24276o.m15553a();
        this.f24275n.m15553a();
    }

    @Override
    public void mo15378g() {
        this.f24254S = true;
        if (m15596a0()) {
            this.f24270i.m15320v();
            this.f24280s.play();
        }
    }

    public final void m15590g0(AudioTrack audioTrack) {
        if (this.f24274m == null) {
            this.f24274m = new C7594i();
        }
        this.f24274m.m15551a(audioTrack);
    }

    @Override
    public void mo15377h() {
        if (!this.f24252Q && m15596a0() && m15612K()) {
            m15592e0();
            this.f24252Q = true;
        }
    }

    public final void m15589h0() {
        this.f24287z = 0L;
        this.f24236A = 0L;
        this.f24237B = 0L;
        this.f24238C = 0L;
        this.f24261Z = false;
        this.f24239D = 0;
        this.f24283v = new C7591f(m15609N(), m15601V(), 0L, 0L, null);
        this.f24242G = 0L;
        this.f24282u = null;
        this.f24271j.clear();
        this.f24246K = null;
        this.f24247L = 0;
        this.f24248M = null;
        this.f24253R = false;
        this.f24252Q = false;
        this.f24251P = -1;
        this.f24285x = null;
        this.f24286y = 0;
        this.f24266e.m15428o();
        m15611L();
    }

    @Override
    public boolean mo15376i() {
        return m15596a0() && this.f24270i.m15333i(m15599X());
    }

    public final void m15588i0(C6613h2 h2Var, boolean z) {
        C7591f T = m15603T();
        if (!h2Var.equals(T.f24302a) || z != T.f24303b) {
            C7591f fVar = new C7591f(h2Var, z, -9223372036854775807L, -9223372036854775807L, null);
            if (m15596a0()) {
                this.f24282u = fVar;
            } else {
                this.f24283v = fVar;
            }
        }
    }

    @Override
    public C6613h2 mo15375j() {
        if (this.f24272k) {
            return this.f24284w;
        }
        return m15609N();
    }

    public final void m15587j0(C6613h2 h2Var) {
        if (m15596a0()) {
            try {
                this.f24280s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2Var.f20671a).setPitch(h2Var.f20672b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C1230s.m37880j("DefaultAudioSink", "Failed to set playback params", e);
            }
            h2Var = new C6613h2(this.f24280s.getPlaybackParams().getSpeed(), this.f24280s.getPlaybackParams().getPitch());
            this.f24270i.m15321u(h2Var.f20671a);
        }
        this.f24284w = h2Var;
    }

    @Override
    public int mo15374k(C6600g1 g1Var) {
        if (!"audio/raw".equals(g1Var.f20575U)) {
            return ((this.f24260Y || !m15580q0(g1Var, this.f24281t)) && !m15594c0(g1Var, this.f24262a)) ? 0 : 2;
        }
        if (!C1216l0.m37969i0(g1Var.f20593j0)) {
            int i = g1Var.f20593j0;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Invalid PCM encoding: ");
            sb2.append(i);
            C1230s.m37881i("DefaultAudioSink", sb2.toString());
            return 0;
        }
        int i2 = g1Var.f20593j0;
        return (i2 == 2 || (this.f24264c && i2 == 4)) ? 2 : 1;
    }

    public final void m15586k0() {
        if (m15596a0()) {
            if (C1216l0.f4526a >= 21) {
                m15585l0(this.f24280s, this.f24243H);
            } else {
                m15584m0(this.f24280s, this.f24243H);
            }
        }
    }

    @Override
    public void mo15373l(AbstractC7636t.AbstractC7639c cVar) {
        this.f24277p = cVar;
    }

    @Override
    public void mo15372m(int i) {
        if (this.f24256U != i) {
            this.f24256U = i;
            this.f24255T = i != 0;
            flush();
        }
    }

    @Override
    public long mo15371n(boolean z) {
        if (!m15596a0() || this.f24241F) {
            return Long.MIN_VALUE;
        }
        return m15614I(m15615H(Math.min(this.f24270i.m15338d(z), this.f24279r.m15565i(m15599X()))));
    }

    public final void m15583n0() {
        AbstractC7611g[] gVarArr = this.f24279r.f24298i;
        ArrayList arrayList = new ArrayList();
        for (AbstractC7611g gVar : gVarArr) {
            if (gVar.mo15310f()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.f24244I = (AbstractC7611g[]) arrayList.toArray(new AbstractC7611g[size]);
        this.f24245J = new ByteBuffer[size];
        m15611L();
    }

    @Override
    public void mo15370o() {
        if (this.f24258W) {
            this.f24258W = false;
            flush();
        }
    }

    public final boolean m15582o0() {
        return !this.f24258W && "audio/raw".equals(this.f24279r.f24290a.f20575U) && !m15581p0(this.f24279r.f24290a.f20593j0);
    }

    @Override
    public void mo15369p() {
        this.f24240E = true;
    }

    public final boolean m15581p0(int i) {
        return this.f24264c && C1216l0.m37971h0(i);
    }

    @Override
    public void mo15368q(C7602e eVar) {
        if (!this.f24281t.equals(eVar)) {
            this.f24281t = eVar;
            if (!this.f24258W) {
                flush();
            }
        }
    }

    public final boolean m15580q0(C6600g1 g1Var, C7602e eVar) {
        int c;
        int D;
        int U;
        if (C1216l0.f4526a < 29 || this.f24273l == 0 || (c = C1234w.m37868c((String) C1186a.m38185e(g1Var.f20575U), g1Var.f20572R)) == 0 || (D = C1216l0.m38015D(g1Var.f20591h0)) == 0 || (U = m15602U(m15610M(g1Var.f20592i0, D, c), eVar.m15535b())) == 0) {
            return false;
        }
        if (U == 1) {
            return !(g1Var.f20594k0 != 0 || g1Var.f20595l0 != 0) || !(this.f24273l == 1);
        } else if (U == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void mo15367r(C7647x xVar) {
        if (!this.f24257V.equals(xVar)) {
            int i = xVar.f24511a;
            float f = xVar.f24512b;
            AudioTrack audioTrack = this.f24280s;
            if (audioTrack != null) {
                if (this.f24257V.f24511a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f24280s.setAuxEffectSendLevel(f);
                }
            }
            this.f24257V = xVar;
        }
    }

    public final void m15579r0(ByteBuffer byteBuffer, long j) {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f24248M;
            boolean z = true;
            if (byteBuffer2 != null) {
                C1186a.m38189a(byteBuffer2 == byteBuffer);
            } else {
                this.f24248M = byteBuffer;
                if (C1216l0.f4526a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f24249N;
                    if (bArr == null || bArr.length < remaining) {
                        this.f24249N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f24249N, 0, remaining);
                    byteBuffer.position(position);
                    this.f24250O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C1216l0.f4526a < 21) {
                int c = this.f24270i.m15339c(this.f24237B);
                if (c > 0) {
                    i = this.f24280s.write(this.f24249N, this.f24250O, Math.min(remaining2, c));
                    if (i > 0) {
                        this.f24250O += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f24258W) {
                C1186a.m38184f(j != -9223372036854775807L);
                i = m15577t0(this.f24280s, byteBuffer, remaining2, j);
            } else {
                i = m15578s0(this.f24280s, byteBuffer, remaining2);
            }
            this.f24259X = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean Z = m15597Z(i);
                if (Z) {
                    m15593d0();
                }
                AbstractC7636t.C7641e eVar = new AbstractC7636t.C7641e(i, this.f24279r.f24290a, Z);
                AbstractC7636t.AbstractC7639c cVar = this.f24277p;
                if (cVar != null) {
                    cVar.mo15356f(eVar);
                }
                if (!eVar.f24466b) {
                    this.f24276o.m15552b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f24276o.m15553a();
            if (m15595b0(this.f24280s)) {
                long j2 = this.f24238C;
                if (j2 > 0) {
                    this.f24261Z = false;
                }
                if (this.f24254S && this.f24277p != null && i < remaining2 && !this.f24261Z) {
                    this.f24277p.mo15358d(this.f24270i.m15337e(j2));
                }
            }
            int i2 = this.f24279r.f24292c;
            if (i2 == 0) {
                this.f24237B += i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.f24246K) {
                        z = false;
                    }
                    C1186a.m38184f(z);
                    this.f24238C += this.f24239D * this.f24247L;
                }
                this.f24248M = null;
            }
        }
    }

    @Override
    public void mo15366s() {
        C1186a.m38184f(C1216l0.f4526a >= 21);
        C1186a.m38184f(this.f24255T);
        if (!this.f24258W) {
            this.f24258W = true;
            flush();
        }
    }

    @Override
    public boolean mo15365t(ByteBuffer byteBuffer, long j, int i) {
        ByteBuffer byteBuffer2 = this.f24246K;
        C1186a.m38189a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f24278q != null) {
            if (!m15612K()) {
                return false;
            }
            if (!this.f24278q.m15572b(this.f24279r)) {
                m15592e0();
                if (mo15376i()) {
                    return false;
                }
                flush();
            } else {
                this.f24279r = this.f24278q;
                this.f24278q = null;
                if (m15595b0(this.f24280s) && this.f24273l != 3) {
                    this.f24280s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f24280s;
                    C6600g1 g1Var = this.f24279r.f24290a;
                    audioTrack.setOffloadDelayPadding(g1Var.f20594k0, g1Var.f20595l0);
                    this.f24261Z = true;
                }
            }
            m15616G(j);
        }
        if (!m15596a0()) {
            try {
                m15598Y();
            } catch (AbstractC7636t.C7638b e) {
                if (!e.f24461b) {
                    this.f24275n.m15552b(e);
                    return false;
                }
                throw e;
            }
        }
        this.f24275n.m15553a();
        if (this.f24241F) {
            this.f24242G = Math.max(0L, j);
            this.f24240E = false;
            this.f24241F = false;
            if (this.f24272k && C1216l0.f4526a >= 23) {
                m15587j0(this.f24284w);
            }
            m15616G(j);
            if (this.f24254S) {
                mo15378g();
            }
        }
        if (!this.f24270i.m15330l(m15599X())) {
            return false;
        }
        if (this.f24246K == null) {
            C1186a.m38189a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C7588c cVar = this.f24279r;
            if (cVar.f24292c != 0 && this.f24239D == 0) {
                int Q = m15606Q(cVar.f24296g, byteBuffer);
                this.f24239D = Q;
                if (Q == 0) {
                    return true;
                }
            }
            if (this.f24282u != null) {
                if (!m15612K()) {
                    return false;
                }
                m15616G(j);
                this.f24282u = null;
            }
            long n = this.f24242G + this.f24279r.m15560n(m15600W() - this.f24266e.m15429n());
            if (!this.f24240E && Math.abs(n - j) > 200000) {
                this.f24277p.mo15356f(new AbstractC7636t.C7640d(j, n));
                this.f24240E = true;
            }
            if (this.f24240E) {
                if (!m15612K()) {
                    return false;
                }
                long j2 = j - n;
                this.f24242G += j2;
                this.f24240E = false;
                m15616G(j);
                AbstractC7636t.AbstractC7639c cVar2 = this.f24277p;
                if (!(cVar2 == null || j2 == 0)) {
                    cVar2.mo15357e();
                }
            }
            if (this.f24279r.f24292c == 0) {
                this.f24287z += byteBuffer.remaining();
            } else {
                this.f24236A += this.f24239D * i;
            }
            this.f24246K = byteBuffer;
            this.f24247L = i;
        }
        m15591f0(j);
        if (!this.f24246K.hasRemaining()) {
            this.f24246K = null;
            this.f24247L = 0;
            return true;
        } else if (!this.f24270i.m15331k(m15599X())) {
            return false;
        } else {
            C1230s.m37881i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public final int m15577t0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (C1216l0.f4526a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f24285x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f24285x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f24285x.putInt(1431633921);
        }
        if (this.f24286y == 0) {
            this.f24285x.putInt(4, i);
            this.f24285x.putLong(8, j * 1000);
            this.f24285x.position(0);
            this.f24286y = i;
        }
        int remaining = this.f24285x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f24285x, remaining, 1);
            if (write < 0) {
                this.f24286y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int s0 = m15578s0(audioTrack, byteBuffer, i);
        if (s0 < 0) {
            this.f24286y = 0;
            return s0;
        }
        this.f24286y -= s0;
        return s0;
    }

    @Override
    public void mo15364u(C6600g1 g1Var, int i, int[] iArr) {
        AbstractC7611g[] gVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        AbstractC7611g[] gVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(g1Var.f20575U)) {
            C1186a.m38189a(C1216l0.m37969i0(g1Var.f20593j0));
            i7 = C1216l0.m37990W(g1Var.f20593j0, g1Var.f20591h0);
            if (m15581p0(g1Var.f20593j0)) {
                gVarArr2 = this.f24268g;
            } else {
                gVarArr2 = this.f24267f;
            }
            this.f24266e.m15427p(g1Var.f20594k0, g1Var.f20595l0);
            if (C1216l0.f4526a < 21 && g1Var.f20591h0 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f24265d.m15301n(iArr2);
            AbstractC7611g.C7612a aVar = new AbstractC7611g.C7612a(g1Var.f20592i0, g1Var.f20591h0, g1Var.f20593j0);
            for (AbstractC7611g gVar : gVarArr2) {
                try {
                    AbstractC7611g.C7612a g = gVar.mo15309g(aVar);
                    if (gVar.mo15310f()) {
                        aVar = g;
                    }
                } catch (AbstractC7611g.C7613b e) {
                    throw new AbstractC7636t.C7637a(e, g1Var);
                }
            }
            int i9 = aVar.f24360c;
            i4 = aVar.f24358a;
            i3 = C1216l0.m38015D(aVar.f24359b);
            i5 = C1216l0.m37990W(i9, aVar.f24359b);
            gVarArr = gVarArr2;
            i2 = i9;
            i6 = 0;
        } else {
            AbstractC7611g[] gVarArr3 = new AbstractC7611g[0];
            int i10 = g1Var.f20592i0;
            if (m15580q0(g1Var, this.f24281t)) {
                int c = C1234w.m37868c((String) C1186a.m38185e(g1Var.f20575U), g1Var.f20572R);
                i3 = C1216l0.m38015D(g1Var.f20591h0);
                gVarArr = gVarArr3;
                i2 = c;
                i7 = -1;
                i5 = -1;
                i4 = i10;
                i6 = 1;
            } else {
                Pair<Integer, Integer> P = m15607P(g1Var, this.f24262a);
                if (P != null) {
                    i2 = ((Integer) P.first).intValue();
                    i3 = ((Integer) P.second).intValue();
                    gVarArr = gVarArr3;
                    i7 = -1;
                    i5 = -1;
                    i4 = i10;
                    i6 = 2;
                } else {
                    String valueOf = String.valueOf(g1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new AbstractC7636t.C7637a(sb2.toString(), g1Var);
                }
            }
        }
        if (i2 == 0) {
            String valueOf2 = String.valueOf(g1Var);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i6);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new AbstractC7636t.C7637a(sb3.toString(), g1Var);
        } else if (i3 != 0) {
            this.f24260Y = false;
            C7588c cVar = new C7588c(g1Var, i7, i6, i5, i4, i3, i2, i, this.f24272k, gVarArr);
            if (m15596a0()) {
                this.f24278q = cVar;
            } else {
                this.f24279r = cVar;
            }
        } else {
            String valueOf3 = String.valueOf(g1Var);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 54);
            sb4.append("Invalid output channel config (mode=");
            sb4.append(i6);
            sb4.append(") for: ");
            sb4.append(valueOf3);
            throw new AbstractC7636t.C7637a(sb4.toString(), g1Var);
        }
    }

    @Override
    public void mo15363v() {
        if (C1216l0.f4526a < 25) {
            flush();
            return;
        }
        this.f24276o.m15553a();
        this.f24275n.m15553a();
        if (m15596a0()) {
            m15589h0();
            if (this.f24270i.m15332j()) {
                this.f24280s.pause();
            }
            this.f24280s.flush();
            this.f24270i.m15324r();
            C7645w wVar = this.f24270i;
            AudioTrack audioTrack = this.f24280s;
            C7588c cVar = this.f24279r;
            wVar.m15322t(audioTrack, cVar.f24292c == 2, cVar.f24296g, cVar.f24293d, cVar.f24297h);
            this.f24241F = true;
        }
    }

    @Override
    public void mo15362w(boolean z) {
        m15588i0(m15609N(), z);
    }

    public C7585b0(C7606f fVar, AbstractC7611g[] gVarArr, boolean z) {
        this(fVar, new C7589d(gVarArr), z, false, 0);
    }

    public C7585b0(C7606f fVar, AbstractC7587b bVar, boolean z, boolean z2, int i) {
        this.f24262a = fVar;
        this.f24263b = (AbstractC7587b) C1186a.m38185e(bVar);
        int i2 = C1216l0.f4526a;
        this.f24264c = i2 >= 21 && z;
        this.f24272k = i2 >= 23 && z2;
        this.f24273l = i2 < 29 ? 0 : i;
        this.f24269h = new ConditionVariable(true);
        this.f24270i = new C7645w(new C7593h(this, null));
        C7649z zVar = new C7649z();
        this.f24265d = zVar;
        C7627m0 m0Var = new C7627m0();
        this.f24266e = m0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C7619i0(), zVar, m0Var);
        Collections.addAll(arrayList, bVar.mo15554e());
        this.f24267f = (AbstractC7611g[]) arrayList.toArray(new AbstractC7611g[0]);
        this.f24268g = new AbstractC7611g[]{new C7605e0()};
        this.f24243H = 1.0f;
        this.f24281t = C7602e.f24326O;
        this.f24256U = 0;
        this.f24257V = new C7647x(0, 0.0f);
        C6613h2 h2Var = C6613h2.f20669M;
        this.f24283v = new C7591f(h2Var, false, 0L, 0L, null);
        this.f24284w = h2Var;
        this.f24251P = -1;
        this.f24244I = new AbstractC7611g[0];
        this.f24245J = new ByteBuffer[0];
        this.f24271j = new ArrayDeque<>();
        this.f24275n = new C7592g<>(100L);
        this.f24276o = new C7592g<>(100L);
    }
}
