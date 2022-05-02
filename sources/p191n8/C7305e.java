package p191n8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p258s2.C8631d;
import p264s8.AbstractC8693b;
import p269t2.AbstractC8950a;
import p269t2.AbstractC8951b;
import p282u2.C9436a;
import p296v2.C9833a;
import p345y8.C10447b;
import p345y8.C10454h;

public class C7305e extends AbstractC7300a {
    public TrackBox f23192M;
    public C8631d[] f23193N;
    public List<AbstractC7306f> f23194O;
    public SampleDescriptionBox f23195P;
    public long[] f23196Q;
    public long[] f23198S;
    public String f23201V;
    public SubSampleInformationBox f23202W;
    public C7308h f23200U = new C7308h();
    public List<CompositionTimeToSample.C3420a> f23197R = new ArrayList();
    public List<SampleDependencyTypeBox.C3425a> f23199T = new ArrayList();

    public C7305e(String str, TrackBox trackBox, C8631d... dVarArr) {
        super(str);
        Iterator it;
        long j;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        ArrayList arrayList;
        C9436a aVar;
        int i;
        int i2 = 0;
        this.f23198S = new long[0];
        this.f23202W = null;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        this.f23194O = new C9833a(trackBox, dVarArr);
        SampleTableBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        this.f23201V = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            this.f23197R.addAll(sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            this.f23199T.addAll(sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            this.f23198S = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        String str2 = SubSampleInformationBox.TYPE;
        this.f23202W = (SubSampleInformationBox) C10454h.m5090c(sampleTableBox, str2);
        ArrayList<MovieFragmentBox> arrayList3 = new ArrayList();
        arrayList3.addAll(((AbstractC8950a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = dVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            trackId = trackId;
            ArrayList arrayList4 = arrayList3;
            arrayList4.addAll(dVarArr[i3].getBoxes(MovieFragmentBox.class));
            i3++;
            arrayList3 = arrayList4;
            i2 = 0;
        }
        this.f23195P = sampleTableBox.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            Iterator it5 = boxes.iterator();
            while (it5.hasNext()) {
                for (TrackExtendsBox trackExtendsBox : ((MovieExtendsBox) it5.next()).getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (C10454h.m5085h(((AbstractC8950a) trackBox.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            this.f23202W = new SubSampleInformationBox();
                        }
                        LinkedList<Long> linkedList = new LinkedList();
                        Iterator it6 = arrayList3.iterator();
                        long j2 = 1;
                        while (it6.hasNext()) {
                            Iterator it7 = ((MovieFragmentBox) it6.next()).getBoxes(TrackFragmentBox.class).iterator();
                            while (it7.hasNext()) {
                                TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it7.next();
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) C10454h.m5090c(trackFragmentBox, str2);
                                    if (subSampleInformationBox != null) {
                                        j = trackId;
                                        long j3 = (j2 - i2) - 1;
                                        for (SubSampleInformationBox.C3427a aVar2 : subSampleInformationBox.getEntries()) {
                                            SubSampleInformationBox.C3427a aVar3 = new SubSampleInformationBox.C3427a();
                                            it5 = it5;
                                            str2 = str2;
                                            aVar3.m30610c().addAll(aVar2.m30610c());
                                            long j4 = 0;
                                            if (j3 != 0) {
                                                aVar3.m30609d(j3 + aVar2.m30612a());
                                            } else {
                                                j4 = j3;
                                                aVar3.m30609d(aVar2.m30612a());
                                            }
                                            j3 = j4;
                                            this.f23202W.getEntries().add(aVar3);
                                        }
                                        it = it5;
                                    } else {
                                        it = it5;
                                        j = trackId;
                                    }
                                    str2 = str2;
                                    Iterator it8 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                                    while (it8.hasNext()) {
                                        TrackRunBox trackRunBox = (TrackRunBox) it8.next();
                                        TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox) trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        int i4 = 1;
                                        boolean z = true;
                                        for (TrackRunBox.C3432a aVar4 : trackRunBox.getEntries()) {
                                            if (trackRunBox.isSampleDurationPresent()) {
                                                if (arrayList2.size() != 0) {
                                                    it4 = it8;
                                                    if (((TimeToSampleBox.C3429a) arrayList2.get(arrayList2.size() - 1)).m30599b() == aVar4.m30575j()) {
                                                        TimeToSampleBox.C3429a aVar5 = (TimeToSampleBox.C3429a) arrayList2.get(arrayList2.size() - i4);
                                                        arrayList = arrayList3;
                                                        it3 = it6;
                                                        it2 = it7;
                                                        aVar5.m30598c(aVar5.m30600a() + 1);
                                                    }
                                                } else {
                                                    it4 = it8;
                                                }
                                                arrayList = arrayList3;
                                                it3 = it6;
                                                it2 = it7;
                                                arrayList2.add(new TimeToSampleBox.C3429a(1L, aVar4.m30575j()));
                                            } else {
                                                it4 = it8;
                                                arrayList = arrayList3;
                                                it3 = it6;
                                                it2 = it7;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    arrayList2.add(new TimeToSampleBox.C3429a(1L, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    arrayList2.add(new TimeToSampleBox.C3429a(1L, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (this.f23197R.size() != 0) {
                                                    List<CompositionTimeToSample.C3420a> list = this.f23197R;
                                                    i = 1;
                                                    if (list.get(list.size() - 1).m30632b() == aVar4.m30576i()) {
                                                        List<CompositionTimeToSample.C3420a> list2 = this.f23197R;
                                                        CompositionTimeToSample.C3420a aVar6 = list2.get(list2.size() - 1);
                                                        aVar6.m30631c(aVar6.m30633a() + 1);
                                                    }
                                                } else {
                                                    i = 1;
                                                }
                                                this.f23197R.add(new CompositionTimeToSample.C3420a(i, C10447b.m5103a(aVar4.m30576i())));
                                            }
                                            if (trackRunBox.isSampleFlagsPresent()) {
                                                aVar = aVar4.m30574k();
                                            } else if (z && trackRunBox.isFirstSampleFlagsPresent()) {
                                                aVar = trackRunBox.getFirstSampleFlags();
                                            } else if (trackFragmentHeaderBox.hasDefaultSampleFlags()) {
                                                aVar = trackFragmentHeaderBox.getDefaultSampleFlags();
                                            } else {
                                                aVar = trackExtendsBox.getDefaultSampleFlags();
                                            }
                                            if (aVar != null && !aVar.m8669b()) {
                                                linkedList.add(Long.valueOf(j2));
                                            }
                                            j2++;
                                            arrayList3 = arrayList;
                                            it8 = it4;
                                            it6 = it3;
                                            it7 = it2;
                                            i4 = 1;
                                            z = false;
                                        }
                                    }
                                    it5 = it;
                                    trackId = j;
                                    i2 = 0;
                                }
                            }
                        }
                        long[] jArr = this.f23198S;
                        long[] jArr2 = new long[jArr.length + linkedList.size()];
                        this.f23198S = jArr2;
                        System.arraycopy(jArr, i2, jArr2, i2, jArr.length);
                        int length2 = jArr.length;
                        for (Long l : linkedList) {
                            length2++;
                            this.f23198S[length2] = l.longValue();
                        }
                    }
                }
            }
            new ArrayList();
            new ArrayList();
            for (MovieFragmentBox movieFragmentBox : arrayList3) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        this.f23179c = m17092m(C10454h.m5085h(trackFragmentBox2, SampleGroupDescriptionBox.TYPE), C10454h.m5085h(trackFragmentBox2, SampleToGroupBox.TYPE), this.f23179c);
                    }
                }
            }
        } else {
            this.f23179c = m17092m(sampleTableBox.getBoxes(SampleGroupDescriptionBox.class), sampleTableBox.getBoxes(SampleToGroupBox.class), this.f23179c);
        }
        this.f23196Q = TimeToSampleBox.blowupTimeToSamples(arrayList2);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        this.f23200U.m17070s(trackHeaderBox.getTrackId());
        this.f23200U.m17077k(mediaHeaderBox.getCreationTime());
        this.f23200U.m17075n(mediaHeaderBox.getLanguage());
        this.f23200U.m17072q(mediaHeaderBox.getModificationTime());
        this.f23200U.m17071r(mediaHeaderBox.getTimescale());
        this.f23200U.m17076l(trackHeaderBox.getHeight());
        this.f23200U.m17069u(trackHeaderBox.getWidth());
        this.f23200U.m17074o(trackHeaderBox.getLayer());
        this.f23200U.m17073p(trackHeaderBox.getMatrix());
        EditListBox editListBox = (EditListBox) C10454h.m5090c(trackBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) C10454h.m5090c(trackBox, "../mvhd");
        if (editListBox != null) {
            Iterator<EditListBox.C3421a> it9 = editListBox.getEntries().iterator();
            while (it9.hasNext()) {
                EditListBox.C3421a next = it9.next();
                mediaHeaderBox = mediaHeaderBox;
                it9 = it9;
                this.f23178b.add(new C7303c(next.m30628c(), mediaHeaderBox.getTimescale(), next.m30629b(), next.m30627d() / movieHeaderBox.getTimescale()));
            }
        }
    }

    @Override
    public C7308h mo12960D() {
        return this.f23200U;
    }

    @Override
    public long[] mo12959G() {
        if (this.f23198S.length == this.f23194O.size()) {
            return null;
        }
        return this.f23198S;
    }

    @Override
    public SubSampleInformationBox mo12958I() {
        return this.f23202W;
    }

    @Override
    public synchronized long[] mo12957R() {
        return this.f23196Q;
    }

    @Override
    public List<AbstractC7306f> mo12956Y() {
        return this.f23194O;
    }

    @Override
    public void close() {
        AbstractC8951b parent = this.f23192M.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
        for (C8631d dVar : this.f23193N) {
            dVar.close();
        }
    }

    @Override
    public String getHandler() {
        return this.f23201V;
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f23195P;
    }

    @Override
    public List<CompositionTimeToSample.C3420a> mo12955l() {
        return this.f23197R;
    }

    public final Map<AbstractC8693b, long[]> m17092m(List<SampleGroupDescriptionBox> list, List<SampleToGroupBox> list2, Map<AbstractC8693b, long[]> map) {
        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list) {
            boolean z = false;
            for (SampleToGroupBox sampleToGroupBox : list2) {
                if (sampleToGroupBox.getGroupingType().equals(sampleGroupDescriptionBox.getGroupEntries().get(0).mo11721b())) {
                    int i = 0;
                    for (SampleToGroupBox.C3547a aVar : sampleToGroupBox.getEntries()) {
                        if (aVar.m30077a() > 0) {
                            AbstractC8693b bVar = sampleGroupDescriptionBox.getGroupEntries().get(aVar.m30077a() - 1);
                            long[] jArr = map.get(bVar);
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            long[] jArr2 = new long[C10447b.m5103a(aVar.m30076b()) + jArr.length];
                            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
                            for (int i2 = 0; i2 < aVar.m30076b(); i2++) {
                                jArr2[jArr.length + i2] = i + i2;
                            }
                            map.put(bVar, jArr2);
                        }
                        i = (int) (i + aVar.m30076b());
                    }
                    z = true;
                }
            }
            if (!z) {
                throw new RuntimeException("Could not find SampleToGroupBox for " + sampleGroupDescriptionBox.getGroupEntries().get(0).mo11721b() + ".");
            }
        }
        return map;
    }

    @Override
    public List<SampleDependencyTypeBox.C3425a> mo12953w0() {
        return this.f23199T;
    }
}
