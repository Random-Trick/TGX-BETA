package hd;

import android.view.View;
import gd.w;
import hd.b;
import je.g;
import je.v0;
import ld.h;
import ld.v;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.hj;
import zd.t7;
import zd.w7;

public class u6 extends m6 implements t7.i {
    public TdApi.User M;
    public final long f13648c;

    public u6(s4 s4Var, TdApi.MessageForwardOriginUser messageForwardOriginUser) {
        super(s4Var);
        this.f13648c = messageForwardOriginUser.senderUserId;
    }

    public void k() {
        if (!this.f13273a.U5()) {
            this.f13273a.B8();
            this.f13273a.q8();
        }
    }

    @Override
    public void M1(TdApi.User user) {
        this.M = user;
        this.f13273a.c().hd().post(new Runnable() {
            @Override
            public final void run() {
                u6.this.k();
            }
        });
    }

    @Override
    public void a() {
        this.f13273a.c().e2().N1(this.f13648c, this);
    }

    @Override
    public String b() {
        TdApi.User user = this.M;
        return user == null ? w.i1(R.string.LoadingUser) : t2.r2(user);
    }

    @Override
    public h c() {
        TdApi.User user = this.M;
        if (user == null || t2.u3(user.profilePhoto)) {
            return null;
        }
        return new h(this.f13273a.c(), this.M.profilePhoto.small);
    }

    @Override
    public b.a d() {
        return this.f13273a.O0.e2().N2(this.f13648c, this.f13273a.O0.e2().u2(this.f13648c), false);
    }

    @Override
    public void f() {
        TdApi.User u22 = this.f13273a.c().e2().u2(this.f13648c);
        this.f13273a.c().e2().L(this.f13648c, this);
        if (u22 != null) {
            this.M = u22;
            this.f13274b = true;
            this.f13273a.B8();
        }
    }

    @Override
    public boolean g(View view, g gVar, v0 v0Var, hj.q qVar, v vVar) {
        if (this.M == null) {
            return false;
        }
        this.f13273a.c().hd().v7(this.f13273a.Q0(), this.M.f19979id, qVar);
        return true;
    }

    public long i() {
        return this.f13648c;
    }

    public TdApi.User j() {
        return this.M;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }
}
