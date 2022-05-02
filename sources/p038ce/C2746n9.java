package p038ce;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import cd.C2099j;
import cd.C2104l;
import gd.C4623e3;
import gd.C4779t2;
import gd.C4817v6;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6957m1;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.NewFlowLayoutManager;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import p037cb.C2057b;
import p038ce.C2746n9;
import p051db.C3950k;
import p067ed.C4183a;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p124ib.C5322e;
import p124ib.C5324g;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6035e;
import p194nd.RunnableC7470o;
import p225pd.C8112b;
import p319wc.C10036a;
import p319wc.View$OnClickListenerC10037b;
import p319wc.View$OnClickListenerC10042e;
import p350yd.AbstractC10551b;
import p350yd.AbstractC10986s1;
import p350yd.C10930q6;
import p350yd.C10965r1;
import sc.C8731d;
import td.AbstractC9323v4;

public class C2746n9 extends AbstractC9323v4<ViewTreeObserver$OnPreDrawListenerC7081z0> implements Client.AbstractC7865g, C2099j.AbstractC2102c, AbstractC10986s1, AbstractC10551b, C2104l.AbstractC2105a, C3950k.AbstractC3952b, View$OnClickListenerC10037b.AbstractC10038a, C4817v6.AbstractC4818a, C4336c.AbstractC4337a, C6957m1.AbstractC6962e {
    public int f9281A0;
    public C4817v6 f9282B0;
    public int f9283C0;
    public boolean f9284D0;
    public ArrayList<long[]> f9285E0;
    public boolean f9286F0;
    public boolean f9287G0;
    public boolean f9288H0;
    public int f9289I0;
    public int[] f9290J0;
    public boolean f9291K0;
    public int[] f9292L0;
    public boolean f9293M0;
    public TdApi.StickerSets f9294N0;
    public C5324g f9295O0;
    public boolean f9296P0;
    public long f9297Q0;
    public boolean f9298R0;
    public C3950k f9299S0;
    public C6035e<Boolean> f9300T0;
    public AbstractRunnableC5910b f9301U0;
    public ArrayList<C4817v6> f9302V0;
    public TdApi.Sticker[] f9303W0;
    public TdApi.Sticker[] f9304X0;
    public boolean f9305Y0;
    public ArrayList<C4623e3> f9306Z0;
    public View f9307a1;
    public int f9308b1;
    public View f9309c1;
    public boolean f9310d1;
    public C3950k f9311e1;
    public float f9312f1;
    public int f9313n0;
    public FrameLayoutFix f9314o0;
    public View$OnClickListenerC10042e f9315p0;
    public View$OnClickListenerC10042e f9316q0;
    public View$OnClickListenerC10037b f9317r0;
    public CustomRecyclerView f9318s0;
    public RecyclerView f9319t0;
    public RecyclerView f9320u0;
    public final ArrayList<C4817v6> f9321v0 = new ArrayList<>();
    public boolean f9322w0;
    public boolean f9323x0;
    public int f9324y0;
    public C4817v6 f9325z0;

    public class C2747a implements Client.AbstractC7865g {
        public final int[] f9327a;
        public final int f9328b;
        public final long[] f9329c;

        public C2747a(int[] iArr, int i, long[] jArr) {
            this.f9327a = iArr;
            this.f9328b = i;
            this.f9329c = jArr;
        }

        public void m33617c(C4817v6 v6Var, ArrayList arrayList, int i) {
            if (!C2746n9.this.m9347Sa()) {
                C2746n9 n9Var = C2746n9.this;
                n9Var.m33744Ef(v6Var, arrayList, i + n9Var.m33675eg());
            }
        }

        public void m33616d() {
            if (!C2746n9.this.m9347Sa()) {
                C2746n9.this.m33686ah(false);
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            if (object.getConstructor() == -1816236758) {
                TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
                final C4817v6 v6Var = new C4817v6(C2746n9.this.f30170b, stickerSet);
                TdApi.Sticker[] stickerArr = stickerSet.stickers;
                int[] iArr = this.f9327a;
                final int i = iArr[1];
                iArr[1] = i + 1;
                final ArrayList arrayList = new ArrayList(stickerArr.length + 1);
                arrayList.add(new View$OnClickListenerC10042e.C10044b(2, v6Var));
                int i2 = 0;
                for (TdApi.Sticker sticker : stickerArr) {
                    arrayList.add(new View$OnClickListenerC10042e.C10044b(0, new C2104l(C2746n9.this.f30170b, sticker, sticker.type, stickerSet.emojis[i2].emojis)));
                    i2++;
                }
                C2746n9.this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C2746n9.C2747a.this.m33617c(v6Var, arrayList, i);
                    }
                });
            }
            int[] iArr2 = this.f9327a;
            int i3 = iArr2[0] + 1;
            iArr2[0] = i3;
            if (i3 < this.f9328b) {
                C2746n9.this.f30170b.m2270r4().m14783o(new TdApi.GetStickerSet(this.f9329c[this.f9327a[0]]), this);
            } else {
                C2746n9.this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C2746n9.C2747a.this.m33616d();
                    }
                });
            }
        }
    }

    public class C2748b implements C3950k.AbstractC3952b {
        public final int f9330a;
        public final int[] f9331b;

        public C2748b(int i, int[] iArr) {
            this.f9330a = i;
            this.f9331b = iArr;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            int i2 = (int) (this.f9330a * f);
            C2746n9.this.f9318s0.scrollBy(0, i2 - this.f9331b[0]);
            this.f9331b[0] = i2;
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C2746n9.this.f9318s0.setScrollDisabled(false);
            C2746n9.this.m33677dh(false, 0L);
            if (C2746n9.this.m9139w9() != null) {
                C2746n9.this.m9139w9().setIgnoreMovement(false);
            }
        }
    }

    public class C2749c extends AbstractRunnableC5910b {
        public C2749c() {
        }

        @Override
        public void mo1364b() {
            if (C2746n9.this.f9300T0 != null && C2746n9.this.f9300T0.m21497p() > 0) {
                int p = C2746n9.this.f9300T0.m21497p();
                long[] jArr = new long[p];
                for (int i = 0; i < p; i++) {
                    jArr[i] = C2746n9.this.f9300T0.m21502j(i);
                }
                C2746n9.this.f9300T0.m21510b();
                C2746n9.this.f30170b.m2270r4().m14783o(new TdApi.ViewTrendingStickerSets(jArr), C2746n9.this.f30170b.m2392ja());
            }
        }
    }

    public class C2750d extends FrameLayoutFix {
        public C2750d(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            C2746n9.this.m33644oh();
        }
    }

    public class C2751e extends GridLayoutManager.AbstractC0873b {
        public C2751e() {
        }

        @Override
        public int mo7528f(int i) {
            if (C2746n9.this.f9315p0.mo6150F(i) == 0) {
                return 1;
            }
            return C2746n9.this.f9324y0;
        }
    }

    public class C2752f extends RecyclerView.AbstractC0910t {
        public C2752f() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if ((C2746n9.this.f9311e1 == null || C2746n9.this.f9311e1.m29540o() == 0.0f) && C2746n9.this.f9313n0 == 0 && C2746n9.this.m9139w9() != null) {
                boolean z = true;
                if (C2746n9.this.m9139w9().getCurrentItem() == 1) {
                    if (!(i == 1 || i == 2)) {
                        z = false;
                    }
                    C2746n9.this.m9139w9().setIsScrolling(z);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            C2746n9.this.m33727Mg(false);
        }
    }

    public class C2753g extends NewFlowLayoutManager {
        public NewFlowLayoutManager.C7927a f9337W = new NewFlowLayoutManager.C7927a();

        public C2753g(Context context, int i) {
            super(context, i);
        }

        @Override
        public NewFlowLayoutManager.C7927a mo7529l3(int i) {
            C4623e3 c0 = C2746n9.this.f9317r0.m6167c0(i);
            this.f9337W.f25767a = c0.m26837f();
            this.f9337W.f25768b = c0.m26838e();
            NewFlowLayoutManager.C7927a aVar = this.f9337W;
            if (aVar.f25767a == 0.0f) {
                aVar.f25767a = 100.0f;
            }
            if (aVar.f25768b == 0.0f) {
                aVar.f25768b = 100.0f;
            }
            return aVar;
        }
    }

    public class C2754h extends GridLayoutManager.AbstractC0873b {
        public final NewFlowLayoutManager f9339e;

        public C2754h(NewFlowLayoutManager newFlowLayoutManager) {
            this.f9339e = newFlowLayoutManager;
        }

        @Override
        public int mo7528f(int i) {
            return this.f9339e.m14129m3(i);
        }
    }

    public class C2755i extends RecyclerView.AbstractC0910t {
        public C2755i() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (C2746n9.this.f9311e1 == null || C2746n9.this.f9311e1.m29540o() == 0.0f) {
                boolean z = true;
                if (C2746n9.this.f9313n0 == 1 && C2746n9.this.m9139w9() != null && C2746n9.this.m9139w9().getCurrentItem() == 1) {
                    if (!(i == 1 || i == 2)) {
                        z = false;
                    }
                    C2746n9.this.m9139w9().setIsScrolling(z);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if ((C2746n9.this.f9311e1 == null || C2746n9.this.f9311e1.m29540o() == 0.0f) && C2746n9.this.f9313n0 == 1 && C2746n9.this.m9139w9() != null && C2746n9.this.m9139w9().getCurrentItem() == 1) {
                C2746n9.this.m9139w9().m17836p2(C2746n9.this.m33693Yf());
            }
        }
    }

    public class C2756j extends RecyclerView.AbstractC0901o {
        public final NewFlowLayoutManager f9342a;

        public C2756j(NewFlowLayoutManager newFlowLayoutManager) {
            this.f9342a = newFlowLayoutManager;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39424k0(view);
            int i = 0;
            rect.top = this.f9342a.m14128n3(k0) ? C1357a0.m37544i(4.0f) + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() : 0;
            if (!this.f9342a.m14127o3(k0)) {
                i = C1357a0.m37544i(3.0f);
            }
            rect.right = i;
            rect.bottom = C1357a0.m37544i(3.0f);
        }
    }

    public class C2757k extends GridLayoutManager.AbstractC0873b {
        public C2757k() {
        }

        @Override
        public int mo7528f(int i) {
            return C2746n9.this.f9316q0.mo6150F(i) == 0 ? 1 : 5;
        }
    }

    public class C2758l extends RecyclerView.AbstractC0910t {
        public C2758l() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if ((C2746n9.this.f9311e1 == null || C2746n9.this.f9311e1.m29540o() == 0.0f) && C2746n9.this.f9313n0 == 2 && C2746n9.this.m9139w9() != null) {
                boolean z = true;
                if (C2746n9.this.m9139w9().getCurrentItem() == 1) {
                    if (!(i == 1 || i == 2)) {
                        z = false;
                    }
                    C2746n9.this.m9139w9().setIsScrolling(z);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int a2;
            int indexOf;
            if ((C2746n9.this.f9311e1 == null || C2746n9.this.f9311e1.m29540o() == 0.0f) && C2746n9.this.f9313n0 == 2 && C2746n9.this.m9139w9() != null && C2746n9.this.m9139w9().getCurrentItem() == 1) {
                C2746n9.this.m9139w9().m17833u2(C2746n9.this.m33672fg());
                if (!C2746n9.this.f9322w0 && C2746n9.this.f9323x0 && (a2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549a2()) != -1 && (indexOf = C2746n9.this.f9321v0.indexOf(C2746n9.this.f9316q0.m6136g0(a2).f32687c)) != -1 && indexOf + 5 >= C2746n9.this.f9321v0.size()) {
                    C2746n9 n9Var = C2746n9.this;
                    n9Var.m33733Jg(n9Var.f9321v0.size(), 25, C2746n9.this.f9316q0.mo6153D());
                }
            }
        }
    }

    public C2746n9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33751Ag() {
        if (!m9347Sa() && this.f9319t0 != null) {
            m33737Hg();
        }
    }

    public void m33749Bg(TdApi.StickerSets stickerSets) {
        if (!m9347Sa()) {
            if (m9139w9() != null) {
                m9139w9().setHasNewHots(m33669gg(stickerSets.sets) > 0);
            }
            m33699Wg(stickerSets);
        }
    }

    public void m33747Cg(boolean z, ArrayList arrayList, TdApi.Sticker[] stickerArr) {
        if (m9347Sa()) {
            return;
        }
        if (z) {
            if (this.f9287G0) {
                this.f9287G0 = false;
                if (arrayList != null) {
                    m33683bh(stickerArr, arrayList);
                }
            }
        } else if (this.f9286F0) {
            this.f9286F0 = false;
            if (arrayList != null) {
                m33671fh(stickerArr, arrayList);
            }
        }
    }

    public void m33745Dg(TdApi.Object object) {
        m33723Og(object, true);
    }

    public void m33743Eg(TdApi.Object object) {
        m33723Og(object, false);
    }

    public boolean m33741Fg(TdApi.Animation animation, View view, int i) {
        if (i != R.id.btn_deleteGif) {
            return true;
        }
        this.f9317r0.m6162h0(animation.animation.f25376id);
        if (this.f9317r0.mo6153D() == 0) {
            m33650mh();
        }
        this.f30170b.m2270r4().m14783o(new TdApi.RemoveSavedAnimation(new TdApi.InputFileId(animation.animation.f25376id)), this.f30170b.m2392ja());
        return true;
    }

    public void m33739Gg() {
        if (m9139w9() != null && this.f9313n0 == 0) {
            m9139w9().m17865O2(m33681cg(), true, true);
            m9139w9().m17885C2(true);
        }
        this.f9289I0--;
    }

    public static int m33725Ng(C10930q6 q6Var, ArrayList<C4817v6> arrayList, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList2, int i, TdApi.StickerSetInfo[] stickerSetInfoArr, C2104l.AbstractC2105a aVar, C4817v6.AbstractC4818a aVar2, boolean z) {
        C10930q6 q6Var2 = q6Var;
        ArrayList<C4817v6> arrayList3 = arrayList;
        arrayList3.ensureCapacity(stickerSetInfoArr.length);
        boolean z2 = true;
        arrayList2.ensureCapacity(arrayList2.size() + (stickerSetInfoArr.length * 2) + 1);
        int size = i + arrayList2.size();
        int length = stickerSetInfoArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            TdApi.StickerSetInfo stickerSetInfo = stickerSetInfoArr[i2];
            if (!stickerSetInfo.isViewed) {
                i3++;
            }
            C4817v6 v6Var = new C4817v6(q6Var2, stickerSetInfo);
            v6Var.m25189G(aVar2);
            v6Var.m25193C();
            if (z) {
                if (z2) {
                    z2 = false;
                } else {
                    arrayList2.add(new View$OnClickListenerC10042e.C10044b(10));
                    size++;
                }
            }
            arrayList3.add(v6Var);
            v6Var.m25191E(size);
            arrayList2.add(new View$OnClickListenerC10042e.C10044b(7, v6Var));
            int i4 = 5;
            int i5 = 0;
            while (i5 < i4) {
                TdApi.Sticker[] stickerArr = stickerSetInfo.covers;
                C2104l lVar = new C2104l(q6Var2, i5 < stickerArr.length ? stickerArr[i5] : null, (String) null, stickerSetInfo.stickerType);
                lVar.m35587B(stickerSetInfo.f25427id, null);
                lVar.m35565v(aVar);
                lVar.m35561z();
                arrayList2.add(new View$OnClickListenerC10042e.C10044b(0, lVar));
                i5++;
                i4 = 5;
                q6Var2 = q6Var;
            }
            size += 6;
            i2++;
            q6Var2 = q6Var;
            arrayList3 = arrayList;
        }
        return i3;
    }

    public static int m33724Of(int i, int i2) {
        int min = Math.min(i, i2) / 5;
        if (min == 0) {
            return 5;
        }
        return i / min;
    }

    public static int m33696Xf() {
        return C1357a0.m37546g() / m33724Of(C1357a0.m37546g(), C1357a0.m37547f());
    }

    public static int m33690Zf(boolean z) {
        return z ? 5 : 20;
    }

    public static int m33669gg(TdApi.StickerSetInfo[] stickerSetInfoArr) {
        int i = 0;
        for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
            if (!stickerSetInfo.isViewed) {
                i++;
            }
        }
        return i;
    }

    public void m33634sg(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        if (!m9347Sa()) {
            m33742Ff(arrayList, arrayList2, i > 0, i2);
        }
    }

    public void m33632tg(final int i, int i2, TdApi.Object object) {
        final int i3;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (object.getConstructor() == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (i == 0) {
                arrayList2.add(new View$OnClickListenerC10042e.C10044b(3));
            }
            i3 = m33725Ng(this.f30170b, arrayList, arrayList2, i2, stickerSetInfoArr, this, this, false);
        } else {
            if (i == 0) {
                arrayList2.add(new View$OnClickListenerC10042e.C10044b(6));
            }
            i3 = 0;
        }
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33634sg(arrayList, arrayList2, i3, i);
            }
        });
    }

    public void m33630ug(int[] iArr) {
        if (!m9347Sa() && !this.f9298R0) {
            if (this.f9293M0) {
                this.f9293M0 = false;
                this.f9292L0 = iArr;
                return;
            }
            m33740Gf(iArr);
        }
    }

    public void m33628vg(long[] jArr) {
        if (!m9347Sa() && !this.f9298R0) {
            m33715Rf(jArr);
        }
    }

    public void m33626wg(int[] iArr) {
        if (!m9347Sa() && !this.f9298R0) {
            if (this.f9291K0) {
                this.f9291K0 = false;
                this.f9290J0 = iArr;
                return;
            }
            m33738Hf(iArr);
        }
    }

    public void m33624xg(ArrayList arrayList, TdApi.Sticker[] stickerArr, TdApi.Sticker[] stickerArr2, ArrayList arrayList2) {
        if (!m9347Sa()) {
            boolean z = true;
            if (m9139w9() != null) {
                m9139w9().m17862Q2(arrayList, stickerArr.length > 0, stickerArr2.length > 0);
            }
            if (stickerArr.length <= 0) {
                z = false;
            }
            m33668gh(z);
            m33665hh(arrayList, arrayList2);
        }
    }

    public void m33622yg(TdApi.StickerSet stickerSet) {
        if (!m9347Sa()) {
            m33728Mf(stickerSet);
        }
    }

    public void m33620zg(ArrayList arrayList) {
        if (!m9347Sa()) {
            m33680ch(arrayList);
        }
    }

    @Override
    public void mo7577A4(C2099j jVar, C2104l lVar) {
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return true;
    }

    @Override
    public void mo7576B1(C2099j jVar, C2104l lVar, boolean z) {
        RecyclerView.AbstractC0902p pVar = null;
        if (lVar.m35569r()) {
            int mg = m33651mg(lVar);
            if (mg != -1) {
                View$OnClickListenerC10042e eVar = this.f9316q0;
                RecyclerView recyclerView = this.f9320u0;
                if (recyclerView != null) {
                    pVar = recyclerView.getLayoutManager();
                }
                eVar.m6152D0(mg, z, pVar);
                return;
            }
            return;
        }
        int ig = m33663ig(lVar);
        if (ig != -1) {
            View$OnClickListenerC10042e eVar2 = this.f9315p0;
            CustomRecyclerView customRecyclerView = this.f9318s0;
            if (customRecyclerView != null) {
                pVar = customRecyclerView.getLayoutManager();
            }
            eVar2.m6152D0(ig, z, pVar);
        }
    }

    @Override
    public void mo25159B2(C4817v6 v6Var) {
        m33638qh(v6Var.m25183c());
    }

    @Override
    public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        if (i == R.id.btn_deleteGif) {
            m33711Sg((TdApi.Animation) obj);
        } else if (i == R.id.btn_send) {
            m33689Zg(fVar.m18345A(), (TdApi.Animation) obj);
        }
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        m33689Zg(view, ((C10036a) view).getGif().m26842a());
    }

    @Override
    public void mo6159C0(View view, TdApi.Animation animation) {
        m33689Zg(view, animation);
    }

    @Override
    public void mo6158D1(View view, TdApi.Animation animation) {
        m33711Sg(animation);
    }

    @Override
    public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
    }

    public final void m33744Ef(C4817v6 v6Var, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList, int i) {
        if (i >= 0 && i < this.f9302V0.size()) {
            m33726Nf();
            if (m9139w9() != null) {
                m9139w9().m17868N1(i, v6Var);
            }
            int k = this.f9302V0.get(i).m25175k();
            this.f9302V0.add(i, v6Var);
            while (i < this.f9302V0.size()) {
                C4817v6 v6Var2 = this.f9302V0.get(i);
                v6Var2.m25191E(k);
                k += v6Var2.m25176j() + 1;
                i++;
            }
            this.f9315p0.m6138e0(v6Var.m25175k(), arrayList);
            m33702Vg();
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public void mo4616F1(int[] iArr) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33751Ag();
            }
        });
    }

    public final void m33742Ff(ArrayList<C4817v6> arrayList, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList2, boolean z, int i) {
        if (i == 0 || (this.f9322w0 && i == this.f9321v0.size())) {
            if (arrayList != null) {
                if (i == 0) {
                    this.f9282B0 = null;
                    this.f9321v0.clear();
                }
                this.f9321v0.addAll(arrayList);
            }
            this.f9323x0 = arrayList != null && !arrayList.isEmpty();
            if (m9139w9() != null && (z || i == 0)) {
                m9139w9().setHasNewHots(z);
            }
            if (i == 0) {
                RecyclerView recyclerView = this.f9320u0;
                if (recyclerView != null) {
                    recyclerView.m39499D1();
                    ((LinearLayoutManager) this.f9320u0.getLayoutManager()).m39525z2(0, 0);
                }
                this.f9316q0.m6155B0(arrayList2);
            } else {
                this.f9316q0.m6139d0(arrayList2);
            }
            this.f9322w0 = false;
        }
    }

    public final void m33740Gf(int[] iArr) {
        m33720Pg();
    }

    @Override
    public void mo7568H1(C2099j jVar, C2104l lVar) {
    }

    @Override
    public void mo2038H4(final int[] iArr, boolean z) {
        if (!z) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C2746n9.this.m33626wg(iArr);
                }
            });
        }
    }

    public final void m33738Hf(int[] iArr) {
        m33717Qg();
    }

    public final void m33737Hg() {
        if (!this.f9305Y0) {
            this.f9305Y0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetSavedAnimations(), this);
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        CustomRecyclerView customRecyclerView = this.f9318s0;
        if (customRecyclerView != null) {
            customRecyclerView.requestLayout();
        }
        View$OnClickListenerC10042e eVar = this.f9316q0;
        if (eVar != null) {
            eVar.m39316H();
        }
    }

    public void m33736If() {
        int[] iArr = this.f9290J0;
        if (iArr != null) {
            m33738Hf(iArr);
            this.f9290J0 = null;
        }
        TdApi.StickerSets stickerSets = this.f9294N0;
        if (stickerSets != null) {
            m33732Kf(stickerSets);
            this.f9294N0 = null;
        }
    }

    public final void m33735Ig() {
        if (!this.f9298R0) {
            this.f9298R0 = true;
            this.f9286F0 = false;
            this.f9287G0 = false;
            this.f30170b.m2270r4().m14783o(new TdApi.GetFavoriteStickers(), this);
        }
    }

    public final void m33734Jf() {
        TdApi.StickerSets stickerSets = this.f9294N0;
        if (stickerSets != null) {
            m33732Kf(stickerSets);
            this.f9294N0 = null;
        }
    }

    public final void m33733Jg(final int i, int i2, final int i3) {
        if (!this.f9322w0) {
            this.f9322w0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetTrendingStickerSets(i, i2), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C2746n9.this.m33632tg(i, i3, object);
                }
            });
        }
    }

    @Override
    public boolean mo7426K4() {
        return C4868i.m24727c2().m24619p6();
    }

    public final void m33732Kf(TdApi.StickerSets stickerSets) {
        boolean z;
        if (stickerSets != null && !m9347Sa() && !this.f9322w0) {
            ArrayList<C4817v6> arrayList = this.f9321v0;
            boolean z2 = true;
            if (arrayList != null && arrayList.size() == stickerSets.sets.length && !this.f9321v0.isEmpty()) {
                Iterator<C4817v6> it = this.f9321v0.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    C4817v6 next = it.next();
                    if (next.m25183c() != stickerSets.sets[i].f25427id) {
                        z = false;
                        break;
                    }
                    boolean t = next.m25166t();
                    TdApi.StickerSetInfo[] stickerSetInfoArr = stickerSets.sets;
                    boolean z3 = t != stickerSetInfoArr[i].isViewed;
                    next.m25187I(stickerSetInfoArr[i]);
                    if (z3) {
                        this.f9316q0.m6147H0(next);
                    }
                    i++;
                }
                if (z) {
                    return;
                }
            }
            ArrayList<View$OnClickListenerC10042e.C10044b> arrayList2 = new ArrayList<>((stickerSets.sets.length * 2) + 1);
            ArrayList<C4817v6> arrayList3 = new ArrayList<>(stickerSets.sets.length);
            arrayList2.add(new View$OnClickListenerC10042e.C10044b(3));
            if (m33725Ng(this.f30170b, arrayList3, arrayList2, 0, stickerSets.sets, this, this, false) <= 0) {
                z2 = false;
            }
            m33742Ff(arrayList3, arrayList2, z2, 0);
        }
    }

    public final void m33731Kg(int i, int i2) {
        m33726Nf();
        if (m9139w9() != null) {
            m9139w9().m17835r2(i, i2);
        }
        C4817v6 remove = this.f9302V0.remove(i);
        int k = remove.m25175k();
        int j = remove.m25176j() + 1;
        int k2 = i < i2 ? k : this.f9302V0.get(i2).m25175k();
        this.f9302V0.add(i2, remove);
        for (int min = Math.min(i, i2); min < this.f9302V0.size(); min++) {
            C4817v6 v6Var = this.f9302V0.get(min);
            v6Var.m25191E(k2);
            k2 += v6Var.m25176j() + 1;
        }
        this.f9315p0.m6125r0(k, j, remove.m25175k());
        m33702Vg();
    }

    public final void m33730Lf() {
        int i;
        this.f9314o0.removeView(this.f9307a1);
        if (m9139w9() != null) {
            int i2 = this.f9313n0;
            if (i2 == 1 && ((i = this.f9308b1) == 0 || i == 2)) {
                m9139w9().setPreferredSection(0);
            } else if (this.f9308b1 == 1 && (i2 == 0 || i2 == 2)) {
                m9139w9().setPreferredSection(1);
            }
        }
        if (this.f9313n0 == 2 && this.f9308b1 != 2) {
            m33734Jf();
        }
        this.f9313n0 = this.f9308b1;
        this.f9307a1 = this.f9309c1;
        this.f9309c1 = null;
        this.f9311e1.m29543l(0.0f);
        this.f9312f1 = 0.0f;
        if (m9139w9() != null) {
            m9139w9().m17887B2();
        }
    }

    public boolean m33729Lg() {
        return this.f9313n0 == 1 && m33693Yf() == 0;
    }

    public final void m33728Mf(TdApi.StickerSet stickerSet) {
        ArrayList<C4817v6> arrayList;
        int i;
        int d = this.f9295O0.m23256d(stickerSet.f25426id);
        this.f9295O0.m23257c(stickerSet.f25426id);
        if (d != 0) {
            int length = stickerSet.stickers.length;
            if ((d & 1) != 0) {
                ArrayList<C4817v6> arrayList2 = this.f9321v0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<C4817v6> it = this.f9321v0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4817v6 next = it.next();
                        if (next.m25183c() == stickerSet.f25426id) {
                            next.m25190F(stickerSet);
                            int a = next.m25185a();
                            int k = next.m25175k() + 1 + next.m25185a();
                            while (a < Math.min(stickerSet.stickers.length - next.m25185a(), next.m25185a() + 4)) {
                                View$OnClickListenerC10042e.C10044b g0 = this.f9316q0.m6136g0(k);
                                C2104l lVar = g0.f32686b;
                                if (lVar != null) {
                                    TdApi.Sticker sticker = stickerSet.stickers[a];
                                    lVar.m35566u(this.f30170b, sticker, sticker.type, stickerSet.emojis[a].emojis);
                                }
                                RecyclerView recyclerView = this.f9320u0;
                                View C = recyclerView != null ? recyclerView.getLayoutManager().mo39265C(k) : null;
                                if (C == null || !(C instanceof C2099j) || C.getTag() != g0) {
                                    this.f9316q0.m39315I(k);
                                } else {
                                    ((C2099j) C).m35597r();
                                }
                                a++;
                                k++;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (!((d & 2) == 0 || (arrayList = this.f9302V0) == null || arrayList.isEmpty())) {
                Iterator<C4817v6> it2 = this.f9302V0.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    C4817v6 next2 = it2.next();
                    if (!next2.m25168r() && next2.m25183c() == stickerSet.f25426id) {
                        next2.m25190F(stickerSet);
                        int j = next2.m25176j();
                        if (j != length) {
                            if (length == 0) {
                                if (m9139w9() != null) {
                                    m9139w9().setIgnoreMovement(true);
                                }
                                this.f9302V0.remove(i2);
                                if (this.f9302V0.isEmpty()) {
                                    this.f9315p0.m6156A0(new View$OnClickListenerC10042e.C10044b(4));
                                } else {
                                    if (i2 != 0) {
                                        C4817v6 v6Var = this.f9302V0.get(i2 - 1);
                                        i = v6Var.m25175k() + v6Var.m25176j() + 1;
                                    } else {
                                        i = 1;
                                    }
                                    while (i2 < this.f9302V0.size()) {
                                        C4817v6 v6Var2 = this.f9302V0.get(i2);
                                        v6Var2.m25191E(i);
                                        i += v6Var2.m25176j() + 1;
                                        i2++;
                                    }
                                    this.f9315p0.m6119y0(next2.m25175k(), next2.m25176j() + 1);
                                }
                                if (m9139w9() != null) {
                                    m9139w9().setIgnoreMovement(false);
                                    return;
                                }
                                return;
                            }
                            next2.m25192D(length);
                            int k2 = next2.m25175k() + length + 1;
                            for (int i3 = i2 + 1; i3 < this.f9302V0.size(); i3++) {
                                C4817v6 v6Var3 = this.f9302V0.get(i3);
                                v6Var3.m25191E(k2);
                                k2 += v6Var3.m25176j() + 1;
                            }
                            if (length < j) {
                                this.f9315p0.m6119y0(next2.m25175k() + 1 + length, j - length);
                            } else {
                                ArrayList<View$OnClickListenerC10042e.C10044b> arrayList3 = new ArrayList<>(length - j);
                                for (int i4 = j; i4 < length; i4++) {
                                    TdApi.Sticker sticker2 = stickerSet.stickers[i4];
                                    C2104l lVar2 = new C2104l(this.f30170b, sticker2, sticker2.type, stickerSet.emojis[i4].emojis);
                                    lVar2.m35587B(stickerSet.f25426id, stickerSet.emojis[i4].emojis);
                                    lVar2.m35565v(this);
                                    arrayList3.add(new View$OnClickListenerC10042e.C10044b(0, lVar2));
                                }
                                this.f9315p0.m6131l0(next2.m25175k() + 1 + j, arrayList3);
                            }
                            if (m9139w9() != null) {
                                m9139w9().setIgnoreMovement(false);
                            }
                        }
                        int a2 = next2.m25185a();
                        int k3 = next2.m25175k() + 1 + next2.m25185a();
                        while (a2 < stickerSet.stickers.length) {
                            View$OnClickListenerC10042e.C10044b g02 = this.f9315p0.m6136g0(k3);
                            TdApi.Sticker sticker3 = stickerSet.stickers[a2];
                            g02.f32686b.m35566u(this.f30170b, sticker3, sticker3.type, stickerSet.emojis[a2].emojis);
                            CustomRecyclerView customRecyclerView = this.f9318s0;
                            View C2 = customRecyclerView != null ? customRecyclerView.getLayoutManager().mo39265C(k3) : null;
                            if (C2 == null || !(C2 instanceof C2099j)) {
                                this.f9315p0.m39315I(k3);
                            } else {
                                ((C2099j) C2).m35597r();
                            }
                            a2++;
                            k3++;
                        }
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    public final void m33727Mg(boolean z) {
        if (this.f9289I0 == 0) {
            C3950k kVar = this.f9311e1;
            if ((kVar == null || kVar.m29540o() == 0.0f) && this.f9313n0 == 0 && m9139w9() != null && m9139w9().m17845d2() && m9139w9().getCurrentItem() == 1) {
                m9139w9().m17833u2(m33678dg());
                m9139w9().m17865O2(m33681cg(), true, true);
            }
        }
    }

    public final void m33726Nf() {
        this.f9289I0++;
    }

    public final void m33723Og(TdApi.Object object, final boolean z) {
        final TdApi.Sticker[] stickerArr;
        int Zf = m33690Zf(z);
        final ArrayList arrayList = null;
        if (object.getConstructor() == 1974859260) {
            stickerArr = ((TdApi.Stickers) object).stickers;
            if (stickerArr.length > Zf) {
                TdApi.Sticker[] stickerArr2 = new TdApi.Sticker[Zf];
                System.arraycopy(stickerArr, 0, stickerArr2, 0, Zf);
                stickerArr = stickerArr2;
            }
            ArrayList arrayList2 = new ArrayList(stickerArr.length);
            for (TdApi.Sticker sticker : stickerArr) {
                C2104l lVar = new C2104l(this.f30170b, sticker, (String) null, sticker.type);
                if (z) {
                    lVar.m35563x();
                } else {
                    lVar.m35562y();
                }
                arrayList2.add(new View$OnClickListenerC10042e.C10044b(0, lVar));
            }
            arrayList = arrayList2;
        } else {
            stickerArr = null;
        }
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33747Cg(z, arrayList, stickerArr);
            }
        });
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            this.f9312f1 = f;
            m33644oh();
        }
    }

    public final boolean m33721Pf() {
        C3950k kVar = this.f9311e1;
        return kVar == null || (!kVar.m29533v() && this.f9311e1.m29540o() == 0.0f && this.f9312f1 == 0.0f);
    }

    public final void m33720Pg() {
        if (!this.f9298R0 && !this.f9287G0) {
            this.f9287G0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetFavoriteStickers(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C2746n9.this.m33745Dg(object);
                }
            });
        }
    }

    public final boolean m33718Qf(int i, View view, boolean z, int i2) {
        int i3;
        boolean z2 = false;
        if (this.f9313n0 == i || !m33721Pf()) {
            return false;
        }
        this.f9308b1 = i;
        this.f9309c1 = view;
        this.f9310d1 = z;
        this.f9314o0.addView(view);
        if (this.f9311e1 == null) {
            this.f9311e1 = new C3950k(0, this, C2057b.f7280b, 180L);
        }
        this.f9311e1.m29546i(1.0f);
        if (m9139w9() != null) {
            if (m9139w9().getCurrentItem() == 1) {
                int i4 = this.f9313n0;
                if (i4 == 1 && ((i3 = this.f9308b1) == 0 || i3 == 2)) {
                    m9139w9().m17871L2(false, false);
                } else if ((i4 == 0 || i4 == 2) && this.f9308b1 == 1) {
                    m9139w9().m17871L2(true, true);
                }
            }
            ViewTreeObserver$OnPreDrawListenerC7081z0 w9 = m9139w9();
            int i5 = this.f9308b1;
            if (i5 != 0) {
                i2 = i5 == 2 ? 2 : 1;
            } else if (i2 == -1) {
                i2 = m33681cg();
            }
            if (this.f9308b1 == 0) {
                z2 = true;
            }
            w9.m17865O2(i2, z2, true);
        }
        return true;
    }

    public final void m33717Qg() {
        if (!this.f9298R0 && !this.f9286F0) {
            this.f9286F0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetRecentStickers(false), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C2746n9.this.m33743Eg(object);
                }
            });
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_emojiMedia;
    }

    public final void m33715Rf(long[] jArr) {
        if (this.f9321v0 != null) {
            m33641ph(jArr);
        }
        if (this.f9284D0) {
            if (this.f9285E0 == null) {
                this.f9285E0 = new ArrayList<>();
            }
            this.f9285E0.add(jArr);
        } else if (m33666hg()) {
            m33714Rg();
        } else {
            C6035e eVar = new C6035e(this.f9302V0.size());
            Iterator<C4817v6> it = this.f9302V0.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (!next.m25168r()) {
                    eVar.m21501k(next.m25183c(), next);
                }
            }
            C6035e eVar2 = null;
            C5322e eVar3 = null;
            boolean z = false;
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            for (long j : jArr) {
                if (((C4817v6) eVar.m21506f(j)) != null) {
                    eVar.m21500l(j);
                    if (eVar2 == null) {
                        eVar2 = new C6035e(5);
                    }
                    eVar2.m21501k(j, Integer.valueOf(i));
                    i++;
                } else if (!z) {
                    i3++;
                    if (i2 != i3) {
                        z = true;
                    } else {
                        if (eVar3 == null) {
                            eVar3 = new C5322e(5);
                        }
                        eVar3.m23276a(j);
                    }
                }
                i2++;
            }
            int p = eVar.m21497p();
            for (int i4 = 0; i4 < p; i4++) {
                m33705Ug((C4817v6) eVar.m21496q(i4));
            }
            if (eVar2 != null && !this.f9302V0.isEmpty()) {
                for (int i5 = 0; i5 < eVar2.m21497p(); i5++) {
                    long j2 = eVar2.m21502j(i5);
                    int intValue = ((Integer) eVar2.m21496q(i5)).intValue();
                    int lg = m33654lg(j2);
                    if (lg != -1) {
                        if (lg != intValue) {
                            int eg = m33675eg();
                            m33731Kg(lg + eg, intValue + eg);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (z) {
                m33714Rg();
            } else if (eVar3 != null) {
                m33686ah(true);
                long[] g = eVar3.m23270g();
                int[] iArr = new int[2];
                this.f30170b.m2270r4().m14783o(new TdApi.GetStickerSet(g[iArr[0]]), new C2747a(iArr, eVar3.m23265l(), g));
            }
        }
    }

    public final void m33714Rg() {
        ArrayList<long[]> arrayList = this.f9285E0;
        if (arrayList != null) {
            arrayList.clear();
        }
        m33735Ig();
    }

    public void m33712Sf() {
        int Of = m33724Of(C1357a0.m37546g(), C1357a0.m37547f());
        if (this.f9324y0 != Of) {
            this.f9324y0 = Of;
            CustomRecyclerView customRecyclerView = this.f9318s0;
            if (customRecyclerView != null) {
                ((GridLayoutManager) customRecyclerView.getLayoutManager()).m39589d3(Of);
            }
            RecyclerView recyclerView = this.f9319t0;
            if (recyclerView != null) {
                recyclerView.m39507A0();
            }
        }
    }

    public final void m33711Sg(final TdApi.Animation animation) {
        AbstractC9323v4<?> F = mo4347s().m14551P1().m9762F();
        if (F != null) {
            F.m9261ee(C4403w.m27871i1(R.string.RemoveGifConfirm), new int[]{R.id.btn_deleteGif, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Delete), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Fg;
                    Fg = C2746n9.this.m33741Fg(animation, view, i);
                    return Fg;
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
    }

    public final int m33709Tf() {
        ArrayList<C4817v6> arrayList = this.f9302V0;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i = 0;
        Iterator<C4817v6> it = this.f9302V0.iterator();
        while (it.hasNext()) {
            if (it.next().m25172n()) {
                return i;
            }
            i++;
            if (i > 2) {
                return -1;
            }
        }
        return -1;
    }

    public void m33708Tg() {
        m33671fh(null, null);
    }

    @Override
    public void mo2037U3(final TdApi.StickerSets stickerSets, int i) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33749Bg(stickerSets);
            }
        });
    }

    @Override
    public void mo7556U6(C2099j jVar, C2104l lVar) {
    }

    public final int m33706Uf() {
        ArrayList<C4817v6> arrayList = this.f9302V0;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i = 0;
        Iterator<C4817v6> it = this.f9302V0.iterator();
        while (it.hasNext()) {
            if (it.next().m25169q()) {
                return i;
            }
            i++;
            if (i > 2) {
                return -1;
            }
        }
        return -1;
    }

    public final int m33705Ug(C4817v6 v6Var) {
        int indexOf = this.f9302V0.indexOf(v6Var);
        if (indexOf != -1) {
            m33726Nf();
            this.f9302V0.remove(indexOf);
            if (m9139w9() != null) {
                m9139w9().m17830y2(indexOf);
            }
            int k = v6Var.m25175k();
            this.f9315p0.m6119y0(k, v6Var.m25176j() + 1);
            for (int i = indexOf; i < this.f9302V0.size(); i++) {
                C4817v6 v6Var2 = this.f9302V0.get(i);
                v6Var2.m25191E(k);
                k += v6Var2.m25176j() + 1;
            }
            m33702Vg();
        }
        return indexOf;
    }

    public int m33703Vf() {
        int i = this.f9313n0;
        if (i == 0) {
            return m33678dg();
        }
        if (i == 1) {
            return m33693Yf();
        }
        if (i != 2) {
            return -1;
        }
        return m33672fg();
    }

    public final void m33702Vg() {
        if (m9139w9() != null) {
            m9139w9().m17885C2(true);
        }
        C1379j0.m37335e0(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33739Gg();
            }
        }, 400L);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return m9139w9() != null;
    }

    public float m33700Wf() {
        if (this.f9313n0 == 1) {
            return Math.min(1.0f, Math.max(0.0f, m33693Yf() / ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize()));
        }
        return 0.0f;
    }

    public final void m33699Wg(TdApi.StickerSets stickerSets) {
        if (this.f9313n0 == 2) {
            this.f9294N0 = stickerSets;
            return;
        }
        this.f9294N0 = null;
        m33732Kf(stickerSets);
    }

    @Override
    public void mo33698X6(C2104l lVar, long j) {
        if (!this.f9296P0 || j == this.f9297Q0) {
            C5324g gVar = this.f9295O0;
            int i = 0;
            if (gVar == null) {
                this.f9295O0 = new C5324g();
            } else {
                i = gVar.m23255e(j, 0);
            }
            int i2 = 2;
            if (i == 0) {
                C5324g gVar2 = this.f9295O0;
                if (lVar.m35569r()) {
                    i2 = 1;
                }
                gVar2.m23253g(j, i2);
                this.f30170b.m2270r4().m14783o(new TdApi.GetStickerSet(j), this);
            } else if ((i & 1) == 0 && lVar.m35569r()) {
                this.f9295O0.m23253g(j, i | 1);
            } else if ((i & 2) == 0 && !lVar.m35569r()) {
                this.f9295O0.m23253g(j, i | 2);
            }
        }
    }

    public final void m33695Xg(int i, boolean z) {
        int kg = m33657kg(i);
        if (kg != -1) {
            this.f9318s0.m39499D1();
            int cg = m33681cg();
            int i2 = 0;
            if (!z || Build.VERSION.SDK_INT < 21 || m9139w9() == null || Math.abs(kg - cg) > 8) {
                if (m9139w9() != null) {
                    m9139w9().setIgnoreMovement(true);
                }
                ((LinearLayoutManager) this.f9318s0.getLayoutManager()).m39525z2(i, i == 0 ? 0 : ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() + ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding());
                if (m9139w9() != null) {
                    m9139w9().setIgnoreMovement(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                i2 = Math.max(0, (this.f9315p0.m6126q0(i, this.f9324y0, kg, this.f9302V0) - ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize()) - ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderPadding());
            }
            int dg = i2 - m33678dg();
            int[] iArr = new int[1];
            C3950k kVar = this.f9299S0;
            if (kVar != null) {
                kVar.m29544k();
            }
            this.f9318s0.setScrollDisabled(true);
            m33677dh(true, this.f9302V0.get(kg).m25183c());
            if (m9139w9() != null) {
                m9139w9().setIgnoreMovement(true);
                m9139w9().m17865O2(kg, true, true);
            }
            C3950k kVar2 = new C3950k(0, new C2748b(dg, iArr), C2057b.f7280b, Math.min(450, Math.max(250, Math.abs(cg - kg) * 150)));
            this.f9299S0 = kVar2;
            kVar2.m29546i(1.0f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 1.0f) {
            m33730Lf();
        }
    }

    public final int m33693Yf() {
        RecyclerView recyclerView = this.f9319t0;
        if (recyclerView == null) {
            return 0;
        }
        NewFlowLayoutManager newFlowLayoutManager = (NewFlowLayoutManager) recyclerView.getLayoutManager();
        if (newFlowLayoutManager.m39552X1() != 0) {
            return ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize();
        }
        View C = newFlowLayoutManager.mo39265C(0);
        if (C != null) {
            return -newFlowLayoutManager.m39234U(C);
        }
        return 0;
    }

    public final void m33692Yg(boolean z) {
        int Tf = m33709Tf();
        if (Tf == -1) {
            Tf = m33706Uf();
        }
        if (Tf != -1) {
            m33695Xg(Tf == 0 ? 0 : this.f9302V0.get(Tf).m25175k(), z);
        }
    }

    @Override
    public void mo2036Z(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2048d(this, stickerSetInfo);
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1826o0(this);
    }

    public final void m33689Zg(View view, TdApi.Animation animation) {
        if (m9139w9() != null) {
            m9139w9().m17877H2(view, animation);
        }
    }

    public final int m33687ag() {
        int Tf = m33709Tf();
        if (Tf != -1) {
            return this.f9302V0.get(Tf).m25184b();
        }
        return 1;
    }

    public final void m33686ah(boolean z) {
        ArrayList<long[]> arrayList;
        if (this.f9284D0 != z) {
            this.f9284D0 = z;
            if (!z && (arrayList = this.f9285E0) != null && !arrayList.isEmpty()) {
                do {
                    m33715Rf(this.f9285E0.remove(0));
                    if (this.f9285E0.isEmpty()) {
                        return;
                    }
                } while (!this.f9284D0);
            }
        }
    }

    public final int m33684bg() {
        return this.f9288H0 ? 2 : 1;
    }

    public final void m33683bh(TdApi.Sticker[] stickerArr, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList) {
        C4817v6 v6Var;
        if (m9139w9() != null) {
            m9139w9().setShowFavorite(stickerArr != null && stickerArr.length > 0);
        }
        m33668gh(stickerArr != null && stickerArr.length > 0);
        int Tf = m33709Tf();
        if (Tf != -1) {
            v6Var = this.f9302V0.remove(Tf);
            m33662ih(Tf, v6Var.m25175k());
            this.f9315p0.m6119y0(v6Var.m25175k(), v6Var.m25181e());
        } else if (stickerArr == null || stickerArr.length <= 0) {
            v6Var = null;
        } else {
            v6Var = new C4817v6(this.f30170b, stickerArr);
            v6Var.m25162x();
        }
        if (v6Var != null && stickerArr != null && stickerArr.length > 0 && arrayList != null) {
            v6Var.m25192D(stickerArr.length);
            v6Var.m25191E(1);
            this.f9302V0.add(0, v6Var);
            m33662ih(1, v6Var.m25184b());
            this.f9315p0.m6131l0(1, arrayList);
        }
    }

    public final int m33681cg() {
        CustomRecyclerView customRecyclerView = this.f9318s0;
        if (customRecyclerView == null || this.f9324y0 == 0) {
            return -1;
        }
        int T1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).m39556T1();
        if (T1 == -1) {
            T1 = ((LinearLayoutManager) this.f9318s0.getLayoutManager()).m39552X1();
        }
        if (T1 != -1) {
            return m33657kg(T1);
        }
        return 0;
    }

    public final void m33680ch(ArrayList<C4623e3> arrayList) {
        this.f9305Y0 = false;
        this.f9306Z0 = arrayList;
        this.f9317r0.m6160j0(arrayList);
        if (arrayList.isEmpty() && this.f9313n0 == 1) {
            m33650mh();
        }
        this.f30170b.m2781K9().m1886Z(this);
    }

    @Override
    public void mo2035d5(TdApi.StickerSet stickerSet) {
        C10965r1.m2045g(this, stickerSet);
    }

    public final int m33678dg() {
        int X1;
        CustomRecyclerView customRecyclerView = this.f9318s0;
        int i = 0;
        if (customRecyclerView == null || this.f9324y0 == 0 || (X1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).m39552X1()) == -1) {
            return 0;
        }
        View C = this.f9318s0.getLayoutManager().mo39265C(X1);
        if (C != null) {
            i = -C.getTop();
        }
        return i + this.f9315p0.m6126q0(X1, this.f9324y0, m33657kg(X1), this.f9302V0);
    }

    public final void m33677dh(boolean z, long j) {
        CustomRecyclerView customRecyclerView;
        C2104l lVar;
        if (this.f9296P0 != z) {
            this.f9296P0 = z;
            this.f9297Q0 = j;
            if (!(z || (customRecyclerView = this.f9318s0) == null)) {
                int X1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).m39552X1();
                for (int a2 = ((LinearLayoutManager) this.f9318s0.getLayoutManager()).m39549a2(); a2 >= X1; a2--) {
                    View$OnClickListenerC10042e.C10044b g0 = this.f9315p0.m6136g0(a2);
                    if (!(g0 == null || g0.f32685a != 0 || (lVar = g0.f32686b) == null)) {
                        lVar.m35567t();
                    }
                }
            }
        }
    }

    @Override
    public boolean mo7547e1(C2099j jVar, int i, int i2) {
        return i2 > m9131x9().getHeaderBottom();
    }

    public final int m33675eg() {
        Iterator<C4817v6> it = this.f9302V0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m25168r()) {
                i++;
            }
        }
        return i;
    }

    public final void m33674eh(C4817v6 v6Var, int i) {
        this.f9325z0 = v6Var;
        this.f9281A0 = i;
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    @Override
    public void mo2034f6(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2046f(this, stickerSetInfo);
    }

    public int m33672fg() {
        int X1;
        RecyclerView recyclerView = this.f9320u0;
        int i = 0;
        if (recyclerView == null || (X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39552X1()) == -1) {
            return 0;
        }
        View C = this.f9320u0.getLayoutManager().mo39265C(X1);
        if (C != null) {
            i = -C.getTop();
        }
        return i + this.f9316q0.m6126q0(X1, 5, m33648ng(X1), this.f9321v0);
    }

    public final void m33671fh(TdApi.Sticker[] stickerArr, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList) {
        C4817v6 v6Var;
        int i = 0;
        if (m9139w9() != null) {
            m9139w9().setShowRecents(stickerArr != null && stickerArr.length > 0);
        }
        int Uf = m33706Uf();
        if (Uf != -1) {
            v6Var = this.f9302V0.remove(Uf);
            m33662ih(Uf, v6Var.m25175k());
            this.f9315p0.m6119y0(v6Var.m25175k(), v6Var.m25181e());
        } else if (stickerArr == null || stickerArr.length <= 0) {
            v6Var = null;
        } else {
            v6Var = new C4817v6(this.f30170b, stickerArr);
            v6Var.m25194B();
        }
        if (v6Var != null && stickerArr != null && stickerArr.length > 0 && arrayList != null) {
            arrayList.add(0, new View$OnClickListenerC10042e.C10044b(m33684bg(), v6Var));
            int ag = m33687ag();
            v6Var.m25192D(stickerArr.length);
            v6Var.m25191E(ag);
            if (m33709Tf() != -1) {
                i = 1;
            }
            this.f9302V0.add(i, v6Var);
            m33662ih(i + 1, v6Var.m25184b());
            this.f9315p0.m6131l0(ag, arrayList);
        }
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    @Override
    public long getStickerOutputChatId() {
        if (m9139w9() != null) {
            return m9139w9().m17857U1();
        }
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return C1399s0.m37157u(this.f9313n0 == 2 ? this.f9320u0 : this.f9318s0)[1];
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    public final void m33668gh(boolean z) {
        this.f9288H0 = z;
        int Uf = m33706Uf();
        if (Uf != -1) {
            int k = this.f9302V0.get(Uf).m25175k();
            if (this.f9315p0.m6136g0(k).m6116a(m33684bg())) {
                this.f9315p0.m39315I(k);
            }
        }
    }

    public final boolean m33666hg() {
        Iterator<C4817v6> it = this.f9302V0.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (!next.m25172n() && !next.m25169q()) {
                return false;
            }
        }
        return true;
    }

    public final void m33665hh(ArrayList<C4817v6> arrayList, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList2) {
        this.f9302V0 = arrayList;
        this.f9298R0 = false;
        this.f9325z0 = null;
        C5324g gVar = this.f9295O0;
        if (gVar != null) {
            gVar.m23259a();
        }
        this.f9315p0.m6155B0(arrayList2);
        this.f30170b.m2781K9().m1838l0(this);
    }

    public final int m33663ig(C2104l lVar) {
        ArrayList<C4817v6> arrayList = this.f9302V0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<C4817v6> it = arrayList.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            boolean n = next.m25172n();
            boolean q = next.m25169q();
            boolean o = lVar.m35572o();
            boolean q2 = lVar.m35570q();
            if ((n && o) || ((q && q2) || (n == o && q == q2 && next.m25183c() == lVar.m35576k()))) {
                return this.f9315p0.m6132k0(lVar, next.m25175k());
            }
        }
        return -1;
    }

    public final void m33662ih(int i, int i2) {
        while (i < this.f9302V0.size()) {
            C4817v6 v6Var = this.f9302V0.get(i);
            v6Var.m25191E(i2);
            i2 = v6Var.m25184b();
            i++;
        }
    }

    @Override
    public void mo2033j3(final int[] iArr) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2746n9.this.m33630ug(iArr);
            }
        });
    }

    public final int m33660jg(C4817v6 v6Var) {
        ArrayList<C4817v6> arrayList = this.f9302V0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<C4817v6> it = arrayList.iterator();
        while (it.hasNext()) {
            if (v6Var.m25183c() == it.next().m25183c()) {
                return v6Var.m25175k();
            }
        }
        return -1;
    }

    public boolean m33659jh() {
        ArrayList<C4623e3> arrayList;
        if (!m33721Pf() || (arrayList = this.f9306Z0) == null || arrayList.isEmpty()) {
            return false;
        }
        m33642pg();
        return m33718Qf(1, this.f9319t0, true, -1);
    }

    @Override
    public void mo2032k(final long[] jArr, boolean z) {
        if (!z) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C2746n9.this.m33628vg(jArr);
                }
            });
        }
    }

    @Override
    public boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        if (lVar.m35569r() && !z) {
            int og = m33645og(lVar.m35576k());
            if (og == -1) {
                return false;
            }
            this.f9321v0.get(og).m25188H(this);
            return true;
        } else if (m9139w9() == null || !m9139w9().m17874J2(view, lVar, z2, messageSchedulingState)) {
            return false;
        } else {
            if (lVar.m35570q()) {
                this.f9291K0 = true;
            }
            return true;
        }
    }

    public final int m33657kg(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        if (this.f9302V0 == null) {
            return -1;
        }
        C4817v6 v6Var = this.f9325z0;
        if (v6Var != null) {
            if (i >= v6Var.m25175k() && i < this.f9325z0.m25184b()) {
                return this.f9281A0;
            }
            if (i >= this.f9325z0.m25184b()) {
                int i3 = this.f9281A0;
                while (true) {
                    i3++;
                    if (i3 >= this.f9302V0.size()) {
                        break;
                    }
                    C4817v6 v6Var2 = this.f9302V0.get(i3);
                    if (i >= v6Var2.m25175k() && i < v6Var2.m25184b()) {
                        m33674eh(v6Var2, i3);
                        return this.f9281A0;
                    }
                }
            } else if (i < this.f9325z0.m25175k()) {
                for (int i4 = this.f9281A0 - 1; i4 >= 0; i4--) {
                    C4817v6 v6Var3 = this.f9302V0.get(i4);
                    if (i >= v6Var3.m25175k() && i < v6Var3.m25184b()) {
                        m33674eh(v6Var3, i4);
                        return this.f9281A0;
                    }
                }
            }
        }
        Iterator<C4817v6> it = this.f9302V0.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (i < next.m25175k() || i >= next.m25184b()) {
                i2++;
            } else {
                m33674eh(next, i2);
                return this.f9281A0;
            }
        }
        return -1;
    }

    public void m33656kh() {
        if (m33721Pf()) {
            m33639qg();
            boolean z = false;
            if (this.f9313n0 != 2 || !m33721Pf()) {
                RecyclerView recyclerView = this.f9320u0;
                if (this.f9313n0 != 1) {
                    z = true;
                }
                m33718Qf(2, recyclerView, z, -1);
                return;
            }
            this.f9320u0.mo8024v1(0, -m33672fg());
        }
    }

    public final int m33654lg(long j) {
        Iterator<C4817v6> it = this.f9302V0.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (!next.m25168r()) {
                if (next.m25183c() == j) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public boolean m33653lh(C4817v6 v6Var) {
        int jg;
        C3950k kVar;
        if (!m33721Pf() || (jg = m33660jg(v6Var)) == -1) {
            return false;
        }
        m33636rg();
        m33695Xg(jg, this.f9313n0 == 0 && ((kVar = this.f9311e1) == null || !kVar.m29533v()));
        return m33718Qf(0, this.f9318s0, false, m33657kg(jg));
    }

    public final int m33651mg(C2104l lVar) {
        ArrayList<C4817v6> arrayList = this.f9321v0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<C4817v6> it = arrayList.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (next.m25183c() == lVar.m35576k()) {
                return this.f9316q0.m6132k0(lVar, next.m25175k());
            }
        }
        return -1;
    }

    public void m33650mh() {
        if (m33721Pf()) {
            m33636rg();
            m33718Qf(0, this.f9318s0, false, -1);
        }
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return true;
    }

    public final int m33648ng(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        C4817v6 v6Var = this.f9282B0;
        if (v6Var != null) {
            if (i >= v6Var.m25175k() && i < this.f9282B0.m25184b()) {
                return this.f9283C0;
            }
            if (i >= this.f9282B0.m25184b()) {
                int i3 = this.f9283C0;
                while (true) {
                    i3++;
                    if (i3 >= this.f9321v0.size()) {
                        break;
                    }
                    C4817v6 v6Var2 = this.f9321v0.get(i3);
                    if (i >= v6Var2.m25175k() && i < v6Var2.m25184b()) {
                        this.f9282B0 = v6Var2;
                        this.f9283C0 = i3;
                        return i3;
                    }
                }
            } else if (i < this.f9282B0.m25175k()) {
                for (int min = Math.min(this.f9321v0.size() - 1, this.f9283C0 - 1); min >= 0; min--) {
                    C4817v6 v6Var3 = this.f9321v0.get(min);
                    if (i >= v6Var3.m25175k() && i < v6Var3.m25184b()) {
                        this.f9282B0 = v6Var3;
                        this.f9283C0 = min;
                        return min;
                    }
                }
            }
        }
        Iterator<C4817v6> it = this.f9321v0.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (i < next.m25175k() || i >= next.m25184b()) {
                i2++;
            } else {
                this.f9282B0 = next;
                this.f9283C0 = i2;
                return i2;
            }
        }
        return -1;
    }

    public void m33647nh() {
        C3950k kVar;
        if (m33721Pf()) {
            m33636rg();
            m33692Yg(this.f9313n0 == 0 && ((kVar = this.f9311e1) == null || !kVar.m29533v()));
            m33718Qf(0, this.f9318s0, false, 0);
        }
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public View mo403oc(Context context) {
        C2750d dVar = new C2750d(context);
        this.f9314o0 = dVar;
        dVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f9315p0 = new View$OnClickListenerC10042e(this, this, false, this);
        View$OnClickListenerC10042e eVar = new View$OnClickListenerC10042e(this, this, true, this);
        this.f9316q0 = eVar;
        eVar.m6156A0(new View$OnClickListenerC10042e.C10044b(5));
        View$OnClickListenerC10037b bVar = new View$OnClickListenerC10037b(context, this);
        this.f9317r0 = bVar;
        bVar.m6161i0(this);
        m33712Sf();
        int L0 = C4868i.m24727c2().m24850L0();
        if (L0 == 0) {
            m33636rg();
            this.f9313n0 = 0;
            CustomRecyclerView customRecyclerView = this.f9318s0;
            this.f9307a1 = customRecyclerView;
            this.f9314o0.addView(customRecyclerView);
        } else if (L0 == 1) {
            m33642pg();
            if (m9139w9() != null) {
                m9139w9().m17865O2(1, false, false);
                m9139w9().setMediaSection(true);
            }
            this.f9313n0 = 1;
            RecyclerView recyclerView = this.f9319t0;
            this.f9307a1 = recyclerView;
            this.f9314o0.addView(recyclerView);
        }
        m33737Hg();
        m33735Ig();
        m33733Jg(0, 20, 0);
        return this.f9314o0;
    }

    public final int m33645og(long j) {
        Iterator<C4817v6> it = this.f9321v0.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m25183c() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void m33644oh() {
        if (this.f9310d1 != C4403w.m27986G2()) {
            View view = this.f9307a1;
            view.setTranslationX(view.getMeasuredWidth() * this.f9312f1);
            View view2 = this.f9309c1;
            if (view2 != null) {
                view2.setTranslationX((-view2.getMeasuredWidth()) * (1.0f - this.f9312f1));
                return;
            }
            return;
        }
        View view3 = this.f9307a1;
        view3.setTranslationX((-view3.getMeasuredWidth()) * this.f9312f1);
        View view4 = this.f9309c1;
        if (view4 != null) {
            view4.setTranslationX(view4.getMeasuredWidth() * (1.0f - this.f9312f1));
        }
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        this.f9319t0.requestDisallowInterceptTouchEvent(false);
        mo4347s().m14439t0();
    }

    public final void m33642pg() {
        if (this.f9319t0 == null) {
            C2753g gVar = new C2753g(mo4347s(), 100);
            gVar.m39588e3(new C2754h(gVar));
            RecyclerView recyclerView = new RecyclerView(mo4347s());
            this.f9319t0 = recyclerView;
            recyclerView.setItemAnimator(null);
            this.f9319t0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            int i = 1;
            this.f9319t0.setHasFixedSize(true);
            RecyclerView recyclerView2 = this.f9319t0;
            if (!C4183a.f14083a) {
                i = 2;
            }
            recyclerView2.setOverScrollMode(i);
            this.f9319t0.setAdapter(this.f9317r0);
            this.f9319t0.m39425k(new C2755i());
            this.f9319t0.m39437g(new C2756j(gVar));
            this.f9319t0.setLayoutManager(gVar);
        }
    }

    public final void m33641ph(long[] jArr) {
        C6035e eVar = new C6035e(jArr.length);
        for (long j : jArr) {
            eVar.m21501k(j, null);
        }
        Iterator<C4817v6> it = this.f9321v0.iterator();
        while (it.hasNext()) {
            C4817v6 next = it.next();
            if (eVar.m21504h(next.m25183c()) >= 0) {
                next.m25161y();
                this.f9316q0.m6149F0(next);
            } else {
                next.m25195A();
                this.f9316q0.m6149F0(next);
            }
        }
    }

    public final void m33639qg() {
        if (this.f9320u0 == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(mo4347s(), 5);
            gridLayoutManager.m39588e3(new C2757k());
            this.f9316q0.m6154C0(gridLayoutManager);
            RecyclerView recyclerView = (RecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler, this.f9314o0);
            this.f9320u0 = recyclerView;
            int i = 1;
            recyclerView.setHasFixedSize(true);
            this.f9320u0.setAdapter(this.f9316q0);
            RecyclerView recyclerView2 = this.f9320u0;
            if (!C4183a.f14083a) {
                i = 2;
            }
            recyclerView2.setOverScrollMode(i);
            this.f9320u0.setLayoutManager(gridLayoutManager);
            this.f9320u0.m39425k(new C2758l());
        }
    }

    public final void m33638qh(long j) {
        C6035e<Boolean> eVar = this.f9300T0;
        if (eVar == null) {
            this.f9300T0 = new C6035e<>();
        } else if (eVar.m21504h(j) >= 0) {
            return;
        }
        this.f9300T0.m21501k(j, Boolean.TRUE);
        AbstractRunnableC5910b bVar = this.f9301U0;
        if (bVar != null) {
            bVar.m21858c();
        }
        C2749c cVar = new C2749c();
        this.f9301U0 = cVar;
        C1379j0.m37335e0(cVar, 750L);
    }

    public final void m33636rg() {
        if (this.f9318s0 == null) {
            int i = 1;
            RtlGridLayoutManager g3 = new RtlGridLayoutManager(mo4347s(), this.f9324y0).m14123g3(true);
            g3.m39588e3(new C2751e());
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler_custom, this.f9314o0);
            this.f9318s0 = customRecyclerView;
            customRecyclerView.setHasFixedSize(true);
            this.f9318s0.setLayoutManager(g3);
            this.f9318s0.setAdapter(this.f9315p0);
            this.f9318s0.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            CustomRecyclerView customRecyclerView2 = this.f9318s0;
            if (!C4183a.f14083a) {
                i = 2;
            }
            customRecyclerView2.setOverScrollMode(i);
            this.f9318s0.m39425k(new C2752f());
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int i;
        boolean z = true;
        switch (object.getConstructor()) {
            case TdApi.StickerSets.CONSTRUCTOR:
                TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
                final TdApi.Sticker[] stickerArr = this.f9303W0;
                final TdApi.Sticker[] stickerArr2 = this.f9304X0;
                final ArrayList arrayList = new ArrayList(stickerSetInfoArr.length);
                final ArrayList arrayList2 = new ArrayList();
                this.f9303W0 = null;
                this.f9304X0 = null;
                if (stickerSetInfoArr.length == 0 && stickerArr2.length == 0 && stickerArr.length == 0) {
                    arrayList2.add(new View$OnClickListenerC10042e.C10044b(4));
                } else {
                    arrayList2.add(new View$OnClickListenerC10042e.C10044b(3));
                    if (stickerArr.length > 0) {
                        C4817v6 v6Var = new C4817v6(this.f30170b, stickerArr);
                        v6Var.m25162x();
                        v6Var.m25191E(1);
                        arrayList.add(v6Var);
                        for (TdApi.Sticker sticker : stickerArr) {
                            C2104l lVar = new C2104l(this.f30170b, sticker, (String) null, sticker.type);
                            lVar.m35563x();
                            arrayList2.add(new View$OnClickListenerC10042e.C10044b(0, lVar));
                        }
                        i = stickerArr.length + 1;
                    } else {
                        i = 1;
                    }
                    if (stickerArr2.length > 0) {
                        C4817v6 v6Var2 = new C4817v6(this.f30170b, stickerArr2);
                        v6Var2.m25194B();
                        v6Var2.m25191E(i);
                        arrayList.add(v6Var2);
                        arrayList2.add(new View$OnClickListenerC10042e.C10044b(stickerArr.length > 0 ? 2 : 1, v6Var2));
                        for (TdApi.Sticker sticker2 : stickerArr2) {
                            C2104l lVar2 = new C2104l(this.f30170b, sticker2, (String) null, sticker2.type);
                            lVar2.m35562y();
                            arrayList2.add(new View$OnClickListenerC10042e.C10044b(0, lVar2));
                        }
                        i += stickerArr2.length + 1;
                    }
                    for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                        C4817v6 v6Var3 = new C4817v6(this.f30170b, stickerSetInfo);
                        if (v6Var3.m25176j() != 0) {
                            arrayList.add(v6Var3);
                            v6Var3.m25191E(i);
                            arrayList2.add(new View$OnClickListenerC10042e.C10044b(2, v6Var3));
                            int i2 = 0;
                            while (true) {
                                int i3 = stickerSetInfo.size;
                                if (i2 < i3) {
                                    C10930q6 q6Var = this.f30170b;
                                    TdApi.Sticker[] stickerArr3 = stickerSetInfo.covers;
                                    C2104l lVar3 = new C2104l(q6Var, i2 < stickerArr3.length ? stickerArr3[i2] : null, (String) null, stickerSetInfo.stickerType);
                                    lVar3.m35587B(stickerSetInfo.f25427id, null);
                                    lVar3.m35565v(this);
                                    arrayList2.add(new View$OnClickListenerC10042e.C10044b(0, lVar3));
                                    i2++;
                                } else {
                                    i += i3 + 1;
                                }
                            }
                        }
                    }
                }
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C2746n9.this.m33624xg(arrayList, stickerArr, stickerArr2, arrayList2);
                    }
                });
                return;
            case TdApi.StickerSet.CONSTRUCTOR:
                final TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C2746n9.this.m33622yg(stickerSet);
                    }
                });
                return;
            case TdApi.Error.CONSTRUCTOR:
                C1379j0.m37305t0(object);
                return;
            case TdApi.Animations.CONSTRUCTOR:
                TdApi.Animation[] animationArr = ((TdApi.Animations) object).animations;
                final ArrayList arrayList3 = new ArrayList(animationArr.length);
                for (TdApi.Animation animation : animationArr) {
                    arrayList3.add(new C4623e3(this.f30170b, animation));
                }
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        C2746n9.this.m33620zg(arrayList3);
                    }
                });
                return;
            case TdApi.Stickers.CONSTRUCTOR:
                TdApi.Sticker[] stickerArr4 = ((TdApi.Stickers) object).stickers;
                if (this.f9303W0 != null) {
                    z = false;
                }
                int Zf = m33690Zf(z);
                if (stickerArr4.length > Zf) {
                    TdApi.Sticker[] stickerArr5 = new TdApi.Sticker[Zf];
                    System.arraycopy(stickerArr4, 0, stickerArr5, 0, Zf);
                    stickerArr4 = stickerArr5;
                }
                if (z) {
                    this.f9303W0 = stickerArr4;
                    this.f30170b.m2270r4().m14783o(new TdApi.GetRecentStickers(false), this);
                    return;
                }
                this.f9304X0 = stickerArr4;
                this.f30170b.m2270r4().m14783o(new TdApi.GetInstalledStickerSets(false), this);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo7534v0(C2099j jVar) {
        return false;
    }

    @Override
    public void mo2031y0(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2047e(this, stickerSetInfo);
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        TdApi.Animation a = ((C10036a) view).getGif().m26842a();
        if (m9139w9() == null) {
            m33711Sg(a);
            return true;
        }
        RunnableC7470o oVar = new RunnableC7470o(mo4347s());
        if (C4779t2.m25599T2(a.animation)) {
            oVar.m15958F0();
        }
        C6957m1.C6963f fVar = new C6957m1.C6963f(this.f30170b, view, oVar, null);
        oVar.setBoundForceTouchContext(fVar);
        C8112b U0 = C8112b.m13528U0(mo4347s(), this.f30170b, a, null);
        U0.m13486q(true);
        oVar.setMedia(U0);
        C5320c cVar = new C5320c(2);
        C5320c cVar2 = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        cVar.m23285a(R.id.btn_deleteGif);
        cVar2.m23285a(R.drawable.baseline_delete_24);
        u0Var.m23817a(R.string.Delete);
        cVar.m23285a(R.id.btn_send);
        cVar2.m23285a(R.drawable.deproko_baseline_send_24);
        u0Var.m23817a(R.string.Send);
        fVar.m18337I(this, a, cVar.m23281e(), cVar2.m23281e(), u0Var.m23814d());
        if (mo4347s().m14500d2(fVar)) {
            this.f9319t0.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        oVar.mo4501a3();
        return false;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        mo4347s().m14460n2(f, f2, f3, f4);
    }
}
