package p194nd;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import p156kd.C6246h;

public class C7503u extends RecyclerView.AbstractC0890h<C7504a> {
    public final Context f24021M;
    public final View.OnClickListener f24022N;
    public ArrayList<C6246h> f24023O;

    public static class C7504a extends RecyclerView.AbstractC0886d0 {
        public C7504a(View view) {
            super(view);
        }
    }

    public C7503u(Context context, View.OnClickListener onClickListener) {
        this.f24021M = context;
        this.f24022N = onClickListener;
    }

    @Override
    public int mo6153D() {
        ArrayList<C6246h> arrayList = this.f24023O;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void mo6146Q(C7504a aVar, int i) {
        ((C7508w) aVar.f3479a).setImage(this.f24023O.get(i));
    }

    public C7504a mo6145S(ViewGroup viewGroup, int i) {
        C7508w wVar = new C7508w(this.f24021M);
        wVar.setOnDeleteClick(this.f24022N);
        return new C7504a(wVar);
    }

    public void mo6144V(C7504a aVar) {
        ((C7508w) aVar.f3479a).m15758f();
    }

    public void mo6143W(C7504a aVar) {
        ((C7508w) aVar.f3479a).m15759b();
    }

    public void mo6142X(C7504a aVar) {
        ((C7508w) aVar.f3479a).mo4501a3();
    }

    public void m15762g0(C6246h hVar) {
        Iterator<C6246h> it = this.f24023O.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == hVar) {
                this.f24023O.remove(i);
                m39309O(i);
                return;
            }
            i++;
        }
    }

    public void m15761h0(ArrayList<C6246h> arrayList) {
        int D = mo6153D();
        this.f24023O = arrayList;
        C7389v0.m16615k2(this, D);
    }
}
