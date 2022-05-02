package p349yc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1379j0;
import me.vkryl.android.widget.FrameLayoutFix;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC10512i extends FrameLayoutFix implements View.OnClickListener, View.OnLongClickListener {
    public AbstractC10513a f33721M;
    public boolean f33722N;
    public int f33723O;

    public interface AbstractC10513a {
        void mo4865F6();

        boolean mo4864N1();

        void mo4863U5(int i);
    }

    public View$OnClickListenerC10512i(Context context) {
        super(context);
    }

    private int getButtonHeight() {
        int i = 0;
        int e = C1357a0.m37548e() - View$OnClickListenerC9170d1.m10065c3(false);
        if (!C1379j0.m37357N()) {
            i = C1357a0.m37544i(156.0f) + C1357a0.m37544i(32.0f);
        }
        int i2 = e - i;
        float k = C1357a0.m37542k(82.0f);
        return (int) (k * Math.min(i2 / (4.0f * k), 1.2f));
    }

    public final void m4868C1() {
        int i = C1357a0.m37544i(106.0f);
        this.f33723O = getButtonHeight();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < 9) {
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(i, this.f33723O);
            s1.setMargins(i4, i5, 0, 0);
            C10511h hVar = new C10511h(getContext());
            hVar.setHasFeedback(this.f33722N);
            hVar.setId(i2);
            hVar.setNumber(i2);
            hVar.setOnClickListener(this);
            hVar.setLayoutParams(s1);
            addView(hVar);
            i3++;
            if (i3 % 3 == 0) {
                i5 += this.f33723O;
                i4 = 0;
            } else {
                i4 += i;
            }
            i2++;
        }
        int i6 = i4 + i;
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(i, this.f33723O);
        s12.setMargins(i6, i5, 0, 0);
        C10511h hVar2 = new C10511h(getContext());
        hVar2.setHasFeedback(this.f33722N);
        hVar2.setId(0);
        hVar2.setNumber(0);
        hVar2.setOnClickListener(this);
        hVar2.setLayoutParams(s12);
        addView(hVar2);
        int i7 = i6 + i;
        FrameLayout.LayoutParams s13 = FrameLayoutFix.m18008s1(i, this.f33723O);
        s13.setMargins(i7, i5, 0, 0);
        C10511h hVar3 = new C10511h(getContext());
        hVar3.setHasFeedback(this.f33722N);
        hVar3.setId(-1);
        hVar3.setNumber(-1);
        hVar3.setOnClickListener(this);
        hVar3.setOnLongClickListener(this);
        hVar3.setLayoutParams(s13);
        addView(hVar3);
    }

    public void m4867D1(boolean z) {
        this.f33722N = z;
        m4868C1();
        setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37544i(318.0f), -1));
    }

    public void m4866E1() {
        this.f33723O = getButtonHeight();
        int i = 0;
        int i2 = 0;
        while (i < getChildCount()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getChildAt(i).getLayoutParams();
            int i3 = this.f33723O;
            layoutParams.height = i3;
            layoutParams.topMargin = i2;
            i++;
            if (i % 3 == 0) {
                i2 += i3;
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (this.f33721M != null) {
            if (view.getId() == -1) {
                this.f33721M.mo4865F6();
            } else {
                this.f33721M.mo4863U5(view.getId());
            }
            C1379j0.m37363H(view, false);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        AbstractC10513a aVar = this.f33721M;
        return aVar != null && aVar.mo4864N1();
    }

    public void setCallback(AbstractC10513a aVar) {
        this.f33721M = aVar;
    }

    public void setHasFeedback(boolean z) {
        if (this.f33722N != z) {
            this.f33722N = z;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof C10511h)) {
                    ((C10511h) childAt).setHasFeedback(z);
                }
            }
        }
    }
}
