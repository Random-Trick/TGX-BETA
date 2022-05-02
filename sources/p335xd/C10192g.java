package p335xd;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1399s0;
import java.lang.reflect.Field;
import nc.C7368l;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p082fd.C4403w;
import p108hb.C5064d;
import p364zd.AbstractC11531p;
import p364zd.C11541z;
import td.AbstractC9323v4;

public class C10192g {
    public static int m5789b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 19 && path != null) {
            int save = canvas.save();
            try {
                canvas.clipPath(path);
                return save;
            } catch (Throwable unused) {
                canvas.restoreToCount(save);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static Drawable m5788c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static Drawable m5787d(Context context, int i, ColorFilter colorFilter) {
        Drawable c = m5788c(context, i);
        c.setColorFilter(colorFilter);
        return c;
    }

    public static void m5786e(DatePickerDialog datePickerDialog, DialogInterface dialogInterface) {
        datePickerDialog.getDatePicker();
        try {
            Field declaredField = DatePickerDialog.class.getDeclaredField("mDatePicker");
            declaredField.setAccessible(true);
            DatePicker datePicker = (DatePicker) declaredField.get(datePickerDialog);
            int identifier = Resources.getSystem().getIdentifier("day_picker_selector_layout", "id", "android");
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier("date_picker_header", "id", "android");
            }
            AbstractC11531p j = C11541z.m7t().m19j(false);
            View findViewById = datePicker.findViewById(identifier);
            if (findViewById != null) {
                int c = C5064d.m24130c(j.mo92e(R.id.theme_color_headerBackground), j.mo92e(R.id.theme_color_headerPickerBackground));
                int c2 = C5064d.m24130c(j.mo92e(R.id.theme_color_headerText), j.mo92e(R.id.theme_color_headerPickerText));
                findViewById.setBackgroundColor(c);
                int identifier2 = Resources.getSystem().getIdentifier("date_picker_header_year", "id", "android");
                if (identifier2 != 0) {
                    View findViewById2 = findViewById.findViewById(identifier2);
                    if (findViewById2 instanceof TextView) {
                        ((TextView) findViewById2).setTextColor(c2);
                    }
                }
                int identifier3 = Resources.getSystem().getIdentifier("date_picker_header_date", "id", "android");
                if (identifier3 != 0) {
                    View findViewById3 = findViewById.findViewById(identifier3);
                    if (findViewById3 instanceof TextView) {
                        ((TextView) findViewById3).setTextColor(c2);
                    }
                }
            }
        } catch (Throwable th) {
            Log.m14718i(th);
        }
        try {
            View x0 = C1399s0.m37150x0(datePickerDialog.getContext(), datePickerDialog, "date_picker_day_picker");
            if (x0 != null && (x0.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x0.getLayoutParams();
                layoutParams.gravity = 1;
                x0.setLayoutParams(layoutParams);
            }
        } catch (Throwable th2) {
            Log.m14718i(th2);
        }
    }

    public static void m5785f(Canvas canvas, int i) {
        if (i != Integer.MIN_VALUE) {
            canvas.restoreToCount(i);
        }
    }

    public static void m5784g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(C1357a0.m37544i(4.0f));
        }
    }

    public static void m5783h(View view, View view2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (z) {
                view.setElevation(view2.getElevation() + 1.0f);
            }
            view.setTranslationZ(view2.getTranslationZ() + 1.0f);
        }
    }

    public static C7368l m5782i(View view, int i, AbstractC9323v4<?> v4Var) {
        C7368l lVar;
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        if (background instanceof C7368l) {
            lVar = (C7368l) background;
            lVar.m16761d(i);
        } else {
            lVar = new C7368l(i);
            C2065g.m35721d(view, lVar);
        }
        if (v4Var == null) {
            return lVar;
        }
        v4Var.m9163t8(view);
        return lVar;
    }

    public static void m5781j(View view, int i) {
        m5782i(view, i, null);
    }

    public static void m5780k(final DatePickerDialog datePickerDialog) {
        if (Build.VERSION.SDK_INT >= 21) {
            datePickerDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    C10192g.m5786e(datePickerDialog, dialogInterface);
                }
            });
        }
        datePickerDialog.setButton(-1, C4403w.m27871i1(R.string.OK), datePickerDialog);
        datePickerDialog.setButton(-2, C4403w.m27871i1(R.string.Cancel), datePickerDialog);
        datePickerDialog.show();
        AbstractView$OnTouchListenerC7889a.m14555O1(datePickerDialog.getContext(), datePickerDialog, null);
    }

    public static void m5779l(TimePickerDialog timePickerDialog) {
        timePickerDialog.setButton(-1, C4403w.m27871i1(R.string.OK), timePickerDialog);
        timePickerDialog.setButton(-2, C4403w.m27871i1(R.string.Cancel), timePickerDialog);
        timePickerDialog.show();
        AbstractView$OnTouchListenerC7889a.m14555O1(timePickerDialog.getContext(), timePickerDialog, null);
    }
}
