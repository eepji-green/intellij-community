
public class Test {
    public void foo(Object... params) {}

    {
        foo( new Object[2]);
    }
}