package vc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import db.g;
import dd.j;
import dd.l;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class w3 extends RecyclerView.h<b> implements j.c {
    public final RecyclerView.p M;
    public final v4<?> N;
    public final a O;
    public ArrayList<l> P;
    public v4<?> Q;

    public interface a {
        long b3();

        int c2();

        int m3();

        boolean o0(View view, l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState);
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }

        public static b O(Context context, o6 o6Var, int i10, j.c cVar, v4<?> v4Var) {
            if (i10 == 0) {
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
                frameLayoutFix.setLayoutParams(new RecyclerView.LayoutParams(a0.i(34.0f), -1));
                Drawable A = ae.j.A(R.drawable.stickers_back_left, R.id.theme_color_overlayFilling, v4Var);
                View view = new View(context);
                g.d(view, A);
                if (v4Var != null) {
                    v4Var.t8(view);
                }
                view.setLayoutParams(FrameLayoutFix.r1(a0.i(12.0f), -1, 5));
                frameLayoutFix.addView(view);
                return new b(frameLayoutFix);
            } else if (i10 == 1) {
                FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
                frameLayoutFix2.setLayoutParams(new RecyclerView.LayoutParams(a0.i(34.0f), -1));
                Drawable A2 = ae.j.A(R.drawable.stickers_back_right, R.id.theme_color_overlayFilling, v4Var);
                View view2 = new View(context);
                g.d(view2, A2);
                if (v4Var != null) {
                    v4Var.t8(view2);
                }
                view2.setLayoutParams(FrameLayoutFix.r1(a0.i(12.0f), -1, 3));
                frameLayoutFix2.addView(view2);
                return new b(frameLayoutFix2);
            } else if (i10 == 2) {
                j jVar = new j(context);
                jVar.j(o6Var);
                jVar.setStickerMovementCallback(cVar);
                g.d(jVar, ae.j.A(R.drawable.stickers_back_center, R.id.theme_color_overlayFilling, v4Var));
                if (v4Var != null) {
                    v4Var.t8(jVar);
                }
                jVar.v();
                jVar.setPadding(0, a0.i(2.5f), 0, a0.i(6.5f));
                jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new b(jVar);
            } else {
                throw new RuntimeException("viewType == " + i10);
            }
        }
    }

    public w3(v4<?> v4Var, a aVar, RecyclerView.p pVar, v4<?> v4Var2) {
        this.N = v4Var;
        this.O = aVar;
        this.M = pVar;
        this.Q = v4Var2;
    }

    @Override
    public int D() {
        ArrayList<l> arrayList = this.P;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        return this.P.size() + 2;
    }

    @Override
    public void E5(j jVar, l lVar, boolean z10) {
        int c02 = c0(lVar);
        if (c02 != -1) {
            RecyclerView.p pVar = this.M;
            View C = pVar != null ? pVar.C(c02 + 1) : null;
            if (C == null || !(C instanceof j)) {
                I(c02 + 1);
            } else {
                ((j) C).setStickerPressed(z10);
            }
        }
    }

    @Override
    public int F(int i10) {
        ArrayList<l> arrayList;
        int i11 = i10 - 1;
        if (i10 == 0 || (arrayList = this.P) == null) {
            return 0;
        }
        return i11 < arrayList.size() ? 2 : 1;
    }

    @Override
    public void J1(j jVar, l lVar) {
    }

    @Override
    public boolean Q1(j jVar) {
        return true;
    }

    @Override
    public boolean W2(j jVar, View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        return this.O.o0(view, lVar, z11, messageSchedulingState);
    }

    public void a0(ArrayList<l> arrayList) {
        ArrayList<l> arrayList2 = this.P;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            throw new IllegalStateException();
        }
        int size = this.P.size();
        this.P.addAll(arrayList);
        M(size + 1, arrayList.size());
    }

    public boolean b0() {
        ArrayList<l> arrayList = this.P;
        return arrayList != null && !arrayList.isEmpty();
    }

    public final int c0(l lVar) {
        ArrayList<l> arrayList = this.P;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        Iterator<l> it = this.P.iterator();
        while (it.hasNext()) {
            if (it.next().equals(lVar)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void Q(b bVar, int i10) {
        if (bVar.n() == 2) {
            j jVar = (j) bVar.f2982a;
            ArrayList<l> arrayList = this.P;
            jVar.setSticker(arrayList != null ? arrayList.get(i10 - 1) : null);
        }
    }

    public b S(ViewGroup viewGroup, int i10) {
        return b.O(this.N.t(), this.N.c(), i10, this, this.Q);
    }

    public void V(b bVar) {
        if (bVar.n() == 2) {
            ((j) bVar.f2982a).d();
        }
    }

    public void W(b bVar) {
        if (bVar.n() == 2) {
            ((j) bVar.f2982a).i();
        }
    }

    @Override
    public boolean g4(j jVar, int i10, int i11) {
        return true;
    }

    @Override
    public long getStickerOutputChatId() {
        return this.O.b3();
    }

    @Override
    public int getStickersListTop() {
        return this.O.m3();
    }

    @Override
    public int getViewportHeight() {
        return this.O.c2();
    }

    public void h0(ArrayList<l> arrayList) {
        int D = D();
        this.P = arrayList;
        int D2 = D();
        if (D2 == 0 || D == 0) {
            v0.k2(this, D);
            return;
        }
        int i10 = D - 2;
        int i11 = D2 - 2;
        if (i10 == i11) {
            L(1, i11);
        } else if (i10 < D2) {
            L(1, i10);
            M(D - 1, i11 - i10);
        } else {
            L(1, i11);
            N(D2 - 1, i10 - i11);
        }
    }

    @Override
    public void j5(j jVar, l lVar) {
    }

    @Override
    public void w2(j jVar, l lVar) {
    }
}
