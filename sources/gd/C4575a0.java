package gd;

import cd.C2104l;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p350yd.C10930q6;

public class C4575a0 extends AbstractC4718o<TdApi.InlineQueryResultSticker> {
    public final C2104l f15025a0;

    public C4575a0(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, String str, TdApi.InlineQueryResultSticker inlineQueryResultSticker) {
        super(aVar, q6Var, 11, inlineQueryResultSticker.f25387id, inlineQueryResultSticker);
        TdApi.Sticker sticker = inlineQueryResultSticker.sticker;
        this.f15025a0 = new C2104l(q6Var, sticker, str, sticker.type);
    }

    public C2104l m27298Z() {
        return this.f15025a0;
    }

    @Override
    public int mo25048l() {
        return this.f15025a0.m35578f();
    }

    @Override
    public int mo25047m() {
        return this.f15025a0.m35572l();
    }
}
