package od;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;

public class g extends FrameLayoutFix implements View.OnClickListener {
    public q M;
    public LinearLayout N;
    public int O = -1;
    public a P;
    public int[] Q;

    public interface a {
        boolean d();

        void w(g gVar, int i10);
    }

    public g(Context context) {
        super(context);
        int[] iArr;
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(86.0f), -1);
        q12.bottomMargin = a0.i(2.5f);
        q qVar = new q(context);
        this.M = qVar;
        qVar.setLayoutParams(q12);
        addView(this.M);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, -1);
        q13.leftMargin = ((a0.i(64.0f) + a0.i(22.0f)) + a0.i(18.0f)) - a0.i(12.0f);
        q13.rightMargin = a0.i(22.0f) - a0.i(12.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(0);
        for (int i10 : qd.a.f21532i) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            f fVar = new f(context);
            fVar.setLayoutParams(layoutParams);
            fVar.setOnClickListener(this);
            this.N.addView(fVar);
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
        if ((aVar == null || aVar.d()) && (indexOfChild = this.N.indexOfChild(view)) != -1 && indexOfChild != (i10 = this.O)) {
            if (i10 != -1) {
                ((f) this.N.getChildAt(i10)).c(false, true);
            }
            this.O = indexOfChild;
            ((f) view).c(true, true);
            a aVar2 = this.P;
            if (aVar2 != null) {
                aVar2.w(this, this.Q[indexOfChild]);
            }
        }
    }

    public void setListener(a aVar) {
        this.P = aVar;
    }

    public void z1(String str, int[] iArr, int i10) {
        this.M.setName(str);
        this.Q = iArr;
        int length = iArr.length;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            f fVar = (f) this.N.getChildAt(i12);
            fVar.setColorId(i14 == 0 ? R.id.theme_color_white : i14);
            boolean z10 = i14 == i10;
            fVar.c(z10, false);
            if (z10) {
                i11 = i12;
            }
            i12++;
        }
        this.O = i11;
    }
}
