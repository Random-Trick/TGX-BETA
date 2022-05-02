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
    public final Shader f27886a;
    public final ColorStateList f27887b;
    public int f27888c;

    public C8605d(Shader shader, ColorStateList colorStateList, int i) {
        this.f27886a = shader;
        this.f27887b = colorStateList;
        this.f27888c = i;
    }

    public static C8605d m11960a(Resources resources, int i, Resources.Theme theme) {
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
                return m11957d(C8611f.m11928b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m11958c(C8604c.m11967b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static C8605d m11959b(int i) {
        return new C8605d(null, null, i);
    }

    public static C8605d m11958c(ColorStateList colorStateList) {
        return new C8605d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static C8605d m11957d(Shader shader) {
        return new C8605d(shader, null, 0);
    }

    public static C8605d m11954g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m11960a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int m11956e() {
        return this.f27888c;
    }

    public Shader m11955f() {
        return this.f27886a;
    }

    public boolean m11953h() {
        return this.f27886a != null;
    }

    public boolean m11952i() {
        ColorStateList colorStateList;
        return this.f27886a == null && (colorStateList = this.f27887b) != null && colorStateList.isStateful();
    }

    public boolean m11951j(int[] iArr) {
        if (m11952i()) {
            ColorStateList colorStateList = this.f27887b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f27888c) {
                this.f27888c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void m11950k(int i) {
        this.f27888c = i;
    }

    public boolean m11949l() {
        return m11953h() || this.f27888c != 0;
    }
}
