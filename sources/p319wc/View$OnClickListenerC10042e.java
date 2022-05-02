package p319wc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import cd.C2099j;
import cd.C2104l;
import gd.C4817v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6847b2;
import me.C6853c2;
import me.C6862d3;
import me.C6977n2;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p143k0.C6035e;
import p335xd.C10192g;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class View$OnClickListenerC10042e extends RecyclerView.AbstractC0890h<C10043a> implements View.OnClickListener {
    public final AbstractC9323v4<?> f32677M;
    public final ArrayList<C10044b> f32678N = new ArrayList<>();
    public final C2099j.AbstractC2102c f32679O;
    public final boolean f32680P;
    public RecyclerView.AbstractC0902p f32681Q;
    public AbstractC9323v4<?> f32682R;
    public boolean f32683S;
    public C6035e<C4817v6> f32684T;

    public static class C10043a extends RecyclerView.AbstractC0886d0 {
        public C10043a(View view) {
            super(view);
        }

        public static C10043a m6117O(Context context, C10930q6 q6Var, int i, boolean z, View.OnClickListener onClickListener, C2099j.AbstractC2102c cVar, boolean z2, AbstractC9323v4<?> v4Var) {
            if (i != 10) {
                switch (i) {
                    case 0:
                        C2099j jVar = new C2099j(context);
                        jVar.m35605j(q6Var);
                        if (z) {
                            jVar.m35592w();
                        }
                        jVar.setStickerMovementCallback(cVar);
                        jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                        return new C10043a(jVar);
                    case 1:
                        View view = new View(context);
                        view.setLayoutParams(FrameLayoutFix.m18008s1(-2, -2));
                        return new C10043a(view);
                    case 2:
                        C6847b2 b2Var = new C6847b2(context);
                        b2Var.setTypeface(C1389o.m37263i());
                        b2Var.setTextColor(C11524j.m213U0());
                        if (v4Var != null) {
                            v4Var.m9480A8(b2Var);
                        }
                        b2Var.setGravity(C4403w.m27991F1());
                        b2Var.setTextSize(1, 15.0f);
                        b2Var.setSingleLine(true);
                        b2Var.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var.setPadding(C1357a0.m37544i(14.0f), C1357a0.m37544i(5.0f), C1357a0.m37544i(14.0f), C1357a0.m37544i(5.0f));
                        b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(32.0f)));
                        return new C10043a(b2Var);
                    case 3:
                        View view2 = new View(context);
                        view2.setLayoutParams(new RecyclerView.LayoutParams(-1, ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding()));
                        return new C10043a(view2);
                    case 4:
                    case 6:
                        C6847b2 b2Var2 = new C6847b2(context);
                        b2Var2.setTypeface(C1389o.m37261k());
                        b2Var2.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        b2Var2.setTextColor(C11524j.m213U0());
                        if (v4Var != null) {
                            v4Var.m9480A8(b2Var2);
                        }
                        b2Var2.setTextSize(1, 15.0f);
                        b2Var2.setSingleLine(true);
                        b2Var2.setText(C4403w.m27871i1(i == 6 ? R.string.ComeAgainLater : R.string.NoStickerSets));
                        b2Var2.setGravity(17);
                        b2Var2.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var2.setPadding(C1357a0.m37544i(14.0f), z2 ? 0 : ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize(), C1357a0.m37544i(14.0f), 0);
                        return new C10043a(b2Var2);
                    case 5:
                        C6977n2 n2Var = new C6977n2(context);
                        n2Var.m18228e(1.0f);
                        n2Var.setPadding(0, z2 ? 0 : ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize(), 0, 0);
                        n2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        return new C10043a(n2Var);
                    case 7:
                        RelativeLayout relativeLayout = new RelativeLayout(context);
                        relativeLayout.setOnClickListener(onClickListener);
                        relativeLayout.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(z2 ? 18.0f : 13.0f) - ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding(), C1357a0.m37544i(16.0f), 0);
                        relativeLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(z2 ? 57.0f : 52.0f)));
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C1357a0.m37544i(16.0f));
                        layoutParams.addRule(C4403w.m27873i());
                        if (C4403w.m27986G2()) {
                            layoutParams.leftMargin = C1357a0.m37544i(6.0f);
                        } else {
                            layoutParams.rightMargin = C1357a0.m37544i(6.0f);
                        }
                        layoutParams.topMargin = C1357a0.m37544i(3.0f);
                        C6847b2 b2Var3 = new C6847b2(context);
                        C10192g.m5782i(b2Var3, R.id.theme_color_promo, v4Var).m16760e(3.0f);
                        b2Var3.setId(R.id.btn_new);
                        b2Var3.setSingleLine(true);
                        b2Var3.setPadding(C1357a0.m37544i(4.0f), C1357a0.m37544i(1.0f), C1357a0.m37544i(4.0f), 0);
                        b2Var3.setTextColor(C11524j.m228N(R.id.theme_color_promoContent));
                        if (v4Var != null) {
                            v4Var.m9119z8(b2Var3, R.id.theme_color_promoContent);
                            v4Var.m9163t8(b2Var3);
                        }
                        b2Var3.setTypeface(C1389o.m37265g());
                        b2Var3.setTextSize(1, 10.0f);
                        b2Var3.setText(C4403w.m27871i1(R.string.New).toUpperCase());
                        b2Var3.setLayoutParams(layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, C1357a0.m37544i(28.0f));
                        if (C4403w.m27986G2()) {
                            layoutParams2.rightMargin = C1357a0.m37544i(16.0f);
                        } else {
                            layoutParams2.leftMargin = C1357a0.m37544i(16.0f);
                        }
                        layoutParams2.topMargin = C1357a0.m37544i(5.0f);
                        layoutParams2.addRule(C4403w.m27986G2() ? 9 : 11);
                        C6853c2 c2Var = new C6853c2(context);
                        if (v4Var != null) {
                            v4Var.m9163t8(c2Var);
                        }
                        c2Var.setId(R.id.btn_addStickerSet);
                        c2Var.setText(R.string.Add);
                        c2Var.setOnClickListener(onClickListener);
                        c2Var.setLayoutParams(layoutParams2);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                        if (C4403w.m27986G2()) {
                            layoutParams3.leftMargin = C1357a0.m37544i(12.0f);
                            layoutParams3.addRule(0, R.id.btn_new);
                            layoutParams3.addRule(1, R.id.btn_addStickerSet);
                        } else {
                            layoutParams3.rightMargin = C1357a0.m37544i(12.0f);
                            layoutParams3.addRule(1, R.id.btn_new);
                            layoutParams3.addRule(0, R.id.btn_addStickerSet);
                        }
                        C6847b2 b2Var4 = new C6847b2(context);
                        b2Var4.setTypeface(C1389o.m37263i());
                        b2Var4.setTextColor(C11524j.m217S0());
                        b2Var4.setGravity(C4403w.m27991F1());
                        if (v4Var != null) {
                            v4Var.m9126y8(b2Var4);
                        }
                        b2Var4.setTextSize(1, 16.0f);
                        b2Var4.setSingleLine(true);
                        b2Var4.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var4.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams4.addRule(C4403w.m27873i());
                        layoutParams4.topMargin = C1357a0.m37544i(22.0f);
                        C6847b2 b2Var5 = new C6847b2(context);
                        b2Var5.setTypeface(C1389o.m37261k());
                        b2Var5.setTextSize(1, 15.0f);
                        b2Var5.setTextColor(C11524j.m213U0());
                        if (v4Var != null) {
                            v4Var.m9480A8(b2Var5);
                        }
                        b2Var5.setSingleLine(true);
                        b2Var5.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var5.setLayoutParams(layoutParams4);
                        relativeLayout.addView(b2Var3);
                        relativeLayout.addView(c2Var);
                        relativeLayout.addView(b2Var4);
                        relativeLayout.addView(b2Var5);
                        return new C10043a(relativeLayout);
                    default:
                        throw new UnsupportedOperationException("viewType == " + i);
                }
            } else {
                C6862d3 d3Var = new C6862d3(context);
                if (v4Var != null) {
                    v4Var.m9163t8(d3Var);
                }
                d3Var.m18738a();
                d3Var.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(5.0f)));
                return new C10043a(d3Var);
            }
        }
    }

    public View$OnClickListenerC10042e(AbstractC9323v4<?> v4Var, C2099j.AbstractC2102c cVar, boolean z, AbstractC9323v4<?> v4Var2) {
        this.f32677M = v4Var;
        this.f32679O = cVar;
        this.f32680P = z;
        this.f32682R = v4Var2;
    }

    public void m6128o0(C4817v6 v6Var, TdApi.Object object) {
        this.f32684T.m21500l(v6Var.m25183c());
        m6148G0(v6Var);
        if (object.getConstructor() == -722616727) {
            v6Var.m25161y();
            m6149F0(v6Var);
        }
    }

    public void m6127p0(final C4817v6 v6Var, final TdApi.Object object) {
        this.f32677M.mo4348c().m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC10042e.this.m6128o0(v6Var, object);
            }
        });
    }

    public void m6156A0(C10044b bVar) {
        m6137f0();
        if (bVar != null) {
            this.f32678N.add(bVar);
            m39314J(0);
        }
    }

    public void m6155B0(ArrayList<C10044b> arrayList) {
        m6137f0();
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f32678N.addAll(arrayList);
            m39311M(0, arrayList.size());
        }
    }

    public void m6154C0(RecyclerView.AbstractC0902p pVar) {
        this.f32681Q = pVar;
    }

    @Override
    public int mo6153D() {
        return this.f32678N.size();
    }

    public void m6152D0(int i, boolean z, RecyclerView.AbstractC0902p pVar) {
        View C = pVar != null ? pVar.mo39265C(i) : null;
        if (C == null || !(C instanceof C2099j)) {
            m39315I(i);
        } else {
            ((C2099j) C).setStickerPressed(z);
        }
    }

    public void m6151E0(C2104l lVar, boolean z, RecyclerView.AbstractC0902p pVar) {
        int k0 = m6132k0(lVar, 0);
        if (k0 != -1) {
            m6152D0(k0, z, pVar);
        }
    }

    @Override
    public int mo6150F(int i) {
        return this.f32678N.get(i).f32685a;
    }

    public void m6149F0(C4817v6 v6Var) {
        if (this.f32681Q != null) {
            int k = v6Var.m25175k();
            View C = this.f32681Q.mo39265C(k);
            if (C != null && mo6150F(k) == 7 && this.f32681Q.m39228Z(C) == 7) {
                ((C6853c2) ((ViewGroup) C).getChildAt(1)).m18769h(v6Var.m25171o(), true);
            } else {
                m39315I(k);
            }
        }
    }

    public final void m6148G0(C4817v6 v6Var) {
        if (this.f32681Q != null) {
            int k = v6Var.m25175k();
            View C = this.f32681Q.mo39265C(k);
            if (C == null || mo6150F(k) != 7) {
                m39315I(k);
            } else {
                ((C6853c2) ((ViewGroup) C).getChildAt(1)).m18770g(m6129n0(v6Var.m25183c()), true);
            }
        }
    }

    public void m6147H0(C4817v6 v6Var) {
        if (this.f32681Q != null) {
            int k = v6Var.m25175k();
            View C = this.f32681Q.mo39265C(k);
            if (C == null || mo6150F(k) != 7) {
                m39315I(k);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) C;
            int i = 0;
            ((C6853c2) viewGroup.getChildAt(1)).m18769h(v6Var.m25171o(), false);
            View childAt = viewGroup.getChildAt(0);
            if (v6Var.m25166t()) {
                i = 8;
            }
            childAt.setVisibility(i);
        }
    }

    public void m6139d0(ArrayList<C10044b> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f32678N.size();
            this.f32678N.addAll(arrayList);
            m39311M(size, arrayList.size());
        }
    }

    public void m6138e0(int i, ArrayList<C10044b> arrayList) {
        this.f32678N.addAll(i, arrayList);
        m39311M(i, arrayList.size());
    }

    public final void m6137f0() {
        if (!this.f32678N.isEmpty()) {
            int size = this.f32678N.size();
            this.f32678N.clear();
            m39310N(0, size);
        }
    }

    public C10044b m6136g0(int i) {
        return this.f32678N.get(i);
    }

    public C2104l m6135h0(int i) {
        if (i < 0 || i >= this.f32678N.size()) {
            return null;
        }
        return this.f32678N.get(i).f32686b;
    }

    public C4817v6 m6134i0(int i) {
        if (i < 0 || i >= this.f32678N.size()) {
            return null;
        }
        return this.f32678N.get(i).f32687c;
    }

    public int m6133j0(C2104l lVar) {
        Iterator<C10044b> it = this.f32678N.iterator();
        int i = 0;
        while (it.hasNext()) {
            C10044b next = it.next();
            if (next.f32685a == 0 && lVar.equals(next.f32686b)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int m6132k0(C2104l lVar, int i) {
        if (i == 0) {
            return m6133j0(lVar);
        }
        int size = this.f32678N.size();
        while (i < size) {
            C10044b bVar = this.f32678N.get(i);
            if (bVar.f32685a == 0 && lVar.equals(bVar.f32686b)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void m6131l0(int i, ArrayList<C10044b> arrayList) {
        this.f32678N.addAll(i, arrayList);
        m39311M(i, arrayList.size());
    }

    public final void m6130m0(final C4817v6 v6Var) {
        C6035e<C4817v6> eVar = this.f32684T;
        if (eVar == null) {
            this.f32684T = new C6035e<>();
        } else if (eVar.m21506f(v6Var.m25183c()) != null) {
            return;
        }
        this.f32684T.m21501k(v6Var.m25183c(), v6Var);
        this.f32677M.mo4348c().m2270r4().m14783o(new TdApi.ChangeStickerSet(v6Var.m25183c(), true, false), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC10042e.this.m6127p0(v6Var, object);
            }
        });
    }

    public final boolean m6129n0(long j) {
        C6035e<C4817v6> eVar = this.f32684T;
        return (eVar == null || eVar.m21506f(j) == null) ? false : true;
    }

    @Override
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag != null && (tag instanceof C4817v6)) {
            C4817v6 v6Var = (C4817v6) tag;
            if (view.getId() != R.id.btn_addStickerSet) {
                v6Var.m25188H(this.f32677M);
                return;
            }
            ((C6853c2) view).m18770g(true, true);
            m6130m0(v6Var);
        }
    }

    public int m6126q0(int i, int i2, int i3, ArrayList<C4817v6> arrayList) {
        if (i == 0 || arrayList == null || i3 == -1) {
            return 0;
        }
        int i4 = i - 1;
        int headerSize = ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding();
        if (i4 == 0) {
            return headerSize;
        }
        int B = (arrayList.get(0).m25167s() ? C1357a0.m37556B() : C1357a0.m37546g()) / i2;
        int i5 = headerSize;
        boolean z = false;
        for (int i6 = 0; i6 < i3 + 1 && i4 > 0 && i6 < arrayList.size(); i6++) {
            C4817v6 v6Var = arrayList.get(i6);
            if (!v6Var.m25168r()) {
                i5 += C1357a0.m37544i(v6Var.m25167s() ? 52.0f : 32.0f);
                i4--;
            } else if (v6Var.m25172n()) {
                z = true;
            }
            if (v6Var.m25169q()) {
                i4--;
                if (z) {
                    i5 += C1357a0.m37544i(32.0f);
                }
            }
            if (i4 > 0) {
                int min = Math.min(v6Var.m25167s() ? 5 : v6Var.m25176j(), i4);
                i5 += ((int) Math.ceil(min / i2)) * B;
                i4 -= min;
            }
        }
        return i5;
    }

    public void m6125r0(int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i4 = (i + i2) - 1; i4 >= i; i4--) {
            arrayList.add(0, this.f32678N.remove(i4));
        }
        m39310N(i, i2);
        this.f32678N.addAll(i3, arrayList);
        m39311M(i3, i2);
    }

    public void mo6146Q(C10043a aVar, int i) {
        int n = aVar.m39335n();
        if (n != 0) {
            String str = "";
            if (n == 2) {
                C4817v6 i0 = m6134i0(i);
                TextView textView = (TextView) aVar.f3479a;
                if (i0 != null) {
                    str = i0.m25174l();
                }
                C1399s0.m37178j0(textView, str);
                C1399s0.m37160s0((TextView) aVar.f3479a, C4403w.m27991F1());
            } else if (n == 7) {
                C4817v6 i02 = m6134i0(i);
                if (i02 != null && !i02.m25166t()) {
                    i02.m25186J();
                }
                RelativeLayout relativeLayout = (RelativeLayout) aVar.f3479a;
                View childAt = relativeLayout.getChildAt(0);
                C6853c2 c2Var = (C6853c2) relativeLayout.getChildAt(1);
                TextView textView2 = (TextView) relativeLayout.getChildAt(2);
                TextView textView3 = (TextView) relativeLayout.getChildAt(3);
                relativeLayout.setTag(i02);
                childAt.setVisibility((i02 == null || i02.m25166t()) ? 8 : 0);
                c2Var.m18770g(i02 != null && !i02.m25169q() && m6129n0(i02.m25183c()), false);
                c2Var.m18769h(i02 != null && i02.m25171o(), false);
                c2Var.setTag(i02);
                C1399s0.m37178j0(textView2, i02 != null ? i02.m25174l() : str);
                if (i02 != null) {
                    str = C4403w.m27846o2(R.string.xStickers, i02.m25176j());
                }
                textView3.setText(str);
                if (C1399s0.m37199Y(childAt, C4403w.m27986G2())) {
                    int i2 = C1357a0.m37544i(6.0f);
                    int i3 = C1357a0.m37544i(3.0f);
                    int i4 = C4403w.m27986G2() ? i2 : 0;
                    if (C4403w.m27986G2()) {
                        i2 = 0;
                    }
                    C1399s0.m37182h0(childAt, i4, i3, i2, 0);
                    C1399s0.m37148y0(childAt);
                }
                if (C1399s0.m37200X(c2Var, C4403w.m27986G2() ? 9 : 11)) {
                    int i5 = C1357a0.m37544i(16.0f);
                    int i6 = C1357a0.m37544i(5.0f);
                    int i7 = C4403w.m27986G2() ? 0 : i5;
                    if (!C4403w.m27986G2()) {
                        i5 = 0;
                    }
                    C1399s0.m37182h0(c2Var, i7, i6, i5, 0);
                    C1399s0.m37148y0(c2Var);
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
                if (C4403w.m27986G2()) {
                    int i8 = C1357a0.m37544i(12.0f);
                    if (layoutParams.leftMargin != i8) {
                        layoutParams.leftMargin = i8;
                        layoutParams.rightMargin = 0;
                        layoutParams.addRule(0, R.id.btn_new);
                        layoutParams.addRule(1, R.id.btn_addStickerSet);
                        C1399s0.m37148y0(textView2);
                    }
                } else {
                    int i9 = C1357a0.m37544i(12.0f);
                    if (layoutParams.rightMargin != i9) {
                        layoutParams.rightMargin = i9;
                        layoutParams.leftMargin = 0;
                        layoutParams.addRule(1, R.id.btn_new);
                        layoutParams.addRule(0, R.id.btn_addStickerSet);
                        C1399s0.m37148y0(textView2);
                    }
                }
                C1399s0.m37160s0(textView2, C4403w.m27991F1());
                if (C1399s0.m37199Y(textView3, C4403w.m27986G2())) {
                    C1399s0.m37148y0(textView3);
                }
            }
        } else {
            C2104l h0 = m6135h0(i);
            if (h0 != null && h0.m35573n()) {
                h0.m35567t();
            }
            ((C2099j) aVar.f3479a).setSticker(h0);
        }
    }

    public C10043a mo6145S(ViewGroup viewGroup, int i) {
        return C10043a.m6117O(this.f32677M.mo4347s(), this.f32677M.mo4348c(), i, this.f32680P, this, this.f32679O, this.f32683S, this.f32682R);
    }

    public void mo6144V(C10043a aVar) {
        int n = aVar.m39335n();
        if (n == 0) {
            ((C2099j) aVar.f3479a).m35611d();
        } else if (n == 5) {
            ((C6977n2) aVar.f3479a).mo8225f();
        }
    }

    public void mo6143W(C10043a aVar) {
        int n = aVar.m39335n();
        if (n == 0) {
            ((C2099j) aVar.f3479a).m35606i();
        } else if (n == 5) {
            ((C6977n2) aVar.f3479a).mo8229b();
        }
    }

    public void mo6142X(C10043a aVar) {
        int n = aVar.m39335n();
        if (n == 0) {
            ((C2099j) aVar.f3479a).mo4501a3();
        } else if (n == 5) {
            ((C6977n2) aVar.f3479a).mo4501a3();
        }
    }

    public void m6119y0(int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            this.f32678N.remove(i3);
        }
        m39310N(i, i2);
    }

    public void m6118z0() {
        this.f32683S = true;
    }

    public static class C10044b {
        public int f32685a;
        public final C2104l f32686b;
        public final C4817v6 f32687c;

        public C10044b(int i) {
            this.f32685a = i;
            this.f32686b = null;
            this.f32687c = null;
        }

        public boolean m6116a(int i) {
            if (this.f32685a == i) {
                return false;
            }
            this.f32685a = i;
            return true;
        }

        public C10044b(int i, C2104l lVar) {
            this.f32685a = i;
            this.f32686b = lVar;
            this.f32687c = null;
        }

        public C10044b(int i, C4817v6 v6Var) {
            this.f32685a = i;
            this.f32686b = null;
            this.f32687c = v6Var;
        }
    }
}
