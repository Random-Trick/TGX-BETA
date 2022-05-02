package p291uc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import be.C1357a0;
import be.C1369e0;
import gd.C4707n;
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p108hb.C5064d;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6246h;
import p156kd.C6250i;
import p156kd.C6251j;
import p156kd.C6261s;
import p168ld.C6503j;
import p193nb.C7321e;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C9629p0 extends AbstractC9622o0 {
    public C6246h f31233M;
    public C6503j f31234N;
    public C6246h f31235O;
    public C6503j f31236P;
    public boolean f31237Q;
    public Path f31238c;

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.ProfilePhoto profilePhoto, TdApi.Thumbnail thumbnail) {
        super(i, i2);
    }

    @Override
    public <T extends View & AbstractC5143t> void mo7957b(T t, Canvas canvas, C6238b bVar, float f, float f2, float f3, float f4, int i, float f5) {
        AbstractC6264v t2 = m7954t(bVar);
        AbstractC6264v u = m7953u(bVar);
        t2.mo20260D0(i);
        u.mo20260D0(i);
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = (int) (f + f3);
        int i5 = (int) (f2 + f4);
        t2.mo20257K0(i2, i3, i4, i5);
        u.mo20257K0(i2, i3, i4, i5);
        int i6 = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        if (i6 != 0) {
            t2.mo20251U(f5);
            u.mo20251U(f5);
        }
        if (u.mo20247c0()) {
            if (t2.mo20247c0()) {
                Path path = this.f31238c;
                if (path != null) {
                    t2.mo20259E0(canvas, path, f5);
                } else {
                    t2.mo20256N(canvas);
                }
            }
            t2.draw(canvas);
        }
        if (this.f31237Q) {
            u.mo20237m1(canvas, i, C11524j.m228N(R.id.theme_color_file));
        }
        u.draw(canvas);
        if (this.f31237Q) {
            u.mo20237m1(canvas, i, C5064d.m24132a(u.getAlpha() * f5, 1140850688));
        }
        if (i6 != 0) {
            t2.mo20254P();
            u.mo20254P();
        }
    }

    @Override
    public boolean mo7956e(C6238b bVar) {
        if (m7953u(bVar).mo20247c0()) {
            return m7954t(bVar).mo20247c0();
        }
        return false;
    }

    @Override
    public void mo7955f(C6238b bVar, boolean z) {
        bVar.m20994j(0L).m20232r(this.f31234N);
        bVar.m20994j(1L).m20232r(this.f31236P);
        bVar.m20992l(0).m20978j(this.f31233M, this.f31235O);
    }

    public final AbstractC6264v m7954t(C6238b bVar) {
        return this.f31234N != null ? bVar.m20994j(0L) : bVar.m20992l(0).m20982e();
    }

    public final AbstractC6264v m7953u(C6238b bVar) {
        return this.f31236P != null ? bVar.m20994j(1L) : bVar.m20992l(0).m20980h();
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.ChatPhotoInfo chatPhotoInfo) {
        super(i, i2);
        if (chatPhotoInfo.minithumbnail != null) {
            C6250i iVar = new C6250i(chatPhotoInfo.minithumbnail);
            this.f31233M = iVar;
            iVar.mo20768t0(i);
            this.f31233M.m20898s0(2);
            this.f31233M.m20931Z(true);
        }
        TdApi.File file = chatPhotoInfo.big;
        if (file != null) {
            C6246h hVar = new C6246h(q6Var, file, null);
            this.f31235O = hVar;
            hVar.mo20768t0(i);
            this.f31235O.m20898s0(2);
            this.f31235O.m20931Z(true);
            this.f31235O.m20910k0();
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Venue venue, TdApi.Thumbnail thumbnail) {
        this(q6Var, i, i2, venue.location, thumbnail);
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Location location, TdApi.Thumbnail thumbnail) {
        super(i, i2);
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25705D5(q6Var, thumbnail);
            this.f31233M = D5;
            if (D5 != null) {
                D5.mo20768t0(i);
                this.f31233M.m20898s0(2);
                this.f31233M.m20931Z(true);
                this.f31233M.m20910k0();
            }
            C6503j C5 = C4779t2.m25712C5(q6Var, thumbnail);
            this.f31234N = C5;
            if (C5 != null) {
                C5.m20301F(true);
                this.f31234N.m20297J(i);
                this.f31234N.m20298I(2);
                this.f31234N.m20300G();
            }
        }
        if (C4868i.m24727c2().m24696g1(true) != 2) {
            int i3 = C1357a0.m37545h() >= 2.0f ? 2 : 1;
            int i4 = i / i3;
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(location, 16, i4, i4, i3, 0L);
            this.f31235O = new C6251j(q6Var, getMapThumbnailFile, "telegram_map_" + location.latitude + "," + location.longitude + "_" + i);
        } else {
            this.f31235O = new C6251j(q6Var, C7389v0.m16729H0(location.latitude, location.longitude, 16, false, i, i), new TdApi.FileTypeThumbnail());
        }
        this.f31235O.mo20768t0(i);
        this.f31235O.m20898s0(2);
        this.f31235O.m20931Z(true);
        this.f31235O.m20910k0();
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Thumbnail thumbnail, TdApi.Minithumbnail minithumbnail) {
        super(i, i2);
        if (minithumbnail != null) {
            C6250i iVar = new C6250i(minithumbnail);
            this.f31233M = iVar;
            iVar.mo20768t0(i);
            this.f31233M.m20898s0(2);
            this.f31233M.m20931Z(true);
        }
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25705D5(q6Var, thumbnail);
            this.f31235O = D5;
            if (D5 != null) {
                D5.mo20768t0(i);
                this.f31235O.m20898s0(2);
                this.f31235O.m20931Z(true);
                this.f31235O.m20910k0();
            }
            C6503j C5 = C4779t2.m25712C5(q6Var, thumbnail);
            this.f31236P = C5;
            if (C5 != null) {
                C5.m20301F(true);
                this.f31236P.m20297J(i);
                this.f31236P.m20298I(2);
                this.f31236P.m20300G();
            }
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, File file, String str) {
        super(i, i2);
        if (C1369e0.m37399c(str)) {
            C6246h E = C4707n.m26425E(new C6250i(file.getPath()), str);
            this.f31235O = E;
            E.m20901p0();
            this.f31235O.m20931Z(true);
        } else if (C1369e0.m37396f(str)) {
            C6246h E2 = C4707n.m26425E(new C6261s(q6Var, C4779t2.m25678H4(file)), str);
            this.f31235O = E2;
            E2.m20931Z(true);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Sticker sticker) {
        super(i, i2);
        float f = i;
        this.f31238c = C7321e.m16961c(sticker.outline, Math.min(f / sticker.width, f / sticker.height), this.f31238c);
        TdApi.Thumbnail thumbnail = sticker.thumbnail;
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25705D5(q6Var, thumbnail);
            this.f31233M = D5;
            if (D5 != null) {
                D5.mo20768t0(i);
                this.f31233M.m20898s0(1);
            }
            C6503j C5 = C4779t2.m25712C5(q6Var, sticker.thumbnail);
            this.f31234N = C5;
            if (C5 != null) {
                C5.m20297J(i);
                this.f31234N.m20298I(1);
            }
        }
        if (C7321e.m16976V0(sticker.type)) {
            C6503j jVar = new C6503j(q6Var, sticker);
            this.f31236P = jVar;
            jVar.m20301F(true);
            this.f31236P.m20297J(i);
            this.f31236P.m20298I(1);
            this.f31236P.m20300G();
            return;
        }
        C6246h hVar = new C6246h(q6Var, sticker.sticker);
        this.f31235O = hVar;
        hVar.m20890x0();
        this.f31235O.m20910k0();
        this.f31235O.mo20768t0(i);
        this.f31235O.m20898s0(1);
    }

    public C9629p0(int i, int i2, C6246h hVar) {
        super(i, i2);
        this.f31237Q = true;
        this.f31235O = hVar;
        hVar.mo20768t0(i);
        this.f31235O.m20898s0(2);
        this.f31235O.m20931Z(true);
        this.f31235O.m20910k0();
    }
}
