package p343y6;

public abstract class AbstractC10423c implements AbstractC10434j<Character> {

    public static abstract class AbstractC10424a extends AbstractC10423c {
        @Override
        @Deprecated
        public boolean apply(Character ch) {
            return AbstractC10423c.super.m5146b(ch);
        }
    }

    public static final class C10425b extends AbstractC10424a {
        public final char f33493a;

        public C10425b(char c) {
            this.f33493a = c;
        }

        @Override
        public boolean mo5141e(char c) {
            return c == this.f33493a;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC10423c.m5143g(this.f33493a) + "')";
        }
    }

    public static abstract class AbstractC10426c extends AbstractC10424a {
        public final String f33494a;

        public AbstractC10426c(String str) {
            this.f33494a = (String) C10433i.m5129i(str);
        }

        public final String toString() {
            return this.f33494a;
        }
    }

    public static final class C10427d extends AbstractC10426c {
        public static final C10427d f33495b = new C10427d();

        public C10427d() {
            super("CharMatcher.none()");
        }

        @Override
        public int mo5142c(CharSequence charSequence, int i) {
            C10433i.m5127k(i, charSequence.length());
            return -1;
        }

        @Override
        public boolean mo5141e(char c) {
            return false;
        }
    }

    public static AbstractC10423c m5145d(char c) {
        return new C10425b(c);
    }

    public static AbstractC10423c m5144f() {
        return C10427d.f33495b;
    }

    public static String m5143g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean m5146b(Character ch) {
        return mo5141e(ch.charValue());
    }

    public int mo5142c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C10433i.m5127k(i, length);
        while (i < length) {
            if (mo5141e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean mo5141e(char c);
}
