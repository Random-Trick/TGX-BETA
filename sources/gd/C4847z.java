package gd;

import be.C1357a0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p156kd.C6246h;
import p156kd.C6250i;
import p350yd.C10930q6;

public class C4847z extends AbstractC4718o<TdApi.InlineQueryResultPhoto> {
    public C6246h f16523a0;
    public C6246h f16524b0;
    public C6246h f16525c0;
    public final int f16526d0;
    public final int f16527e0;

    public C4847z(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultPhoto inlineQueryResultPhoto) {
        super(aVar, q6Var, 10, inlineQueryResultPhoto.f25386id, inlineQueryResultPhoto);
        if (inlineQueryResultPhoto.photo.minithumbnail != null) {
            C6250i iVar = new C6250i(inlineQueryResultPhoto.photo.minithumbnail);
            this.f16523a0 = iVar;
            iVar.m20897s0(2);
        }
        TdApi.PhotoSize l = C4630f0.m26738l(inlineQueryResultPhoto.photo);
        TdApi.PhotoSize o = C4630f0.m26732o(inlineQueryResultPhoto.photo, l);
        this.f16526d0 = C4630f0.m26763T(inlineQueryResultPhoto.photo, o);
        this.f16527e0 = C4630f0.m26777H(inlineQueryResultPhoto.photo, o);
        if (l != null) {
            C6246h hVar = new C6246h(q6Var, l.photo);
            this.f16524b0 = hVar;
            hVar.m20897s0(2);
            this.f16524b0.m20917g0(false);
        }
        if (o != null) {
            C6246h hVar2 = new C6246h(q6Var, o.photo);
            this.f16525c0 = hVar2;
            hVar2.m20897s0(2);
            this.f16525c0.m20917g0(false);
            this.f16525c0.mo20767t0(C1357a0.m37541i(128.0f));
        }
    }

    public C6246h m25051Z() {
        return this.f16525c0;
    }

    public C6246h m25050a0() {
        return this.f16523a0;
    }

    public C6246h m25049b0() {
        return this.f16524b0;
    }

    @Override
    public int mo25048l() {
        return this.f16527e0;
    }

    @Override
    public int mo25047m() {
        return this.f16526d0;
    }
}
