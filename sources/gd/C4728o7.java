package gd;

import org.drinkless.p210td.libcore.telegram.TdApi;

public class C4728o7 extends TdApi.MessageContent {
    public TdApi.ChatEvent f15918a;
    public final boolean f15919b;
    public final boolean f15920c;

    public C4728o7(TdApi.ChatEvent chatEvent, boolean z, boolean z2) {
        this.f15918a = chatEvent;
        this.f15919b = z;
        this.f15920c = z2;
    }

    @Override
    public int getConstructor() {
        return 0;
    }

    @Override
    public String toString() {
        return "MessageChatEvent{event=" + this.f15918a + ", isFull=" + this.f15919b + ", noDate=" + this.f15920c + '}';
    }
}
