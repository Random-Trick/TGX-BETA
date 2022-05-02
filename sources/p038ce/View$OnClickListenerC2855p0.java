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
            View$OnClickListenerC2855p0.this.m33194Gh((TdApi.ChatInviteLink) message.obj, false);
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
                    View$OnClickListenerC2855p0.this.m33202Ch();
                } else if (i == R.id.btn_openChat) {
                    HandlerC10770jj dd = View$OnClickListenerC2855p0.this.f30167b.m2485dd();
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

        public boolean m33139A3(View view, int i) {
            if (i == R.id.btn_openChat) {
                HandlerC10770jj dd = View$OnClickListenerC2855p0.this.f30167b.m2485dd();
                View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
                dd.m3569h7(p0Var, p0Var.f9588I0, new HandlerC10770jj.C10780j().m3368h());
                return true;
            } else if (i != R.id.btn_editRights) {
                return true;
            } else {
                View$OnClickListenerC2855p0.this.m33202Ch();
                return true;
            }
        }

        public boolean m33138B3(View view) {
            View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
            p0Var.m9261ee(p0Var.f30167b.m2480e2().m1721K2(View$OnClickListenerC2855p0.this.f9588I0), new int[]{R.id.btn_openChat, R.id.btn_editRights}, new String[]{C4403w.m27869i1(R.string.OpenChat), C4403w.m27869i1(R.string.EditAdminRights)}, null, new int[]{R.drawable.baseline_forum_24, R.drawable.baseline_stars_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean A3;
                    A3 = View$OnClickListenerC2855p0.C2857b.this.m33139A3(view2, i);
                    return A3;
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

        public C6957m1.AbstractC6962e m33137C3(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
            cVar.m23284a(R.id.btn_openChat);
            cVar2.m23284a(R.drawable.baseline_forum_24);
            u0Var.m23816a(R.string.OpenChat);
            cVar.m23284a(R.id.btn_editRights);
            cVar2.m23284a(R.drawable.baseline_stars_24);
            u0Var.m23816a(R.string.EditAdminRights);
            fVar.m18336J(true);
            return new C2858a();
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_deleteAllRevokedLinks) {
                cVar.setIconColorId(R.id.theme_color_textNegative);
            } else if (raVar.m32835j() == R.id.btn_inviteLink) {
                TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) raVar.m32844d();
                cVar.setData(View$OnClickListenerC2855p0.this.m33157ih(chatInviteLink));
                cVar.setTag(chatInviteLink);
                cVar.setIconColorId(R.id.theme_color_icon);
            } else {
                if (raVar.m32835j() == R.id.btn_showAdvanced) {
                    boolean z2 = true;
                    if (raVar.m32833l() != 1) {
                        z2 = false;
                    }
                    cVar.setTag(Boolean.valueOf(z2));
                }
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void mo426p2(C2964ra raVar, int i, EmbeddableStickerView embeddableStickerView, boolean z) {
            TdApi.Sticker sticker = (TdApi.Sticker) raVar.m32844d();
            embeddableStickerView.setSticker(new C2104l(View$OnClickListenerC2855p0.this.f30167b, sticker, "\u1f973", sticker.type));
            embeddableStickerView.setCaptionText(C4403w.m27869i1(View$OnClickListenerC2855p0.this.f9585F0 ? R.string.ChannelLinkInfo : R.string.LinkInfo));
        }

        @Override
        public void mo33136s1(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
            C4649h hVar = new C4649h(View$OnClickListenerC2855p0.this.f30167b, raVar.m32832m(), true);
            hVar.m26631w(C4403w.m27836q2(R.string.xLinks, raVar.m32833l()));
            hVar.m26635s(true);
            l3Var.setChat(hVar);
            l3Var.setTag(Long.valueOf(raVar.m32832m()));
            if (raVar.m32835j() == R.id.btn_openChat) {
                l3Var.m18494v0(new TdApi.ChatListMain(), View$OnClickListenerC2855p0.this.f9588I0, null);
                l3Var.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean B3;
                        B3 = View$OnClickListenerC2855p0.C2857b.this.m33138B3(view);
                        return B3;
                    }
                });
                l3Var.setPreviewActionListProvider(new View$OnClickListenerC6902i.AbstractC6905c() {
                    @Override
                    public final C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
                        C6957m1.AbstractC6962e C3;
                        C3 = View$OnClickListenerC2855p0.C2857b.this.m33137C3(view, fVar, cVar, cVar2, u0Var, v4Var);
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
            if (raVar.m32831n() > 0) {
                t1Var.m18058E1(C4403w.m27865j1(R.string.format_activeAndRevokedLinks, C4403w.m27836q2(R.string.xActiveLinks, raVar.m32833l()), C4403w.m27836q2(R.string.xRevokedLinks, raVar.m32831n())));
            } else {
                t1Var.m18058E1(C4403w.m27836q2(R.string.xActiveLinks, raVar.m32833l()));
            }
        }

        @Override
        public void mo33135u1(C2964ra raVar, TextView textView) {
            textView.setText(C5078d.m23986z().m24024I(raVar.m32824u()));
        }
    }

    public class C2859c implements C4007j.AbstractC4009b {
        public C2859c() {
            View$OnClickListenerC2855p0.this = r1;
        }

        public boolean m33127l(TdApi.ChatInviteLink chatInviteLink, View view, int i) {
            if (i != R.id.btn_deleteLink) {
                return true;
            }
            View$OnClickListenerC2855p0.this.f9592M0.remove(chatInviteLink);
            View$OnClickListenerC2855p0.this.m33182Mh(chatInviteLink);
            View$OnClickListenerC2855p0.this.m33142xh();
            View$OnClickListenerC2855p0.this.f30167b.m2270r4().m14783o(new TdApi.DeleteRevokedChatInviteLink(View$OnClickListenerC2855p0.this.f9587H0, chatInviteLink.inviteLink), null);
            return true;
        }

        public void m33126m(TdApi.ChatInviteLink chatInviteLink, TdApi.Object object) {
            View$OnClickListenerC2855p0.this.m33153mh(chatInviteLink, (TdApi.ChatInviteLinks) object);
        }

        public void m33125n(final TdApi.ChatInviteLink chatInviteLink, final TdApi.Object object) {
            if (object.getConstructor() == 112891427) {
                View$OnClickListenerC2855p0.this.m9135wd(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2855p0.C2859c.this.m33126m(chatInviteLink, object);
                    }
                });
            }
        }

        public boolean m33124o(final TdApi.ChatInviteLink chatInviteLink, View view, int i) {
            if (i != R.id.btn_revokeLink) {
                return true;
            }
            View$OnClickListenerC2855p0.this.f30167b.m2270r4().m14783o(new TdApi.RevokeChatInviteLink(View$OnClickListenerC2855p0.this.f9587H0, chatInviteLink.inviteLink), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2855p0.C2859c.this.m33125n(chatInviteLink, object);
                }
            });
            return true;
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) View$OnClickListenerC2855p0.this.f9583D0.m34240F0().get(d0Var.m39334l()).m32844d();
            if (chatInviteLink.isRevoked) {
                View$OnClickListenerC2855p0.this.m9261ee(C4403w.m27869i1(R.string.AreYouSureDeleteInviteLink), new int[]{R.id.btn_deleteLink, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.InviteLinkDelete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean l;
                        l = View$OnClickListenerC2855p0.C2859c.this.m33127l(chatInviteLink, view, i);
                        return l;
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
                return;
            }
            View$OnClickListenerC2855p0 p0Var = View$OnClickListenerC2855p0.this;
            p0Var.m9261ee(C4403w.m27869i1(p0Var.f30167b.m2784K6(View$OnClickListenerC2855p0.this.f9587H0) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RevokeLink), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean o;
                    o = View$OnClickListenerC2855p0.C2859c.this.m33124o(chatInviteLink, view, i);
                    return o;
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

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = View$OnClickListenerC2855p0.this.f9583D0.m34240F0().get(i);
            return raVar != null && raVar.m32835j() == R.id.btn_inviteLink;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
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

    public void m33156jh(List list, TdApi.ChatInviteLinks chatInviteLinks, boolean z, int i) {
        list.addAll(Arrays.asList(chatInviteLinks.inviteLinks));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
            if (i2 >= chatInviteLinkArr.length) {
                break;
            }
            TdApi.ChatInviteLink chatInviteLink = chatInviteLinkArr[i2];
            arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(chatInviteLink), false).m32870G(chatInviteLink));
            if (i2 != chatInviteLinks.inviteLinks.length - 1) {
                arrayList.add(new C2964ra(11));
            }
            i2++;
        }
        if (list.size() < (z ? this.f9595P0 : this.f9594O0)) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27844o2(R.string.StatsXShowMore, Math.min(100, (z ? this.f9595P0 : this.f9594O0) - list.size())), false).m32864M(z ? 1 : 0));
        }
        this.f9583D0.m34147n1(i);
        this.f9583D0.m34188b1(i, (C2964ra[]) arrayList.toArray(new C2964ra[0]));
        this.f9584E0[z ? 1 : 0] = false;
    }

    public void m33155kh(final boolean z, final List list, final TdApi.ChatInviteLinks chatInviteLinks) {
        final int P0 = this.f9583D0.m34219P0(R.id.btn_showAdvanced, z ? 1 : 0);
        if (P0 != -1) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2855p0.this.m33156jh(list, chatInviteLinks, z, P0);
                }
            });
        }
    }

    public void m33154lh(TdApi.ChatInviteLink chatInviteLink) {
        this.f9592M0.remove(chatInviteLink);
        m33182Mh(chatInviteLink);
        m33142xh();
    }

    public boolean m33152nh(View view, int i) {
        if (i == R.id.btn_deleteAllRevokedLinks) {
            List<TdApi.ChatInviteLink> list = this.f9592M0;
            this.f9592M0.clear();
            m33180Nh(this.f9592M0.get(0), list.get(list.size() - 1));
            m33142xh();
            this.f30167b.m2270r4().m14783o(new TdApi.DeleteAllRevokedChatInviteLinks(this.f9587H0, this.f9588I0), null);
        }
        return true;
    }

    public void m33151oh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        if (chatInviteLink != null) {
            m33186Kh(chatInviteLink, chatInviteLink2);
            return;
        }
        m33188Jh(chatInviteLink2);
        m33142xh();
    }

    public void m33150ph(TdApi.Object object) {
        TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30165a, this.f30167b);
        u7Var.m31376sg(new View$OnClickListenerC3141u7.C3145d(this.f9587H0, new TdApi.MessageSenderUser(this.f9588I0), false, this.f30167b.m2787K3(this.f9587H0), chatMember).m31350b());
        m9291ac(u7Var);
    }

    public void m33149qh(final TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2855p0.this.m33150ph(object);
                }
            });
        }
    }

    public static void m33148rh(AbstractC1125a aVar, TdApi.Object object) {
        if (object.getConstructor() == 920326637) {
            aVar.mo1208a((TdApi.ChatInviteLinkCounts) object);
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public void m33147sh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.f9594O0 = chatInviteLinks.totalCount;
        this.f9591L0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        m33196Fh(true, false, "", new AbstractC1125a() {
            @Override
            public final void mo1208a(Object obj) {
                View$OnClickListenerC2855p0.this.m33145uh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public void m33146th(TdApi.ChatInviteLinkCounts chatInviteLinkCounts) {
        this.f9593N0 = chatInviteLinkCounts.inviteLinkCounts;
        m9135wd(new RunnableC2601k0(this));
    }

    public void m33145uh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.f9595P0 = chatInviteLinks.totalCount;
        this.f9592M0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        if (this.f9586G0) {
            m33200Dh(new AbstractC1125a() {
                @Override
                public final void mo1208a(Object obj) {
                    View$OnClickListenerC2855p0.this.m33146th((TdApi.ChatInviteLinkCounts) obj);
                }
            });
        } else {
            m9135wd(new RunnableC2601k0(this));
        }
    }

    public static void m33144vh(AbstractC1125a aVar, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            aVar.mo1208a((TdApi.ChatInviteLinks) object);
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public final void m33153mh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLinks chatInviteLinks) {
        if (chatInviteLinks.inviteLinks.length > 0) {
            this.f9591L0.remove(chatInviteLink);
            this.f9592M0.add(0, chatInviteLinks.inviteLinks[0]);
            if (chatInviteLink.isPrimary) {
                TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
                if (chatInviteLinkArr.length > 1) {
                    TdApi.ChatInviteLink chatInviteLink2 = chatInviteLinkArr[1];
                    this.f9590K0 = chatInviteLink2;
                    this.f9591L0.add(0, chatInviteLink2);
                    m33186Kh(chatInviteLink, this.f9590K0);
                    m33184Lh(null, this.f9592M0.get(0));
                    m33142xh();
                    if (this.f9589J0 != null && this.f9586G0 && this.f9588I0 == mo4348c().m2519ba()) {
                        this.f9589J0.mo31500w4(this.f9590K0);
                        return;
                    }
                    return;
                }
            }
            m33184Lh(chatInviteLink, this.f9592M0.get(0));
        }
    }

    public final void m33204Bh() {
        m33158hh();
        m9204n9();
    }

    public final void m33202Ch() {
        this.f30167b.m2270r4().m14783o(new TdApi.GetChatMember(this.f9587H0, new TdApi.MessageSenderUser(this.f9588I0)), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.this.m33149qh(object);
            }
        });
    }

    public final void m33200Dh(final AbstractC1125a<TdApi.ChatInviteLinkCounts> aVar) {
        this.f30167b.m2270r4().m14783o(new TdApi.GetChatInviteLinkCounts(this.f9587H0), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.m33148rh(AbstractC1125a.this, object);
            }
        });
    }

    public final void m33198Eh() {
        m33196Fh(false, false, "", new AbstractC1125a() {
            @Override
            public final void mo1208a(Object obj) {
                View$OnClickListenerC2855p0.this.m33147sh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public final void m33196Fh(boolean z, boolean z2, String str, final AbstractC1125a<TdApi.ChatInviteLinks> aVar) {
        this.f30167b.m2270r4().m14783o(new TdApi.GetChatInviteLinks(this.f9587H0, this.f9588I0, z, 0, str, z2 ? 100 : 20), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2855p0.m33144vh(AbstractC1125a.this, object);
            }
        });
    }

    public final void m33194Gh(TdApi.ChatInviteLink chatInviteLink, boolean z) {
        if (!z) {
            this.f9583D0.m34133r3(chatInviteLink);
        }
        if (!chatInviteLink.isRevoked) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (timeUnit.toMillis(chatInviteLink.expirationDate) >= this.f30167b.m2898D4()) {
                long M0 = C4403w.m27962M0(chatInviteLink.expirationDate, timeUnit, this.f30167b.m2898D4(), TimeUnit.MILLISECONDS, true, 0);
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

    public void m33192Hh(C2860d dVar) {
        super.m9476Ad(dVar);
        this.f9587H0 = dVar.f9602a;
        this.f9588I0 = dVar.f9603b;
        this.f9589J0 = dVar.f9605d;
        this.f9585F0 = this.f30167b.m2784K6(dVar.f9602a);
        this.f9586G0 = dVar.f9604c;
    }

    public final String m33190Ih(TdApi.ChatInviteLink chatInviteLink) {
        String str = chatInviteLink.name;
        if (str != null && !str.isEmpty()) {
            return chatInviteLink.name;
        }
        String[] split = chatInviteLink.inviteLink.split("/");
        return split[split.length - 1];
    }

    public void m33188Jh(TdApi.ChatInviteLink chatInviteLink) {
        int N0 = this.f9583D0.m34224N0(R.id.btn_createInviteLink) + 1;
        this.f9583D0.m34129t0(N0, new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(chatInviteLink), false).m32870G(chatInviteLink));
        this.f9583D0.m34129t0(N0, new C2964ra(11));
        m33194Gh(chatInviteLink, true);
        this.f9594O0++;
        m33176Ph();
    }

    public void m33186Kh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int L0 = this.f9583D0.m34228L0(chatInviteLink);
        C2964ra E0 = this.f9583D0.m34243E0(L0);
        if (E0 != null) {
            E0.m32853X(m33190Ih(chatInviteLink2));
            E0.m32870G(chatInviteLink2);
            this.f9583D0.m39312I(L0);
        }
    }

    public void m33184Lh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int i;
        int N0;
        boolean z = this.f9592M0.size() == 1;
        C2964ra G = new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(chatInviteLink2), false).m32870G(chatInviteLink2);
        C2964ra raVar = new C2964ra(11);
        if (chatInviteLink != null) {
            C2546iq iqVar = this.f9583D0;
            iqVar.m34204V1(iqVar.m34228L0(chatInviteLink) - 1, 2);
        }
        if (z) {
            TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr = this.f9593N0;
            if (chatInviteLinkCountArr == null || chatInviteLinkCountArr.length <= 1) {
                if (this.f9591L0.size() > 1) {
                    C2546iq iqVar2 = this.f9583D0;
                    List<TdApi.ChatInviteLink> list = this.f9591L0;
                    N0 = iqVar2.m34228L0(list.get(list.size() - 1));
                } else if (this.f9583D0.m34224N0(R.id.btn_createInviteLink) == -1) {
                    i = this.f9583D0.m34210T0(9) + 3;
                } else {
                    N0 = this.f9583D0.m34224N0(R.id.btn_createInviteLink);
                }
                i = N0 + 2;
            } else {
                i = this.f9583D0.m34228L0(chatInviteLinkCountArr[chatInviteLinkCountArr.length - 1]) + 1;
            }
            C2964ra[] raVarArr = {new C2964ra(8, 0, 0, R.string.RevokedInviteLinks), new C2964ra(2), new C2964ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).m32843d0(R.id.theme_color_textNegative), new C2964ra(11), G, new C2964ra(3)};
            C2546iq iqVar3 = this.f9583D0;
            iqVar3.m34188b1(Math.min(i + 1, iqVar3.mo6153D()), raVarArr);
        } else {
            int L0 = this.f9583D0.m34228L0(this.f9592M0.get(1)) - 1;
            this.f9583D0.m34129t0(L0, G);
            this.f9583D0.m34129t0(L0, raVar);
        }
        if (this.f9588I0 != this.f30167b.m2519ba() && this.f9591L0.size() == 1) {
            if (!chatInviteLink2.isPrimary) {
                C2546iq iqVar4 = this.f9583D0;
                iqVar4.m34204V1(iqVar4.m34224N0(R.id.btn_inviteLink) + 3, 3);
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
        m33176Ph();
    }

    public void m33182Mh(TdApi.ChatInviteLink chatInviteLink) {
        int L0 = this.f9583D0.m34228L0(chatInviteLink);
        if (this.f9592M0.isEmpty()) {
            this.f9583D0.m34204V1(L0 - 4, 6);
        } else {
            this.f9583D0.m34204V1(L0 - 1, 2);
        }
        this.f9595P0--;
        m33176Ph();
    }

    public void m33180Nh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int L0 = this.f9583D0.m34228L0(chatInviteLink);
        int L02 = this.f9583D0.m34228L0(chatInviteLink2);
        this.f9583D0.m34204V1(L0 - 4, (L02 - L0) + 6);
    }

    public void m33178Oh(long j, int i) {
        int R0 = this.f9583D0.m34215R0(j);
        C2964ra E0 = this.f9583D0.m34243E0(R0);
        if (E0 != null) {
            E0.m32864M(i);
            this.f9583D0.m39312I(R0);
        }
        m33176Ph();
    }

    public final void m33176Ph() {
        int T0 = this.f9583D0.m34210T0(42);
        C2964ra E0 = this.f9583D0.m34243E0(T0);
        if (E0 != null) {
            int i = 0;
            int i2 = 0;
            for (C2964ra raVar : this.f9583D0.m34240F0()) {
                if (raVar.m32835j() == R.id.btn_openAdminInviteLinks) {
                    i += raVar.m32833l();
                    i2 = (int) (i2 + raVar.m32831n());
                }
            }
            int i3 = i + this.f9594O0;
            int i4 = i2 + this.f9595P0;
            E0.m32864M(i3).m32862O(i4);
            this.f9583D0.m34124u3(T0);
            if (m9131x9().f9606e != null && (m9131x9().f9606e instanceof View$OnClickListenerC3062so)) {
                ((View$OnClickListenerC3062so) m9131x9().f9606e).m31625hm(i3, i4);
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chatLinks;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.InviteLinks);
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
        this.f9583D0.m34127t3(this.f9587H0);
    }

    public final void m33158hh() {
        Iterator<TdApi.ChatInviteLink> it;
        ArrayList arrayList = new ArrayList();
        int size = this.f9591L0.size() - 1;
        int size2 = this.f9592M0.size() - 1;
        boolean z = this.f9588I0 != this.f30167b.m2519ba();
        int i = 3;
        if (z) {
            arrayList.add(new C2964ra(63, R.id.btn_openChat).m32863N(this.f9588I0).m32864M(this.f9591L0.size()));
            arrayList.add(new C2964ra(3));
        } else {
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(130).m32870G(this.f30167b.m2365l5("\u1f973")));
        }
        Iterator<TdApi.ChatInviteLink> it2 = this.f9591L0.iterator();
        boolean z2 = true;
        boolean z3 = false;
        while (it2.hasNext()) {
            TdApi.ChatInviteLink next = it2.next();
            if (!next.isPrimary || z3) {
                it2 = it2;
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(next), false).m32870G(next));
                m33194Gh(next, true);
                if (this.f9591L0.indexOf(next) != size) {
                    arrayList.add(new C2964ra(11));
                }
                i = 3;
            } else {
                this.f9590K0 = next;
                arrayList.add(new C2964ra(8, 0, 0, R.string.PrimaryInviteLink));
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(next), false).m32870G(next));
                arrayList.add(new C2964ra(i));
                if (z) {
                    it = it2;
                    arrayList.add(new C2964ra(9, 0, 0, C4403w.m27982H0(new C10534a9(this.f30165a, this.f30167b), R.string.InviteLinkOtherAdminHint, C4779t2.m25437r2(this.f30167b.m2480e2().m1583v2(this.f9588I0)), this.f30167b.m2691Q3(this.f9587H0)), false).m32863N(this.f9587H0));
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
            arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27844o2(R.string.StatsXShowMore, Math.min(100, this.f9594O0 - this.f9591L0.size())), false).m32864M(0));
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
                if (chatInviteLinkCount.userId != this.f30167b.m2519ba()) {
                    arrayList.add(new C2964ra(63, R.id.btn_openAdminInviteLinks).m32863N(chatInviteLinkCount.userId).m32864M(chatInviteLinkCount.inviteLinkCount).m32862O(chatInviteLinkCount.revokedInviteLinkCount).m32870G(chatInviteLinkCount));
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
            arrayList.add(new C2964ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).m32843d0(R.id.theme_color_textNegative));
            arrayList.add(new C2964ra(11));
            for (TdApi.ChatInviteLink chatInviteLink : this.f9592M0) {
                arrayList.add(new C2964ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) m33190Ih(chatInviteLink), false).m32870G(chatInviteLink));
                if (this.f9592M0.indexOf(chatInviteLink) != size2) {
                    arrayList.add(new C2964ra(11));
                }
            }
            if (this.f9592M0.size() < this.f9595P0) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27844o2(R.string.StatsXShowMore, Math.min(100, this.f9595P0 - this.f9592M0.size())), false).m32864M(1));
            }
            arrayList.add(new C2964ra(3));
        }
        arrayList.add(new C2964ra(42));
        this.f9583D0.m34116x2(arrayList, false);
        m33176Ph();
    }

    public final CharSequence m33157ih(TdApi.ChatInviteLink chatInviteLink) {
        int i;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long D4 = this.f30167b.m2898D4();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(chatInviteLink.expirationDate) - D4;
        int i4 = chatInviteLink.memberCount;
        if (i4 > 0) {
            spannableStringBuilder.append(C4403w.m27836q2(R.string.InviteLinkJoins, i4));
        } else if (chatInviteLink.isPrimary || chatInviteLink.memberLimit == 0 || (i4 == 0 && chatInviteLink.isRevoked)) {
            spannableStringBuilder.append((CharSequence) C4403w.m27869i1(R.string.InviteLinkNoJoins));
        }
        if (chatInviteLink.isPrimary) {
            return spannableStringBuilder.toString();
        }
        String str = " • ";
        spannableStringBuilder.append((CharSequence) str);
        if (chatInviteLink.createsJoinRequest && (i3 = chatInviteLink.pendingJoinRequestCount) > 0) {
            spannableStringBuilder.append(C4403w.m27836q2(R.string.xRequests, i3)).append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i2 = chatInviteLink.memberLimit) > 0) {
            int i5 = chatInviteLink.memberCount;
            if (i5 == i2) {
                spannableStringBuilder.append((CharSequence) C4403w.m27869i1(R.string.InviteLinkMemberLimitReached));
            } else {
                spannableStringBuilder.append(C4403w.m27836q2(R.string.InviteLinkRemains, i2 - i5));
            }
            if (chatInviteLink.expirationDate == 0) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i = chatInviteLink.expirationDate) != 0) {
            if (millis > 0) {
                spannableStringBuilder.append(C4403w.m27881f1(i, timeUnit, D4, TimeUnit.MILLISECONDS, true, 0, R.string.InviteLinkExpires, false));
            } else {
                spannableStringBuilder.append(C4403w.m27853m1(R.string.InviteLinkExpiredAt, C4403w.m27805y1(i, timeUnit)));
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
            m33194Gh((TdApi.ChatInviteLink) it.next(), false);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_createInviteLink:
                View$OnClickListenerC3038s6 s6Var = new View$OnClickListenerC3038s6(this.f30165a, this.f30167b);
                s6Var.m31975Qf(new View$OnClickListenerC3038s6.C3041c(null, this.f9587H0, this));
                m9291ac(s6Var);
                return;
            case R.id.btn_deleteAllRevokedLinks:
                m9261ee(C4403w.m27869i1(R.string.AreYouSureDeleteAllInviteLinks), new int[]{R.id.btn_deleteAllRevokedLinks, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.DeleteAllRevokedLinks), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean nh;
                        nh = View$OnClickListenerC2855p0.this.m33152nh(view2, i);
                        return nh;
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
                return;
            case R.id.btn_inviteLink:
                final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) view.getTag();
                this.f30167b.m2485dd().m3897A8(this, chatInviteLink, this.f9587H0, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2855p0.this.m33154lh(chatInviteLink);
                    }
                }, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2855p0.this.m33153mh(chatInviteLink, (TdApi.ChatInviteLinks) obj);
                    }
                });
                return;
            case R.id.btn_openAdminInviteLinks:
                View$OnClickListenerC2855p0 p0Var = new View$OnClickListenerC2855p0(this.f30165a, this.f30167b);
                p0Var.m33192Hh(new C2860d(this.f9587H0, ((Long) view.getTag()).longValue(), null, this, false));
                m9291ac(p0Var);
                return;
            case R.id.btn_openChat:
                m33202Ch();
                return;
            case R.id.btn_showAdvanced:
                m33143wh(((Boolean) view.getTag()).booleanValue());
                return;
            default:
                return;
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f9583D0 = new C2857b(this);
        m33198Eh();
        customRecyclerView.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        customRecyclerView.setAdapter(this.f9583D0);
        C11052v1.m1768b().m1769a(this);
        C4007j.m29342a(customRecyclerView, new C2859c());
    }

    public final void m33143wh(final boolean z) {
        boolean[] zArr = this.f9584E0;
        if (!zArr[z ? 1 : 0]) {
            zArr[z] = true;
            final List<TdApi.ChatInviteLink> list = z != 0 ? this.f9592M0 : this.f9591L0;
            m33196Fh(z, true, list.get(list.size() - 1).inviteLink, new AbstractC1125a() {
                @Override
                public final void mo1208a(Object obj) {
                    View$OnClickListenerC2855p0.this.m33155kh(z, list, (TdApi.ChatInviteLinks) obj);
                }
            });
        }
    }

    public final void m33142xh() {
        m33178Oh(this.f9588I0, this.f9591L0.size());
        if (m9131x9().f9606e != null && (m9131x9().f9606e instanceof View$OnClickListenerC2855p0)) {
            ((View$OnClickListenerC2855p0) m9131x9().f9606e).m33178Oh(this.f9588I0, this.f9591L0.size());
        }
    }

    public void m33141yh(String str) {
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
            m33140zh(chatInviteLink, chatInviteLink);
        }
    }

    public void m33140zh(final TdApi.ChatInviteLink chatInviteLink, final TdApi.ChatInviteLink chatInviteLink2) {
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
                View$OnClickListenerC2855p0.this.m33151oh(chatInviteLink2, chatInviteLink);
            }
        }, 250L);
    }
}
