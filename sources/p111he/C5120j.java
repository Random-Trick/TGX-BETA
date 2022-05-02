package p111he;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import be.C1363c0;
import be.C1379j0;
import com.google.android.play.core.install.AbstractC3506b;
import com.google.android.play.core.install.InstallState;
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import java.util.Iterator;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p154kb.C6227d;
import p189n6.AbstractC7250b;
import p189n6.C7248a;
import p189n6.C7252c;
import p193nb.C7321e;
import p300v6.AbstractC9851b;
import p300v6.AbstractC9852c;
import p350yd.AbstractC10861n0;
import p350yd.AbstractC10985s0;
import p350yd.C10534a9;
import p350yd.C10838m0;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C5120j implements AbstractC3506b, AbstractC10985s0, AbstractC10861n0 {
    public C7248a f17167M;
    public boolean f17168N;
    public boolean f17169O;
    public long f17170P;
    public long f17171Q;
    public String f17172R;
    public int f17173S;
    public boolean f17174T;
    public C10930q6 f17175U;
    public C10930q6.C10949s f17176V;
    public final AbstractView$OnTouchListenerC7889a f17178a;
    public final AbstractC7250b f17180c;
    public int f17177W = 0;
    public final C6227d<AbstractC5121a> f17179b = new C6227d<>();

    public interface AbstractC5121a {
        void mo23887F0(long j, long j2);

        void mo23886I6(int i, int i2, boolean z);
    }

    public C5120j(AbstractView$OnTouchListenerC7889a aVar) {
        AbstractC7250b a;
        this.f17178a = aVar;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                a = C7252c.m17195a(aVar);
            } catch (Throwable th) {
                Log.m14725e("Unable to initialize Google Play update manager", th, new Object[0]);
            }
            this.f17180c = a;
        }
        a = null;
        this.f17180c = a;
    }

    public void m23896r(C7248a aVar) {
        this.f17167M = aVar;
        int c = aVar.m17205c();
        if (c == 11) {
            long b = aVar.m17206b();
            long f = aVar.m17202f();
            m23922E(2, b, f, "#" + (aVar.m17207a() / 1000), true);
        } else if (c == 5) {
            m23924C();
        } else {
            int g = aVar.m17201g();
            if (g != 0) {
                if (g != 1) {
                    if (g == 2) {
                        long b2 = aVar.m17206b();
                        long f2 = aVar.m17202f();
                        m23922E(2, b2, f2, "#" + (aVar.m17207a() / 1000), false);
                        return;
                    } else if (g != 3) {
                        return;
                    }
                }
                if (C7389v0.m16636f1()) {
                    m23924C();
                } else {
                    m23918I();
                }
            } else {
                m23924C();
            }
        }
    }

    public void m23895s(Exception exc) {
        Log.m14720i("Unable to check for app updates", exc, new Object[0]);
        m23924C();
    }

    public void m23894t(C10930q6.C10949s sVar, C10930q6 q6Var) {
        if (sVar != null) {
            this.f17175U = q6Var;
            this.f17176V = sVar;
            TdApi.File file = sVar.f35188a.document;
            q6Var.m2781K9().m1835m(file.f25373id, this);
            m23922E(1, file.local.downloadedSize, file.expectedSize, sVar.f35190c, C4779t2.m25586V2(file));
            return;
        }
        m23918I();
    }

    public void m23893u(final C10930q6 q6Var, final C10930q6.C10949s sVar) {
        q6Var.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C5120j.this.m23894t(sVar, q6Var);
            }
        });
    }

    public static Object m23892v(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 != 1) {
            return C4403w.m27843p().mo379a(charSequence, i, i2, i3, z);
        }
        return null;
    }

    public boolean m23891w(View view, int i) {
        if (i != R.id.btn_update) {
            return true;
        }
        m23899o();
        return true;
    }

    public void m23890x(TdApi.UpdateFile updateFile) {
        TdApi.File file = this.f17176V.f35188a.document;
        TdApi.File file2 = updateFile.file;
        if (file2.f25373id == file.f25373id) {
            C7321e.m16907u(file2, file);
            if (C4779t2.m25586V2(updateFile.file)) {
                TdApi.File file3 = updateFile.file;
                m23922E(1, file3.local.downloadedSize, file3.expectedSize, this.f17176V.f35190c, true);
            } else if (C4779t2.m25580W2(updateFile.file)) {
                m23919H();
                TdApi.File file4 = updateFile.file;
                m23920G(file4.local.downloadedSize, file4.expectedSize);
            } else {
                m23921F();
            }
        } else {
            this.f17175U.m2781K9().m1901U(updateFile.file.f25373id, this);
        }
    }

    public void m23926A() {
        if (!this.f17169O) {
            int i = this.f17173S;
            if (i == 1) {
                this.f17169O = m23888z();
            } else if (i == 2) {
                this.f17169O = m23889y();
            }
        }
    }

    public void m23925B(int i, Intent intent) {
        if (i == -1) {
            try {
                this.f17180c.mo17183d(this);
            } catch (Throwable th) {
                Log.m14725e("Unable to register listener", th, new Object[0]);
            }
        } else if (i == 0 || i == 1) {
            m23924C();
        }
    }

    public final void m23924C() {
        if (!this.f17168N) {
            this.f17168N = true;
            if (m23917J()) {
                m23902l();
            } else {
                m23918I();
            }
        }
    }

    public void mo10757a(InstallState installState) {
        int c = installState.mo30290c();
        if (c == 5) {
            int b = installState.mo30291b();
            Log.m14719i("Google Play update failed, code: %d", Integer.valueOf(b));
            if (b == -9 || b == -10) {
                this.f17174T = true;
            }
            m23924C();
        } else if (c == 2) {
            m23919H();
            m23920G(installState.mo30292a(), installState.mo30288e());
        } else if (c == 11) {
            this.f17180c.mo17182e(this);
            m23922E(2, installState.mo30292a(), installState.mo30288e(), this.f17172R, true);
        }
    }

    public final void m23922E(int i, long j, long j2, String str, boolean z) {
        this.f17173S = i;
        this.f17170P = j;
        this.f17171Q = j2;
        this.f17172R = str;
        if (z) {
            m23915L(4);
            return;
        }
        m23915L(2);
        m23926A();
    }

    public final void m23921F() {
        int i = this.f17177W;
        if (i == 3 || i == 4) {
            m23915L(2);
        }
    }

    public final void m23920G(long j, long j2) {
        this.f17170P = j;
        this.f17171Q = j2;
        Iterator<AbstractC5121a> it = this.f17179b.iterator();
        while (it.hasNext()) {
            it.next().mo23887F0(j, j2);
        }
    }

    public final void m23919H() {
        if (this.f17177W == 2) {
            m23915L(3);
        }
    }

    public final void m23918I() {
        m23915L(0);
    }

    public final boolean m23917J() {
        return this.f17180c == null || this.f17174T || (this.f17168N && C7389v0.m16636f1());
    }

    public void m23916K(AbstractC5121a aVar) {
        this.f17179b.remove(aVar);
    }

    public final void m23915L(int i) {
        int i2 = this.f17177W;
        if (i2 != i) {
            this.f17177W = i;
            Iterator<AbstractC5121a> it = this.f17179b.iterator();
            while (it.hasNext()) {
                AbstractC5121a next = it.next();
                boolean z = true;
                if (this.f17173S != 1) {
                    z = false;
                }
                next.mo23886I6(i, i2, z);
            }
        }
    }

    public int m23914M() {
        return this.f17177W;
    }

    public long m23913N() {
        return this.f17171Q;
    }

    @Override
    public void mo2996e0(int i, int i2) {
        C10838m0.m3049a(this, i, i2);
    }

    @Override
    public void mo2039h2(final TdApi.UpdateFile updateFile) {
        this.f17175U.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C5120j.this.m23890x(updateFile);
            }
        });
    }

    public void m23905i(AbstractC5121a aVar) {
        this.f17179b.add(aVar);
    }

    public long m23904j() {
        return this.f17170P;
    }

    public final void m23903k() {
        AbstractC7250b bVar = this.f17180c;
        if (bVar != null) {
            bVar.mo17184c().mo6725e(new AbstractC9852c() {
                @Override
                public final void mo6713a(Object obj) {
                    C5120j.this.m23896r((C7248a) obj);
                }
            }).mo6727c(new AbstractC9851b() {
                @Override
                public final void mo6711c(Exception exc) {
                    C5120j.this.m23895s(exc);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void m23902l() {
        final C10930q6 z0 = this.f17178a.m14487h1() ? this.f17178a.m14410z0() : null;
        if (z0 == null || z0.m2930B4().m4680k1() || !z0.m2848G6()) {
            m23918I();
        } else {
            z0.m2349m5(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    C5120j.this.m23893u(z0, (C10930q6.C10949s) obj);
                }
            });
        }
    }

    public void m23901m() {
        int i = this.f17177W;
        if (i == 0) {
            m23915L(1);
            if (m23917J()) {
                m23902l();
            } else {
                m23903k();
            }
        } else if (i == 2) {
            m23926A();
        }
    }

    @Override
    public void mo2995m3(TdApi.NetworkType networkType) {
        if (networkType instanceof TdApi.NetworkTypeWiFi) {
            this.f17175U.m2781K9().m1814r0(this);
            m23901m();
        }
    }

    public String m23900n() {
        return this.f17172R;
    }

    public void m23899o() {
        if (this.f17177W == 2) {
            int i = this.f17173S;
            if (i == 1) {
                this.f17175U.m2413i5().m3975p(this.f17176V.f35188a.document);
            } else if (i == 2) {
                this.f17169O = m23889y();
            }
        }
    }

    public int m23898p() {
        return this.f17173S;
    }

    public void m23897q() {
        if (this.f17177W == 4) {
            int i = this.f17173S;
            if (i == 1) {
                C1379j0.m37342Z(new C10534a9(this.f17178a, this.f17175U), this.f17176V.f35188a.fileName, new File(this.f17176V.f35188a.document.local.path), this.f17176V.f35188a.mimeType, 0);
            } else if (i == 2) {
                this.f17180c.mo17186a();
                m23915L(5);
            }
        }
    }

    public final boolean m23889y() {
        throw new UnsupportedOperationException("Method not decompiled: p111he.C5120j.m23889y():boolean");
    }

    public final boolean m23888z() {
        int i0 = C4868i.m24726c2().m24680i0();
        if (i0 == 0) {
            AbstractC9323v4<?> F = this.f17178a.m14552P1().m9763F();
            if (F != null && F.m9339Ta()) {
                long N = m23913N() - m23904j();
                String n = m23900n();
                F.m9247ge(new AbstractC9323v4.C9340p.C9341a().m9092c(C4403w.m27986G0(F, !C5070i.m24061i(n) ? R.string.AppUpdateAvailableVersionPrompt : R.string.AppUpdateAvailablePrompt, C5099b.f17135a, C1363c0.m37423m(N), n)).m9091d(new AbstractC9323v4.C9338o(R.id.btn_update, C4403w.m27869i1(R.string.DownloadUpdate), 3, R.drawable.baseline_system_update_24)).m9093b().m9094a(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean w;
                        w = C5120j.this.m23891w(view, i);
                        return w;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23934b(this, i);
                    }
                });
                return true;
            }
        } else if (i0 != 2) {
            if (i0 == 3) {
                m23899o();
            }
        } else if (this.f17175U.m2472ea() instanceof TdApi.NetworkTypeWiFi) {
            m23899o();
        } else {
            this.f17175U.m2781K9().m1866e0(this);
            return true;
        }
        return false;
    }
}
