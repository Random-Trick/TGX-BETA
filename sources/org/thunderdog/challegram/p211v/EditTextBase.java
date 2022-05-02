package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import be.C1379j0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;

public class EditTextBase extends EditText {
    public boolean f25732a;
    public AbstractC7923b f25733b;

    public static class C7922a extends InputConnectionWrapper {
        public final EditTextBase f25734a;

        public C7922a(EditTextBase editTextBase, InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
            this.f25734a = editTextBase;
        }

        @Override
        public boolean deleteSurroundingText(int i, int i2) {
            if (i == 0 && i2 == 0) {
                return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }

        @Override
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && this.f25734a.m14155y()) {
                return false;
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    public interface AbstractC7923b {
        boolean mo14154a(EditTextBase editTextBase, Editable editable, int i, int i2);
    }

    public EditTextBase(Context context) {
        super(context);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f25733b == null) {
            return super.onCreateInputConnection(editorInfo);
        }
        return new C7922a(this, super.onCreateInputConnection(editorInfo), true);
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && keyEvent.getAction() == 0 && m14155y()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AbstractView$OnTouchListenerC7889a r;
        if (this.f25732a || i != 4 || keyEvent.getAction() != 0 || (((r = C1379j0.m37310r(getContext())) == null || !r.m14621A0(true, true, false)) && !m14156x())) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    public void setBackspaceListener(AbstractC7923b bVar) {
        this.f25733b = bVar;
    }

    public void setIgnoreCustomStuff(boolean z) {
        this.f25732a = z;
    }

    @Override
    public void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (Throwable th) {
            Log.m14725e("Cannot set selection for range %d..%d for length %d", th, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(getText().length()));
        }
    }

    public void setUseIncognitoKeyboard(int i) {
        int i2 = Build.VERSION.SDK_INT;
        setImeOptions(i | 16777216);
    }

    public boolean m14156x() {
        return false;
    }

    public boolean m14155y() {
        AbstractC7923b bVar = this.f25733b;
        return bVar != null && bVar.mo14154a(this, getText(), getSelectionStart(), getSelectionEnd());
    }

    public EditTextBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditTextBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override
    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (Throwable th) {
            Log.m14725e("Cannot set selection for index %d for length %d", th, Integer.valueOf(i), Integer.valueOf(getText().length()));
        }
    }
}
