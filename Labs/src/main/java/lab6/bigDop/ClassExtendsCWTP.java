package lab6.bigDop;

import lab6.dop.CoolManager;
import lab6.dop.Manager;

public class ClassExtendsCWTP extends ClassWithTypeParameter<Number, Manager, String> {

    public static void main(String[] args) {
        ClassExtendsCWTP classExtendsCWTP = new ClassExtendsCWTP();
        classExtendsCWTP.g = new CoolManager("fgd", 100, 100);
        classExtendsCWTP.es = new Integer[5];
    }
}
