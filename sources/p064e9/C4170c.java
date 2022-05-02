package p064e9;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.util.Log;
import p106h9.C5033a;
import p106h9.C5034b;
import p106h9.C5035c;
import p106h9.C5036d;
import p106h9.C5037e;
import qa.C8294g;
import qa.C8298k;

public class C4170c {
    public static final C4171a f14070e = new C4171a(null);
    public C5035c f14071a;
    public C5034b f14072b;
    public C5033a f14073c;
    public int f14074d;

    public static final class C4171a {
        public C4171a() {
        }

        public C4171a(C8294g gVar) {
            this();
        }
    }

    public C4170c(C5034b bVar, int i) {
        C5033a a;
        C8298k.m12933e(bVar, "sharedContext");
        this.f14071a = C5036d.m24234g();
        this.f14072b = C5036d.m24235f();
        this.f14074d = -1;
        C5035c cVar = new C5035c(EGL14.eglGetDisplay(0));
        this.f14071a = cVar;
        if (cVar == C5036d.m24234g()) {
            throw new RuntimeException("unable to get EGL14 display");
        } else if (EGL14.eglInitialize(this.f14071a.m24241a(), new int[1], 0, new int[1], 0)) {
            C4168b bVar2 = new C4168b();
            boolean z = (i & 1) != 0;
            if (((i & 2) != 0) && (a = bVar2.m28633a(this.f14071a, 3, z)) != null) {
                C5034b bVar3 = new C5034b(EGL14.eglCreateContext(this.f14071a.m24241a(), a.m24243a(), bVar.m24242a(), new int[]{C5036d.m24238c(), 3, C5036d.m24236e()}, 0));
                try {
                    C4172d.m28625a("eglCreateContext (3)");
                    this.f14073c = a;
                    this.f14072b = bVar3;
                    this.f14074d = 3;
                } catch (Exception unused) {
                }
            }
            if (this.f14072b == C5036d.m24235f()) {
                C5033a a2 = bVar2.m28633a(this.f14071a, 2, z);
                if (a2 != null) {
                    C5034b bVar4 = new C5034b(EGL14.eglCreateContext(this.f14071a.m24241a(), a2.m24243a(), bVar.m24242a(), new int[]{C5036d.m24238c(), 2, C5036d.m24236e()}, 0));
                    C4172d.m28625a("eglCreateContext (2)");
                    this.f14073c = a2;
                    this.f14072b = bVar4;
                    this.f14074d = 2;
                    return;
                }
                throw new RuntimeException("Unable to find a suitable EGLConfig");
            }
        } else {
            throw new RuntimeException("unable to initialize EGL14");
        }
    }

    public final C5037e m28631a(Object obj) {
        C8298k.m12933e(obj, "surface");
        int[] iArr = {C5036d.m24236e()};
        C5035c cVar = this.f14071a;
        C5033a aVar = this.f14073c;
        C8298k.m12935c(aVar);
        C5037e eVar = new C5037e(EGL14.eglCreateWindowSurface(cVar.m24241a(), aVar.m24243a(), obj, iArr, 0));
        C4172d.m28625a("eglCreateWindowSurface");
        if (eVar != C5036d.m24233h()) {
            return eVar;
        }
        throw new RuntimeException("surface was null");
    }

    public final void m28630b(C5037e eVar) {
        C8298k.m12933e(eVar, "eglSurface");
        if (this.f14071a == C5036d.m24234g()) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f14071a.m24241a(), eVar.m24224a(), eVar.m24224a(), this.f14072b.m24242a())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void m28629c() {
        if (this.f14071a != C5036d.m24234g()) {
            EGL14.eglMakeCurrent(this.f14071a.m24241a(), C5036d.m24233h().m24224a(), C5036d.m24233h().m24224a(), C5036d.m24235f().m24242a());
            EGL14.eglDestroyContext(this.f14071a.m24241a(), this.f14072b.m24242a());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f14071a.m24241a());
        }
        this.f14071a = C5036d.m24234g();
        this.f14072b = C5036d.m24235f();
        this.f14073c = null;
    }

    public final void m28628d(C5037e eVar) {
        C8298k.m12933e(eVar, "eglSurface");
        EGL14.eglDestroySurface(this.f14071a.m24241a(), eVar.m24224a());
    }

    public final void m28627e(C5037e eVar, long j) {
        C8298k.m12933e(eVar, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.f14071a.m24241a(), eVar.m24224a(), j);
    }

    public final boolean m28626f(C5037e eVar) {
        C8298k.m12933e(eVar, "eglSurface");
        return EGL14.eglSwapBuffers(this.f14071a.m24241a(), eVar.m24224a());
    }
}
