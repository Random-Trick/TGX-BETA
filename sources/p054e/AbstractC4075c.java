package p054e;

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
import p143k0.C6031b;

public abstract class AbstractC4075c {
    public static int f13749a = -100;
    public static final C6031b<WeakReference<AbstractC4075c>> f13750b = new C6031b<>();
    public static final Object f13751c = new Object();

    public static AbstractC4075c m29033e(Activity activity, AbstractC4074b bVar) {
        return new LayoutInflater$Factory2C4076d(activity, bVar);
    }

    public static AbstractC4075c m29032f(Dialog dialog, AbstractC4074b bVar) {
        return new LayoutInflater$Factory2C4076d(dialog, bVar);
    }

    public static int m29031h() {
        return f13749a;
    }

    public static void m29030n(AbstractC4075c cVar) {
        synchronized (f13751c) {
            m29028x(cVar);
            f13750b.add(new WeakReference<>(cVar));
        }
    }

    public static void m29029o(AbstractC4075c cVar) {
        synchronized (f13751c) {
            m29028x(cVar);
        }
    }

    public static void m29028x(AbstractC4075c cVar) {
        synchronized (f13751c) {
            Iterator<WeakReference<AbstractC4075c>> it = f13750b.iterator();
            while (it.hasNext()) {
                AbstractC4075c cVar2 = it.next().get();
                if (cVar2 == cVar || cVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void mo29027A(View view);

    public abstract void mo29025B(View view, ViewGroup.LayoutParams layoutParams);

    public void mo29023C(int i) {
    }

    public abstract void mo29021D(CharSequence charSequence);

    public abstract void mo28990c(View view, ViewGroup.LayoutParams layoutParams);

    public void mo28988d(Context context) {
    }

    public abstract <T extends View> T mo28984g(int i);

    public int mo28981i() {
        return -100;
    }

    public abstract MenuInflater mo28979j();

    public abstract ActionBar mo28977k();

    public abstract void mo28975l();

    public abstract void mo28973m();

    public abstract void mo28969p(Configuration configuration);

    public abstract void mo28967q(Bundle bundle);

    public abstract void mo28965r();

    public abstract void mo28963s(Bundle bundle);

    public abstract void mo28961t();

    public abstract void mo28959u(Bundle bundle);

    public abstract void mo28957v();

    public abstract void mo28955w();

    public abstract boolean mo28952y(int i);

    public abstract void mo28950z(int i);
}
