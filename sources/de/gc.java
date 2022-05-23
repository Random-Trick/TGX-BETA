package de;

import android.content.Context;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.j0;
import d.j;
import ed.o;
import gd.w;
import hd.d7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ne.d3;
import ob.d;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import pc.i;
import pc.r;
import uc.c;
import ud.v4;
import vc.z0;
import zd.hj;
import zd.o6;

public class gc extends vo<b> implements View.OnClickListener {
    public iq D0;
    public TdApi.FoundMessages E0;
    public TdApi.MessageStatistics F0;
    public int G0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void F2(ra raVar, int i10, d3 d3Var) {
            if (raVar.j() == R.id.separator) {
                d3Var.c((a0.i(8.0f) * 2) + a0.i(40.0f), 0.0f);
            } else {
                super.F2(raVar, i10, d3Var);
            }
        }

        @Override
        public void Q2(ra raVar, int i10, o oVar, boolean z10) {
            TdApi.Message message = (TdApi.Message) raVar.d();
            TdApi.Chat W2 = gc.this.f24495b.W2(message.chatId);
            d7 d7Var = new d7(gc.this.f24495b, W2);
            d7Var.y(message.chatId, W2);
            TdApi.MessageInteractionInfo messageInteractionInfo = message.interactionInfo;
            if (messageInteractionInfo != null) {
                d7Var.z(w.o2(R.string.xViews, messageInteractionInfo.viewCount));
            } else {
                d7Var.z("");
            }
            d7Var.b();
            oVar.setUser(d7Var);
            oVar.y0(null, message.chatId, null, new d(message.chatId, message.f19946id), null);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            switch (raVar.j()) {
                case R.id.btn_statsPrivateShares:
                case R.id.btn_statsPublicShares:
                case R.id.btn_statsPublishDate:
                case R.id.btn_statsSignature:
                case R.id.btn_statsViewCount:
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    cVar.setTextColorId(0);
                    if (raVar.d() instanceof String) {
                        cVar.setName(raVar.d().toString());
                    } else {
                        cVar.setName(c0.f(((Integer) raVar.d()).intValue()));
                    }
                    cVar.setData(raVar.u());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void Y1(ra raVar, int i10, ne.o oVar) {
            oVar.setMessage(new hd.d3(gc.this.f24495b, new TdApi.ChatListMain(), gc.this.f24495b.W2(gc.this.x9().f8098a), (TdApi.Message) raVar.d(), ""));
        }

        @Override
        public void z2(ra raVar, int i10, z0 z0Var) {
            TdApi.Message message = (TdApi.Message) raVar.d();
            if (message.interactionInfo != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.o2(R.string.xViews, message.interactionInfo.viewCount));
                if (message.interactionInfo.forwardCount > 0) {
                    sb2.append(", ");
                    sb2.append(w.o2(R.string.StatsXShared, message.interactionInfo.forwardCount));
                }
                z0Var.C1(message, null, sb2.toString(), true);
            } else {
                z0Var.C1(message, null, null, false);
            }
            yd.d.g(z0Var);
            z0Var.setContentInset(a0.i(8.0f));
        }
    }

    public gc(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Lg(final TdApi.Object object, TdApi.Object object2) {
        if (object2.getConstructor() == -529809608) {
            this.E0 = (TdApi.FoundMessages) object2;
        }
        wd(new Runnable() {
            @Override
            public final void run() {
                gc.this.Kg(object);
            }
        });
    }

    public void Mg(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -1011383888) {
            this.f24495b.v4().o(new TdApi.GetMessagePublicForwards(x9().f8098a, x9().f8099b.f19946id, "", 20), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    gc.this.Lg(object, object2);
                }
            });
        }
    }

    public void Ng(List list, i iVar, Runnable runnable, boolean z10) {
        if (!Sa()) {
            int i10 = this.G0 - 1;
            this.G0 = i10;
            if (i10 == 0) {
                n9();
            }
            if (z10) {
                int indexOf = list.indexOf(iVar);
                int i11 = indexOf;
                int i12 = -1;
                while (i12 == -1) {
                    i11--;
                    if (i11 < 0) {
                        break;
                    }
                    i12 = this.D0.L0(((i) list.get(i11)).j());
                }
                if (i12 != -1) {
                    i12 += 2;
                } else {
                    while (i12 == -1) {
                        indexOf++;
                        if (indexOf >= list.size()) {
                            break;
                        }
                        i12 = this.D0.L0(((i) list.get(indexOf)).j());
                    }
                    if (i12 != -1) {
                        i12 -= 2;
                    }
                }
                if (i12 == -1) {
                    i12 = this.D0.D();
                }
                this.D0.Y0(i12, new ra(101).G(iVar), new ra(2), new ra(iVar.m(), iVar.j()).G(iVar), new ra(3));
            }
            if (this.G0 == 0) {
                runnable.run();
            }
        }
    }

    public final void Og(List<TdApi.Message> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(70, 0, 0, R.string.general_Messages));
        boolean z10 = true;
        for (TdApi.Message message : list) {
            if (z10) {
                arrayList.add(new ra(2));
                z10 = false;
            } else {
                arrayList.add(new ra(11, R.id.separator));
            }
            arrayList.add(new ra(j.M0, R.id.btn_messageMore).G(message));
        }
        arrayList.add(new ra(3));
        this.D0.s2(arrayList, false);
        n9();
    }

    public final void Pg(List<ra> list, final List<i> list2, final Runnable runnable) {
        if (list2 != null) {
            for (final i iVar : list2) {
                if (iVar.p()) {
                    this.G0++;
                    iVar.u(new kb.i() {
                        @Override
                        public final void a(boolean z10) {
                            gc.this.Ng(list2, iVar, runnable, z10);
                        }
                    });
                } else if (!iVar.q()) {
                    list.add(new ra(101).G(iVar));
                    list.add(new ra(2));
                    list.add(new ra(iVar.m(), iVar.j()).G(iVar));
                    list.add(new ra(3));
                }
            }
        }
        this.D0.s2(list, false);
        if (this.G0 == 0) {
            n9();
            runnable.run();
        }
    }

    public final void Qg() {
        TdApi.FoundMessages foundMessages = this.E0;
        if (!(foundMessages == null || foundMessages.messages.length == 0)) {
            int L0 = this.D0.L0(R.id.btn_statsPrivateShares) + 1;
            this.D0.D0().add(L0, new ra(89, (int) R.id.btn_statsPublicShares, 0, (int) R.string.StatsMessageSharesPublic, false).G(Integer.valueOf(this.E0.totalCount)));
            this.D0.D0().add(L0, new ra(11));
            this.D0.M(L0, 2);
            int D = this.D0.D();
            this.D0.D0().add(new ra(106).G(new r(R.string.StatsMessageSharesPublic, null)));
            this.D0.D0().add(new ra(2));
            for (int i10 = 0; i10 < this.E0.messages.length; i10++) {
                this.D0.D0().add(new ra(27, R.id.chat).G(this.E0.messages[i10]));
                if (i10 != this.E0.messages.length - 1) {
                    this.D0.D0().add(new ra(11));
                }
            }
            this.D0.D0().add(new ra(3));
            iq iqVar = this.D0;
            iqVar.M(D, iqVar.D0().size());
        }
    }

    @Override
    public int R9() {
        return R.id.controller_stats_message;
    }

    public final void Kg(TdApi.MessageStatistics messageStatistics) {
        this.F0 = messageStatistics;
        int i10 = x9().f8099b.interactionInfo.forwardCount;
        TdApi.FoundMessages foundMessages = this.E0;
        if (foundMessages != null) {
            i10 -= foundMessages.totalCount;
        }
        TdApi.Message message = x9().f8099b;
        Objects.requireNonNull(message);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(57, R.id.btn_openChat).G(x9().f8099b));
        arrayList.add(new ra(3));
        arrayList.add(new ra(2));
        if (message.interactionInfo != null) {
            arrayList.add(new ra(89, (int) R.id.btn_statsViewCount, 0, (int) R.string.StatsMessageViewCount, false).G(Integer.valueOf(message.interactionInfo.viewCount)));
            arrayList.add(new ra(11));
        }
        if (message.authorSignature.length() > 0) {
            arrayList.add(new ra(89, (int) R.id.btn_statsSignature, 0, (int) R.string.StatsMessageSignature, false).G(message.authorSignature));
            arrayList.add(new ra(11));
        }
        arrayList.add(new ra(89, (int) R.id.btn_statsPublishDate, 0, (int) R.string.StatsMessagePublishDate, false).G(w.y1(message.date, TimeUnit.SECONDS)));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_statsPrivateShares, 0, (int) R.string.StatsMessageSharesPrivate, false).G(Integer.valueOf(i10)));
        arrayList.add(new ra(3));
        Pg(arrayList, Collections.singletonList(new i(R.id.stats_messageInteraction, this.f24495b, x9().f8098a, R.string.StatsChartInteractions, 0, messageStatistics.messageInteractionGraph, 0)), new Runnable() {
            @Override
            public final void run() {
                gc.this.Qg();
            }
        });
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.StatsMessageInfo);
    }

    @Override
    public boolean dc() {
        return this.F0 == null || this.G0 > 0;
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (view.getId() == R.id.chat) {
            d7 user = ((o) view).getUser();
            if (user != null) {
                this.f24495b.hd().h7(this, user.h(), new hj.j().e(new d(user.h(), ((TdApi.Message) raVar.d()).f19946id)).h());
            }
        } else if (view.getId() == R.id.btn_messageMore) {
            gc gcVar = new gc(this.f24493a, this.f24495b);
            gcVar.Ad(new b(x9().f8098a, (TdApi.Message) raVar.d()));
            ac(gcVar);
        } else if (view.getId() == R.id.btn_openChat) {
            this.f24495b.hd().s7(this, (TdApi.Message) raVar.d(), null);
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        a aVar = new a(this);
        this.D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        if (x9().f8100c != null) {
            Og(x9().f8100c);
        } else {
            this.f24495b.v4().o(new TdApi.GetMessageStatistics(x9().f8098a, x9().f8099b.f19946id, ae.j.x0()), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    gc.this.Mg(object);
                }
            });
        }
    }

    public static class b {
        public final long f8098a;
        public TdApi.Message f8099b;
        public List<TdApi.Message> f8100c;

        public b(long j10, TdApi.Message message) {
            this.f8098a = j10;
            this.f8099b = message;
        }

        public b(long j10, List<TdApi.Message> list) {
            this.f8098a = j10;
            this.f8100c = list;
        }
    }
}
