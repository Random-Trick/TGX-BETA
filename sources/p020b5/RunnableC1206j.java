package p020b5;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class RunnableC1206j implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] f4514Q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLDisplay f4515M;
    public EGLContext f4516N;
    public EGLSurface f4517O;
    public SurfaceTexture f4518P;
    public final Handler f4519a;
    public final int[] f4520b;
    public final AbstractC1209c f4521c;

    public static final class C1208b extends RuntimeException {
        public C1208b(String str) {
            super(str);
        }
    }

    public interface AbstractC1209c {
        void m38039a();
    }

    public RunnableC1206j(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig m38048a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f4514Q, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C1208b(C1216l0.m37939z("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext m38047b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C1208b("eglCreateContext failed");
    }

    public static EGLSurface m38046c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new C1208b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C1208b("eglMakeCurrent failed");
    }

    public static void m38044e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C1217m.m37936b();
    }

    public static EGLDisplay m38043f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C1208b("eglInitialize failed");
        }
        throw new C1208b("eglGetDisplay failed");
    }

    public final void m38045d() {
        AbstractC1209c cVar = this.f4521c;
        if (cVar != null) {
            cVar.m38039a();
        }
    }

    public SurfaceTexture m38042g() {
        return (SurfaceTexture) C1186a.m38188e(this.f4518P);
    }

    public void m38041h(int i) {
        EGLDisplay f = m38043f();
        this.f4515M = f;
        EGLConfig a = m38048a(f);
        EGLContext b = m38047b(this.f4515M, a, i);
        this.f4516N = b;
        this.f4517O = m38046c(this.f4515M, a, b, i);
        m38044e(this.f4520b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4520b[0]);
        this.f4518P = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void m38040i() {
        this.f4519a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f4518P;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f4520b, 0);
            }
            EGLDisplay eGLDisplay = this.f4515M;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f4515M;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f4517O;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4515M, this.f4517O);
            }
            EGLContext eGLContext = this.f4516N;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f4515M, eGLContext);
            }
            if (C1216l0.f4526a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f4515M;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4515M);
            }
            this.f4515M = null;
            this.f4516N = null;
            this.f4517O = null;
            this.f4518P = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f4515M;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f4515M;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f4517O;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4515M, this.f4517O);
            }
            EGLContext eGLContext2 = this.f4516N;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f4515M, eGLContext2);
            }
            if (C1216l0.f4526a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f4515M;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4515M);
            }
            this.f4515M = null;
            this.f4516N = null;
            this.f4517O = null;
            this.f4518P = null;
            throw th;
        }
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4519a.post(this);
    }

    @Override
    public void run() {
        m38045d();
        SurfaceTexture surfaceTexture = this.f4518P;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC1206j(Handler handler, AbstractC1209c cVar) {
        this.f4519a = handler;
        this.f4521c = cVar;
        this.f4520b = new int[1];
    }
}
