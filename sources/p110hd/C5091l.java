package p110hd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import be.C1410y;

public class C5091l extends ReplacementSpan implements AbstractC5090k {
    public boolean f17125N;
    public final CharSequence f17126a;
    public final C5088i f17127b;
    public final Paint.FontMetricsInt f17128c = new Paint.FontMetricsInt();
    public int f17124M = -1;

    public C5091l(CharSequence charSequence, C5088i iVar) {
        this.f17126a = charSequence;
        this.f17127b = iVar;
    }

    public static AbstractC5090k m23965d(CharSequence charSequence, C5088i iVar) {
        return new C5091l(charSequence, iVar);
    }

    @Override
    public CharSequence mo23968a() {
        return this.f17126a;
    }

    @Override
    public int mo23967b(Paint paint) {
        if (this.f17124M == -1) {
            CharSequence charSequence = this.f17126a;
            getSize(paint, charSequence, 0, charSequence.length(), null);
        }
        return this.f17124M;
    }

    @Override
    public boolean mo23966c() {
        return this.f17125N;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f17124M == -1) {
            mo23967b(paint);
        }
        float f2 = f + (this.f17124M / 2.0f);
        float f3 = i3 + ((i5 - i3) / 2.0f);
        Rect Z = C1410y.m37052Z();
        int v = C5078d.m23986z().m23990v();
        int i6 = this.f17124M;
        int i7 = v / 2;
        int i8 = ((int) (f2 - (i6 / 2.0f))) + i7;
        Z.left = i8;
        int i9 = ((int) (f3 - (i6 / 2.0f))) + i7;
        Z.top = i9;
        int i10 = v % 2;
        Z.right = ((i8 + i6) - i7) - i10;
        Z.bottom = ((i9 + i6) - i7) - i10;
        this.f17125N = !C5078d.m23986z().m24001k(canvas, this.f17127b, Z);
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f17128c);
        Paint.FontMetricsInt fontMetricsInt2 = this.f17128c;
        int abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        this.f17124M = abs;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f17128c;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return abs;
    }
}
