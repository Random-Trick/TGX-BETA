package me.vkryl.leveldb;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.ArraySet;
import android.util.Log;
import androidx.annotation.Keep;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LevelDB implements SharedPreferences, SharedPreferences.Editor {
    public final String f17508a;
    public long f17509b;
    public final long f17510c;
    public volatile boolean f17511d;
    public boolean f17512e;
    public final Object f17514g;
    public final Semaphore f17515h;
    public final ConditionVariable f17516i;
    public b f17517j;
    public final AtomicBoolean f17513f = new AtomicBoolean(false);
    public final List<a> f17518k = new ArrayList();

    public final class a {
        public long f17519a;
        public String f17520b;

        public a(long j10) {
            synchronized (LevelDB.this.f17518k) {
                this.f17519a = j10;
                LevelDB.this.f17518k.add(this);
            }
        }

        public boolean d() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsBoolean(j10);
            }
            throw new IllegalStateException();
        }

        public byte[] e() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsByteArray(j10);
            }
            throw new IllegalStateException();
        }

        public double f() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsDouble(j10);
            }
            throw new IllegalStateException();
        }

        public void finalize() {
            try {
                m();
            } finally {
                super.finalize();
            }
        }

        public float g() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsFloat(j10);
            }
            throw new IllegalStateException();
        }

        public int h() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsInt(j10);
            }
            throw new IllegalStateException();
        }

        public long i() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsLong(j10);
            }
            throw new IllegalStateException();
        }

        public long[] j() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsLongArray(j10);
            }
            throw new IllegalStateException();
        }

        public String k() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                return NativeBridge.dbAsString(j10);
            }
            throw new IllegalStateException();
        }

        public String l() {
            long j10 = this.f17519a;
            if (j10 != 0) {
                String str = this.f17520b;
                if (str != null) {
                    return str;
                }
                String dbNextKey = NativeBridge.dbNextKey(j10);
                this.f17520b = dbNextKey;
                return dbNextKey;
            }
            throw new IllegalStateException();
        }

        public void m() {
            synchronized (LevelDB.this.f17518k) {
                long j10 = this.f17519a;
                if (j10 != 0) {
                    NativeBridge.dbFindFinish(j10);
                    this.f17519a = 0L;
                    LevelDB.this.f17518k.remove(this);
                }
            }
        }

        public final void n(long j10) {
            if (this.f17519a == j10) {
                this.f17519a = j10;
                this.f17520b = null;
                return;
            }
            throw new AssertionError();
        }
    }

    public interface b {
        boolean a(LevelDB levelDB, Throwable th);

        void b(LevelDB levelDB, String str, Throwable th);
    }

    public final class c implements Iterator<a>, Iterable<a> {
        public final String f17522a;
        public a f17523b;
        public boolean f17524c;

        public c(String str) {
            this.f17522a = str;
        }

        public a next() {
            return this.f17523b;
        }

        @Override
        public boolean hasNext() {
            if (this.f17524c) {
                return false;
            }
            if (LevelDB.this.f17511d) {
                a aVar = this.f17523b;
                if (aVar != null) {
                    aVar.m();
                }
                throw new AssertionError();
            }
            a aVar2 = this.f17523b;
            if (aVar2 == null) {
                long dbFind = NativeBridge.dbFind(LevelDB.this.B(), this.f17522a, 0L);
                if (dbFind == 0) {
                    this.f17524c = true;
                    return false;
                }
                this.f17523b = new a(dbFind);
            } else {
                long dbFind2 = aVar2.f17519a != 0 ? NativeBridge.dbFind(LevelDB.this.B(), null, this.f17523b.f17519a) : 0L;
                if (dbFind2 == 0) {
                    this.f17523b.f17519a = 0L;
                    this.f17523b = null;
                    this.f17524c = true;
                    return false;
                }
                this.f17523b.n(dbFind2);
            }
            return true;
        }

        @Override
        public Iterator<a> iterator() {
            return this;
        }
    }

    public LevelDB(String str, boolean z10, b bVar) {
        this.f17508a = str;
        this.f17517j = bVar;
        A();
        long dbBatchCreate = NativeBridge.dbBatchCreate();
        this.f17510c = dbBatchCreate;
        if (dbBatchCreate != 0) {
            this.f17514g = new Object();
            this.f17516i = new ConditionVariable(true);
            this.f17515h = z10 ? new Semaphore(1) : null;
            return;
        }
        throw new AssertionError("batchPtr == 0");
    }

    public static long w(File file) {
        long j10 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j10 += w(file2);
            }
        }
        return j10;
    }

    public final void A() {
        if (this.f17511d) {
            throw new IllegalStateException();
        } else if (this.f17509b == 0) {
            long dbOpen = NativeBridge.dbOpen(this, this.f17508a);
            this.f17509b = dbOpen;
            if (dbOpen == 0) {
                throw new AssertionError("ptr == 0");
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final long B() {
        ConditionVariable conditionVariable = this.f17516i;
        if (conditionVariable != null) {
            conditionVariable.block();
        }
        return this.f17509b;
    }

    public SharedPreferences.Editor C(String str, byte b10) {
        synchronized (this.f17514g) {
            if (this.f17512e) {
                NativeBridge.dbPutByte(this.f17510c, true, str, b10);
                return this;
            }
            NativeBridge.dbPutByte(B(), false, str, b10);
            return this;
        }
    }

    public SharedPreferences.Editor D(String str, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutByteArray(this.f17510c, true, str, bArr);
                    return this;
                }
                NativeBridge.dbPutByteArray(B(), false, str, bArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor E(String str, double d10) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutDouble(this.f17510c, true, str, d10);
                    return this;
                }
                NativeBridge.dbPutDouble(B(), false, str, d10);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public SharedPreferences.Editor F(String str, double[] dArr) {
        if (dArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                boolean z10 = this.f17512e;
                if (z10) {
                    NativeBridge.dbPutDoubleArray(this.f17510c, z10, str, dArr);
                    return this;
                }
                NativeBridge.dbPutDoubleArray(B(), this.f17512e, str, dArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor G(String str, float[] fArr) {
        if (fArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutFloatArray(this.f17510c, true, str, fArr);
                    return this;
                }
                NativeBridge.dbPutFloatArray(B(), false, str, fArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor H(String str, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutIntArray(this.f17510c, true, str, iArr);
                    return this;
                }
                NativeBridge.dbPutIntArray(B(), false, str, iArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor I(String str, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutLongArray(this.f17510c, true, str, jArr);
                    return this;
                }
                NativeBridge.dbPutLongArray(B(), false, str, jArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor J(String str, String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutStringArray(this.f17510c, true, str, strArr);
                    return this;
                }
                NativeBridge.dbPutStringArray(B(), false, str, strArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor K(String str) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutVoid(this.f17510c, true, str);
                    return this;
                }
                NativeBridge.dbPutVoid(B(), false, str);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public int L(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (list.size() == 1) {
            return N(list.get(0));
        } else {
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return M(strArr);
        }
    }

    public int M(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException();
        } else if (strArr.length == 1) {
            return N(strArr[0]);
        } else {
            if (!this.f17511d) {
                synchronized (this.f17514g) {
                    if (this.f17512e) {
                        return NativeBridge.dbRemoveByAnyPrefix(B(), this.f17510c, strArr);
                    }
                    return NativeBridge.dbRemoveByAnyPrefix(B(), 0L, strArr);
                }
            }
            throw new IllegalStateException();
        }
    }

    public int N(String str) {
        if (this.f17511d) {
            throw new IllegalStateException();
        } else if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    return NativeBridge.dbRemoveByPrefix(B(), this.f17510c, str);
                }
                return NativeBridge.dbRemoveByPrefix(B(), 0L, str);
            }
        }
    }

    public boolean O(Throwable th) {
        if (th == null || (th instanceof FileNotFoundException) || !(th instanceof AssertionError)) {
            throw new IllegalArgumentException(th);
        }
        String message = th.getMessage();
        if (message == null || message.isEmpty()) {
            return false;
        }
        if ((!message.contains("Corruption: not an sstable (bad magic number)") && !message.contains(".ldb: No such file or directory")) || this.f17513f.getAndSet(true)) {
            return false;
        }
        if (!this.f17511d) {
            this.f17516i.close();
            e();
            NativeBridge.dbClose(this.f17509b);
            this.f17509b = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            Locale locale = Locale.US;
            y(String.format(locale, "Repairing database, because of corruption, path: %s", this.f17508a), th);
            NativeBridge.dbRepair(this, this.f17508a);
            A();
            this.f17516i.open();
            y(String.format(locale, "Repairing database finished successfully in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)), null);
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean P() {
        if (!this.f17511d) {
            Throwable th = null;
            synchronized (this.f17514g) {
                if (!this.f17512e) {
                    return true;
                }
                try {
                    NativeBridge.dbBatchPerform(this.f17510c, B());
                    this.f17512e = false;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (th == null) {
                    Semaphore semaphore = this.f17515h;
                    if (semaphore != null) {
                        semaphore.release();
                    }
                    return true;
                } else if (O(th)) {
                    return P();
                } else {
                    z(th);
                    return false;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean Q(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetBoolean(B(), str, false, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return Q(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte R(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetByte(B(), str, (byte) 0, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return R(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public double S(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetDouble(B(), str, 0.0d, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return S(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public float T(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetFloat(B(), str, 0.0f, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return T(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public int U(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetInt(B(), str, 0, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return U(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long V(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetLong(B(), str, 0L, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return V(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public String W(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetString(B(), str, null, true);
            } catch (FileNotFoundException e10) {
                throw e10;
            } catch (IllegalStateException e11) {
                throw e11;
            } catch (Throwable th) {
                if (O(th)) {
                    return W(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void apply() {
        P();
    }

    @Override
    public SharedPreferences.Editor clear() {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbBatchClear(this.f17510c, B());
                    return this;
                }
                NativeBridge.dbClear(B());
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean commit() {
        return P();
    }

    @Override
    public boolean contains(String str) {
        if (!this.f17511d) {
            return NativeBridge.dbContains(B(), str);
        }
        throw new IllegalStateException();
    }

    public void d() {
        if (!this.f17511d) {
            long j10 = this.f17510c;
            if (j10 != 0) {
                NativeBridge.dbBatchDestroy(j10);
            }
            e();
            long B = B();
            if (B != 0) {
                NativeBridge.dbClose(B);
            }
            this.f17511d = true;
        }
    }

    public final void e() {
        for (int size = this.f17518k.size() - 1; size >= 0; size--) {
            this.f17518k.get(size).m();
        }
    }

    public LevelDB edit() {
        Semaphore semaphore = this.f17515h;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e10) {
                throw new RuntimeException(e10);
            }
        }
        synchronized (this.f17514g) {
            if (!this.f17512e) {
                this.f17512e = true;
            } else {
                throw new AssertionError();
            }
        }
        return this;
    }

    public void finalize() {
        try {
            d();
        } finally {
            super.finalize();
        }
    }

    public Iterable<a> g(String str) {
        if (!this.f17511d) {
            return new c(str);
        }
        throw new IllegalStateException();
    }

    @Override
    public final Map<String, ?> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getBoolean(String str, boolean z10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetBoolean(B(), str, z10, false);
            } catch (FileNotFoundException unused) {
                return z10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return getBoolean(str, z10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public float getFloat(String str, float f10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetFloat(B(), str, f10, false);
            } catch (FileNotFoundException unused) {
                return f10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return getFloat(str, f10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public int getInt(String str, int i10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetInt(B(), str, i10, false);
            } catch (FileNotFoundException unused) {
                return i10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return getInt(str, i10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public long getLong(String str, long j10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetLong(B(), str, j10, false);
            } catch (FileNotFoundException unused) {
                return j10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return getLong(str, j10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public String getString(String str, String str2) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetString(B(), str, str2, false);
            } catch (FileNotFoundException unused) {
                return str2;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return getString(str, str2);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public Set<String> getStringSet(String str, Set<String> set) {
        if (set != null) {
            throw new UnsupportedOperationException();
        } else if (!this.f17511d) {
            String[] v10 = v(str);
            if (v10 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ArraySet arraySet = new ArraySet(v10.length);
                if (v10.length > 0) {
                    Collections.addAll(arraySet, v10);
                }
                return arraySet;
            } else if (v10.length == 0) {
                return new HashSet(0);
            } else {
                return new HashSet(Arrays.asList(v10));
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte[][] h(String str) {
        if (!this.f17511d) {
            return NativeBridge.dbFindAll(B(), str);
        }
        throw new IllegalStateException();
    }

    public String i(String str, byte[] bArr) {
        if (!this.f17511d) {
            return NativeBridge.dbFindByValue(B(), str, bArr);
        }
        throw new IllegalStateException();
    }

    public String j(String str) {
        Iterator<a> it = g(str).iterator();
        if (!it.hasNext()) {
            return null;
        }
        a next = it.next();
        String l10 = next.l();
        next.m();
        return l10;
    }

    public void k() {
        if (!this.f17511d) {
            this.f17516i.close();
            e();
            NativeBridge.dbClose(this.f17509b);
            this.f17509b = 0L;
            A();
            this.f17516i.open();
            return;
        }
        throw new IllegalStateException();
    }

    public byte l(String str, byte b10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetByte(B(), str, b10, false);
            } catch (FileNotFoundException unused) {
                return b10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return l(str, b10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte[] m(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetByteArray(B(), str);
            } catch (Throwable th) {
                if (O(th)) {
                    return m(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public double[] n(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetDoubleArray(B(), str);
            } catch (Throwable th) {
                if (O(th)) {
                    return n(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public float[] o(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetFloatArray(B(), str);
            } catch (Throwable th) {
                if (O(th)) {
                    return o(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Keep
    public void onFatalError(String str) {
        z(new RuntimeException(str));
    }

    public int[] p(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetIntArray(B(), str);
            } catch (IllegalStateException e10) {
                Log.e("LevelDB", "Unexpected value format", e10);
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return p(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public SharedPreferences.Editor putBoolean(String str, boolean z10) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutBoolean(this.f17510c, true, str, z10);
                    return this;
                }
                NativeBridge.dbPutBoolean(B(), false, str, z10);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putFloat(String str, float f10) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutFloat(this.f17510c, true, str, f10);
                    return this;
                }
                NativeBridge.dbPutFloat(B(), false, str, f10);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putInt(String str, int i10) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutInt(this.f17510c, true, str, i10);
                    return this;
                }
                NativeBridge.dbPutInt(B(), false, str, i10);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putLong(String str, long j10) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutLong(this.f17510c, true, str, j10);
                    return this;
                }
                NativeBridge.dbPutLong(B(), false, str, j10);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException();
        } else if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbPutString(this.f17510c, true, str, str2);
                    return this;
                }
                NativeBridge.dbPutString(B(), false, str, str2);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        String[] strArr = new String[set.size()];
        set.toArray(strArr);
        return J(str, strArr);
    }

    public long q(String str, int i10) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetIntOrLong(B(), str, i10, false);
            } catch (FileNotFoundException unused) {
                return i10;
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th) {
                if (O(th)) {
                    return q(str, i10);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long[] r(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetLongArray(B(), str);
            } catch (Throwable th) {
                if (O(th)) {
                    return r(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SharedPreferences.Editor remove(String str) {
        if (!this.f17511d) {
            synchronized (this.f17514g) {
                if (this.f17512e) {
                    NativeBridge.dbBatchRemove(this.f17510c, str);
                    return this;
                }
                NativeBridge.dbRemove(B(), str);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public String s(String str) {
        if (!this.f17511d) {
            return NativeBridge.dbGetProperty(B(), str);
        }
        throw new IllegalStateException();
    }

    public long t() {
        if (!this.f17511d) {
            return NativeBridge.dbGetSize(B());
        }
        throw new IllegalStateException();
    }

    public long u(String str) {
        if (!this.f17511d) {
            return NativeBridge.dbGetSizeByPrefix(B(), str);
        }
        throw new IllegalStateException();
    }

    @Override
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }

    public String[] v(String str) {
        if (!this.f17511d) {
            try {
                return NativeBridge.dbGetStringArray(B(), str);
            } catch (Throwable th) {
                if (O(th)) {
                    return v(str);
                }
                z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long x() {
        k();
        return w(new File(this.f17508a));
    }

    public final void y(String str, Throwable th) {
        b bVar = this.f17517j;
        if (bVar != null) {
            bVar.b(this, str, th);
        } else {
            Log.e("LevelDB", str, th);
        }
    }

    public final void z(Throwable th) {
        b bVar = this.f17517j;
        if (bVar != null && bVar.a(this, th)) {
            return;
        }
        if (!(th instanceof RuntimeException)) {
            throw new RuntimeException(th);
        }
    }
}
