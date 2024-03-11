package 다운캐스팅;

import java.util.ArrayList;

public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>(); // animal class를 담을수 있는 리스트를 만듬
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        downCasting.downCasting();
    }

    public void downCasting(){
        for(int i = 0; i < aniList.size(); i++){
            Animal ani = aniList.get(i); // for (Animal ani : aniList) 두줄을 이거로 대체 가능
            if(ani instanceof Human){
                Human h = (Human)ani;
                h.readBook();
            } // 원래 형이 Human 인가 확인

            else if(ani instanceof Tiger){
                Tiger t = (Tiger) ani;
                t.hunting();
            }
            else if(ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.fly();
            }
        }
    }

    public void addAnimal(){
        aniList.add(new Animal()); //
        aniList.add(new Tiger());
        aniList.add(new Human());
        aniList.add(new Eagle());

        for(Animal e : aniList){
            e.move();
        }
    }
}

class Animal {
    public void move(){
        System.out.println("동물이 움직 입니다.");
    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람은 두 발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이는 네 발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리는 날개로 납니다.");
    }

    public void fly(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}
