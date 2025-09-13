public class OOPs {
    public static void main(String[] args) {
            Pen p=new Pen();//creation of object , Pen()->constructor,new it tells us to allocates the heap memory for the object
            p.setColor("red");
            System.out.println(p.color);
            //here we can se that we can directly change the color of pen without calling its function.thats why we use access modifiers 
            p.color="blue";
            System.out.println(p.color);
    }
}
class Pen{//class(blueprint for the object)

    String color;//properties(state,data)

    void setColor(String newColor){//functioning(behaviour,action,operation)
        color=newColor;
    }

}