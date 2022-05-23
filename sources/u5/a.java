package u5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import j5.d;
import java.util.LinkedList;
import m5.d0;
import u5.c;

public abstract class a<T extends c> {
    public T f23572a;
    public Bundle f23573b;
    public LinkedList<k> f23574c;
    public final e<T> f23575d = new g(this);

    public static void g(@RecentlyNonNull FrameLayout frameLayout) {
        d p10 = d.p();
        Context context = frameLayout.getContext();
        int i10 = p10.i(context);
        String c10 = d0.c(context, i10);
        String e10 = d0.e(context, i10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent d10 = p10.d(context, i10, null);
        if (d10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(e10);
            linearLayout.addView(button);
            button.setOnClickListener(new i(context, d10));
        }
    }

    public abstract void a(@RecentlyNonNull e<T> eVar);

    @RecentlyNonNull
    public T b() {
        return this.f23572a;
    }

    public void c(Bundle bundle) {
        m(bundle, new h(this, bundle));
    }

    public void d() {
        T t10 = this.f23572a;
        if (t10 != null) {
            t10.g();
        } else {
            l(1);
        }
    }

    public void e() {
        T t10 = this.f23572a;
        if (t10 != null) {
            t10.f();
        } else {
            l(5);
        }
    }

    public void f() {
        m(null, new j(this));
    }

    public final void l(int i10) {
        while (!this.f23574c.isEmpty() && this.f23574c.getLast().d() >= i10) {
            this.f23574c.removeLast();
        }
    }

    public final void m(Bundle bundle, k kVar) {
        T t10 = this.f23572a;
        if (t10 != null) {
            kVar.a(t10);
            return;
        }
        if (this.f23574c == null) {
            this.f23574c = new LinkedList<>();
        }
        this.f23574c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f23573b;
            if (bundle2 == null) {
                this.f23573b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f23575d);
    }
}
