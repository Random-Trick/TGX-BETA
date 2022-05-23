package ce;

import ae.j;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import eb.i;
import eb.n;
import gd.w;
import ib.d;
import ib.h;
import java.util.Arrays;
import java.util.Iterator;
import je.g;
import je.k;
import ld.v;
import ne.i3;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import sd.f;

public class b {
    public static final int[] f5224a = {-1430998, -1381846, -13964758, -13964566, -14013718, -1430806, -1430998};
    public static RectF f5225b;

    public static class a {
        public static final float[] f5226k = {0.9f, 0.3f, 0.7f, 0.2f};
        public static final float[] f5227l = {0.1f, 0.3f, 0.7f, 0.9f};
        public final Paint f5228a;
        public int f5229b = -1;
        public int f5230c = -1;
        public int f5231d = -1;
        public int f5232e = -1;
        public int f5233f;
        public int f5234g;
        public int[] f5235h;
        public RadialGradient[] f5236i;
        public float f5237j;

        public a() {
            Paint paint = new Paint(1);
            this.f5228a = paint;
            paint.setStyle(Paint.Style.FILL);
        }

        public boolean b(int i10, int i11, int i12, int i13, int i14, int i15) {
            if (this.f5229b == i10 && this.f5231d == i11 && this.f5230c == i12 && this.f5232e == i13 && this.f5233f == i14 && this.f5234g == i15) {
                return false;
            }
            this.f5235h = null;
            this.f5236i = null;
            this.f5229b = i10;
            this.f5231d = i11;
            this.f5230c = i12;
            this.f5232e = i13;
            this.f5233f = i14;
            this.f5234g = i15;
            this.f5228a.setDither(false);
            this.f5228a.setShader(new LinearGradient(i10, i11, i12, i13, i14, i15, Shader.TileMode.CLAMP));
            return true;
        }

        public boolean c(int i10, int i11, int[] iArr, float f10) {
            if (Arrays.equals(iArr, this.f5235h) && this.f5237j == f10) {
                return false;
            }
            this.f5235h = iArr;
            this.f5237j = f10;
            float min = Math.min(a0.f(), a0.g());
            if (iArr.length != 4) {
                min *= 2.0f;
            }
            this.f5236i = new RadialGradient[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                this.f5236i[i12] = new RadialGradient(i10 * f5226k[i12], i11 * f5227l[i12], min, d.a(f10, d.b(255, iArr[i12])), 0, Shader.TileMode.CLAMP);
            }
            this.f5228a.setDither(true);
            return true;
        }

        public void d(int i10) {
            this.f5228a.setShader(this.f5236i[i10]);
        }
    }

    public static int A(android.graphics.Canvas r27, zd.ic.b r28, float r29, float r30, int r31, ie.t r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: ce.b.A(android.graphics.Canvas, zd.ic$b, float, float, int, ie.t, int):int");
    }

    public static long B(Canvas canvas, float f10, float f11, int i10, boolean z10, long j10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            i13 = a0.i(20.0f);
            i12 = a0.i(8.5f);
            i11 = a0.i(3.0f);
        } else {
            i13 = a0.i(8.0f);
            i12 = a0.i(3.5f);
            i11 = a0.i(1.5f);
        }
        float uptimeMillis = (float) ((SystemClock.uptimeMillis() % 2000) / 2000.0d);
        RectF a02 = y.a0();
        for (int i14 = 0; i14 < 2; i14++) {
            float f12 = uptimeMillis < 0.0f ? uptimeMillis + 1.0f : uptimeMillis > 1.0f ? uptimeMillis - 1.0f : uptimeMillis;
            float f13 = f12 < 0.25f ? f12 / 0.25f : 1.0f - ((f12 - 0.25f) / 0.75f);
            float f14 = i13 + (i12 * 2.0f * f12);
            float f15 = (f12 * 6.0f) + 20.0f;
            a02.set(f10 - f14, f11 - f14, f10 + f14, f11 + f14);
            Paint Y = y.Y(d.a(f13, i10), i11);
            float f16 = f15 * 2.0f;
            canvas.drawArc(a02, -f15, f16, false, Y);
            canvas.drawArc(a02, 180.0f - f15, f16, false, Y);
            uptimeMillis += 0.5f;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (j10 == 0 || uptimeMillis2 >= j10) {
            return Math.max(v0.v(i12 * 2 * 3, 2000L), ValueAnimator.getFrameDelay());
        }
        return -1L;
    }

    public static float C(float f10, boolean z10, i<?> iVar, int i10) {
        float g10 = iVar.g() + i10;
        return z10 ? Math.max(a0.i(f10 - 2.0f) * 2, g10 + (a0.i(3.0f) * 2)) : g10;
    }

    public static int D(TdApi.ChatAction chatAction) {
        if (chatAction == null) {
            Log.w("[TYPING ICON BUG]: action == null", new Object[0]);
            return 0;
        }
        switch (chatAction.getConstructor()) {
            case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                return a0.i(36.0f);
            case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
            case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                return a0.i(20.0f);
            case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionTyping.CONSTRUCTOR:
                return a0.i(24.0f);
            case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
            case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                return a0.i(26.0f);
            default:
                return 0;
        }
    }

    public static boolean E(TdApi.ChatAction chatAction) {
        switch (chatAction.getConstructor()) {
            case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
            case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
            case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
            case TdApi.ChatActionTyping.CONSTRUCTOR:
            case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public static void a(Path path, RectF rectF, float f10, float f11, float f12, float f13) {
        if (f10 == f11 && f10 == f12 && f10 == f13) {
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float width = rectF.width();
            if (width == rectF.height() && f10 == width / 2.0f) {
                path.addCircle(centerX, centerY, f11, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            }
        } else {
            synchronized (b.class) {
                RectF rectF2 = f5225b;
                if (rectF2 == null) {
                    rectF2 = new RectF();
                    f5225b = rectF2;
                }
                path.moveTo(rectF.left, rectF.top - f10);
                if (f10 != 0.0f) {
                    float f14 = rectF.left;
                    float f15 = rectF.top;
                    float f16 = f10 * 2.0f;
                    rectF2.set(f14, f15, f14 + f16, f16 + f15);
                    path.arcTo(rectF2, -180.0f, 90.0f);
                }
                path.lineTo(rectF.right - f11, rectF.top);
                if (f11 != 0.0f) {
                    float f17 = rectF.right;
                    float f18 = f11 * 2.0f;
                    float f19 = rectF.top;
                    rectF2.set(f17 - f18, f19, f17, f18 + f19);
                    path.arcTo(rectF2, -90.0f, 90.0f);
                }
                path.lineTo(rectF.right, rectF.bottom - f12);
                if (f12 != 0.0f) {
                    float f20 = rectF.right;
                    float f21 = f12 * 2.0f;
                    float f22 = rectF.bottom;
                    rectF2.set(f20 - f21, f22 - f21, f20, f22);
                    path.arcTo(rectF2, 0.0f, 90.0f);
                }
                path.lineTo(rectF.left + f13, rectF.bottom);
                if (f13 != 0.0f) {
                    float f23 = rectF.left;
                    float f24 = rectF.bottom;
                    float f25 = f13 * 2.0f;
                    rectF2.set(f23, f24 - f25, f25 + f23, f24);
                    path.arcTo(rectF2, 90.0f, 90.0f);
                }
                path.lineTo(rectF.left, rectF.top - f10);
                path.close();
            }
        }
    }

    public static float b(Path path, int i10, float f10, float f11) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException();
        } else if (f10 == f11) {
            return f11 * 90.0f;
        } else {
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            int i15 = a0.i(6.0f);
            int i16 = a0.i(6.0f);
            float f12 = i10 / ((i15 * 2) + i16);
            int i17 = (int) (i15 * f12);
            int i18 = (int) (i16 * f12);
            int i19 = (int) (a0.i(21.0f) * f12);
            int i20 = (int) (a0.i(18.0f) * f12);
            int i21 = (int) (a0.i(22.0f) * f12);
            int i22 = (-((int) (i20 * 0.75f))) / 2;
            int i23 = (-i21) / 2;
            if (f11 == 0.0f) {
                float f13 = i22;
                path.moveTo(f13, i23);
                path.lineTo(i22 + i20, (i21 / 2) + i23);
                path.lineTo(f13, i23 + i21);
                path.close();
                return 0.0f;
            }
            if (i21 != (i17 * 2) + i18) {
                i23 -= ((int) ((i11 - i21) * f11)) / 2;
            }
            if (i20 != i19) {
                i22 -= (int) ((i19 - i20) * f11);
            }
            int i24 = (int) (i18 * f11);
            int i25 = (i21 / 2) + ((int) ((i17 - i12) * f11));
            int i26 = (int) (i25 * f11);
            int i27 = i20 + ((int) ((i19 - i20) * f11));
            if (i24 > 0) {
                float f14 = i27 + i22;
                float f15 = i23 + i25;
                path.moveTo(f14, f15);
                float f16 = i22;
                path.lineTo(f16, f15);
                path.lineTo(f16, i23);
                if (i26 > 0) {
                    path.lineTo(f14, i13 - i26);
                }
                path.close();
                float f17 = i23 + i24 + i25;
                path.moveTo(f14, f17);
                path.lineTo(f16, f17);
                path.lineTo(f16, i25 + i14);
                if (i26 > 0) {
                    path.lineTo(f14, i14 + i26);
                }
                path.close();
            } else {
                float f18 = i22;
                path.moveTo(f18, i23);
                int i28 = i23 + i25;
                path.lineTo(f18, i25 + i28);
                float f19 = i22 + i27;
                path.lineTo(f19, i28 + i26);
                if (i26 > 0) {
                    path.lineTo(f19, i28 - i26);
                }
                path.close();
            }
            return f11 * 90.0f;
        }
    }

    public static void c(Canvas canvas, float f10, float f11, float f12, int i10, int i11) {
        float f13 = i11;
        int i12 = (int) (f13 * 0.5f);
        int i13 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
        float interpolation = i13 < 0 ? db.b.f7287b.getInterpolation(f12 / 0.5f) : 1.0f;
        float interpolation2 = i13 <= 0 ? 0.0f : db.b.f7287b.getInterpolation((f12 - 0.5f) / 0.5f);
        Paint Y = y.Y(i10, a0.i(2.0f));
        if (w.G2()) {
            if (interpolation > 0.0f) {
                float f14 = i12;
                float f15 = f10 - f14;
                float f16 = f11 - f14;
                float f17 = (int) (interpolation * f13);
                canvas.drawLine(f15, f16, f15 + f17, f16 + f17, Y);
            }
            if (interpolation2 > 0.0f) {
                float f18 = i12;
                float f19 = f10 + f18;
                float f20 = f11 - f18;
                float f21 = (int) (f13 * interpolation2);
                canvas.drawLine(f19, f20, f19 - f21, f21 + f20, Y);
                return;
            }
            return;
        }
        if (interpolation > 0.0f) {
            float f22 = i12;
            float f23 = f10 + f22;
            float f24 = f11 - f22;
            float f25 = (int) (interpolation * f13);
            canvas.drawLine(f23, f24, f23 - f25, f24 + f25, Y);
        }
        if (interpolation2 > 0.0f) {
            float f26 = i12;
            float f27 = f10 - f26;
            float f28 = f11 - f26;
            float f29 = (int) (f13 * interpolation2);
            canvas.drawLine(f27, f28, f27 + f29, f29 + f28, Y);
        }
    }

    public static void d(TextView textView, Canvas canvas, int i10) {
        int lineCount;
        Layout layout = textView.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0) {
            RectF a02 = y.a0();
            int i11 = a0.i(6.0f);
            int i12 = a0.i(4.0f);
            int i13 = a0.i(12.0f);
            a02.set(0.0f, 0.0f, 0.0f, 0.0f);
            for (int i14 = 0; i14 < lineCount; i14++) {
                float lineLeft = layout.getLineLeft(i14);
                float lineRight = layout.getLineRight(i14);
                float f10 = a02.left;
                if (f10 == 0.0f || f10 > lineLeft) {
                    a02.left = lineLeft;
                }
                float f11 = a02.right;
                if (f11 == 0.0f || f11 < lineRight) {
                    a02.right = lineRight;
                }
            }
            float f12 = i11;
            a02.left -= f12;
            a02.right += f12;
            Rect Z = y.Z();
            textView.getLineBounds(0, Z);
            a02.top = Z.top - i12;
            textView.getLineBounds(lineCount - 1, Z);
            a02.bottom = (Z.top - i12) + a0.i(29.0f);
            float f13 = i13;
            canvas.drawRoundRect(a02, f13, f13, y.g(i10));
        }
    }

    public static void e(int i10, int i11, Canvas canvas, Bitmap bitmap, boolean z10, Paint paint) {
        float f10;
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == i10 && height == i11) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return;
            }
            int i12 = i10 / 2;
            int i13 = i11 / 2;
            if (z10) {
                f10 = Math.max(i10 / width, i11 / height);
            } else {
                f10 = Math.min(i10 / width, i11 / height);
            }
            canvas.save();
            canvas.scale(f10, f10, i12, i13);
            canvas.drawBitmap(bitmap, i12 - (width / 2), i13 - (height / 2), y.j());
            canvas.restore();
        }
    }

    public static void f(Canvas canvas, int i10, int i11, int i12, float f10, int i13, int i14, int i15, boolean z10) {
        boolean z11 = (i10 == 0 && i11 == 0) ? false : true;
        if (z11) {
            canvas.save();
            canvas.translate(i10, i11);
        }
        if (f10 < 1.0f) {
            int i16 = a0.i(15.0f);
            int i17 = a0.i(12.0f);
            int i18 = a0.i(10.0f);
            int i19 = -a0.i(12.0f);
            int i20 = a0.i(6.0f);
            int i21 = a0.i(14.0f);
            int i22 = a0.i(8.0f);
            if (i12 != i16) {
                float f11 = i12 / i16;
                i17 = (int) (i17 * f11);
                i18 = (int) (i18 * f11);
                i19 = (int) (i19 * f11);
                i20 = (int) (i20 * f11);
                i21 = (int) (i21 * f11);
                i22 = (int) (i22 * f11);
                i16 = i12;
            }
            float f12 = i17 + ((i16 - i17) * f10);
            float f13 = i18 + ((i16 - i18) * f10);
            float f14 = 1.0f - f10;
            int i23 = (int) (i19 * f14);
            int i24 = (int) (i20 * f14);
            int i25 = (int) (i21 * f14);
            int i26 = (int) (i22 * f14);
            if (i14 != 0) {
                Paint g10 = y.g(i15);
                canvas.drawCircle(0.0f, 0.0f, i12 + i14, g10);
                float f15 = i23;
                float f16 = i14;
                canvas.drawCircle(f15, i24, f12 + f16, g10);
                if (z10) {
                    float f17 = i25;
                    float f18 = i26;
                    canvas.drawCircle(f17, f18, f13 + f16, g10);
                    canvas.drawRect(f15, f18, f17, f18 + f13 + f16, g10);
                }
            }
            Paint g11 = y.g(i13);
            canvas.drawCircle(0.0f, 0.0f, i12, g11);
            float f19 = i23;
            float f20 = i24;
            canvas.drawCircle(f19, f20, f12, g11);
            float f21 = i25;
            float f22 = i26;
            canvas.drawCircle(f21, f22, f13, g11);
            canvas.drawRect(f19, Math.max(i24, i26), f21, Math.max(f22 + f13, f20 + f12), g11);
        } else {
            if (i14 != 0) {
                canvas.drawCircle(0.0f, 0.0f, i12 + i14, y.g(i15));
            }
            canvas.drawCircle(0.0f, 0.0f, i12, y.g(i13));
        }
        if (z11) {
            canvas.restore();
        }
    }

    public static void g(Canvas canvas, float f10, float f11, int i10, float f12, float f13) {
        Paint Y = y.Y(i10, a0.i(2.0f));
        double radians = Math.toRadians(h.i(135.0f, 45.0f, f12));
        float sin = (float) (Math.sin(radians) * r2);
        float cos = (float) (r2 * Math.cos(radians));
        float f14 = f11 - ((cos / 2.0f) * (1.0f - f13));
        float f15 = f14 + cos;
        float f16 = sin * f13;
        float f17 = f14 - (cos * f13);
        canvas.drawLine(f10 + sin, f15, f10 - f16, f17, Y);
        canvas.drawLine(f10 - sin, f15, f10 + f16, f17, Y);
    }

    public static void h(Canvas canvas, float f10, float f11, int i10, i<g> iVar, float f12, boolean z10, k kVar, Drawable drawable, int i11, int i12, int i13, float f13, float f14) {
        float f15;
        float f16;
        int i14;
        i<g> iVar2;
        float f17 = (0.4f * f14) + 0.6f;
        boolean z11 = f17 != 1.0f;
        if (z10) {
            f16 = a0.i(f12 - 2.0f);
            f15 = a0.i(1.5f);
        } else {
            f16 = 0.0f;
            f15 = 0.0f;
        }
        float g10 = iVar.g() + (drawable != null ? drawable.getMinimumWidth() + i13 : 0);
        if (drawable != null) {
            i14 = drawable.getMinimumWidth() + i13;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            i14 = 0;
        }
        float C = C(f12, z10, iVar2, i14);
        int r02 = kVar.r0(false);
        int t02 = kVar.t0(false);
        RectF a02 = y.a0();
        if (i10 == 3) {
            float f18 = f10 - f16;
            a02.set(f18, f11 - f16, C + f18, f11 + f16);
        } else if (i10 != 5) {
            float f19 = C / 2.0f;
            a02.set(f10 - f19, f11 - f16, f19 + f10, f11 + f16);
        } else {
            a02.set((f10 - C) + f16, f11 - f16, f10 + f16, f11 + f16);
        }
        if (z11) {
            canvas.save();
            canvas.scale(f17, f17, a02.centerX(), a02.centerY());
        }
        if (z10) {
            boolean z12 = Color.alpha(t02) > 0 && f15 > 0.0f;
            if (a02.width() == a02.height()) {
                if (z12) {
                    canvas.drawCircle(f10, f11, f15 + f16, y.g(d.a(f13, t02)));
                }
                canvas.drawCircle(f10, f11, f16, y.g(d.a(f13, r02)));
            } else {
                if (z12) {
                    a02.left -= f15;
                    a02.top -= f15;
                    a02.right += f15;
                    a02.bottom += f15;
                    float f20 = f16 + f15;
                    canvas.drawRoundRect(a02, f20, f20, y.g(d.a(f13, t02)));
                    a02.left += f15;
                    a02.top += f15;
                    a02.right -= f15;
                    a02.bottom -= f15;
                }
                canvas.drawRoundRect(a02, f16, f16, y.g(d.a(f13, r02)));
            }
        }
        float centerX = a02.centerX() - (g10 / 2.0f);
        if (drawable != null) {
            Paint c10 = z.c(i12, f13);
            float minimumHeight = f11 - (drawable.getMinimumHeight() / 2.0f);
            if (i11 != 5) {
                c.b(canvas, drawable, centerX, minimumHeight, c10);
                centerX += drawable.getMinimumWidth() + i13;
            } else {
                c.b(canvas, drawable, iVar.g() + centerX + i13, minimumHeight, c10);
            }
        }
        float f21 = centerX;
        Iterator<n.c<i.c<g>>> it = iVar.iterator();
        while (it.hasNext()) {
            n.c<i.c<g>> next = it.next();
            int round = Math.round(next.q().left + f21);
            next.f11479a.f11452b.v(canvas, round, round + next.f11479a.getWidth(), 0, Math.round((f11 - (next.f11479a.getHeight() / 2.0f)) + (next.f11479a.getHeight() * 0.8f * next.f11479a.j())), kVar, next.s() * f13 * (1.0f - Math.abs(next.f11479a.j())));
        }
        if (z11) {
            canvas.restore();
        }
    }

    public static void i(Canvas canvas, float f10, float f11, float f12, int i10, int i11) {
        j(canvas, f10, f11, f12, i10, i11, a0.i(23.0f));
    }

    public static void j(Canvas canvas, float f10, float f11, float f12, int i10, int i11, int i12) {
        if (f12 > 0.0f) {
            canvas.save();
            canvas.rotate(-45.0f, f10, f11);
            int i13 = a0.i(2.0f);
            int i14 = a0.i(1.5f);
            int i15 = a0.i(1.0f);
            float f13 = i12;
            int i16 = ((int) (f11 - (f13 * 0.5f))) + i15;
            int i17 = ((int) (f10 - i15)) - a0.i(0.5f);
            float f14 = i17;
            float f15 = i16;
            int i18 = i17 + i13;
            float f16 = i14 + i18;
            canvas.clipRect(f14, f15, f16, (f13 * f12) + f15);
            RectF a02 = y.a0();
            float f17 = i18;
            float f18 = i16 + i12;
            a02.set(f14, f15, f17, f18);
            float f19 = i13 / 2;
            canvas.drawRoundRect(a02, f19, f19, y.g(i10));
            canvas.drawRect(f17, f15, f16, f18, y.g(i11));
            canvas.restore();
        }
    }

    public static void k(Canvas canvas, float f10, float f11, int i10, int i11) {
        canvas.save();
        int i12 = a0.i(2.0f);
        int i13 = a0.i(9.0f);
        canvas.rotate(i11 != 5 ? i11 != 48 ? i11 != 80 ? 45 : -45 : 135 : 225, f10, f11);
        float f12 = i13;
        float f13 = i12;
        float f14 = f10 + f13;
        canvas.drawRect(f10, f11 - f12, f14, f11, y.g(i10));
        canvas.drawRect(f14, f11 - f13, f10 + f12, f11, y.g(i10));
        canvas.restore();
    }

    public static void l(Canvas canvas, a aVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        int i17;
        int i18;
        int i19;
        int i20;
        if (i16 == 0 || i16 == 180) {
            int i21 = (i10 + i12) / 2;
            if (i16 == 0) {
                i19 = i11;
                i17 = i13;
            } else {
                i17 = i11;
                i19 = i13;
            }
            i20 = i21;
            i18 = i20;
        } else {
            if (i16 == 45) {
                i18 = i10;
                i19 = i11;
                i20 = i12;
            } else if (i16 == 90 || i16 == 270) {
                int i22 = (i11 + i13) / 2;
                if (i16 == 90) {
                    i18 = i10;
                    i20 = i12;
                } else {
                    i20 = i10;
                    i18 = i12;
                }
                i19 = i22;
                i17 = i19;
            } else {
                if (i16 == 135) {
                    i18 = i10;
                    i17 = i11;
                    i20 = i12;
                } else if (i16 == 225) {
                    i20 = i10;
                    i17 = i11;
                    i18 = i12;
                } else if (i16 == 315) {
                    i20 = i10;
                    i19 = i11;
                    i18 = i12;
                } else {
                    throw new IllegalArgumentException("rotation: " + i16);
                }
                i19 = i13;
            }
            i17 = i13;
        }
        aVar.b(i20, i19, i18, i17, d.a(f10, d.b(255, i14)), d.b(255, i15));
        canvas.drawRect(i10, i11, i12, i13, aVar.f5228a);
    }

    public static void m(Canvas canvas, float f10, float f11, int i10, boolean z10) {
        int i11;
        int i12;
        canvas.save();
        int i13 = a0.i(2.0f);
        int i14 = a0.i(9.0f) / 2;
        int i15 = ((int) f11) + i14;
        canvas.translate(0.0f, (-i11) / 2);
        float f12 = ((int) f10) - i14;
        float f13 = i15;
        canvas.rotate(45.0f, f12, f13);
        canvas.translate(0.0f, -a0.i(5.0f));
        if (z10) {
            float f14 = i15 + i13;
            canvas.drawRect(f12, i15 + i11, i12 - i13, f14, y.g(i10));
            canvas.drawRect(f12, f14, i12 - i11, f13, y.g(i10));
        } else {
            float f15 = i15 - i13;
            canvas.drawRect(f12, i15 - i11, i12 + i13, f15, y.g(i10));
            canvas.drawRect(f12, f15, i12 + i11, f13, y.g(i10));
        }
        canvas.restore();
    }

    public static void n(Canvas canvas, v vVar, float f10, float f11, int i10, Drawable drawable, Paint paint) {
        if (f11 != 0.0f) {
            float i11 = a0.i(4.5f) + a0.i(2.0f);
            double radians = Math.toRadians(f10);
            float J0 = vVar.J0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float x02 = vVar.x0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            canvas.drawCircle(J0, x02, i11 * f11, y.g(i10));
            canvas.save();
            canvas.scale(f11, f11, J0, x02);
            c.b(canvas, drawable, J0 - (drawable.getMinimumWidth() / 2.0f), x02 - (drawable.getMinimumHeight() / 2.0f), paint);
            canvas.restore();
        }
    }

    public static void o(Canvas canvas, float f10, float f11, float f12, int i10, Paint paint) {
        int i11 = i10 / 2;
        int i12 = (f12 > 0.5f ? 1 : (f12 == 0.5f ? 0 : -1));
        float interpolation = i12 < 0 ? db.b.f7287b.getInterpolation(f12 / 0.5f) : 1.0f;
        float interpolation2 = i12 <= 0 ? 0.0f : db.b.f7287b.getInterpolation((f12 - 0.5f) / 0.5f);
        if (w.G2()) {
            if (interpolation > 0.0f) {
                float f13 = i11;
                float f14 = f10 - f13;
                float f15 = f11 - f13;
                float f16 = (int) (i10 * interpolation);
                canvas.drawLine(f14, f15, f14 + f16, f15 + f16, paint);
            }
            if (interpolation2 > 0.0f) {
                float f17 = i11;
                float f18 = f10 + f17;
                float f19 = f11 - f17;
                float f20 = (int) (i10 * interpolation2);
                canvas.drawLine(f18, f19, f18 - f20, f19 + f20, paint);
                return;
            }
            return;
        }
        if (interpolation > 0.0f) {
            float f21 = i11;
            float f22 = f10 + f21;
            float f23 = f11 - f21;
            float f24 = (int) (i10 * interpolation);
            canvas.drawLine(f22, f23, f22 - f24, f23 + f24, paint);
        }
        if (interpolation2 > 0.0f) {
            float f25 = i11;
            float f26 = f10 - f25;
            float f27 = f11 - f25;
            float f28 = (int) (i10 * interpolation2);
            canvas.drawLine(f26, f27, f26 + f28, f27 + f28, paint);
        }
    }

    public static void p(Canvas canvas, a aVar, int i10, int i11, int i12, int i13, int[] iArr, float f10) {
        aVar.c(i12, i13, iArr, f10);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            aVar.d(i14);
            canvas.drawRect(i10, i11, i12, i13, aVar.f5228a);
        }
    }

    public static void q(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 > 0.0f) {
            float i10 = a0.i(4.5f);
            double radians = Math.toRadians(45.0d);
            double d10 = f12;
            float sin = f10 + ((float) (Math.sin(radians) * d10));
            float cos = f11 + ((float) (d10 * Math.cos(radians)));
            canvas.drawCircle(sin, cos, (a0.i(2.0f) + i10) * f13, y.g(j.u()));
            canvas.drawCircle(sin, cos, i10 * f13, y.g(j.L(R.id.theme_color_online)));
        }
    }

    public static void r(Canvas canvas, v vVar, float f10) {
        if (f10 > 0.0f) {
            float i10 = a0.i(4.5f);
            double radians = Math.toRadians(45.0d);
            float J0 = vVar.J0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float x02 = vVar.x0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            canvas.drawCircle(J0, x02, (a0.i(2.0f) + i10) * f10, y.g(j.u()));
            canvas.drawCircle(J0, x02, i10 * f10, y.g(j.L(R.id.theme_color_online)));
        }
    }

    public static void s(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2, f fVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (rect != null) {
            i13 = rect.width();
            i12 = rect.height();
            i11 = -rect.left;
            i10 = -rect.top;
        } else {
            i13 = bitmap.getWidth();
            i12 = bitmap.getHeight();
            i11 = 0;
            i10 = 0;
        }
        float width = i13 / rect2.width();
        float height = i12 / rect2.height();
        canvas.save();
        canvas.clipRect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!(width == 1.0f && height == 1.0f)) {
            canvas.scale(width, height, rect2.centerX(), rect2.centerY());
        }
        fVar.g(canvas, i11, i10, bitmap.getWidth(), bitmap.getHeight());
        canvas.restore();
    }

    public static void t(Canvas canvas, int i10, int i11, int i12, Path path, float f10, float f11, float f12, int i13) {
        float b10 = b(path, i12, f10, f11);
        boolean z10 = (i10 == 0 && i11 == 0 && b10 == 0.0f && (f12 <= 0.0f || f12 >= 1.0f)) ? false : true;
        if (z10) {
            canvas.save();
            if (!(i10 == 0 && i11 == 0)) {
                canvas.translate(i10, i11);
            }
            if (b10 != 0.0f) {
                canvas.rotate(b10, 0.0f, 0.0f);
            }
        }
        canvas.drawPath(path, y.V(i13, Paint.Style.FILL));
        if (z10) {
            canvas.restore();
        }
    }

    public static void u(Canvas canvas, v vVar, v vVar2, boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        if (vVar2.e0()) {
            vVar.K0(i10, i11, i12, i13);
            if (z11 && vVar.e0()) {
                vVar.O(canvas);
            }
            vVar.draw(canvas);
        } else if (z10) {
            vVar.clear();
        }
        vVar2.K0(i10, i11, i12, i13);
        vVar2.draw(canvas);
    }

    public static void v(int i10, int i11, Canvas canvas, Bitmap bitmap, int i12, f fVar) {
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (v0.x1(i12)) {
                float f10 = i11 / width;
                float f11 = i10 / height;
                canvas.save();
                int i13 = i10 / 2;
                float f12 = i13;
                int i14 = i11 / 2;
                float f13 = i14;
                canvas.scale(f10, f11, f12, f13);
                canvas.rotate(i12, f12, f13);
                int i15 = i13 - (width / 2);
                int i16 = i14 - (height / 2);
                canvas.drawBitmap(bitmap, i15, i16, y.j());
                if (fVar != null) {
                    canvas.clipRect(i15, i16, i15 + width, i16 + height);
                    fVar.g(canvas, i15, i16, width, height);
                }
                canvas.restore();
                return;
            }
            boolean z10 = i12 != 0 || (fVar != null && !fVar.i());
            if (z10) {
                canvas.save();
                if (i12 != 0) {
                    canvas.rotate(i12, i10 / 2, i11 / 2);
                }
            }
            Rect Z = y.Z();
            Z.set(0, 0, i10, i11);
            canvas.drawBitmap(bitmap, (Rect) null, Z, y.j());
            if (fVar != null && !fVar.i()) {
                canvas.clipRect(0, 0, i10, i11);
                fVar.g(canvas, 0, 0, i10, i11);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void w(View view, Canvas canvas, Bitmap bitmap) {
        x(view, canvas, bitmap, 0);
    }

    public static void x(View view, Canvas canvas, Bitmap bitmap, int i10) {
        v(view.getMeasuredWidth(), view.getMeasuredHeight(), canvas, bitmap, i10, null);
    }

    public static void y(Canvas canvas, v vVar, float f10) {
        z(canvas, vVar, f10, j.u());
    }

    public static void z(Canvas canvas, v vVar, float f10, int i10) {
        if (f10 > 0.0f) {
            boolean G2 = w.G2();
            double radians = Math.toRadians(G2 ? 315.0d : 45.0d);
            int J0 = vVar.J0() + ((int) ((vVar.getWidth() / 2.0f) * Math.sin(radians)));
            int x02 = vVar.x0() + ((int) ((vVar.getHeight() / 2.0f) * Math.cos(radians)));
            i3.b(canvas, J0, x02, f10, null);
            RectF a02 = y.a0();
            int i11 = a0.i(11.0f);
            a02.set(J0 - i11, x02 - i11, J0 + i11, x02 + i11);
            canvas.drawArc(a02, G2 ? ((1.0f - f10) * 170.0f) + 225.0f : 135.0f, f10 * 170.0f, false, y.R(i10));
        }
    }
}
