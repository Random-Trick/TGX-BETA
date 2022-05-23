package vc;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import ce.a0;
import ce.e0;
import hd.n;
import hd.t2;
import ib.d;
import ie.t;
import java.io.File;
import ld.b;
import ld.h;
import ld.i;
import ld.s;
import ld.v;
import md.j;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class o0 extends n0 {
    public h M;
    public j N;
    public h O;
    public j P;
    public boolean Q;
    public Path f25155c;

    public o0(o6 o6Var, int i10, int i11, TdApi.ProfilePhoto profilePhoto, TdApi.Thumbnail thumbnail) {
        super(i10, i11);
    }

    @Override
    public <T extends View & t> void b(T t10, Canvas canvas, b bVar, float f10, float f11, float f12, float f13, int i10, float f14) {
        v t11 = t(bVar);
        v u10 = u(bVar);
        t11.E0(i10);
        u10.E0(i10);
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) (f10 + f12);
        int i14 = (int) (f11 + f13);
        t11.K0(i11, i12, i13, i14);
        u10.K0(i11, i12, i13, i14);
        int i15 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
        if (i15 != 0) {
            t11.V(f14);
            u10.V(f14);
        }
        if (u10.e0()) {
            if (t11.e0()) {
                Path path = this.f25155c;
                if (path != null) {
                    t11.F0(canvas, path, f14);
                } else {
                    t11.O(canvas);
                }
            }
            t11.draw(canvas);
        }
        if (this.Q) {
            u10.j1(canvas, i10, ae.j.L(R.id.theme_color_file));
        }
        u10.draw(canvas);
        if (this.Q) {
            u10.j1(canvas, i10, d.a(u10.getAlpha() * f14, 1140850688));
        }
        if (i15 != 0) {
            t11.Q();
            u10.Q();
        }
    }

    @Override
    public boolean e(b bVar) {
        if (u(bVar).e0()) {
            return t(bVar).e0();
        }
        return false;
    }

    @Override
    public void f(b bVar, boolean z10) {
        bVar.j(0L).r(this.N);
        bVar.j(1L).r(this.P);
        bVar.l(0).j(this.M, this.O);
    }

    public final v t(b bVar) {
        return this.N != null ? bVar.j(0L) : bVar.l(0).f();
    }

    public final v u(b bVar) {
        return this.P != null ? bVar.j(1L) : bVar.l(0).h();
    }

    public o0(o6 o6Var, int i10, int i11, TdApi.ChatPhotoInfo chatPhotoInfo) {
        super(i10, i11);
        if (chatPhotoInfo.minithumbnail != null) {
            i iVar = new i(chatPhotoInfo.minithumbnail);
            this.M = iVar;
            iVar.t0(i10);
            this.M.s0(2);
            this.M.Z(true);
        }
        TdApi.File file = chatPhotoInfo.big;
        if (file != null) {
            h hVar = new h(o6Var, file, null);
            this.O = hVar;
            hVar.t0(i10);
            this.O.s0(2);
            this.O.Z(true);
            this.O.k0();
        }
    }

    public o0(o6 o6Var, int i10, int i11, TdApi.Venue venue, TdApi.Thumbnail thumbnail) {
        this(o6Var, i10, i11, venue.location, thumbnail);
    }

    public o0(o6 o6Var, int i10, int i11, TdApi.Location location, TdApi.Thumbnail thumbnail) {
        super(i10, i11);
        if (thumbnail != null) {
            h D5 = t2.D5(o6Var, thumbnail);
            this.M = D5;
            if (D5 != null) {
                D5.t0(i10);
                this.M.s0(2);
                this.M.Z(true);
                this.M.k0();
            }
            j C5 = t2.C5(o6Var, thumbnail);
            this.N = C5;
            if (C5 != null) {
                C5.F(true);
                this.N.J(i10);
                this.N.I(2);
                this.N.G();
            }
        }
        if (he.i.c2().g1(true) != 2) {
            int i12 = a0.h() >= 2.0f ? 2 : 1;
            int i13 = i10 / i12;
            TdApi.GetMapThumbnailFile getMapThumbnailFile = new TdApi.GetMapThumbnailFile(location, 16, i13, i13, i12, 0L);
            this.O = new ld.j(o6Var, getMapThumbnailFile, "telegram_map_" + location.latitude + "," + location.longitude + "_" + i10);
        } else {
            this.O = new ld.j(o6Var, v0.H0(location.latitude, location.longitude, 16, false, i10, i10), new TdApi.FileTypeThumbnail());
        }
        this.O.t0(i10);
        this.O.s0(2);
        this.O.Z(true);
        this.O.k0();
    }

    public o0(o6 o6Var, int i10, int i11, TdApi.Thumbnail thumbnail, TdApi.Minithumbnail minithumbnail) {
        super(i10, i11);
        if (minithumbnail != null) {
            i iVar = new i(minithumbnail);
            this.M = iVar;
            iVar.t0(i10);
            this.M.s0(2);
            this.M.Z(true);
        }
        if (thumbnail != null) {
            h D5 = t2.D5(o6Var, thumbnail);
            this.O = D5;
            if (D5 != null) {
                D5.t0(i10);
                this.O.s0(2);
                this.O.Z(true);
                this.O.k0();
            }
            j C5 = t2.C5(o6Var, thumbnail);
            this.P = C5;
            if (C5 != null) {
                C5.F(true);
                this.P.J(i10);
                this.P.I(2);
                this.P.G();
            }
        }
    }

    public o0(o6 o6Var, int i10, int i11, File file, String str) {
        super(i10, i11);
        if (e0.c(str)) {
            h F = n.F(new i(file.getPath()), str);
            this.O = F;
            F.p0();
            this.O.Z(true);
        } else if (e0.f(str)) {
            h F2 = n.F(new s(o6Var, t2.H4(file)), str);
            this.O = F2;
            F2.Z(true);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public o0(o6 o6Var, int i10, int i11, TdApi.Sticker sticker) {
        super(i10, i11);
        float f10 = i10;
        this.f25155c = e.c(sticker.outline, Math.min(f10 / sticker.width, f10 / sticker.height), this.f25155c);
        TdApi.Thumbnail thumbnail = sticker.thumbnail;
        if (thumbnail != null) {
            h D5 = t2.D5(o6Var, thumbnail);
            this.M = D5;
            if (D5 != null) {
                D5.t0(i10);
                this.M.s0(1);
            }
            j C5 = t2.C5(o6Var, sticker.thumbnail);
            this.N = C5;
            if (C5 != null) {
                C5.J(i10);
                this.N.I(1);
            }
        }
        if (e.X0(sticker.type)) {
            j jVar = new j(o6Var, sticker);
            this.P = jVar;
            jVar.F(true);
            this.P.J(i10);
            this.P.I(1);
            this.P.G();
            return;
        }
        h hVar = new h(o6Var, sticker.sticker);
        this.O = hVar;
        hVar.x0();
        this.O.k0();
        this.O.t0(i10);
        this.O.s0(1);
    }

    public o0(int i10, int i11, h hVar) {
        super(i10, i11);
        this.Q = true;
        this.O = hVar;
        hVar.t0(i10);
        this.O.s0(2);
        this.O.Z(true);
        this.O.k0();
    }
}
