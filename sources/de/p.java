package de;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import de.p;
import gd.w;
import hd.c3;
import hd.e;
import hd.f;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ne.i;
import ne.m1;
import ne.o;
import ne.q;
import ne.t1;
import ne.y3;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.f2;
import ud.v4;
import wc.k;
import zd.d9;
import zd.g1;
import zd.h1;
import zd.o0;
import zd.o6;
import zd.rb;
import zd.sb;

public class p extends vo<Void> implements View.OnClickListener, Client.g, h1, o0, View.OnLongClickListener, i.c, sb {
    public iq D0;
    public ArrayList<c3> E0;
    public iq F0;
    public ArrayList<TdApi.Message> G0;
    public boolean H0;
    public boolean I0;
    public ArrayList<f> J0;

    public class a extends iq {

        public class C0090a extends q {
            public C0090a() {
            }

            @Override
            public int l() {
                if (p.this.E0 != null) {
                    return p.this.E0.size();
                }
                return 0;
            }
        }

        public a(v4 v4Var) {
            super(v4Var);
        }

        public static void w3(CustomRecyclerView customRecyclerView, int i10, int i11, int i12, int i13) {
            if (i10 != i12 && i10 != 0) {
                customRecyclerView.A0();
            }
        }

        @Override
        public void D2(ra raVar, RecyclerView recyclerView, boolean z10) {
            if (raVar.j() == R.id.search_top && recyclerView.getAdapter() != p.this.F0) {
                recyclerView.setItemAnimator(new tc.d(db.b.f7287b, 180L));
                recyclerView.setAdapter(p.this.F0);
                if (recyclerView.getItemDecorationCount() == 0) {
                    recyclerView.g(new C0090a());
                    ((CustomRecyclerView) recyclerView).setMeasureListener(o.f8929a);
                }
            }
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setCallItem((e) raVar.d());
        }

        @Override
        public void l2(ra raVar, TextView textView, boolean z10) {
            if (raVar.d() instanceof f) {
                p0.c0(textView, ((f) raVar.d()).c());
            } else {
                super.l2(raVar, textView, z10);
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            if (p.this.I0) {
                t1Var.B1(w.q2(R.string.xCalls, p.this.G0.size()));
            } else {
                t1Var.C1();
            }
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (p.this.G0 != null && ((LinearLayoutManager) recyclerView.getLayoutManager()).a2() >= p.this.D0.D0().size() - 5) {
                p.this.rh();
            }
        }
    }

    public class c extends iq {
        public c(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var) {
            super(d9Var, onClickListener, v4Var);
        }

        @Override
        public void Z1(ra raVar, y3 y3Var) {
            y3Var.setPreviewActionListProvider(p.this);
            y3Var.setChat((c3) raVar.d());
        }
    }

    public class d implements m1.e {
        public final c3 M;
        public final long f9028a;
        public final e f9029b;
        public final long f9030c;

        public d(long j10, e eVar, long j11, c3 c3Var) {
            this.f9028a = j10;
            this.f9029b = eVar;
            this.f9030c = j11;
            this.M = c3Var;
        }

        public void c(long j10, e eVar, int i10, SparseIntArray sparseIntArray) {
            if (i10 == R.id.btn_delete) {
                p.this.f24495b.P4(j10, eVar.f(), sparseIntArray.get(R.id.btn_deleteAll) != 0);
            }
        }

        public boolean d(long j10, e eVar, View view, int i10) {
            if (i10 != R.id.btn_delete) {
                return true;
            }
            p.this.f24495b.P4(j10, eVar.f(), false);
            return true;
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
            if (i10 != R.id.btn_delete) {
                if (i10 == R.id.btn_phone_call) {
                    p.this.f24495b.F4().c0().r0(p.this, this.f9028a, null, true);
                }
            } else if (this.f9029b != null) {
                String Db = p.this.f24495b.Db(new TdApi.MessageSenderUser(this.f9029b.m()), true);
                CharSequence m12 = w.m1(R.string.QDeleteCallFromRecent, new Object[0]);
                if (this.f9029b.b()) {
                    p pVar = p.this;
                    f2 p10 = new f2(R.id.btn_delete).i(new ra(28, (int) R.id.text_title, 0, m12, false)).p(new ra[]{new ra(12, (int) R.id.btn_deleteAll, 0, w.m1(R.string.DeleteForUser, Db), false)});
                    final long j10 = this.f9030c;
                    final e eVar = this.f9029b;
                    pVar.me(p10.j(new v4.r() {
                        @Override
                        public final void l6(int i11, SparseIntArray sparseIntArray) {
                            p.d.this.c(j10, eVar, i11, sparseIntArray);
                        }
                    }).r(R.string.Delete).q(R.id.theme_color_textNegative));
                    return;
                }
                p pVar2 = p.this;
                int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
                String[] strArr = {w.i1(R.string.DeleteEntry), w.i1(R.string.Cancel)};
                int[] iArr2 = {R.drawable.baseline_delete_sweep_24, R.drawable.baseline_cancel_24};
                final long j11 = this.f9030c;
                final e eVar2 = this.f9029b;
                pVar2.ee(null, iArr, strArr, new int[]{2, 1}, iArr2, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i11) {
                        return g0.b(this, i11);
                    }

                    @Override
                    public final boolean r3(View view, int i11) {
                        boolean d10;
                        d10 = p.d.this.d(j11, eVar2, view, i11);
                        return d10;
                    }
                });
            } else {
                c3 c3Var = this.M;
                if (c3Var != null) {
                    p.this.uh(c3Var);
                }
            }
        }
    }

    public p(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static boolean ch(TdApi.Message message) {
        return message.content.getConstructor() == 538893824 && message.sendingState == null && message.schedulingState == null;
    }

    public static boolean fh(ra raVar) {
        return raVar.A() == 57;
    }

    public void gh(TdApi.Object object) {
        if (!Sa()) {
            this.H0 = false;
            if (object.getConstructor() == -16498159) {
                Zg((TdApi.Messages) object);
            }
        }
    }

    public void hh(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                p.this.gh(object);
            }
        });
    }

    public boolean ih(long j10, long[] jArr, View view, int i10) {
        if (i10 == R.id.btn_deleteAll) {
            this.f24495b.P4(j10, jArr, false);
            return true;
        } else if (i10 != R.id.btn_openChat) {
            return true;
        } else {
            this.f24495b.hd().h7(this, j10, null);
            return true;
        }
    }

    public void jh(TdApi.Message message) {
        if (!Sa()) {
            Yg(message);
        }
    }

    public void kh(long[] jArr, long j10) {
        if (!Sa()) {
            for (long j11 : jArr) {
                th(j10, j11);
            }
        }
    }

    public void lh(TdApi.Message message) {
        if (!Sa()) {
            Yg(message);
        }
    }

    public void mh(TdApi.Object object) {
        if (!Sa()) {
            if (Log.isEnabled(8) && Log.checkLogLevel(5)) {
                Log.i(8, "Calls list: %s", object);
            }
            vh((TdApi.Messages) object);
        }
    }

    public void nh(ArrayList arrayList) {
        if (!Sa()) {
            wh(arrayList);
        }
    }

    public boolean oh(c3 c3Var, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            this.f24495b.v4().o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryCalls(), c3Var.e()), this.f24495b.na());
            if (!dh()) {
                this.f24495b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
            } else if (this.E0.size() != 1 || !this.E0.remove(c3Var)) {
                this.E0.remove(c3Var);
                int J0 = this.F0.J0(c3Var);
                if (J0 != -1) {
                    this.F0.j1(J0);
                    this.F0.L(0, this.E0.size());
                }
                if (this.E0.size() > 15) {
                    this.f24495b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
                }
            } else {
                wh(null);
            }
        }
        return true;
    }

    public void ph(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar.j() == R.id.search_chat_top) {
            c3 c3Var = (c3) raVar.d();
            if (c3Var.i() != 0) {
                this.f24495b.F4().c0().p0(this, c3Var.p(), null);
            }
        }
    }

    public boolean qh(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar.j() != R.id.search_chat_top) {
            return false;
        }
        uh((c3) raVar.d());
        return true;
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    @Override
    public void G0(boolean z10) {
        rb.a(this, z10);
    }

    @Override
    public void G2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        rb.d(this, suggestedActionArr, suggestedActionArr2);
    }

    @Override
    public void H(final long j10, final long[] jArr) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                p.this.kh(jArr, j10);
            }
        });
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public void Ja(int i10, int i11) {
        if (i10 == 0 || i10 == 1) {
            this.D0.w1();
        } else if (i10 == 2) {
            this.D0.z1(i11);
        } else if (i10 == 3) {
            this.D0.x1(de.d.f7684a);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_call_list;
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public void X1(final TdApi.Message message, long j10) {
        if (ch(message)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    p.this.jh(message);
                }
            });
        }
    }

    public final void Yg(TdApi.Message message) {
        if (this.G0 != null && eh(message.chatId, message.f19946id) == -1) {
            if ((this.G0.isEmpty() || this.G0.get(0).date <= message.date) && this.J0 != null) {
                this.G0.add(0, message);
                if (this.J0.isEmpty()) {
                    bh();
                    return;
                }
                e eVar = new e(this.f24495b, message);
                int e10 = this.J0.get(0).e(eVar);
                int i10 = 1;
                if (e10 == 0) {
                    f fVar = new f(eVar);
                    this.J0.add(0, fVar);
                    if (dh()) {
                        i10 = 5;
                    }
                    this.D0.D0().add(i10, new ra(3));
                    this.D0.D0().add(i10, new ra(57, R.id.call).G(eVar));
                    this.D0.D0().add(i10, new ra(2));
                    this.D0.D0().add(i10, new ra(8, 0, 0, (CharSequence) fVar.c(), false).G(fVar.c()));
                    this.D0.M(i10, 4);
                } else if (e10 == 1) {
                    int i11 = dh() ? 7 : 3;
                    this.D0.D0().add(i11, new ra(1));
                    this.D0.D0().add(i11, new ra(57, R.id.call).G(eVar));
                    this.D0.M(3, 2);
                } else if (e10 == 2) {
                    this.D0.r3(3);
                }
                this.D0.p3(R.id.btn_calls);
            }
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().o0(this);
    }

    public final void Zg(TdApi.Messages messages) {
        f fVar;
        int i10;
        int i11 = 1;
        if (messages.messages.length == 0) {
            this.I0 = true;
            this.D0.p3(R.id.btn_calls);
            return;
        }
        if (this.J0.isEmpty()) {
            fVar = null;
        } else {
            ArrayList<f> arrayList = this.J0;
            fVar = arrayList.get(arrayList.size() - 1);
        }
        boolean z10 = fVar == null;
        if (z10) {
            iq iqVar = this.D0;
            iqVar.R1(0, iqVar.D0().size());
        }
        int i12 = 2;
        int size = z10 ? 0 : this.D0.D0().size() - 2;
        TdApi.Message[] messageArr = messages.messages;
        int length = messageArr.length;
        int i13 = 0;
        int i14 = -1;
        int i15 = 0;
        boolean z11 = true;
        boolean z12 = true;
        while (i13 < length) {
            TdApi.Message message = messageArr[i13];
            this.G0.add(message);
            e eVar = new e(this.f24495b, message);
            int a10 = fVar != null ? fVar.a(eVar) : 0;
            if (a10 == 0) {
                if (z11) {
                    if (i15 > 0) {
                        this.D0.M(size, i15);
                    }
                    size = this.D0.D0().size() - 1;
                    i10 = 0;
                    z11 = false;
                } else {
                    if (z10) {
                        this.D0.D0().add(size + i15, new ra(14));
                        z10 = false;
                    } else {
                        this.D0.D0().add(size + i15, new ra(3));
                    }
                    i10 = i15 + 1;
                }
                fVar = new f(eVar);
                this.J0.add(fVar);
                this.D0.D0().add(size + i10, new ra(8, 0, 0, (CharSequence) fVar.c(), false).G(fVar));
                int i16 = i10 + 1;
                this.D0.D0().add(size + i16, new ra(2));
                i15 = i16 + 1;
                this.D0.D0().add(size + i15, new ra(57, R.id.call).G(eVar));
            } else if (a10 != i11) {
                if (a10 == i12 && z12) {
                    i14 = size - 1;
                }
                i13++;
                i12 = 2;
            } else {
                if (fVar.b().size() > i11) {
                    this.D0.D0().add(size + i15, new ra(i11));
                    i15++;
                }
                this.D0.D0().add(size + i15, new ra(57, R.id.call).G(eVar));
            }
            i11 = 1;
            i15++;
            z12 = false;
            i13++;
            i12 = 2;
        }
        if (i14 != -1) {
            this.D0.r3(i14);
        }
        if (i15 > 0) {
            if (!z11) {
                this.D0.D0().add(size + i15, new ra(3));
                i15++;
            }
            this.D0.M(size, i15);
        }
    }

    public final void ah() {
        boolean z10;
        ArrayList<c3> arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<f> arrayList3 = this.J0;
        if (arrayList3 == null) {
            arrayList2.add(new ra(15));
        } else {
            int i10 = 14;
            if (arrayList3.isEmpty() || (arrayList = this.E0) == null || arrayList.isEmpty()) {
                z10 = true;
            } else {
                arrayList2.add(new ra(14));
                arrayList2.add(sh());
                arrayList2.add(new ra(2));
                arrayList2.add(new ra(58, R.id.search_top));
                arrayList2.add(new ra(3));
                z10 = false;
            }
            Iterator<f> it = this.J0.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (z10) {
                    arrayList2.add(new ra(i10));
                    z10 = false;
                }
                arrayList2.add(new ra(8, 0, 0, (CharSequence) next.c(), false).G(next));
                arrayList2.add(new ra(2));
                Iterator<e> it2 = next.b().iterator();
                boolean z11 = true;
                while (it2.hasNext()) {
                    e next2 = it2.next();
                    if (z11) {
                        z11 = false;
                    } else {
                        arrayList2.add(new ra(1));
                    }
                    arrayList2.add(new ra(57, R.id.call).G(next2));
                }
                arrayList2.add(new ra(3));
                i10 = 14;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ra(24, 0, 0, R.string.NoCalls));
            } else {
                arrayList2.add(new ra(42, R.id.btn_calls));
            }
        }
        this.D0.s2(arrayList2, false);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final void bh() {
        this.J0 = new ArrayList<>();
        Iterator<TdApi.Message> it = this.G0.iterator();
        f fVar = null;
        while (it.hasNext()) {
            e eVar = new e(this.f24495b, it.next());
            if (fVar == null || fVar.a(eVar) == 0) {
                fVar = new f(eVar);
                this.J0.add(fVar);
            }
        }
        ah();
    }

    public final boolean dh() {
        ArrayList<c3> arrayList = this.E0;
        return arrayList != null && !arrayList.isEmpty();
    }

    @Override
    public void e(String str, TdApi.LanguagePackInfo languagePackInfo) {
        rb.e(this, str, languagePackInfo);
    }

    public final int eh(long j10, long j11) {
        ArrayList<TdApi.Message> arrayList = this.G0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<TdApi.Message> it = this.G0.iterator();
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.chatId == j10 && next.f19946id == j11) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override
    public void f3(boolean z10) {
        rb.b(this, z10);
    }

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
        g1.j(this, message, j10, i10, str);
    }

    @Override
    public void j0(long j10, long j11, TdApi.MessageContent messageContent) {
        g1.b(this, j10, j11, messageContent);
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void k4(boolean z10) {
        rb.c(this, z10);
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 57) {
            this.f24495b.F4().c0().p0(this, ((e) raVar.d()).m(), null);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && raVar.A() == 57) {
            e eVar = (e) raVar.d();
            final long c10 = eVar.c();
            final long[] f10 = eVar.f();
            if (f10 != null) {
                ee(null, new int[]{R.id.btn_deleteAll, R.id.btn_openChat, R.id.btn_cancel}, new String[]{w.i1(R.string.DeleteEntry), w.i1(R.string.OpenChat), w.i1(R.string.Cancel)}, new int[]{2, 1, 1}, new int[]{R.drawable.baseline_delete_sweep_24, R.drawable.baseline_chat_bubble_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean ih;
                        ih = p.this.ih(c10, f10, view2, i10);
                        return ih;
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public void q7(boolean z10) {
        this.f24495b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
    }

    @Override
    public void r2(final TdApi.Object object) {
        final ArrayList arrayList;
        int constructor = object.getConstructor();
        if (constructor == -16498159) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    p.this.mh(object);
                }
            });
        } else if (constructor == 1809654812) {
            long[] jArr = ((TdApi.Chats) object).chatIds;
            if (jArr.length >= 3) {
                arrayList = new ArrayList(jArr.length);
                k.S(this.f24495b, null, 0, arrayList, null, jArr, null, false, null);
            } else {
                arrayList = null;
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    p.this.nh(arrayList);
                }
            });
        }
    }

    @Override
    public m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4<?> v4Var) {
        c3 c3Var;
        e eVar;
        long j10;
        long j11;
        ra raVar = (ra) view.getTag();
        if (raVar == null) {
            return null;
        }
        int j12 = raVar.j();
        if (j12 == R.id.call) {
            e eVar2 = (e) raVar.d();
            j10 = eVar2.m();
            j11 = eVar2.c();
            eVar = eVar2;
            c3Var = null;
        } else if (j12 != R.id.search_chat_top) {
            return null;
        } else {
            c3 c3Var2 = (c3) raVar.d();
            j11 = c3Var2.i();
            j10 = c3Var2.p();
            c3Var = c3Var2;
            eVar = null;
        }
        long j13 = j11;
        long j14 = j10;
        if (this.f24495b.e2().G2(j14)) {
            cVar.a(R.id.btn_phone_call);
            u0Var.a(R.string.Call);
            cVar2.a(R.drawable.baseline_call_24);
        }
        cVar.a(R.id.btn_delete);
        u0Var.a(R.string.RemoveCall);
        cVar2.a(R.drawable.baseline_delete_sweep_24);
        return new d(j14, eVar, j13, c3Var);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        a aVar = new a(this);
        this.D0 = aVar;
        aVar.B2(this);
        ah();
        customRecyclerView.setAdapter(this.D0);
        customRecyclerView.k(new b());
        this.f24495b.v4().o(new TdApi.SearchCallMessages(0L, a0.b(a0.i(72.0f), 20), false), this);
        this.f24495b.v4().o(new TdApi.GetTopChats(new TdApi.TopChatCategoryCalls(), 30), this);
        this.f24495b.O9().a0(this);
    }

    public final void rh() {
        ArrayList<TdApi.Message> arrayList;
        ArrayList<f> arrayList2;
        if (!this.H0 && (arrayList = this.G0) != null && !arrayList.isEmpty() && !this.I0 && (arrayList2 = this.J0) != null && !arrayList2.isEmpty() && !Sa()) {
            this.H0 = true;
            Client v42 = this.f24495b.v4();
            ArrayList<TdApi.Message> arrayList3 = this.G0;
            v42.o(new TdApi.SearchCallMessages(arrayList3.get(arrayList3.size() - 1).f19946id, 40, false), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    p.this.hh(object);
                }
            });
        }
    }

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    public final ra sh() {
        return new ra(8, 0, 0, R.string.People);
    }

    public final void th(long j10, long j11) {
        int eh = eh(j10, j11);
        if (eh != -1) {
            this.G0.remove(eh);
            ArrayList<f> arrayList = this.J0;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.G0.isEmpty()) {
                    this.J0.clear();
                    ah();
                    return;
                }
                Iterator<f> it = this.J0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    Iterator<e> it2 = next.b().iterator();
                    boolean z10 = true;
                    while (it2.hasNext()) {
                        e next2 = it2.next();
                        if (next2.u(j10, j11)) {
                            int J0 = this.D0.J0(next2);
                            if (next2.n()) {
                                next.f(next2);
                                if (next.d()) {
                                    this.J0.remove(next);
                                    this.D0.R1(J0 - 2, 4);
                                } else {
                                    iq iqVar = this.D0;
                                    if (!z10) {
                                        J0--;
                                    }
                                    iqVar.R1(J0, 2);
                                }
                            } else {
                                this.D0.r3(J0);
                            }
                        } else {
                            z10 = false;
                        }
                    }
                }
                this.D0.p3(R.id.btn_calls);
            }
        }
    }

    public final void uh(final c3 c3Var) {
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
                boolean oh;
                oh = p.this.oh(c3Var, view, i10);
                return oh;
            }
        });
    }

    public final void vh(TdApi.Messages messages) {
        ArrayList<TdApi.Message> arrayList = new ArrayList<>(messages.messages.length);
        this.G0 = arrayList;
        Collections.addAll(arrayList, messages.messages);
        bh();
        ug();
    }

    public final void wh(ArrayList<c3> arrayList) {
        if (this.E0 != null || arrayList != null) {
            ArrayList<f> arrayList2 = this.J0;
            boolean z10 = false;
            boolean z11 = arrayList2 != null && !arrayList2.isEmpty();
            ArrayList<c3> arrayList3 = this.E0;
            boolean z12 = arrayList3 != null && !arrayList3.isEmpty() && z11;
            if (arrayList != null && !arrayList.isEmpty() && z11) {
                z10 = true;
            }
            this.E0 = arrayList;
            if (arrayList != null && this.F0 == null) {
                c cVar = new c(this, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        p.this.ph(view);
                    }
                }, this);
                this.F0 = cVar;
                cVar.B2(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean qh;
                        qh = p.this.qh(view);
                        return qh;
                    }
                });
            }
            if (!(this.F0 == null || arrayList == null)) {
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator<c3> it = arrayList.iterator();
                while (it.hasNext()) {
                    c3 next = it.next();
                    next.D();
                    arrayList4.add(new ra(59, R.id.search_chat_top).G(next).N(next.i()));
                }
                this.F0.S1(arrayList4);
            }
            if (z10 != z12 && z11) {
                if (z10) {
                    List<ra> D0 = this.D0.D0();
                    D0.add(1, sh());
                    D0.add(2, new ra(2));
                    D0.add(3, new ra(58, R.id.search_top));
                    D0.add(4, new ra(3));
                    this.D0.M(1, 4);
                    return;
                }
                this.D0.R1(1, 4);
            }
        }
    }

    @Override
    public void y2(final TdApi.Message message) {
        if (ch(message)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    p.this.lh(message);
                }
            });
        }
    }
}
