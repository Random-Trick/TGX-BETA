package f9;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.util.Log;
import i9.b;
import i9.d;
import i9.e;
import ra.g;
import ra.k;

public class c {
    public static final a f11866e = new a(null);
    public i9.c f11867a;
    public b f11868b;
    public i9.a f11869c;
    public int f11870d;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public c(b bVar, int i10) {
        i9.a a10;
        k.e(bVar, "sharedContext");
        this.f11867a = d.g();
        this.f11868b = d.f();
        this.f11870d = -1;
        i9.c cVar = new i9.c(EGL14.eglGetDisplay(0));
        this.f11867a = cVar;
        if (cVar == d.g()) {
            throw new RuntimeException("unable to get EGL14 display");
        } else if (EGL14.eglInitialize(this.f11867a.a(), new int[1], 0, new int[1], 0)) {
            b bVar2 = new b();
            boolean z10 = (i10 & 1) != 0;
            if (((i10 & 2) != 0) && (a10 = bVar2.a(this.f11867a, 3, z10)) != null) {
                b bVar3 = new b(EGL14.eglCreateContext(this.f11867a.a(), a10.a(), bVar.a(), new int[]{d.c(), 3, d.e()}, 0));
                try {
                    d.a("eglCreateContext (3)");
                    this.f11869c = a10;
                    this.f11868b = bVar3;
                    this.f11870d = 3;
                } catch (Exception unused) {
                }
            }
            if (this.f11868b == d.f()) {
                i9.a a11 = bVar2.a(this.f11867a, 2, z10);
                if (a11 != null) {
                    b bVar4 = new b(EGL14.eglCreateContext(this.f11867a.a(), a11.a(), bVar.a(), new int[]{d.c(), 2, d.e()}, 0));
                    d.a("eglCreateContext (2)");
                    this.f11869c = a11;
                    this.f11868b = bVar4;
                    this.f11870d = 2;
                    return;
                }
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
        } else {
            throw new RuntimeException("unable to initialize EGL14");
        }
    }

    public final e a(Object obj) {
        k.e(obj, "surface");
        int[] iArr = {d.e()};
        i9.c cVar = this.f11867a;
        i9.a aVar = this.f11869c;
        k.c(aVar);
        e eVar = new e(EGL14.eglCreateWindowSurface(cVar.a(), aVar.a(), obj, iArr, 0));
        d.a("eglCreateWindowSurface");
        if (eVar != d.h()) {
            return eVar;
        }
        throw new RuntimeException("surface was null");
    }

    public final void b(e eVar) {
        k.e(eVar, "eglSurface");
        if (this.f11867a == d.g()) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f11867a.a(), eVar.a(), eVar.a(), this.f11868b.a())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void c() {
        if (this.f11867a != d.g()) {
            EGL14.eglMakeCurrent(this.f11867a.a(), d.h().a(), d.h().a(), d.f().a());
            EGL14.eglDestroyContext(this.f11867a.a(), this.f11868b.a());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f11867a.a());
        }
        this.f11867a = d.g();
        this.f11868b = d.f();
        this.f11869c = null;
    }

    public final void d(e eVar) {
        k.e(eVar, "eglSurface");
        EGL14.eglDestroySurface(this.f11867a.a(), eVar.a());
    }

    public final void e(e eVar, long j10) {
        k.e(eVar, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.f11867a.a(), eVar.a(), j10);
    }

    public final boolean f(e eVar) {
        k.e(eVar, "eglSurface");
        return EGL14.eglSwapBuffers(this.f11867a.a(), eVar.a());
    }
}
