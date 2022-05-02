package p292ud;

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
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import be.C1379j0;
import ee.AbstractC4186b;
import ge.C4868i;
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
import ke.AbstractC6268a;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.video.old.C7928a;
import org.thunderdog.challegram.video.old.Mp4OutputImpl;
import p108hb.C5063c;
import p292ud.C9758l0;

@TargetApi(18)
public class C9758l0 {
    public static final int[] f31810Y = {44100, 22050, 11025, 8000};
    public float f31811A;
    public float f31812B;
    public boolean f31813C;
    public SurfaceTexture f31814D;
    public EGL10 f31815E;
    public EGLDisplay f31816F;
    public EGLConfig f31817G;
    public EGLContext f31818H;
    public EGLSurface f31819I;
    public GL f31820J;
    public SurfaceTexture f31821K;
    public int f31822L;
    public int f31823M;
    public int f31824N;
    public int f31825O;
    public int f31826P;
    public int f31827Q;
    public RunnableC9764f f31829S;
    public long f31833W;
    public boolean f31834X;
    public final AbstractC4186b f31835a;
    public final Handler f31836b;
    public final Handler f31837c;
    public final SurfaceTexture f31838d;
    public final int f31839e;
    public final int f31840f;
    public int f31841g;
    public int f31842h;
    public int f31843i;
    public AbstractC9760b f31844j;
    public String f31845k;
    public String f31846l;
    public volatile boolean f31847m;
    public volatile boolean f31848n;
    public volatile boolean f31849o;
    public boolean f31850p;
    public SurfaceTexture f31851q;
    public File f31853s;
    public volatile boolean f31854t;
    public FloatBuffer f31855u;
    public FloatBuffer f31856v;
    public final HandlerC9763e f31852r = new HandlerC9763e(this);
    public int[] f31857w = new int[2];
    public int[] f31858x = new int[1];
    public int[] f31859y = new int[1];
    public float f31860z = 1.0f;
    public Integer f31828R = 0;
    public float[] f31830T = new float[16];
    public float[] f31831U = new float[16];
    public float[] f31832V = new float[16];

    public static class C9759a {
        public byte[] f31861a;
        public long[] f31862b;
        public int[] f31863c;
        public int f31864d;
        public int f31865e;
        public boolean f31866f;

        public C9759a() {
            this.f31861a = new byte[20480];
            this.f31862b = new long[10];
            this.f31863c = new int[10];
        }
    }

    public interface AbstractC9760b {
        void mo6913b(String str, int i, int i2);

        void mo6910c(String str, int i);

        void mo6897g(String str, long j);
    }

    public static class HandlerC9761c extends Handler {
        public WeakReference<RunnableC9764f> f31867a;

        public HandlerC9761c(RunnableC9764f fVar) {
            this.f31867a = new WeakReference<>(fVar);
        }

        public void m7141a() {
            Looper.myLooper().quit();
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            RunnableC9764f fVar = this.f31867a.get();
            if (fVar != null) {
                if (i == 0) {
                    try {
                        Log.m14721i((int) Log.TAG_ROUND, "start encoder", new Object[0]);
                        fVar.m7123r();
                    } catch (Exception e) {
                        Log.m14728e(Log.TAG_ROUND, "Error", e, new Object[0]);
                        fVar.m7126o(0);
                        Looper.myLooper().quit();
                    }
                } else if (i == 1) {
                    Log.m14721i((int) Log.TAG_ROUND, "stop encoder", new Object[0]);
                    fVar.m7126o(message.arg1);
                } else if (i == 2) {
                    fVar.m7125p((message.arg1 << 32) | (message.arg2 & 4294967295L), (Integer) message.obj);
                } else if (i == 3) {
                    fVar.m7127n((C9759a) message.obj);
                }
            }
        }
    }

    public static class HandlerC9762d extends Handler {
        public final C9758l0 f31868a;
        public final boolean f31869b;

        public HandlerC9762d(Looper looper, C9758l0 l0Var, boolean z) {
            super(looper);
            this.f31868a = l0Var;
            this.f31869b = z;
        }

        @Override
        public void handleMessage(Message message) {
            if (this.f31869b) {
                this.f31868a.m7184T(message);
            } else {
                this.f31868a.m7183U(message);
            }
        }
    }

    public static class HandlerC9763e extends Handler {
        public final C9758l0 f31870a;

        public HandlerC9763e(C9758l0 l0Var) {
            super(Looper.getMainLooper());
            this.f31870a = l0Var;
        }

        @Override
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f31870a.m7194J((String) message.obj, C5063c.m24141f(message.arg1, message.arg2));
            } else if (i == 1) {
                this.f31870a.m7196H((String) message.obj, message.arg1, message.arg2);
            } else if (i == 2) {
                this.f31870a.m7195I((String) message.obj, message.arg1);
            }
        }
    }

    public class RunnableC9764f implements Runnable {
        public boolean f31871A0;
        public long f31872B0;
        public int f31874M;
        public boolean f31875N;
        public boolean f31876O;
        public Surface f31877P;
        public android.opengl.EGLDisplay f31878Q;
        public android.opengl.EGLContext f31879R;
        public android.opengl.EGLContext f31880S;
        public android.opengl.EGLConfig f31881T;
        public android.opengl.EGLSurface f31882U;
        public MediaCodec f31883V;
        public MediaCodec f31884W;
        public MediaCodec.BufferInfo f31885X;
        public MediaCodec.BufferInfo f31886Y;
        public AbstractC6268a f31887Z;
        public File f31888a;
        public ArrayList<C9759a> f31889a0;
        public int f31890b;
        public int f31891b0;
        public int f31892c;
        public int f31893c0;
        public long f31894d0;
        public long f31895e0;
        public long f31896f0;
        public long f31897g0;
        public volatile HandlerC9761c f31898h0;
        public final Object f31899i0;
        public boolean f31900j0;
        public volatile boolean f31901k0;
        public volatile int f31902l0;
        public long f31903m0;
        public boolean f31904n0;
        public int f31905o0;
        public int f31906p0;
        public int f31907q0;
        public int f31908r0;
        public int f31909s0;
        public int f31910t0;
        public int f31911u0;
        public int f31912v0;
        public Integer f31913w0;
        public AudioRecord f31914x0;
        public ArrayBlockingQueue<C9759a> f31915y0;
        public Runnable f31916z0;

        public class RunnableC9765a implements Runnable {
            public RunnableC9765a() {
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: p292ud.C9758l0.RunnableC9764f.RunnableC9765a.run():void");
            }
        }

        public RunnableC9764f() {
            this.f31875N = true;
            this.f31878Q = EGL14.EGL_NO_DISPLAY;
            this.f31879R = EGL14.EGL_NO_CONTEXT;
            this.f31882U = EGL14.EGL_NO_SURFACE;
            this.f31889a0 = new ArrayList<>();
            this.f31891b0 = -5;
            this.f31893c0 = -5;
            this.f31895e0 = -1L;
            this.f31896f0 = 0L;
            this.f31897g0 = -1L;
            this.f31899i0 = new Object();
            this.f31913w0 = 0;
            this.f31915y0 = new ArrayBlockingQueue<>(10);
            this.f31916z0 = new RunnableC9765a();
        }

        public void m7124q() {
            m7130k(this.f31888a, true);
        }

        public void finalize() {
            try {
                android.opengl.EGLDisplay eGLDisplay = this.f31878Q;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(this.f31878Q, this.f31879R);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(this.f31878Q);
                    this.f31878Q = EGL14.EGL_NO_DISPLAY;
                    this.f31879R = EGL14.EGL_NO_CONTEXT;
                    this.f31881T = null;
                }
            } finally {
                super.finalize();
            }
        }

        public final void m7130k(File file, boolean z) {
            if (this.f31875N) {
                this.f31875N = false;
            } else if (z) {
                C9758l0 l0Var = C9758l0.this;
                l0Var.m7196H(l0Var.f31845k, (int) file.length(), (int) Math.round((SystemClock.uptimeMillis() - C9758l0.this.f31833W) / 1000.0d));
            } else {
                C9758l0 l0Var2 = C9758l0.this;
                l0Var2.m7195I(l0Var2.f31845k, (int) file.length());
            }
        }

        public void m7129l(boolean r17) {
            throw new UnsupportedOperationException("Method not decompiled: p292ud.C9758l0.RunnableC9764f.m7129l(boolean):void");
        }

        public void m7128m(SurfaceTexture surfaceTexture, Integer num) {
            synchronized (this.f31899i0) {
                if (this.f31900j0) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp != 0) {
                        this.f31898h0.sendMessage(this.f31898h0.obtainMessage(2, (int) (timestamp >> 32), (int) timestamp, num));
                    }
                }
            }
        }

        public final void m7127n(C9759a aVar) {
            ByteBuffer byteBuffer;
            C9759a aVar2 = aVar;
            if (this.f31895e0 == -1) {
                this.f31895e0 = aVar2.f31862b[0];
            }
            this.f31889a0.add(aVar2);
            if (this.f31889a0.size() > 1) {
                aVar2 = this.f31889a0.get(0);
            }
            C9759a aVar3 = aVar2;
            try {
                m7129l(false);
            } catch (Exception e) {
                Log.m14728e(Log.TAG_ROUND, "Error", e, new Object[0]);
            }
            boolean z = false;
            while (aVar3 != null) {
                try {
                    long j = 0;
                    int dequeueInputBuffer = this.f31884W.dequeueInputBuffer(0L);
                    if (dequeueInputBuffer >= 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.f31884W.getInputBuffer(dequeueInputBuffer);
                        } else {
                            byteBuffer = this.f31884W.getInputBuffers()[dequeueInputBuffer];
                            byteBuffer.clear();
                        }
                        long[] jArr = aVar3.f31862b;
                        int i = aVar3.f31865e;
                        long j2 = jArr[i];
                        while (true) {
                            int i2 = aVar3.f31864d;
                            if (i > i2) {
                                break;
                            }
                            if (i < i2) {
                                int remaining = byteBuffer.remaining();
                                int[] iArr = aVar3.f31863c;
                                if (remaining < iArr[i]) {
                                    aVar3.f31865e = i;
                                    break;
                                }
                                byteBuffer.put(aVar3.f31861a, i * Log.TAG_VOICE, iArr[i]);
                            }
                            if (i >= aVar3.f31864d - 1) {
                                this.f31889a0.remove(aVar3);
                                if (this.f31901k0) {
                                    this.f31915y0.put(aVar3);
                                }
                                if (this.f31889a0.isEmpty()) {
                                    z = aVar3.f31866f;
                                    break;
                                }
                                aVar3 = this.f31889a0.get(0);
                            }
                            i++;
                        }
                        aVar3 = null;
                        MediaCodec mediaCodec = this.f31884W;
                        int position = byteBuffer.position();
                        if (j2 != 0) {
                            j = (j2 - this.f31895e0) / 1000;
                        }
                        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, position, j, z ? 4 : 0);
                    }
                } catch (Throwable th) {
                    Log.m14728e(Log.TAG_ROUND, "Error", th, new Object[0]);
                    return;
                }
            }
        }

        public final void m7126o(int i) {
            if (this.f31901k0) {
                this.f31902l0 = i;
                this.f31901k0 = false;
                return;
            }
            try {
                m7129l(true);
            } catch (Exception e) {
                Log.m14728e(Log.TAG_ROUND, "Error", e, new Object[0]);
            }
            MediaCodec mediaCodec = this.f31883V;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                    this.f31883V.release();
                    this.f31883V = null;
                } catch (Exception e2) {
                    Log.m14728e(Log.TAG_ROUND, "Error", e2, new Object[0]);
                }
            }
            MediaCodec mediaCodec2 = this.f31884W;
            if (mediaCodec2 != null) {
                try {
                    mediaCodec2.stop();
                    this.f31884W.release();
                    this.f31884W = null;
                } catch (Exception e3) {
                    Log.m14728e(Log.TAG_ROUND, "Error", e3, new Object[0]);
                }
            }
            AbstractC6268a aVar = this.f31887Z;
            if (aVar != null) {
                try {
                    aVar.mo14120b();
                } catch (Exception e4) {
                    Log.m14728e(Log.TAG_ROUND, "Error", e4, new Object[0]);
                }
            }
            if (i != 0) {
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C9758l0.RunnableC9764f.this.m7124q();
                    }
                });
            } else {
                this.f31888a.delete();
                C9758l0 l0Var = C9758l0.this;
                l0Var.m7196H(l0Var.f31845k, -1, -1);
            }
            EGL14.eglDestroySurface(this.f31878Q, this.f31882U);
            this.f31882U = EGL14.EGL_NO_SURFACE;
            Surface surface = this.f31877P;
            if (surface != null) {
                surface.release();
                this.f31877P = null;
            }
            android.opengl.EGLDisplay eGLDisplay = this.f31878Q;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                android.opengl.EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f31878Q, this.f31879R);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.f31878Q);
            }
            this.f31878Q = EGL14.EGL_NO_DISPLAY;
            this.f31879R = EGL14.EGL_NO_CONTEXT;
            this.f31881T = null;
            this.f31898h0.m7141a();
        }

        public final void m7125p(long r11, java.lang.Integer r13) {
            throw new UnsupportedOperationException("Method not decompiled: p292ud.C9758l0.RunnableC9764f.m7125p(long, java.lang.Integer):void");
        }

        public final void m7123r() {
            int i;
            Throwable th;
            int i2;
            for (int i3 = 0; i3 < 3; i3++) {
                try {
                    this.f31915y0.add(new C9759a());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            int i4 = C9758l0.f31810Y[0];
            int[] iArr = C9758l0.f31810Y;
            int length = iArr.length;
            AudioRecord audioRecord = null;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                int i6 = iArr[i5];
                int minBufferSize = AudioRecord.getMinBufferSize(i6, 16, 2);
                if (minBufferSize <= 0) {
                    minBufferSize = 3584;
                }
                try {
                    i = i6;
                    try {
                        AudioRecord audioRecord2 = new AudioRecord(1, i, 16, 2, 49152 < minBufferSize ? ((minBufferSize / Log.TAG_VOICE) + 1) * Log.TAG_VOICE * 2 : 49152);
                        try {
                            audioRecord2.startRecording();
                            audioRecord = audioRecord2;
                            this.f31914x0 = audioRecord;
                            i4 = i;
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
                            i2 = i;
                            if (i2 != C9758l0.f31810Y[C9758l0.f31810Y.length - 1]) {
                                i5++;
                                i4 = i2;
                            } else {
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i = i6;
                }
                i5++;
                i4 = i2;
            }
            if (this.f31914x0 != null) {
                new Thread(this.f31916z0).start();
                this.f31886Y = new MediaCodec.BufferInfo();
                this.f31885X = new MediaCodec.BufferInfo();
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("aac-profile", 2);
                mediaFormat.setInteger("sample-rate", i4);
                mediaFormat.setInteger("channel-count", 1);
                mediaFormat.setInteger("bitrate", 32000);
                mediaFormat.setInteger("max-input-size", 20480);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
                this.f31884W = createEncoderByType;
                createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f31884W.start();
                this.f31883V = MediaCodec.createEncoderByType("video/avc");
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f31890b, this.f31892c);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("bitrate", this.f31874M);
                createVideoFormat.setInteger("frame-rate", 30);
                createVideoFormat.setInteger("i-frame-interval", 1);
                this.f31883V.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.f31877P = this.f31883V.createInputSurface();
                this.f31883V.start();
                C7928a aVar = new C7928a();
                aVar.m14098f(this.f31888a);
                aVar.m14097g(0);
                aVar.m14096h(this.f31890b, this.f31892c);
                this.f31887Z = new Mp4OutputImpl().m14116f(aVar);
                C9758l0.this.m7189O();
                if (this.f31878Q == EGL14.EGL_NO_DISPLAY) {
                    android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    this.f31878Q = eglGetDisplay;
                    if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                        int[] iArr2 = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                            if (this.f31879R == EGL14.EGL_NO_CONTEXT) {
                                android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                                if (EGL14.eglChooseConfig(this.f31878Q, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                                    this.f31879R = EGL14.eglCreateContext(this.f31878Q, eGLConfigArr[0], this.f31880S, new int[]{12440, 2, 12344}, 0);
                                    this.f31881T = eGLConfigArr[0];
                                } else {
                                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                                }
                            }
                            EGL14.eglQueryContext(this.f31878Q, this.f31879R, 12440, new int[1], 0);
                            if (this.f31882U == EGL14.EGL_NO_SURFACE) {
                                android.opengl.EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f31878Q, this.f31881T, this.f31877P, new int[]{12344}, 0);
                                this.f31882U = eglCreateWindowSurface;
                                if (eglCreateWindowSurface == null) {
                                    throw new RuntimeException("surface was null");
                                } else if (EGL14.eglMakeCurrent(this.f31878Q, eglCreateWindowSurface, eglCreateWindowSurface, this.f31879R)) {
                                    GLES20.glBlendFunc(770, 771);
                                    int Y = C9758l0.m7179Y(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                                    int Y2 = C9758l0.m7179Y(35632, "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float scaleX;\nuniform float scaleY;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 coord = vec2((vTextureCoord.x - 0.5) * scaleX, (vTextureCoord.y - 0.5) * scaleY);\n   float coef = ceil(clamp(0.2601 - dot(coord, coord), 0.0, 1.0));\n   vec3 color = texture2D(sTexture, vTextureCoord).rgb * coef + (1.0 - step(0.001, coef));\n   gl_FragColor = vec4(color * alpha, alpha);\n}\n");
                                    if (!(Y == 0 || Y2 == 0)) {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.f31905o0 = glCreateProgram;
                                        GLES20.glAttachShader(glCreateProgram, Y);
                                        GLES20.glAttachShader(this.f31905o0, Y2);
                                        GLES20.glLinkProgram(this.f31905o0);
                                        int[] iArr3 = new int[1];
                                        GLES20.glGetProgramiv(this.f31905o0, 35714, iArr3, 0);
                                        if (iArr3[0] == 0) {
                                            GLES20.glDeleteProgram(this.f31905o0);
                                            this.f31905o0 = 0;
                                            return;
                                        }
                                        this.f31908r0 = GLES20.glGetAttribLocation(this.f31905o0, "aPosition");
                                        this.f31909s0 = GLES20.glGetAttribLocation(this.f31905o0, "aTextureCoord");
                                        this.f31910t0 = GLES20.glGetUniformLocation(this.f31905o0, "scaleX");
                                        this.f31911u0 = GLES20.glGetUniformLocation(this.f31905o0, "scaleY");
                                        this.f31912v0 = GLES20.glGetUniformLocation(this.f31905o0, "alpha");
                                        this.f31906p0 = GLES20.glGetUniformLocation(this.f31905o0, "uMVPMatrix");
                                        this.f31907q0 = GLES20.glGetUniformLocation(this.f31905o0, "uSTMatrix");
                                    }
                                } else {
                                    Log.m14727e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()), new Object[0]);
                                    throw new RuntimeException("eglMakeCurrent failed");
                                }
                            } else {
                                throw new IllegalStateException("surface already created");
                            }
                        } else {
                            this.f31878Q = null;
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
            synchronized (this.f31899i0) {
                this.f31898h0 = new HandlerC9761c(this);
                this.f31900j0 = true;
                this.f31899i0.notify();
            }
            Looper.loop();
            synchronized (this.f31899i0) {
                this.f31900j0 = false;
            }
        }

        public void m7122s(File file, int i, int i2, android.opengl.EGLContext eGLContext) {
            this.f31888a = file;
            this.f31890b = i;
            this.f31892c = i;
            this.f31874M = i2;
            this.f31880S = eGLContext;
            synchronized (this.f31899i0) {
                if (!this.f31901k0) {
                    this.f31901k0 = true;
                    new Thread(this, "TextureMovieEncoder").start();
                    while (!this.f31900j0) {
                        try {
                            this.f31899i0.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    this.f31898h0.sendMessage(this.f31898h0.obtainMessage(0));
                }
            }
        }

        public void m7121t(int i) {
            this.f31898h0.sendMessage(this.f31898h0.obtainMessage(1, i, 0));
        }
    }

    public C9758l0(AbstractC4186b bVar, SurfaceTexture surfaceTexture, int i, int i2) {
        this.f31835a = bVar;
        this.f31836b = new HandlerC9762d(bVar.m28568r().getLooper(), this, false);
        this.f31837c = new HandlerC9762d(bVar.m28570q().getLooper(), this, true);
        this.f31838d = surfaceTexture;
        this.f31839e = i;
        this.f31840f = i2;
    }

    public static boolean m7199E() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void m7181W(SurfaceTexture surfaceTexture) {
        m7170d0();
    }

    public void m7180X(SurfaceTexture surfaceTexture) {
        m7170d0();
    }

    public static int m7179Y(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m14727e((int) Log.TAG_ROUND, GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean m7202B() {
        return !this.f31849o && this.f31813C && this.f31819I != null;
    }

    public final boolean m7201C() {
        return this.f31835a.m28591f();
    }

    public final boolean m7200D() {
        return this.f31835a.m28587h();
    }

    public final void m7198F(SurfaceTexture surfaceTexture) {
        if (!m7200D()) {
            Handler handler = this.f31836b;
            handler.sendMessage(Message.obtain(handler, 0, surfaceTexture));
            return;
        }
        surfaceTexture.setDefaultBufferSize(this.f31841g, this.f31842h);
        this.f31851q = surfaceTexture;
        this.f31835a.m28604V(this);
    }

    public void m7197G() {
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 2));
        } else if (!this.f31850p) {
            this.f31850p = true;
            m7192L();
        }
    }

    public final void m7196H(String str, int i, int i2) {
        if (!m7199E()) {
            HandlerC9763e eVar = this.f31852r;
            eVar.sendMessage(Message.obtain(eVar, 1, i, i2, str));
            return;
        }
        AbstractC9760b bVar = this.f31844j;
        if (bVar != null) {
            bVar.mo6913b(str, i, i2);
        }
    }

    public final void m7195I(String str, int i) {
        if (!m7199E()) {
            HandlerC9763e eVar = this.f31852r;
            eVar.sendMessage(Message.obtain(eVar, 2, i, 0, str));
            return;
        }
        AbstractC9760b bVar = this.f31844j;
        if (bVar != null) {
            bVar.mo6910c(str, i);
        }
    }

    public final void m7194J(String str, long j) {
        if (!m7199E()) {
            HandlerC9763e eVar = this.f31852r;
            eVar.sendMessage(Message.obtain(eVar, 0, C5063c.m24134m(j), C5063c.m24133n(j), str));
            return;
        }
        AbstractC9760b bVar = this.f31844j;
        if (bVar != null) {
            bVar.mo6897g(str, j);
        }
    }

    public final boolean m7193K() {
        return this.f31847m || this.f31848n || this.f31834X;
    }

    public final void m7192L() {
        m7187Q();
        if (this.f31834X) {
            this.f31829S.m7121t(this.f31848n ? 1 : 0);
        }
    }

    public final void m7191M() {
        EGLSurface eGLSurface;
        if (this.f31813C && (eGLSurface = this.f31819I) != null) {
            if (!this.f31815E.eglMakeCurrent(this.f31816F, eGLSurface, eGLSurface, this.f31818H)) {
                Log.m14727e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                return;
            }
            SurfaceTexture surfaceTexture = this.f31821K;
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f31832V);
                this.f31821K.setOnFrameAvailableListener(null);
                this.f31821K.release();
                int[] iArr = this.f31859y;
                int[] iArr2 = this.f31858x;
                iArr[0] = iArr2[0];
                this.f31860z = 0.0f;
                iArr2[0] = 0;
            }
            this.f31828R = Integer.valueOf(this.f31828R.intValue() + 1);
            this.f31854t = false;
            GLES20.glGenTextures(1, this.f31858x, 0);
            GLES20.glBindTexture(36197, this.f31858x[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.f31858x[0]);
            this.f31821K = surfaceTexture2;
            surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                @Override
                public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                    C9758l0.this.m7181W(surfaceTexture3);
                }
            });
            m7198F(this.f31821K);
        }
    }

    public final void m7190N(Integer num) {
        m7176a0(num);
    }

    public final void m7189O() {
        if (!m7200D()) {
            Handler handler = this.f31836b;
            handler.sendMessage(Message.obtain(handler, 1));
        }
    }

    public final void m7188P() {
        this.f31835a.m28604V(this);
    }

    public void m7187Q() {
        if (this.f31819I != null) {
            EGL10 egl10 = this.f31815E;
            EGLDisplay eGLDisplay = this.f31816F;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f31815E.eglDestroySurface(this.f31816F, this.f31819I);
            this.f31819I = null;
        }
        EGLContext eGLContext = this.f31818H;
        if (eGLContext != null) {
            this.f31815E.eglDestroyContext(this.f31816F, eGLContext);
            this.f31818H = null;
        }
        EGLDisplay eGLDisplay2 = this.f31816F;
        if (eGLDisplay2 != null) {
            this.f31815E.eglTerminate(eGLDisplay2);
            this.f31816F = null;
        }
    }

    public void m7186R(String str, boolean z) {
        Log.m14721i((int) Log.TAG_ROUND, "finishCapture: %s, saveResult: %b, isCapturing: %b", str, Boolean.valueOf(z), Boolean.valueOf(this.f31847m));
        if (this.f31847m) {
            this.f31848n = z;
            this.f31847m = false;
            m7162h0();
        }
    }

    public SurfaceTexture m7185S() {
        return this.f31851q;
    }

    public final void m7184T(Message message) {
        int i = message.what;
        if (i == 0) {
            m7174b0();
        } else if (i == 1) {
            m7160i0();
        } else if (i == 2) {
            m7197G();
        } else if (i == 3) {
            m7178Z();
        } else if (i == 4) {
            m7190N((Integer) message.obj);
        } else if (i == 5) {
            m7168e0(message.arg1, message.arg2, ((Integer) message.obj).intValue());
        }
    }

    public final void m7183U(Message message) {
        int i = message.what;
        if (i == 0) {
            m7198F((SurfaceTexture) message.obj);
        } else if (i == 1) {
            m7189O();
        }
    }

    public final boolean m7182V() {
        Log.m14721i((int) Log.TAG_ROUND, "start init gl", new Object[0]);
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f31815E = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f31816F = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            Log.m14727e((int) Log.TAG_ROUND, "eglGetDisplay failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
            m7187Q();
            return false;
        } else if (!this.f31815E.eglInitialize(eglGetDisplay, new int[2])) {
            Log.m14727e((int) Log.TAG_ROUND, "eglInitialize failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
            m7187Q();
            return false;
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f31815E.eglChooseConfig(this.f31816F, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                Log.m14727e((int) Log.TAG_ROUND, "eglChooseConfig failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                m7187Q();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f31817G = eGLConfig;
                EGLContext eglCreateContext = this.f31815E.eglCreateContext(this.f31816F, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f31818H = eglCreateContext;
                if (eglCreateContext == null) {
                    Log.m14727e((int) Log.TAG_ROUND, "eglCreateContext failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                    m7187Q();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.f31814D;
                if (surfaceTexture instanceof SurfaceTexture) {
                    EGLSurface eglCreateWindowSurface = this.f31815E.eglCreateWindowSurface(this.f31816F, this.f31817G, surfaceTexture, null);
                    this.f31819I = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        Log.m14727e((int) Log.TAG_ROUND, "createWindowSurface failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                        m7187Q();
                        return false;
                    } else if (!this.f31815E.eglMakeCurrent(this.f31816F, eglCreateWindowSurface, eglCreateWindowSurface, this.f31818H)) {
                        Log.m14727e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                        m7187Q();
                        return false;
                    } else {
                        this.f31820J = this.f31818H.getGL();
                        float f = (1.0f / this.f31811A) / 2.0f;
                        float f2 = (1.0f / this.f31812B) / 2.0f;
                        float f3 = 0.5f - f;
                        float f4 = 0.5f - f2;
                        float f5 = f + 0.5f;
                        float f6 = f2 + 0.5f;
                        this.f31829S = new RunnableC9764f();
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.f31855u = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f}).position(0);
                        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.f31856v = asFloatBuffer2;
                        asFloatBuffer2.put(new float[]{f3, f4, f5, f4, f3, f6, f5, f6}).position(0);
                        Matrix.setIdentityM(this.f31831U, 0);
                        int Y = m7179Y(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                        int Y2 = m7179Y(35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                        if (Y == 0 || Y2 == 0) {
                            Log.m14727e((int) Log.TAG_ROUND, "failed creating shader", new Object[0]);
                            m7187Q();
                            return false;
                        }
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f31822L = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, Y);
                        GLES20.glAttachShader(this.f31822L, Y2);
                        GLES20.glLinkProgram(this.f31822L);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(this.f31822L, 35714, iArr2, 0);
                        if (iArr2[0] == 0) {
                            Log.m14727e((int) Log.TAG_ROUND, "failed link shader", new Object[0]);
                            GLES20.glDeleteProgram(this.f31822L);
                            this.f31822L = 0;
                        } else {
                            this.f31825O = GLES20.glGetAttribLocation(this.f31822L, "aPosition");
                            this.f31826P = GLES20.glGetAttribLocation(this.f31822L, "aTextureCoord");
                            this.f31823M = GLES20.glGetUniformLocation(this.f31822L, "uMVPMatrix");
                            this.f31824N = GLES20.glGetUniformLocation(this.f31822L, "uSTMatrix");
                        }
                        GLES20.glGenTextures(1, this.f31858x, 0);
                        GLES20.glBindTexture(36197, this.f31858x[0]);
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        Matrix.setIdentityM(this.f31830T, 0);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.f31858x[0]);
                        this.f31821K = surfaceTexture2;
                        surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {
                            @Override
                            public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                C9758l0.this.m7180X(surfaceTexture3);
                            }
                        });
                        m7198F(this.f31821K);
                        Log.m14721i((int) Log.TAG_ROUND, "gl initied", new Object[0]);
                        return true;
                    }
                } else {
                    m7187Q();
                    return false;
                }
            } else {
                Log.m14727e((int) Log.TAG_ROUND, "eglConfig not initialized", new Object[0]);
                m7187Q();
                return false;
            }
        }
    }

    public void m7178Z() {
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 3));
            return;
        }
        m7191M();
    }

    public final void m7176a0(Integer num) {
        int i;
        int i2;
        if (this.f31813C && this.f31819I != null) {
            if (!this.f31818H.equals(this.f31815E.eglGetCurrentContext()) || !this.f31819I.equals(this.f31815E.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f31815E;
                EGLDisplay eGLDisplay = this.f31816F;
                EGLSurface eGLSurface = this.f31819I;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f31818H)) {
                    Log.m14727e((int) Log.TAG_ROUND, "eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f31815E.eglGetError()), new Object[0]);
                    return;
                }
            }
            this.f31821K.updateTexImage();
            if (m7193K()) {
                if (!this.f31834X) {
                    if (C4868i.m24727c2().m24862J2()) {
                        i2 = 320;
                        i = 600000;
                    } else {
                        i2 = 240;
                        i = 400000;
                    }
                    this.f31829S.m7122s(this.f31853s, i2, i, EGL14.eglGetCurrentContext());
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f31833W = uptimeMillis;
                    this.f31834X = true;
                    int i3 = this.f31827Q;
                    if (i3 == 90 || i3 == 270) {
                        float f = this.f31811A;
                        this.f31811A = this.f31812B;
                        this.f31812B = f;
                    }
                    m7194J(this.f31845k, uptimeMillis);
                }
                this.f31829S.m7128m(this.f31821K, num);
            }
            this.f31821K.getTransformMatrix(this.f31831U);
            GLES20.glUseProgram(this.f31822L);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f31858x[0]);
            GLES20.glVertexAttribPointer(this.f31825O, 3, 5126, false, 12, (Buffer) this.f31855u);
            GLES20.glEnableVertexAttribArray(this.f31825O);
            GLES20.glVertexAttribPointer(this.f31826P, 2, 5126, false, 8, (Buffer) this.f31856v);
            GLES20.glEnableVertexAttribArray(this.f31826P);
            GLES20.glUniformMatrix4fv(this.f31824N, 1, false, this.f31831U, 0);
            GLES20.glUniformMatrix4fv(this.f31823M, 1, false, this.f31830T, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f31825O);
            GLES20.glDisableVertexAttribArray(this.f31826P);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.f31815E.eglSwapBuffers(this.f31816F, this.f31819I);
        }
    }

    public void m7174b0() {
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 0));
            return;
        }
        m7172c0();
    }

    public final void m7172c0() {
        m7158j0();
        this.f31813C = m7182V();
    }

    public final void m7170d0() {
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 4, this.f31828R));
            return;
        }
        m7190N(this.f31828R);
    }

    public void m7168e0(int i, int i2, int i3) {
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 5, i, i2, Integer.valueOf(i3)));
        } else if (this.f31841g == 0 && this.f31842h == 0) {
            this.f31841g = i;
            this.f31842h = i2;
            this.f31843i = i3;
            m7158j0();
        }
    }

    public void m7166f0(AbstractC9760b bVar, String str, String str2) {
        boolean z;
        Log.m14721i((int) Log.TAG_ROUND, "startCapture: %s, path: %s, isCapturing: %b", str, str2, Boolean.valueOf(this.f31847m));
        if (!this.f31847m) {
            this.f31847m = true;
            this.f31844j = bVar;
            this.f31845k = str;
            this.f31846l = str2;
            try {
                z = m7164g0();
            } catch (Throwable th) {
                Log.m14712w(Log.TAG_ROUND, "Cannot start round video capture", th, new Object[0]);
                z = false;
            }
            if (!z) {
                this.f31847m = false;
            }
        }
    }

    public final boolean m7164g0() {
        this.f31853s = new File(this.f31846l);
        m7189O();
        return true;
    }

    public final void m7162h0() {
        m7197G();
    }

    public void m7160i0() {
        this.f31849o = true;
        if (!m7201C()) {
            Handler handler = this.f31837c;
            handler.sendMessage(Message.obtain(handler, 1));
            return;
        }
        m7188P();
    }

    public final void m7158j0() {
        int i = this.f31841g;
        int i2 = this.f31842h;
        int min = Math.min(i, i2);
        int i3 = this.f31839e;
        float f = i3 / min;
        int i4 = (int) (i * f);
        int i5 = (int) (i2 * f);
        if (i4 > i5) {
            this.f31811A = 1.0f;
            this.f31812B = i4 / this.f31840f;
        } else {
            this.f31811A = i5 / i3;
            this.f31812B = 1.0f;
        }
        if (!C7389v0.m16564x1(this.f31843i)) {
            float f2 = this.f31811A;
            this.f31811A = this.f31812B;
            this.f31812B = f2;
        }
        this.f31827Q = this.f31843i;
        this.f31814D = this.f31838d;
        Matrix.setIdentityM(this.f31830T, 0);
        int i6 = this.f31827Q;
        if (i6 != 0) {
            Matrix.rotateM(this.f31830T, 0, i6, 0.0f, 0.0f, 1.0f);
        }
    }
}
