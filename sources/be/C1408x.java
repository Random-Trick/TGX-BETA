package be;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ge.C4868i;
import org.thunderdog.challegram.Log;

public class C1408x {

    public interface AbstractC1409a {
        void mo14480j(boolean z);

        void mo14479j0();
    }

    public static int m37090a() {
        return m37089b(Math.round(C1357a0.m37545e() * 0.45f));
    }

    public static int m37089b(int i) {
        return Math.max(C4868i.m24726c2().m24772W0(C1379j0.m37291z(), i), C1357a0.m37541i(75.0f));
    }

    public static void m37088c(View view) {
        if (view != null) {
            ((InputMethodManager) C1379j0.m37315n().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void m37087d(View... viewArr) {
        for (View view : viewArr) {
            m37088c(view);
        }
    }

    public static void m37086e(int i) {
        if (i > 0) {
            C4868i.m24726c2().m24810Q4(C1379j0.m37291z(), i);
        }
    }

    public static void m37085f(View view) {
        if (view != null) {
            try {
                view.requestFocus();
                ((InputMethodManager) C1379j0.m37315n().getSystemService("input_method")).showSoftInput(view, 0);
            } catch (Throwable th) {
                Log.m14725e("Cannot show keyboard", th, new Object[0]);
            }
        }
    }
}
