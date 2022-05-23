package hd;

import org.drinkless.td.libcore.telegram.TdApi;

public class o7 extends TdApi.MessageContent {
    public TdApi.ChatEvent f13336a;
    public final boolean f13337b;
    public final boolean f13338c;

    public o7(TdApi.ChatEvent chatEvent, boolean z10, boolean z11) {
        this.f13336a = chatEvent;
        this.f13337b = z10;
        this.f13338c = z11;
    }

    @Override
    public int getConstructor() {
        return 0;
    }

    @Override
    public String toString() {
        return "MessageChatEvent{event=" + this.f13336a + ", isFull=" + this.f13337b + ", noDate=" + this.f13338c + '}';
    }
}
