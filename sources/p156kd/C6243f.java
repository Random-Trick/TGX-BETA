package p156kd;

import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p147k4.C6053a;
import p350yd.C10930q6;

public class C6243f extends C6246h {
    public final TdApi.Message f19682a0;
    public C6053a f19683b0;

    public C6243f(C10930q6 q6Var, TdApi.Message message) {
        super(q6Var, C4779t2.m25494j1(message));
        this.f19682a0 = message;
    }

    public C6053a m20973D0() {
        return this.f19683b0;
    }

    public TdApi.Message m20972E0() {
        return this.f19682a0;
    }

    public void m20971F0(C6053a aVar) {
        this.f19683b0 = aVar;
    }

    @Override
    public String mo20768d() {
        return m20929a() + "_apic_" + this.f19704a.f25373id + "_" + this.f19682a0.chatId + "_" + this.f19682a0.f25406id;
    }
}