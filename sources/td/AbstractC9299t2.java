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
    public CustomRecyclerView f30093n0;
    public C2546iq f30094o0;
    public C9914k f30095p0;
    public boolean f30096q0;
    public boolean f30097r0;
    public boolean f30098s0;

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
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).m39546a2() + 5 >= AbstractC9299t2.this.f30094o0.m34240F0().size()) {
                AbstractC9299t2.this.f30095p0.m6560K();
            }
        }
    }

    public class C9301b implements C6957m1.AbstractC6962e {
        public final C4601c3 f30101a;
        public final View f30102b;
        public final C2964ra f30103c;

        public C9301b(C4601c3 c3Var, View view, C2964ra raVar) {
            this.f30101a = c3Var;
            this.f30102b = view;
            this.f30103c = raVar;
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
                    AbstractC9299t2.this.f30167b.m2485dd().m3798K7(AbstractC9299t2.this, this.f30101a.m27042j(), this.f30101a.m27047e(), this.f30101a.m27041k(), i, null);
                    return;
                case R.id.btn_delete:
                    switch (this.f30103c.m32835j()) {
                        case R.id.search_chat_local:
                            AbstractC9299t2.this.m9573Rf(this.f30101a);
                            return;
                        case R.id.search_chat_top:
                            AbstractC9299t2.this.m9571Sf(this.f30101a);
                            return;
                        default:
                            return;
                    }
                case R.id.btn_phone_call:
                    AbstractC9299t2.this.f30167b.m2930B4().m4713c0().m4545v0(AbstractC9299t2.this, this.f30101a.m27036p(), null, true);
                    return;
                case R.id.btn_selectChat:
                    AbstractC9299t2.this.mo9575Qf(this.f30102b, this.f30101a);
                    return;
                default:
                    return;
            }
        }
    }

    public class C9302c extends C2546iq {
        public final View$OnClickListenerC6902i.AbstractC6905c f30104m0;

        public C9302c(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var, View$OnClickListenerC6902i.AbstractC6905c cVar) {
            super(f9Var, onClickListener, v4Var);
            this.f30104m0 = cVar;
        }

        @Override
        public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
            z3Var.setPreviewActionListProvider(this.f30104m0);
            z3Var.setChat((C4601c3) raVar.m32844d());
        }
    }

    public class C9303d extends C2546iq {
        public final C2546iq f30106m0;
        public final View$OnClickListenerC6902i.AbstractC6905c f30107n0;

        public C9303d(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var, C2546iq iqVar, View$OnClickListenerC6902i.AbstractC6905c cVar) {
            super(f9Var, onClickListener, v4Var);
            this.f30106m0 = iqVar;
            this.f30107n0 = cVar;
        }

        @Override
        public void mo9532H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
            if (raVar.m32835j() == R.id.search_top && recyclerView.getAdapter() != this.f30106m0) {
                recyclerView.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
                recyclerView.setAdapter(this.f30106m0);
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setPreviewActionListProvider(this.f30107n0);
            switch (raVar.m32835j()) {
                case R.id.search_chat_global:
                case R.id.search_chat_local:
                    oVar.setChat((C4601c3) raVar.m32844d());
                    return;
                case R.id.search_message:
                    oVar.setMessage((C4614d3) raVar.m32844d());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo452g2() {
            for (RecyclerView recyclerView : this.f8693O) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int X1 = linearLayoutManager.m39549X1();
                int a2 = linearLayoutManager.m39546a2();
                for (int i = X1; i <= a2; i++) {
                    View C = linearLayoutManager.mo39262C(i);
                    if (C != null && (C instanceof C6981o) && ((C6981o) C).m18202Q0()) {
                        C.invalidate();
                    }
                }
                if (X1 > 0) {
                    m39309L(0, X1);
                }
                if (a2 < mo6153D() - 1) {
                    m39309L(a2, mo6153D() - a2);
                }
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (AbstractC9299t2.this.f30095p0.m6569B()) {
                t1Var.m18058E1(C4403w.m27836q2(R.string.xMessages, AbstractC9299t2.this.f30095p0.m6511x()));
            } else {
                t1Var.m18057F1();
            }
        }
    }

    public class C9304e extends C9914k.AbstractC9919e {
        public final boolean f30109a;
        public final C2546iq f30110b;
        public final RecyclerView.AbstractC0896m f30111c;

        public C9304e(boolean z, C2546iq iqVar, RecyclerView.AbstractC0896m mVar) {
            this.f30109a = z;
            this.f30110b = iqVar;
            this.f30111c = mVar;
        }

        public void m9529D(RecyclerView.AbstractC0896m mVar) {
            AbstractC9299t2.this.f30093n0.setItemAnimator(mVar);
        }

        @Override
        public boolean mo6504A(TdApi.Chat chat) {
            return AbstractC9299t2.this.mo9547lf(chat);
        }

        @Override
        public void mo6503B(long[] jArr, long[] jArr2) {
            m9528E(AbstractC9299t2.this.f30095p0.m6510y());
        }

        public final void m9528E(ArrayList<C4601c3> arrayList) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<C4601c3> it = arrayList.iterator();
            while (it.hasNext()) {
                C4601c3 next = it.next();
                arrayList2.add(new C2964ra(59, R.id.search_chat_top).m32870G(next).m32863N(next.m27043i()));
            }
            this.f30110b.m34202W1(arrayList2);
        }

        @Override
        public void mo6502a() {
            AbstractC9299t2.this.m9565Vf(false);
            if (AbstractC9299t2.this.f30093n0.getAdapter() != null) {
                C1399s0.m37162q(AbstractC9299t2.this.f30093n0);
                AbstractC9299t2.this.f30093n0.setAdapter(null);
            }
        }

        @Override
        public void mo6501b(int i) {
            if (!this.f30109a) {
                HandlerC10770jj dd = AbstractC9299t2.this.f30167b.m2485dd();
                final RecyclerView.AbstractC0896m mVar = this.f30111c;
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
            AbstractC9299t2.this.mo9580Nf(c3Var);
        }

        @Override
        public void mo6499d() {
            AbstractC9299t2.this.m9565Vf(true);
            if (AbstractC9299t2.this.f30093n0.getAdapter() != null) {
                AbstractC9299t2.this.f30094o0.m34197Y1(R.id.search_top);
                ((LinearLayoutManager) AbstractC9299t2.this.f30093n0.getLayoutManager()).m39522z2(0, 0);
            }
        }

        @Override
        public boolean mo6498e(ArrayList<C4601c3> arrayList, boolean z, boolean z2) {
            if (z) {
                m9528E(arrayList);
            }
            if (z2 || AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_top) != -1) {
                return false;
            }
            AbstractC9299t2 t2Var = AbstractC9299t2.this;
            AbstractC9299t2.this.f30094o0.m39308M(1, t2Var.m9539tf(t2Var.f30094o0.m34240F0(), 1));
            return true;
        }

        @Override
        public void mo6497f(int i) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                AbstractC9299t2.this.f30094o0.m34204V1(N0, ((i - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void mo6496g(ArrayList<C4601c3> arrayList, int i) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                int i2 = N0 + (i * 2) + 1;
                int i3 = 0;
                List<C2964ra> F0 = AbstractC9299t2.this.f30094o0.m34240F0();
                C5062b.m24159m(F0, F0.size() + (arrayList.size() * 2));
                Iterator<C4601c3> it = arrayList.iterator();
                while (it.hasNext()) {
                    int i4 = i3 + 1;
                    F0.add(i3 + i2, new C2964ra(1));
                    i3 = i4 + 1;
                    F0.add(i4 + i2, AbstractC9299t2.m9569Tf(R.id.search_chat_local, it.next(), AbstractC9299t2.this.f30095p0.m6515t()));
                }
                AbstractC9299t2.this.f30094o0.m39308M(i2, i3);
            }
        }

        @Override
        public void mo6495h(int i, ArrayList<C4614d3> arrayList) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages);
            if (N0 != -1) {
                int i2 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i3 = 0; i3 < min; i3++) {
                    C2964ra raVar = AbstractC9299t2.this.f30094o0.m34240F0().get((i3 * 2) + i2);
                    if (raVar.m32876A() == 57) {
                        C4614d3 d3Var = arrayList.get(i3);
                        raVar.m32870G(d3Var).m32863N(d3Var.m26895d()).m32872E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.m32876A());
                    }
                }
                int i4 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30094o0.m39309L(i2, i4);
                int i5 = i2 + i4;
                if (size > i) {
                    int i6 = size - i;
                    int i7 = i5;
                    for (int i8 = 0; i8 < i6; i8++) {
                        int i9 = i7 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i7, new C2964ra(1));
                        i7 = i9 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i9, AbstractC9299t2.m9567Uf(arrayList.get(i8 + min)));
                    }
                    AbstractC9299t2.this.f30094o0.m39308M(i5, i7 - i5);
                } else if (size < i) {
                    AbstractC9299t2.this.f30094o0.m34204V1(i5, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6494i(int i) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_global);
            if (N0 != -1) {
                AbstractC9299t2.this.f30094o0.m34204V1(N0, ((i - 1) * 2) + 3 + 1);
            }
        }

        @Override
        public void mo6493j(long j, int i, int i2) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                int i3 = N0 + 2;
                if (i == 0) {
                    AbstractC9299t2.this.f30094o0.m34204V1(i3, 2);
                } else {
                    AbstractC9299t2.this.f30094o0.m34204V1((i3 + (i * 2)) - 1, 2);
                }
            }
        }

        @Override
        public void mo6492k(boolean z, boolean z2) {
            int N0;
            if (z) {
                this.f30110b.m34202W1(null);
            }
            if (!z2 && (N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_top)) != -1) {
                AbstractC9299t2.this.f30094o0.m34204V1(N0, 4);
            }
        }

        @Override
        public void mo6491l(ArrayList<C4601c3> arrayList) {
            if (AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local) == -1) {
                int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages);
                if (N0 == -1 && (N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_global)) == -1) {
                    N0 = AbstractC9299t2.this.f30094o0.m34240F0().size();
                }
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                AbstractC9299t2.this.f30094o0.m39308M(N0, t2Var.m9541rf(N0, t2Var.f30094o0.m34240F0(), arrayList, R.id.search_section_local, R.id.search_chat_local, AbstractC9299t2.this.f30095p0.m6515t() ? R.string.Recent : R.string.ChatsAndContacts, AbstractC9299t2.this.f30095p0.m6515t()));
            }
        }

        @Override
        public void mo6490m(ArrayList<C4601c3> arrayList) {
            if (AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_global) == -1) {
                int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages);
                if (N0 == -1) {
                    N0 = AbstractC9299t2.this.f30094o0.m34240F0().size();
                }
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                AbstractC9299t2.this.f30094o0.m39308M(N0, t2Var.m9541rf(N0, t2Var.f30094o0.m34240F0(), arrayList, R.id.search_section_global, R.id.search_chat_global, R.string.GlobalSearch, false));
            }
        }

        @Override
        public void mo6489n(int i, ArrayList<C4601c3> arrayList) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                C2964ra raVar = AbstractC9299t2.this.f30094o0.m34240F0().get(N0);
                boolean t = AbstractC9299t2.this.f30095p0.m6515t();
                int i2 = 61;
                if (t != (raVar.m32876A() == 61)) {
                    if (!t) {
                        i2 = 8;
                    }
                    raVar.m32839f0(i2);
                    raVar.m32854W(t ? R.string.Recent : R.string.ChatsAndContacts);
                    AbstractC9299t2.this.f30094o0.m39312I(N0);
                }
                int i3 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i4 = 0; i4 < min; i4++) {
                    C2964ra raVar2 = AbstractC9299t2.this.f30094o0.m34240F0().get((i4 * 2) + i3);
                    if (raVar2.m32876A() == 57) {
                        C4601c3 c3Var = arrayList.get(i4);
                        raVar2.m32870G(c3Var).m32863N(c3Var.m27043i()).m32872E(t);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar2.m32876A());
                    }
                }
                int i5 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30094o0.m39309L(i3, i5);
                int i6 = i3 + i5;
                if (size > i) {
                    int i7 = size - i;
                    int i8 = i6;
                    for (int i9 = 0; i9 < i7; i9++) {
                        int i10 = i8 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i8, new C2964ra(1));
                        i8 = i10 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i10, AbstractC9299t2.m9569Tf(R.id.search_chat_local, arrayList.get(i9 + min), t));
                    }
                    AbstractC9299t2.this.f30094o0.m39308M(i6, i8 - i6);
                } else if (size < i) {
                    AbstractC9299t2.this.f30094o0.m34204V1(i6, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6488o() {
            AbstractC9299t2.this.f30094o0.m34130s3(R.id.search_counter);
            if (AbstractC9299t2.this.f30094o0.m34240F0().isEmpty()) {
                AbstractC9299t2.this.f30094o0.m34113y2(new C2964ra[]{new C2964ra(24, 0, 0, R.string.NothingFound)}, false);
            }
        }

        @Override
        public void mo6487p(int i) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages);
            if (N0 != -1) {
                AbstractC9299t2.this.f30094o0.m34204V1(N0, ((i - 1) * 2) + 4 + 1);
            }
        }

        @Override
        public void mo6486q(ArrayList<C4614d3> arrayList) {
            if (AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages) == -1) {
                AbstractC9299t2 t2Var = AbstractC9299t2.this;
                t2Var.m9540sf(t2Var.f30094o0.m34240F0(), arrayList, 0, arrayList.size());
            }
        }

        @Override
        public void mo6485r(int i, ArrayList<C4601c3> arrayList) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_global);
            if (N0 != -1) {
                int i2 = N0 + 2;
                int size = arrayList.size();
                int min = Math.min(i, size);
                for (int i3 = 0; i3 < min; i3++) {
                    C2964ra raVar = AbstractC9299t2.this.f30094o0.m34240F0().get((i3 * 2) + i2);
                    if (raVar.m32876A() == 57) {
                        C4601c3 c3Var = arrayList.get(i3);
                        raVar.m32870G(c3Var).m32863N(c3Var.m27043i()).m32872E(false);
                    } else {
                        throw new IllegalStateException("Bug, viewType: " + raVar.m32876A());
                    }
                }
                int i4 = ((min - 1) * 2) + 1;
                AbstractC9299t2.this.f30094o0.m39309L(i2, i4);
                int i5 = i2 + i4;
                if (size > i) {
                    int i6 = size - i;
                    int i7 = i5;
                    for (int i8 = 0; i8 < i6; i8++) {
                        C4601c3 c3Var2 = arrayList.get(i8 + min);
                        int i9 = i7 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i7, new C2964ra(1));
                        i7 = i9 + 1;
                        AbstractC9299t2.this.f30094o0.m34240F0().add(i9, new C2964ra(57, R.id.search_chat_global).m32870G(c3Var2).m32863N(c3Var2.m27043i()));
                    }
                    AbstractC9299t2.this.f30094o0.m39308M(i5, i7 - i5);
                } else if (size < i) {
                    AbstractC9299t2.this.f30094o0.m34204V1(i5, (i - size) * 2);
                }
            }
        }

        @Override
        public void mo6484s(C4601c3 c3Var, int i, int i2) {
            C2964ra raVar;
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                int i3 = N0 + 2;
                int i4 = (i * 2) + i3;
                C2964ra remove = AbstractC9299t2.this.f30094o0.m34240F0().remove(i4);
                if (i != i2 - 1) {
                    raVar = AbstractC9299t2.this.f30094o0.m34240F0().remove(i4);
                    AbstractC9299t2.this.f30094o0.m39307N(i4, 2);
                } else {
                    int i5 = i4 - 1;
                    raVar = AbstractC9299t2.this.f30094o0.m34240F0().remove(i5);
                    AbstractC9299t2.this.f30094o0.m39307N(i5, 2);
                }
                AbstractC9299t2.this.f30094o0.m34240F0().add(i3, raVar);
                AbstractC9299t2.this.f30094o0.m34240F0().add(i3, remove);
                AbstractC9299t2.this.f30094o0.m39308M(i3, 2);
            }
        }

        @Override
        public int mo6483t() {
            int i = 0;
            for (C2964ra raVar : AbstractC9299t2.this.f30094o0.m34240F0()) {
                if (raVar.m32835j() == R.id.search_section_messages) {
                    break;
                }
                i += C2139ap.m35479W(raVar.m32876A());
            }
            return i;
        }

        @Override
        public void mo6482u(int i, ArrayList<C4614d3> arrayList) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_messages);
            if (N0 != -1) {
                int i2 = N0 + 2 + ((i - 1) * 2) + 1;
                int i3 = i2;
                while (i < arrayList.size()) {
                    int i4 = i3 + 1;
                    AbstractC9299t2.this.f30094o0.m34240F0().add(i3, new C2964ra(1));
                    i3 = i4 + 1;
                    AbstractC9299t2.this.f30094o0.m34240F0().add(i4, AbstractC9299t2.m9567Uf(arrayList.get(i)));
                    i++;
                }
                AbstractC9299t2.this.f30094o0.m39308M(i2, i3 - i2);
            }
        }

        @Override
        public boolean mo6481v(TdApi.Chat chat) {
            return AbstractC9299t2.this.mo9546mf(chat);
        }

        @Override
        public void mo6480w(boolean z) {
            if (!this.f30109a) {
                AbstractC9299t2.this.f30093n0.setItemAnimator(null);
            }
        }

        @Override
        public void mo6479x(C4601c3 c3Var) {
            int N0 = AbstractC9299t2.this.f30094o0.m34224N0(R.id.search_section_local);
            if (N0 != -1) {
                int i = N0 + 2;
                AbstractC9299t2.this.f30094o0.m34240F0().add(i, new C2964ra(1));
                AbstractC9299t2.this.f30094o0.m34240F0().add(i, AbstractC9299t2.m9569Tf(R.id.search_chat_local, c3Var, true));
                AbstractC9299t2.this.f30094o0.m39308M(i, 2);
            }
        }

        @Override
        public void mo6478y(long j) {
            this.f30110b.m34141p1(j);
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
            AbstractC9299t2.this.m9573Rf((C4601c3) ((C2964ra) d0Var.f3479a.getTag()).m32844d());
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar != null && raVar.m32876A() == 57 && raVar.m32848b();
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }
    }

    public class C9306g extends AnimatorListenerAdapter {
        public C9306g() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            AbstractC9299t2.this.mo9577Pf();
        }
    }

    public AbstractC9299t2(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public C6957m1.AbstractC6962e m9590Df(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
        C4601c3 c3Var;
        C2964ra raVar = (C2964ra) view.getTag();
        Object d = raVar.m32844d();
        if (d instanceof C4614d3) {
            c3Var = ((C4614d3) d).m26896c();
        } else {
            c3Var = (C4601c3) d;
        }
        boolean z = mo9549jf(c3Var) && this.f30158T != null;
        if (this.f30158T == null) {
            fVar.m18336J(true);
        }
        switch (raVar.m32835j()) {
            case R.id.search_chat_local:
            case R.id.search_chat_top:
                if (this.f30167b.m2542a3(c3Var.m27048d())) {
                    cVar.m23284a(R.id.btn_notifications);
                    boolean u3 = this.f30167b.m2223u3(c3Var.m27043i());
                    u0Var.m23816a(u3 ? R.string.Mute : R.string.Unmute);
                    cVar2.m23284a(u3 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
                    if (z) {
                        if (c3Var.m27042j() != null) {
                            boolean z3 = this.f30167b.m2143z3(c3Var.m27042j(), c3Var.m27043i());
                            cVar.m23284a(R.id.btn_pinUnpinChat);
                            u0Var.m23816a(z3 ? R.string.Unpin : R.string.Pin);
                            cVar2.m23284a(z3 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
                            if (this.f30167b.m2368l2(c3Var.m27042j(), c3Var.m27048d())) {
                                boolean Z2 = this.f30167b.m2557Z2(c3Var.m27043i());
                                cVar.m23284a(R.id.btn_archiveUnarchiveChat);
                                u0Var.m23816a(Z2 ? R.string.Unarchive : R.string.Archive);
                                cVar2.m23284a(Z2 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                            }
                        }
                        boolean B2 = this.f30167b.m2932B2(c3Var.m27048d());
                        cVar.m23284a(B2 ? R.id.btn_markChatAsRead : R.id.btn_markChatAsUnread);
                        u0Var.m23816a(B2 ? R.string.MarkAsRead : R.string.MarkAsUnread);
                        cVar2.m23284a(B2 ? R.drawable.baseline_done_all_24 : R.drawable.baseline_unsubscribe_24);
                        if (c3Var.m27034r()) {
                            cVar.m23284a(R.id.btn_removeChatFromListOrClearHistory);
                            u0Var.m23816a(R.string.Delete);
                            cVar2.m23284a(R.drawable.baseline_delete_24);
                        }
                    }
                }
                if (!c3Var.m27034r()) {
                    cVar.m23284a(R.id.btn_delete);
                    u0Var.m23816a(R.string.Remove);
                    cVar2.m23284a(R.drawable.baseline_delete_sweep_24);
                    break;
                }
                break;
        }
        if (mo9548kf(c3Var)) {
            cVar.m23284a(R.id.btn_selectChat);
            u0Var.m23816a(R.string.Select);
            cVar2.m23284a(R.drawable.baseline_playlist_add_check_24);
        }
        return new C9301b(c3Var, view, raVar);
    }

    public void m9589Ef(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32835j() == R.id.search_chat_top) {
            C4601c3 c3Var = (C4601c3) raVar.m32844d();
            if (c3Var.m27043i() != 0 && !mo9575Qf(view, c3Var)) {
                this.f30167b.m2485dd().m3569h7(this, c3Var.m27043i(), null);
            }
        }
    }

    public boolean m9588Ff(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32835j() != R.id.search_chat_top) {
            return false;
        }
        m9571Sf((C4601c3) raVar.m32844d());
        return true;
    }

    public boolean m9587Gf(View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30095p0.m6512w();
        return true;
    }

    public void m9586Hf(C4601c3 c3Var, View view, long j) {
        c3Var.m27026z(j);
        this.f30095p0.m6517r(c3Var);
        if (!mo9575Qf(view, c3Var)) {
            this.f30167b.m2485dd().m3569h7(this, j, null);
        }
    }

    public void m9585If(final View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        switch (raVar.m32835j()) {
            case R.id.search_chat_global:
            case R.id.search_chat_local:
                final C4601c3 c3Var = (C4601c3) raVar.m32844d();
                if (raVar.m32835j() == R.id.search_chat_global) {
                    m9234id();
                }
                if (c3Var.m27043i() != 0) {
                    this.f30095p0.m6517r(c3Var);
                    if (!mo9575Qf(view, c3Var)) {
                        this.f30167b.m2485dd().m3569h7(this, c3Var.m27043i(), null);
                        return;
                    }
                    return;
                } else if (c3Var.m27036p() != 0) {
                    this.f30167b.m2485dd().m3439u7(this, c3Var.m27036p(), new HandlerC10770jj.C10780j().m3367i().m3374b(new AbstractC5920l() {
                        @Override
                        public final void mo3050a(long j) {
                            AbstractC9299t2.this.m9586Hf(c3Var, view, j);
                        }
                    }));
                    return;
                } else {
                    return;
                }
            case R.id.search_message:
                TdApi.Message e = ((C4614d3) raVar.m32844d()).m26894e();
                m9234id();
                this.f30167b.m2485dd().m3569h7(this, e.chatId, new HandlerC10770jj.C10780j().m3370f(e).m3368h());
                return;
            case R.id.search_section_local:
                if (this.f30095p0.m6515t()) {
                    m9261ee(C4403w.m27869i1(R.string.ClearRecentsHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Clear), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Gf;
                            Gf = AbstractC9299t2.this.m9587Gf(view2, i);
                            return Gf;
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
                return;
            default:
                return;
        }
    }

    public boolean m9584Jf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30095p0.m6547X(c3Var);
        return true;
    }

    public boolean m9583Kf(View view) {
        if (view.getId() != R.id.search_chat_local) {
            return false;
        }
        C2964ra raVar = (C2964ra) view.getTag();
        if (!raVar.m32848b()) {
            return false;
        }
        final C4601c3 c3Var = (C4601c3) raVar.m32844d();
        m9261ee(C4403w.m27853m1(R.string.DeleteXFromRecents, c3Var.m27038n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Delete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Jf;
                Jf = AbstractC9299t2.this.m9584Jf(c3Var, view2, i);
                return Jf;
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

    public boolean m9582Lf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30095p0.m6547X(c3Var);
        return true;
    }

    public boolean m9581Mf(C4601c3 c3Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f30095p0.m6546Y(c3Var.m27043i());
        return true;
    }

    public static C2964ra m9569Tf(int i, C4601c3 c3Var, boolean z) {
        return new C2964ra(57, i).m32870G(c3Var).m32863N(c3Var.m27043i()).m32872E(z);
    }

    public static C2964ra m9567Uf(C4614d3 d3Var) {
        return new C2964ra(57, R.id.search_message).m32870G(d3Var).m32863N(d3Var.m26895d());
    }

    public final boolean m9593Af() {
        return this.f30095p0 != null;
    }

    public final void m9592Bf() {
        C9914k kVar = this.f30095p0;
        if (kVar != null) {
            kVar.m6549V(mo9538uf());
        }
    }

    @Override
    public void mo420Cc(String str) {
        super.mo420Cc(str);
        C9914k kVar = this.f30095p0;
        if (kVar != null) {
            kVar.m6553R(mo9538uf(), str);
        }
    }

    public final boolean m9591Cf() {
        C9914k kVar = this.f30095p0;
        return kVar != null && kVar.m6566E();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        C1399s0.m37171l0(this.f30093n0);
    }

    @Override
    public void mo9414J8(float f, boolean z) {
        super.mo9414J8(f, z);
        if (this.f30095p0 != null) {
            this.f30093n0.setAlpha(f);
            boolean z2 = true;
            m9563Wf(f == 1.0f);
            if (f == 0.0f) {
                z2 = false;
            }
            m9561Xf(z2);
        }
    }

    @Override
    public boolean mo9409Je() {
        return this.f30095p0 != null || super.mo9409Je();
    }

    public void mo9580Nf(C4601c3 c3Var) {
    }

    public boolean m9579Of() {
        return true;
    }

    public void mo9577Pf() {
    }

    public boolean mo9575Qf(View view, C4601c3 c3Var) {
        return false;
    }

    public final void m9573Rf(final C4601c3 c3Var) {
        m9261ee(C4403w.m27853m1(R.string.DeleteXFromRecents, c3Var.m27038n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Delete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Lf;
                Lf = AbstractC9299t2.this.m9582Lf(c3Var, view, i);
                return Lf;
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

    public final void m9571Sf(final C4601c3 c3Var) {
        m9261ee(C4403w.m27853m1(R.string.ChatHintsDelete, c3Var.m27038n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Delete), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Mf;
                Mf = AbstractC9299t2.this.m9581Mf(c3Var, view, i);
                return Mf;
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
    public void mo9343T5(int i, int i2) {
        super.mo9343T5(i, i2);
        C2546iq iqVar = this.f30094o0;
        if (iqVar != null) {
            iqVar.mo9343T5(i, i2);
        }
    }

    public final void m9565Vf(boolean z) {
        if (this.f30098s0 != z) {
            this.f30098s0 = z;
            C1379j0.m37318l0(this.f30165a, z ? 32 : 18);
        }
    }

    public final void m9563Wf(boolean z) {
        if (this.f30096q0 != z) {
            this.f30096q0 = z;
            mo9533zf().setVisibility(z ? 4 : 0);
        }
    }

    public final void m9561Xf(boolean z) {
        if (this.f30097r0 != z) {
            this.f30097r0 = z;
            this.f30093n0.setScrollDisabled(!z);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f30095p0 != null) {
            C11052v1.m1768b().m1766d(this.f30094o0);
            C1399s0.m37162q(this.f30093n0);
        }
    }

    @Override
    public int mo9286ba() {
        return (m9182qa() == 0.0f || this.f30095p0 == null) ? super.mo9286ba() : R.id.theme_color_background;
    }

    @Override
    public final boolean mo9263ec() {
        return m9382Na() && m9593Af();
    }

    @Override
    public void mo416gc() {
        super.mo416gc();
        C9914k kVar = this.f30095p0;
        if (kVar != null) {
            kVar.m6558M(mo9538uf());
            m9341T8();
        }
    }

    public boolean mo9549jf(C4601c3 c3Var) {
        return true;
    }

    public boolean mo9548kf(C4601c3 c3Var) {
        return false;
    }

    public boolean mo9547lf(TdApi.Chat chat) {
        return true;
    }

    public boolean mo9546mf(TdApi.Chat chat) {
        return true;
    }

    public final void m9545nf() {
        m9410Jd(0.0f, false);
        this.f30095p0.m6558M(mo9538uf());
        this.f30093n0.setAdapter(null);
    }

    public final void m9544of(String str) {
        if (this.f30093n0.getAdapter() == null) {
            this.f30093n0.setAdapter(this.f30094o0);
        }
        m9410Jd(1.0f, true);
        this.f30095p0.m6555P(mo9538uf());
        m9543pf(str);
    }

    @Override
    public void mo9187pc() {
        super.mo9187pc();
        C9914k kVar = this.f30095p0;
        if (kVar != null) {
            kVar.m6555P(mo9538uf());
        }
    }

    public final void m9543pf(String str) {
        this.f30095p0.m6553R(mo9538uf(), str);
    }

    public final CustomRecyclerView m9542qf(ViewGroup viewGroup) {
        boolean z = (mo9536wf() & 32) != 0;
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37146y(mo4347s(), R.layout.recycler_custom, viewGroup);
        this.f30093n0 = customRecyclerView;
        C1399s0.m37171l0(customRecyclerView);
        this.f30093n0.m39422k(new C9300a());
        this.f30093n0.setBackgroundColor(C11524j.m199b());
        m9197o8(this.f30093n0, R.id.theme_color_background);
        this.f30093n0.setLayoutManager(new LinearLayoutManager(mo4347s(), 1, false));
        if (viewGroup != null) {
            this.f30093n0.setAlpha(0.0f);
            this.f30093n0.setScrollDisabled(true);
        }
        this.f30093n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        View$OnClickListenerC6902i.AbstractC6905c s2Var = new View$OnClickListenerC6902i.AbstractC6905c() {
            @Override
            public final C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
                C6957m1.AbstractC6962e Df;
                Df = AbstractC9299t2.this.m9590Df(view, fVar, cVar, cVar2, u0Var, v4Var);
                return Df;
            }
        };
        C9302c cVar = new C9302c(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC9299t2.this.m9589Ef(view);
            }
        }, this, s2Var);
        cVar.m34238F2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Ff;
                Ff = AbstractC9299t2.this.m9588Ff(view);
                return Ff;
            }
        });
        this.f30094o0 = new C9303d(this, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC9299t2.this.m9585If(view);
            }
        }, this, cVar, s2Var);
        C11052v1.m1768b().m1769a(this.f30094o0);
        this.f30094o0.m34238F2(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean Kf;
                Kf = AbstractC9299t2.this.m9583Kf(view);
                return Kf;
            }
        });
        if (!z) {
            this.f30094o0.m34113y2(new C2964ra[]{new C2964ra(14)}, false);
        }
        RecyclerView.AbstractC0896m itemAnimator = this.f30093n0.getItemAnimator();
        if (!z) {
            this.f30093n0.setItemAnimator(null);
        }
        if (viewGroup == null) {
            this.f30093n0.setAdapter(this.f30094o0);
        }
        C9914k kVar = new C9914k(this.f30167b, new C9304e(z, cVar, itemAnimator));
        this.f30095p0 = kVar;
        kVar.m6527i0(mo9536wf());
        C4007j.m29342a(this.f30093n0, new C9305f());
        if (viewGroup != null) {
            viewGroup.addView(this.f30093n0);
        }
        if (m9579Of()) {
            this.f30095p0.m6554Q(mo9538uf(), mo9535xf());
        }
        return this.f30093n0;
    }

    public final int m9541rf(int i, List<C2964ra> list, ArrayList<C4601c3> arrayList, int i2, int i3, int i4, boolean z) {
        int size = list.size();
        if (arrayList != null && arrayList.size() > 0) {
            C5062b.m24159m(list, list.size() + ((arrayList.size() - 1) * 2) + 5);
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
                list.add(i6, m9569Tf(i3, next, z));
            }
            list.add(i6, new C2964ra(3));
        }
        return list.size() - size;
    }

    public final void m9540sf(java.util.List<p038ce.C2964ra> r17, java.util.ArrayList<gd.C4614d3> r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.AbstractC9299t2.m9540sf(java.util.List, java.util.ArrayList, int, int):void");
    }

    public final int m9539tf(List<C2964ra> list, int i) {
        int size = list.size();
        ArrayList<C4601c3> y = this.f30095p0.m6510y();
        if (y != null && y.size() > 0) {
            C5062b.m24159m(list, list.size() + 5);
            if (list.isEmpty()) {
                i++;
                list.add(i, new C2964ra(14));
            }
            int i2 = i + 1;
            list.add(i, new C2964ra(8, R.id.search_section_top, 0, (mo9536wf() & Log.TAG_CAMERA) != 0 ? R.string.Groups : R.string.People));
            int i3 = i2 + 1;
            list.add(i2, new C2964ra(2));
            list.add(i3, new C2964ra(58, R.id.search_top));
            list.add(i3 + 1, new C2964ra(3));
        }
        return list.size() - size;
    }

    @Override
    public void mo9150ue(ValueAnimator valueAnimator, int i, boolean z) {
        CustomRecyclerView customRecyclerView = this.f30093n0;
        if (customRecyclerView == null || customRecyclerView.getAdapter() != null || i != 2 || !z) {
            super.mo9150ue(valueAnimator, i, z);
            return;
        }
        valueAnimator.addListener(new C9306g());
        C2057b.m35732d(this.f30093n0, valueAnimator, true);
        this.f30093n0.setAdapter(this.f30094o0);
    }

    public TdApi.ChatList mo9538uf() {
        return null;
    }

    public int mo9537vf() {
        return R.string.general_Messages;
    }

    public int mo9536wf() {
        return 1;
    }

    public String mo9535xf() {
        return "";
    }

    public final RecyclerView m9534yf() {
        return this.f30093n0;
    }

    public View mo9533zf() {
        throw new RuntimeException("Stub!");
    }
}
