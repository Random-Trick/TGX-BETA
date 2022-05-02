package p053dd;

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
import be.C1357a0;
import be.C1359b;
import be.C1399s0;
import be.C1410y;
import gd.C4746q7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p053dd.C4017n;
import p082fd.C4403w;
import p111he.AbstractC5098a1;
import p124ib.C5322e;
import p143k0.C6035e;
import p156kd.C6246h;
import p156kd.C6257p;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C4017n extends RecyclerView.AbstractC0890h<C4021d> implements Comparator<C4020c>, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j {
    public static HandlerC4019b f13458S;
    public final AbstractC9323v4<?> f13459M;
    public final int f13460N;
    public final View.OnClickListener f13461O;
    public final View.OnLongClickListener f13462P;
    public final ArrayList<RecyclerView> f13464R = new ArrayList<>();
    public final ArrayList<C4020c> f13463Q = new ArrayList<>();

    public static class C4018a extends View implements C3950k.AbstractC3952b {
        public String f13465M;
        public int f13466N;
        public String f13467O;
        public float f13468P;
        public C3950k f13469Q;
        public boolean f13470R;
        public final C6257p f13471a;
        public int f13472b;
        public C4020c f13473c;

        public C4018a(Context context) {
            super(context);
            int i = C1357a0.m37541i(17.0f);
            int i2 = C1357a0.m37541i(50.0f);
            this.f13472b = i + i + i2;
            this.f13471a = new C6257p(this, i2 / 2);
            setMinimumWidth(this.f13472b);
            setLayoutParams(new RecyclerView.LayoutParams(-2, C1357a0.m37541i(95.0f)));
        }

        public void m29294f() {
            requestLayout();
        }

        private int getDesiredWidth() {
            if (getParent() == null) {
                return this.f13472b;
            }
            int D = ((RecyclerView) getParent()).getAdapter().mo6153D();
            if (D == 0) {
                return this.f13472b;
            }
            int measuredWidth = ((RecyclerView) getParent()).getMeasuredWidth();
            int max = Math.max(this.f13472b, measuredWidth / D);
            int i = this.f13472b;
            return max > i ? Math.max(i, (measuredWidth - (max - i)) / D) : max;
        }

        private void setFirstName(String str) {
            String str2 = this.f13465M;
            if (str2 != null || str != null) {
                if (str2 == null || !str2.equals(str)) {
                    this.f13465M = str;
                    if (str != null) {
                        String charSequence = TextUtils.ellipsize(str, C1410y.m37042e0(), C1357a0.m37541i(50.0f) + C1357a0.m37541i(26.0f), TextUtils.TruncateAt.END).toString();
                        this.f13467O = charSequence;
                        this.f13466N = (int) C7389v0.m16680T1(charSequence, C1410y.m37042e0());
                        return;
                    }
                    this.f13465M = null;
                    this.f13466N = 0;
                }
            }
        }

        private void setOnlineFactor(float f) {
            if (this.f13468P != f) {
                this.f13468P = f;
                invalidate();
            }
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                setOnlineFactor(f);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public final void m29298b(boolean z) {
            if (this.f13469Q == null) {
                this.f13469Q = new C3950k(0, this, C2057b.f7280b, 180L);
            }
            this.f13469Q.m29542k();
            float f = 0.0f;
            if (!z || this.f13468P != 0.0f) {
                this.f13469Q.m29557B(C2057b.f7280b);
                this.f13469Q.m29528y(100L);
            } else {
                this.f13469Q.m29557B(C2057b.f7284f);
                this.f13469Q.m29528y(210L);
            }
            C3950k kVar = this.f13469Q;
            if (z) {
                f = 1.0f;
            }
            kVar.m29544i(f);
        }

        public void m29297c() {
            this.f13471a.mo20245f();
        }

        public void m29296d() {
            this.f13471a.mo20247b();
        }

        public final void m29295e(boolean z) {
            C3950k kVar = this.f13469Q;
            float f = 1.0f;
            if (kVar != null) {
                kVar.m29541l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setOnlineFactor(f);
        }

        public final void m29293g(boolean z, boolean z2) {
            if (this.f13470R != z) {
                this.f13470R = z;
                if (z2) {
                    m29298b(z);
                } else {
                    m29295e(z);
                }
            }
        }

        public long getUserId() {
            C4020c cVar = this.f13473c;
            if (cVar != null) {
                return cVar.m29289e();
            }
            return 0L;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C4020c cVar = this.f13473c;
            if (cVar != null) {
                if (cVar.m29290d().m26280h()) {
                    if (this.f13471a.mo20246c0()) {
                        this.f13471a.mo20228u0(canvas, C1357a0.m37541i(50.0f) / 2);
                    }
                    this.f13471a.draw(canvas);
                } else {
                    this.f13473c.m29290d().m26287a(canvas, C1357a0.m37541i(50.0f) / 2, this.f13471a.getLeft(), this.f13471a.getTop(), 17.0f);
                }
                String str = this.f13467O;
                if (str != null) {
                    canvas.drawText(str, (getMeasuredWidth() / 2) - (this.f13466N / 2), C1357a0.m37541i(82.0f), C1410y.m37042e0());
                }
                C1359b.m37501r(canvas, this.f13471a, this.f13468P);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getDesiredWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            int measuredWidth = getMeasuredWidth() / 2;
            int i3 = C1357a0.m37541i(11.0f);
            int i4 = C1357a0.m37541i(50.0f);
            int i5 = i4 / 2;
            this.f13471a.mo20256K0(measuredWidth - i5, i3, measuredWidth + i5, i4 + i3);
        }

        public void setIsOnline(boolean z) {
            m29293g(z, true);
        }

        public void setUser(C4020c cVar) {
            this.f13473c = cVar;
            String str = null;
            if (cVar != null) {
                this.f13471a.m20819G(cVar.m29288f());
            } else {
                this.f13471a.m20819G(null);
            }
            if (cVar != null) {
                cVar.m29290d().m26279i(17.0f, null);
                setTag(cVar.m29290d().m26281g());
            } else {
                setTag(null);
            }
            if (cVar != null) {
                str = cVar.m29290d().m26286b();
            }
            setFirstName(str);
            m29293g(cVar != null && cVar.f13474a.m26276l().m2480e2().m1621m0(cVar.m29289e()), false);
            if (getMeasuredWidth() != 0 && getMeasuredWidth() != getDesiredWidth()) {
                if (getParent() == null || !((RecyclerView) getParent()).m39500C0()) {
                    requestLayout();
                } else {
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            C4017n.C4018a.this.m29294f();
                        }
                    });
                }
            }
        }
    }

    public static class HandlerC4019b extends Handler {
        public HandlerC4019b() {
            super(Looper.getMainLooper());
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                Object[] objArr = (Object[]) message.obj;
                ((C4017n) objArr[0]).m29300t0((TdApi.User) objArr[1]);
                objArr[0] = null;
                objArr[1] = null;
            }
            super.handleMessage(message);
        }
    }

    public static class C4020c implements AbstractC5098a1 {
        public final C4746q7 f13474a;
        public final TdApi.ChatMember f13475b;

        public C4020c(C10930q6 q6Var, TdApi.ChatMember chatMember) {
            this.f13474a = new C4746q7(q6Var, ((TdApi.MessageSenderUser) chatMember.memberId).userId);
            this.f13475b = chatMember;
        }

        @Override
        public TdApi.User mo23960c() {
            return this.f13474a.m26281g();
        }

        public C4746q7 m29290d() {
            return this.f13474a;
        }

        public long m29289e() {
            return this.f13474a.m26285c();
        }

        public C6246h m29288f() {
            return this.f13474a.m26284d();
        }

        public int m29287g() {
            TdApi.ChatMember chatMember = this.f13475b;
            if (chatMember != null) {
                return chatMember.joinedChatDate;
            }
            return 0;
        }
    }

    public static class C4021d extends RecyclerView.AbstractC0886d0 {
        public C4021d(View view) {
            super(view);
        }

        public static C4021d m29286O(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i) {
            if (i == 1) {
                C4018a aVar = new C4018a(context);
                C1399s0.m37193a0(aVar);
                C10189d.m5794j(aVar);
                aVar.setOnClickListener(onClickListener);
                aVar.setOnLongClickListener(onLongClickListener);
                aVar.setId(R.id.user);
                return new C4021d(aVar);
            } else if (i == 3) {
                TextView O = C1399s0.m37206O(context, 16.0f, C11524j.m213U0(), 17, 0);
                O.setText(C4403w.m27869i1(R.string.Nobody));
                O.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new C4021d(O);
            } else {
                throw new IllegalArgumentException("viewType == " + i);
            }
        }
    }

    public C4017n(AbstractC9323v4<?> v4Var, int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        this.f13459M = v4Var;
        this.f13460N = i;
        this.f13461O = onClickListener;
        this.f13462P = onLongClickListener;
    }

    public static HandlerC4019b m29310j0() {
        if (f13458S == null) {
            synchronized (HandlerC4019b.class) {
                if (f13458S == null) {
                    f13458S = new HandlerC4019b();
                }
            }
        }
        return f13458S;
    }

    @Override
    public int mo6153D() {
        return this.f13463Q.size();
    }

    @Override
    public boolean mo1350D3() {
        return false;
    }

    @Override
    public int mo6150F(int i) {
        if (this.f13463Q.isEmpty()) {
            return 3;
        }
        return this.f13460N == 0 ? 1 : 0;
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        int k0;
        if (!z && (k0 = m29309k0(j)) != -1) {
            C4020c cVar = this.f13463Q.get(k0);
            if (cVar.m29290d().m26277k(userStatus)) {
                m29301s0(k0, cVar.m29289e(), this.f13459M.mo4348c().m2480e2().m1621m0(cVar.m29289e()));
                this.f13463Q.remove(k0);
                int binarySearch = Collections.binarySearch(this.f13463Q, cVar, this);
                if (binarySearch >= 0) {
                    this.f13463Q.add(k0, cVar);
                    return;
                }
                int i = (-binarySearch) - 1;
                this.f13463Q.add(k0, cVar);
                if (i != k0) {
                    m39310K(k0, i);
                }
            }
        }
    }

    @Override
    public void mo6619P(RecyclerView recyclerView) {
        this.f13464R.add(recyclerView);
    }

    @Override
    public void mo1348P1(TdApi.User user) {
        HandlerC4019b j0 = m29310j0();
        j0.sendMessage(Message.obtain(j0, 0, new Object[]{this, user}));
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        this.f13464R.remove(recyclerView);
    }

    public final void m29317c0(C4020c cVar, boolean z) {
        int binarySearch = Collections.binarySearch(this.f13463Q, cVar, this);
        if (binarySearch < 0) {
            int i = (-binarySearch) - 1;
            this.f13463Q.add(i, cVar);
            if (z) {
                m39311J(i);
            }
        }
    }

    public final int m29316d0() {
        int i = C1357a0.m37541i(17.0f);
        int i2 = i + i + C1357a0.m37541i(50.0f);
        int D = mo6153D();
        if (D == 0 || this.f13464R.isEmpty()) {
            return i2;
        }
        int measuredWidth = this.f13464R.get(0).getMeasuredWidth();
        int max = Math.max(i2, measuredWidth / D);
        return max > i2 ? Math.max(i2, (measuredWidth - (max - i2)) / D) : max;
    }

    public final void m29315e0(boolean z) {
        if (!this.f13463Q.isEmpty()) {
            C5322e eVar = new C5322e(this.f13463Q.size());
            Iterator<C4020c> it = this.f13463Q.iterator();
            while (it.hasNext()) {
                eVar.m23275a(it.next().m29289e());
            }
            this.f13459M.mo4348c().m2480e2().m1591t2(eVar.m23269g(), this);
            int D = mo6153D();
            this.f13463Q.clear();
            if (z) {
                C7389v0.m16567w2(this, D);
            }
        }
    }

    public int compare(C4020c cVar, C4020c cVar2) {
        int i;
        C4746q7 d = cVar.m29290d();
        C4746q7 d2 = cVar2.m29290d();
        TdApi.User g = d.m26281g();
        TdApi.User g2 = d2.m26281g();
        if (g == null && g2 == null) {
            return 0;
        }
        if (g == null) {
            return 1;
        }
        if (g2 == null) {
            return -1;
        }
        long ba2 = this.f13459M.mo4348c().m2519ba();
        int i2 = Integer.MAX_VALUE;
        if (g.f25439id == ba2) {
            i = C4779t2.m25382z1(g2);
        } else if (g2.f25439id == ba2) {
            i2 = C4779t2.m25382z1(g);
            i = Integer.MAX_VALUE;
        } else {
            i2 = C4779t2.m25382z1(g);
            i = C4779t2.m25382z1(g2);
        }
        if (i2 != i) {
            return i2 > i ? -1 : 1;
        }
        int g3 = cVar.m29287g();
        int g4 = cVar2.m29287g();
        if (g3 <= g4) {
            if (g3 >= g4) {
                long j = g.f25439id;
                long j2 = g2.f25439id;
                if (j <= j2) {
                    if (j >= j2) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public void m29313g0() {
        m29315e0(true);
    }

    public TdApi.ChatMember m29312h0(long j) {
        int k0 = m29309k0(j);
        if (k0 != -1) {
            return this.f13463Q.get(k0).f13475b;
        }
        return null;
    }

    public TdApi.ChatMember m29311i0(TdApi.MessageSender messageSender) {
        if (messageSender.getConstructor() == -336109341) {
            return m29312h0(((TdApi.MessageSenderUser) messageSender).userId);
        }
        return null;
    }

    public final int m29309k0(long j) {
        Iterator<C4020c> it = this.f13463Q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m29289e() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void mo6146Q(C4021d dVar, int i) {
        if (dVar.m39332n() == 1) {
            ((C4018a) dVar.f3479a).setUser(this.f13463Q.get(i));
        }
    }

    public C4021d mo6145S(ViewGroup viewGroup, int i) {
        return C4021d.m29286O(this.f13459M.mo4347s(), this.f13461O, this.f13462P, i);
    }

    public void mo6144V(C4021d dVar) {
        if (dVar.m39332n() == 1) {
            ((C4018a) dVar.f3479a).m29297c();
        }
    }

    public void mo6143W(C4021d dVar) {
        if (dVar.m39332n() == 1) {
            ((C4018a) dVar.f3479a).m29296d();
        }
    }

    public void m29304p0(TdApi.ChatMember[] chatMemberArr) {
        if (this.f13463Q.isEmpty()) {
            m29303q0(chatMemberArr);
        } else if (chatMemberArr.length == 0) {
            m29315e0(true);
        } else {
            C6035e eVar = new C6035e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                eVar.m21500k(((TdApi.MessageSenderUser) chatMember.memberId).userId, chatMember);
            }
            int d0 = m29316d0();
            int i = 0;
            for (int size = this.f13463Q.size() - 1; size >= 0; size--) {
                int h = eVar.m21503h(this.f13463Q.get(size).m29289e());
                if (h < 0) {
                    this.f13463Q.remove(size);
                    m39306O(size);
                    i--;
                } else {
                    eVar.m21498n(h);
                }
            }
            for (int i2 = 0; i2 < eVar.m21496p(); i2++) {
                m29317c0(new C4020c(this.f13459M.mo4348c(), (TdApi.ChatMember) eVar.m21495q(i2)), true);
                i++;
            }
            if (!(i == 0 || m29316d0() == d0)) {
                m39309L(0, mo6153D());
            }
        }
    }

    public void m29303q0(TdApi.ChatMember[] chatMemberArr) {
        if (!this.f13463Q.isEmpty() || chatMemberArr.length != 0) {
            int D = mo6153D();
            m29315e0(false);
            this.f13463Q.ensureCapacity(chatMemberArr.length);
            C5322e eVar = new C5322e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                m29317c0(new C4020c(this.f13459M.mo4348c(), chatMember), false);
                eVar.m23275a(((TdApi.MessageSenderUser) chatMember.memberId).userId);
            }
            this.f13459M.mo4348c().m2480e2().m1642g2(eVar.m23269g(), this);
            C7389v0.m16567w2(this, D);
        }
    }

    public void m29302r0(TdApi.ChatMember chatMember) {
        int k0;
        if (chatMember.memberId.getConstructor() == -336109341 && (k0 = m29309k0(((TdApi.MessageSenderUser) chatMember.memberId).userId)) != -1) {
            this.f13463Q.set(k0, new C4020c(this.f13459M.mo4348c(), chatMember));
            m39312I(k0);
        }
    }

    public final void m29301s0(int i, long j, boolean z) {
        Iterator<RecyclerView> it = this.f13464R.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            View C = it.next().getLayoutManager().mo39262C(i);
            if (C != null && (C instanceof C4018a)) {
                C4018a aVar = (C4018a) C;
                if (aVar.getUserId() == j) {
                    aVar.setIsOnline(z);
                }
            }
            z2 = true;
        }
        if (z2) {
            m39312I(i);
        }
    }

    public final void m29300t0(TdApi.User user) {
        int k0 = m29309k0(user.f25439id);
        if (k0 != -1) {
            C4020c cVar = this.f13463Q.get(k0);
            cVar.m29290d().m26278j(user);
            boolean z = false;
            Iterator<RecyclerView> it = this.f13464R.iterator();
            while (it.hasNext()) {
                View C = it.next().getLayoutManager().mo39262C(k0);
                if (C == null || !(C instanceof C4018a)) {
                    z = true;
                } else {
                    ((C4018a) C).setUser(cVar);
                    C.invalidate();
                }
            }
            if (z) {
                m39312I(k0);
            }
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }
}
