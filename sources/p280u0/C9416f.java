package p280u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class C9416f extends Drawable.ConstantState {
    public int f30475a;
    public Drawable.ConstantState f30476b;
    public ColorStateList f30477c;
    public PorterDuff.Mode f30478d;

    public C9416f(C9416f fVar) {
        this.f30477c = null;
        this.f30478d = C9414d.f30467P;
        if (fVar != null) {
            this.f30475a = fVar.f30475a;
            this.f30476b = fVar.f30476b;
            this.f30477c = fVar.f30477c;
            this.f30478d = fVar.f30478d;
        }
    }

    public boolean m8743a() {
        return this.f30476b != null;
    }

    @Override
    public int getChangingConfigurations() {
        int i = this.f30475a;
        Drawable.ConstantState constantState = this.f30476b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C9415e(this, resources);
        }
        return new C9414d(this, resources);
    }
}
