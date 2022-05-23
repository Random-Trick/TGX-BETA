package ne;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import gd.w;

public abstract class q extends RecyclerView.o {
    @Override
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int l10 = l();
        int k02 = recyclerView.k0(view);
        if (l10 == 0 || k02 == -1) {
            rect.right = 0;
            rect.left = 0;
            return;
        }
        int measuredWidth = recyclerView.getMeasuredWidth() - (a0.i(72.0f) * l10);
        if (measuredWidth <= 0) {
            rect.right = 0;
            rect.left = 0;
            return;
        }
        int i10 = measuredWidth / (l10 + 2);
        if (k02 == 0) {
            i10 += i10 / 2;
        }
        if (w.G2()) {
            rect.right = i10;
            rect.left = 0;
            return;
        }
        rect.left = i10;
        rect.right = 0;
    }

    public abstract int l();
}
