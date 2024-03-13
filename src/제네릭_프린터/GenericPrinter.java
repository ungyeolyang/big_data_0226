package 제네릭_프린터;

public class GenericPrinter<T> {
    private T material;
    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return  material;
    }
    public String tostring(){
        return material.toString();
    }
}
