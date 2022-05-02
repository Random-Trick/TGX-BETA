package p272t5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import java.util.LinkedList;
import p118i5.C5220d;
import p163l5.C6334d0;
import p272t5.AbstractC8985c;

public abstract class AbstractC8982a<T extends AbstractC8985c> {
    public T f28881a;
    public Bundle f28882b;
    public LinkedList<AbstractC8994k> f28883c;
    public final AbstractC8987e<T> f28884d = new C8990g(this);

    public static void m10776g(@RecentlyNonNull FrameLayout frameLayout) {
        C5220d p = C5220d.m23604p();
        Context context = frameLayout.getContext();
        int i = p.mo23585i(context);
        String c = C6334d0.m20615c(context, i);
        String e = C6334d0.m20613e(context, i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent d = p.mo23590d(context, i, null);
        if (d != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new View$OnClickListenerC8992i(context, d));
        }
    }

    public abstract void mo10782a(@RecentlyNonNull AbstractC8987e<T> eVar);

    @RecentlyNonNull
    public T m10781b() {
        return this.f28881a;
    }

    public void m10780c(Bundle bundle) {
        m10770m(bundle, new C8991h(this, bundle));
    }

    public void m10779d() {
        T t = this.f28881a;
        if (t != null) {
            t.mo10766g();
        } else {
            m10771l(1);
        }
    }

    public void m10778e() {
        T t = this.f28881a;
        if (t != null) {
            t.mo10767f();
        } else {
            m10771l(5);
        }
    }

    public void m10777f() {
        m10770m(null, new C8993j(this));
    }

    public final void m10771l(int i) {
        while (!this.f28883c.isEmpty() && this.f28883c.getLast().mo10758d() >= i) {
            this.f28883c.removeLast();
        }
    }

    public final void m10770m(Bundle bundle, AbstractC8994k kVar) {
        T t = this.f28881a;
        if (t != null) {
            kVar.mo10759a(t);
            return;
        }
        if (this.f28883c == null) {
            this.f28883c = new LinkedList<>();
        }
        this.f28883c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f28882b;
            if (bundle2 == null) {
                this.f28882b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo10782a(this.f28884d);
    }
}
