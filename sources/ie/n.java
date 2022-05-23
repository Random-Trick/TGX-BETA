package ie;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.ArrayList;

public class n extends StateListDrawable {
    public final ArrayList<Drawable> f14269a = new ArrayList<>();

    public ArrayList<Drawable> a() {
        return this.f14269a;
    }

    @Override
    public void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
        if (!this.f14269a.contains(drawable)) {
            this.f14269a.add(drawable);
        }
    }
}
