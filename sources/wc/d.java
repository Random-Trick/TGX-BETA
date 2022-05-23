package wc;

import ae.j;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.o;
import de.o4;
import gd.w;
import hd.b3;
import ne.b2;
import ne.i;
import ne.t1;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class d extends RecyclerView.c0 {
    public d(View view) {
        super(view);
    }

    public static d O(Context context, o6 o6Var, int i10, o4 o4Var, v4<?> v4Var, i.c cVar) {
        if (i10 == 0) {
            a aVar = new a(context, o6Var);
            aVar.setPreviewActionListProvider(cVar);
            aVar.setLongPressInterceptor(o4Var);
            if (o4Var != null) {
                aVar.setAnimationsDisabled(o4Var.ri());
                aVar.setOnClickListener(o4Var);
                aVar.setOnLongClickListener(o4Var);
            } else {
                aVar.setEnabled(false);
                aVar.setOnClickListener(null);
                aVar.setOnLongClickListener(null);
            }
            if (v4Var != null) {
                v4Var.t8(aVar);
            }
            return new d(aVar);
        } else if (i10 == 1) {
            t1 t1Var = new t1(context);
            if (v4Var != null) {
                t1Var.z1(v4Var);
            }
            return new d(t1Var);
        } else if (i10 == 2) {
            b2 b2Var = new b2(context);
            b2Var.setTextSize(1, 15.0f);
            b2Var.setTypeface(o.k());
            b2Var.setPadding(a0.i(16.0f), a0.i(16.0f), a0.i(16.0f), a0.i(16.0f));
            b2Var.setGravity(17);
            b2Var.setTextColor(j.R0());
            if (v4Var != null) {
                v4Var.z8(b2Var, R.id.theme_color_textLight);
            }
            b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            return new d(b2Var);
        } else {
            throw new IllegalArgumentException("viewType == " + i10);
        }
    }

    public void P(b3 b3Var, boolean z10, boolean z11, boolean z12) {
        ((a) this.f2982a).setChat(b3Var);
        ((a) this.f2982a).setNeedBackground(z10);
        ((a) this.f2982a).B1(z12, false);
    }

    public void Q(int i10) {
        ((t1) this.f2982a).A1(w.i1(i10));
    }

    public void R(CharSequence charSequence) {
        if (charSequence == null) {
            ((t1) this.f2982a).C1();
        } else {
            ((t1) this.f2982a).B1(charSequence);
        }
    }
}
