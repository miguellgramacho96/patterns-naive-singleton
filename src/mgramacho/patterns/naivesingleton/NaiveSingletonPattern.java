package mgramacho.patterns.naivesingleton;

import mgramacho.patterns.naivesingleton.classes.Singleton;

/**
 * PROS
 * You can be sure that a class has only a single instance.
 * You gain a global access point to that instance.
 *
 * CONS
 * It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects.
 * The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
 */
public class NaiveSingletonPattern {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
