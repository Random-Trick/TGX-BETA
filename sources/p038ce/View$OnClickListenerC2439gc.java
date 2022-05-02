package p038ce;

import android.content.Context;
import android.view.View;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import gd.C4614d3;
import gd.C4618d7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import me.C6862d3;
import me.C6981o;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p039d.C3563j;
import p053dd.C4022o;
import p082fd.C4403w;
import p139jb.AbstractC5917i;
import p193nb.C7319d;
import p208oc.C7833i;
import p208oc.C7846r;
import p291uc.C9494a1;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2439gc extends AbstractC3204vo<C2441b> implements View.OnClickListener {
    public C2546iq f8396D0;
    public TdApi.FoundMessages f8397E0;
    public TdApi.MessageStatistics f8398F0;
    public int f8399G0;

    public class C2440a extends C2546iq {
        public C2440a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo8030D2(C2964ra raVar, int i, C9494a1 a1Var) {
            TdApi.Message message = (TdApi.Message) raVar.m32847d();
            if (message.interactionInfo != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C4403w.m27846o2(R.string.xViews, message.interactionInfo.viewCount));
                if (message.interactionInfo.forwardCount > 0) {
                    sb2.append(", ");
                    sb2.append(C4403w.m27846o2(R.string.StatsXShared, message.interactionInfo.forwardCount));
                }
                a1Var.m8490E1(message, null, sb2.toString(), true);
            } else {
                a1Var.m8490E1(message, null, null, false);
            }
            C10189d.m5797g(a1Var);
            a1Var.setContentInset(C1357a0.m37544i(8.0f));
        }

        @Override
        public void mo34065J2(C2964ra raVar, int i, C6862d3 d3Var) {
            if (raVar.m32838j() == R.id.separator) {
                d3Var.m18736c((C1357a0.m37544i(8.0f) * 2) + C1357a0.m37544i(40.0f), 0.0f);
            } else {
                super.mo34065J2(raVar, i, d3Var);
            }
        }

        @Override
        public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
            TdApi.Message message = (TdApi.Message) raVar.m32847d();
            TdApi.Chat U2 = View$OnClickListenerC2439gc.this.f30170b.m2632U2(message.chatId);
            C4618d7 d7Var = new C4618d7(View$OnClickListenerC2439gc.this.f30170b, U2);
            d7Var.m26865y(message.chatId, U2);
            TdApi.MessageInteractionInfo messageInteractionInfo = message.interactionInfo;
            if (messageInteractionInfo != null) {
                d7Var.m26864z(C4403w.m27846o2(R.string.xViews, messageInteractionInfo.viewCount));
            } else {
                d7Var.m26864z("");
            }
            d7Var.m26887b();
            oVar.setUser(d7Var);
            oVar.m18493w0(null, message.chatId, null, new C7319d(message.chatId, message.f25409id), null);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            switch (raVar.m32838j()) {
                case R.id.btn_statsPrivateShares:
                case R.id.btn_statsPublicShares:
                case R.id.btn_statsPublishDate:
                case R.id.btn_statsSignature:
                case R.id.btn_statsViewCount:
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    cVar.setTextColorId(0);
                    if (raVar.m32847d() instanceof String) {
                        cVar.setName(raVar.m32847d().toString());
                    } else {
                        cVar.setName(C1363c0.m37440f(((Integer) raVar.m32847d()).intValue()));
                    }
                    cVar.setData(raVar.m32827u());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setMessage(new C4614d3(View$OnClickListenerC2439gc.this.f30170b, new TdApi.ChatListMain(), View$OnClickListenerC2439gc.this.f30170b.m2632U2(View$OnClickListenerC2439gc.this.m9131x9().f8401a), (TdApi.Message) raVar.m32847d(), ""));
        }
    }

    public View$OnClickListenerC2439gc(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34506Lg(final TdApi.Object object, TdApi.Object object2) {
        if (object2.getConstructor() == -529809608) {
            this.f8397E0 = (TdApi.FoundMessages) object2;
        }
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2439gc.this.m34507Kg(object);
            }
        });
    }

    public void m34505Mg(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -1011383888) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetMessagePublicForwards(m9131x9().f8401a, m9131x9().f8402b.f25409id, "", 20), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    View$OnClickListenerC2439gc.this.m34506Lg(object, object2);
                }
            });
        }
    }

    public void m34504Ng(List list, C7833i iVar, Runnable runnable, boolean z) {
        if (!m9347Sa()) {
            int i = this.f8399G0 - 1;
            this.f8399G0 = i;
            if (i == 0) {
                m9204n9();
            }
            if (z) {
                int indexOf = list.indexOf(iVar);
                int i2 = indexOf;
                int i3 = -1;
                while (i3 == -1) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    i3 = this.f8396D0.m34227N0(((C7833i) list.get(i2)).m14919j());
                }
                if (i3 != -1) {
                    i3 += 2;
                } else {
                    while (i3 == -1) {
                        indexOf++;
                        if (indexOf >= list.size()) {
                            break;
                        }
                        i3 = this.f8396D0.m34227N0(((C7833i) list.get(indexOf)).m14919j());
                    }
                    if (i3 != -1) {
                        i3 -= 2;
                    }
                }
                if (i3 == -1) {
                    i3 = this.f8396D0.mo6153D();
                }
                this.f8396D0.m34191b1(i3, new C2964ra(101).m32873G(iVar), new C2964ra(2), new C2964ra(iVar.m14916m(), iVar.m14919j()).m32873G(iVar), new C2964ra(3));
            }
            if (this.f8399G0 == 0) {
                runnable.run();
            }
        }
    }

    public final void m34503Og(List<TdApi.Message> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(70, 0, 0, R.string.general_Messages));
        boolean z = true;
        for (TdApi.Message message : list) {
            if (z) {
                arrayList.add(new C2964ra(2));
                z = false;
            } else {
                arrayList.add(new C2964ra(11, R.id.separator));
            }
            arrayList.add(new C2964ra(C3563j.f11962M0, R.id.btn_messageMore).m32873G(message));
        }
        arrayList.add(new C2964ra(3));
        this.f8396D0.m34119x2(arrayList, false);
        m9204n9();
    }

    public final void m34502Pg(List<C2964ra> list, final List<C7833i> list2, final Runnable runnable) {
        if (list2 != null) {
            for (final C7833i iVar : list2) {
                if (iVar.m14913p()) {
                    this.f8399G0++;
                    iVar.m14908u(new AbstractC5917i() {
                        @Override
                        public final void mo1322a(boolean z) {
                            View$OnClickListenerC2439gc.this.m34504Ng(list2, iVar, runnable, z);
                        }
                    });
                } else if (!iVar.m14912q()) {
                    list.add(new C2964ra(101).m32873G(iVar));
                    list.add(new C2964ra(2));
                    list.add(new C2964ra(iVar.m14916m(), iVar.m14919j()).m32873G(iVar));
                    list.add(new C2964ra(3));
                }
            }
        }
        this.f8396D0.m34119x2(list, false);
        if (this.f8399G0 == 0) {
            m9204n9();
            runnable.run();
        }
    }

    public final void m34501Qg() {
        TdApi.FoundMessages foundMessages = this.f8397E0;
        if (!(foundMessages == null || foundMessages.messages.length == 0)) {
            int N0 = this.f8396D0.m34227N0(R.id.btn_statsPrivateShares) + 1;
            this.f8396D0.m34243F0().add(N0, new C2964ra(89, (int) R.id.btn_statsPublicShares, 0, (int) R.string.StatsMessageSharesPublic, false).m32873G(Integer.valueOf(this.f8397E0.totalCount)));
            this.f8396D0.m34243F0().add(N0, new C2964ra(11));
            this.f8396D0.m39311M(N0, 2);
            int D = this.f8396D0.mo6153D();
            this.f8396D0.m34243F0().add(new C2964ra(106).m32873G(new C7846r(R.string.StatsMessageSharesPublic, null)));
            this.f8396D0.m34243F0().add(new C2964ra(2));
            for (int i = 0; i < this.f8397E0.messages.length; i++) {
                this.f8396D0.m34243F0().add(new C2964ra(27, R.id.chat).m32873G(this.f8397E0.messages[i]));
                if (i != this.f8397E0.messages.length - 1) {
                    this.f8396D0.m34243F0().add(new C2964ra(11));
                }
            }
            this.f8396D0.m34243F0().add(new C2964ra(3));
            C2546iq iqVar = this.f8396D0;
            iqVar.m39311M(D, iqVar.m34243F0().size());
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_stats_message;
    }

    public final void m34507Kg(TdApi.MessageStatistics messageStatistics) {
        this.f8398F0 = messageStatistics;
        int i = m9131x9().f8402b.interactionInfo.forwardCount;
        TdApi.FoundMessages foundMessages = this.f8397E0;
        if (foundMessages != null) {
            i -= foundMessages.totalCount;
        }
        TdApi.Message message = m9131x9().f8402b;
        Objects.requireNonNull(message);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(57, R.id.btn_openChat).m32873G(m9131x9().f8402b));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(2));
        if (message.interactionInfo != null) {
            arrayList.add(new C2964ra(89, (int) R.id.btn_statsViewCount, 0, (int) R.string.StatsMessageViewCount, false).m32873G(Integer.valueOf(message.interactionInfo.viewCount)));
            arrayList.add(new C2964ra(11));
        }
        if (message.authorSignature.length() > 0) {
            arrayList.add(new C2964ra(89, (int) R.id.btn_statsSignature, 0, (int) R.string.StatsMessageSignature, false).m32873G(message.authorSignature));
            arrayList.add(new C2964ra(11));
        }
        arrayList.add(new C2964ra(89, (int) R.id.btn_statsPublishDate, 0, (int) R.string.StatsMessagePublishDate, false).m32873G(C4403w.m27807y1(message.date, TimeUnit.SECONDS)));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_statsPrivateShares, 0, (int) R.string.StatsMessageSharesPrivate, false).m32873G(Integer.valueOf(i)));
        arrayList.add(new C2964ra(3));
        m34502Pg(arrayList, Collections.singletonList(new C7833i(R.id.stats_messageInteraction, this.f30170b, m9131x9().f8401a, R.string.StatsChartInteractions, 0, messageStatistics.messageInteractionGraph, 0)), new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2439gc.this.m34501Qg();
            }
        });
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.StatsMessageInfo);
    }

    @Override
    public boolean mo9270dc() {
        return this.f8398F0 == null || this.f8399G0 > 0;
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (view.getId() == R.id.chat) {
            C4618d7 user = ((C4022o) view).getUser();
            if (user != null) {
                this.f30170b.m2485dd().m3569h7(this, user.m26882h(), new HandlerC10770jj.C10780j().m3371e(new C7319d(user.m26882h(), ((TdApi.Message) raVar.m32847d()).f25409id)).m3368h());
            }
        } else if (view.getId() == R.id.btn_messageMore) {
            View$OnClickListenerC2439gc gcVar = new View$OnClickListenerC2439gc(this.f30168a, this.f30170b);
            gcVar.m9476Ad(new C2441b(m9131x9().f8401a, (TdApi.Message) raVar.m32847d()));
            m9291ac(gcVar);
        } else if (view.getId() == R.id.btn_openChat) {
            this.f30170b.m2485dd().m3459s7(this, (TdApi.Message) raVar.m32847d(), null);
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2440a aVar = new C2440a(this);
        this.f8396D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        if (m9131x9().f8403c != null) {
            m34503Og(m9131x9().f8403c);
        } else {
            this.f30170b.m2270r4().m14783o(new TdApi.GetMessageStatistics(m9131x9().f8401a, m9131x9().f8402b.f25409id, C11524j.m141z0()), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2439gc.this.m34505Mg(object);
                }
            });
        }
    }

    public static class C2441b {
        public final long f8401a;
        public TdApi.Message f8402b;
        public List<TdApi.Message> f8403c;

        public C2441b(long j, TdApi.Message message) {
            this.f8401a = j;
            this.f8402b = message;
        }

        public C2441b(long j, List<TdApi.Message> list) {
            this.f8401a = j;
            this.f8403c = list;
        }
    }
}
