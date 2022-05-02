package p112i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class C5158a implements TransformationMethod {
    public Locale f17254a;

    public C5158a(Context context) {
        this.f17254a = context.getResources().getConfiguration().locale;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f17254a);
        }
        return null;
    }

    @Override
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
