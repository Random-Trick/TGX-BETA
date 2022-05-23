package zd;

import ae.j;
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
import ce.a0;
import ce.c;
import ce.j0;
import ce.o;
import ce.v;
import ce.z;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class qb {
    public static TextPaint f28277a;
    public static TextPaint f28278b;
    public static Paint f28279c;
    public static Paint f28280d;
    public static final float f28281e;

    static {
        f28281e = Build.VERSION.SDK_INT >= 24 ? 1.5f : 2.5f;
    }

    public static Bitmap a(o6 o6Var, TdApi.Chat chat, boolean z10) {
        if (o6Var.l7(chat)) {
            return c(o6Var);
        }
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        return b(o6Var, chatPhotoInfo != null ? chatPhotoInfo.small : null, o6Var.f3(chat), o6Var.n3(chat), true, z10);
    }

    public static android.graphics.Bitmap b(zd.o6 r10, org.drinkless.td.libcore.telegram.TdApi.File r11, int r12, je.e r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: zd.qb.b(zd.o6, org.drinkless.td.libcore.telegram.TdApi$File, int, je.e, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap c(o6 o6Var) {
        Bitmap bitmap;
        Throwable th;
        synchronized (qb.class) {
            if (f28279c == null) {
                Paint paint = new Paint(5);
                f28279c = paint;
                paint.setStyle(Paint.Style.FILL);
                Paint paint2 = new Paint(7);
                f28280d = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                TextPaint textPaint = new TextPaint(5);
                f28277a = textPaint;
                textPaint.setTypeface(o.i());
                f28277a.setColor(-1);
                TextPaint textPaint2 = new TextPaint(5);
                f28278b = textPaint2;
                textPaint2.setTypeface(o.k());
                f28278b.setColor(-1);
            }
            TextPaint textPaint3 = f28277a;
            float f10 = f28281e;
            textPaint3.setTextSize(a0.j(20.0f, f10));
            f28278b.setTextSize(a0.j(20.0f, f10));
            Bitmap bitmap2 = null;
            try {
                int d10 = d();
                bitmap = Bitmap.createBitmap(d10, d10, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int M = j.M(R.id.theme_color_avatarSavedMessages, o6Var.tc().M());
                f28280d.setColor(M);
                f28279c.setColor(M);
                canvas.drawCircle(d10 / 2, d10 / 2, d10 / 2, f28279c);
                Drawable g10 = c.g(j0.B(), R.drawable.baseline_bookmark_24);
                float i10 = d10 / a0.i(44.0f);
                int i11 = (i10 > 1.0f ? 1 : (i10 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(i10, i10, d10 / 2, d10 / 2);
                }
                c.b(canvas, g10, (d10 / 2) - (g10.getMinimumWidth() / 2), (d10 / 2) - (g10.getMinimumHeight() / 2), z.b(R.id.theme_color_avatar_content));
                if (i11 != 0) {
                    canvas.restore();
                }
                try {
                    v0.v2(canvas);
                } catch (Throwable th2) {
                    th = th2;
                    bitmap2 = bitmap;
                    Log.e(4, "Cannot build large icon", th, new Object[0]);
                    bitmap = bitmap2;
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return bitmap;
    }

    public static int d() {
        return a0.j(52.0f, f28281e);
    }

    public static Intent e(int i10, long j10, long j11) {
        return j10 != 0 ? v.Q(i10, j10, j11) : v.T(i10);
    }

    public static PendingIntent f(int i10, long j10, long j11) {
        return PendingIntent.getActivity(j0.q(), 0, j10 != 0 ? v.Q(i10, j10, j11) : v.T(i10), Log.TAG_TDLIB_OPTIONS);
    }
}
