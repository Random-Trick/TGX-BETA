package ld;

import hd.t2;
import k4.a;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class f extends h {
    public final TdApi.Message f16353a0;
    public a f16354b0;

    public f(o6 o6Var, TdApi.Message message) {
        super(o6Var, t2.j1(message));
        this.f16353a0 = message;
    }

    public a D0() {
        return this.f16354b0;
    }

    public TdApi.Message E0() {
        return this.f16353a0;
    }

    public void F0(a aVar) {
        this.f16354b0 = aVar;
    }

    @Override
    public String d() {
        return a() + "_apic_" + this.f16361a.f19913id + "_" + this.f16353a0.chatId + "_" + this.f16353a0.f19946id;
    }
}
