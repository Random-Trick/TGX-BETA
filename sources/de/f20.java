package de;

import android.content.Context;
import android.view.View;
import hd.t2;
import ld.h;
import ne.m1;
import od.o;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import qd.b;
import ud.v4;
import zd.o6;

public class f20 extends v4<a> implements m1.j {
    public o f7914n0;

    public f20(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public boolean Ne() {
        return false;
    }

    @Override
    public int R9() {
        return R.id.controller_media_simple;
    }

    @Override
    public void W4(m1.f fVar) {
        this.f7914n0.setBoundForceTouchContext(fVar);
        fVar.E(true);
        fVar.O(this.f7914n0);
        fVar.F(1879048192);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f7914n0.h0();
    }

    @Override
    public View oc(Context context) {
        o oVar = new o(t());
        this.f7914n0 = oVar;
        b bVar = null;
        oVar.setBoundForceTouchContext(null);
        a x92 = x9();
        int i10 = x92.f7915a;
        if (i10 == 0) {
            bVar = b.W0(t(), this.f24495b, x92.f7916b, null);
            if (bVar.f0()) {
                bVar.G0(x92.f7919e);
            } else {
                bVar.G0(x92.f7918d);
            }
        } else if (i10 == 1) {
            if (t2.T2(x92.f7917c.animation)) {
                this.f7914n0.F0();
            }
            bVar = b.U0(t(), this.f24495b, x92.f7917c, null);
        } else if (i10 == 2) {
            bVar = new b(t(), this.f24495b, 0L, x92.f7920f);
        } else if (i10 == 3) {
            bVar = new b(t(), this.f24495b, 0L, x92.f7921g);
        }
        if (bVar != null) {
            bVar.q(true);
            this.f7914n0.setMedia(bVar);
            n9();
            return this.f7914n0;
        }
        throw new IllegalArgumentException();
    }

    public static class a {
        public final int f7915a = 1;
        public TdApi.Photo f7916b;
        public TdApi.Animation f7917c;
        public h f7918d;
        public h f7919e;
        public TdApi.ProfilePhoto f7920f;
        public TdApi.ChatPhotoInfo f7921g;

        public a(TdApi.Photo photo, h hVar, h hVar2) {
            this.f7916b = photo;
            this.f7918d = hVar;
            this.f7919e = hVar2;
        }

        public a(TdApi.Animation animation, h hVar) {
            this.f7917c = animation;
            this.f7918d = hVar;
        }

        public a(TdApi.ProfilePhoto profilePhoto) {
            this.f7920f = profilePhoto;
        }

        public a(TdApi.ChatPhotoInfo chatPhotoInfo) {
            this.f7921g = chatPhotoInfo;
        }
    }
}
