package a1;

import java.util.Locale;

public final class d {
    public static final a1.c f62c;
    public static final a1.c f63d;
    public static final a1.c f60a = new e(null, false);
    public static final a1.c f61b = new e(null, true);
    public static final a1.c f64e = new e(a.f66b, false);
    public static final a1.c f65f = f.f71b;

    public static class a implements c {
        public static final a f66b = new a(true);
        public final boolean f67a;

        public a(boolean z10) {
            this.f67a = z10;
        }

        @Override
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = d.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f67a) {
                        return 1;
                    }
                } else if (this.f67a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f67a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {
        public static final b f68a = new b();

        @Override
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = d.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class AbstractC0006d implements a1.c {
        public final c f69a;

        public AbstractC0006d(c cVar) {
            this.f69a = cVar;
        }

        @Override
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            } else if (this.f69a == null) {
                return b();
            } else {
                return c(charSequence, i10, i11);
            }
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f69a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends AbstractC0006d {
        public final boolean f70b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f70b = z10;
        }

        @Override
        public boolean b() {
            return this.f70b;
        }
    }

    public static class f extends AbstractC0006d {
        public static final f f71b = new f();

        public f() {
            super(null);
        }

        @Override
        public boolean b() {
            return a1.e.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f68a;
        f62c = new e(bVar, false);
        f63d = new e(bVar, true);
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
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
