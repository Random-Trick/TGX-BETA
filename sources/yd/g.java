package yd;

import ae.p;
import ae.z;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.p0;
import gd.w;
import ib.d;
import java.lang.reflect.Field;
import oc.l;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.v4;

public class g {
    public static int b(Canvas canvas, Path path) {
        if (path != null) {
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

    public static Drawable c(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static Drawable d(Context context, int i10, ColorFilter colorFilter) {
        Drawable c10 = c(context, i10);
        c10.setColorFilter(colorFilter);
        return c10;
    }

    public static void e(DatePickerDialog datePickerDialog, DialogInterface dialogInterface) {
        datePickerDialog.getDatePicker();
        try {
            Field declaredField = DatePickerDialog.class.getDeclaredField("mDatePicker");
            declaredField.setAccessible(true);
            DatePicker datePicker = (DatePicker) declaredField.get(datePickerDialog);
            int identifier = Resources.getSystem().getIdentifier("day_picker_selector_layout", "id", "android");
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier("date_picker_header", "id", "android");
            }
            p j10 = z.u().j(false);
            View findViewById = datePicker.findViewById(identifier);
            if (findViewById != null) {
                int c10 = d.c(j10.e(R.id.theme_color_headerBackground), j10.e(R.id.theme_color_headerPickerBackground));
                int c11 = d.c(j10.e(R.id.theme_color_headerText), j10.e(R.id.theme_color_headerPickerText));
                findViewById.setBackgroundColor(c10);
                int identifier2 = Resources.getSystem().getIdentifier("date_picker_header_year", "id", "android");
                if (identifier2 != 0) {
                    View findViewById2 = findViewById.findViewById(identifier2);
                    if (findViewById2 instanceof TextView) {
                        ((TextView) findViewById2).setTextColor(c11);
                    }
                }
                int identifier3 = Resources.getSystem().getIdentifier("date_picker_header_date", "id", "android");
                if (identifier3 != 0) {
                    View findViewById3 = findViewById.findViewById(identifier3);
                    if (findViewById3 instanceof TextView) {
                        ((TextView) findViewById3).setTextColor(c11);
                    }
                }
            }
        } catch (Throwable th) {
            Log.i(th);
        }
        try {
            View q02 = p0.q0(datePickerDialog.getContext(), datePickerDialog, "date_picker_day_picker");
            if (q02 != null && (q02.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q02.getLayoutParams();
                layoutParams.gravity = 1;
                q02.setLayoutParams(layoutParams);
            }
        } catch (Throwable th2) {
            Log.i(th2);
        }
    }

    public static void f(Canvas canvas, int i10) {
        if (i10 != Integer.MIN_VALUE) {
            canvas.restoreToCount(i10);
        }
    }

    public static void g(View view) {
        view.setTranslationZ(a0.i(4.0f));
    }

    public static void h(View view, View view2, boolean z10) {
        if (z10) {
            view.setElevation(view2.getElevation() + 1.0f);
        }
        view.setTranslationZ(view2.getTranslationZ() + 1.0f);
    }

    public static l i(View view, int i10, v4<?> v4Var) {
        l lVar;
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        if (background instanceof l) {
            lVar = (l) background;
            lVar.d(i10);
        } else {
            lVar = new l(i10);
            db.g.d(view, lVar);
        }
        if (v4Var == null) {
            return lVar;
        }
        v4Var.t8(view);
        return lVar;
    }

    public static void j(View view, int i10) {
        i(view, i10, null);
    }

    public static void k(final DatePickerDialog datePickerDialog) {
        datePickerDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                g.e(datePickerDialog, dialogInterface);
            }
        });
        datePickerDialog.setButton(-1, w.i1(R.string.OK), datePickerDialog);
        datePickerDialog.setButton(-2, w.i1(R.string.Cancel), datePickerDialog);
        datePickerDialog.show();
        a.P1(datePickerDialog.getContext(), datePickerDialog, null);
    }

    public static void l(TimePickerDialog timePickerDialog) {
        timePickerDialog.setButton(-1, w.i1(R.string.OK), timePickerDialog);
        timePickerDialog.setButton(-2, w.i1(R.string.Cancel), timePickerDialog);
        timePickerDialog.show();
        a.P1(timePickerDialog.getContext(), timePickerDialog, null);
    }
}
