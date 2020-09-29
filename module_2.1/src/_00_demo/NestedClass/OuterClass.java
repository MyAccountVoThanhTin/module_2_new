package _05_access_modifier.NestedClass;

public final class OuterClass {
    public String name = "OuterClass";

    static class StaticNestedClass {
        public String name = "StaticNestedClass";
    }

    class InnerClass {
        public String name = "InnerClass";
    }

    public String getName() {
        class LocalClass {
            public String name = "LocalClass";

        }
        LocalClass localClass = new LocalClass();
        return localClass.name;
    }

    public void setName(String name) {
        //LocalClass localClass = new LocalClass();
        this.name = name;
    }
}
