package p194nd;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p082fd.C4403w;

public class View$OnClickListenerC7399b extends FrameLayoutFix implements View.OnClickListener {
    public C7486q f23361M;
    public LinearLayout f23362N;
    public int f23363O = -1;
    public AbstractC7400a f23364P;

    public interface AbstractC7400a {
        boolean mo15815f();

        void mo15813p(View$OnClickListenerC7399b bVar, int i);
    }

    public View$OnClickListenerC7399b(Context context) {
        super(context);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(86.0f), -1);
        s1.bottomMargin = C1357a0.m37544i(2.5f);
        C7486q qVar = new C7486q(context);
        this.f23361M = qVar;
        qVar.setLayoutParams(s1);
        this.f23361M.setName(C4403w.m27871i1(R.string.Blur));
        addView(this.f23361M);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -1);
        s12.leftMargin = ((C1357a0.m37544i(64.0f) + C1357a0.m37544i(22.0f)) + C1357a0.m37544i(18.0f)) - C1357a0.m37544i(12.0f);
        s12.rightMargin = C1357a0.m37544i(22.0f) - C1357a0.m37544i(12.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23362N = linearLayout;
        linearLayout.setOrientation(0);
        int i = 0;
        while (i < 3) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            C7396a aVar = new C7396a(context);
            aVar.setText(C4403w.m27871i1(i == 0 ? R.string.Off : i == 1 ? R.string.BlurRadial : R.string.BlurLinear).toUpperCase());
            aVar.setOnClickListener(this);
            if (i == 0) {
                aVar.setPadding(C1357a0.m37544i(20.0f), 0, 0, 0);
            } else if (i == 2) {
                aVar.setPadding(0, 0, C1357a0.m37544i(20.0f), 0);
            }
            aVar.setLayoutParams(layoutParams);
            this.f23362N.addView(aVar);
            i++;
        }
        this.f23362N.setLayoutParams(s12);
        addView(this.f23362N);
        setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(42.0f)));
    }

    @Override
    public void onClick(View view) {
        int indexOfChild;
        int i;
        AbstractC7400a aVar = this.f23364P;
        if ((aVar == null || aVar.mo15815f()) && (indexOfChild = this.f23362N.indexOfChild(view)) != -1 && (i = this.f23363O) != indexOfChild) {
            if (i != -1) {
                ((C7396a) this.f23362N.getChildAt(i)).m16550c(false, true);
            }
            this.f23363O = indexOfChild;
            ((C7396a) this.f23362N.getChildAt(indexOfChild)).m16550c(true, true);
            AbstractC7400a aVar2 = this.f23364P;
            if (aVar2 != null) {
                aVar2.mo15813p(this, indexOfChild);
            }
        }
    }

    public void setData(int i) {
        int i2 = this.f23363O;
        if (i2 != i) {
            if (i2 != -1) {
                ((C7396a) this.f23362N.getChildAt(i2)).m16550c(false, false);
            }
            this.f23363O = i;
            if (i != -1) {
                ((C7396a) this.f23362N.getChildAt(i)).m16550c(true, false);
            }
        }
    }

    public void setListener(AbstractC7400a aVar) {
        this.f23364P = aVar;
    }
}
