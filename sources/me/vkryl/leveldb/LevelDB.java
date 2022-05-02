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
    public final String f22373a;
    public long f22374b;
    public final long f22375c;
    public volatile boolean f22376d;
    public boolean f22377e;
    public final Object f22379g;
    public final Semaphore f22380h;
    public final ConditionVariable f22381i;
    public AbstractC7053b f22382j;
    public final AtomicBoolean f22378f = new AtomicBoolean(false);
    public final List<C7052a> f22383k = new ArrayList();

    public final class C7052a {
        public long f22384a;
        public String f22385b;

        public C7052a(long j) {
            synchronized (LevelDB.this.f22383k) {
                this.f22384a = j;
                LevelDB.this.f22383k.add(this);
            }
        }

        public boolean m17951d() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsBoolean(j);
            }
            throw new IllegalStateException();
        }

        public byte[] m17950e() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsByteArray(j);
            }
            throw new IllegalStateException();
        }

        public double m17949f() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsDouble(j);
            }
            throw new IllegalStateException();
        }

        public void finalize() {
            try {
                m17942m();
            } finally {
                super.finalize();
            }
        }

        public float m17948g() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsFloat(j);
            }
            throw new IllegalStateException();
        }

        public int m17947h() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsInt(j);
            }
            throw new IllegalStateException();
        }

        public long m17946i() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsLong(j);
            }
            throw new IllegalStateException();
        }

        public long[] m17945j() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsLongArray(j);
            }
            throw new IllegalStateException();
        }

        public String m17944k() {
            long j = this.f22384a;
            if (j != 0) {
                return NativeBridge.dbAsString(j);
            }
            throw new IllegalStateException();
        }

        public String m17943l() {
            long j = this.f22384a;
            if (j != 0) {
                String str = this.f22385b;
                if (str != null) {
                    return str;
                }
                String dbNextKey = NativeBridge.dbNextKey(j);
                this.f22385b = dbNextKey;
                return dbNextKey;
            }
            throw new IllegalStateException();
        }

        public void m17942m() {
            synchronized (LevelDB.this.f22383k) {
                long j = this.f22384a;
                if (j != 0) {
                    NativeBridge.dbFindFinish(j);
                    this.f22384a = 0L;
                    LevelDB.this.f22383k.remove(this);
                }
            }
        }

        public final void m17941n(long j) {
            if (this.f22384a == j) {
                this.f22384a = j;
                this.f22385b = null;
                return;
            }
            throw new AssertionError();
        }
    }

    public interface AbstractC7053b {
        boolean mo17940a(LevelDB levelDB, Throwable th);

        void mo17939b(LevelDB levelDB, String str, Throwable th);
    }

    public final class C7054c implements Iterator<C7052a>, Iterable<C7052a> {
        public final String f22388a;
        public C7052a f22389b;
        public boolean f22390c;

        public C7054c(String str) {
            this.f22388a = str;
        }

        public C7052a next() {
            return this.f22389b;
        }

        @Override
        public boolean hasNext() {
            if (this.f22390c) {
                return false;
            }
            if (LevelDB.this.f22376d) {
                C7052a aVar = this.f22389b;
                if (aVar != null) {
                    aVar.m17942m();
                }
                throw new AssertionError();
            }
            C7052a aVar2 = this.f22389b;
            if (aVar2 == null) {
                long dbFind = NativeBridge.dbFind(LevelDB.this.m18002B(), this.f22388a, 0L);
                if (dbFind == 0) {
                    this.f22390c = true;
                    return false;
                }
                this.f22389b = new C7052a(dbFind);
            } else {
                long dbFind2 = aVar2.f22384a != 0 ? NativeBridge.dbFind(LevelDB.this.m18002B(), null, this.f22389b.f22384a) : 0L;
                if (dbFind2 == 0) {
                    this.f22389b.f22384a = 0L;
                    this.f22389b = null;
                    this.f22390c = true;
                    return false;
                }
                this.f22389b.m17941n(dbFind2);
            }
            return true;
        }

        @Override
        public Iterator<C7052a> iterator() {
            return this;
        }
    }

    public LevelDB(String str, boolean z, AbstractC7053b bVar) {
        this.f22373a = str;
        this.f22382j = bVar;
        m18003A();
        long dbBatchCreate = NativeBridge.dbBatchCreate();
        this.f22375c = dbBatchCreate;
        if (dbBatchCreate != 0) {
            this.f22379g = new Object();
            this.f22381i = new ConditionVariable(true);
            this.f22380h = z ? new Semaphore(1) : null;
            return;
        }
        throw new AssertionError("batchPtr == 0");
    }

    public static long m17958w(File file) {
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m17958w(file2);
            }
        }
        return j;
    }

    public final void m18003A() {
        if (this.f22376d) {
            throw new IllegalStateException();
        } else if (this.f22374b == 0) {
            long dbOpen = NativeBridge.dbOpen(this, this.f22373a);
            this.f22374b = dbOpen;
            if (dbOpen == 0) {
                throw new AssertionError("ptr == 0");
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final long m18002B() {
        ConditionVariable conditionVariable = this.f22381i;
        if (conditionVariable != null) {
            conditionVariable.block();
        }
        return this.f22374b;
    }

    public SharedPreferences.Editor m18001C(String str, byte b) {
        synchronized (this.f22379g) {
            if (this.f22377e) {
                NativeBridge.dbPutByte(this.f22375c, true, str, b);
                return this;
            }
            NativeBridge.dbPutByte(m18002B(), false, str, b);
            return this;
        }
    }

    public SharedPreferences.Editor m18000D(String str, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutByteArray(this.f22375c, true, str, bArr);
                    return this;
                }
                NativeBridge.dbPutByteArray(m18002B(), false, str, bArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17999E(String str, double d) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutDouble(this.f22375c, true, str, d);
                    return this;
                }
                NativeBridge.dbPutDouble(m18002B(), false, str, d);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public SharedPreferences.Editor m17998F(String str, double[] dArr) {
        if (dArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                boolean z = this.f22377e;
                if (z) {
                    NativeBridge.dbPutDoubleArray(this.f22375c, z, str, dArr);
                    return this;
                }
                NativeBridge.dbPutDoubleArray(m18002B(), this.f22377e, str, dArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17997G(String str, float[] fArr) {
        if (fArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutFloatArray(this.f22375c, true, str, fArr);
                    return this;
                }
                NativeBridge.dbPutFloatArray(m18002B(), false, str, fArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17996H(String str, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutIntArray(this.f22375c, true, str, iArr);
                    return this;
                }
                NativeBridge.dbPutIntArray(m18002B(), false, str, iArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17995I(String str, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutLongArray(this.f22375c, true, str, jArr);
                    return this;
                }
                NativeBridge.dbPutLongArray(m18002B(), false, str, jArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17994J(String str, String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutStringArray(this.f22375c, true, str, strArr);
                    return this;
                }
                NativeBridge.dbPutStringArray(m18002B(), false, str, strArr);
                return this;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public SharedPreferences.Editor m17993K(String str) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutVoid(this.f22375c, true, str);
                    return this;
                }
                NativeBridge.dbPutVoid(m18002B(), false, str);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public int m17992L(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (list.size() == 1) {
            return m17990N(list.get(0));
        } else {
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return m17991M(strArr);
        }
    }

    public int m17991M(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException();
        } else if (strArr.length == 1) {
            return m17990N(strArr[0]);
        } else {
            if (!this.f22376d) {
                synchronized (this.f22379g) {
                    if (this.f22377e) {
                        return NativeBridge.dbRemoveByAnyPrefix(m18002B(), this.f22375c, strArr);
                    }
                    return NativeBridge.dbRemoveByAnyPrefix(m18002B(), 0L, strArr);
                }
            }
            throw new IllegalStateException();
        }
    }

    public int m17990N(String str) {
        if (this.f22376d) {
            throw new IllegalStateException();
        } else if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    return NativeBridge.dbRemoveByPrefix(m18002B(), this.f22375c, str);
                }
                return NativeBridge.dbRemoveByPrefix(m18002B(), 0L, str);
            }
        }
    }

    public boolean m17989O(Throwable th) {
        if (th == null || (th instanceof FileNotFoundException) || !(th instanceof AssertionError)) {
            throw new IllegalArgumentException(th);
        }
        String message = th.getMessage();
        if (message == null || message.isEmpty()) {
            return false;
        }
        if ((!message.contains("Corruption: not an sstable (bad magic number)") && !message.contains(".ldb: No such file or directory")) || this.f22378f.getAndSet(true)) {
            return false;
        }
        if (!this.f22376d) {
            this.f22381i.close();
            m17976e();
            NativeBridge.dbClose(this.f22374b);
            this.f22374b = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            Locale locale = Locale.US;
            m17956y(String.format(locale, "Repairing database, because of corruption, path: %s", this.f22373a), th);
            NativeBridge.dbRepair(this, this.f22373a);
            m18003A();
            this.f22381i.open();
            m17956y(String.format(locale, "Repairing database finished successfully in %dms", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)), null);
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean m17988P() {
        if (!this.f22376d) {
            Throwable th = null;
            synchronized (this.f22379g) {
                if (!this.f22377e) {
                    return true;
                }
                try {
                    NativeBridge.dbBatchPerform(this.f22375c, m18002B());
                    this.f22377e = false;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (th == null) {
                    Semaphore semaphore = this.f22380h;
                    if (semaphore != null) {
                        semaphore.release();
                    }
                    return true;
                } else if (m17989O(th)) {
                    return m17988P();
                } else {
                    m17955z(th);
                    return false;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean m17987Q(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetBoolean(m18002B(), str, false, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17987Q(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte m17986R(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetByte(m18002B(), str, (byte) 0, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17986R(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public double m17985S(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetDouble(m18002B(), str, 0.0d, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17985S(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public float m17984T(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetFloat(m18002B(), str, 0.0f, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17984T(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public int m17983U(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetInt(m18002B(), str, 0, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17983U(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long m17982V(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetLong(m18002B(), str, 0L, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17982V(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public String m17981W(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetString(m18002B(), str, null, true);
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17981W(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void apply() {
        m17988P();
    }

    @Override
    public SharedPreferences.Editor clear() {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbBatchClear(this.f22375c, m18002B());
                    return this;
                }
                NativeBridge.dbClear(m18002B());
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean commit() {
        return m17988P();
    }

    @Override
    public boolean contains(String str) {
        if (!this.f22376d) {
            return NativeBridge.dbContains(m18002B(), str);
        }
        throw new IllegalStateException();
    }

    public void m17977d() {
        if (!this.f22376d) {
            long j = this.f22375c;
            if (j != 0) {
                NativeBridge.dbBatchDestroy(j);
            }
            m17976e();
            long B = m18002B();
            if (B != 0) {
                NativeBridge.dbClose(B);
            }
            this.f22376d = true;
        }
    }

    public final void m17976e() {
        for (int size = this.f22383k.size() - 1; size >= 0; size--) {
            this.f22383k.get(size).m17942m();
        }
    }

    public LevelDB edit() {
        Semaphore semaphore = this.f22380h;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (this.f22379g) {
            if (!this.f22377e) {
                this.f22377e = true;
            } else {
                throw new AssertionError();
            }
        }
        return this;
    }

    public void finalize() {
        try {
            m17977d();
        } finally {
            super.finalize();
        }
    }

    public Iterable<C7052a> m17974g(String str) {
        if (!this.f22376d) {
            return new C7054c(str);
        }
        throw new IllegalStateException();
    }

    @Override
    public final Map<String, ?> getAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getBoolean(String str, boolean z) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetBoolean(m18002B(), str, z, false);
            } catch (FileNotFoundException unused) {
                return z;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return getBoolean(str, z);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public float getFloat(String str, float f) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetFloat(m18002B(), str, f, false);
            } catch (FileNotFoundException unused) {
                return f;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return getFloat(str, f);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public int getInt(String str, int i) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetInt(m18002B(), str, i, false);
            } catch (FileNotFoundException unused) {
                return i;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return getInt(str, i);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public long getLong(String str, long j) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetLong(m18002B(), str, j, false);
            } catch (FileNotFoundException unused) {
                return j;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return getLong(str, j);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public String getString(String str, String str2) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetString(m18002B(), str, str2, false);
            } catch (FileNotFoundException unused) {
                return str2;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return getString(str, str2);
                }
                m17955z(th);
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
        } else if (!this.f22376d) {
            String[] v = m17959v(str);
            if (v == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                ArraySet arraySet = new ArraySet(v.length);
                if (v.length > 0) {
                    Collections.addAll(arraySet, v);
                }
                return arraySet;
            } else if (v.length == 0) {
                return new HashSet(0);
            } else {
                return new HashSet(Arrays.asList(v));
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte[][] m17973h(String str) {
        if (!this.f22376d) {
            return NativeBridge.dbFindAll(m18002B(), str);
        }
        throw new IllegalStateException();
    }

    public String m17972i(String str, byte[] bArr) {
        if (!this.f22376d) {
            return NativeBridge.dbFindByValue(m18002B(), str, bArr);
        }
        throw new IllegalStateException();
    }

    public String m17971j(String str) {
        Iterator<C7052a> it = m17974g(str).iterator();
        if (!it.hasNext()) {
            return null;
        }
        C7052a next = it.next();
        String l = next.m17943l();
        next.m17942m();
        return l;
    }

    public void m17970k() {
        if (!this.f22376d) {
            this.f22381i.close();
            m17976e();
            NativeBridge.dbClose(this.f22374b);
            this.f22374b = 0L;
            m18003A();
            this.f22381i.open();
            return;
        }
        throw new IllegalStateException();
    }

    public byte m17969l(String str, byte b) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetByte(m18002B(), str, b, false);
            } catch (FileNotFoundException unused) {
                return b;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17969l(str, b);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public byte[] m17968m(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetByteArray(m18002B(), str);
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17968m(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public double[] m17967n(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetDoubleArray(m18002B(), str);
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17967n(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public float[] m17966o(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetFloatArray(m18002B(), str);
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17966o(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Keep
    public void onFatalError(String str) {
        m17955z(new RuntimeException(str));
    }

    public int[] m17965p(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetIntArray(m18002B(), str);
            } catch (IllegalStateException e) {
                Log.e("LevelDB", "Unexpected value format", e);
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17965p(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutBoolean(this.f22375c, true, str, z);
                    return this;
                }
                NativeBridge.dbPutBoolean(m18002B(), false, str, z);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putFloat(String str, float f) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutFloat(this.f22375c, true, str, f);
                    return this;
                }
                NativeBridge.dbPutFloat(m18002B(), false, str, f);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putInt(String str, int i) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutInt(this.f22375c, true, str, i);
                    return this;
                }
                NativeBridge.dbPutInt(m18002B(), false, str, i);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putLong(String str, long j) {
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutLong(this.f22375c, true, str, j);
                    return this;
                }
                NativeBridge.dbPutLong(m18002B(), false, str, j);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException();
        } else if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbPutString(this.f22375c, true, str, str2);
                    return this;
                }
                NativeBridge.dbPutString(m18002B(), false, str, str2);
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
        return m17994J(str, strArr);
    }

    public long m17964q(String str, int i) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetIntOrLong(m18002B(), str, i, false);
            } catch (FileNotFoundException unused) {
                return i;
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17964q(str, i);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long[] m17963r(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetLongArray(m18002B(), str);
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17963r(str);
                }
                m17955z(th);
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
        if (!this.f22376d) {
            synchronized (this.f22379g) {
                if (this.f22377e) {
                    NativeBridge.dbBatchRemove(this.f22375c, str);
                    return this;
                }
                NativeBridge.dbRemove(m18002B(), str);
                return this;
            }
        }
        throw new IllegalStateException();
    }

    public String m17962s(String str) {
        if (!this.f22376d) {
            return NativeBridge.dbGetProperty(m18002B(), str);
        }
        throw new IllegalStateException();
    }

    public long m17961t() {
        if (!this.f22376d) {
            return NativeBridge.dbGetSize(m18002B());
        }
        throw new IllegalStateException();
    }

    public long m17960u(String str) {
        if (!this.f22376d) {
            return NativeBridge.dbGetSizeByPrefix(m18002B(), str);
        }
        throw new IllegalStateException();
    }

    @Override
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException();
    }

    public String[] m17959v(String str) {
        if (!this.f22376d) {
            try {
                return NativeBridge.dbGetStringArray(m18002B(), str);
            } catch (Throwable th) {
                if (m17989O(th)) {
                    return m17959v(str);
                }
                m17955z(th);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public long m17957x() {
        m17970k();
        return m17958w(new File(this.f22373a));
    }

    public final void m17956y(String str, Throwable th) {
        AbstractC7053b bVar = this.f22382j;
        if (bVar != null) {
            bVar.mo17939b(this, str, th);
        } else {
            Log.e("LevelDB", str, th);
        }
    }

    public final void m17955z(Throwable th) {
        AbstractC7053b bVar = this.f22382j;
        if (bVar != null && bVar.mo17940a(this, th)) {
            return;
        }
        if (!(th instanceof RuntimeException)) {
            throw new RuntimeException(th);
        }
    }
}
