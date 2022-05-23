package f1;

import a1.b;
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
import b1.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class k {

    public static class a implements ActionMode.Callback {
        public Method M;
        public boolean N;
        public boolean O = false;
        public final ActionMode.Callback f11784a;
        public final TextView f11785b;
        public Class<?> f11786c;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f11784a = callback;
            this.f11785b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        public final boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean e(ResolveInfo resolveInfo, Context context) {
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

        public final void f(Menu menu) {
            Method method;
            Context context = this.f11785b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.O) {
                this.O = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f11786c = cls;
                    this.M = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.N = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f11786c = null;
                    this.M = null;
                    this.N = false;
                }
            }
            try {
                if (!this.N || !this.f11786c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    method = this.M;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f11785b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f11784a.onActionItemClicked(actionMode, menuItem);
        }

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f11784a.onCreateActionMode(actionMode, menu);
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f11784a.onDestroyActionMode(actionMode);
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f11784a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic textDirectionHeuristic) {
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

    public static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z10 = true;
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
                    if (z10) {
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

    public static b.a e(TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new b.a(textView.getTextMetricsParams());
        }
        b.a.C0005a aVar = new b.a.C0005a(new TextPaint(textView.getPaint()));
        if (i10 >= 23) {
            aVar.b(textView.getBreakStrategy());
            aVar.c(textView.getHyphenationFrequency());
        }
        aVar.d(d(textView));
        return aVar.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        h.e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof l) {
            ((l) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        h.e(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof l) {
            ((l) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void h(TextView textView, int i10) {
        int i11;
        h.d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.top;
        } else {
            i11 = fontMetricsInt.ascent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int i10) {
        int i11;
        h.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i11 = fontMetricsInt.bottom;
        } else {
            i11 = fontMetricsInt.descent;
        }
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void j(TextView textView, int i10) {
        h.d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void k(TextView textView, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(bVar.b());
        } else if (e(textView).a(bVar.a())) {
            textView.setText(bVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void l(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static void m(TextView textView, b.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        textView.setTextDirection(c(aVar.d()));
        if (i10 < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    public static ActionMode.Callback n(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
