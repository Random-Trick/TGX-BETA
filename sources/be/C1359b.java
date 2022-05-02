package be;

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
import ie.AbstractC5408k;
import ie.RunnableC5390g;
import java.util.Arrays;
import java.util.Iterator;
import me.C6918i3;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3944i;
import p051db.C3955n;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p156kd.AbstractC6264v;
import p254rd.C8431f;
import p364zd.C11524j;

public class C1359b {
    public static final int[] f4957a = {-1430998, -1381846, -13964758, -13964566, -14013718, -1430806, -1430998};
    public static RectF f4958b;

    public static class C1360a {
        public static final float[] f4959k = {0.9f, 0.3f, 0.7f, 0.2f};
        public static final float[] f4960l = {0.1f, 0.3f, 0.7f, 0.9f};
        public final Paint f4961a;
        public int f4962b = -1;
        public int f4963c = -1;
        public int f4964d = -1;
        public int f4965e = -1;
        public int f4966f;
        public int f4967g;
        public int[] f4968h;
        public RadialGradient[] f4969i;
        public float f4970j;

        public C1360a() {
            Paint paint = new Paint(1);
            this.f4961a = paint;
            paint.setStyle(Paint.Style.FILL);
        }

        public boolean m37491b(int i, int i2, int i3, int i4, int i5, int i6) {
            if (this.f4962b == i && this.f4964d == i2 && this.f4963c == i3 && this.f4965e == i4 && this.f4966f == i5 && this.f4967g == i6) {
                return false;
            }
            this.f4968h = null;
            this.f4969i = null;
            this.f4962b = i;
            this.f4964d = i2;
            this.f4963c = i3;
            this.f4965e = i4;
            this.f4966f = i5;
            this.f4967g = i6;
            this.f4961a.setDither(false);
            this.f4961a.setShader(new LinearGradient(i, i2, i3, i4, i5, i6, Shader.TileMode.CLAMP));
            return true;
        }

        public boolean m37490c(int i, int i2, int[] iArr, float f) {
            if (Arrays.equals(iArr, this.f4968h) && this.f4970j == f) {
                return false;
            }
            this.f4968h = iArr;
            this.f4970j = f;
            float min = Math.min(C1357a0.m37544f(), C1357a0.m37543g());
            if (iArr.length != 4) {
                min *= 2.0f;
            }
            this.f4969i = new RadialGradient[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                this.f4969i[i3] = new RadialGradient(i * f4959k[i3], i2 * f4960l[i3], min, C5064d.m24131a(f, C5064d.m24130b(255, iArr[i3])), 0, Shader.TileMode.CLAMP);
            }
            this.f4961a.setDither(true);
            return true;
        }

        public void m37489d(int i) {
            this.f4961a.setShader(this.f4969i[i]);
        }
    }

    public static int m37523A(android.graphics.Canvas r27, p350yd.C10802kc.C10804b r28, float r29, float r30, int r31, p111he.AbstractC5143t r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: be.C1359b.m37523A(android.graphics.Canvas, yd.kc$b, float, float, int, he.t, int):int");
    }

    public static long m37522B(Canvas canvas, float f, float f2, int i, boolean z, long j) {
        int i2;
        int i3;
        int i4;
        if (z) {
            i4 = C1357a0.m37541i(20.0f);
            i3 = C1357a0.m37541i(8.5f);
            i2 = C1357a0.m37541i(3.0f);
        } else {
            i4 = C1357a0.m37541i(8.0f);
            i3 = C1357a0.m37541i(3.5f);
            i2 = C1357a0.m37541i(1.5f);
        }
        float uptimeMillis = (float) ((SystemClock.uptimeMillis() % 2000) / 2000.0d);
        RectF a0 = C1410y.m37050a0();
        for (int i5 = 0; i5 < 2; i5++) {
            float f3 = uptimeMillis < 0.0f ? uptimeMillis + 1.0f : uptimeMillis > 1.0f ? uptimeMillis - 1.0f : uptimeMillis;
            float f4 = f3 < 0.25f ? f3 / 0.25f : 1.0f - ((f3 - 0.25f) / 0.75f);
            float f5 = i4 + (i3 * 2.0f * f3);
            float f6 = (f3 * 6.0f) + 20.0f;
            a0.set(f - f5, f2 - f5, f + f5, f2 + f5);
            Paint Y = C1410y.m37053Y(C5064d.m24131a(f4, i), i2);
            float f7 = f6 * 2.0f;
            canvas.drawArc(a0, -f6, f7, false, Y);
            canvas.drawArc(a0, 180.0f - f6, f7, false, Y);
            uptimeMillis += 0.5f;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (j == 0 || uptimeMillis2 >= j) {
            return Math.max(C7389v0.m16574v(i3 * 2 * 3, 2000L), ValueAnimator.getFrameDelay());
        }
        return -1L;
    }

    public static float m37521C(float f, boolean z, C3944i<?> iVar, int i) {
        float i2 = iVar.m29569i() + i;
        return z ? Math.max(C1357a0.m37541i(f - 2.0f) * 2, i2 + (C1357a0.m37541i(3.0f) * 2)) : i2;
    }

    public static int m37520D(TdApi.ChatAction chatAction) {
        if (chatAction == null) {
            Log.m14709w("[TYPING ICON BUG]: action == null", new Object[0]);
            return 0;
        }
        switch (chatAction.getConstructor()) {
            case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                return C1357a0.m37541i(36.0f);
            case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
            case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                return C1357a0.m37541i(20.0f);
            case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionTyping.CONSTRUCTOR:
                return C1357a0.m37541i(24.0f);
            case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
            case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
                return C1357a0.m37541i(26.0f);
            default:
                return 0;
        }
    }

    public static boolean m37519E(TdApi.ChatAction chatAction) {
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

    public static void m37518a(Path path, RectF rectF, float f, float f2, float f3, float f4) {
        if (f == f2 && f == f3 && f == f4) {
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float width = rectF.width();
            if (width == rectF.height() && f == width / 2.0f) {
                path.addCircle(centerX, centerY, f2, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            }
        } else {
            synchronized (C1359b.class) {
                RectF rectF2 = f4958b;
                if (rectF2 == null) {
                    rectF2 = new RectF();
                    f4958b = rectF2;
                }
                path.moveTo(rectF.left, rectF.top - f);
                if (f != 0.0f) {
                    float f5 = rectF.left;
                    float f6 = rectF.top;
                    float f7 = f * 2.0f;
                    rectF2.set(f5, f6, f5 + f7, f7 + f6);
                    path.arcTo(rectF2, -180.0f, 90.0f);
                }
                path.lineTo(rectF.right - f2, rectF.top);
                if (f2 != 0.0f) {
                    float f8 = rectF.right;
                    float f9 = f2 * 2.0f;
                    float f10 = rectF.top;
                    rectF2.set(f8 - f9, f10, f8, f9 + f10);
                    path.arcTo(rectF2, -90.0f, 90.0f);
                }
                path.lineTo(rectF.right, rectF.bottom - f3);
                if (f3 != 0.0f) {
                    float f11 = rectF.right;
                    float f12 = f3 * 2.0f;
                    float f13 = rectF.bottom;
                    rectF2.set(f11 - f12, f13 - f12, f11, f13);
                    path.arcTo(rectF2, 0.0f, 90.0f);
                }
                path.lineTo(rectF.left + f4, rectF.bottom);
                if (f4 != 0.0f) {
                    float f14 = rectF.left;
                    float f15 = rectF.bottom;
                    float f16 = f4 * 2.0f;
                    rectF2.set(f14, f15 - f16, f16 + f14, f15);
                    path.arcTo(rectF2, 90.0f, 90.0f);
                }
                path.lineTo(rectF.left, rectF.top - f);
                path.close();
            }
        }
    }

    public static float m37517b(Path path, int i, float f, float f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException();
        } else if (f == f2) {
            return f2 * 90.0f;
        } else {
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            int i6 = C1357a0.m37541i(6.0f);
            int i7 = C1357a0.m37541i(6.0f);
            float f3 = i / ((i6 * 2) + i7);
            int i8 = (int) (i6 * f3);
            int i9 = (int) (i7 * f3);
            int i10 = (int) (C1357a0.m37541i(21.0f) * f3);
            int i11 = (int) (C1357a0.m37541i(18.0f) * f3);
            int i12 = (int) (C1357a0.m37541i(22.0f) * f3);
            int i13 = (-((int) (i11 * 0.75f))) / 2;
            int i14 = (-i12) / 2;
            if (f2 == 0.0f) {
                float f4 = i13;
                path.moveTo(f4, i14);
                path.lineTo(i13 + i11, (i12 / 2) + i14);
                path.lineTo(f4, i14 + i12);
                path.close();
                return 0.0f;
            }
            if (i12 != (i8 * 2) + i9) {
                i14 -= ((int) ((i2 - i12) * f2)) / 2;
            }
            if (i11 != i10) {
                i13 -= (int) ((i10 - i11) * f2);
            }
            int i15 = (int) (i9 * f2);
            int i16 = (i12 / 2) + ((int) ((i8 - i3) * f2));
            int i17 = (int) (i16 * f2);
            int i18 = i11 + ((int) ((i10 - i11) * f2));
            if (i15 > 0) {
                float f5 = i18 + i13;
                float f6 = i14 + i16;
                path.moveTo(f5, f6);
                float f7 = i13;
                path.lineTo(f7, f6);
                path.lineTo(f7, i14);
                if (i17 > 0) {
                    path.lineTo(f5, i4 - i17);
                }
                path.close();
                float f8 = i14 + i15 + i16;
                path.moveTo(f5, f8);
                path.lineTo(f7, f8);
                path.lineTo(f7, i16 + i5);
                if (i17 > 0) {
                    path.lineTo(f5, i5 + i17);
                }
                path.close();
            } else {
                float f9 = i13;
                path.moveTo(f9, i14);
                int i19 = i14 + i16;
                path.lineTo(f9, i16 + i19);
                float f10 = i13 + i18;
                path.lineTo(f10, i19 + i17);
                if (i17 > 0) {
                    path.lineTo(f10, i19 - i17);
                }
                path.close();
            }
            return f2 * 90.0f;
        }
    }

    public static void m37516c(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        float f4 = i2;
        int i3 = (int) (f4 * 0.5f);
        int i4 = (f3 > 0.5f ? 1 : (f3 == 0.5f ? 0 : -1));
        float interpolation = i4 < 0 ? C2057b.f7280b.getInterpolation(f3 / 0.5f) : 1.0f;
        float interpolation2 = i4 <= 0 ? 0.0f : C2057b.f7280b.getInterpolation((f3 - 0.5f) / 0.5f);
        Paint Y = C1410y.m37053Y(i, C1357a0.m37541i(2.0f));
        if (C4403w.m27984G2()) {
            if (interpolation > 0.0f) {
                float f5 = i3;
                float f6 = f - f5;
                float f7 = f2 - f5;
                float f8 = (int) (interpolation * f4);
                canvas.drawLine(f6, f7, f6 + f8, f7 + f8, Y);
            }
            if (interpolation2 > 0.0f) {
                float f9 = i3;
                float f10 = f + f9;
                float f11 = f2 - f9;
                float f12 = (int) (f4 * interpolation2);
                canvas.drawLine(f10, f11, f10 - f12, f12 + f11, Y);
                return;
            }
            return;
        }
        if (interpolation > 0.0f) {
            float f13 = i3;
            float f14 = f + f13;
            float f15 = f2 - f13;
            float f16 = (int) (interpolation * f4);
            canvas.drawLine(f14, f15, f14 - f16, f15 + f16, Y);
        }
        if (interpolation2 > 0.0f) {
            float f17 = i3;
            float f18 = f - f17;
            float f19 = f2 - f17;
            float f20 = (int) (f4 * interpolation2);
            canvas.drawLine(f18, f19, f18 + f20, f20 + f19, Y);
        }
    }

    public static void m37515d(TextView textView, Canvas canvas, int i) {
        int lineCount;
        Layout layout = textView.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0) {
            RectF a0 = C1410y.m37050a0();
            int i2 = C1357a0.m37541i(6.0f);
            int i3 = C1357a0.m37541i(4.0f);
            int i4 = C1357a0.m37541i(12.0f);
            a0.set(0.0f, 0.0f, 0.0f, 0.0f);
            for (int i5 = 0; i5 < lineCount; i5++) {
                float lineLeft = layout.getLineLeft(i5);
                float lineRight = layout.getLineRight(i5);
                float f = a0.left;
                if (f == 0.0f || f > lineLeft) {
                    a0.left = lineLeft;
                }
                float f2 = a0.right;
                if (f2 == 0.0f || f2 < lineRight) {
                    a0.right = lineRight;
                }
            }
            float f3 = i2;
            a0.left -= f3;
            a0.right += f3;
            Rect Z = C1410y.m37052Z();
            textView.getLineBounds(0, Z);
            a0.top = Z.top - i3;
            textView.getLineBounds(lineCount - 1, Z);
            a0.bottom = (Z.top - i3) + C1357a0.m37541i(29.0f);
            float f4 = i4;
            canvas.drawRoundRect(a0, f4, f4, C1410y.m37039g(i));
        }
    }

    public static void m37514e(int i, int i2, Canvas canvas, Bitmap bitmap, boolean z, Paint paint) {
        float f;
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == i && height == i2) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return;
            }
            int i3 = i / 2;
            int i4 = i2 / 2;
            if (z) {
                f = Math.max(i / width, i2 / height);
            } else {
                f = Math.min(i / width, i2 / height);
            }
            canvas.save();
            canvas.scale(f, f, i3, i4);
            canvas.drawBitmap(bitmap, i3 - (width / 2), i4 - (height / 2), C1410y.m37033j());
            canvas.restore();
        }
    }

    public static void m37513f(Canvas canvas, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        boolean z = (i == 0 && i2 == 0) ? false : true;
        if (z) {
            canvas.save();
            canvas.translate(i, i2);
        }
        if (f < 1.0f) {
            int i7 = C1357a0.m37541i(15.0f);
            int i8 = C1357a0.m37541i(12.0f);
            int i9 = C1357a0.m37541i(10.0f);
            int i10 = -C1357a0.m37541i(12.0f);
            int i11 = C1357a0.m37541i(6.0f);
            int i12 = C1357a0.m37541i(14.0f);
            int i13 = C1357a0.m37541i(8.0f);
            if (i3 != i7) {
                float f2 = i3 / i7;
                i8 = (int) (i8 * f2);
                i9 = (int) (i9 * f2);
                i10 = (int) (i10 * f2);
                i11 = (int) (i11 * f2);
                i12 = (int) (i12 * f2);
                i13 = (int) (i13 * f2);
                i7 = i3;
            }
            float f3 = i8 + ((i7 - i8) * f);
            float f4 = i9 + ((i7 - i9) * f);
            float f5 = 1.0f - f;
            int i14 = (int) (i10 * f5);
            int i15 = (int) (i11 * f5);
            int i16 = (int) (i12 * f5);
            int i17 = (int) (i13 * f5);
            if (i5 != 0) {
                Paint g = C1410y.m37039g(i6);
                canvas.drawCircle(0.0f, 0.0f, i3 + i5, g);
                canvas.drawCircle(i14, i15, i5 + f3, g);
            }
            Paint g2 = C1410y.m37039g(i4);
            canvas.drawCircle(0.0f, 0.0f, i3, g2);
            float f6 = i14;
            float f7 = i15;
            canvas.drawCircle(f6, f7, f3, g2);
            float f8 = i16;
            float f9 = i17;
            canvas.drawCircle(f8, f9, f4, g2);
            canvas.drawRect(f6, Math.max(i15, i17), f8, Math.max(f9 + f4, f7 + f3), g2);
        } else {
            if (i5 != 0) {
                canvas.drawCircle(0.0f, 0.0f, i3 + i5, C1410y.m37039g(i6));
            }
            canvas.drawCircle(0.0f, 0.0f, i3, C1410y.m37039g(i4));
        }
        if (z) {
            canvas.restore();
        }
    }

    public static void m37512g(Canvas canvas, float f, float f2, int i, float f3, float f4) {
        Paint Y = C1410y.m37053Y(i, C1357a0.m37541i(2.0f));
        double radians = Math.toRadians(C5069h.m24084i(135.0f, 45.0f, f3));
        float sin = (float) (Math.sin(radians) * r2);
        float cos = (float) (r2 * Math.cos(radians));
        float f5 = f2 - ((cos / 2.0f) * (1.0f - f4));
        float f6 = f5 + cos;
        float f7 = sin * f4;
        float f8 = f5 - (cos * f4);
        canvas.drawLine(f + sin, f6, f - f7, f8, Y);
        canvas.drawLine(f - sin, f6, f + f7, f8, Y);
    }

    public static void m37511h(Canvas canvas, float f, float f2, int i, C3944i<RunnableC5390g> iVar, float f3, boolean z, AbstractC5408k kVar, Drawable drawable, int i2, int i3, int i4, float f4, float f5) {
        float f6;
        float f7;
        int i5;
        C3944i<RunnableC5390g> iVar2;
        float f8 = (0.4f * f5) + 0.6f;
        boolean z2 = f8 != 1.0f;
        if (z) {
            f7 = C1357a0.m37541i(f3 - 2.0f);
            f6 = C1357a0.m37541i(1.5f);
        } else {
            f7 = 0.0f;
            f6 = 0.0f;
        }
        float i6 = iVar.m29569i() + (drawable != null ? drawable.getMinimumWidth() + i4 : 0);
        if (drawable != null) {
            i5 = drawable.getMinimumWidth() + i4;
            iVar2 = iVar;
        } else {
            iVar2 = iVar;
            i5 = 0;
        }
        float C = m37521C(f3, z, iVar2, i5);
        int p0 = kVar.mo7851p0(false);
        int r0 = kVar.mo7850r0(false);
        RectF a0 = C1410y.m37050a0();
        if (i == 3) {
            float f9 = f - f7;
            a0.set(f9, f2 - f7, C + f9, f2 + f7);
        } else if (i != 5) {
            float f10 = C / 2.0f;
            a0.set(f - f10, f2 - f7, f10 + f, f2 + f7);
        } else {
            a0.set((f - C) + f7, f2 - f7, f + f7, f2 + f7);
        }
        if (z2) {
            canvas.save();
            canvas.scale(f8, f8, a0.centerX(), a0.centerY());
        }
        if (z) {
            boolean z3 = Color.alpha(r0) > 0 && f6 > 0.0f;
            if (a0.width() == a0.height()) {
                if (z3) {
                    canvas.drawCircle(f, f2, f6 + f7, C1410y.m37039g(C5064d.m24131a(f4, r0)));
                }
                canvas.drawCircle(f, f2, f7, C1410y.m37039g(C5064d.m24131a(f4, p0)));
            } else {
                if (z3) {
                    a0.left -= f6;
                    a0.top -= f6;
                    a0.right += f6;
                    a0.bottom += f6;
                    float f11 = f7 + f6;
                    canvas.drawRoundRect(a0, f11, f11, C1410y.m37039g(C5064d.m24131a(f4, r0)));
                    a0.left += f6;
                    a0.top += f6;
                    a0.right -= f6;
                    a0.bottom -= f6;
                }
                canvas.drawRoundRect(a0, f7, f7, C1410y.m37039g(C5064d.m24131a(f4, p0)));
            }
        }
        float centerX = a0.centerX() - (i6 / 2.0f);
        if (drawable != null) {
            Paint c = C1411z.m36997c(i3, f4);
            float minimumHeight = f2 - (drawable.getMinimumHeight() / 2.0f);
            if (i2 != 5) {
                C1362c.m37487b(canvas, drawable, centerX, minimumHeight, c);
                centerX += drawable.getMinimumWidth() + i4;
            } else {
                C1362c.m37487b(canvas, drawable, iVar.m29569i() + centerX + i4, minimumHeight, c);
            }
        }
        float f12 = centerX;
        Iterator<C3955n.C3958c<C3944i.C3947c<RunnableC5390g>>> it = iVar.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<C3944i.C3947c<RunnableC5390g>> next = it.next();
            int round = Math.round(next.m29493q().left + f12);
            next.f13320a.f13286b.m22899v(canvas, round, round + next.f13320a.getWidth(), 0, Math.round((f2 - (next.f13320a.getHeight() / 2.0f)) + (next.f13320a.getHeight() * 0.8f * next.f13320a.m29559j())), kVar, next.m29491s() * f4 * (1.0f - Math.abs(next.f13320a.m29559j())));
        }
        if (z2) {
            canvas.restore();
        }
    }

    public static void m37510i(Canvas canvas, float f, float f2, float f3, int i, int i2) {
        m37509j(canvas, f, f2, f3, i, i2, C1357a0.m37541i(23.0f));
    }

    public static void m37509j(Canvas canvas, float f, float f2, float f3, int i, int i2, int i3) {
        if (f3 > 0.0f) {
            canvas.save();
            canvas.rotate(-45.0f, f, f2);
            int i4 = C1357a0.m37541i(2.0f);
            int i5 = C1357a0.m37541i(1.5f);
            int i6 = C1357a0.m37541i(1.0f);
            float f4 = i3;
            int i7 = ((int) (f2 - (f4 * 0.5f))) + i6;
            int i8 = ((int) (f - i6)) - C1357a0.m37541i(0.5f);
            float f5 = i8;
            float f6 = i7;
            int i9 = i8 + i4;
            float f7 = i5 + i9;
            canvas.clipRect(f5, f6, f7, (f4 * f3) + f6);
            RectF a0 = C1410y.m37050a0();
            float f8 = i9;
            float f9 = i7 + i3;
            a0.set(f5, f6, f8, f9);
            float f10 = i4 / 2;
            canvas.drawRoundRect(a0, f10, f10, C1410y.m37039g(i));
            canvas.drawRect(f8, f6, f7, f9, C1410y.m37039g(i2));
            canvas.restore();
        }
    }

    public static void m37508k(Canvas canvas, float f, float f2, int i, int i2) {
        canvas.save();
        int i3 = C1357a0.m37541i(2.0f);
        int i4 = C1357a0.m37541i(9.0f);
        canvas.rotate(i2 != 5 ? i2 != 48 ? i2 != 80 ? 45 : -45 : 135 : 225, f, f2);
        float f3 = i4;
        float f4 = i3;
        float f5 = f + f4;
        canvas.drawRect(f, f2 - f3, f5, f2, C1410y.m37039g(i));
        canvas.drawRect(f5, f2 - f4, f + f3, f2, C1410y.m37039g(i));
        canvas.restore();
    }

    public static void m37507l(Canvas canvas, C1360a aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (i7 == 0 || i7 == 180) {
            int i12 = (i + i3) / 2;
            if (i7 == 0) {
                i10 = i2;
                i8 = i4;
            } else {
                i8 = i2;
                i10 = i4;
            }
            i11 = i12;
            i9 = i11;
        } else {
            if (i7 == 45) {
                i9 = i;
                i10 = i2;
                i11 = i3;
            } else if (i7 == 90 || i7 == 270) {
                int i13 = (i2 + i4) / 2;
                if (i7 == 90) {
                    i9 = i;
                    i11 = i3;
                } else {
                    i11 = i;
                    i9 = i3;
                }
                i10 = i13;
                i8 = i10;
            } else {
                if (i7 == 135) {
                    i9 = i;
                    i8 = i2;
                    i11 = i3;
                } else if (i7 == 225) {
                    i11 = i;
                    i8 = i2;
                    i9 = i3;
                } else if (i7 == 315) {
                    i11 = i;
                    i10 = i2;
                    i9 = i3;
                } else {
                    throw new IllegalArgumentException("rotation: " + i7);
                }
                i10 = i4;
            }
            i8 = i4;
        }
        aVar.m37491b(i11, i10, i9, i8, C5064d.m24131a(f, C5064d.m24130b(255, i5)), C5064d.m24130b(255, i6));
        canvas.drawRect(i, i2, i3, i4, aVar.f4961a);
    }

    public static void m37506m(Canvas canvas, float f, float f2, int i, boolean z) {
        int i2;
        int i3;
        canvas.save();
        int i4 = C1357a0.m37541i(2.0f);
        int i5 = C1357a0.m37541i(9.0f) / 2;
        int i6 = ((int) f2) + i5;
        canvas.translate(0.0f, (-i2) / 2);
        float f3 = ((int) f) - i5;
        float f4 = i6;
        canvas.rotate(45.0f, f3, f4);
        canvas.translate(0.0f, -C1357a0.m37541i(5.0f));
        if (z) {
            float f5 = i6 + i4;
            canvas.drawRect(f3, i6 + i2, i3 - i4, f5, C1410y.m37039g(i));
            canvas.drawRect(f3, f5, i3 - i2, f4, C1410y.m37039g(i));
        } else {
            float f6 = i6 - i4;
            canvas.drawRect(f3, i6 - i2, i3 + i4, f6, C1410y.m37039g(i));
            canvas.drawRect(f3, f6, i3 + i2, f4, C1410y.m37039g(i));
        }
        canvas.restore();
    }

    public static void m37505n(Canvas canvas, AbstractC6264v vVar, float f, float f2, int i, Drawable drawable, Paint paint) {
        if (f2 != 0.0f) {
            float i2 = C1357a0.m37541i(4.5f) + C1357a0.m37541i(2.0f);
            double radians = Math.toRadians(f);
            float I0 = vVar.mo20257I0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float y0 = vVar.mo20227y0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            canvas.drawCircle(I0, y0, i2 * f2, C1410y.m37039g(i));
            canvas.save();
            canvas.scale(f2, f2, I0, y0);
            C1362c.m37487b(canvas, drawable, I0 - (drawable.getMinimumWidth() / 2.0f), y0 - (drawable.getMinimumHeight() / 2.0f), paint);
            canvas.restore();
        }
    }

    public static void m37504o(Canvas canvas, float f, float f2, float f3, int i, Paint paint) {
        int i2 = i / 2;
        int i3 = (f3 > 0.5f ? 1 : (f3 == 0.5f ? 0 : -1));
        float interpolation = i3 < 0 ? C2057b.f7280b.getInterpolation(f3 / 0.5f) : 1.0f;
        float interpolation2 = i3 <= 0 ? 0.0f : C2057b.f7280b.getInterpolation((f3 - 0.5f) / 0.5f);
        if (C4403w.m27984G2()) {
            if (interpolation > 0.0f) {
                float f4 = i2;
                float f5 = f - f4;
                float f6 = f2 - f4;
                float f7 = (int) (i * interpolation);
                canvas.drawLine(f5, f6, f5 + f7, f6 + f7, paint);
            }
            if (interpolation2 > 0.0f) {
                float f8 = i2;
                float f9 = f + f8;
                float f10 = f2 - f8;
                float f11 = (int) (i * interpolation2);
                canvas.drawLine(f9, f10, f9 - f11, f10 + f11, paint);
                return;
            }
            return;
        }
        if (interpolation > 0.0f) {
            float f12 = i2;
            float f13 = f + f12;
            float f14 = f2 - f12;
            float f15 = (int) (i * interpolation);
            canvas.drawLine(f13, f14, f13 - f15, f14 + f15, paint);
        }
        if (interpolation2 > 0.0f) {
            float f16 = i2;
            float f17 = f - f16;
            float f18 = f2 - f16;
            float f19 = (int) (i * interpolation2);
            canvas.drawLine(f17, f18, f17 + f19, f18 + f19, paint);
        }
    }

    public static void m37503p(Canvas canvas, C1360a aVar, int i, int i2, int i3, int i4, int[] iArr, float f) {
        aVar.m37490c(i3, i4, iArr, f);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            aVar.m37489d(i5);
            canvas.drawRect(i, i2, i3, i4, aVar.f4961a);
        }
    }

    public static void m37502q(Canvas canvas, float f, float f2, float f3, float f4) {
        if (f4 > 0.0f) {
            float i = C1357a0.m37541i(4.5f);
            double radians = Math.toRadians(45.0d);
            double d = f3;
            float sin = f + ((float) (Math.sin(radians) * d));
            float cos = f2 + ((float) (d * Math.cos(radians)));
            canvas.drawCircle(sin, cos, (C1357a0.m37541i(2.0f) + i) * f4, C1410y.m37039g(C11524j.m148w()));
            canvas.drawCircle(sin, cos, i * f4, C1410y.m37039g(C11524j.m228N(R.id.theme_color_online)));
        }
    }

    public static void m37501r(Canvas canvas, AbstractC6264v vVar, float f) {
        if (f > 0.0f) {
            float i = C1357a0.m37541i(4.5f);
            double radians = Math.toRadians(45.0d);
            float I0 = vVar.mo20257I0() + ((float) ((vVar.getWidth() / 2) * Math.sin(radians)));
            float y0 = vVar.mo20227y0() + ((float) ((vVar.getHeight() / 2) * Math.cos(radians)));
            canvas.drawCircle(I0, y0, (C1357a0.m37541i(2.0f) + i) * f, C1410y.m37039g(C11524j.m148w()));
            canvas.drawCircle(I0, y0, i * f, C1410y.m37039g(C11524j.m228N(R.id.theme_color_online)));
        }
    }

    public static void m37500s(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2, C8431f fVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (rect != null) {
            i4 = rect.width();
            i3 = rect.height();
            i2 = -rect.left;
            i = -rect.top;
        } else {
            i4 = bitmap.getWidth();
            i3 = bitmap.getHeight();
            i2 = 0;
            i = 0;
        }
        float width = i4 / rect2.width();
        float height = i3 / rect2.height();
        canvas.save();
        canvas.clipRect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (!(width == 1.0f && height == 1.0f)) {
            canvas.scale(width, height, rect2.centerX(), rect2.centerY());
        }
        fVar.m12496g(canvas, i2, i, bitmap.getWidth(), bitmap.getHeight());
        canvas.restore();
    }

    public static void m37499t(Canvas canvas, int i, int i2, int i3, Path path, float f, float f2, float f3, int i4) {
        float b = m37517b(path, i3, f, f2);
        boolean z = (i == 0 && i2 == 0 && b == 0.0f && (f3 <= 0.0f || f3 >= 1.0f)) ? false : true;
        if (z) {
            canvas.save();
            if (!(i == 0 && i2 == 0)) {
                canvas.translate(i, i2);
            }
            if (b != 0.0f) {
                canvas.rotate(b, 0.0f, 0.0f);
            }
        }
        canvas.drawPath(path, C1410y.m37056V(i4, Paint.Style.FILL));
        if (z) {
            canvas.restore();
        }
    }

    public static void m37498u(Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        if (vVar2.mo20246c0()) {
            vVar.mo20256K0(i, i2, i3, i4);
            if (z2 && vVar.mo20246c0()) {
                vVar.mo20255N(canvas);
            }
            vVar.draw(canvas);
        } else if (z) {
            vVar.clear();
        }
        vVar2.mo20256K0(i, i2, i3, i4);
        vVar2.draw(canvas);
    }

    public static void m37497v(int i, int i2, Canvas canvas, Bitmap bitmap, int i3, C8431f fVar) {
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (C7389v0.m16564x1(i3)) {
                float f = i2 / width;
                float f2 = i / height;
                canvas.save();
                int i4 = i / 2;
                float f3 = i4;
                int i5 = i2 / 2;
                float f4 = i5;
                canvas.scale(f, f2, f3, f4);
                canvas.rotate(i3, f3, f4);
                int i6 = i4 - (width / 2);
                int i7 = i5 - (height / 2);
                canvas.drawBitmap(bitmap, i6, i7, C1410y.m37033j());
                if (fVar != null) {
                    canvas.clipRect(i6, i7, i6 + width, i7 + height);
                    fVar.m12496g(canvas, i6, i7, width, height);
                }
                canvas.restore();
                return;
            }
            boolean z = i3 != 0 || (fVar != null && !fVar.m12494i());
            if (z) {
                canvas.save();
                if (i3 != 0) {
                    canvas.rotate(i3, i / 2, i2 / 2);
                }
            }
            Rect Z = C1410y.m37052Z();
            Z.set(0, 0, i, i2);
            canvas.drawBitmap(bitmap, (Rect) null, Z, C1410y.m37033j());
            if (fVar != null && !fVar.m12494i()) {
                canvas.clipRect(0, 0, i, i2);
                fVar.m12496g(canvas, 0, 0, i, i2);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public static void m37496w(View view, Canvas canvas, Bitmap bitmap) {
        m37495x(view, canvas, bitmap, 0);
    }

    public static void m37495x(View view, Canvas canvas, Bitmap bitmap, int i) {
        m37497v(view.getMeasuredWidth(), view.getMeasuredHeight(), canvas, bitmap, i, null);
    }

    public static void m37494y(Canvas canvas, AbstractC6264v vVar, float f) {
        m37493z(canvas, vVar, f, C11524j.m148w());
    }

    public static void m37493z(Canvas canvas, AbstractC6264v vVar, float f, int i) {
        if (f > 0.0f) {
            boolean G2 = C4403w.m27984G2();
            double radians = Math.toRadians(G2 ? 315.0d : 45.0d);
            int I0 = vVar.mo20257I0() + ((int) ((vVar.getWidth() / 2.0f) * Math.sin(radians)));
            int y0 = vVar.mo20227y0() + ((int) ((vVar.getHeight() / 2.0f) * Math.cos(radians)));
            C6918i3.m18466b(canvas, I0, y0, f, null);
            RectF a0 = C1410y.m37050a0();
            int i2 = C1357a0.m37541i(11.0f);
            a0.set(I0 - i2, y0 - i2, I0 + i2, y0 + i2);
            canvas.drawArc(a0, G2 ? ((1.0f - f) * 170.0f) + 225.0f : 135.0f, f * 170.0f, false, C1410y.m37060R(i));
        }
    }
}
