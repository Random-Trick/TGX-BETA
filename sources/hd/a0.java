package hd;

import dd.l;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import zd.o6;

public class a0 extends o<TdApi.InlineQueryResultSticker> {
    public final l f12691a0;

    public a0(a aVar, o6 o6Var, String str, TdApi.InlineQueryResultSticker inlineQueryResultSticker) {
        super(aVar, o6Var, 11, inlineQueryResultSticker.f19927id, inlineQueryResultSticker);
        TdApi.Sticker sticker = inlineQueryResultSticker.sticker;
        this.f12691a0 = new l(o6Var, sticker, str, sticker.type);
    }

    public l Z() {
        return this.f12691a0;
    }

    @Override
    public int l() {
        return this.f12691a0.f();
    }

    @Override
    public int m() {
        return this.f12691a0.l();
    }
}
