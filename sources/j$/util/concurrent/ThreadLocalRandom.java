package j$.util.concurrent;

import j$.util.stream.C0347l0;
import j$.util.stream.C0389u0;
import j$.util.stream.E0;
import j$.util.stream.H;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ThreadLocalRandom extends Random {
    private static final AtomicInteger f14393d = new AtomicInteger();
    private static final AtomicLong f14394e;
    private static final ThreadLocal f14395f;
    private static final ThreadLocal f14396g;
    long f14397a;
    int f14398b;
    boolean f14399c = true;

    static {
        long j10;
        if (((Boolean) AccessController.doPrivileged(new y())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (seed[i10] & 255);
            }
        } else {
            j10 = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f14394e = new AtomicLong(j10);
        f14395f = new ThreadLocal();
        f14396g = new z();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    public static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f14396g.get()).f14398b = i13;
        return i13;
    }

    public static final int b() {
        return ((ThreadLocalRandom) f14396g.get()).f14398b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f14396g.get();
        if (threadLocalRandom.f14398b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    public static final void f() {
        int addAndGet = f14393d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f14394e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f14396g.get();
        threadLocalRandom.f14397a = h10;
        threadLocalRandom.f14398b = addAndGet;
    }

    private static int g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    public final double c(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return nextLong;
        }
        double d12 = ((d11 - d10) * nextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    public final int d(int i10, int i11) {
        int i12;
        int g10 = g(i());
        if (i10 >= i11) {
            return g10;
        }
        int i13 = i11 - i10;
        int i14 = i13 - 1;
        if ((i13 & i14) == 0) {
            i12 = g10 & i14;
        } else if (i13 > 0) {
            int i15 = g10 >>> 1;
            while (true) {
                int i16 = i15 + i14;
                i12 = i15 % i13;
                if (i16 - i12 >= 0) {
                    break;
                }
                i15 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (g10 >= i10 && g10 < i11) {
                    return g10;
                }
                g10 = g(i());
            }
        }
        return i12 + i10;
    }

    @Override
    public final DoubleStream doubles() {
        return H.i(E0.U(new A(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    public final long e(long j10, long j11) {
        long h10 = h(i());
        if (j10 >= j11) {
            return h10;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (h10 & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = h10 >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                h10 = h(i());
            }
        } else {
            while (true) {
                if (h10 >= j10 && h10 < j11) {
                    return h10;
                }
                h10 = h(i());
            }
        }
    }

    final long i() {
        long j10 = this.f14397a - 7046029254386353131L;
        this.f14397a = j10;
        return j10;
    }

    @Override
    public final IntStream ints() {
        return C0347l0.i(E0.g0(new B(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override
    public final LongStream longs() {
        return C0389u0.i(E0.i0(new C(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override
    protected final int next(int i10) {
        return (int) (h(i()) >>> (64 - i10));
    }

    @Override
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override
    public final double nextGaussian() {
        ThreadLocal threadLocal = f14395f;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                f14395f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override
    public final int nextInt() {
        return g(i());
    }

    @Override
    public final int nextInt(int i10) {
        if (i10 > 0) {
            int g10 = g(i());
            int i11 = i10 - 1;
            if ((i10 & i11) == 0) {
                return g10 & i11;
            }
            while (true) {
                int i12 = g10 >>> 1;
                int i13 = i12 + i11;
                int i14 = i12 % i10;
                if (i13 - i14 >= 0) {
                    return i14;
                }
                g10 = g(i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    @Override
    public final long nextLong() {
        return h(i());
    }

    @Override
    public final void setSeed(long j10) {
        if (this.f14399c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return H.i(E0.U(new A(0L, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public final IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return C0347l0.i(E0.g0(new B(0L, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public final LongStream longs(long j10) {
        if (j10 >= 0) {
            return C0389u0.i(E0.i0(new C(0L, j10, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public final DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return H.i(E0.U(new A(0L, j10, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public final IntStream ints(long j10) {
        if (j10 >= 0) {
            return C0347l0.i(E0.g0(new B(0L, j10, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override
    public final LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C0389u0.i(E0.i0(new C(0L, Long.MAX_VALUE, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d10 < d11) {
            return H.i(E0.U(new A(0L, j10, d10, d11)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override
    public final IntStream ints(long j10, int i10, int i11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i10 < i11) {
            return C0347l0.i(E0.g0(new B(0L, j10, i10, i11)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    @Override
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j11 < j12) {
            return C0389u0.i(E0.i0(new C(0L, j10, j11, j12)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }
}
