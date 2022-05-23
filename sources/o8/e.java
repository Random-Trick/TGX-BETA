package o8;

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
import s2.d;
import u2.a;
import z8.b;
import z8.h;

public class e extends a {
    public TrackBox M;
    public d[] N;
    public List<f> O;
    public SampleDescriptionBox P;
    public long[] Q;
    public long[] S;
    public String V;
    public SubSampleInformationBox W;
    public h U = new h();
    public List<CompositionTimeToSample.a> R = new ArrayList();
    public List<SampleDependencyTypeBox.a> T = new ArrayList();

    public e(String str, TrackBox trackBox, d... dVarArr) {
        super(str);
        Iterator it;
        long j10;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        ArrayList arrayList;
        a aVar;
        int i10;
        int i11 = 0;
        this.S = new long[0];
        this.W = null;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        this.O = new v2.a(trackBox, dVarArr);
        SampleTableBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        this.V = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            this.R.addAll(sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            this.T.addAll(sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            this.S = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        String str2 = SubSampleInformationBox.TYPE;
        this.W = (SubSampleInformationBox) h.c(sampleTableBox, str2);
        ArrayList<MovieFragmentBox> arrayList3 = new ArrayList();
        arrayList3.addAll(((t2.a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = dVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            trackId = trackId;
            ArrayList arrayList4 = arrayList3;
            arrayList4.addAll(dVarArr[i12].getBoxes(MovieFragmentBox.class));
            i12++;
            arrayList3 = arrayList4;
            i11 = 0;
        }
        this.P = sampleTableBox.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            Iterator it5 = boxes.iterator();
            while (it5.hasNext()) {
                for (TrackExtendsBox trackExtendsBox : ((MovieExtendsBox) it5.next()).getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (h.h(((t2.a) trackBox.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            this.W = new SubSampleInformationBox();
                        }
                        LinkedList<Long> linkedList = new LinkedList();
                        Iterator it6 = arrayList3.iterator();
                        long j11 = 1;
                        while (it6.hasNext()) {
                            Iterator it7 = ((MovieFragmentBox) it6.next()).getBoxes(TrackFragmentBox.class).iterator();
                            while (it7.hasNext()) {
                                TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it7.next();
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) h.c(trackFragmentBox, str2);
                                    if (subSampleInformationBox != null) {
                                        j10 = trackId;
                                        long j12 = (j11 - i11) - 1;
                                        for (SubSampleInformationBox.a aVar2 : subSampleInformationBox.getEntries()) {
                                            SubSampleInformationBox.a aVar3 = new SubSampleInformationBox.a();
                                            it5 = it5;
                                            str2 = str2;
                                            aVar3.c().addAll(aVar2.c());
                                            long j13 = 0;
                                            if (j12 != 0) {
                                                aVar3.d(j12 + aVar2.a());
                                            } else {
                                                j13 = j12;
                                                aVar3.d(aVar2.a());
                                            }
                                            j12 = j13;
                                            this.W.getEntries().add(aVar3);
                                        }
                                        it = it5;
                                    } else {
                                        it = it5;
                                        j10 = trackId;
                                    }
                                    str2 = str2;
                                    Iterator it8 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                                    while (it8.hasNext()) {
                                        TrackRunBox trackRunBox = (TrackRunBox) it8.next();
                                        TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox) trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        int i13 = 1;
                                        boolean z10 = true;
                                        for (TrackRunBox.a aVar4 : trackRunBox.getEntries()) {
                                            if (trackRunBox.isSampleDurationPresent()) {
                                                if (arrayList2.size() != 0) {
                                                    it4 = it8;
                                                    if (((TimeToSampleBox.a) arrayList2.get(arrayList2.size() - 1)).b() == aVar4.j()) {
                                                        TimeToSampleBox.a aVar5 = (TimeToSampleBox.a) arrayList2.get(arrayList2.size() - i13);
                                                        arrayList = arrayList3;
                                                        it3 = it6;
                                                        it2 = it7;
                                                        aVar5.c(aVar5.a() + 1);
                                                    }
                                                } else {
                                                    it4 = it8;
                                                }
                                                arrayList = arrayList3;
                                                it3 = it6;
                                                it2 = it7;
                                                arrayList2.add(new TimeToSampleBox.a(1L, aVar4.j()));
                                            } else {
                                                it4 = it8;
                                                arrayList = arrayList3;
                                                it3 = it6;
                                                it2 = it7;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    arrayList2.add(new TimeToSampleBox.a(1L, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    arrayList2.add(new TimeToSampleBox.a(1L, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (this.R.size() != 0) {
                                                    List<CompositionTimeToSample.a> list = this.R;
                                                    i10 = 1;
                                                    if (list.get(list.size() - 1).b() == aVar4.i()) {
                                                        List<CompositionTimeToSample.a> list2 = this.R;
                                                        CompositionTimeToSample.a aVar6 = list2.get(list2.size() - 1);
                                                        aVar6.c(aVar6.a() + 1);
                                                    }
                                                } else {
                                                    i10 = 1;
                                                }
                                                this.R.add(new CompositionTimeToSample.a(i10, b.a(aVar4.i())));
                                            }
                                            if (trackRunBox.isSampleFlagsPresent()) {
                                                aVar = aVar4.k();
                                            } else if (z10 && trackRunBox.isFirstSampleFlagsPresent()) {
                                                aVar = trackRunBox.getFirstSampleFlags();
                                            } else if (trackFragmentHeaderBox.hasDefaultSampleFlags()) {
                                                aVar = trackFragmentHeaderBox.getDefaultSampleFlags();
                                            } else {
                                                aVar = trackExtendsBox.getDefaultSampleFlags();
                                            }
                                            if (aVar != null && !aVar.b()) {
                                                linkedList.add(Long.valueOf(j11));
                                            }
                                            j11++;
                                            arrayList3 = arrayList;
                                            it8 = it4;
                                            it6 = it3;
                                            it7 = it2;
                                            i13 = 1;
                                            z10 = false;
                                        }
                                    }
                                    it5 = it;
                                    trackId = j10;
                                    i11 = 0;
                                }
                            }
                        }
                        long[] jArr = this.S;
                        long[] jArr2 = new long[jArr.length + linkedList.size()];
                        this.S = jArr2;
                        System.arraycopy(jArr, i11, jArr2, i11, jArr.length);
                        int length2 = jArr.length;
                        for (Long l10 : linkedList) {
                            length2++;
                            this.S[length2] = l10.longValue();
                        }
                    }
                }
            }
            new ArrayList();
            new ArrayList();
            for (MovieFragmentBox movieFragmentBox : arrayList3) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        this.f19313c = m(h.h(trackFragmentBox2, SampleGroupDescriptionBox.TYPE), h.h(trackFragmentBox2, SampleToGroupBox.TYPE), this.f19313c);
                    }
                }
            }
        } else {
            this.f19313c = m(sampleTableBox.getBoxes(SampleGroupDescriptionBox.class), sampleTableBox.getBoxes(SampleToGroupBox.class), this.f19313c);
        }
        this.Q = TimeToSampleBox.blowupTimeToSamples(arrayList2);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        this.U.t(trackHeaderBox.getTrackId());
        this.U.k(mediaHeaderBox.getCreationTime());
        this.U.n(mediaHeaderBox.getLanguage());
        this.U.q(mediaHeaderBox.getModificationTime());
        this.U.r(mediaHeaderBox.getTimescale());
        this.U.l(trackHeaderBox.getHeight());
        this.U.u(trackHeaderBox.getWidth());
        this.U.o(trackHeaderBox.getLayer());
        this.U.p(trackHeaderBox.getMatrix());
        EditListBox editListBox = (EditListBox) h.c(trackBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) h.c(trackBox, "../mvhd");
        if (editListBox != null) {
            Iterator<EditListBox.a> it9 = editListBox.getEntries().iterator();
            while (it9.hasNext()) {
                EditListBox.a next = it9.next();
                mediaHeaderBox = mediaHeaderBox;
                it9 = it9;
                this.f19312b.add(new c(next.c(), mediaHeaderBox.getTimescale(), next.b(), next.d() / movieHeaderBox.getTimescale()));
            }
        }
    }

    @Override
    public h E() {
        return this.U;
    }

    @Override
    public long[] H() {
        if (this.S.length == this.O.size()) {
            return null;
        }
        return this.S;
    }

    @Override
    public SubSampleInformationBox J() {
        return this.W;
    }

    @Override
    public synchronized long[] S() {
        return this.Q;
    }

    @Override
    public List<f> Z() {
        return this.O;
    }

    @Override
    public void close() {
        t2.b parent = this.M.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
        for (d dVar : this.N) {
            dVar.close();
        }
    }

    @Override
    public String getHandler() {
        return this.V;
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.P;
    }

    @Override
    public List<CompositionTimeToSample.a> l() {
        return this.R;
    }

    public final Map<t8.b, long[]> m(List<SampleGroupDescriptionBox> list, List<SampleToGroupBox> list2, Map<t8.b, long[]> map) {
        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list) {
            boolean z10 = false;
            for (SampleToGroupBox sampleToGroupBox : list2) {
                if (sampleToGroupBox.getGroupingType().equals(sampleGroupDescriptionBox.getGroupEntries().get(0).b())) {
                    int i10 = 0;
                    for (SampleToGroupBox.a aVar : sampleToGroupBox.getEntries()) {
                        if (aVar.a() > 0) {
                            t8.b bVar = sampleGroupDescriptionBox.getGroupEntries().get(aVar.a() - 1);
                            long[] jArr = map.get(bVar);
                            if (jArr == null) {
                                jArr = new long[0];
                            }
                            long[] jArr2 = new long[b.a(aVar.b()) + jArr.length];
                            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
                            for (int i11 = 0; i11 < aVar.b(); i11++) {
                                jArr2[jArr.length + i11] = i10 + i11;
                            }
                            map.put(bVar, jArr2);
                        }
                        i10 = (int) (i10 + aVar.b());
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                throw new RuntimeException("Could not find SampleToGroupBox for " + sampleGroupDescriptionBox.getGroupEntries().get(0).b() + ".");
            }
        }
        return map;
    }

    @Override
    public List<SampleDependencyTypeBox.a> w0() {
        return this.T;
    }
}
