package p316w9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C10006h {
    public final Pattern f32616a = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)");

    public float[] m6270a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f32616a.matcher(str);
        if (matcher.find() && matcher.groupCount() == 2) {
            try {
                return new float[]{Float.parseFloat(matcher.group(1)), Float.parseFloat(matcher.group(2))};
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
