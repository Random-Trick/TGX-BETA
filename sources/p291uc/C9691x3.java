package p291uc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import cd.C2099j;
import cd.C2104l;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9691x3 extends RecyclerView.AbstractC0890h<C9693b> implements C2099j.AbstractC2102c {
    public final RecyclerView.AbstractC0902p f31485M;
    public final AbstractC9323v4<?> f31486N;
    public final AbstractC9692a f31487O;
    public ArrayList<C2104l> f31488P;
    public AbstractC9323v4<?> f31489Q;

    public interface AbstractC9692a {
        int mo7583d2();

        long mo7582l3();

        boolean mo7581o5(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState);

        int mo7580v3();
    }

    public static class C9693b extends RecyclerView.AbstractC0886d0 {
        public C9693b(View view) {
            super(view);
        }

        public static C9693b m7579O(Context context, C10930q6 q6Var, int i, C2099j.AbstractC2102c cVar, AbstractC9323v4<?> v4Var) {
            if (i == 0) {
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
                frameLayoutFix.setLayoutParams(new RecyclerView.LayoutParams(C1357a0.m37541i(34.0f), -1));
                Drawable C = C11524j.m250C(R.drawable.stickers_back_left, R.id.theme_color_overlayFilling, v4Var);
                View view = new View(context);
                C2065g.m35718d(view, C);
                if (v4Var != null) {
                    v4Var.m9163t8(view);
                }
                view.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(12.0f), -1, 5));
                frameLayoutFix.addView(view);
                return new C9693b(frameLayoutFix);
            } else if (i == 1) {
                FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
                frameLayoutFix2.setLayoutParams(new RecyclerView.LayoutParams(C1357a0.m37541i(34.0f), -1));
                Drawable C2 = C11524j.m250C(R.drawable.stickers_back_right, R.id.theme_color_overlayFilling, v4Var);
                View view2 = new View(context);
                C2065g.m35718d(view2, C2);
                if (v4Var != null) {
                    v4Var.m9163t8(view2);
                }
                view2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(12.0f), -1, 3));
                frameLayoutFix2.addView(view2);
                return new C9693b(frameLayoutFix2);
            } else if (i == 2) {
                C2099j jVar = new C2099j(context);
                jVar.m35602j(q6Var);
                jVar.setStickerMovementCallback(cVar);
                C2065g.m35718d(jVar, C11524j.m250C(R.drawable.stickers_back_center, R.id.theme_color_overlayFilling, v4Var));
                if (v4Var != null) {
                    v4Var.m9163t8(jVar);
                }
                jVar.m35590v();
                jVar.setPadding(0, C1357a0.m37541i(2.5f), 0, C1357a0.m37541i(6.5f));
                jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new C9693b(jVar);
            } else {
                throw new RuntimeException("viewType == " + i);
            }
        }
    }

    public C9691x3(AbstractC9323v4<?> v4Var, AbstractC9692a aVar, RecyclerView.AbstractC0902p pVar, AbstractC9323v4<?> v4Var2) {
        this.f31486N = v4Var;
        this.f31487O = aVar;
        this.f31485M = pVar;
        this.f31489Q = v4Var2;
    }

    @Override
    public void mo7577A4(C2099j jVar, C2104l lVar) {
    }

    @Override
    public void mo7576B1(C2099j jVar, C2104l lVar, boolean z) {
        int d0 = m7589d0(lVar);
        if (d0 != -1) {
            RecyclerView.AbstractC0902p pVar = this.f31485M;
            View C = pVar != null ? pVar.mo39262C(d0 + 1) : null;
            if (C == null || !(C instanceof C2099j)) {
                m39312I(d0 + 1);
            } else {
                ((C2099j) C).setStickerPressed(z);
            }
        }
    }

    @Override
    public int mo6153D() {
        ArrayList<C2104l> arrayList = this.f31488P;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        return this.f31488P.size() + 2;
    }

    @Override
    public int mo6150F(int i) {
        ArrayList<C2104l> arrayList;
        int i2 = i - 1;
        if (i == 0 || (arrayList = this.f31488P) == null) {
            return 0;
        }
        return i2 < arrayList.size() ? 2 : 1;
    }

    @Override
    public void mo7568H1(C2099j jVar, C2104l lVar) {
    }

    @Override
    public void mo7556U6(C2099j jVar, C2104l lVar) {
    }

    public void m7591a0(ArrayList<C2104l> arrayList) {
        ArrayList<C2104l> arrayList2 = this.f31488P;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            throw new IllegalStateException();
        }
        int size = this.f31488P.size();
        this.f31488P.addAll(arrayList);
        m39308M(size + 1, arrayList.size());
    }

    public boolean m7590c0() {
        ArrayList<C2104l> arrayList = this.f31488P;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final int m7589d0(C2104l lVar) {
        ArrayList<C2104l> arrayList = this.f31488P;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i = 0;
        Iterator<C2104l> it = this.f31488P.iterator();
        while (it.hasNext()) {
            if (it.next().equals(lVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void mo6146Q(C9693b bVar, int i) {
        if (bVar.m39332n() == 2) {
            C2099j jVar = (C2099j) bVar.f3479a;
            ArrayList<C2104l> arrayList = this.f31488P;
            jVar.setSticker(arrayList != null ? arrayList.get(i - 1) : null);
        }
    }

    @Override
    public boolean mo7547e1(C2099j jVar, int i, int i2) {
        return true;
    }

    public C9693b mo6145S(ViewGroup viewGroup, int i) {
        return C9693b.m7579O(this.f31486N.mo4347s(), this.f31486N.mo4348c(), i, this, this.f31489Q);
    }

    public void mo6144V(C9693b bVar) {
        if (bVar.m39332n() == 2) {
            ((C2099j) bVar.f3479a).m35608d();
        }
    }

    @Override
    public long getStickerOutputChatId() {
        return this.f31487O.mo7582l3();
    }

    @Override
    public int getStickersListTop() {
        return this.f31487O.mo7580v3();
    }

    @Override
    public int getViewportHeight() {
        return this.f31487O.mo7583d2();
    }

    public void mo6143W(C9693b bVar) {
        if (bVar.m39332n() == 2) {
            ((C2099j) bVar.f3479a).m35603i();
        }
    }

    public void m7584i0(ArrayList<C2104l> arrayList) {
        int D = mo6153D();
        this.f31488P = arrayList;
        int D2 = mo6153D();
        if (D2 == 0 || D == 0) {
            C7389v0.m16615k2(this, D);
            return;
        }
        int i = D - 2;
        int i2 = D2 - 2;
        if (i == i2) {
            m39309L(1, i2);
        } else if (i < D2) {
            m39309L(1, i);
            m39308M(D - 1, i2 - i);
        } else {
            m39309L(1, i2);
            m39307N(D2 - 1, i - i2);
        }
    }

    @Override
    public boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        return this.f31487O.mo7581o5(view, lVar, z2, messageSchedulingState);
    }

    @Override
    public boolean mo7534v0(C2099j jVar) {
        return true;
    }
}
