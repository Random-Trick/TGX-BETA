package od;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import ld.h;
import oc.v0;

public class u extends RecyclerView.h<a> {
    public final Context M;
    public final View.OnClickListener N;
    public ArrayList<h> O;

    public static class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public u(Context context, View.OnClickListener onClickListener) {
        this.M = context;
        this.N = onClickListener;
    }

    @Override
    public int D() {
        ArrayList<h> arrayList = this.O;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void Q(a aVar, int i10) {
        ((w) aVar.f2982a).setImage(this.O.get(i10));
    }

    public a S(ViewGroup viewGroup, int i10) {
        w wVar = new w(this.M);
        wVar.setOnDeleteClick(this.N);
        return new a(wVar);
    }

    public void V(a aVar) {
        ((w) aVar.f2982a).e();
    }

    public void W(a aVar) {
        ((w) aVar.f2982a).b();
    }

    public void X(a aVar) {
        ((w) aVar.f2982a).Q2();
    }

    public void f0(h hVar) {
        Iterator<h> it = this.O.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() == hVar) {
                this.O.remove(i10);
                O(i10);
                return;
            }
            i10++;
        }
    }

    public void g0(ArrayList<h> arrayList) {
        int D = D();
        this.O = arrayList;
        v0.k2(this, D);
    }
}
