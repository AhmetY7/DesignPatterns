package iteratorex1;

import java.util.Stack;

public class AgacIterator extends Iterator {

    Agac basla;
    Agac guncel;
    Stack<Agac> stack;

    public AgacIterator(Agac a) {
        basla = a;
        stack = new Stack<>();
    }

    @Override
    public void First() {
        guncel = basla;
        stack = new Stack<>();
        stack.push(guncel);
    }

    @Override
    public void Next() {
        if(guncel.sag != null)
            stack.push(guncel.sag);
        if(guncel.sol != null)
            stack.push(guncel.sol);
    }

    @Override
    public boolean IsDone() {
        return stack.isEmpty();
    }

    @Override
    public int CurrentItem() {
        guncel = stack.pop();
        return guncel.degeriAl();
    }
}
