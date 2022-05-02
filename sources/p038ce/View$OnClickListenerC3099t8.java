package p038ce;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1374h;
import be.C1389o;
import be.C1399s0;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6847b2;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC3099t8;
import p051db.C3950k;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.C5078d;
import p110hd.C5094n;
import p291uc.C9639r;
import p291uc.C9647s;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9323v4;

public class View$OnClickListenerC3099t8 extends AbstractC9323v4<ViewTreeObserver$OnPreDrawListenerC7081z0> implements View.OnClickListener, C11052v1.AbstractC11053a {
    public CustomRecyclerView f10425n0;
    public GridLayoutManager f10426o0;
    public C3103d f10427p0;
    public int f10428q0;
    public C9639r f10429r0;
    public boolean f10430s0;
    public C3950k f10431t0;

    public class C3100a extends RecyclerView.AbstractC0910t {
        public C3100a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            if (View$OnClickListenerC3099t8.this.m9139w9() != null && View$OnClickListenerC3099t8.this.m9139w9().getCurrentItem() == 0) {
                View$OnClickListenerC3099t8.this.m9139w9().setIsScrolling(z);
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (View$OnClickListenerC3099t8.this.m9139w9() != null && View$OnClickListenerC3099t8.this.m9139w9().m17845d2() && View$OnClickListenerC3099t8.this.m9139w9().getCurrentItem() == 0) {
                View$OnClickListenerC3099t8.this.m9139w9().m17833u2(View$OnClickListenerC3099t8.this.m31454Ye());
                if (View$OnClickListenerC3099t8.this.f10431t0 == null || !View$OnClickListenerC3099t8.this.f10431t0.m29533v()) {
                    View$OnClickListenerC3099t8.this.m9139w9().setCurrentEmojiSection(View$OnClickListenerC3099t8.this.m31453Ze());
                }
            }
        }
    }

    public class C3101b extends GridLayoutManager.AbstractC0873b {
        public C3101b() {
        }

        @Override
        public int mo7528f(int i) {
            if (((C3104e) View$OnClickListenerC3099t8.this.f10427p0.f10439O.get(i)).f10442a == 1) {
                return 1;
            }
            return View$OnClickListenerC3099t8.this.f10428q0;
        }
    }

    public class C3102c implements C3950k.AbstractC3952b {
        public final int f10434a;
        public final int[] f10435b;

        public C3102c(int i, int[] iArr) {
            this.f10434a = i;
            this.f10435b = iArr;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            int i2 = (int) (this.f10434a * f);
            View$OnClickListenerC3099t8.this.f10425n0.scrollBy(0, i2 - this.f10435b[0]);
            this.f10435b[0] = i2;
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            View$OnClickListenerC3099t8.this.f10425n0.setScrollDisabled(false);
            if (View$OnClickListenerC3099t8.this.m9139w9() != null) {
                View$OnClickListenerC3099t8.this.m9139w9().setIgnoreMovement(false);
            }
        }
    }

    public static class C3103d extends RecyclerView.AbstractC0890h<C3105f> implements C5078d.AbstractC5082d {
        public final Context f10437M;
        public final View.OnClickListener f10438N;
        public final ArrayList<C3104e> f10439O;
        public int f10440P;
        public final View$OnClickListenerC3099t8 f10441Q;

        public C3103d(Context context, View.OnClickListener onClickListener, View$OnClickListenerC3099t8 t8Var) {
            String[][] strArr;
            this.f10437M = context;
            this.f10438N = onClickListener;
            this.f10441Q = t8Var;
            ArrayList<C3104e> arrayList = new ArrayList<>();
            this.f10439O = arrayList;
            arrayList.add(new C3104e(2, 0));
            m31437n0();
            int i = 0;
            for (String[] strArr2 : C1374h.f4996i) {
                i++;
                if (i == 0) {
                    this.f10439O.add(new C3104e(0, (int) R.string.SmileysAndPeople));
                } else if (i == 1) {
                    this.f10439O.add(new C3104e(0, (int) R.string.AnimalsAndNature));
                } else if (i == 2) {
                    this.f10439O.add(new C3104e(0, (int) R.string.FoodDrink));
                } else if (i == 3) {
                    this.f10439O.add(new C3104e(0, (int) R.string.TravelAndPlaces));
                } else if (i == 4) {
                    this.f10439O.add(new C3104e(0, (int) R.string.SymbolsAndObjects));
                } else if (i == 5) {
                    this.f10439O.add(new C3104e(0, (int) R.string.Flags));
                }
                ArrayList<C3104e> arrayList2 = this.f10439O;
                arrayList2.ensureCapacity(arrayList2.size() + strArr2.length + 1);
                for (String str : strArr2) {
                    this.f10439O.add(new C3104e(1, str));
                }
            }
        }

        public void m31443h0() {
            this.f10441Q.m9139w9().setIgnoreMovement(false);
        }

        public void m31442i0() {
            this.f10441Q.m9139w9().setIgnoreMovement(false);
        }

        @Override
        public int mo6153D() {
            return this.f10439O.size();
        }

        @Override
        public int mo6150F(int i) {
            return this.f10439O.get(i).f10442a;
        }

        @Override
        public void mo23986e(int i, int i2) {
            if (this.f10441Q.m9139w9() != null) {
                this.f10441Q.m9139w9().setIgnoreMovement(true);
            }
            int f0 = i + m31445f0();
            int f02 = i2 + m31445f0();
            this.f10439O.add(f02, this.f10439O.remove(f0));
            m39313K(f0, f02);
            if (this.f10441Q.m9139w9() != null) {
                this.f10441Q.f10425n0.post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3099t8.C3103d.this.m31442i0();
                    }
                });
            }
        }

        public int m31445f0() {
            return 1;
        }

        public int m31444g0(int r5) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3099t8.C3103d.m31444g0(int):int");
        }

        @Override
        public void mo23985i(int i, C5094n nVar) {
            if (this.f10441Q.m9139w9() != null) {
                this.f10441Q.m9139w9().setIgnoreMovement(true);
            }
            int f0 = i + m31445f0();
            this.f10440P++;
            this.f10439O.add(f0, new C3104e(1, nVar.f17129a));
            m39314J(f0);
            if (this.f10441Q.m9139w9() != null) {
                this.f10441Q.f10425n0.post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3099t8.C3103d.this.m31443h0();
                    }
                });
            }
        }

        public int m31441j0(int i, int i2) {
            int i3 = 0;
            if (i == 0) {
                return 0;
            }
            int i4 = i - 1;
            int headerSize = ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding();
            double d = i2;
            int ceil = (int) Math.ceil(Math.min(this.f10440P, i4) / d);
            int g = headerSize + ((C1357a0.m37546g() / i2) * ceil);
            if (i4 >= 0 && i4 < ceil) {
                return g;
            }
            int i5 = i4 - this.f10440P;
            while (true) {
                String[][] strArr = C1374h.f4996i;
                if (i3 >= strArr.length || i5 <= 0) {
                    break;
                }
                g += C1357a0.m37544i(32.0f);
                i5--;
                if (i5 > 0) {
                    g += ((int) Math.ceil(Math.min(strArr[i3].length, i5) / d)) * (C1357a0.m37546g() / i2);
                    i5 -= strArr[i3].length;
                }
                i3++;
            }
            return g;
        }

        public void mo6146Q(C3105f fVar, int i) {
            int n = fVar.m39335n();
            if (n != 0) {
                boolean z = true;
                if (n == 1) {
                    C3104e eVar = this.f10439O.get(i);
                    if (i >= m31445f0() + this.f10440P) {
                        z = false;
                    }
                    fVar.f3479a.setId(z ? R.id.emoji_recent : R.id.emoji);
                    ((C9647s) fVar.f3479a).m7914c(eVar.f10444c, eVar.f10445d);
                    return;
                }
                return;
            }
            C1399s0.m37178j0((TextView) fVar.f3479a, C4403w.m27871i1(this.f10439O.get(i).f10443b));
        }

        public C3105f mo6145S(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C6847b2 b2Var = new C6847b2(this.f10437M);
                b2Var.setTypeface(C1389o.m37263i());
                if (this.f10441Q.f10430s0) {
                    b2Var.setTextColor(C11524j.m226O(R.id.theme_color_textLight, 2));
                } else {
                    b2Var.setTextColor(C11524j.m213U0());
                    this.f10441Q.m9480A8(b2Var);
                }
                b2Var.setGravity(C4403w.m27991F1());
                b2Var.setTextSize(1, 15.0f);
                b2Var.setSingleLine(true);
                b2Var.setEllipsize(TextUtils.TruncateAt.END);
                b2Var.setPadding(C1357a0.m37544i(14.0f), C1357a0.m37544i(5.0f), C1357a0.m37544i(14.0f), C1357a0.m37544i(5.0f));
                b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(32.0f)));
                return new C3105f(b2Var);
            } else if (i == 1) {
                C9647s sVar = new C9647s(this.f10437M, this.f10441Q.f10429r0);
                sVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                sVar.setOnClickListener(this.f10438N);
                C1399s0.m37196a0(sVar);
                C10189d.m5794j(sVar);
                return new C3105f(sVar);
            } else if (i == 2) {
                View view = new View(this.f10437M);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding()));
                return new C3105f(view);
            } else {
                throw new RuntimeException("viewType == " + i);
            }
        }

        public void m31438m0() {
            int i = this.f10440P;
            if (i > 0) {
                for (int i2 = i; i2 >= 1; i2--) {
                    this.f10439O.remove(i2);
                }
            }
            ArrayList<C5094n> u = C5078d.m23987z().m23992u();
            this.f10440P = u.size();
            ArrayList<C3104e> arrayList = this.f10439O;
            arrayList.ensureCapacity(arrayList.size() + this.f10440P);
            Iterator<C5094n> it = u.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                this.f10439O.add(i3, new C3104e(1, it.next().f17129a));
                i3++;
            }
            int i4 = this.f10440P;
            if (i4 > i) {
                m39311M(i + 1, i4 - i);
            } else if (i4 < i) {
                m39310N(i4 + 1, i - i4);
            }
            m39312L(1, Math.min(this.f10440P, i));
        }

        @Override
        public void mo23984n(String str) {
            int X1 = this.f10441Q.f10426o0.m39552X1();
            int a2 = this.f10441Q.f10426o0.m39549a2();
            if (X1 == -1 || a2 == -1) {
                m39312L(0, this.f10439O.size());
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i = -1;
            int i2 = 0;
            for (int i3 = X1; i3 <= a2; i3++) {
                C3104e eVar = this.f10439O.get(i3);
                if (eVar.f10442a == 1 && eVar.m31436a()) {
                    if (i == -1) {
                        i = i3;
                    }
                    i2++;
                } else if (i != -1) {
                    arrayList.add(new int[]{i, i2});
                    i = -1;
                    i2 = 0;
                }
            }
            if (i != -1) {
                arrayList.add(new int[]{i, i2});
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                if (iArr[1] == 1) {
                    m39315I(iArr[0]);
                } else {
                    m39312L(iArr[0], iArr[1]);
                }
            }
            if (X1 > 0) {
                m39312L(0, X1);
            }
            if (a2 < this.f10439O.size() - 1) {
                m39312L(a2 + 1, this.f10439O.size() - a2);
            }
        }

        public final void m31437n0() {
            ArrayList<C5094n> u = C5078d.m23987z().m23992u();
            if (u.isEmpty()) {
                this.f10440P = 0;
                return;
            }
            this.f10439O.ensureCapacity(u.size());
            Iterator<C5094n> it = u.iterator();
            while (it.hasNext()) {
                this.f10439O.add(new C3104e(1, it.next().f17129a));
            }
            this.f10440P = u.size();
        }

        @Override
        public void mo23983s(int i, C5094n nVar) {
            int f0 = i + m31445f0();
            this.f10439O.set(f0, new C3104e(1, nVar.f17129a));
            m39315I(f0);
        }

        @Override
        public void mo23982t(String str, String str2, String[] strArr) {
            int X1 = this.f10441Q.f10426o0.m39552X1();
            int a2 = this.f10441Q.f10426o0.m39549a2();
            Iterator<C3104e> it = this.f10439O.iterator();
            int i = 0;
            while (it.hasNext()) {
                C3104e next = it.next();
                if (next.f10442a == 1 && C5070i.m24068c(next.f10444c, str)) {
                    View C = (i < X1 || i > a2) ? null : this.f10441Q.f10426o0.mo39265C(i);
                    if (!(C instanceof C9647s) || !((C9647s) C).m7916a(str, str2, strArr)) {
                        m39315I(i);
                    }
                }
                i++;
            }
        }
    }

    public static class C3105f extends RecyclerView.AbstractC0886d0 {
        public C3105f(View view) {
            super(view);
        }
    }

    public View$OnClickListenerC3099t8(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        CustomRecyclerView customRecyclerView = this.f10425n0;
        if (customRecyclerView != null) {
            customRecyclerView.requestLayout();
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_emoji;
    }

    public final int m31456We() {
        CustomRecyclerView customRecyclerView = this.f10425n0;
        int measuredWidth = customRecyclerView != null ? customRecyclerView.getMeasuredWidth() : 0;
        if (measuredWidth == 0) {
            measuredWidth = C1357a0.m37546g();
        }
        return Math.max(8, measuredWidth / C1357a0.m37544i(48.0f));
    }

    public void m31455Xe() {
        int We;
        if (this.f10426o0 != null && this.f10428q0 != (We = m31456We())) {
            this.f10428q0 = We;
            this.f10426o0.m39589d3(We);
        }
    }

    public int m31454Ye() {
        int X1 = this.f10426o0.m39552X1();
        int i = 0;
        if (X1 == -1) {
            return 0;
        }
        View C = this.f10426o0.mo39265C(X1);
        if (C != null) {
            i = -C.getTop();
        }
        return i + this.f10427p0.m31441j0(X1, this.f10428q0);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C11052v1.m1768b().m1766d(this);
        C5078d.m23987z().m24026H(this.f10427p0);
        C1399s0.m37165q(this.f10425n0);
    }

    public int m31453Ze() {
        int k0;
        View X = this.f10425n0.m39460X(0.0f, ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding());
        if (X == null || (k0 = this.f10425n0.m39424k0(X)) == -1) {
            return -1;
        }
        return this.f10427p0.m31444g0(k0);
    }

    public void m31452af() {
        int a2 = this.f10426o0.m39549a2();
        for (int X1 = this.f10426o0.m39552X1(); X1 <= a2; X1++) {
            View C = this.f10426o0.mo39265C(X1);
            if (C != null) {
                C.invalidate();
            } else {
                this.f10427p0.m39315I(X1);
            }
        }
    }

    public void m31451bf() {
        C3103d dVar = this.f10427p0;
        if (dVar != null) {
            dVar.m31438m0();
        }
    }

    public void m31450cf(int i) {
        int i2;
        int i3;
        int i4;
        this.f10425n0.m39499D1();
        if (i == 0) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f10427p0.f10440P > 0) {
                i2 = 1;
                for (int i5 = 0; i5 < i; i5++) {
                    if (i5 == 0) {
                        i4 = this.f10427p0.f10440P;
                    } else {
                        i4 = C1374h.f4996i[i5 - 1].length + 1;
                    }
                    i2 += i4;
                }
            } else {
                i2 = 1;
                for (int i6 = 0; i6 < i; i6++) {
                    i2 += C1374h.f4996i[i6].length + 1;
                }
            }
            i3 = (this.f10427p0.m31441j0(i2, this.f10428q0) - ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize()) - ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding();
        }
        int Ze = m31453Ze();
        if (Build.VERSION.SDK_INT < 21 || Math.abs(i - Ze) > 4) {
            if (m9139w9() != null) {
                m9139w9().setIgnoreMovement(true);
            }
            if (i == 0) {
                this.f10426o0.m39525z2(0, 0);
            } else {
                this.f10426o0.m39525z2(i2, ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding());
            }
            if (m9139w9() != null) {
                m9139w9().setIgnoreMovement(false);
                return;
            }
            return;
        }
        int Ye = i3 - m31454Ye();
        int[] iArr = new int[1];
        C3950k kVar = this.f10431t0;
        if (kVar != null) {
            kVar.m29544k();
        }
        this.f10425n0.setScrollDisabled(true);
        if (m9139w9() != null) {
            m9139w9().setIgnoreMovement(true);
            m9139w9().setCurrentEmojiSection(i);
        }
        C3950k kVar2 = new C3950k(0, new C3102c(Ye, iArr), C2057b.f7285g, Math.min(450, Math.max(250, Math.abs(Ze - i) * 150)));
        this.f10431t0 = kVar2;
        kVar2.m29546i(1.0f);
    }

    @Override
    public void mo452g2() {
        CustomRecyclerView customRecyclerView = this.f10425n0;
        if (customRecyclerView != null) {
            int childCount = customRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f10425n0.getChildAt(i);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public View mo403oc(Context context) {
        int We = m31456We();
        this.f10428q0 = We;
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(context, We);
        int i = 1;
        this.f10426o0 = rtlGridLayoutManager.m14123g3(true);
        this.f10429r0 = new C9639r(context, m9131x9().getToneDelegate(), this);
        this.f10427p0 = new C3103d(context, this, this);
        this.f10430s0 = m9131x9().m17851X2();
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler_custom, m9139w9());
        this.f10425n0 = customRecyclerView;
        customRecyclerView.setHasFixedSize(true);
        this.f10425n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f10425n0.setLayoutManager(this.f10426o0);
        CustomRecyclerView customRecyclerView2 = this.f10425n0;
        if (!C4183a.f14083a) {
            i = 2;
        }
        customRecyclerView2.setOverScrollMode(i);
        this.f10425n0.setItemAnimator(new C8731d(C2057b.f7280b, 140L));
        this.f10425n0.m39425k(new C3100a());
        this.f10426o0.m39588e3(new C3101b());
        this.f10425n0.setAdapter(this.f10427p0);
        C11052v1.m1768b().m1769a(this);
        C5078d.m23987z().m24009d(this.f10427p0);
        return this.f10425n0;
    }

    @Override
    public void onClick(View view) {
        if (view instanceof C9647s) {
            C9647s sVar = (C9647s) view;
            String rawEmoji = sVar.getRawEmoji();
            String emojiColored = sVar.getEmojiColored();
            if (!C5070i.m24062i(rawEmoji)) {
                if (view.getId() == R.id.emoji) {
                    C5078d.m23987z().m24019O(rawEmoji);
                }
                if (m9139w9() != null) {
                    m9139w9().m17834t2(emojiColored);
                }
            }
        }
    }

    public static class C3104e {
        public final int f10442a;
        public final int f10443b;
        public final String f10444c;
        public final int f10445d;

        public C3104e(int i, int i2) {
            this.f10442a = i;
            this.f10443b = i2;
            this.f10444c = null;
            this.f10445d = 0;
        }

        public boolean m31436a() {
            return this.f10445d != 0;
        }

        public C3104e(int i, String str) {
            this.f10442a = i;
            this.f10444c = str;
            this.f10445d = C1374h.m37383i().m37385g(str);
            this.f10443b = 0;
        }
    }
}
