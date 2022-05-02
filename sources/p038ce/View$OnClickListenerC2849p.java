package p038ce;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1399s0;
import gd.C4601c3;
import gd.C4619e;
import gd.C4629f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.AbstractC6997q;
import me.C6957m1;
import me.C6981o;
import me.C7030t1;
import me.C7093z3;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2849p;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p350yd.AbstractC10664f9;
import p350yd.AbstractC10748j1;
import p350yd.AbstractC10924q0;
import p350yd.AbstractC11041ub;
import p350yd.C10722i1;
import p350yd.C10930q6;
import p350yd.C11020tb;
import sc.C8731d;
import td.AbstractC9323v4;
import td.C9188f2;
import vc.C9914k;

public class View$OnClickListenerC2849p extends AbstractC3204vo<Void> implements View.OnClickListener, Client.AbstractC7865g, AbstractC10748j1, AbstractC10924q0, View.OnLongClickListener, View$OnClickListenerC6902i.AbstractC6905c, AbstractC11041ub {
    public C2546iq f9567D0;
    public ArrayList<C4601c3> f9568E0;
    public C2546iq f9569F0;
    public ArrayList<TdApi.Message> f9570G0;
    public boolean f9571H0;
    public boolean f9572I0;
    public ArrayList<C4629f> f9573J0;

    public class C2850a extends C2546iq {

        public class C2851a extends AbstractC6997q {
            public C2851a() {
            }

            @Override
            public int mo18128l() {
                if (View$OnClickListenerC2849p.this.f9568E0 != null) {
                    return View$OnClickListenerC2849p.this.f9568E0.size();
                }
                return 0;
            }
        }

        public C2850a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        public static void m33214y3(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4) {
            if (i != i3 && i != 0) {
                customRecyclerView.m39507A0();
            }
        }

        @Override
        public void mo504H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
            if (raVar.m32838j() == R.id.search_top && recyclerView.getAdapter() != View$OnClickListenerC2849p.this.f9569F0) {
                recyclerView.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
                recyclerView.setAdapter(View$OnClickListenerC2849p.this.f9569F0);
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.m39437g(new C2851a());
                    ((CustomRecyclerView) recyclerView).setMeasureListener(C2800o.f9438a);
                }
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setCallItem((C4619e) raVar.m32847d());
        }

        @Override
        public void mo33216q2(C2964ra raVar, TextView textView, boolean z) {
            if (raVar.m32847d() instanceof C4629f) {
                C1399s0.m37178j0(textView, ((C4629f) raVar.m32847d()).m26797c());
            } else {
                super.mo33216q2(raVar, textView, z);
            }
        }

        @Override
        public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
            if (View$OnClickListenerC2849p.this.f9572I0) {
                t1Var.m18058E1(C4403w.m27838q2(R.string.xCalls, View$OnClickListenerC2849p.this.f9570G0.size()));
            } else {
                t1Var.m18057F1();
            }
        }
    }

    public class C2852b extends RecyclerView.AbstractC0910t {
        public C2852b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (View$OnClickListenerC2849p.this.f9570G0 != null && ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549a2() >= View$OnClickListenerC2849p.this.f9567D0.m34243F0().size() - 5) {
                View$OnClickListenerC2849p.this.m33222rh();
            }
        }
    }

    public class C2853c extends C2546iq {
        public C2853c(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var) {
            super(f9Var, onClickListener, v4Var);
        }

        @Override
        public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
            z3Var.setPreviewActionListProvider(View$OnClickListenerC2849p.this);
            z3Var.setChat((C4601c3) raVar.m32847d());
        }
    }

    public class C2854d implements C6957m1.AbstractC6962e {
        public final C4601c3 f9578M;
        public final long f9580a;
        public final C4619e f9581b;
        public final long f9582c;

        public C2854d(long j, C4619e eVar, long j2, C4601c3 c3Var) {
            this.f9580a = j;
            this.f9581b = eVar;
            this.f9582c = j2;
            this.f9578M = c3Var;
        }

        public void m33211c(long j, C4619e eVar, int i, SparseIntArray sparseIntArray) {
            if (i == R.id.btn_delete) {
                View$OnClickListenerC2849p.this.f30170b.m2770L4(j, eVar.m26858f(), sparseIntArray.get(R.id.btn_deleteAll) != 0);
            }
        }

        public boolean m33210d(long j, C4619e eVar, View view, int i) {
            if (i != R.id.btn_delete) {
                return true;
            }
            View$OnClickListenerC2849p.this.f30170b.m2770L4(j, eVar.m26858f(), false);
            return true;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            if (i != R.id.btn_delete) {
                if (i == R.id.btn_phone_call) {
                    View$OnClickListenerC2849p.this.f30170b.m2930B4().m4713c0().m4545v0(View$OnClickListenerC2849p.this, this.f9580a, null, true);
                }
            } else if (this.f9581b != null) {
                String zb = View$OnClickListenerC2849p.this.f30170b.m2135zb(new TdApi.MessageSenderUser(this.f9581b.m26851m()), true);
                CharSequence m1 = C4403w.m27855m1(R.string.QDeleteCallFromRecent, new Object[0]);
                if (this.f9581b.m26862b()) {
                    View$OnClickListenerC2849p pVar = View$OnClickListenerC2849p.this;
                    C9188f2 p = new C9188f2(R.id.btn_delete).m10003i(new C2964ra(28, (int) R.id.text_title, 0, m1, false)).m9996p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_deleteAll, 0, C4403w.m27855m1(R.string.DeleteForUser, zb), false)});
                    final long j = this.f9582c;
                    final C4619e eVar = this.f9581b;
                    pVar.m9206me(p.m10002j(new AbstractC9323v4.AbstractC9343r() {
                        @Override
                        public final void mo1773l6(int i2, SparseIntArray sparseIntArray) {
                            View$OnClickListenerC2849p.C2854d.this.m33211c(j, eVar, i2, sparseIntArray);
                        }
                    }).m9994r(R.string.Delete).m9995q(R.id.theme_color_textNegative));
                    return;
                }
                View$OnClickListenerC2849p pVar2 = View$OnClickListenerC2849p.this;
                int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
                String[] strArr = {C4403w.m27871i1(R.string.DeleteEntry), C4403w.m27871i1(R.string.Cancel)};
                int[] iArr2 = {R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24};
                final long j2 = this.f9582c;
                final C4619e eVar2 = this.f9581b;
                pVar2.m9261ee(null, iArr, strArr, new int[]{2, 1}, iArr2, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i2) {
                        boolean d;
                        d = View$OnClickListenerC2849p.C2854d.this.m33210d(j2, eVar2, view, i2);
                        return d;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23935b(this, i2);
                    }
                });
            } else {
                C4601c3 c3Var = this.f9578M;
                if (c3Var != null) {
                    View$OnClickListenerC2849p.this.m33219uh(c3Var);
                }
            }
        }
    }

    public View$OnClickListenerC2849p(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static boolean m33237ch(TdApi.Message message) {
        return message.content.getConstructor() == 538893824 && message.sendingState == null && message.schedulingState == null;
    }

    public static boolean m33234fh(C2964ra raVar) {
        return raVar.m32879A() == 57;
    }

    public void m33233gh(TdApi.Object object) {
        if (!m9347Sa()) {
            this.f9571H0 = false;
            if (object.getConstructor() == -16498159) {
                m33240Zg((TdApi.Messages) object);
            }
        }
    }

    public void m33232hh(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2849p.this.m33233gh(object);
            }
        });
    }

    public boolean m33231ih(long j, long[] jArr, View view, int i) {
        if (i == R.id.btn_deleteAll) {
            this.f30170b.m2770L4(j, jArr, false);
            return true;
        } else if (i != R.id.btn_openChat) {
            return true;
        } else {
            this.f30170b.m2485dd().m3569h7(this, j, null);
            return true;
        }
    }

    public void m33230jh(TdApi.Message message) {
        if (!m9347Sa()) {
            m33241Yg(message);
        }
    }

    public void m33229kh(long[] jArr, long j) {
        if (!m9347Sa()) {
            for (long j2 : jArr) {
                m33220th(j, j2);
            }
        }
    }

    public void m33228lh(TdApi.Message message) {
        if (!m9347Sa()) {
            m33241Yg(message);
        }
    }

    public void m33227mh(TdApi.Object object) {
        if (!m9347Sa()) {
            if (Log.isEnabled(8) && Log.checkLogLevel(5)) {
                Log.m14721i(8, "Calls list: %s", object);
            }
            m33218vh((TdApi.Messages) object);
        }
    }

    public void m33226nh(ArrayList arrayList) {
        if (!m9347Sa()) {
            m33217wh(arrayList);
        }
    }

    public boolean m33225oh(C4601c3 c3Var, View view, int i) {
        if (i == R.id.btn_delete) {
            this.f30170b.m2270r4().m14783o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryCalls(), c3Var.m27049e()), this.f30170b.m2392ja());
            if (!m33236dh()) {
                this.f30170b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
            } else if (this.f9568E0.size() != 1 || !this.f9568E0.remove(c3Var)) {
                this.f9568E0.remove(c3Var);
                int L0 = this.f9569F0.m34231L0(c3Var);
                if (L0 != -1) {
                    this.f9569F0.m34150n1(L0);
                    this.f9569F0.m39312L(0, this.f9568E0.size());
                }
                if (this.f9568E0.size() > 15) {
                    this.f30170b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
                }
            } else {
                m33217wh(null);
            }
        }
        return true;
    }

    public void m33224ph(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32838j() == R.id.search_chat_top) {
            C4601c3 c3Var = (C4601c3) raVar.m32847d();
            if (c3Var.m27045i() != 0) {
                this.f30170b.m2930B4().m4713c0().m4549t0(this, c3Var.m27038p(), null);
            }
        }
    }

    public boolean m33223qh(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32838j() != R.id.search_chat_top) {
            return false;
        }
        m33219uh((C4601c3) raVar.m32847d());
        return true;
    }

    @Override
    public void mo4051E2(final TdApi.Message message) {
        if (m33237ch(message)) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2849p.this.m33228lh(message);
                }
            });
        }
    }

    @Override
    public void mo1779G0(boolean z) {
        C11020tb.m1988a(this, z);
    }

    @Override
    public void mo4050H(final long j, final long[] jArr) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2849p.this.m33229kh(jArr, j);
            }
        });
    }

    @Override
    public C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        C4601c3 c3Var;
        C4619e eVar;
        long j;
        long j2;
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar == null) {
            return null;
        }
        int j3 = raVar.m32838j();
        if (j3 == R.id.call) {
            C4619e eVar2 = (C4619e) raVar.m32847d();
            j = eVar2.m26851m();
            j2 = eVar2.m26861c();
            eVar = eVar2;
            c3Var = null;
        } else if (j3 != R.id.search_chat_top) {
            return null;
        } else {
            C4601c3 c3Var2 = (C4601c3) raVar.m32847d();
            j2 = c3Var2.m27045i();
            j = c3Var2.m27038p();
            c3Var = c3Var2;
            eVar = null;
        }
        long j4 = j2;
        long j5 = j;
        if (this.f30170b.m2480e2().m1733H2(j5)) {
            cVar.m23285a(R.id.btn_phone_call);
            u0Var.m23817a(R.string.Call);
            cVar2.m23285a(R.drawable.baseline_call_24);
        }
        cVar.m23285a(R.id.btn_delete);
        u0Var.m23817a(R.string.RemoveCall);
        cVar2.m23285a(R.drawable.baseline_delete_sweep_24);
        return new C2854d(j5, eVar, j4, c3Var);
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        if (i == 0 || i == 1) {
            this.f9567D0.m34254A1();
        } else if (i == 2) {
            this.f9567D0.m34245E1(i2);
        } else if (i == 3) {
            this.f9567D0.m34249C1(C2269d.f7863a);
        }
    }

    @Override
    public void mo1778Q2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        C11020tb.m1985d(this, suggestedActionArr, suggestedActionArr2);
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_call_list;
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    @Override
    public void mo4044X1(final TdApi.Message message, long j) {
        if (m33237ch(message)) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2849p.this.m33230jh(message);
                }
            });
        }
    }

    public final void m33241Yg(TdApi.Message message) {
        if (this.f9570G0 != null && m33235eh(message.chatId, message.f25409id) == -1) {
            if ((this.f9570G0.isEmpty() || this.f9570G0.get(0).date <= message.date) && this.f9573J0 != null) {
                this.f9570G0.add(0, message);
                if (this.f9573J0.isEmpty()) {
                    m33238bh();
                    return;
                }
                C4619e eVar = new C4619e(this.f30170b, message);
                int e = this.f9573J0.get(0).m26795e(eVar);
                int i = 1;
                if (e == 0) {
                    C4629f fVar = new C4629f(eVar);
                    this.f9573J0.add(0, fVar);
                    if (m33236dh()) {
                        i = 5;
                    }
                    this.f9567D0.m34243F0().add(i, new C2964ra(3));
                    this.f9567D0.m34243F0().add(i, new C2964ra(57, R.id.call).m32873G(eVar));
                    this.f9567D0.m34243F0().add(i, new C2964ra(2));
                    this.f9567D0.m34243F0().add(i, new C2964ra(8, 0, 0, (CharSequence) fVar.m26797c(), false).m32873G(fVar.m26797c()));
                    this.f9567D0.m39311M(i, 4);
                } else if (e == 1) {
                    int i2 = m33236dh() ? 7 : 3;
                    this.f9567D0.m34243F0().add(i2, new C2964ra(1));
                    this.f9567D0.m34243F0().add(i2, new C2964ra(57, R.id.call).m32873G(eVar));
                    this.f9567D0.m39311M(3, 2);
                } else if (e == 2) {
                    this.f9567D0.m34127u3(3);
                }
                this.f9567D0.m34133s3(R.id.btn_calls);
            }
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1826o0(this);
    }

    public final void m33240Zg(TdApi.Messages messages) {
        C4629f fVar;
        int i;
        int i2 = 1;
        if (messages.messages.length == 0) {
            this.f9572I0 = true;
            this.f9567D0.m34133s3(R.id.btn_calls);
            return;
        }
        if (this.f9573J0.isEmpty()) {
            fVar = null;
        } else {
            ArrayList<C4629f> arrayList = this.f9573J0;
            fVar = arrayList.get(arrayList.size() - 1);
        }
        boolean z = fVar == null;
        if (z) {
            C2546iq iqVar = this.f9567D0;
            iqVar.m34207V1(0, iqVar.m34243F0().size());
        }
        int i3 = 2;
        int size = z ? 0 : this.f9567D0.m34243F0().size() - 2;
        TdApi.Message[] messageArr = messages.messages;
        int length = messageArr.length;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        boolean z2 = true;
        boolean z3 = true;
        while (i4 < length) {
            TdApi.Message message = messageArr[i4];
            this.f9570G0.add(message);
            C4619e eVar = new C4619e(this.f30170b, message);
            int a = fVar != null ? fVar.m26799a(eVar) : 0;
            if (a == 0) {
                if (z2) {
                    if (i6 > 0) {
                        this.f9567D0.m39311M(size, i6);
                    }
                    size = this.f9567D0.m34243F0().size() - 1;
                    i = 0;
                    z2 = false;
                } else {
                    if (z) {
                        this.f9567D0.m34243F0().add(size + i6, new C2964ra(14));
                        z = false;
                    } else {
                        this.f9567D0.m34243F0().add(size + i6, new C2964ra(3));
                    }
                    i = i6 + 1;
                }
                fVar = new C4629f(eVar);
                this.f9573J0.add(fVar);
                this.f9567D0.m34243F0().add(size + i, new C2964ra(8, 0, 0, (CharSequence) fVar.m26797c(), false).m32873G(fVar));
                int i7 = i + 1;
                this.f9567D0.m34243F0().add(size + i7, new C2964ra(2));
                i6 = i7 + 1;
                this.f9567D0.m34243F0().add(size + i6, new C2964ra(57, R.id.call).m32873G(eVar));
            } else if (a != i2) {
                if (a == i3 && z3) {
                    i5 = size - 1;
                }
                i4++;
                i3 = 2;
            } else {
                if (fVar.m26798b().size() > i2) {
                    this.f9567D0.m34243F0().add(size + i6, new C2964ra(i2));
                    i6++;
                }
                this.f9567D0.m34243F0().add(size + i6, new C2964ra(57, R.id.call).m32873G(eVar));
            }
            i2 = 1;
            i6++;
            z3 = false;
            i4++;
            i3 = 2;
        }
        if (i5 != -1) {
            this.f9567D0.m34127u3(i5);
        }
        if (i6 > 0) {
            if (!z2) {
                this.f9567D0.m34243F0().add(size + i6, new C2964ra(3));
                i6++;
            }
            this.f9567D0.m39311M(size, i6);
        }
    }

    public final void m33239ah() {
        boolean z;
        ArrayList<C4601c3> arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C4629f> arrayList3 = this.f9573J0;
        if (arrayList3 == null) {
            arrayList2.add(new C2964ra(15));
        } else {
            int i = 14;
            if (arrayList3.isEmpty() || (arrayList = this.f9568E0) == null || arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList2.add(new C2964ra(14));
                arrayList2.add(m33221sh());
                arrayList2.add(new C2964ra(2));
                arrayList2.add(new C2964ra(58, R.id.search_top));
                arrayList2.add(new C2964ra(3));
                z = false;
            }
            Iterator<C4629f> it = this.f9573J0.iterator();
            while (it.hasNext()) {
                C4629f next = it.next();
                if (z) {
                    arrayList2.add(new C2964ra(i));
                    z = false;
                }
                arrayList2.add(new C2964ra(8, 0, 0, (CharSequence) next.m26797c(), false).m32873G(next));
                arrayList2.add(new C2964ra(2));
                Iterator<C4619e> it2 = next.m26798b().iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    C4619e next2 = it2.next();
                    if (z2) {
                        z2 = false;
                    } else {
                        arrayList2.add(new C2964ra(1));
                    }
                    arrayList2.add(new C2964ra(57, R.id.call).m32873G(next2));
                }
                arrayList2.add(new C2964ra(3));
                i = 14;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(new C2964ra(24, 0, 0, R.string.NoCalls));
            } else {
                arrayList2.add(new C2964ra(42, R.id.btn_calls));
            }
        }
        this.f9567D0.m34119x2(arrayList2, false);
    }

    public final void m33238bh() {
        this.f9573J0 = new ArrayList<>();
        Iterator<TdApi.Message> it = this.f9570G0.iterator();
        C4629f fVar = null;
        while (it.hasNext()) {
            C4619e eVar = new C4619e(this.f30170b, it.next());
            if (fVar == null || fVar.m26799a(eVar) == 0) {
                fVar = new C4629f(eVar);
                this.f9573J0.add(fVar);
            }
        }
        m33239ah();
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public final boolean m33236dh() {
        ArrayList<C4601c3> arrayList = this.f9568E0;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final int m33235eh(long j, long j2) {
        ArrayList<TdApi.Message> arrayList = this.f9570G0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<TdApi.Message> it = this.f9570G0.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j && next.f25409id == j2) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public void mo1777g(String str, TdApi.LanguagePackInfo languagePackInfo) {
        C11020tb.m1984e(this, str, languagePackInfo);
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
        C10722i1.m4162j(this, message, j, i, str);
    }

    @Override
    public void mo4041l0(long j, long j2, TdApi.MessageContent messageContent) {
        C10722i1.m4170b(this, j, j2, messageContent);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32879A() == 57) {
            this.f30170b.m2930B4().m4713c0().m4549t0(this, ((C4619e) raVar.m32847d()).m26851m(), null);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && raVar.m32879A() == 57) {
            C4619e eVar = (C4619e) raVar.m32847d();
            final long c = eVar.m26861c();
            final long[] f = eVar.m26858f();
            if (f != null) {
                m9261ee(null, new int[]{R.id.btn_deleteAll, R.id.btn_openChat, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.DeleteEntry), C4403w.m27871i1(R.string.OpenChat), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_chat_bubble_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean ih;
                        ih = View$OnClickListenerC2849p.this.m33231ih(c, f, view2, i);
                        return ih;
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
        }
        return false;
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    @Override
    public void mo1776q3(boolean z) {
        C11020tb.m1987b(this, z);
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    @Override
    public void mo1775r7(boolean z) {
        this.f30170b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2850a aVar = new C2850a(this);
        this.f9567D0 = aVar;
        aVar.m34241F2(this);
        m33239ah();
        customRecyclerView.setAdapter(this.f9567D0);
        customRecyclerView.m39425k(new C2852b());
        this.f30170b.m2270r4().m14783o(new TdApi.SearchCallMessages(0L, C1357a0.m37551b(C1357a0.m37544i(72.0f), 20), false), this);
        this.f30170b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
        this.f30170b.m2781K9().m1882a0(this);
    }

    public final void m33222rh() {
        ArrayList<TdApi.Message> arrayList;
        ArrayList<C4629f> arrayList2;
        if (!this.f9571H0 && (arrayList = this.f9570G0) != null && !arrayList.isEmpty() && !this.f9572I0 && (arrayList2 = this.f9573J0) != null && !arrayList2.isEmpty() && !m9347Sa()) {
            this.f9571H0 = true;
            Client r4 = this.f30170b.m2270r4();
            ArrayList<TdApi.Message> arrayList3 = this.f9570G0;
            r4.m14783o(new TdApi.SearchCallMessages(arrayList3.get(arrayList3.size() - 1).f25409id, 40, false), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2849p.this.m33232hh(object);
                }
            });
        }
    }

    public final C2964ra m33221sh() {
        return new C2964ra(8, 0, 0, R.string.People);
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        final ArrayList arrayList;
        int constructor = object.getConstructor();
        if (constructor == -16498159) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2849p.this.m33227mh(object);
                }
            });
        } else if (constructor == 1809654812) {
            long[] jArr = ((TdApi.Chats) object).chatIds;
            if (jArr.length >= 3) {
                arrayList = new ArrayList(jArr.length);
                C9914k.m6552S(this.f30170b, null, 0, arrayList, null, jArr, null, false, null);
            } else {
                arrayList = null;
            }
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2849p.this.m33226nh(arrayList);
                }
            });
        }
    }

    @Override
    public void mo1774t4(boolean z) {
        C11020tb.m1986c(this, z);
    }

    public final void m33220th(long j, long j2) {
        int eh = m33235eh(j, j2);
        if (eh != -1) {
            this.f9570G0.remove(eh);
            ArrayList<C4629f> arrayList = this.f9573J0;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f9570G0.isEmpty()) {
                    this.f9573J0.clear();
                    m33239ah();
                    return;
                }
                Iterator<C4629f> it = this.f9573J0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4629f next = it.next();
                    Iterator<C4619e> it2 = next.m26798b().iterator();
                    boolean z = true;
                    while (it2.hasNext()) {
                        C4619e next2 = it2.next();
                        if (next2.m26843u(j, j2)) {
                            int L0 = this.f9567D0.m34231L0(next2);
                            if (next2.m26850n()) {
                                next.m26794f(next2);
                                if (next.m26796d()) {
                                    this.f9573J0.remove(next);
                                    this.f9567D0.m34207V1(L0 - 2, 4);
                                } else {
                                    C2546iq iqVar = this.f9567D0;
                                    if (!z) {
                                        L0--;
                                    }
                                    iqVar.m34207V1(L0, 2);
                                }
                            } else {
                                this.f9567D0.m34127u3(L0);
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                this.f9567D0.m34133s3(R.id.btn_calls);
            }
        }
    }

    public final void m33219uh(final C4601c3 c3Var) {
        m9261ee(C4403w.m27855m1(R.string.ChatHintsDelete, c3Var.m27040n()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Delete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean oh;
                oh = View$OnClickListenerC2849p.this.m33225oh(c3Var, view, i);
                return oh;
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

    public final void m33218vh(TdApi.Messages messages) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>(messages.messages.length);
        this.f9570G0 = arrayList;
        Collections.addAll(arrayList, messages.messages);
        m33238bh();
        m31297ug();
    }

    public final void m33217wh(ArrayList<C4601c3> arrayList) {
        if (this.f9568E0 != null || arrayList != null) {
            ArrayList<C4629f> arrayList2 = this.f9573J0;
            boolean z = false;
            boolean z2 = arrayList2 != null && !arrayList2.isEmpty();
            ArrayList<C4601c3> arrayList3 = this.f9568E0;
            boolean z3 = arrayList3 != null && !arrayList3.isEmpty() && z2;
            if (arrayList != null && !arrayList.isEmpty() && z2) {
                z = true;
            }
            this.f9568E0 = arrayList;
            if (arrayList != null && this.f9569F0 == null) {
                C2853c cVar = new C2853c(this, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View$OnClickListenerC2849p.this.m33224ph(view);
                    }
                }, this);
                this.f9569F0 = cVar;
                cVar.m34241F2(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean qh;
                        qh = View$OnClickListenerC2849p.this.m33223qh(view);
                        return qh;
                    }
                });
            }
            if (!(this.f9569F0 == null || arrayList == null)) {
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator<C4601c3> it = arrayList.iterator();
                while (it.hasNext()) {
                    C4601c3 next = it.next();
                    next.m27063D();
                    arrayList4.add(new C2964ra(59, R.id.search_chat_top).m32873G(next).m32866N(next.m27045i()));
                }
                this.f9569F0.m34205W1(arrayList4);
            }
            if (z != z3 && z2) {
                if (z) {
                    List<C2964ra> F0 = this.f9567D0.m34243F0();
                    F0.add(1, m33221sh());
                    F0.add(2, new C2964ra(2));
                    F0.add(3, new C2964ra(58, R.id.search_top));
                    F0.add(4, new C2964ra(3));
                    this.f9567D0.m39311M(1, 4);
                    return;
                }
                this.f9567D0.m34207V1(1, 4);
            }
        }
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }
}
