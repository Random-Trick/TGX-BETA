package p038ce;

import android.content.Context;
import android.view.View;
import gd.C4779t2;
import me.C6957m1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p156kd.C6246h;
import p194nd.RunnableC7470o;
import p225pd.C8112b;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class e20 extends AbstractC9323v4<C2320a> implements C6957m1.AbstractC6967j {
    public RunnableC7470o f7988n0;

    public e20(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public boolean mo9378Ne() {
        return false;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_simple;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f7988n0.m15920h0();
    }

    @Override
    public View mo403oc(Context context) {
        RunnableC7470o oVar = new RunnableC7470o(mo4347s());
        this.f7988n0 = oVar;
        C8112b bVar = null;
        oVar.setBoundForceTouchContext(null);
        C2320a x9 = m9131x9();
        int i = x9.f7989a;
        if (i == 0) {
            bVar = C8112b.m13525W0(mo4347s(), this.f30167b, x9.f7990b, null);
            if (bVar.m13508f0()) {
                bVar.m13557G0(x9.f7993e);
            } else {
                bVar.m13557G0(x9.f7992d);
            }
        } else if (i == 1) {
            if (C4779t2.m25598T2(x9.f7991c.animation)) {
                this.f7988n0.m15958F0();
            }
            bVar = C8112b.m13529U0(mo4347s(), this.f30167b, x9.f7991c, null);
        } else if (i == 2) {
            bVar = new C8112b(mo4347s(), this.f30167b, 0L, x9.f7994f);
        } else if (i == 3) {
            bVar = new C8112b(mo4347s(), this.f30167b, 0L, x9.f7995g);
        }
        if (bVar != null) {
            bVar.m13487q(true);
            this.f7988n0.setMedia(bVar);
            m9204n9();
            return this.f7988n0;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void mo18296v2(C6957m1.C6963f fVar) {
        this.f7988n0.setBoundForceTouchContext(fVar);
        fVar.m18341E(true);
        fVar.m18331O(this.f7988n0);
        fVar.m18340F(1879048192);
    }

    public static class C2320a {
        public final int f7989a = 1;
        public TdApi.Photo f7990b;
        public TdApi.Animation f7991c;
        public C6246h f7992d;
        public C6246h f7993e;
        public TdApi.ProfilePhoto f7994f;
        public TdApi.ChatPhotoInfo f7995g;

        public C2320a(TdApi.Photo photo, C6246h hVar, C6246h hVar2) {
            this.f7990b = photo;
            this.f7992d = hVar;
            this.f7993e = hVar2;
        }

        public C2320a(TdApi.Animation animation, C6246h hVar) {
            this.f7991c = animation;
            this.f7992d = hVar;
        }

        public C2320a(TdApi.ProfilePhoto profilePhoto) {
            this.f7994f = profilePhoto;
        }

        public C2320a(TdApi.ChatPhotoInfo chatPhotoInfo) {
            this.f7995g = chatPhotoInfo;
        }
    }
}
