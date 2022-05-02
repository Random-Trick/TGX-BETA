package p212p;

import android.os.Bundle;

public final class C7937a {
    public final Integer f25814a;
    public final Integer f25815b;
    public final Integer f25816c;
    public final Integer f25817d;

    public static final class C7938a {
        public Integer f25818a;
        public Integer f25819b;
        public Integer f25820c;
        public Integer f25821d;

        public C7937a m14039a() {
            return new C7937a(this.f25818a, this.f25819b, this.f25820c, this.f25821d);
        }

        public C7938a m14038b(int i) {
            this.f25819b = Integer.valueOf(i);
            return this;
        }

        public C7938a m14037c(int i) {
            this.f25818a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public C7937a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f25814a = num;
        this.f25815b = num2;
        this.f25816c = num3;
        this.f25817d = num4;
    }

    public Bundle m14040a() {
        Bundle bundle = new Bundle();
        Integer num = this.f25814a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f25815b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f25816c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f25817d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
