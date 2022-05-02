package p038ce;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import gd.C4601c3;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.C6973n0;
import me.C7030t1;
import me.C7093z3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p082fd.C4403w;
import p193nb.C7316a;
import p335xd.C10192g;
import p350yd.AbstractC10596d1;
import p350yd.AbstractC10839m1;
import p350yd.AbstractC11155yj;
import p350yd.C10626e1;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.C8731d;
import td.AbstractC9323v4;
import td.C9270q1;
import td.C9289s;

public class View$OnClickListenerC2776nk extends AbstractC3204vo<C2779b> implements AbstractC10839m1, AbstractC11155yj.AbstractC11156a, View.OnClickListener {
    public C9289s f9394D0;
    public C2546iq f9395E0;

    public class C2777a extends C2546iq {

        public class C2778a extends RecyclerView.AbstractC0910t {
            public C2778a() {
            }

            @Override
            public void mo421b(RecyclerView recyclerView, int i, int i2) {
                AbstractC11155yj yjVar = ((C2780c) ((C2964ra) recyclerView.getTag()).m32844d()).f9402b;
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).m39546a2() + 5 >= yjVar.m4494u()) {
                    yjVar.m4518G(false, null);
                }
            }
        }

        public C2777a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo9532H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
            C2780c cVar = (C2780c) raVar.m32844d();
            if (z) {
                recyclerView.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
                recyclerView.m39422k(new C2778a());
            }
            if (recyclerView.getAdapter() != cVar.f9403c) {
                recyclerView.setAdapter(cVar.f9403c);
            }
        }

        @Override
        public void mo503R2(C2964ra raVar, C6973n0 n0Var, boolean z) {
            super.mo503R2(raVar, n0Var, z);
            switch (n0Var.getId()) {
                case R.id.text_subtitle:
                    n0Var.setTextSize(15.0f);
                    n0Var.setPadding(C1357a0.m37541i(16.0f), C1357a0.m37541i(6.0f), C1357a0.m37541i(16.0f), C1357a0.m37541i(6.0f));
                    n0Var.setTextColorId(R.id.theme_color_background_text);
                    C10192g.m5782i(n0Var, 0, View$OnClickListenerC2776nk.this);
                    return;
                case R.id.text_title:
                    n0Var.setTextSize(17.0f);
                    n0Var.setPadding(C1357a0.m37541i(16.0f), C1357a0.m37541i(13.0f), C1357a0.m37541i(16.0f), C1357a0.m37541i(13.0f));
                    n0Var.setTextColorId(R.id.theme_color_text);
                    C10192g.m5782i(n0Var, R.id.theme_color_filling, View$OnClickListenerC2776nk.this);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            int i2 = View$OnClickListenerC2776nk.this.m33523Hg() ? ((TdApi.PollTypeQuiz) View$OnClickListenerC2776nk.this.m33524Gg().type).correctOptionId : -1;
            TdApi.PollOption pollOption = View$OnClickListenerC2776nk.this.m33524Gg().options[raVar.m32833l()];
            Object[] objArr = new Object[2];
            objArr[0] = C4403w.m27836q2(View$OnClickListenerC2776nk.this.m33523Hg() ? raVar.m32833l() == i2 ? R.string.xCorrectAnswers : R.string.xAnswers : R.string.xVotes, pollOption.voterCount);
            objArr[1] = Integer.valueOf(pollOption.votePercentage);
            t1Var.m18058E1(C4403w.m27935T("%s — %d%%", null, objArr));
        }
    }

    public static class C2779b {
        public TdApi.Poll f9398a;
        public final long f9399b;
        public final long f9400c;

        public C2779b(TdApi.Poll poll, long j, long j2) {
            this.f9398a = poll;
            this.f9399b = j;
            this.f9400c = j2;
        }
    }

    public static class C2780c implements AbstractC11155yj.AbstractC11156a {
        public final C10930q6 f9401a;
        public final AbstractC11155yj f9402b;
        public final C2546iq f9403c;

        public class C2781a extends C2546iq {
            public C2781a(AbstractC9323v4 v4Var) {
                super(v4Var);
            }

            @Override
            public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
                z3Var.setChat((C4601c3) raVar.m32844d());
            }
        }

        public class C2782b extends AbstractC11155yj {
            public final long f9405V;
            public final long f9406W;
            public final int f9407X;

            public C2782b(C10930q6 q6Var, int i, int i2, AbstractC11155yj.AbstractC11156a aVar, long j, long j2, int i3) {
                super(q6Var, i, i2, aVar);
                this.f9405V = j;
                this.f9406W = j2;
                this.f9407X = i3;
            }

            @Override
            public TdApi.Function mo4516J(boolean z, int i, int i2) {
                return new TdApi.GetPollVoters(this.f9405V, this.f9406W, this.f9407X, i, i2);
            }
        }

        public C2780c(AbstractC9323v4<?> v4Var, long j, long j2, int i) {
            C10930q6 c = v4Var.mo4348c();
            this.f9401a = c;
            C2781a aVar = new C2781a(v4Var);
            this.f9403c = aVar;
            aVar.m34241E2();
            C2782b bVar = new C2782b(c, 50, 50, this, j, j2, i);
            this.f9402b = bVar;
            bVar.m4520E(null);
        }

        @Override
        public void mo4486C3(AbstractC10596d1<Long> d1Var, boolean z) {
            C10626e1.m4426a(this, d1Var, z);
        }

        @Override
        public void mo4485C6(AbstractC10596d1<Long> d1Var, List<Long> list, int i, boolean z) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Long l : list) {
                long longValue = l.longValue();
                arrayList.add(new C2964ra(59, R.id.user).m32870G(new C4601c3(this.f9401a, longValue).m27061D()).m32863N(C7316a.m17058c(longValue)));
            }
            this.f9403c.m34240F0().addAll(i, arrayList);
            this.f9403c.m39308M(i, arrayList.size());
        }

        @Override
        public void mo4484F5(AbstractC10596d1<Long> d1Var) {
            C10626e1.m4419h(this, d1Var);
        }

        @Override
        public void mo4483H6(AbstractC10596d1<Long> d1Var, Long l, int i, int i2) {
            C10626e1.m4422e(this, d1Var, l, i, i2);
        }

        @Override
        public void mo4482J6(AbstractC10596d1<Long> d1Var, int i) {
            C10626e1.m4418i(this, d1Var, i);
        }

        public void mo4478x2(AbstractC10596d1<Long> d1Var, Long l, int i) {
            this.f9403c.m34129t0(i, new C2964ra(59).m32870G(new C4601c3(this.f9401a, l.longValue()).m27061D()).m32863N(C7316a.m17058c(l.longValue())));
        }

        public void mo4480i7(AbstractC10596d1<Long> d1Var, Long l, int i, int i2) {
        }

        @Override
        public void mo4481d4(AbstractC10596d1<Long> d1Var, Long l, int i) {
            C10626e1.m4421f(this, d1Var, l, i);
        }

        @Override
        public void mo4479t6(AbstractC10596d1<Long> d1Var) {
            C10626e1.m4425b(this, d1Var);
        }
    }

    public View$OnClickListenerC2776nk(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33522Ig(TdApi.Poll poll) {
        TdApi.PollOption[] pollOptionArr;
        if (!m9347Sa() && m33524Gg().f25413id == poll.f25413id) {
            m9131x9().f9398a = poll;
            if (poll.totalVoterCount == 0 || !C4779t2.m25409v2(poll)) {
                m9298Zb();
                return;
            }
            m33520Kg(true);
            List<C2964ra> F0 = this.f9395E0.m34240F0();
            int i = 0;
            int i2 = 0;
            for (TdApi.PollOption pollOption : poll.options) {
                int Fg = m33525Fg(i2);
                if (pollOption.voterCount == 0) {
                    if (Fg != -1) {
                        this.f9395E0.m34204V1(Fg, 5);
                    }
                } else if (Fg == -1) {
                    int Eg = m33526Eg(i2);
                    F0.addAll(Eg, Arrays.asList(new C2964ra(8, (int) R.id.text_subtitle, 0, (CharSequence) pollOption.text, false).m32864M(i2), new C2964ra(2), m33521Jg(i2), new C2964ra(3), new C2964ra(42).m32864M(i2)));
                    this.f9395E0.m39309L(Eg, 5);
                }
                i2++;
            }
            for (C2964ra raVar : F0) {
                if (raVar.m32876A() == 42) {
                    this.f9395E0.m34124u3(i);
                }
                i++;
            }
        }
    }

    @Override
    public void mo4486C3(AbstractC10596d1<Long> d1Var, boolean z) {
        C10626e1.m4426a(this, d1Var, z);
    }

    @Override
    public void mo4485C6(AbstractC10596d1<Long> d1Var, List<Long> list, int i, boolean z) {
        C10626e1.m4420g(this, d1Var, list, i, z);
    }

    public final int m33526Eg(int i) {
        List<C2964ra> F0 = this.f9395E0.m34240F0();
        int i2 = 0;
        for (C2964ra raVar : F0) {
            if (raVar.m32835j() == R.id.text_subtitle && raVar.m32833l() >= i) {
                return i2;
            }
            i2++;
        }
        return F0.size();
    }

    @Override
    public void mo4484F5(AbstractC10596d1<Long> d1Var) {
        C10626e1.m4419h(this, d1Var);
    }

    public final int m33525Fg(int i) {
        int i2 = 0;
        for (C2964ra raVar : this.f9395E0.m34240F0()) {
            if (raVar.m32835j() == R.id.text_subtitle && raVar.m32833l() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override
    public View mo8869G9() {
        return this.f9394D0;
    }

    public final TdApi.Poll m33524Gg() {
        return m9131x9().f9398a;
    }

    @Override
    public void mo4483H6(AbstractC10596d1<Long> d1Var, Long l, int i, int i2) {
        C10626e1.m4422e(this, d1Var, l, i, i2);
    }

    public final boolean m33523Hg() {
        return m33524Gg().type.getConstructor() == 657013913;
    }

    @Override
    public void mo4482J6(AbstractC10596d1<Long> d1Var, int i) {
        C10626e1.m4418i(this, d1Var, i);
    }

    public final C2964ra m33521Jg(int i) {
        return new C2964ra(58).m32864M(i).m32870G(new C2780c(this, m9131x9().f9399b, m9131x9().f9400c, i));
    }

    public final void m33520Kg(boolean z) {
        int constructor = m33524Gg().type.getConstructor();
        if (constructor == 641265698) {
            if (!z) {
                this.f9394D0.setTitle(R.string.PollResultsTitle);
            }
            this.f9394D0.setSubtitle(C4403w.m27844o2(R.string.xVotes, m33524Gg().totalVoterCount));
        } else if (constructor == 657013913) {
            if (!z) {
                this.f9394D0.setTitle(R.string.QuizResultsTitle);
            }
            this.f9394D0.setSubtitle(C4403w.m27844o2(R.string.xAnswers, m33524Gg().totalVoterCount));
        }
    }

    @Override
    public void mo3047N6(final TdApi.Poll poll) {
        m9151ud(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2776nk.this.m33522Ig(poll);
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_pollResults;
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        float f3 = f - (C1399s0.m37154u(m31303kg())[0] - C1399s0.m37154u(q1Var.get())[0]);
        float f4 = f2 - (C1399s0.m37154u(m31303kg())[1] - C1399s0.m37154u(q1Var.get())[1]);
        if (f3 >= 0.0f && f4 >= 0.0f && f3 < m31303kg().getMeasuredWidth() && f4 < m31303kg().getMeasuredHeight()) {
            View X = m31303kg().m39457X(f3, f4);
            if ((X instanceof RecyclerView) && ((LinearLayoutManager) ((RecyclerView) X).getLayoutManager()).m39553T1() != 0) {
                return false;
            }
        }
        return super.mo8863S8(q1Var, f, f2);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2781K9().m1895W(m33524Gg().f25413id, this);
    }

    @Override
    public void mo4481d4(AbstractC10596d1<Long> d1Var, Long l, int i) {
        C10626e1.m4421f(this, d1Var, l, i);
    }

    @Override
    public void mo4480i7(AbstractC10596d1<Long> d1Var, Long l, int i, int i2) {
        C10626e1.m4423d(this, d1Var, l, i, i2);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.user) {
            this.f30167b.m2485dd().m3429v7(this, ((C7093z3) view).getUserId(), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        TdApi.PollOption[] pollOptionArr;
        C9289s sVar = new C9289s(context);
        this.f9394D0 = sVar;
        sVar.setThemedTextColor(this);
        this.f9394D0.m9632D1(C1357a0.m37541i(49.0f), true);
        m33520Kg(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(100, (int) R.id.text_title, 0, (CharSequence) m33524Gg().question, false));
        arrayList.add(new C2964ra(3));
        int i = 0;
        for (TdApi.PollOption pollOption : m33524Gg().options) {
            if (pollOption.voterCount != 0) {
                arrayList.add(new C2964ra(100, (int) R.id.text_subtitle, 0, (CharSequence) pollOption.text, false).m32864M(i));
                arrayList.add(new C2964ra(2));
                arrayList.add(m33521Jg(i));
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(42).m32864M(i));
            }
            i++;
        }
        C2777a aVar = new C2777a(this);
        this.f9395E0 = aVar;
        aVar.m34116x2(arrayList, false);
        customRecyclerView.setAdapter(this.f9395E0);
        this.f30167b.m2781K9().m1827o(m33524Gg().f25413id, this);
    }

    @Override
    public void mo4479t6(AbstractC10596d1<Long> d1Var) {
        C10626e1.m4425b(this, d1Var);
    }

    @Override
    public void mo4478x2(AbstractC10596d1<Long> d1Var, Long l, int i) {
        C10626e1.m4424c(this, d1Var, l, i);
    }
}
