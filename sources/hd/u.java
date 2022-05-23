package hd;

import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.a;
import zd.o6;

public class u extends o<TdApi.InlineQueryResultAnimation> {
    public final e3 f13635a0;

    public u(a aVar, o6 o6Var, TdApi.InlineQueryResultAnimation inlineQueryResultAnimation) {
        super(aVar, o6Var, 6, inlineQueryResultAnimation.f19919id, inlineQueryResultAnimation);
        this.f13635a0 = new e3(o6Var, inlineQueryResultAnimation.animation);
    }

    public e3 Z() {
        return this.f13635a0;
    }

    @Override
    public int l() {
        return this.f13635a0.e();
    }

    @Override
    public int m() {
        return this.f13635a0.f();
    }
}
