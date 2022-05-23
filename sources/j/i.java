package j;

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

public class i implements Window.Callback {
    public final Window.Callback f14977a;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f14977a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f14977a;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f14977a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f14977a.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f14977a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f14977a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f14977a.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f14977a.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        this.f14977a.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        this.f14977a.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        this.f14977a.onAttachedToWindow();
    }

    @Override
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f14977a.onCreatePanelMenu(i10, menu);
    }

    @Override
    public View onCreatePanelView(int i10) {
        return this.f14977a.onCreatePanelView(i10);
    }

    @Override
    public void onDetachedFromWindow() {
        this.f14977a.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f14977a.onMenuItemSelected(i10, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f14977a.onMenuOpened(i10, menu);
    }

    @Override
    public void onPanelClosed(int i10, Menu menu) {
        this.f14977a.onPanelClosed(i10, menu);
    }

    @Override
    public void onPointerCaptureChanged(boolean z10) {
        this.f14977a.onPointerCaptureChanged(z10);
    }

    @Override
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f14977a.onPreparePanel(i10, view, menu);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f14977a.onProvideKeyboardShortcuts(list, menu, i10);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f14977a.onSearchRequested(searchEvent);
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f14977a.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        this.f14977a.onWindowFocusChanged(z10);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f14977a.onWindowStartingActionMode(callback);
    }

    @Override
    public boolean onSearchRequested() {
        return this.f14977a.onSearchRequested();
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f14977a.onWindowStartingActionMode(callback, i10);
    }
}
