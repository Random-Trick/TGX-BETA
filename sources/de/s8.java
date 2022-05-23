package de;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.c0;
import ce.j0;
import ce.x;
import de.g6;
import de.iq;
import gd.w;
import hd.c3;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.h1;
import ne.o;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.hj;
import zd.o6;

public class s8 extends g6<c> implements iq.e, View.OnClickListener {
    public ra A0;
    public ra B0;
    public kb.b C0;
    public List<c3> D0;
    public int E0;
    public CharSequence F0;
    public long f9469v0;
    public iq f9470w0;
    public String f9471x0;
    public String f9472y0;
    public ra f9473z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setChat((c3) raVar.d());
        }
    }

    public class b extends kb.b {
        public b() {
        }

        @Override
        public void b() {
            s8 s8Var = s8.this;
            s8Var.Bf(s8Var.C0);
        }
    }

    public static class c {
        public long f9475a;

        public c(long j10) {
            this.f9475a = j10;
        }
    }

    public s8(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ff(kb.b bVar, List list) {
        if (!Sa() && this.C0 == bVar && bVar.d()) {
            Tf(list);
        }
    }

    public void Gf(final kb.b bVar, TdApi.Object object) {
        if (object.getConstructor() == 1809654812) {
            List<TdApi.Chat> m42 = this.f24495b.m4(((TdApi.Chats) object).chatIds);
            if (!m42.isEmpty()) {
                final ArrayList arrayList = new ArrayList(m42.size());
                for (TdApi.Chat chat : m42) {
                    c3 c3Var = new c3(this.f24495b, null, chat, true, null);
                    c3Var.D();
                    c3Var.G();
                    arrayList.add(c3Var);
                }
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        s8.this.Ff(bVar, arrayList);
                    }
                });
            }
        }
    }

    public void Hf(String str, TdApi.Object object, final kb.b bVar) {
        CharSequence charSequence;
        if (!Sa() && this.f9472y0.equals(str)) {
            boolean z10 = false;
            boolean z11 = true;
            switch (object.getConstructor()) {
                case TdApi.Error.CONSTRUCTOR:
                    charSequence = t2.z5(object);
                    z11 = false;
                    break;
                case TdApi.CheckChatUsernameResultOk.CONSTRUCTOR:
                    charSequence = Ef(true);
                    z10 = true;
                    z11 = false;
                    break;
                case TdApi.CheckChatUsernameResultUsernameInvalid.CONSTRUCTOR:
                    charSequence = w.i1(this.f9469v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid);
                    z11 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicGroupsUnavailable.CONSTRUCTOR:
                    charSequence = w.i1(R.string.PublicGroupsUnavailable);
                    z11 = false;
                    break;
                case TdApi.CheckChatUsernameResultPublicChatsTooMuch.CONSTRUCTOR:
                    charSequence = w.i1(R.string.TooManyPublicLinks);
                    break;
                case TdApi.CheckChatUsernameResultUsernameOccupied.CONSTRUCTOR:
                    charSequence = Ef(false);
                    z11 = false;
                    break;
                default:
                    throw new RuntimeException();
            }
            this.f9473z0.X(charSequence);
            this.f9473z0.d0(z10 ? R.id.theme_color_textSecure : R.id.theme_color_textNegative);
            Uf(2);
            this.f9470w0.b3(R.id.input, z10, !z10);
            if (z11 && this.f9469v0 != 0) {
                this.f24495b.v4().o(new TdApi.GetCreatedPublicChats(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        s8.this.Gf(bVar, object2);
                    }
                });
            }
        }
    }

    public void If(final String str, final kb.b bVar, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                s8.this.Hf(str, object, bVar);
            }
        });
    }

    public void Jf() {
        if (!Sa()) {
            m2if(false);
            Cf(this.f9472y0);
            x.f(U9());
        }
    }

    public void Kf() {
        if (!Sa()) {
            m2if(false);
        }
    }

    public void Lf(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    s8.this.Kf();
                }
            });
        } else if (constructor == -722616727) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    s8.this.Jf();
                }
            });
        }
    }

    public boolean Mf(c3 c3Var, View view, int i10) {
        if (i10 == R.id.btn_delete && !Ue()) {
            m2if(true);
            this.f24495b.v4().o(new TdApi.SetSupergroupUsername(ob.a.p(c3Var.e()), null), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    s8.this.Lf(object);
                }
            });
        }
        return true;
    }

    public boolean Nf(final c3 c3Var, String str, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            ee(w.m1(R.string.ChatLinkRemoveAlert, this.f24495b.U3(c3Var.e()), str), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.ChatLinkRemove), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view2, int i11) {
                    boolean Mf;
                    Mf = s8.this.Mf(c3Var, view2, i11);
                    return Mf;
                }
            });
        } else if (i10 == R.id.btn_openChat) {
            this.f24495b.hd().h7(this, c3Var.e(), new hj.j().h());
        }
        return true;
    }

    public void Of(boolean z10, TdApi.Object object) {
        m2if(false);
        if (Sa()) {
            return;
        }
        if (z10) {
            cf();
        } else {
            Xf(t2.z5(object));
        }
    }

    public void Pf(final TdApi.Object object) {
        final boolean z10 = object.getConstructor() == -722616727 || (object.getConstructor() == -1679978726 && "USERNAME_NOT_MODIFIED".equals(((TdApi.Error) object).message));
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                s8.this.Of(z10, object);
            }
        });
    }

    public void Qf(String str, Client.g gVar, long j10, long j11, TdApi.Error error) {
        if (j11 != 0) {
            Sf(new c(j11));
            this.f24495b.v4().o(new TdApi.SetSupergroupUsername(ob.a.p(this.f9469v0), str), gVar);
            return;
        }
        if (error == null) {
            error = new TdApi.Error(-1, "Failed to upgrade to supergroup");
        }
        gVar.r2(error);
    }

    public void Rf(String str) {
        Wf(str, false);
    }

    public final void Af() {
        b bVar = new b();
        this.C0 = bVar;
        bVar.e(j0.o());
        j0.e0(this.C0, 350L);
    }

    public final void Bf(final kb.b bVar) {
        final String str = this.f9472y0;
        Client v42 = this.f24495b.v4();
        long j10 = 0;
        if (!ob.a.g(this.f9469v0)) {
            long j11 = this.f9469v0;
            j10 = j11 != 0 ? j11 : this.f24495b.qb();
        }
        v42.o(new TdApi.CheckChatUsername(j10, str), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                s8.this.If(str, bVar, object);
            }
        });
    }

    public final void Cf(String str) {
        this.f9472y0 = str;
        zf();
        if (this.B0.Z(Df())) {
            this.f9470w0.h3(R.id.description);
        }
        int i10 = 0;
        if (!this.f9471x0.equals(str) || str.isEmpty()) {
            this.f9470w0.b3(R.id.input, false, false);
            if (str.length() >= 5 && t2.v4(str) && str.length() <= 32) {
                i10 = 1;
            }
            Uf(i10);
        } else {
            this.f9473z0.d0(R.id.theme_color_textSecure);
            this.f9473z0.X(Ef(true));
            this.f9470w0.b3(R.id.input, true, false);
            Uf(2);
        }
        if (this.E0 == 1) {
            Af();
        }
    }

    public final CharSequence Df() {
        if (this.F0 == null) {
            long j10 = this.f9469v0;
            this.F0 = c0.Z(w.i1(j10 != 0 ? this.f24495b.O6(j10) ? R.string.LinkChannelHelp : R.string.LinkGroupHelp : R.string.UsernameHelp), R.id.theme_color_textLight);
        }
        if (this.f9472y0.length() < 5 || this.f9472y0.length() > 32 || this.f9469v0 != 0) {
            return this.F0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0);
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) w.i1(this.f9472y0.equals(this.f9471x0) ? R.string.ThisLinkOpens : R.string.ThisLinkWillOpen));
        spannableStringBuilder.append((CharSequence) " ");
        String Xc = this.f24495b.Xc(this.f9472y0);
        spannableStringBuilder.append((CharSequence) Xc);
        spannableStringBuilder.setSpan(new ie.o(ce.o.k(), R.id.theme_color_textLink), spannableStringBuilder.length() - Xc.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final CharSequence Ef(boolean z10) {
        int i10;
        if (z10) {
            if (this.f9471x0.equals(this.f9472y0)) {
                i10 = this.f9469v0 != 0 ? R.string.LinkCurrent : R.string.UsernameCurrent;
            } else {
                i10 = R.string.UsernameAvailable;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w.j1(i10, this.f9472y0));
            spannableStringBuilder.setSpan(new ie.o(ce.o.i(), R.id.theme_color_textSecure), 0, this.f9472y0.length(), 33);
            return spannableStringBuilder;
        }
        return w.i1(this.f9469v0 != 0 ? R.string.LinkInUse : R.string.UsernameInUse);
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        if (!this.f9472y0.equals(str)) {
            Cf(str);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_editUsername;
    }

    @Override
    public int Re() {
        return this.f9469v0 != 0 ? R.id.theme_color_background : super.Re();
    }

    public void Sf(c cVar) {
        super.Ad(cVar);
        this.f9469v0 = cVar.f9475a;
    }

    public final void Tf(List<c3> list) {
        int L0;
        List<c3> list2 = this.D0;
        if (!(list2 == null && list == null)) {
            boolean z10 = true;
            if (!(list2 == null || (L0 = this.f9470w0.L0(R.id.occupiedChats)) == -1)) {
                this.f9470w0.R1(L0, (this.D0.size() * 2) + 1);
            }
            this.D0 = list;
            if (list != null) {
                List<ra> D0 = this.f9470w0.D0();
                int size = D0.size();
                for (c3 c3Var : list) {
                    if (z10) {
                        D0.add(new ra(2, R.id.occupiedChats));
                        z10 = false;
                    } else {
                        D0.add(new ra(11));
                    }
                    D0.add(new ra(57, R.id.chat).N(c3Var.i()).G(c3Var));
                }
                D0.add(new ra(3));
                this.f9470w0.M(size, D0.size() - size);
            }
            this.f8035o0.A0();
        }
    }

    public final void Uf(int i10) {
        int i11 = this.E0;
        if (i11 != i10) {
            this.E0 = i10;
            if (i11 != 0 && i10 != 0) {
                this.f9470w0.m1(1, i10 == 2 ? this.f9473z0 : this.A0);
            } else if (i11 == 0) {
                this.f9470w0.s0(1, i10 == 2 ? this.f9473z0 : this.A0);
            } else {
                this.f9470w0.j1(1);
            }
        } else if (i10 == 2) {
            this.f9470w0.h3(this.f9473z0.j());
        }
    }

    public final void Vf(String str) {
        Wf(str, true);
    }

    public final void Wf(final String str, boolean z10) {
        if (Ue()) {
            return;
        }
        if (!ob.a.g(this.f9469v0) || !z10) {
            m2if(true);
            final Client.g r8Var = new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    s8.this.Pf(object);
                }
            };
            long j10 = this.f9469v0;
            if (j10 == 0) {
                this.f24495b.v4().o(new TdApi.SetUsername(str), r8Var);
            } else if (ob.a.g(j10)) {
                this.f24495b.Qe(this.f9469v0, new o6.r() {
                    @Override
                    public final void a(long j11, long j12, TdApi.Error error) {
                        s8.this.Qf(str, r8Var, j11, j12, error);
                    }
                });
            } else {
                this.f24495b.v4().o(new TdApi.SetSupergroupUsername(ob.a.p(this.f9469v0), str), r8Var);
            }
        } else if (i.i(str)) {
            cf();
        } else {
            Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    s8.this.Rf(str);
                }
            });
        }
    }

    @Override
    public CharSequence X9() {
        long j10 = this.f9469v0;
        return w.i1(j10 != 0 ? this.f24495b.O6(j10) ? R.string.ChannelLink : R.string.GroupLink : R.string.Username);
    }

    public final void Xf(String str) {
        this.f9473z0.X(str);
        this.f9473z0.d0(R.id.theme_color_textNegative);
        this.f9470w0.b3(R.id.input, false, true);
        Uf(2);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        long j10 = this.f9469v0;
        String str = "";
        if (j10 != 0) {
            String j42 = this.f24495b.j4(j10);
            if (j42 != null) {
                str = j42;
            }
            this.f9472y0 = str;
            this.f9471x0 = str;
        } else {
            TdApi.User da2 = this.f24495b.da();
            if (da2 != null) {
                str = da2.username;
            }
            this.f9472y0 = str;
            this.f9471x0 = str;
        }
        this.A0 = new ra(9, 0, 0, this.f9469v0 != 0 ? R.string.LinkChecking : R.string.UsernameChecking).d0(R.id.theme_color_textLight);
        this.f9473z0 = new ra(9, R.id.state, 0, 0);
        a aVar = new a(this);
        this.f9470w0 = aVar;
        aVar.O2(this);
        this.f9470w0.v2(this, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(31, (int) R.id.input, 0, (CharSequence) (this.f9469v0 != 0 ? this.f24495b.Qc() : w.i1(R.string.Username)), false).b0(this.f9472y0).L(new InputFilter[]{new InputFilter.LengthFilter(32), new t2.h()}).P(new g6.a(6, this)));
        ra d02 = new ra(9, (int) R.id.description, 0, Df(), false).d0(R.id.theme_color_textLight);
        this.B0 = d02;
        arrayList.add(d02);
        if (this.f9469v0 != 0) {
            arrayList.add(new ra(3, R.id.shadowBottom));
            recyclerView.g(new h1(recyclerView, this).l(R.id.shadowBottom, arrayList.size()));
        }
        this.f9470w0.s2(arrayList, false);
        recyclerView.setAdapter(this.f9470w0);
        recyclerView.setOverScrollMode(2);
        hf(true);
    }

    @Override
    public boolean af() {
        if (this.f9472y0.isEmpty()) {
            Vf("");
            return true;
        } else if (this.f9472y0.length() < 5) {
            Xf(w.i1(this.f9469v0 != 0 ? R.string.LinkInvalidShort : R.string.UsernameInvalidShort));
            return true;
        } else if (this.f9472y0.length() > 32) {
            Xf(w.i1(this.f9469v0 != 0 ? R.string.LinkInvalidLong : R.string.UsernameInvalidLong));
            return true;
        } else if (i.l(this.f9472y0.charAt(0))) {
            Xf(w.i1(this.f9469v0 != 0 ? R.string.LinkInvalidStartNumber : R.string.UsernameInvalidStartNumber));
            return true;
        } else if (!t2.v4(this.f9472y0)) {
            Xf(w.i1(this.f9469v0 != 0 ? R.string.LinkInvalid : R.string.UsernameInvalid));
            return true;
        } else {
            Vf(this.f9472y0);
            return true;
        }
    }

    @Override
    public void bf(boolean z10) {
        this.f9470w0.e3(R.id.input, z10 ? this.f9472y0 : null);
    }

    @Override
    public void onClick(View view) {
        ra raVar;
        final c3 c3Var;
        if (view.getId() == R.id.chat && (raVar = (ra) view.getTag()) != null && (c3Var = (c3) raVar.d()) != null) {
            final String str = this.f24495b.Qc() + this.f24495b.j4(c3Var.e());
            ee(str, new int[]{R.id.btn_delete, R.id.btn_openChat}, new String[]{w.i1(R.string.ChatLinkRemove), w.i1(R.string.ChatLinkView)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_visibility_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean Nf;
                    Nf = s8.this.Nf(c3Var, str, view2, i10);
                    return Nf;
                }
            });
        }
    }

    public final void zf() {
        kb.b bVar = this.C0;
        if (bVar != null) {
            bVar.c();
            this.C0 = null;
        }
        Tf(null);
    }
}
