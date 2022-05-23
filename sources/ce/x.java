package ce;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import he.i;
import org.thunderdog.challegram.Log;

public class x {

    public interface a {
        void j(boolean z10);

        void n0();
    }

    public static int a() {
        return b(Math.round(a0.e() * 0.45f));
    }

    public static int b(int i10) {
        return Math.max(i.c2().W0(j0.z(), i10), a0.i(75.0f));
    }

    public static void c(View view) {
        if (view != null) {
            ((InputMethodManager) j0.n().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void d(View... viewArr) {
        for (View view : viewArr) {
            c(view);
        }
    }

    public static void e(int i10) {
        if (i10 > 0) {
            i.c2().Q4(j0.z(), i10);
        }
    }

    public static void f(View view) {
        if (view != null) {
            try {
                view.requestFocus();
                ((InputMethodManager) j0.n().getSystemService("input_method")).showSoftInput(view, 0);
            } catch (Throwable th) {
                Log.e("Cannot show keyboard", th, new Object[0]);
            }
        }
    }
}
