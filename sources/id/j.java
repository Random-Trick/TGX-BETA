package id;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public class j extends InputConnectionWrapper {
    public final TextView f14215a;

    public j(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f14215a = textView;
    }

    public static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return m.a(inputConnection, editable, i10, i11, z10);
    }

    public final Editable a() {
        return this.f14215a.getEditableText();
    }

    @Override
    public boolean deleteSurroundingText(int i10, int i11) {
        return b(this, a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return b(this, a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
