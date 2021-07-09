package _20_Case_Study.libs;

import _20_Case_Study.models.Booking;

import java.io.Serializable;
import java.util.Comparator;

public class ComparatorBooking implements Comparator<Booking>, Serializable {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (!o1.getStartDay().equals(o2.getStartDay())){
            return o1.getStartDay().compareTo(o2.getStartDay());
        }else {
            return o1.getEndDay().compareTo(o2.getEndDay());
        }
    }
}
