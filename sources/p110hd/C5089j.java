package p110hd;

import android.os.Build;
import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public class C5089j extends InputConnectionWrapper {
    public final TextView f17123a;

    public C5089j(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f17123a = textView;
    }

    public static boolean m23970b(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C5092m.m23965a(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    public final Editable m23971a() {
        return this.f17123a.getEditableText();
    }

    @Override
    public boolean deleteSurroundingText(int i, int i2) {
        return m23970b(this, m23971a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return m23970b(this, m23971a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
