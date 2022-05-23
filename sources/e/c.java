package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import k0.b;

public abstract class c {
    public static int f10344a = -100;
    public static final b<WeakReference<c>> f10345b = new b<>();
    public static final Object f10346c = new Object();

    public static c e(Activity activity, b bVar) {
        return new d(activity, bVar);
    }

    public static c f(Dialog dialog, b bVar) {
        return new d(dialog, bVar);
    }

    public static int h() {
        return f10344a;
    }

    public static void n(c cVar) {
        synchronized (f10346c) {
            x(cVar);
            f10345b.add(new WeakReference<>(cVar));
        }
    }

    public static void o(c cVar) {
        synchronized (f10346c) {
            x(cVar);
        }
    }

    public static void x(c cVar) {
        synchronized (f10346c) {
            Iterator<WeakReference<c>> it = f10345b.iterator();
            while (it.hasNext()) {
                c cVar2 = it.next().get();
                if (cVar2 == cVar || cVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(View view);

    public abstract void B(View view, ViewGroup.LayoutParams layoutParams);

    public void C(int i10) {
    }

    public abstract void D(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d(Context context) {
    }

    public abstract <T extends View> T g(int i10);

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract ActionBar k();

    public abstract void l();

    public abstract void m();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean y(int i10);

    public abstract void z(int i10);
}
