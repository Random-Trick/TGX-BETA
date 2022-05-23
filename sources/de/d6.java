package de;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import ce.x;
import de.d6;
import de.g6;
import de.iq;
import de.rh;
import gd.w;
import hd.p7;
import ib.i;
import ie.c0;
import ie.g0;
import ie.h0;
import ie.p;
import java.util.ArrayList;
import java.util.List;
import kb.f;
import kb.j;
import ne.h1;
import ne.o2;
import ne.y1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.EditTextBase;
import ud.d1;
import ud.q1;
import ud.u1;
import ud.v4;
import zd.hj;
import zd.o6;

public class d6 extends vo<d> implements View.OnClickListener, iq.e {
    public iq D0;
    public h1 E0;
    public ra F0;
    public ra G0;
    public ra H0;
    public ra I0;
    public c0 J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public ra N0;
    public boolean O0;
    public List<ra> P0 = new ArrayList();

    public class a extends iq {

        public class C0088a implements EditTextBase.b {
            public C0088a() {
            }

            @Override
            public boolean a(EditTextBase editTextBase, Editable editable, int i10, int i11) {
                if (d6.this.P0.size() <= 1) {
                    return false;
                }
                if (editable.length() != 0 && !editable.toString().trim().isEmpty()) {
                    return false;
                }
                d6.this.hh((ra) ((ViewGroup) editTextBase.getParent().getParent()).getTag());
                return true;
            }
        }

        public a(v4 v4Var) {
            super(v4Var);
        }

        public static boolean x3(y1 y1Var) {
            return true;
        }

        public boolean y3(y1 y1Var) {
            int F0;
            int i10;
            ra raVar = (ra) ((ViewGroup) y1Var.getParent()).getTag();
            if (raVar == null || raVar.j() != R.id.option || (F0 = d6.this.D0.F0(raVar)) == -1 || (i10 = F0 + 2) >= d6.this.D0.D0().size()) {
                return false;
            }
            switch (d6.this.D0.D0().get(i10).j()) {
                case R.id.option:
                case R.id.optionAdd:
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public void C1(ra raVar, ViewGroup viewGroup, y1 y1Var, o2 o2Var) {
            if (raVar.j() == R.id.option) {
                d6.this.lh(raVar);
            }
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            switch (raVar.j()) {
                case R.id.btn_pollSetting_anonymous:
                    cVar.getToggler().r(d6.this.K0, z10);
                    return;
                case R.id.btn_pollSetting_multi:
                    cVar.getToggler().r(d6.this.L0, z10);
                    cVar.X1(!d6.this.M0, z10);
                    return;
                case R.id.btn_pollSetting_quiz:
                    cVar.getToggler().r(d6.this.M0, z10);
                    cVar.X1(d6.this.Ug(), z10);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void i4(y1 y1Var, boolean z10) {
            super.i4(y1Var, z10);
            if (z10 && ((ViewGroup) y1Var.getParent()).getId() == R.id.optionAdd) {
                d6.this.Tg();
            }
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            switch (raVar.j()) {
                case R.id.option:
                    y1Var.i2(d6.this.M0, false);
                    y1Var.h2(raVar == d6.this.N0, false);
                    y1Var.getEditText().setInputType(16385);
                    p0.j0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(100);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    y1Var.getEditText().setBackspaceListener(new C0088a());
                    y1Var.setNeedNextButton(new y1.f() {
                        @Override
                        public final boolean a(y1 y1Var2) {
                            boolean y32;
                            y32 = d6.a.this.y3(y1Var2);
                            return y32;
                        }
                    });
                    y1Var.getEditText().setImeOptions(268435461);
                    return;
                case R.id.optionAdd:
                    y1Var.i2(d6.this.M0, false);
                    y1Var.getEditText().setInputType(16385);
                    p0.j0(y1Var.getEditText(), false);
                    y1Var.getEditText().setImeOptions(268435461);
                    y1Var.setNeedNextButton(c6.f7632a);
                    return;
                case R.id.text_subtitle:
                    y1Var.D1(false);
                    y1Var.setEmptyHint(R.string.QuizExplanationEmpty);
                    y1Var.getEditText().setInputType(16385);
                    p0.j0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(200);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    return;
                case R.id.S:
                    y1Var.setEmptyHint(R.string.PollQuestionEmpty);
                    y1Var.getEditText().setInputType(16385);
                    p0.j0(y1Var.getEditText(), false);
                    y1Var.setMaxLength(255);
                    y1Var.setAlwaysActive(true);
                    y1Var.getEditText().setLineDisabled(true);
                    return;
                default:
                    return;
            }
        }
    }

    public class b extends h1 {
        public b(RecyclerView recyclerView, v4 v4Var) {
            super(recyclerView, v4Var);
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            int i10 = 0;
            rect.top = view.getId() == R.id.text_subtitle ? a0.i(10.0f) : 0;
            if (k02 != -1 && k02 == d6.this.D0.D() - 1) {
                i10 = a0.i(56.0f);
            }
            rect.bottom = i10;
        }
    }

    public class c implements p {
        public c() {
        }

        @Override
        public boolean v5(View view) {
            return d6.this.Tg();
        }
    }

    public static class d {
        public final long f7753a;
        public final p7 f7754b;
        public final e f7755c;
        public final boolean f7756d;
        public final boolean f7757e;

        public d(long j10, p7 p7Var, e eVar) {
            this(j10, p7Var, eVar, false, false);
        }

        public d(long j10, p7 p7Var, e eVar, boolean z10, boolean z11) {
            if (eVar != null) {
                this.f7753a = j10;
                this.f7754b = p7Var;
                this.f7755c = eVar;
                this.f7756d = z11;
                this.f7757e = z10;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public interface e {
        boolean O3(d6 d6Var, long j10, long j11, TdApi.InputMessagePoll inputMessagePoll, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, j<TdApi.Message> jVar);

        boolean l3(d6 d6Var);

        TdApi.ChatList y5(d6 d6Var);
    }

    public d6(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void ah(int i10) {
        this.O0 = false;
        View C = kg().getLayoutManager().C(i10);
        if (C instanceof ViewGroup) {
            x.f(((y1) ((ViewGroup) C).getChildAt(0)).getEditText());
        }
    }

    public boolean bh(View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        Zb();
        return true;
    }

    public boolean ch() {
        TdApi.FormattedText Yg = Yg(false);
        return Yg != null && Yg.text.trim().length() <= 200 && ob.e.m1(Yg);
    }

    public void dh(boolean z10, boolean z11, boolean z12, TdApi.MessageSchedulingState messageSchedulingState, boolean z13) {
        jh(z10, messageSchedulingState, z11);
    }

    public void eh(TdApi.Message message, TdApi.MessageSchedulingState messageSchedulingState, d dVar, p7 p7Var) {
        u1 cc2;
        if (!Sa()) {
            ig().setInProgress(false);
            if (message != null) {
                if (!(messageSchedulingState == null || dVar.f7755c.l3(this) || (cc2 = cc()) == null)) {
                    rh rhVar = new rh(this.f24493a, this.f24495b);
                    rhVar.Lp(new rh.c0(dVar.f7755c.y5(this), this.f24495b.P3(dVar.f7753a), p7Var, null, 0, null).e(true));
                    cc2.p(rhVar);
                }
                Zb();
            }
        }
    }

    public void fh(final TdApi.MessageSchedulingState messageSchedulingState, final d dVar, final p7 p7Var, final TdApi.Message message) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                d6.this.eh(message, messageSchedulingState, dVar, p7Var);
            }
        });
    }

    public static ra gh() {
        return new ra(56, R.id.text_subtitle, 0, R.string.QuizExplanation);
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        Wg();
    }

    @Override
    public int R9() {
        return R.id.controller_createPoll;
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return !Zg() && !ig().f();
    }

    public final boolean Tg() {
        if (this.P0.size() >= 10 || this.O0) {
            return false;
        }
        final int L0 = this.D0.L0(R.id.optionAdd);
        this.O0 = true;
        if (this.P0.size() + 1 == 10) {
            this.D0.m1(L0, Xg());
        } else {
            int i10 = L0 - 1;
            this.D0.D0().add(i10, Xg());
            this.D0.D0().add(i10, new ra(11));
            int[] s10 = this.E0.s(1);
            s10[1] = s10[1] + 2;
            if (this.M0) {
                int[] q10 = this.E0.q();
                q10[0] = q10[0] + 2;
                int[] q11 = this.E0.q();
                q11[1] = q11[1] + 2;
            }
            this.D0.M(L0, 2);
            kg().A0();
        }
        nh();
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                d6.this.ah(L0);
            }
        }, 180L);
        return true;
    }

    public final boolean Ug() {
        return !x9().f7757e && !x9().f7756d;
    }

    public final boolean Vg() {
        TdApi.FormattedText Yg;
        if ((this.M0 && this.N0 == null) || i.i(i.D(this.H0.x()))) {
            return false;
        }
        if (this.M0 && (Yg = Yg(false)) != null) {
            boolean m12 = ob.e.m1(Yg);
            String str = Yg.text;
            if (!m12) {
                str = str.trim();
            }
            if (str.length() > 200) {
                return false;
            }
        }
        boolean z10 = !this.M0;
        int i10 = 0;
        for (ra raVar : this.P0) {
            if (!i.i(i.D(raVar.x()))) {
                if (this.N0 == raVar) {
                    z10 = true;
                }
                i10++;
            }
        }
        return z10 && i10 > 1;
    }

    public final void Wg() {
        boolean Vg = Vg();
        if (Vg) {
            ig().k(R.drawable.deproko_baseline_send_24, a0.i(1.5f));
        } else {
            c0 c0Var = this.J0;
            if (c0Var != null) {
                c0Var.g();
            }
        }
        yg(Vg, true);
    }

    @Override
    public CharSequence X9() {
        return w.i1(this.M0 ? R.string.CreateQuiz : R.string.CreatePoll);
    }

    public final ra Xg() {
        ra P = new ra(96, R.id.option).L(new InputFilter[]{new fb.b(new char[]{'\n'})}).P(new g6.a(5, new c()));
        this.P0.add(P);
        return P;
    }

    public final TdApi.FormattedText Yg(boolean z10) {
        String x10 = this.M0 ? this.I0.x() : null;
        if (i.i(x10)) {
            return null;
        }
        TdApi.FormattedText formattedText = new TdApi.FormattedText(x10, null);
        if (z10) {
            ob.e.m1(formattedText);
        }
        return formattedText;
    }

    public final boolean Zg() {
        if (!i.i(i.D(this.H0.x()))) {
            return true;
        }
        if (this.M0 && !ob.e.c1(Yg(false))) {
            return true;
        }
        for (ra raVar : this.P0) {
            if (!i.j(raVar.x())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int ba() {
        return R.id.theme_color_background;
    }

    @Override
    public boolean dd() {
        return true;
    }

    public final void hh(de.ra r8) {
        throw new UnsupportedOperationException("Method not decompiled: de.d6.hh(de.ra):void");
    }

    public final void ih(ra raVar) {
        View C = kg().getLayoutManager().C(this.D0.F0(raVar));
        if (C instanceof ViewGroup) {
            x.f(((y1) ((ViewGroup) C).getChildAt(0)).getEditText());
        }
    }

    @Override
    public boolean jc(boolean z10) {
        if (!Zg()) {
            return super.jc(z10);
        }
        String i12 = w.i1(this.M0 ? R.string.QuizDiscardPrompt : R.string.PollDiscardPrompt);
        int[] iArr = {R.id.btn_done, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = w.i1(this.M0 ? R.string.QuizDiscard : R.string.PollDiscard);
        strArr[1] = w.i1(R.string.Cancel);
        ee(i12, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean bh;
                bh = d6.this.bh(view, i10);
                return bh;
            }
        });
        return true;
    }

    public final void jh(final boolean z10, final TdApi.MessageSchedulingState messageSchedulingState, final boolean z11) {
        if (!ig().f()) {
            String D = i.D(this.H0.x());
            if (i.i(D) || D.length() > 255) {
                ih(this.H0);
                return;
            }
            int i10 = -1;
            ArrayList arrayList = new ArrayList(10);
            for (ra raVar : this.P0) {
                String D2 = i.D(raVar.x());
                if (!i.i(D2)) {
                    if (D2.length() > 100) {
                        ih(raVar);
                        return;
                    }
                    if (raVar == this.N0) {
                        i10 = arrayList.size();
                    }
                    arrayList.add(D2);
                }
            }
            if (arrayList.size() >= 2) {
                final d x92 = x9();
                long j10 = x92.f7753a;
                final p7 p7Var = x92.f7754b;
                if (messageSchedulingState != null || !x92.f7755c.l3(this)) {
                    TdApi.FormattedText Yg = Yg(!z11);
                    ig().setInProgress(true);
                    La();
                    TdApi.InputMessagePoll inputMessagePoll = new TdApi.InputMessagePoll(D, (String[]) arrayList.toArray(new String[0]), this.K0, this.M0 ? new TdApi.PollTypeQuiz(i10, Yg) : new TdApi.PollTypeRegular(this.L0), 0, 0, false);
                    j<TdApi.Message> y5Var = new j() {
                        @Override
                        public final void a(Object obj) {
                            d6.this.fh(messageSchedulingState, x92, p7Var, (TdApi.Message) obj);
                        }
                    };
                    if (!x9().f7755c.O3(this, j10, p7Var != null ? p7Var.g() : 0L, inputMessagePoll, z10, messageSchedulingState, y5Var)) {
                        this.f24495b.yb(j10, p7Var != null ? p7Var.g() : 0L, 0L, this.f24495b.j3(j10), false, inputMessagePoll, y5Var);
                        return;
                    }
                    return;
                }
                this.f24495b.hd().L8(this, j10, false, new hj.o() {
                    @Override
                    public final void a(boolean z12, TdApi.MessageSchedulingState messageSchedulingState2, boolean z13) {
                        d6.this.dh(z10, z11, z12, messageSchedulingState2, z13);
                    }
                }, null);
            }
        }
    }

    public void kh(d dVar) {
        super.Ad(dVar);
        this.M0 = dVar.f7757e;
    }

    public final void lh(ra raVar) {
        ra raVar2 = this.N0;
        if (raVar2 != raVar) {
            if (raVar2 != null) {
                mh(raVar2, false);
            }
            this.N0 = raVar;
            if (raVar != null) {
                mh(raVar, true);
            }
            Wg();
        }
    }

    public final void mh(ra raVar, boolean z10) {
        int F0 = this.D0.F0(raVar);
        if (F0 != -1) {
            View C = kg().getLayoutManager().C(F0);
            if (C == null || C.getTag() != raVar) {
                this.D0.I(F0);
            } else {
                ((y1) ((ViewGroup) C).getChildAt(0)).h2(z10, true);
            }
        }
    }

    public final void nh() {
        if (this.G0.Z(10 <= this.P0.size() ? w.i1(R.string.PollOptionsMax) : w.o2(R.string.PollOptionsLimit, 10 - this.P0.size()))) {
            this.D0.n3(this.G0);
        }
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.optionAdd) {
            switch (id2) {
                case R.id.btn_pollSetting_anonymous:
                    this.K0 = this.D0.S2(view);
                    return;
                case R.id.btn_pollSetting_multi:
                    this.L0 = this.D0.S2(view);
                    return;
                case R.id.btn_pollSetting_quiz:
                    if (Ug()) {
                        this.M0 = this.D0.S2(view);
                        int L0 = this.D0.L0(R.id.text_subtitle);
                        if (this.M0) {
                            int X1 = ((LinearLayoutManager) kg().getLayoutManager()).X1();
                            if (X1 != -1) {
                                int M0 = this.D0.M0(R.id.option, X1);
                                int indexOf = M0 != -1 ? this.P0.indexOf(this.D0.C0(M0)) : -1;
                                if (indexOf != -1) {
                                    int i10 = indexOf;
                                    while (i10 < this.P0.size() && i.i(i.D(this.P0.get(i10).x()))) {
                                        i10++;
                                    }
                                    if (i10 != this.P0.size()) {
                                        indexOf = i10;
                                    }
                                    int F0 = this.D0.F0(this.P0.get(indexOf));
                                    if (F0 != -1) {
                                        View C = kg().getLayoutManager().C(F0);
                                        if ((C instanceof ViewGroup) && C.getTag() == this.P0.get(indexOf)) {
                                            ((y1) ((ViewGroup) C).getChildAt(0)).l2(this, this.f24495b, R.string.QuizOptionHint);
                                        }
                                    }
                                }
                            }
                            if (L0 == -1) {
                                if (this.I0 == null) {
                                    this.I0 = gh();
                                }
                                int size = this.D0.D0().size();
                                this.D0.Y0(size - 1, new ra(2), this.I0, new ra(3), new ra(9, 0, 0, R.string.QuizExplanationInfo));
                                this.E0.m(size, size + 1);
                                kg().A0();
                            }
                        } else if (L0 != -1) {
                            this.E0.t();
                            this.D0.R1(L0 - 1, 4);
                            kg().A0();
                        }
                        int L02 = this.D0.L0(R.id.text_title);
                        if (L02 != -1) {
                            if (this.D0.D0().get(L02).Y(this.M0 ? R.string.QuizOptions : R.string.PollOptions)) {
                                this.D0.I(L02);
                            }
                        }
                        if (this.M0) {
                            this.L0 = false;
                        }
                        this.D0.p3(R.id.btn_pollSetting_multi);
                        d1 d1Var = this.R;
                        if (d1Var != null) {
                            d1Var.q4(R9(), X9());
                        }
                        Wg();
                        int i11 = 0;
                        for (ra raVar : this.D0.D0()) {
                            switch (raVar.j()) {
                                case R.id.option:
                                case R.id.optionAdd:
                                    View C2 = kg().getLayoutManager().C(i11);
                                    if (C2 == null || C2.getTag() != raVar) {
                                        this.D0.I(i11);
                                        break;
                                    } else {
                                        ((y1) ((ViewGroup) C2).getChildAt(0)).i2(this.M0, true);
                                        break;
                                    }
                            }
                            i11++;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            Tg();
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        int i10;
        a aVar = new a(this);
        this.D0 = aVar;
        aVar.O2(this);
        ArrayList arrayList = new ArrayList();
        this.E0 = new b(customRecyclerView, this);
        ra raVar = new ra(62, R.id.S, 0, R.string.PollQuestion);
        this.H0 = raVar;
        arrayList.add(raVar);
        arrayList.add(new ra(3));
        this.E0.m(0, 1);
        arrayList.add(new ra(8, R.id.text_title, 0, this.M0 ? R.string.QuizOptions : R.string.PollOptions));
        arrayList.add(new ra(2));
        arrayList.add(Xg());
        arrayList.add(new ra(11));
        ra L = new ra(97, R.id.optionAdd).L(new InputFilter[]{new InputFilter.LengthFilter(0)});
        this.F0 = L;
        arrayList.add(L);
        this.E0.m(arrayList.size() - 3, arrayList.size());
        arrayList.add(new ra(3));
        ra raVar2 = new ra(9, 0, 0, (CharSequence) w.o2(R.string.PollOptionsLimit, 10 - this.P0.size()), false);
        this.G0 = raVar2;
        arrayList.add(raVar2);
        arrayList.add(new ra(2));
        if (!this.f24495b.O6(x9().f7753a)) {
            arrayList.add(new ra(7, R.id.btn_pollSetting_anonymous, 0, R.string.PollSettingAnonymous));
            i10 = 1;
        } else {
            this.K0 = true;
            i10 = 0;
        }
        if (!x9().f7757e) {
            if (i10 > 0) {
                arrayList.add(new ra(11));
            }
            arrayList.add(new ra(7, R.id.btn_pollSetting_multi, 0, R.string.PollSettingMultiple));
            i10++;
        }
        if (i10 > 0) {
            arrayList.add(new ra(11));
        }
        arrayList.add(new ra(7, R.id.btn_pollSetting_quiz, 0, R.string.PollSettingQuiz));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.PollSettingQuizInfo));
        if (this.M0) {
            arrayList.add(new ra(2));
            ra gh = gh();
            this.I0 = gh;
            arrayList.add(gh);
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.QuizExplanationInfo));
            this.E0.m(arrayList.size() - 3, arrayList.size() - 2);
        }
        arrayList.add(new ra(14));
        this.D0.s2(arrayList, false);
        this.D0.v2(this, true);
        customRecyclerView.setAdapter(this.D0);
        customRecyclerView.setItemAnimator(new tc.d(db.b.f7287b, 180L));
        customRecyclerView.g(this.E0);
    }

    @Override
    public void sc() {
        super.sc();
        if (this.J0 == null) {
            this.J0 = this.f24495b.hd().O2(this, x9().f7753a, new f() {
                @Override
                public final boolean get() {
                    boolean Vg;
                    Vg = d6.this.Vg();
                    return Vg;
                }
            }, new f() {
                @Override
                public final boolean get() {
                    boolean ch;
                    ch = d6.this.ch();
                    return ch;
                }
            }, null, new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    d6.this.jh(z10, messageSchedulingState, z11);
                }
            }, null).d(ig());
        }
    }

    @Override
    public void sg() {
        jh(false, null, false);
    }
}
