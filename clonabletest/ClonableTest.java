package clonabletest;

public class ClonableTest implements Cloneable{
    int x=10,y=20;
    public static void main(String[] args) throws CloneNotSupportedException {

        ClonableTest t1 = new ClonableTest();
        ClonableTest t2 = (ClonableTest) t1.clone();

        t2.x=15;
        t2.y=25;

        System.out.println(t1.x+":"+t1.y);

       /* clonabletest.ClonableTest t2 = t1;
        t2.x=15;
        t2.y=25;
        System.out.println(t1.x+":"+t1.y);*/
    }
}
