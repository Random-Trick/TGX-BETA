package de;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import gd.w;
import hd.c3;
import hd.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ne.n0;
import ne.t1;
import ne.y3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import tc.d;
import ud.q1;
import ud.s;
import ud.v4;
import yd.g;
import zd.b1;
import zd.c1;
import zd.hj;
import zd.k1;
import zd.o6;
import zd.wj;

public class nk extends vo<b> implements k1, wj.a, View.OnClickListener {
    public s D0;
    public iq E0;

    public class a extends iq {

        public class C0089a extends RecyclerView.t {
            public C0089a() {
            }

            @Override
            public void b(RecyclerView recyclerView, int i10, int i11) {
                wj wjVar = ((c) ((ra) recyclerView.getTag()).d()).f8894b;
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).a2() + 5 >= wjVar.u()) {
                    wjVar.G(false, null);
                }
            }
        }

        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void D2(ra raVar, RecyclerView recyclerView, boolean z10) {
            c cVar = (c) raVar.d();
            if (z10) {
                recyclerView.setItemAnimator(new d(db.b.f7287b, 180L));
                recyclerView.k(new C0089a());
            }
            if (recyclerView.getAdapter() != cVar.f8895c) {
                recyclerView.setAdapter(cVar.f8895c);
            }
        }

        @Override
        public void N2(ra raVar, n0 n0Var, boolean z10) {
            super.N2(raVar, n0Var, z10);
            switch (n0Var.getId()) {
                case R.id.text_subtitle:
                    n0Var.setTextSize(15.0f);
                    n0Var.setPadding(a0.i(16.0f), a0.i(6.0f), a0.i(16.0f), a0.i(6.0f));
                    n0Var.setTextColorId(R.id.theme_color_background_text);
                    g.i(n0Var, 0, nk.this);
                    return;
                case R.id.text_title:
                    n0Var.setTextSize(17.0f);
                    n0Var.setPadding(a0.i(16.0f), a0.i(13.0f), a0.i(16.0f), a0.i(13.0f));
                    n0Var.setTextColorId(R.id.theme_color_text);
                    g.i(n0Var, R.id.theme_color_filling, nk.this);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            int i11 = nk.this.Hg() ? ((TdApi.PollTypeQuiz) nk.this.Gg().type).correctOptionId : -1;
            TdApi.PollOption pollOption = nk.this.Gg().options[raVar.l()];
            Object[] objArr = new Object[2];
            objArr[0] = w.q2(nk.this.Hg() ? raVar.l() == i11 ? R.string.xCorrectAnswers : R.string.xAnswers : R.string.xVotes, pollOption.voterCount);
            objArr[1] = Integer.valueOf(pollOption.votePercentage);
            t1Var.B1(w.T("%s — %d%%", null, objArr));
        }
    }

    public static class b {
        public TdApi.Poll f8890a;
        public final long f8891b;
        public final long f8892c;

        public b(TdApi.Poll poll, long j10, long j11) {
            this.f8890a = poll;
            this.f8891b = j10;
            this.f8892c = j11;
        }
    }

    public static class c implements wj.a {
        public final o6 f8893a;
        public final wj f8894b;
        public final iq f8895c;

        public class a extends iq {
            public a(v4 v4Var) {
                super(v4Var);
            }

            @Override
            public void Z1(ra raVar, y3 y3Var) {
                y3Var.setChat((c3) raVar.d());
            }
        }

        public class b extends wj {
            public final long V;
            public final long W;
            public final int X;

            public b(o6 o6Var, int i10, int i11, wj.a aVar, long j10, long j11, int i12) {
                super(o6Var, i10, i11, aVar);
                this.V = j10;
                this.W = j11;
                this.X = i12;
            }

            @Override
            public TdApi.Function J(boolean z10, int i10, int i11) {
                return new TdApi.GetPollVoters(this.V, this.W, this.X, i10, i11);
            }
        }

        public c(v4<?> v4Var, long j10, long j11, int i10) {
            o6 c10 = v4Var.c();
            this.f8893a = c10;
            a aVar = new a(v4Var);
            this.f8895c = aVar;
            aVar.A2();
            b bVar = new b(c10, 50, 50, this, j10, j11, i10);
            this.f8894b = bVar;
            bVar.E(null);
        }

        @Override
        public void C3(b1<Long> b1Var, Long l10, int i10, int i11) {
            c1.e(this, b1Var, l10, i10, i11);
        }

        @Override
        public void D(b1<Long> b1Var, List<Long> list, int i10, boolean z10) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Long l10 : list) {
                long longValue = l10.longValue();
                arrayList.add(new ra(59, R.id.user).G(new c3(this.f8893a, longValue).D()).N(ob.a.c(longValue)));
            }
            this.f8895c.D0().addAll(i10, arrayList);
            this.f8895c.M(i10, arrayList.size());
        }

        @Override
        public void G1(b1<Long> b1Var, Long l10, int i10) {
            c1.f(this, b1Var, l10, i10);
        }

        @Override
        public void I2(b1<Long> b1Var, int i10) {
            c1.i(this, b1Var, i10);
        }

        @Override
        public void K(b1<Long> b1Var, boolean z10) {
            c1.a(this, b1Var, z10);
        }

        @Override
        public void V5(b1<Long> b1Var) {
            c1.h(this, b1Var);
        }

        public void s3(b1<Long> b1Var, Long l10, int i10) {
            this.f8895c.s0(i10, new ra(59).G(new c3(this.f8893a, l10.longValue()).D()).N(ob.a.c(l10.longValue())));
        }

        public void T2(b1<Long> b1Var, Long l10, int i10, int i11) {
        }

        @Override
        public void e4(b1<Long> b1Var) {
            c1.b(this, b1Var);
        }
    }

    public nk(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ig(TdApi.Poll poll) {
        TdApi.PollOption[] pollOptionArr;
        if (!Sa() && Gg().f19954id == poll.f19954id) {
            x9().f8890a = poll;
            if (poll.totalVoterCount == 0 || !t2.v2(poll)) {
                Zb();
                return;
            }
            Kg(true);
            List<ra> D0 = this.E0.D0();
            int i10 = 0;
            int i11 = 0;
            for (TdApi.PollOption pollOption : poll.options) {
                int Fg = Fg(i11);
                if (pollOption.voterCount == 0) {
                    if (Fg != -1) {
                        this.E0.R1(Fg, 5);
                    }
                } else if (Fg == -1) {
                    int Eg = Eg(i11);
                    D0.addAll(Eg, Arrays.asList(new ra(8, (int) R.id.text_subtitle, 0, (CharSequence) pollOption.text, false).M(i11), new ra(2), Jg(i11), new ra(3), new ra(42).M(i11)));
                    this.E0.L(Eg, 5);
                }
                i11++;
            }
            for (ra raVar : D0) {
                if (raVar.A() == 42) {
                    this.E0.r3(i10);
                }
                i10++;
            }
        }
    }

    @Override
    public void C3(b1<Long> b1Var, Long l10, int i10, int i11) {
        c1.e(this, b1Var, l10, i10, i11);
    }

    @Override
    public void D(b1<Long> b1Var, List<Long> list, int i10, boolean z10) {
        c1.g(this, b1Var, list, i10, z10);
    }

    public final int Eg(int i10) {
        List<ra> D0 = this.E0.D0();
        int i11 = 0;
        for (ra raVar : D0) {
            if (raVar.j() == R.id.text_subtitle && raVar.l() >= i10) {
                return i11;
            }
            i11++;
        }
        return D0.size();
    }

    public final int Fg(int i10) {
        int i11 = 0;
        for (ra raVar : this.E0.D0()) {
            if (raVar.j() == R.id.text_subtitle && raVar.l() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override
    public void G1(b1<Long> b1Var, Long l10, int i10) {
        c1.f(this, b1Var, l10, i10);
    }

    @Override
    public View G9() {
        return this.D0;
    }

    public final TdApi.Poll Gg() {
        return x9().f8890a;
    }

    public final boolean Hg() {
        return Gg().type.getConstructor() == 657013913;
    }

    @Override
    public void I2(b1<Long> b1Var, int i10) {
        c1.i(this, b1Var, i10);
    }

    public final ra Jg(int i10) {
        return new ra(58).M(i10).G(new c(this, x9().f8891b, x9().f8892c, i10));
    }

    @Override
    public void K(b1<Long> b1Var, boolean z10) {
        c1.a(this, b1Var, z10);
    }

    public final void Kg(boolean z10) {
        int constructor = Gg().type.getConstructor();
        if (constructor == 641265698) {
            if (!z10) {
                this.D0.setTitle(R.string.PollResultsTitle);
            }
            this.D0.setSubtitle(w.o2(R.string.xVotes, Gg().totalVoterCount));
        } else if (constructor == 657013913) {
            if (!z10) {
                this.D0.setTitle(R.string.QuizResultsTitle);
            }
            this.D0.setSubtitle(w.o2(R.string.xAnswers, Gg().totalVoterCount));
        }
    }

    @Override
    public void M6(final TdApi.Poll poll) {
        ud(new Runnable() {
            @Override
            public final void run() {
                nk.this.Ig(poll);
            }
        });
    }

    @Override
    public int R9() {
        return R.id.controller_pollResults;
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        float f12 = f10 - (p0.r(kg())[0] - p0.r(q1Var.get())[0]);
        float f13 = f11 - (p0.r(kg())[1] - p0.r(q1Var.get())[1]);
        if (f12 >= 0.0f && f13 >= 0.0f && f12 < kg().getMeasuredWidth() && f13 < kg().getMeasuredHeight()) {
            View X = kg().X(f12, f13);
            if ((X instanceof RecyclerView) && ((LinearLayoutManager) ((RecyclerView) X).getLayoutManager()).T1() != 0) {
                return false;
            }
        }
        return super.S8(q1Var, f10, f11);
    }

    @Override
    public void T2(b1<Long> b1Var, Long l10, int i10, int i11) {
        c1.d(this, b1Var, l10, i10, i11);
    }

    @Override
    public void V5(b1<Long> b1Var) {
        c1.h(this, b1Var);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().W(Gg().f19954id, this);
    }

    @Override
    public void e4(b1<Long> b1Var) {
        c1.b(this, b1Var);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.user) {
            this.f24495b.hd().v7(this, ((y3) view).getUserId(), new hj.q().s(t().I3().g(view)));
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        TdApi.PollOption[] pollOptionArr;
        s sVar = new s(context);
        this.D0 = sVar;
        sVar.setThemedTextColor(this);
        this.D0.A1(a0.i(49.0f), true);
        Kg(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(100, (int) R.id.text_title, 0, (CharSequence) Gg().question, false));
        arrayList.add(new ra(3));
        int i10 = 0;
        for (TdApi.PollOption pollOption : Gg().options) {
            if (pollOption.voterCount != 0) {
                arrayList.add(new ra(100, (int) R.id.text_subtitle, 0, (CharSequence) pollOption.text, false).M(i10));
                arrayList.add(new ra(2));
                arrayList.add(Jg(i10));
                arrayList.add(new ra(3));
                arrayList.add(new ra(42).M(i10));
            }
            i10++;
        }
        a aVar = new a(this);
        this.E0 = aVar;
        aVar.s2(arrayList, false);
        customRecyclerView.setAdapter(this.E0);
        this.f24495b.O9().o(Gg().f19954id, this);
    }

    @Override
    public void s3(b1<Long> b1Var, Long l10, int i10) {
        c1.c(this, b1Var, l10, i10);
    }
}
