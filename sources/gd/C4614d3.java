package gd;

import be.C1363c0;
import gd.C4587b;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5070i;
import p110hd.C5078d;
import p156kd.C6246h;
import p350yd.C10930q6;

public class C4614d3 {
    public final C4601c3 f15310a;
    public final TdApi.Message f15311b;
    public final CharSequence f15312c;

    public C4614d3(C10930q6 q6Var, TdApi.ChatList chatList, TdApi.Chat chat, TdApi.Message message, String str) {
        CharSequence charSequence;
        this.f15310a = new C4601c3(q6Var, chatList, chat, (String) null);
        this.f15311b = message;
        if (C5070i.m24061i(str)) {
            this.f15312c = C4779t2.m25717C(q6Var, message, true);
            return;
        }
        String j2 = C4779t2.m25493j2(message);
        if (!C5070i.m24061i(j2)) {
            charSequence = C1363c0.m37465I(C1363c0.m37446a0(j2), str, 0, C4776t.f16203g0);
        } else {
            charSequence = C4779t2.m25717C(q6Var, message, true);
        }
        this.f15312c = C5078d.m23986z().m24024I(charSequence);
    }

    public C6246h m26898a() {
        return this.f15310a.m27050b();
    }

    public C4587b.C4588a m26897b() {
        return this.f15310a.m27049c();
    }

    public C4601c3 m26896c() {
        return this.f15310a;
    }

    public long m26895d() {
        return this.f15311b.f25406id;
    }

    public TdApi.Message m26894e() {
        return this.f15311b;
    }

    public CharSequence m26893f() {
        return this.f15312c;
    }
}
