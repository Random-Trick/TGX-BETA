package vc;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import gd.C4592b3;
import me.C6847b2;
import me.C7030t1;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC2805o4;
import p082fd.C4403w;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9907d extends RecyclerView.AbstractC0886d0 {
    public C9907d(View view) {
        super(view);
    }

    public static C9907d m6574O(Context context, C10930q6 q6Var, int i, View$OnClickListenerC2805o4 o4Var, AbstractC9323v4<?> v4Var, View$OnClickListenerC6902i.AbstractC6905c cVar) {
        if (i == 0) {
            C9903a aVar = new C9903a(context, q6Var);
            aVar.setPreviewActionListProvider(cVar);
            aVar.setLongPressInterceptor(o4Var);
            if (o4Var != null) {
                aVar.setAnimationsDisabled(o4Var.m33309ri());
                aVar.setOnClickListener(o4Var);
                aVar.setOnLongClickListener(o4Var);
            } else {
                aVar.setEnabled(false);
                aVar.setOnClickListener(null);
                aVar.setOnLongClickListener(null);
            }
            if (v4Var != null) {
                v4Var.m9163t8(aVar);
            }
            return new C9907d(aVar);
        } else if (i == 1) {
            C7030t1 t1Var = new C7030t1(context);
            if (v4Var != null) {
                t1Var.m18060C1(v4Var);
            }
            return new C9907d(t1Var);
        } else if (i == 2) {
            C6847b2 b2Var = new C6847b2(context);
            b2Var.setTextSize(1, 15.0f);
            b2Var.setTypeface(C1389o.m37261k());
            b2Var.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
            b2Var.setGravity(17);
            b2Var.setTextColor(C11524j.m213U0());
            if (v4Var != null) {
                v4Var.m9119z8(b2Var, R.id.theme_color_textLight);
            }
            b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            return new C9907d(b2Var);
        } else {
            throw new IllegalArgumentException("viewType == " + i);
        }
    }

    public void m6573P(C4592b3 b3Var, boolean z, boolean z2, boolean z3) {
        ((C9903a) this.f3479a).setChat(b3Var);
        ((C9903a) this.f3479a).setNeedBackground(z);
        ((C9903a) this.f3479a).m6662D1(z3, false);
    }

    public void m6572Q(int i) {
        ((C7030t1) this.f3479a).m18059D1(C4403w.m27871i1(i));
    }

    public void m6571R(CharSequence charSequence) {
        if (charSequence == null) {
            ((C7030t1) this.f3479a).m18057F1();
        } else {
            ((C7030t1) this.f3479a).m18058E1(charSequence);
        }
    }
}
