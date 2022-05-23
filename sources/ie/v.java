package ie;

import android.graphics.Canvas;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import ce.a0;
import id.d;
import oc.v0;

public class v {
    public final Layout f14292a;
    public final String f14293b;
    public final TextPaint f14294c;
    public final int f14295d;
    public float f14296e;

    public v(String str, int i10, TextPaint textPaint) {
        int i11;
        v vVar;
        this.f14293b = str;
        this.f14294c = textPaint;
        this.f14295d = i10;
        CharSequence I = d.z().I(str);
        int D = i10 <= 0 ? a0.D() : i10;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(I, textPaint);
        if (isBoring == null || isBoring.width > D) {
            StaticLayout staticLayout = new StaticLayout(I, 0, I.length(), textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            if (lineCount > 2) {
                i11 = 0;
                staticLayout = new StaticLayout(I, 0, staticLayout.getLineEnd(1), textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, (int) (Math.max(staticLayout.getLineWidth(0), staticLayout.getLineWidth(1)) - v0.T1("…", textPaint)));
            } else {
                i11 = 0;
            }
            if (lineCount > 1) {
                int length = I.length();
                int i12 = 0;
                while (i12 < length && I.charAt(i12) != '\n') {
                    i12++;
                }
                if (i12 > 0) {
                    vVar = this;
                    vVar.f14296e = v0.R1(I, i11, i12, textPaint);
                    vVar.f14292a = staticLayout;
                    return;
                }
            }
            vVar = this;
            vVar.f14292a = staticLayout;
            return;
        }
        this.f14292a = new BoringLayout(I, textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, isBoring, false);
    }

    public void a(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        int lineCount = this.f14292a.getLineCount();
        if (z10 && lineCount > 1) {
            i11 -= (this.f14292a.getLineBottom(1) - this.f14292a.getLineBottom(0)) / 2;
        }
        canvas.save();
        canvas.translate(i10, i11);
        if (lineCount > 2) {
            canvas.clipRect(Math.min(this.f14292a.getLineLeft(0), this.f14292a.getLineLeft(1)), this.f14292a.getLineTop(0), Math.max(this.f14292a.getLineRight(0), this.f14292a.getLineRight(1)), this.f14292a.getLineBottom(1));
        }
        this.f14294c.setColor(i12);
        this.f14292a.draw(canvas);
        canvas.restore();
    }

    public int b() {
        int lineCount = this.f14292a.getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, this.f14292a.getLineWidth(i10));
        }
        return (int) f10;
    }

    public int c() {
        return this.f14295d;
    }

    public float d() {
        return this.f14296e;
    }

    public String e() {
        return this.f14293b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f14293b.equals(this.f14293b);
    }

    public int f() {
        if (this.f14292a.getLineCount() > 0) {
            return (int) this.f14292a.getLineWidth(0);
        }
        return 0;
    }

    public int g() {
        return this.f14292a.getWidth();
    }

    public int hashCode() {
        return this.f14293b.hashCode();
    }
}
