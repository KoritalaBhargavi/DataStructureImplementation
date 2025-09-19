
public class Implement{
    public static void main(String[] args) {
        CustomStack c1=new CustomStack(10);
        CustomArrayList c2=new CustomArrayList(10);
        c1.push(10);
        c1.push(20);
        System.out.println(c1.peek());
        c1.push(30);
        c1.pop();
        System.out.println(c1.peek());
        System.out.println(c1.size());
        System.out.println(c1.search(10));
        for(int i=1;i<15;i++){
            c2.add(i);
        }
        System.out.println(c2.size());
        System.out.println(c2.get(5));
        c2.remove(2);
        System.out.println(c2.get(5));
        if(c2.contains(3))
            System.out.println("we have it!");
        System.out.println(c2.size());

    }
}
