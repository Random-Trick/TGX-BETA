package p349yc;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

public class C10500a extends PasswordTransformationMethod {
    public static C10500a f33660a;

    public static class C10501a implements CharSequence {
        public CharSequence f33661a;

        public C10501a(CharSequence charSequence) {
            this.f33661a = charSequence;
        }

        @Override
        public char charAt(int i) {
            return (char) 0;
        }

        @Override
        public int length() {
            return this.f33661a.length();
        }

        @Override
        public CharSequence subSequence(int i, int i2) {
            return this.f33661a.subSequence(i, i2);
        }
    }

    public static C10500a m4923a() {
        if (f33660a == null) {
            f33660a = new C10500a();
        }
        return f33660a;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new C10501a(charSequence);
    }
}
