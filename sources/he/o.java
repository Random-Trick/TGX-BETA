package he;

import android.os.SystemClock;
import ce.j0;
import ib.g;
import ib.i;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import me.vkryl.leveldb.LevelDB;
import nb.a;
import org.thunderdog.challegram.Log;

public class o {
    public static void a(byte b10, byte b11) {
        if (b10 != b11) {
            throw new AssertionError(((int) b10) + " vs " + ((int) b11));
        }
    }

    public static void b(double d10, double d11) {
        if (d10 != d11) {
            throw new AssertionError(d10 + " vs " + d11);
        }
    }

    public static void c(float f10, float f11) {
        if (f10 != f11) {
            throw new AssertionError(f10 + " vs " + f11);
        }
    }

    public static void d(int i10, int i11) {
        if (i10 != i11) {
            throw new AssertionError(i10 + " vs " + i11);
        }
    }

    public static void e(long j10, long j11) {
        if (j10 != j11) {
            throw new AssertionError(j10 + " vs " + j11);
        }
    }

    public static void f(String str, String str2) {
        if (!i.c(str, str2)) {
            throw new AssertionError(str + " vs " + str2);
        }
    }

    public static void g(boolean z10, boolean z11) {
        if (z10 != z11) {
            throw new AssertionError(z10 + " vs " + z11);
        }
    }

    public static void h(byte[] bArr, byte[] bArr2) {
        if (!Arrays.equals(bArr, bArr2)) {
            throw new AssertionError();
        }
    }

    public static void i(double[] dArr, double[] dArr2) {
        if (!Arrays.equals(dArr, dArr2)) {
            throw new AssertionError();
        }
    }

    public static void j(float[] fArr, float[] fArr2) {
        if (!Arrays.equals(fArr, fArr2)) {
            throw new AssertionError();
        }
    }

    public static void k(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, iArr2)) {
            throw new AssertionError();
        }
    }

    public static void l(long[] jArr, long[] jArr2) {
        if (!Arrays.equals(jArr, jArr2)) {
            throw new AssertionError();
        }
    }

    public static void m(String[] strArr, String[] strArr2) {
        if (!Arrays.equals(strArr, strArr2)) {
            throw new AssertionError();
        }
    }

    public static File n() {
        File file = new File(j0.n().getFilesDir(), "pmc");
        if (file.exists() || file.mkdir()) {
            return new File(file, "test");
        }
        throw new IllegalStateException("Unable to create working directory");
    }

    public static void o() {
        float f10;
        int[] iArr;
        float[] fArr;
        long[] jArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        byte[] bArr;
        float f11;
        String str11;
        String str12;
        String str13;
        long j10;
        String str14;
        String str15;
        int i10;
        String str16 = "";
        String str17 = "stringArray";
        String str18 = "doubleArray";
        String str19 = "floatArray";
        String str20 = "longArray";
        String str21 = "intArray";
        String str22 = "byteArray";
        Log.load(null);
        File n10 = n();
        LevelDB levelDB = new LevelDB(n10.getPath(), true, null);
        try {
            levelDB.clear();
            Random random = new Random();
            byte[] bArr2 = new byte[Log.TAG_CAMERA];
            random.nextBytes(bArr2);
            byte b10 = bArr2[0];
            boolean nextBoolean = random.nextBoolean();
            int nextInt = random.nextInt();
            boolean z10 = nextBoolean;
            long nextLong = random.nextLong();
            float nextFloat = random.nextFloat();
            long j11 = nextLong;
            double nextDouble = random.nextDouble();
            Random random2 = random;
            String uuid = UUID.randomUUID().toString();
            int[] iArr2 = new int[Log.TAG_CRASH];
            double d10 = nextDouble;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                f10 = nextFloat;
                if (i11 >= 1024) {
                    break;
                }
                iArr2[i12] = a.n(bArr2, i11);
                i11 += 4;
                i12++;
                nextFloat = f10;
            }
            float[] fArr2 = new float[Log.TAG_CRASH];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                iArr = iArr2;
                if (i13 >= 1024) {
                    break;
                }
                fArr2[i14] = a.l(bArr2, i13);
                i13 += 4;
                i14++;
                iArr2 = iArr;
            }
            long[] jArr2 = new long[Log.TAG_YOUTUBE];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                fArr = fArr2;
                if (i15 >= 1024) {
                    break;
                }
                jArr2[i16] = a.p(bArr2, i15);
                i15 += 8;
                i16++;
                fArr2 = fArr;
            }
            double[] dArr = new double[Log.TAG_YOUTUBE];
            int i17 = 0;
            int i18 = 0;
            while (true) {
                jArr = jArr2;
                if (i17 >= 1024) {
                    break;
                }
                dArr[i18] = a.j(bArr2, i17);
                i17 += 8;
                i18++;
                jArr2 = jArr;
            }
            String[] strArr = new String[32];
            for (int i19 = 0; i19 < 32; i19++) {
                strArr[i19] = UUID.randomUUID().toString();
            }
            int i20 = 100;
            String[] strArr2 = strArr;
            int i21 = 0;
            int i22 = 0;
            while (i22 < i20) {
                StringBuilder sb2 = new StringBuilder();
                dArr = dArr;
                sb2.append("asdfkjhaskjfdh_");
                nextInt = nextInt;
                bArr2 = bArr2;
                sb2.append(System.currentTimeMillis());
                try {
                    levelDB.U(sb2.toString());
                } catch (FileNotFoundException unused) {
                    i21++;
                }
                i22++;
                i20 = 100;
            }
            double[] dArr2 = dArr;
            int i23 = nextInt;
            byte[] bArr3 = bArr2;
            d(i20, i21);
            levelDB.putString("string", str16);
            levelDB.H(str21, new int[0]);
            levelDB.D(str22, new byte[0]);
            levelDB.I(str20, new long[0]);
            levelDB.G(str19, new float[0]);
            levelDB.F(str18, new double[0]);
            levelDB.J(str17, new String[0]);
            levelDB.J("stringArray2", new String[]{str16});
            long uptimeMillis = SystemClock.uptimeMillis();
            String str23 = null;
            int i24 = 0;
            while (true) {
                str = str16;
                str2 = "double";
                str3 = str23;
                str4 = "float";
                long j12 = uptimeMillis;
                str5 = "boolean";
                str6 = str17;
                str7 = "int";
                str8 = str18;
                str9 = "_";
                str10 = str19;
                if (i24 >= 2) {
                    break;
                }
                boolean z11 = i24 == 1;
                if (z11) {
                    levelDB.edit();
                }
                boolean z12 = z11;
                int i25 = i24;
                int i26 = 10;
                int i27 = 0;
                while (i27 < i26) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str9);
                    String str24 = str22;
                    byte[] bArr4 = bArr3;
                    sb3.append(System.currentTimeMillis());
                    String sb4 = sb3.toString();
                    levelDB.K("void" + sb4);
                    int i28 = i23;
                    levelDB.putInt(str7 + sb4, i28);
                    str7 = str7;
                    str9 = str9;
                    long j13 = j11;
                    levelDB.putLong("long" + sb4, j13);
                    str5 = str5;
                    boolean z13 = z10;
                    levelDB.putBoolean(str5 + sb4, z13);
                    StringBuilder sb5 = new StringBuilder();
                    z10 = z13;
                    sb5.append("byte");
                    sb5.append(sb4);
                    byte b11 = b10;
                    levelDB.C(sb5.toString(), b11);
                    str4 = str4;
                    float f12 = f10;
                    levelDB.putFloat(str4 + sb4, f12);
                    str2 = str2;
                    double d11 = d10;
                    levelDB.E(str2 + sb4, d11);
                    String str25 = uuid;
                    levelDB.putString("string" + sb4, str25);
                    uuid = str25;
                    int[] iArr3 = iArr;
                    levelDB.H(str21 + sb4, iArr3);
                    StringBuilder sb6 = new StringBuilder();
                    d10 = d11;
                    sb6.append(str24);
                    sb6.append(sb4);
                    levelDB.D(sb6.toString(), bArr4);
                    long[] jArr3 = jArr;
                    levelDB.I(str20 + sb4, jArr3);
                    StringBuilder sb7 = new StringBuilder();
                    jArr = jArr3;
                    String str26 = str10;
                    sb7.append(str26);
                    sb7.append(sb4);
                    f10 = f12;
                    float[] fArr3 = fArr;
                    levelDB.G(sb7.toString(), fArr3);
                    StringBuilder sb8 = new StringBuilder();
                    fArr = fArr3;
                    String str27 = str8;
                    sb8.append(str27);
                    sb8.append(sb4);
                    double[] dArr3 = dArr2;
                    levelDB.F(sb8.toString(), dArr3);
                    StringBuilder sb9 = new StringBuilder();
                    dArr2 = dArr3;
                    String str28 = str6;
                    sb9.append(str28);
                    sb9.append(sb4);
                    str3 = sb4;
                    String[] strArr3 = strArr2;
                    levelDB.J(sb9.toString(), strArr3);
                    i27++;
                    str10 = str26;
                    strArr2 = strArr3;
                    str8 = str27;
                    str6 = str28;
                    b10 = b11;
                    i26 = 10;
                    iArr = iArr3;
                    i23 = i28;
                    bArr3 = bArr4;
                    str22 = str24;
                    j11 = j13;
                }
                str22 = str22;
                bArr3 = bArr3;
                strArr2 = strArr2;
                j11 = j11;
                iArr = iArr;
                i23 = i23;
                str17 = str6;
                str18 = str8;
                str19 = str10;
                b10 = b10;
                if (z12) {
                    levelDB.apply();
                }
                Log.i("Done db test in %dms", Long.valueOf(SystemClock.uptimeMillis() - j12));
                i24 = i25 + 1;
                str16 = str;
                str23 = str3;
                uptimeMillis = SystemClock.uptimeMillis();
            }
            String str29 = str9;
            byte[] bArr5 = bArr3;
            String[] strArr4 = strArr2;
            long j14 = j11;
            int i29 = i23;
            String str30 = str2;
            String str31 = str7;
            String str32 = str22;
            String str33 = str5;
            int[] iArr4 = iArr;
            byte b12 = b10;
            String str34 = str4;
            String str35 = str8;
            levelDB.edit();
            String str36 = "prefixInt" + str3;
            StringBuilder sb10 = new StringBuilder();
            String str37 = "long";
            sb10.append("prefixString");
            sb10.append(str3);
            String sb11 = sb10.toString();
            StringBuilder sb12 = new StringBuilder();
            String str38 = "void";
            sb12.append("prefixByteArray");
            sb12.append(str3);
            String sb13 = sb12.toString();
            String str39 = str3;
            byte[][] bArr6 = new byte[10];
            int i30 = 0;
            for (int i31 = 10; i30 < i31; i31 = 10) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str36);
                str36 = str36;
                String str40 = str29;
                sb14.append(str40);
                sb14.append(i30);
                str35 = str35;
                levelDB.putInt(sb14.toString(), iArr4[i30]);
                levelDB.putString(sb11 + str40 + i30, strArr4[i30]);
                byte[] bArr7 = new byte[Log.TAG_CAMERA];
                bArr6[i30] = bArr7;
                Random random3 = random2;
                random3.nextBytes(bArr7);
                str29 = str40;
                levelDB.D(sb13 + str40 + i30, bArr6[i30]);
                i30++;
                random2 = random3;
            }
            String str41 = str36;
            String str42 = str35;
            levelDB.apply();
            levelDB.O(new AssertionError("Corruption: not an sstable (bad magic number)"));
            levelDB.k();
            f(levelDB.W("string"), str);
            k(levelDB.p(str21), new int[0]);
            h(levelDB.m(str32), new byte[0]);
            l(levelDB.r(str20), new long[0]);
            j(levelDB.o(str10), new float[0]);
            i(levelDB.n(str42), new double[0]);
            String str43 = str6;
            m(levelDB.v(str43), new String[0]);
            m(levelDB.v("stringArray2"), new String[]{str});
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int i32 = 0;
            while (i32 < 1000) {
                StringBuilder sb15 = new StringBuilder();
                uptimeMillis2 = uptimeMillis2;
                String str44 = str38;
                sb15.append(str44);
                String str45 = str39;
                sb15.append(str45);
                str38 = str44;
                g(levelDB.contains(sb15.toString()), true);
                StringBuilder sb16 = new StringBuilder();
                String str46 = str31;
                sb16.append(str46);
                sb16.append(str45);
                sb11 = sb11;
                int i33 = i29;
                d(levelDB.U(sb16.toString()), i33);
                StringBuilder sb17 = new StringBuilder();
                i29 = i33;
                String str47 = str37;
                sb17.append(str47);
                sb17.append(str45);
                str37 = str47;
                String str48 = str43;
                long j15 = j14;
                e(levelDB.V(sb17.toString()), j15);
                StringBuilder sb18 = new StringBuilder();
                String str49 = str33;
                sb18.append(str49);
                sb18.append(str45);
                str33 = str49;
                boolean z14 = z10;
                g(levelDB.Q(sb18.toString()), z14);
                StringBuilder sb19 = new StringBuilder();
                z10 = z14;
                sb19.append("byte");
                sb19.append(str45);
                byte b13 = b12;
                a(levelDB.R(sb19.toString()), b13);
                StringBuilder sb20 = new StringBuilder();
                b12 = b13;
                String str50 = str34;
                sb20.append(str50);
                sb20.append(str45);
                str34 = str50;
                float f13 = f10;
                c(levelDB.T(sb20.toString()), f13);
                StringBuilder sb21 = new StringBuilder();
                f10 = f13;
                String str51 = str30;
                sb21.append(str51);
                sb21.append(str45);
                str30 = str51;
                j14 = j15;
                double d12 = d10;
                b(levelDB.S(sb21.toString()), d12);
                String str52 = uuid;
                f(levelDB.W("string" + str45), str52);
                k(levelDB.p(str21 + str45), iArr4);
                iArr4 = iArr4;
                byte[] bArr8 = bArr5;
                h(levelDB.m(str32 + str45), bArr8);
                bArr5 = bArr8;
                long[] jArr4 = jArr;
                l(levelDB.r(str20 + str45), jArr4);
                jArr = jArr4;
                float[] fArr4 = fArr;
                j(levelDB.o(str10 + str45), fArr4);
                fArr = fArr4;
                double[] dArr4 = dArr2;
                i(levelDB.n(str42 + str45), dArr4);
                StringBuilder sb22 = new StringBuilder();
                dArr2 = dArr4;
                sb22.append(str48);
                sb22.append(str45);
                m(levelDB.v(sb22.toString()), strArr4);
                i32++;
                d10 = d12;
                str39 = str45;
                str43 = str48;
                uuid = str52;
                str31 = str46;
            }
            long j16 = uptimeMillis2;
            String str53 = str31;
            String str54 = str39;
            String str55 = sb11;
            String str56 = uuid;
            int[] iArr5 = iArr4;
            String str57 = str43;
            double d13 = d10;
            Iterator<LevelDB.a> it = levelDB.g(str53).iterator();
            while (it.hasNext()) {
                LevelDB.a next = it.next();
                it = it;
                if (!next.l().startsWith(str21)) {
                    int h10 = next.h();
                    str15 = str21;
                    i10 = i29;
                    d(h10, i10);
                } else {
                    str15 = str21;
                    i10 = i29;
                }
                i29 = i10;
                str21 = str15;
            }
            String str58 = str37;
            Iterator<LevelDB.a> it2 = levelDB.g(str58).iterator();
            while (it2.hasNext()) {
                LevelDB.a next2 = it2.next();
                it2 = it2;
                if (!next2.l().startsWith(str20)) {
                    str14 = str20;
                    str12 = str58;
                    long i34 = next2.i();
                    str13 = str53;
                    str11 = str54;
                    j10 = j14;
                    e(i34, j10);
                } else {
                    str14 = str20;
                    str12 = str58;
                    str13 = str53;
                    str11 = str54;
                    j10 = j14;
                }
                str20 = str14;
                j14 = j10;
                str53 = str13;
                str58 = str12;
                str54 = str11;
            }
            String str59 = str58;
            String str60 = str53;
            String str61 = str54;
            String str62 = str33;
            for (LevelDB.a aVar : levelDB.g(str62)) {
                boolean z15 = z10;
                g(aVar.d(), z15);
                z10 = z15;
            }
            String str63 = str34;
            for (LevelDB.a aVar2 : levelDB.g(str63)) {
                if (!aVar2.l().startsWith(str10)) {
                    f11 = f10;
                    c(aVar2.g(), f11);
                } else {
                    f11 = f10;
                }
                f10 = f11;
            }
            String str64 = str30;
            for (LevelDB.a aVar3 : levelDB.g(str64)) {
                if (!aVar3.l().startsWith(str42)) {
                    b(aVar3.f(), d13);
                }
            }
            for (LevelDB.a aVar4 : levelDB.g("string")) {
                if (!aVar4.l().equals("string") && !aVar4.l().startsWith(str57)) {
                    f(aVar4.k(), str56);
                }
            }
            for (LevelDB.a aVar5 : levelDB.g(str32)) {
                if (!aVar5.l().equals(str32)) {
                    bArr = bArr5;
                    h(aVar5.e(), bArr);
                } else {
                    bArr = bArr5;
                }
                bArr5 = bArr;
            }
            f(levelDB.i(str32 + str61, bArr5), str32 + str61);
            e(levelDB.u(str41), 10L);
            e(levelDB.u(str55), 10L);
            int i35 = 0;
            for (LevelDB.a aVar6 : levelDB.g(str41)) {
                f(aVar6.l().substring(0, aVar6.l().lastIndexOf(95)), str41);
                d(aVar6.h(), iArr5[i35]);
                i35++;
            }
            d(i35, 10);
            int i36 = 0;
            for (LevelDB.a aVar7 : levelDB.g(str55)) {
                f(aVar7.l().substring(0, aVar7.l().lastIndexOf(95)), str55);
                f(aVar7.k(), strArr4[i36]);
                i36++;
            }
            d(i36, 10);
            int i37 = 0;
            for (byte[] bArr9 : levelDB.h(sb13)) {
                h(bArr9, bArr6[i37]);
                i37++;
            }
            d(i37, 10);
            f(levelDB.j(str41), str41 + "_0");
            f(levelDB.j(str55), str55 + "_0");
            f(levelDB.j(sb13), sb13 + "_0");
            Log.i("Done db test in %dms", Long.valueOf(SystemClock.uptimeMillis() - j16));
            long uptimeMillis3 = SystemClock.uptimeMillis();
            String s10 = levelDB.s("leveldb.stats");
            long t10 = levelDB.t();
            int M = levelDB.M(str38, str60, str59, str62, "byte", str63, str64, "string", str41, str55, sb13);
            String s11 = levelDB.s("leveldb.stats");
            String s12 = levelDB.s("leveldb.approximate-memory-usage");
            long t11 = levelDB.t();
            e(t11, 0L);
            Log.i("Done db test in %dms count:%d size:%d->%d\n%s\n%s\n%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3), Integer.valueOf(M), Long.valueOf(t10), Long.valueOf(t11), s10, s11, s12);
            levelDB.d();
            g.b(n10, true);
        } catch (Throwable th) {
            levelDB.d();
            throw th;
        }
    }
}
