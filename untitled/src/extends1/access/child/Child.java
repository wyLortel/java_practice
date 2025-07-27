package extends1.access.child;

import extends1.access.parents.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;


        publicMethod();
        protectedMethod();

        printParent();
    }
}
