public  class CustomStack {
    int a[];
    private int n;
    int top;
    CustomStack(int n){
        a=new int[n];
        top=0;
        this.n=n;
    }
    public boolean push(int x){
        if(top==n){
            return false;
        }
        a[top++]=x;
        return true;
    }
    public void pop() throws RuntimeException{
        if(top==0){
            throw new RuntimeException("Stack is Empty");
        }
        top--;
    }
    public boolean search(int v){
        for(int i=0;i<top;i++){
            if(a[i]==v)
                return true;
        }
        return false;
    }
    public int peek() throws RuntimeException{
        if(top==0){
            throw new RuntimeException("Stack is empty");
        }
        return a[top-1];
    }
    public int size(){
        return top;
    }
}
