package p111he;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.ArrayList;

public class C5130n extends StateListDrawable {
    public final ArrayList<Drawable> f17199a = new ArrayList<>();

    public ArrayList<Drawable> m23862a() {
        return this.f17199a;
    }

    @Override
    public void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
        if (!this.f17199a.contains(drawable)) {
            this.f17199a.add(drawable);
        }
    }
}
