package gd;

import android.view.View;
import gd.C4587b;
import ie.C5455v0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.HandlerC10770jj;

public class C4808u6 extends AbstractC4705m6 implements C11059v7.AbstractC11068i {
    public TdApi.User f16389M;
    public final long f16390c;

    public C4808u6(AbstractC4761s4 s4Var, TdApi.MessageForwardOriginUser messageForwardOriginUser) {
        super(s4Var);
        this.f16390c = messageForwardOriginUser.senderUserId;
    }

    public void m25207k() {
        if (!this.f15807a.m26030V5()) {
            this.f15807a.m26233B8();
            this.f15807a.m25828q8();
        }
    }

    @Override
    public void mo1348P1(TdApi.User user) {
        this.f16389M = user;
        this.f15807a.mo4348c().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C4808u6.this.m25207k();
            }
        });
    }

    @Override
    public void mo25216a() {
        this.f15807a.mo4348c().m2480e2().m1702P1(this.f16390c, this);
    }

    @Override
    public String mo25215b() {
        TdApi.User user = this.f16389M;
        return user == null ? C4403w.m27869i1(R.string.LoadingUser) : C4779t2.m25437r2(user);
    }

    @Override
    public C6246h mo25214c() {
        TdApi.User user = this.f16389M;
        if (user == null || C4779t2.m25415u3(user.profilePhoto)) {
            return null;
        }
        return new C6246h(this.f15807a.mo4348c(), this.f16389M.profilePhoto.small);
    }

    @Override
    public C4587b.C4588a mo25213d() {
        return this.f15807a.f16099O0.m2480e2().m1705O2(this.f16390c, this.f15807a.f16099O0.m2480e2().m1583v2(this.f16390c), false);
    }

    @Override
    public void mo25212f() {
        TdApi.User v2 = this.f15807a.mo4348c().m2480e2().m1583v2(this.f16390c);
        this.f15807a.mo4348c().m2480e2().m1720L(this.f16390c, this);
        if (v2 != null) {
            this.f16389M = v2;
            this.f15808b = true;
            this.f15807a.m26233B8();
        }
    }

    @Override
    public boolean mo25211g(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar, AbstractC6264v vVar) {
        if (this.f16389M == null) {
            return false;
        }
        this.f15807a.mo4348c().m2485dd().m3429v7(this.f15807a.m26096P0(), this.f16389M.f25439id, qVar);
        return true;
    }

    public long m25209i() {
        return this.f16390c;
    }

    public TdApi.User m25208j() {
        return this.f16389M;
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }
}
