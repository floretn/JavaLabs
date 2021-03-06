package lab6.bigDop;

import lab6.dop.Employee;
import lab6.dop.Manager;
import java.lang.reflect.*;
import java.util.*;

public class Inject {

    TreeMap<Integer, String> map;
    static ListOne al;
    ArrayList<Float> listFloat;
    Employee employee;
    Manager manager;
    int i;
    Object object;
    Integer[] ints;
    long[] longs;
    Number[] numbers;
    ArrayList<? extends Number> arrayList;
    Comparator<? super Integer> comparator;
    Comparable<? super String> comparable;
    MyInterface myInterface;
    ArrayList<Comparable<String>> als;
    ArrayList<MyComparator<? extends String>> acs;
    ArrayList<? extends Comparable<String>> acsHard;
    ClassExtendsCWTP classExtendsCWTP;
    Comparable<? super ArrayList<Integer>> comparableNew;
    HashMap<? super ArrayList<? extends Employee>, ? extends Comparable<String>> hashMap;

    public List<Class<?>> list(Object o, String field) throws NoSuchFieldException, ClassNotFoundException {
        Class<?> clazz = o.getClass();
        InjectHelpWithSimpleField withSimpleField;
        Field fieldO;

        for (Field fieldClazz : clazz.getDeclaredFields()){
            if (fieldClazz.toString().contains(field)){
                fieldO = clazz.getDeclaredField(field);
                withSimpleField = new InjectHelpWithSimpleField();
                return withSimpleField.listWork(fieldO, fieldO.getType());
            }
        }

        Class<?> clazzNew = clazz.getSuperclass();
        Type clazzNewType = clazz.getGenericSuperclass();
        InjectHelpWithHardField withHardField;
        while (!clazzNew.equals(Object.class)) {
            for (Field fieldNew : clazzNew.getDeclaredFields()) {
                if (fieldNew.toString().contains(field)) {

                    fieldO = clazzNew.getDeclaredField(field);
                    Type fieldOType = fieldO.getGenericType();

                    if (fieldOType instanceof TypeVariable || fieldOType instanceof GenericArrayType) {
                        withHardField = new InjectHelpWithHardField();
                        return withHardField.listWork(fieldO, clazzNew, clazzNewType, getTypeParameters(clazz));
                    }

                    if (fieldOType instanceof ParameterizedType) {
                        for (Type type : ((ParameterizedType) fieldOType).getActualTypeArguments()) {
                            if (type instanceof ParameterizedType) {
                                ParameterizedType pt = (ParameterizedType) type;
                                for (Type type1 : pt.getActualTypeArguments()) {
                                    if (type1 instanceof TypeVariable || type1 instanceof WildcardType) {
                                        withHardField = new InjectHelpWithHardField();
                                        return withHardField.listWork(fieldO, clazzNew, clazzNewType, getTypeParameters(clazz));
                                    }
                                }
                            } else {
                                if (type instanceof TypeVariable || type instanceof WildcardType) {
                                    withHardField = new InjectHelpWithHardField();
                                    return withHardField.listWork(fieldO, clazzNew, clazzNewType, getTypeParameters(clazz));
                                }
                            }
                        }
                    }

                    withSimpleField = new InjectHelpWithSimpleField();
                    return withSimpleField.listWork(fieldO, fieldO.getType());
                }
            }
            clazzNew = clazzNew.getSuperclass();
            clazzNewType = clazz.getGenericSuperclass();
        }
        throw new NoSuchFieldException("???? ?????????????? ???????? ?? ???????????? ?????? ?????? ???????????????????????? ??????????????");
    }


    private Type[] getTypeParameters(Class<?> clazz){
        while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)){
            clazz = clazz.getSuperclass();
        }
        return ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments();
    }


    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException {
        Inject inject = new Inject();
        List<Class<?>> list = inject.list(inject, "map");
        list.forEach(System.out::println);
        /*
        System.out.println("Inject ArrayList<? extends Number> arrayList;");
        List<Class<?>> list = inject.list(inject, "arrayList");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("Inject Comparable<? super String> comparable;");
        list = inject.list(inject, "comparable");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("Inject ArrayList<? extends Comparable<String>> acsHard;");
        list = inject.list(inject, "acsHard");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("Inject Comparable<? super ArrayList<Integer>> comparableNew;");
        list = inject.list(inject, "comparableNew");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("Inject HashMap<? super ArrayList<? extends Employee>, ? extends Comparable<String>> hashMap;");
        list = inject.list(inject, "hashMap");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("ClassExtendsCWTP ArrayList<G> al;");
        list = inject.list(new ClassExtendsCWTP(), "al");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("ClassExtendsCWTP HashMap<Number, H> hashMap;");
        list = inject.list(new ClassExtendsCWTP(), "hashMap");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        System.out.println("ClassExtendsCWTP ArrayList<ArrayList<Manager>> alManagers;");
        list = inject.list(new ClassExtendsCWTP(), "alManagers");
        list.forEach(System.out::println);
        System.out.println("**************************************************************************************");
        list = inject.list(new ClassExtendsCWTP(), "fieldWhatDoesNotExists");
        list.forEach(System.out::println);
        */
    }
}
