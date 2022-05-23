package ed;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import ce.y;
import eb.k;
import ed.n;
import gd.w;
import hd.q7;
import hd.t2;
import ie.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import jb.e;
import ld.h;
import ld.p;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;
import zd.t7;
import zd.w7;

public class n extends RecyclerView.h<d> implements Comparator<c>, t7.i, t7.j {
    public static b S;
    public final v4<?> M;
    public final int N;
    public final View.OnClickListener O;
    public final View.OnLongClickListener P;
    public final ArrayList<RecyclerView> R = new ArrayList<>();
    public final ArrayList<c> Q = new ArrayList<>();

    public static class a extends View implements k.b {
        public String M;
        public int N;
        public String O;
        public float P;
        public k Q;
        public boolean R;
        public final p f11581a;
        public int f11582b;
        public c f11583c;

        public a(Context context) {
            super(context);
            int i10 = a0.i(17.0f);
            int i11 = a0.i(50.0f);
            this.f11582b = i10 + i10 + i11;
            this.f11581a = new p(this, i11 / 2);
            setMinimumWidth(this.f11582b);
            setLayoutParams(new RecyclerView.LayoutParams(-2, a0.i(95.0f)));
        }

        public void f() {
            requestLayout();
        }

        private int getDesiredWidth() {
            if (getParent() == null) {
                return this.f11582b;
            }
            int D = ((RecyclerView) getParent()).getAdapter().D();
            if (D == 0) {
                return this.f11582b;
            }
            int measuredWidth = ((RecyclerView) getParent()).getMeasuredWidth();
            int max = Math.max(this.f11582b, measuredWidth / D);
            int i10 = this.f11582b;
            return max > i10 ? Math.max(i10, (measuredWidth - (max - i10)) / D) : max;
        }

        private void setFirstName(String str) {
            String str2 = this.M;
            if (str2 != null || str != null) {
                if (str2 == null || !str2.equals(str)) {
                    this.M = str;
                    if (str != null) {
                        String charSequence = TextUtils.ellipsize(str, y.e0(), a0.i(50.0f) + a0.i(26.0f), TextUtils.TruncateAt.END).toString();
                        this.O = charSequence;
                        this.N = (int) v0.T1(charSequence, y.e0());
                        return;
                    }
                    this.M = null;
                    this.N = 0;
                }
            }
        }

        private void setOnlineFactor(float f10) {
            if (this.P != f10) {
                this.P = f10;
                invalidate();
            }
        }

        public final void b(boolean z10) {
            if (this.Q == null) {
                this.Q = new k(0, this, db.b.f7287b, 180L);
            }
            this.Q.k();
            float f10 = 0.0f;
            if (!z10 || this.P != 0.0f) {
                this.Q.B(db.b.f7287b);
                this.Q.y(100L);
            } else {
                this.Q.B(db.b.f7291f);
                this.Q.y(210L);
            }
            k kVar = this.Q;
            if (z10) {
                f10 = 1.0f;
            }
            kVar.i(f10);
        }

        public void c() {
            this.f11581a.e();
        }

        public void d() {
            this.f11581a.b();
        }

        public final void e(boolean z10) {
            k kVar = this.Q;
            float f10 = 1.0f;
            if (kVar != null) {
                kVar.l(z10 ? 1.0f : 0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            setOnlineFactor(f10);
        }

        public final void g(boolean z10, boolean z11) {
            if (this.R != z10) {
                this.R = z10;
                if (z11) {
                    b(z10);
                } else {
                    e(z10);
                }
            }
        }

        public long getUserId() {
            c cVar = this.f11583c;
            if (cVar != null) {
                return cVar.e();
            }
            return 0L;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                setOnlineFactor(f10);
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            c cVar = this.f11583c;
            if (cVar != null) {
                if (cVar.d().h()) {
                    if (this.f11581a.e0()) {
                        this.f11581a.u0(canvas, a0.i(50.0f) / 2);
                    }
                    this.f11581a.draw(canvas);
                } else {
                    this.f11583c.d().a(canvas, a0.i(50.0f) / 2, this.f11581a.getLeft(), this.f11581a.getTop(), 17.0f);
                }
                String str = this.O;
                if (str != null) {
                    canvas.drawText(str, (getMeasuredWidth() / 2) - (this.N / 2), a0.i(82.0f), y.e0());
                }
                ce.b.r(canvas, this.f11581a, this.P);
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getDesiredWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
            int measuredWidth = getMeasuredWidth() / 2;
            int i12 = a0.i(11.0f);
            int i13 = a0.i(50.0f);
            int i14 = i13 / 2;
            this.f11581a.K0(measuredWidth - i14, i12, measuredWidth + i14, i13 + i12);
        }

        public void setIsOnline(boolean z10) {
            g(z10, true);
        }

        public void setUser(c cVar) {
            this.f11583c = cVar;
            String str = null;
            if (cVar != null) {
                this.f11581a.G(cVar.f());
            } else {
                this.f11581a.G(null);
            }
            if (cVar != null) {
                cVar.d().i(17.0f, null);
                setTag(cVar.d().g());
            } else {
                setTag(null);
            }
            if (cVar != null) {
                str = cVar.d().b();
            }
            setFirstName(str);
            g(cVar != null && cVar.f11584a.l().e2().m0(cVar.e()), false);
            if (getMeasuredWidth() != 0 && getMeasuredWidth() != getDesiredWidth()) {
                if (getParent() == null || !((RecyclerView) getParent()).C0()) {
                    requestLayout();
                } else {
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            n.a.this.f();
                        }
                    });
                }
            }
        }
    }

    public static class b extends Handler {
        public b() {
            super(Looper.getMainLooper());
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                Object[] objArr = (Object[]) message.obj;
                ((n) objArr[0]).s0((TdApi.User) objArr[1]);
                objArr[0] = null;
                objArr[1] = null;
            }
            super.handleMessage(message);
        }
    }

    public static class c implements a1 {
        public final q7 f11584a;
        public final TdApi.ChatMember f11585b;

        public c(o6 o6Var, TdApi.ChatMember chatMember) {
            this.f11584a = new q7(o6Var, ((TdApi.MessageSenderUser) chatMember.memberId).userId);
            this.f11585b = chatMember;
        }

        @Override
        public TdApi.User c() {
            return this.f11584a.g();
        }

        public q7 d() {
            return this.f11584a;
        }

        public long e() {
            return this.f11584a.c();
        }

        public h f() {
            return this.f11584a.d();
        }

        public int g() {
            TdApi.ChatMember chatMember = this.f11585b;
            if (chatMember != null) {
                return chatMember.joinedChatDate;
            }
            return 0;
        }
    }

    public static class d extends RecyclerView.c0 {
        public d(View view) {
            super(view);
        }

        public static d O(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i10) {
            if (i10 == 1) {
                a aVar = new a(context);
                p0.T(aVar);
                yd.d.j(aVar);
                aVar.setOnClickListener(onClickListener);
                aVar.setOnLongClickListener(onLongClickListener);
                aVar.setId(R.id.user);
                return new d(aVar);
            } else if (i10 == 3) {
                TextView I = p0.I(context, 16.0f, j.R0(), 17, 0);
                I.setText(w.i1(R.string.Nobody));
                I.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new d(I);
            } else {
                throw new IllegalArgumentException("viewType == " + i10);
            }
        }
    }

    public n(v4<?> v4Var, int i10, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.M = v4Var;
        this.N = i10;
        this.O = onClickListener;
        this.P = onLongClickListener;
    }

    public static b i0() {
        if (S == null) {
            synchronized (b.class) {
                if (S == null) {
                    S = new b();
                }
            }
        }
        return S;
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        int j02;
        if (!z10 && (j02 = j0(j10)) != -1) {
            c cVar = this.Q.get(j02);
            if (cVar.d().k(userStatus)) {
                r0(j02, cVar.e(), this.M.c().e2().m0(cVar.e()));
                this.Q.remove(j02);
                int binarySearch = Collections.binarySearch(this.Q, cVar, this);
                if (binarySearch >= 0) {
                    this.Q.add(j02, cVar);
                    return;
                }
                int i10 = (-binarySearch) - 1;
                this.Q.add(j02, cVar);
                if (i10 != j02) {
                    K(j02, i10);
                }
            }
        }
    }

    @Override
    public int D() {
        return this.Q.size();
    }

    @Override
    public int F(int i10) {
        if (this.Q.isEmpty()) {
            return 3;
        }
        return this.N == 0 ? 1 : 0;
    }

    @Override
    public void M1(TdApi.User user) {
        b i02 = i0();
        i02.sendMessage(Message.obtain(i02, 0, new Object[]{this, user}));
    }

    @Override
    public void P(RecyclerView recyclerView) {
        this.R.add(recyclerView);
    }

    @Override
    public void T(RecyclerView recyclerView) {
        this.R.remove(recyclerView);
    }

    public final void b0(c cVar, boolean z10) {
        int binarySearch = Collections.binarySearch(this.Q, cVar, this);
        if (binarySearch < 0) {
            int i10 = (-binarySearch) - 1;
            this.Q.add(i10, cVar);
            if (z10) {
                J(i10);
            }
        }
    }

    public final int c0() {
        int i10 = a0.i(17.0f);
        int i11 = i10 + i10 + a0.i(50.0f);
        int D = D();
        if (D == 0 || this.R.isEmpty()) {
            return i11;
        }
        int measuredWidth = this.R.get(0).getMeasuredWidth();
        int max = Math.max(i11, measuredWidth / D);
        return max > i11 ? Math.max(i11, (measuredWidth - (max - i11)) / D) : max;
    }

    public final void d0(boolean z10) {
        if (!this.Q.isEmpty()) {
            e eVar = new e(this.Q.size());
            Iterator<c> it = this.Q.iterator();
            while (it.hasNext()) {
                eVar.a(it.next().e());
            }
            this.M.c().e2().s2(eVar.g(), this);
            int D = D();
            this.Q.clear();
            if (z10) {
                v0.w2(this, D);
            }
        }
    }

    public int compare(c cVar, c cVar2) {
        int i10;
        q7 d10 = cVar.d();
        q7 d11 = cVar2.d();
        TdApi.User g10 = d10.g();
        TdApi.User g11 = d11.g();
        if (g10 == null && g11 == null) {
            return 0;
        }
        if (g10 == null) {
            return 1;
        }
        if (g11 == null) {
            return -1;
        }
        long fa2 = this.M.c().fa();
        int i11 = Integer.MAX_VALUE;
        if (g10.f19979id == fa2) {
            i10 = t2.z1(g11);
        } else if (g11.f19979id == fa2) {
            i11 = t2.z1(g10);
            i10 = Integer.MAX_VALUE;
        } else {
            i11 = t2.z1(g10);
            i10 = t2.z1(g11);
        }
        if (i11 != i10) {
            return i11 > i10 ? -1 : 1;
        }
        int g12 = cVar.g();
        int g13 = cVar2.g();
        if (g12 <= g13) {
            if (g12 >= g13) {
                long j10 = g10.f19979id;
                long j11 = g11.f19979id;
                if (j10 <= j11) {
                    if (j10 >= j11) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public void f0() {
        d0(true);
    }

    public TdApi.ChatMember g0(long j10) {
        int j02 = j0(j10);
        if (j02 != -1) {
            return this.Q.get(j02).f11585b;
        }
        return null;
    }

    public TdApi.ChatMember h0(TdApi.MessageSender messageSender) {
        if (messageSender.getConstructor() == -336109341) {
            return g0(((TdApi.MessageSenderUser) messageSender).userId);
        }
        return null;
    }

    public final int j0(long j10) {
        Iterator<c> it = this.Q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().e() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void Q(d dVar, int i10) {
        if (dVar.n() == 1) {
            ((a) dVar.f2982a).setUser(this.Q.get(i10));
        }
    }

    public d S(ViewGroup viewGroup, int i10) {
        return d.O(this.M.t(), this.O, this.P, i10);
    }

    public void V(d dVar) {
        if (dVar.n() == 1) {
            ((a) dVar.f2982a).c();
        }
    }

    public void W(d dVar) {
        if (dVar.n() == 1) {
            ((a) dVar.f2982a).d();
        }
    }

    public void o0(TdApi.ChatMember[] chatMemberArr) {
        if (this.Q.isEmpty()) {
            p0(chatMemberArr);
        } else if (chatMemberArr.length == 0) {
            d0(true);
        } else {
            k0.e eVar = new k0.e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                eVar.k(((TdApi.MessageSenderUser) chatMember.memberId).userId, chatMember);
            }
            int c02 = c0();
            int i10 = 0;
            for (int size = this.Q.size() - 1; size >= 0; size--) {
                int h10 = eVar.h(this.Q.get(size).e());
                if (h10 < 0) {
                    this.Q.remove(size);
                    O(size);
                    i10--;
                } else {
                    eVar.n(h10);
                }
            }
            for (int i11 = 0; i11 < eVar.p(); i11++) {
                b0(new c(this.M.c(), (TdApi.ChatMember) eVar.q(i11)), true);
                i10++;
            }
            if (!(i10 == 0 || c0() == c02)) {
                L(0, D());
            }
        }
    }

    public void p0(TdApi.ChatMember[] chatMemberArr) {
        if (!this.Q.isEmpty() || chatMemberArr.length != 0) {
            int D = D();
            d0(false);
            this.Q.ensureCapacity(chatMemberArr.length);
            e eVar = new e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                b0(new c(this.M.c(), chatMember), false);
                eVar.a(((TdApi.MessageSenderUser) chatMember.memberId).userId);
            }
            this.M.c().e2().e2(eVar.g(), this);
            v0.w2(this, D);
        }
    }

    public void q0(TdApi.ChatMember chatMember) {
        int j02;
        if (chatMember.memberId.getConstructor() == -336109341 && (j02 = j0(((TdApi.MessageSenderUser) chatMember.memberId).userId)) != -1) {
            this.Q.set(j02, new c(this.M.c(), chatMember));
            I(j02);
        }
    }

    public final void r0(int i10, long j10, boolean z10) {
        Iterator<RecyclerView> it = this.R.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            View C = it.next().getLayoutManager().C(i10);
            if (C != null && (C instanceof a)) {
                a aVar = (a) C;
                if (aVar.getUserId() == j10) {
                    aVar.setIsOnline(z10);
                }
            }
            z11 = true;
        }
        if (z11) {
            I(i10);
        }
    }

    public final void s0(TdApi.User user) {
        int j02 = j0(user.f19979id);
        if (j02 != -1) {
            c cVar = this.Q.get(j02);
            cVar.d().j(user);
            boolean z10 = false;
            Iterator<RecyclerView> it = this.R.iterator();
            while (it.hasNext()) {
                View C = it.next().getLayoutManager().C(j02);
                if (C == null || !(C instanceof a)) {
                    z10 = true;
                } else {
                    ((a) C).setUser(cVar);
                    C.invalidate();
                }
            }
            if (z10) {
                I(j02);
            }
        }
    }

    @Override
    public boolean u3() {
        return false;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }
}
