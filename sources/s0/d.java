package s0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

public final class d {
    public final Shader f22402a;
    public final ColorStateList f22403b;
    public int f22404c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f22402a = shader;
        this.f22403b = colorStateList;
        this.f22404c = i10;
    }

    public static d a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(f.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(int i10) {
        return new d(null, null, i10);
    }

    public static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f22404c;
    }

    public Shader f() {
        return this.f22402a;
    }

    public boolean h() {
        return this.f22402a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f22402a == null && (colorStateList = this.f22403b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f22403b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f22404c) {
                this.f22404c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f22404c = i10;
    }

    public boolean l() {
        return h() || this.f22404c != 0;
    }
}
