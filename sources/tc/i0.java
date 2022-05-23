package tc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import gd.b0;
import org.thunderdog.challegram.R;

public class i0 extends RecyclerView.h<a> implements View.OnClickListener, f {
    public final Context M;
    public final b N;
    public final b0.a O;

    public static class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }

        public static a P(Context context, View.OnClickListener onClickListener) {
            j0 j0Var = new j0(context);
            j0Var.setId(R.id.bucket);
            j0Var.setOnClickListener(onClickListener);
            return new a(j0Var);
        }

        public void O() {
            ((j0) this.f2982a).e();
        }

        public void Q() {
            ((j0) this.f2982a).b();
        }

        public void R(b0.b bVar) {
            ((j0) this.f2982a).setBucket(bVar);
        }
    }

    public interface b {
        void S5(b0.b bVar);
    }

    public i0(Context context, b bVar, b0.a aVar) {
        this.M = context;
        this.N = bVar;
        this.O = aVar;
    }

    @Override
    public int D() {
        return this.O.d();
    }

    public void Q(a aVar, int i10) {
        aVar.R(this.O.e(i10));
    }

    public a S(ViewGroup viewGroup, int i10) {
        return a.P(this.M, this);
    }

    public void V(a aVar) {
        aVar.O();
    }

    public void W(a aVar) {
        aVar.Q();
    }

    public void X(a aVar) {
        aVar.Q();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bucket) {
            b0.b bucket = ((j0) view).getBucket();
            b bVar = this.N;
            if (bVar != null) {
                bVar.S5(bucket);
            }
        }
    }

    @Override
    public int s(int i10) {
        return 0;
    }

    @Override
    public int v(int i10) {
        int D = D() * a0.i(48.0f);
        return (i10 == -1 || i10 >= D) ? D : i10;
    }
}
