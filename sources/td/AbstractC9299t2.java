package td;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1379j0;
import be.C1399s0;
import gd.C4601c3;
import gd.C4614d3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6957m1;
import me.C6981o;
import me.C7030t1;
import me.C7093z3;
import me.View$OnClickListenerC6902i;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p053dd.C4007j;
import p053dd.C4012k;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5920l;
import p350yd.AbstractC10664f9;
import p350yd.C10930q6;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9299t2;
import vc.C9914k;

public abstract class AbstractC9299t2<T> extends AbstractC9323v4<T> {
    public CustomRecyclerView f30096n0;
    public C2546iq f30097o0;
    public C9914k f30098p0;
    public boolean f30099q0;
    public boolean f30100r0;
    public boolean f30101s0;

    public class C9300a extends RecyclerView.AbstractC0910t {
        public C9300a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 1) {
                AbstractC9299t2.this.mo9397La();
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (i2 != 0) {
                AbstractC9299t2.this.mo9397La();
            }
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).m39549a2() + 5 >= AbstractC9299t2.this.f30097o0.m34243F0().size()) {
                AbstractC9299t2.this.f30098p0.m6560K();
            }
        }
    }

    public class C9301b implements C6957m1.AbstractC6962e {
        public final C4601c3 f30104a;
        public final View f30105b;
        public final C2964ra f30106c;

        public C9301b(C4601c3 c3Var, View view, C2964ra raVar) {
            this.f30104a = c3Var;
            this.f30105b = view;
            this.f30106c = raVar;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            switch (i) {
                case R.id.btn_archiveUnarchiveChat:
                case R.id.btn_markChatAsRead:
                case R.id.btn_markChatAsUnread:
                case R.id.btn_notifications:
                case R.id.btn_pinUnpinChat:
                case R.id.btn_removeChatFromListOrClearHistory:
                case R.id.btn_removePsaChatFromList:
                    AbstractC9299t2.this.f30170b.m2485dd().m3798K7(AbstractC9299t2.this, this.f30104a.m27044j(), this.f30104a.m27049e(), this.f30104a.m27043k(), i, null);
                    return;
                case R.id.btn_delete:
                    switch (this.f30106c.m32838j()) {
                        case R.id.search_chat_local:
                            AbstractC9299t2.this.m9572Rf(this.f30104a);
                            return;
                        case R.id.search_chat_top:
                            AbstractC9299t2.this.m9570Sf(this.f30104a);
                            return;
                        default:
                            return;
                    }
                case R.id.btn_phone_call:
                    AbstractC9299t2.this.f30170b.m2930B4().m4713c0().m4545v0(AbstractC9299t2.this, this.f30104a.m27038p(), null, true);
                    return;
                case R.id.btn_selectChat:
                    AbstractC9299t2.this.mo9574Qf(this.f30105b, this.f30104a);
                    return;
                default:
                    return;
            }
        }
    }

    public class C9302c extends C2546iq {
        public final View$OnClickListenerC6902i.AbstractC6905c f30107m0;

        public C9302c(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var, View$OnClickListenerC6902i.AbstractC6905c cVar) {
            super(f9Var, onClickListener, v4Var);
            this.f30107m0 = cVar;
        }

        @Override
        public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
            z3Var.setPreviewActionListProvider(this.f30107m0);
            z3Var.setChat((C4601c3) raVar.m32847d());
        }
    }

    public class C9303d extends C2546iq {
        public final C2546iq f30109m0;
        public final View$OnClickListenerC6902i.AbstractC6905c f30110n0;

        public C9303d(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var, C2546iq iqVar, View$OnClickListenerC6902i.AbstractC6905c cVar) {
            super(f9Var, onClickListener, v4Var);
            this.f30109m0 = iqVar;
            this.f30110n0 = cVar;
        }

        @Override
        public void mo504H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
            if (raVar.m32838j() == R.id.search_top && recyclerView.getAdapter() != this.f30109m0) {
                recyclerView.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
                recyclerView.setAdapter(this.f30109m0);
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setPreviewActionListProvider(this.f30110n0);
            switch (raVar.m32838j()) {
                case R.id.search_chat_global:
                case R.id.search_chat_local:
                    oVar.setChat((C4601c3) raVar.m32847d());
                    return;
                case R.id.search_message:
                    oVar.setMessage((C4614d3) raVar.m32847d());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo452g2() {
            for (RecyclerView recyclerView : this.f8693O) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int X1 = linearLayoutManager.m39552X1();
                int a2 = linearLayoutManager.m39549a2();
                for (int i = X1; i <= a2; i++) {
                    View C = linearLayoutManager.mo39265C(i);
                    if (C != null && (C instanceof C6981o) && ((C6981o) C).m18202Q0()) {
                        C.invalidate();
                    }
                }
                if (X1 > 0) {
                    m39312L(0, X1);
                }
                if (a2 < mo6153D() - 1) {
                    m39312L(a2, mo6153D() - a2);
                }
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (AbstractC9299t2.this.f30098p0.m6569B()) {
                t1Var.m18058E1(C4403w.m27838q2(R.string.xMessages, AbstractC9299t2.this.f30098p0.m6511x()));
            } else {
                t1Var.m18057F1();
            }
        }
    }

    public class C9304e extends C9914k.AbstractC9919e {
        public final boolean f30112a;
        public final C2546iq f30113b;
        public final RecyclerView.AbstractC0896m f30114c;

        public C9304e(boolean z, C2546iq iqVar, RecyclerView.AbstractC0896m mVar) {
            this.f30112a = z;
            this.f30113b = iqVar;
            this.f30114c = mVar;
        }

        public void m9529D(RecyclerView.AbstractC0896m mVar) {
            AbstractC9299t2.this.f30096n0.setItemAnimator(mVar);
        }

        @Override
        public boolean mo6504A(TdApi.Chat chat) {
            return AbstractC9299t2.this.mo9546lf(chat);
        }

        @Override
        public void mo6503B(long[] jArr, long[] jArr2) {
            m9528E(AbstractC9299t2.this.f30098p0.m6510y());
        }

        public final void m9528E(ArrayList<C4601c3> arrayList) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<C4601c3> it = arrayList.iterator();
            while (it.hasNext()) {
                C4601c3 next = it.next();
                arrayList2.add(new C2964ra(59, R.id.search_chat_top).m32873G(next).m32866N(next.m27045i()));
            }
            this.f30113b.m34205W1(arrayList2);
        }

        @Override
        public void mo6502a() {
            AbstractC9299t2.this.m9564Vf(false);
            if (AbstractC9299t2.this.f30096n0.getAdapter() != null) {
                C1399s0.m37165q(AbstractC9299t2.this.f30096n0);
                AbstractC9299t2.this.f30096n0.setAdapter(null);
            }
        }

        @Override
        public void mo6501b(int i) {
            if (!this.f30112a) {
                HandlerC10770jj dd = AbstractC9299t2.this.f30170b.m2485dd();
                final RecyclerView.AbstractC0896m mVar = this.f30114c;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC9299t2.C9304e.this.m9529D(mVar);
                    }
                });
            }
        }

        @Override
        public void mo6500c(C4601c3 c3Var) {
            AbstractC9299t2.this.mo9579Nf(c3Var);
        }

        @Override
        public void mo6499d() {
            AbstractC9299t2.this.m9564Vf(true);
            if (AbstractC9299t2.this.f30096n0.getAdapter() != null) {
                AbstractC9299t2.this.f30097o0.m34200Y1(R.id.search_top);
                ((LinearLayoutManager) AbstractC9299t2.this.f30096n0.getLayoutManager()).m39525z2(0, 0);
            }
        }

        @Override
        public boolean mo6498e(ArrayList<C4601c3> arrayList, boolean z, boolean z2) {
            if (z) {
                m9528E(arrayList);
            }
            if (z2 || AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_top) != -1) {
                return false;
            }
            AbstractC9299t2 t2Var = AbstractC9299t2.this;
            AbstractC9299t2.this.f30097o0.m39311M(1, t2Var.m9538tf(t2Var.f30097o0.m34243F0(), 1));
            return true;
        }

        @Override
        public void mo6497f(int i) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                AbstractC9299t2.this.f30097o0.m34207V1(N0, ((i - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void mo6496g(ArrayList<C4601c3> arrayList, int i) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                int i2 = N0 + (i * 2) + 1;
                int i3 = 0;
                List<C2964ra> F0 = AbstractC9299t2.this.f30097o0.m34243F0();
                C5062b.m24160m(F0, F0.size() + (arrayList.size() * 2));
                Iterator<C4601c3> it = arrayList.iterator();
                while (it.hasNext()) {
                    int i4 = i3 + 1;
                    F0.add(i3 + i2, new C2964ra(1));
                    i3 = i4 + 1;
                    F0.add(i4 + i2, AbstractC9299t2.m9568Tf(R.id.search_chat_local, it.next(), AbstractC9299t2.this.f30098p0.m6515t()));
                }
                AbstractC9299t2.this.f30097o0.m39311M(i2, i3);
            }
        }

        @Override
        public void mo6495h(int i, ArrayList<C4614d3> arrayList) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages);
            if (N0 != -1) {
                int i2 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i3 = 0; i3 < min; i3++) {
                    C2964ra raVar = AbstractC9299t2.this.f30097o0.m34243F0().get((i3 * 2) + i2);
                    if (raVar.m32879A() == 57) {
                        C4614d3 d3Var = arrayList.get(i3);
                        raVar.m32873G(d3Var).m32866N(d3Var.m26897d()).m32875E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.m32879A());
                    }
                }
                int i4 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30097o0.m39312L(i2, i4);
                int i5 = i2 + i4;
                if (size > i) {
                    int i6 = size - i;
                    int i7 = i5;
                    for (int i8 = 0; i8 < i6; i8++) {
                        int i9 = i7 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i7, new C2964ra(1));
                        i7 = i9 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i9, AbstractC9299t2.m9566Uf(arrayList.get(i8 + min)));
                    }
                    AbstractC9299t2.this.f30097o0.m39311M(i5, i7 - i5);
                } else if (size < i) {
                    AbstractC9299t2.this.f30097o0.m34207V1(i5, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6494i(int i) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_global);
            if (N0 != -1) {
                AbstractC9299t2.this.f30097o0.m34207V1(N0, ((i - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void mo6493j(long j, int i, int i2) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                int i3 = N0 + 2;
                if (i == 0) {
                    AbstractC9299t2.this.f30097o0.m34207V1(i3, 2);
                } else {
                    AbstractC9299t2.this.f30097o0.m34207V1((i3 + (i * 2)) - 1, 2);
                }
            }
        }

        @Override
        public void mo6492k(boolean z, boolean z2) {
            int N0;
            if (z) {
                this.f30113b.m34205W1(null);
            }
            if (!z2 && (N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_top)) != -1) {
                AbstractC9299t2.this.f30097o0.m34207V1(N0, 4);
            }
        }

        @Override
        public void mo6491l(ArrayList<C4601c3> arrayList) {
            if (AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local) == -1) {
                int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages);
                if (N0 == -1 && (N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_global)) == -1) {
                    N0 = AbstractC9299t2.this.f30097o0.m34243F0().size();
                }
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                AbstractC9299t2.this.f30097o0.m39311M(N0, t2Var.m9540rf(N0, t2Var.f30097o0.m34243F0(), arrayList, R.id.search_section_local, R.id.search_chat_local, AbstractC9299t2.this.f30098p0.m6515t() ? R.string.Recent : R.string.ChatsAndContacts, AbstractC9299t2.this.f30098p0.m6515t()));
            }
        }

        @Override
        public void mo6490m(ArrayList<C4601c3> arrayList) {
            if (AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_global) == -1) {
                int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages);
                if (N0 == -1) {
                    N0 = AbstractC9299t2.this.f30097o0.m34243F0().size();
                }
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                AbstractC9299t2.this.f30097o0.m39311M(N0, t2Var.m9540rf(N0, t2Var.f30097o0.m34243F0(), arrayList, R.id.search_section_global, R.id.search_chat_global, R.string.GlobalSearch, false));
            }
        }

        @Override
        public void mo6489n(int i, ArrayList<C4601c3> arrayList) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                C2964ra raVar = AbstractC9299t2.this.f30097o0.m34243F0().get(N0);
                boolean t = AbstractC9299t2.this.f30098p0.m6515t();
                int i2 = 61;
                if (t != (raVar.m32879A() == 61)) {
                    if (!t) {
                        i2 = 8;
                    }
                    raVar.m32842f0(i2);
                    raVar.m32857W(t ? R.string.Recent : R.string.ChatsAndContacts);
                    AbstractC9299t2.this.f30097o0.m39315I(N0);
                }
                int i3 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i4 = 0; i4 < min; i4++) {
                    C2964ra raVar2 = AbstractC9299t2.this.f30097o0.m34243F0().get((i4 * 2) + i3);
                    if (raVar2.m32879A() == 57) {
                        C4601c3 c3Var = arrayList.get(i4);
                        raVar2.m32873G(c3Var).m32866N(c3Var.m27045i()).m32875E(t);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar2.m32879A());
                    }
                }
                int i5 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30097o0.m39312L(i3, i5);
                int i6 = i3 + i5;
                if (size > i) {
                    int i7 = size - i;
                    int i8 = i6;
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = i8 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i8, new C2964ra(1));
                        i8 = i10 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i10, AbstractC9299t2.m9568Tf(R.id.search_chat_local, arrayList.get(i9 + min), t));
                    }
                    AbstractC9299t2.this.f30097o0.m39311M(i6, i8 - i6);
                } else if (size < i) {
                    AbstractC9299t2.this.f30097o0.m34207V1(i6, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6488o() {
            AbstractC9299t2.this.f30097o0.m34133s3(R.id.search_counter);
            if (AbstractC9299t2.this.f30097o0.m34243F0().isEmpty()) {
                AbstractC9299t2.this.f30097o0.m34116y2(new C2964ra[]{new C2964ra(24, 0, 0, R.string.NothingFound)}, false);
            }
        }

        @Override
        public void mo6487p(int i) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages);
            if (N0 != -1) {
                AbstractC9299t2.this.f30097o0.m34207V1(N0, ((i - 1) * 2) + 4 + 1);
            }
        }

        @Override
        public void mo6486q(ArrayList<C4614d3> arrayList) {
            if (AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages) == -1) {
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                t2Var.m9539sf(t2Var.f30097o0.m34243F0(), arrayList, 0, arrayList.size());
            }
        }

        @Override
        public void mo6485r(int i, ArrayList<C4601c3> arrayList) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_global);
            if (N0 != -1) {
                int i2 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i3 = 0; i3 < min; i3++) {
                    C2964ra raVar = AbstractC9299t2.this.f30097o0.m34243F0().get((i3 * 2) + i2);
                    if (raVar.m32879A() == 57) {
                        C4601c3 c3Var = arrayList.get(i3);
                        raVar.m32873G(c3Var).m32866N(c3Var.m27045i()).m32875E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.m32879A());
                    }
                }
                int i4 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30097o0.m39312L(i2, i4);
                int i5 = i2 + i4;
                if (size > i) {
                    int i6 = size - i;
                    int i7 = i5;
                    for (int i8 = 0; i8 < i6; i8++) {
                        C4601c3 c3Var2 = arrayList.get(i8 + min);
                        int i9 = i7 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i7, new C2964ra(1));
                        i7 = i9 + 1;
                        AbstractC9299t2.this.f30097o0.m34243F0().add(i9, new C2964ra(57, R.id.search_chat_global).m32873G(c3Var2).m32866N(c3Var2.m27045i()));
                    }
                    AbstractC9299t2.this.f30097o0.m39311M(i5, i7 - i5);
                } else if (size < i) {
                    AbstractC9299t2.this.f30097o0.m34207V1(i5, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6484s(C4601c3 c3Var, int i, int i2) {
            C2964ra raVar;
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                int i3 = N0 + 2;
                int i4 = (i * 2) + i3;
                C2964ra remove = AbstractC9299t2.this.f30097o0.m34243F0().remove(i4);
                if (i != i2 - 1) {
                    raVar = AbstractC9299t2.this.f30097o0.m34243F0().remove(i4);
                    AbstractC9299t2.this.f30097o0.m39310N(i4, 2);
                } else {
                    int i5 = i4 - 1;
                    raVar = AbstractC9299t2.this.f30097o0.m34243F0().remove(i5);
                    AbstractC9299t2.this.f30097o0.m39310N(i5, 2);
                }
                AbstractC9299t2.this.f30097o0.m34243F0().add(i3, raVar);
                AbstractC9299t2.this.f30097o0.m34243F0().add(i3, remove);
                AbstractC9299t2.this.f30097o0.m39311M(i3, 2);
            }
        }

        @Override
        public int mo6483t() {
            int i = 0;
            for (C2964ra raVar : AbstractC9299t2.this.f30097o0.m34243F0()) {
                if (raVar.m32838j() == R.id.search_section_messages) {
                    break;
                }
                i += C2139ap.m35482W(raVar.m32879A());
            }
            return i;
        }

        @Override
        public void mo6482u(int i, ArrayList<C4614d3> arrayList) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_messages);
            if (N0 != -1) {
                int i2 = N0 + 2 + ((i - 1) * 2) + 1;
                int i3 = i2;
                while (i < arrayList.size()) {
                    int i4 = i3 + 1;
                    AbstractC9299t2.this.f30097o0.m34243F0().add(i3, new C2964ra(1));
                    i3 = i4 + 1;
                    AbstractC9299t2.this.f30097o0.m34243F0().add(i4, AbstractC9299t2.m9566Uf(arrayList.get(i)));
                    i++;
                }
                AbstractC9299t2.this.f30097o0.m39311M(i2, i3 - i2);
            }
        }

        @Override
        public boolean mo6481v(TdApi.Chat chat) {
            return AbstractC9299t2.this.mo9545mf(chat);
        }

        @Override
        public void mo6480w(boolean z) {
            if (!this.f30112a) {
                AbstractC9299t2.this.f30096n0.setItemAnimator(null);
            }
        }

        @Override
        public void mo6479x(C4601c3 c3Var) {
            int N0 = AbstractC9299t2.this.f30097o0.m34227N0(R.id.search_section_local);
            if (N0 != -1) {
                int i = N0 + 2;
                AbstractC9299t2.this.f30097o0.m34243F0().add(i, new C2964ra(1));
                AbstractC9299t2.this.f30097o0.m34243F0().add(i, AbstractC9299t2.m9568Tf(R.id.search_chat_local, c3Var, true));
                AbstractC9299t2.this.f30097o0.m39311M(i, 2);
            }
        }

        @Override
        public void mo6478y(long j) {
            this.f30113b.m34144p1(j);
        }

        @Override
        public void mo6477z(int i) {
        }
    }

    public class C9305f implements C4007j.AbstractC4009b {
        public C9305f() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            AbstractC9299t2.this.m9572Rf((C4601c3) ((C2964ra) d0Var.f3479a.getTag()).m32847d());
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar != null && raVar.m32879A() == 57 && raVar.m32851b();
        }

        @Override
        public float mo9525e() {
            return C4012k.m29331a(this);
        }
    }

    public class C9306g extends AnimatorListenerAdapter {
        public C9306g() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            AbstractC9299t2.this.mo9576Pf();
        }
    }

    public AbstractC9299t2(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public C6957m1.AbstractC6962e m9589Df(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
        C4601c3 c3Var;
        C2964ra raVar = (C2964ra) view.getTag();
        Object d = raVar.m32847d();
        if (d instanceof C4614d3) {
            c3Var = ((C4614d3) d).m26898c();
        } else {
            c3Var = (C4601c3) d;
        }
        boolean z = mo9548jf(c3Var) && this.f30161T != null;
        if (this.f30161T == null) {
            fVar.m18336J(true);
        }
        switch (raVar.m32838j()) {
            case R.id.search_chat_local:
            case R.id.search_chat_top:
                if (this.f30170b.m2542a3(c3Var.m27050d())) {
                    cVar.m23285a(R.id.btn_notifications);
                    boolean u3 = this.f30170b.m2223u3(c3Var.m27045i());
                    u0Var.m23817a(u3 ? R.string.Mute : R.string.Unmute);
                    cVar2.m23285a(u3 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                    if (z) {
                        if (c3Var.m27044j() != null) {
                            boolean z3 = this.f30170b.m2143z3(c3Var.m27044j(), c3Var.m27045i());
                            cVar.m23285a(R.id.btn_pinUnpinChat);
                            u0Var.m23817a(z3 ? R.string.Unpin : R.string.Pin);
                            cVar2.m23285a(z3 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                            if (this.f30170b.m2368l2(c3Var.m27044j(), c3Var.m27050d())) {
                                boolean Z2 = this.f30170b.m2557Z2(c3Var.m27045i());
                                cVar.m23285a(R.id.btn_archiveUnarchiveChat);
                                u0Var.m23817a(Z2 ? R.string.Unarchive : R.string.Archive);
                                cVar2.m23285a(Z2 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                            }
                        }
                        boolean B2 = this.f30170b.m2932B2(c3Var.m27050d());
                        cVar.m23285a(B2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                        u0Var.m23817a(B2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                        cVar2.m23285a(B2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                        if (c3Var.m27036r()) {
                            cVar.m23285a(R.id.btn_removeChatFromListOrClearHistory);
                            u0Var.m23817a(R.string.Delete);
                            cVar2.m23285a(R.drawable.baseline_delete_24);
                        }
                    }
                }
                if (!c3Var.m27036r()) {
                    cVar.m23285a(R.id.btn_delete);
                    u0Var.m23817a(R.string.Remove);
                    cVar2.m23285a(R.drawable.baseline_delete_sweep_24);
                    break;
                }
                break;
        }
        if (mo9547kf(c3Var)) {
            cVar.m23285a(R.id.btn_selectChat);
            u0Var.m23817a(R.string.Select);
            cVar2.m23285a(R.drawable.baseline_playlist_add_check_24);
        }
        return new C9301b(c3Var, view, raVar);
    }

    public void m9588Ef(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32838j() == R.id.search_chat_top) {
            C4601c3 c3Var = (C4601c3) raVar.m32847d();
            if (c3Var.m27045i() != 0 && !mo9574Qf(view, c3Var)) {
                this.f30170b.m2485dd().m3569h7(this, c3Var.m27045i(), null);
            }
        }
    }

    public boolean m9587Ff(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32838j() != R.id.search_chat_top) {
            return false;
        }
        m9570Sf((C4601c3) raVar.m32847d());
        return true;
    }

    public boolean m9586Gf(View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30098p0.m6512w();
        return true;
    }

    public void m9585Hf(C4601c3 c3Var, View view, long j) {
        c3Var.m27028z(j);
        this.f30098p0.m6517r(c3Var);
        if (!mo9574Qf(view, c3Var)) {
            this.f30170b.m2485dd().m3569h7(this, j, null);
        }
    }

    public void m9584If(final View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        switch (raVar.m32838j()) {
            case R.id.search_chat_global:
            case R.id.search_chat_local:
                final C4601c3 c3Var = (C4601c3) raVar.m32847d();
                if (raVar.m32838j() == R.id.search_chat_global) {
                    m9234id();
                }
                if (c3Var.m27045i() != 0) {
                    this.f30098p0.m6517r(c3Var);
                    if (!mo9574Qf(view, c3Var)) {
                        this.f30170b.m2485dd().m3569h7(this, c3Var.m27045i(), null);
                        return;
                    }
                    return;
                } else if (c3Var.m27038p() != 0) {
                    this.f30170b.m2485dd().m3439u7(this, c3Var.m27038p(), new HandlerC10770jj.C10780j().m3367i().m3374b(new AbstractC5920l() {
                        @Override
                        public final void mo3050a(long j) {
                            AbstractC9299t2.this.m9585Hf(c3Var, view, j);
                        }
                    }));
                    return;
                } else {
                    return;
                }
            case R.id.search_message:
                TdApi.Message e = ((C4614d3) raVar.m32847d()).m26896e();
                m9234id();
                this.f30170b.m2485dd().m3569h7(this, e.chatId, new HandlerC10770jj.C10780j().m3370f(e).m3368h());
                return;
            case R.id.search_section_local:
                if (this.f30098p0.m6515t()) {
                    m9261ee(C4403w.m27871i1(R.string.ClearRecentsHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Clear), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Gf;
                            Gf = AbstractC9299t2.this.m9586Gf(view2, i);
                            return Gf;
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
                return;
            default:
                return;
        }
    }

    public boolean m9583Jf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30098p0.m6547X(c3Var);
        return true;
    }

    public boolean m9582Kf(View view) {
        if (view.getId() != R.id.search_chat_local) {
            return false;
        }
        C2964ra raVar = (C2964ra) view.getTag();
        if (!raVar.m32851b()) {
            return false;
        }
        final C4601c3 c3Var = (C4601c3) raVar.m32847d();
        m9261ee(C4403w.m27855m1(R.string.DeleteXFromRecents, c3Var.m27040n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Delete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Jf;
                Jf = AbstractC9299t2.this.m9583Jf(c3Var, view2, i);
                return Jf;
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

    public boolean m9581Lf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30098p0.m6547X(c3Var);
        return true;
    }

    public boolean m9580Mf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30098p0.m6546Y(c3Var.m27045i());
        return true;
    }

    public static C2964ra m9568Tf(int i, C4601c3 c3Var, boolean z) {
        return new C2964ra(57, i).m32873G(c3Var).m32866N(c3Var.m27045i()).m32875E(z);
    }

    public static C2964ra m9566Uf(C4614d3 d3Var) {
        return new C2964ra(57, R.id.search_message).m32873G(d3Var).m32866N(d3Var.m26897d());
    }

    public final boolean m9592Af() {
        return this.f30098p0 != null;
    }

    public final void m9591Bf() {
        C9914k kVar = this.f30098p0;
        if (kVar != null) {
            kVar.m6549V(mo9537uf());
        }
    }

    @Override
    public void mo420Cc(String str) {
        super.mo420Cc(str);
        C9914k kVar = this.f30098p0;
        if (kVar != null) {
            kVar.m6553R(mo9537uf(), str);
        }
    }

    public final boolean m9590Cf() {
        C9914k kVar = this.f30098p0;
        return kVar != null && kVar.m6566E();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        C1399s0.m37174l0(this.f30096n0);
    }

    @Override
    public void mo9414J8(float f, boolean z) {
        super.mo9414J8(f, z);
        if (this.f30098p0 != null) {
            this.f30096n0.setAlpha(f);
            boolean z2 = true;
            m9562Wf(f == 1.0f);
            if (f == 0.0f) {
                z2 = false;
            }
            m9560Xf(z2);
        }
    }

    @Override
    public boolean mo9409Je() {
        return this.f30098p0 != null || super.mo9409Je();
    }

    public void mo9579Nf(C4601c3 c3Var) {
    }

    public boolean m9578Of() {
        return true;
    }

    public void mo9576Pf() {
    }

    public boolean mo9574Qf(View view, C4601c3 c3Var) {
        return false;
    }

    public final void m9572Rf(final C4601c3 c3Var) {
        m9261ee(C4403w.m27855m1(R.string.DeleteXFromRecents, c3Var.m27040n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Delete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Lf;
                Lf = AbstractC9299t2.this.m9581Lf(c3Var, view, i);
                return Lf;
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

    public final void m9570Sf(final C4601c3 c3Var) {
        m9261ee(C4403w.m27855m1(R.string.ChatHintsDelete, c3Var.m27040n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Delete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Mf;
                Mf = AbstractC9299t2.this.m9580Mf(c3Var, view, i);
                return Mf;
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
    public void mo9343T5(int i, int i2) {
        super.mo9343T5(i, i2);
        C2546iq iqVar = this.f30097o0;
        if (iqVar != null) {
            iqVar.mo9343T5(i, i2);
        }
    }

    public final void m9564Vf(boolean z) {
        if (this.f30101s0 != z) {
            this.f30101s0 = z;
            C1379j0.m37321l0(this.f30168a, z ? 32 : 18);
        }
    }

    public final void m9562Wf(boolean z) {
        if (this.f30099q0 != z) {
            this.f30099q0 = z;
            mo9532zf().setVisibility(z ? 4 : 0);
        }
    }

    public final void m9560Xf(boolean z) {
        if (this.f30100r0 != z) {
            this.f30100r0 = z;
            this.f30096n0.setScrollDisabled(!z);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f30098p0 != null) {
            C11052v1.m1768b().m1766d(this.f30097o0);
            C1399s0.m37165q(this.f30096n0);
        }
    }

    @Override
    public int mo9286ba() {
        return (m9182qa() == 0.0f || this.f30098p0 == null) ? super.mo9286ba() : R.id.theme_color_background;
    }

    @Override
    public final boolean mo9263ec() {
        return m9382Na() && m9592Af();
    }

    @Override
    public void mo416gc() {
        super.mo416gc();
        C9914k kVar = this.f30098p0;
        if (kVar != null) {
            kVar.m6558M(mo9537uf());
            m9341T8();
        }
    }

    public boolean mo9548jf(C4601c3 c3Var) {
        return true;
    }

    public boolean mo9547kf(C4601c3 c3Var) {
        return false;
    }

    public boolean mo9546lf(TdApi.Chat chat) {
        return true;
    }

    public boolean mo9545mf(TdApi.Chat chat) {
        return true;
    }

    public final void m9544nf() {
        m9410Jd(0.0f, false);
        this.f30098p0.m6558M(mo9537uf());
        this.f30096n0.setAdapter(null);
    }

    public final void m9543of(String str) {
        if (this.f30096n0.getAdapter() == null) {
            this.f30096n0.setAdapter(this.f30097o0);
        }
        m9410Jd(1.0f, true);
        this.f30098p0.m6555P(mo9537uf());
        m9542pf(str);
    }

    @Override
    public void mo9187pc() {
        super.mo9187pc();
        C9914k kVar = this.f30098p0;
        if (kVar != null) {
            kVar.m6555P(mo9537uf());
        }
    }

    public final void m9542pf(String str) {
        this.f30098p0.m6553R(mo9537uf(), str);
    }

    public final CustomRecyclerView m9541qf(ViewGroup viewGroup) {
        boolean z = (mo9535wf() & 32) != 0;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler_custom, viewGroup);
        this.f30096n0 = customRecyclerView;
        C1399s0.m37174l0(customRecyclerView);
        this.f30096n0.m39425k(new C9300a());
        this.f30096n0.setBackgroundColor(C11524j.m199b());
        m9197o8(this.f30096n0, R.id.theme_color_background);
        this.f30096n0.setLayoutManager(new LinearLayoutManager(mo4347s(), 1, false));
        if (viewGroup != null) {
            this.f30096n0.setAlpha(0.0f);
            this.f30096n0.setScrollDisabled(true);
        }
        this.f30096n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        View$OnClickListenerC6902i.AbstractC6905c s2Var = new View$OnClickListenerC6902i.AbstractC6905c() {
            @Override
            public final C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
                C6957m1.AbstractC6962e Df;
                Df = AbstractC9299t2.this.m9589Df(view, fVar, cVar, cVar2, u0Var, v4Var);
                return Df;
            }
        };
        C9302c cVar = new C9302c(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC9299t2.this.m9588Ef(view);
            }
        }, this, s2Var);
        cVar.m34241F2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Ff;
                Ff = AbstractC9299t2.this.m9587Ff(view);
                return Ff;
            }
        });
        this.f30097o0 = new C9303d(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC9299t2.this.m9584If(view);
            }
        }, this, cVar, s2Var);
        C11052v1.m1768b().m1769a(this.f30097o0);
        this.f30097o0.m34241F2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Kf;
                Kf = AbstractC9299t2.this.m9582Kf(view);
                return Kf;
            }
        });
        if (!z) {
            this.f30097o0.m34116y2(new C2964ra[]{new C2964ra(14)}, false);
        }
        RecyclerView.AbstractC0896m itemAnimator = this.f30096n0.getItemAnimator();
        if (!z) {
            this.f30096n0.setItemAnimator(null);
        }
        if (viewGroup == null) {
            this.f30096n0.setAdapter(this.f30097o0);
        }
        C9914k kVar = new C9914k(this.f30170b, new C9304e(z, cVar, itemAnimator));
        this.f30098p0 = kVar;
        kVar.m6527i0(mo9535wf());
        C4007j.m29344a(this.f30096n0, new C9305f());
        if (viewGroup != null) {
            viewGroup.addView(this.f30096n0);
        }
        if (m9578Of()) {
            this.f30098p0.m6554Q(mo9537uf(), mo9534xf());
        }
        return this.f30096n0;
    }

    public final int m9540rf(int i, List<C2964ra> list, ArrayList<C4601c3> arrayList, int i2, int i3, int i4, boolean z) {
        int size = list.size();
        if (arrayList != null && arrayList.size() > 0) {
            C5062b.m24160m(list, list.size() + ((arrayList.size() - 1) * 2) + 5);
            if (list.isEmpty()) {
                i++;
                list.add(i, new C2964ra(14));
            }
            int i5 = i + 1;
            list.add(i, new C2964ra(z ? 61 : 8, i2, R.drawable.baseline_clear_all_24, i4));
            int i6 = i5 + 1;
            list.add(i5, new C2964ra(2));
            Iterator<C4601c3> it = arrayList.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                C4601c3 next = it.next();
                if (z2) {
                    z2 = false;
                } else {
                    i6++;
                    list.add(i6, new C2964ra(1));
                }
                i6++;
                list.add(i6, m9568Tf(i3, next, z));
            }
            list.add(i6, new C2964ra(3));
        }
        return list.size() - size;
    }

    public final void m9539sf(java.util.List<p038ce.C2964ra> r17, java.util.ArrayList<gd.C4614d3> r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.AbstractC9299t2.m9539sf(java.util.List, java.util.ArrayList, int, int):void");
    }

    public final int m9538tf(List<C2964ra> list, int i) {
        int size = list.size();
        ArrayList<C4601c3> y = this.f30098p0.m6510y();
        if (y != null && y.size() > 0) {
            C5062b.m24160m(list, list.size() + 5);
            if (list.isEmpty()) {
                i++;
                list.add(i, new C2964ra(14));
            }
            int i2 = i + 1;
            list.add(i, new C2964ra(8, R.id.search_section_top, 0, (mo9535wf() & Log.TAG_CAMERA) != 0 ? R.string.Groups : R.string.People));
            int i3 = i2 + 1;
            list.add(i2, new C2964ra(2));
            list.add(i3, new C2964ra(58, R.id.search_top));
            list.add(i3 + 1, new C2964ra(3));
        }
        return list.size() - size;
    }

    @Override
    public void mo9150ue(ValueAnimator valueAnimator, int i, boolean z) {
        CustomRecyclerView customRecyclerView = this.f30096n0;
        if (customRecyclerView == null || customRecyclerView.getAdapter() != null || i != 2 || !z) {
            super.mo9150ue(valueAnimator, i, z);
            return;
        }
        valueAnimator.addListener(new C9306g());
        C2057b.m35735d(this.f30096n0, valueAnimator, true);
        this.f30096n0.setAdapter(this.f30097o0);
    }

    public TdApi.ChatList mo9537uf() {
        return null;
    }

    public int mo9536vf() {
        return R.string.general_Messages;
    }

    public int mo9535wf() {
        return 1;
    }

    public String mo9534xf() {
        return "";
    }

    public final RecyclerView m9533yf() {
        return this.f30096n0;
    }

    public View mo9532zf() {
        throw new RuntimeException("Stub!");
    }
}
