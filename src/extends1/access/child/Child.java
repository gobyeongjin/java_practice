package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        // defaultValue = 1;
        // privateValue = 1;

        publicMethod();
        protectedMethod(); // 상속 or 같은 패키지

        printParent();
    }
}
