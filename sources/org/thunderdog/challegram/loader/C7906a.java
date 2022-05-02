package org.thunderdog.challegram.loader;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.C7907b;
import p147k4.C6053a;
import p156kd.C6243f;
import p156kd.C6244g;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6252k;
import p156kd.C6253l;
import p156kd.C6256o;
import p156kd.C6261s;
import p156kd.C6267y;
import p193nb.C7321e;
import p242r1.C8348b;
import p292ud.C9726c;
import p350yd.C10536ab;
import p350yd.C10930q6;

public class C7906a implements C7907b.AbstractC7910c, C9726c.AbstractC9728b {
    public C6246h f25599a;
    public volatile boolean f25600b;
    public CancellationSignal f25601c;

    public C7906a(C6246h hVar) {
        this.f25599a = hVar;
    }

    public static boolean m14377h(C6246h hVar) {
        return (hVar instanceof C6253l) || (hVar instanceof C6250i) || (hVar instanceof C6256o) || (hVar instanceof C6261s) || (hVar instanceof C6252k) || (hVar instanceof C6243f);
    }

    @Override
    public void mo7376a(C10930q6 q6Var, TdApi.Message message, C6053a aVar) {
        if (!this.f25600b) {
            ((C6243f) this.f25599a).m20971F0(aVar);
            C7907b.m14362k().m14356q(this, this.f25599a, null, this);
        }
    }

    @Override
    public void mo14348b(boolean z, Bitmap bitmap) {
        if (z) {
            if (this.f25599a.m20937S()) {
                try {
                    this.f25599a.m20902o0(C8348b.m12722b(bitmap).m12711a().m12718f());
                } catch (Throwable th) {
                    Log.m14725e("Failed to generate palette", th, new Object[0]);
                }
            }
            if (this.f25599a.m20887y0()) {
                C6244g.m20960k().m20959l(this.f25599a, bitmap);
            } else if (this.f25600b) {
                Log.m14721i(32, "#%s: recycling bitmap because associated actor is canceled and image should not be cached", this.f25599a.toString());
                bitmap.recycle();
                return;
            }
        }
        ImageLoader.m14392e().m14387j(this.f25599a, z, bitmap);
    }

    public final void m14382c(String str) {
        if (!this.f25600b) {
            if (Log.isEnabled(32)) {
                Log.m14716v(32, "#%s: loading from local storage: %s", this.f25599a.toString(), str);
            }
            C6246h hVar = this.f25599a;
            if (hVar instanceof C6243f) {
                m14374k((C6243f) hVar);
            } else {
                C7907b.m14362k().m14356q(this, this.f25599a, str, this);
            }
        }
    }

    public boolean m14381d() {
        if (this.f25600b) {
            Log.m14721i(32, "#%s: tried to start working, but actor has been cancelled", this.f25599a.toString());
            return false;
        }
        TdApi.File k = this.f25599a.m20910k();
        if (!m14377h(this.f25599a) && !C4779t2.m25586V2(k)) {
            return true;
        }
        m14382c(this.f25599a.mo20875q());
        return false;
    }

    public void m14380e() {
        this.f25600b = true;
        CancellationSignal cancellationSignal = this.f25601c;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        C6246h hVar = this.f25599a;
        if (hVar instanceof C6243f) {
            C6243f fVar = (C6243f) hVar;
            C10536ab.m4667o1().m4729Y().m7404O(fVar.m20952B0(), fVar.m20972E0(), this);
        }
    }

    public CancellationSignal m14379f() {
        if (this.f25601c == null) {
            this.f25601c = new CancellationSignal();
        }
        if (this.f25600b) {
            this.f25601c.cancel();
        }
        return this.f25601c;
    }

    public boolean m14378g() {
        return this.f25600b;
    }

    public void m14376i(TdApi.File file) {
        if (!this.f25600b) {
            C7321e.m16907u(file, this.f25599a.m20910k());
            m14382c(file.local.path);
        }
    }

    public void m14375j(TdApi.File file) {
        this.f25599a.m20951C0(file);
    }

    public final void m14374k(C6243f fVar) {
        C6053a t0 = C10536ab.m4667o1().m4729Y().m7384t0(fVar.m20952B0(), fVar.m20972E0(), this);
        if (t0 != null) {
            mo7376a(fVar.m20952B0(), fVar.m20972E0(), t0);
        }
    }

    public void m14373l(C6267y yVar) {
        C6246h hVar = this.f25599a;
        yVar.m20749b(hVar, hVar.m20893v());
    }
}
