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
            int i = C1357a0.m37544i(17.0f);
            int i2 = C1357a0.m37544i(50.0f);
            this.f13472b = i + i + i2;
            this.f13471a = new C6257p(this, i2 / 2);
            setMinimumWidth(this.f13472b);
            setLayoutParams(new RecyclerView.LayoutParams(-2, C1357a0.m37544i(95.0f)));
        }

        public void m29296f() {
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
                        String charSequence = TextUtils.ellipsize(str, C1410y.m37045e0(), C1357a0.m37544i(50.0f) + C1357a0.m37544i(26.0f), TextUtils.TruncateAt.END).toString();
                        this.f13467O = charSequence;
                        this.f13466N = (int) C7389v0.m16680T1(charSequence, C1410y.m37045e0());
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

        public final void m29300b(boolean z) {
            if (this.f13469Q == null) {
                this.f13469Q = new C3950k(0, this, C2057b.f7280b, 180L);
            }
            this.f13469Q.m29544k();
            float f = 0.0f;
            if (!z || this.f13468P != 0.0f) {
                this.f13469Q.m29559B(C2057b.f7280b);
                this.f13469Q.m29530y(100L);
            } else {
                this.f13469Q.m29559B(C2057b.f7284f);
                this.f13469Q.m29530y(210L);
            }
            C3950k kVar = this.f13469Q;
            if (z) {
                f = 1.0f;
            }
            kVar.m29546i(f);
        }

        public void m29299c() {
            this.f13471a.mo20246f();
        }

        public void m29298d() {
            this.f13471a.mo20248b();
        }

        public final void m29297e(boolean z) {
            C3950k kVar = this.f13469Q;
            float f = 1.0f;
            if (kVar != null) {
                kVar.m29543l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setOnlineFactor(f);
        }

        public final void m29295g(boolean z, boolean z2) {
            if (this.f13470R != z) {
                this.f13470R = z;
                if (z2) {
                    m29300b(z);
                } else {
                    m29297e(z);
                }
            }
        }

        public long getUserId() {
            C4020c cVar = this.f13473c;
            if (cVar != null) {
                return cVar.m29291e();
            }
            return 0L;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C4020c cVar = this.f13473c;
            if (cVar != null) {
                if (cVar.m29292d().m26281h()) {
                    if (this.f13471a.mo20247c0()) {
                        this.f13471a.mo20229u0(canvas, C1357a0.m37544i(50.0f) / 2);
                    }
                    this.f13471a.draw(canvas);
                } else {
                    this.f13473c.m29292d().m26288a(canvas, C1357a0.m37544i(50.0f) / 2, this.f13471a.getLeft(), this.f13471a.getTop(), 17.0f);
                }
                String str = this.f13467O;
                if (str != null) {
                    canvas.drawText(str, (getMeasuredWidth() / 2) - (this.f13466N / 2), C1357a0.m37544i(82.0f), C1410y.m37045e0());
                }
                C1359b.m37504r(canvas, this.f13471a, this.f13468P);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(getDesiredWidth(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            int measuredWidth = getMeasuredWidth() / 2;
            int i3 = C1357a0.m37544i(11.0f);
            int i4 = C1357a0.m37544i(50.0f);
            int i5 = i4 / 2;
            this.f13471a.mo20257K0(measuredWidth - i5, i3, measuredWidth + i5, i4 + i3);
        }

        public void setIsOnline(boolean z) {
            m29295g(z, true);
        }

        public void setUser(C4020c cVar) {
            this.f13473c = cVar;
            String str = null;
            if (cVar != null) {
                this.f13471a.m20820G(cVar.m29290f());
            } else {
                this.f13471a.m20820G(null);
            }
            if (cVar != null) {
                cVar.m29292d().m26280i(17.0f, null);
                setTag(cVar.m29292d().m26282g());
            } else {
                setTag(null);
            }
            if (cVar != null) {
                str = cVar.m29292d().m26287b();
            }
            setFirstName(str);
            m29295g(cVar != null && cVar.f13474a.m26277l().m2480e2().m1621m0(cVar.m29291e()), false);
            if (getMeasuredWidth() != 0 && getMeasuredWidth() != getDesiredWidth()) {
                if (getParent() == null || !((RecyclerView) getParent()).m39503C0()) {
                    requestLayout();
                } else {
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            C4017n.C4018a.this.m29296f();
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
                ((C4017n) objArr[0]).m29302t0((TdApi.User) objArr[1]);
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
        public TdApi.User mo23961c() {
            return this.f13474a.m26282g();
        }

        public C4746q7 m29292d() {
            return this.f13474a;
        }

        public long m29291e() {
            return this.f13474a.m26286c();
        }

        public C6246h m29290f() {
            return this.f13474a.m26285d();
        }

        public int m29289g() {
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

        public static C4021d m29288O(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i) {
            if (i == 1) {
                C4018a aVar = new C4018a(context);
                C1399s0.m37196a0(aVar);
                C10189d.m5794j(aVar);
                aVar.setOnClickListener(onClickListener);
                aVar.setOnLongClickListener(onLongClickListener);
                aVar.setId(R.id.user);
                return new C4021d(aVar);
            } else if (i == 3) {
                TextView O = C1399s0.m37209O(context, 16.0f, C11524j.m213U0(), 17, 0);
                O.setText(C4403w.m27871i1(R.string.Nobody));
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

    public static HandlerC4019b m29312j0() {
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
        if (!z && (k0 = m29311k0(j)) != -1) {
            C4020c cVar = this.f13463Q.get(k0);
            if (cVar.m29292d().m26278k(userStatus)) {
                m29303s0(k0, cVar.m29291e(), this.f13459M.mo4348c().m2480e2().m1621m0(cVar.m29291e()));
                this.f13463Q.remove(k0);
                int binarySearch = Collections.binarySearch(this.f13463Q, cVar, this);
                if (binarySearch >= 0) {
                    this.f13463Q.add(k0, cVar);
                    return;
                }
                int i = (-binarySearch) - 1;
                this.f13463Q.add(k0, cVar);
                if (i != k0) {
                    m39313K(k0, i);
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
        HandlerC4019b j0 = m29312j0();
        j0.sendMessage(Message.obtain(j0, 0, new Object[]{this, user}));
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        this.f13464R.remove(recyclerView);
    }

    public final void m29319c0(C4020c cVar, boolean z) {
        int binarySearch = Collections.binarySearch(this.f13463Q, cVar, this);
        if (binarySearch < 0) {
            int i = (-binarySearch) - 1;
            this.f13463Q.add(i, cVar);
            if (z) {
                m39314J(i);
            }
        }
    }

    public final int m29318d0() {
        int i = C1357a0.m37544i(17.0f);
        int i2 = i + i + C1357a0.m37544i(50.0f);
        int D = mo6153D();
        if (D == 0 || this.f13464R.isEmpty()) {
            return i2;
        }
        int measuredWidth = this.f13464R.get(0).getMeasuredWidth();
        int max = Math.max(i2, measuredWidth / D);
        return max > i2 ? Math.max(i2, (measuredWidth - (max - i2)) / D) : max;
    }

    public final void m29317e0(boolean z) {
        if (!this.f13463Q.isEmpty()) {
            C5322e eVar = new C5322e(this.f13463Q.size());
            Iterator<C4020c> it = this.f13463Q.iterator();
            while (it.hasNext()) {
                eVar.m23276a(it.next().m29291e());
            }
            this.f13459M.mo4348c().m2480e2().m1591t2(eVar.m23270g(), this);
            int D = mo6153D();
            this.f13463Q.clear();
            if (z) {
                C7389v0.m16567w2(this, D);
            }
        }
    }

    public int compare(C4020c cVar, C4020c cVar2) {
        int i;
        C4746q7 d = cVar.m29292d();
        C4746q7 d2 = cVar2.m29292d();
        TdApi.User g = d.m26282g();
        TdApi.User g2 = d2.m26282g();
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
        if (g.f25442id == ba2) {
            i = C4779t2.m25383z1(g2);
        } else if (g2.f25442id == ba2) {
            i2 = C4779t2.m25383z1(g);
            i = Integer.MAX_VALUE;
        } else {
            i2 = C4779t2.m25383z1(g);
            i = C4779t2.m25383z1(g2);
        }
        if (i2 != i) {
            return i2 > i ? -1 : 1;
        }
        int g3 = cVar.m29289g();
        int g4 = cVar2.m29289g();
        if (g3 <= g4) {
            if (g3 >= g4) {
                long j = g.f25442id;
                long j2 = g2.f25442id;
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

    public void m29315g0() {
        m29317e0(true);
    }

    public TdApi.ChatMember m29314h0(long j) {
        int k0 = m29311k0(j);
        if (k0 != -1) {
            return this.f13463Q.get(k0).f13475b;
        }
        return null;
    }

    public TdApi.ChatMember m29313i0(TdApi.MessageSender messageSender) {
        if (messageSender.getConstructor() == -336109341) {
            return m29314h0(((TdApi.MessageSenderUser) messageSender).userId);
        }
        return null;
    }

    public final int m29311k0(long j) {
        Iterator<C4020c> it = this.f13463Q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m29291e() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void mo6146Q(C4021d dVar, int i) {
        if (dVar.m39335n() == 1) {
            ((C4018a) dVar.f3479a).setUser(this.f13463Q.get(i));
        }
    }

    public C4021d mo6145S(ViewGroup viewGroup, int i) {
        return C4021d.m29288O(this.f13459M.mo4347s(), this.f13461O, this.f13462P, i);
    }

    public void mo6144V(C4021d dVar) {
        if (dVar.m39335n() == 1) {
            ((C4018a) dVar.f3479a).m29299c();
        }
    }

    public void mo6143W(C4021d dVar) {
        if (dVar.m39335n() == 1) {
            ((C4018a) dVar.f3479a).m29298d();
        }
    }

    public void m29306p0(TdApi.ChatMember[] chatMemberArr) {
        if (this.f13463Q.isEmpty()) {
            m29305q0(chatMemberArr);
        } else if (chatMemberArr.length == 0) {
            m29317e0(true);
        } else {
            C6035e eVar = new C6035e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                eVar.m21501k(((TdApi.MessageSenderUser) chatMember.memberId).userId, chatMember);
            }
            int d0 = m29318d0();
            int i = 0;
            for (int size = this.f13463Q.size() - 1; size >= 0; size--) {
                int h = eVar.m21504h(this.f13463Q.get(size).m29291e());
                if (h < 0) {
                    this.f13463Q.remove(size);
                    m39309O(size);
                    i--;
                } else {
                    eVar.m21499n(h);
                }
            }
            for (int i2 = 0; i2 < eVar.m21497p(); i2++) {
                m29319c0(new C4020c(this.f13459M.mo4348c(), (TdApi.ChatMember) eVar.m21496q(i2)), true);
                i++;
            }
            if (!(i == 0 || m29318d0() == d0)) {
                m39312L(0, mo6153D());
            }
        }
    }

    public void m29305q0(TdApi.ChatMember[] chatMemberArr) {
        if (!this.f13463Q.isEmpty() || chatMemberArr.length != 0) {
            int D = mo6153D();
            m29317e0(false);
            this.f13463Q.ensureCapacity(chatMemberArr.length);
            C5322e eVar = new C5322e(chatMemberArr.length);
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                m29319c0(new C4020c(this.f13459M.mo4348c(), chatMember), false);
                eVar.m23276a(((TdApi.MessageSenderUser) chatMember.memberId).userId);
            }
            this.f13459M.mo4348c().m2480e2().m1642g2(eVar.m23270g(), this);
            C7389v0.m16567w2(this, D);
        }
    }

    public void m29304r0(TdApi.ChatMember chatMember) {
        int k0;
        if (chatMember.memberId.getConstructor() == -336109341 && (k0 = m29311k0(((TdApi.MessageSenderUser) chatMember.memberId).userId)) != -1) {
            this.f13463Q.set(k0, new C4020c(this.f13459M.mo4348c(), chatMember));
            m39315I(k0);
        }
    }

    public final void m29303s0(int i, long j, boolean z) {
        Iterator<RecyclerView> it = this.f13464R.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            View C = it.next().getLayoutManager().mo39265C(i);
            if (C != null && (C instanceof C4018a)) {
                C4018a aVar = (C4018a) C;
                if (aVar.getUserId() == j) {
                    aVar.setIsOnline(z);
                }
            }
            z2 = true;
        }
        if (z2) {
            m39315I(i);
        }
    }

    public final void m29302t0(TdApi.User user) {
        int k0 = m29311k0(user.f25442id);
        if (k0 != -1) {
            C4020c cVar = this.f13463Q.get(k0);
            cVar.m29292d().m26279j(user);
            boolean z = false;
            Iterator<RecyclerView> it = this.f13464R.iterator();
            while (it.hasNext()) {
                View C = it.next().getLayoutManager().mo39265C(k0);
                if (C == null || !(C instanceof C4018a)) {
                    z = true;
                } else {
                    ((C4018a) C).setUser(cVar);
                    C.invalidate();
                }
            }
            if (z) {
                m39315I(k0);
            }
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }
}
