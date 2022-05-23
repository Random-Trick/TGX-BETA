package t1;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.v;

public class c implements b {
    public static final b f22866a = new c();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float q10 = v.q(childAt);
                if (q10 > f10) {
                    f10 = q10;
                }
            }
        }
        return f10;
    }

    @Override
    public void a(View view) {
        int i10 = s1.c.a_res_0x7f0703fb;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            v.d0(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override
    public void b(View view) {
    }

    @Override
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }

    @Override
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10) {
            int i11 = s1.c.a_res_0x7f0703fb;
            if (view.getTag(i11) == null) {
                Float valueOf = Float.valueOf(v.q(view));
                v.d0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i11, valueOf);
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }
}
