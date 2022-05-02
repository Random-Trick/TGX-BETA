package ge;

import android.os.SystemClock;
import be.C1379j0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import me.vkryl.leveldb.LevelDB;
import org.thunderdog.challegram.Log;
import p108hb.C5068g;
import p108hb.C5070i;
import p181mb.C6810a;

public class C4897o {
    public static void m24472a(byte b, byte b2) {
        if (b != b2) {
            throw new AssertionError(((int) b) + " vs " + ((int) b2));
        }
    }

    public static void m24471b(double d, double d2) {
        if (d != d2) {
            throw new AssertionError(d + " vs " + d2);
        }
    }

    public static void m24470c(float f, float f2) {
        if (f != f2) {
            throw new AssertionError(f + " vs " + f2);
        }
    }

    public static void m24469d(int i, int i2) {
        if (i != i2) {
            throw new AssertionError(i + " vs " + i2);
        }
    }

    public static void m24468e(long j, long j2) {
        if (j != j2) {
            throw new AssertionError(j + " vs " + j2);
        }
    }

    public static void m24467f(String str, String str2) {
        if (!C5070i.m24067c(str, str2)) {
            throw new AssertionError(str + " vs " + str2);
        }
    }

    public static void m24466g(boolean z, boolean z2) {
        if (z != z2) {
            throw new AssertionError(z + " vs " + z2);
        }
    }

    public static void m24465h(byte[] bArr, byte[] bArr2) {
        if (!Arrays.equals(bArr, bArr2)) {
            throw new AssertionError();
        }
    }

    public static void m24464i(double[] dArr, double[] dArr2) {
        if (!Arrays.equals(dArr, dArr2)) {
            throw new AssertionError();
        }
    }

    public static void m24463j(float[] fArr, float[] fArr2) {
        if (!Arrays.equals(fArr, fArr2)) {
            throw new AssertionError();
        }
    }

    public static void m24462k(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, iArr2)) {
            throw new AssertionError();
        }
    }

    public static void m24461l(long[] jArr, long[] jArr2) {
        if (!Arrays.equals(jArr, jArr2)) {
            throw new AssertionError();
        }
    }

    public static void m24460m(String[] strArr, String[] strArr2) {
        if (!Arrays.equals(strArr, strArr2)) {
            throw new AssertionError();
        }
    }

    public static File m24459n() {
        File file = new File(C1379j0.m37315n().getFilesDir(), "pmc");
        if (file.exists() || file.mkdir()) {
            return new File(file, "test");
        }
        throw new IllegalStateException("Unable to create working directory");
    }

    public static void m24458o() {
        float f;
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
        float f2;
        String str11;
        String str12;
        String str13;
        long j;
        String str14;
        String str15;
        int i;
        String str16 = "";
        String str17 = "stringArray";
        String str18 = "doubleArray";
        String str19 = "floatArray";
        String str20 = "longArray";
        String str21 = "intArray";
        String str22 = "byteArray";
        Log.load(null);
        File n = m24459n();
        LevelDB levelDB = new LevelDB(n.getPath(), true, null);
        try {
            levelDB.clear();
            Random random = new Random();
            byte[] bArr2 = new byte[Log.TAG_CAMERA];
            random.nextBytes(bArr2);
            byte b = bArr2[0];
            boolean nextBoolean = random.nextBoolean();
            int nextInt = random.nextInt();
            boolean z = nextBoolean;
            long nextLong = random.nextLong();
            byte b2 = b;
            float nextFloat = random.nextFloat();
            long j2 = nextLong;
            double nextDouble = random.nextDouble();
            Random random2 = random;
            String uuid = UUID.randomUUID().toString();
            int[] iArr2 = new int[Log.TAG_CRASH];
            double d = nextDouble;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                f = nextFloat;
                if (i2 >= 1024) {
                    break;
                }
                iArr2[i3] = C6810a.m18925n(bArr2, i2);
                i2 += 4;
                i3++;
                nextFloat = f;
            }
            float[] fArr2 = new float[Log.TAG_CRASH];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                iArr = iArr2;
                if (i4 >= 1024) {
                    break;
                }
                fArr2[i5] = C6810a.m18927l(bArr2, i4);
                i4 += 4;
                i5++;
                iArr2 = iArr;
            }
            long[] jArr2 = new long[Log.TAG_YOUTUBE];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                fArr = fArr2;
                if (i6 >= 1024) {
                    break;
                }
                jArr2[i7] = C6810a.m18923p(bArr2, i6);
                i6 += 8;
                i7++;
                fArr2 = fArr;
            }
            double[] dArr = new double[Log.TAG_YOUTUBE];
            int i8 = 0;
            int i9 = 0;
            while (true) {
                jArr = jArr2;
                if (i8 >= 1024) {
                    break;
                }
                dArr[i9] = C6810a.m18929j(bArr2, i8);
                i8 += 8;
                i9++;
                jArr2 = jArr;
            }
            String[] strArr = new String[32];
            for (int i10 = 0; i10 < 32; i10++) {
                strArr[i10] = UUID.randomUUID().toString();
            }
            int i11 = 100;
            String[] strArr2 = strArr;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                StringBuilder sb2 = new StringBuilder();
                dArr = dArr;
                sb2.append("asdfkjhaskjfdh_");
                nextInt = nextInt;
                bArr2 = bArr2;
                sb2.append(System.currentTimeMillis());
                try {
                    levelDB.m17983U(sb2.toString());
                } catch (FileNotFoundException unused) {
                    i12++;
                }
                i13++;
                i11 = 100;
            }
            double[] dArr2 = dArr;
            int i14 = nextInt;
            byte[] bArr3 = bArr2;
            m24469d(i11, i12);
            levelDB.putString("string", str16);
            levelDB.m17996H(str21, new int[0]);
            levelDB.m18000D(str22, new byte[0]);
            levelDB.m17995I(str20, new long[0]);
            levelDB.m17997G(str19, new float[0]);
            levelDB.m17998F(str18, new double[0]);
            levelDB.m17994J(str17, new String[0]);
            levelDB.m17994J("stringArray2", new String[]{str16});
            long uptimeMillis = SystemClock.uptimeMillis();
            String str23 = null;
            int i15 = 0;
            while (true) {
                str = str16;
                str2 = "double";
                str3 = str23;
                str4 = "float";
                long j3 = uptimeMillis;
                str5 = "boolean";
                str6 = str17;
                str7 = "int";
                str8 = str18;
                str9 = "_";
                str10 = str19;
                if (i15 >= 2) {
                    break;
                }
                boolean z2 = i15 == 1;
                if (z2) {
                    levelDB.edit();
                }
                boolean z3 = z2;
                int i16 = i15;
                int i17 = 10;
                int i18 = 0;
                while (i18 < i17) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str9);
                    String str24 = str22;
                    byte[] bArr4 = bArr3;
                    sb3.append(System.currentTimeMillis());
                    String sb4 = sb3.toString();
                    levelDB.m17993K("void" + sb4);
                    int i19 = i14;
                    levelDB.putInt(str7 + sb4, i19);
                    str7 = str7;
                    str9 = str9;
                    long j4 = j2;
                    levelDB.putLong("long" + sb4, j4);
                    str5 = str5;
                    boolean z4 = z;
                    levelDB.putBoolean(str5 + sb4, z4);
                    StringBuilder sb5 = new StringBuilder();
                    z = z4;
                    sb5.append("byte");
                    sb5.append(sb4);
                    byte b3 = b2;
                    levelDB.m18001C(sb5.toString(), b3);
                    str4 = str4;
                    float f3 = f;
                    levelDB.putFloat(str4 + sb4, f3);
                    str2 = str2;
                    double d2 = d;
                    levelDB.m17999E(str2 + sb4, d2);
                    String str25 = uuid;
                    levelDB.putString("string" + sb4, str25);
                    uuid = str25;
                    int[] iArr3 = iArr;
                    levelDB.m17996H(str21 + sb4, iArr3);
                    StringBuilder sb6 = new StringBuilder();
                    d = d2;
                    sb6.append(str24);
                    sb6.append(sb4);
                    levelDB.m18000D(sb6.toString(), bArr4);
                    long[] jArr3 = jArr;
                    levelDB.m17995I(str20 + sb4, jArr3);
                    StringBuilder sb7 = new StringBuilder();
                    jArr = jArr3;
                    String str26 = str10;
                    sb7.append(str26);
                    sb7.append(sb4);
                    f = f3;
                    float[] fArr3 = fArr;
                    levelDB.m17997G(sb7.toString(), fArr3);
                    StringBuilder sb8 = new StringBuilder();
                    fArr = fArr3;
                    String str27 = str8;
                    sb8.append(str27);
                    sb8.append(sb4);
                    double[] dArr3 = dArr2;
                    levelDB.m17998F(sb8.toString(), dArr3);
                    StringBuilder sb9 = new StringBuilder();
                    dArr2 = dArr3;
                    String str28 = str6;
                    sb9.append(str28);
                    sb9.append(sb4);
                    str3 = sb4;
                    String[] strArr3 = strArr2;
                    levelDB.m17994J(sb9.toString(), strArr3);
                    i18++;
                    str10 = str26;
                    strArr2 = strArr3;
                    str8 = str27;
                    str6 = str28;
                    b2 = b3;
                    i17 = 10;
                    iArr = iArr3;
                    i14 = i19;
                    bArr3 = bArr4;
                    str22 = str24;
                    j2 = j4;
                }
                str22 = str22;
                bArr3 = bArr3;
                strArr2 = strArr2;
                j2 = j2;
                iArr = iArr;
                i14 = i14;
                str17 = str6;
                str18 = str8;
                str19 = str10;
                b2 = b2;
                if (z3) {
                    levelDB.apply();
                }
                Log.m14719i("Done db test in %dms", Long.valueOf(SystemClock.uptimeMillis() - j3));
                i15 = i16 + 1;
                str16 = str;
                str23 = str3;
                uptimeMillis = SystemClock.uptimeMillis();
            }
            String str29 = str9;
            byte[] bArr5 = bArr3;
            String[] strArr4 = strArr2;
            long j5 = j2;
            int i20 = i14;
            String str30 = str2;
            String str31 = str7;
            String str32 = str22;
            String str33 = str5;
            int[] iArr4 = iArr;
            byte b4 = b2;
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
            int i21 = 0;
            for (int i22 = 10; i21 < i22; i22 = 10) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str36);
                str36 = str36;
                String str40 = str29;
                sb14.append(str40);
                sb14.append(i21);
                str35 = str35;
                levelDB.putInt(sb14.toString(), iArr4[i21]);
                levelDB.putString(sb11 + str40 + i21, strArr4[i21]);
                byte[] bArr7 = new byte[Log.TAG_CAMERA];
                bArr6[i21] = bArr7;
                Random random3 = random2;
                random3.nextBytes(bArr7);
                str29 = str40;
                levelDB.m18000D(sb13 + str40 + i21, bArr6[i21]);
                i21++;
                random2 = random3;
            }
            String str41 = str36;
            String str42 = str35;
            levelDB.apply();
            levelDB.m17989O(new AssertionError("Corruption: not an sstable (bad magic number)"));
            levelDB.m17970k();
            m24467f(levelDB.m17981W("string"), str);
            m24462k(levelDB.m17965p(str21), new int[0]);
            m24465h(levelDB.m17968m(str32), new byte[0]);
            m24461l(levelDB.m17963r(str20), new long[0]);
            m24463j(levelDB.m17966o(str10), new float[0]);
            m24464i(levelDB.m17967n(str42), new double[0]);
            String str43 = str6;
            m24460m(levelDB.m17959v(str43), new String[0]);
            m24460m(levelDB.m17959v("stringArray2"), new String[]{str});
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int i23 = 0;
            while (i23 < 1000) {
                StringBuilder sb15 = new StringBuilder();
                uptimeMillis2 = uptimeMillis2;
                String str44 = str38;
                sb15.append(str44);
                String str45 = str39;
                sb15.append(str45);
                str38 = str44;
                m24466g(levelDB.contains(sb15.toString()), true);
                StringBuilder sb16 = new StringBuilder();
                String str46 = str31;
                sb16.append(str46);
                sb16.append(str45);
                sb11 = sb11;
                int i24 = i20;
                m24469d(levelDB.m17983U(sb16.toString()), i24);
                StringBuilder sb17 = new StringBuilder();
                i20 = i24;
                String str47 = str37;
                sb17.append(str47);
                sb17.append(str45);
                str37 = str47;
                String str48 = str43;
                long j6 = j5;
                m24468e(levelDB.m17982V(sb17.toString()), j6);
                StringBuilder sb18 = new StringBuilder();
                String str49 = str33;
                sb18.append(str49);
                sb18.append(str45);
                str33 = str49;
                boolean z5 = z;
                m24466g(levelDB.m17987Q(sb18.toString()), z5);
                StringBuilder sb19 = new StringBuilder();
                z = z5;
                sb19.append("byte");
                sb19.append(str45);
                byte b5 = b4;
                m24472a(levelDB.m17986R(sb19.toString()), b5);
                StringBuilder sb20 = new StringBuilder();
                b4 = b5;
                String str50 = str34;
                sb20.append(str50);
                sb20.append(str45);
                str34 = str50;
                float f4 = f;
                m24470c(levelDB.m17984T(sb20.toString()), f4);
                StringBuilder sb21 = new StringBuilder();
                f = f4;
                String str51 = str30;
                sb21.append(str51);
                sb21.append(str45);
                str30 = str51;
                j5 = j6;
                double d3 = d;
                m24471b(levelDB.m17985S(sb21.toString()), d3);
                String str52 = uuid;
                m24467f(levelDB.m17981W("string" + str45), str52);
                m24462k(levelDB.m17965p(str21 + str45), iArr4);
                iArr4 = iArr4;
                byte[] bArr8 = bArr5;
                m24465h(levelDB.m17968m(str32 + str45), bArr8);
                bArr5 = bArr8;
                long[] jArr4 = jArr;
                m24461l(levelDB.m17963r(str20 + str45), jArr4);
                jArr = jArr4;
                float[] fArr4 = fArr;
                m24463j(levelDB.m17966o(str10 + str45), fArr4);
                fArr = fArr4;
                double[] dArr4 = dArr2;
                m24464i(levelDB.m17967n(str42 + str45), dArr4);
                StringBuilder sb22 = new StringBuilder();
                dArr2 = dArr4;
                sb22.append(str48);
                sb22.append(str45);
                m24460m(levelDB.m17959v(sb22.toString()), strArr4);
                i23++;
                d = d3;
                str39 = str45;
                str43 = str48;
                uuid = str52;
                str31 = str46;
            }
            long j7 = uptimeMillis2;
            String str53 = str31;
            String str54 = str39;
            String str55 = sb11;
            String str56 = uuid;
            int[] iArr5 = iArr4;
            String str57 = str43;
            double d4 = d;
            Iterator<LevelDB.C7052a> it = levelDB.m17974g(str53).iterator();
            while (it.hasNext()) {
                LevelDB.C7052a next = it.next();
                it = it;
                if (!next.m17943l().startsWith(str21)) {
                    int h = next.m17947h();
                    str15 = str21;
                    i = i20;
                    m24469d(h, i);
                } else {
                    str15 = str21;
                    i = i20;
                }
                i20 = i;
                str21 = str15;
            }
            String str58 = str37;
            Iterator<LevelDB.C7052a> it2 = levelDB.m17974g(str58).iterator();
            while (it2.hasNext()) {
                LevelDB.C7052a next2 = it2.next();
                it2 = it2;
                if (!next2.m17943l().startsWith(str20)) {
                    str14 = str20;
                    str12 = str58;
                    long i25 = next2.m17946i();
                    str13 = str53;
                    str11 = str54;
                    j = j5;
                    m24468e(i25, j);
                } else {
                    str14 = str20;
                    str12 = str58;
                    str13 = str53;
                    str11 = str54;
                    j = j5;
                }
                str20 = str14;
                j5 = j;
                str53 = str13;
                str58 = str12;
                str54 = str11;
            }
            String str59 = str58;
            String str60 = str53;
            String str61 = str54;
            String str62 = str33;
            for (LevelDB.C7052a aVar : levelDB.m17974g(str62)) {
                boolean z6 = z;
                m24466g(aVar.m17951d(), z6);
                z = z6;
            }
            String str63 = str34;
            for (LevelDB.C7052a aVar2 : levelDB.m17974g(str63)) {
                if (!aVar2.m17943l().startsWith(str10)) {
                    f2 = f;
                    m24470c(aVar2.m17948g(), f2);
                } else {
                    f2 = f;
                }
                f = f2;
            }
            String str64 = str30;
            for (LevelDB.C7052a aVar3 : levelDB.m17974g(str64)) {
                if (!aVar3.m17943l().startsWith(str42)) {
                    m24471b(aVar3.m17949f(), d4);
                }
            }
            for (LevelDB.C7052a aVar4 : levelDB.m17974g("string")) {
                if (!aVar4.m17943l().equals("string") && !aVar4.m17943l().startsWith(str57)) {
                    m24467f(aVar4.m17944k(), str56);
                }
            }
            for (LevelDB.C7052a aVar5 : levelDB.m17974g(str32)) {
                if (!aVar5.m17943l().equals(str32)) {
                    bArr = bArr5;
                    m24465h(aVar5.m17950e(), bArr);
                } else {
                    bArr = bArr5;
                }
                bArr5 = bArr;
            }
            m24467f(levelDB.m17972i(str32 + str61, bArr5), str32 + str61);
            m24468e(levelDB.m17960u(str41), 10L);
            m24468e(levelDB.m17960u(str55), 10L);
            int i26 = 0;
            for (LevelDB.C7052a aVar6 : levelDB.m17974g(str41)) {
                m24467f(aVar6.m17943l().substring(0, aVar6.m17943l().lastIndexOf(95)), str41);
                m24469d(aVar6.m17947h(), iArr5[i26]);
                i26++;
            }
            m24469d(i26, 10);
            int i27 = 0;
            for (LevelDB.C7052a aVar7 : levelDB.m17974g(str55)) {
                m24467f(aVar7.m17943l().substring(0, aVar7.m17943l().lastIndexOf(95)), str55);
                m24467f(aVar7.m17944k(), strArr4[i27]);
                i27++;
            }
            m24469d(i27, 10);
            int i28 = 0;
            for (byte[] bArr9 : levelDB.m17973h(sb13)) {
                m24465h(bArr9, bArr6[i28]);
                i28++;
            }
            m24469d(i28, 10);
            m24467f(levelDB.m17971j(str41), str41 + "_0");
            m24467f(levelDB.m17971j(str55), str55 + "_0");
            m24467f(levelDB.m17971j(sb13), sb13 + "_0");
            Log.m14719i("Done db test in %dms", Long.valueOf(SystemClock.uptimeMillis() - j7));
            long uptimeMillis3 = SystemClock.uptimeMillis();
            String s = levelDB.m17962s("leveldb.stats");
            long t = levelDB.m17961t();
            int M = levelDB.m17991M(str38, str60, str59, str62, "byte", str63, str64, "string", str41, str55, sb13);
            String s2 = levelDB.m17962s("leveldb.stats");
            String s3 = levelDB.m17962s("leveldb.approximate-memory-usage");
            long t2 = levelDB.m17961t();
            m24468e(t2, 0L);
            Log.m14719i("Done db test in %dms count:%d size:%d->%d\n%s\n%s\n%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3), Integer.valueOf(M), Long.valueOf(t), Long.valueOf(t2), s, s2, s3);
            levelDB.m17977d();
            C5068g.m24101b(n, true);
        } catch (Throwable th) {
            levelDB.m17977d();
            throw th;
        }
    }
}
