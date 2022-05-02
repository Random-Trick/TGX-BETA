package p350yd;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1389o;
import be.C1405v;
import be.C1411z;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class C10996sb {
    public static TextPaint f35305a;
    public static TextPaint f35306b;
    public static Paint f35307c;
    public static Paint f35308d;
    public static final float f35309e;

    static {
        f35309e = Build.VERSION.SDK_INT >= 24 ? 1.5f : 2.5f;
    }

    public static Bitmap m2030a(C10930q6 q6Var, TdApi.Chat chat, boolean z) {
        if (q6Var.m2427h7(chat)) {
            return m2028c(q6Var);
        }
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        return m2029b(q6Var, chatPhotoInfo != null ? chatPhotoInfo.small : null, q6Var.m2495d3(chat), q6Var.m2383k3(chat), true, z);
    }

    public static android.graphics.Bitmap m2029b(p350yd.C10930q6 r10, org.drinkless.p210td.libcore.telegram.TdApi.File r11, int r12, ie.C5386e r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: p350yd.C10996sb.m2029b(yd.q6, org.drinkless.td.libcore.telegram.TdApi$File, int, ie.e, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap m2028c(C10930q6 q6Var) {
        Bitmap bitmap;
        Throwable th;
        synchronized (C10996sb.class) {
            if (f35307c == null) {
                Paint paint = new Paint(5);
                f35307c = paint;
                paint.setStyle(Paint.Style.FILL);
                Paint paint2 = new Paint(7);
                f35308d = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                TextPaint textPaint = new TextPaint(5);
                f35305a = textPaint;
                textPaint.setTypeface(C1389o.m37263i());
                f35305a.setColor(-1);
                TextPaint textPaint2 = new TextPaint(5);
                f35306b = textPaint2;
                textPaint2.setTypeface(C1389o.m37261k());
                f35306b.setColor(-1);
            }
            TextPaint textPaint3 = f35305a;
            float f = f35309e;
            textPaint3.setTextSize(C1357a0.m37543j(20.0f, f));
            f35306b.setTextSize(C1357a0.m37543j(20.0f, f));
            Bitmap bitmap2 = null;
            try {
                int d = m2027d();
                bitmap = Bitmap.createBitmap(d, d, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int O = C11524j.m226O(R.id.theme_color_avatarSavedMessages, q6Var.m2294pc().m4144M());
                f35308d.setColor(O);
                f35307c.setColor(O);
                canvas.drawCircle(d / 2, d / 2, d / 2, f35307c);
                Drawable g = C1362c.m37485g(C1379j0.m37375B(), R.drawable.baseline_bookmark_24);
                float i = d / C1357a0.m37544i(44.0f);
                int i2 = (i > 1.0f ? 1 : (i == 1.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.scale(i, i, d / 2, d / 2);
                }
                C1362c.m37490b(canvas, g, (d / 2) - (g.getMinimumWidth() / 2), (d / 2) - (g.getMinimumHeight() / 2), C1411z.m37001b(R.id.theme_color_avatar_content));
                if (i2 != 0) {
                    canvas.restore();
                }
                try {
                    C7389v0.m16571v2(canvas);
                } catch (Throwable th2) {
                    th = th2;
                    bitmap2 = bitmap;
                    Log.m14728e(4, "Cannot build large icon", th, new Object[0]);
                    bitmap = bitmap2;
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return bitmap;
    }

    public static int m2027d() {
        return C1357a0.m37543j(52.0f, f35309e);
    }

    public static Intent m2026e(int i, long j, long j2) {
        return j != 0 ? C1405v.m37128R(i, j, j2) : C1405v.m37125U(i);
    }

    public static PendingIntent m2025f(int i, long j, long j2) {
        return PendingIntent.getActivity(C1379j0.m37312q(), 0, j != 0 ? C1405v.m37128R(i, j, j2) : C1405v.m37125U(i), Log.TAG_TDLIB_OPTIONS);
    }
}
