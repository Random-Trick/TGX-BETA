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
    public T f28884a;
    public Bundle f28885b;
    public LinkedList<AbstractC8994k> f28886c;
    public final AbstractC8987e<T> f28887d = new C8990g(this);

    public static void m10775g(@RecentlyNonNull FrameLayout frameLayout) {
        C5220d p = C5220d.m23605p();
        Context context = frameLayout.getContext();
        int i = p.mo23586i(context);
        String c = C6334d0.m20616c(context, i);
        String e = C6334d0.m20614e(context, i);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent d = p.mo23591d(context, i, null);
        if (d != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new View$OnClickListenerC8992i(context, d));
        }
    }

    public abstract void mo10781a(@RecentlyNonNull AbstractC8987e<T> eVar);

    @RecentlyNonNull
    public T m10780b() {
        return this.f28884a;
    }

    public void m10779c(Bundle bundle) {
        m10769m(bundle, new C8991h(this, bundle));
    }

    public void m10778d() {
        T t = this.f28884a;
        if (t != null) {
            t.mo10765g();
        } else {
            m10770l(1);
        }
    }

    public void m10777e() {
        T t = this.f28884a;
        if (t != null) {
            t.mo10766f();
        } else {
            m10770l(5);
        }
    }

    public void m10776f() {
        m10769m(null, new C8993j(this));
    }

    public final void m10770l(int i) {
        while (!this.f28886c.isEmpty() && this.f28886c.getLast().mo10757d() >= i) {
            this.f28886c.removeLast();
        }
    }

    public final void m10769m(Bundle bundle, AbstractC8994k kVar) {
        T t = this.f28884a;
        if (t != null) {
            kVar.mo10758a(t);
            return;
        }
        if (this.f28886c == null) {
            this.f28886c = new LinkedList<>();
        }
        this.f28886c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f28885b;
            if (bundle2 == null) {
                this.f28885b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo10781a(this.f28887d);
    }
}
