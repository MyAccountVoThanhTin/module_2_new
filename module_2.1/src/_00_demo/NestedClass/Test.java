package _05_access_modifier.NestedClass;

public class Test {

    public static void main(String[] args) {
        OuterClass objectOuter = new OuterClass();

        /*Static Nested Class*/
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        //StaticNestedClass staticNestedClass1 = new StaticNestedClass();
        System.out.println(staticNestedClass.name);

        /*Inner Class*/
        OuterClass.InnerClass innerClass = objectOuter.new InnerClass();
        System.out.println(innerClass.name);

        /*Local Class*/
        System.out.println(objectOuter.getName());


    }
}
