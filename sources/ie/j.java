package ie;

import android.content.Intent;
import android.view.View;
import ce.c0;
import ce.j0;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.b;
import gd.w;
import hd.t2;
import he.i;
import java.io.File;
import java.util.Iterator;
import lb.d;
import o6.a;
import o6.c;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.k0;
import zd.l0;
import zd.o6;
import zd.q0;
import zd.y8;

public class j implements b, q0, l0 {
    public o6.a M;
    public boolean N;
    public boolean O;
    public long P;
    public long Q;
    public String R;
    public int S;
    public boolean T;
    public o6 U;
    public o6.s V;
    public final org.thunderdog.challegram.a f14248a;
    public final o6.b f14250c;
    public int W = 0;
    public final d<a> f14249b = new d<>();

    public interface a {
        void E6(int i10, int i11, boolean z10);

        void F0(long j10, long j11);
    }

    public j(org.thunderdog.challegram.a aVar) {
        o6.b bVar;
        this.f14248a = aVar;
        try {
            bVar = c.a(aVar);
        } catch (Throwable th) {
            Log.e("Unable to initialize Google Play update manager", th, new Object[0]);
            bVar = null;
        }
        this.f14250c = bVar;
    }

    public void r(o6.a aVar) {
        this.M = aVar;
        int c10 = aVar.c();
        if (c10 == 11) {
            long b10 = aVar.b();
            long f10 = aVar.f();
            E(2, b10, f10, "#" + (aVar.a() / 1000), true);
        } else if (c10 == 5) {
            C();
        } else {
            int g10 = aVar.g();
            if (g10 != 0) {
                if (g10 != 1) {
                    if (g10 == 2) {
                        long b11 = aVar.b();
                        long f11 = aVar.f();
                        E(2, b11, f11, "#" + (aVar.a() / 1000), false);
                        return;
                    } else if (g10 != 3) {
                        return;
                    }
                }
                if (v0.f1()) {
                    C();
                } else {
                    I();
                }
            } else {
                C();
            }
        }
    }

    public void s(Exception exc) {
        Log.i("Unable to check for app updates", exc, new Object[0]);
        C();
    }

    public void t(o6.s sVar, o6 o6Var) {
        if (sVar != null) {
            this.U = o6Var;
            this.V = sVar;
            TdApi.File file = sVar.f28177a.document;
            o6Var.O9().m(file.f19913id, this);
            E(1, file.local.downloadedSize, file.expectedSize, sVar.f28179c, t2.V2(file));
            return;
        }
        I();
    }

    public void u(final o6 o6Var, final o6.s sVar) {
        o6Var.hd().post(new Runnable() {
            @Override
            public final void run() {
                j.this.t(sVar, o6Var);
            }
        });
    }

    public static Object v(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 != 1) {
            return w.p().a(charSequence, i10, i11, i12, z10);
        }
        return null;
    }

    public boolean w(View view, int i10) {
        if (i10 != R.id.btn_update) {
            return true;
        }
        o();
        return true;
    }

    public void x(TdApi.UpdateFile updateFile) {
        TdApi.File file = this.V.f28177a.document;
        TdApi.File file2 = updateFile.file;
        if (file2.f19913id == file.f19913id) {
            e.v(file2, file);
            if (t2.V2(updateFile.file)) {
                TdApi.File file3 = updateFile.file;
                E(1, file3.local.downloadedSize, file3.expectedSize, this.V.f28179c, true);
            } else if (t2.W2(updateFile.file)) {
                H();
                TdApi.File file4 = updateFile.file;
                G(file4.local.downloadedSize, file4.expectedSize);
            } else {
                F();
            }
        } else {
            this.U.O9().U(updateFile.file.f19913id, this);
        }
    }

    public void A() {
        if (!this.O) {
            int i10 = this.S;
            if (i10 == 1) {
                this.O = z();
            } else if (i10 == 2) {
                this.O = y();
            }
        }
    }

    public void B(int i10, Intent intent) {
        if (i10 == -1) {
            try {
                this.f14250c.d(this);
            } catch (Throwable th) {
                Log.e("Unable to register listener", th, new Object[0]);
            }
        } else if (i10 == 0 || i10 == 1) {
            C();
        }
    }

    public final void C() {
        if (!this.N) {
            this.N = true;
            if (J()) {
                l();
            } else {
                I();
            }
        }
    }

    public void a(InstallState installState) {
        int c10 = installState.c();
        if (c10 == 5) {
            int b10 = installState.b();
            Log.i("Google Play update failed, code: %d", Integer.valueOf(b10));
            if (b10 == -9 || b10 == -10) {
                this.T = true;
            }
            C();
        } else if (c10 == 2) {
            H();
            G(installState.a(), installState.e());
        } else if (c10 == 11) {
            this.f14250c.e(this);
            E(2, installState.a(), installState.e(), this.R, true);
        }
    }

    public final void E(int i10, long j10, long j11, String str, boolean z10) {
        this.S = i10;
        this.P = j10;
        this.Q = j11;
        this.R = str;
        if (z10) {
            L(4);
            return;
        }
        L(2);
        A();
    }

    public final void F() {
        int i10 = this.W;
        if (i10 == 3 || i10 == 4) {
            L(2);
        }
    }

    public final void G(long j10, long j11) {
        this.P = j10;
        this.Q = j11;
        Iterator<a> it = this.f14249b.iterator();
        while (it.hasNext()) {
            it.next().F0(j10, j11);
        }
    }

    public final void H() {
        if (this.W == 2) {
            L(3);
        }
    }

    public final void I() {
        L(0);
    }

    public final boolean J() {
        return this.f14250c == null || this.T || (this.N && v0.f1());
    }

    public void K(a aVar) {
        this.f14249b.remove(aVar);
    }

    public final void L(int i10) {
        int i11 = this.W;
        if (i11 != i10) {
            this.W = i10;
            Iterator<a> it = this.f14249b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                boolean z10 = true;
                if (this.S != 1) {
                    z10 = false;
                }
                next.E6(i10, i11, z10);
            }
        }
    }

    public int M() {
        return this.W;
    }

    public long N() {
        return this.Q;
    }

    @Override
    public void d3(TdApi.NetworkType networkType) {
        if (networkType instanceof TdApi.NetworkTypeWiFi) {
            this.U.O9().r0(this);
            m();
        }
    }

    @Override
    public void e0(int i10, int i11) {
        k0.a(this, i10, i11);
    }

    @Override
    public void h2(final TdApi.UpdateFile updateFile) {
        this.U.hd().post(new Runnable() {
            @Override
            public final void run() {
                j.this.x(updateFile);
            }
        });
    }

    public void i(a aVar) {
        this.f14249b.add(aVar);
    }

    public long j() {
        return this.P;
    }

    public final void k() {
        o6.b bVar = this.f14250c;
        if (bVar != null) {
            bVar.c().e(new w6.c() {
                @Override
                public final void a(Object obj) {
                    j.this.r((a) obj);
                }
            }).c(new w6.b() {
                @Override
                public final void c(Exception exc) {
                    j.this.s(exc);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    public final void l() {
        final o6 C0 = this.f14248a.i1() ? this.f14248a.C0() : null;
        if (C0 == null || C0.F4().k1() || !C0.K6()) {
            I();
        } else {
            C0.q5(new kb.j() {
                @Override
                public final void a(Object obj) {
                    j.this.u(C0, (o6.s) obj);
                }
            });
        }
    }

    public void m() {
        int i10 = this.W;
        if (i10 == 0) {
            L(1);
            if (J()) {
                l();
            } else {
                k();
            }
        } else if (i10 == 2) {
            A();
        }
    }

    public String n() {
        return this.R;
    }

    public void o() {
        if (this.W == 2) {
            int i10 = this.S;
            if (i10 == 1) {
                this.U.m5().p(this.V.f28177a.document);
            } else if (i10 == 2) {
                this.O = y();
            }
        }
    }

    public int p() {
        return this.S;
    }

    public void q() {
        if (this.W == 4) {
            int i10 = this.S;
            if (i10 == 1) {
                j0.Z(new y8(this.f14248a, this.U), this.V.f28177a.fileName, new File(this.V.f28177a.document.local.path), this.V.f28177a.mimeType, 0);
            } else if (i10 == 2) {
                this.f14250c.a();
                L(5);
            }
        }
    }

    public final boolean y() {
        throw new UnsupportedOperationException("Method not decompiled: ie.j.y():boolean");
    }

    public final boolean z() {
        int i02 = i.c2().i0();
        if (i02 == 0) {
            v4<?> F = this.f14248a.Q1().F();
            if (F != null && F.Ta()) {
                long N = N() - j();
                String n10 = n();
                F.ge(new v4.p.a().c(w.G0(F, !ib.i.i(n10) ? R.string.AppUpdateAvailableVersionPrompt : R.string.AppUpdateAvailablePrompt, b.f14225a, c0.m(N), n10)).d(new v4.o(R.id.btn_update, w.i1(R.string.DownloadUpdate), 3, R.drawable.baseline_system_update_24)).b().a(), new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean w10;
                        w10 = j.this.w(view, i10);
                        return w10;
                    }
                });
                return true;
            }
        } else if (i02 != 2) {
            if (i02 == 3) {
                o();
            }
        } else if (this.U.ia() instanceof TdApi.NetworkTypeWiFi) {
            o();
        } else {
            this.U.O9().e0(this);
            return true;
        }
        return false;
    }
}
