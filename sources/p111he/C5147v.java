package p111he;

import android.graphics.Canvas;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import be.C1357a0;
import nc.C7389v0;
import p110hd.C5078d;

public class C5147v {
    public final Layout f17234a;
    public final String f17235b;
    public final TextPaint f17236c;
    public final int f17237d;
    public float f17238e;

    public C5147v(String str, int i, TextPaint textPaint) {
        int i2;
        C5147v vVar;
        this.f17235b = str;
        this.f17236c = textPaint;
        this.f17237d = i;
        CharSequence I = C5078d.m23987z().m24025I(str);
        int D = i <= 0 ? C1357a0.m37554D() : i;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(I, textPaint);
        if (isBoring == null || isBoring.width > D) {
            StaticLayout staticLayout = new StaticLayout(I, 0, I.length(), textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            if (lineCount > 2) {
                i2 = 0;
                staticLayout = new StaticLayout(I, 0, staticLayout.getLineEnd(1), textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, (int) (Math.max(staticLayout.getLineWidth(0), staticLayout.getLineWidth(1)) - C7389v0.m16680T1("…", textPaint)));
            } else {
                i2 = 0;
            }
            if (lineCount > 1) {
                int length = I.length();
                int i3 = 0;
                while (i3 < length && I.charAt(i3) != '\n') {
                    i3++;
                }
                if (i3 > 0) {
                    vVar = this;
                    vVar.f17238e = C7389v0.m16688R1(I, i2, i3, textPaint);
                    vVar.f17234a = staticLayout;
                    return;
                }
            }
            vVar = this;
            vVar.f17234a = staticLayout;
            return;
        }
        this.f17234a = new BoringLayout(I, textPaint, D, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, isBoring, false);
    }

    public void m23810a(Canvas canvas, int i, int i2, int i3, boolean z) {
        int lineCount = this.f17234a.getLineCount();
        if (z && lineCount > 1) {
            i2 -= (this.f17234a.getLineBottom(1) - this.f17234a.getLineBottom(0)) / 2;
        }
        canvas.save();
        canvas.translate(i, i2);
        if (lineCount > 2) {
            canvas.clipRect(Math.min(this.f17234a.getLineLeft(0), this.f17234a.getLineLeft(1)), this.f17234a.getLineTop(0), Math.max(this.f17234a.getLineRight(0), this.f17234a.getLineRight(1)), this.f17234a.getLineBottom(1));
        }
        this.f17236c.setColor(i3);
        this.f17234a.draw(canvas);
        canvas.restore();
    }

    public int m23809b() {
        int lineCount = this.f17234a.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, this.f17234a.getLineWidth(i));
        }
        return (int) f;
    }

    public int m23808c() {
        return this.f17237d;
    }

    public float m23807d() {
        return this.f17238e;
    }

    public String m23806e() {
        return this.f17235b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5147v) && ((C5147v) obj).f17235b.equals(this.f17235b);
    }

    public int m23805f() {
        if (this.f17234a.getLineCount() > 0) {
            return (int) this.f17234a.getLineWidth(0);
        }
        return 0;
    }

    public int m23804g() {
        return this.f17234a.getWidth();
    }

    public int hashCode() {
        return this.f17235b.hashCode();
    }
}
