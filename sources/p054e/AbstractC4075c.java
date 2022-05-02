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

    public static AbstractC4075c m29031e(Activity activity, AbstractC4074b bVar) {
        return new LayoutInflater$Factory2C4076d(activity, bVar);
    }

    public static AbstractC4075c m29030f(Dialog dialog, AbstractC4074b bVar) {
        return new LayoutInflater$Factory2C4076d(dialog, bVar);
    }

    public static int m29029h() {
        return f13749a;
    }

    public static void m29028n(AbstractC4075c cVar) {
        synchronized (f13751c) {
            m29026x(cVar);
            f13750b.add(new WeakReference<>(cVar));
        }
    }

    public static void m29027o(AbstractC4075c cVar) {
        synchronized (f13751c) {
            m29026x(cVar);
        }
    }

    public static void m29026x(AbstractC4075c cVar) {
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

    public abstract void mo29025A(View view);

    public abstract void mo29023B(View view, ViewGroup.LayoutParams layoutParams);

    public void mo29021C(int i) {
    }

    public abstract void mo29019D(CharSequence charSequence);

    public abstract void mo28988c(View view, ViewGroup.LayoutParams layoutParams);

    public void mo28986d(Context context) {
    }

    public abstract <T extends View> T mo28982g(int i);

    public int mo28979i() {
        return -100;
    }

    public abstract MenuInflater mo28977j();

    public abstract ActionBar mo28975k();

    public abstract void mo28973l();

    public abstract void mo28971m();

    public abstract void mo28967p(Configuration configuration);

    public abstract void mo28965q(Bundle bundle);

    public abstract void mo28963r();

    public abstract void mo28961s(Bundle bundle);

    public abstract void mo28959t();

    public abstract void mo28957u(Bundle bundle);

    public abstract void mo28955v();

    public abstract void mo28953w();

    public abstract boolean mo28950y(int i);

    public abstract void mo28948z(int i);
}