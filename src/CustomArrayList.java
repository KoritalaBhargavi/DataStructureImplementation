public class CustomArrayList {
    int n;
    int a[];
    int ind;
    CustomArrayList(int n){
        this.n=n;
        a=new int[n];
        ind=0;
    }
    public void add(int x){
        if(ind==a.length-1){
            a=Dynamic(n);
        }
        a[ind++]=x;
    }
    public boolean remove(int x){
        if(ind==0){
            throw new RuntimeException("List is empty");
        }
        int found=-1;
        for(int i=0;i<ind;i++){
            if(a[i]==x)
                found=i;
        }
        if(found!=-1) {
            for (int i=found;i<ind-1;i++) {
                a[i]=a[i+1];
            }
            ind--;
            return true;
        }
        return false;
    }
    public boolean contains(int v){
        for(int i=0;i<ind;i++){
            if(a[i]==v)
                return true;
        }
        return false;
    }
    public int size(){
        return ind;
    }
    public int[] Dynamic(int n){
        int b[]=new int[n+(n/2)];
        for(int i=0;i<ind;i++){
            b[i]=a[i];
        }
        return b;
    }
    public int get(int x){
        for(int i=0;i<ind;i++){
            if(i==x)
                return a[i];
        }
        return -1;
    }
}
