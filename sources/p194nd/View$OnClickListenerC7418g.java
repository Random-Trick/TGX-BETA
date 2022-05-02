package p194nd;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p225pd.C8111a;

public class View$OnClickListenerC7418g extends FrameLayoutFix implements View.OnClickListener {
    public C7486q f23424M;
    public LinearLayout f23425N;
    public int f23426O = -1;
    public AbstractC7419a f23427P;
    public int[] f23428Q;

    public interface AbstractC7419a {
        void mo15822a(View$OnClickListenerC7418g gVar, int i);

        boolean mo15820c();
    }

    public View$OnClickListenerC7418g(Context context) {
        super(context);
        int[] iArr;
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(86.0f), -1);
        s1.bottomMargin = C1357a0.m37544i(2.5f);
        C7486q qVar = new C7486q(context);
        this.f23424M = qVar;
        qVar.setLayoutParams(s1);
        addView(this.f23424M);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -1);
        s12.leftMargin = ((C1357a0.m37544i(64.0f) + C1357a0.m37544i(22.0f)) + C1357a0.m37544i(18.0f)) - C1357a0.m37544i(12.0f);
        s12.rightMargin = C1357a0.m37544i(22.0f) - C1357a0.m37544i(12.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23425N = linearLayout;
        linearLayout.setOrientation(0);
        for (int i : C8111a.f26349i) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            C7415f fVar = new C7415f(context);
            fVar.setLayoutParams(layoutParams);
            fVar.setOnClickListener(this);
            this.f23425N.addView(fVar);
        }
        this.f23425N.setLayoutParams(s12);
        addView(this.f23425N);
        setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(42.0f)));
    }

    public void m16500C1(String str, int[] iArr, int i) {
        this.f23424M.setName(str);
        this.f23428Q = iArr;
        int length = iArr.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            C7415f fVar = (C7415f) this.f23425N.getChildAt(i3);
            fVar.setColorId(i5 == 0 ? R.id.theme_color_white : i5);
            boolean z = i5 == i;
            fVar.m16501c(z, false);
            if (z) {
                i2 = i3;
            }
            i3++;
        }
        this.f23426O = i2;
    }

    @Override
    public void onClick(View view) {
        int indexOfChild;
        int i;
        AbstractC7419a aVar = this.f23427P;
        if ((aVar == null || aVar.mo15820c()) && (indexOfChild = this.f23425N.indexOfChild(view)) != -1 && indexOfChild != (i = this.f23426O)) {
            if (i != -1) {
                ((C7415f) this.f23425N.getChildAt(i)).m16501c(false, true);
            }
            this.f23426O = indexOfChild;
            ((C7415f) view).m16501c(true, true);
            AbstractC7419a aVar2 = this.f23427P;
            if (aVar2 != null) {
                aVar2.mo15822a(this, this.f23428Q[indexOfChild]);
            }
        }
    }

    public void setListener(AbstractC7419a aVar) {
        this.f23427P = aVar;
    }
}
