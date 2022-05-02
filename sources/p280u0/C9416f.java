package p280u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class C9416f extends Drawable.ConstantState {
    public int f30472a;
    public Drawable.ConstantState f30473b;
    public ColorStateList f30474c;
    public PorterDuff.Mode f30475d;

    public C9416f(C9416f fVar) {
        this.f30474c = null;
        this.f30475d = C9414d.f30464P;
        if (fVar != null) {
            this.f30472a = fVar.f30472a;
            this.f30473b = fVar.f30473b;
            this.f30474c = fVar.f30474c;
            this.f30475d = fVar.f30475d;
        }
    }

    public boolean m8743a() {
        return this.f30473b != null;
    }

    @Override
    public int getChangingConfigurations() {
        int i = this.f30472a;
        Drawable.ConstantState constantState = this.f30473b;
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
