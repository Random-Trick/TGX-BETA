package org.thunderdog.challegram.loader;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import hd.t2;
import ld.f;
import ld.g;
import ld.h;
import ld.i;
import ld.k;
import ld.l;
import ld.o;
import ld.s;
import ld.y;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.b;
import vd.c;
import zd.o6;
import zd.ya;

public class a implements b.c, c.b {
    public h f20078a;
    public volatile boolean f20079b;
    public CancellationSignal f20080c;

    public a(h hVar) {
        this.f20078a = hVar;
    }

    public static boolean h(h hVar) {
        return (hVar instanceof l) || (hVar instanceof i) || (hVar instanceof o) || (hVar instanceof s) || (hVar instanceof k) || (hVar instanceof f);
    }

    @Override
    public void a(o6 o6Var, TdApi.Message message, k4.a aVar) {
        if (!this.f20079b) {
            ((f) this.f20078a).F0(aVar);
            b.k().q(this, this.f20078a, null, this);
        }
    }

    @Override
    public void b(boolean z10, Bitmap bitmap) {
        if (z10) {
            if (this.f20078a.S()) {
                try {
                    this.f20078a.o0(r1.b.b(bitmap).a().f());
                } catch (Throwable th) {
                    Log.e("Failed to generate palette", th, new Object[0]);
                }
            }
            if (this.f20078a.y0()) {
                g.k().l(this.f20078a, bitmap);
            } else if (this.f20079b) {
                Log.i(32, "#%s: recycling bitmap because associated actor is canceled and image should not be cached", this.f20078a.toString());
                bitmap.recycle();
                return;
            }
        }
        ImageLoader.e().j(this.f20078a, z10, bitmap);
    }

    public final void c(String str) {
        if (!this.f20079b) {
            if (Log.isEnabled(32)) {
                Log.v(32, "#%s: loading from local storage: %s", this.f20078a.toString(), str);
            }
            h hVar = this.f20078a;
            if (hVar instanceof f) {
                k((f) hVar);
            } else {
                b.k().q(this, this.f20078a, str, this);
            }
        }
    }

    public boolean d() {
        if (this.f20079b) {
            Log.i(32, "#%s: tried to start working, but actor has been cancelled", this.f20078a.toString());
            return false;
        }
        TdApi.File k10 = this.f20078a.k();
        if (!h(this.f20078a) && !t2.V2(k10)) {
            return true;
        }
        c(this.f20078a.q());
        return false;
    }

    public void e() {
        this.f20079b = true;
        CancellationSignal cancellationSignal = this.f20080c;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        h hVar = this.f20078a;
        if (hVar instanceof f) {
            f fVar = (f) hVar;
            ya.o1().Y().x0(fVar.B0(), fVar.E0(), this);
        }
    }

    public CancellationSignal f() {
        if (this.f20080c == null) {
            this.f20080c = new CancellationSignal();
        }
        if (this.f20079b) {
            this.f20080c.cancel();
        }
        return this.f20080c;
    }

    public boolean g() {
        return this.f20079b;
    }

    public void i(TdApi.File file) {
        if (!this.f20079b) {
            e.v(file, this.f20078a.k());
            c(file.local.path);
        }
    }

    public void j(TdApi.File file) {
        this.f20078a.C0(file);
    }

    public final void k(f fVar) {
        k4.a R0 = ya.o1().Y().R0(fVar.B0(), fVar.E0(), this);
        if (R0 != null) {
            a(fVar.B0(), fVar.E0(), R0);
        }
    }

    public void l(y yVar) {
        h hVar = this.f20078a;
        yVar.b(hVar, hVar.v());
    }
}
