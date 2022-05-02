package p268t1;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p028c1.C1489y;
import p257s1.C8625c;

public class C8948c implements AbstractC8947b {
    public static final AbstractC8947b f28823a = new C8948c();

    public static float m10852e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float q = C1489y.m36711q(childAt);
                if (q > f) {
                    f = q;
                }
            }
        }
        return f;
    }

    @Override
    public void mo10856a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i = C8625c.a_res_0x7f0703f9;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                C1489y.m36734e0(view, ((Float) tag).floatValue());
            }
            view.setTag(i, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override
    public void mo10855b(View view) {
    }

    @Override
    public void mo10854c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override
    public void mo10853d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z) {
            int i2 = C8625c.a_res_0x7f0703f9;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C1489y.m36711q(view));
                C1489y.m36734e0(view, m10852e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
