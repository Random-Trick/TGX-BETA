package sc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import org.thunderdog.challegram.R;
import p082fd.C4356b0;

public class View$OnClickListenerC8777i0 extends RecyclerView.AbstractC0890h<C8778a> implements View.OnClickListener, AbstractC8749f {
    public final Context f28330M;
    public final AbstractC8779b f28331N;
    public final C4356b0.C4357a f28332O;

    public static class C8778a extends RecyclerView.AbstractC0886d0 {
        public C8778a(View view) {
            super(view);
        }

        public static C8778a m11419P(Context context, View.OnClickListener onClickListener) {
            C8783j0 j0Var = new C8783j0(context);
            j0Var.setId(R.id.bucket);
            j0Var.setOnClickListener(onClickListener);
            return new C8778a(j0Var);
        }

        public void m11420O() {
            ((C8783j0) this.f3479a).m11415f();
        }

        public void m11418Q() {
            ((C8783j0) this.f3479a).m11416b();
        }

        public void m11417R(C4356b0.C4358b bVar) {
            ((C8783j0) this.f3479a).setBucket(bVar);
        }
    }

    public interface AbstractC8779b {
        void mo11217d1(C4356b0.C4358b bVar);
    }

    public View$OnClickListenerC8777i0(Context context, AbstractC8779b bVar, C4356b0.C4357a aVar) {
        this.f28330M = context;
        this.f28331N = bVar;
        this.f28332O = aVar;
    }

    @Override
    public int mo6153D() {
        return this.f28332O.m28186d();
    }

    public void mo6146Q(C8778a aVar, int i) {
        aVar.m11417R(this.f28332O.m28185e(i));
    }

    public C8778a mo6145S(ViewGroup viewGroup, int i) {
        return C8778a.m11419P(this.f28330M, this);
    }

    public void mo6144V(C8778a aVar) {
        aVar.m11420O();
    }

    public void mo6143W(C8778a aVar) {
        aVar.m11418Q();
    }

    public void mo6142X(C8778a aVar) {
        aVar.m11418Q();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bucket) {
            C4356b0.C4358b bucket = ((C8783j0) view).getBucket();
            AbstractC8779b bVar = this.f28331N;
            if (bVar != null) {
                bVar.mo11217d1(bucket);
            }
        }
    }

    @Override
    public int mo11422r(int i) {
        return 0;
    }

    @Override
    public int mo11421v(int i) {
        int D = mo6153D() * C1357a0.m37541i(48.0f);
        return (i == -1 || i >= D) ? D : i;
    }
}
