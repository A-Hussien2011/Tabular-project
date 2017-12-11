import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bassam on 5/4/2017.
 */
public class Minterm {

    private int value;
    private int numberOfOnesInBinary;
    private boolean checked;
    private boolean dontCare;
    private List<Integer> differenceList;

    public Minterm(int value, boolean dontCare) {
        this.value = value;
        this.dontCare = dontCare;
        this.checked = false;
        this.differenceList = new LinkedList<Integer>();
        this.numberOfOnesInBinary = Integer.bitCount(value);
    }

    public int getValue() {
        return value;
    }

    public int getNumberOfOnesInBinary() {
        return numberOfOnesInBinary;
    }

    public boolean isChecked() {
        return checked;
    }

    public boolean isDontCare() {
        return dontCare;
    }

    public List<Integer> getDifferenceList() {
        return differenceList;
    }

    public void setNumberOfOnesInBinary(int numberOfOnesInBinary) {
        this.numberOfOnesInBinary = numberOfOnesInBinary;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setDontCare(boolean dontCare) {
        this.dontCare = dontCare;
    }

    public void setDifferenceList(List differenceList) {
        this.differenceList = differenceList;
        sortDifferenceList();
    }

    public void addToDifferenceList(int multipleOfTwo) {
        this.differenceList.add(multipleOfTwo);
        sortDifferenceList();
    }

    private void sortDifferenceList() {
        this.differenceList.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
