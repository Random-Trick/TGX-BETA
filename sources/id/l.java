package id;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import ce.y;

public class l extends ReplacementSpan implements k {
    public boolean N;
    public final CharSequence f14216a;
    public final i f14217b;
    public final Paint.FontMetricsInt f14218c = new Paint.FontMetricsInt();
    public int M = -1;

    public l(CharSequence charSequence, i iVar) {
        this.f14216a = charSequence;
        this.f14217b = iVar;
    }

    public static k d(CharSequence charSequence, i iVar) {
        return new l(charSequence, iVar);
    }

    @Override
    public CharSequence a() {
        return this.f14216a;
    }

    @Override
    public int b(Paint paint) {
        if (this.M == -1) {
            CharSequence charSequence = this.f14216a;
            getSize(paint, charSequence, 0, charSequence.length(), null);
        }
        return this.M;
    }

    @Override
    public boolean c() {
        return this.N;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.M == -1) {
            b(paint);
        }
        float f11 = f10 + (this.M / 2.0f);
        float f12 = i12 + ((i14 - i12) / 2.0f);
        Rect Z = y.Z();
        int v10 = d.z().v();
        int i15 = this.M;
        int i16 = v10 / 2;
        int i17 = ((int) (f11 - (i15 / 2.0f))) + i16;
        Z.left = i17;
        int i18 = ((int) (f12 - (i15 / 2.0f))) + i16;
        Z.top = i18;
        int i19 = v10 % 2;
        Z.right = ((i17 + i15) - i16) - i19;
        Z.bottom = ((i18 + i15) - i16) - i19;
        this.N = !d.z().k(canvas, this.f14217b, Z);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f14218c);
        Paint.FontMetricsInt fontMetricsInt2 = this.f14218c;
        int abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        this.M = abs;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f14218c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return abs;
    }
}
