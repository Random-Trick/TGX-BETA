package org.thunderdog.challegram.v;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import ce.j0;
import org.thunderdog.challegram.Log;

public class EditTextBase extends EditText {
    public boolean f20157a;
    public b f20158b;

    public static class a extends InputConnectionWrapper {
        public final EditTextBase f20159a;

        public a(EditTextBase editTextBase, InputConnection inputConnection, boolean z10) {
            super(inputConnection, z10);
            this.f20159a = editTextBase;
        }

        @Override
        public boolean deleteSurroundingText(int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i10, i11);
        }

        @Override
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && this.f20159a.y()) {
                return false;
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    public interface b {
        boolean a(EditTextBase editTextBase, Editable editable, int i10, int i11);
    }

    public EditTextBase(Context context) {
        super(context);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f20158b == null) {
            return super.onCreateInputConnection(editorInfo);
        }
        return new a(this, super.onCreateInputConnection(editorInfo), true);
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && keyEvent.getAction() == 0 && y()) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        org.thunderdog.challegram.a r10;
        if (this.f20157a || i10 != 4 || keyEvent.getAction() != 0 || (((r10 = j0.r(getContext())) == null || !r10.D0(true, true, false)) && !x())) {
            return super.onKeyPreIme(i10, keyEvent);
        }
        return true;
    }

    public void setBackspaceListener(b bVar) {
        this.f20158b = bVar;
    }

    public void setIgnoreCustomStuff(boolean z10) {
        this.f20157a = z10;
    }

    @Override
    public void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Throwable th) {
            Log.e("Cannot set selection for range %d..%d for length %d", th, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(getText().length()));
        }
    }

    public void setUseIncognitoKeyboard(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        setImeOptions(i10 | 16777216);
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        b bVar = this.f20158b;
        return bVar != null && bVar.a(this, getText(), getSelectionStart(), getSelectionEnd());
    }

    public EditTextBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditTextBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Throwable th) {
            Log.e("Cannot set selection for index %d for length %d", th, Integer.valueOf(i10), Integer.valueOf(getText().length()));
        }
    }
}
