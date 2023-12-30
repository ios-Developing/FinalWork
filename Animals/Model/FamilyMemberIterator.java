package Model;

import java.util.Iterator;
import java.util.List;

class FamilyMemberIterator implements Iterator<FamilyMember> {
    private int index;
    private List<FamilyMember> familyList;

    public FamilyMemberIterator(List<FamilyMember> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return familyList.size() > index;
    }

    @Override
    public FamilyMember next() {
        return familyList.get(index++);
    }
}
