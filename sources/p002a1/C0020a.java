package p002a1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class C0020a {
    public static final AbstractC0027d f36d;
    public static final String f37e = Character.toString(8206);
    public static final String f38f = Character.toString(8207);
    public static final C0020a f39g;
    public static final C0020a f40h;
    public final boolean f41a;
    public final int f42b;
    public final AbstractC0027d f43c;

    public static final class C0021a {
        public boolean f44a;
        public int f45b;
        public AbstractC0027d f46c;

        public C0021a() {
            m42585c(C0020a.m42592e(Locale.getDefault()));
        }

        public static C0020a m42586b(boolean z) {
            return z ? C0020a.f40h : C0020a.f39g;
        }

        public C0020a m42587a() {
            if (this.f45b == 2 && this.f46c == C0020a.f36d) {
                return m42586b(this.f44a);
            }
            return new C0020a(this.f44a, this.f45b, this.f46c);
        }

        public final void m42585c(boolean z) {
            this.f44a = z;
            this.f46c = C0020a.f36d;
            this.f45b = 2;
        }
    }

    public static class C0022b {
        public static final byte[] f47f = new byte[1792];
        public final CharSequence f48a;
        public final boolean f49b;
        public final int f50c;
        public int f51d;
        public char f52e;

        static {
            for (int i = 0; i < 1792; i++) {
                f47f[i] = Character.getDirectionality(i);
            }
        }

        public C0022b(CharSequence charSequence, boolean z) {
            this.f48a = charSequence;
            this.f49b = z;
            this.f50c = charSequence.length();
        }

        public static byte m42582c(char c) {
            return c < 1792 ? f47f[c] : Character.getDirectionality(c);
        }

        public byte m42584a() {
            char charAt = this.f48a.charAt(this.f51d - 1);
            this.f52e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f48a, this.f51d);
                this.f51d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f51d--;
            byte c = m42582c(this.f52e);
            if (!this.f49b) {
                return c;
            }
            char c2 = this.f52e;
            if (c2 == '>') {
                return m42577h();
            }
            return c2 == ';' ? m42579f() : c;
        }

        public byte m42583b() {
            char charAt = this.f48a.charAt(this.f51d);
            this.f52e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f48a, this.f51d);
                this.f51d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f51d++;
            byte c = m42582c(this.f52e);
            if (!this.f49b) {
                return c;
            }
            char c2 = this.f52e;
            if (c2 == '<') {
                return m42576i();
            }
            return c2 == '&' ? m42578g() : c;
        }

        public int m42581d() {
            this.f51d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f51d < this.f50c && i == 0) {
                byte b = m42583b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f51d > 0) {
                switch (m42584a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int m42580e() {
            this.f51d = this.f50c;
            int i = 0;
            int i2 = 0;
            while (this.f51d > 0) {
                byte a = m42584a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }

        public final byte m42579f() {
            char charAt;
            int i = this.f51d;
            do {
                int i2 = this.f51d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f48a;
                int i3 = i2 - 1;
                this.f51d = i3;
                charAt = charSequence.charAt(i3);
                this.f52e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f51d = i;
            this.f52e = ';';
            return (byte) 13;
        }

        public final byte m42578g() {
            char charAt;
            do {
                int i = this.f51d;
                if (i >= this.f50c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f48a;
                this.f51d = i + 1;
                charAt = charSequence.charAt(i);
                this.f52e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte m42577h() {
            char charAt;
            int i = this.f51d;
            while (true) {
                int i2 = this.f51d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f48a;
                int i3 = i2 - 1;
                this.f51d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f52e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f51d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f48a;
                            int i5 = i4 - 1;
                            this.f51d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f52e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f51d = i;
            this.f52e = '>';
            return (byte) 13;
        }

        public final byte m42576i() {
            char charAt;
            int i = this.f51d;
            while (true) {
                int i2 = this.f51d;
                if (i2 < this.f50c) {
                    CharSequence charSequence = this.f48a;
                    this.f51d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f52e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f51d;
                            if (i3 < this.f50c) {
                                CharSequence charSequence2 = this.f48a;
                                this.f51d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.f52e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f51d = i;
                    this.f52e = '<';
                    return (byte) 13;
                }
            }
        }
    }

    static {
        AbstractC0027d dVar = C0028e.f70c;
        f36d = dVar;
        f39g = new C0020a(false, 2, dVar);
        f40h = new C0020a(true, 2, dVar);
    }

    public C0020a(boolean z, int i, AbstractC0027d dVar) {
        this.f41a = z;
        this.f42b = i;
        this.f43c = dVar;
    }

    public static int m42596a(CharSequence charSequence) {
        return new C0022b(charSequence, false).m42581d();
    }

    public static int m42595b(CharSequence charSequence) {
        return new C0022b(charSequence, false).m42580e();
    }

    public static C0020a m42594c() {
        return new C0021a().m42587a();
    }

    public static boolean m42592e(Locale locale) {
        return C0035f.m42554b(locale) == 1;
    }

    public boolean m42593d() {
        return (this.f42b & 2) != 0;
    }

    public final String m42591f(CharSequence charSequence, AbstractC0027d dVar) {
        boolean a = dVar.mo42558a(charSequence, 0, charSequence.length());
        if (this.f41a || (!a && m42595b(charSequence) != 1)) {
            return this.f41a ? (!a || m42595b(charSequence) == -1) ? f38f : "" : "";
        }
        return f37e;
    }

    public final String m42590g(CharSequence charSequence, AbstractC0027d dVar) {
        boolean a = dVar.mo42558a(charSequence, 0, charSequence.length());
        if (this.f41a || (!a && m42596a(charSequence) != 1)) {
            return this.f41a ? (!a || m42596a(charSequence) == -1) ? f38f : "" : "";
        }
        return f37e;
    }

    public CharSequence m42589h(CharSequence charSequence) {
        return m42588i(charSequence, this.f43c, true);
    }

    public CharSequence m42588i(CharSequence charSequence, AbstractC0027d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo42558a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m42593d() && z) {
            spannableStringBuilder.append((CharSequence) m42590g(charSequence, a ? C0028e.f69b : C0028e.f68a));
        }
        if (a != this.f41a) {
            spannableStringBuilder.append(a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m42591f(charSequence, a ? C0028e.f69b : C0028e.f68a));
        }
        return spannableStringBuilder;
    }
}
