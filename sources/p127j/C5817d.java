package p127j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p039d.C3562i;

public class C5817d extends ContextWrapper {
    public int f18535a;
    public Resources.Theme f18536b;
    public LayoutInflater f18537c;
    public Configuration f18538d;
    public Resources f18539e;

    public C5817d() {
        super(null);
    }

    public final Resources m22109a() {
        if (this.f18539e == null) {
            Configuration configuration = this.f18538d;
            if (configuration == null) {
                this.f18539e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f18539e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f18539e;
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int m22108b() {
        return this.f18535a;
    }

    public final void m22107c() {
        boolean z = this.f18536b == null;
        if (z) {
            this.f18536b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18536b.setTo(theme);
            }
        }
        m22106d(this.f18536b, this.f18535a, z);
    }

    public void m22106d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public Resources getResources() {
        return m22109a();
    }

    @Override
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f18537c == null) {
            this.f18537c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f18537c;
    }

    @Override
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f18536b;
        if (theme != null) {
            return theme;
        }
        if (this.f18535a == 0) {
            this.f18535a = C3562i.c;
        }
        m22107c();
        return this.f18536b;
    }

    @Override
    public void setTheme(int i) {
        if (this.f18535a != i) {
            this.f18535a = i;
            m22107c();
        }
    }

    public C5817d(Context context, int i) {
        super(context);
        this.f18535a = i;
    }

    public C5817d(Context context, Resources.Theme theme) {
        super(context);
        this.f18536b = theme;
    }
}
