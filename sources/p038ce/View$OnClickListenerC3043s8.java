package p038ce;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1408x;
import gd.C4601c3;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.List;
import me.C6897h1;
import me.C6981o;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class View$OnClickListenerC3043s8 extends AbstractC2420g6<C3046c> implements C2546iq.AbstractC2551e, View.OnClickListener {
    public C2964ra f10223A0;
    public C2964ra f10224B0;
    public AbstractRunnableC5910b f10225C0;
    public List<C4601c3> f10226D0;
    public int f10227E0;
    public CharSequence f10228F0;
    public long f10229v0;
    public C2546iq f10230w0;
    public String f10231x0;
    public String f10232y0;
    public C2964ra f10233z0;

    public class C3044a extends C2546iq {
        public C3044a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setChat((C4601c3) raVar.m32844d());
        }
    }

    public class C3045b extends AbstractRunnableC5910b {
        public C3045b() {
        }

        @Override
        public void mo1364b() {
            View$OnClickListenerC3043s8 s8Var = View$OnClickListenerC3043s8.this;
            s8Var.m31953Bf(s8Var.f10225C0);
        }
    }

    public static class C3046c {
        public long f10236a;

        public C3046c(long j) {
            this.f10236a = j;
        }
    }

    public View$OnClickListenerC3043s8(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31949Ff(AbstractRunnableC5910b bVar, List list) {
        if (!m9347Sa() && this.f10225C0 == bVar && bVar.m21856d()) {
            m31935Tf(list);
        }
    }

    public void m31948Gf(final AbstractRunnableC5910b bVar, TdApi.Object object) {
        if (object.getConstructor() == 1809654812) {
            List<TdApi.Chat> i4 = this.f30167b.m2414i4(((TdApi.Chats) object).chatIds);
            if (!i4.isEmpty()) {
                final ArrayList arrayList = new ArrayList(i4.size());
                for (TdApi.Chat chat : i4) {
                    C4601c3 c3Var = new C4601c3(this.f30167b, null, chat, true, null);
                    c3Var.m27061D();
                    c3Var.m27058G();
                    arrayList.add(c3Var);
                }
                this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3043s8.this.m31949Ff(bVar, arrayList);
                    }
                });
            }
        }
    }

    public void m31947Hf(String str, TdApi.Object object, final AbstractRunnableC5910b bVar) {
        CharSequence charSequence;
        if (!m9347Sa() && this.f10232y0.equals(str)) {
            boolean z = false;
            boolean z2 = true;
            switch (object.getConstructor()) {
                case TdApi.Error.CONSTRUCTOR:
                    charSequence = C4779t2.m25378z5(object);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultOk.CONSTRUCTOR:
                    charSequence = m31950Ef(true);
                    z = true;
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultUsernameInvalid.CONSTRUCTOR:
                    charSequence = C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicGroupsUnavailable.CONSTRUCTOR:
                    charSequence = C4403w.m27869i1(R.string.PublicGroupsUnavailable);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicChatsTooMuch.CONSTRUCTOR:
                    charSequence = C4403w.m27869i1(R.string.TooManyPublicLinks);
                    break;
                case TdApi.CheckChatUsernameResultUsernameOccupied.CONSTRUCTOR:
                    charSequence = m31950Ef(false);
                    z2 = false;
                    break;
                default:
                    throw new RuntimeException();
            }
            this.f10233z0.m32853X(charSequence);
            this.f10233z0.m32843d0(z ? R.id.theme_color_textSecure : R.id.theme_color_textNegative);
            m31934Uf(2);
            this.f10230w0.m34178e3(R.id.input, z, !z);
            if (z2 && this.f10229v0 != 0) {
                this.f30167b.m2270r4().m14783o(new TdApi.GetCreatedPublicChats(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        View$OnClickListenerC3043s8.this.m31948Gf(bVar, object2);
                    }
                });
            }
        }
    }

    public void m31946If(final String str, final AbstractRunnableC5910b bVar, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3043s8.this.m31947Hf(str, object, bVar);
            }
        });
    }

    public void m31945Jf() {
        if (!m9347Sa()) {
            m34624if(false);
            m31952Cf(this.f10232y0);
            C1408x.m37085f(m9333U9());
        }
    }

    public void m31944Kf() {
        if (!m9347Sa()) {
            m34624if(false);
        }
    }

    public void m31943Lf(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31944Kf();
                }
            });
        } else if (constructor == -722616727) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31945Jf();
                }
            });
        }
    }

    public boolean m31942Mf(C4601c3 c3Var, View view, int i) {
        if (i == R.id.btn_delete && !m34633Ue()) {
            m34624if(true);
            this.f30167b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(c3Var.m27047e()), null), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3043s8.this.m31943Lf(object);
                }
            });
        }
        return true;
    }

    public boolean m31941Nf(final C4601c3 c3Var, String str, View view, int i) {
        if (i == R.id.btn_delete) {
            m9261ee(C4403w.m27853m1(R.string.ChatLinkRemoveAlert, this.f30167b.m2691Q3(c3Var.m27047e()), str), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ChatLinkRemove), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i2) {
                    boolean Mf;
                    Mf = View$OnClickListenerC3043s8.this.m31942Mf(c3Var, view2, i2);
                    return Mf;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            });
        } else if (i == R.id.btn_openChat) {
            this.f30167b.m2485dd().m3569h7(this, c3Var.m27047e(), new HandlerC10770jj.C10780j().m3368h());
        }
        return true;
    }

    public void m31940Of(boolean z, TdApi.Object object) {
        m34624if(false);
        if (m9347Sa()) {
            return;
        }
        if (z) {
            m34629cf();
        } else {
            m31931Xf(C4779t2.m25378z5(object));
        }
    }

    public void m31939Pf(final TdApi.Object object) {
        final boolean z = object.getConstructor() == -722616727 || (object.getConstructor() == -1679978726 && "USERNAME_NOT_MODIFIED".equals(((TdApi.Error) object).message));
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3043s8.this.m31940Of(z, object);
            }
        });
    }

    public void m31938Qf(String str, Client.AbstractC7865g gVar, long j, long j2, TdApi.Error error) {
        if (j2 != 0) {
            m31936Sf(new C3046c(j2));
            this.f30167b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(this.f10229v0), str), gVar);
            return;
        }
        if (error == null) {
            error = new TdApi.Error(-1, "Failed to upgrade to supergroup");
        }
        gVar.mo255t2(error);
    }

    public void m31937Rf(String str) {
        m31932Wf(str, false);
    }

    public final void m31954Af() {
        C3045b bVar = new C3045b();
        this.f10225C0 = bVar;
        bVar.m21855e(C1379j0.m37313o());
        C1379j0.m37332e0(this.f10225C0, 350L);
    }

    public final void m31953Bf(final AbstractRunnableC5910b bVar) {
        final String str = this.f10232y0;
        Client r4 = this.f30167b.m2270r4();
        long j = 0;
        if (!C7316a.m17054g(this.f10229v0)) {
            long j2 = this.f10229v0;
            j = j2 != 0 ? j2 : this.f30167b.m2343mb();
        }
        r4.m14783o(new TdApi.CheckChatUsername(j, str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3043s8.this.m31946If(str, bVar, object);
            }
        });
    }

    public final void m31952Cf(String str) {
        this.f10232y0 = str;
        m31915zf();
        if (this.f10224B0.m32851Z(m31951Df())) {
            this.f10230w0.m34156k3(R.id.description);
        }
        int i = 0;
        if (!this.f10231x0.equals(str) || str.isEmpty()) {
            this.f10230w0.m34178e3(R.id.input, false, false);
            if (str.length() >= 5 && C4779t2.m25407v4(str) && str.length() <= 32) {
                i = 1;
            }
            m31934Uf(i);
        } else {
            this.f10233z0.m32843d0(R.id.theme_color_textSecure);
            this.f10233z0.m32853X(m31950Ef(true));
            this.f10230w0.m34178e3(R.id.input, true, false);
            m31934Uf(2);
        }
        if (this.f10227E0 == 1) {
            m31954Af();
        }
    }

    public final CharSequence m31951Df() {
        if (this.f10228F0 == null) {
            long j = this.f10229v0;
            this.f10228F0 = C1363c0.m37448Z(C4403w.m27869i1(j != 0 ? this.f30167b.m2784K6(j) ? R.string.LinkChannelHelp : R.string.LinkGroupHelp : R.string.UsernameHelp), R.id.theme_color_textLight);
        }
        if (this.f10232y0.length() < 5 || this.f10232y0.length() > 32 || this.f10229v0 != 0) {
            return this.f10228F0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10228F0);
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) C4403w.m27869i1(this.f10232y0.equals(this.f10231x0) ? R.string.ThisLinkOpens : R.string.ThisLinkWillOpen));
        spannableStringBuilder.append((CharSequence) " ");
        String Tc = this.f30167b.m2637Tc(this.f10232y0);
        spannableStringBuilder.append((CharSequence) Tc);
        spannableStringBuilder.setSpan(new C5132o(C1389o.m37258k(), R.id.theme_color_textLink), spannableStringBuilder.length() - Tc.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence m31950Ef(boolean z) {
        int i;
        if (z) {
            if (this.f10231x0.equals(this.f10232y0)) {
                i = this.f10229v0 != 0 ? R.string.LinkCurrent : R.string.UsernameCurrent;
            } else {
                i = R.string.UsernameAvailable;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4403w.m27865j1(i, this.f10232y0));
            spannableStringBuilder.setSpan(new C5132o(C1389o.m37260i(), R.id.theme_color_textSecure), 0, this.f10232y0.length(), 33);
            return spannableStringBuilder;
        }
        return C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInUse : R.string.UsernameInUse);
    }

    @Override
    public void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (!this.f10232y0.equals(str)) {
            m31952Cf(str);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editUsername;
    }

    @Override
    public int mo31415Re() {
        return this.f10229v0 != 0 ? R.id.theme_color_background : super.mo31415Re();
    }

    public void m31936Sf(C3046c cVar) {
        super.m9476Ad(cVar);
        this.f10229v0 = cVar.f10236a;
    }

    public final void m31935Tf(List<C4601c3> list) {
        int N0;
        List<C4601c3> list2 = this.f10226D0;
        if (!(list2 == null && list == null)) {
            boolean z = true;
            if (!(list2 == null || (N0 = this.f10230w0.m34224N0(R.id.occupiedChats)) == -1)) {
                this.f10230w0.m34204V1(N0, (this.f10226D0.size() * 2) + 1);
            }
            this.f10226D0 = list;
            if (list != null) {
                List<C2964ra> F0 = this.f10230w0.m34240F0();
                int size = F0.size();
                for (C4601c3 c3Var : list) {
                    if (z) {
                        F0.add(new C2964ra(2, R.id.occupiedChats));
                        z = false;
                    } else {
                        F0.add(new C2964ra(11));
                    }
                    F0.add(new C2964ra(57, R.id.chat).m32863N(c3Var.m27043i()).m32870G(c3Var));
                }
                F0.add(new C2964ra(3));
                this.f10230w0.m39308M(size, F0.size() - size);
            }
            this.f8298o0.m39504A0();
        }
    }

    public final void m31934Uf(int i) {
        int i2 = this.f10227E0;
        if (i2 != i) {
            this.f10227E0 = i;
            if (i2 != 0 && i != 0) {
                this.f10230w0.m34138q1(1, i == 2 ? this.f10233z0 : this.f10223A0);
            } else if (i2 == 0) {
                this.f10230w0.m34129t0(1, i == 2 ? this.f10233z0 : this.f10223A0);
            } else {
                this.f10230w0.m34147n1(1);
            }
        } else if (i == 2) {
            this.f10230w0.m34156k3(this.f10233z0.m32835j());
        }
    }

    public final void m31933Vf(String str) {
        m31932Wf(str, true);
    }

    public final void m31932Wf(final String str, boolean z) {
        if (m34633Ue()) {
            return;
        }
        if (!C7316a.m17054g(this.f10229v0) || !z) {
            m34624if(true);
            final Client.AbstractC7865g r8Var = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3043s8.this.m31939Pf(object);
                }
            };
            long j = this.f10229v0;
            if (j == 0) {
                this.f30167b.m2270r4().m14783o(new TdApi.SetUsername(str), r8Var);
            } else if (C7316a.m17054g(j)) {
                this.f30167b.m2776Ke(this.f10229v0, new C10930q6.AbstractC10948r() {
                    @Override
                    public final void mo1525a(long j2, long j3, TdApi.Error error) {
                        View$OnClickListenerC3043s8.this.m31938Qf(str, r8Var, j2, j3, error);
                    }
                });
            } else {
                this.f30167b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(this.f10229v0), str), r8Var);
            }
        } else if (C5070i.m24061i(str)) {
            m34629cf();
        } else {
            m9322Vd(C4403w.m27982H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27869i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31937Rf(str);
                }
            });
        }
    }

    @Override
    public CharSequence mo9313X9() {
        long j = this.f10229v0;
        return C4403w.m27869i1(j != 0 ? this.f30167b.m2784K6(j) ? R.string.ChannelLink : R.string.GroupLink : R.string.Username);
    }

    public final void m31931Xf(String str) {
        this.f10233z0.m32853X(str);
        this.f10233z0.m32843d0(R.id.theme_color_textNegative);
        this.f10230w0.m34178e3(R.id.input, false, true);
        m31934Uf(2);
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        long j = this.f10229v0;
        String str = "";
        if (j != 0) {
            String f4 = this.f30167b.m2462f4(j);
            if (f4 != null) {
                str = f4;
            }
            this.f10232y0 = str;
            this.f10231x0 = str;
        } else {
            TdApi.User Z9 = this.f30167b.m2550Z9();
            if (Z9 != null) {
                str = Z9.username;
            }
            this.f10232y0 = str;
            this.f10231x0 = str;
        }
        this.f10223A0 = new C2964ra(9, 0, 0, this.f10229v0 != 0 ? R.string.LinkChecking : R.string.UsernameChecking).m32843d0(R.id.theme_color_textLight);
        this.f10233z0 = new C2964ra(9, R.id.state, 0, 0);
        C3044a aVar = new C3044a(this);
        this.f10230w0 = aVar;
        aVar.m34211S2(this);
        this.f10230w0.m34250A2(this, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(31, (int) R.id.input, 0, (CharSequence) (this.f10229v0 != 0 ? this.f30167b.m2746Mc() : C4403w.m27869i1(R.string.Username)), false).m32847b0(this.f10232y0).m32865L(new InputFilter[]{new InputFilter.LengthFilter(32), new C4779t2.C4789h()}).m32861P(new AbstractC2420g6.C2421a(6, this)));
        C2964ra d0 = new C2964ra(9, (int) R.id.description, 0, m31951Df(), false).m32843d0(R.id.theme_color_textLight);
        this.f10224B0 = d0;
        arrayList.add(d0);
        if (this.f10229v0 != 0) {
            arrayList.add(new C2964ra(3, R.id.shadowBottom));
            recyclerView.m39434g(new C6897h1(recyclerView, this).m18532l(R.id.shadowBottom, arrayList.size()));
        }
        this.f10230w0.m34116x2(arrayList, false);
        recyclerView.setAdapter(this.f10230w0);
        recyclerView.setOverScrollMode(2);
        mo31397hf(true);
    }

    @Override
    public boolean mo30696af() {
        if (this.f10232y0.isEmpty()) {
            m31933Vf("");
            return true;
        } else if (this.f10232y0.length() < 5) {
            m31931Xf(C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInvalidShort : R.string.UsernameInvalidShort));
            return true;
        } else if (this.f10232y0.length() > 32) {
            m31931Xf(C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInvalidLong : R.string.UsernameInvalidLong));
            return true;
        } else if (C5070i.m24058l(this.f10232y0.charAt(0))) {
            m31931Xf(C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInvalidStartNumber : R.string.UsernameInvalidStartNumber));
            return true;
        } else if (!C4779t2.m25407v4(this.f10232y0)) {
            m31931Xf(C4403w.m27869i1(this.f10229v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid));
            return true;
        } else {
            m31933Vf(this.f10232y0);
            return true;
        }
    }

    @Override
    public void mo30695bf(boolean z) {
        this.f10230w0.m34167h3(R.id.input, z ? this.f10232y0 : null);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar;
        final C4601c3 c3Var;
        if (view.getId() == R.id.chat && (raVar = (C2964ra) view.getTag()) != null && (c3Var = (C4601c3) raVar.m32844d()) != null) {
            final String str = this.f30167b.m2746Mc() + this.f30167b.m2462f4(c3Var.m27047e());
            m9261ee(str, new int[]{R.id.btn_delete, R.id.btn_openChat}, new String[]{C4403w.m27869i1(R.string.ChatLinkRemove), C4403w.m27869i1(R.string.ChatLinkView)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_visibility_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Nf;
                    Nf = View$OnClickListenerC3043s8.this.m31941Nf(c3Var, str, view2, i);
                    return Nf;
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
        }
    }

    public final void m31915zf() {
        AbstractRunnableC5910b bVar = this.f10225C0;
        if (bVar != null) {
            bVar.m21857c();
            this.f10225C0 = null;
        }
        m31935Tf(null);
    }
}
