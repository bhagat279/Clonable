package clonabletest;
class Cat{
    int j;
    public Cat(int j)
    {
        this.j=j;
    }
}
class Dog implements Cloneable
{
    Cat c;
    int i;

    Dog(Cat c,int i)
    {
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException
    {
       // return super.clone(); // Shallow cloning
         Cat c1 = new Cat(c.j);
         Dog d = new Dog(c1,i);
         return d;
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(20);
        Dog d1 = new Dog(c,30);
        System.out.println(d1.i+"..."+d1.c.j);

        Dog d2 = (Dog) d1.clone();
        d2.i=60;
        d2.c.j=40;
        System.out.println(d1.i+"..."+d1.c.j);
    }
}
