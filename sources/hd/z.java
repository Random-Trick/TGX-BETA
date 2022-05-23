package hd;

import ce.a0;
import ld.h;
import ld.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import zd.o6;

public class z extends o<TdApi.InlineQueryResultPhoto> {
    public h f13760a0;
    public h f13761b0;
    public h f13762c0;
    public final int f13763d0;
    public final int f13764e0;

    public z(a aVar, o6 o6Var, TdApi.InlineQueryResultPhoto inlineQueryResultPhoto) {
        super(aVar, o6Var, 10, inlineQueryResultPhoto.f19926id, inlineQueryResultPhoto);
        if (inlineQueryResultPhoto.photo.minithumbnail != null) {
            i iVar = new i(inlineQueryResultPhoto.photo.minithumbnail);
            this.f13760a0 = iVar;
            iVar.s0(2);
        }
        TdApi.PhotoSize l10 = f0.l(inlineQueryResultPhoto.photo);
        TdApi.PhotoSize o10 = f0.o(inlineQueryResultPhoto.photo, l10);
        this.f13763d0 = f0.T(inlineQueryResultPhoto.photo, o10);
        this.f13764e0 = f0.H(inlineQueryResultPhoto.photo, o10);
        if (l10 != null) {
            h hVar = new h(o6Var, l10.photo);
            this.f13761b0 = hVar;
            hVar.s0(2);
            this.f13761b0.g0(false);
        }
        if (o10 != null) {
            h hVar2 = new h(o6Var, o10.photo);
            this.f13762c0 = hVar2;
            hVar2.s0(2);
            this.f13762c0.g0(false);
            this.f13762c0.t0(a0.i(128.0f));
        }
    }

    public h Z() {
        return this.f13762c0;
    }

    public h a0() {
        return this.f13760a0;
    }

    public h b0() {
        return this.f13761b0;
    }

    @Override
    public int l() {
        return this.f13764e0;
    }

    @Override
    public int m() {
        return this.f13763d0;
    }
}
