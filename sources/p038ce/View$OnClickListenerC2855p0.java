package p038ce;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1379j0;
import cd.C2104l;
import gd.C4649h;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6952l3;
import me.C6957m1;
import me.C7030t1;
import me.C7057w;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import p016b1.AbstractC1125a;
import p038ce.View$OnClickListenerC2855p0;
import p038ce.View$OnClickListenerC3038s6;
import p038ce.View$OnClickListenerC3141u7;
import p053dd.C4007j;
import p053dd.C4012k;
import p067ed.C4183a;
import p082fd.C4403w;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2855p0 extends AbstractC3204vo<C2860d> implements View.OnClickListener, C11052v1.AbstractC11053a {
    public C2546iq f9583D0;
    public boolean f9585F0;
    public boolean f9586G0;
    public long f9587H0;
    public long f9588I0;
    public AbstractC2656la f9589J0;
    public TdApi.ChatInviteLink f9590K0;
    public List<TdApi.ChatInviteLink> f9591L0;
    public List<TdApi.ChatInviteLink> f9592M0;
    public TdApi.ChatInviteLinkCount[] f9593N0;
    public int f9594O0;
    public int f9595P0;
    public boolean[] f9584E0 = {false, false};
    public List<TdApi.ChatInviteLink> f9596Q0 = new ArrayList();
    public Handler f9597R0 = new HandlerC2856a(Looper.getMainLooper());

    public class HandlerC2856a extends Handler {
        public HandlerC2856a(Looper looper) {
            super(looper);
            View$OnClickListenerC2855p0.this = r1;
        }

        @Override
        public void handleMessage(Message message) {
            View$OnClickListenerC2855p0.this.m33197Gh((TdApi.ChatInviteLink) message.obj, false);
        }
    }

    public class C2857b extends C2546iq {

        public class C2858a implements C6957m1.AbstractC6962e {
            public C2858a() {
                C2857b.this = r1;
            }

            @Override
            public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
                if (i == R.id.btn_editRights) {
                    View$OnClickListenerC2855p0.this.m33205Ch();
                } else if (i == R.id.btn_openChat) {
                    HandlerC10770jj dd = View$OnClickListenerC2855p0.this.f30170b.m2485dd();
                    View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
                    dd.m3569h7(p0Var, p0Var.f9588I0, new HandlerC10770jj.C10780j().m3368h());
                }
            }

            @Override
            public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            }
        }

        public C2857b(AbstractC9323v4 v4Var) {
            super(v4Var);
            View$OnClickListenerC2855p0.this = r1;
        }

        public boolean m33142A3(View view, int i) {
            if (i == R.id.btn_openChat) {
                HandlerC10770jj dd = View$OnClickListenerC2855p0.this.f30170b.m2485dd();
                View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
                dd.m3569h7(p0Var, p0Var.f9588I0, new HandlerC10770jj.C10780j().m3368h());
                return true;
            } else if (i != R.id.btn_editRights) {
                return true;
            } else {
                View$OnClickListenerC2855p0.this.m33205Ch();
                return true;
            }
        }

        public boolean m33141B3(View view) {
            View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
            p0Var.m9261ee(p0Var.f30170b.m2480e2().m1721K2(View$OnClickListenerC2855p0.this.f9588I0), new int[]{R.id.btn_openChat, R.id.btn_editRights}, new String[]{C4403w.m27871i1(R.string.OpenChat), C4403w.m27871i1(R.string.EditAdminRights)}, null, new int[]{R.drawable.baseline_forum_24, R.drawable.baseline_stars_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean A3;
                    A3 = View$OnClickListenerC2855p0.C2857b.this.m33142A3(view2, i);
                    return A3;
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
            return true;
        }

        public C6957m1.AbstractC6962e m33140C3(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
            cVar.m23285a(R.id.btn_openChat);
            cVar2.m23285a(R.drawable.baseline_forum_24);
            u0Var.m23817a(R.string.OpenChat);
            cVar.m23285a(R.id.btn_editRights);
            cVar2.m23285a(R.drawable.baseline_stars_24);
            u0Var.m23817a(R.string.EditAdminRights);
            fVar.m18336J(true);
            return new C2858a();
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.btn_deleteAllRevokedLinks) {
                cVar.setIconColorId(R.id.theme_color_textNegative);
            } else if (raVar.m32838j() == R.id.btn_inviteLink) {
                TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) raVar.m32847d();
                cVar.setData(View$OnClickListenerC2855p0.this.m33160ih(chatInviteLink));
                cVar.setTag(chatInviteLink);
                cVar.setIconColorId(R.id.theme_color_icon);
            } else {
                if (raVar.m32838j() == R.id.btn_showAdvanced) {
                    boolean z2 = true;
                    if (raVar.m32836l() != 1) {
                        z2 = false;
                    }
                    cVar.setTag(Boolean.valueOf(z2));
                }
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void mo426p2(C2964ra raVar, int i, EmbeddableStickerView embeddableStickerView, boolean z) {
            TdApi.Sticker sticker = (TdApi.Sticker) raVar.m32847d();
            embeddableStickerView.setSticker(new C2104l(View$OnClickListenerC2855p0.this.f30170b, sticker, "\u1f973", sticker.type));
            embeddableStickerView.setCaptionText(C4403w.m27871i1(View$OnClickListenerC2855p0.this.f9585F0 ? R.string.ChannelLinkInfo : R.string.LinkInfo));
        }

        @Override
        public void mo33139s1(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
            C4649h hVar = new C4649h(View$OnClickListenerC2855p0.this.f30170b, raVar.m32835m(), true);
            hVar.m26632w(C4403w.m27838q2(R.string.xLinks, raVar.m32836l()));
            hVar.m26636s(true);
            l3Var.setChat(hVar);
            l3Var.setTag(Long.valueOf(raVar.m32835m()));
            if (raVar.m32838j() == R.id.btn_openChat) {
                l3Var.m18494v0(new TdApi.ChatListMain(), View$OnClickListenerC2855p0.this.f9588I0, null);
                l3Var.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean B3;
                        B3 = View$OnClickListenerC2855p0.C2857b.this.m33141B3(view);
                        return B3;
                    }
                });
                l3Var.setPreviewActionListProvider(new View$OnClickListenerC6902i.AbstractC6905c() {
                    @Override
                    public final C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
                        C6957m1.AbstractC6962e C3;
                        C3 = View$OnClickListenerC2855p0.C2857b.this.m33140C3(view, fVar, cVar, cVar2, u0Var, v4Var);
                        return C3;
                    }
                });
                return;
            }
            l3Var.m18511K();
            l3Var.setOnLongClickListener(null);
            l3Var.setPreviewActionListProvider(null);
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (raVar.m32834n() > 0) {
                t1Var.m18058E1(C4403w.m27867j1(R.string.format_activeAndRevokedLinks, C4403w.m27838q2(R.string.xActiveLinks, raVar.m32836l()), C4403w.m27838q2(R.string.xRevokedLinks, raVar.m32834n())));
            } else {
                t1Var.m18058E1(C4403w.m27838q2(R.string.xActiveLinks, raVar.m32836l()));
            }
        }

        @Override
        public void mo33138u1(C2964ra raVar, TextView textView) {
            textView.setText(C5078d.m23987z().m24025I(raVar.m32827u()));
        }
    }

    public class C2859c implements C4007j.AbstractC4009b {
        public C2859c() {
            View$OnClickListenerC2855p0.this = r1;
        }

        public boolean m33130l(TdApi.ChatInviteLink chatInviteLink, View view, int i) {
            if (i != R.id.btn_deleteLink) {
                return true;
            }
            View$OnClickListenerC2855p0.this.f9592M0.remove(chatInviteLink);
            View$OnClickListenerC2855p0.this.m33185Mh(chatInviteLink);
            View$OnClickListenerC2855p0.this.m33145xh();
            View$OnClickListenerC2855p0.this.f30170b.m2270r4().m14783o(new TdApi.DeleteRevokedChatInviteLink(View$OnClickListenerC2855p0.this.f9587H0, chatInviteLink.inviteLink), null);
            return true;
        }

        public void m33129m(TdApi.ChatInviteLink chatInviteLink, TdApi.Object object) {
            View$OnClickListenerC2855p0.this.m33156mh(chatInviteLink, (TdApi.ChatInviteLinks) object);
        }

        public void m33128n(final TdApi.ChatInviteLink chatInviteLink, final TdApi.Object object) {
            if (object.getConstructor() == 112891427) {
                View$OnClickListenerC2855p0.this.m9135wd(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2855p0.C2859c.this.m33129m(chatInviteLink, object);
                    }
                });
            }
        }

        public boolean m33127o(final TdApi.ChatInviteLink chatInviteLink, View view, int i) {
            if (i != R.id.btn_revokeLink) {
                return true;
            }
            View$OnClickListenerC2855p0.this.f30170b.m2270r4().m14783o(new TdApi.RevokeChatInviteLink(View$OnClickListenerC2855p0.this.f9587H0, chatInviteLink.inviteLink), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2855p0.C2859c.this.m33128n(chatInviteLink, object);
                }
            });
            return true;
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) View$OnClickListenerC2855p0.this.f9583D0.m34243F0().get(d0Var.m39337l()).m32847d();
            if (chatInviteLink.isRevoked) {
                View$OnClickListenerC2855p0.this.m9261ee(C4403w.m27871i1(R.string.AreYouSureDeleteInviteLink), new int[]{R.id.btn_deleteLink, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.InviteLinkDelete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean l;
                        l = View$OnClickListenerC2855p0.C2859c.this.m33130l(chatInviteLink, view, i);
                        return l;
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
                return;
            }
            View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
            p0Var.m9261ee(C4403w.m27871i1(p0Var.f30170b.m2784K6(View$OnClickListenerC2855p0.this.f9587H0) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.RevokeLink), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean o;
                    o = View$OnClickListenerC2855p0.C2859c.this.m33127o(chatInviteLink, view, i);
                    return o;
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

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = View$OnClickListenerC2855p0.this.f9583D0.m34243F0().get(i);
            return raVar != null && raVar.m32838j() == R.id.btn_inviteLink;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29331a(this);
        }
    }

    public static class C2860d {
        public final long f9602a;
        public final long f9603b;
        public final boolean f9604c;
        public final AbstractC2656la f9605d;
        public final AbstractC9323v4<?> f9606e;

        public C2860d(long j, long j2, AbstractC2656la laVar, AbstractC9323v4<?> v4Var, boolean z) {
            this.f9602a = j;
            this.f9603b = j2;
            this.f9605d = laVar;
            this.f9606e = v4Var;
            this.f9604c = z;
        }
    }

    public View$OnClickListenerC2855p0(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33159jh(List list, TdApi.ChatInviteLinks chatInviteLinks, boolean z, int i) {
        list.addAll(Arrays.asList(chatInviteLinks.inviteLinks));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
            if (i2 >= chatInviteLinkArr.length) {
                break;
            }
            TdApi.ChatInviteLink chatInviteLink = chatInviteLinkArr[i2];
            arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(chatInviteLink), false).m32873G(chatInviteLink));
            if (i2 != chatInviteLinks.inviteLinks.length - 1) {
                arrayList.add(new C2964ra(11));
            }
            i2++;
        }
        if (list.size() < (z ? this.f9595P0 : this.f9594O0)) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27846o2(R.string.StatsXShowMore, Math.min(100, (z ? this.f9595P0 : this.f9594O0) - list.size())), false).m32867M(z ? 1 : 0));
        }
        this.f9583D0.m34150n1(i);
        this.f9583D0.m34191b1(i, (C2964ra[]) arrayList.toArray(new C2964ra[0]));
        this.f9584E0[z ? 1 : 0] = false;
    }

    public void m33158kh(final boolean z, final List list, final TdApi.ChatInviteLinks chatInviteLinks) {
        final int P0 = this.f9583D0.m34222P0(R.id.btn_showAdvanced, z ? 1 : 0);
        if (P0 != -1) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2855p0.this.m33159jh(list, chatInviteLinks, z, P0);
                }
            });
        }
    }

    public void m33157lh(TdApi.ChatInviteLink chatInviteLink) {
        this.f9592M0.remove(chatInviteLink);
        m33185Mh(chatInviteLink);
        m33145xh();
    }

    public boolean m33155nh(View view, int i) {
        if (i == R.id.btn_deleteAllRevokedLinks) {
            List<TdApi.ChatInviteLink> list = this.f9592M0;
            this.f9592M0.clear();
            m33183Nh(this.f9592M0.get(0), list.get(list.size() - 1));
            m33145xh();
            this.f30170b.m2270r4().m14783o(new TdApi.DeleteAllRevokedChatInviteLinks(this.f9587H0, this.f9588I0), null);
        }
        return true;
    }

    public void m33154oh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        if (chatInviteLink != null) {
            m33189Kh(chatInviteLink, chatInviteLink2);
            return;
        }
        m33191Jh(chatInviteLink2);
        m33145xh();
    }

    public void m33153ph(TdApi.Object object) {
        TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
        u7Var.m31378sg(new View$OnClickListenerC3141u7.C3145d(this.f9587H0, new TdApi.MessageSenderUser(this.f9588I0), false, this.f30170b.m2787K3(this.f9587H0), chatMember).m31352b());
        m9291ac(u7Var);
    }

    public void m33152qh(final TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2855p0.this.m33153ph(object);
                }
            });
        }
    }

    public static void m33151rh(AbstractC1125a aVar, TdApi.Object object) {
        if (object.getConstructor() == 920326637) {
            aVar.mo1208a((TdApi.ChatInviteLinkCounts) object);
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37305t0(object);
        }
    }

    public void m33150sh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.f9594O0 = chatInviteLinks.totalCount;
        this.f9591L0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        m33199Fh(true, false, "", new AbstractC1125a() {
            @Override
            public final void mo1208a(Object obj) {
                View$OnClickListenerC2855p0.this.m33148uh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public void m33149th(TdApi.ChatInviteLinkCounts chatInviteLinkCounts) {
        this.f9593N0 = chatInviteLinkCounts.inviteLinkCounts;
        m9135wd(new RunnableC2601k0(this));
    }

    public void m33148uh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.f9595P0 = chatInviteLinks.totalCount;
        this.f9592M0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        if (this.f9586G0) {
            m33203Dh(new AbstractC1125a() {
                @Override
                public final void mo1208a(Object obj) {
                    View$OnClickListenerC2855p0.this.m33149th((TdApi.ChatInviteLinkCounts) obj);
                }
            });
        } else {
            m9135wd(new RunnableC2601k0(this));
        }
    }

    public static void m33147vh(AbstractC1125a aVar, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            aVar.mo1208a((TdApi.ChatInviteLinks) object);
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37305t0(object);
        }
    }

    public final void m33156mh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLinks chatInviteLinks) {
        if (chatInviteLinks.inviteLinks.length > 0) {
            this.f9591L0.remove(chatInviteLink);
            this.f9592M0.add(0, chatInviteLinks.inviteLinks[0]);
            if (chatInviteLink.isPrimary) {
                TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
                if (chatInviteLinkArr.length > 1) {
                    TdApi.ChatInviteLink chatInviteLink2 = chatInviteLinkArr[1];
                    this.f9590K0 = chatInviteLink2;
                    this.f9591L0.add(0, chatInviteLink2);
                    m33189Kh(chatInviteLink, this.f9590K0);
                    m33187Lh(null, this.f9592M0.get(0));
                    m33145xh();
                    if (this.f9589J0 != null && this.f9586G0 && this.f9588I0 == mo4348c().m2519ba()) {
                        this.f9589J0.mo31503w4(this.f9590K0);
                        return;
                    }
                    return;
                }
            }
            m33187Lh(chatInviteLink, this.f9592M0.get(0));
        }
    }

    public final void m33207Bh() {
        m33161hh();
        m9204n9();
    }

    public final void m33205Ch() {
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatMember(this.f9587H0, new TdApi.MessageSenderUser(this.f9588I0)), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.this.m33152qh(object);
            }
        });
    }

    public final void m33203Dh(final AbstractC1125a<TdApi.ChatInviteLinkCounts> aVar) {
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatInviteLinkCounts(this.f9587H0), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.m33151rh(AbstractC1125a.this, object);
            }
        });
    }

    public final void m33201Eh() {
        m33199Fh(false, false, "", new AbstractC1125a() {
            @Override
            public final void mo1208a(Object obj) {
                View$OnClickListenerC2855p0.this.m33150sh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public final void m33199Fh(boolean z, boolean z2, String str, final AbstractC1125a<TdApi.ChatInviteLinks> aVar) {
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatInviteLinks(this.f9587H0, this.f9588I0, z, 0, str, z2 ? 100 : 20), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.m33147vh(AbstractC1125a.this, object);
            }
        });
    }

    public final void m33197Gh(TdApi.ChatInviteLink chatInviteLink, boolean z) {
        if (!z) {
            this.f9583D0.m34136r3(chatInviteLink);
        }
        if (!chatInviteLink.isRevoked) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (timeUnit.toMillis(chatInviteLink.expirationDate) >= this.f30170b.m2898D4()) {
                long M0 = C4403w.m27964M0(chatInviteLink.expirationDate, timeUnit, this.f30170b.m2898D4(), TimeUnit.MILLISECONDS, true, 0);
                if (M0 != -1) {
                    this.f9596Q0.add(chatInviteLink);
                    Handler handler = this.f9597R0;
                    handler.sendMessageDelayed(Message.obtain(handler, 0, chatInviteLink), M0);
                    return;
                }
                return;
            }
        }
        this.f9597R0.removeMessages(0, chatInviteLink);
        this.f9596Q0.remove(chatInviteLink);
    }

    public void m33195Hh(C2860d dVar) {
        super.m9476Ad(dVar);
        this.f9587H0 = dVar.f9602a;
        this.f9588I0 = dVar.f9603b;
        this.f9589J0 = dVar.f9605d;
        this.f9585F0 = this.f30170b.m2784K6(dVar.f9602a);
        this.f9586G0 = dVar.f9604c;
    }

    public final String m33193Ih(TdApi.ChatInviteLink chatInviteLink) {
        String str = chatInviteLink.name;
        if (str != null && !str.isEmpty()) {
            return chatInviteLink.name;
        }
        String[] split = chatInviteLink.inviteLink.split("/");
        return split[split.length - 1];
    }

    public void m33191Jh(TdApi.ChatInviteLink chatInviteLink) {
        int N0 = this.f9583D0.m34227N0(R.id.btn_createInviteLink) + 1;
        this.f9583D0.m34132t0(N0, new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(chatInviteLink), false).m32873G(chatInviteLink));
        this.f9583D0.m34132t0(N0, new C2964ra(11));
        m33197Gh(chatInviteLink, true);
        this.f9594O0++;
        m33179Ph();
    }

    public void m33189Kh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int L0 = this.f9583D0.m34231L0(chatInviteLink);
        C2964ra E0 = this.f9583D0.m34246E0(L0);
        if (E0 != null) {
            E0.m32856X(m33193Ih(chatInviteLink2));
            E0.m32873G(chatInviteLink2);
            this.f9583D0.m39315I(L0);
        }
    }

    public void m33187Lh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int i;
        int N0;
        boolean z = this.f9592M0.size() == 1;
        C2964ra G = new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(chatInviteLink2), false).m32873G(chatInviteLink2);
        C2964ra raVar = new C2964ra(11);
        if (chatInviteLink != null) {
            C2546iq iqVar = this.f9583D0;
            iqVar.m34207V1(iqVar.m34231L0(chatInviteLink) - 1, 2);
        }
        if (z) {
            TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr = this.f9593N0;
            if (chatInviteLinkCountArr == null || chatInviteLinkCountArr.length <= 1) {
                if (this.f9591L0.size() > 1) {
                    C2546iq iqVar2 = this.f9583D0;
                    List<TdApi.ChatInviteLink> list = this.f9591L0;
                    N0 = iqVar2.m34231L0(list.get(list.size() - 1));
                } else if (this.f9583D0.m34227N0(R.id.btn_createInviteLink) == -1) {
                    i = this.f9583D0.m34213T0(9) + 3;
                } else {
                    N0 = this.f9583D0.m34227N0(R.id.btn_createInviteLink);
                }
                i = N0 + 2;
            } else {
                i = this.f9583D0.m34231L0(chatInviteLinkCountArr[chatInviteLinkCountArr.length - 1]) + 1;
            }
            C2964ra[] raVarArr = {new C2964ra(8, 0, 0, R.string.RevokedInviteLinks), new C2964ra(2), new C2964ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).m32846d0(R.id.theme_color_textNegative), new C2964ra(11), G, new C2964ra(3)};
            C2546iq iqVar3 = this.f9583D0;
            iqVar3.m34191b1(Math.min(i + 1, iqVar3.mo6153D()), raVarArr);
        } else {
            int L0 = this.f9583D0.m34231L0(this.f9592M0.get(1)) - 1;
            this.f9583D0.m34132t0(L0, G);
            this.f9583D0.m34132t0(L0, raVar);
        }
        if (this.f9588I0 != this.f30170b.m2519ba() && this.f9591L0.size() == 1) {
            if (!chatInviteLink2.isPrimary) {
                C2546iq iqVar4 = this.f9583D0;
                iqVar4.m34207V1(iqVar4.m34227N0(R.id.btn_inviteLink) + 3, 3);
            } else {
                return;
            }
        }
        if (chatInviteLink2.isPrimary) {
            this.f9595P0++;
        } else {
            this.f9595P0++;
            this.f9594O0--;
        }
        m33179Ph();
    }

    public void m33185Mh(TdApi.ChatInviteLink chatInviteLink) {
        int L0 = this.f9583D0.m34231L0(chatInviteLink);
        if (this.f9592M0.isEmpty()) {
            this.f9583D0.m34207V1(L0 - 4, 6);
        } else {
            this.f9583D0.m34207V1(L0 - 1, 2);
        }
        this.f9595P0--;
        m33179Ph();
    }

    public void m33183Nh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int L0 = this.f9583D0.m34231L0(chatInviteLink);
        int L02 = this.f9583D0.m34231L0(chatInviteLink2);
        this.f9583D0.m34207V1(L0 - 4, (L02 - L0) + 6);
    }

    public void m33181Oh(long j, int i) {
        int R0 = this.f9583D0.m34218R0(j);
        C2964ra E0 = this.f9583D0.m34246E0(R0);
        if (E0 != null) {
            E0.m32867M(i);
            this.f9583D0.m39315I(R0);
        }
        m33179Ph();
    }

    public final void m33179Ph() {
        int T0 = this.f9583D0.m34213T0(42);
        C2964ra E0 = this.f9583D0.m34246E0(T0);
        if (E0 != null) {
            int i = 0;
            int i2 = 0;
            for (C2964ra raVar : this.f9583D0.m34243F0()) {
                if (raVar.m32838j() == R.id.btn_openAdminInviteLinks) {
                    i += raVar.m32836l();
                    i2 = (int) (i2 + raVar.m32834n());
                }
            }
            int i3 = i + this.f9594O0;
            int i4 = i2 + this.f9595P0;
            E0.m32867M(i3).m32865O(i4);
            this.f9583D0.m34127u3(T0);
            if (m9131x9().f9606e != null && (m9131x9().f9606e instanceof View$OnClickListenerC3062so)) {
                ((View$OnClickListenerC3062so) m9131x9().f9606e).m31628hm(i3, i4);
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chatLinks;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.InviteLinks);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f9597R0.removeMessages(0);
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        this.f9597R0.removeMessages(0);
    }

    @Override
    public boolean mo9270dc() {
        return this.f9591L0 == null;
    }

    @Override
    public void mo452g2() {
        this.f9583D0.m34130t3(this.f9587H0);
    }

    public final void m33161hh() {
        Iterator<TdApi.ChatInviteLink> it;
        ArrayList arrayList = new ArrayList();
        int size = this.f9591L0.size() - 1;
        int size2 = this.f9592M0.size() - 1;
        boolean z = this.f9588I0 != this.f30170b.m2519ba();
        int i = 3;
        if (z) {
            arrayList.add(new C2964ra(63, R.id.btn_openChat).m32866N(this.f9588I0).m32867M(this.f9591L0.size()));
            arrayList.add(new C2964ra(3));
        } else {
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(130).m32873G(this.f30170b.m2365l5("\u1f973")));
        }
        Iterator<TdApi.ChatInviteLink> it2 = this.f9591L0.iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it2.hasNext()) {
            TdApi.ChatInviteLink next = it2.next();
            if (!next.isPrimary || z3) {
                it2 = it2;
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(next), false).m32873G(next));
                m33197Gh(next, true);
                if (this.f9591L0.indexOf(next) != size) {
                    arrayList.add(new C2964ra(11));
                }
                i = 3;
            } else {
                this.f9590K0 = next;
                arrayList.add(new C2964ra(8, 0, 0, R.string.PrimaryInviteLink));
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(next), false).m32873G(next));
                arrayList.add(new C2964ra(i));
                if (z) {
                    it = it2;
                    arrayList.add(new C2964ra(9, 0, 0, C4403w.m27984H0(new C10534a9(this.f30168a, this.f30170b), R.string.InviteLinkOtherAdminHint, C4779t2.m25438r2(this.f30170b.m2480e2().m1583v2(this.f9588I0)), this.f30170b.m2691Q3(this.f9587H0)), false).m32866N(this.f9587H0));
                    z2 = this.f9591L0.size() > 1;
                } else {
                    it = it2;
                }
                if (z2) {
                    arrayList.add(new C2964ra(8, 0, 0, R.string.AdditionalInviteLinks));
                    arrayList.add(new C2964ra(2));
                    if (!z) {
                        arrayList.add(new C2964ra(4, R.id.btn_createInviteLink, R.drawable.baseline_add_link_24, R.string.CreateLink));
                    }
                    if (this.f9591L0.size() > 1) {
                        arrayList.add(new C2964ra(11));
                    }
                }
                it2 = it;
                i = 3;
                z3 = true;
            }
        }
        if (this.f9591L0.size() < this.f9594O0) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27846o2(R.string.StatsXShowMore, Math.min(100, this.f9594O0 - this.f9591L0.size())), false).m32867M(0));
        }
        if (z2) {
            arrayList.add(new C2964ra(3));
            if (!z) {
                arrayList.add(new C2964ra(9, 0, 0, R.string.AdditionalInviteLinksHint));
            }
        }
        TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr = this.f9593N0;
        if (chatInviteLinkCountArr != null && chatInviteLinkCountArr.length > 1) {
            arrayList.add(new C2964ra(8, 0, 0, R.string.OtherAdminsInviteLinks));
            arrayList.add(new C2964ra(2));
            int i2 = 0;
            while (true) {
                TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr2 = this.f9593N0;
                if (i2 >= chatInviteLinkCountArr2.length) {
                    break;
                }
                TdApi.ChatInviteLinkCount chatInviteLinkCount = chatInviteLinkCountArr2[i2];
                if (chatInviteLinkCount.userId != this.f30170b.m2519ba()) {
                    arrayList.add(new C2964ra(63, R.id.btn_openAdminInviteLinks).m32866N(chatInviteLinkCount.userId).m32867M(chatInviteLinkCount.inviteLinkCount).m32865O(chatInviteLinkCount.revokedInviteLinkCount).m32873G(chatInviteLinkCount));
                    if (i2 != this.f9593N0.length - 1) {
                        arrayList.add(new C2964ra(11));
                    }
                }
                i2++;
            }
            arrayList.add(new C2964ra(3));
        }
        if (!this.f9592M0.isEmpty()) {
            arrayList.add(new C2964ra(8, 0, 0, R.string.RevokedInviteLinks));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).m32846d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(11));
            for (TdApi.ChatInviteLink chatInviteLink : this.f9592M0) {
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33193Ih(chatInviteLink), false).m32873G(chatInviteLink));
                if (this.f9592M0.indexOf(chatInviteLink) != size2) {
                    arrayList.add(new C2964ra(11));
                }
            }
            if (this.f9592M0.size() < this.f9595P0) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27846o2(R.string.StatsXShowMore, Math.min(100, this.f9595P0 - this.f9592M0.size())), false).m32867M(1));
            }
            arrayList.add(new C2964ra(3));
        }
        arrayList.add(new C2964ra(42));
        this.f9583D0.m34119x2(arrayList, false);
        m33179Ph();
    }

    public final CharSequence m33160ih(TdApi.ChatInviteLink chatInviteLink) {
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long D4 = this.f30170b.m2898D4();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(chatInviteLink.expirationDate) - D4;
        int i4 = chatInviteLink.memberCount;
        if (i4 > 0) {
            spannableStringBuilder.append(C4403w.m27838q2(R.string.InviteLinkJoins, i4));
        } else if (chatInviteLink.isPrimary || chatInviteLink.memberLimit == 0 || (i4 == 0 && chatInviteLink.isRevoked)) {
            spannableStringBuilder.append((CharSequence) C4403w.m27871i1(R.string.InviteLinkNoJoins));
        }
        if (chatInviteLink.isPrimary) {
            return spannableStringBuilder.toString();
        }
        String str = " • ";
        spannableStringBuilder.append((CharSequence) str);
        if (chatInviteLink.createsJoinRequest && (i3 = chatInviteLink.pendingJoinRequestCount) > 0) {
            spannableStringBuilder.append(C4403w.m27838q2(R.string.xRequests, i3)).append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i2 = chatInviteLink.memberLimit) > 0) {
            int i5 = chatInviteLink.memberCount;
            if (i5 == i2) {
                spannableStringBuilder.append((CharSequence) C4403w.m27871i1(R.string.InviteLinkMemberLimitReached));
            } else {
                spannableStringBuilder.append(C4403w.m27838q2(R.string.InviteLinkRemains, i2 - i5));
            }
            if (chatInviteLink.expirationDate == 0) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i = chatInviteLink.expirationDate) != 0) {
            if (millis > 0) {
                spannableStringBuilder.append(C4403w.m27883f1(i, timeUnit, D4, TimeUnit.MILLISECONDS, true, 0, R.string.InviteLinkExpires, false));
            } else {
                spannableStringBuilder.append(C4403w.m27855m1(R.string.InviteLinkExpiredAt, C4403w.m27807y1(i, timeUnit)));
            }
        }
        if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 2) == 8226) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 1);
        }
        if (spannableStringBuilder.charAt(1) == 8226) {
            spannableStringBuilder.delete(0, 3);
        }
        return spannableStringBuilder;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        Iterator it = new ArrayList(this.f9596Q0).iterator();
        while (it.hasNext()) {
            m33197Gh((TdApi.ChatInviteLink) it.next(), false);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_createInviteLink:
                View$OnClickListenerC3038s6 s6Var = new View$OnClickListenerC3038s6(this.f30168a, this.f30170b);
                s6Var.m31978Qf(new View$OnClickListenerC3038s6.C3041c(null, this.f9587H0, this));
                m9291ac(s6Var);
                return;
            case R.id.btn_deleteAllRevokedLinks:
                m9261ee(C4403w.m27871i1(R.string.AreYouSureDeleteAllInviteLinks), new int[]{R.id.btn_deleteAllRevokedLinks, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.DeleteAllRevokedLinks), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean nh;
                        nh = View$OnClickListenerC2855p0.this.m33155nh(view2, i);
                        return nh;
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
                return;
            case R.id.btn_inviteLink:
                final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) view.getTag();
                this.f30170b.m2485dd().m3897A8(this, chatInviteLink, this.f9587H0, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2855p0.this.m33157lh(chatInviteLink);
                    }
                }, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2855p0.this.m33156mh(chatInviteLink, (TdApi.ChatInviteLinks) obj);
                    }
                });
                return;
            case R.id.btn_openAdminInviteLinks:
                View$OnClickListenerC2855p0 p0Var = new View$OnClickListenerC2855p0(this.f30168a, this.f30170b);
                p0Var.m33195Hh(new C2860d(this.f9587H0, ((Long) view.getTag()).longValue(), null, this, false));
                m9291ac(p0Var);
                return;
            case R.id.btn_openChat:
                m33205Ch();
                return;
            case R.id.btn_showAdvanced:
                m33146wh(((Boolean) view.getTag()).booleanValue());
                return;
            default:
                return;
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f9583D0 = new C2857b(this);
        m33201Eh();
        customRecyclerView.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        customRecyclerView.setAdapter(this.f9583D0);
        C11052v1.m1768b().m1769a(this);
        C4007j.m29344a(customRecyclerView, new C2859c());
    }

    public final void m33146wh(final boolean z) {
        boolean[] zArr = this.f9584E0;
        if (!zArr[z ? 1 : 0]) {
            zArr[z] = true;
            final List<TdApi.ChatInviteLink> list = z != 0 ? this.f9592M0 : this.f9591L0;
            m33199Fh(z, true, list.get(list.size() - 1).inviteLink, new AbstractC1125a() {
                @Override
                public final void mo1208a(Object obj) {
                    View$OnClickListenerC2855p0.this.m33158kh(z, list, (TdApi.ChatInviteLinks) obj);
                }
            });
        }
    }

    public final void m33145xh() {
        m33181Oh(this.f9588I0, this.f9591L0.size());
        if (m9131x9().f9606e != null && (m9131x9().f9606e instanceof View$OnClickListenerC2855p0)) {
            ((View$OnClickListenerC2855p0) m9131x9().f9606e).m33181Oh(this.f9588I0, this.f9591L0.size());
        }
    }

    public void m33144yh(String str) {
        TdApi.ChatInviteLink chatInviteLink;
        Iterator<TdApi.ChatInviteLink> it = this.f9591L0.iterator();
        while (true) {
            if (!it.hasNext()) {
                chatInviteLink = null;
                break;
            }
            chatInviteLink = it.next();
            if (chatInviteLink.inviteLink.equals(str)) {
                break;
            }
        }
        if (chatInviteLink != null) {
            chatInviteLink.pendingJoinRequestCount--;
            m33143zh(chatInviteLink, chatInviteLink);
        }
    }

    public void m33143zh(final TdApi.ChatInviteLink chatInviteLink, final TdApi.ChatInviteLink chatInviteLink2) {
        if (chatInviteLink2 != null) {
            int indexOf = this.f9591L0.indexOf(chatInviteLink2);
            this.f9591L0.remove(chatInviteLink2);
            this.f9591L0.add(indexOf, chatInviteLink);
        } else {
            this.f9591L0.add(1, chatInviteLink);
        }
        m9143vd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2855p0.this.m33154oh(chatInviteLink2, chatInviteLink);
            }
        }, 250L);
    }
}
