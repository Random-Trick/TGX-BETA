package zc;

import android.text.method.PasswordTransformationMethod;
import android.view.View;

public class a extends PasswordTransformationMethod {
    public static a f27146a;

    public static class C0262a implements CharSequence {
        public CharSequence f27147a;

        public C0262a(CharSequence charSequence) {
            this.f27147a = charSequence;
        }

        @Override
        public char charAt(int i10) {
            return (char) 0;
        }

        @Override
        public int length() {
            return this.f27147a.length();
        }

        @Override
        public CharSequence subSequence(int i10, int i11) {
            return this.f27147a.subSequence(i10, i11);
        }
    }

    public static a a() {
        if (f27146a == null) {
            f27146a = new a();
        }
        return f27146a;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return new C0262a(charSequence);
    }
}
