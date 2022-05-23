package r8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import o8.a;
import o8.f;
import o8.g;
import o8.h;

public class d extends a {
    public g M;
    public int N;
    public int O;

    public d(g gVar, long j10, long j11) {
        super("crop(" + gVar.b() + ")");
        this.M = gVar;
        this.N = (int) j10;
        this.O = (int) j11;
    }

    public static List<CompositionTimeToSample.a> m(List<CompositionTimeToSample.a> list, long j10, long j11) {
        CompositionTimeToSample.a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j12 = 0;
        ListIterator<CompositionTimeToSample.a> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            next = listIterator.next();
            if (next.a() + j12 > j10) {
                break;
            }
            j12 += next.a();
        }
        if (next.a() + j12 >= j11) {
            arrayList.add(new CompositionTimeToSample.a((int) (j11 - j10), next.b()));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.a((int) ((next.a() + j12) - j10), next.b()));
        int a10 = next.a();
        while (true) {
            j12 += a10;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.a() + j12 >= j11) {
                break;
            }
            arrayList.add(next);
            a10 = next.a();
        }
        arrayList.add(new CompositionTimeToSample.a((int) (j11 - j12), next.b()));
        return arrayList;
    }

    @Override
    public h E() {
        return this.M.E();
    }

    @Override
    public synchronized long[] H() {
        if (this.M.H() == null) {
            return null;
        }
        long[] H = this.M.H();
        int length = H.length;
        int i10 = 0;
        while (i10 < H.length && H[i10] < this.N) {
            i10++;
        }
        while (length > 0 && this.O < H[length - 1]) {
            length--;
        }
        long[] copyOfRange = Arrays.copyOfRange(this.M.H(), i10, length);
        for (int i11 = 0; i11 < copyOfRange.length; i11++) {
            copyOfRange[i11] = copyOfRange[i11] - this.N;
        }
        return copyOfRange;
    }

    @Override
    public SubSampleInformationBox J() {
        return this.M.J();
    }

    @Override
    public synchronized long[] S() {
        long[] jArr;
        int i10 = this.O - this.N;
        jArr = new long[i10];
        System.arraycopy(this.M.S(), this.N, jArr, 0, i10);
        return jArr;
    }

    @Override
    public List<f> Z() {
        return this.M.Z().subList(this.N, this.O);
    }

    @Override
    public void close() {
        this.M.close();
    }

    @Override
    public String getHandler() {
        return this.M.getHandler();
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.M.getSampleDescriptionBox();
    }

    @Override
    public List<CompositionTimeToSample.a> l() {
        return m(this.M.l(), this.N, this.O);
    }

    @Override
    public List<SampleDependencyTypeBox.a> w0() {
        if (this.M.w0() == null || this.M.w0().isEmpty()) {
            return null;
        }
        return this.M.w0().subList(this.N, this.O);
    }
}
