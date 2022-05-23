package ad;

import ad.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import dd.l;
import de.ap;
import de.iq;
import de.p0;
import de.ra;
import de.s;
import gd.w;
import hd.d7;
import ie.g0;
import ie.h0;
import ie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ne.q0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import tc.d;
import ud.v4;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.y8;

public class p implements t1.a, Client.g {
    public boolean M;
    public boolean N;
    public String O;
    public final v4<?> P;
    public final long Q;
    public final String R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public RecyclerView V;
    public iq W;
    public ArrayList<d7> f776a;
    public final ArrayList<TdApi.ChatJoinRequest> f777b = new ArrayList<>();
    public int f778c;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        public void B3(d7 d7Var, View view) {
            p.this.y(d7Var);
        }

        public void C3(d7 d7Var, View view) {
            p.this.D(d7Var);
        }

        public void D3(q0 q0Var, View view) {
            p.this.V(q0Var);
        }

        public boolean z3(View view, o oVar) {
            p0 p0Var = new p0(p.this.C(), p.this.c0());
            p0Var.Hh(new p0.d(p.this.Q, p.this.c0().fa(), null, null, p.this.c0().O3(p.this.Q).getConstructor() == -160019714));
            p.this.P.ac(p0Var);
            return true;
        }

        @Override
        public void k2(ra raVar, int i10, EmbeddableStickerView embeddableStickerView, boolean z10) {
            TdApi.Sticker sticker = (TdApi.Sticker) raVar.d();
            embeddableStickerView.setSticker(new l(p.this.c0(), sticker, "😎", sticker.type));
            embeddableStickerView.setCaptionText(c0.l(p.this.P, w.j1(p.this.U ? R.string.InviteLinkRequestsHintChannel : R.string.InviteLinkRequestsHint, "tg://need_update_for_some_feature"), new o.a() {
                @Override
                public final boolean a(View view, ie.o oVar) {
                    boolean z32;
                    z32 = p.a.this.z3(view, oVar);
                    return z32;
                }
            }));
        }

        @Override
        public void u2(ra raVar, int i10, final q0 q0Var, boolean z10) {
            ArrayList arrayList = p.this.f776a;
            if (!p.this.S && !p.this.T && !p.this.G()) {
                i10 -= 3;
            }
            final d7 d7Var = (d7) arrayList.get(i10);
            q0Var.setTag(d7Var);
            q0Var.B1().f(d7Var.f(), d7Var.g());
            q0Var.B1().i(d7Var.k(), d7Var.p());
            q0Var.B1().h(R.drawable.baseline_person_add_16, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    p.a.this.B3(d7Var, view);
                }
            });
            q0Var.A1().setImageResource(R.drawable.baseline_close_24);
            q0Var.setIconClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    p.a.this.C3(d7Var, view);
                }
            });
            q0Var.setTextClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    p.a.this.D3(q0Var, view);
                }
            });
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if ((p.this.S || p.this.P.Ta()) && p.this.M && !p.this.N && p.this.f776a != null && !p.this.f776a.isEmpty() && p.this.f778c != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).a2() + 10 >= p.this.f776a.size()) {
                p.this.T();
            }
        }
    }

    public p(v4<?> v4Var, long j10, String str) {
        this.P = v4Var;
        this.Q = j10;
        this.R = str;
        this.S = v4Var instanceof r;
        this.T = str != null && !str.isEmpty();
        this.U = v4Var.c().O6(j10);
    }

    public void I(d7 d7Var, TdApi.Object object) {
        a0(d7Var);
    }

    public boolean J(final d7 d7Var, View view, int i10) {
        if (i10 != R.id.btn_approveChatRequest) {
            return true;
        }
        c0().v4().o(new TdApi.ProcessChatJoinRequest(this.Q, d7Var.s(), true), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p.this.I(d7Var, object);
            }
        });
        return true;
    }

    public void K(d7 d7Var, TdApi.Object object) {
        a0(d7Var);
    }

    public boolean L(final d7 d7Var, View view, int i10) {
        if (i10 != R.id.btn_declineChatRequest) {
            return true;
        }
        c0().v4().o(new TdApi.ProcessChatJoinRequest(this.Q, d7Var.s(), false), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p.this.K(d7Var, object);
            }
        });
        return true;
    }

    public void M(ArrayList arrayList, TdApi.ChatJoinRequests chatJoinRequests) {
        if (!this.P.Sa()) {
            this.f776a = arrayList;
            int length = chatJoinRequests.requests.length;
            this.f778c = length;
            this.M = length <= chatJoinRequests.totalCount;
            A();
            this.P.n9();
            d0(false);
        }
    }

    public void N(TdApi.Object object) {
        TdApi.ChatJoinRequest[] chatJoinRequestArr;
        if (object.getConstructor() == 1291680519) {
            this.f777b.clear();
            final TdApi.ChatJoinRequests chatJoinRequests = (TdApi.ChatJoinRequests) object;
            final ArrayList arrayList = new ArrayList(chatJoinRequests.requests.length);
            for (TdApi.ChatJoinRequest chatJoinRequest : chatJoinRequests.requests) {
                this.f777b.add(chatJoinRequest);
                arrayList.add(Z(c0(), chatJoinRequest, arrayList));
            }
            c0().hd().post(new Runnable() {
                @Override
                public final void run() {
                    p.this.M(arrayList, chatJoinRequests);
                }
            });
        }
    }

    public boolean O(d7 d7Var, View view, int i10) {
        if (i10 == R.id.btn_approveChatRequest) {
            y(d7Var);
            return true;
        } else if (i10 == R.id.btn_declineChatRequest) {
            D(d7Var);
            return true;
        } else if (i10 != R.id.btn_openChat) {
            return true;
        } else {
            Y(d7Var);
            return true;
        }
    }

    public void P(TdApi.ChatJoinRequests chatJoinRequests, ArrayList arrayList) {
        if (!this.P.Sa()) {
            boolean z10 = false;
            this.N = false;
            int length = this.f778c + chatJoinRequests.requests.length;
            this.f778c = length;
            if (length <= chatJoinRequests.totalCount) {
                z10 = true;
            }
            this.M = z10;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (H(((d7) arrayList.get(size)).s()) != -1) {
                    arrayList.remove(size);
                }
            }
            z(arrayList);
        }
    }

    public void Q() {
        d0(false);
    }

    public void R(d7 d7Var) {
        int indexOf = this.f776a.indexOf(d7Var);
        if (indexOf != -1) {
            d0(true);
            this.f776a.remove(indexOf);
            this.f777b.remove(indexOf);
            iq iqVar = this.W;
            if (!this.S && !this.T && !G()) {
                indexOf += 3;
            }
            iqVar.j1(indexOf);
            X();
            c0().hd().postDelayed(new Runnable() {
                @Override
                public final void run() {
                    p.this.Q();
                }
            }, 500L);
        }
    }

    public static d7 Z(o6 o6Var, TdApi.ChatJoinRequest chatJoinRequest, ArrayList<d7> arrayList) {
        d7 d7Var = new d7(o6Var, o6Var.e2().u2(chatJoinRequest.userId));
        d7Var.A();
        d7Var.z(w.j1(R.string.InviteLinkRequestSince, w.J0(chatJoinRequest.date, TimeUnit.SECONDS)));
        d7Var.x(arrayList);
        return d7Var;
    }

    public final void A() {
        ArrayList arrayList = new ArrayList();
        if (!this.S && !this.T && !G()) {
            arrayList.add(new ra(14));
            arrayList.add(new ra(130).G(c0().p5("😎")));
            arrayList.add(new ra(2));
        }
        ArrayList<d7> arrayList2 = this.f776a;
        if (arrayList2 != null) {
            arrayList.ensureCapacity(arrayList2.size());
            Iterator<d7> it = this.f776a.iterator();
            while (it.hasNext()) {
                arrayList.add(new ra(131, R.id.user, 0, 0).N(it.next().h()));
            }
        }
        arrayList.add(new ra(3));
        if (this.S && !this.M && !G()) {
            arrayList.add(new ra(9, 0, 0, this.U ? R.string.InviteLinkRequestsHintChannel : R.string.InviteLinkRequestsHint));
        }
        this.W.s2(arrayList, false);
    }

    public final void B() {
        if (this.S) {
            ((r) this.P).tg();
        }
    }

    public final org.thunderdog.challegram.a C() {
        return this.P.t();
    }

    public final void D(final d7 d7Var) {
        this.P.ee(w.m1(R.string.AreYouSureDeclineJoinRequest, d7Var.k()), new int[]{R.id.btn_declineChatRequest, R.id.btn_cancel}, new String[]{w.i1(R.string.InviteLinkActionDeclineAction), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean L;
                L = p.this.L(d7Var, view, i10);
                return L;
            }
        });
    }

    public void E() {
        t1.b().d(this);
    }

    public int F(int i10) {
        return (ap.W(131) * i10) + a0.i(48.0f) + ap.W(2);
    }

    public boolean G() {
        String str = this.O;
        return str != null && !str.isEmpty();
    }

    public final int H(long j10) {
        ArrayList<d7> arrayList = this.f776a;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<d7> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().s() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void S() {
        c0().v4().o(new TdApi.GetChatJoinRequests(this.Q, this.R, this.O, null, 20), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                p.this.N(object);
            }
        });
    }

    public final void T() {
        if (!this.N && this.M && !this.f777b.isEmpty()) {
            this.N = true;
            Client v42 = c0().v4();
            long j10 = this.Q;
            String str = this.R;
            String str2 = this.O;
            ArrayList<TdApi.ChatJoinRequest> arrayList = this.f777b;
            v42.o(new TdApi.GetChatJoinRequests(j10, str, str2, arrayList.get(arrayList.size() - 1), 20), this);
        }
    }

    public boolean U() {
        return this.f776a == null;
    }

    public void V(View view) {
        final d7 d7Var;
        if (view.getId() == R.id.user && (d7Var = (d7) view.getTag()) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w.d3(d7Var.k(), w.p()));
            int indexOf = this.f776a.indexOf(d7Var);
            if (indexOf != -1) {
                TdApi.ChatJoinRequest chatJoinRequest = this.f777b.get(indexOf);
                if (!chatJoinRequest.bio.isEmpty()) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append(w.d3(this.f777b.get(this.f776a.indexOf(d7Var)).bio, w.R1()));
                }
                spannableStringBuilder.append((CharSequence) "\n").append(w.d3(w.j1(R.string.InviteLinkRequestSince, w.J0(chatJoinRequest.date, TimeUnit.SECONDS)), w.R1()));
            }
            v4<?> v4Var = this.P;
            int[] iArr = {R.id.btn_approveChatRequest, R.id.btn_declineChatRequest, R.id.btn_openChat};
            String[] strArr = new String[3];
            strArr[0] = w.i1(this.U ? R.string.InviteLinkActionAcceptChannel : R.string.InviteLinkActionAccept);
            strArr[1] = w.i1(R.string.InviteLinkActionDeclineAction);
            strArr[2] = w.i1(R.string.InviteLinkActionWrite);
            v4Var.ee(spannableStringBuilder, iArr, strArr, new int[]{3, 2, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_delete_24, R.drawable.baseline_person_24}, new h0() {
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
                    boolean O;
                    O = p.this.O(d7Var, view2, i10);
                    return O;
                }
            });
        }
    }

    public void W(Context context, RecyclerView recyclerView) {
        this.W = new a(this.P);
        recyclerView.k(new b());
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.W);
        this.V = recyclerView;
        d0(true);
        t1.b().a(this);
        this.W.t2(new ra[]{new ra(15)}, false);
        S();
    }

    public final void X() {
        if (this.S) {
            ((r) this.P).vg();
            return;
        }
        v4<?> v4Var = this.P;
        if (v4Var instanceof s) {
            ((s) v4Var).Bg();
            if (this.W.L0(R.id.user) == -1) {
                this.P.Zb();
            }
        }
    }

    public final void Y(d7 d7Var) {
        B();
        c0().hd().v7(new y8(C(), c0()), d7Var.s(), null);
    }

    public final void a0(final d7 d7Var) {
        this.P.wd(new Runnable() {
            @Override
            public final void run() {
                p.this.R(d7Var);
            }
        });
    }

    public void b0(String str) {
        if (!Objects.equals(this.O, str)) {
            if (str != null && str.isEmpty()) {
                str = null;
            }
            this.N = false;
            this.f778c = 0;
            this.O = str;
            S();
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final o6 c0() {
        return this.P.c();
    }

    public final void d0(boolean z10) {
        this.V.setItemAnimator(z10 ? new d(db.b.f7287b, 180L) : null);
    }

    @Override
    public void e2() {
        this.W.Y2(R.id.user);
    }

    @Override
    public void r2(TdApi.Object object) {
        TdApi.ChatJoinRequest[] chatJoinRequestArr;
        if (object.getConstructor() == 1291680519) {
            final TdApi.ChatJoinRequests chatJoinRequests = (TdApi.ChatJoinRequests) object;
            final ArrayList arrayList = new ArrayList(chatJoinRequests.requests.length);
            for (TdApi.ChatJoinRequest chatJoinRequest : chatJoinRequests.requests) {
                this.f777b.add(chatJoinRequest);
                arrayList.add(Z(c0(), chatJoinRequest, this.f776a));
            }
            if (!arrayList.isEmpty()) {
                c0().hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        p.this.P(chatJoinRequests, arrayList);
                    }
                });
            }
        }
    }

    public final void y(final d7 d7Var) {
        v4<?> v4Var = this.P;
        CharSequence m12 = w.m1(R.string.AreYouSureAcceptJoinRequest, d7Var.k(), c0().U3(this.Q));
        int[] iArr = {R.id.btn_approveChatRequest, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = w.i1(this.U ? R.string.InviteLinkActionAcceptChannel : R.string.InviteLinkActionAccept);
        strArr[1] = w.i1(R.string.Cancel);
        v4Var.ee(m12, iArr, strArr, new int[]{3, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean J;
                J = p.this.J(d7Var, view, i10);
                return J;
            }
        });
    }

    public final void z(ArrayList<d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.f776a.size();
            ArrayList<d7> arrayList2 = this.f776a;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.f776a.addAll(arrayList);
            List<ra> D0 = this.W.D0();
            int i10 = 2;
            ib.b.m(D0, D0.size() + arrayList.size() + (!this.M ? 2 : 0));
            Iterator<d7> it = arrayList.iterator();
            while (it.hasNext()) {
                D0.add(D0.size() - 1, new ra(131, R.id.user, 0, 0).N(it.next().s()));
            }
            if (!this.M) {
                D0.add(new ra(3));
                if (!G()) {
                    D0.add(new ra(9, 0, 0, R.string.InviteLinkRequestsHint));
                }
            }
            iq iqVar = this.W;
            int size2 = arrayList.size();
            if (this.M) {
                i10 = 0;
            }
            iqVar.M(size, size2 + i10);
        }
    }
}
