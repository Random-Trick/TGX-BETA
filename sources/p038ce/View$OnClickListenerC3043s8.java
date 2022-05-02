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
            oVar.setChat((C4601c3) raVar.m32847d());
        }
    }

    public class C3045b extends AbstractRunnableC5910b {
        public C3045b() {
        }

        @Override
        public void mo1364b() {
            View$OnClickListenerC3043s8 s8Var = View$OnClickListenerC3043s8.this;
            s8Var.m31956Bf(s8Var.f10225C0);
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

    public void m31952Ff(AbstractRunnableC5910b bVar, List list) {
        if (!m9347Sa() && this.f10225C0 == bVar && bVar.m21857d()) {
            m31938Tf(list);
        }
    }

    public void m31951Gf(final AbstractRunnableC5910b bVar, TdApi.Object object) {
        if (object.getConstructor() == 1809654812) {
            List<TdApi.Chat> i4 = this.f30170b.m2414i4(((TdApi.Chats) object).chatIds);
            if (!i4.isEmpty()) {
                final ArrayList arrayList = new ArrayList(i4.size());
                for (TdApi.Chat chat : i4) {
                    C4601c3 c3Var = new C4601c3(this.f30170b, null, chat, true, null);
                    c3Var.m27063D();
                    c3Var.m27060G();
                    arrayList.add(c3Var);
                }
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3043s8.this.m31952Ff(bVar, arrayList);
                    }
                });
            }
        }
    }

    public void m31950Hf(String str, TdApi.Object object, final AbstractRunnableC5910b bVar) {
        CharSequence charSequence;
        if (!m9347Sa() && this.f10232y0.equals(str)) {
            boolean z = false;
            boolean z2 = true;
            switch (object.getConstructor()) {
                case TdApi.Error.CONSTRUCTOR:
                    charSequence = C4779t2.m25379z5(object);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultOk.CONSTRUCTOR:
                    charSequence = m31953Ef(true);
                    z = true;
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultUsernameInvalid.CONSTRUCTOR:
                    charSequence = C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicGroupsUnavailable.CONSTRUCTOR:
                    charSequence = C4403w.m27871i1(R.string.PublicGroupsUnavailable);
                    z2 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicChatsTooMuch.CONSTRUCTOR:
                    charSequence = C4403w.m27871i1(R.string.TooManyPublicLinks);
                    break;
                case TdApi.CheckChatUsernameResultUsernameOccupied.CONSTRUCTOR:
                    charSequence = m31953Ef(false);
                    z2 = false;
                    break;
                default:
                    throw new RuntimeException();
            }
            this.f10233z0.m32856X(charSequence);
            this.f10233z0.m32846d0(z ? R.id.theme_color_textSecure : R.id.theme_color_textNegative);
            m31937Uf(2);
            this.f10230w0.m34181e3(R.id.input, z, !z);
            if (z2 && this.f10229v0 != 0) {
                this.f30170b.m2270r4().m14783o(new TdApi.GetCreatedPublicChats(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        View$OnClickListenerC3043s8.this.m31951Gf(bVar, object2);
                    }
                });
            }
        }
    }

    public void m31949If(final String str, final AbstractRunnableC5910b bVar, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3043s8.this.m31950Hf(str, object, bVar);
            }
        });
    }

    public void m31948Jf() {
        if (!m9347Sa()) {
            m34627if(false);
            m31955Cf(this.f10232y0);
            C1408x.m37088f(m9333U9());
        }
    }

    public void m31947Kf() {
        if (!m9347Sa()) {
            m34627if(false);
        }
    }

    public void m31946Lf(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31947Kf();
                }
            });
        } else if (constructor == -722616727) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31948Jf();
                }
            });
        }
    }

    public boolean m31945Mf(C4601c3 c3Var, View view, int i) {
        if (i == R.id.btn_delete && !m34636Ue()) {
            m34627if(true);
            this.f30170b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(c3Var.m27049e()), null), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3043s8.this.m31946Lf(object);
                }
            });
        }
        return true;
    }

    public boolean m31944Nf(final C4601c3 c3Var, String str, View view, int i) {
        if (i == R.id.btn_delete) {
            m9261ee(C4403w.m27855m1(R.string.ChatLinkRemoveAlert, this.f30170b.m2691Q3(c3Var.m27049e()), str), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.ChatLinkRemove), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i2) {
                    boolean Mf;
                    Mf = View$OnClickListenerC3043s8.this.m31945Mf(c3Var, view2, i2);
                    return Mf;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23935b(this, i2);
                }
            });
        } else if (i == R.id.btn_openChat) {
            this.f30170b.m2485dd().m3569h7(this, c3Var.m27049e(), new HandlerC10770jj.C10780j().m3368h());
        }
        return true;
    }

    public void m31943Of(boolean z, TdApi.Object object) {
        m34627if(false);
        if (m9347Sa()) {
            return;
        }
        if (z) {
            m34632cf();
        } else {
            m31934Xf(C4779t2.m25379z5(object));
        }
    }

    public void m31942Pf(final TdApi.Object object) {
        final boolean z = object.getConstructor() == -722616727 || (object.getConstructor() == -1679978726 && "USERNAME_NOT_MODIFIED".equals(((TdApi.Error) object).message));
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3043s8.this.m31943Of(z, object);
            }
        });
    }

    public void m31941Qf(String str, Client.AbstractC7865g gVar, long j, long j2, TdApi.Error error) {
        if (j2 != 0) {
            m31939Sf(new C3046c(j2));
            this.f30170b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(this.f10229v0), str), gVar);
            return;
        }
        if (error == null) {
            error = new TdApi.Error(-1, "Failed to upgrade to supergroup");
        }
        gVar.mo255t2(error);
    }

    public void m31940Rf(String str) {
        m31935Wf(str, false);
    }

    public final void m31957Af() {
        C3045b bVar = new C3045b();
        this.f10225C0 = bVar;
        bVar.m21856e(C1379j0.m37316o());
        C1379j0.m37335e0(this.f10225C0, 350L);
    }

    public final void m31956Bf(final AbstractRunnableC5910b bVar) {
        final String str = this.f10232y0;
        Client r4 = this.f30170b.m2270r4();
        long j = 0;
        if (!C7316a.m17054g(this.f10229v0)) {
            long j2 = this.f10229v0;
            j = j2 != 0 ? j2 : this.f30170b.m2343mb();
        }
        r4.m14783o(new TdApi.CheckChatUsername(j, str), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3043s8.this.m31949If(str, bVar, object);
            }
        });
    }

    public final void m31955Cf(String str) {
        this.f10232y0 = str;
        m31918zf();
        if (this.f10224B0.m32854Z(m31954Df())) {
            this.f10230w0.m34159k3(R.id.description);
        }
        int i = 0;
        if (!this.f10231x0.equals(str) || str.isEmpty()) {
            this.f10230w0.m34181e3(R.id.input, false, false);
            if (str.length() >= 5 && C4779t2.m25408v4(str) && str.length() <= 32) {
                i = 1;
            }
            m31937Uf(i);
        } else {
            this.f10233z0.m32846d0(R.id.theme_color_textSecure);
            this.f10233z0.m32856X(m31953Ef(true));
            this.f10230w0.m34181e3(R.id.input, true, false);
            m31937Uf(2);
        }
        if (this.f10227E0 == 1) {
            m31957Af();
        }
    }

    public final CharSequence m31954Df() {
        if (this.f10228F0 == null) {
            long j = this.f10229v0;
            this.f10228F0 = C1363c0.m37451Z(C4403w.m27871i1(j != 0 ? this.f30170b.m2784K6(j) ? R.string.LinkChannelHelp : R.string.LinkGroupHelp : R.string.UsernameHelp), R.id.theme_color_textLight);
        }
        if (this.f10232y0.length() < 5 || this.f10232y0.length() > 32 || this.f10229v0 != 0) {
            return this.f10228F0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10228F0);
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) C4403w.m27871i1(this.f10232y0.equals(this.f10231x0) ? R.string.ThisLinkOpens : R.string.ThisLinkWillOpen));
        spannableStringBuilder.append((CharSequence) " ");
        String Tc = this.f30170b.m2637Tc(this.f10232y0);
        spannableStringBuilder.append((CharSequence) Tc);
        spannableStringBuilder.setSpan(new C5132o(C1389o.m37261k(), R.id.theme_color_textLink), spannableStringBuilder.length() - Tc.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence m31953Ef(boolean z) {
        int i;
        if (z) {
            if (this.f10231x0.equals(this.f10232y0)) {
                i = this.f10229v0 != 0 ? R.string.LinkCurrent : R.string.UsernameCurrent;
            } else {
                i = R.string.UsernameAvailable;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4403w.m27867j1(i, this.f10232y0));
            spannableStringBuilder.setSpan(new C5132o(C1389o.m37263i(), R.id.theme_color_textSecure), 0, this.f10232y0.length(), 33);
            return spannableStringBuilder;
        }
        return C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInUse : R.string.UsernameInUse);
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (!this.f10232y0.equals(str)) {
            m31955Cf(str);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editUsername;
    }

    @Override
    public int mo31417Re() {
        return this.f10229v0 != 0 ? R.id.theme_color_background : super.mo31417Re();
    }

    public void m31939Sf(C3046c cVar) {
        super.m9476Ad(cVar);
        this.f10229v0 = cVar.f10236a;
    }

    public final void m31938Tf(List<C4601c3> list) {
        int N0;
        List<C4601c3> list2 = this.f10226D0;
        if (!(list2 == null && list == null)) {
            boolean z = true;
            if (!(list2 == null || (N0 = this.f10230w0.m34227N0(R.id.occupiedChats)) == -1)) {
                this.f10230w0.m34207V1(N0, (this.f10226D0.size() * 2) + 1);
            }
            this.f10226D0 = list;
            if (list != null) {
                List<C2964ra> F0 = this.f10230w0.m34243F0();
                int size = F0.size();
                for (C4601c3 c3Var : list) {
                    if (z) {
                        F0.add(new C2964ra(2, R.id.occupiedChats));
                        z = false;
                    } else {
                        F0.add(new C2964ra(11));
                    }
                    F0.add(new C2964ra(57, R.id.chat).m32866N(c3Var.m27045i()).m32873G(c3Var));
                }
                F0.add(new C2964ra(3));
                this.f10230w0.m39311M(size, F0.size() - size);
            }
            this.f8298o0.m39507A0();
        }
    }

    public final void m31937Uf(int i) {
        int i2 = this.f10227E0;
        if (i2 != i) {
            this.f10227E0 = i;
            if (i2 != 0 && i != 0) {
                this.f10230w0.m34141q1(1, i == 2 ? this.f10233z0 : this.f10223A0);
            } else if (i2 == 0) {
                this.f10230w0.m34132t0(1, i == 2 ? this.f10233z0 : this.f10223A0);
            } else {
                this.f10230w0.m34150n1(1);
            }
        } else if (i == 2) {
            this.f10230w0.m34159k3(this.f10233z0.m32838j());
        }
    }

    public final void m31936Vf(String str) {
        m31935Wf(str, true);
    }

    public final void m31935Wf(final String str, boolean z) {
        if (m34636Ue()) {
            return;
        }
        if (!C7316a.m17054g(this.f10229v0) || !z) {
            m34627if(true);
            final Client.AbstractC7865g r8Var = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3043s8.this.m31942Pf(object);
                }
            };
            long j = this.f10229v0;
            if (j == 0) {
                this.f30170b.m2270r4().m14783o(new TdApi.SetUsername(str), r8Var);
            } else if (C7316a.m17054g(j)) {
                this.f30170b.m2776Ke(this.f10229v0, new C10930q6.AbstractC10948r() {
                    @Override
                    public final void mo1525a(long j2, long j3, TdApi.Error error) {
                        View$OnClickListenerC3043s8.this.m31941Qf(str, r8Var, j2, j3, error);
                    }
                });
            } else {
                this.f30170b.m2270r4().m14783o(new TdApi.SetSupergroupUsername(C7316a.m17045p(this.f10229v0), str), r8Var);
            }
        } else if (C5070i.m24062i(str)) {
            m34632cf();
        } else {
            m9322Vd(C4403w.m27984H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27871i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3043s8.this.m31940Rf(str);
                }
            });
        }
    }

    @Override
    public CharSequence mo9313X9() {
        long j = this.f10229v0;
        return C4403w.m27871i1(j != 0 ? this.f30170b.m2784K6(j) ? R.string.ChannelLink : R.string.GroupLink : R.string.Username);
    }

    public final void m31934Xf(String str) {
        this.f10233z0.m32856X(str);
        this.f10233z0.m32846d0(R.id.theme_color_textNegative);
        this.f10230w0.m34181e3(R.id.input, false, true);
        m31937Uf(2);
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        long j = this.f10229v0;
        String str = "";
        if (j != 0) {
            String f4 = this.f30170b.m2462f4(j);
            if (f4 != null) {
                str = f4;
            }
            this.f10232y0 = str;
            this.f10231x0 = str;
        } else {
            TdApi.User Z9 = this.f30170b.m2550Z9();
            if (Z9 != null) {
                str = Z9.username;
            }
            this.f10232y0 = str;
            this.f10231x0 = str;
        }
        this.f10223A0 = new C2964ra(9, 0, 0, this.f10229v0 != 0 ? R.string.LinkChecking : R.string.UsernameChecking).m32846d0(R.id.theme_color_textLight);
        this.f10233z0 = new C2964ra(9, R.id.state, 0, 0);
        C3044a aVar = new C3044a(this);
        this.f10230w0 = aVar;
        aVar.m34214S2(this);
        this.f10230w0.m34253A2(this, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(31, (int) R.id.input, 0, (CharSequence) (this.f10229v0 != 0 ? this.f30170b.m2746Mc() : C4403w.m27871i1(R.string.Username)), false).m32850b0(this.f10232y0).m32868L(new InputFilter[]{new InputFilter.LengthFilter(32), new C4779t2.C4789h()}).m32864P(new AbstractC2420g6.C2421a(6, this)));
        C2964ra d0 = new C2964ra(9, (int) R.id.description, 0, m31954Df(), false).m32846d0(R.id.theme_color_textLight);
        this.f10224B0 = d0;
        arrayList.add(d0);
        if (this.f10229v0 != 0) {
            arrayList.add(new C2964ra(3, R.id.shadowBottom));
            recyclerView.m39437g(new C6897h1(recyclerView, this).m18532l(R.id.shadowBottom, arrayList.size()));
        }
        this.f10230w0.m34119x2(arrayList, false);
        recyclerView.setAdapter(this.f10230w0);
        recyclerView.setOverScrollMode(2);
        mo31399hf(true);
    }

    @Override
    public boolean mo30698af() {
        if (this.f10232y0.isEmpty()) {
            m31936Vf("");
            return true;
        } else if (this.f10232y0.length() < 5) {
            m31934Xf(C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInvalidShort : R.string.UsernameInvalidShort));
            return true;
        } else if (this.f10232y0.length() > 32) {
            m31934Xf(C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInvalidLong : R.string.UsernameInvalidLong));
            return true;
        } else if (C5070i.m24059l(this.f10232y0.charAt(0))) {
            m31934Xf(C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInvalidStartNumber : R.string.UsernameInvalidStartNumber));
            return true;
        } else if (!C4779t2.m25408v4(this.f10232y0)) {
            m31934Xf(C4403w.m27871i1(this.f10229v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid));
            return true;
        } else {
            m31936Vf(this.f10232y0);
            return true;
        }
    }

    @Override
    public void mo30697bf(boolean z) {
        this.f10230w0.m34170h3(R.id.input, z ? this.f10232y0 : null);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar;
        final C4601c3 c3Var;
        if (view.getId() == R.id.chat && (raVar = (C2964ra) view.getTag()) != null && (c3Var = (C4601c3) raVar.m32847d()) != null) {
            final String str = this.f30170b.m2746Mc() + this.f30170b.m2462f4(c3Var.m27049e());
            m9261ee(str, new int[]{R.id.btn_delete, R.id.btn_openChat}, new String[]{C4403w.m27871i1(R.string.ChatLinkRemove), C4403w.m27871i1(R.string.ChatLinkView)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_visibility_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Nf;
                    Nf = View$OnClickListenerC3043s8.this.m31944Nf(c3Var, str, view2, i);
                    return Nf;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23935b(this, i);
                }
            });
        }
    }

    public final void m31918zf() {
        AbstractRunnableC5910b bVar = this.f10225C0;
        if (bVar != null) {
            bVar.m21858c();
            this.f10225C0 = null;
        }
        m31938Tf(null);
    }
}
