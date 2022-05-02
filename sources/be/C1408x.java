package be;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ge.C4868i;
import org.thunderdog.challegram.Log;

public class C1408x {

    public interface AbstractC1409a {
        void mo14479j(boolean z);

        void mo14478j0();
    }

    public static int m37093a() {
        return m37092b(Math.round(C1357a0.m37548e() * 0.45f));
    }

    public static int m37092b(int i) {
        return Math.max(C4868i.m24727c2().m24773W0(C1379j0.m37294z(), i), C1357a0.m37544i(75.0f));
    }

    public static void m37091c(View view) {
        if (view != null) {
            ((InputMethodManager) C1379j0.m37318n().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void m37090d(View... viewArr) {
        for (View view : viewArr) {
            m37091c(view);
        }
    }

    public static void m37089e(int i) {
        if (i > 0) {
            C4868i.m24727c2().m24811Q4(C1379j0.m37294z(), i);
        }
    }

    public static void m37088f(View view) {
        if (view != null) {
            try {
                view.requestFocus();
                ((InputMethodManager) C1379j0.m37318n().getSystemService("input_method")).showSoftInput(view, 0);
            } catch (Throwable th) {
                Log.m14725e("Cannot show keyboard", th, new Object[0]);
            }
        }
    }
}
