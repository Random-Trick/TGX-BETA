package p070f1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0024c;
import p016b1.C1132h;

public final class C4217k {

    public static class ActionMode$CallbackC4218a implements ActionMode.Callback {
        public Method f14237M;
        public boolean f14238N;
        public boolean f14239O = false;
        public final ActionMode.Callback f14240a;
        public final TextView f14241b;
        public Class<?> f14242c;

        public ActionMode$CallbackC4218a(ActionMode.Callback callback, TextView textView) {
            this.f14240a = callback;
            this.f14241b = textView;
        }

        public final Intent m28403a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent m28402b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m28403a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m28400d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> m28401c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m28403a(), 0)) {
                if (m28399e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        public final boolean m28400d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean m28399e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void m28398f(Menu menu) {
            Method method;
            Context context = this.f14241b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f14239O) {
                this.f14239O = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f14242c = cls;
                    this.f14237M = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f14238N = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f14242c = null;
                    this.f14237M = null;
                    this.f14238N = false;
                }
            }
            try {
                if (!this.f14238N || !this.f14242c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.f14237M;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c = m28401c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m28402b(resolveInfo, this.f14241b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f14240a.onActionItemClicked(actionMode, menuItem);
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f14240a.onCreateActionMode(actionMode, menu);
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f14240a.onDestroyActionMode(actionMode);
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m28398f(menu);
            return this.f14240a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int m28417a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int m28416b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int m28415c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static TextDirectionHeuristic m28414d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    public static C0024c.C0025a m28413e(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0024c.C0025a(textView.getTextMetricsParams());
        }
        C0024c.C0025a.C0026a aVar = new C0024c.C0025a.C0026a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            aVar.m42567b(textView.getBreakStrategy());
            aVar.m42566c(textView.getHyphenationFrequency());
        }
        if (i >= 18) {
            aVar.m42565d(m28414d(textView));
        }
        return aVar.m42568a();
    }

    public static void m28412f(TextView textView, ColorStateList colorStateList) {
        C1132h.m38325e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof AbstractC4220m) {
            ((AbstractC4220m) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void m28411g(TextView textView, PorterDuff.Mode mode) {
        C1132h.m38325e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof AbstractC4220m) {
            ((AbstractC4220m) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void m28410h(TextView textView, int i) {
        int i2;
        C1132h.m38326d(i);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (i3 < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void m28409i(TextView textView, int i) {
        int i2;
        C1132h.m38326d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void m28408j(TextView textView, int i) {
        C1132h.m38326d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void m28407k(TextView textView, C0024c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(cVar.m42574b());
        } else if (m28413e(textView).m42573a(cVar.m42575a())) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void m28406l(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void m28405m(TextView textView, C0024c.C0025a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setTextDirection(m28415c(aVar.m42570d()));
        }
        if (i < 23) {
            float textScaleX = aVar.m42569e().getTextScaleX();
            textView.getPaint().set(aVar.m42569e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.m42569e());
        textView.setBreakStrategy(aVar.m42572b());
        textView.setHyphenationFrequency(aVar.m42571c());
    }

    public static ActionMode.Callback m28404n(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC4218a) || callback == null) ? callback : new ActionMode$CallbackC4218a(callback, textView);
    }
}
