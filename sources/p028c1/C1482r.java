package p028c1;

import android.view.View;
import android.view.ViewGroup;

public class C1482r {
    public int f5350a;
    public int f5351b;

    public C1482r(ViewGroup viewGroup) {
    }

    public int m36781a() {
        return this.f5350a | this.f5351b;
    }

    public void m36780b(View view, View view2, int i) {
        m36779c(view, view2, i, 0);
    }

    public void m36779c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f5351b = i;
        } else {
            this.f5350a = i;
        }
    }

    public void m36778d(View view) {
        m36777e(view, 0);
    }

    public void m36777e(View view, int i) {
        if (i == 1) {
            this.f5351b = 0;
        } else {
            this.f5350a = 0;
        }
    }
}
