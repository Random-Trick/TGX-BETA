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
    public C6246h f31230M;
    public C6503j f31231N;
    public C6246h f31232O;
    public C6503j f31233P;
    public boolean f31234Q;
    public Path f31235c;

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.ProfilePhoto profilePhoto, TdApi.Thumbnail thumbnail) {
        super(i, i2);
    }

    @Override
    public <T extends View & AbstractC5143t> void mo7957b(T t, Canvas canvas, C6238b bVar, float f, float f2, float f3, float f4, int i, float f5) {
        AbstractC6264v t2 = m7954t(bVar);
        AbstractC6264v u = m7953u(bVar);
        t2.mo20259D0(i);
        u.mo20259D0(i);
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = (int) (f + f3);
        int i5 = (int) (f2 + f4);
        t2.mo20256K0(i2, i3, i4, i5);
        u.mo20256K0(i2, i3, i4, i5);
        int i6 = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        if (i6 != 0) {
            t2.mo20250U(f5);
            u.mo20250U(f5);
        }
        if (u.mo20246c0()) {
            if (t2.mo20246c0()) {
                Path path = this.f31235c;
                if (path != null) {
                    t2.mo20258E0(canvas, path, f5);
                } else {
                    t2.mo20255N(canvas);
                }
            }
            t2.draw(canvas);
        }
        if (this.f31234Q) {
            u.mo20236m1(canvas, i, C11524j.m228N(R.id.theme_color_file));
        }
        u.draw(canvas);
        if (this.f31234Q) {
            u.mo20236m1(canvas, i, C5064d.m24131a(u.getAlpha() * f5, 1140850688));
        }
        if (i6 != 0) {
            t2.mo20253P();
            u.mo20253P();
        }
    }

    @Override
    public boolean mo7956e(C6238b bVar) {
        if (m7953u(bVar).mo20246c0()) {
            return m7954t(bVar).mo20246c0();
        }
        return false;
    }

    @Override
    public void mo7955f(C6238b bVar, boolean z) {
        bVar.m20993j(0L).m20231r(this.f31231N);
        bVar.m20993j(1L).m20231r(this.f31233P);
        bVar.m20991l(0).m20977j(this.f31230M, this.f31232O);
    }

    public final AbstractC6264v m7954t(C6238b bVar) {
        return this.f31231N != null ? bVar.m20993j(0L) : bVar.m20991l(0).m20981e();
    }

    public final AbstractC6264v m7953u(C6238b bVar) {
        return this.f31233P != null ? bVar.m20993j(1L) : bVar.m20991l(0).m20979h();
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.ChatPhotoInfo chatPhotoInfo) {
        super(i, i2);
        if (chatPhotoInfo.minithumbnail != null) {
            C6250i iVar = new C6250i(chatPhotoInfo.minithumbnail);
            this.f31230M = iVar;
            iVar.mo20767t0(i);
            this.f31230M.m20897s0(2);
            this.f31230M.m20930Z(true);
        }
        TdApi.File file = chatPhotoInfo.big;
        if (file != null) {
            C6246h hVar = new C6246h(q6Var, file, null);
            this.f31232O = hVar;
            hVar.mo20767t0(i);
            this.f31232O.m20897s0(2);
            this.f31232O.m20930Z(true);
            this.f31232O.m20909k0();
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Venue venue, TdApi.Thumbnail thumbnail) {
        this(q6Var, i, i2, venue.location, thumbnail);
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Location location, TdApi.Thumbnail thumbnail) {
        super(i, i2);
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25704D5(q6Var, thumbnail);
            this.f31230M = D5;
            if (D5 != null) {
                D5.mo20767t0(i);
                this.f31230M.m20897s0(2);
                this.f31230M.m20930Z(true);
                this.f31230M.m20909k0();
            }
            C6503j C5 = C4779t2.m25711C5(q6Var, thumbnail);
            this.f31231N = C5;
            if (C5 != null) {
                C5.m20300F(true);
                this.f31231N.m20296J(i);
                this.f31231N.m20297I(2);
                this.f31231N.m20299G();
            }
        }
        if (C4868i.m24726c2().m24695g1(true) != 2) {
            int i3 = C1357a0.m37542h() >= 2.0f ? 2 : 1;
            int i4 = i / i3;
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(location, 16, i4, i4, i3, 0L);
            this.f31232O = new C6251j(q6Var, getMapThumbnailFile, "telegram_map_" + location.latitude + "," + location.longitude + "_" + i);
        } else {
            this.f31232O = new C6251j(q6Var, C7389v0.m16729H0(location.latitude, location.longitude, 16, false, i, i), new TdApi.FileTypeThumbnail());
        }
        this.f31232O.mo20767t0(i);
        this.f31232O.m20897s0(2);
        this.f31232O.m20930Z(true);
        this.f31232O.m20909k0();
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Thumbnail thumbnail, TdApi.Minithumbnail minithumbnail) {
        super(i, i2);
        if (minithumbnail != null) {
            C6250i iVar = new C6250i(minithumbnail);
            this.f31230M = iVar;
            iVar.mo20767t0(i);
            this.f31230M.m20897s0(2);
            this.f31230M.m20930Z(true);
        }
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25704D5(q6Var, thumbnail);
            this.f31232O = D5;
            if (D5 != null) {
                D5.mo20767t0(i);
                this.f31232O.m20897s0(2);
                this.f31232O.m20930Z(true);
                this.f31232O.m20909k0();
            }
            C6503j C5 = C4779t2.m25711C5(q6Var, thumbnail);
            this.f31233P = C5;
            if (C5 != null) {
                C5.m20300F(true);
                this.f31233P.m20296J(i);
                this.f31233P.m20297I(2);
                this.f31233P.m20299G();
            }
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, File file, String str) {
        super(i, i2);
        if (C1369e0.m37396c(str)) {
            C6246h E = C4707n.m26424E(new C6250i(file.getPath()), str);
            this.f31232O = E;
            E.m20900p0();
            this.f31232O.m20930Z(true);
        } else if (C1369e0.m37393f(str)) {
            C6246h E2 = C4707n.m26424E(new C6261s(q6Var, C4779t2.m25677H4(file)), str);
            this.f31232O = E2;
            E2.m20930Z(true);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C9629p0(C10930q6 q6Var, int i, int i2, TdApi.Sticker sticker) {
        super(i, i2);
        float f = i;
        this.f31235c = C7321e.m16961c(sticker.outline, Math.min(f / sticker.width, f / sticker.height), this.f31235c);
        TdApi.Thumbnail thumbnail = sticker.thumbnail;
        if (thumbnail != null) {
            C6246h D5 = C4779t2.m25704D5(q6Var, thumbnail);
            this.f31230M = D5;
            if (D5 != null) {
                D5.mo20767t0(i);
                this.f31230M.m20897s0(1);
            }
            C6503j C5 = C4779t2.m25711C5(q6Var, sticker.thumbnail);
            this.f31231N = C5;
            if (C5 != null) {
                C5.m20296J(i);
                this.f31231N.m20297I(1);
            }
        }
        if (C7321e.m16976V0(sticker.type)) {
            C6503j jVar = new C6503j(q6Var, sticker);
            this.f31233P = jVar;
            jVar.m20300F(true);
            this.f31233P.m20296J(i);
            this.f31233P.m20297I(1);
            this.f31233P.m20299G();
            return;
        }
        C6246h hVar = new C6246h(q6Var, sticker.sticker);
        this.f31232O = hVar;
        hVar.m20889x0();
        this.f31232O.m20909k0();
        this.f31232O.mo20767t0(i);
        this.f31232O.m20897s0(1);
    }

    public C9629p0(int i, int i2, C6246h hVar) {
        super(i, i2);
        this.f31234Q = true;
        this.f31232O = hVar;
        hVar.mo20767t0(i);
        this.f31232O.m20897s0(2);
        this.f31232O.m20930Z(true);
        this.f31232O.m20909k0();
    }
}
