package vd;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import ce.j0;
import he.i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.video.old.Mp4OutputImpl;
import vd.k0;

@TargetApi(18)
public class k0 {
    public static final int[] Y = {44100, 22050, 11025, 8000};
    public float A;
    public float B;
    public boolean C;
    public SurfaceTexture D;
    public EGL10 E;
    public EGLDisplay F;
    public EGLConfig G;
    public EGLContext H;
    public EGLSurface I;
    public GL J;
    public SurfaceTexture K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public f S;
    public long W;
    public boolean X;
    public final fe.b f25502a;
    public final Handler f25503b;
    public final Handler f25504c;
    public final SurfaceTexture f25505d;
    public final int f25506e;
    public final int f25507f;
    public int f25508g;
    public int f25509h;
    public int f25510i;
    public b f25511j;
    public String f25512k;
    public String f25513l;
    public volatile boolean f25514m;
    public volatile boolean f25515n;
    public volatile boolean f25516o;
    public boolean f25517p;
    public SurfaceTexture f25518q;
    public File f25520s;
    public volatile boolean f25521t;
    public FloatBuffer f25522u;
    public FloatBuffer f25523v;
    public final e f25519r = new e(this);
    public int[] f25524w = new int[2];
    public int[] f25525x = new int[1];
    public int[] f25526y = new int[1];
    public float f25527z = 1.0f;
    public Integer R = 0;
    public float[] T = new float[16];
    public float[] U = new float[16];
    public float[] V = new float[16];

    public static class a {
        public byte[] f25528a;
        public long[] f25529b;
        public int[] f25530c;
        public int f25531d;
        public int f25532e;
        public boolean f25533f;

        public a() {
            this.f25528a = new byte[20480];
            this.f25529b = new long[10];
            this.f25530c = new int[10];
        }
    }

    public interface b {
        void b(String str, int i10, int i11);

        void c(String str, int i10);

        void f(String str, long j10);
    }

    public static class c extends Handler {
        public WeakReference<f> f25534a;

        public c(f fVar) {
            this.f25534a = new WeakReference<>(fVar);
        }

        public void a() {
            Looper.myLooper().quit();
        }

        @Override
        public void handleMessage(Message message) {
            int i10 = message.what;
            f fVar = this.f25534a.get();
            if (fVar != null) {
                if (i10 == 0) {
                    try {
                        Log.i((int) Log.TAG_ROUND, "start encoder", new Object[0]);
                        fVar.r();
                    } catch (Exception e10) {
                        Log.e(Log.TAG_ROUND, "Error", e10, new Object[0]);
                        fVar.o(0);
                        Looper.myLooper().quit();
                    }
                } else if (i10 == 1) {
                    Log.i((int) Log.TAG_ROUND, "stop encoder", new Object[0]);
                    fVar.o(message.arg1);
                } else if (i10 == 2) {
                    fVar.p((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
                } else if (i10 == 3) {
                    fVar.n((a) message.obj);
                }
            }
        }
    }

    public static class d extends Handler {
        public final k0 f25535a;
        public final boolean f25536b;

        public d(Looper looper, k0 k0Var, boolean z10) {
            super(looper);
            this.f25535a = k0Var;
            this.f25536b = z10;
        }

        @Override
        public void handleMessage(Message message) {
            if (this.f25536b) {
                this.f25535a.T(message);
            } else {
                this.f25535a.U(message);
            }
        }
    }

    public static class e extends Handler {
        public final k0 f25537a;

        public e(k0 k0Var) {
            super(Looper.getMainLooper());
            this.f25537a = k0Var;
        }

        @Override
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f25537a.J((String) message.obj, ib.c.f(message.arg1, message.arg2));
            } else if (i10 == 1) {
                this.f25537a.H((String) message.obj, message.arg1, message.arg2);
            } else if (i10 == 2) {
                this.f25537a.I((String) message.obj, message.arg1);
            }
        }
    }

    public class f implements Runnable {
        public boolean A0;
        public long B0;
        public int M;
        public boolean N;
        public boolean O;
        public Surface P;
        public android.opengl.EGLDisplay Q;
        public android.opengl.EGLContext R;
        public android.opengl.EGLContext S;
        public android.opengl.EGLConfig T;
        public android.opengl.EGLSurface U;
        public MediaCodec V;
        public MediaCodec W;
        public MediaCodec.BufferInfo X;
        public MediaCodec.BufferInfo Y;
        public le.a Z;
        public File f25538a;
        public ArrayList<a> f25539a0;
        public int f25540b;
        public int f25541b0;
        public int f25542c;
        public int f25543c0;
        public long f25544d0;
        public long f25545e0;
        public long f25546f0;
        public long f25547g0;
        public volatile c f25548h0;
        public final Object f25549i0;
        public boolean f25550j0;
        public volatile boolean f25551k0;
        public volatile int f25552l0;
        public long f25553m0;
        public boolean f25554n0;
        public int f25555o0;
        public int f25556p0;
        public int f25557q0;
        public int f25558r0;
        public int f25559s0;
        public int f25560t0;
        public int f25561u0;
        public int f25562v0;
        public Integer f25563w0;
        public AudioRecord f25564x0;
        public ArrayBlockingQueue<a> f25565y0;
        public Runnable f25566z0;

        public class a implements Runnable {
            public a() {
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: vd.k0.f.a.run():void");
            }
        }

        public f() {
            this.N = true;
            this.Q = EGL14.EGL_NO_DISPLAY;
            this.R = EGL14.EGL_NO_CONTEXT;
            this.U = EGL14.EGL_NO_SURFACE;
            this.f25539a0 = new ArrayList<>();
            this.f25541b0 = -5;
            this.f25543c0 = -5;
            this.f25545e0 = -1L;
            this.f25546f0 = 0L;
            this.f25547g0 = -1L;
            this.f25549i0 = new Object();
            this.f25563w0 = 0;
            this.f25565y0 = new ArrayBlockingQueue<>(10);
            this.f25566z0 = new a();
        }

        public void q() {
            k(this.f25538a, true);
        }

        public void finalize() {
            try {
                android.opengl.EGLDisplay eGLDisplay = this.Q;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(this.Q, this.R);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.Q);
                    this.Q = EGL14.EGL_NO_DISPLAY;
                    this.R = EGL14.EGL_NO_CONTEXT;
                    this.T = null;
                }
            } finally {
                super.finalize();
            }
        }

        public final void k(File file, boolean z10) {
            if (this.N) {
                this.N = false;
            } else if (z10) {
                k0 k0Var = k0.this;
                k0Var.H(k0Var.f25512k, (int) file.length(), (int) Math.round((SystemClock.uptimeMillis() - k0.this.W) / 1000.0d));
            } else {
                k0 k0Var2 = k0.this;
                k0Var2.I(k0Var2.f25512k, (int) file.length());
            }
        }

        public void l(boolean r15) {
            throw new UnsupportedOperationException("Method not decompiled: vd.k0.f.l(boolean):void");
        }

        public void m(SurfaceTexture surfaceTexture, Integer num) {
            synchronized (this.f25549i0) {
                if (this.f25550j0) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp != 0) {
                        this.f25548h0.sendMessage(this.f25548h0.obtainMessage(2, (int) (timestamp >> 32), (int) timestamp, num));
                    }
                }
            }
        }

        public final void n(vd.k0.a r18) {
            throw new UnsupportedOperationException("Method not decompiled: vd.k0.f.n(vd.k0$a):void");
        }

        public final void o(int i10) {
            if (this.f25551k0) {
                this.f25552l0 = i10;
                this.f25551k0 = false;
                return;
            }
            try {
                l(true);
            } catch (Exception e10) {
                Log.e(Log.TAG_ROUND, "Error", e10, new Object[0]);
            }
            MediaCodec mediaCodec = this.V;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.V.release();
                    this.V = null;
                } catch (Exception e11) {
                    Log.e(Log.TAG_ROUND, "Error", e11, new Object[0]);
                }
            }
            MediaCodec mediaCodec2 = this.W;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.W.release();
                    this.W = null;
                } catch (Exception e12) {
                    Log.e(Log.TAG_ROUND, "Error", e12, new Object[0]);
                }
            }
            le.a aVar = this.Z;
            if (aVar != null) {
                try {
                    aVar.b();
                } catch (Exception e13) {
                    Log.e(Log.TAG_ROUND, "Error", e13, new Object[0]);
                }
            }
            if (i10 != 0) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        k0.f.this.q();
                    }
                });
            } else {
                this.f25538a.delete();
                k0 k0Var = k0.this;
                k0Var.H(k0Var.f25512k, -1, -1);
            }
            EGL14.eglDestroySurface(this.Q, this.U);
            this.U = EGL14.EGL_NO_SURFACE;
            Surface surface = this.P;
            if (surface != null) {
                surface.release();
                this.P = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.Q;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.Q, this.R);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.Q);
            }
            this.Q = EGL14.EGL_NO_DISPLAY;
            this.R = EGL14.EGL_NO_CONTEXT;
            this.T = null;
            this.f25548h0.a();
        }

        public final void p(long r11, java.lang.Integer r13) {
            throw new UnsupportedOperationException("Method not decompiled: vd.k0.f.p(long, java.lang.Integer):void");
        }

        public final void r() {
            int i10;
            Throwable th;
            int i11;
            for (int i12 = 0; i12 < 3; i12++) {
                try {
                    this.f25565y0.add(new a());
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
            int i13 = k0.Y[0];
            int[] iArr = k0.Y;
            int length = iArr.length;
            AudioRecord audioRecord = null;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                int i15 = iArr[i14];
                int minBufferSize = AudioRecord.getMinBufferSize(i15, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                try {
                    i10 = i15;
                    try {
                        AudioRecord audioRecord2 = new AudioRecord(1, i10, 16, 2, 49152 < minBufferSize ? ((minBufferSize / Log.TAG_VOICE) + 1) * Log.TAG_VOICE * 2 : 49152);
                        try {
                            audioRecord2.startRecording();
                            audioRecord = audioRecord2;
                            this.f25564x0 = audioRecord;
                            i13 = i10;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            audioRecord = audioRecord2;
                            if (audioRecord != null) {
                                try {
                                    audioRecord.stop();
                                } catch (Throwable unused) {
                                }
                                try {
                                    audioRecord.release();
                                } catch (Throwable unused2) {
                                }
                            }
                            i11 = i10;
                            if (i11 != k0.Y[k0.Y.length - 1]) {
                                i14++;
                                i13 = i11;
                            } else {
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i10 = i15;
                }
                i14++;
                i13 = i11;
            }
            if (this.f25564x0 != null) {
                new Thread(this.f25566z0).start();
                this.Y = new MediaCodec.BufferInfo();
                this.X = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("aac-profile", 2);
                mediaFormat.setInteger("sample-rate", i13);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.W = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.W.start();
                this.V = MediaCodec.createEncoderByType("video/avc");
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f25540b, this.f25542c);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", this.M);
                createVideoFormat.setInteger("frame-rate", 30);
                createVideoFormat.setInteger("i-frame-interval", 1);
                this.V.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.P = this.V.createInputSurface();
                this.V.start();
                org.thunderdog.challegram.video.old.a aVar = new org.thunderdog.challegram.video.old.a();
                aVar.f(this.f25538a);
                aVar.g(0);
                aVar.h(this.f25540b, this.f25542c);
                this.Z = new Mp4OutputImpl().f(aVar);
                k0.this.O();
                if (this.Q == EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    this.Q = eglGetDisplay;
                    if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        int[] iArr2 = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                            if (this.R == EGL14.EGL_NO_CONTEXT) {
                                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                                if (EGL14.eglChooseConfig(this.Q, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    this.R = EGL14.eglCreateContext(this.Q, eGLConfigArr[0], this.S, new int[]{12440, 2, 12344}, 0);
                                    this.T = eGLConfigArr[0];
                                } else {
                                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                                }
                            }
                            EGL14.eglQueryContext(this.Q, this.R, 12440, new int[1], 0);
                            if (this.U == EGL14.EGL_NO_SURFACE) {
                                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.Q, this.T, this.P, new int[]{12344}, 0);
                                this.U = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null) {
                                    throw new RuntimeException("surface was null");
                                } else if (EGL14.eglMakeCurrent(this.Q, eglCreateWindowSurface, eglCreateWindowSurface, this.R)) {
                                    GLES20.glBlendFunc(770, 771);
                                    int Y = k0.Y(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                    int Y2 = k0.Y(35632, "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float scaleX;\nuniform float scaleY;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 coord = vec2((vTextureCoord.x - 0.5) * scaleX, (vTextureCoord.y - 0.5) * scaleY);\n   float coef = ceil(clamp(0.2601 - dot(coord, coord), 0.0, 1.0));\n   vec3 color = texture2D(sTexture, vTextureCoord).rgb * coef + (1.0 - step(0.001, coef));\n   gl_FragColor = vec4(color * alpha, alpha);\n}\n");
                                    if (!(Y == 0 || Y2 == 0)) {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.f25555o0 = glCreateProgram;
                                        GLES20.glAttachShader(glCreateProgram, Y);
                                        GLES20.glAttachShader(this.f25555o0, Y2);
                                        GLES20.glLinkProgram(this.f25555o0);
                                        int[] iArr3 = new int[1];
                                        GLES20.glGetProgramiv(this.f25555o0, 35714, iArr3, 0);
                                        if (iArr3[0] == 0) {
                                            GLES20.glDeleteProgram(this.f25555o0);
                                            this.f25555o0 = 0;
                                            return;
                                        }
                                        this.f25558r0 = GLES20.glGetAttribLocation(this.f25555o0, "aPosition");
                                        this.f25559s0 = GLES20.glGetAttribLocation(this.f25555o0, "aTextureCoord");
                                        this.f25560t0 = GLES20.glGetUniformLocation(this.f25555o0, "scaleX");
                                        this.f25561u0 = GLES20.glGetUniformLocation(this.f25555o0, "scaleY");
                                        this.f25562v0 = GLES20.glGetUniformLocation(this.f25555o0, "alpha");
                                        this.f25556p0 = GLES20.glGetUniformLocation(this.f25555o0, "uMVPMatrix");
                                        this.f25557q0 = GLES20.glGetUniformLocation(this.f25555o0, "uSTMatrix");
                                    }
                                } else {
                                    Log.e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()), new Object[0]);
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                            } else {
                                throw new IllegalStateException("surface already created");
                            }
                        } else {
                            this.Q = null;
                            throw new RuntimeException("unable to initialize EGL14");
                        }
                    } else {
                        throw new RuntimeException("unable to get EGL14 display");
                    }
                } else {
                    throw new RuntimeException("EGL already set up");
                }
            } else {
                throw new NullPointerException();
            }
        }

        @Override
        public void run() {
            Looper.prepare();
            synchronized (this.f25549i0) {
                this.f25548h0 = new c(this);
                this.f25550j0 = true;
                this.f25549i0.notify();
            }
            Looper.loop();
            synchronized (this.f25549i0) {
                this.f25550j0 = false;
            }
        }

        public void s(File file, int i10, int i11, android.opengl.EGLContext eGLContext) {
            this.f25538a = file;
            this.f25540b = i10;
            this.f25542c = i10;
            this.M = i11;
            this.S = eGLContext;
            synchronized (this.f25549i0) {
                if (!this.f25551k0) {
                    this.f25551k0 = true;
                    new Thread(this, "TextureMovieEncoder").start();
                    while (!this.f25550j0) {
                        try {
                            this.f25549i0.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    this.f25548h0.sendMessage(this.f25548h0.obtainMessage(0));
                }
            }
        }

        public void t(int i10) {
            this.f25548h0.sendMessage(this.f25548h0.obtainMessage(1, i10, 0));
        }
    }

    public k0(fe.b bVar, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f25502a = bVar;
        this.f25503b = new d(bVar.r().getLooper(), this, false);
        this.f25504c = new d(bVar.q().getLooper(), this, true);
        this.f25505d = surfaceTexture;
        this.f25506e = i10;
        this.f25507f = i11;
    }

    public static boolean E() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void W(SurfaceTexture surfaceTexture) {
        d0();
    }

    public void X(SurfaceTexture surfaceTexture) {
        d0();
    }

    public static int Y(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e((int) Log.TAG_ROUND, GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean B() {
        return !this.f25516o && this.C && this.I != null;
    }

    public final boolean C() {
        return this.f25502a.f();
    }

    public final boolean D() {
        return this.f25502a.h();
    }

    public final void F(SurfaceTexture surfaceTexture) {
        if (!D()) {
            Handler handler = this.f25503b;
            handler.sendMessage(Message.obtain(handler, 0, surfaceTexture));
            return;
        }
        surfaceTexture.setDefaultBufferSize(this.f25508g, this.f25509h);
        this.f25518q = surfaceTexture;
        this.f25502a.V(this);
    }

    public void G() {
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 2));
        } else if (!this.f25517p) {
            this.f25517p = true;
            L();
        }
    }

    public final void H(String str, int i10, int i11) {
        if (!E()) {
            e eVar = this.f25519r;
            eVar.sendMessage(Message.obtain(eVar, 1, i10, i11, str));
            return;
        }
        b bVar = this.f25511j;
        if (bVar != null) {
            bVar.b(str, i10, i11);
        }
    }

    public final void I(String str, int i10) {
        if (!E()) {
            e eVar = this.f25519r;
            eVar.sendMessage(Message.obtain(eVar, 2, i10, 0, str));
            return;
        }
        b bVar = this.f25511j;
        if (bVar != null) {
            bVar.c(str, i10);
        }
    }

    public final void J(String str, long j10) {
        if (!E()) {
            e eVar = this.f25519r;
            eVar.sendMessage(Message.obtain(eVar, 0, ib.c.m(j10), ib.c.n(j10), str));
            return;
        }
        b bVar = this.f25511j;
        if (bVar != null) {
            bVar.f(str, j10);
        }
    }

    public final boolean K() {
        return this.f25514m || this.f25515n || this.X;
    }

    public final void L() {
        Q();
        if (this.X) {
            this.S.t(this.f25515n ? 1 : 0);
        }
    }

    public final void M() {
        EGLSurface eGLSurface;
        if (this.C && (eGLSurface = this.I) != null) {
            if (!this.E.eglMakeCurrent(this.F, eGLSurface, eGLSurface, this.H)) {
                Log.e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                return;
            }
            SurfaceTexture surfaceTexture = this.K;
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.V);
                this.K.setOnFrameAvailableListener(null);
                this.K.release();
                int[] iArr = this.f25526y;
                int[] iArr2 = this.f25525x;
                iArr[0] = iArr2[0];
                this.f25527z = 0.0f;
                iArr2[0] = 0;
            }
            this.R = Integer.valueOf(this.R.intValue() + 1);
            this.f25521t = false;
            GLES20.glGenTextures(1, this.f25525x, 0);
            GLES20.glBindTexture(36197, this.f25525x[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.f25525x[0]);
            this.K = surfaceTexture2;
            surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                @Override
                public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                    k0.this.W(surfaceTexture3);
                }
            });
            F(this.K);
        }
    }

    public final void N(Integer num) {
        a0(num);
    }

    public final void O() {
        if (!D()) {
            Handler handler = this.f25503b;
            handler.sendMessage(Message.obtain(handler, 1));
        }
    }

    public final void P() {
        this.f25502a.V(this);
    }

    public void Q() {
        if (this.I != null) {
            EGL10 egl10 = this.E;
            EGLDisplay eGLDisplay = this.F;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.E.eglDestroySurface(this.F, this.I);
            this.I = null;
        }
        EGLContext eGLContext = this.H;
        if (eGLContext != null) {
            this.E.eglDestroyContext(this.F, eGLContext);
            this.H = null;
        }
        EGLDisplay eGLDisplay2 = this.F;
        if (eGLDisplay2 != null) {
            this.E.eglTerminate(eGLDisplay2);
            this.F = null;
        }
    }

    public void R(String str, boolean z10) {
        Log.i((int) Log.TAG_ROUND, "finishCapture: %s, saveResult: %b, isCapturing: %b", str, Boolean.valueOf(z10), Boolean.valueOf(this.f25514m));
        if (this.f25514m) {
            this.f25515n = z10;
            this.f25514m = false;
            h0();
        }
    }

    public SurfaceTexture S() {
        return this.f25518q;
    }

    public final void T(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            b0();
        } else if (i10 == 1) {
            i0();
        } else if (i10 == 2) {
            G();
        } else if (i10 == 3) {
            Z();
        } else if (i10 == 4) {
            N((Integer) message.obj);
        } else if (i10 == 5) {
            e0(message.arg1, message.arg2, ((Integer) message.obj).intValue());
        }
    }

    public final void U(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            F((SurfaceTexture) message.obj);
        } else if (i10 == 1) {
            O();
        }
    }

    public final boolean V() {
        Log.i((int) Log.TAG_ROUND, "start init gl", new Object[0]);
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.E = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.F = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            Log.e((int) Log.TAG_ROUND, "eglGetDisplay failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
            Q();
            return false;
        } else if (!this.E.eglInitialize(eglGetDisplay, new int[2])) {
            Log.e((int) Log.TAG_ROUND, "eglInitialize failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
            Q();
            return false;
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.E.eglChooseConfig(this.F, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                Log.e((int) Log.TAG_ROUND, "eglChooseConfig failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                Q();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.G = eGLConfig;
                EGLContext eglCreateContext = this.E.eglCreateContext(this.F, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.H = eglCreateContext;
                if (eglCreateContext == null) {
                    Log.e((int) Log.TAG_ROUND, "eglCreateContext failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                    Q();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.D;
                if (surfaceTexture instanceof SurfaceTexture) {
                    EGLSurface eglCreateWindowSurface = this.E.eglCreateWindowSurface(this.F, this.G, surfaceTexture, null);
                    this.I = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        Log.e((int) Log.TAG_ROUND, "createWindowSurface failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                        Q();
                        return false;
                    } else if (!this.E.eglMakeCurrent(this.F, eglCreateWindowSurface, eglCreateWindowSurface, this.H)) {
                        Log.e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                        Q();
                        return false;
                    } else {
                        this.J = this.H.getGL();
                        float f10 = (1.0f / this.A) / 2.0f;
                        float f11 = (1.0f / this.B) / 2.0f;
                        float f12 = 0.5f - f10;
                        float f13 = 0.5f - f11;
                        float f14 = f10 + 0.5f;
                        float f15 = f11 + 0.5f;
                        this.S = new f();
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.f25522u = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f}).position(0);
                        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.f25523v = asFloatBuffer2;
                        asFloatBuffer2.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                        Matrix.setIdentityM(this.U, 0);
                        int Y2 = Y(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                        int Y3 = Y(35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                        if (Y2 == 0 || Y3 == 0) {
                            Log.e((int) Log.TAG_ROUND, "failed creating shader", new Object[0]);
                            Q();
                            return false;
                        }
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.L = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, Y2);
                        GLES20.glAttachShader(this.L, Y3);
                        GLES20.glLinkProgram(this.L);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(this.L, 35714, iArr2, 0);
                        if (iArr2[0] == 0) {
                            Log.e((int) Log.TAG_ROUND, "failed link shader", new Object[0]);
                            GLES20.glDeleteProgram(this.L);
                            this.L = 0;
                        } else {
                            this.O = GLES20.glGetAttribLocation(this.L, "aPosition");
                            this.P = GLES20.glGetAttribLocation(this.L, "aTextureCoord");
                            this.M = GLES20.glGetUniformLocation(this.L, "uMVPMatrix");
                            this.N = GLES20.glGetUniformLocation(this.L, "uSTMatrix");
                        }
                        GLES20.glGenTextures(1, this.f25525x, 0);
                        GLES20.glBindTexture(36197, this.f25525x[0]);
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        Matrix.setIdentityM(this.T, 0);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.f25525x[0]);
                        this.K = surfaceTexture2;
                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                k0.this.X(surfaceTexture3);
                            }
                        });
                        F(this.K);
                        Log.i((int) Log.TAG_ROUND, "gl initied", new Object[0]);
                        return true;
                    }
                } else {
                    Q();
                    return false;
                }
            } else {
                Log.e((int) Log.TAG_ROUND, "eglConfig not initialized", new Object[0]);
                Q();
                return false;
            }
        }
    }

    public void Z() {
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 3));
            return;
        }
        M();
    }

    public final void a0(Integer num) {
        int i10;
        int i11;
        if (this.C && this.I != null) {
            if (!this.H.equals(this.E.eglGetCurrentContext()) || !this.I.equals(this.E.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.E;
                EGLDisplay eGLDisplay = this.F;
                EGLSurface eGLSurface = this.I;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.H)) {
                    Log.e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.E.eglGetError()), new Object[0]);
                    return;
                }
            }
            this.K.updateTexImage();
            if (K()) {
                if (!this.X) {
                    if (i.c2().J2()) {
                        i11 = 320;
                        i10 = 600000;
                    } else {
                        i11 = 240;
                        i10 = 400000;
                    }
                    this.S.s(this.f25520s, i11, i10, EGL14.eglGetCurrentContext());
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.W = uptimeMillis;
                    this.X = true;
                    int i12 = this.Q;
                    if (i12 == 90 || i12 == 270) {
                        float f10 = this.A;
                        this.A = this.B;
                        this.B = f10;
                    }
                    J(this.f25512k, uptimeMillis);
                }
                this.S.m(this.K, num);
            }
            this.K.getTransformMatrix(this.U);
            GLES20.glUseProgram(this.L);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f25525x[0]);
            GLES20.glVertexAttribPointer(this.O, 3, 5126, false, 12, (Buffer) this.f25522u);
            GLES20.glEnableVertexAttribArray(this.O);
            GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.f25523v);
            GLES20.glEnableVertexAttribArray(this.P);
            GLES20.glUniformMatrix4fv(this.N, 1, false, this.U, 0);
            GLES20.glUniformMatrix4fv(this.M, 1, false, this.T, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.O);
            GLES20.glDisableVertexAttribArray(this.P);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.E.eglSwapBuffers(this.F, this.I);
        }
    }

    public void b0() {
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 0));
            return;
        }
        c0();
    }

    public final void c0() {
        j0();
        this.C = V();
    }

    public final void d0() {
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 4, this.R));
            return;
        }
        N(this.R);
    }

    public void e0(int i10, int i11, int i12) {
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 5, i10, i11, Integer.valueOf(i12)));
        } else if (this.f25508g == 0 && this.f25509h == 0) {
            this.f25508g = i10;
            this.f25509h = i11;
            this.f25510i = i12;
            j0();
        }
    }

    public void f0(b bVar, String str, String str2) {
        boolean z10;
        Log.i((int) Log.TAG_ROUND, "startCapture: %s, path: %s, isCapturing: %b", str, str2, Boolean.valueOf(this.f25514m));
        if (!this.f25514m) {
            this.f25514m = true;
            this.f25511j = bVar;
            this.f25512k = str;
            this.f25513l = str2;
            try {
                z10 = g0();
            } catch (Throwable th) {
                Log.w(Log.TAG_ROUND, "Cannot start round video capture", th, new Object[0]);
                z10 = false;
            }
            if (!z10) {
                this.f25514m = false;
            }
        }
    }

    public final boolean g0() {
        this.f25520s = new File(this.f25513l);
        O();
        return true;
    }

    public final void h0() {
        G();
    }

    public void i0() {
        this.f25516o = true;
        if (!C()) {
            Handler handler = this.f25504c;
            handler.sendMessage(Message.obtain(handler, 1));
            return;
        }
        P();
    }

    public final void j0() {
        int i10 = this.f25508g;
        int i11 = this.f25509h;
        int min = Math.min(i10, i11);
        int i12 = this.f25506e;
        float f10 = i12 / min;
        int i13 = (int) (i10 * f10);
        int i14 = (int) (i11 * f10);
        if (i13 > i14) {
            this.A = 1.0f;
            this.B = i13 / this.f25507f;
        } else {
            this.A = i14 / i12;
            this.B = 1.0f;
        }
        if (!v0.x1(this.f25510i)) {
            float f11 = this.A;
            this.A = this.B;
            this.B = f11;
        }
        this.Q = this.f25510i;
        this.D = this.f25505d;
        Matrix.setIdentityM(this.T, 0);
        int i15 = this.Q;
        if (i15 != 0) {
            Matrix.rotateM(this.T, 0, i15, 0.0f, 0.0f, 1.0f);
        }
    }
}
