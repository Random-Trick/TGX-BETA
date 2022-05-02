package gd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p350yd.C10930q6;

public class C4801u extends AbstractC4718o<TdApi.InlineQueryResultAnimation> {
    public final C4623e3 f16370a0;

    public C4801u(AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var, TdApi.InlineQueryResultAnimation inlineQueryResultAnimation) {
        super(aVar, q6Var, 6, inlineQueryResultAnimation.f25379id, inlineQueryResultAnimation);
        this.f16370a0 = new C4623e3(q6Var, inlineQueryResultAnimation.animation);
    }

    public C4623e3 m25224Z() {
        return this.f16370a0;
    }

    @Override
    public int mo25048l() {
        return this.f16370a0.m26836e();
    }

    @Override
    public int mo25047m() {
        return this.f16370a0.m26835f();
    }
}
