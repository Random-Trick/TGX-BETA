package p038ce;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import be.C1408x;
import gd.C4737p7;
import java.util.ArrayList;
import java.util.List;
import me.C6897h1;
import me.C6985o2;
import me.View$OnFocusChangeListenerC7069y1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.EditTextBase;
import p037cb.C2057b;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p038ce.View$OnClickListenerC2280d6;
import p038ce.View$OnClickListenerC2971rh;
import p066eb.C4180b;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5135p;
import p111he.C5115g0;
import p111he.View$OnTouchListenerC5103c0;
import p139jb.AbstractC5914f;
import p139jb.AbstractC5918j;
import p193nb.C7321e;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.C8731d;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9270q1;
import td.C9312u1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2280d6 extends AbstractC3204vo<C2285d> implements View.OnClickListener, C2546iq.AbstractC2551e {
    public C2546iq f7896D0;
    public C6897h1 f7897E0;
    public C2964ra f7898F0;
    public C2964ra f7899G0;
    public C2964ra f7900H0;
    public C2964ra f7901I0;
    public View$OnTouchListenerC5103c0 f7902J0;
    public boolean f7903K0;
    public boolean f7904L0;
    public boolean f7905M0;
    public C2964ra f7906N0;
    public boolean f7907O0;
    public List<C2964ra> f7908P0 = new ArrayList();

    public class C2281a extends C2546iq {

        public class C2282a implements EditTextBase.AbstractC7923b {
            public C2282a() {
            }

            @Override
            public boolean mo14155a(EditTextBase editTextBase, Editable editable, int i, int i2) {
                if (View$OnClickListenerC2280d6.this.f7908P0.size() <= 1) {
                    return false;
                }
                if (editable.length() != 0 && !editable.toString().trim().isEmpty()) {
                    return false;
                }
                View$OnClickListenerC2280d6.this.m35114hh((C2964ra) ((ViewGroup) editTextBase.getParent().getParent()).getTag());
                return true;
            }
        }

        public C2281a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        public boolean m35107A3(View$OnFocusChangeListenerC7069y1 y1Var) {
            int H0;
            int i;
            C2964ra raVar = (C2964ra) ((ViewGroup) y1Var.getParent()).getTag();
            if (raVar == null || raVar.m32835j() != R.id.option || (H0 = View$OnClickListenerC2280d6.this.f7896D0.m34235H0(raVar)) == -1 || (i = H0 + 2) >= View$OnClickListenerC2280d6.this.f7896D0.m34240F0().size()) {
                return false;
            }
            switch (View$OnClickListenerC2280d6.this.f7896D0.m34240F0().get(i).m32835j()) {
                case R.id.option:
                case R.id.optionAdd:
                    return true;
                default:
                    return false;
            }
        }

        public static boolean m35104z3(View$OnFocusChangeListenerC7069y1 y1Var) {
            return true;
        }

        @Override
        public void mo34233I1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var, C6985o2 o2Var) {
            if (raVar.m32835j() == R.id.option) {
                View$OnClickListenerC2280d6.this.m35110lh(raVar);
            }
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            switch (raVar.m32835j()) {
                case R.id.btn_pollSetting_anonymous:
                    cVar.getToggler().m10186r(View$OnClickListenerC2280d6.this.f7903K0, z);
                    return;
                case R.id.btn_pollSetting_multi:
                    cVar.getToggler().m10186r(View$OnClickListenerC2280d6.this.f7904L0, z);
                    cVar.m10208Y1(!View$OnClickListenerC2280d6.this.f7905M0, z);
                    return;
                case R.id.btn_pollSetting_quiz:
                    cVar.getToggler().m10186r(View$OnClickListenerC2280d6.this.f7905M0, z);
                    cVar.m10208Y1(View$OnClickListenerC2280d6.this.m35127Ug(), z);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo17892b0(View$OnFocusChangeListenerC7069y1 y1Var, boolean z) {
            super.mo17892b0(y1Var, z);
            if (z && ((ViewGroup) y1Var.getParent()).getId() == R.id.optionAdd) {
                View$OnClickListenerC2280d6.this.m35128Tg();
            }
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            switch (raVar.m32835j()) {
                case R.id.option:
                    y1Var.m17901l2(View$OnClickListenerC2280d6.this.f7905M0, false);
                    y1Var.m17902k2(raVar == View$OnClickListenerC2280d6.this.f7906N0, false);
                    y1Var.getEditText().setInputType(16385);
                    C1399s0.m37161q0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(100);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    y1Var.getEditText().setBackspaceListener(new C2282a());
                    y1Var.setNeedNextButton(new View$OnFocusChangeListenerC7069y1.AbstractC7075f() {
                        @Override
                        public final boolean mo17891a(View$OnFocusChangeListenerC7069y1 y1Var2) {
                            boolean A3;
                            A3 = View$OnClickListenerC2280d6.C2281a.this.m35107A3(y1Var2);
                            return A3;
                        }
                    });
                    y1Var.getEditText().setImeOptions(268435461);
                    return;
                case R.id.optionAdd:
                    y1Var.m17901l2(View$OnClickListenerC2280d6.this.f7905M0, false);
                    y1Var.getEditText().setInputType(16385);
                    C1399s0.m37161q0(y1Var.getEditText(), false);
                    y1Var.getEditText().setImeOptions(268435461);
                    y1Var.setNeedNextButton(C2237c6.f7809a);
                    return;
                case R.id.text_subtitle:
                    y1Var.m17924G1(false);
                    y1Var.setEmptyHint(R.string.QuizExplanationEmpty);
                    y1Var.getEditText().setInputType(16385);
                    C1399s0.m37161q0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(200);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    return;
                case R.id.S:
                    y1Var.setEmptyHint(R.string.PollQuestionEmpty);
                    y1Var.getEditText().setInputType(16385);
                    C1399s0.m37161q0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(255);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    return;
                default:
                    return;
            }
        }
    }

    public class C2283b extends C6897h1 {
        public C2283b(RecyclerView recyclerView, AbstractC9323v4 v4Var) {
            super(recyclerView, v4Var);
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            int i = 0;
            rect.top = view.getId() == R.id.text_subtitle ? C1357a0.m37541i(10.0f) : 0;
            if (k0 != -1 && k0 == View$OnClickListenerC2280d6.this.f7896D0.mo6153D() - 1) {
                i = C1357a0.m37541i(56.0f);
            }
            rect.bottom = i;
        }
    }

    public class C2284c implements AbstractC5135p {
        public C2284c() {
        }

        @Override
        public boolean mo23839B5(View view) {
            return View$OnClickListenerC2280d6.this.m35128Tg();
        }
    }

    public static class C2285d {
        public final long f7913a;
        public final C4737p7 f7914b;
        public final AbstractC2286e f7915c;
        public final boolean f7916d;
        public final boolean f7917e;

        public C2285d(long j, C4737p7 p7Var, AbstractC2286e eVar) {
            this(j, p7Var, eVar, false, false);
        }

        public C2285d(long j, C4737p7 p7Var, AbstractC2286e eVar, boolean z, boolean z2) {
            if (eVar != null) {
                this.f7913a = j;
                this.f7914b = p7Var;
                this.f7915c = eVar;
                this.f7916d = z2;
                this.f7917e = z;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public interface AbstractC2286e {
        boolean mo32573T4(View$OnClickListenerC2280d6 d6Var, long j, long j2, TdApi.InputMessagePoll inputMessagePoll, boolean z, TdApi.MessageSchedulingState messageSchedulingState, AbstractC5918j<TdApi.Message> jVar);

        boolean mo32494Z0(View$OnClickListenerC2280d6 d6Var);

        TdApi.ChatList mo32311n3(View$OnClickListenerC2280d6 d6Var);
    }

    public View$OnClickListenerC2280d6(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35121ah(int i) {
        this.f7907O0 = false;
        View C = m31303kg().getLayoutManager().mo39262C(i);
        if (C instanceof ViewGroup) {
            C1408x.m37085f(((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).getEditText());
        }
    }

    public boolean m35120bh(View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        m9298Zb();
        return true;
    }

    public boolean m35119ch() {
        TdApi.FormattedText Yg = m35123Yg(false);
        return Yg != null && Yg.text.trim().length() <= 200 && C7321e.m16935k1(Yg);
    }

    public void m35118dh(boolean z, boolean z2, boolean z3, TdApi.MessageSchedulingState messageSchedulingState, boolean z4) {
        m35112jh(z, messageSchedulingState, z2);
    }

    public void m35117eh(TdApi.Message message, TdApi.MessageSchedulingState messageSchedulingState, C2285d dVar, C4737p7 p7Var) {
        C9312u1 cc2;
        if (!m9347Sa()) {
            m31305ig().setInProgress(false);
            if (message != null) {
                if (!(messageSchedulingState == null || dVar.f7915c.mo32494Z0(this) || (cc2 = m9277cc()) == null)) {
                    View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
                    rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(dVar.f7915c.mo32311n3(this), this.f30167b.m2771L3(dVar.f7913a), p7Var, null, 0, null).m32137e(true));
                    cc2.m9497p(rhVar);
                }
                m9298Zb();
            }
        }
    }

    public void m35116fh(final TdApi.MessageSchedulingState messageSchedulingState, final C2285d dVar, final C4737p7 p7Var, final TdApi.Message message) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2280d6.this.m35117eh(message, messageSchedulingState, dVar, p7Var);
            }
        });
    }

    public static C2964ra m35115gh() {
        return new C2964ra(56, R.id.text_subtitle, 0, R.string.QuizExplanation);
    }

    @Override
    public void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        m35125Wg();
    }

    @Override
    public int mo407R9() {
        return R.id.controller_createPoll;
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return !m35122Zg() && !m31305ig().m18787f();
    }

    public final boolean m35128Tg() {
        if (this.f7908P0.size() >= 10 || this.f7907O0) {
            return false;
        }
        final int N0 = this.f7896D0.m34224N0(R.id.optionAdd);
        this.f7907O0 = true;
        if (this.f7908P0.size() + 1 == 10) {
            this.f7896D0.m34138q1(N0, m35124Xg());
        } else {
            int i = N0 - 1;
            this.f7896D0.m34240F0().add(i, m35124Xg());
            this.f7896D0.m34240F0().add(i, new C2964ra(11));
            int[] s = this.f7897E0.m18525s(1);
            s[1] = s[1] + 2;
            if (this.f7905M0) {
                int[] q = this.f7897E0.m18527q();
                q[0] = q[0] + 2;
                int[] q2 = this.f7897E0.m18527q();
                q2[1] = q2[1] + 2;
            }
            this.f7896D0.m39308M(N0, 2);
            m31303kg().m39504A0();
        }
        m35108nh();
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2280d6.this.m35121ah(N0);
            }
        }, 180L);
        return true;
    }

    public final boolean m35127Ug() {
        return !m9131x9().f7917e && !m9131x9().f7916d;
    }

    public final boolean m35126Vg() {
        TdApi.FormattedText Yg;
        if ((this.f7905M0 && this.f7906N0 == null) || C5070i.m24061i(C5070i.m24074D(this.f7900H0.m32821x()))) {
            return false;
        }
        if (this.f7905M0 && (Yg = m35123Yg(false)) != null) {
            boolean k1 = C7321e.m16935k1(Yg);
            String str = Yg.text;
            if (!k1) {
                str = str.trim();
            }
            if (str.length() > 200) {
                return false;
            }
        }
        boolean z = !this.f7905M0;
        int i = 0;
        for (C2964ra raVar : this.f7908P0) {
            if (!C5070i.m24061i(C5070i.m24074D(raVar.m32821x()))) {
                if (this.f7906N0 == raVar) {
                    z = true;
                }
                i++;
            }
        }
        return z && i > 1;
    }

    public final void m35125Wg() {
        boolean Vg = m35126Vg();
        if (Vg) {
            m31305ig().m18782k(R.drawable.deproko_baseline_send_24, C1357a0.m37541i(1.5f));
        } else {
            View$OnTouchListenerC5103c0 c0Var = this.f7902J0;
            if (c0Var != null) {
                c0Var.m23953g();
            }
        }
        m31291yg(Vg, true);
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(this.f7905M0 ? R.string.CreateQuiz : R.string.CreatePoll);
    }

    public final C2964ra m35124Xg() {
        C2964ra P = new C2964ra(96, R.id.option).m32865L(new InputFilter[]{new C4180b(new char[]{'\n'})}).m32861P(new AbstractC2420g6.C2421a(5, new C2284c()));
        this.f7908P0.add(P);
        return P;
    }

    public final TdApi.FormattedText m35123Yg(boolean z) {
        String x = this.f7905M0 ? this.f7901I0.m32821x() : null;
        if (C5070i.m24061i(x)) {
            return null;
        }
        TdApi.FormattedText formattedText = new TdApi.FormattedText(x, null);
        if (z) {
            C7321e.m16935k1(formattedText);
        }
        return formattedText;
    }

    public final boolean m35122Zg() {
        if (!C5070i.m24061i(C5070i.m24074D(this.f7900H0.m32821x()))) {
            return true;
        }
        if (this.f7905M0 && !C7321e.m16965a1(m35123Yg(false))) {
            return true;
        }
        for (C2964ra raVar : this.f7908P0) {
            if (!C5070i.m24060j(raVar.m32821x())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int mo9286ba() {
        return R.id.theme_color_background;
    }

    @Override
    public boolean mo9269dd() {
        return true;
    }

    public final void m35114hh(p038ce.C2964ra r8) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2280d6.m35114hh(ce.ra):void");
    }

    public final void m35113ih(C2964ra raVar) {
        View C = m31303kg().getLayoutManager().mo39262C(this.f7896D0.m34235H0(raVar));
        if (C instanceof ViewGroup) {
            C1408x.m37085f(((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).getEditText());
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m35122Zg()) {
            return super.mo404jc(z);
        }
        String i1 = C4403w.m27869i1(this.f7905M0 ? R.string.QuizDiscardPrompt : R.string.PollDiscardPrompt);
        int[] iArr = {R.id.btn_done, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27869i1(this.f7905M0 ? R.string.QuizDiscard : R.string.PollDiscard);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        m9261ee(i1, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean bh;
                bh = View$OnClickListenerC2280d6.this.m35120bh(view, i);
                return bh;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
        return true;
    }

    public final void m35112jh(final boolean z, final TdApi.MessageSchedulingState messageSchedulingState, final boolean z2) {
        if (!m31305ig().m18787f()) {
            String D = C5070i.m24074D(this.f7900H0.m32821x());
            if (C5070i.m24061i(D) || D.length() > 255) {
                m35113ih(this.f7900H0);
                return;
            }
            int i = -1;
            ArrayList arrayList = new ArrayList(10);
            for (C2964ra raVar : this.f7908P0) {
                String D2 = C5070i.m24074D(raVar.m32821x());
                if (!C5070i.m24061i(D2)) {
                    if (D2.length() > 100) {
                        m35113ih(raVar);
                        return;
                    }
                    if (raVar == this.f7906N0) {
                        i = arrayList.size();
                    }
                    arrayList.add(D2);
                }
            }
            if (arrayList.size() >= 2) {
                final C2285d x9 = m9131x9();
                long j = x9.f7913a;
                final C4737p7 p7Var = x9.f7914b;
                if (messageSchedulingState != null || !x9.f7915c.mo32494Z0(this)) {
                    TdApi.FormattedText Yg = m35123Yg(!z2);
                    m31305ig().setInProgress(true);
                    mo9397La();
                    TdApi.InputMessagePoll inputMessagePoll = new TdApi.InputMessagePoll(D, (String[]) arrayList.toArray(new String[0]), this.f7903K0, this.f7905M0 ? new TdApi.PollTypeQuiz(i, Yg) : new TdApi.PollTypeRegular(this.f7904L0), 0, 0, false);
                    AbstractC5918j<TdApi.Message> y5Var = new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC2280d6.this.m35116fh(messageSchedulingState, x9, p7Var, (TdApi.Message) obj);
                        }
                    };
                    if (!m9131x9().f7915c.mo32573T4(this, j, p7Var != null ? p7Var.m26294g() : 0L, inputMessagePoll, z, messageSchedulingState, y5Var)) {
                        this.f30167b.m2215ub(j, p7Var != null ? p7Var.m26294g() : 0L, 0L, this.f30167b.m2431h3(j), false, inputMessagePoll, y5Var);
                        return;
                    }
                    return;
                }
                this.f30167b.m2485dd().m3787L8(this, j, false, new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z3, TdApi.MessageSchedulingState messageSchedulingState2, boolean z4) {
                        View$OnClickListenerC2280d6.this.m35118dh(z, z2, z3, messageSchedulingState2, z4);
                    }
                }, null);
            }
        }
    }

    public void m35111kh(C2285d dVar) {
        super.m9476Ad(dVar);
        this.f7905M0 = dVar.f7917e;
    }

    public final void m35110lh(C2964ra raVar) {
        C2964ra raVar2 = this.f7906N0;
        if (raVar2 != raVar) {
            if (raVar2 != null) {
                m35109mh(raVar2, false);
            }
            this.f7906N0 = raVar;
            if (raVar != null) {
                m35109mh(raVar, true);
            }
            m35125Wg();
        }
    }

    public final void m35109mh(C2964ra raVar, boolean z) {
        int H0 = this.f7896D0.m34235H0(raVar);
        if (H0 != -1) {
            View C = m31303kg().getLayoutManager().mo39262C(H0);
            if (C == null || C.getTag() != raVar) {
                this.f7896D0.m39312I(H0);
            } else {
                ((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).m17902k2(z, true);
            }
        }
    }

    public final void m35108nh() {
        if (this.f7899G0.m32851Z(10 <= this.f7908P0.size() ? C4403w.m27869i1(R.string.PollOptionsMax) : C4403w.m27844o2(R.string.PollOptionsLimit, 10 - this.f7908P0.size()))) {
            this.f7896D0.m34137q3(this.f7899G0);
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.optionAdd) {
            switch (id2) {
                case R.id.btn_pollSetting_anonymous:
                    this.f7903K0 = this.f7896D0.m34201W2(view);
                    return;
                case R.id.btn_pollSetting_multi:
                    this.f7904L0 = this.f7896D0.m34201W2(view);
                    return;
                case R.id.btn_pollSetting_quiz:
                    if (m35127Ug()) {
                        this.f7905M0 = this.f7896D0.m34201W2(view);
                        int N0 = this.f7896D0.m34224N0(R.id.text_subtitle);
                        if (this.f7905M0) {
                            int X1 = ((LinearLayoutManager) m31303kg().getLayoutManager()).m39549X1();
                            if (X1 != -1) {
                                int O0 = this.f7896D0.m34221O0(R.id.option, X1);
                                int indexOf = O0 != -1 ? this.f7908P0.indexOf(this.f7896D0.m34243E0(O0)) : -1;
                                if (indexOf != -1) {
                                    int i = indexOf;
                                    while (i < this.f7908P0.size() && C5070i.m24061i(C5070i.m24074D(this.f7908P0.get(i).m32821x()))) {
                                        i++;
                                    }
                                    if (i != this.f7908P0.size()) {
                                        indexOf = i;
                                    }
                                    int H0 = this.f7896D0.m34235H0(this.f7908P0.get(indexOf));
                                    if (H0 != -1) {
                                        View C = m31303kg().getLayoutManager().mo39262C(H0);
                                        if ((C instanceof ViewGroup) && C.getTag() == this.f7908P0.get(indexOf)) {
                                            ((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).m17898p2(this, this.f30167b, R.string.QuizOptionHint);
                                        }
                                    }
                                }
                            }
                            if (N0 == -1) {
                                if (this.f7901I0 == null) {
                                    this.f7901I0 = m35115gh();
                                }
                                int size = this.f7896D0.m34240F0().size();
                                this.f7896D0.m34188b1(size - 1, new C2964ra(2), this.f7901I0, new C2964ra(3), new C2964ra(9, 0, 0, R.string.QuizExplanationInfo));
                                this.f7897E0.m18531m(size, size + 1);
                                m31303kg().m39504A0();
                            }
                        } else if (N0 != -1) {
                            this.f7897E0.m18524t();
                            this.f7896D0.m34204V1(N0 - 1, 4);
                            m31303kg().m39504A0();
                        }
                        int N02 = this.f7896D0.m34224N0(R.id.text_title);
                        if (N02 != -1) {
                            if (this.f7896D0.m34240F0().get(N02).m32852Y(this.f7905M0 ? R.string.QuizOptions : R.string.PollOptions)) {
                                this.f7896D0.m39312I(N02);
                            }
                        }
                        if (this.f7905M0) {
                            this.f7904L0 = false;
                        }
                        this.f7896D0.m34130s3(R.id.btn_pollSetting_multi);
                        View$OnClickListenerC9170d1 d1Var = this.f30156R;
                        if (d1Var != null) {
                            d1Var.m10044m4(mo407R9(), mo9313X9());
                        }
                        m35125Wg();
                        int i2 = 0;
                        for (C2964ra raVar : this.f7896D0.m34240F0()) {
                            switch (raVar.m32835j()) {
                                case R.id.option:
                                case R.id.optionAdd:
                                    View C2 = m31303kg().getLayoutManager().mo39262C(i2);
                                    if (C2 == null || C2.getTag() != raVar) {
                                        this.f7896D0.m39312I(i2);
                                        break;
                                    } else {
                                        ((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C2).getChildAt(0)).m17901l2(this.f7905M0, true);
                                        break;
                                    }
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            m35128Tg();
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        int i;
        C2281a aVar = new C2281a(this);
        this.f7896D0 = aVar;
        aVar.m34211S2(this);
        ArrayList arrayList = new ArrayList();
        this.f7897E0 = new C2283b(customRecyclerView, this);
        C2964ra raVar = new C2964ra(62, R.id.S, 0, R.string.PollQuestion);
        this.f7900H0 = raVar;
        arrayList.add(raVar);
        arrayList.add(new C2964ra(3));
        this.f7897E0.m18531m(0, 1);
        arrayList.add(new C2964ra(8, R.id.text_title, 0, this.f7905M0 ? R.string.QuizOptions : R.string.PollOptions));
        arrayList.add(new C2964ra(2));
        arrayList.add(m35124Xg());
        arrayList.add(new C2964ra(11));
        C2964ra L = new C2964ra(97, R.id.optionAdd).m32865L(new InputFilter[]{new InputFilter.LengthFilter(0)});
        this.f7898F0 = L;
        arrayList.add(L);
        this.f7897E0.m18531m(arrayList.size() - 3, arrayList.size());
        arrayList.add(new C2964ra(3));
        C2964ra raVar2 = new C2964ra(9, 0, 0, (CharSequence) C4403w.m27844o2(R.string.PollOptionsLimit, 10 - this.f7908P0.size()), false);
        this.f7899G0 = raVar2;
        arrayList.add(raVar2);
        arrayList.add(new C2964ra(2));
        if (!this.f30167b.m2784K6(m9131x9().f7913a)) {
            arrayList.add(new C2964ra(7, R.id.btn_pollSetting_anonymous, 0, R.string.PollSettingAnonymous));
            i = 1;
        } else {
            this.f7903K0 = true;
            i = 0;
        }
        if (!m9131x9().f7917e) {
            if (i > 0) {
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(new C2964ra(7, R.id.btn_pollSetting_multi, 0, R.string.PollSettingMultiple));
            i++;
        }
        if (i > 0) {
            arrayList.add(new C2964ra(11));
        }
        arrayList.add(new C2964ra(7, R.id.btn_pollSetting_quiz, 0, R.string.PollSettingQuiz));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.PollSettingQuizInfo));
        if (this.f7905M0) {
            arrayList.add(new C2964ra(2));
            C2964ra gh = m35115gh();
            this.f7901I0 = gh;
            arrayList.add(gh);
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.QuizExplanationInfo));
            this.f7897E0.m18531m(arrayList.size() - 3, arrayList.size() - 2);
        }
        arrayList.add(new C2964ra(14));
        this.f7896D0.m34116x2(arrayList, false);
        this.f7896D0.m34250A2(this, true);
        customRecyclerView.setAdapter(this.f7896D0);
        customRecyclerView.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
        customRecyclerView.m39434g(this.f7897E0);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f7902J0 == null) {
            this.f7902J0 = this.f30167b.m2485dd().m3763O2(this, m9131x9().f7913a, new AbstractC5914f() {
                @Override
                public final boolean get() {
                    boolean Vg;
                    Vg = View$OnClickListenerC2280d6.this.m35126Vg();
                    return Vg;
                }
            }, new AbstractC5914f() {
                @Override
                public final boolean get() {
                    boolean ch;
                    ch = View$OnClickListenerC2280d6.this.m35119ch();
                    return ch;
                }
            }, null, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    View$OnClickListenerC2280d6.this.m35112jh(z, messageSchedulingState, z2);
                }
            }, null).m23956d(m31305ig());
        }
    }

    @Override
    public void mo31297sg() {
        m35112jh(false, null, false);
    }
}
