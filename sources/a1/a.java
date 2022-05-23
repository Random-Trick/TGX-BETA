package a1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {
    public static final c f31d;
    public static final String f32e = Character.toString(8206);
    public static final String f33f = Character.toString(8207);
    public static final a f34g;
    public static final a f35h;
    public final boolean f36a;
    public final int f37b;
    public final c f38c;

    public static final class C0004a {
        public boolean f39a;
        public int f40b;
        public c f41c;

        public C0004a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f35h : a.f34g;
        }

        public a a() {
            if (this.f40b == 2 && this.f41c == a.f31d) {
                return b(this.f39a);
            }
            return new a(this.f39a, this.f40b, this.f41c);
        }

        public final void c(boolean z10) {
            this.f39a = z10;
            this.f41c = a.f31d;
            this.f40b = 2;
        }
    }

    public static class b {
        public static final byte[] f42f = new byte[1792];
        public final CharSequence f43a;
        public final boolean f44b;
        public final int f45c;
        public int f46d;
        public char f47e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f42f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f43a = charSequence;
            this.f44b = z10;
            this.f45c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f42f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char charAt = this.f43a.charAt(this.f46d - 1);
            this.f47e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f43a, this.f46d);
                this.f46d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f46d--;
            byte c10 = c(this.f47e);
            if (!this.f44b) {
                return c10;
            }
            char c11 = this.f47e;
            if (c11 == '>') {
                return h();
            }
            return c11 == ';' ? f() : c10;
        }

        public byte b() {
            char charAt = this.f43a.charAt(this.f46d);
            this.f47e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f43a, this.f46d);
                this.f46d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f46d++;
            byte c10 = c(this.f47e);
            if (!this.f44b) {
                return c10;
            }
            char c11 = this.f47e;
            if (c11 == '<') {
                return i();
            }
            return c11 == '&' ? g() : c10;
        }

        public int d() {
            this.f46d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f46d < this.f45c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f46d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f46d = this.f45c;
            int i10 = 0;
            int i11 = 0;
            while (this.f46d > 0) {
                byte a10 = a();
                if (a10 != 0) {
                    if (a10 == 1 || a10 == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    } else if (a10 != 9) {
                        switch (a10) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i10 == 0) {
                    return -1;
                } else {
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }

        public final byte f() {
            char charAt;
            int i10 = this.f46d;
            do {
                int i11 = this.f46d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43a;
                int i12 = i11 - 1;
                this.f46d = i12;
                charAt = charSequence.charAt(i12);
                this.f47e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f46d = i10;
            this.f47e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i10 = this.f46d;
                if (i10 >= this.f45c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f43a;
                this.f46d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f47e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i10 = this.f46d;
            while (true) {
                int i11 = this.f46d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43a;
                int i12 = i11 - 1;
                this.f46d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f47e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f46d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f43a;
                            int i14 = i13 - 1;
                            this.f46d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f47e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f46d = i10;
            this.f47e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i10 = this.f46d;
            while (true) {
                int i11 = this.f46d;
                if (i11 < this.f45c) {
                    CharSequence charSequence = this.f43a;
                    this.f46d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f47e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f46d;
                            if (i12 < this.f45c) {
                                CharSequence charSequence2 = this.f43a;
                                this.f46d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f47e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f46d = i10;
                    this.f47e = '<';
                    return (byte) 13;
                }
            }
        }
    }

    static {
        c cVar = d.f62c;
        f31d = cVar;
        f34g = new a(false, 2, cVar);
        f35h = new a(true, 2, cVar);
    }

    public a(boolean z10, int i10, c cVar) {
        this.f36a = z10;
        this.f37b = i10;
        this.f38c = cVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0004a().a();
    }

    public static boolean e(Locale locale) {
        return e.a(locale) == 1;
    }

    public boolean d() {
        return (this.f37b & 2) != 0;
    }

    public final String f(CharSequence charSequence, c cVar) {
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        if (this.f36a || (!a10 && b(charSequence) != 1)) {
            return this.f36a ? (!a10 || b(charSequence) == -1) ? f33f : "" : "";
        }
        return f32e;
    }

    public final String g(CharSequence charSequence, c cVar) {
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        if (this.f36a || (!a10 && a(charSequence) != 1)) {
            return this.f36a ? (!a10 || a(charSequence) == -1) ? f33f : "" : "";
        }
        return f32e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f38c, true);
    }

    public CharSequence i(CharSequence charSequence, c cVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? d.f61b : d.f60a));
        }
        if (a10 != this.f36a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? d.f61b : d.f60a));
        }
        return spannableStringBuilder;
    }
}
