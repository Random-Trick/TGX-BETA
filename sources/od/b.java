package od;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class b extends FrameLayoutFix implements View.OnClickListener {
    public q M;
    public LinearLayout N;
    public int O = -1;
    public a P;

    public interface a {
        boolean f();

        void l(b bVar, int i10);
    }

    public b(Context context) {
        super(context);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(86.0f), -1);
        q12.bottomMargin = a0.i(2.5f);
        q qVar = new q(context);
        this.M = qVar;
        qVar.setLayoutParams(q12);
        this.M.setName(w.i1(R.string.Blur));
        addView(this.M);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, -1);
        q13.leftMargin = ((a0.i(64.0f) + a0.i(22.0f)) + a0.i(18.0f)) - a0.i(12.0f);
        q13.rightMargin = a0.i(22.0f) - a0.i(12.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(0);
        int i10 = 0;
        while (i10 < 3) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            od.a aVar = new od.a(context);
            aVar.setText(w.i1(i10 == 0 ? R.string.Off : i10 == 1 ? R.string.BlurRadial : R.string.BlurLinear).toUpperCase());
            aVar.setOnClickListener(this);
            if (i10 == 0) {
                aVar.setPadding(a0.i(20.0f), 0, 0, 0);
            } else if (i10 == 2) {
                aVar.setPadding(0, 0, a0.i(20.0f), 0);
            }
            aVar.setLayoutParams(layoutParams);
            this.N.addView(aVar);
            i10++;
        }
        this.N.setLayoutParams(q13);
        addView(this.N);
        setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(42.0f)));
    }

    @Override
    public void onClick(View view) {
        int indexOfChild;
        int i10;
        a aVar = this.P;
        if ((aVar == null || aVar.f()) && (indexOfChild = this.N.indexOfChild(view)) != -1 && (i10 = this.O) != indexOfChild) {
            if (i10 != -1) {
                ((od.a) this.N.getChildAt(i10)).c(false, true);
            }
            this.O = indexOfChild;
            ((od.a) this.N.getChildAt(indexOfChild)).c(true, true);
            a aVar2 = this.P;
            if (aVar2 != null) {
                aVar2.l(this, indexOfChild);
            }
        }
    }

    public void setData(int i10) {
        int i11 = this.O;
        if (i11 != i10) {
            if (i11 != -1) {
                ((od.a) this.N.getChildAt(i11)).c(false, false);
            }
            this.O = i10;
            if (i10 != -1) {
                ((od.a) this.N.getChildAt(i10)).c(true, false);
            }
        }
    }

    public void setListener(a aVar) {
        this.P = aVar;
    }
}
