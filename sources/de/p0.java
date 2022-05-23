package de;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b1.a;
import ce.j0;
import dd.l;
import de.p0;
import de.s6;
import de.u7;
import ed.j;
import ed.k;
import gd.w;
import hd.h;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jb.c;
import ne.i;
import ne.l3;
import ne.m1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.y8;

public class p0 extends vo<d> implements View.OnClickListener, t1.a {
    public iq D0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public long I0;
    public la J0;
    public TdApi.ChatInviteLink K0;
    public List<TdApi.ChatInviteLink> L0;
    public List<TdApi.ChatInviteLink> M0;
    public TdApi.ChatInviteLinkCount[] N0;
    public int O0;
    public int P0;
    public boolean[] E0 = {false, false};
    public List<TdApi.ChatInviteLink> Q0 = new ArrayList();
    public Handler R0 = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
            p0.this = r1;
        }

        @Override
        public void handleMessage(Message message) {
            p0.this.Gh((TdApi.ChatInviteLink) message.obj, false);
        }
    }

    public class b extends iq {

        public class a implements m1.e {
            public a() {
                b.this = r1;
            }

            @Override
            public void a7(m1.f fVar, int i10, Object obj) {
                if (i10 == R.id.btn_editRights) {
                    p0.this.Ch();
                } else if (i10 == R.id.btn_openChat) {
                    hj hd2 = p0.this.f24495b.hd();
                    p0 p0Var = p0.this;
                    hd2.h7(p0Var, p0Var.I0, new hj.j().h());
                }
            }

            @Override
            public void t2(m1.f fVar, int i10, Object obj) {
            }
        }

        public b(v4 v4Var) {
            super(v4Var);
            p0.this = r1;
        }

        public m1.e B3(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4 v4Var) {
            cVar.a(R.id.btn_openChat);
            cVar2.a(R.drawable.baseline_forum_24);
            u0Var.a(R.string.OpenChat);
            cVar.a(R.id.btn_editRights);
            cVar2.a(R.drawable.baseline_stars_24);
            u0Var.a(R.string.EditAdminRights);
            fVar.J(true);
            return new a();
        }

        public boolean y3(View view, int i10) {
            if (i10 == R.id.btn_openChat) {
                hj hd2 = p0.this.f24495b.hd();
                p0 p0Var = p0.this;
                hd2.h7(p0Var, p0Var.I0, new hj.j().h());
                return true;
            } else if (i10 != R.id.btn_editRights) {
                return true;
            } else {
                p0.this.Ch();
                return true;
            }
        }

        public boolean z3(View view) {
            p0 p0Var = p0.this;
            p0Var.ee(p0Var.f24495b.e2().J2(p0.this.I0), new int[]{R.id.btn_openChat, R.id.btn_editRights}, new String[]{w.i1(R.string.OpenChat), w.i1(R.string.EditAdminRights)}, null, new int[]{R.drawable.baseline_forum_24, R.drawable.baseline_stars_24}, new h0() {
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
                    boolean y32;
                    y32 = p0.b.this.y3(view2, i10);
                    return y32;
                }
            });
            return true;
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_deleteAllRevokedLinks) {
                cVar.setIconColorId(R.id.theme_color_textNegative);
            } else if (raVar.j() == R.id.btn_inviteLink) {
                TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) raVar.d();
                cVar.setData(p0.this.ih(chatInviteLink));
                cVar.setTag(chatInviteLink);
                cVar.setIconColorId(R.id.theme_color_icon);
            } else {
                if (raVar.j() == R.id.btn_showAdvanced) {
                    boolean z11 = true;
                    if (raVar.l() != 1) {
                        z11 = false;
                    }
                    cVar.setTag(Boolean.valueOf(z11));
                }
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }

        @Override
        public void k2(ra raVar, int i10, EmbeddableStickerView embeddableStickerView, boolean z10) {
            TdApi.Sticker sticker = (TdApi.Sticker) raVar.d();
            embeddableStickerView.setSticker(new l(p0.this.f24495b, sticker, "\u1f973", sticker.type));
            embeddableStickerView.setCaptionText(w.i1(p0.this.F0 ? R.string.ChannelLinkInfo : R.string.LinkInfo));
        }

        @Override
        public void o1(ra raVar, l3 l3Var, ne.w wVar, boolean z10) {
            h hVar = new h(p0.this.f24495b, raVar.m(), true);
            hVar.w(w.q2(R.string.xLinks, raVar.l()));
            hVar.s(true);
            l3Var.setChat(hVar);
            l3Var.setTag(Long.valueOf(raVar.m()));
            if (raVar.j() == R.id.btn_openChat) {
                l3Var.w0(new TdApi.ChatListMain(), p0.this.I0, null);
                l3Var.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean z32;
                        z32 = p0.b.this.z3(view);
                        return z32;
                    }
                });
                l3Var.setPreviewActionListProvider(new i.c() {
                    @Override
                    public final m1.e r6(View view, m1.f fVar, c cVar, c cVar2, u0 u0Var, v4 v4Var) {
                        m1.e B3;
                        B3 = p0.b.this.B3(view, fVar, cVar, cVar2, u0Var, v4Var);
                        return B3;
                    }
                });
                return;
            }
            l3Var.L();
            l3Var.setOnLongClickListener(null);
            l3Var.setPreviewActionListProvider(null);
        }

        @Override
        public void o2(ra raVar, int i10, ne.t1 t1Var) {
            if (raVar.n() > 0) {
                t1Var.B1(w.j1(R.string.format_activeAndRevokedLinks, w.q2(R.string.xActiveLinks, raVar.l()), w.q2(R.string.xRevokedLinks, raVar.n())));
            } else {
                t1Var.B1(w.q2(R.string.xActiveLinks, raVar.l()));
            }
        }

        @Override
        public void q1(ra raVar, TextView textView) {
            textView.setText(id.d.z().I(raVar.u()));
        }
    }

    public class c implements j.b {
        public c() {
            p0.this = r1;
        }

        public boolean l(TdApi.ChatInviteLink chatInviteLink, View view, int i10) {
            if (i10 != R.id.btn_deleteLink) {
                return true;
            }
            p0.this.M0.remove(chatInviteLink);
            p0.this.Mh(chatInviteLink);
            p0.this.xh();
            p0.this.f24495b.v4().o(new TdApi.DeleteRevokedChatInviteLink(p0.this.H0, chatInviteLink.inviteLink), null);
            return true;
        }

        public void m(TdApi.ChatInviteLink chatInviteLink, TdApi.Object object) {
            p0.this.mh(chatInviteLink, (TdApi.ChatInviteLinks) object);
        }

        public void n(final TdApi.ChatInviteLink chatInviteLink, final TdApi.Object object) {
            if (object.getConstructor() == 112891427) {
                p0.this.wd(new Runnable() {
                    @Override
                    public final void run() {
                        p0.c.this.m(chatInviteLink, object);
                    }
                });
            }
        }

        public boolean o(final TdApi.ChatInviteLink chatInviteLink, View view, int i10) {
            if (i10 != R.id.btn_revokeLink) {
                return true;
            }
            p0.this.f24495b.v4().o(new TdApi.RevokeChatInviteLink(p0.this.H0, chatInviteLink.inviteLink), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    p0.c.this.n(chatInviteLink, object);
                }
            });
            return true;
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) p0.this.D0.D0().get(c0Var.l()).d();
            if (chatInviteLink.isRevoked) {
                p0.this.ee(w.i1(R.string.AreYouSureDeleteInviteLink), new int[]{R.id.btn_deleteLink, R.id.btn_cancel}, new String[]{w.i1(R.string.InviteLinkDelete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean l10;
                        l10 = p0.c.this.l(chatInviteLink, view, i10);
                        return l10;
                    }
                });
                return;
            }
            p0 p0Var = p0.this;
            p0Var.ee(w.i1(p0Var.f24495b.O6(p0.this.H0) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{w.i1(R.string.RevokeLink), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean o10;
                    o10 = p0.c.this.o(chatInviteLink, view, i10);
                    return o10;
                }
            });
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            ra raVar = p0.this.D0.D0().get(i10);
            return raVar != null && raVar.j() == R.id.btn_inviteLink;
        }

        @Override
        public float e() {
            return k.a(this);
        }
    }

    public static class d {
        public final long f9035a;
        public final long f9036b;
        public final boolean f9037c;
        public final la f9038d;
        public final v4<?> f9039e;

        public d(long j10, long j11, la laVar, v4<?> v4Var, boolean z10) {
            this.f9035a = j10;
            this.f9036b = j11;
            this.f9038d = laVar;
            this.f9039e = v4Var;
            this.f9037c = z10;
        }
    }

    public p0(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void jh(List list, TdApi.ChatInviteLinks chatInviteLinks, boolean z10, int i10) {
        list.addAll(Arrays.asList(chatInviteLinks.inviteLinks));
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
            if (i11 >= chatInviteLinkArr.length) {
                break;
            }
            TdApi.ChatInviteLink chatInviteLink = chatInviteLinkArr[i11];
            arrayList.add(new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(chatInviteLink), false).G(chatInviteLink));
            if (i11 != chatInviteLinks.inviteLinks.length - 1) {
                arrayList.add(new ra(11));
            }
            i11++;
        }
        if (list.size() < (z10 ? this.P0 : this.O0)) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) w.o2(R.string.StatsXShowMore, Math.min(100, (z10 ? this.P0 : this.O0) - list.size())), false).M(z10 ? 1 : 0));
        }
        this.D0.j1(i10);
        this.D0.Y0(i10, (ra[]) arrayList.toArray(new ra[0]));
        this.E0[z10 ? 1 : 0] = false;
    }

    public void kh(final boolean z10, final List list, final TdApi.ChatInviteLinks chatInviteLinks) {
        final int N0 = this.D0.N0(R.id.btn_showAdvanced, z10 ? 1 : 0);
        if (N0 != -1) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    p0.this.jh(list, chatInviteLinks, z10, N0);
                }
            });
        }
    }

    public void lh(TdApi.ChatInviteLink chatInviteLink) {
        this.M0.remove(chatInviteLink);
        Mh(chatInviteLink);
        xh();
    }

    public boolean nh(View view, int i10) {
        if (i10 == R.id.btn_deleteAllRevokedLinks) {
            List<TdApi.ChatInviteLink> list = this.M0;
            this.M0.clear();
            Nh(this.M0.get(0), list.get(list.size() - 1));
            xh();
            this.f24495b.v4().o(new TdApi.DeleteAllRevokedChatInviteLinks(this.H0, this.I0), null);
        }
        return true;
    }

    public void oh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        if (chatInviteLink != null) {
            Kh(chatInviteLink, chatInviteLink2);
            return;
        }
        Jh(chatInviteLink2);
        xh();
    }

    public void ph(TdApi.Object object) {
        TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
        u7 u7Var = new u7(this.f24493a, this.f24495b);
        u7Var.sg(new u7.d(this.H0, new TdApi.MessageSenderUser(this.I0), false, this.f24495b.O3(this.H0), chatMember).b());
        ac(u7Var);
    }

    public void qh(final TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    p0.this.ph(object);
                }
            });
        }
    }

    public static void rh(b1.a aVar, TdApi.Object object) {
        if (object.getConstructor() == 920326637) {
            aVar.a((TdApi.ChatInviteLinkCounts) object);
        } else if (object.getConstructor() == -1679978726) {
            j0.t0(object);
        }
    }

    public void sh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.O0 = chatInviteLinks.totalCount;
        this.L0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        Fh(true, false, "", new b1.a() {
            @Override
            public final void a(Object obj) {
                p0.this.uh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public void th(TdApi.ChatInviteLinkCounts chatInviteLinkCounts) {
        this.N0 = chatInviteLinkCounts.inviteLinkCounts;
        wd(new k0(this));
    }

    public void uh(TdApi.ChatInviteLinks chatInviteLinks) {
        this.P0 = chatInviteLinks.totalCount;
        this.M0 = new ArrayList(Arrays.asList(chatInviteLinks.inviteLinks));
        if (this.G0) {
            Dh(new b1.a() {
                @Override
                public final void a(Object obj) {
                    p0.this.th((TdApi.ChatInviteLinkCounts) obj);
                }
            });
        } else {
            wd(new k0(this));
        }
    }

    public static void vh(b1.a aVar, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            aVar.a((TdApi.ChatInviteLinks) object);
        } else if (object.getConstructor() == -1679978726) {
            j0.t0(object);
        }
    }

    public final void mh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLinks chatInviteLinks) {
        if (chatInviteLinks.inviteLinks.length > 0) {
            this.L0.remove(chatInviteLink);
            this.M0.add(0, chatInviteLinks.inviteLinks[0]);
            if (chatInviteLink.isPrimary) {
                TdApi.ChatInviteLink[] chatInviteLinkArr = chatInviteLinks.inviteLinks;
                if (chatInviteLinkArr.length > 1) {
                    TdApi.ChatInviteLink chatInviteLink2 = chatInviteLinkArr[1];
                    this.K0 = chatInviteLink2;
                    this.L0.add(0, chatInviteLink2);
                    Kh(chatInviteLink, this.K0);
                    Lh(null, this.M0.get(0));
                    xh();
                    if (this.J0 != null && this.G0 && this.I0 == c().fa()) {
                        this.J0.q4(this.K0);
                        return;
                    }
                    return;
                }
            }
            Lh(chatInviteLink, this.M0.get(0));
        }
    }

    public final void Bh() {
        hh();
        n9();
    }

    public final void Ch() {
        this.f24495b.v4().o(new TdApi.GetChatMember(this.H0, new TdApi.MessageSenderUser(this.I0)), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p0.this.qh(object);
            }
        });
    }

    public final void Dh(final b1.a<TdApi.ChatInviteLinkCounts> aVar) {
        this.f24495b.v4().o(new TdApi.GetChatInviteLinkCounts(this.H0), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p0.rh(a.this, object);
            }
        });
    }

    public final void Eh() {
        Fh(false, false, "", new b1.a() {
            @Override
            public final void a(Object obj) {
                p0.this.sh((TdApi.ChatInviteLinks) obj);
            }
        });
    }

    public final void Fh(boolean z10, boolean z11, String str, final b1.a<TdApi.ChatInviteLinks> aVar) {
        this.f24495b.v4().o(new TdApi.GetChatInviteLinks(this.H0, this.I0, z10, 0, str, z11 ? 100 : 20), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p0.vh(a.this, object);
            }
        });
    }

    public final void Gh(TdApi.ChatInviteLink chatInviteLink, boolean z10) {
        if (!z10) {
            this.D0.o3(chatInviteLink);
        }
        if (!chatInviteLink.isRevoked) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (timeUnit.toMillis(chatInviteLink.expirationDate) >= this.f24495b.H4()) {
                long M0 = w.M0(chatInviteLink.expirationDate, timeUnit, this.f24495b.H4(), TimeUnit.MILLISECONDS, true, 0);
                if (M0 != -1) {
                    this.Q0.add(chatInviteLink);
                    Handler handler = this.R0;
                    handler.sendMessageDelayed(Message.obtain(handler, 0, chatInviteLink), M0);
                    return;
                }
                return;
            }
        }
        this.R0.removeMessages(0, chatInviteLink);
        this.Q0.remove(chatInviteLink);
    }

    public void Hh(d dVar) {
        super.Ad(dVar);
        this.H0 = dVar.f9035a;
        this.I0 = dVar.f9036b;
        this.J0 = dVar.f9038d;
        this.F0 = this.f24495b.O6(dVar.f9035a);
        this.G0 = dVar.f9037c;
    }

    public final String Ih(TdApi.ChatInviteLink chatInviteLink) {
        String str = chatInviteLink.name;
        if (str != null && !str.isEmpty()) {
            return chatInviteLink.name;
        }
        String[] split = chatInviteLink.inviteLink.split("/");
        return split[split.length - 1];
    }

    public void Jh(TdApi.ChatInviteLink chatInviteLink) {
        int L0 = this.D0.L0(R.id.btn_createInviteLink) + 1;
        this.D0.s0(L0, new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(chatInviteLink), false).G(chatInviteLink));
        this.D0.s0(L0, new ra(11));
        Gh(chatInviteLink, true);
        this.O0++;
        Ph();
    }

    public void Kh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int J0 = this.D0.J0(chatInviteLink);
        ra C0 = this.D0.C0(J0);
        if (C0 != null) {
            C0.X(Ih(chatInviteLink2));
            C0.G(chatInviteLink2);
            this.D0.I(J0);
        }
    }

    public void Lh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int i10;
        int L0;
        boolean z10 = this.M0.size() == 1;
        ra G = new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(chatInviteLink2), false).G(chatInviteLink2);
        ra raVar = new ra(11);
        if (chatInviteLink != null) {
            iq iqVar = this.D0;
            iqVar.R1(iqVar.J0(chatInviteLink) - 1, 2);
        }
        if (z10) {
            TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr = this.N0;
            if (chatInviteLinkCountArr == null || chatInviteLinkCountArr.length <= 1) {
                if (this.L0.size() > 1) {
                    iq iqVar2 = this.D0;
                    List<TdApi.ChatInviteLink> list = this.L0;
                    L0 = iqVar2.J0(list.get(list.size() - 1));
                } else if (this.D0.L0(R.id.btn_createInviteLink) == -1) {
                    i10 = this.D0.R0(9) + 3;
                } else {
                    L0 = this.D0.L0(R.id.btn_createInviteLink);
                }
                i10 = L0 + 2;
            } else {
                i10 = this.D0.J0(chatInviteLinkCountArr[chatInviteLinkCountArr.length - 1]) + 1;
            }
            ra[] raVarArr = {new ra(8, 0, 0, R.string.RevokedInviteLinks), new ra(2), new ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).d0(R.id.theme_color_textNegative), new ra(11), G, new ra(3)};
            iq iqVar3 = this.D0;
            iqVar3.Y0(Math.min(i10 + 1, iqVar3.D()), raVarArr);
        } else {
            int J0 = this.D0.J0(this.M0.get(1)) - 1;
            this.D0.s0(J0, G);
            this.D0.s0(J0, raVar);
        }
        if (this.I0 != this.f24495b.fa() && this.L0.size() == 1) {
            if (!chatInviteLink2.isPrimary) {
                iq iqVar4 = this.D0;
                iqVar4.R1(iqVar4.L0(R.id.btn_inviteLink) + 3, 3);
            } else {
                return;
            }
        }
        if (chatInviteLink2.isPrimary) {
            this.P0++;
        } else {
            this.P0++;
            this.O0--;
        }
        Ph();
    }

    public void Mh(TdApi.ChatInviteLink chatInviteLink) {
        int J0 = this.D0.J0(chatInviteLink);
        if (this.M0.isEmpty()) {
            this.D0.R1(J0 - 4, 6);
        } else {
            this.D0.R1(J0 - 1, 2);
        }
        this.P0--;
        Ph();
    }

    public void Nh(TdApi.ChatInviteLink chatInviteLink, TdApi.ChatInviteLink chatInviteLink2) {
        int J0 = this.D0.J0(chatInviteLink);
        int J02 = this.D0.J0(chatInviteLink2);
        this.D0.R1(J0 - 4, (J02 - J0) + 6);
    }

    public void Oh(long j10, int i10) {
        int P0 = this.D0.P0(j10);
        ra C0 = this.D0.C0(P0);
        if (C0 != null) {
            C0.M(i10);
            this.D0.I(P0);
        }
        Ph();
    }

    public final void Ph() {
        int R0 = this.D0.R0(42);
        ra C0 = this.D0.C0(R0);
        if (C0 != null) {
            int i10 = 0;
            int i11 = 0;
            for (ra raVar : this.D0.D0()) {
                if (raVar.j() == R.id.btn_openAdminInviteLinks) {
                    i10 += raVar.l();
                    i11 = (int) (i11 + raVar.n());
                }
            }
            int i12 = i10 + this.O0;
            int i13 = i11 + this.P0;
            C0.M(i12).O(i13);
            this.D0.r3(R0);
            if (x9().f9039e != null && (x9().f9039e instanceof so)) {
                ((so) x9().f9039e).hm(i12, i13);
            }
        }
    }

    @Override
    public int R9() {
        return R.id.controller_chatLinks;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.InviteLinks);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.R0.removeMessages(0);
        t1.b().d(this);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void c6() {
        super.c6();
        this.R0.removeMessages(0);
    }

    @Override
    public boolean dc() {
        return this.L0 == null;
    }

    @Override
    public void e2() {
        this.D0.q3(this.H0);
    }

    public final void hh() {
        Iterator<TdApi.ChatInviteLink> it;
        ArrayList arrayList = new ArrayList();
        int size = this.L0.size() - 1;
        int size2 = this.M0.size() - 1;
        boolean z10 = this.I0 != this.f24495b.fa();
        int i10 = 3;
        if (z10) {
            arrayList.add(new ra(63, R.id.btn_openChat).N(this.I0).M(this.L0.size()));
            arrayList.add(new ra(3));
        } else {
            arrayList.add(new ra(14));
            arrayList.add(new ra(130).G(this.f24495b.p5("\u1f973")));
        }
        Iterator<TdApi.ChatInviteLink> it2 = this.L0.iterator();
        boolean z11 = true;
        boolean z12 = false;
        while (it2.hasNext()) {
            TdApi.ChatInviteLink next = it2.next();
            if (!next.isPrimary || z12) {
                it2 = it2;
                arrayList.add(new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(next), false).G(next));
                Gh(next, true);
                if (this.L0.indexOf(next) != size) {
                    arrayList.add(new ra(11));
                }
                i10 = 3;
            } else {
                this.K0 = next;
                arrayList.add(new ra(8, 0, 0, R.string.PrimaryInviteLink));
                arrayList.add(new ra(2));
                arrayList.add(new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(next), false).G(next));
                arrayList.add(new ra(i10));
                if (z10) {
                    it = it2;
                    arrayList.add(new ra(9, 0, 0, w.H0(new y8(this.f24493a, this.f24495b), R.string.InviteLinkOtherAdminHint, t2.r2(this.f24495b.e2().u2(this.I0)), this.f24495b.U3(this.H0)), false).N(this.H0));
                    z11 = this.L0.size() > 1;
                } else {
                    it = it2;
                }
                if (z11) {
                    arrayList.add(new ra(8, 0, 0, R.string.AdditionalInviteLinks));
                    arrayList.add(new ra(2));
                    if (!z10) {
                        arrayList.add(new ra(4, R.id.btn_createInviteLink, R.drawable.baseline_add_link_24, R.string.CreateLink));
                    }
                    if (this.L0.size() > 1) {
                        arrayList.add(new ra(11));
                    }
                }
                it2 = it;
                i10 = 3;
                z12 = true;
            }
        }
        if (this.L0.size() < this.O0) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) w.o2(R.string.StatsXShowMore, Math.min(100, this.O0 - this.L0.size())), false).M(0));
        }
        if (z11) {
            arrayList.add(new ra(3));
            if (!z10) {
                arrayList.add(new ra(9, 0, 0, R.string.AdditionalInviteLinksHint));
            }
        }
        TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr = this.N0;
        if (chatInviteLinkCountArr != null && chatInviteLinkCountArr.length > 1) {
            arrayList.add(new ra(8, 0, 0, R.string.OtherAdminsInviteLinks));
            arrayList.add(new ra(2));
            int i11 = 0;
            while (true) {
                TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr2 = this.N0;
                if (i11 >= chatInviteLinkCountArr2.length) {
                    break;
                }
                TdApi.ChatInviteLinkCount chatInviteLinkCount = chatInviteLinkCountArr2[i11];
                if (chatInviteLinkCount.userId != this.f24495b.fa()) {
                    arrayList.add(new ra(63, R.id.btn_openAdminInviteLinks).N(chatInviteLinkCount.userId).M(chatInviteLinkCount.inviteLinkCount).O(chatInviteLinkCount.revokedInviteLinkCount).G(chatInviteLinkCount));
                    if (i11 != this.N0.length - 1) {
                        arrayList.add(new ra(11));
                    }
                }
                i11++;
            }
            arrayList.add(new ra(3));
        }
        if (!this.M0.isEmpty()) {
            arrayList.add(new ra(8, 0, 0, R.string.RevokedInviteLinks));
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, R.id.btn_deleteAllRevokedLinks, R.drawable.baseline_delete_24, R.string.DeleteAllRevokedLinks).d0(R.id.theme_color_textNegative));
            arrayList.add(new ra(11));
            for (TdApi.ChatInviteLink chatInviteLink : this.M0) {
                arrayList.add(new ra(5, (int) R.id.btn_inviteLink, 0, (CharSequence) Ih(chatInviteLink), false).G(chatInviteLink));
                if (this.M0.indexOf(chatInviteLink) != size2) {
                    arrayList.add(new ra(11));
                }
            }
            if (this.M0.size() < this.P0) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) w.o2(R.string.StatsXShowMore, Math.min(100, this.P0 - this.M0.size())), false).M(1));
            }
            arrayList.add(new ra(3));
        }
        arrayList.add(new ra(42));
        this.D0.s2(arrayList, false);
        Ph();
    }

    public final CharSequence ih(TdApi.ChatInviteLink chatInviteLink) {
        int i10;
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long H4 = this.f24495b.H4();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(chatInviteLink.expirationDate) - H4;
        int i13 = chatInviteLink.memberCount;
        if (i13 > 0) {
            spannableStringBuilder.append(w.q2(R.string.InviteLinkJoins, i13));
        } else if (chatInviteLink.isPrimary || chatInviteLink.memberLimit == 0 || (i13 == 0 && chatInviteLink.isRevoked)) {
            spannableStringBuilder.append((CharSequence) w.i1(R.string.InviteLinkNoJoins));
        }
        if (chatInviteLink.isPrimary) {
            return spannableStringBuilder.toString();
        }
        String str = " • ";
        spannableStringBuilder.append((CharSequence) str);
        if (chatInviteLink.createsJoinRequest && (i12 = chatInviteLink.pendingJoinRequestCount) > 0) {
            spannableStringBuilder.append(w.q2(R.string.xRequests, i12)).append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i11 = chatInviteLink.memberLimit) > 0) {
            int i14 = chatInviteLink.memberCount;
            if (i14 == i11) {
                spannableStringBuilder.append((CharSequence) w.i1(R.string.InviteLinkMemberLimitReached));
            } else {
                spannableStringBuilder.append(w.q2(R.string.InviteLinkRemains, i11 - i14));
            }
            if (chatInviteLink.expirationDate == 0) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (!chatInviteLink.isRevoked && (i10 = chatInviteLink.expirationDate) != 0) {
            if (millis > 0) {
                spannableStringBuilder.append(w.f1(i10, timeUnit, H4, TimeUnit.MILLISECONDS, true, 0, R.string.InviteLinkExpires, false));
            } else {
                spannableStringBuilder.append(w.m1(R.string.InviteLinkExpiredAt, w.y1(i10, timeUnit)));
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
    public void o6() {
        super.o6();
        Iterator it = new ArrayList(this.Q0).iterator();
        while (it.hasNext()) {
            Gh((TdApi.ChatInviteLink) it.next(), false);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_createInviteLink:
                s6 s6Var = new s6(this.f24493a, this.f24495b);
                s6Var.Qf(new s6.c(null, this.H0, this));
                ac(s6Var);
                return;
            case R.id.btn_deleteAllRevokedLinks:
                ee(w.i1(R.string.AreYouSureDeleteAllInviteLinks), new int[]{R.id.btn_deleteAllRevokedLinks, R.id.btn_cancel}, new String[]{w.i1(R.string.DeleteAllRevokedLinks), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean nh;
                        nh = p0.this.nh(view2, i10);
                        return nh;
                    }
                });
                return;
            case R.id.btn_inviteLink:
                final TdApi.ChatInviteLink chatInviteLink = (TdApi.ChatInviteLink) view.getTag();
                this.f24495b.hd().A8(this, chatInviteLink, this.H0, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        p0.this.lh(chatInviteLink);
                    }
                }, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        p0.this.mh(chatInviteLink, (TdApi.ChatInviteLinks) obj);
                    }
                });
                return;
            case R.id.btn_openAdminInviteLinks:
                p0 p0Var = new p0(this.f24493a, this.f24495b);
                p0Var.Hh(new d(this.H0, ((Long) view.getTag()).longValue(), null, this, false));
                ac(p0Var);
                return;
            case R.id.btn_openChat:
                Ch();
                return;
            case R.id.btn_showAdvanced:
                wh(((Boolean) view.getTag()).booleanValue());
                return;
            default:
                return;
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.D0 = new b(this);
        Eh();
        customRecyclerView.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        customRecyclerView.setAdapter(this.D0);
        t1.b().a(this);
        j.a(customRecyclerView, new c());
    }

    public final void wh(final boolean z10) {
        boolean[] zArr = this.E0;
        if (!zArr[z10 ? 1 : 0]) {
            zArr[z10] = true;
            final List<TdApi.ChatInviteLink> list = z10 != 0 ? this.M0 : this.L0;
            Fh(z10, true, list.get(list.size() - 1).inviteLink, new b1.a() {
                @Override
                public final void a(Object obj) {
                    p0.this.kh(z10, list, (TdApi.ChatInviteLinks) obj);
                }
            });
        }
    }

    public final void xh() {
        Oh(this.I0, this.L0.size());
        if (x9().f9039e != null && (x9().f9039e instanceof p0)) {
            ((p0) x9().f9039e).Oh(this.I0, this.L0.size());
        }
    }

    public void yh(String str) {
        TdApi.ChatInviteLink chatInviteLink;
        Iterator<TdApi.ChatInviteLink> it = this.L0.iterator();
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
            zh(chatInviteLink, chatInviteLink);
        }
    }

    public void zh(final TdApi.ChatInviteLink chatInviteLink, final TdApi.ChatInviteLink chatInviteLink2) {
        if (chatInviteLink2 != null) {
            int indexOf = this.L0.indexOf(chatInviteLink2);
            this.L0.remove(chatInviteLink2);
            this.L0.add(indexOf, chatInviteLink);
        } else {
            this.L0.add(1, chatInviteLink);
        }
        vd(new Runnable() {
            @Override
            public final void run() {
                p0.this.oh(chatInviteLink2, chatInviteLink);
            }
        }, 250L);
    }
}
