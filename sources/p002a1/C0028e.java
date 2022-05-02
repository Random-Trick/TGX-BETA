package p002a1;

import java.util.Locale;

public final class C0028e {
    public static final AbstractC0027d f70c;
    public static final AbstractC0027d f71d;
    public static final AbstractC0027d f68a = new C0033e(null, false);
    public static final AbstractC0027d f69b = new C0033e(null, true);
    public static final AbstractC0027d f72e = new C0033e(C0029a.f74b, false);
    public static final AbstractC0027d f73f = C0034f.f79b;

    public static class C0029a implements AbstractC0031c {
        public static final C0029a f74b = new C0029a(true);
        public final boolean f75a;

        public C0029a(boolean z) {
            this.f75a = z;
        }

        @Override
        public int mo42562a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0028e.m42564a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f75a) {
                        return 1;
                    }
                } else if (this.f75a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f75a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class C0030b implements AbstractC0031c {
        public static final C0030b f76a = new C0030b();

        @Override
        public int mo42562a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0028e.m42563b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    public interface AbstractC0031c {
        int mo42562a(CharSequence charSequence, int i, int i2);
    }

    public static abstract class AbstractC0032d implements AbstractC0027d {
        public final AbstractC0031c f77a;

        public AbstractC0032d(AbstractC0031c cVar) {
            this.f77a = cVar;
        }

        @Override
        public boolean mo42561a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f77a == null) {
                return mo42559b();
            } else {
                return m42560c(charSequence, i, i2);
            }
        }

        public abstract boolean mo42559b();

        public final boolean m42560c(CharSequence charSequence, int i, int i2) {
            int a = this.f77a.mo42562a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo42559b();
            }
            return false;
        }
    }

    public static class C0033e extends AbstractC0032d {
        public final boolean f78b;

        public C0033e(AbstractC0031c cVar, boolean z) {
            super(cVar);
            this.f78b = z;
        }

        @Override
        public boolean mo42559b() {
            return this.f78b;
        }
    }

    public static class C0034f extends AbstractC0032d {
        public static final C0034f f79b = new C0034f();

        public C0034f() {
            super(null);
        }

        @Override
        public boolean mo42559b() {
            return C0035f.m42557b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0030b bVar = C0030b.f76a;
        f70c = new C0033e(bVar, false);
        f71d = new C0033e(bVar, true);
    }

    public static int m42564a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int m42563b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
