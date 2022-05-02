package p126j$.util.concurrent;

import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p126j$.util.stream.AbstractC5572D0;
import p126j$.util.stream.C5586G;
import p126j$.util.stream.C5727k0;
import p126j$.util.stream.C5772t0;

public class ThreadLocalRandom extends Random {
    private static final AtomicInteger f18001d = new AtomicInteger();
    private static final AtomicLong f18002e;
    private static final ThreadLocal f18003f;
    private static final ThreadLocal f18004g;
    long f18005a;
    int f18006b;
    boolean f18007c = true;

    static {
        long j;
        if (((Boolean) AccessController.doPrivileged(new C5513x())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
        } else {
            j = m22527h(System.nanoTime()) ^ m22527h(System.currentTimeMillis());
        }
        f18002e = new AtomicLong(j);
        f18003f = new ThreadLocal();
        f18004g = new C5514y();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    public ThreadLocalRandom(C5513x xVar) {
    }

    public static final int m22534a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f18004g.get()).f18006b = i4;
        return i4;
    }

    public static final int m22533b() {
        return ((ThreadLocalRandom) f18004g.get()).f18006b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18004g.get();
        if (threadLocalRandom.f18006b == 0) {
            m22529f();
        }
        return threadLocalRandom;
    }

    public static final void m22529f() {
        int addAndGet = f18001d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h = m22527h(f18002e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18004g.get();
        threadLocalRandom.f18005a = h;
        threadLocalRandom.f18006b = addAndGet;
    }

    private static int m22528g(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long m22527h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public final double m22532c(double d, double d2) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        double d3 = ((d2 - d) * nextLong) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    public final int m22531d(int i, int i2) {
        int i3;
        int g = m22528g(m22526i());
        if (i >= i2) {
            return g;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = g & i5;
        } else if (i4 > 0) {
            int i6 = g >>> 1;
            while (true) {
                int i7 = i6 + i5;
                i3 = i6 % i4;
                if (i7 - i3 >= 0) {
                    break;
                }
                i6 = m22528g(m22526i()) >>> 1;
            }
        } else {
            while (true) {
                if (g >= i && g < i2) {
                    return g;
                }
                g = m22528g(m22526i());
            }
        }
        return i3 + i;
    }

    @Override
    public DoubleStream doubles() {
        return C5586G.m22388i(AbstractC5572D0.m22437P(new C5515z(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d), false));
    }

    public final long m22530e(long j, long j2) {
        long h = m22527h(m22526i());
        if (j >= j2) {
            return h;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (h & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = h >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                h = m22527h(m22526i());
            }
        } else {
            while (true) {
                if (h >= j && h < j2) {
                    return h;
                }
                h = m22527h(m22526i());
            }
        }
    }

    final long m22526i() {
        long j = this.f18005a - 7046029254386353131L;
        this.f18005a = j;
        return j;
    }

    @Override
    public IntStream ints() {
        return C5727k0.m22229i(AbstractC5572D0.m22429b0(new C5488A(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false));
    }

    @Override
    public LongStream longs() {
        return C5772t0.m22178i(AbstractC5572D0.m22427d0(new C5489B(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L), false));
    }

    @Override
    protected int next(int i) {
        return (int) (m22527h(m22526i()) >>> (64 - i));
    }

    @Override
    public boolean nextBoolean() {
        return m22528g(m22526i()) < 0;
    }

    @Override
    public double nextDouble() {
        return (m22527h(m22526i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override
    public float nextFloat() {
        return (m22528g(m22526i()) >>> 8) * 5.9604645E-8f;
    }

    @Override
    public double nextGaussian() {
        ThreadLocal threadLocal = f18003f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set(null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * (-2.0d)) / d2);
                f18003f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override
    public int nextInt() {
        return m22528g(m22526i());
    }

    @Override
    public int nextInt(int i) {
        if (i > 0) {
            int g = m22528g(m22526i());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return g & i2;
            }
            while (true) {
                int i3 = g >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                g = m22528g(m22526i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    @Override
    public long nextLong() {
        return m22527h(m22526i());
    }

    @Override
    public void setSeed(long j) {
        if (this.f18007c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C5586G.m22388i(AbstractC5572D0.m22437P(new C5515z(0L, Long.MAX_VALUE, d, d2), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public IntStream ints(int i, int i2) {
        if (i < i2) {
            return C5727k0.m22229i(AbstractC5572D0.m22429b0(new C5488A(0L, Long.MAX_VALUE, i, i2), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public LongStream longs(long j) {
        if (j >= 0) {
            return C5772t0.m22178i(AbstractC5572D0.m22427d0(new C5489B(0L, j, Long.MAX_VALUE, 0L), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public DoubleStream doubles(long j) {
        if (j >= 0) {
            return C5586G.m22388i(AbstractC5572D0.m22437P(new C5515z(0L, j, Double.MAX_VALUE, 0.0d), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public IntStream ints(long j) {
        if (j >= 0) {
            return C5727k0.m22229i(AbstractC5572D0.m22429b0(new C5488A(0L, j, Integer.MAX_VALUE, 0), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public LongStream longs(long j, long j2) {
        if (j < j2) {
            return C5772t0.m22178i(AbstractC5572D0.m22427d0(new C5489B(0L, Long.MAX_VALUE, j, j2), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public DoubleStream doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d < d2) {
            return C5586G.m22388i(AbstractC5572D0.m22437P(new C5515z(0L, j, d, d2), false));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override
    public IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i < i2) {
            return C5727k0.m22229i(AbstractC5572D0.m22429b0(new C5488A(0L, j, i, i2), false));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override
    public LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j2 < j3) {
            return C5772t0.m22178i(AbstractC5572D0.m22427d0(new C5489B(0L, j, j2, j3), false));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }
}
