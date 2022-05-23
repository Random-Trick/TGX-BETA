package ud;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.j0;
import ce.p0;
import de.ap;
import de.iq;
import de.ra;
import ed.j;
import gd.w;
import hd.c3;
import hd.d3;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.c;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.i;
import ne.m1;
import ne.o;
import ne.t1;
import ne.y3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.t2;
import wc.k;
import zd.d9;
import zd.hj;
import zd.o6;

public abstract class t2<T> extends v4<T> {
    public CustomRecyclerView f24445n0;
    public iq f24446o0;
    public k f24447p0;
    public boolean f24448q0;
    public boolean f24449r0;
    public boolean f24450s0;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 1) {
                t2.this.La();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i11 != 0) {
                t2.this.La();
            }
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).a2() + 5 >= t2.this.f24446o0.D0().size()) {
                t2.this.f24447p0.K();
            }
        }
    }

    public class b implements m1.e {
        public final c3 f24452a;
        public final View f24453b;
        public final ra f24454c;

        public b(c3 c3Var, View view, ra raVar) {
            this.f24452a = c3Var;
            this.f24453b = view;
            this.f24454c = raVar;
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
            switch (i10) {
                case R.id.btn_archiveUnarchiveChat:
                case R.id.btn_markChatAsRead:
                case R.id.btn_markChatAsUnread:
                case R.id.btn_notifications:
                case R.id.btn_pinUnpinChat:
                case R.id.btn_removeChatFromListOrClearHistory:
                case R.id.btn_removePsaChatFromList:
                    t2.this.f24495b.hd().K7(t2.this, this.f24452a.j(), this.f24452a.e(), this.f24452a.k(), i10, null);
                    return;
                case R.id.btn_delete:
                    switch (this.f24454c.j()) {
                        case R.id.search_chat_local:
                            t2.this.Rf(this.f24452a);
                            return;
                        case R.id.search_chat_top:
                            t2.this.Sf(this.f24452a);
                            return;
                        default:
                            return;
                    }
                case R.id.btn_phone_call:
                    t2.this.f24495b.F4().c0().r0(t2.this, this.f24452a.p(), null, true);
                    return;
                case R.id.btn_selectChat:
                    t2.this.Qf(this.f24453b, this.f24452a);
                    return;
                default:
                    return;
            }
        }
    }

    public class c extends iq {
        public final i.c f24455m0;

        public c(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var, i.c cVar) {
            super(d9Var, onClickListener, v4Var);
            this.f24455m0 = cVar;
        }

        @Override
        public void Z1(ra raVar, y3 y3Var) {
            y3Var.setPreviewActionListProvider(this.f24455m0);
            y3Var.setChat((c3) raVar.d());
        }
    }

    public class d extends iq {
        public final iq f24457m0;
        public final i.c f24458n0;

        public d(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var, iq iqVar, i.c cVar) {
            super(d9Var, onClickListener, v4Var);
            this.f24457m0 = iqVar;
            this.f24458n0 = cVar;
        }

        @Override
        public void D2(ra raVar, RecyclerView recyclerView, boolean z10) {
            if (raVar.j() == R.id.search_top && recyclerView.getAdapter() != this.f24457m0) {
                recyclerView.setItemAnimator(new tc.d(db.b.f7287b, 180L));
                recyclerView.setAdapter(this.f24457m0);
            }
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setPreviewActionListProvider(this.f24458n0);
            switch (raVar.j()) {
                case R.id.search_chat_global:
                case R.id.search_chat_local:
                    oVar.setChat((c3) raVar.d());
                    return;
                case R.id.search_message:
                    oVar.setMessage((d3) raVar.d());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void e2() {
            for (RecyclerView recyclerView : this.O) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int X1 = linearLayoutManager.X1();
                int a22 = linearLayoutManager.a2();
                for (int i10 = X1; i10 <= a22; i10++) {
                    View C = linearLayoutManager.C(i10);
                    if (C != null && (C instanceof o) && ((o) C).V0()) {
                        C.invalidate();
                    }
                }
                if (X1 > 0) {
                    L(0, X1);
                }
                if (a22 < D() - 1) {
                    L(a22, D() - a22);
                }
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            if (t2.this.f24447p0.B()) {
                t1Var.B1(w.q2(R.string.xMessages, t2.this.f24447p0.x()));
            } else {
                t1Var.C1();
            }
        }
    }

    public class e extends k.e {
        public final boolean f24460a;
        public final iq f24461b;
        public final RecyclerView.m f24462c;

        public e(boolean z10, iq iqVar, RecyclerView.m mVar) {
            this.f24460a = z10;
            this.f24461b = iqVar;
            this.f24462c = mVar;
        }

        public void D(RecyclerView.m mVar) {
            t2.this.f24445n0.setItemAnimator(mVar);
        }

        @Override
        public boolean A(TdApi.Chat chat) {
            return t2.this.lf(chat);
        }

        @Override
        public void B(long[] jArr, long[] jArr2) {
            E(t2.this.f24447p0.y());
        }

        public final void E(ArrayList<c3> arrayList) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<c3> it = arrayList.iterator();
            while (it.hasNext()) {
                c3 next = it.next();
                arrayList2.add(new ra(59, R.id.search_chat_top).G(next).N(next.i()));
            }
            this.f24461b.S1(arrayList2);
        }

        @Override
        public void a() {
            t2.this.Vf(false);
            if (t2.this.f24445n0.getAdapter() != null) {
                p0.n(t2.this.f24445n0);
                t2.this.f24445n0.setAdapter(null);
            }
        }

        @Override
        public void b(int i10) {
            if (!this.f24460a) {
                hj hd2 = t2.this.f24495b.hd();
                final RecyclerView.m mVar = this.f24462c;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        t2.e.this.D(mVar);
                    }
                });
            }
        }

        @Override
        public void c() {
            t2.this.Vf(true);
            if (t2.this.f24445n0.getAdapter() != null) {
                t2.this.f24446o0.U1(R.id.search_top);
                ((LinearLayoutManager) t2.this.f24445n0.getLayoutManager()).z2(0, 0);
            }
        }

        @Override
        public boolean d(ArrayList<c3> arrayList, boolean z10, boolean z11) {
            if (z10) {
                E(arrayList);
            }
            if (z11 || t2.this.f24446o0.L0(R.id.search_section_top) != -1) {
                return false;
            }
            t2 t2Var = t2.this;
            t2.this.f24446o0.M(1, t2Var.tf(t2Var.f24446o0.D0(), 1));
            return true;
        }

        @Override
        public void e(int i10) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                t2.this.f24446o0.R1(L0, ((i10 - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void f(ArrayList<c3> arrayList, int i10) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                int i11 = L0 + (i10 * 2) + 1;
                int i12 = 0;
                List<ra> D0 = t2.this.f24446o0.D0();
                ib.b.m(D0, D0.size() + (arrayList.size() * 2));
                Iterator<c3> it = arrayList.iterator();
                while (it.hasNext()) {
                    int i13 = i12 + 1;
                    D0.add(i12 + i11, new ra(1));
                    i12 = i13 + 1;
                    D0.add(i13 + i11, t2.Tf(R.id.search_chat_local, it.next(), t2.this.f24447p0.t()));
                }
                t2.this.f24446o0.M(i11, i12);
            }
        }

        @Override
        public void g(int i10, ArrayList<d3> arrayList) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_messages);
            if (L0 != -1) {
                int i11 = L0 + 2;
                int size = arrayList.size();
                int min = Math.min(i10, size);
                for (int i12 = 0; i12 < min; i12++) {
                    ra raVar = t2.this.f24446o0.D0().get((i12 * 2) + i11);
                    if (raVar.A() == 57) {
                        d3 d3Var = arrayList.get(i12);
                        raVar.G(d3Var).N(d3Var.d()).E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.A());
                    }
                }
                int i13 = ((min - 1) * 2) + 1;
                t2.this.f24446o0.L(i11, i13);
                int i14 = i11 + i13;
                if (size > i10) {
                    int i15 = size - i10;
                    int i16 = i14;
                    for (int i17 = 0; i17 < i15; i17++) {
                        int i18 = i16 + 1;
                        t2.this.f24446o0.D0().add(i16, new ra(1));
                        i16 = i18 + 1;
                        t2.this.f24446o0.D0().add(i18, t2.Uf(arrayList.get(i17 + min)));
                    }
                    t2.this.f24446o0.M(i14, i16 - i14);
                } else if (size < i10) {
                    t2.this.f24446o0.R1(i14, (i10 - size) * 2);
                }
            }
        }

        @Override
        public void h(int i10) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_global);
            if (L0 != -1) {
                t2.this.f24446o0.R1(L0, ((i10 - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void i(long j10, int i10, int i11) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                int i12 = L0 + 2;
                if (i10 == 0) {
                    t2.this.f24446o0.R1(i12, 2);
                } else {
                    t2.this.f24446o0.R1((i12 + (i10 * 2)) - 1, 2);
                }
            }
        }

        @Override
        public void j(c3 c3Var) {
            t2.this.Nf(c3Var);
        }

        @Override
        public void k(boolean z10, boolean z11) {
            int L0;
            if (z10) {
                this.f24461b.S1(null);
            }
            if (!z11 && (L0 = t2.this.f24446o0.L0(R.id.search_section_top)) != -1) {
                t2.this.f24446o0.R1(L0, 4);
            }
        }

        @Override
        public void l(ArrayList<c3> arrayList) {
            if (t2.this.f24446o0.L0(R.id.search_section_local) == -1) {
                int L0 = t2.this.f24446o0.L0(R.id.search_section_messages);
                if (L0 == -1 && (L0 = t2.this.f24446o0.L0(R.id.search_section_global)) == -1) {
                    L0 = t2.this.f24446o0.D0().size();
                }
                t2 t2Var = t2.this;
                t2.this.f24446o0.M(L0, t2Var.rf(L0, t2Var.f24446o0.D0(), arrayList, R.id.search_section_local, R.id.search_chat_local, t2.this.f24447p0.t() ? R.string.Recent : R.string.ChatsAndContacts, t2.this.f24447p0.t()));
            }
        }

        @Override
        public void m(c3 c3Var) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                int i10 = L0 + 2;
                t2.this.f24446o0.D0().add(i10, new ra(1));
                t2.this.f24446o0.D0().add(i10, t2.Tf(R.id.search_chat_local, c3Var, true));
                t2.this.f24446o0.M(i10, 2);
            }
        }

        @Override
        public void n(ArrayList<c3> arrayList) {
            if (t2.this.f24446o0.L0(R.id.search_section_global) == -1) {
                int L0 = t2.this.f24446o0.L0(R.id.search_section_messages);
                if (L0 == -1) {
                    L0 = t2.this.f24446o0.D0().size();
                }
                t2 t2Var = t2.this;
                t2.this.f24446o0.M(L0, t2Var.rf(L0, t2Var.f24446o0.D0(), arrayList, R.id.search_section_global, R.id.search_chat_global, R.string.GlobalSearch, false));
            }
        }

        @Override
        public void o(int i10, ArrayList<c3> arrayList) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                ra raVar = t2.this.f24446o0.D0().get(L0);
                boolean t10 = t2.this.f24447p0.t();
                int i11 = 61;
                if (t10 != (raVar.A() == 61)) {
                    if (!t10) {
                        i11 = 8;
                    }
                    raVar.f0(i11);
                    raVar.W(t10 ? R.string.Recent : R.string.ChatsAndContacts);
                    t2.this.f24446o0.I(L0);
                }
                int i12 = L0 + 2;
                int size = arrayList.size();
                int min = Math.min(i10, size);
                for (int i13 = 0; i13 < min; i13++) {
                    ra raVar2 = t2.this.f24446o0.D0().get((i13 * 2) + i12);
                    if (raVar2.A() == 57) {
                        c3 c3Var = arrayList.get(i13);
                        raVar2.G(c3Var).N(c3Var.i()).E(t10);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar2.A());
                    }
                }
                int i14 = ((min - 1) * 2) + 1;
                t2.this.f24446o0.L(i12, i14);
                int i15 = i12 + i14;
                if (size > i10) {
                    int i16 = size - i10;
                    int i17 = i15;
                    for (int i18 = 0; i18 < i16; i18++) {
                        int i19 = i17 + 1;
                        t2.this.f24446o0.D0().add(i17, new ra(1));
                        i17 = i19 + 1;
                        t2.this.f24446o0.D0().add(i19, t2.Tf(R.id.search_chat_local, arrayList.get(i18 + min), t10));
                    }
                    t2.this.f24446o0.M(i15, i17 - i15);
                } else if (size < i10) {
                    t2.this.f24446o0.R1(i15, (i10 - size) * 2);
                }
            }
        }

        @Override
        public void p() {
            t2.this.f24446o0.p3(R.id.search_counter);
            if (t2.this.f24446o0.D0().isEmpty()) {
                t2.this.f24446o0.t2(new ra[]{new ra(24, 0, 0, R.string.NothingFound)}, false);
            }
        }

        @Override
        public void q(int i10) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_messages);
            if (L0 != -1) {
                t2.this.f24446o0.R1(L0, ((i10 - 1) * 2) + 4 + 1);
            }
        }

        @Override
        public void r(c3 c3Var, int i10, int i11) {
            ra raVar;
            int L0 = t2.this.f24446o0.L0(R.id.search_section_local);
            if (L0 != -1) {
                int i12 = L0 + 2;
                int i13 = (i10 * 2) + i12;
                ra remove = t2.this.f24446o0.D0().remove(i13);
                if (i10 != i11 - 1) {
                    raVar = t2.this.f24446o0.D0().remove(i13);
                    t2.this.f24446o0.N(i13, 2);
                } else {
                    int i14 = i13 - 1;
                    raVar = t2.this.f24446o0.D0().remove(i14);
                    t2.this.f24446o0.N(i14, 2);
                }
                t2.this.f24446o0.D0().add(i12, raVar);
                t2.this.f24446o0.D0().add(i12, remove);
                t2.this.f24446o0.M(i12, 2);
            }
        }

        @Override
        public void s(ArrayList<d3> arrayList) {
            if (t2.this.f24446o0.L0(R.id.search_section_messages) == -1) {
                t2 t2Var = t2.this;
                t2Var.sf(t2Var.f24446o0.D0(), arrayList, 0, arrayList.size());
            }
        }

        @Override
        public void t(int i10, ArrayList<c3> arrayList) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_global);
            if (L0 != -1) {
                int i11 = L0 + 2;
                int size = arrayList.size();
                int min = Math.min(i10, size);
                for (int i12 = 0; i12 < min; i12++) {
                    ra raVar = t2.this.f24446o0.D0().get((i12 * 2) + i11);
                    if (raVar.A() == 57) {
                        c3 c3Var = arrayList.get(i12);
                        raVar.G(c3Var).N(c3Var.i()).E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.A());
                    }
                }
                int i13 = ((min - 1) * 2) + 1;
                t2.this.f24446o0.L(i11, i13);
                int i14 = i11 + i13;
                if (size > i10) {
                    int i15 = size - i10;
                    int i16 = i14;
                    for (int i17 = 0; i17 < i15; i17++) {
                        c3 c3Var2 = arrayList.get(i17 + min);
                        int i18 = i16 + 1;
                        t2.this.f24446o0.D0().add(i16, new ra(1));
                        i16 = i18 + 1;
                        t2.this.f24446o0.D0().add(i18, new ra(57, R.id.search_chat_global).G(c3Var2).N(c3Var2.i()));
                    }
                    t2.this.f24446o0.M(i14, i16 - i14);
                } else if (size < i10) {
                    t2.this.f24446o0.R1(i14, (i10 - size) * 2);
                }
            }
        }

        @Override
        public int u() {
            int i10 = 0;
            for (ra raVar : t2.this.f24446o0.D0()) {
                if (raVar.j() == R.id.search_section_messages) {
                    break;
                }
                i10 += ap.W(raVar.A());
            }
            return i10;
        }

        @Override
        public void v(int i10, ArrayList<d3> arrayList) {
            int L0 = t2.this.f24446o0.L0(R.id.search_section_messages);
            if (L0 != -1) {
                int i11 = L0 + 2 + ((i10 - 1) * 2) + 1;
                int i12 = i11;
                while (i10 < arrayList.size()) {
                    int i13 = i12 + 1;
                    t2.this.f24446o0.D0().add(i12, new ra(1));
                    i12 = i13 + 1;
                    t2.this.f24446o0.D0().add(i13, t2.Uf(arrayList.get(i10)));
                    i10++;
                }
                t2.this.f24446o0.M(i11, i12 - i11);
            }
        }

        @Override
        public boolean w(TdApi.Chat chat) {
            return t2.this.mf(chat);
        }

        @Override
        public void x(boolean z10) {
            if (!this.f24460a) {
                t2.this.f24445n0.setItemAnimator(null);
            }
        }

        @Override
        public void y(long j10) {
            this.f24461b.l1(j10);
        }

        @Override
        public void z(int i10) {
        }
    }

    public class f implements j.b {
        public f() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            t2.this.Rf((c3) ((ra) c0Var.f2982a.getTag()).d());
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            return raVar != null && raVar.A() == 57 && raVar.b();
        }

        @Override
        public float e() {
            return ed.k.a(this);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            t2.this.Pf();
        }
    }

    public t2(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public m1.e Df(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4 v4Var) {
        c3 c3Var;
        ra raVar = (ra) view.getTag();
        Object d10 = raVar.d();
        if (d10 instanceof d3) {
            c3Var = ((d3) d10).c();
        } else {
            c3Var = (c3) d10;
        }
        boolean z10 = jf(c3Var) && this.T != null;
        if (this.T == null) {
            fVar.J(true);
        }
        switch (raVar.j()) {
            case R.id.search_chat_local:
            case R.id.search_chat_top:
                if (this.f24495b.c3(c3Var.d())) {
                    cVar.a(R.id.btn_notifications);
                    boolean x32 = this.f24495b.x3(c3Var.i());
                    u0Var.a(x32 ? R.string.Mute : R.string.Unmute);
                    cVar2.a(x32 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                    if (z10) {
                        if (c3Var.j() != null) {
                            boolean C3 = this.f24495b.C3(c3Var.j(), c3Var.i());
                            cVar.a(R.id.btn_pinUnpinChat);
                            u0Var.a(C3 ? R.string.Unpin : R.string.Pin);
                            cVar2.a(C3 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                            if (this.f24495b.l2(c3Var.j(), c3Var.d())) {
                                boolean b32 = this.f24495b.b3(c3Var.i());
                                cVar.a(R.id.btn_archiveUnarchiveChat);
                                u0Var.a(b32 ? R.string.Unarchive : R.string.Archive);
                                cVar2.a(b32 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                            }
                        }
                        boolean D2 = this.f24495b.D2(c3Var.d());
                        cVar.a(D2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                        u0Var.a(D2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                        cVar2.a(D2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                        if (c3Var.r()) {
                            cVar.a(R.id.btn_removeChatFromListOrClearHistory);
                            u0Var.a(R.string.Delete);
                            cVar2.a(R.drawable.baseline_delete_24);
                        }
                    }
                }
                if (!c3Var.r()) {
                    cVar.a(R.id.btn_delete);
                    u0Var.a(R.string.Remove);
                    cVar2.a(R.drawable.baseline_delete_sweep_24);
                    break;
                }
                break;
        }
        if (kf(c3Var)) {
            cVar.a(R.id.btn_selectChat);
            u0Var.a(R.string.Select);
            cVar2.a(R.drawable.baseline_playlist_add_check_24);
        }
        return new b(c3Var, view, raVar);
    }

    public void Ef(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar.j() == R.id.search_chat_top) {
            c3 c3Var = (c3) raVar.d();
            if (c3Var.i() != 0 && !Qf(view, c3Var)) {
                this.f24495b.hd().h7(this, c3Var.i(), null);
            }
        }
    }

    public boolean Ff(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar.j() != R.id.search_chat_top) {
            return false;
        }
        Sf((c3) raVar.d());
        return true;
    }

    public boolean Gf(View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.f24447p0.w();
        return true;
    }

    public void Hf(c3 c3Var, View view, long j10) {
        c3Var.z(j10);
        this.f24447p0.r(c3Var);
        if (!Qf(view, c3Var)) {
            this.f24495b.hd().h7(this, j10, null);
        }
    }

    public void If(final View view) {
        ra raVar = (ra) view.getTag();
        switch (raVar.j()) {
            case R.id.search_chat_global:
            case R.id.search_chat_local:
                final c3 c3Var = (c3) raVar.d();
                if (raVar.j() == R.id.search_chat_global) {
                    id();
                }
                if (c3Var.i() != 0) {
                    this.f24447p0.r(c3Var);
                    if (!Qf(view, c3Var)) {
                        this.f24495b.hd().h7(this, c3Var.i(), null);
                        return;
                    }
                    return;
                } else if (c3Var.p() != 0) {
                    this.f24495b.hd().u7(this, c3Var.p(), new hj.j().i().b(new l() {
                        @Override
                        public final void a(long j10) {
                            t2.this.Hf(c3Var, view, j10);
                        }
                    }));
                    return;
                } else {
                    return;
                }
            case R.id.search_message:
                TdApi.Message e10 = ((d3) raVar.d()).e();
                id();
                this.f24495b.hd().h7(this, e10.chatId, new hj.j().f(e10).h());
                return;
            case R.id.search_section_local:
                if (this.f24447p0.t()) {
                    ee(w.i1(R.string.ClearRecentsHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Clear), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                            boolean Gf;
                            Gf = t2.this.Gf(view2, i10);
                            return Gf;
                        }
                    });
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean Jf(c3 c3Var, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.f24447p0.X(c3Var);
        return true;
    }

    public boolean Kf(View view) {
        if (view.getId() != R.id.search_chat_local) {
            return false;
        }
        ra raVar = (ra) view.getTag();
        if (!raVar.b()) {
            return false;
        }
        final c3 c3Var = (c3) raVar.d();
        ee(w.m1(R.string.DeleteXFromRecents, c3Var.n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Delete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Jf;
                Jf = t2.this.Jf(c3Var, view2, i10);
                return Jf;
            }
        });
        return true;
    }

    public boolean Lf(c3 c3Var, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.f24447p0.X(c3Var);
        return true;
    }

    public boolean Mf(c3 c3Var, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.f24447p0.Y(c3Var.i());
        return true;
    }

    public static ra Tf(int i10, c3 c3Var, boolean z10) {
        return new ra(57, i10).G(c3Var).N(c3Var.i()).E(z10);
    }

    public static ra Uf(d3 d3Var) {
        return new ra(57, R.id.search_message).G(d3Var).N(d3Var.d());
    }

    public final boolean Af() {
        return this.f24447p0 != null;
    }

    public final void Bf() {
        k kVar = this.f24447p0;
        if (kVar != null) {
            kVar.V(uf());
        }
    }

    @Override
    public void Cc(String str) {
        super.Cc(str);
        k kVar = this.f24447p0;
        if (kVar != null) {
            kVar.R(uf(), str);
        }
    }

    public final boolean Cf() {
        k kVar = this.f24447p0;
        return kVar != null && kVar.E();
    }

    @Override
    public void Ia() {
        super.Ia();
        p0.e0(this.f24445n0);
    }

    @Override
    public void J8(float f10, boolean z10) {
        super.J8(f10, z10);
        if (this.f24447p0 != null) {
            this.f24445n0.setAlpha(f10);
            boolean z11 = true;
            Wf(f10 == 1.0f);
            if (f10 == 0.0f) {
                z11 = false;
            }
            Xf(z11);
        }
    }

    @Override
    public boolean Je() {
        return this.f24447p0 != null || super.Je();
    }

    public void Nf(c3 c3Var) {
    }

    public boolean Of() {
        return true;
    }

    public void Pf() {
    }

    @Override
    public void Q5(int i10, int i11) {
        super.Q5(i10, i11);
        iq iqVar = this.f24446o0;
        if (iqVar != null) {
            iqVar.Q5(i10, i11);
        }
    }

    public boolean Qf(View view, c3 c3Var) {
        return false;
    }

    public final void Rf(final c3 c3Var) {
        ee(w.m1(R.string.DeleteXFromRecents, c3Var.n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Delete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Lf;
                Lf = t2.this.Lf(c3Var, view, i10);
                return Lf;
            }
        });
    }

    public final void Sf(final c3 c3Var) {
        ee(w.m1(R.string.ChatHintsDelete, c3Var.n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.Delete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Mf;
                Mf = t2.this.Mf(c3Var, view, i10);
                return Mf;
            }
        });
    }

    public final void Vf(boolean z10) {
        if (this.f24450s0 != z10) {
            this.f24450s0 = z10;
            j0.l0(this.f24493a, z10 ? 32 : 18);
        }
    }

    public final void Wf(boolean z10) {
        if (this.f24448q0 != z10) {
            this.f24448q0 = z10;
            zf().setVisibility(z10 ? 4 : 0);
        }
    }

    public final void Xf(boolean z10) {
        if (this.f24449r0 != z10) {
            this.f24449r0 = z10;
            this.f24445n0.setScrollDisabled(!z10);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        if (this.f24447p0 != null) {
            zd.t1.b().d(this.f24446o0);
            p0.n(this.f24445n0);
        }
    }

    @Override
    public int ba() {
        return (qa() == 0.0f || this.f24447p0 == null) ? super.ba() : R.id.theme_color_background;
    }

    @Override
    public final boolean ec() {
        return Na() && Af();
    }

    @Override
    public void gc() {
        super.gc();
        k kVar = this.f24447p0;
        if (kVar != null) {
            kVar.M(uf());
            T8();
        }
    }

    public boolean jf(c3 c3Var) {
        return true;
    }

    public boolean kf(c3 c3Var) {
        return false;
    }

    public boolean lf(TdApi.Chat chat) {
        return true;
    }

    public boolean mf(TdApi.Chat chat) {
        return true;
    }

    public final void nf() {
        Jd(0.0f, false);
        this.f24447p0.M(uf());
        this.f24445n0.setAdapter(null);
    }

    public final void of(String str) {
        if (this.f24445n0.getAdapter() == null) {
            this.f24445n0.setAdapter(this.f24446o0);
        }
        Jd(1.0f, true);
        this.f24447p0.P(uf());
        pf(str);
    }

    @Override
    public void pc() {
        super.pc();
        k kVar = this.f24447p0;
        if (kVar != null) {
            kVar.P(uf());
        }
    }

    public final void pf(String str) {
        this.f24447p0.R(uf(), str);
    }

    public final CustomRecyclerView qf(ViewGroup viewGroup) {
        boolean z10 = (wf() & 32) != 0;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(t(), R.layout.recycler_custom, viewGroup);
        this.f24445n0 = customRecyclerView;
        p0.e0(customRecyclerView);
        this.f24445n0.k(new a());
        this.f24445n0.setBackgroundColor(ae.j.b());
        o8(this.f24445n0, R.id.theme_color_background);
        this.f24445n0.setLayoutManager(new LinearLayoutManager(t(), 1, false));
        if (viewGroup != null) {
            this.f24445n0.setAlpha(0.0f);
            this.f24445n0.setScrollDisabled(true);
        }
        this.f24445n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        i.c s2Var = new i.c() {
            @Override
            public final m1.e r6(View view, m1.f fVar, c cVar, c cVar2, u0 u0Var, v4 v4Var) {
                m1.e Df;
                Df = t2.this.Df(view, fVar, cVar, cVar2, u0Var, v4Var);
                return Df;
            }
        };
        c cVar = new c(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                t2.this.Ef(view);
            }
        }, this, s2Var);
        cVar.B2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Ff;
                Ff = t2.this.Ff(view);
                return Ff;
            }
        });
        this.f24446o0 = new d(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                t2.this.If(view);
            }
        }, this, cVar, s2Var);
        zd.t1.b().a(this.f24446o0);
        this.f24446o0.B2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Kf;
                Kf = t2.this.Kf(view);
                return Kf;
            }
        });
        if (!z10) {
            this.f24446o0.t2(new ra[]{new ra(14)}, false);
        }
        RecyclerView.m itemAnimator = this.f24445n0.getItemAnimator();
        if (!z10) {
            this.f24445n0.setItemAnimator(null);
        }
        if (viewGroup == null) {
            this.f24445n0.setAdapter(this.f24446o0);
        }
        k kVar = new k(this.f24495b, new e(z10, cVar, itemAnimator));
        this.f24447p0 = kVar;
        kVar.i0(wf());
        j.a(this.f24445n0, new f());
        if (viewGroup != null) {
            viewGroup.addView(this.f24445n0);
        }
        if (Of()) {
            this.f24447p0.Q(uf(), xf());
        }
        return this.f24445n0;
    }

    public final int rf(int i10, List<ra> list, ArrayList<c3> arrayList, int i11, int i12, int i13, boolean z10) {
        int size = list.size();
        if (arrayList != null && arrayList.size() > 0) {
            ib.b.m(list, list.size() + ((arrayList.size() - 1) * 2) + 5);
            if (list.isEmpty()) {
                i10++;
                list.add(i10, new ra(14));
            }
            int i14 = i10 + 1;
            list.add(i10, new ra(z10 ? 61 : 8, i11, R.drawable.baseline_clear_all_24, i13));
            int i15 = i14 + 1;
            list.add(i14, new ra(2));
            Iterator<c3> it = arrayList.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                c3 next = it.next();
                if (z11) {
                    z11 = false;
                } else {
                    i15++;
                    list.add(i15, new ra(1));
                }
                i15++;
                list.add(i15, Tf(i12, next, z10));
            }
            list.add(i15, new ra(3));
        }
        return list.size() - size;
    }

    public final void sf(java.util.List<de.ra> r17, java.util.ArrayList<hd.d3> r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: ud.t2.sf(java.util.List, java.util.ArrayList, int, int):void");
    }

    public final int tf(List<ra> list, int i10) {
        int size = list.size();
        ArrayList<c3> y10 = this.f24447p0.y();
        if (y10 != null && y10.size() > 0) {
            ib.b.m(list, list.size() + 5);
            if (list.isEmpty()) {
                i10++;
                list.add(i10, new ra(14));
            }
            int i11 = i10 + 1;
            list.add(i10, new ra(8, R.id.search_section_top, 0, (wf() & Log.TAG_CAMERA) != 0 ? R.string.Groups : R.string.People));
            int i12 = i11 + 1;
            list.add(i11, new ra(2));
            list.add(i12, new ra(58, R.id.search_top));
            list.add(i12 + 1, new ra(3));
        }
        return list.size() - size;
    }

    @Override
    public void ue(ValueAnimator valueAnimator, int i10, boolean z10) {
        CustomRecyclerView customRecyclerView = this.f24445n0;
        if (customRecyclerView == null || customRecyclerView.getAdapter() != null || i10 != 2 || !z10) {
            super.ue(valueAnimator, i10, z10);
            return;
        }
        valueAnimator.addListener(new g());
        db.b.d(this.f24445n0, valueAnimator, true);
        this.f24445n0.setAdapter(this.f24446o0);
    }

    public TdApi.ChatList uf() {
        return null;
    }

    public int vf() {
        return R.string.general_Messages;
    }

    public int wf() {
        return 1;
    }

    public String xf() {
        return "";
    }

    public final RecyclerView yf() {
        return this.f24445n0;
    }

    public View zf() {
        throw new RuntimeException("Stub!");
    }
}
