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
    public C6246h f25602a;
    public volatile boolean f25603b;
    public CancellationSignal f25604c;

    public C7906a(C6246h hVar) {
        this.f25602a = hVar;
    }

    public static boolean m14376h(C6246h hVar) {
        return (hVar instanceof C6253l) || (hVar instanceof C6250i) || (hVar instanceof C6256o) || (hVar instanceof C6261s) || (hVar instanceof C6252k) || (hVar instanceof C6243f);
    }

    @Override
    public void mo7376a(C10930q6 q6Var, TdApi.Message message, C6053a aVar) {
        if (!this.f25603b) {
            ((C6243f) this.f25602a).m20972F0(aVar);
            C7907b.m14361k().m14355q(this, this.f25602a, null, this);
        }
    }

    @Override
    public void mo14347b(boolean z, Bitmap bitmap) {
        if (z) {
            if (this.f25602a.m20938S()) {
                try {
                    this.f25602a.m20903o0(C8348b.m12721b(bitmap).m12710a().m12717f());
                } catch (Throwable th) {
                    Log.m14725e("Failed to generate palette", th, new Object[0]);
                }
            }
            if (this.f25602a.m20888y0()) {
                C6244g.m20961k().m20960l(this.f25602a, bitmap);
            } else if (this.f25603b) {
                Log.m14721i(32, "#%s: recycling bitmap because associated actor is canceled and image should not be cached", this.f25602a.toString());
                bitmap.recycle();
                return;
            }
        }
        ImageLoader.m14391e().m14386j(this.f25602a, z, bitmap);
    }

    public final void m14381c(String str) {
        if (!this.f25603b) {
            if (Log.isEnabled(32)) {
                Log.m14716v(32, "#%s: loading from local storage: %s", this.f25602a.toString(), str);
            }
            C6246h hVar = this.f25602a;
            if (hVar instanceof C6243f) {
                m14373k((C6243f) hVar);
            } else {
                C7907b.m14361k().m14355q(this, this.f25602a, str, this);
            }
        }
    }

    public boolean m14380d() {
        if (this.f25603b) {
            Log.m14721i(32, "#%s: tried to start working, but actor has been cancelled", this.f25602a.toString());
            return false;
        }
        TdApi.File k = this.f25602a.m20911k();
        if (!m14376h(this.f25602a) && !C4779t2.m25587V2(k)) {
            return true;
        }
        m14381c(this.f25602a.mo20876q());
        return false;
    }

    public void m14379e() {
        this.f25603b = true;
        CancellationSignal cancellationSignal = this.f25604c;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        C6246h hVar = this.f25602a;
        if (hVar instanceof C6243f) {
            C6243f fVar = (C6243f) hVar;
            C10536ab.m4667o1().m4729Y().m7404O(fVar.m20953B0(), fVar.m20973E0(), this);
        }
    }

    public CancellationSignal m14378f() {
        if (this.f25604c == null) {
            this.f25604c = new CancellationSignal();
        }
        if (this.f25603b) {
            this.f25604c.cancel();
        }
        return this.f25604c;
    }

    public boolean m14377g() {
        return this.f25603b;
    }

    public void m14375i(TdApi.File file) {
        if (!this.f25603b) {
            C7321e.m16907u(file, this.f25602a.m20911k());
            m14381c(file.local.path);
        }
    }

    public void m14374j(TdApi.File file) {
        this.f25602a.m20952C0(file);
    }

    public final void m14373k(C6243f fVar) {
        C6053a t0 = C10536ab.m4667o1().m4729Y().m7384t0(fVar.m20953B0(), fVar.m20973E0(), this);
        if (t0 != null) {
            mo7376a(fVar.m20953B0(), fVar.m20973E0(), t0);
        }
    }

    public void m14372l(C6267y yVar) {
        C6246h hVar = this.f25602a;
        yVar.m20750b(hVar, hVar.m20894v());
    }
}
