package c5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] Q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLDisplay M;
    public EGLContext N;
    public EGLSurface O;
    public SurfaceTexture P;
    public final Handler f4834a;
    public final int[] f4835b;
    public final c f4836c;

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public interface c {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, Q, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new b(l0.z("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.g();
    }

    public static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public final void d() {
        c cVar = this.f4836c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) c5.a.e(this.P);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.M = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.M, a10, i10);
        this.N = b10;
        this.O = c(this.M, a10, b10, i10);
        e(this.f4835b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4835b[0]);
        this.P = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f4834a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.P;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f4835b, 0);
            }
            EGLDisplay eGLDisplay = this.M;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.M;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.O;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.M, this.O);
            }
            EGLContext eGLContext = this.N;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.M, eGLContext);
            }
            if (l0.f4841a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.M;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.M);
            }
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.M;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.M;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.O;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.M, this.O);
            }
            EGLContext eGLContext2 = this.N;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.M, eGLContext2);
            }
            if (l0.f4841a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.M;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.M);
            }
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            throw th;
        }
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4834a.post(this);
    }

    @Override
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.P;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public j(Handler handler, c cVar) {
        this.f4834a = handler;
        this.f4836c = cVar;
        this.f4835b = new int[1];
    }
}
