package z6;

public abstract class c implements k<Character> {

    public static abstract class a extends c {
        @Override
        @Deprecated
        public boolean apply(Character ch) {
            return c.super.b(ch);
        }
    }

    public static final class b extends a {
        public final char f27009a;

        public b(char c10) {
            this.f27009a = c10;
        }

        @Override
        public boolean e(char c10) {
            return c10 == this.f27009a;
        }

        public String toString() {
            String g10 = c.g(this.f27009a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(g10);
            sb2.append("')");
            return sb2.toString();
        }
    }

    public static abstract class AbstractC0259c extends a {
        public final String f27010a;

        public AbstractC0259c(String str) {
            this.f27010a = (String) j.i(str);
        }

        public final String toString() {
            return this.f27010a;
        }
    }

    public static final class d extends AbstractC0259c {
        public static final d f27011b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override
        public int c(CharSequence charSequence, int i10) {
            j.k(i10, charSequence.length());
            return -1;
        }

        @Override
        public boolean e(char c10) {
            return false;
        }
    }

    public static c d(char c10) {
        return new b(c10);
    }

    public static c f() {
        return d.f27011b;
    }

    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        j.k(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
