package ad;

import be.C1379j0;
import com.google.android.youtube.player.AbstractC3514b;
import org.thunderdog.challegram.Log;
import p313w6.EnumC9986b;

public class RunnableC0266h implements AbstractC3514b.AbstractC3516b, AbstractC3514b.AbstractC3517c, AbstractC3514b.AbstractC3518d, Runnable {
    public C0274o f799M;
    public AbstractC3514b f800N;
    public int f801O;
    public int f802a;
    public String f803b;
    public AbstractC0267a f804c;

    public interface AbstractC0267a {
        void mo41921Q0();

        void mo41920V();

        void mo41919w0(String str);
    }

    public RunnableC0266h(String str, C0274o oVar, AbstractC0267a aVar) {
        this.f803b = str;
        this.f799M = oVar;
        this.f804c = aVar;
    }

    @Override
    public void mo30259a() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onStopped", new Object[0]);
        }
        int i = this.f802a & (-5);
        this.f802a = i;
        this.f802a = i | 1;
    }

    @Override
    public void mo30258b(boolean z) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onBuffering", new Object[0]);
        }
    }

    @Override
    public void mo30254c() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onAdStarted", new Object[0]);
        }
    }

    @Override
    public void mo30261d(AbstractC3514b.AbstractC3520f fVar, AbstractC3514b bVar, boolean z) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "YouTube: onInitializationSuccess restored: %b player: %s, provider: %s", Boolean.valueOf(z), bVar.toString(), fVar.toString());
        }
        this.f800N = bVar;
        bVar.mo5936m(AbstractC3514b.EnumC3519e.CHROMELESS);
        m41966o(z);
    }

    @Override
    public void mo30260e(AbstractC3514b.AbstractC3520f fVar, EnumC9986b bVar) {
        Log.m14727e((int) Log.TAG_YOUTUBE, "onInitializationError", bVar.toString(), fVar.toString());
        AbstractC0267a aVar = this.f804c;
        if (aVar != null) {
            aVar.mo41919w0(C0264f.m41976b(bVar));
        }
    }

    @Override
    public void mo30257f() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onPaused", new Object[0]);
        }
        this.f802a &= -5;
        C0274o oVar = this.f799M;
        if (oVar != null) {
            oVar.m41934x(false, false);
        }
    }

    @Override
    public void mo30253g(String str) {
        AbstractC3514b bVar;
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onLoaded: %s", str);
        }
        C0274o oVar = this.f799M;
        if (oVar != null && (bVar = this.f800N) != null && (this.f802a & 2) == 0) {
            oVar.setDuration(bVar.mo5931r());
            AbstractC0267a aVar = this.f804c;
            if (aVar != null) {
                aVar.mo41921Q0();
            }
        }
    }

    @Override
    public void mo30256h(int i) {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onSeekTo %d", Integer.valueOf(i));
        }
        this.f801O = i;
        C0274o oVar = this.f799M;
        if (oVar != null && (this.f802a & 2) == 0) {
            oVar.setCurrentSeek(i);
        }
    }

    @Override
    public void mo30252i() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "YouTube: onVideoStarted", new Object[0]);
        }
    }

    @Override
    public void mo30255j() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onPlaying", new Object[0]);
        }
        int i = this.f802a | 4;
        this.f802a = i;
        if ((i & 8) != 0) {
            this.f802a = i & (-9);
            C0274o oVar = this.f799M;
            if (oVar != null) {
                oVar.m41933y();
            }
        }
        C0274o oVar2 = this.f799M;
        if (oVar2 != null) {
            oVar2.post(this);
            this.f799M.m41934x(true, false);
        }
    }

    @Override
    public void mo30251k() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onVideoEnded", new Object[0]);
        }
        this.f802a |= 8;
        this.f801O = 0;
        C0274o oVar = this.f799M;
        if (oVar != null) {
            oVar.m41935w();
        }
    }

    @Override
    public void mo30250l() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14721i((int) Log.TAG_YOUTUBE, "onLoading", new Object[0]);
        }
    }

    @Override
    public void mo30249m(AbstractC3514b.EnumC3515a aVar) {
        Log.m14727e((int) Log.TAG_YOUTUBE, "onError: %s", aVar.toString());
        C1379j0.m37293z0(aVar.name(), 0);
    }

    public AbstractC3514b m41967n() {
        return this.f800N;
    }

    public final void m41966o(boolean z) {
        try {
            this.f800N.mo5940i(false);
            this.f800N.mo5935n(8);
            this.f800N.mo5939j(this);
            this.f800N.mo5934o(this);
            if (z) {
                m41962s(this.f800N, true);
            } else {
                m41962s(this.f800N, false);
            }
        } catch (Throwable unused) {
            AbstractC0267a aVar = this.f804c;
            if (aVar != null) {
                aVar.mo41920V();
            }
        }
    }

    public boolean m41965p() {
        int i = this.f802a;
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public void m41964q() {
        this.f802a |= 2;
    }

    public void m41963r() {
        int i = this.f802a;
        if ((i & 1) != 0) {
            this.f802a = i & (-2);
            m41962s(this.f800N, true);
        }
    }

    @Override
    public void run() {
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14716v((int) Log.TAG_YOUTUBE, "Updating current seek", new Object[0]);
        }
        if (this.f799M != null && (this.f802a & 2) == 0) {
            int q = this.f800N.mo5932q();
            this.f801O = q;
            if (this.f800N != null && (this.f802a & 8) == 0) {
                this.f799M.setCurrentSeek(q);
            }
            if ((this.f802a & 4) != 0) {
                this.f799M.postDelayed(this, 500L);
            }
        }
    }

    public void m41962s(AbstractC3514b bVar, boolean z) {
        try {
            if (z) {
                bVar.mo5933p(this.f803b, this.f801O);
            } else {
                bVar.mo5941h(this.f803b);
            }
        } catch (Throwable unused) {
            AbstractC0267a aVar = this.f804c;
            if (aVar != null) {
                aVar.mo41920V();
            }
        }
    }
}
