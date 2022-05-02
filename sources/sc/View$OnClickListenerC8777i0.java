package sc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import org.thunderdog.challegram.R;
import p082fd.C4356b0;

public class View$OnClickListenerC8777i0 extends RecyclerView.AbstractC0890h<C8778a> implements View.OnClickListener, AbstractC8749f {
    public final Context f28333M;
    public final AbstractC8779b f28334N;
    public final C4356b0.C4357a f28335O;

    public static class C8778a extends RecyclerView.AbstractC0886d0 {
        public C8778a(View view) {
            super(view);
        }

        public static C8778a m11418P(Context context, View.OnClickListener onClickListener) {
            C8783j0 j0Var = new C8783j0(context);
            j0Var.setId(R.id.bucket);
            j0Var.setOnClickListener(onClickListener);
            return new C8778a(j0Var);
        }

        public void m11419O() {
            ((C8783j0) this.f3479a).m11414f();
        }

        public void m11417Q() {
            ((C8783j0) this.f3479a).m11415b();
        }

        public void m11416R(C4356b0.C4358b bVar) {
            ((C8783j0) this.f3479a).setBucket(bVar);
        }
    }

    public interface AbstractC8779b {
        void mo11216d1(C4356b0.C4358b bVar);
    }

    public View$OnClickListenerC8777i0(Context context, AbstractC8779b bVar, C4356b0.C4357a aVar) {
        this.f28333M = context;
        this.f28334N = bVar;
        this.f28335O = aVar;
    }

    @Override
    public int mo6153D() {
        return this.f28335O.m28188d();
    }

    public void mo6146Q(C8778a aVar, int i) {
        aVar.m11416R(this.f28335O.m28187e(i));
    }

    public C8778a mo6145S(ViewGroup viewGroup, int i) {
        return C8778a.m11418P(this.f28333M, this);
    }

    public void mo6144V(C8778a aVar) {
        aVar.m11419O();
    }

    public void mo6143W(C8778a aVar) {
        aVar.m11417Q();
    }

    public void mo6142X(C8778a aVar) {
        aVar.m11417Q();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bucket) {
            C4356b0.C4358b bucket = ((C8783j0) view).getBucket();
            AbstractC8779b bVar = this.f28334N;
            if (bVar != null) {
                bVar.mo11216d1(bucket);
            }
        }
    }

    @Override
    public int mo11421r(int i) {
        return 0;
    }

    @Override
    public int mo11420v(int i) {
        int D = mo6153D() * C1357a0.m37544i(48.0f);
        return (i == -1 || i >= D) ? D : i;
    }
}
