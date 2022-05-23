package bd;

import ce.j0;
import com.google.android.youtube.player.b;
import org.thunderdog.challegram.Log;

public class h implements b.AbstractC0074b, b.c, b.d, Runnable {
    public o M;
    public b N;
    public int O;
    public int f4117a;
    public String f4118b;
    public a f4119c;

    public interface a {
        void P0();

        void W();

        void v0(String str);
    }

    public h(String str, o oVar, a aVar) {
        this.f4118b = str;
        this.M = oVar;
        this.f4119c = aVar;
    }

    @Override
    public void a() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onStopped", new Object[0]);
        }
        this.f4117a = (this.f4117a & (-5)) | 1;
    }

    @Override
    public void b(boolean z10) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onBuffering", new Object[0]);
        }
    }

    @Override
    public void c() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onAdStarted", new Object[0]);
        }
    }

    @Override
    public void d(b.f fVar, b bVar, boolean z10) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "YouTube: onInitializationSuccess restored: %b player: %s, provider: %s", Boolean.valueOf(z10), bVar.toString(), fVar.toString());
        }
        this.N = bVar;
        bVar.m(b.e.CHROMELESS);
        o(z10);
    }

    @Override
    public void e() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onPaused", new Object[0]);
        }
        this.f4117a &= -5;
        o oVar = this.M;
        if (oVar != null) {
            oVar.x(false, false);
        }
    }

    @Override
    public void f(String str) {
        b bVar;
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onLoaded: %s", str);
        }
        o oVar = this.M;
        if (oVar != null && (bVar = this.N) != null && (this.f4117a & 2) == 0) {
            oVar.setDuration(bVar.r());
            a aVar = this.f4119c;
            if (aVar != null) {
                aVar.P0();
            }
        }
    }

    @Override
    public void g() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "YouTube: onVideoStarted", new Object[0]);
        }
    }

    @Override
    public void h(int i10) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onSeekTo %d", Integer.valueOf(i10));
        }
        this.O = i10;
        o oVar = this.M;
        if (oVar != null && (this.f4117a & 2) == 0) {
            oVar.setCurrentSeek(i10);
        }
    }

    @Override
    public void i(b.f fVar, x6.b bVar) {
        Log.e((int) Log.TAG_YOUTUBE, "onInitializationError", bVar.toString(), fVar.toString());
        a aVar = this.f4119c;
        if (aVar != null) {
            aVar.v0(f.b(bVar));
        }
    }

    @Override
    public void j() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onPlaying", new Object[0]);
        }
        int i10 = this.f4117a | 4;
        this.f4117a = i10;
        if ((i10 & 8) != 0) {
            this.f4117a = i10 & (-9);
            o oVar = this.M;
            if (oVar != null) {
                oVar.y();
            }
        }
        o oVar2 = this.M;
        if (oVar2 != null) {
            oVar2.post(this);
            this.M.x(true, false);
        }
    }

    @Override
    public void k() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onVideoEnded", new Object[0]);
        }
        this.f4117a |= 8;
        this.O = 0;
        o oVar = this.M;
        if (oVar != null) {
            oVar.w();
        }
    }

    @Override
    public void l() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i((int) Log.TAG_YOUTUBE, "onLoading", new Object[0]);
        }
    }

    @Override
    public void m(b.a aVar) {
        Log.e((int) Log.TAG_YOUTUBE, "onError: %s", aVar.toString());
        j0.z0(aVar.name(), 0);
    }

    public b n() {
        return this.N;
    }

    public final void o(boolean z10) {
        try {
            this.N.i(false);
            this.N.n(8);
            this.N.j(this);
            this.N.o(this);
            if (z10) {
                s(this.N, true);
            } else {
                s(this.N, false);
            }
        } catch (Throwable unused) {
            a aVar = this.f4119c;
            if (aVar != null) {
                aVar.W();
            }
        }
    }

    public boolean p() {
        int i10 = this.f4117a;
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    public void q() {
        this.f4117a |= 2;
    }

    public void r() {
        int i10 = this.f4117a;
        if ((i10 & 1) != 0) {
            this.f4117a = i10 & (-2);
            s(this.N, true);
        }
    }

    @Override
    public void run() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.v((int) Log.TAG_YOUTUBE, "Updating current seek", new Object[0]);
        }
        if (this.M != null && (this.f4117a & 2) == 0) {
            int q10 = this.N.q();
            this.O = q10;
            if (this.N != null && (this.f4117a & 8) == 0) {
                this.M.setCurrentSeek(q10);
            }
            if ((this.f4117a & 4) != 0) {
                this.M.postDelayed(this, 500L);
            }
        }
    }

    public void s(b bVar, boolean z10) {
        try {
            if (z10) {
                bVar.p(this.f4118b, this.O);
            } else {
                bVar.h(this.f4118b);
            }
        } catch (Throwable unused) {
            a aVar = this.f4119c;
            if (aVar != null) {
                aVar.W();
            }
        }
    }
}
