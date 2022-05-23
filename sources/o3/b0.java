package o3;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import c5.l0;
import c5.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import m3.q1;
import m3.r2;
import n3.p1;
import o3.d0;
import o3.g;
import o3.t;
import o3.w;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;

public final class b0 implements t {
    public static boolean f18681c0 = false;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public o3.g[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public x X;
    public boolean Y;
    public long Z;
    public final o3.f f18682a;
    public boolean f18683a0;
    public final c f18684b;
    public boolean f18685b0;
    public final boolean f18686c;
    public final z f18687d;
    public final n0 f18688e;
    public final o3.g[] f18689f;
    public final o3.g[] f18690g;
    public final ConditionVariable f18691h;
    public final w f18692i;
    public final ArrayDeque<i> f18693j;
    public final boolean f18694k;
    public final int f18695l;
    public l f18696m;
    public final j<t.b> f18697n;
    public final j<t.e> f18698o;
    public final d f18699p;
    public p1 f18700q;
    public t.c f18701r;
    public f f18702s;
    public f f18703t;
    public AudioTrack f18704u;
    public o3.e f18705v;
    public i f18706w;
    public i f18707x;
    public r2 f18708y;
    public ByteBuffer f18709z;

    public class a extends Thread {
        public final AudioTrack f18710a;

        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f18710a = audioTrack;
        }

        @Override
        public void run() {
            try {
                this.f18710a.flush();
                this.f18710a.release();
            } finally {
                b0.this.f18691h.open();
            }
        }
    }

    public static final class b {
        public static void a(AudioTrack audioTrack, p1 p1Var) {
            LogSessionId a10 = p1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a10);
            }
        }
    }

    public interface c {
        r2 a(r2 r2Var);

        long b(long j10);

        long c();

        boolean d(boolean z10);

        o3.g[] e();
    }

    public interface d {
        public static final d f18712a = new d0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    public static final class e {
        public c f18714b;
        public boolean f18715c;
        public boolean f18716d;
        public o3.f f18713a = o3.f.f18775c;
        public int f18717e = 0;
        public d f18718f = d.f18712a;

        public b0 f() {
            if (this.f18714b == null) {
                this.f18714b = new g(new o3.g[0]);
            }
            return new b0(this, null);
        }

        public e g(o3.f fVar) {
            c5.a.e(fVar);
            this.f18713a = fVar;
            return this;
        }

        public e h(c cVar) {
            c5.a.e(cVar);
            this.f18714b = cVar;
            return this;
        }

        public e i(o3.g[] gVarArr) {
            c5.a.e(gVarArr);
            return h(new g(gVarArr));
        }

        public e j(boolean z10) {
            this.f18716d = z10;
            return this;
        }

        public e k(boolean z10) {
            this.f18715c = z10;
            return this;
        }

        public e l(int i10) {
            this.f18717e = i10;
            return this;
        }
    }

    public static final class f {
        public final q1 f18719a;
        public final int f18720b;
        public final int f18721c;
        public final int f18722d;
        public final int f18723e;
        public final int f18724f;
        public final int f18725g;
        public final int f18726h;
        public final o3.g[] f18727i;

        public f(q1 q1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, o3.g[] gVarArr) {
            this.f18719a = q1Var;
            this.f18720b = i10;
            this.f18721c = i11;
            this.f18722d = i12;
            this.f18723e = i13;
            this.f18724f = i14;
            this.f18725g = i15;
            this.f18726h = i16;
            this.f18727i = gVarArr;
        }

        public static AudioAttributes i(o3.e eVar, boolean z10) {
            if (z10) {
                return j();
            }
            return eVar.b();
        }

        public static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, o3.e eVar, int i10) {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new t.b(state, this.f18723e, this.f18724f, this.f18726h, this.f18719a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new t.b(0, this.f18723e, this.f18724f, this.f18726h, this.f18719a, l(), e10);
            }
        }

        public boolean b(f fVar) {
            return fVar.f18721c == this.f18721c && fVar.f18725g == this.f18725g && fVar.f18723e == this.f18723e && fVar.f18724f == this.f18724f && fVar.f18722d == this.f18722d;
        }

        public f c(int i10) {
            return new f(this.f18719a, this.f18720b, this.f18721c, this.f18722d, this.f18723e, this.f18724f, this.f18725g, i10, this.f18727i);
        }

        public final AudioTrack d(boolean z10, o3.e eVar, int i10) {
            int i11 = l0.f4841a;
            if (i11 >= 29) {
                return f(z10, eVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, eVar, i10);
            }
            return g(eVar, i10);
        }

        public final AudioTrack e(boolean z10, o3.e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), b0.N(this.f18723e, this.f18724f, this.f18725g), this.f18726h, 1, i10);
        }

        public final AudioTrack f(boolean z10, o3.e eVar, int i10) {
            AudioFormat N = b0.N(this.f18723e, this.f18724f, this.f18725g);
            AudioAttributes i11 = i(eVar, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i11).setAudioFormat(N).setTransferMode(1).setBufferSizeInBytes(this.f18726h).setSessionId(i10);
            if (this.f18721c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        public final AudioTrack g(o3.e eVar, int i10) {
            int Z = l0.Z(eVar.f18766c);
            if (i10 == 0) {
                return new AudioTrack(Z, this.f18723e, this.f18724f, this.f18725g, this.f18726h, 1);
            }
            return new AudioTrack(Z, this.f18723e, this.f18724f, this.f18725g, this.f18726h, 1, i10);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f18723e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f18719a.f16909i0;
        }

        public boolean l() {
            return this.f18721c == 1;
        }
    }

    public static class g implements c {
        public final o3.g[] f18728a;
        public final k0 f18729b;
        public final m0 f18730c;

        public g(o3.g... gVarArr) {
            this(gVarArr, new k0(), new m0());
        }

        @Override
        public r2 a(r2 r2Var) {
            this.f18730c.j(r2Var.f16948a);
            this.f18730c.i(r2Var.f16949b);
            return r2Var;
        }

        @Override
        public long b(long j10) {
            return this.f18730c.h(j10);
        }

        @Override
        public long c() {
            return this.f18729b.q();
        }

        @Override
        public boolean d(boolean z10) {
            this.f18729b.w(z10);
            return z10;
        }

        @Override
        public o3.g[] e() {
            return this.f18728a;
        }

        public g(o3.g[] gVarArr, k0 k0Var, m0 m0Var) {
            o3.g[] gVarArr2 = new o3.g[gVarArr.length + 2];
            this.f18728a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f18729b = k0Var;
            this.f18730c = m0Var;
            gVarArr2[gVarArr.length] = k0Var;
            gVarArr2[gVarArr.length + 1] = m0Var;
        }
    }

    public static final class h extends RuntimeException {
        public h(String str, a aVar) {
            this(str);
        }

        public h(String str) {
            super(str);
        }
    }

    public static final class i {
        public final r2 f18731a;
        public final boolean f18732b;
        public final long f18733c;
        public final long f18734d;

        public i(r2 r2Var, boolean z10, long j10, long j11, a aVar) {
            this(r2Var, z10, j10, j11);
        }

        public i(r2 r2Var, boolean z10, long j10, long j11) {
            this.f18731a = r2Var;
            this.f18732b = z10;
            this.f18733c = j10;
            this.f18734d = j11;
        }
    }

    public static final class j<T extends Exception> {
        public final long f18735a;
        public T f18736b;
        public long f18737c;

        public j(long j10) {
            this.f18735a = j10;
        }

        public void a() {
            this.f18736b = null;
        }

        public void b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f18736b == null) {
                this.f18736b = t10;
                this.f18737c = this.f18735a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f18737c) {
                T t11 = this.f18736b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f18736b;
                a();
                throw t12;
            }
        }
    }

    public final class k implements w.a {
        public k() {
        }

        @Override
        public void a(long j10) {
            if (b0.this.f18701r != null) {
                b0.this.f18701r.a(j10);
            }
        }

        @Override
        public void b(int i10, long j10) {
            if (b0.this.f18701r != null) {
                b0.this.f18701r.d(i10, j10, SystemClock.elapsedRealtime() - b0.this.Z);
            }
        }

        @Override
        public void c(long j10) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j10);
            s.i("DefaultAudioSink", sb2.toString());
        }

        @Override
        public void d(long j10, long j11, long j12, long j13) {
            long X = b0.this.X();
            long Y = b0.this.Y();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(X);
            sb2.append(", ");
            sb2.append(Y);
            String sb3 = sb2.toString();
            if (!b0.f18681c0) {
                s.i("DefaultAudioSink", sb3);
                return;
            }
            throw new h(sb3, null);
        }

        @Override
        public void e(long j10, long j11, long j12, long j13) {
            long X = b0.this.X();
            long Y = b0.this.Y();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(X);
            sb2.append(", ");
            sb2.append(Y);
            String sb3 = sb2.toString();
            if (!b0.f18681c0) {
                s.i("DefaultAudioSink", sb3);
                return;
            }
            throw new h(sb3, null);
        }

        public k(b0 b0Var, a aVar) {
            this();
        }
    }

    public final class l {
        public final Handler f18739a = new Handler();
        public final AudioTrack.StreamEventCallback f18740b;

        public class a extends AudioTrack.StreamEventCallback {
            public final b0 f18742a;

            public a(b0 b0Var) {
                this.f18742a = b0Var;
            }

            @Override
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                c5.a.f(audioTrack == b0.this.f18704u);
                if (b0.this.f18701r != null && b0.this.U) {
                    b0.this.f18701r.g();
                }
            }

            @Override
            public void onTearDown(AudioTrack audioTrack) {
                c5.a.f(audioTrack == b0.this.f18704u);
                if (b0.this.f18701r != null && b0.this.U) {
                    b0.this.f18701r.g();
                }
            }
        }

        public l() {
            this.f18740b = new a(b0.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f18739a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() {
                @Override
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f18740b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f18740b);
            this.f18739a.removeCallbacksAndMessages(null);
        }
    }

    public b0(e eVar, a aVar) {
        this(eVar);
    }

    public static AudioFormat N(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int P(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        c5.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    public static int Q(int i10) {
        int i11 = l0.f4841a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(l0.f4842b) && i10 == 1) {
            i10 = 2;
        }
        return l0.D(i10);
    }

    public static Pair<Integer, Integer> R(q1 q1Var, o3.f fVar) {
        int b10 = c5.w.b((String) c5.a.e(q1Var.U), q1Var.R);
        int i10 = 6;
        if (!(b10 == 5 || b10 == 6 || b10 == 18 || b10 == 17 || b10 == 7 || b10 == 8 || b10 == 14)) {
            return null;
        }
        if (b10 == 18 && !fVar.f(18)) {
            b10 = 6;
        } else if (b10 == 8 && !fVar.f(8)) {
            b10 = 7;
        }
        if (!fVar.f(b10)) {
            return null;
        }
        if (b10 != 18) {
            i10 = q1Var.f16908h0;
            if (i10 > fVar.e()) {
                return null;
            }
        } else if (l0.f4841a >= 29) {
            int i11 = q1Var.f16909i0;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = T(18, i11);
            if (i10 == 0) {
                s.i("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        }
        int Q = Q(i10);
        if (Q == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b10), Integer.valueOf(Q));
    }

    public static int S(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return o3.b.d(byteBuffer);
            case 7:
            case 8:
                return e0.e(byteBuffer);
            case 9:
                int m10 = h0.m(l0.F(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
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
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            case 14:
                int a10 = o3.b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return o3.b.h(byteBuffer, a10) * 16;
            case 15:
                return Log.TAG_GIF_LOADER;
            case 16:
                return Log.TAG_CAMERA;
            case 17:
                return o3.c.c(byteBuffer);
        }
    }

    public static int T(int i10, int i11) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(l0.D(i12)).build(), build)) {
                return i12;
            }
        }
        return 0;
    }

    public static boolean a0(int i10) {
        return (l0.f4841a >= 24 && i10 == -6) || i10 == -32;
    }

    public static boolean c0(AudioTrack audioTrack) {
        return l0.f4841a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean d0(q1 q1Var, o3.f fVar) {
        return R(q1Var, fVar) != null;
    }

    public static void m0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void n0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    public static int t0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public final void G(long j10) {
        r2 r2Var;
        if (p0()) {
            r2Var = this.f18684b.a(O());
        } else {
            r2Var = r2.M;
        }
        r2 r2Var2 = r2Var;
        boolean d10 = p0() ? this.f18684b.d(W()) : false;
        this.f18693j.add(new i(r2Var2, d10, Math.max(0L, j10), this.f18703t.h(Y()), null));
        o0();
        t.c cVar = this.f18701r;
        if (cVar != null) {
            cVar.b(d10);
        }
    }

    public final long H(long j10) {
        while (!this.f18693j.isEmpty() && j10 >= this.f18693j.getFirst().f18734d) {
            this.f18707x = this.f18693j.remove();
        }
        i iVar = this.f18707x;
        long j11 = j10 - iVar.f18734d;
        if (iVar.f18731a.equals(r2.M)) {
            return this.f18707x.f18733c + j11;
        }
        if (this.f18693j.isEmpty()) {
            return this.f18707x.f18733c + this.f18684b.b(j11);
        }
        i first = this.f18693j.getFirst();
        return first.f18733c - l0.T(first.f18734d - j10, this.f18707x.f18731a.f16948a);
    }

    public final long I(long j10) {
        return j10 + this.f18703t.h(this.f18684b.c());
    }

    public final AudioTrack J(f fVar) {
        try {
            return fVar.a(this.Y, this.f18705v, this.W);
        } catch (t.b e10) {
            t.c cVar = this.f18701r;
            if (cVar != null) {
                cVar.c(e10);
            }
            throw e10;
        }
    }

    public final AudioTrack K() {
        try {
            return J((f) c5.a.e(this.f18703t));
        } catch (t.b e10) {
            f fVar = this.f18703t;
            if (fVar.f18726h > 1000000) {
                f c10 = fVar.c(1000000);
                try {
                    AudioTrack J = J(c10);
                    this.f18703t = c10;
                    return J;
                } catch (t.b e11) {
                    e10.addSuppressed(e11);
                    e0();
                    throw e10;
                }
            }
            e0();
            throw e10;
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: o3.b0.L():boolean");
    }

    public final void M() {
        int i10 = 0;
        while (true) {
            o3.g[] gVarArr = this.K;
            if (i10 < gVarArr.length) {
                o3.g gVar = gVarArr[i10];
                gVar.flush();
                this.L[i10] = gVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final r2 O() {
        return U().f18731a;
    }

    public final i U() {
        i iVar = this.f18706w;
        if (iVar != null) {
            return iVar;
        }
        if (!this.f18693j.isEmpty()) {
            return this.f18693j.getLast();
        }
        return this.f18707x;
    }

    @SuppressLint({"InlinedApi"})
    public final int V(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = l0.f4841a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (i10 != 30 || !l0.f4844d.startsWith("Pixel")) ? 1 : 2;
    }

    public boolean W() {
        return U().f18732b;
    }

    public final long X() {
        f fVar = this.f18703t;
        if (fVar.f18721c == 0) {
            return this.B / fVar.f18720b;
        }
        return this.C;
    }

    public final long Y() {
        f fVar = this.f18703t;
        if (fVar.f18721c == 0) {
            return this.D / fVar.f18722d;
        }
        return this.E;
    }

    public final void Z() {
        p1 p1Var;
        this.f18691h.block();
        AudioTrack K = K();
        this.f18704u = K;
        if (c0(K)) {
            h0(this.f18704u);
            if (this.f18695l != 3) {
                AudioTrack audioTrack = this.f18704u;
                q1 q1Var = this.f18703t.f18719a;
                audioTrack.setOffloadDelayPadding(q1Var.f16911k0, q1Var.f16912l0);
            }
        }
        if (l0.f4841a >= 31 && (p1Var = this.f18700q) != null) {
            b.a(this.f18704u, p1Var);
        }
        this.W = this.f18704u.getAudioSessionId();
        w wVar = this.f18692i;
        AudioTrack audioTrack2 = this.f18704u;
        f fVar = this.f18703t;
        wVar.t(audioTrack2, fVar.f18721c == 2, fVar.f18725g, fVar.f18722d, fVar.f18726h);
        l0();
        int i10 = this.X.f18940a;
        if (i10 != 0) {
            this.f18704u.attachAuxEffect(i10);
            this.f18704u.setAuxEffectSendLevel(this.X.f18941b);
        }
        this.H = true;
    }

    @Override
    public boolean a(q1 q1Var) {
        return k(q1Var) != 0;
    }

    @Override
    public void b() {
        this.U = false;
        if (b0() && this.f18692i.q()) {
            this.f18704u.pause();
        }
    }

    public final boolean b0() {
        return this.f18704u != null;
    }

    @Override
    public void c() {
        flush();
        for (o3.g gVar : this.f18689f) {
            gVar.c();
        }
        for (o3.g gVar2 : this.f18690g) {
            gVar2.c();
        }
        this.U = false;
        this.f18683a0 = false;
    }

    @Override
    public void d(r2 r2Var) {
        r2 r2Var2 = new r2(l0.o(r2Var.f16948a, 0.1f, 8.0f), l0.o(r2Var.f16949b, 0.1f, 8.0f));
        if (!this.f18694k || l0.f4841a < 23) {
            j0(r2Var2, W());
        } else {
            k0(r2Var2);
        }
    }

    @Override
    public boolean e() {
        return !b0() || (this.S && !i());
    }

    public final void e0() {
        if (this.f18703t.l()) {
            this.f18683a0 = true;
        }
    }

    @Override
    public void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            l0();
        }
    }

    public final void f0() {
        if (!this.T) {
            this.T = true;
            this.f18692i.h(Y());
            this.f18704u.stop();
            this.A = 0;
        }
    }

    @Override
    public void flush() {
        if (b0()) {
            i0();
            if (this.f18692i.j()) {
                this.f18704u.pause();
            }
            if (c0(this.f18704u)) {
                ((l) c5.a.e(this.f18696m)).b(this.f18704u);
            }
            AudioTrack audioTrack = this.f18704u;
            this.f18704u = null;
            if (l0.f4841a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f18702s;
            if (fVar != null) {
                this.f18703t = fVar;
                this.f18702s = null;
            }
            this.f18692i.r();
            this.f18691h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f18698o.a();
        this.f18697n.a();
    }

    @Override
    public void g() {
        this.U = true;
        if (b0()) {
            this.f18692i.v();
            this.f18704u.play();
        }
    }

    public final void g0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = o3.g.f18781a;
                }
            }
            if (i10 == length) {
                s0(byteBuffer, j10);
            } else {
                o3.g gVar = this.K[i10];
                if (i10 > this.R) {
                    gVar.b(byteBuffer);
                }
                ByteBuffer a10 = gVar.a();
                this.L[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    @Override
    public void h() {
        if (!this.S && b0() && L()) {
            f0();
            this.S = true;
        }
    }

    public final void h0(AudioTrack audioTrack) {
        if (this.f18696m == null) {
            this.f18696m = new l();
        }
        this.f18696m.a(audioTrack);
    }

    @Override
    public boolean i() {
        return b0() && this.f18692i.i(Y());
    }

    public final void i0() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.f18685b0 = false;
        this.F = 0;
        this.f18707x = new i(O(), W(), 0L, 0L, null);
        this.I = 0L;
        this.f18706w = null;
        this.f18693j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f18709z = null;
        this.A = 0;
        this.f18688e.o();
        M();
    }

    @Override
    public r2 j() {
        if (this.f18694k) {
            return this.f18708y;
        }
        return O();
    }

    public final void j0(r2 r2Var, boolean z10) {
        i U = U();
        if (!r2Var.equals(U.f18731a) || z10 != U.f18732b) {
            i iVar = new i(r2Var, z10, -9223372036854775807L, -9223372036854775807L, null);
            if (b0()) {
                this.f18706w = iVar;
            } else {
                this.f18707x = iVar;
            }
        }
    }

    @Override
    public int k(q1 q1Var) {
        if (!"audio/raw".equals(q1Var.U)) {
            return ((this.f18683a0 || !r0(q1Var, this.f18705v)) && !d0(q1Var, this.f18682a)) ? 0 : 2;
        }
        if (!l0.j0(q1Var.f16910j0)) {
            int i10 = q1Var.f16910j0;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Invalid PCM encoding: ");
            sb2.append(i10);
            s.i("DefaultAudioSink", sb2.toString());
            return 0;
        }
        int i11 = q1Var.f16910j0;
        return (i11 == 2 || (this.f18686c && i11 == 4)) ? 2 : 1;
    }

    public final void k0(r2 r2Var) {
        if (b0()) {
            try {
                this.f18704u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(r2Var.f16948a).setPitch(r2Var.f16949b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                s.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            r2Var = new r2(this.f18704u.getPlaybackParams().getSpeed(), this.f18704u.getPlaybackParams().getPitch());
            this.f18692i.u(r2Var.f16948a);
        }
        this.f18708y = r2Var;
    }

    @Override
    public void l(t.c cVar) {
        this.f18701r = cVar;
    }

    public final void l0() {
        if (b0()) {
            if (l0.f4841a >= 21) {
                m0(this.f18704u, this.J);
            } else {
                n0(this.f18704u, this.J);
            }
        }
    }

    @Override
    public void m(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.V = i10 != 0;
            flush();
        }
    }

    @Override
    public long n(boolean z10) {
        if (!b0() || this.H) {
            return Long.MIN_VALUE;
        }
        return I(H(Math.min(this.f18692i.d(z10), this.f18703t.h(Y()))));
    }

    @Override
    public void o() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    public final void o0() {
        o3.g[] gVarArr = this.f18703t.f18727i;
        ArrayList arrayList = new ArrayList();
        for (o3.g gVar : gVarArr) {
            if (gVar.f()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (o3.g[]) arrayList.toArray(new o3.g[size]);
        this.L = new ByteBuffer[size];
        M();
    }

    @Override
    public void p() {
        this.G = true;
    }

    public final boolean p0() {
        return !this.Y && "audio/raw".equals(this.f18703t.f18719a.U) && !q0(this.f18703t.f18719a.f16910j0);
    }

    @Override
    public void q(o3.e eVar) {
        if (!this.f18705v.equals(eVar)) {
            this.f18705v = eVar;
            if (!this.Y) {
                flush();
            }
        }
    }

    public final boolean q0(int i10) {
        return this.f18686c && l0.i0(i10);
    }

    @Override
    public void r(x xVar) {
        if (!this.X.equals(xVar)) {
            int i10 = xVar.f18940a;
            float f10 = xVar.f18941b;
            AudioTrack audioTrack = this.f18704u;
            if (audioTrack != null) {
                if (this.X.f18940a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f18704u.setAuxEffectSendLevel(f10);
                }
            }
            this.X = xVar;
        }
    }

    public final boolean r0(q1 q1Var, o3.e eVar) {
        int b10;
        int D;
        int V;
        if (l0.f4841a < 29 || this.f18695l == 0 || (b10 = c5.w.b((String) c5.a.e(q1Var.U), q1Var.R)) == 0 || (D = l0.D(q1Var.f16908h0)) == 0 || (V = V(N(q1Var.f16909i0, D, b10), eVar.b())) == 0) {
            return false;
        }
        if (V == 1) {
            return !(q1Var.f16911k0 != 0 || q1Var.f16912l0 != 0) || !(this.f18695l == 1);
        } else if (V == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void s() {
        c5.a.f(l0.f4841a >= 21);
        c5.a.f(this.V);
        if (!this.Y) {
            this.Y = true;
            flush();
        }
    }

    public final void s0(ByteBuffer byteBuffer, long j10) {
        int i10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                c5.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (l0.f4841a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (l0.f4841a < 21) {
                int c10 = this.f18692i.c(this.D);
                if (c10 > 0) {
                    i10 = this.f18704u.write(this.P, this.Q, Math.min(remaining2, c10));
                    if (i10 > 0) {
                        this.Q += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else if (this.Y) {
                c5.a.f(j10 != -9223372036854775807L);
                i10 = u0(this.f18704u, byteBuffer, remaining2, j10);
            } else {
                i10 = t0(this.f18704u, byteBuffer, remaining2);
            }
            this.Z = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                boolean a02 = a0(i10);
                if (a02) {
                    e0();
                }
                t.e eVar = new t.e(i10, this.f18703t.f18719a, a02);
                t.c cVar = this.f18701r;
                if (cVar != null) {
                    cVar.c(eVar);
                }
                if (!eVar.f18901b) {
                    this.f18698o.b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f18698o.a();
            if (c0(this.f18704u)) {
                long j11 = this.E;
                if (j11 > 0) {
                    this.f18685b0 = false;
                }
                if (this.U && this.f18701r != null && i10 < remaining2 && !this.f18685b0) {
                    this.f18701r.e(this.f18692i.e(j11));
                }
            }
            int i11 = this.f18703t.f18721c;
            if (i11 == 0) {
                this.D += i10;
            }
            if (i10 == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.M) {
                        z10 = false;
                    }
                    c5.a.f(z10);
                    this.E += this.F * this.N;
                }
                this.O = null;
            }
        }
    }

    @Override
    public void t(p1 p1Var) {
        this.f18700q = p1Var;
    }

    @Override
    public boolean u(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.M;
        c5.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f18702s != null) {
            if (!L()) {
                return false;
            }
            if (!this.f18702s.b(this.f18703t)) {
                f0();
                if (i()) {
                    return false;
                }
                flush();
            } else {
                this.f18703t = this.f18702s;
                this.f18702s = null;
                if (c0(this.f18704u) && this.f18695l != 3) {
                    this.f18704u.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f18704u;
                    q1 q1Var = this.f18703t.f18719a;
                    audioTrack.setOffloadDelayPadding(q1Var.f16911k0, q1Var.f16912l0);
                    this.f18685b0 = true;
                }
            }
            G(j10);
        }
        if (!b0()) {
            try {
                Z();
            } catch (t.b e10) {
                if (!e10.f18896b) {
                    this.f18697n.b(e10);
                    return false;
                }
                throw e10;
            }
        }
        this.f18697n.a();
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.f18694k && l0.f4841a >= 23) {
                k0(this.f18708y);
            }
            G(j10);
            if (this.U) {
                g();
            }
        }
        if (!this.f18692i.l(Y())) {
            return false;
        }
        if (this.M == null) {
            c5.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar = this.f18703t;
            if (fVar.f18721c != 0 && this.F == 0) {
                int S = S(fVar.f18725g, byteBuffer);
                this.F = S;
                if (S == 0) {
                    return true;
                }
            }
            if (this.f18706w != null) {
                if (!L()) {
                    return false;
                }
                G(j10);
                this.f18706w = null;
            }
            long k10 = this.I + this.f18703t.k(X() - this.f18688e.n());
            if (!this.G && Math.abs(k10 - j10) > 200000) {
                this.f18701r.c(new t.d(j10, k10));
                this.G = true;
            }
            if (this.G) {
                if (!L()) {
                    return false;
                }
                long j11 = j10 - k10;
                this.I += j11;
                this.G = false;
                G(j10);
                t.c cVar = this.f18701r;
                if (!(cVar == null || j11 == 0)) {
                    cVar.f();
                }
            }
            if (this.f18703t.f18721c == 0) {
                this.B += byteBuffer.remaining();
            } else {
                this.C += this.F * i10;
            }
            this.M = byteBuffer;
            this.N = i10;
        }
        g0(j10);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        } else if (!this.f18692i.k(Y())) {
            return false;
        } else {
            s.i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public final int u0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (l0.f4841a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f18709z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f18709z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f18709z.putInt(1431633921);
        }
        if (this.A == 0) {
            this.f18709z.putInt(4, i10);
            this.f18709z.putLong(8, j10 * 1000);
            this.f18709z.position(0);
            this.A = i10;
        }
        int remaining = this.f18709z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f18709z, remaining, 1);
            if (write < 0) {
                this.A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int t02 = t0(audioTrack, byteBuffer, i10);
        if (t02 < 0) {
            this.A = 0;
            return t02;
        }
        this.A -= t02;
        return t02;
    }

    @Override
    public void v(q1 q1Var, int i10, int[] iArr) {
        o3.g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        o3.g[] gVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(q1Var.U)) {
            c5.a.a(l0.j0(q1Var.f16910j0));
            i16 = l0.X(q1Var.f16910j0, q1Var.f16908h0);
            if (q0(q1Var.f16910j0)) {
                gVarArr2 = this.f18690g;
            } else {
                gVarArr2 = this.f18689f;
            }
            this.f18688e.p(q1Var.f16911k0, q1Var.f16912l0);
            if (l0.f4841a < 21 && q1Var.f16908h0 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i19 = 0; i19 < 6; i19++) {
                    iArr2[i19] = i19;
                }
            } else {
                iArr2 = iArr;
            }
            this.f18687d.n(iArr2);
            g.a aVar = new g.a(q1Var.f16909i0, q1Var.f16908h0, q1Var.f16910j0);
            for (o3.g gVar : gVarArr2) {
                try {
                    g.a g10 = gVar.g(aVar);
                    if (gVar.f()) {
                        aVar = g10;
                    }
                } catch (g.b e10) {
                    throw new t.a(e10, q1Var);
                }
            }
            int i20 = aVar.f18785c;
            int i21 = aVar.f18783a;
            i15 = l0.D(aVar.f18784b);
            i12 = l0.X(i20, aVar.f18784b);
            gVarArr = gVarArr2;
            i14 = i20;
            i11 = i21;
            i13 = 0;
        } else {
            o3.g[] gVarArr3 = new o3.g[0];
            int i22 = q1Var.f16909i0;
            if (r0(q1Var, this.f18705v)) {
                i14 = c5.w.b((String) c5.a.e(q1Var.U), q1Var.R);
                i15 = l0.D(q1Var.f16908h0);
                gVarArr = gVarArr3;
                i11 = i22;
                i16 = -1;
                i13 = 1;
            } else {
                Pair<Integer, Integer> R = R(q1Var, this.f18682a);
                if (R != null) {
                    i14 = ((Integer) R.first).intValue();
                    i15 = ((Integer) R.second).intValue();
                    gVarArr = gVarArr3;
                    i11 = i22;
                    i16 = -1;
                    i13 = 2;
                } else {
                    String valueOf = String.valueOf(q1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new t.a(sb2.toString(), q1Var);
                }
            }
            i12 = -1;
        }
        if (i10 != 0) {
            i18 = i10;
            i17 = i14;
        } else {
            i17 = i14;
            i18 = this.f18699p.a(P(i11, i15, i14), i14, i13, i12, i11, this.f18694k ? 8.0d : 1.0d);
        }
        if (i17 == 0) {
            String valueOf2 = String.valueOf(q1Var);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i13);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new t.a(sb3.toString(), q1Var);
        } else if (i15 != 0) {
            this.f18683a0 = false;
            f fVar = new f(q1Var, i16, i13, i12, i11, i15, i17, i18, gVarArr);
            if (b0()) {
                this.f18702s = fVar;
            } else {
                this.f18703t = fVar;
            }
        } else {
            String valueOf3 = String.valueOf(q1Var);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 54);
            sb4.append("Invalid output channel config (mode=");
            sb4.append(i13);
            sb4.append(") for: ");
            sb4.append(valueOf3);
            throw new t.a(sb4.toString(), q1Var);
        }
    }

    @Override
    public void w() {
        if (l0.f4841a < 25) {
            flush();
            return;
        }
        this.f18698o.a();
        this.f18697n.a();
        if (b0()) {
            i0();
            if (this.f18692i.j()) {
                this.f18704u.pause();
            }
            this.f18704u.flush();
            this.f18692i.r();
            w wVar = this.f18692i;
            AudioTrack audioTrack = this.f18704u;
            f fVar = this.f18703t;
            wVar.t(audioTrack, fVar.f18721c == 2, fVar.f18725g, fVar.f18722d, fVar.f18726h);
            this.H = true;
        }
    }

    @Override
    public void x(boolean z10) {
        j0(O(), z10);
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public b0(e eVar) {
        this.f18682a = eVar.f18713a;
        c cVar = eVar.f18714b;
        this.f18684b = cVar;
        int i10 = l0.f4841a;
        this.f18686c = i10 >= 21 && eVar.f18715c;
        this.f18694k = i10 >= 23 && eVar.f18716d;
        this.f18695l = i10 >= 29 ? eVar.f18717e : 0;
        this.f18699p = eVar.f18718f;
        this.f18691h = new ConditionVariable(true);
        this.f18692i = new w(new k(this, null));
        z zVar = new z();
        this.f18687d = zVar;
        n0 n0Var = new n0();
        this.f18688e = n0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new j0(), zVar, n0Var);
        Collections.addAll(arrayList, cVar.e());
        this.f18689f = (o3.g[]) arrayList.toArray(new o3.g[0]);
        this.f18690g = new o3.g[]{new f0()};
        this.J = 1.0f;
        this.f18705v = o3.e.P;
        this.W = 0;
        this.X = new x(0, 0.0f);
        r2 r2Var = r2.M;
        this.f18707x = new i(r2Var, false, 0L, 0L, null);
        this.f18708y = r2Var;
        this.R = -1;
        this.K = new o3.g[0];
        this.L = new ByteBuffer[0];
        this.f18693j = new ArrayDeque<>();
        this.f18697n = new j<>(100L);
        this.f18698o = new j<>(100L);
    }
}
