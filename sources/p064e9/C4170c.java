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
        C8298k.m12934e(bVar, "sharedContext");
        this.f14071a = C5036d.m24233g();
        this.f14072b = C5036d.m24234f();
        this.f14074d = -1;
        C5035c cVar = new C5035c(EGL14.eglGetDisplay(0));
        this.f14071a = cVar;
        if (cVar == C5036d.m24233g()) {
            throw new RuntimeException("unable to get EGL14 display");
        } else if (EGL14.eglInitialize(this.f14071a.m24240a(), new int[1], 0, new int[1], 0)) {
            C4168b bVar2 = new C4168b();
            boolean z = (i & 1) != 0;
            if (((i & 2) != 0) && (a = bVar2.m28631a(this.f14071a, 3, z)) != null) {
                C5034b bVar3 = new C5034b(EGL14.eglCreateContext(this.f14071a.m24240a(), a.m24242a(), bVar.m24241a(), new int[]{C5036d.m24237c(), 3, C5036d.m24235e()}, 0));
                try {
                    C4172d.m28623a("eglCreateContext (3)");
                    this.f14073c = a;
                    this.f14072b = bVar3;
                    this.f14074d = 3;
                } catch (Exception unused) {
                }
            }
            if (this.f14072b == C5036d.m24234f()) {
                C5033a a2 = bVar2.m28631a(this.f14071a, 2, z);
                if (a2 != null) {
                    C5034b bVar4 = new C5034b(EGL14.eglCreateContext(this.f14071a.m24240a(), a2.m24242a(), bVar.m24241a(), new int[]{C5036d.m24237c(), 2, C5036d.m24235e()}, 0));
                    C4172d.m28623a("eglCreateContext (2)");
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

    public final C5037e m28629a(Object obj) {
        C8298k.m12934e(obj, "surface");
        int[] iArr = {C5036d.m24235e()};
        C5035c cVar = this.f14071a;
        C5033a aVar = this.f14073c;
        C8298k.m12936c(aVar);
        C5037e eVar = new C5037e(EGL14.eglCreateWindowSurface(cVar.m24240a(), aVar.m24242a(), obj, iArr, 0));
        C4172d.m28623a("eglCreateWindowSurface");
        if (eVar != C5036d.m24232h()) {
            return eVar;
        }
        throw new RuntimeException("surface was null");
    }

    public final void m28628b(C5037e eVar) {
        C8298k.m12934e(eVar, "eglSurface");
        if (this.f14071a == C5036d.m24233g()) {
            Log.v("EglCore", "NOTE: makeSurfaceCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.f14071a.m24240a(), eVar.m24223a(), eVar.m24223a(), this.f14072b.m24241a())) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void m28627c() {
        if (this.f14071a != C5036d.m24233g()) {
            EGL14.eglMakeCurrent(this.f14071a.m24240a(), C5036d.m24232h().m24223a(), C5036d.m24232h().m24223a(), C5036d.m24234f().m24241a());
            EGL14.eglDestroyContext(this.f14071a.m24240a(), this.f14072b.m24241a());
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f14071a.m24240a());
        }
        this.f14071a = C5036d.m24233g();
        this.f14072b = C5036d.m24234f();
        this.f14073c = null;
    }

    public final void m28626d(C5037e eVar) {
        C8298k.m12934e(eVar, "eglSurface");
        EGL14.eglDestroySurface(this.f14071a.m24240a(), eVar.m24223a());
    }

    public final void m28625e(C5037e eVar, long j) {
        C8298k.m12934e(eVar, "eglSurface");
        EGLExt.eglPresentationTimeANDROID(this.f14071a.m24240a(), eVar.m24223a(), j);
    }

    public final boolean m28624f(C5037e eVar) {
        C8298k.m12934e(eVar, "eglSurface");
        return EGL14.eglSwapBuffers(this.f14071a.m24240a(), eVar.m24223a());
    }
}
