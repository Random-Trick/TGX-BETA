package p028c1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C1452f {
    public static boolean f5303a = false;
    public static Method f5304b = null;
    public static boolean f5305c = false;
    public static Field f5306d;

    public interface AbstractC1453a {
        boolean mo14006g(KeyEvent keyEvent);
    }

    public static boolean m36891a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f5303a) {
            try {
                f5304b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f5303a = true;
        }
        Method method = f5304b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static boolean m36890b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m36891a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1489y.m36736f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    public static boolean m36889c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m36886f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1489y.m36736f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean m36888d(View view, KeyEvent keyEvent) {
        return C1489y.m36734g(view, keyEvent);
    }

    public static boolean m36887e(AbstractC1453a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo14006g(keyEvent);
        }
        if (callback instanceof Activity) {
            return m36890b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m36889c((Dialog) callback, keyEvent);
        }
        return (view != null && C1489y.m36736f(view, keyEvent)) || aVar.mo14006g(keyEvent);
    }

    public static DialogInterface.OnKeyListener m36886f(Dialog dialog) {
        if (!f5305c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f5306d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5305c = true;
        }
        Field field = f5306d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
