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
        if (C5070i.m24062i(str)) {
            this.f15312c = C4779t2.m25718C(q6Var, message, true);
            return;
        }
        String j2 = C4779t2.m25494j2(message);
        if (!C5070i.m24062i(j2)) {
            charSequence = C1363c0.m37468I(C1363c0.m37449a0(j2), str, 0, C4776t.f16203g0);
        } else {
            charSequence = C4779t2.m25718C(q6Var, message, true);
        }
        this.f15312c = C5078d.m23987z().m24025I(charSequence);
    }

    public C6246h m26900a() {
        return this.f15310a.m27052b();
    }

    public C4587b.C4588a m26899b() {
        return this.f15310a.m27051c();
    }

    public C4601c3 m26898c() {
        return this.f15310a;
    }

    public long m26897d() {
        return this.f15311b.f25409id;
    }

    public TdApi.Message m26896e() {
        return this.f15311b;
    }

    public CharSequence m26895f() {
        return this.f15312c;
    }
}
