package p256s0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

public final class C8605d {
    public final Shader f27889a;
    public final ColorStateList f27890b;
    public int f27891c;

    public C8605d(Shader shader, ColorStateList colorStateList, int i) {
        this.f27889a = shader;
        this.f27890b = colorStateList;
        this.f27891c = i;
    }

    public static C8605d m11959a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
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
                return m11956d(C8611f.m11927b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m11957c(C8604c.m11966b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static C8605d m11958b(int i) {
        return new C8605d(null, null, i);
    }

    public static C8605d m11957c(ColorStateList colorStateList) {
        return new C8605d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static C8605d m11956d(Shader shader) {
        return new C8605d(shader, null, 0);
    }

    public static C8605d m11953g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m11959a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int m11955e() {
        return this.f27891c;
    }

    public Shader m11954f() {
        return this.f27889a;
    }

    public boolean m11952h() {
        return this.f27889a != null;
    }

    public boolean m11951i() {
        ColorStateList colorStateList;
        return this.f27889a == null && (colorStateList = this.f27890b) != null && colorStateList.isStateful();
    }

    public boolean m11950j(int[] iArr) {
        if (m11951i()) {
            ColorStateList colorStateList = this.f27890b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f27891c) {
                this.f27891c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void m11949k(int i) {
        this.f27891c = i;
    }

    public boolean m11948l() {
        return m11952h() || this.f27891c != 0;
    }
}
