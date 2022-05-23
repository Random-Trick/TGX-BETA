package hd;

import ce.c0;
import hd.b;
import ib.i;
import id.d;
import ld.h;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class d3 {
    public final c3 f12915a;
    public final TdApi.Message f12916b;
    public final CharSequence f12917c;

    public d3(o6 o6Var, TdApi.ChatList chatList, TdApi.Chat chat, TdApi.Message message, String str) {
        CharSequence charSequence;
        this.f12915a = new c3(o6Var, chatList, chat, (String) null);
        this.f12916b = message;
        if (i.i(str)) {
            this.f12917c = t2.C(o6Var, message, true);
            return;
        }
        String j22 = t2.j2(message);
        if (!i.i(j22)) {
            charSequence = c0.I(c0.a0(j22), str, 0, t.f13524g0);
        } else {
            charSequence = t2.C(o6Var, message, true);
        }
        this.f12917c = d.z().I(charSequence);
    }

    public h a() {
        return this.f12915a.b();
    }

    public b.a b() {
        return this.f12915a.c();
    }

    public c3 c() {
        return this.f12915a;
    }

    public long d() {
        return this.f12916b.f19946id;
    }

    public TdApi.Message e() {
        return this.f12916b;
    }

    public CharSequence f() {
        return this.f12917c;
    }
}
