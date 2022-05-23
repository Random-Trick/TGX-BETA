package u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class f extends Drawable.ConstantState {
    public int f23460a;
    public Drawable.ConstantState f23461b;
    public ColorStateList f23462c;
    public PorterDuff.Mode f23463d;

    public f(f fVar) {
        this.f23462c = null;
        this.f23463d = d.P;
        if (fVar != null) {
            this.f23460a = fVar.f23460a;
            this.f23461b = fVar.f23461b;
            this.f23462c = fVar.f23462c;
            this.f23463d = fVar.f23463d;
        }
    }

    public boolean a() {
        return this.f23461b != null;
    }

    @Override
    public int getChangingConfigurations() {
        int i10 = this.f23460a;
        Drawable.ConstantState constantState = this.f23461b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override
    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
