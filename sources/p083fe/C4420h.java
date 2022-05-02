package p083fe;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Rational;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.AbstractC0598k;
import androidx.camera.core.AbstractC0610l1;
import androidx.camera.core.AbstractC0620m3;
import androidx.camera.core.C0519c2;
import androidx.camera.core.C0532e1;
import androidx.camera.core.C0572h1;
import androidx.camera.core.C0580i3;
import androidx.camera.core.C0649s;
import androidx.camera.core.C0653t;
import androidx.camera.lifecycle.C0703e;
import androidx.camera.view.PreviewView;
import be.C1379j0;
import de.AbstractC4055l;
import de.AbstractC4067v;
import de.C4040h0;
import ge.C4868i;
import java.io.File;
import java.util.concurrent.ExecutionException;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p022b7.AbstractFutureC1291a;
import p083fe.C4420h;
import p139jb.AbstractC5918j;
import p156kd.C6253l;
import p227q0.C8117a;

@TargetApi(21)
public class C4420h extends AbstractC4067v<PreviewView> {
    public boolean f14608c0;
    public C0703e f14609d0;
    public C0532e1 f14610e0;
    public C0580i3 f14611f0;
    public C0519c2 f14612g0;
    public int f14613h0;
    public AbstractC0598k f14614i0;
    public int f14615j0 = 2;
    public boolean f14616k0;
    public int f14617l0;
    public Rational f14618m0;
    public C4040h0 f14619n0;
    public boolean f14620o0;
    public boolean f14621p0;

    public class C4421a implements C0532e1.AbstractC0549n {
        public final File f14622a;

        public C4421a(File file) {
            this.f14622a = file;
        }

        public void m27741d(C6253l lVar) {
            if (lVar != null) {
                C4420h.this.m29104A(lVar, false);
                return;
            }
            Log.m14727e((int) Log.TAG_CAMERA, "Output file still does not exist!", new Object[0]);
            C4420h.this.m29058z(false);
        }

        @Override
        public void mo27744a(C0532e1.C0552p pVar) {
            C7389v0.m16687R2(this.f14622a, false, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C4420h.C4421a.this.m27741d((C6253l) obj);
                }
            });
        }

        @Override
        public void mo27743b(C0572h1 h1Var) {
            Log.m14728e(Log.TAG_CAMERA, "Cannot take photo", h1Var, new Object[0]);
            C4420h.this.m29058z(false);
        }
    }

    public class C4422b implements C0580i3.AbstractC0587g {
        public final File f14624a;

        public C4422b(File file) {
            this.f14624a = file;
        }

        public void m27737d(C6253l lVar) {
            C4420h.this.m29102C(false, -1L);
            C4420h.this.m29104A(lVar, true);
        }

        @Override
        public void mo27740a(int i, String str, Throwable th) {
            C4420h.this.m29102C(false, -1L);
            Log.m14728e(Log.TAG_CAMERA, "Failed to capture video: %d, message: %s", th, Integer.valueOf(i), str);
            C4420h.this.m29058z(true);
        }

        @Override
        public void mo27739b(C0580i3.C0590i iVar) {
            C7389v0.m16687R2(this.f14624a, true, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C4420h.C4422b.this.m27737d((C6253l) obj);
                }
            });
        }
    }

    public C4420h(Context context, AbstractC4055l lVar) {
        super(context, lVar);
    }

    public void m27779A0() {
        m27750v0();
        this.f13726b.mo29125f7(true, this.f14616k0 != m29093V(), m29093V());
        this.f14620o0 = false;
    }

    public static Size m27776D0(Rational rational, int i) {
        int doubleValue = (int) (rational.doubleValue() * 1920.0d);
        return new Size((int) 1920.0d, doubleValue - (doubleValue % 2));
    }

    public void m27748w0(AbstractC0610l1 l1Var) {
        this.f14619n0.m29245q(l1Var);
    }

    public void m27747x0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m29092W(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void m27746y0() {
        m29102C(true, SystemClock.uptimeMillis());
    }

    public void m27745z0(AbstractFutureC1291a aVar) {
        try {
            C0703e eVar = (C0703e) aVar.get();
            if (this.f14608c0) {
                this.f14609d0 = eVar;
                m27750v0();
            } else {
                eVar.m40504n();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    public PreviewView mo27775E() {
        PreviewView previewView = new PreviewView(this.f13724a);
        previewView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C4420h.this.m27747x0(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        previewView.setImplementationMode(PreviewView.EnumC0707c.COMPATIBLE);
        return previewView;
    }

    public final void m27777C0() {
        AbstractC0598k kVar = this.f14614i0;
        if (kVar != null) {
            boolean f = kVar.mo5734a().mo12260f();
            int i = Log.TAG_CAMERA;
            if (f) {
                int i2 = this.f14615j0;
                if (i2 == 0) {
                    i = Log.TAG_EMOJI;
                } else if (i2 == 1) {
                    i = Log.TAG_VOICE;
                } else if (i2 != 2) {
                    return;
                }
            } else if (m29093V() && this.f14615j0 != 2) {
                i = Log.TAG_VIDEO;
            }
            this.f13726b.mo29129P6(i);
        }
    }

    @Override
    public void mo27774F(int i) {
        if (this.f14609d0 != null) {
            m27750v0();
        }
    }

    @Override
    public void mo27773G() {
        C0580i3 i3Var = this.f14611f0;
        if (i3Var != null) {
            i3Var.m40833f0();
            if (this.f14615j0 == 1 && this.f14614i0.mo5734a().mo12260f()) {
                this.f14614i0.mo12380b().mo5488e(false);
            }
            this.f13726b.mo29136D0();
        }
    }

    @Override
    public void mo27772I(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: p083fe.C4420h.mo27772I(int, int):void");
    }

    @Override
    public void mo27771J(float f) {
        if (this.f14614i0 != null && mo27761l() != f) {
            this.f14614i0.mo12380b().mo5491b(f);
            m29095R(f);
        }
    }

    @Override
    public void mo27770K() {
        this.f14615j0 = 2;
    }

    @Override
    public boolean mo27769N(int i) {
        boolean z;
        if (this.f14611f0 != null) {
            try {
                File r = m29065r(true);
                this.f14611f0.m40838a0(new C0580i3.C0588h.C0589a(r).m40792a(), C8117a.m13434i(this.f13724a), new C4422b(r));
                z = true;
            } catch (Throwable th) {
                Log.m14725e("Cannot start recording video", th, new Object[0]);
                z = false;
            }
            if (z) {
                if (this.f14615j0 == 1 && this.f14614i0.mo5734a().mo12260f()) {
                    this.f14614i0.mo12380b().mo5488e(true);
                }
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        C4420h.this.m27746y0();
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo27768Q(int i, int i2, int i3) {
        if (this.f14610e0 != null) {
            File r = m29065r(false);
            if (r == null) {
                m29058z(false);
                return;
            }
            boolean z = true;
            try {
                C0532e1.C0550o.C0551a aVar = new C0532e1.C0550o.C0551a(r);
                if (m29093V() && !C4868i.m24727c2().m24664k1(1024L)) {
                    C0532e1.C0547l lVar = new C0532e1.C0547l();
                    lVar.m40890d(true);
                    aVar.m40880b(lVar);
                }
                this.f14610e0.m40929l0(aVar.m40881a(), C8117a.m13434i(this.f13724a), new C4421a(r));
            } catch (Throwable th) {
                Log.m14728e(Log.TAG_CAMERA, "Unable to take photo", th, new Object[0]);
                m29058z(false);
                z = false;
            }
            if (z) {
                this.f13726b.mo29132L3(false);
            }
        }
    }

    @Override
    public void mo27767S() {
        this.f14608c0 = true;
        this.f14616k0 = m29093V();
        final AbstractFutureC1291a<C0703e> f = C0703e.m40512f(this.f13724a);
        f.mo13371a(new Runnable() {
            @Override
            public final void run() {
                C4420h.this.m27745z0(f);
            }
        }, C8117a.m13434i(this.f13724a));
    }

    @Override
    public void mo27766U() {
        this.f14621p0 = true;
        C0703e eVar = this.f14609d0;
        if (eVar != null) {
            eVar.m40504n();
        }
    }

    @Override
    public void mo27765b0() {
        this.f14621p0 = false;
        if (this.f14608c0) {
            m27750v0();
        }
    }

    @Override
    public void mo27764h() {
        if (this.f14608c0) {
            C0703e eVar = this.f14609d0;
            if (eVar != null) {
                eVar.m40504n();
                this.f14612g0 = null;
                this.f14611f0 = null;
                this.f14610e0 = null;
                this.f14609d0 = null;
                this.f14614i0 = null;
            }
            this.f14608c0 = false;
        }
    }

    @Override
    public void mo27763i() {
        C4040h0 h0Var = this.f14619n0;
        if (h0Var != null) {
            h0Var.m29254h();
            this.f14619n0 = null;
        }
    }

    @Override
    public boolean mo27762k(Bitmap bitmap) {
        for (int i = 0; i < ((PreviewView) this.f13728c).getChildCount(); i++) {
            View childAt = ((PreviewView) this.f13728c).getChildAt(i);
            if (childAt instanceof TextureView) {
                TextureView textureView = (TextureView) childAt;
                if (!textureView.isAvailable()) {
                    return false;
                }
                textureView.getBitmap(bitmap);
                return true;
            }
        }
        return false;
    }

    @Override
    public float mo27761l() {
        AbstractC0598k kVar = this.f14614i0;
        AbstractC0620m3 e = kVar != null ? kVar.mo5734a().mo12259i().mo12251e() : null;
        if (e != null) {
            return e.mo12420c();
        }
        return 0.0f;
    }

    @Override
    public void mo27760l0() {
        if (!this.f14620o0 && this.f14609d0 != null) {
            ?? V = m29093V();
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!this.f14609d0.m40510h(new C0653t.C0654a().m40665d(V).m40667b())) {
                    Log.m14711w((int) Log.TAG_CAMERA, "Camera is not available, facing: %d", Integer.valueOf((int) V));
                    return;
                }
                Log.m14709w("checked camera availability in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                this.f14620o0 = true;
                m29076g0(!m29093V());
                this.f13726b.mo29125f7(false, this.f14616k0 != m29093V(), m29093V());
                this.f13726b.mo29121n(true, new Runnable() {
                    @Override
                    public final void run() {
                        C4420h.this.m27779A0();
                    }
                });
            } catch (C0649s e) {
                Log.m14728e(Log.TAG_CAMERA, "Camera info unavailable, facing: %d", e, Integer.valueOf(V == true ? 1 : 0));
            }
        }
    }

    @Override
    public void mo27759m0() {
        AbstractC0598k kVar = this.f14614i0;
        if (kVar != null) {
            int i = 1;
            if (kVar.mo5734a().mo12260f()) {
                int i2 = this.f14615j0;
                if (i2 == 0) {
                    this.f14615j0 = 1;
                } else if (i2 == 1) {
                    this.f14615j0 = 2;
                } else if (i2 == 2) {
                    this.f14615j0 = m29060x() ? 1 : 0;
                } else {
                    return;
                }
                this.f14610e0.m40922s0(this.f14615j0);
                m27777C0();
            } else if (m29093V()) {
                if (this.f14615j0 != 2) {
                    i = 2;
                }
                this.f14615j0 = i;
                m27777C0();
            }
        }
    }

    @Override
    public float mo27758o() {
        AbstractC0598k kVar = this.f14614i0;
        AbstractC0620m3 e = kVar != null ? kVar.mo5734a().mo12259i().mo12251e() : null;
        if (e != null) {
            return e.mo12422a();
        }
        return 0.0f;
    }

    @Override
    public float mo27757p() {
        AbstractC0598k kVar = this.f14614i0;
        AbstractC0620m3 e = kVar != null ? kVar.mo5734a().mo12259i().mo12251e() : null;
        if (e != null) {
            return e.mo12421b();
        }
        return 0.0f;
    }

    @Override
    public float mo27756q() {
        return 0.1f;
    }

    public final void m27750v0() {
        throw new UnsupportedOperationException("Method not decompiled: p083fe.C4420h.m27750v0():void");
    }

    @Override
    public boolean mo27749w() {
        return this.f14608c0 && this.f14609d0 != null;
    }
}
