package p127j;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class Window$CallbackC5826i implements Window.Callback {
    public final Window.Callback f18603a;

    public Window$CallbackC5826i(Window.Callback callback) {
        if (callback != null) {
            this.f18603a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback m22063a() {
        return this.f18603a;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18603a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f18603a.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f18603a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18603a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18603a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18603a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        this.f18603a.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        this.f18603a.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        this.f18603a.onAttachedToWindow();
    }

    @Override
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f18603a.onCreatePanelMenu(i, menu);
    }

    @Override
    public View onCreatePanelView(int i) {
        return this.f18603a.onCreatePanelView(i);
    }

    @Override
    public void onDetachedFromWindow() {
        this.f18603a.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f18603a.onMenuItemSelected(i, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f18603a.onMenuOpened(i, menu);
    }

    @Override
    public void onPanelClosed(int i, Menu menu) {
        this.f18603a.onPanelClosed(i, menu);
    }

    @Override
    public void onPointerCaptureChanged(boolean z) {
        this.f18603a.onPointerCaptureChanged(z);
    }

    @Override
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f18603a.onPreparePanel(i, view, menu);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f18603a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f18603a.onSearchRequested(searchEvent);
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18603a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z) {
        this.f18603a.onWindowFocusChanged(z);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f18603a.onWindowStartingActionMode(callback);
    }

    @Override
    public boolean onSearchRequested() {
        return this.f18603a.onSearchRequested();
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f18603a.onWindowStartingActionMode(callback, i);
    }
}
