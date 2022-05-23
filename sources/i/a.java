package i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class a implements TransformationMethod {
    public Locale f13898a;

    public a(Context context) {
        this.f13898a = context.getResources().getConfiguration().locale;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f13898a);
        }
        return null;
    }

    @Override
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}
