package c1;

import android.view.View;
import android.view.ViewGroup;

public class p {
    public int f4286a;
    public int f4287b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f4286a | this.f4287b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f4287b = i10;
        } else {
            this.f4286a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f4287b = 0;
        } else {
            this.f4286a = 0;
        }
    }
}
