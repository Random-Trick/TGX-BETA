package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import d.i;

public class d extends ContextWrapper {
    public int f14921a;
    public Resources.Theme f14922b;
    public LayoutInflater f14923c;
    public Configuration f14924d;
    public Resources f14925e;

    public d() {
        super(null);
    }

    public final Resources a() {
        if (this.f14925e == null) {
            Configuration configuration = this.f14924d;
            if (configuration == null) {
                this.f14925e = super.getResources();
            } else {
                this.f14925e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f14925e;
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f14921a;
    }

    public final void c() {
        boolean z10 = this.f14922b == null;
        if (z10) {
            this.f14922b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f14922b.setTo(theme);
            }
        }
        d(this.f14922b, this.f14921a, z10);
    }

    public void d(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public Resources getResources() {
        return a();
    }

    @Override
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f14923c == null) {
            this.f14923c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f14923c;
    }

    @Override
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14922b;
        if (theme != null) {
            return theme;
        }
        if (this.f14921a == 0) {
            this.f14921a = i.f5968c;
        }
        c();
        return this.f14922b;
    }

    @Override
    public void setTheme(int i10) {
        if (this.f14921a != i10) {
            this.f14921a = i10;
            c();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f14921a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f14922b = theme;
    }
}
